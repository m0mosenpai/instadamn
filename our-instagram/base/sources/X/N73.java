package X;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.common.session.UserSession;

/* loaded from: classes9.dex */
public abstract class N73 extends AbstractC59962oe implements InterfaceC58279PsX {
    public static final String __redex_internal_original_name = "MediaKitBasePickerFragment";
    public C66095TzW A00;
    public C65823Tug A01;
    public final InterfaceC09390do A06 = AbstractC60492pY.A02(this);
    public final InterfaceC09390do A05 = C57546PgK.A01(this, 11);
    public final InterfaceC09390do A07 = C57546PgK.A01(this, 9);
    public final InterfaceC09390do A04 = C57546PgK.A01(this, 10);
    public C54977OTj A02 = new C54977OTj(false, true, false);
    public final InterfaceC62602sz A03 = new PIB(this, 0);

    public final void A03(AbstractC52514NLh abstractC52514NLh) {
        C51052Mh6 c51052Mh6 = (C51052Mh6) this.A05.getValue();
        NY3 ny3 = A02().A02;
        String id = abstractC52514NLh.A02.getId();
        C14360o3.A0B(id, 0);
        boolean z = !ny3.A02.containsKey(id);
        if (z) {
            EnumC53194Nfq enumC53194Nfq = c51052Mh6.A02;
            if (C51052Mh6.A00(enumC53194Nfq, c51052Mh6) > 1 && c51052Mh6.A02().size() >= C51052Mh6.A00(enumC53194Nfq, c51052Mh6)) {
                C54720OEx c54720OEx = new C54720OEx(null, null, 2131966808);
                c54720OEx.A03 = AbstractC25228BEl.A1Y(c51052Mh6.A02().size());
                c51052Mh6.A03(new P5C(c54720OEx));
                return;
            } else if (C51052Mh6.A00(enumC53194Nfq, c51052Mh6) <= 1) {
                C51052Mh6.A01(c51052Mh6, C57645Phv.A00);
            }
        }
        C51052Mh6.A01(c51052Mh6, new DHP(19, abstractC52514NLh, z));
    }

    public final C65823Tug A01() {
        C65823Tug c65823Tug = this.A01;
        if (c65823Tug != null) {
            return c65823Tug;
        }
        C14360o3.A0F("grid");
        throw C00O.createAndThrow();
    }

    public final AbstractC50912Meh A02() {
        InterfaceC09390do interfaceC09390do;
        if (this instanceof C52608NPd) {
            interfaceC09390do = ((C52608NPd) this).A01;
        } else {
            interfaceC09390do = ((C52609NPe) this).A00;
        }
        return (AbstractC50912Meh) interfaceC09390do.getValue();
    }

    public final void A04(boolean z) {
        if (this instanceof C52608NPd) {
            C52608NPd c52608NPd = (C52608NPd) this;
            if (!c52608NPd.A03.isLoading()) {
                C52619NPo c52619NPo = (C52619NPo) c52608NPd.A01.getValue();
                if (z) {
                    ((AbstractC50912Meh) c52619NPo).A00.A02.clear();
                    OEU oeu = c52619NPo.A00;
                    oeu.A00 = null;
                    oeu.A04.Egh(new C54977OTj(false, true, false));
                    oeu.A03.Egh(C16930sl.A00);
                }
                PZF.A02(c52619NPo, AbstractC141776au.A00(c52619NPo), 21);
                return;
            }
            return;
        }
        ((C52618NPn) ((C52609NPe) this).A00.getValue()).A01.A00.A07();
    }

    @Override // X.InterfaceC58279PsX
    public final C54780OIu BOh() {
        return (C54780OIu) this.A07.getValue();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        C66392zG A0R;
        boolean z;
        AbstractC66422zJ npz;
        int A02 = C0f9.A02(-18814892);
        super.onCreate(bundle);
        Context requireContext = requireContext();
        InterfaceC62602sz interfaceC62602sz = this.A03;
        HKK hkk = A02().A00;
        AbstractC18680vv session = getSession();
        String A00 = AbstractC111324zv.A00(6);
        C14360o3.A0C(session, A00);
        UserSession userSession = (UserSession) session;
        if (this instanceof C52608NPd) {
            C52608NPd c52608NPd = (C52608NPd) this;
            A0R = AbstractC31174DnI.A0R(c52608NPd);
            InterfaceC43406JFw interfaceC43406JFw = c52608NPd.A00;
            UserSession A0r = AbstractC166987dD.A0r(c52608NPd.A06);
            InterfaceC09390do interfaceC09390do = c52608NPd.A01;
            z = false;
            npz = new NPY(new C38093GpM(c52608NPd, A0r, ((AbstractC50912Meh) interfaceC09390do.getValue()).A00, interfaceC43406JFw, false, false), c52608NPd, ((AbstractC50912Meh) interfaceC09390do.getValue()).A02);
        } else {
            C52609NPe c52609NPe = (C52609NPe) this;
            int i = AbstractC166997dE.A0N(c52609NPe).getDisplayMetrics().widthPixels;
            InterfaceC09390do interfaceC09390do2 = c52609NPe.A00;
            interfaceC09390do2.getValue();
            int i2 = i / 3;
            A0R = AbstractC31174DnI.A0R(c52609NPe);
            A0R.A01(new C45625KHo(c52609NPe));
            A0R.A01(new NEK(C57380Pde.A00));
            z = false;
            npz = new NPZ(new C8SF(c52609NPe.requireActivity(), AbstractC166987dD.A0r(c52609NPe.A06), C05F.A00, i2, i2, false), ((AbstractC50912Meh) interfaceC09390do2.getValue()).A00, c52609NPe, ((AbstractC50912Meh) interfaceC09390do2.getValue()).A02);
        }
        A0R.A01(npz);
        this.A00 = new C66095TzW(requireContext, this, A0R, userSession, hkk, null, null, null, null, interfaceC62602sz, true, z);
        AbstractC50912Meh A022 = A02();
        C66095TzW c66095TzW = this.A00;
        if (c66095TzW != null) {
            ((AbstractC153816vq) A022.A02).A00 = c66095TzW;
            AbstractC18680vv session2 = getSession();
            C14360o3.A0C(session2, A00);
            C66101Tzc c66101Tzc = new C66101Tzc((UserSession) session2);
            C66095TzW c66095TzW2 = this.A00;
            if (c66095TzW2 != null) {
                c66101Tzc.A06 = c66095TzW2;
                c66101Tzc.A01(P2C.A00);
                HKK hkk2 = A02().A00;
                C14360o3.A0B(hkk2, 0);
                c66101Tzc.A08 = hkk2;
                c66101Tzc.A00(AbstractC37301Gc2.A0E());
                c66101Tzc.A02(A02().A03);
                c66101Tzc.A0I = true;
                c66101Tzc.A04 = this;
                c66101Tzc.A0N = false;
                this.A01 = new C65823Tug(c66101Tzc);
                C0f9.A09(-37304534, A02);
                return;
            }
        }
        C14360o3.A0F("gridAdapter");
        throw C00O.createAndThrow();
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-1595398967);
        C14360o3.A0B(layoutInflater, 0);
        A01();
        View A0R = AbstractC25226BEj.A0R(layoutInflater, viewGroup, R.layout.layout_grid_recyclerview_wrapper, false);
        C0f9.A09(-433053498, A02);
        return A0R;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        int A02 = C0f9.A02(-894371486);
        super.onDestroyView();
        A01().A01();
        C0f9.A09(1282796144, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        int A02 = C0f9.A02(614910745);
        super.onPause();
        A01().A0D.AGc();
        C0f9.A09(282601115, A02);
    }
}
