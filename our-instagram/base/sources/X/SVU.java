package X;

import com.facebook.rti.push.service.FbnsServiceDelegate;

/* loaded from: classes10.dex */
public final class SVU {
    public final /* synthetic */ FbnsServiceDelegate A00;

    public SVU(FbnsServiceDelegate fbnsServiceDelegate) {
        this.A00 = fbnsServiceDelegate;
    }

    public static void A00(SVU svu) {
        FbnsServiceDelegate fbnsServiceDelegate = FbnsServiceDelegate.A0E;
        FbnsServiceDelegate fbnsServiceDelegate2 = svu.A00;
        fbnsServiceDelegate2.A0B.Aew();
        C4N0 c4n0 = fbnsServiceDelegate2.A0C.A02;
        if (c4n0 != null) {
            c4n0.A02();
        } else {
            C0K8.A0D(C62912SWt.A04, "connectionConfigManager is null. Cannot notify about keepalive config change");
        }
    }
}
