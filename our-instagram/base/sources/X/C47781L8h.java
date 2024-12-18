package X;

import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgSimpleImageView;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.L8h, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C47781L8h {
    public final UserSession A00;
    public final C47678L3l A01;

    public final void A01(InterfaceC50403MNf interfaceC50403MNf, List list) {
        C47678L3l c47678L3l = this.A01;
        c47678L3l.A00 = interfaceC50403MNf;
        ViewGroup viewGroup = c47678L3l.A02;
        viewGroup.removeAllViews();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            InterfaceC50403MNf interfaceC50403MNf2 = (InterfaceC50403MNf) it.next();
            L0P l0p = new L0P(c47678L3l.A01, new LOz(8, interfaceC50403MNf2, c47678L3l), viewGroup, interfaceC50403MNf2);
            IgSimpleImageView igSimpleImageView = l0p.A00;
            viewGroup.addView(igSimpleImageView);
            c47678L3l.A04.add(l0p);
            igSimpleImageView.setSelected(AbstractC167007dF.A1X(l0p.A01, c47678L3l.A00));
        }
    }

    public C47781L8h(ViewGroup viewGroup, UserSession userSession, MPH mph) {
        AbstractC167017dG.A1P(userSession, viewGroup);
        this.A00 = userSession;
        this.A01 = new C47678L3l(viewGroup, mph);
    }

    public final Fragment A00(AbstractC10360h2 abstractC10360h2, MSU msu) {
        AbstractC167017dG.A1N(abstractC10360h2, msu);
        C49639LwW c49639LwW = (C49639LwW) msu;
        String str = c49639LwW.A02;
        Fragment A0Q = abstractC10360h2.A0Q(str);
        if (A0Q == null) {
            A0Q = (Fragment) c49639LwW.A03.get();
        }
        C14240no c14240no = new C14240no(abstractC10360h2);
        for (Fragment fragment : abstractC10360h2.A0U.A04()) {
            if (fragment != null && fragment.mFragmentId == R.id.fragment_tab_container) {
                c14240no.A0M(fragment);
            }
        }
        if (A0Q.isAdded()) {
            c14240no.A0N(A0Q);
        } else {
            c14240no.A0C(A0Q, str, R.id.fragment_tab_container);
        }
        c14240no.A0K();
        return A0Q;
    }
}
