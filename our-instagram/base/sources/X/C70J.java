package X;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import com.facebook.R;
import com.instagram.avatars.store.AvatarStore;
import com.instagram.common.session.UserSession;
import com.instagram.profile.fragment.UserDetailFragment;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.70J, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C70J {
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0120, code lost:
    
        if (r0 != 5) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.util.ArrayList A00(android.app.Activity r25, android.content.Context r26, X.AbstractC10360h2 r27, X.AbstractC018607g r28, X.InterfaceC11380iw r29, com.instagram.common.session.UserSession r30, X.InterfaceC60442pS r31, X.C70J r32, com.instagram.profile.fragment.UserDetailFragment r33, com.instagram.user.model.User r34) {
        /*
            Method dump skipped, instructions count: 336
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C70J.A00(android.app.Activity, android.content.Context, X.0h2, X.07g, X.0iw, com.instagram.common.session.UserSession, X.2pS, X.70J, com.instagram.profile.fragment.UserDetailFragment, com.instagram.user.model.User):java.util.ArrayList");
    }

    public static final List A02(Activity activity, Context context, UserSession userSession) {
        C16930sl c16930sl = C16930sl.A00;
        if (C18U.A06(C06090Tz.A05, userSession, 36327430390364743L)) {
            AvatarStore A00 = C20Y.A00(userSession);
            Resources resources = context.getResources();
            boolean A0K = C14360o3.A0K(A00.A01.A00, C125535lz.A00);
            int i = 2131952272;
            if (A0K) {
                i = 2131961565;
            }
            String string = resources.getString(i);
            C14360o3.A07(string);
            return AbstractC001800i.A0T(new C206429Bz(new C57255Pbd(45, activity, userSession), string, R.drawable.instagram_avatars_pano_outline_24), c16930sl);
        }
        return c16930sl;
    }

    public static final ArrayList A01(Activity activity, Context context, AbstractC10360h2 abstractC10360h2, AbstractC018607g abstractC018607g, InterfaceC11380iw interfaceC11380iw, UserSession userSession, InterfaceC60442pS interfaceC60442pS, C70J c70j, UserDetailFragment userDetailFragment, User user) {
        String string = context.getResources().getString(2131973702);
        C14360o3.A07(string);
        C206429Bz c206429Bz = new C206429Bz(new C207319Fk(11, activity, interfaceC11380iw, userSession, userDetailFragment, user, c70j), string, R.drawable.instagram_direct_pano_outline_24);
        String string2 = context.getResources().getString(2131956836);
        C14360o3.A07(string2);
        ArrayList A1N = AbstractC16960so.A1N(c206429Bz, new C206429Bz(new C207319Fk(12, activity, abstractC10360h2, user, interfaceC60442pS, abstractC018607g, userSession), string2, R.drawable.instagram_link_pano_outline_24));
        if (C18U.A06(C06090Tz.A05, userSession, 36327335901805067L) || !AbstractC82073lT.A02(userSession)) {
            String string3 = context.getResources().getString(2131971202);
            C14360o3.A07(string3);
            A1N.add(new C206429Bz(new C207319Fk(10, activity, interfaceC11380iw, userSession, userDetailFragment, user, c70j), string3, R.drawable.instagram_scan_qr_pano_outline_24));
        }
        return A1N;
    }
}
