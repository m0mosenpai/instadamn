package com.instagram.direct.armadilloexpress.transportpayload;

import X.AbstractC43592JPx;
import X.C45367K6a;
import X.C63271SgV;
import X.InterfaceC50386MMo;
import X.InterfaceC65445TkH;
import X.RYn;
import X.TES;

/* loaded from: classes8.dex */
public final class Reaction extends RYn implements InterfaceC65445TkH {
    public static final Reaction DEFAULT_INSTANCE;
    public static final int EMOJI_FIELD_NUMBER = 3;
    public static volatile InterfaceC50386MMo PARSER = null;
    public static final int REACTION_STATUS_FIELD_NUMBER = 2;
    public static final int REACTION_TYPE_FIELD_NUMBER = 1;
    public static final int SUPER_REACT_TYPE_FIELD_NUMBER = 4;
    public int bitField0_;
    public String reactionType_ = "";
    public String reactionStatus_ = "";
    public String emoji_ = "";
    public String superReactType_ = "";

    static {
        Reaction reaction = new Reaction();
        DEFAULT_INSTANCE = reaction;
        RYn.A0B(reaction, Reaction.class);
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
                return RYn.A08(DEFAULT_INSTANCE, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003", new Object[]{"bitField0_", "reactionType_", "reactionStatus_", "emoji_", "superReactType_"});
            case 3:
                return new Reaction();
            case 4:
                return new C45367K6a();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC50386MMo interfaceC50386MMo2 = PARSER;
                if (interfaceC50386MMo2 == null) {
                    synchronized (Reaction.class) {
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