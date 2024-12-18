package X;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.modal.ModalActivity;

/* loaded from: classes6.dex */
public final class G8M implements GZB {
    public final int A00;
    public final Object A01;

    @Override // X.GZB
    public final void onDismiss() {
    }

    public G8M(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // X.GZB
    public final void D3J(Context context) {
        if (this.A00 != 0) {
            FragmentActivity A07 = AbstractC31179DnN.A07();
            if (A07 != null) {
                F0J.A00().A02(A07, (UserSession) this.A01, "notification", null, false);
                return;
            }
            return;
        }
        C35904FtO c35904FtO = (C35904FtO) this.A01;
        UserSession userSession = c35904FtO.A02;
        Bundle A01 = AbstractC31364DqT.A02().A01(userSession, AbstractC31402Dr6.A03(userSession, userSession.userId, AbstractC111324zv.A00(216), MSV.A00(1308)));
        Context context2 = c35904FtO.A00;
        AbstractC31171DnF.A0L((Activity) context2, A01, userSession, ModalActivity.class, "profile").A0C(context2);
    }
}
