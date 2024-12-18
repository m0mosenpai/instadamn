package X;

import android.app.Activity;
import android.content.Context;
import android.text.ClipboardManager;
import com.instagram.common.session.UserSession;

/* renamed from: X.Ej5, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C33101Ej5 extends ET4 {
    public final /* synthetic */ Activity A00;
    public final /* synthetic */ AbstractC10360h2 A01;
    public final /* synthetic */ UserSession A02;
    public final /* synthetic */ C38321qM A03;
    public final /* synthetic */ InterfaceC60442pS A04;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C33101Ej5(Activity activity, Context context, AbstractC10360h2 abstractC10360h2, AbstractC10360h2 abstractC10360h22, UserSession userSession, C38321qM c38321qM, InterfaceC60442pS interfaceC60442pS) {
        super(context, abstractC10360h2);
        this.A03 = c38321qM;
        this.A04 = interfaceC60442pS;
        this.A02 = userSession;
        this.A00 = activity;
        this.A01 = abstractC10360h22;
    }

    @Override // X.ET4, X.C1P1
    public final void onFinish() {
        int A03 = C0f9.A03(78128426);
        final AbstractC10360h2 abstractC10360h2 = this.A01;
        C11T.A03(new Runnable() { // from class: X.GNC
            @Override // java.lang.Runnable
            public final void run() {
                AbstractC63248Sg4.A01(AbstractC10360h2.this);
            }
        });
        C0f9.A0A(-920370187, A03);
    }

    @Override // X.C1P1
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        String str;
        int A03 = C0f9.A03(-1682503264);
        int A032 = C0f9.A03(565692074);
        String str2 = ((EC0) obj).A00;
        C38321qM c38321qM = this.A03;
        InterfaceC60442pS interfaceC60442pS = this.A04;
        UserSession userSession = this.A02;
        Activity activity = this.A00;
        ((ClipboardManager) AbstractC31171DnF.A0X(activity)).setText(str2);
        AbstractC34301FAv.A00(activity, null, null, false);
        if (c38321qM.A2E(userSession) != null) {
            str = c38321qM.A2E(userSession).getId();
        } else {
            str = null;
        }
        String id = c38321qM.getId();
        id.getClass();
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A01(interfaceC60442pS, userSession), "external_share_screenshot_copy_succeeded");
        if (A0f.isSampled()) {
            A0f.A9K("media_id", Long.valueOf(AbstractC25232BEp.A0t(AbstractC003100w.A0k(10, id))));
            A0f.A9K("media_author_id", AbstractC31177DnL.A0Z(str));
            AbstractC25233BEq.A17(A0f, "module", interfaceC60442pS.getModuleName());
            A0f.Cht();
        }
        C0f9.A0A(-1245134288, A032);
        C0f9.A0A(-851974800, A03);
    }
}
