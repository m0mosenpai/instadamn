package X;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;

/* renamed from: X.N7k, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C52175N7k extends C53Z implements InterfaceC189488aT, InterfaceC58161PqQ {
    public static final String __redex_internal_original_name = "LoginActivityMapBottomSheetFragment";
    public C3OO A00;
    public OUX A01;

    @Override // X.InterfaceC189488aT
    public final int Ahd(Context context) {
        return 0;
    }

    @Override // X.InterfaceC189488aT
    public final int Aqi() {
        return -2;
    }

    @Override // X.InterfaceC189488aT
    public final View C5a() {
        return null;
    }

    @Override // X.InterfaceC189488aT
    public final int C9V() {
        return 0;
    }

    @Override // X.InterfaceC189488aT
    /* renamed from: CO7 */
    public final float Cpk() {
        return 0.8f;
    }

    @Override // X.InterfaceC189488aT
    public final boolean CQm() {
        return false;
    }

    @Override // X.InterfaceC189488aT
    public final float Cnp() {
        return 1.0f;
    }

    @Override // X.InterfaceC58161PqQ
    public final void Cyo() {
    }

    @Override // X.InterfaceC58161PqQ
    public final void Cyp(OUX oux) {
    }

    @Override // X.InterfaceC58161PqQ
    public final void D6y(OUX oux) {
    }

    @Override // X.InterfaceC58161PqQ
    public final void DAU(OUX oux) {
    }

    @Override // X.InterfaceC189498aU
    public final void DOM() {
    }

    @Override // X.InterfaceC189498aU
    public final void DON(int i) {
    }

    @Override // X.InterfaceC189488aT
    public final boolean Ei2() {
        return true;
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "loginactivity";
    }

    @Override // X.InterfaceC189488aT, X.C51D
    public final boolean isScrolledToTop() {
        return false;
    }

    @Override // X.InterfaceC189488aT, X.C51D
    public final void onBottomSheetClosed() {
    }

    @Override // X.InterfaceC189488aT, X.C51D
    public final void onBottomSheetPositionChanged(int i, int i2) {
    }

    @Override // X.InterfaceC189488aT
    public final /* synthetic */ boolean ABC() {
        return false;
    }

    @Override // X.InterfaceC189488aT
    public final /* synthetic */ boolean ANe() {
        return false;
    }

    @Override // X.InterfaceC189488aT
    public final /* synthetic */ float Cpk() {
        return 0.8f;
    }

    @Override // X.AbstractC59962oe, X.AbstractC59972of
    public final void afterOnResume() {
        super.afterOnResume();
        AbstractC56932jR.A02(this.A00.itemView.findViewById(R.id.title_message));
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(-55449004);
        super.onCreate(bundle);
        this.A01 = OUX.A00(requireArguments());
        C0f9.A09(263414155, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(488145231);
        View A0A = AbstractC31172DnG.A0A(layoutInflater, viewGroup, R.layout.login_activity_map_bottom_sheet);
        C51228MkD A00 = AbstractC54914OQl.A00(requireContext(), (ViewGroup) A0A, true);
        this.A00 = A00;
        AbstractC54914OQl.A01(requireContext(), this.A01, this, A00, true);
        C0f9.A09(1650883144, A02);
        return A0A;
    }
}
