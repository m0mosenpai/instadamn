package X;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.N4l, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC52113N4l extends AbstractC59962oe {
    public static final String __redex_internal_original_name = "WallMediaPickerBaseFragment";
    public C66095TzW A00;
    public C65823Tug A01;
    public final InterfaceC09390do A06 = AbstractC60492pY.A02(this);
    public final InterfaceC09390do A05 = AbstractC09440dt.A01(new DGU(this, 31));
    public final InterfaceC09390do A04 = AbstractC09440dt.A01(new DGU(this, 30));
    public C54981OTp A02 = new C54981OTp(false, true, false);
    public final InterfaceC62602sz A03 = new PIB(this, 3);

    public final void A03(AbstractC52515NLi abstractC52515NLi) {
        C51014MgM c51014MgM = (C51014MgM) this.A05.getValue();
        NY4 ny4 = A02().A03;
        String id = abstractC52515NLi.A02.getId();
        C14360o3.A0B(id, 0);
        boolean z = !ny4.A02.containsKey(id);
        if (z) {
            C57738PjR c57738PjR = C57738PjR.A00;
            InterfaceC06180Ui interfaceC06180Ui = c51014MgM.A02;
            Object A0I = AbstractC001800i.A0I(interfaceC06180Ui.Bn0());
            c57738PjR.invoke(A0I);
            interfaceC06180Ui.F8m(A0I);
        }
        DHP dhp = new DHP(28, abstractC52515NLi, z);
        InterfaceC06180Ui interfaceC06180Ui2 = c51014MgM.A02;
        Object A0I2 = AbstractC001800i.A0I(interfaceC06180Ui2.Bn0());
        dhp.invoke(A0I2);
        interfaceC06180Ui2.F8m(A0I2);
    }

    public final C65823Tug A01() {
        C65823Tug c65823Tug = this.A01;
        if (c65823Tug != null) {
            return c65823Tug;
        }
        C14360o3.A0F("grid");
        throw C00O.createAndThrow();
    }

    public final AbstractC50918Men A02() {
        InterfaceC09390do interfaceC09390do;
        if (this instanceof C53039NdB) {
            interfaceC09390do = ((C53039NdB) this).A01;
        } else {
            interfaceC09390do = ((C53040NdC) this).A00;
        }
        return (AbstractC50918Men) interfaceC09390do.getValue();
    }

    public final void A04(boolean z) {
        if (this instanceof C53039NdB) {
            C53039NdB c53039NdB = (C53039NdB) this;
            if (!c53039NdB.A03.isLoading()) {
                C53042NdE c53042NdE = (C53042NdE) c53039NdB.A01.getValue();
                if (z) {
                    ((AbstractC50918Men) c53042NdE).A00.A02.clear();
                    C54710OEm c54710OEm = c53042NdE.A00;
                    c54710OEm.A00 = null;
                    c54710OEm.A04.Egh(new C54981OTp(false, true, false));
                    c54710OEm.A03.Egh(C16930sl.A00);
                }
                PYu.A01(c53042NdE, AbstractC141776au.A00(c53042NdE), 41);
                return;
            }
            return;
        }
        ((C53041NdD) ((C53040NdC) this).A00.getValue()).A00.A00.A07();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        C66392zG A0R;
        boolean z;
        AbstractC66422zJ c53038NdA;
        int A02 = C0f9.A02(-1434595744);
        super.onCreate(bundle);
        Context requireContext = requireContext();
        InterfaceC62602sz interfaceC62602sz = this.A03;
        HKK hkk = A02().A00;
        AbstractC18680vv session = getSession();
        String A00 = AbstractC111324zv.A00(6);
        C14360o3.A0C(session, A00);
        UserSession userSession = (UserSession) session;
        if (this instanceof C53039NdB) {
            C53039NdB c53039NdB = (C53039NdB) this;
            A0R = AbstractC31174DnI.A0R(c53039NdB);
            InterfaceC43406JFw interfaceC43406JFw = c53039NdB.A00;
            UserSession A0r = AbstractC166987dD.A0r(c53039NdB.A06);
            InterfaceC09390do interfaceC09390do = c53039NdB.A01;
            z = false;
            c53038NdA = new C53037Nd9(new C38093GpM(c53039NdB, A0r, ((AbstractC50918Men) interfaceC09390do.getValue()).A00, interfaceC43406JFw, false, false), ((AbstractC50918Men) interfaceC09390do.getValue()).A03, c53039NdB);
        } else {
            C53040NdC c53040NdC = (C53040NdC) this;
            int i = AbstractC166997dE.A0N(c53040NdC).getDisplayMetrics().widthPixels;
            InterfaceC09390do interfaceC09390do2 = c53040NdC.A00;
            interfaceC09390do2.getValue();
            int i2 = i / 3;
            A0R = AbstractC31174DnI.A0R(c53040NdC);
            A0R.A01(new C45625KHo(c53040NdC));
            z = false;
            c53038NdA = new C53038NdA(new C8SF(c53040NdC.requireActivity(), AbstractC166987dD.A0r(c53040NdC.A06), C05F.A00, i2, i2, false), ((AbstractC50918Men) interfaceC09390do2.getValue()).A00, ((AbstractC50918Men) interfaceC09390do2.getValue()).A03, c53040NdC);
        }
        A0R.A01(c53038NdA);
        this.A00 = new C66095TzW(requireContext, this, A0R, userSession, hkk, null, null, null, null, interfaceC62602sz, true, z);
        AbstractC50918Men A022 = A02();
        C66095TzW c66095TzW = this.A00;
        if (c66095TzW != null) {
            ((AbstractC153816vq) A022.A03).A00 = c66095TzW;
            AbstractC18680vv session2 = getSession();
            C14360o3.A0C(session2, A00);
            C66101Tzc c66101Tzc = new C66101Tzc((UserSession) session2);
            C66095TzW c66095TzW2 = this.A00;
            if (c66095TzW2 != null) {
                c66101Tzc.A06 = c66095TzW2;
                c66101Tzc.A01(P2D.A00);
                HKK hkk2 = A02().A00;
                C14360o3.A0B(hkk2, 0);
                c66101Tzc.A08 = hkk2;
                c66101Tzc.A00(AbstractC37301Gc2.A0E());
                c66101Tzc.A02(A02().A01);
                c66101Tzc.A0I = true;
                c66101Tzc.A04 = this;
                c66101Tzc.A0N = false;
                this.A01 = new C65823Tug(c66101Tzc);
                C0f9.A09(87737106, A02);
                return;
            }
        }
        C14360o3.A0F("gridAdapter");
        throw C00O.createAndThrow();
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(1983281411);
        C14360o3.A0B(layoutInflater, 0);
        A01();
        View A0R = AbstractC25226BEj.A0R(layoutInflater, viewGroup, R.layout.layout_grid_recyclerview_wrapper, false);
        C0f9.A09(-1860785330, A02);
        return A0R;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        int A02 = C0f9.A02(-1967299919);
        super.onDestroyView();
        A01().A01();
        C0f9.A09(671714843, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        int A02 = C0f9.A02(-566186842);
        super.onPause();
        A01().A0D.AGc();
        C0f9.A09(-2088814111, A02);
    }
}
