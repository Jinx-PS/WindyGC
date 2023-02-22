// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ReformFireworksReq.proto

package emu.grasscutter.net.proto;

public final class ReformFireworksReqOuterClass {
  private ReformFireworksReqOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface ReformFireworksReqOrBuilder extends
      // @@protoc_insertion_point(interface_extends:ReformFireworksReq)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>.FireworksReformData fireworksReformData = 8;</code>
     * @return Whether the fireworksReformData field is set.
     */
    boolean hasFireworksReformData();
    /**
     * <code>.FireworksReformData fireworksReformData = 8;</code>
     * @return The fireworksReformData.
     */
    emu.grasscutter.net.proto.FireworksReformDataOuterClass.FireworksReformData getFireworksReformData();
    /**
     * <code>.FireworksReformData fireworksReformData = 8;</code>
     */
    emu.grasscutter.net.proto.FireworksReformDataOuterClass.FireworksReformDataOrBuilder getFireworksReformDataOrBuilder();
  }
  /**
   * Protobuf type {@code ReformFireworksReq}
   */
  public static final class ReformFireworksReq extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:ReformFireworksReq)
      ReformFireworksReqOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use ReformFireworksReq.newBuilder() to construct.
    private ReformFireworksReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private ReformFireworksReq() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new ReformFireworksReq();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private ReformFireworksReq(
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
            case 66: {
              emu.grasscutter.net.proto.FireworksReformDataOuterClass.FireworksReformData.Builder subBuilder = null;
              if (fireworksReformData_ != null) {
                subBuilder = fireworksReformData_.toBuilder();
              }
              fireworksReformData_ = input.readMessage(emu.grasscutter.net.proto.FireworksReformDataOuterClass.FireworksReformData.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(fireworksReformData_);
                fireworksReformData_ = subBuilder.buildPartial();
              }

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
      return emu.grasscutter.net.proto.ReformFireworksReqOuterClass.internal_static_ReformFireworksReq_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.ReformFireworksReqOuterClass.internal_static_ReformFireworksReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.ReformFireworksReqOuterClass.ReformFireworksReq.class, emu.grasscutter.net.proto.ReformFireworksReqOuterClass.ReformFireworksReq.Builder.class);
    }

    /**
     * Protobuf enum {@code ReformFireworksReq.KPLMIHEDFMI}
     */
    public enum KPLMIHEDFMI
        implements com.google.protobuf.ProtocolMessageEnum {
      /**
       * <code>NONE = 0;</code>
       */
      NONE(0, 0),
      /**
       * <code>PEPPOHPHJOJ = 5941;</code>
       */
      PEPPOHPHJOJ(1, 5941),
      /**
       * <code>NNBKOLMPOEA = 1;</code>
       */
      NNBKOLMPOEA(3, 1),
      UNRECOGNIZED(-1, -1),
      ;

      /**
       * <code>DCDNILFDFLB = 0;</code>
       */
      public static final KPLMIHEDFMI DCDNILFDFLB = NONE;
      /**
       * <code>EAJIABGAOCI = 1;</code>
       */
      public static final KPLMIHEDFMI EAJIABGAOCI = NNBKOLMPOEA;
      /**
       * <code>NONE = 0;</code>
       */
      public static final int NONE_VALUE = 0;
      /**
       * <code>PEPPOHPHJOJ = 5941;</code>
       */
      public static final int PEPPOHPHJOJ_VALUE = 5941;
      /**
       * <code>DCDNILFDFLB = 0;</code>
       */
      public static final int DCDNILFDFLB_VALUE = 0;
      /**
       * <code>NNBKOLMPOEA = 1;</code>
       */
      public static final int NNBKOLMPOEA_VALUE = 1;
      /**
       * <code>EAJIABGAOCI = 1;</code>
       */
      public static final int EAJIABGAOCI_VALUE = 1;


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
      public static KPLMIHEDFMI valueOf(int value) {
        return forNumber(value);
      }

      /**
       * @param value The numeric wire value of the corresponding enum entry.
       * @return The enum associated with the given numeric wire value.
       */
      public static KPLMIHEDFMI forNumber(int value) {
        switch (value) {
          case 0: return NONE;
          case 5941: return PEPPOHPHJOJ;
          case 1: return NNBKOLMPOEA;
          default: return null;
        }
      }

      public static com.google.protobuf.Internal.EnumLiteMap<KPLMIHEDFMI>
          internalGetValueMap() {
        return internalValueMap;
      }
      private static final com.google.protobuf.Internal.EnumLiteMap<
          KPLMIHEDFMI> internalValueMap =
            new com.google.protobuf.Internal.EnumLiteMap<KPLMIHEDFMI>() {
              public KPLMIHEDFMI findValueByNumber(int number) {
                return KPLMIHEDFMI.forNumber(number);
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
        return emu.grasscutter.net.proto.ReformFireworksReqOuterClass.ReformFireworksReq.getDescriptor().getEnumTypes().get(0);
      }

      private static final KPLMIHEDFMI[] VALUES = getStaticValuesArray();
      private static KPLMIHEDFMI[] getStaticValuesArray() {
        return new KPLMIHEDFMI[] {
          NONE, PEPPOHPHJOJ, DCDNILFDFLB, NNBKOLMPOEA, EAJIABGAOCI, 
        };
      }
      public static KPLMIHEDFMI valueOf(
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

      private KPLMIHEDFMI(int index, int value) {
        this.index = index;
        this.value = value;
      }

      // @@protoc_insertion_point(enum_scope:ReformFireworksReq.KPLMIHEDFMI)
    }

    public static final int FIREWORKSREFORMDATA_FIELD_NUMBER = 8;
    private emu.grasscutter.net.proto.FireworksReformDataOuterClass.FireworksReformData fireworksReformData_;
    /**
     * <code>.FireworksReformData fireworksReformData = 8;</code>
     * @return Whether the fireworksReformData field is set.
     */
    @java.lang.Override
    public boolean hasFireworksReformData() {
      return fireworksReformData_ != null;
    }
    /**
     * <code>.FireworksReformData fireworksReformData = 8;</code>
     * @return The fireworksReformData.
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.FireworksReformDataOuterClass.FireworksReformData getFireworksReformData() {
      return fireworksReformData_ == null ? emu.grasscutter.net.proto.FireworksReformDataOuterClass.FireworksReformData.getDefaultInstance() : fireworksReformData_;
    }
    /**
     * <code>.FireworksReformData fireworksReformData = 8;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.FireworksReformDataOuterClass.FireworksReformDataOrBuilder getFireworksReformDataOrBuilder() {
      return getFireworksReformData();
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
      if (fireworksReformData_ != null) {
        output.writeMessage(8, getFireworksReformData());
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (fireworksReformData_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(8, getFireworksReformData());
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
      if (!(obj instanceof emu.grasscutter.net.proto.ReformFireworksReqOuterClass.ReformFireworksReq)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.ReformFireworksReqOuterClass.ReformFireworksReq other = (emu.grasscutter.net.proto.ReformFireworksReqOuterClass.ReformFireworksReq) obj;

      if (hasFireworksReformData() != other.hasFireworksReformData()) return false;
      if (hasFireworksReformData()) {
        if (!getFireworksReformData()
            .equals(other.getFireworksReformData())) return false;
      }
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
      if (hasFireworksReformData()) {
        hash = (37 * hash) + FIREWORKSREFORMDATA_FIELD_NUMBER;
        hash = (53 * hash) + getFireworksReformData().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.ReformFireworksReqOuterClass.ReformFireworksReq parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.ReformFireworksReqOuterClass.ReformFireworksReq parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.ReformFireworksReqOuterClass.ReformFireworksReq parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.ReformFireworksReqOuterClass.ReformFireworksReq parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.ReformFireworksReqOuterClass.ReformFireworksReq parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.ReformFireworksReqOuterClass.ReformFireworksReq parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.ReformFireworksReqOuterClass.ReformFireworksReq parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.ReformFireworksReqOuterClass.ReformFireworksReq parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.ReformFireworksReqOuterClass.ReformFireworksReq parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.ReformFireworksReqOuterClass.ReformFireworksReq parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.ReformFireworksReqOuterClass.ReformFireworksReq parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.ReformFireworksReqOuterClass.ReformFireworksReq parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.ReformFireworksReqOuterClass.ReformFireworksReq prototype) {
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
     * Protobuf type {@code ReformFireworksReq}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:ReformFireworksReq)
        emu.grasscutter.net.proto.ReformFireworksReqOuterClass.ReformFireworksReqOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.ReformFireworksReqOuterClass.internal_static_ReformFireworksReq_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.ReformFireworksReqOuterClass.internal_static_ReformFireworksReq_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.ReformFireworksReqOuterClass.ReformFireworksReq.class, emu.grasscutter.net.proto.ReformFireworksReqOuterClass.ReformFireworksReq.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.ReformFireworksReqOuterClass.ReformFireworksReq.newBuilder()
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
        if (fireworksReformDataBuilder_ == null) {
          fireworksReformData_ = null;
        } else {
          fireworksReformData_ = null;
          fireworksReformDataBuilder_ = null;
        }
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.ReformFireworksReqOuterClass.internal_static_ReformFireworksReq_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.ReformFireworksReqOuterClass.ReformFireworksReq getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.ReformFireworksReqOuterClass.ReformFireworksReq.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.ReformFireworksReqOuterClass.ReformFireworksReq build() {
        emu.grasscutter.net.proto.ReformFireworksReqOuterClass.ReformFireworksReq result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.ReformFireworksReqOuterClass.ReformFireworksReq buildPartial() {
        emu.grasscutter.net.proto.ReformFireworksReqOuterClass.ReformFireworksReq result = new emu.grasscutter.net.proto.ReformFireworksReqOuterClass.ReformFireworksReq(this);
        if (fireworksReformDataBuilder_ == null) {
          result.fireworksReformData_ = fireworksReformData_;
        } else {
          result.fireworksReformData_ = fireworksReformDataBuilder_.build();
        }
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
        if (other instanceof emu.grasscutter.net.proto.ReformFireworksReqOuterClass.ReformFireworksReq) {
          return mergeFrom((emu.grasscutter.net.proto.ReformFireworksReqOuterClass.ReformFireworksReq)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.ReformFireworksReqOuterClass.ReformFireworksReq other) {
        if (other == emu.grasscutter.net.proto.ReformFireworksReqOuterClass.ReformFireworksReq.getDefaultInstance()) return this;
        if (other.hasFireworksReformData()) {
          mergeFireworksReformData(other.getFireworksReformData());
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
        emu.grasscutter.net.proto.ReformFireworksReqOuterClass.ReformFireworksReq parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.ReformFireworksReqOuterClass.ReformFireworksReq) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private emu.grasscutter.net.proto.FireworksReformDataOuterClass.FireworksReformData fireworksReformData_;
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.proto.FireworksReformDataOuterClass.FireworksReformData, emu.grasscutter.net.proto.FireworksReformDataOuterClass.FireworksReformData.Builder, emu.grasscutter.net.proto.FireworksReformDataOuterClass.FireworksReformDataOrBuilder> fireworksReformDataBuilder_;
      /**
       * <code>.FireworksReformData fireworksReformData = 8;</code>
       * @return Whether the fireworksReformData field is set.
       */
      public boolean hasFireworksReformData() {
        return fireworksReformDataBuilder_ != null || fireworksReformData_ != null;
      }
      /**
       * <code>.FireworksReformData fireworksReformData = 8;</code>
       * @return The fireworksReformData.
       */
      public emu.grasscutter.net.proto.FireworksReformDataOuterClass.FireworksReformData getFireworksReformData() {
        if (fireworksReformDataBuilder_ == null) {
          return fireworksReformData_ == null ? emu.grasscutter.net.proto.FireworksReformDataOuterClass.FireworksReformData.getDefaultInstance() : fireworksReformData_;
        } else {
          return fireworksReformDataBuilder_.getMessage();
        }
      }
      /**
       * <code>.FireworksReformData fireworksReformData = 8;</code>
       */
      public Builder setFireworksReformData(emu.grasscutter.net.proto.FireworksReformDataOuterClass.FireworksReformData value) {
        if (fireworksReformDataBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          fireworksReformData_ = value;
          onChanged();
        } else {
          fireworksReformDataBuilder_.setMessage(value);
        }

        return this;
      }
      /**
       * <code>.FireworksReformData fireworksReformData = 8;</code>
       */
      public Builder setFireworksReformData(
          emu.grasscutter.net.proto.FireworksReformDataOuterClass.FireworksReformData.Builder builderForValue) {
        if (fireworksReformDataBuilder_ == null) {
          fireworksReformData_ = builderForValue.build();
          onChanged();
        } else {
          fireworksReformDataBuilder_.setMessage(builderForValue.build());
        }

        return this;
      }
      /**
       * <code>.FireworksReformData fireworksReformData = 8;</code>
       */
      public Builder mergeFireworksReformData(emu.grasscutter.net.proto.FireworksReformDataOuterClass.FireworksReformData value) {
        if (fireworksReformDataBuilder_ == null) {
          if (fireworksReformData_ != null) {
            fireworksReformData_ =
              emu.grasscutter.net.proto.FireworksReformDataOuterClass.FireworksReformData.newBuilder(fireworksReformData_).mergeFrom(value).buildPartial();
          } else {
            fireworksReformData_ = value;
          }
          onChanged();
        } else {
          fireworksReformDataBuilder_.mergeFrom(value);
        }

        return this;
      }
      /**
       * <code>.FireworksReformData fireworksReformData = 8;</code>
       */
      public Builder clearFireworksReformData() {
        if (fireworksReformDataBuilder_ == null) {
          fireworksReformData_ = null;
          onChanged();
        } else {
          fireworksReformData_ = null;
          fireworksReformDataBuilder_ = null;
        }

        return this;
      }
      /**
       * <code>.FireworksReformData fireworksReformData = 8;</code>
       */
      public emu.grasscutter.net.proto.FireworksReformDataOuterClass.FireworksReformData.Builder getFireworksReformDataBuilder() {
        
        onChanged();
        return getFireworksReformDataFieldBuilder().getBuilder();
      }
      /**
       * <code>.FireworksReformData fireworksReformData = 8;</code>
       */
      public emu.grasscutter.net.proto.FireworksReformDataOuterClass.FireworksReformDataOrBuilder getFireworksReformDataOrBuilder() {
        if (fireworksReformDataBuilder_ != null) {
          return fireworksReformDataBuilder_.getMessageOrBuilder();
        } else {
          return fireworksReformData_ == null ?
              emu.grasscutter.net.proto.FireworksReformDataOuterClass.FireworksReformData.getDefaultInstance() : fireworksReformData_;
        }
      }
      /**
       * <code>.FireworksReformData fireworksReformData = 8;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.proto.FireworksReformDataOuterClass.FireworksReformData, emu.grasscutter.net.proto.FireworksReformDataOuterClass.FireworksReformData.Builder, emu.grasscutter.net.proto.FireworksReformDataOuterClass.FireworksReformDataOrBuilder> 
          getFireworksReformDataFieldBuilder() {
        if (fireworksReformDataBuilder_ == null) {
          fireworksReformDataBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              emu.grasscutter.net.proto.FireworksReformDataOuterClass.FireworksReformData, emu.grasscutter.net.proto.FireworksReformDataOuterClass.FireworksReformData.Builder, emu.grasscutter.net.proto.FireworksReformDataOuterClass.FireworksReformDataOrBuilder>(
                  getFireworksReformData(),
                  getParentForChildren(),
                  isClean());
          fireworksReformData_ = null;
        }
        return fireworksReformDataBuilder_;
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


      // @@protoc_insertion_point(builder_scope:ReformFireworksReq)
    }

    // @@protoc_insertion_point(class_scope:ReformFireworksReq)
    private static final emu.grasscutter.net.proto.ReformFireworksReqOuterClass.ReformFireworksReq DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.ReformFireworksReqOuterClass.ReformFireworksReq();
    }

    public static emu.grasscutter.net.proto.ReformFireworksReqOuterClass.ReformFireworksReq getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<ReformFireworksReq>
        PARSER = new com.google.protobuf.AbstractParser<ReformFireworksReq>() {
      @java.lang.Override
      public ReformFireworksReq parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new ReformFireworksReq(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<ReformFireworksReq> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<ReformFireworksReq> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.ReformFireworksReqOuterClass.ReformFireworksReq getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ReformFireworksReq_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ReformFireworksReq_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\030ReformFireworksReq.proto\032\031FireworksRef" +
      "ormData.proto\"\251\001\n\022ReformFireworksReq\0221\n\023" +
      "fireworksReformData\030\010 \001(\0132\024.FireworksRef" +
      "ormData\"`\n\013KPLMIHEDFMI\022\010\n\004NONE\020\000\022\020\n\013PEPP" +
      "OHPHJOJ\020\265.\022\017\n\013DCDNILFDFLB\020\000\022\017\n\013NNBKOLMPO" +
      "EA\020\001\022\017\n\013EAJIABGAOCI\020\001\032\002\020\001B\033\n\031emu.grasscu" +
      "tter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.proto.FireworksReformDataOuterClass.getDescriptor(),
        });
    internal_static_ReformFireworksReq_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_ReformFireworksReq_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ReformFireworksReq_descriptor,
        new java.lang.String[] { "FireworksReformData", });
    emu.grasscutter.net.proto.FireworksReformDataOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
