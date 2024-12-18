package X;

import java.util.List;

/* renamed from: X.U0k, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C66127U0k extends C0T6 implements XFJ {
    public final C66125U0i A00;
    public final List A01;
    public final List A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C66127U0k) {
                C66127U0k c66127U0k = (C66127U0k) obj;
                if (!C14360o3.A0K(this.A01, c66127U0k.A01) || !C14360o3.A0K(this.A02, c66127U0k.A02) || !C14360o3.A0K(this.A00, c66127U0k.A00)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166997dE.A0J(this.A02, this.A01.hashCode() * 31) + this.A00.hashCode();
    }

    public C66127U0k(C66125U0i c66125U0i, List list, List list2) {
        AbstractC167027dH.A13(list, list2, c66125U0i);
        this.A01 = list;
        this.A02 = list2;
        this.A00 = c66125U0i;
    }
}
