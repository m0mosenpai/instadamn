package X;

import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.modal.ModalActivity;

/* loaded from: classes11.dex */
public final class VB5 extends AnonymousClass772 {
    public final int A00 = 4;
    public final Object A01;
    public final String A02;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VB5(C52352NEq c52352NEq, String str, int i) {
        super(Integer.valueOf(i));
        this.A01 = c52352NEq;
        this.A02 = str;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    @Override // X.AnonymousClass772, android.text.style.ClickableSpan
    public final void onClick(View view) {
        C63397SjR A0y;
        String str;
        String str2;
        switch (this.A00) {
            case 0:
                C52352NEq c52352NEq = (C52352NEq) this.A01;
                AbstractC35253Fgm.A05(c52352NEq.A01, c52352NEq.A04, c52352NEq.A03.getModuleName(), this.A02, false);
                return;
            case 1:
                C69655Vsw c69655Vsw = (C69655Vsw) this.A01;
                A0y = AbstractC25228BEl.A0y(c69655Vsw.A02, c69655Vsw.A07, C2Fb.A35, this.A02);
                A0y.A0A();
                return;
            case 2:
                V08 v08 = (V08) this.A01;
                FragmentActivity requireActivity = v08.requireActivity();
                UserSession userSession = v08.A01;
                if (userSession != null) {
                    A0y = AbstractC25228BEl.A0y(requireActivity, userSession, C2Fb.A35, this.A02);
                    str = "promote";
                    A0y.A0S = str;
                    A0y.A0A();
                    return;
                }
                str2 = "session";
                C14360o3.A0F(str2);
                throw C00O.createAndThrow();
            case 3:
                C67892V0z c67892V0z = (C67892V0z) this.A01;
                C70399WUb c70399WUb = c67892V0z.A0B;
                if (c70399WUb != null) {
                    c70399WUb.A0G(VG4.A1Q, "audience_validation_learn_more");
                }
                FragmentActivity requireActivity2 = c67892V0z.requireActivity();
                UserSession userSession2 = c67892V0z.A0H;
                if (userSession2 == null) {
                    str2 = "userSession";
                    C14360o3.A0F(str2);
                    throw C00O.createAndThrow();
                }
                A0y = AbstractC25228BEl.A0y(requireActivity2, userSession2, C2Fb.A35, this.A02);
                str = "promote_review";
                A0y.A0S = str;
                A0y.A0A();
                return;
            default:
                C42276Io0 c42276Io0 = (C42276Io0) this.A01;
                String str3 = this.A02;
                UserSession userSession3 = c42276Io0.A0R;
                C28431Ze c28431Ze = AbstractC31364DqT.A03().A01;
                C38929HCc c38929HCc = c42276Io0.A0V;
                C31368DqX A02 = AbstractC31402Dr6.A02(userSession3, str3, AbstractC111324zv.A00(1956), "audio_page");
                A02.A0O = AbstractC111324zv.A00(5112);
                C6XJ c6xj = new C6XJ(c38929HCc.requireActivity(), c28431Ze.A01(userSession3, A02.A03()), userSession3, ModalActivity.class, "profile");
                c6xj.A0J = ModalActivity.A08;
                c6xj.A0C(c38929HCc.requireContext());
                return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VB5(C69655Vsw c69655Vsw, String str, int i) {
        super(Integer.valueOf(i));
        this.A01 = c69655Vsw;
        this.A02 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VB5(C67892V0z c67892V0z, String str, int i) {
        super(Integer.valueOf(i));
        this.A01 = c67892V0z;
        this.A02 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VB5(V08 v08, String str, int i) {
        super(Integer.valueOf(i));
        this.A01 = v08;
        this.A02 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VB5(C42276Io0 c42276Io0, String str, int i) {
        super(Integer.valueOf(i));
        this.A01 = c42276Io0;
        this.A02 = str;
    }
}
