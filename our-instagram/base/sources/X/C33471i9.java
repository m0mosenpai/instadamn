package X;

import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import com.instagram.debug.devoptions.metadata.view.ThreadMetadataOverrideFragment;
import com.instagram.debug.devoptions.signalsplayground.fragment.CreatorInspirationSignalsPlaygroundTestUsersFragment;

/* renamed from: X.1i9, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C33471i9 implements InterfaceC29301b7 {
    public static final C0KV A01 = C33481iA.A00;
    public final UserSession A00;

    @Override // X.InterfaceC29301b7
    public final /* bridge */ /* synthetic */ boolean CfR(C1OW c1ow, MNP mnp) {
        return true;
    }

    @Override // X.InterfaceC29301b7
    public final /* bridge */ /* synthetic */ void ENr(C19260xA c19260xA, InterfaceC37261GbE interfaceC37261GbE, C1OW c1ow) {
        String str;
        C33451i7 c33451i7 = (C33451i7) c1ow;
        C14360o3.A0B(c33451i7, 0);
        C14360o3.A0B(interfaceC37261GbE, 2);
        UserSession userSession = this.A00;
        C32222EDv c32222EDv = new C32222EDv(userSession, interfaceC37261GbE);
        String str2 = c33451i7.A02;
        if (str2 != null) {
            String str3 = c33451i7.A01;
            if (str3 != null) {
                String str4 = c33451i7.A00;
                if (str4 != null) {
                    C25621Ms c25621Ms = new C25621Ms(userSession, -2);
                    c25621Ms.A05();
                    c25621Ms.A0B("direct_v2/threads/broadcast/share_thread_entry_point_info/");
                    c25621Ms.A0R(C40781ul.class, C55702hA.class);
                    c25621Ms.A9s(ThreadMetadataOverrideFragment.BUNDLE_THREAD_ID, str2);
                    c25621Ms.A9s(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, "igme");
                    c25621Ms.A9s("ig_business_id", str4);
                    c25621Ms.A9s("entry_point_info", str3);
                    c25621Ms.A9s(CreatorInspirationSignalsPlaygroundTestUsersFragment.INTENT_EXTRA_USER_ID, userSession.userId);
                    C1ON A0N = c25621Ms.A0N();
                    A0N.A00 = c32222EDv;
                    C1GJ.A03(A0N);
                    return;
                }
                str = "recipientId";
            } else {
                str = "referralParam";
            }
        } else {
            str = "threadId";
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    public C33471i9(UserSession userSession) {
        this.A00 = userSession;
    }
}
