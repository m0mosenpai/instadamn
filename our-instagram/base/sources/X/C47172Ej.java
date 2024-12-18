package X;

import android.content.Context;
import android.content.Intent;
import com.instagram.common.session.UserSession;

/* renamed from: X.2Ej, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C47172Ej implements InterfaceC41501vz {
    public static C47172Ej A00;
    public static final C47182Ek A01 = new Object();

    @Override // X.InterfaceC41501vz
    public final /* bridge */ /* synthetic */ void onEvent(Object obj) {
        UserSession userSession;
        int A03 = C0f9.A03(1743146945);
        int A032 = C0f9.A03(-1478082940);
        Context context = AbstractC12290kX.A00;
        C14360o3.A07(context);
        AbstractC18680vv A05 = C023409i.A0A.A05(this);
        String str = null;
        if ((A05 instanceof UserSession) && (userSession = (UserSession) A05) != null) {
            str = userSession.userId;
        }
        Intent intent = new Intent("Armadillo.ACTION_FOREGROUND_SESSION_CHANGED");
        intent.putExtra("Armadillo.EXTRA_FOREGROUND_USER_ID", str);
        intent.setPackage("com.instagram.android");
        C0b3.A00().A07().A0C(context, intent);
        C0f9.A0A(-988917450, A032);
        C0f9.A0A(1493865941, A03);
    }
}
