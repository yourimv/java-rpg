package nl.vlam.rpg.shared.provider;

import java.io.IOException;
import java.io.InputStream;
import java.util.Collections;
import java.util.List;
import java.util.Properties;
import java.util.Set;
import java.util.stream.Collectors;

public abstract class PropertiesProvider {

    private static final Properties props = new Properties();

    protected PropertiesProvider(String propertiesFile) {
        try (final InputStream in = getClass().getClassLoader().getResourceAsStream(propertiesFile)) {
            props.load(in);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public Set<String> getAllPropertyKeys() {
        return Collections.unmodifiableSet(props.stringPropertyNames());
    }

    public List<Integer> getAllIds() {
        return props.stringPropertyNames().stream()
                .map(this::getId)
                .collect(Collectors.toList());
    }

    public int getId(String actionName) {
        String value = props.getProperty(actionName);
        if (value == null) {
            throw new IllegalArgumentException("No ID for action: " + actionName);
        }
        return Integer.parseInt(value);
    }
}
