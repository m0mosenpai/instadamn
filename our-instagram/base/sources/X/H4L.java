package X;

import java.util.List;

/* loaded from: classes7.dex */
public final class H4L extends C0T6 implements JJU {
    public final int A00;
    public final String A01;
    public final List A02;

    @Override // X.JJU
    public final H4L Eww(C1DY c1dy) {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof H4L) {
                H4L h4l = (H4L) obj;
                if (!C14360o3.A0K(this.A02, h4l.A02) || this.A00 != h4l.A00 || !C14360o3.A0K(this.A01, h4l.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC25226BEj.A03(this.A01, (AbstractC166987dD.A0G(this.A02) + this.A00) * 31);
    }

    public H4L(List list, int i, String str) {
        AbstractC167017dG.A1Q(list, str);
        this.A02 = list;
        this.A00 = i;
        this.A01 = str;
    }

    @Override // X.JJU
    public final JJU E9M(C1DY c1dy) {
        return this;
    }
}
