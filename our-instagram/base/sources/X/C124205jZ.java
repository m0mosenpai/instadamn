package X;

import com.facebook.mobileconfig.factory.MobileConfigUpdateConfigsCallback;

/* renamed from: X.5jZ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C124205jZ implements MobileConfigUpdateConfigsCallback {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C1AB A01;
    public final /* synthetic */ boolean A02;

    public C124205jZ(C1AB c1ab, int i, boolean z) {
        this.A01 = c1ab;
        this.A02 = z;
        this.A00 = i;
    }

    @Override // com.facebook.mobileconfig.factory.MobileConfigUpdateConfigsCallback
    public final void onNetworkComplete(boolean z) {
        if (z) {
            this.A01.A00.A0D();
            return;
        }
        boolean z2 = this.A02;
        if (!z2) {
            return;
        }
        C1AB c1ab = this.A01;
        int i = this.A00 + 1;
        if (i >= 3) {
            C0K8.A0P("MobileConfigFunctions", "fetchNames failed after max retry:%d. forceFetch:%s", Integer.valueOf(i), Boolean.valueOf(z2));
        } else {
            c1ab.A00.A0A().fetchNames(z2, new C124205jZ(c1ab, i, z2));
        }
    }
}
