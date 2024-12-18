package com.instagram.direct.request.graphql;

import X.AbstractC166987dD;
import X.AbstractC167017dG;
import X.AbstractC58318PtA;
import X.AbstractC58320PtC;
import X.AbstractC58322PtE;
import X.AbstractC58323PtF;
import X.C2JS;
import X.C2JT;
import X.C4OU;
import X.C94754Oe;
import X.C94894Ou;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.react.modules.dialog.DialogModule;
import com.instagram.react.modules.product.IgReactPurchaseExperienceBridgeModule;

/* loaded from: classes10.dex */
public final class GenAIThreadSummaryQueryResponseImpl extends C2JS implements C2JT {

    /* loaded from: classes10.dex */
    public final class XfbGenaiThreadSummary extends C2JS implements C2JT {

        /* loaded from: classes10.dex */
        public final class Response extends C2JS implements C2JT {

            /* loaded from: classes10.dex */
            public final class InlineXFBGenAIThreadSummaryResultGenericError extends C2JS implements C2JT {

                /* loaded from: classes10.dex */
                public final class Exception extends C2JS implements C2JT {
                    @Override // X.C2JS
                    public final C4OU modelSelectionSet() {
                        return AbstractC167017dG.A0Z(C94894Ou.A00, IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_CODE);
                    }

                    public Exception() {
                        super(1950259270);
                    }
                }

                @Override // X.C2JS
                public final C4OU modelSelectionSet() {
                    return AbstractC58320PtC.A0W(AbstractC166987dD.A0i(C94754Oe.A00, DialogModule.KEY_MESSAGE), Exception.class, "exception", 1950259270);
                }

                public InlineXFBGenAIThreadSummaryResultGenericError() {
                    super(2129197418);
                }
            }

            /* loaded from: classes10.dex */
            public final class InlineXFBGenAIThreadSummaryResultSuccess extends C2JS implements C2JT {
                @Override // X.C2JS
                public final C4OU modelSelectionSet() {
                    return AbstractC167017dG.A0Z(C94754Oe.A00, "summary");
                }

                public InlineXFBGenAIThreadSummaryResultSuccess() {
                    super(1257442347);
                }
            }

            @Override // X.C2JS
            public final C4OU modelSelectionSet() {
                return AbstractC58323PtF.A0Y(AbstractC58318PtA.A0N(AbstractC58318PtA.A0M(InlineXFBGenAIThreadSummaryResultSuccess.class, "InlineXFBGenAIThreadSummaryResultSuccess", 1257442347), "XFBGenAIThreadSummaryResultSuccess"), AbstractC58318PtA.A0M(InlineXFBGenAIThreadSummaryResultGenericError.class, "InlineXFBGenAIThreadSummaryResultGenericError", 2129197418), "XFBGenAIThreadSummaryResultGenericError");
            }

            public Response() {
                super(-1567811636);
            }
        }

        public XfbGenaiThreadSummary() {
            super(323324960);
        }

        @Override // X.C2JS
        public final C4OU modelSelectionSet() {
            return AbstractC58320PtC.A0W(AbstractC58322PtE.A0O(), Response.class, PublicKeyCredentialControllerUtility.JSON_KEY_RESPONSE, -1567811636);
        }
    }

    @Override // X.C2JS
    public final C4OU modelSelectionSet() {
        return AbstractC167017dG.A0b(XfbGenaiThreadSummary.class, "xfb_genai_thread_summary(params:$params)", 323324960);
    }

    public GenAIThreadSummaryQueryResponseImpl() {
        super(335582825);
    }
}
