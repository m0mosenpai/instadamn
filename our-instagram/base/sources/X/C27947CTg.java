package X;

import androidx.activity.ComponentActivity;

/* renamed from: X.CTg, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27947CTg {
    public final int A00;
    public final OJB A01;

    public C27947CTg(OJB ojb, int i) {
        C14360o3.A0B(ojb, 2);
        this.A00 = i;
        this.A01 = ojb;
    }

    public final void A00() {
        OJB ojb = this.A01;
        ComponentActivity componentActivity = ojb.A03;
        String str = ojb.A04;
        if (CXC.A00(componentActivity, str) != 0) {
            C00X c00x = ojb.A01;
            if (c00x != null) {
                c00x.A02(str);
                return;
            }
            throw AbstractC166987dD.A14("Launcher has not been initialized");
        }
    }
}
