package X;

import android.graphics.Rect;
import java.util.List;

/* renamed from: X.2ZX, reason: invalid class name */
/* loaded from: classes.dex */
public final class C2ZX extends C2ZY {
    public boolean A01 = false;
    public boolean A02 = false;
    public Rect A00 = null;

    @Override // X.C2ZY
    public final int A00() {
        return 0;
    }

    @Override // X.C2ZY
    public final String A01() {
        return "image";
    }

    @Override // X.C2ZY
    public final void A02(StringBuilder sb) {
        C14360o3.A0B(sb, 0);
        sb.append(this.A01);
    }

    @Override // X.C2ZY
    public final void A03(List list) {
        C14360o3.A0B(list, 0);
        this.A01 = AbstractC001900j.A0b((String) list.get(0));
    }

    @Override // X.C2ZY
    public final boolean A04(C1KR c1kr) {
        C14360o3.A0B(c1kr, 0);
        if (c1kr instanceof C94604Nn) {
            this.A01 = true;
            return true;
        }
        if (c1kr instanceof C3QY) {
            this.A00 = ((C3QY) c1kr).A00;
            return true;
        }
        return false;
    }
}
