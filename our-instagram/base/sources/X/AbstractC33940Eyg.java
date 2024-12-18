package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.user.model.User;

/* renamed from: X.Eyg, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC33940Eyg {
    public static final Object A00(C6FQ c6fq, C6FW c6fw) {
        Object A03 = c6fw.A03(0);
        C14360o3.A0C(A03, "null cannot be cast to non-null type com.instagram.bloks.datatypes.user.IgBloksUserAlienObject");
        User user = ((C34396FEm) A03).A00;
        if (user == null) {
            AbstractC25241Le.A02(AbstractC111324zv.A00(984), "Null user in user alien object");
            return null;
        }
        FragmentActivity A04 = C6BQ.A04(c6fq);
        InterfaceC11380iw A08 = C6BQ.A08(c6fq);
        AbstractC12990ll A0B = C6BQ.A0B(c6fq);
        C14360o3.A0C(A0B, AbstractC58317Pt9.A00(3));
        AbstractC31525Dt9.A08(A04, A08, AbstractC31525Dt9.A02(A04, A08, (C07270a1) A0B, user, null, false));
        return null;
    }
}
