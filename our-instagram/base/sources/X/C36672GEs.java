package X;

import android.content.Context;
import android.os.Bundle;
import com.instagram.common.session.UserSession;

/* renamed from: X.GEs, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36672GEs implements GYB {
    public final Context A00;
    public final UserSession A01;

    public static final void A00(C36672GEs c36672GEs) {
        C25621Ms A0M = AbstractC31173DnH.A0M(c36672GEs.A01);
        A0M.A0B("video_call/change_notification_settings/");
        A0M.A0D("push_option", 2);
        C1ON A0I = AbstractC31178DnM.A0I(A0M, C40781ul.class, C55702hA.class);
        C31702Dw7.A01(A0I, c36672GEs, 25);
        C1GJ.A03(A0I);
    }

    public C36672GEs(Context context, UserSession userSession) {
        this.A00 = context;
        this.A01 = userSession;
    }

    @Override // X.GYB
    public final void CJ8(android.net.Uri uri, Bundle bundle) {
        A00(this);
    }
}
