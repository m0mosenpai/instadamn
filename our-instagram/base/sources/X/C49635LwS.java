package X;

import android.view.View;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import com.facebook.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.LwS, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C49635LwS implements MR9 {
    public C47809L9r A00;
    public final UserSession A01;
    public final /* synthetic */ KKH A02;

    @Override // X.MR9
    public final void ElO(View view) {
        C14360o3.A0B(view, 0);
        FrameLayout frameLayout = this.A02.A04;
        frameLayout.removeAllViews();
        view.setImportantForAccessibility(1);
        frameLayout.addView(view);
        A00();
    }

    public C49635LwS(UserSession userSession, KKH kkh) {
        this.A02 = kkh;
        this.A01 = userSession;
    }

    private final void A00() {
        KKH kkh = this.A02;
        AbstractC125325le A0o = AbstractC43592JPx.A0o(kkh.A04, 0);
        A0o.A04 = 0;
        AbstractC125325le A0E = A0o.A0E(KKH.A06);
        A0E.A0T(kkh.A05.getBottom(), kkh.getResources().getDimension(R.dimen.asset_picker_redesign_sticker_height));
        C44065Jdq.A00(A0E, kkh, 21);
    }

    @Override // X.MR9
    public final void CMp() {
        KKH kkh = this.A02;
        AbstractC125325le A0n = AbstractC43592JPx.A0n(kkh.A04);
        A0n.A03 = 8;
        AbstractC125325le A0E = A0n.A0E(KKH.A06);
        A0E.A0K(kkh.A05.getBottom());
        C44065Jdq.A00(A0E, kkh, 20);
    }

    @Override // X.MR9
    public final boolean onBackPressed() {
        C47958LGu c47958LGu;
        C47809L9r c47809L9r = this.A00;
        if (c47809L9r == null) {
            return false;
        }
        KNU knu = c47809L9r.A01;
        if ((knu != null && knu.onBackPressed()) || (c47958LGu = this.A02.A01) == null) {
            return false;
        }
        return c47958LGu.A06();
    }

    @Override // X.MR9
    public final void CMJ() {
        CMp();
        this.A00 = null;
    }

    @Override // X.MR9
    public final void EkK() {
        A00();
        C47539Kz7 c47539Kz7 = new C47539Kz7(true, true);
        KKH kkh = this.A02;
        C47809L9r c47809L9r = new C47809L9r(AbstractC166997dE.A0L(kkh), this.A01, c47539Kz7);
        this.A00 = c47809L9r;
        Fragment fragment = kkh.A00;
        if (fragment != null) {
            FrameLayout frameLayout = kkh.A04;
            AbstractC10360h2 childFragmentManager = fragment.getChildFragmentManager();
            C14360o3.A07(childFragmentManager);
            c47809L9r.A00(frameLayout, childFragmentManager, new C48600Lec(kkh, 3));
        }
    }
}
