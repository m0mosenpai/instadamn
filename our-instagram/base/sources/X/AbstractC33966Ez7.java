package X;

import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

/* renamed from: X.Ez7, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC33966Ez7 {
    public static final Object A00(C6FQ c6fq) {
        FragmentActivity A04 = C6BQ.A04(c6fq);
        UserSession A0W = AbstractC31172DnG.A0W(c6fq);
        Bundle A05 = AbstractC31178DnM.A05(A0W);
        C140966Yy A0P = AbstractC31173DnH.A0P(A04, A0W);
        A0P.A0B(A05, AbstractC62818SSq.A01(A0W.token, AbstractC111324zv.A00(3157), A04.getApplicationContext().getString(2131965304)));
        A0P.A04();
        return null;
    }
}
