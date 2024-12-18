package X;

import java.util.List;

/* renamed from: X.Mug, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51776Mug extends C0T6 implements InterfaceC58215PrL {
    public final Boolean A00;
    public final List A01;
    public final List A02;
    public final List A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C51776Mug) {
                C51776Mug c51776Mug = (C51776Mug) obj;
                if (!C14360o3.A0K(this.A01, c51776Mug.A01) || !C14360o3.A0K(this.A02, c51776Mug.A02) || !C14360o3.A0K(this.A03, c51776Mug.A03) || !C14360o3.A0K(this.A00, c51776Mug.A00)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166997dE.A0J(this.A03, AbstractC166997dE.A0J(this.A02, AbstractC166987dD.A0G(this.A01))) + AbstractC167017dG.A0M(this.A00);
    }

    public C51776Mug(Boolean bool, List list, List list2, List list3) {
        AbstractC167027dH.A13(list, list2, list3);
        this.A01 = list;
        this.A02 = list2;
        this.A03 = list3;
        this.A00 = bool;
    }
}
