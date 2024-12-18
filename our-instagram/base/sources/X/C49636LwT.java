package X;

import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;

/* renamed from: X.LwT, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C49636LwT implements MR9 {
    public final /* synthetic */ KCY A00;

    @Override // X.MR9
    public final void ElO(View view) {
        C14360o3.A0B(view, 0);
        KCY kcy = this.A00;
        ViewGroup viewGroup = kcy.A07;
        if (viewGroup != null) {
            viewGroup.removeAllViews();
        }
        view.setImportantForAccessibility(1);
        ViewGroup viewGroup2 = kcy.A07;
        if (viewGroup2 != null) {
            viewGroup2.addView(view);
        }
        A01();
    }

    public C49636LwT(KCY kcy) {
        this.A00 = kcy;
    }

    private final void A00() {
        KCY kcy = this.A00;
        ViewGroup viewGroup = kcy.A07;
        if (viewGroup != null) {
            C55942hf c55942hf = C150956qv.A02;
            AbstractC125325le A0n = AbstractC43592JPx.A0n(viewGroup);
            A0n.A03 = 8;
            AbstractC125325le A0E = A0n.A0E(KCY.A0s);
            if (kcy.A03 != null) {
                A0E.A0K(r0.getBottom());
                A0E.A05 = new C49602Lvv(2, this, kcy);
                A0E.A0H();
                return;
            }
            throw AbstractC166987dD.A14("Required value was null.");
        }
        throw AbstractC166987dD.A14("Required value was null.");
    }

    private final void A01() {
        KCY kcy = this.A00;
        ViewGroup viewGroup = kcy.A07;
        if (viewGroup != null) {
            C55942hf c55942hf = C150956qv.A02;
            AbstractC125325le A0o = AbstractC43592JPx.A0o(viewGroup, 0);
            A0o.A04 = 0;
            AbstractC125325le A0E = A0o.A0E(KCY.A0s);
            View view = kcy.A03;
            if (view != null) {
                float bottom = view.getBottom();
                View view2 = kcy.A04;
                if (view2 != null) {
                    A0E.A0T(bottom, view2.getY() + AbstractC166997dE.A0N(kcy).getDimension(R.dimen.asset_picker_redesign_sticker_height));
                    C44065Jdq.A00(A0E, this, 10);
                    return;
                }
                throw AbstractC166987dD.A14("Required value was null.");
            }
            throw AbstractC166987dD.A14("Required value was null.");
        }
        throw AbstractC166987dD.A14("Required value was null.");
    }

    @Override // X.MR9
    public final boolean onBackPressed() {
        KCT A00;
        KCY kcy = this.A00;
        C47809L9r c47809L9r = kcy.A0A;
        if (c47809L9r != null) {
            KNU knu = c47809L9r.A01;
            if ((knu == null || !knu.onBackPressed()) && (A00 = KCY.A00(kcy)) != null) {
                return A00.onBackPressed();
            }
            return false;
        }
        return false;
    }

    @Override // X.MR9
    public final void CMJ() {
        A00();
        this.A00.A0A = null;
    }

    @Override // X.MR9
    public final void CMp() {
        A00();
    }

    @Override // X.MR9
    public final void EkK() {
        A01();
        KCY kcy = this.A00;
        InterfaceC09390do interfaceC09390do = kcy.A0m;
        C47539Kz7 c47539Kz7 = new C47539Kz7(C18U.A06(C06090Tz.A05, AbstractC166987dD.A0o(interfaceC09390do), 36316645727343164L), !kcy.A0T);
        ViewGroup viewGroup = kcy.A07;
        if (viewGroup != null) {
            C47809L9r c47809L9r = new C47809L9r(kcy.requireActivity(), AbstractC166987dD.A0r(interfaceC09390do), c47539Kz7);
            kcy.A0A = c47809L9r;
            EnumC60792q3 enumC60792q3 = kcy.dayNightMode;
            C14360o3.A0B(enumC60792q3, 0);
            c47809L9r.A00 = enumC60792q3;
            LI5.A00(KQ1.A00, AbstractC46750Km7.A00(AbstractC166987dD.A0r(interfaceC09390do)));
            C47809L9r c47809L9r2 = kcy.A0A;
            if (c47809L9r2 != null) {
                c47809L9r2.A01(viewGroup, new C48600Lec(kcy, 1));
            }
        }
    }
}
