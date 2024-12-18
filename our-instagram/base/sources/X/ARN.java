package X;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import com.instagram.common.session.UserSession;
import com.instagram.modal.ModalActivity;

/* loaded from: classes4.dex */
public final class ARN implements View.OnClickListener {
    public final /* synthetic */ C88X A00;
    public final /* synthetic */ AnonymousClass882 A01;

    public ARN(C88X c88x, AnonymousClass882 anonymousClass882) {
        this.A01 = anonymousClass882;
        this.A00 = c88x;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        String str;
        int A05 = C0f9.A05(-1621757857);
        AnonymousClass882 anonymousClass882 = this.A01;
        C88X c88x = this.A00;
        C88Z c88z = c88x.A04;
        if (c88z == null) {
            c88z = C88Z.A0G;
        }
        if (c88z == C88Z.A0Y) {
            anonymousClass882.E2s();
        } else {
            C88Z c88z2 = C88Z.A0W;
            if (c88z == c88z2) {
                if (c88x.A0O) {
                    str = c88x.A0G;
                } else {
                    str = null;
                }
                String id = c88x.getId();
                C14360o3.A07(id);
                AbstractC22735A1f.A00(anonymousClass882.A0K, c88z2, anonymousClass882.A0P, id, str, c88x.A0F);
            } else if (c88z == C88Z.A0Z) {
                UserSession userSession = anonymousClass882.A0P;
                Bundle A0b = AbstractC166987dD.A0b();
                Activity activity = anonymousClass882.A0K;
                C6XJ c6xj = new C6XJ(activity, A0b, userSession, ModalActivity.class, AbstractC111324zv.A00(39));
                c6xj.A07();
                c6xj.A0C(activity);
            }
        }
        C0f9.A0C(1043847562, A05);
    }
}
