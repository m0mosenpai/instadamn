package X;

import android.content.res.Configuration;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;

/* renamed from: X.Q7u, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C58765Q7u extends Fragment {
    public SJP A00;
    public C58773Q8f A01;
    public Q1y A02;
    public C60610RDf A03;
    public final VTA A04 = C2FP.A09();

    /* JADX WARN: Code restructure failed: missing block: B:15:0x013c, code lost:
    
        if (r1.A00.getBoolean("AUTH_FLOW_UTIL_PIN_FORGOT_VISIBLE", true) == false) goto L17;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewCreated(android.view.View r8, android.os.Bundle r9) {
        /*
            Method dump skipped, instructions count: 480
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C58765Q7u.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    public static void A00(C58765Q7u c58765Q7u, String str) {
        C2FP.A03().A01.Chz(str, SSA.A01(c58765Q7u.requireArguments()));
    }

    @Override // androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        requireContext().getResources();
        super.onConfigurationChanged(configuration);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(-2066164819);
        super.onCreate(bundle);
        this.A02 = new Q1y(requireContext(), this.A04);
        this.A03 = (C60610RDf) C2FP.A03().A03(this.A02, C60610RDf.class);
        C0f9.A09(-962646801, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-2082763139);
        C60610RDf c60610RDf = this.A03;
        InterfaceC65381TjE interfaceC65381TjE = c60610RDf.A01;
        View A0A = AbstractC31172DnG.A0A(((T34) interfaceC65381TjE).A00, viewGroup, c60610RDf.A00);
        C14360o3.A07(A0A);
        C0f9.A09(-2039305757, A02);
        return A0A;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        int A02 = C0f9.A02(-714681413);
        super.onDestroyView();
        SSC.A00(this.A00.A02);
        this.A00 = null;
        C0f9.A09(993306556, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        int A02 = C0f9.A02(1161161828);
        super.onResume();
        requireContext().getResources();
        C0f9.A09(1465883729, A02);
    }
}
