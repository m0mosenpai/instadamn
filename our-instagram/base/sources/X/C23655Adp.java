package X;

import android.app.Activity;
import com.instagram.common.session.UserSession;
import com.instagram.modal.ModalActivity;
import java.util.LinkedHashSet;

/* renamed from: X.Adp, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C23655Adp implements InterfaceC13000lm {
    public final java.util.Set A00 = new LinkedHashSet();

    public final void A00(Activity activity, UserSession userSession, Integer num) {
        C1VN c1vn;
        C14360o3.A0B(userSession, 1);
        num.intValue();
        EnumC222779sI enumC222779sI = EnumC222779sI.A05;
        if (activity instanceof ModalActivity) {
            activity = (Activity) AbstractC54852fj.A00();
        }
        if (this.A00.contains(enumC222779sI) && activity != null && (c1vn = C1VN.A00) != null) {
            c1vn.A02(userSession, activity, "");
        }
    }

    public final void A01(EnumC222779sI enumC222779sI) {
        this.A00.add(enumC222779sI);
    }

    @Override // X.InterfaceC13000lm
    public final void onSessionWillEnd() {
        this.A00.clear();
    }
}
