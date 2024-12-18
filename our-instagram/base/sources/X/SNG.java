package X;

import java.lang.ref.WeakReference;

/* loaded from: classes10.dex */
public final class SNG {
    public final /* synthetic */ C58887QEx A00;

    public SNG(C58887QEx c58887QEx) {
        this.A00 = c58887QEx;
    }

    public final void A00(String str) {
        SPI spi = this.A00.A01;
        if (spi != null) {
            WeakReference weakReference = spi.A00;
            if (weakReference != null) {
                QF6 qf6 = (QF6) weakReference.get();
                if (qf6 != null) {
                    STG.A00(new RunnableC64677TPi(spi, qf6, str));
                    return;
                }
                return;
            }
            C14360o3.A0F("browserLiteWebView");
            throw C00O.createAndThrow();
        }
    }

    public final void A01(String str, String str2) {
        C58887QEx c58887QEx = this.A00;
        MI9 mi9 = new MI9(c58887QEx, str, str2, 0);
        AnonymousClass195 anonymousClass195 = c58887QEx.A09;
        if (anonymousClass195 != null && anonymousClass195.isActive()) {
            anonymousClass195.CPD(new C50269MHy(str, mi9, 2));
        } else {
            mi9.invoke(str);
        }
    }
}
