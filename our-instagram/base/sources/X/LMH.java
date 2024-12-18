package X;

import android.app.Activity;
import android.content.DialogInterface;
import com.instagram.bugreporter.source.BugReportSource;
import com.instagram.common.session.UserSession;
import com.instagram.direct.request.DirectThreadApi;
import com.instagram.model.direct.DirectThreadKey;

/* loaded from: classes8.dex */
public final class LMH implements DialogInterface.OnClickListener {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final String A03;

    public LMH(Object obj, Object obj2, String str, int i) {
        this.A00 = i;
        this.A02 = obj2;
        this.A01 = obj;
        this.A03 = str;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        C42221xC EKw;
        C41761wQ c41761wQ;
        int i2;
        switch (this.A00) {
            case 0:
                LBR.A01((C1P1) this.A01, (UserSession) this.A02, this.A03);
                return;
            case 1:
                UserSession userSession = (UserSession) this.A02;
                C22C A01 = AnonymousClass229.A01(userSession);
                A01.A1R(((C22F) A01).A04.A0C, "META_CLOUD_ALBUM_NUX_OK");
                AbstractC208329Jr.A07((InterfaceC11380iw) this.A01, userSession, C05F.A0N, this.A03);
                return;
            case 2:
                Object A13 = AbstractC25225BEi.A13(this.A01, i);
                C49092LnI c49092LnI = (C49092LnI) this.A02;
                Activity activity = c49092LnI.A00;
                if (C14360o3.A0K(A13, activity.getString(2131960785))) {
                    EKw = ((C7U0) c49092LnI.A08.get()).Bt9().AGU((C3o9) AbstractC31172DnG.A0y(c49092LnI.A09), this.A03);
                    c41761wQ = c49092LnI.A03;
                    i2 = 17;
                } else if (C14360o3.A0K(A13, activity.getString(2131960385))) {
                    EKw = ((C7U0) c49092LnI.A08.get()).Bt9().EKw((C3o9) AbstractC31172DnG.A0y(c49092LnI.A09), this.A03);
                    c41761wQ = c49092LnI.A03;
                    i2 = 18;
                } else {
                    if (!C14360o3.A0K(A13, activity.getString(2131971483))) {
                        return;
                    }
                    AbstractC35237FgW.A01(activity, BugReportSource.A0B, c49092LnI.A04, AbstractC166997dE.A0p(activity, 2131971483), AbstractC166997dE.A0p(activity, 2131954361));
                    return;
                }
                JQn.A00(EKw, c41761wQ, c49092LnI, i2);
                return;
            default:
                LnQ lnQ = (LnQ) this.A02;
                C3o9 c3o9 = (C3o9) lnQ.A07.get();
                if (c3o9 instanceof DirectThreadKey) {
                    UserSession userSession2 = lnQ.A01;
                    String A15 = AbstractC31172DnG.A15(c3o9);
                    if (A15 != null) {
                        C1ON A0A = DirectThreadApi.A0A(userSession2, A15, String.valueOf(this.A01), this.A03);
                        C1GJ.A06(A0A, A0A.A04.runnableId, 2, false, false);
                        return;
                    }
                    throw AbstractC166997dE.A0g();
                }
                return;
        }
    }
}
