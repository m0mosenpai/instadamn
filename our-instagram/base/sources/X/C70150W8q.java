package X;

import androidx.fragment.app.FragmentActivity;
import com.facebookpay.common.models.ErrorDialogContent;

/* renamed from: X.W8q, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70150W8q {
    public C69641Vsi A00;

    public static final ErrorDialogContent A00() {
        return new ErrorDialogContent(VEJ.A05, null, null, null, 2131961301, 2131961300, null, null, null, null);
    }

    public static final void A01(FragmentActivity fragmentActivity, ErrorDialogContent errorDialogContent, InterfaceC16820sZ interfaceC16820sZ) {
        String A05 = errorDialogContent.A05(fragmentActivity);
        String A02 = errorDialogContent.A02(fragmentActivity);
        String A03 = errorDialogContent.A03(fragmentActivity);
        C63198Sf0 A01 = AbstractC69850Vwb.A01(null, errorDialogContent.A00(), null, null, new C71691Wyq(interfaceC16820sZ), A05, A02, A03, null, null, null, errorDialogContent.A06());
        AbstractC167007dF.A1K(fragmentActivity, A01);
        AbstractC65702TsY.A0v(fragmentActivity, A01, C2FP.A0H());
    }
}
