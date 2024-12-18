package X;

import java.util.List;

/* renamed from: X.MvA, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51806MvA extends C0T6 implements InterfaceC58250Pru {
    public final List A00;
    public final List A01;
    public final List A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C51806MvA) {
                C51806MvA c51806MvA = (C51806MvA) obj;
                if (!C14360o3.A0K(this.A01, c51806MvA.A01) || !C14360o3.A0K(this.A00, c51806MvA.A00) || !C14360o3.A0K(this.A02, c51806MvA.A02)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0I(this.A02, AbstractC166997dE.A0J(this.A00, AbstractC166987dD.A0G(this.A01)));
    }

    public C51806MvA(List list, List list2, List list3) {
        AbstractC167027dH.A13(list, list2, list3);
        this.A01 = list;
        this.A00 = list2;
        this.A02 = list3;
    }
}
