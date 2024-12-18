package X;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.facebook.R;
import com.facebookpay.msc.logging.LoggingData;
import com.facebookpay.msc.view.MSCPivotBar;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;

/* loaded from: classes11.dex */
public final class UF0 extends Fragment implements InterfaceC65382TjF, InterfaceC65379TjC {
    public View A00;
    public FrameLayout A01;
    public UGY A02;
    public MSCPivotBar A03;
    public List A04;
    public final C58252li A05;
    public final InterfaceC58362lv A06;
    public final InterfaceC58362lv A07;
    public final HashMap A08;
    public final InterfaceC09390do A09;

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C14360o3.A0B(view, 0);
        AbstractC31174DnI.A1C(AbstractC166987dD.A0c(view, R.id.content_container), C2FP.A02().A07().A00(requireContext(), 19));
        this.A01 = (FrameLayout) view.findViewById(R.id.tab_fragment);
        this.A00 = view.findViewById(R.id.progress_bar_container);
        this.A03 = (MSCPivotBar) view.findViewById(R.id.pivot_bar);
        InterfaceC09390do interfaceC09390do = this.A09;
        UGY ugy = new UGY(new X2o(interfaceC09390do.getValue(), 12), new C69755Vuq[0]);
        this.A02 = ugy;
        MSCPivotBar mSCPivotBar = this.A03;
        if (mSCPivotBar == null) {
            C14360o3.A0F("pivotBar");
            throw C00O.createAndThrow();
        }
        mSCPivotBar.setAdapter(ugy);
        Drawable indeterminateDrawable = ((ProgressBar) view.findViewById(R.id.progress_bar)).getIndeterminateDrawable();
        if (indeterminateDrawable != null) {
            indeterminateDrawable.setColorFilter(AbstractC46530KiV.A00(C05F.A05, C2FP.A02().A07().A00(requireContext(), 20)));
        }
        AbstractC31180DnO.A1F(getViewLifecycleOwner(), ((UFO) interfaceC09390do.getValue()).A06, new X59(this, 40), 20);
        ((UFO) interfaceC09390do.getValue()).A08.A06(getViewLifecycleOwner(), this.A06);
        C63627SqZ.A01(getViewLifecycleOwner(), ((UFO) interfaceC09390do.getValue()).A0C, new C70303WQi(this, 4), 44);
        C63627SqZ.A01(this, ((UFO) interfaceC09390do.getValue()).A0B, new C70303WQi(this, 5), 44);
        AbstractC31180DnO.A1F(this, ((UFO) interfaceC09390do.getValue()).A07, new X59(this, 41), 20);
        this.A05.A0E(((UFO) interfaceC09390do.getValue()).A0A, this.A07);
    }

    @Override // X.InterfaceC65379TjC
    public final /* bridge */ /* synthetic */ C58252li C8v() {
        return this.A05;
    }

    public UF0() {
        InterfaceC09390do A00 = AbstractC09440dt.A00(EnumC09460dv.A02, new X2x(new X2x(this, 26), 27));
        C0YZ c0yz = new C0YZ(UFO.class);
        this.A09 = new C60842q8(new X2x(A00, 28), new C57533Pg7(43, A00, this), new C57533Pg7(42, null, A00), c0yz);
        this.A08 = new HashMap();
        this.A05 = new C58252li();
        this.A07 = new C70303WQi(this, 6);
        this.A06 = new C70303WQi(this, 3);
    }

    @Override // X.InterfaceC65382TjF
    public final boolean onBackPressed() {
        InterfaceC65382TjF interfaceC65382TjF;
        InterfaceC08430c6 A0O = getChildFragmentManager().A0O(R.id.tab_fragment);
        if ((A0O instanceof InterfaceC65382TjF) && (interfaceC65382TjF = (InterfaceC65382TjF) A0O) != null) {
            interfaceC65382TjF.onBackPressed();
        }
        this.A09.getValue();
        C2FP.A02();
        AbstractC70159WDv.A02(667756867, 0, (short) 615);
        return false;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        LoggingData loggingData;
        int A02 = C0f9.A02(-1067589751);
        super.onCreate(bundle);
        UFO ufo = (UFO) this.A09.getValue();
        Bundle bundle2 = this.mArguments;
        String str = null;
        if (bundle2 != null) {
            str = bundle2.getString("page_id");
        }
        ufo.A02 = str;
        if (bundle2 != null && (loggingData = (LoggingData) bundle2.getParcelable("logging_data")) != null) {
            ufo.A00 = loggingData;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            C2FP.A02();
            AbstractC70159WDv.A00(667756867, 0, "fetch_init", linkedHashMap);
            UFO.A01(ufo, "client_fetch_payouthub_init", "overview", null, null, "BSC_PAYOUT_HUB_FETCH_FINANCIAL_ENTITIES", null, null, null, null);
            Object value = ufo.A0F.getValue();
            String str2 = ufo.A02;
            LoggingData loggingData2 = ufo.A00;
            if (loggingData2 == null) {
                C14360o3.A0F("loggingData");
                throw C00O.createAndThrow();
            }
            Q8J A00 = REU.A00(new WPd(value, str2, loggingData2.A00, 2), C2FP.A06());
            C14360o3.A07(A00);
            AbstractC63246Sg0.A01(null, A00, ufo.A0D);
            C0f9.A09(1869837826, A02);
            return;
        }
        throw AbstractC166997dE.A0g();
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-1683350388);
        C14360o3.A0B(layoutInflater, 0);
        FragmentActivity activity = getActivity();
        WFY.A02();
        View inflate = layoutInflater.cloneInContext(new ContextThemeWrapper(activity, R.style.BSCIGTheme)).inflate(R.layout.fragment_payout_activity, viewGroup, false);
        C0f9.A09(388329241, A02);
        return inflate;
    }
}
