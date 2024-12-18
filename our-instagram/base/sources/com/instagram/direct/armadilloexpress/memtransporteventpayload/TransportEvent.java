package com.instagram.direct.armadilloexpress.memtransporteventpayload;

import X.AbstractC43592JPx;
import X.C63271SgV;
import X.EnumC46311Keh;
import X.InterfaceC50386MMo;
import X.InterfaceC65445TkH;
import X.K65;
import X.K66;
import X.K67;
import X.K68;
import X.K69;
import X.LWU;
import X.LWV;
import X.LWW;
import X.RYn;
import X.TES;

/* loaded from: classes8.dex */
public final class TransportEvent extends RYn implements InterfaceC65445TkH {
    public static final TransportEvent DEFAULT_INSTANCE;
    public static final int EVENT_FIELD_NUMBER = 2;
    public static volatile InterfaceC50386MMo PARSER = null;
    public static final int PLACEHOLDER_FIELD_NUMBER = 1;
    public int bitField0_;
    public int contentCase_ = 0;
    public Object content_;

    /* loaded from: classes8.dex */
    public final class Event extends RYn implements InterfaceC65445TkH {
        public static final Event DEFAULT_INSTANCE;
        public static final int DEVICE_CHANGE_FIELD_NUMBER = 1;
        public static final int ICDC_ALERT_FIELD_NUMBER = 2;
        public static volatile InterfaceC50386MMo PARSER;
        public int bitField0_;
        public int eventCase_ = 0;
        public Object event_;

        /* loaded from: classes8.dex */
        public final class DeviceChange extends RYn implements InterfaceC65445TkH {
            public static final DeviceChange DEFAULT_INSTANCE;
            public static final int DEVICE_NAME_FIELD_NUMBER = 2;
            public static volatile InterfaceC50386MMo PARSER = null;
            public static final int TYPE_FIELD_NUMBER = 1;
            public int bitField0_;
            public String deviceName_ = "";
            public int type_;

            static {
                DeviceChange deviceChange = new DeviceChange();
                DEFAULT_INSTANCE = deviceChange;
                RYn.A0B(deviceChange, DeviceChange.class);
            }

            public final EnumC46311Keh A0L() {
                int i = this.type_;
                if (i != 0) {
                    if (i != 1) {
                        if (i != 2) {
                            if (i == 3) {
                                return EnumC46311Keh.REPLACED;
                            }
                        } else {
                            return EnumC46311Keh.REMOVED;
                        }
                    } else {
                        return EnumC46311Keh.ADDED;
                    }
                }
                return EnumC46311Keh.NONE;
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
                        return RYn.A08(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဈ\u0001", new Object[]{"bitField0_", "type_", LWU.A00, "deviceName_"});
                    case 3:
                        return new DeviceChange();
                    case 4:
                        return new K67();
                    case 5:
                        return DEFAULT_INSTANCE;
                    case 6:
                        InterfaceC50386MMo interfaceC50386MMo2 = PARSER;
                        if (interfaceC50386MMo2 == null) {
                            synchronized (DeviceChange.class) {
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
        public final class IcdcAlert extends RYn implements InterfaceC65445TkH {
            public static final IcdcAlert DEFAULT_INSTANCE;
            public static volatile InterfaceC50386MMo PARSER = null;
            public static final int TYPE_FIELD_NUMBER = 1;
            public int bitField0_;
            public int type_;

            /* JADX WARN: Type inference failed for: r1v0, types: [com.instagram.direct.armadilloexpress.memtransporteventpayload.TransportEvent$Event$IcdcAlert, X.RYn] */
            static {
                ?? rYn = new RYn();
                DEFAULT_INSTANCE = rYn;
                RYn.A0B(rYn, IcdcAlert.class);
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
                        return RYn.A08(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"bitField0_", "type_", LWV.A00});
                    case 3:
                        return new RYn();
                    case 4:
                        return new K68();
                    case 5:
                        return DEFAULT_INSTANCE;
                    case 6:
                        InterfaceC50386MMo interfaceC50386MMo2 = PARSER;
                        if (interfaceC50386MMo2 == null) {
                            synchronized (IcdcAlert.class) {
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
            Event event = new Event();
            DEFAULT_INSTANCE = event;
            RYn.A0B(event, Event.class);
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
                    return RYn.A08(DEFAULT_INSTANCE, "\u0001\u0002\u0001\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ြ\u0000\u0002ြ\u0000", new Object[]{"event_", "eventCase_", "bitField0_", DeviceChange.class, IcdcAlert.class});
                case 3:
                    return new Event();
                case 4:
                    return new K66();
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    InterfaceC50386MMo interfaceC50386MMo2 = PARSER;
                    if (interfaceC50386MMo2 == null) {
                        synchronized (Event.class) {
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
    public final class Placeholder extends RYn implements InterfaceC65445TkH {
        public static final Placeholder DEFAULT_INSTANCE;
        public static volatile InterfaceC50386MMo PARSER = null;
        public static final int TYPE_FIELD_NUMBER = 1;
        public int bitField0_;
        public int type_ = 1;

        static {
            Placeholder placeholder = new Placeholder();
            DEFAULT_INSTANCE = placeholder;
            RYn.A0B(placeholder, Placeholder.class);
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
                    return RYn.A08(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"bitField0_", "type_", LWW.A00});
                case 3:
                    return new Placeholder();
                case 4:
                    return new K69();
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    InterfaceC50386MMo interfaceC50386MMo2 = PARSER;
                    if (interfaceC50386MMo2 == null) {
                        synchronized (Placeholder.class) {
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
        TransportEvent transportEvent = new TransportEvent();
        DEFAULT_INSTANCE = transportEvent;
        RYn.A0B(transportEvent, TransportEvent.class);
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
                return RYn.A08(DEFAULT_INSTANCE, "\u0001\u0002\u0001\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ြ\u0000\u0002ြ\u0000", new Object[]{"content_", "contentCase_", "bitField0_", Placeholder.class, Event.class});
            case 3:
                return new TransportEvent();
            case 4:
                return new K65();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC50386MMo interfaceC50386MMo2 = PARSER;
                if (interfaceC50386MMo2 == null) {
                    synchronized (TransportEvent.class) {
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
