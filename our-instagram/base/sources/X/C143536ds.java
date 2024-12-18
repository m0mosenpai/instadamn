package X;

import android.content.Context;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

/* renamed from: X.6ds, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C143536ds extends AbstractC149546o6 {
    public boolean A00;
    public final UserSession A01;
    public final InterfaceC1119153d A02 = new InterfaceC1119153d() { // from class: X.6Z5
        @Override // X.InterfaceC1119153d
        public final void D00() {
        }

        @Override // X.InterfaceC1119153d
        public final void Czx() {
            C143536ds c143536ds = C143536ds.this;
            c143536ds.A00 = false;
            C145726hV c145726hV = ((AbstractC149546o6) c143536ds).A01;
            if (c145726hV != null) {
                c145726hV.A00();
            }
        }
    };

    public static C189448aO A00(Fragment fragment, C143536ds c143536ds) {
        C18C.A0G(fragment instanceof JPX, "Fragment must be an instance of ReelContextSheetHost");
        C189448aO c189448aO = new C189448aO(c143536ds.A01);
        c189448aO.A0U = c143536ds.A02;
        return c189448aO;
    }

    public static void A02(FragmentActivity fragmentActivity, C41551w4 c41551w4, C143536ds c143536ds) {
        C41181vS AuU;
        C38321qM c38321qM;
        C146016hy c146016hy = ((AbstractC149546o6) c143536ds).A00;
        if (c146016hy != null && (AuU = c146016hy.A04.AuU()) != null && (c38321qM = AuU.A0b) != null) {
            C1XJ.A00.A0u(fragmentActivity, c143536ds.A01, c38321qM, ((AbstractC149546o6) c143536ds).A00.A02, c41551w4, c143536ds.A02);
            c143536ds.A00 = true;
            C145726hV c145726hV = ((AbstractC149546o6) c143536ds).A01;
            if (c145726hV != null) {
                c145726hV.A01();
            }
        }
    }

    public C143536ds(UserSession userSession) {
        this.A01 = userSession;
    }

    public static void A01(Context context, Fragment fragment, C143536ds c143536ds) {
        A00(fragment, c143536ds).A00().A03(context, fragment);
        c143536ds.A00 = true;
        C145726hV c145726hV = ((AbstractC149546o6) c143536ds).A01;
        if (c145726hV != null) {
            c145726hV.A01();
        }
    }
}
