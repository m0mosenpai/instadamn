package X;

import com.instagram.api.schemas.TemplateTopic;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public final class HUz extends C17T implements InterfaceC43494JJg {
    public List A00;

    @Override // X.InterfaceC43494JJg
    public final InterfaceC43494JJg EB0(C1DY c1dy) {
        List A0m = AbstractC37304Gc5.A0m(this, this.A00);
        ArrayList A0q = AbstractC167017dG.A0q(A0m);
        Iterator it = A0m.iterator();
        while (it.hasNext()) {
            AbstractC37304Gc5.A1G(c1dy, A0q, it);
        }
        this.A00 = A0q;
        return this;
    }

    @Override // X.InterfaceC43494JJg
    public final C38786H6b F2q(C1DY c1dy) {
        String A0h = A0h(1253013930);
        TemplateTopic templateTopic = (TemplateTopic) A0M(50511102, C43305JBy.A00);
        List A0m = AbstractC37304Gc5.A0m(this, this.A00);
        ArrayList A0q = AbstractC167017dG.A0q(A0m);
        Iterator it = A0m.iterator();
        while (it.hasNext()) {
            AbstractC37304Gc5.A1C(c1dy, A0q, it);
        }
        return new C38786H6b(templateTopic, A0h, A0i(-1867567750), A0h(-1773366604), A0q);
    }
}
