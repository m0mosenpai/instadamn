package com.instagram.realtimeclient.regionhint.graphql;

import X.AbstractC167017dG;
import X.C14360o3;
import X.C2JS;
import X.C4OO;
import X.C4OU;
import X.C94754Oe;
import com.facebookpay.offsite.models.message.ServerW3CShippingAddressConstants;
import com.instagram.realtimeclient.regionhint.graphql.IGRealtimeRegionHintQueryResponse;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes11.dex */
public final class IGRealtimeRegionHintQueryResponseImpl extends C2JS implements IGRealtimeRegionHintQueryResponse {
    public static final Companion Companion = new Object();
    public static final int TYPE_TAG = 631560198;

    /* loaded from: classes11.dex */
    public final class Companion {
        public static /* synthetic */ void getTYPE_TAG$annotations() {
        }

        public final int getTYPE_TAG() {
            return IGRealtimeRegionHintQueryResponseImpl.TYPE_TAG;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }

        public Companion() {
        }
    }

    /* loaded from: classes11.dex */
    public final class XdtIgdMsgRegion extends C2JS implements IGRealtimeRegionHintQueryResponse.XdtIgdMsgRegion {
        public static final Companion Companion = new Object();
        public static final int TYPE_TAG = 922056036;

        /* loaded from: classes11.dex */
        public final class Companion {
            public static /* synthetic */ void getTYPE_TAG$annotations() {
            }

            public final int getTYPE_TAG() {
                return XdtIgdMsgRegion.TYPE_TAG;
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            }

            public Companion() {
            }
        }

        public static final int getTYPE_TAG() {
            return TYPE_TAG;
        }

        @Override // com.instagram.realtimeclient.regionhint.graphql.IGRealtimeRegionHintQueryResponse.XdtIgdMsgRegion
        public String getRegion() {
            return A07(ServerW3CShippingAddressConstants.REGION);
        }

        @Override // X.C2JS
        public C4OU modelSelectionSet() {
            return AbstractC167017dG.A0Z(C94754Oe.A00, ServerW3CShippingAddressConstants.REGION);
        }

        public XdtIgdMsgRegion(int i) {
            super(i);
        }

        public XdtIgdMsgRegion() {
            super(TYPE_TAG);
        }
    }

    public static final int getTYPE_TAG() {
        return TYPE_TAG;
    }

    @Override // com.instagram.realtimeclient.regionhint.graphql.IGRealtimeRegionHintQueryResponse
    public IGRealtimeRegionHintQueryResponse.XdtIgdMsgRegion getXdtIgdMsgRegion() {
        C2JS A05 = A05(XdtIgdMsgRegion.class, "xdt_igd_msg_region", XdtIgdMsgRegion.TYPE_TAG);
        C14360o3.A0C(A05, "null cannot be cast to non-null type com.instagram.realtimeclient.regionhint.graphql.IGRealtimeRegionHintQueryResponseImpl.XdtIgdMsgRegion");
        return (XdtIgdMsgRegion) A05;
    }

    @Override // X.C2JS
    public C4OU modelSelectionSet() {
        return AbstractC167017dG.A0W(C4OO.A01(), XdtIgdMsgRegion.class, "xdt_igd_msg_region", XdtIgdMsgRegion.TYPE_TAG);
    }

    public IGRealtimeRegionHintQueryResponseImpl(int i) {
        super(i);
    }

    public IGRealtimeRegionHintQueryResponseImpl() {
        super(TYPE_TAG);
    }
}
