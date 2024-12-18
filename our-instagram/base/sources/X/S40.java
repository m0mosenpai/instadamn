package X;

import android.content.Context;
import android.content.Intent;
import com.facebook.fxcropapp.ig.IgCropActivity;
import com.instagram.common.session.UserSession;

/* loaded from: classes10.dex */
public abstract class S40 {
    public static final Object A00(C6FQ c6fq, C6FW c6fw) {
        Object A01 = c6fw.A01();
        C14360o3.A0C(A01, AbstractC43591JPw.A00(1));
        UserSession userSession = (UserSession) C6BQ.A0B(c6fq);
        Context context = ((C6FG) A01).A00;
        C14360o3.A0B(userSession, 3);
        String A0s = AbstractC31173DnH.A0s(c6fw.A00, 2);
        SUY.A00 = c6fq;
        C05290Qb A07 = C12260kU.A00.A07();
        C6BS c6bs = C6BS.A02;
        android.net.Uri A012 = C6BX.A01(AbstractC25227BEk.A0B(A0s), true);
        String str = userSession.token;
        float f = IgCropActivity.A02;
        Intent A08 = MSW.A08(context, IgCropActivity.class);
        A08.putExtra("", A012);
        A08.putExtra("IgSessionManager.SESSION_TOKEN_KEY", str);
        A07.A0G(context, A08);
        return null;
    }
}
