package X;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.facebook.common.callercontext.CallerContext;
import com.instagram.common.session.UserSession;

/* renamed from: X.Ex1, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC33837Ex1 {
    public static final Object A00(C6FQ c6fq, C6FW c6fw) {
        Object A03 = c6fw.A03(0);
        String A0f = AbstractC31171DnF.A0f(A03);
        Object A02 = c6fw.A02();
        C14360o3.A0C(A02, A0f);
        String A0n = AbstractC31176DnK.A0n(c6fw, A0f);
        Object A032 = c6fw.A03(4);
        C14360o3.A0C(A032, AbstractC111324zv.A00(487));
        Object A033 = c6fw.A03(5);
        C14360o3.A0C(A033, A0f);
        CallerContext callerContext = C31518Dt2.A00;
        UserSession A0K = AbstractC31179DnN.A0K(c6fq);
        FragmentActivity A04 = C6BQ.A04(c6fq);
        Fragment A01 = C6BQ.A01(c6fq);
        InterfaceC11380iw A08 = C6BQ.A08(c6fq);
        C31518Dt2.A04(A01, A04, A08, A0K, false, (Double) A032, (String) A03, "", (String) A02, A0n, (String) A033);
        return null;
    }
}
