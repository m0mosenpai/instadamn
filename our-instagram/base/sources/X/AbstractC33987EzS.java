package X;

import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

/* renamed from: X.EzS, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC33987EzS {
    public static final Object A00(C6FQ c6fq, C6FW c6fw) {
        Object A01 = c6fw.A01();
        String A0f = AbstractC31171DnF.A0f(A01);
        String A0i = AbstractC31180DnO.A0i(c6fw, 1);
        String A0o = AbstractC31176DnK.A0o(c6fw, A0f, 2);
        UserSession A0W = AbstractC31172DnG.A0W(c6fq);
        InterfaceC11380iw A08 = C6BQ.A08(c6fq);
        FragmentActivity A04 = C6BQ.A04(c6fq);
        C14360o3.A0B(A04, 1);
        AbstractC167007dF.A1E(A0W, 2, A08);
        C140966Yy A0r = AbstractC25225BEi.A0r(A04, A0W);
        ENO eno = new ENO();
        Bundle A05 = AbstractC31178DnM.A05(A0W);
        A05.putString("SupportInboxDetailFragment.ARG_REPORTED_CONTENT_ID", (String) A01);
        A05.putString("SupportInboxDetailFragment.ARG_CTRL_TYPE", A0i);
        A05.putString("SupportInboxDetailFragment.ARG_TICKET_ID", A0o);
        A05.putString("SupportInboxDetailFragment.ARG_STORY_ID", null);
        A05.putSerializable("SupportInboxDetailFragment.ARG_SOURCE", null);
        AbstractC31175DnJ.A0t(A05, eno, A0r);
        return null;
    }
}
