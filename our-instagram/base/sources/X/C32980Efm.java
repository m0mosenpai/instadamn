package X;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.facebook.proxygen.TraceFieldType;

/* renamed from: X.Efm, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32980Efm extends ETE {
    public final /* synthetic */ ELA A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32980Efm(Fragment fragment, AbstractC12990ll abstractC12990ll, ELA ela, EnumC31713DwI enumC31713DwI) {
        super(fragment, abstractC12990ll, enumC31713DwI);
        this.A00 = ela;
    }

    @Override // X.ETE
    public final void A00(EDY edy) {
        int A03 = C0f9.A03(-2021049851);
        ELA ela = this.A00;
        C006802i.A0p.markerPoint(725096125, "network_request_complete");
        if (edy.A08) {
            if (ela.getActivity() != null && ela.isResumed()) {
                C34717FRd A0R = AbstractC31175DnJ.A0R();
                String str = edy.A05;
                String str2 = ela.A08;
                C35161Ff3 c35161Ff3 = ela.A06;
                Bundle A0b = AbstractC166987dD.A0b();
                A0b.putAll(c35161Ff3.A00);
                EKE A032 = A0R.A03(A0b, str, str2, false);
                AbstractC31181DnP.A0b(A032, ela.requireActivity(), ela.A05);
                C35231FgO c35231FgO = C35231FgO.A03;
                FragmentActivity requireActivity = ela.requireActivity();
                C07270a1 c07270a1 = ela.A05;
                String str3 = edy.A05;
                EnumC31713DwI enumC31713DwI = EnumC31713DwI.A1J;
                c35231FgO.A03(requireActivity, c07270a1, A032, enumC31713DwI, str3);
                C19280xC A05 = C1Q9.A1E.A02(ela.A05).A05(null, enumC31713DwI);
                ela.A06.A00.putString(AbstractC31176DnK.A0r(EnumC33320EoF.A09), "sms");
                ela.A06.A03(A05);
                AbstractC31173DnH.A1S(A05, ela.A05);
            }
        } else {
            super.A00(edy);
            ELA.A02(ela, "sms");
        }
        C0f9.A0A(-1317322190, A03);
    }

    @Override // X.ETE, X.C1P1
    public final void onFail(AbstractC115105If abstractC115105If) {
        int A03 = C0f9.A03(1766234409);
        super.onFail(abstractC115105If);
        C006802i.A0p.markerAnnotate(725096125, TraceFieldType.FailureReason, "network_error");
        C006802i.A0p.markerEnd(725096125, (short) 3);
        C0f9.A0A(1530869943, A03);
    }

    @Override // X.C1P1
    public final void onFinish() {
        int A03 = C0f9.A03(564147120);
        ELA ela = this.A00;
        if (ela.mView != null) {
            ela.A02.setVisibility(8);
        }
        if (ela.getActivity() != null && ela.isResumed()) {
            AbstractC31176DnK.A0y(ela.requireActivity(), C56352iT.A0t);
        }
        C0f9.A0A(1959804989, A03);
    }

    @Override // X.C1P1
    public final void onStart() {
        int A03 = C0f9.A03(207741013);
        ELA ela = this.A00;
        ela.A02.setVisibility(0);
        if (ela.getActivity() != null && ela.isResumed()) {
            AbstractC31176DnK.A0z(ela.requireActivity(), C56352iT.A0t);
        }
        C0f9.A0A(-1868586415, A03);
    }

    @Override // X.C1P1
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A03 = C0f9.A03(-1888600935);
        A00((EDY) obj);
        C0f9.A0A(2021144942, A03);
    }
}
