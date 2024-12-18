package X;

/* renamed from: X.3wI, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC88103wI {
    public final String A00;

    public AbstractC88103wI(String str) {
        C14360o3.A0B(str, 1);
        this.A00 = str;
    }

    public final int A00() {
        if (this instanceof C103664lk) {
            return 3;
        }
        if (this instanceof C100364ey) {
            return 1;
        }
        if (this instanceof C103674ll) {
            return 4;
        }
        return 2;
    }

    public final void A01(StringBuilder sb) {
        String str;
        if (this instanceof C103664lk) {
            C103664lk c103664lk = (C103664lk) this;
            sb.append(c103664lk.A00);
            sb.append("|");
            sb.append(c103664lk.A03);
            sb.append("|");
            sb.append(c103664lk.A01);
            sb.append("|");
            sb.append(c103664lk.A02);
            sb.append("|");
            str = c103664lk.A04;
        } else if (this instanceof C100364ey) {
            C100364ey c100364ey = (C100364ey) this;
            sb.append(c100364ey.A02);
            sb.append("|");
            sb.append(c100364ey.A00);
            sb.append("|");
            str = c100364ey.A01;
        } else if (this instanceof C103674ll) {
            str = ((C103674ll) this).A00;
        } else {
            C103654lj c103654lj = (C103654lj) this;
            sb.append(c103654lj.A01);
            sb.append("|");
            C117275Sm c117275Sm = c103654lj.A00;
            sb.append(c117275Sm.A01);
            sb.append("|");
            sb.append(c117275Sm.A00);
            sb.append("|");
            sb.append(c117275Sm.A02);
            sb.append("|");
            str = c117275Sm.A03;
        }
        sb.append(str);
    }

    public String toString() {
        return this.A00;
    }
}
