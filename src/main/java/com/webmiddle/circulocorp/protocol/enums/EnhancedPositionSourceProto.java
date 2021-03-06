package com.webmiddle.circulocorp.protocol.enums;

// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: EnhancedPositionSourceProto.proto
public final class EnhancedPositionSourceProto {

    private EnhancedPositionSourceProto() {
    }

    public static void registerAllExtensions(
            com.google.protobuf.ExtensionRegistryLite registry) {
    }

    public static void registerAllExtensions(
            com.google.protobuf.ExtensionRegistry registry) {
        registerAllExtensions(
                (com.google.protobuf.ExtensionRegistryLite) registry);
    }

    /**
     * <pre>
     * Enhanced position source (used in event header for enhanced positions)
     * </pre>
     *
     * Protobuf enum {@code EnhancedPositionSource}
     */
    public enum EnhancedPositionSource
            implements com.google.protobuf.ProtocolMessageEnum {
        /**
         * <pre>
         * Open Street Map
         * </pre>
         *
         * <code>ENHANCED_POSITION_SOURCE_OPEN_STREET_MAP = 0;</code>
         */
        ENHANCED_POSITION_SOURCE_OPEN_STREET_MAP(0),
        /**
         * <pre>
         * Google Maps
         * </pre>
         *
         * <code>ENHANCED_POSITION_SOURCE_GOOGLE_MAPS = 1;</code>
         */
        ENHANCED_POSITION_SOURCE_GOOGLE_MAPS(1),;

        /**
         * <pre>
         * Open Street Map
         * </pre>
         *
         * <code>ENHANCED_POSITION_SOURCE_OPEN_STREET_MAP = 0;</code>
         */
        public static final int ENHANCED_POSITION_SOURCE_OPEN_STREET_MAP_VALUE = 0;
        /**
         * <pre>
         * Google Maps
         * </pre>
         *
         * <code>ENHANCED_POSITION_SOURCE_GOOGLE_MAPS = 1;</code>
         */
        public static final int ENHANCED_POSITION_SOURCE_GOOGLE_MAPS_VALUE = 1;

        public final int getNumber() {
            return value;
        }

        /**
         * @param value The numeric wire value of the corresponding enum entry.
         * @return The enum associated with the given numeric wire value.
         * @deprecated Use {@link #forNumber(int)} instead.
         */
        @java.lang.Deprecated
        public static EnhancedPositionSource valueOf(int value) {
            return forNumber(value);
        }

        /**
         * @param value The numeric wire value of the corresponding enum entry.
         * @return The enum associated with the given numeric wire value.
         */
        public static EnhancedPositionSource forNumber(int value) {
            switch (value) {
                case 0:
                    return ENHANCED_POSITION_SOURCE_OPEN_STREET_MAP;
                case 1:
                    return ENHANCED_POSITION_SOURCE_GOOGLE_MAPS;
                default:
                    return null;
            }
        }

        public static com.google.protobuf.Internal.EnumLiteMap<EnhancedPositionSource>
                internalGetValueMap() {
            return internalValueMap;
        }
        private static final com.google.protobuf.Internal.EnumLiteMap<
        EnhancedPositionSource> internalValueMap
                = new com.google.protobuf.Internal.EnumLiteMap<EnhancedPositionSource>() {
            public EnhancedPositionSource findValueByNumber(int number) {
                return EnhancedPositionSource.forNumber(number);
            }
        };

        public final com.google.protobuf.Descriptors.EnumValueDescriptor
                getValueDescriptor() {
            return getDescriptor().getValues().get(ordinal());
        }

        public final com.google.protobuf.Descriptors.EnumDescriptor
                getDescriptorForType() {
            return getDescriptor();
        }

        public static final com.google.protobuf.Descriptors.EnumDescriptor
                getDescriptor() {
            return EnhancedPositionSourceProto.getDescriptor().getEnumTypes().get(0);
        }

        private static final EnhancedPositionSource[] VALUES = values();

        public static EnhancedPositionSource valueOf(
                com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
            if (desc.getType() != getDescriptor()) {
                throw new java.lang.IllegalArgumentException(
                        "EnumValueDescriptor is not for this type.");
            }
            return VALUES[desc.getIndex()];
        }

        private final int value;

        private EnhancedPositionSource(int value) {
            this.value = value;
        }

        // @@protoc_insertion_point(enum_scope:EnhancedPositionSource)
    }

    public static com.google.protobuf.Descriptors.FileDescriptor
            getDescriptor() {
        return descriptor;
    }
    private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

    static {
        java.lang.String[] descriptorData = {
            "\n!EnhancedPositionSourceProto.proto*p\n\026E"
            + "nhancedPositionSource\022,\n(ENHANCED_POSITI"
            + "ON_SOURCE_OPEN_STREET_MAP\020\000\022(\n$ENHANCED_"
            + "POSITION_SOURCE_GOOGLE_MAPS\020\001"
        };
        descriptor = com.google.protobuf.Descriptors.FileDescriptor
                .internalBuildGeneratedFileFrom(descriptorData,
                        new com.google.protobuf.Descriptors.FileDescriptor[]{});
    }

    // @@protoc_insertion_point(outer_class_scope)
}
