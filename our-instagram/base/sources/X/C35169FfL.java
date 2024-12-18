package X;

/* renamed from: X.FfL, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C35169FfL {
    public final Object A00;

    public C35169FfL(C32057E6j c32057E6j) {
        C14360o3.A0B(c32057E6j, 1);
        this.A00 = c32057E6j;
    }

    public final int A00() {
        C38321qM c38321qM;
        Integer BR9;
        Object obj = this.A00;
        if (obj instanceof C34647FOe) {
            return ((C34647FOe) obj).A00;
        }
        if (!(obj instanceof FRM) || (c38321qM = ((FRM) obj).A02) == null || (BR9 = c38321qM.A0C.BR9()) == null) {
            return 0;
        }
        return BR9.intValue();
    }

    public final long A01() {
        Object obj = this.A00;
        if (obj instanceof C34647FOe) {
            return ((C34647FOe) obj).A01;
        }
        if (obj instanceof FRM) {
            return ((FRM) obj).A00;
        }
        if (obj instanceof C32057E6j) {
            return ((C32057E6j) obj).A02 * 1000;
        }
        throw AbstractC31179DnN.A0W(obj);
    }

    public final C38321qM A02() {
        Object obj = this.A00;
        if (obj instanceof C34647FOe) {
            return ((C34647FOe) obj).A03;
        }
        if (obj instanceof FRM) {
            return ((FRM) obj).A02;
        }
        if (obj instanceof C32057E6j) {
            return null;
        }
        throw AbstractC31179DnN.A0W(obj);
    }

    public final Boolean A03() {
        Object obj = this.A00;
        if (obj instanceof C34647FOe) {
            return ((C34647FOe) obj).A04;
        }
        if (obj instanceof FRM) {
            return ((FRM) obj).A03;
        }
        if (obj instanceof C32057E6j) {
            return AbstractC166997dE.A0a();
        }
        throw AbstractC31179DnN.A0W(obj);
    }

    public final String A04() {
        Object obj = this.A00;
        if (obj instanceof C34647FOe) {
            return ((C34647FOe) obj).A07;
        }
        if (obj instanceof FRM) {
            return ((FRM) obj).A07;
        }
        if (obj instanceof C32057E6j) {
            return ((C32057E6j) obj).A09;
        }
        throw AbstractC31179DnN.A0W(obj);
    }

    public final String A05() {
        Object obj = this.A00;
        if (obj instanceof C34647FOe) {
            return ((C34647FOe) obj).A08;
        }
        if (obj instanceof FRM) {
            return ((FRM) obj).A08;
        }
        if (obj instanceof C32057E6j) {
            return ((C32057E6j) obj).A08;
        }
        throw AbstractC31179DnN.A0W(obj);
    }

    public final String A06() {
        Object obj = this.A00;
        if (obj instanceof C34647FOe) {
            return ((C34647FOe) obj).A09;
        }
        if (obj instanceof FRM) {
            return ((FRM) obj).A0A;
        }
        if (obj instanceof C32057E6j) {
            C32057E6j c32057E6j = (C32057E6j) obj;
            C14360o3.A0B(c32057E6j, 0);
            return LHB.A00(c32057E6j.A07, null, c32057E6j.A01).toString();
        }
        throw AbstractC31179DnN.A0W(obj);
    }

    public final String A07() {
        Object obj = this.A00;
        if (obj instanceof C34647FOe) {
            return ((C34647FOe) obj).A0A;
        }
        if (obj instanceof FRM) {
            return ((FRM) obj).A09;
        }
        if (obj instanceof C32057E6j) {
            return ((C32057E6j) obj).A0B;
        }
        throw AbstractC31179DnN.A0W(obj);
    }

    public final boolean A08() {
        Object obj = this.A00;
        if (obj instanceof C34647FOe) {
            return ((C34647FOe) obj).A0G;
        }
        if (obj instanceof FRM) {
            return ((FRM) obj).A0B;
        }
        if (obj instanceof C32057E6j) {
            return false;
        }
        throw AbstractC31179DnN.A0W(obj);
    }

    public final boolean A09() {
        Object obj = this.A00;
        if (obj instanceof C34647FOe) {
            return ((C34647FOe) obj).A0I;
        }
        if ((obj instanceof FRM) && !AbstractC166997dE.A1Z(((FRM) obj).A03, true)) {
            return true;
        }
        return false;
    }

    public C35169FfL(FRM frm) {
        C14360o3.A0B(frm, 1);
        this.A00 = frm;
    }

    public C35169FfL(C34647FOe c34647FOe) {
        this.A00 = c34647FOe;
    }
}
