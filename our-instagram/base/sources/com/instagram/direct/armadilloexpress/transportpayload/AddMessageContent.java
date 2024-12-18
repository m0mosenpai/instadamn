package com.instagram.direct.armadilloexpress.transportpayload;

import X.AbstractC43592JPx;
import X.C05F;
import X.C45376K6j;
import X.C63271SgV;
import X.InterfaceC50386MMo;
import X.InterfaceC65445TkH;
import X.RYn;
import X.TES;

/* loaded from: classes8.dex */
public final class AddMessageContent extends RYn implements InterfaceC65445TkH {
    public static final int ADMIN_MESSAGE_FIELD_NUMBER = 8;
    public static final int COLLECTION_FIELD_NUMBER = 7;
    public static final AddMessageContent DEFAULT_INSTANCE;
    public static final int LIKE_FIELD_NUMBER = 2;
    public static final int LINK_FIELD_NUMBER = 3;
    public static final int MEDIA_FIELD_NUMBER = 5;
    public static volatile InterfaceC50386MMo PARSER = null;
    public static final int PLACEHOLDER_FIELD_NUMBER = 6;
    public static final int RECEIVER_FETCH_XMA_FIELD_NUMBER = 4;
    public static final int TEXT_FIELD_NUMBER = 1;
    public int addMessageContentCase_ = 0;
    public Object addMessageContent_;
    public int bitField0_;

    static {
        AddMessageContent addMessageContent = new AddMessageContent();
        DEFAULT_INSTANCE = addMessageContent;
        RYn.A0B(addMessageContent, AddMessageContent.class);
    }

    public static C45376K6j A00() {
        return (C45376K6j) DEFAULT_INSTANCE.A0I();
    }

    public final Media A0L() {
        if (this.addMessageContentCase_ == 5) {
            return (Media) this.addMessageContent_;
        }
        return Media.DEFAULT_INSTANCE;
    }

    public final ReceiverFetchXma A0M() {
        if (this.addMessageContentCase_ == 4) {
            return (ReceiverFetchXma) this.addMessageContent_;
        }
        return ReceiverFetchXma.DEFAULT_INSTANCE;
    }

    public final Text A0N() {
        if (this.addMessageContentCase_ == 1) {
            return (Text) this.addMessageContent_;
        }
        return Text.DEFAULT_INSTANCE;
    }

    public final Integer A0O() {
        switch (this.addMessageContentCase_) {
            case 0:
                return C05F.A1F;
            case 1:
                return C05F.A00;
            case 2:
                return C05F.A01;
            case 3:
                return C05F.A0C;
            case 4:
                return C05F.A0N;
            case 5:
                return C05F.A0Y;
            case 6:
                return C05F.A0j;
            case 7:
                return C05F.A0u;
            case 8:
                return C05F.A15;
            default:
                return null;
        }
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
                return RYn.A08(DEFAULT_INSTANCE, "\u0001\b\u0001\u0001\u0001\b\b\u0000\u0000\u0000\u0001ြ\u0000\u0002ြ\u0000\u0003ြ\u0000\u0004ြ\u0000\u0005ြ\u0000\u0006ြ\u0000\u0007ြ\u0000\bြ\u0000", new Object[]{"addMessageContent_", "addMessageContentCase_", "bitField0_", Text.class, Like.class, Link.class, ReceiverFetchXma.class, Media.class, Placeholder.class, Collection.class, AdminMessage.class});
            case 3:
                return new AddMessageContent();
            case 4:
                return new C45376K6j();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC50386MMo interfaceC50386MMo2 = PARSER;
                if (interfaceC50386MMo2 == null) {
                    synchronized (AddMessageContent.class) {
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
