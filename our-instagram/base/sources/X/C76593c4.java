package X;

import java.util.List;

/* renamed from: X.3c4, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C76593c4 extends C0T6 {
    public final int A00;
    public final C38321qM A01;
    public final C75113Zb A02;
    public final List A03;

    public C76593c4(C38321qM c38321qM, C75113Zb c75113Zb, List list, int i) {
        C14360o3.A0B(list, 3);
        this.A01 = c38321qM;
        this.A02 = c75113Zb;
        this.A03 = list;
        this.A00 = i;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C76593c4) {
                C76593c4 c76593c4 = (C76593c4) obj;
                if (!C14360o3.A0K(this.A01, c76593c4.A01) || !C14360o3.A0K(this.A02, c76593c4.A02) || !C14360o3.A0K(this.A03, c76593c4.A03) || this.A00 != c76593c4.A00) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((((this.A01.hashCode() * 31) + this.A02.hashCode()) * 31) + this.A03.hashCode()) * 31) + this.A00;
    }
}
