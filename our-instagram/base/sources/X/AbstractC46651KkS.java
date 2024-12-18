package X;

import android.R;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

/* renamed from: X.KkS, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC46651KkS {
    public static final Object A00(C6FQ c6fq, C6FW c6fw) {
        boolean A01 = C6DZ.A01(c6fw.A03(0));
        Object A03 = c6fw.A03(1);
        C14360o3.A0C(A03, "null cannot be cast to non-null type com.instagram.common.bloks.BloksContext");
        AbstractC12990ll A0A = C6BQ.A0A((C6FG) A03);
        C14360o3.A0C(A0A, "null cannot be cast to non-null type com.instagram.common.session.UserSession");
        UserSession userSession = (UserSession) A0A;
        if (A01) {
            new C131305wJ(userSession).A02(A01);
            return null;
        }
        Fragment A012 = C6BQ.A01(c6fq);
        C14360o3.A0C(A012, "null cannot be cast to non-null type com.instagram.base.fragment.IgFragment");
        AbstractC59962oe abstractC59962oe = (AbstractC59962oe) A012;
        C43804JYr c43804JYr = new C43804JYr(AbstractC23021Ah.A00(userSession), userSession);
        FragmentActivity A04 = C6BQ.A04(c6fq);
        AbstractC167007dF.A1D(A04, 1, abstractC59962oe);
        C23031Ai c23031Ai = c43804JYr.A01;
        InterfaceC16530ry interfaceC16530ry = c23031Ai.A3b;
        C0YR[] c0yrArr = C23031Ai.A8c;
        if (!AbstractC167017dG.A1b(c23031Ai, interfaceC16530ry, c0yrArr, 438)) {
            C193328hC A0I = AbstractC31171DnF.A0I(A04);
            A0I.A0A(2131963514);
            A0I.A09(2131963511);
            A0I.A0L(new DialogInterfaceOnClickListenerC48022LMr(A04, abstractC59962oe, c43804JYr, 8), 2131963510);
            AbstractC31176DnK.A16(new DialogInterfaceOnClickListenerC48022LMr(A04, abstractC59962oe, c43804JYr, 9), A0I, R.string.cancel);
        } else {
            new C131305wJ(c43804JYr.A00).A02(false);
            C9GR.A01(A04, null, 2131973612, 0);
        }
        AbstractC167007dF.A1L(c23031Ai, interfaceC16530ry, c0yrArr, 438, true);
        return null;
    }
}
