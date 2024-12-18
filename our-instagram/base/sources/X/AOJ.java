package X;

import android.content.DialogInterface;
import com.facebook.common.dextricks.OptSvcAnalyticsStore;
import com.instagram.common.session.UserSession;

/* loaded from: classes4.dex */
public final class AOJ implements DialogInterface.OnClickListener {
    public final /* synthetic */ InterfaceC11380iw A00;
    public final /* synthetic */ C198248pZ A01;

    public AOJ(InterfaceC11380iw interfaceC11380iw, C198248pZ c198248pZ) {
        this.A01 = c198248pZ;
        this.A00 = interfaceC11380iw;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        UserSession userSession = this.A01.A07;
        InterfaceC11380iw interfaceC11380iw = this.A00;
        C14360o3.A0B(userSession, 0);
        InterfaceC02590Ai A02 = AMW.A02(interfaceC11380iw, userSession);
        A02.AAP(OptSvcAnalyticsStore.LOGGING_KEY_STEP, "story_postcapture_dialog");
        AbstractC167027dH.A0t(A02, "dismiss");
        AbstractC167007dF.A12(A02, AMW.A05(userSession));
        A02.Cht();
    }
}
