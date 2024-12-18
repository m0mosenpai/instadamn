package X;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import com.facebook.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.6S7, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C6S7 implements C6e1 {
    public C41551w4 A00;
    public C141596ac A01;
    public boolean A02;
    public XEX A03;
    public final View A04;
    public final View A05;
    public final C6e8 A06;
    public final C143746eH A07;

    public C6S7(ViewGroup viewGroup, UserSession userSession) {
        C14360o3.A0B(viewGroup, 1);
        this.A05 = viewGroup;
        View requireViewById = viewGroup.requireViewById(R.id.netego_toolbar_buttons_container);
        C14360o3.A07(requireViewById);
        this.A04 = requireViewById;
        View requireViewById2 = viewGroup.requireViewById(R.id.cta_button_container);
        C14360o3.A07(requireViewById2);
        this.A06 = new C6e8(requireViewById2, userSession);
        View requireViewById3 = viewGroup.requireViewById(R.id.cta_shuffle_button_container);
        C14360o3.A07(requireViewById3);
        View requireViewById4 = viewGroup.requireViewById(R.id.cta_shuffle_button_dwell_container);
        C14360o3.A07(requireViewById4);
        this.A07 = new C143746eH((ViewStub) requireViewById3, (ViewStub) requireViewById4, userSession);
    }

    @Override // X.C6e1
    public final XEX AjV() {
        XEX c65724Tsy;
        boolean z = this.A02;
        XEX xex = this.A03;
        if (z) {
            if (!(xex instanceof C6P6)) {
                c65724Tsy = new C6P6(this.A07);
                xex = c65724Tsy;
                this.A03 = xex;
            }
        } else if (!(xex instanceof C65724Tsy)) {
            c65724Tsy = new C65724Tsy(this.A06);
            xex = c65724Tsy;
            this.A03 = xex;
        }
        if (xex != null) {
            xex.EcI(this.A01);
        }
        return xex;
    }
}
