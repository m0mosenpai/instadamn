package X;

import java.util.List;

/* renamed from: X.4NM, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C4NM extends C4NK {
    public C4NV A00;
    public C4NV A01;
    public C4NV A02;
    public C117095Rs A03;
    public IF0 A04;
    public C117115Ru A05;
    public C5Ry A06;
    public C5Ry A07;
    public C117135Rw A08;
    public C4NN A09 = new Object();
    public List A0A;
    public List A0B;
    public List A0C;

    public final C102824kJ A00() {
        IF0 if0 = this.A04;
        if (if0 != null) {
            C45127Jxw c45127Jxw = if0.A00;
            C58590PyH c58590PyH = if0.A01;
            if (c58590PyH == null) {
                if (c45127Jxw != null) {
                    c58590PyH = (C58590PyH) c45127Jxw.A00;
                    String str = c45127Jxw.A01;
                    if (c58590PyH == null) {
                        if (str != null) {
                            c58590PyH = (C58590PyH) AbstractC40568Hyo.parseFromJson(C16V.A00(str)).A00;
                            if (c58590PyH == null) {
                                throw new IllegalStateException("Required value was null.");
                            }
                        } else {
                            throw new IllegalStateException("Required value was null.");
                        }
                    }
                    if0.A01 = c58590PyH;
                } else {
                    return null;
                }
            }
            return c58590PyH.A01();
        }
        return null;
    }

    public final void A01() {
        C4NV c4nv = this.A01;
        if (c4nv != null) {
            c4nv.A02 = C05F.A01;
        }
        C4NV c4nv2 = this.A02;
        if (c4nv2 != null) {
            c4nv2.A02 = C05F.A0C;
        }
        C4NV c4nv3 = this.A00;
        if (c4nv3 != null) {
            c4nv3.A02 = C05F.A0N;
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{ ");
        sb.append(getClass().getSimpleName());
        sb.append(" : ");
        sb.append(this.A09);
        sb.append(this.A03);
        sb.append('}');
        return sb.toString();
    }
}
