// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: PlayerApplyEnterMpNotify.proto

package emu.grasscutter.net.proto;

public final class PlayerApplyEnterMpNotifyOuterClass {
  private PlayerApplyEnterMpNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface PlayerApplyEnterMpNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:PlayerApplyEnterMpNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 srcThreadIndex = 14;</code>
     * @return The srcThreadIndex.
     */
    int getSrcThreadIndex();

    /**
     * <code>.OnlinePlayerInfo srcPlayerInfo = 11;</code>
     * @return Whether the srcPlayerInfo field is set.
     */
    boolean hasSrcPlayerInfo();
    /**
     * <code>.OnlinePlayerInfo srcPlayerInfo = 11;</code>
     * @return The srcPlayerInfo.
     */
    emu.grasscutter.net.proto.OnlinePlayerInfoOuterClass.OnlinePlayerInfo getSrcPlayerInfo();
    /**
     * <code>.OnlinePlayerInfo srcPlayerInfo = 11;</code>
     */
    emu.grasscutter.net.proto.OnlinePlayerInfoOuterClass.OnlinePlayerInfoOrBuilder getSrcPlayerInfoOrBuilder();

    /**
     * <code>uint32 srcAppId = 12;</code>
     * @return The srcAppId.
     */
    int getSrcAppId();
  }
  /**
   * Protobuf type {@code PlayerApplyEnterMpNotify}
   */
  public static final class PlayerApplyEnterMpNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:PlayerApplyEnterMpNotify)
      PlayerApplyEnterMpNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use PlayerApplyEnterMpNotify.newBuilder() to construct.
    private PlayerApplyEnterMpNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private PlayerApplyEnterMpNotify() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new PlayerApplyEnterMpNotify();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private PlayerApplyEnterMpNotify(
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
            case 90: {
              emu.grasscutter.net.proto.OnlinePlayerInfoOuterClass.OnlinePlayerInfo.Builder subBuilder = null;
              if (srcPlayerInfo_ != null) {
                subBuilder = srcPlayerInfo_.toBuilder();
              }
              srcPlayerInfo_ = input.readMessage(emu.grasscutter.net.proto.OnlinePlayerInfoOuterClass.OnlinePlayerInfo.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(srcPlayerInfo_);
                srcPlayerInfo_ = subBuilder.buildPartial();
              }

              break;
            }
            case 96: {

              srcAppId_ = input.readUInt32();
              break;
            }
            case 112: {

              srcThreadIndex_ = input.readUInt32();
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
      return emu.grasscutter.net.proto.PlayerApplyEnterMpNotifyOuterClass.internal_static_PlayerApplyEnterMpNotify_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.PlayerApplyEnterMpNotifyOuterClass.internal_static_PlayerApplyEnterMpNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.PlayerApplyEnterMpNotifyOuterClass.PlayerApplyEnterMpNotify.class, emu.grasscutter.net.proto.PlayerApplyEnterMpNotifyOuterClass.PlayerApplyEnterMpNotify.Builder.class);
    }

    /**
     * Protobuf enum {@code PlayerApplyEnterMpNotify.BALMBLBPAGP}
     */
    public enum BALMBLBPAGP
        implements com.google.protobuf.ProtocolMessageEnum {
      /**
       * <code>NONE = 0;</code>
       */
      NONE(0, 0),
      /**
       * <code>PEPPOHPHJOJ = 1838;</code>
       */
      PEPPOHPHJOJ(1, 1838),
      /**
       * <code>NNBKOLMPOEA = 1;</code>
       */
      NNBKOLMPOEA(3, 1),
      UNRECOGNIZED(-1, -1),
      ;

      /**
       * <code>DCDNILFDFLB = 0;</code>
       */
      public static final BALMBLBPAGP DCDNILFDFLB = NONE;
      /**
       * <code>NONE = 0;</code>
       */
      public static final int NONE_VALUE = 0;
      /**
       * <code>PEPPOHPHJOJ = 1838;</code>
       */
      public static final int PEPPOHPHJOJ_VALUE = 1838;
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
      public static BALMBLBPAGP valueOf(int value) {
        return forNumber(value);
      }

      /**
       * @param value The numeric wire value of the corresponding enum entry.
       * @return The enum associated with the given numeric wire value.
       */
      public static BALMBLBPAGP forNumber(int value) {
        switch (value) {
          case 0: return NONE;
          case 1838: return PEPPOHPHJOJ;
          case 1: return NNBKOLMPOEA;
          default: return null;
        }
      }

      public static com.google.protobuf.Internal.EnumLiteMap<BALMBLBPAGP>
          internalGetValueMap() {
        return internalValueMap;
      }
      private static final com.google.protobuf.Internal.EnumLiteMap<
          BALMBLBPAGP> internalValueMap =
            new com.google.protobuf.Internal.EnumLiteMap<BALMBLBPAGP>() {
              public BALMBLBPAGP findValueByNumber(int number) {
                return BALMBLBPAGP.forNumber(number);
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
        return emu.grasscutter.net.proto.PlayerApplyEnterMpNotifyOuterClass.PlayerApplyEnterMpNotify.getDescriptor().getEnumTypes().get(0);
      }

      private static final BALMBLBPAGP[] VALUES = getStaticValuesArray();
      private static BALMBLBPAGP[] getStaticValuesArray() {
        return new BALMBLBPAGP[] {
          NONE, PEPPOHPHJOJ, DCDNILFDFLB, NNBKOLMPOEA, 
        };
      }
      public static BALMBLBPAGP valueOf(
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

      private BALMBLBPAGP(int index, int value) {
        this.index = index;
        this.value = value;
      }

      // @@protoc_insertion_point(enum_scope:PlayerApplyEnterMpNotify.BALMBLBPAGP)
    }

    public static final int SRCTHREADINDEX_FIELD_NUMBER = 14;
    private int srcThreadIndex_;
    /**
     * <code>uint32 srcThreadIndex = 14;</code>
     * @return The srcThreadIndex.
     */
    @java.lang.Override
    public int getSrcThreadIndex() {
      return srcThreadIndex_;
    }

    public static final int SRCPLAYERINFO_FIELD_NUMBER = 11;
    private emu.grasscutter.net.proto.OnlinePlayerInfoOuterClass.OnlinePlayerInfo srcPlayerInfo_;
    /**
     * <code>.OnlinePlayerInfo srcPlayerInfo = 11;</code>
     * @return Whether the srcPlayerInfo field is set.
     */
    @java.lang.Override
    public boolean hasSrcPlayerInfo() {
      return srcPlayerInfo_ != null;
    }
    /**
     * <code>.OnlinePlayerInfo srcPlayerInfo = 11;</code>
     * @return The srcPlayerInfo.
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.OnlinePlayerInfoOuterClass.OnlinePlayerInfo getSrcPlayerInfo() {
      return srcPlayerInfo_ == null ? emu.grasscutter.net.proto.OnlinePlayerInfoOuterClass.OnlinePlayerInfo.getDefaultInstance() : srcPlayerInfo_;
    }
    /**
     * <code>.OnlinePlayerInfo srcPlayerInfo = 11;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.OnlinePlayerInfoOuterClass.OnlinePlayerInfoOrBuilder getSrcPlayerInfoOrBuilder() {
      return getSrcPlayerInfo();
    }

    public static final int SRCAPPID_FIELD_NUMBER = 12;
    private int srcAppId_;
    /**
     * <code>uint32 srcAppId = 12;</code>
     * @return The srcAppId.
     */
    @java.lang.Override
    public int getSrcAppId() {
      return srcAppId_;
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
      if (srcPlayerInfo_ != null) {
        output.writeMessage(11, getSrcPlayerInfo());
      }
      if (srcAppId_ != 0) {
        output.writeUInt32(12, srcAppId_);
      }
      if (srcThreadIndex_ != 0) {
        output.writeUInt32(14, srcThreadIndex_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (srcPlayerInfo_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(11, getSrcPlayerInfo());
      }
      if (srcAppId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(12, srcAppId_);
      }
      if (srcThreadIndex_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(14, srcThreadIndex_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.PlayerApplyEnterMpNotifyOuterClass.PlayerApplyEnterMpNotify)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.PlayerApplyEnterMpNotifyOuterClass.PlayerApplyEnterMpNotify other = (emu.grasscutter.net.proto.PlayerApplyEnterMpNotifyOuterClass.PlayerApplyEnterMpNotify) obj;

      if (getSrcThreadIndex()
          != other.getSrcThreadIndex()) return false;
      if (hasSrcPlayerInfo() != other.hasSrcPlayerInfo()) return false;
      if (hasSrcPlayerInfo()) {
        if (!getSrcPlayerInfo()
            .equals(other.getSrcPlayerInfo())) return false;
      }
      if (getSrcAppId()
          != other.getSrcAppId()) return false;
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
      hash = (37 * hash) + SRCTHREADINDEX_FIELD_NUMBER;
      hash = (53 * hash) + getSrcThreadIndex();
      if (hasSrcPlayerInfo()) {
        hash = (37 * hash) + SRCPLAYERINFO_FIELD_NUMBER;
        hash = (53 * hash) + getSrcPlayerInfo().hashCode();
      }
      hash = (37 * hash) + SRCAPPID_FIELD_NUMBER;
      hash = (53 * hash) + getSrcAppId();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.PlayerApplyEnterMpNotifyOuterClass.PlayerApplyEnterMpNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.PlayerApplyEnterMpNotifyOuterClass.PlayerApplyEnterMpNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.PlayerApplyEnterMpNotifyOuterClass.PlayerApplyEnterMpNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.PlayerApplyEnterMpNotifyOuterClass.PlayerApplyEnterMpNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.PlayerApplyEnterMpNotifyOuterClass.PlayerApplyEnterMpNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.PlayerApplyEnterMpNotifyOuterClass.PlayerApplyEnterMpNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.PlayerApplyEnterMpNotifyOuterClass.PlayerApplyEnterMpNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.PlayerApplyEnterMpNotifyOuterClass.PlayerApplyEnterMpNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.PlayerApplyEnterMpNotifyOuterClass.PlayerApplyEnterMpNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.PlayerApplyEnterMpNotifyOuterClass.PlayerApplyEnterMpNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.PlayerApplyEnterMpNotifyOuterClass.PlayerApplyEnterMpNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.PlayerApplyEnterMpNotifyOuterClass.PlayerApplyEnterMpNotify parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.PlayerApplyEnterMpNotifyOuterClass.PlayerApplyEnterMpNotify prototype) {
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
     * Protobuf type {@code PlayerApplyEnterMpNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:PlayerApplyEnterMpNotify)
        emu.grasscutter.net.proto.PlayerApplyEnterMpNotifyOuterClass.PlayerApplyEnterMpNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.PlayerApplyEnterMpNotifyOuterClass.internal_static_PlayerApplyEnterMpNotify_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.PlayerApplyEnterMpNotifyOuterClass.internal_static_PlayerApplyEnterMpNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.PlayerApplyEnterMpNotifyOuterClass.PlayerApplyEnterMpNotify.class, emu.grasscutter.net.proto.PlayerApplyEnterMpNotifyOuterClass.PlayerApplyEnterMpNotify.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.PlayerApplyEnterMpNotifyOuterClass.PlayerApplyEnterMpNotify.newBuilder()
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
        srcThreadIndex_ = 0;

        if (srcPlayerInfoBuilder_ == null) {
          srcPlayerInfo_ = null;
        } else {
          srcPlayerInfo_ = null;
          srcPlayerInfoBuilder_ = null;
        }
        srcAppId_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.PlayerApplyEnterMpNotifyOuterClass.internal_static_PlayerApplyEnterMpNotify_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.PlayerApplyEnterMpNotifyOuterClass.PlayerApplyEnterMpNotify getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.PlayerApplyEnterMpNotifyOuterClass.PlayerApplyEnterMpNotify.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.PlayerApplyEnterMpNotifyOuterClass.PlayerApplyEnterMpNotify build() {
        emu.grasscutter.net.proto.PlayerApplyEnterMpNotifyOuterClass.PlayerApplyEnterMpNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.PlayerApplyEnterMpNotifyOuterClass.PlayerApplyEnterMpNotify buildPartial() {
        emu.grasscutter.net.proto.PlayerApplyEnterMpNotifyOuterClass.PlayerApplyEnterMpNotify result = new emu.grasscutter.net.proto.PlayerApplyEnterMpNotifyOuterClass.PlayerApplyEnterMpNotify(this);
        result.srcThreadIndex_ = srcThreadIndex_;
        if (srcPlayerInfoBuilder_ == null) {
          result.srcPlayerInfo_ = srcPlayerInfo_;
        } else {
          result.srcPlayerInfo_ = srcPlayerInfoBuilder_.build();
        }
        result.srcAppId_ = srcAppId_;
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
        if (other instanceof emu.grasscutter.net.proto.PlayerApplyEnterMpNotifyOuterClass.PlayerApplyEnterMpNotify) {
          return mergeFrom((emu.grasscutter.net.proto.PlayerApplyEnterMpNotifyOuterClass.PlayerApplyEnterMpNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.PlayerApplyEnterMpNotifyOuterClass.PlayerApplyEnterMpNotify other) {
        if (other == emu.grasscutter.net.proto.PlayerApplyEnterMpNotifyOuterClass.PlayerApplyEnterMpNotify.getDefaultInstance()) return this;
        if (other.getSrcThreadIndex() != 0) {
          setSrcThreadIndex(other.getSrcThreadIndex());
        }
        if (other.hasSrcPlayerInfo()) {
          mergeSrcPlayerInfo(other.getSrcPlayerInfo());
        }
        if (other.getSrcAppId() != 0) {
          setSrcAppId(other.getSrcAppId());
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
        emu.grasscutter.net.proto.PlayerApplyEnterMpNotifyOuterClass.PlayerApplyEnterMpNotify parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.PlayerApplyEnterMpNotifyOuterClass.PlayerApplyEnterMpNotify) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int srcThreadIndex_ ;
      /**
       * <code>uint32 srcThreadIndex = 14;</code>
       * @return The srcThreadIndex.
       */
      @java.lang.Override
      public int getSrcThreadIndex() {
        return srcThreadIndex_;
      }
      /**
       * <code>uint32 srcThreadIndex = 14;</code>
       * @param value The srcThreadIndex to set.
       * @return This builder for chaining.
       */
      public Builder setSrcThreadIndex(int value) {
        
        srcThreadIndex_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 srcThreadIndex = 14;</code>
       * @return This builder for chaining.
       */
      public Builder clearSrcThreadIndex() {
        
        srcThreadIndex_ = 0;
        onChanged();
        return this;
      }

      private emu.grasscutter.net.proto.OnlinePlayerInfoOuterClass.OnlinePlayerInfo srcPlayerInfo_;
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.proto.OnlinePlayerInfoOuterClass.OnlinePlayerInfo, emu.grasscutter.net.proto.OnlinePlayerInfoOuterClass.OnlinePlayerInfo.Builder, emu.grasscutter.net.proto.OnlinePlayerInfoOuterClass.OnlinePlayerInfoOrBuilder> srcPlayerInfoBuilder_;
      /**
       * <code>.OnlinePlayerInfo srcPlayerInfo = 11;</code>
       * @return Whether the srcPlayerInfo field is set.
       */
      public boolean hasSrcPlayerInfo() {
        return srcPlayerInfoBuilder_ != null || srcPlayerInfo_ != null;
      }
      /**
       * <code>.OnlinePlayerInfo srcPlayerInfo = 11;</code>
       * @return The srcPlayerInfo.
       */
      public emu.grasscutter.net.proto.OnlinePlayerInfoOuterClass.OnlinePlayerInfo getSrcPlayerInfo() {
        if (srcPlayerInfoBuilder_ == null) {
          return srcPlayerInfo_ == null ? emu.grasscutter.net.proto.OnlinePlayerInfoOuterClass.OnlinePlayerInfo.getDefaultInstance() : srcPlayerInfo_;
        } else {
          return srcPlayerInfoBuilder_.getMessage();
        }
      }
      /**
       * <code>.OnlinePlayerInfo srcPlayerInfo = 11;</code>
       */
      public Builder setSrcPlayerInfo(emu.grasscutter.net.proto.OnlinePlayerInfoOuterClass.OnlinePlayerInfo value) {
        if (srcPlayerInfoBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          srcPlayerInfo_ = value;
          onChanged();
        } else {
          srcPlayerInfoBuilder_.setMessage(value);
        }

        return this;
      }
      /**
       * <code>.OnlinePlayerInfo srcPlayerInfo = 11;</code>
       */
      public Builder setSrcPlayerInfo(
          emu.grasscutter.net.proto.OnlinePlayerInfoOuterClass.OnlinePlayerInfo.Builder builderForValue) {
        if (srcPlayerInfoBuilder_ == null) {
          srcPlayerInfo_ = builderForValue.build();
          onChanged();
        } else {
          srcPlayerInfoBuilder_.setMessage(builderForValue.build());
        }

        return this;
      }
      /**
       * <code>.OnlinePlayerInfo srcPlayerInfo = 11;</code>
       */
      public Builder mergeSrcPlayerInfo(emu.grasscutter.net.proto.OnlinePlayerInfoOuterClass.OnlinePlayerInfo value) {
        if (srcPlayerInfoBuilder_ == null) {
          if (srcPlayerInfo_ != null) {
            srcPlayerInfo_ =
              emu.grasscutter.net.proto.OnlinePlayerInfoOuterClass.OnlinePlayerInfo.newBuilder(srcPlayerInfo_).mergeFrom(value).buildPartial();
          } else {
            srcPlayerInfo_ = value;
          }
          onChanged();
        } else {
          srcPlayerInfoBuilder_.mergeFrom(value);
        }

        return this;
      }
      /**
       * <code>.OnlinePlayerInfo srcPlayerInfo = 11;</code>
       */
      public Builder clearSrcPlayerInfo() {
        if (srcPlayerInfoBuilder_ == null) {
          srcPlayerInfo_ = null;
          onChanged();
        } else {
          srcPlayerInfo_ = null;
          srcPlayerInfoBuilder_ = null;
        }

        return this;
      }
      /**
       * <code>.OnlinePlayerInfo srcPlayerInfo = 11;</code>
       */
      public emu.grasscutter.net.proto.OnlinePlayerInfoOuterClass.OnlinePlayerInfo.Builder getSrcPlayerInfoBuilder() {
        
        onChanged();
        return getSrcPlayerInfoFieldBuilder().getBuilder();
      }
      /**
       * <code>.OnlinePlayerInfo srcPlayerInfo = 11;</code>
       */
      public emu.grasscutter.net.proto.OnlinePlayerInfoOuterClass.OnlinePlayerInfoOrBuilder getSrcPlayerInfoOrBuilder() {
        if (srcPlayerInfoBuilder_ != null) {
          return srcPlayerInfoBuilder_.getMessageOrBuilder();
        } else {
          return srcPlayerInfo_ == null ?
              emu.grasscutter.net.proto.OnlinePlayerInfoOuterClass.OnlinePlayerInfo.getDefaultInstance() : srcPlayerInfo_;
        }
      }
      /**
       * <code>.OnlinePlayerInfo srcPlayerInfo = 11;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.proto.OnlinePlayerInfoOuterClass.OnlinePlayerInfo, emu.grasscutter.net.proto.OnlinePlayerInfoOuterClass.OnlinePlayerInfo.Builder, emu.grasscutter.net.proto.OnlinePlayerInfoOuterClass.OnlinePlayerInfoOrBuilder> 
          getSrcPlayerInfoFieldBuilder() {
        if (srcPlayerInfoBuilder_ == null) {
          srcPlayerInfoBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              emu.grasscutter.net.proto.OnlinePlayerInfoOuterClass.OnlinePlayerInfo, emu.grasscutter.net.proto.OnlinePlayerInfoOuterClass.OnlinePlayerInfo.Builder, emu.grasscutter.net.proto.OnlinePlayerInfoOuterClass.OnlinePlayerInfoOrBuilder>(
                  getSrcPlayerInfo(),
                  getParentForChildren(),
                  isClean());
          srcPlayerInfo_ = null;
        }
        return srcPlayerInfoBuilder_;
      }

      private int srcAppId_ ;
      /**
       * <code>uint32 srcAppId = 12;</code>
       * @return The srcAppId.
       */
      @java.lang.Override
      public int getSrcAppId() {
        return srcAppId_;
      }
      /**
       * <code>uint32 srcAppId = 12;</code>
       * @param value The srcAppId to set.
       * @return This builder for chaining.
       */
      public Builder setSrcAppId(int value) {
        
        srcAppId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 srcAppId = 12;</code>
       * @return This builder for chaining.
       */
      public Builder clearSrcAppId() {
        
        srcAppId_ = 0;
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


      // @@protoc_insertion_point(builder_scope:PlayerApplyEnterMpNotify)
    }

    // @@protoc_insertion_point(class_scope:PlayerApplyEnterMpNotify)
    private static final emu.grasscutter.net.proto.PlayerApplyEnterMpNotifyOuterClass.PlayerApplyEnterMpNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.PlayerApplyEnterMpNotifyOuterClass.PlayerApplyEnterMpNotify();
    }

    public static emu.grasscutter.net.proto.PlayerApplyEnterMpNotifyOuterClass.PlayerApplyEnterMpNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<PlayerApplyEnterMpNotify>
        PARSER = new com.google.protobuf.AbstractParser<PlayerApplyEnterMpNotify>() {
      @java.lang.Override
      public PlayerApplyEnterMpNotify parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new PlayerApplyEnterMpNotify(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<PlayerApplyEnterMpNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<PlayerApplyEnterMpNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.PlayerApplyEnterMpNotifyOuterClass.PlayerApplyEnterMpNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_PlayerApplyEnterMpNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_PlayerApplyEnterMpNotify_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\036PlayerApplyEnterMpNotify.proto\032\026Online" +
      "PlayerInfo.proto\"\277\001\n\030PlayerApplyEnterMpN" +
      "otify\022\026\n\016srcThreadIndex\030\016 \001(\r\022(\n\rsrcPlay" +
      "erInfo\030\013 \001(\0132\021.OnlinePlayerInfo\022\020\n\010srcAp" +
      "pId\030\014 \001(\r\"O\n\013BALMBLBPAGP\022\010\n\004NONE\020\000\022\020\n\013PE" +
      "PPOHPHJOJ\020\256\016\022\017\n\013DCDNILFDFLB\020\000\022\017\n\013NNBKOLM" +
      "POEA\020\001\032\002\020\001B\033\n\031emu.grasscutter.net.protob" +
      "\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.proto.OnlinePlayerInfoOuterClass.getDescriptor(),
        });
    internal_static_PlayerApplyEnterMpNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_PlayerApplyEnterMpNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_PlayerApplyEnterMpNotify_descriptor,
        new java.lang.String[] { "SrcThreadIndex", "SrcPlayerInfo", "SrcAppId", });
    emu.grasscutter.net.proto.OnlinePlayerInfoOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}