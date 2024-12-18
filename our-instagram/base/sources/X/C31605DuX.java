package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.model.direct.DirectThreadKey;

/* renamed from: X.DuX, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31605DuX extends AbstractC31602DuU {
    public final Context A00;
    public final UserSession A01;

    /* JADX WARN: Type inference failed for: r0v3, types: [X.1g9, X.1OW] */
    public static final void A00(C31605DuX c31605DuX, C3o9 c3o9, boolean z) {
        String str;
        DirectThreadKey A02 = JRE.A02(c3o9);
        if (A02 != null && (str = A02.A00) != null && str.length() != 0) {
            JZM.A01.A00(c31605DuX.A00, String.valueOf(AbstractC31172DnG.A15(c3o9)));
        }
        DirectThreadKey A01 = JRE.A01(c3o9);
        UserSession userSession = c31605DuX.A01;
        JTa jTa = new JTa(LCT.A00(userSession, A01), null, AbstractC68470VSb.A00(), null, null, "", C31276Doy.A00(userSession, C31276Doy.A01, C1g9.class), false, false, false, z);
        C14360o3.A0B(A01, 2);
        ?? c1ow = new C1OW(jTa);
        c1ow.A00 = A01;
        AbstractC31173DnH.A1U(userSession, c1ow);
        C162337Ov.A0j(userSession, A01);
        c31605DuX.A01(c3o9);
    }

    public C31605DuX(Context context, UserSession userSession) {
        super(userSession);
        this.A00 = context;
        this.A01 = userSession;
    }
}
