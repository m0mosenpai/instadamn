package X;

import java.util.List;

/* loaded from: classes9.dex */
public abstract class N3P extends C40781ul {
    public C69727VuM A00;
    public C38657Gyy A01;
    public IK0 A02;
    public O5M A03;
    public C69151Vig A04;
    public String A05;
    public String A06;
    public String A07;
    public String A08;
    public List A09 = AbstractC166987dD.A1E();
    public List A0A;
    public boolean A0B;

    public final String Bk6() {
        String str;
        IK0 ik0 = this.A02;
        if (ik0 == null || (str = ik0.A03) == null) {
            return this.A07;
        }
        return str;
    }

    public final boolean CLI() {
        IK0 ik0 = this.A02;
        if (ik0 != null) {
            return ik0.A06;
        }
        return this.A0B;
    }

    public final String getNextMaxId() {
        String str;
        IK0 ik0 = this.A02;
        if (ik0 == null || (str = ik0.A02) == null) {
            return this.A06;
        }
        return str;
    }
}
