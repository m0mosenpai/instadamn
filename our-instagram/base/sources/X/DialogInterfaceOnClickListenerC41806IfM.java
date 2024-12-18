package X;

import android.content.DialogInterface;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.IfM, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class DialogInterfaceOnClickListenerC41806IfM implements DialogInterface.OnClickListener {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final String A03;

    public DialogInterfaceOnClickListenerC41806IfM(Object obj, Object obj2, String str, int i) {
        this.A00 = i;
        this.A02 = obj2;
        this.A03 = str;
        this.A01 = obj;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        C37610Gh5 c37610Gh5;
        C1ON A0U;
        C120985dq c120985dq;
        int i2;
        switch (this.A00) {
            case 0:
                if (C1VW.A00 == null) {
                    return;
                }
                C140966Yy A0r = AbstractC25225BEi.A0r(C6BQ.A04((C6FQ) this.A01), (AbstractC12990ll) this.A02);
                A0r.A0E(C1VW.A00.getFragmentFactory().CsU(this.A03));
                A0r.A04();
                return;
            case 1:
                ((GIQ) this.A01).A00((User) this.A02, this.A03);
                return;
            case 2:
                c37610Gh5 = (C37610Gh5) this.A02;
                UserSession userSession = c37610Gh5.A02;
                String str = this.A03;
                C14360o3.A0B("feed_contextual_self_profile", 2);
                C25621Ms A0c = AbstractC167017dG.A0c(userSession);
                A0c.A0L("commerce/media/%s/remove_all_tags_on_media/", str);
                AbstractC31173DnH.A1N(A0c);
                AbstractC37300Gc1.A0y(A0c, "feed_contextual_self_profile");
                A0U = AbstractC31172DnG.A0U(A0c, true);
                c120985dq = (C120985dq) this.A01;
                i2 = 26;
                A0U.A00 = new C37484Gf2(c120985dq, c37610Gh5, i2);
                c37610Gh5.A01.schedule(A0U);
                return;
            default:
                c37610Gh5 = (C37610Gh5) this.A02;
                UserSession userSession2 = c37610Gh5.A02;
                String str2 = this.A03;
                C25621Ms A0c2 = AbstractC167017dG.A0c(userSession2);
                AbstractC31173DnH.A1Q(A0c2, "usertags/%s/remove/", new Object[]{str2});
                A0c2.A9s("media_id", str2);
                AbstractC37300Gc1.A0y(A0c2, "feed_contextual_self_profile");
                AbstractC31173DnH.A1N(A0c2);
                A0U = AbstractC31172DnG.A0U(A0c2, true);
                c120985dq = (C120985dq) this.A01;
                i2 = 27;
                A0U.A00 = new C37484Gf2(c120985dq, c37610Gh5, i2);
                c37610Gh5.A01.schedule(A0U);
                return;
        }
    }
}
