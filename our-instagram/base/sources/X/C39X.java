package X;

import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.39X, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C39X {
    public boolean A00;
    public final List A01 = new ArrayList();
    public final C13270mD A02;
    public final InterfaceC13280mE A03;

    public final void A00() {
        if (!this.A00 && this.A01.size() < 2) {
            this.A00 = true;
            InterfaceC13280mE interfaceC13280mE = this.A03;
            C13270mD c13270mD = this.A02;
            final InterfaceC13250mB interfaceC13250mB = new InterfaceC13250mB() { // from class: X.39Y
                @Override // X.InterfaceC13250mB
                public final void DLv(ViewGroup viewGroup, View view, int i) {
                    C14360o3.A0B(view, 0);
                    C39X c39x = C39X.this;
                    c39x.A01.add(view);
                    c39x.A00 = false;
                    c39x.A00();
                }
            };
            final C39V c39v = (C39V) interfaceC13280mE;
            C14360o3.A0B(c13270mD, 0);
            c13270mD.A00(new InterfaceC13250mB() { // from class: X.39Z
                @Override // X.InterfaceC13250mB
                public final void DLv(ViewGroup viewGroup, View view, int i) {
                    C14360o3.A0B(view, 0);
                    C39V c39v2 = c39v;
                    C3QT c3qt = new C3QT(view, c39v2.A00, c39v2.A01, c39v2.A02);
                    c3qt.A00();
                    view.setTag(c3qt);
                    interfaceC13250mB.DLv(viewGroup, view, i);
                }
            }, R.layout.row_feed_inline_composer_button_no_viewstub);
        }
    }

    public C39X(C13270mD c13270mD, InterfaceC13280mE interfaceC13280mE) {
        this.A03 = interfaceC13280mE;
        this.A02 = c13270mD;
    }
}
