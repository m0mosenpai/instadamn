package X;

import com.instagram.api.schemas.ClipsRSAMidCardSubType;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public final class HSY extends C17T implements JJY {
    public List A00;

    @Override // X.JJY
    public final JJY E9k(C1DY c1dy) {
        List A0m = AbstractC37304Gc5.A0m(this, this.A00);
        ArrayList A0q = AbstractC167017dG.A0q(A0m);
        Iterator it = A0m.iterator();
        while (it.hasNext()) {
            AbstractC37304Gc5.A1G(c1dy, A0q, it);
        }
        this.A00 = A0q;
        return this;
    }

    @Override // X.JJY
    public final C26143BhU Ez0(C1DY c1dy) {
        String A0h = A0h(1253013930);
        List A0m = AbstractC37304Gc5.A0m(this, this.A00);
        ArrayList A0q = AbstractC167017dG.A0q(A0m);
        Iterator it = A0m.iterator();
        while (it.hasNext()) {
            AbstractC37304Gc5.A1C(c1dy, A0q, it);
        }
        return new C26143BhU((ClipsRSAMidCardSubType) A0N(-1130231758, C43266JAl.A00), A0h, A0h(-1773366604), A0q, getBooleanValueByHashCode(377820934));
    }
}
