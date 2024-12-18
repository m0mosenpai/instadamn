package X;

import android.app.Activity;
import android.content.ClipData;
import android.content.Intent;
import com.instagram.arlink.fragment.NametagController;
import com.instagram.common.session.UserSession;

/* renamed from: X.KJw, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45685KJw extends C2AH {
    public final /* synthetic */ NametagController A00;
    public final /* synthetic */ String A01;

    public C45685KJw(NametagController nametagController, String str) {
        this.A00 = nametagController;
        this.A01 = str;
    }

    @Override // X.C2AH
    public final void onFail(Exception exc) {
        NametagController nametagController = this.A00;
        nametagController.A08.post(new Runnable() { // from class: X.Lzf
            @Override // java.lang.Runnable
            public final void run() {
                NametagController nametagController2 = C45685KJw.this.A00;
                AbstractC63248Sg4.A01(nametagController2.A0B.getParentFragmentManager());
                AbstractC63248Sg4.A00(nametagController2.A06);
            }
        });
        UserSession userSession = nametagController.A0D;
        AbstractC73317Y7a.A0H(nametagController.A0C, userSession, userSession.userId, nametagController.A0F, "system_share_sheet", exc);
    }

    @Override // X.C2AH
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        android.net.Uri uri = (android.net.Uri) obj;
        NametagController nametagController = this.A00;
        nametagController.A08.post(new Runnable() { // from class: X.Lzg
            @Override // java.lang.Runnable
            public final void run() {
                AbstractC63248Sg4.A01(C45685KJw.this.A00.A0B.getParentFragmentManager());
            }
        });
        String str = this.A01;
        Intent intent = new Intent(MSV.A00(81));
        intent.putExtra("android.intent.extra.TEXT", NametagController.A00(nametagController, str));
        intent.putExtra("ShareHandlerActivity.IS_FROM_INSTAGRAM", true);
        if (uri != null) {
            intent.setType("image/png");
            intent.putExtra(MSV.A00(19), uri);
            intent.setFlags(1);
            intent.setClipData(ClipData.newRawUri("profile", uri));
        } else {
            intent.setType("text/plain");
        }
        Activity activity = nametagController.A06;
        C12260kU.A0E(activity, Intent.createChooser(intent, activity.getString(2131973702)));
        UserSession userSession = nametagController.A0D;
        AbstractC73317Y7a.A0J(nametagController.A0C, userSession, userSession.userId, nametagController.A0F, "system_share_sheet", NametagController.A00(nametagController, str));
    }
}
