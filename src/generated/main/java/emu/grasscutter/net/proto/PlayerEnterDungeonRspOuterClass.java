// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: PlayerEnterDungeonRsp.proto

package emu.grasscutter.net.proto;

public final class PlayerEnterDungeonRspOuterClass {
  private PlayerEnterDungeonRspOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface PlayerEnterDungeonRspOrBuilder extends
      // @@protoc_insertion_point(interface_extends:PlayerEnterDungeonRsp)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 pointId = 1;</code>
     * @return The pointId.
     */
    int getPointId();

    /**
     * <code>uint32 dungeonId = 11;</code>
     * @return The dungeonId.
     */
    int getDungeonId();

    /**
     * <code>int32 retcode = 3;</code>
     * @return The retcode.
     */
    int getRetcode();
  }
  /**
   * Protobuf type {@code PlayerEnterDungeonRsp}
   */
  public static final class PlayerEnterDungeonRsp extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:PlayerEnterDungeonRsp)
      PlayerEnterDungeonRspOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use PlayerEnterDungeonRsp.newBuilder() to construct.
    private PlayerEnterDungeonRsp(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private PlayerEnterDungeonRsp() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new PlayerEnterDungeonRsp();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private PlayerEnterDungeonRsp(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 8: {

              pointId_ = input.readUInt32();
              break;
            }
            case 24: {

              retcode_ = input.readInt32();
              break;
            }
            case 88: {

              dungeonId_ = input.readUInt32();
              break;
            }
            default: {
              if (!parseUnknownField(
                  input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.PlayerEnterDungeonRspOuterClass.internal_static_PlayerEnterDungeonRsp_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.PlayerEnterDungeonRspOuterClass.internal_static_PlayerEnterDungeonRsp_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.PlayerEnterDungeonRspOuterClass.PlayerEnterDungeonRsp.class, emu.grasscutter.net.proto.PlayerEnterDungeonRspOuterClass.PlayerEnterDungeonRsp.Builder.class);
    }

    /**
     * Protobuf enum {@code PlayerEnterDungeonRsp.IJHCMILABEE}
     */
    public enum IJHCMILABEE
        implements com.google.protobuf.ProtocolMessageEnum {
      /**
       * <code>NONE = 0;</code>
       */
      NONE(0, 0),
      /**
       * <code>PEPPOHPHJOJ = 998;</code>
       */
      PEPPOHPHJOJ(1, 998),
      /**
       * <code>NNBKOLMPOEA = 1;</code>
       */
      NNBKOLMPOEA(3, 1),
      UNRECOGNIZED(-1, -1),
      ;

      /**
       * <code>DCDNILFDFLB = 0;</code>
       */
      public static final IJHCMILABEE DCDNILFDFLB = NONE;
      /**
       * <code>NONE = 0;</code>
       */
      public static final int NONE_VALUE = 0;
      /**
       * <code>PEPPOHPHJOJ = 998;</code>
       */
      public static final int PEPPOHPHJOJ_VALUE = 998;
      /**
       * <code>DCDNILFDFLB = 0;</code>
       */
      public static final int DCDNILFDFLB_VALUE = 0;
      /**
       * <code>NNBKOLMPOEA = 1;</code>
       */
      public static final int NNBKOLMPOEA_VALUE = 1;


      public final int getNumber() {
        if (index == -1) {
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
      public static IJHCMILABEE valueOf(int value) {
        return forNumber(value);
      }

      /**
       * @param value The numeric wire value of the corresponding enum entry.
       * @return The enum associated with the given numeric wire value.
       */
      public static IJHCMILABEE forNumber(int value) {
        switch (value) {
          case 0: return NONE;
          case 998: return PEPPOHPHJOJ;
          case 1: return NNBKOLMPOEA;
          default: return null;
        }
      }

      public static com.google.protobuf.Internal.EnumLiteMap<IJHCMILABEE>
          internalGetValueMap() {
        return internalValueMap;
      }
      private static final com.google.protobuf.Internal.EnumLiteMap<
          IJHCMILABEE> internalValueMap =
            new com.google.protobuf.Internal.EnumLiteMap<IJHCMILABEE>() {
              public IJHCMILABEE findValueByNumber(int number) {
                return IJHCMILABEE.forNumber(number);
              }
            };

      public final com.google.protobuf.Descriptors.EnumValueDescriptor
          getValueDescriptor() {
        if (index == -1) {
          throw new java.lang.IllegalStateException(
              "Can't get the descriptor of an unrecognized enum value.");
        }
        return getDescriptor().getValues().get(index);
      }
      public final com.google.protobuf.Descriptors.EnumDescriptor
          getDescriptorForType() {
        return getDescriptor();
      }
      public static final com.google.protobuf.Descriptors.EnumDescriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.PlayerEnterDungeonRspOuterClass.PlayerEnterDungeonRsp.getDescriptor().getEnumTypes().get(0);
      }

      private static final IJHCMILABEE[] VALUES = getStaticValuesArray();
      private static IJHCMILABEE[] getStaticValuesArray() {
        return new IJHCMILABEE[] {
          NONE, PEPPOHPHJOJ, DCDNILFDFLB, NNBKOLMPOEA, 
        };
      }
      public static IJHCMILABEE valueOf(
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

      private final int index;
      private final int value;

      private IJHCMILABEE(int index, int value) {
        this.index = index;
        this.value = value;
      }

      // @@protoc_insertion_point(enum_scope:PlayerEnterDungeonRsp.IJHCMILABEE)
    }

    public static final int POINTID_FIELD_NUMBER = 1;
    private int pointId_;
    /**
     * <code>uint32 pointId = 1;</code>
     * @return The pointId.
     */
    @java.lang.Override
    public int getPointId() {
      return pointId_;
    }

    public static final int DUNGEONID_FIELD_NUMBER = 11;
    private int dungeonId_;
    /**
     * <code>uint32 dungeonId = 11;</code>
     * @return The dungeonId.
     */
    @java.lang.Override
    public int getDungeonId() {
      return dungeonId_;
    }

    public static final int RETCODE_FIELD_NUMBER = 3;
    private int retcode_;
    /**
     * <code>int32 retcode = 3;</code>
     * @return The retcode.
     */
    @java.lang.Override
    public int getRetcode() {
      return retcode_;
    }

    private byte memoizedIsInitialized = -1;
    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    @java.lang.Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (pointId_ != 0) {
        output.writeUInt32(1, pointId_);
      }
      if (retcode_ != 0) {
        output.writeInt32(3, retcode_);
      }
      if (dungeonId_ != 0) {
        output.writeUInt32(11, dungeonId_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (pointId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(1, pointId_);
      }
      if (retcode_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(3, retcode_);
      }
      if (dungeonId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(11, dungeonId_);
      }
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof emu.grasscutter.net.proto.PlayerEnterDungeonRspOuterClass.PlayerEnterDungeonRsp)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.PlayerEnterDungeonRspOuterClass.PlayerEnterDungeonRsp other = (emu.grasscutter.net.proto.PlayerEnterDungeonRspOuterClass.PlayerEnterDungeonRsp) obj;

      if (getPointId()
          != other.getPointId()) return false;
      if (getDungeonId()
          != other.getDungeonId()) return false;
      if (getRetcode()
          != other.getRetcode()) return false;
      if (!unknownFields.equals(other.unknownFields)) return false;
      return true;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      hash = (37 * hash) + POINTID_FIELD_NUMBER;
      hash = (53 * hash) + getPointId();
      hash = (37 * hash) + DUNGEONID_FIELD_NUMBER;
      hash = (53 * hash) + getDungeonId();
      hash = (37 * hash) + RETCODE_FIELD_NUMBER;
      hash = (53 * hash) + getRetcode();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.PlayerEnterDungeonRspOuterClass.PlayerEnterDungeonRsp parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.PlayerEnterDungeonRspOuterClass.PlayerEnterDungeonRsp parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.PlayerEnterDungeonRspOuterClass.PlayerEnterDungeonRsp parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.PlayerEnterDungeonRspOuterClass.PlayerEnterDungeonRsp parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.PlayerEnterDungeonRspOuterClass.PlayerEnterDungeonRsp parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.PlayerEnterDungeonRspOuterClass.PlayerEnterDungeonRsp parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.PlayerEnterDungeonRspOuterClass.PlayerEnterDungeonRsp parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.PlayerEnterDungeonRspOuterClass.PlayerEnterDungeonRsp parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.PlayerEnterDungeonRspOuterClass.PlayerEnterDungeonRsp parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.PlayerEnterDungeonRspOuterClass.PlayerEnterDungeonRsp parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.PlayerEnterDungeonRspOuterClass.PlayerEnterDungeonRsp parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.PlayerEnterDungeonRspOuterClass.PlayerEnterDungeonRsp parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(emu.grasscutter.net.proto.PlayerEnterDungeonRspOuterClass.PlayerEnterDungeonRsp prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    @java.lang.Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code PlayerEnterDungeonRsp}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:PlayerEnterDungeonRsp)
        emu.grasscutter.net.proto.PlayerEnterDungeonRspOuterClass.PlayerEnterDungeonRspOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.PlayerEnterDungeonRspOuterClass.internal_static_PlayerEnterDungeonRsp_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.PlayerEnterDungeonRspOuterClass.internal_static_PlayerEnterDungeonRsp_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.PlayerEnterDungeonRspOuterClass.PlayerEnterDungeonRsp.class, emu.grasscutter.net.proto.PlayerEnterDungeonRspOuterClass.PlayerEnterDungeonRsp.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.PlayerEnterDungeonRspOuterClass.PlayerEnterDungeonRsp.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3
                .alwaysUseFieldBuilders) {
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        pointId_ = 0;

        dungeonId_ = 0;

        retcode_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.PlayerEnterDungeonRspOuterClass.internal_static_PlayerEnterDungeonRsp_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.PlayerEnterDungeonRspOuterClass.PlayerEnterDungeonRsp getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.PlayerEnterDungeonRspOuterClass.PlayerEnterDungeonRsp.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.PlayerEnterDungeonRspOuterClass.PlayerEnterDungeonRsp build() {
        emu.grasscutter.net.proto.PlayerEnterDungeonRspOuterClass.PlayerEnterDungeonRsp result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.PlayerEnterDungeonRspOuterClass.PlayerEnterDungeonRsp buildPartial() {
        emu.grasscutter.net.proto.PlayerEnterDungeonRspOuterClass.PlayerEnterDungeonRsp result = new emu.grasscutter.net.proto.PlayerEnterDungeonRspOuterClass.PlayerEnterDungeonRsp(this);
        result.pointId_ = pointId_;
        result.dungeonId_ = dungeonId_;
        result.retcode_ = retcode_;
        onBuilt();
        return result;
      }

      @java.lang.Override
      public Builder clone() {
        return super.clone();
      }
      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.setField(field, value);
      }
      @java.lang.Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return super.clearField(field);
      }
      @java.lang.Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return super.clearOneof(oneof);
      }
      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, java.lang.Object value) {
        return super.setRepeatedField(field, index, value);
      }
      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.addRepeatedField(field, value);
      }
      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof emu.grasscutter.net.proto.PlayerEnterDungeonRspOuterClass.PlayerEnterDungeonRsp) {
          return mergeFrom((emu.grasscutter.net.proto.PlayerEnterDungeonRspOuterClass.PlayerEnterDungeonRsp)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.PlayerEnterDungeonRspOuterClass.PlayerEnterDungeonRsp other) {
        if (other == emu.grasscutter.net.proto.PlayerEnterDungeonRspOuterClass.PlayerEnterDungeonRsp.getDefaultInstance()) return this;
        if (other.getPointId() != 0) {
          setPointId(other.getPointId());
        }
        if (other.getDungeonId() != 0) {
          setDungeonId(other.getDungeonId());
        }
        if (other.getRetcode() != 0) {
          setRetcode(other.getRetcode());
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        emu.grasscutter.net.proto.PlayerEnterDungeonRspOuterClass.PlayerEnterDungeonRsp parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.PlayerEnterDungeonRspOuterClass.PlayerEnterDungeonRsp) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int pointId_ ;
      /**
       * <code>uint32 pointId = 1;</code>
       * @return The pointId.
       */
      @java.lang.Override
      public int getPointId() {
        return pointId_;
      }
      /**
       * <code>uint32 pointId = 1;</code>
       * @param value The pointId to set.
       * @return This builder for chaining.
       */
      public Builder setPointId(int value) {
        
        pointId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 pointId = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearPointId() {
        
        pointId_ = 0;
        onChanged();
        return this;
      }

      private int dungeonId_ ;
      /**
       * <code>uint32 dungeonId = 11;</code>
       * @return The dungeonId.
       */
      @java.lang.Override
      public int getDungeonId() {
        return dungeonId_;
      }
      /**
       * <code>uint32 dungeonId = 11;</code>
       * @param value The dungeonId to set.
       * @return This builder for chaining.
       */
      public Builder setDungeonId(int value) {
        
        dungeonId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 dungeonId = 11;</code>
       * @return This builder for chaining.
       */
      public Builder clearDungeonId() {
        
        dungeonId_ = 0;
        onChanged();
        return this;
      }

      private int retcode_ ;
      /**
       * <code>int32 retcode = 3;</code>
       * @return The retcode.
       */
      @java.lang.Override
      public int getRetcode() {
        return retcode_;
      }
      /**
       * <code>int32 retcode = 3;</code>
       * @param value The retcode to set.
       * @return This builder for chaining.
       */
      public Builder setRetcode(int value) {
        
        retcode_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 retcode = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearRetcode() {
        
        retcode_ = 0;
        onChanged();
        return this;
      }
      @java.lang.Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @java.lang.Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:PlayerEnterDungeonRsp)
    }

    // @@protoc_insertion_point(class_scope:PlayerEnterDungeonRsp)
    private static final emu.grasscutter.net.proto.PlayerEnterDungeonRspOuterClass.PlayerEnterDungeonRsp DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.PlayerEnterDungeonRspOuterClass.PlayerEnterDungeonRsp();
    }

    public static emu.grasscutter.net.proto.PlayerEnterDungeonRspOuterClass.PlayerEnterDungeonRsp getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<PlayerEnterDungeonRsp>
        PARSER = new com.google.protobuf.AbstractParser<PlayerEnterDungeonRsp>() {
      @java.lang.Override
      public PlayerEnterDungeonRsp parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new PlayerEnterDungeonRsp(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<PlayerEnterDungeonRsp> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<PlayerEnterDungeonRsp> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.PlayerEnterDungeonRspOuterClass.PlayerEnterDungeonRsp getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_PlayerEnterDungeonRsp_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_PlayerEnterDungeonRsp_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\033PlayerEnterDungeonRsp.proto\"\235\001\n\025Player" +
      "EnterDungeonRsp\022\017\n\007pointId\030\001 \001(\r\022\021\n\tdung" +
      "eonId\030\013 \001(\r\022\017\n\007retcode\030\003 \001(\005\"O\n\013IJHCMILA" +
      "BEE\022\010\n\004NONE\020\000\022\020\n\013PEPPOHPHJOJ\020\346\007\022\017\n\013DCDNI" +
      "LFDFLB\020\000\022\017\n\013NNBKOLMPOEA\020\001\032\002\020\001B\033\n\031emu.gra" +
      "sscutter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_PlayerEnterDungeonRsp_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_PlayerEnterDungeonRsp_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_PlayerEnterDungeonRsp_descriptor,
        new java.lang.String[] { "PointId", "DungeonId", "Retcode", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
