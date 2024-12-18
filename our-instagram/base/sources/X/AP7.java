package X;

import android.content.DialogInterface;
import com.instagram.common.session.UserSession;

/* loaded from: classes4.dex */
public final class AP7 implements DialogInterface.OnShowListener {
    public final /* synthetic */ UserSession A00;

    public AP7(UserSession userSession) {
        this.A00 = userSession;
    }

    @Override // android.content.DialogInterface.OnShowListener
    public final void onShow(DialogInterface dialogInterface) {
        C23031Ai A00 = AbstractC23021Ah.A00(this.A00);
        AbstractC167007dF.A1L(A00, A00.A7S, C23031Ai.A8c, 279, true);
    }
}
