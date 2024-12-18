package X;

import android.content.Context;
import android.view.View;
import com.instagram.common.session.UserSession;
import java.util.LinkedHashMap;

/* renamed from: X.2ux, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C63762ux implements InterfaceC63392uM {
    public final C57112jm A00;
    public final C63622uj A01;
    public final Context A02;
    public final UserSession A03;
    public final InterfaceC60442pS A04;
    public final C63772uy A05;
    public final C63802v1 A06;
    public final C63792v0 A07;
    public final InterfaceC63642ul A08;

    @Override // X.InterfaceC63392uM
    public final void A9W(InterfaceC73233Pz interfaceC73233Pz, InterfaceC75123Zc interfaceC75123Zc) {
        UserSession userSession = this.A03;
        C06090Tz c06090Tz = C06090Tz.A05;
        boolean A06 = C18U.A06(c06090Tz, userSession, 36318883405175542L);
        String id = interfaceC73233Pz.getId();
        id.getClass();
        C59062n7 c59062n7 = C59062n7.A07;
        C59072n8 c59072n8 = new C59072n8(interfaceC73233Pz, interfaceC75123Zc, id);
        c59072n8.A00(this.A07);
        if (A06) {
            c59072n8.A00(this.A05);
        }
        if (interfaceC73233Pz.B5n() == C1XV.A0z && C18U.A06(c06090Tz, userSession, 36326266455013161L)) {
            c59072n8.A00(this.A06);
        }
        this.A08.Cu1(c59072n8);
        C63622uj c63622uj = this.A01;
        String id2 = interfaceC73233Pz.getId();
        id2.getClass();
        c63622uj.A01(c59072n8.A01(), id2);
    }

    @Override // X.InterfaceC63392uM
    public final void EDV(View view, InterfaceC73233Pz interfaceC73233Pz) {
        C57112jm c57112jm = this.A00;
        C63622uj c63622uj = this.A01;
        String id = interfaceC73233Pz.getId();
        id.getClass();
        c57112jm.A05(view, c63622uj.A00(id));
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [X.2v0] */
    /* JADX WARN: Type inference failed for: r0v3, types: [X.2v1] */
    /* JADX WARN: Type inference failed for: r8v0, types: [X.2uS, java.lang.Object] */
    public C63762ux(Context context, InterfaceC11380iw interfaceC11380iw, final UserSession userSession, C57112jm c57112jm, C1M1 c1m1) {
        InterfaceC63642ul interfaceC63642ul;
        this.A00 = c57112jm;
        this.A03 = userSession;
        this.A02 = context;
        final C63402uN c63402uN = new C63402uN(interfaceC11380iw, userSession, c1m1);
        C63412uO c63412uO = new C63412uO(c63402uN);
        this.A04 = c63412uO;
        C1BX c1bx = AbstractC62712tA.A00(userSession).A00.A01;
        C14360o3.A07(c1bx);
        this.A05 = new C63772uy(context, c1bx, userSession, c63412uO, AbstractC63462uT.A00(userSession), new Object());
        this.A07 = new InterfaceC43071ya(c63402uN) { // from class: X.2v0
            public final C63402uN A00;

            @Override // X.InterfaceC43071ya
            public final void ATP(C59062n7 c59062n7, InterfaceC57162jr interfaceC57162jr) {
                C14360o3.A0B(c59062n7, 0);
                C14360o3.A0B(interfaceC57162jr, 1);
                if (interfaceC57162jr.CFq(c59062n7) == C05F.A00) {
                    C63402uN c63402uN2 = this.A00;
                    Object obj = c59062n7.A03;
                    C14360o3.A06(obj);
                    InterfaceC73233Pz interfaceC73233Pz = (InterfaceC73233Pz) obj;
                    Object obj2 = c59062n7.A04;
                    C14360o3.A06(obj2);
                    InterfaceC75123Zc interfaceC75123Zc = (InterfaceC75123Zc) obj2;
                    C14360o3.A0B(interfaceC73233Pz, 0);
                    C14360o3.A0B(interfaceC75123Zc, 1);
                    c63402uN2.A00(interfaceC73233Pz, new LinkedHashMap(), interfaceC75123Zc.getPosition());
                }
            }

            {
                this.A00 = c63402uN;
            }
        };
        this.A06 = new InterfaceC43071ya(userSession) { // from class: X.2v1
            public final C25671My A00;

            {
                C14360o3.A0B(userSession, 1);
                this.A00 = AbstractC25651Mw.A00(userSession);
            }

            @Override // X.InterfaceC43071ya
            public final void ATP(C59062n7 c59062n7, InterfaceC57162jr interfaceC57162jr) {
                C25671My c25671My;
                InterfaceC41141vN c69b;
                C14360o3.A0B(c59062n7, 0);
                C14360o3.A0B(interfaceC57162jr, 1);
                Object obj = c59062n7.A03;
                C14360o3.A06(obj);
                InterfaceC38381qS interfaceC38381qS = (InterfaceC38381qS) obj;
                if (interfaceC57162jr.CFq(c59062n7) == C05F.A00) {
                    c25671My = this.A00;
                    c69b = new C69A(interfaceC38381qS.getId());
                } else {
                    if (interfaceC57162jr.CFq(c59062n7) != C05F.A0C) {
                        return;
                    }
                    c25671My = this.A00;
                    c69b = new C69B(interfaceC38381qS.getId());
                }
                c25671My.E4s(c69b);
            }
        };
        C14360o3.A0B(userSession, 0);
        C14360o3.A0B(c1m1, 1);
        if (C18U.A06(C06090Tz.A05, userSession, 36320635752031009L)) {
            interfaceC63642ul = new C42714Iv9(new C64272vm(userSession, new C64252vk(userSession, new C42990Izg(c63412uO, c1m1), new C64232vi(), EnumC64222vh.A06), EnumC64262vl.A03));
        } else {
            interfaceC63642ul = new InterfaceC63642ul() { // from class: X.2v2
                @Override // X.InterfaceC63642ul
                public final /* synthetic */ void Cu1(C59072n8 c59072n8) {
                }
            };
        }
        this.A08 = interfaceC63642ul;
        this.A01 = new C63622uj();
    }
}
