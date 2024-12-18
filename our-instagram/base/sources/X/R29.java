package X;

/* loaded from: classes10.dex */
public final class R29 extends SP6 {
    public C19U A00;
    public String A01;
    public final C19U A02;

    public final C19U A03() {
        return this.A00;
    }

    public final C19U A04() {
        return this.A02;
    }

    public final String A05() {
        return this.A01;
    }

    public final boolean A06() {
        Integer num = super.A01;
        if (num != C05F.A1F && num != C05F.A0j && num != C05F.A0u) {
            return false;
        }
        return true;
    }

    public R29(C19U c19u, String str, String str2) {
        super(str);
        this.A02 = c19u;
        this.A01 = str2;
    }

    public final String toString() {
        String obj;
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("{src_pkg=");
        A1C.append(super.A02);
        A1C.append(", phone_id=");
        C19U c19u = this.A00;
        String str = null;
        if (c19u == null) {
            obj = null;
        } else {
            obj = c19u.toString();
        }
        A1C.append(obj);
        A1C.append(", status=");
        A1C.append(A02());
        A1C.append(MSV.A00(37));
        A1C.append(A00());
        A1C.append(", prev_phone_id=");
        C19U c19u2 = this.A02;
        if (c19u2 != null) {
            str = c19u2.toString();
        }
        A1C.append(str);
        A1C.append(", sync_medium=");
        return AbstractC50523MSb.A0W(this.A01, A1C);
    }
}
