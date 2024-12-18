package X;

import android.view.View;
import com.instagram.reels.ui.badge.ReelBrandingBadgeView;

/* renamed from: X.3Ot, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C72933Ot {
    public final View A00;
    public final InterfaceC09390do A01;
    public final InterfaceC09390do A02;
    public final InterfaceC09390do A03;
    public final InterfaceC09390do A04;
    public final InterfaceC09390do A05;
    public final InterfaceC09390do A06;
    public final InterfaceC09390do A07;
    public final InterfaceC09390do A08;
    public final InterfaceC09390do A09;
    public final InterfaceC09390do A0A;
    public final InterfaceC09390do A0B;
    public final InterfaceC09390do A0C;

    public final View A00() {
        C3P2 c3p2 = (C3P2) this.A03.getValue();
        View view = c3p2.A0B;
        C3PN c3pn = c3p2.A09;
        if (c3pn == null || !c3pn.A05 || view == null) {
            view = c3p2.A0L;
        }
        return view;
    }

    public final ReelBrandingBadgeView A01() {
        InterfaceC09390do interfaceC09390do = this.A01;
        if (((InterfaceC56392iX) interfaceC09390do.getValue()).CWW()) {
            return (ReelBrandingBadgeView) ((InterfaceC56392iX) interfaceC09390do.getValue()).getView();
        }
        return null;
    }

    public C72933Ot(View view) {
        this.A00 = view;
        this.A03 = AbstractC09440dt.A01(new C9E7(view, 49));
        this.A02 = AbstractC09440dt.A01(new C9E7(view, 48));
        this.A04 = AbstractC09440dt.A01(new C9EH(view, 0));
        this.A09 = AbstractC09440dt.A01(new C9EH(view, 5));
        this.A05 = AbstractC09440dt.A01(new C9EH(view, 1));
        this.A01 = AbstractC09440dt.A01(new C9E7(view, 47));
        this.A0C = AbstractC09440dt.A01(new C9E7(view, 46));
        this.A08 = AbstractC09440dt.A01(new C9EH(view, 4));
        this.A07 = AbstractC09440dt.A01(new C9EH(view, 3));
        this.A0B = AbstractC09440dt.A01(new C9EH(view, 7));
        this.A0A = AbstractC09440dt.A01(new C9EH(view, 6));
        this.A06 = AbstractC09440dt.A01(new C9EH(view, 2));
    }
}
