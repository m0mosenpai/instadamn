package X;

import android.content.Context;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.igds.components.bottomsheet.BottomSheetFragment;

/* loaded from: classes11.dex */
public final class VB6 extends AnonymousClass772 {
    public final int A00;
    public final Object A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VB6(V1L v1l, int i, int i2) {
        super(Integer.valueOf(i));
        this.A00 = i2;
        this.A01 = v1l;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    @Override // X.AnonymousClass772, android.text.style.ClickableSpan
    public final void onClick(View view) {
        C63397SjR A0y;
        String str;
        FragmentActivity fragmentActivity;
        UserSession userSession;
        String str2;
        switch (this.A00) {
            case 0:
                ((XEK) this.A01).D8d(false);
                return;
            case 1:
                C69655Vsw c69655Vsw = (C69655Vsw) this.A01;
                c69655Vsw.A03.A0G(VG4.A1S, "taiwan_finserv_toggle");
                fragmentActivity = c69655Vsw.A02;
                userSession = c69655Vsw.A07;
                A0y = AbstractC25228BEl.A0y(fragmentActivity, userSession, C2Fb.A35, "https://www.facebook.com/business/help/719892839342050");
                A0y.A0A();
                return;
            case 2:
                V0Y v0y = (V0Y) this.A01;
                C70399WUb.A04(VG4.A0k, AbstractC65702TsY.A0N(v0y.A0G), null, "view_advertising_policies");
                A0y = AbstractC25228BEl.A0y(v0y.requireActivity(), V0Y.A01(v0y), C2Fb.A35, AbstractC43591JPw.A00(1039));
                str = "promote_error";
                A0y.A0S = str;
                A0y.A0A();
                return;
            case 3:
                V1L v1l = (V1L) this.A01;
                UserSession userSession2 = v1l.A00;
                if (userSession2 != null) {
                    C189448aO c189448aO = new C189448aO(userSession2);
                    c189448aO.A0T = new J0V(0);
                    c189448aO.A04(R.anim.right_in, R.anim.left_out, R.anim.left_in, R.anim.right_out);
                    Fragment requireParentFragment = v1l.requireParentFragment();
                    C14360o3.A0C(requireParentFragment, "null cannot be cast to non-null type com.instagram.igds.components.bottomsheet.BottomSheetFragment");
                    if (((BottomSheetFragment) requireParentFragment).A02 != null) {
                        UserSession userSession3 = v1l.A00;
                        if (userSession3 != null) {
                            C70399WUb.A00(userSession3).A0G(VG4.A1K, "regulated_category_learn_more_link");
                            Fragment requireParentFragment2 = v1l.requireParentFragment();
                            C14360o3.A0C(requireParentFragment2, "null cannot be cast to non-null type com.instagram.igds.components.bottomsheet.BottomSheetFragment");
                            C189478aR c189478aR = ((BottomSheetFragment) requireParentFragment2).A02;
                            if (c189478aR != null) {
                                c189478aR.A0F(new AbstractC59962oe(), c189448aO);
                                return;
                            }
                            return;
                        }
                    } else {
                        return;
                    }
                }
                str2 = "session";
                C14360o3.A0F(str2);
                throw C00O.createAndThrow();
            case 4:
                V1L v1l2 = (V1L) this.A01;
                Context requireContext = v1l2.requireContext();
                UserSession userSession4 = v1l2.A00;
                if (userSession4 != null) {
                    A0y = AbstractC25228BEl.A0y(requireContext, userSession4, C2Fb.A35, "https://www.facebook.com/business/help/544219649587656?id=288762101909005");
                    str = "promote";
                    A0y.A0S = str;
                    A0y.A0A();
                    return;
                }
                str2 = "session";
                C14360o3.A0F(str2);
                throw C00O.createAndThrow();
            case 5:
                V0X v0x = (V0X) this.A01;
                AbstractC25231BEo.A0g(v0x.A0J).A00().A02(v0x.requireActivity(), new V03());
                return;
            default:
                C67892V0z c67892V0z = (C67892V0z) this.A01;
                C70399WUb c70399WUb = c67892V0z.A0B;
                if (c70399WUb != null) {
                    c70399WUb.A0G(VG4.A1S, "taiwan_finserv_toggle");
                }
                fragmentActivity = c67892V0z.requireActivity();
                userSession = c67892V0z.A0H;
                if (userSession == null) {
                    str2 = "userSession";
                    C14360o3.A0F(str2);
                    throw C00O.createAndThrow();
                }
                A0y = AbstractC25228BEl.A0y(fragmentActivity, userSession, C2Fb.A35, "https://www.facebook.com/business/help/719892839342050");
                A0y.A0A();
                return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VB6(V0X v0x, int i) {
        super(Integer.valueOf(i));
        this.A00 = 5;
        this.A01 = v0x;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VB6(V0Y v0y, int i) {
        super(Integer.valueOf(i));
        this.A00 = 2;
        this.A01 = v0y;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VB6(C67892V0z c67892V0z, int i) {
        super(Integer.valueOf(i));
        this.A00 = 6;
        this.A01 = c67892V0z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VB6(C69655Vsw c69655Vsw, int i) {
        super(Integer.valueOf(i));
        this.A00 = 1;
        this.A01 = c69655Vsw;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VB6(XEK xek, int i) {
        super(Integer.valueOf(i));
        this.A00 = 0;
        this.A01 = xek;
    }
}
