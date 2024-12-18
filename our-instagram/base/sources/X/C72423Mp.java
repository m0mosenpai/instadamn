package X;

import android.view.View;

/* renamed from: X.3Mp, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C72423Mp extends C0T6 implements InterfaceC41141vN {
    public final View A00;
    public final C38321qM A01;
    public final C75113Zb A02;
    public final boolean A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C72423Mp) {
                C72423Mp c72423Mp = (C72423Mp) obj;
                if (!C14360o3.A0K(this.A01, c72423Mp.A01) || !C14360o3.A0K(this.A02, c72423Mp.A02) || !C14360o3.A0K(this.A00, c72423Mp.A00) || this.A03 != c72423Mp.A03) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode = ((((this.A01.hashCode() * 31) + this.A02.hashCode()) * 31) + this.A00.hashCode()) * 31;
        int i = 1237;
        if (this.A03) {
            i = 1231;
        }
        return hashCode + i;
    }

    public C72423Mp(View view, C38321qM c38321qM, C75113Zb c75113Zb, boolean z) {
        this.A01 = c38321qM;
        this.A02 = c75113Zb;
        this.A00 = view;
        this.A03 = z;
    }
}
