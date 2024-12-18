package X;

import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.Jel, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class RunnableC44121Jel implements Runnable {
    public final /* synthetic */ JUI A00;
    public final /* synthetic */ String A01;
    public final /* synthetic */ List A02;

    public RunnableC44121Jel(JUI jui, String str, List list) {
        this.A01 = str;
        this.A00 = jui;
        this.A02 = list;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str = this.A01;
        if (str != null) {
            this.A00.A01 = str;
        }
        JUI jui = this.A00;
        JUI.A01(jui, this.A02);
        UserSession userSession = jui.A05;
        String str2 = jui.A01;
        C44093JeI c44093JeI = new C44093JeI(jui, 9);
        C25621Ms c25621Ms = new C25621Ms(userSession);
        Integer num = C05F.A01;
        c25621Ms.A09(num);
        c25621Ms.A0R = true;
        c25621Ms.A09 = num;
        c25621Ms.A0B("direct_v2/quick_reply/get/");
        c25621Ms.A0S(C44147JfC.class, C44149JfE.class);
        c25621Ms.A9s("modification_token", str2);
        C1ON A0T = AbstractC31172DnG.A0T(c25621Ms, "reply_type", "text");
        A0T.A00 = c44093JeI;
        C1GJ.A06(A0T, 116, 3, false, false);
    }
}
