package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.1mH, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC35971mH {
    public static final C0KV A00 = new C25951Oc(new InterfaceC25941Ob() { // from class: X.1mI
        @Override // X.InterfaceC25941Ob
        public final /* bridge */ /* synthetic */ C1ON AES(UserSession userSession, C1OW c1ow) {
            String str;
            C35951mF c35951mF = (C35951mF) c1ow;
            String str2 = c35951mF.A02;
            boolean z = c35951mF.A03;
            String str3 = c35951mF.A00.A0A;
            C14360o3.A0B(userSession, 0);
            C14360o3.A0B(str2, 1);
            C14360o3.A0B(str3, 3);
            C25621Ms c25621Ms = new C25621Ms(userSession, -2);
            c25621Ms.A05();
            Object[] objArr = {str2};
            if (z) {
                str = "direct_v2/users/%s/block_messages/";
            } else {
                str = "direct_v2/users/%s/unblock_messages/";
            }
            c25621Ms.A0L(str, objArr);
            c25621Ms.A9s("client_request_id", str3);
            c25621Ms.A0P(null, C40781ul.class, C55702hA.class, false);
            c25621Ms.A0R = true;
            return c25621Ms.A0N();
        }
    });
}
