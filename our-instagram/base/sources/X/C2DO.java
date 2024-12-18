package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.instagram.common.notifications.push.intf.PushChannelType;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import java.lang.ref.WeakReference;

/* renamed from: X.2DO, reason: invalid class name */
/* loaded from: classes.dex */
public final class C2DO {
    public static final void A00(Context context, Drawable drawable, PushChannelType pushChannelType, UserSession userSession, ImageUrl imageUrl, ImageUrl imageUrl2, InterfaceC83713oG interfaceC83713oG, Long l, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, long j, boolean z, boolean z2, boolean z3, boolean z4) {
        C14360o3.A0B(context, 0);
        C14360o3.A0B(str2, 4);
        C14360o3.A0B(str3, 5);
        C14360o3.A0B(str4, 6);
        C14360o3.A0B(str9, 20);
        C2OG A01 = C2OG.A01();
        C14360o3.A07(A01);
        String str12 = C26771Rh.A00().A00;
        C14360o3.A07(str12);
        C32053E6f c32053E6f = new C32053E6f(pushChannelType, l, str12, str5, str2, str7, str9, str8, str10, str11, new WeakReference(userSession), z4, z3);
        C34648FOf c34648FOf = new C34648FOf(str, userSession.userId);
        c34648FOf.A0G = str6;
        c34648FOf.A0H = str3;
        c34648FOf.A03 = pushChannelType;
        c34648FOf.A04 = imageUrl;
        c34648FOf.A01 = drawable;
        c34648FOf.A06 = imageUrl2;
        c34648FOf.A0E = str4;
        c34648FOf.A0B = Long.valueOf(j);
        c34648FOf.A07 = c32053E6f;
        c34648FOf.A08 = new G8Y(userSession, A01, interfaceC83713oG, str8, str, z2, z);
        A01.A09(context, new C35129FeW(c34648FOf));
    }
}
