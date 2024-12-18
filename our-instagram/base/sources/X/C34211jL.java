package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.1jL, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C34211jL implements InterfaceC29301b7 {
    public static final C0KV A01 = C34221jM.A00;
    public final UserSession A00;

    @Override // X.InterfaceC29301b7
    public final /* bridge */ /* synthetic */ boolean CfR(C1OW c1ow, MNP mnp) {
        return true;
    }

    @Override // X.InterfaceC29301b7
    public final /* bridge */ /* synthetic */ void ENr(C19260xA c19260xA, InterfaceC37261GbE interfaceC37261GbE, C1OW c1ow) {
        String str;
        C34191jJ c34191jJ = (C34191jJ) c1ow;
        C14360o3.A0B(c34191jJ, 0);
        C14360o3.A0B(interfaceC37261GbE, 2);
        UserSession userSession = this.A00;
        C32219EDs c32219EDs = new C32219EDs(userSession, interfaceC37261GbE);
        String str2 = c34191jJ.A02;
        if (str2 != null) {
            String str3 = c34191jJ.A01;
            if (str3 != null) {
                String str4 = c34191jJ.A03;
                if (str4 != null) {
                    C25621Ms c25621Ms = new C25621Ms(userSession, -2);
                    c25621Ms.A05();
                    c25621Ms.A0B("direct_v2/threads/notification_messages/update_user_optin_status/");
                    c25621Ms.A0R(C40781ul.class, C55702hA.class);
                    c25621Ms.A9s("token_ent_id_string", str2);
                    c25621Ms.A9s("thread_key_string", str3);
                    c25621Ms.A9s("user_action_type", str4);
                    C1ON A0N = c25621Ms.A0N();
                    A0N.A00 = c32219EDs;
                    C1GJ.A03(A0N);
                    return;
                }
                str = "userActionType";
            } else {
                str = "threadKeyString";
            }
        } else {
            str = "tokenEntIdString";
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    public C34211jL(UserSession userSession) {
        this.A00 = userSession;
    }
}
