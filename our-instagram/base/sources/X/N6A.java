package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import androidx.core.widget.NestedScrollView;
import com.facebook.R;
import com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout;
import com.instagram.ui.widget.radiogroup.IgRadioGroup;

/* loaded from: classes9.dex */
public abstract class N6A extends AbstractC59962oe implements InterfaceC60072op, InterfaceC60122ou {
    public static final String __redex_internal_original_name = "LeadGenOneTapOnboardingBaseFragment";
    public IgdsBottomButtonLayout A00;
    public IgRadioGroup A01;
    public boolean A02;
    public NestedScrollView A04;
    public AnonymousClass195 A05;
    public final int[] A07 = new int[2];
    public final int[] A08 = new int[2];
    public boolean A03 = true;
    public final ViewTreeObserver.OnPreDrawListener A06 = new ViewTreeObserverOnPreDrawListenerC55503Okw(this, 6);

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        String A0v;
        C14360o3.A0B(interfaceC56362iU, 0);
        if (this instanceof C52575NNv) {
            C52575NNv c52575NNv = (C52575NNv) this;
            InterfaceC09390do interfaceC09390do = c52575NNv.A01;
            if (A00(interfaceC09390do).A01 == EnumC53251Ngp.A04) {
                A0v = "";
            } else {
                A0v = MSZ.A0q(c52575NNv, c52575NNv.getString(A00(interfaceC09390do).A01.A00), 2131964873);
            }
        } else {
            A0v = AbstractC25227BEk.A0v(this, 2131970757);
        }
        interfaceC56362iU.setTitle(A0v);
        AbstractC31179DnN.A1G(interfaceC56362iU);
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00bd A[SYNTHETIC] */
    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewCreated(android.view.View r13, android.os.Bundle r14) {
        /*
            Method dump skipped, instructions count: 518
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.N6A.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    public static final boolean A01(N6A n6a) {
        View findViewWithTag;
        NestedScrollView nestedScrollView;
        IgRadioGroup igRadioGroup = n6a.A01;
        if (igRadioGroup == null || (findViewWithTag = igRadioGroup.findViewWithTag(EnumC53267Nh5.A05)) == null || (nestedScrollView = n6a.A04) == null) {
            return false;
        }
        int[] iArr = n6a.A07;
        findViewWithTag.getLocationInWindow(iArr);
        int[] iArr2 = n6a.A08;
        nestedScrollView.getLocationInWindow(iArr2);
        if (iArr2[1] + nestedScrollView.getHeight() < iArr[1] + (findViewWithTag.getHeight() / 3)) {
            return false;
        }
        return true;
    }

    public final AbstractC51032Mgg A02() {
        InterfaceC09390do interfaceC09390do;
        if (this instanceof C52575NNv) {
            interfaceC09390do = ((C52575NNv) this).A00;
        } else {
            interfaceC09390do = ((C52574NNu) this).A00;
        }
        return (AbstractC51032Mgg) interfaceC09390do.getValue();
    }

    public final AbstractC50969Mfc A03() {
        InterfaceC09390do interfaceC09390do;
        if (this instanceof C52575NNv) {
            interfaceC09390do = ((C52575NNv) this).A01;
        } else {
            interfaceC09390do = ((C52574NNu) this).A01;
        }
        return (AbstractC50969Mfc) interfaceC09390do.getValue();
    }

    public static NPA A00(InterfaceC09390do interfaceC09390do) {
        return (NPA) interfaceC09390do.getValue();
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        AbstractC50969Mfc A03 = A03();
        if (A03 instanceof NPA) {
            return ((NPA) A03).A00;
        }
        return ((NPB) A03).A02;
    }

    @Override // X.InterfaceC60072op
    public final boolean onBackPressed() {
        AbstractC50969Mfc A03 = A03();
        OH4 oh4 = A03.A02;
        String A00 = A03.A00();
        C14360o3.A0B(A00, 0);
        InterfaceC58268PsC.A02(oh4.A00, A00, "lead_gen_one_tap_setup", "cancel");
        C51748MtX c51748MtX = (C51748MtX) A02().A00.A02();
        if (c51748MtX != null && c51748MtX.A03) {
            return true;
        }
        if (this instanceof C52575NNv) {
            C52575NNv c52575NNv = (C52575NNv) this;
            InterfaceC09390do interfaceC09390do = c52575NNv.A01;
            if (A00(interfaceC09390do).A01 == EnumC53251Ngp.A06) {
                AbstractC25227BEk.A1B(c52575NNv);
                return true;
            }
            AbstractC25225BEi.A0r(c52575NNv.requireActivity(), A00(interfaceC09390do).A00).A06();
            return true;
        }
        AbstractC25226BEj.A1P(this);
        return true;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(400533822);
        C14360o3.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.lead_gen_fragment_one_tap_onboarding, viewGroup, false);
        C0f9.A09(-1580018227, A02);
        return inflate;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        int A02 = C0f9.A02(1126959184);
        super.onDestroyView();
        this.A01 = null;
        this.A00 = null;
        this.A04 = null;
        C0f9.A09(1827762963, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStart() {
        int A02 = C0f9.A02(-32260684);
        super.onStart();
        this.A05 = PZH.A01(this, A02().A03, 33);
        C0f9.A09(1246211661, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStop() {
        int A02 = C0f9.A02(127534212);
        super.onStop();
        this.A05 = MSY.A0r(this.A05);
        C0f9.A09(-232926497, A02);
    }
}
