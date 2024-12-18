package X;

import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;

/* renamed from: X.LwU, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C49637LwU implements MR9 {
    public final /* synthetic */ KCX A00;

    @Override // X.MR9
    public final void ElO(View view) {
        C14360o3.A0B(view, 0);
        KCX kcx = this.A00;
        ViewGroup viewGroup = kcx.A06;
        if (viewGroup != null) {
            viewGroup.removeAllViews();
        }
        view.setImportantForAccessibility(1);
        ViewGroup viewGroup2 = kcx.A06;
        if (viewGroup2 != null) {
            viewGroup2.addView(view);
        }
        A01();
    }

    public C49637LwU(KCX kcx) {
        this.A00 = kcx;
    }

    private final void A00() {
        float f;
        KCX kcx = this.A00;
        ViewGroup viewGroup = kcx.A06;
        if (viewGroup != null) {
            C55942hf c55942hf = C150956qv.A02;
            AbstractC125325le A0n = AbstractC43592JPx.A0n(viewGroup);
            A0n.A03 = 8;
            AbstractC125325le A0E = A0n.A0E(KCX.A0V);
            View view = kcx.A03;
            if (view != null) {
                f = view.getBottom();
            } else {
                f = 0.0f;
            }
            A0E.A0K(f);
            C44065Jdq.A00(A0E, kcx, 18);
            return;
        }
        throw AbstractC166997dE.A0g();
    }

    private final void A01() {
        float f;
        KCX kcx = this.A00;
        ViewGroup viewGroup = kcx.A06;
        if (viewGroup != null) {
            C55942hf c55942hf = C150956qv.A02;
            AbstractC125325le A0o = AbstractC43592JPx.A0o(viewGroup, 0);
            A0o.A04 = 0;
            AbstractC125325le A0E = A0o.A0E(KCX.A0V);
            View view = kcx.A03;
            if (view != null) {
                f = view.getBottom();
            } else {
                f = 0.0f;
            }
            View view2 = kcx.A04;
            C14360o3.A0A(view2);
            A0E.A0T(f, view2.getY() + AbstractC166997dE.A0N(kcx).getDimension(R.dimen.asset_picker_redesign_sticker_height));
            C44065Jdq.A00(A0E, kcx, 19);
            return;
        }
        throw AbstractC166997dE.A0g();
    }

    @Override // X.MR9
    public final boolean onBackPressed() {
        KCT A01;
        KCX kcx = this.A00;
        C47809L9r c47809L9r = kcx.A08;
        if (c47809L9r != null) {
            KNU knu = c47809L9r.A01;
            if ((knu == null || !knu.onBackPressed()) && (A01 = KCX.A01(kcx)) != null) {
                return A01.onBackPressed();
            }
            return false;
        }
        return false;
    }

    @Override // X.MR9
    public final void CMJ() {
        A00();
        this.A00.A08 = null;
    }

    @Override // X.MR9
    public final void CMp() {
        A00();
    }

    @Override // X.MR9
    public final void EkK() {
        A01();
        KCX kcx = this.A00;
        InterfaceC09390do interfaceC09390do = kcx.A0R;
        C47539Kz7 c47539Kz7 = new C47539Kz7(C18U.A06(C06090Tz.A05, AbstractC166987dD.A0o(interfaceC09390do), 36316645727343164L), false);
        ViewGroup viewGroup = kcx.A06;
        if (viewGroup != null) {
            kcx.A08 = new C47809L9r(AbstractC166997dE.A0L(viewGroup), AbstractC166987dD.A0r(interfaceC09390do), c47539Kz7);
            LI5.A00(KQ1.A00, AbstractC46750Km7.A00(AbstractC166987dD.A0r(interfaceC09390do)));
            C47809L9r c47809L9r = kcx.A08;
            if (c47809L9r != null) {
                c47809L9r.A01(viewGroup, new C48600Lec(kcx, 2));
            }
        }
    }
}
