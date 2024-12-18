package X;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.ui.widget.shutterbutton.ShutterButton;

/* renamed from: X.9fA, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C214729fA extends AbstractC59962oe {
    public static final String __redex_internal_original_name = "PotatoPreCaptureFragment";
    public final InterfaceC09390do A00;
    public final InterfaceC09390do A02;
    public final InterfaceC09390do A03;
    public final InterfaceC09390do A04;
    public final InterfaceC09390do A05;
    public final InterfaceC09390do A06;
    public final InterfaceC09390do A07;
    public final InterfaceC09390do A09;
    public final InterfaceC09390do A0A;
    public final InterfaceC09390do A08 = AbstractC60492pY.A02(this);
    public final String A0B = "potato_pre_capture_fragment";
    public final InterfaceC09390do A01 = B8R.A01(this, 44);

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        C174757qB c174757qB = (C174757qB) AbstractC166987dD.A17(this.A00);
        c174757qB.A00 = 1;
        c174757qB.EYx(true);
        c174757qB.A0I(new C212659bY(this, 8));
        c174757qB.AJS(new C212659bY(this, 9), null, C81Q.A00);
        ShutterButton shutterButton = (ShutterButton) this.A09.getValue();
        shutterButton.setHandsFreeRecordingEnabled(false);
        shutterButton.setVideoRecordingEnabled(false);
        shutterButton.setOnSingleTapCaptureListener(new C24169Ans(this, 3));
        C3P9 A0s = AbstractC166987dD.A0s(AbstractC166987dD.A0d(this.A07));
        A0s.A06 = false;
        A0s.A04 = new C27074Bwy(this, 0);
        A0s.A00();
        C0fQ.A00(new ViewOnClickListenerC28667ClF(this, 36), AbstractC166987dD.A0d(this.A05));
        C0fQ.A00(new ViewOnClickListenerC28667ClF(this, 37), AbstractC166987dD.A0d(this.A04));
        C07S c07s = C07S.STARTED;
        C07X viewLifecycleOwner = getViewLifecycleOwner();
        AbstractC166987dD.A1Z(new C57160PZe(viewLifecycleOwner, c07s, this, (InterfaceC23621Ds) null, 6), C07Y.A00(viewLifecycleOwner));
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return this.A0B;
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A08);
    }

    public C214729fA() {
        B8S b8s = new B8S(this, 5);
        InterfaceC09390do A00 = AbstractC09440dt.A00(EnumC09460dv.A02, new B8S(new B8S(this, 2), 3));
        this.A0A = new C60842q8(new B8S(A00, 4), b8s, new B61(37, null, A00), new C0YZ(C25865BcK.class));
        this.A00 = B8R.A01(this, 43);
        this.A07 = C1XM.A00(new B8S(this, 0));
        this.A09 = C1XM.A00(new B8S(this, 1));
        this.A04 = B8R.A01(this, 47);
        this.A06 = B8R.A01(this, 49);
        this.A03 = B8R.A01(this, 46);
        this.A02 = B8R.A01(this, 45);
        this.A05 = B8R.A01(this, 48);
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 122293 && i2 == -1) {
            requireActivity().onBackPressed();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(792408086);
        C14360o3.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.layout_potato_pre_capture_fragment, viewGroup, false);
        C14360o3.A07(inflate);
        C0f9.A09(151491447, A02);
        return inflate;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        int A02 = C0f9.A02(119931639);
        super.onDestroyView();
        InterfaceC09390do interfaceC09390do = this.A00;
        ((C174757qB) AbstractC166987dD.A17(interfaceC09390do)).disconnect();
        C174757qB c174757qB = (C174757qB) AbstractC166987dD.A17(interfaceC09390do);
        c174757qB.A0G.A04();
        BDp bDp = c174757qB.A04;
        if (bDp != null) {
            bDp.DeW();
        }
        c174757qB.A0K.clear();
        C0f9.A09(1828221818, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        int A02 = C0f9.A02(1292872023);
        super.onPause();
        ((C174757qB) AbstractC166987dD.A17(this.A00)).A0C();
        C0f9.A09(1273063732, A02);
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onResume() {
        int A02 = C0f9.A02(-1623829015);
        super.onResume();
        InterfaceC09390do interfaceC09390do = this.A00;
        ((C174757qB) AbstractC166987dD.A17(interfaceC09390do)).A0P(null, "potato_capture_on_resume");
        ((C174757qB) AbstractC166987dD.A17(interfaceC09390do)).EJk(AbstractC166997dE.A0b());
        C0f9.A09(-522766737, A02);
    }
}
