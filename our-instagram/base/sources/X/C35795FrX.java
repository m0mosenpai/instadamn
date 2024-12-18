package X;

import java.lang.ref.WeakReference;

/* renamed from: X.FrX, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C35795FrX implements C0L2 {
    public final C105574pU A02;
    public String A00 = null;
    public boolean A01 = true;
    public final java.util.Set A03 = AbstractC166987dD.A1H();

    @Override // X.C0L2
    public final void DDi(String str, String str2, WeakReference weakReference) {
        boolean add = this.A03.add(str2);
        if (!this.A01) {
            C105574pU c105574pU = this.A02;
            c105574pU.A02("next_module", str2);
            c105574pU.A01();
        }
        this.A01 = false;
        C105574pU c105574pU2 = this.A02;
        c105574pU2.A03(str2, weakReference, add);
        String str3 = this.A00;
        if (str3 == null) {
            str3 = "";
        }
        c105574pU2.A02("previous_module", str3);
        c105574pU2.A02("current_module", str);
        this.A00 = str;
    }

    public C35795FrX(C105574pU c105574pU) {
        this.A02 = c105574pU;
    }
}
