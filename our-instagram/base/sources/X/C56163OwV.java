package X;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import androidx.fragment.app.Fragment;
import com.facebook.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.OwV, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public class C56163OwV implements C3PE, InterfaceC60152ox {
    public AnonymousClass195 A00;
    public boolean A01;
    public final View A02;
    public final AbstractC59962oe A03;
    public final UserSession A04;
    public final C3I9 A05;
    public final EnumC142806cg A06;
    public final InterfaceC09390do A07;
    public final InterfaceC09390do A08;
    public final InterfaceC09390do A09;
    public final InterfaceC09390do A0A;
    public final InterfaceC09390do A0B;
    public final InterfaceC09390do A0C;
    public final InterfaceC09390do A0D;
    public final InterfaceC09390do A0E;
    public final InterfaceC09390do A0F;
    public final InterfaceC09390do A0G;
    public final InterfaceC09390do A0H;
    public final InterfaceC09390do A0I;
    public final ViewStub A0J;
    public final InterfaceC216113n A0K;

    public C56163OwV(View view, AbstractC59962oe abstractC59962oe, UserSession userSession, EnumC142806cg enumC142806cg, int i) {
        View findViewById;
        C14360o3.A0B(userSession, 2);
        this.A03 = abstractC59962oe;
        this.A04 = userSession;
        this.A06 = enumC142806cg;
        C57556PgU c57556PgU = new C57556PgU(this, 29);
        InterfaceC09390do A00 = AbstractC09440dt.A00(EnumC09460dv.A02, new C57556PgU(new C57556PgU(abstractC59962oe, 25), 26));
        this.A0I = AbstractC25225BEi.A0a(new C57556PgU(A00, 27), c57556PgU, C57530Pg4.A00(null, A00, 41), AbstractC25225BEi.A1D(AbstractC50987Mfu.class));
        ViewStub A07 = AbstractC31171DnF.A07(view, R.id.iglive_buttons_container_stub);
        this.A0J = A07;
        if (A07 != null) {
            findViewById = AbstractC31173DnH.A0E(A07, i);
        } else {
            findViewById = view.findViewById(R.id.iglive_buttons_container);
        }
        C14360o3.A0A(findViewById);
        this.A02 = findViewById;
        this.A07 = C57556PgU.A01(this, 15);
        this.A08 = C57556PgU.A01(this, 16);
        this.A09 = C57556PgU.A01(this, 17);
        this.A0A = C57556PgU.A01(this, 18);
        this.A0C = C57556PgU.A01(this, 20);
        this.A0D = C57556PgU.A01(this, 21);
        this.A0F = C57556PgU.A01(this, 23);
        this.A0G = C57556PgU.A01(this, 24);
        this.A0H = C57556PgU.A01(this, 28);
        this.A0B = C57556PgU.A01(this, 19);
        this.A0E = C57556PgU.A01(this, 22);
        C3I8 A01 = C3I7.A01(this, false, false);
        this.A05 = A01;
        this.A0K = C55806OqH.A00;
        InterfaceC09390do interfaceC09390do = this.A08;
        A03(interfaceC09390do);
        InterfaceC09390do interfaceC09390do2 = this.A09;
        A03(interfaceC09390do2);
        InterfaceC09390do interfaceC09390do3 = this.A0A;
        A03(interfaceC09390do3);
        InterfaceC09390do interfaceC09390do4 = this.A0C;
        A03(interfaceC09390do4);
        InterfaceC09390do interfaceC09390do5 = this.A0D;
        A03(interfaceC09390do5);
        InterfaceC09390do interfaceC09390do6 = this.A0F;
        A03(interfaceC09390do6);
        InterfaceC09390do interfaceC09390do7 = this.A0G;
        A03(interfaceC09390do7);
        InterfaceC09390do interfaceC09390do8 = this.A0H;
        A03(interfaceC09390do8);
        MSZ.A1V(interfaceC09390do, 0);
        MSZ.A1V(interfaceC09390do2, 0);
        MSZ.A1V(interfaceC09390do3, 0);
        MSZ.A1V(interfaceC09390do4, 0);
        MSZ.A1V(interfaceC09390do5, 0);
        MSZ.A1V(interfaceC09390do6, 0);
        MSZ.A1V(interfaceC09390do7, 0);
        MSZ.A1V(interfaceC09390do8, 0);
        if (enumC142806cg != EnumC142806cg.A05) {
            A04(abstractC59962oe);
        }
        View A0d = AbstractC166987dD.A0d(this.A08);
        if (A0d != null) {
            Ok4.A00(A0d, 69, this);
        }
        A02(this, this.A07);
        A02(this, this.A09);
        A02(this, this.A0A);
        A02(this, this.A0C);
        A02(this, this.A0D);
        A02(this, this.A0F);
        A02(this, this.A0G);
        A02(this, this.A0H);
        A01.A9e(this);
    }

    public static void A03(InterfaceC09390do interfaceC09390do) {
        A01((View) interfaceC09390do.getValue(), false, false);
    }

    @Override // X.C3PE
    public final void DQY(View view) {
        C14360o3.A0B(view, 0);
        if (MSX.A1Y(view, this.A09)) {
            AbstractC52922bZ A0Z = AbstractC25225BEi.A0Z(this.A0I);
            PZD.A02(A0Z, AbstractC141776au.A00(A0Z), 37);
        }
    }

    @Override // X.C3PE
    public final boolean DsE(View view) {
        C14360o3.A0B(view, 0);
        if (MSX.A1Y(view, this.A07)) {
            AbstractC52922bZ A0Z = AbstractC25225BEi.A0Z(this.A0I);
            PZD.A02(A0Z, AbstractC141776au.A00(A0Z), 36);
            return true;
        }
        if (MSX.A1Y(view, this.A09)) {
            AbstractC52922bZ A0Z2 = AbstractC25225BEi.A0Z(this.A0I);
            PZD.A02(A0Z2, AbstractC141776au.A00(A0Z2), 38);
            return true;
        }
        if (MSX.A1Y(view, this.A0A)) {
            AbstractC52922bZ A0Z3 = AbstractC25225BEi.A0Z(this.A0I);
            PZD.A02(A0Z3, AbstractC141776au.A00(A0Z3), 39);
            return true;
        }
        if (MSX.A1Y(view, this.A0C)) {
            AbstractC52922bZ A0Z4 = AbstractC25225BEi.A0Z(this.A0I);
            PZD.A02(A0Z4, AbstractC141776au.A00(A0Z4), 40);
            return true;
        }
        if (MSX.A1Y(view, this.A0D)) {
            AbstractC52922bZ A0Z5 = AbstractC25225BEi.A0Z(this.A0I);
            PZD.A02(A0Z5, AbstractC141776au.A00(A0Z5), 41);
            return true;
        }
        if (MSX.A1Y(view, this.A0F)) {
            AbstractC52922bZ A0Z6 = AbstractC25225BEi.A0Z(this.A0I);
            PZD.A02(A0Z6, AbstractC141776au.A00(A0Z6), 42);
            return true;
        }
        if (MSX.A1Y(view, this.A0G)) {
            AbstractC50987Mfu abstractC50987Mfu = (AbstractC50987Mfu) this.A0I.getValue();
            C51709Mse A0U = MSX.A0U(abstractC50987Mfu.A02);
            C3PO c3po = null;
            if (A0U != null) {
                c3po = A0U.A06;
            }
            if (c3po == C3PO.A0A) {
                if (abstractC50987Mfu.A01) {
                    return true;
                }
                PZD.A02(abstractC50987Mfu, AbstractC141776au.A00(abstractC50987Mfu), 43);
                return true;
            }
            PZD.A02(abstractC50987Mfu, AbstractC141776au.A00(abstractC50987Mfu), 44);
            return true;
        }
        if (!MSX.A1Y(view, this.A0H)) {
            return true;
        }
        AbstractC52922bZ A0Z7 = AbstractC25225BEi.A0Z(this.A0I);
        PZD.A02(A0Z7, AbstractC141776au.A00(A0Z7), 45);
        return true;
    }

    private final void A00(View view) {
        if (view != null) {
            AbstractC50522MSa.A12(view, this);
        }
    }

    public static final void A01(View view, boolean z, boolean z2) {
        float f;
        if (view != null) {
            float f2 = 1.0f;
            if (z2) {
                AbstractC125325le A0o = AbstractC43592JPx.A0o(view, 1);
                float A07 = AbstractC166987dD.A07(view);
                if (z) {
                    f = AbstractC166987dD.A04(AbstractC25228BEl.A0M(view), R.dimen.account_group_management_clickable_width);
                } else {
                    f = 0.0f;
                }
                A0o.A0R(A07, f);
                A0o.A0P(AbstractC25230BEn.A01(z ? 1 : 0), -1.0f);
                if (!z) {
                    f2 = 0.0f;
                }
                A0o.A0Q(f2, -1.0f);
                A0o.A0C(200L).A0H();
                return;
            }
            int i = 0;
            AbstractC125325le.A01(view, 0).A0G();
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (z) {
                i = -2;
            }
            layoutParams.width = i;
            view.setScaleX(AbstractC25230BEn.A01(z ? 1 : 0));
            if (!z) {
                f2 = 0.0f;
            }
            view.setScaleY(f2);
        }
    }

    public void A04(Fragment fragment) {
        C2GT c2gt;
        InterfaceC09390do interfaceC09390do = this.A0I;
        AbstractC50987Mfu abstractC50987Mfu = (AbstractC50987Mfu) interfaceC09390do.getValue();
        if (abstractC50987Mfu instanceof C53011Ncj) {
            c2gt = ((C53011Ncj) abstractC50987Mfu).A01;
        } else if (abstractC50987Mfu instanceof C53010Nci) {
            c2gt = ((C53010Nci) abstractC50987Mfu).A01;
        } else {
            c2gt = ((C53009Nch) abstractC50987Mfu).A00;
        }
        AbstractC37301Gc2.A0w(fragment.getViewLifecycleOwner(), c2gt, C57755Pji.A02(this, 33), 37);
        this.A00 = AbstractC50522MSa.A0s(fragment, new PZN(fragment, this, null, 15), ((AbstractC50987Mfu) interfaceC09390do.getValue()).A06);
    }

    @Override // X.InterfaceC60152ox
    public final void DOK(int i, boolean z) {
        AbstractC50987Mfu abstractC50987Mfu = (AbstractC50987Mfu) this.A0I.getValue();
        if (i > AbstractC166987dD.A0H(this.A0K.get())) {
            abstractC50987Mfu.A01();
        }
    }

    public static void A02(C56163OwV c56163OwV, InterfaceC09390do interfaceC09390do) {
        c56163OwV.A00((View) interfaceC09390do.getValue());
    }
}
