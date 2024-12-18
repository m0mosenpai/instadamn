package com.instagram.direct.armadilloexpress.transportpayload;

import X.AbstractC43592JPx;
import X.C05F;
import X.C45370K6d;
import X.C63271SgV;
import X.InterfaceC50386MMo;
import X.InterfaceC65445TkH;
import X.RYn;
import X.TES;

/* loaded from: classes8.dex */
public final class SupplementMessageContent extends RYn implements InterfaceC65445TkH {
    public static final int CONTENT_VIEW_FIELD_NUMBER = 2;
    public static final SupplementMessageContent DEFAULT_INSTANCE;
    public static final int EDIT_TEXT_FIELD_NUMBER = 3;
    public static final int MEDIA_INTERVENTIONS_FIELD_NUMBER = 6;
    public static final int MEDIA_REACTION_FIELD_NUMBER = 4;
    public static final int ORIGINAL_TRANSPORT_PAYLOAD_FIELD_NUMBER = 5;
    public static volatile InterfaceC50386MMo PARSER = null;
    public static final int REACTION_FIELD_NUMBER = 1;
    public int bitField0_;
    public int supplementMessageContentCase_ = 0;
    public Object supplementMessageContent_;

    static {
        SupplementMessageContent supplementMessageContent = new SupplementMessageContent();
        DEFAULT_INSTANCE = supplementMessageContent;
        RYn.A0B(supplementMessageContent, SupplementMessageContent.class);
    }

    public final ContentView A0L() {
        if (this.supplementMessageContentCase_ == 2) {
            return (ContentView) this.supplementMessageContent_;
        }
        return ContentView.DEFAULT_INSTANCE;
    }

    public final Integer A0M() {
        switch (this.supplementMessageContentCase_) {
            case 0:
                return C05F.A0u;
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
                return RYn.A08(DEFAULT_INSTANCE, "\u0001\u0006\u0001\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ြ\u0000\u0002ြ\u0000\u0003ြ\u0000\u0004ြ\u0000\u0005ြ\u0000\u0006ြ\u0000", new Object[]{"supplementMessageContent_", "supplementMessageContentCase_", "bitField0_", Reaction.class, ContentView.class, EditText.class, MediaReaction.class, OriginalTransportPayload.class, MediaInterventions.class});
            case 3:
                return new SupplementMessageContent();
            case 4:
                return new C45370K6d();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC50386MMo interfaceC50386MMo2 = PARSER;
                if (interfaceC50386MMo2 == null) {
                    synchronized (SupplementMessageContent.class) {
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
