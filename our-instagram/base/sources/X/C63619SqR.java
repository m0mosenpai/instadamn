package X;

import android.os.Bundle;

/* renamed from: X.SqR, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63619SqR implements InterfaceC58362lv {
    public final /* synthetic */ Bundle A00;
    public final /* synthetic */ C2GT A01;
    public final /* synthetic */ C58770Q8c A02;
    public final /* synthetic */ C63152Se0 A03;
    public final /* synthetic */ String A04;

    public C63619SqR(Bundle bundle, C2GT c2gt, C58770Q8c c58770Q8c, C63152Se0 c63152Se0, String str) {
        this.A02 = c58770Q8c;
        this.A01 = c2gt;
        this.A04 = str;
        this.A03 = c63152Se0;
        this.A00 = bundle;
    }

    @Override // X.InterfaceC58362lv
    public final /* bridge */ /* synthetic */ void onChanged(Object obj) {
        C63406Sjd c63406Sjd = (C63406Sjd) obj;
        Throwable th = c63406Sjd.A02;
        if (th instanceof C64864TXp) {
            int i = ((C64864TXp) th).A00;
            if (i != 7 && i != 9 && i != 13) {
                if (i == 104) {
                    return;
                }
            } else {
                C58770Q8c c58770Q8c = this.A02;
                c58770Q8c.A03.A0D(this.A01);
                C63167SeR c63167SeR = (C63167SeR) c58770Q8c.A05.A02();
                if (c63167SeR != null) {
                    ((SO8) c63167SeR.A01).A00();
                }
                c58770Q8c.A02(this.A00, this.A04, this.A03.A06);
                return;
            }
        }
        this.A02.A03.A0A(C63406Sjd.A02(c63406Sjd, Boolean.valueOf(C63406Sjd.A0J(c63406Sjd))));
    }
}
