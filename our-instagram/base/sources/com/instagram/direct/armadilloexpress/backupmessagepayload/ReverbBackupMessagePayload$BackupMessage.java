package com.instagram.direct.armadilloexpress.backupmessagepayload;

import X.AbstractC43592JPx;
import X.AbstractC64538TIu;
import X.C63271SgV;
import X.InterfaceC50386MMo;
import X.InterfaceC65445TkH;
import X.K61;
import X.K62;
import X.K63;
import X.K64;
import X.RYn;
import X.TES;

/* loaded from: classes8.dex */
public final class ReverbBackupMessagePayload$BackupMessage extends RYn implements InterfaceC65445TkH {
    public static final ReverbBackupMessagePayload$BackupMessage DEFAULT_INSTANCE;
    public static final int ENCRYPTED_TRANSPORT_EVENT_FIELD_NUMBER = 5;
    public static final int ENCRYPTED_TRANSPORT_LOCALLY_TRANSFORMED_MESSAGE_FIELD_NUMBER = 6;
    public static final int ENCRYPTED_TRANSPORT_MESSAGE_FIELD_NUMBER = 2;
    public static final int METADATA_FIELD_NUMBER = 1;
    public static volatile InterfaceC50386MMo PARSER;
    public int bitField0_;
    public Metadata metadata_;
    public int payloadCase_ = 0;
    public Object payload_;

    /* loaded from: classes8.dex */
    public final class Metadata extends RYn implements InterfaceC65445TkH {
        public static final Metadata DEFAULT_INSTANCE;
        public static final int FRANKING_METADATA_FIELD_NUMBER = 4;
        public static final int FUTUREPROOFBEHAVIOR_FIELD_NUMBER = 6;
        public static final int MESSAGE_ID_FIELD_NUMBER = 2;
        public static volatile InterfaceC50386MMo PARSER = null;
        public static final int PAYLOADVERSION_FIELD_NUMBER = 5;
        public static final int SENDER_ID_FIELD_NUMBER = 1;
        public static final int THREADTYPETAG_FIELD_NUMBER = 7;
        public static final int TIMESTAMP_MS_FIELD_NUMBER = 3;
        public int bitField0_;
        public FrankingMetadata frankingMetadata_;
        public int futureProofBehavior_;
        public int payloadVersion_;
        public int threadTypeTag_;
        public long timestampMs_;
        public String senderId_ = "";
        public String messageId_ = "";

        /* loaded from: classes8.dex */
        public final class FrankingMetadata extends RYn implements InterfaceC65445TkH {
            public static final FrankingMetadata DEFAULT_INSTANCE;
            public static final int FRANKING_TAG_FIELD_NUMBER = 3;
            public static volatile InterfaceC50386MMo PARSER = null;
            public static final int REPORTING_TAG_FIELD_NUMBER = 4;
            public int bitField0_;
            public AbstractC64538TIu frankingTag_;
            public AbstractC64538TIu reportingTag_;

            static {
                FrankingMetadata frankingMetadata = new FrankingMetadata();
                DEFAULT_INSTANCE = frankingMetadata;
                RYn.A0B(frankingMetadata, FrankingMetadata.class);
            }

            public FrankingMetadata() {
                AbstractC64538TIu abstractC64538TIu = AbstractC64538TIu.A01;
                this.frankingTag_ = abstractC64538TIu;
                this.reportingTag_ = abstractC64538TIu;
            }

            @Override // X.RYn
            public final Object A0K(Integer num, Object obj, Object obj2) {
                InterfaceC50386MMo interfaceC50386MMo;
                switch (num.intValue()) {
                    case 0:
                        return (byte) 1;
                    case 1:
                        return null;
                    case 2:
                        return RYn.A08(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0003\u0004\u0002\u0000\u0000\u0000\u0003ည\u0000\u0004ည\u0001", new Object[]{"bitField0_", "frankingTag_", "reportingTag_"});
                    case 3:
                        return new FrankingMetadata();
                    case 4:
                        return new K63();
                    case 5:
                        return DEFAULT_INSTANCE;
                    case 6:
                        InterfaceC50386MMo interfaceC50386MMo2 = PARSER;
                        if (interfaceC50386MMo2 == null) {
                            synchronized (FrankingMetadata.class) {
                                interfaceC50386MMo = PARSER;
                                if (interfaceC50386MMo == null) {
                                    C63271SgV c63271SgV = TES.A01;
                                    interfaceC50386MMo = AbstractC43592JPx.A0J(DEFAULT_INSTANCE);
                                    PARSER = interfaceC50386MMo;
                                }
                            }
                            return interfaceC50386MMo;
                        }
                        return interfaceC50386MMo2;
                    default:
                        throw AbstractC43592JPx.A11();
                }
            }
        }

        static {
            Metadata metadata = new Metadata();
            DEFAULT_INSTANCE = metadata;
            RYn.A0B(metadata, Metadata.class);
        }

        @Override // X.RYn
        public final Object A0K(Integer num, Object obj, Object obj2) {
            InterfaceC50386MMo interfaceC50386MMo;
            switch (num.intValue()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return RYn.A08(DEFAULT_INSTANCE, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဂ\u0002\u0004ဉ\u0003\u0005င\u0004\u0006င\u0005\u0007င\u0006", new Object[]{"bitField0_", "senderId_", "messageId_", "timestampMs_", "frankingMetadata_", "payloadVersion_", "futureProofBehavior_", "threadTypeTag_"});
                case 3:
                    return new Metadata();
                case 4:
                    return new K62();
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    InterfaceC50386MMo interfaceC50386MMo2 = PARSER;
                    if (interfaceC50386MMo2 == null) {
                        synchronized (Metadata.class) {
                            interfaceC50386MMo = PARSER;
                            if (interfaceC50386MMo == null) {
                                C63271SgV c63271SgV = TES.A01;
                                interfaceC50386MMo = AbstractC43592JPx.A0J(DEFAULT_INSTANCE);
                                PARSER = interfaceC50386MMo;
                            }
                        }
                        return interfaceC50386MMo;
                    }
                    return interfaceC50386MMo2;
                default:
                    throw AbstractC43592JPx.A11();
            }
        }
    }

    /* loaded from: classes8.dex */
    public final class Subprotocol extends RYn implements InterfaceC65445TkH {
        public static final Subprotocol DEFAULT_INSTANCE;
        public static volatile InterfaceC50386MMo PARSER = null;
        public static final int PAYLOAD_FIELD_NUMBER = 1;
        public static final int VERSION_FIELD_NUMBER = 2;
        public int bitField0_;
        public AbstractC64538TIu payload_ = AbstractC64538TIu.A01;
        public int version_;

        static {
            Subprotocol subprotocol = new Subprotocol();
            DEFAULT_INSTANCE = subprotocol;
            RYn.A0B(subprotocol, Subprotocol.class);
        }

        @Override // X.RYn
        public final Object A0K(Integer num, Object obj, Object obj2) {
            InterfaceC50386MMo interfaceC50386MMo;
            switch (num.intValue()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return RYn.A08(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ည\u0000\u0002င\u0001", new Object[]{"bitField0_", "payload_", "version_"});
                case 3:
                    return new Subprotocol();
                case 4:
                    return new K64();
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    InterfaceC50386MMo interfaceC50386MMo2 = PARSER;
                    if (interfaceC50386MMo2 == null) {
                        synchronized (Subprotocol.class) {
                            interfaceC50386MMo = PARSER;
                            if (interfaceC50386MMo == null) {
                                C63271SgV c63271SgV = TES.A01;
                                interfaceC50386MMo = AbstractC43592JPx.A0J(DEFAULT_INSTANCE);
                                PARSER = interfaceC50386MMo;
                            }
                        }
                        return interfaceC50386MMo;
                    }
                    return interfaceC50386MMo2;
                default:
                    throw AbstractC43592JPx.A11();
            }
        }
    }

    static {
        ReverbBackupMessagePayload$BackupMessage reverbBackupMessagePayload$BackupMessage = new ReverbBackupMessagePayload$BackupMessage();
        DEFAULT_INSTANCE = reverbBackupMessagePayload$BackupMessage;
        RYn.A0B(reverbBackupMessagePayload$BackupMessage, ReverbBackupMessagePayload$BackupMessage.class);
    }

    @Override // X.RYn
    public final Object A0K(Integer num, Object obj, Object obj2) {
        InterfaceC50386MMo interfaceC50386MMo;
        switch (num.intValue()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return RYn.A08(DEFAULT_INSTANCE, "\u0001\u0004\u0001\u0001\u0001\u0006\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ွ\u0000\u0005ြ\u0000\u0006ြ\u0000", new Object[]{"payload_", "payloadCase_", "bitField0_", "metadata_", Subprotocol.class, Subprotocol.class});
            case 3:
                return new ReverbBackupMessagePayload$BackupMessage();
            case 4:
                return new K61();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC50386MMo interfaceC50386MMo2 = PARSER;
                if (interfaceC50386MMo2 == null) {
                    synchronized (ReverbBackupMessagePayload$BackupMessage.class) {
                        interfaceC50386MMo = PARSER;
                        if (interfaceC50386MMo == null) {
                            C63271SgV c63271SgV = TES.A01;
                            interfaceC50386MMo = AbstractC43592JPx.A0J(DEFAULT_INSTANCE);
                            PARSER = interfaceC50386MMo;
                        }
                    }
                    return interfaceC50386MMo;
                }
                return interfaceC50386MMo2;
            default:
                throw AbstractC43592JPx.A11();
        }
    }
}
