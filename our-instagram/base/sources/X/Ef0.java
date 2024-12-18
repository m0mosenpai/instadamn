package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

/* loaded from: classes6.dex */
public final class Ef0 extends C31253Dob {
    public final /* synthetic */ C38J A00;

    @Override // X.C31253Dob, X.InterfaceC37216GaR
    public final void DHq(C47P c47p, String str, int i) {
        String str2;
        C14360o3.A0B(c47p, 0);
        C38J c38j = this.A00;
        C38977HEf c38977HEf = c38j.A09;
        if (c38977HEf == null) {
            str2 = "adapter";
        } else {
            c38977HEf.notifyDataSetChanged();
            C123835ix c123835ix = c38j.A03;
            if (c123835ix == null) {
                str2 = "followChainingLogger";
            } else {
                String A0p = AbstractC31173DnH.A0p(c47p);
                String str3 = c38j.A0D;
                if (str3 != null) {
                    c123835ix.A02(A0p, str3, "direct_pivot_unit", c47p.getAlgorithm(), c47p.ByJ(), i);
                    return;
                }
                throw AbstractC166997dE.A0g();
            }
        }
        C14360o3.A0F(str2);
        throw C00O.createAndThrow();
    }

    @Override // X.C31253Dob, X.InterfaceC37216GaR
    public final void Dhu(C47P c47p, String str, int i) {
        C14360o3.A0B(c47p, 0);
        C38J c38j = this.A00;
        if (c38j.A0d.add(AbstractC31173DnH.A0p(c47p))) {
            C123835ix c123835ix = c38j.A03;
            if (c123835ix == null) {
                C14360o3.A0F("followChainingLogger");
                throw C00O.createAndThrow();
            }
            String A0p = AbstractC31173DnH.A0p(c47p);
            String str2 = c38j.A0D;
            if (str2 != null) {
                c123835ix.A04(A0p, str2, "direct_pivot_unit", c47p.getAlgorithm(), c47p.ByJ(), i, 0L);
                return;
            }
            throw AbstractC166997dE.A0g();
        }
    }

    @Override // X.C31253Dob, X.InterfaceC37216GaR
    public final void Dxe(C47P c47p, String str, int i) {
        C14360o3.A0B(c47p, 0);
        C38J c38j = this.A00;
        C123835ix c123835ix = c38j.A03;
        if (c123835ix == null) {
            C14360o3.A0F("followChainingLogger");
            throw C00O.createAndThrow();
        }
        String A0p = AbstractC31173DnH.A0p(c47p);
        String str2 = c38j.A0D;
        if (str2 != null) {
            c123835ix.A03(A0p, str2, "direct_pivot_unit", c47p.getAlgorithm(), c47p.ByJ(), i);
            C31368DqX.A02(AbstractC25225BEi.A0r(c38j.requireActivity(), C38J.A01(c38j)), C38J.A01(c38j), AbstractC31364DqT.A02(), AbstractC31402Dr6.A01(C38J.A01(c38j), AbstractC31173DnH.A0p(c47p), "feed_single_media_user_button", c38j.getModuleName()));
            return;
        }
        throw AbstractC166997dE.A0g();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Ef0(FragmentActivity fragmentActivity, UserSession userSession, C38J c38j) {
        super(fragmentActivity, c38j, userSession);
        this.A00 = c38j;
        C14360o3.A0A(fragmentActivity);
    }
}
