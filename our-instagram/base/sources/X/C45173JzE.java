package X;

import android.content.Intent;

/* renamed from: X.JzE, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45173JzE extends C0T6 implements InterfaceC50396MMy {
    public final int A00;
    public final long A01;
    public final Object A02;
    public final Object A03;
    public final String A04;
    public final String A05;

    public C45173JzE(Intent intent, C2Fb c2Fb, String str, String str2, int i, long j) {
        this.A00 = i;
        AbstractC37302Gc3.A1U(c2Fb, str2);
        this.A02 = intent;
        this.A05 = str;
        this.A03 = c2Fb;
        this.A04 = str2;
        this.A01 = j;
    }

    public final boolean equals(Object obj) {
        int i;
        switch (this.A00) {
            case 0:
                if (this != obj) {
                    i = 0;
                    break;
                } else {
                    return true;
                }
            case 1:
                if (this != obj) {
                    i = 1;
                    break;
                } else {
                    return true;
                }
            default:
                if (this != obj) {
                    i = 2;
                    break;
                } else {
                    return true;
                }
        }
        if (obj instanceof C45173JzE) {
            C45173JzE c45173JzE = (C45173JzE) obj;
            if (c45173JzE.A00 != i || !C14360o3.A0K(this.A02, c45173JzE.A02) || !C14360o3.A0K(this.A05, c45173JzE.A05) || this.A03 != c45173JzE.A03 || !C14360o3.A0K(this.A04, c45173JzE.A04) || this.A01 != c45173JzE.A01) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return AbstractC166997dE.A0K(this.A04, AbstractC166997dE.A0J(this.A03, AbstractC166997dE.A0K(this.A05, AbstractC166987dD.A0G(this.A02)))) + AbstractC25228BEl.A03(this.A01);
    }
}
