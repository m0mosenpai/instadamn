package X;

import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import com.instagram.user.model.User;

/* renamed from: X.77V, reason: invalid class name */
/* loaded from: classes3.dex */
public abstract class C77V {
    public static final void A00(UserSession userSession, final C77U c77u, User user, String str, boolean z) {
        User user2;
        final C006802i c006802i = C006802i.A0p;
        c006802i.markerStart(190452164);
        c006802i.markerAnnotate(190452164, "can_bypass_cache", z);
        c006802i.markerAnnotate(190452164, ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, str);
        C06090Tz c06090Tz = C06090Tz.A05;
        if (C18U.A06(c06090Tz, userSession, 36319772463341233L)) {
            user2 = AnonymousClass189.A00(userSession).A02(user.getId());
        } else {
            user2 = null;
        }
        boolean z2 = false;
        boolean z3 = false;
        if (user2 != null) {
            z3 = true;
        }
        c006802i.markerAnnotate(190452164, "has_cached_user", z3);
        if (user2 == null || (z && user2.A03.CZk() == null && C18U.A06(c06090Tz, userSession, 2342161905503968010L))) {
            c006802i.markerPoint(190452164, "fetching_creator_info_with_cache_bypass");
            AbstractC2046593z.A00(new C1P1() { // from class: X.76t
                @Override // X.C1P1
                public final void onFail(AbstractC115105If abstractC115105If) {
                    String str2;
                    int A03 = C0f9.A03(372508369);
                    C14360o3.A0B(abstractC115105If, 0);
                    C40781ul c40781ul = (C40781ul) abstractC115105If.A00();
                    if (c40781ul == null || (str2 = c40781ul.getErrorMessage()) == null) {
                        str2 = "";
                    }
                    C0w9.A03("CreatorUtil", AnonymousClass001.A0R("Could not fetch Creator Info: ", str2));
                    c006802i.markerEnd(190452164, (short) 3);
                    C0f9.A0A(-1020491179, A03);
                }

                @Override // X.C1P1
                public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
                    boolean z4;
                    InterfaceC224116z Asx;
                    InterfaceC224116z Asx2;
                    int A03 = C0f9.A03(1033932109);
                    AnonymousClass940 anonymousClass940 = (AnonymousClass940) obj;
                    int A032 = C0f9.A03(1050683860);
                    C14360o3.A0B(anonymousClass940, 0);
                    User user3 = anonymousClass940.A00;
                    if (user3 != null && (Asx2 = user3.A03.Asx()) != null) {
                        Asx2.At2();
                    }
                    User user4 = anonymousClass940.A00;
                    if (user4 != null && (Asx = user4.A03.Asx()) != null) {
                        z4 = C14360o3.A0K(Asx.CRv(), true);
                    } else {
                        z4 = false;
                    }
                    c77u.DNA(z4);
                    c006802i.markerEnd(190452164, (short) 2);
                    C0f9.A0A(2087124955, A032);
                    C0f9.A0A(-1121015738, A03);
                }
            }, userSession, user, str, false);
            c77u.DNA(false);
        } else {
            InterfaceC224116z Asx = user2.A03.Asx();
            if (Asx != null) {
                z2 = C14360o3.A0K(Asx.CRv(), true);
            }
            c77u.DNA(z2);
            c006802i.markerEnd(190452164, (short) 2);
        }
    }
}
