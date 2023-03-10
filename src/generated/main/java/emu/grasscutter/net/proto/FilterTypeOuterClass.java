// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: FilterType.proto

package emu.grasscutter.net.proto;

public final class FilterTypeOuterClass {
  private FilterTypeOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  /**
   * Protobuf enum {@code FilterType}
   */
  public enum FilterType
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>FILTER_TYPE_ALL = 0;</code>
     */
    FILTER_TYPE_ALL(0),
    /**
     * <code>FILTER_TYPE_AIR = 1;</code>
     */
    FILTER_TYPE_AIR(1),
    /**
     * <code>FILTER_TYPE_WATER = 2;</code>
     */
    FILTER_TYPE_WATER(2),
    UNRECOGNIZED(-1),
    ;

    /**
     * <code>FILTER_TYPE_ALL = 0;</code>
     */
    public static final int FILTER_TYPE_ALL_VALUE = 0;
    /**
     * <code>FILTER_TYPE_AIR = 1;</code>
     */
    public static final int FILTER_TYPE_AIR_VALUE = 1;
    /**
     * <code>FILTER_TYPE_WATER = 2;</code>
     */
    public static final int FILTER_TYPE_WATER_VALUE = 2;


    public final int getNumber() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalArgumentException(
            "Can't get the number of an unknown enum value.");
      }
      return value;
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static FilterType valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static FilterType forNumber(int value) {
      switch (value) {
        case 0: return FILTER_TYPE_ALL;
        case 1: return FILTER_TYPE_AIR;
        case 2: return FILTER_TYPE_WATER;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<FilterType>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        FilterType> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<FilterType>() {
            public FilterType findValueByNumber(int number) {
              return FilterType.forNumber(number);
            }
          };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor
        getValueDescriptor() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalStateException(
            "Can't get the descriptor of an unrecognized enum value.");
      }
      return getDescriptor().getValues().get(ordinal());
    }
    public final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptorForType() {
      return getDescriptor();
    }
    public static final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.FilterTypeOuterClass.getDescriptor().getEnumTypes().get(0);
    }

    private static final FilterType[] VALUES = values();

    public static FilterType valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      if (desc.getIndex() == -1) {
        return UNRECOGNIZED;
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private FilterType(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:FilterType)
  }


  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\020FilterType.proto*M\n\nFilterType\022\023\n\017FILT" +
      "ER_TYPE_ALL\020\000\022\023\n\017FILTER_TYPE_AIR\020\001\022\025\n\021FI" +
      "LTER_TYPE_WATER\020\002B\033\n\031emu.grasscutter.net" +
      ".protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
