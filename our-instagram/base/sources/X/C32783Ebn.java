package X;

/* renamed from: X.Ebn, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32783Ebn extends F2V implements InterfaceC37091GWa {
    public final Integer A00;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C32783Ebn) {
                C32783Ebn c32783Ebn = (C32783Ebn) obj;
                if (!"".equals("") || this.A00 != c32783Ebn.A00) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return F2U.A00(this.A00);
    }

    public C32783Ebn(Integer num) {
        this.A00 = num;
    }

    public C32783Ebn() {
        this(C05F.A01);
    }
}
