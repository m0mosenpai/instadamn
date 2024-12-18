package X;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.compose.ui.platform.ComposeView;
import com.facebook.R;
import com.facebook.common.dextricks.StringTreeSet;
import java.util.ArrayList;

/* renamed from: X.Bry, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26777Bry extends AbstractC59962oe implements InterfaceC60122ou {
    public static final String __redex_internal_original_name = "FollowRequestsComposeFragment";
    public TextView A00;
    public final InterfaceC09390do A07;
    public final InterfaceC09390do A08;
    public final InterfaceC11380iw A01 = new C19270xB(MSV.A00(1186));
    public final InterfaceC09390do A03 = C1XM.A00(new C57245PbT(this, 46));
    public final InterfaceC09390do A02 = C1XM.A00(new C57245PbT(this, 45));
    public final InterfaceC09390do A04 = C1XM.A00(new C57245PbT(this, 49));
    public final InterfaceC09390do A05 = C1XM.A00(C29807DCz.A00);
    public final InterfaceC09390do A06 = AbstractC25229BEm.A0p(this, 0);

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        C14360o3.A0B(interfaceC56362iU, 0);
        if (isAdded() && getContext() != null) {
            AbstractC25229BEm.A1G(interfaceC56362iU, 2131962720);
            FrameLayout frameLayout = ((C56352iT) interfaceC56362iU).A0S;
            C14360o3.A0C(frameLayout, AbstractC111324zv.A00(StringTreeSet.MAX_SYMBOL_COUNT));
            TextView A0T = AbstractC166997dE.A0T(LayoutInflater.from(requireContext()).inflate(R.layout.action_bar_button_text, (ViewGroup) frameLayout, false), R.id.action_bar_button_text);
            AbstractC25227BEk.A12(A0T, this, 2131962718);
            AbstractC166987dD.A1O(requireContext(), A0T, AbstractC53242c7.A07(A0T.getContext()));
            ViewOnClickListenerC28666ClE.A01(A0T, 7, this);
            this.A00 = A0T;
            C3LO c3lo = new C3LO();
            c3lo.A0I = this.A00;
            interfaceC56362iU.AAA(new C3LY(c3lo));
            boolean z = ((C28177CbP) A00(this).A09.getValue()).A02;
            TextView textView = this.A00;
            if (textView != null) {
                textView.setEnabled(z);
                float f = 0.35f;
                if (textView.isEnabled()) {
                    f = 1.0f;
                }
                textView.setAlpha(f);
            }
        }
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onActivityResult(int i, int i2, Intent intent) {
        ArrayList<String> arrayList;
        if (i2 == -1 && i == 277) {
            boolean z = false;
            if (intent != null) {
                z = intent.getBooleanExtra(AbstractC111324zv.A00(284), false);
                arrayList = intent.getStringArrayListExtra("ARG_USER_IDS");
            } else {
                arrayList = null;
            }
            N86 A00 = A00(this);
            AbstractC166987dD.A1Z(new PZO(arrayList, A00, null, 22, z), AbstractC141776au.A00(A00));
        }
        super.onActivityResult(i, i2, intent);
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        ((AbstractC55352ga) this.A06.getValue()).DiZ();
        C07S c07s = C07S.STARTED;
        C07X viewLifecycleOwner = getViewLifecycleOwner();
        AbstractC166987dD.A1Z(new PZP(viewLifecycleOwner, c07s, this, null, 40), C07Y.A00(viewLifecycleOwner));
    }

    public static final N86 A00(C26777Bry c26777Bry) {
        return (N86) c26777Bry.A08.getValue();
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return this.A01.getModuleName();
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A07);
    }

    public C26777Bry() {
        C57240PbO c57240PbO = new C57240PbO(this, 4);
        InterfaceC09390do A00 = AbstractC09440dt.A00(EnumC09460dv.A02, new C57240PbO(new C57240PbO(this, 1), 2));
        this.A08 = AbstractC25225BEi.A0a(new C57240PbO(A00, 3), c57240PbO, new C57531Pg5(36, null, A00), AbstractC25225BEi.A1D(N86.class));
        this.A07 = AbstractC60492pY.A02(this);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(958834564);
        super.onCreate(bundle);
        InterfaceC09390do interfaceC09390do = this.A04;
        AbstractC27777CMs.A00(requireContext(), (JQS) interfaceC09390do.getValue(), this, this.A07, interfaceC09390do);
        A00(this).A02();
        A00(this).A01().A00 = new C25344BJn(this, 34);
        ((C54781OIv) A00(this).A04.A04.getValue()).A00 = new C25344BJn(this, 35);
        C0f9.A09(189366863, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-804238315);
        ComposeView A022 = AbstractC25319BIo.A02(this, C5UA.A03(new C30496Dbf(this, 36), -314194747), false, C18U.A06(C06090Tz.A05, AbstractC166987dD.A0o(this.A07), 36316340785254680L));
        C0f9.A09(1115104517, A02);
        return A022;
    }
}
