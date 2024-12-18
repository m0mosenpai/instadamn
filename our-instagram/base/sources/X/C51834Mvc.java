package X;

import java.util.List;

/* renamed from: X.Mvc, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51834Mvc extends C0T6 implements MNC {
    public final C166087bc A00;
    public final C166047bW A01;
    public final MND A02;
    public final List A03;
    public final List A04;

    public C51834Mvc(C166087bc c166087bc, C166047bW c166047bW, MND mnd, List list, List list2) {
        C14360o3.A0B(mnd, 2);
        this.A03 = list;
        this.A02 = mnd;
        this.A04 = list2;
        this.A00 = c166087bc;
        this.A01 = c166047bW;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C51834Mvc) {
                C51834Mvc c51834Mvc = (C51834Mvc) obj;
                if (!C14360o3.A0K(this.A03, c51834Mvc.A03) || !C14360o3.A0K(this.A02, c51834Mvc.A02) || !C14360o3.A0K(this.A04, c51834Mvc.A04) || !C14360o3.A0K(this.A00, c51834Mvc.A00) || !C14360o3.A0K(this.A01, c51834Mvc.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166997dE.A0J(this.A00, AbstractC166997dE.A0J(this.A04, AbstractC166997dE.A0J(this.A02, AbstractC166987dD.A0G(this.A03)))) + AbstractC167017dG.A0M(this.A01);
    }
}
