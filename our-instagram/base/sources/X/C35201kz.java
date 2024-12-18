package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.direct.DirectThreadKey;

/* renamed from: X.1kz, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C35201kz implements InterfaceC29301b7 {
    public static final C0KV A02 = C35211l0.A00;
    public final UserSession A00;
    public final InterfaceC09390do A01 = AbstractC09440dt.A00(EnumC09460dv.A02, new MHR(this, 24));

    @Override // X.InterfaceC29301b7
    public final /* bridge */ /* synthetic */ boolean CfR(C1OW c1ow, MNP mnp) {
        return true;
    }

    @Override // X.InterfaceC29301b7
    public final /* bridge */ /* synthetic */ void ENr(C19260xA c19260xA, InterfaceC37261GbE interfaceC37261GbE, C1OW c1ow) {
        String str;
        C35181kx c35181kx = (C35181kx) c1ow;
        C14360o3.A0B(c35181kx, 0);
        C14360o3.A0B(interfaceC37261GbE, 2);
        EnumC159397Cz enumC159397Cz = c35181kx.A00;
        if (enumC159397Cz != null) {
            if (enumC159397Cz.A00()) {
                LE3 le3 = (LE3) this.A01.getValue();
                DirectThreadKey directThreadKey = c35181kx.A01;
                if (directThreadKey != null && c35181kx.A02 != null) {
                    String str2 = c35181kx.A05;
                    EnumC159397Cz enumC159397Cz2 = c35181kx.A00;
                    if (enumC159397Cz2 != null) {
                        boolean z = false;
                        if (enumC159397Cz2 == EnumC159397Cz.A05) {
                            z = true;
                        }
                        LE3.A00(new C36425G5a(le3.A00, interfaceC37261GbE, ((C1OW) c35181kx).A05), c35181kx, le3, directThreadKey, str2, z);
                        return;
                    }
                } else {
                    interfaceC37261GbE.DUq(C114675Fx.A0c, null);
                    return;
                }
            } else {
                DirectThreadKey directThreadKey2 = c35181kx.A01;
                if (directThreadKey2 != null && (str = c35181kx.A02) != null) {
                    UserSession userSession = this.A00;
                    String str3 = directThreadKey2.A00;
                    if (str3 != null) {
                        JTa jTa = ((C1OW) c35181kx).A02;
                        String str4 = jTa.A03;
                        boolean z2 = jTa.A07;
                        C25621Ms c25621Ms = new C25621Ms(userSession);
                        c25621Ms.A0R = true;
                        c25621Ms.A05();
                        c25621Ms.A0L("direct_v2/visual_threads/%s/item_replayed/", str3);
                        c25621Ms.A9s("item_ids", AnonymousClass001.A0g("[", str, "]"));
                        c25621Ms.A0H("original_message_client_context", str4);
                        c25621Ms.A0J("is_shh_mode", z2);
                        c25621Ms.A0S(C40781ul.class, C55702hA.class);
                        C1ON A0N = c25621Ms.A0N();
                        A0N.A00 = AbstractC46987Kq6.A00(userSession, interfaceC37261GbE);
                        C1GJ.A03(A0N);
                        return;
                    }
                    throw new IllegalStateException("Required value was null.");
                }
                interfaceC37261GbE.DUq(C114675Fx.A0c, null);
                return;
            }
        }
        C14360o3.A0F("sendMode");
        throw C00O.createAndThrow();
    }

    public C35201kz(UserSession userSession) {
        this.A00 = userSession;
    }
}
