package X;

import java.io.Serializable;
import java.util.List;

/* renamed from: X.Mxf, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51958Mxf extends C0T6 implements Serializable {
    public final C51959Mxg A00;
    public final List A01;

    public C51958Mxf(C51959Mxg c51959Mxg, List list) {
        C14360o3.A0B(list, 1);
        this.A01 = list;
        this.A00 = c51959Mxg;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C51958Mxf) {
                C51958Mxf c51958Mxf = (C51958Mxf) obj;
                if (!C14360o3.A0K(this.A01, c51958Mxf.A01) || !C14360o3.A0K(this.A00, c51958Mxf.A00)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0I(this.A00, AbstractC166987dD.A0G(this.A01));
    }
}
