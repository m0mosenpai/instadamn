package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.1mP, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC36051mP {
    public static final C0KV A00 = new C25951Oc(new InterfaceC25941Ob() { // from class: X.1mQ
        @Override // X.InterfaceC25941Ob
        public final /* bridge */ /* synthetic */ C1ON AES(UserSession userSession, C1OW c1ow) {
            C25621Ms c25621Ms = new C25621Ms(userSession);
            c25621Ms.A05();
            String str = ((C36031mN) c1ow).A01;
            str.getClass();
            c25621Ms.A0L("direct_v2/users/%s/pseudo_unblock_messages/", str);
            c25621Ms.A0S(C40781ul.class, C55702hA.class);
            c25621Ms.A0R = true;
            return c25621Ms.A0N();
        }
    });
}
