package X;

import android.content.Context;
import android.view.View;
import com.instagram.common.session.UserSession;
import java.util.HashMap;

/* renamed from: X.2uL, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C63382uL implements InterfaceC63392uM {
    public final UserSession A00;
    public final C57112jm A01;
    public final C63622uj A02;
    public final InterfaceC60442pS A03;
    public final C63582uf A04;
    public final C63442uR A05;
    public final InterfaceC63642ul A06;

    /* JADX WARN: Type inference failed for: r0v1, types: [X.2uR] */
    /* JADX WARN: Type inference failed for: r7v0, types: [X.2uS, java.lang.Object] */
    public C63382uL(Context context, InterfaceC11380iw interfaceC11380iw, UserSession userSession, C57112jm c57112jm, C1M1 c1m1) {
        InterfaceC63642ul interfaceC63642ul;
        C14360o3.A0B(c1m1, 2);
        this.A00 = userSession;
        this.A01 = c57112jm;
        final C63402uN c63402uN = new C63402uN(interfaceC11380iw, userSession, c1m1);
        C63412uO c63412uO = new C63412uO(c63402uN);
        this.A03 = c63412uO;
        this.A05 = new InterfaceC43071ya(c63402uN) { // from class: X.2uR
            public final C63402uN A00;

            @Override // X.InterfaceC43071ya
            public final void ATP(C59062n7 c59062n7, InterfaceC57162jr interfaceC57162jr) {
                String str;
                C14360o3.A0B(c59062n7, 0);
                C14360o3.A0B(interfaceC57162jr, 1);
                Object obj = c59062n7.A03;
                C47K c47k = (C47K) obj;
                if (interfaceC57162jr.CFq(c59062n7) == C05F.A00) {
                    HashMap hashMap = new HashMap();
                    String str2 = c47k.A0C;
                    if (str2 != null) {
                        hashMap.put("insertion_context", str2);
                    }
                    if (c47k.A04() != null) {
                        str = "preview";
                    } else {
                        if (c47k.A0M != null) {
                            str = "profile";
                        }
                        C63402uN c63402uN2 = this.A00;
                        C14360o3.A06(obj);
                        c63402uN2.A00((InterfaceC73233Pz) obj, hashMap, ((InterfaceC75123Zc) c59062n7.A04).getPosition());
                    }
                    hashMap.put("format", str);
                    C63402uN c63402uN22 = this.A00;
                    C14360o3.A06(obj);
                    c63402uN22.A00((InterfaceC73233Pz) obj, hashMap, ((InterfaceC75123Zc) c59062n7.A04).getPosition());
                }
            }

            {
                this.A00 = c63402uN;
            }
        };
        C1BX c1bx = AbstractC62712tA.A00(userSession).A00.A01;
        C14360o3.A07(c1bx);
        this.A04 = new C63582uf(context, c1bx, userSession, c63412uO, AbstractC63462uT.A00(userSession), new Object());
        this.A02 = new C63622uj();
        if (C18U.A06(C06090Tz.A05, userSession, 36320635752031009L)) {
            interfaceC63642ul = new C42714Iv9(new C64272vm(userSession, new C64252vk(userSession, new C42991Izh(c63412uO, c1m1), new C64232vi(), EnumC64222vh.A06), EnumC64262vl.A03));
        } else {
            interfaceC63642ul = new InterfaceC63642ul() { // from class: X.2uk
                @Override // X.InterfaceC63642ul
                public final /* synthetic */ void Cu1(C59072n8 c59072n8) {
                }
            };
        }
        this.A06 = interfaceC63642ul;
    }

    @Override // X.InterfaceC63392uM
    public final void A9W(InterfaceC73233Pz interfaceC73233Pz, InterfaceC75123Zc interfaceC75123Zc) {
        C14360o3.A0B(interfaceC73233Pz, 0);
        C14360o3.A0B(interfaceC75123Zc, 1);
        if (interfaceC73233Pz.getId() != null) {
            boolean A06 = C18U.A06(C06090Tz.A05, this.A00, 36318883405765371L);
            C47K c47k = (C47K) interfaceC73233Pz;
            String str = c47k.A0F;
            if (str == null) {
                str = "";
            }
            C59062n7 c59062n7 = C59062n7.A07;
            C59072n8 c59072n8 = new C59072n8(c47k, interfaceC75123Zc, str);
            if (A06) {
                C63582uf c63582uf = this.A04;
                c63582uf.A00 = interfaceC73233Pz;
                c59072n8.A00(c63582uf);
            }
            c59072n8.A00(this.A05);
            this.A06.Cu1(c59072n8);
            C63622uj c63622uj = this.A02;
            String str2 = c47k.A0F;
            if (str2 == null) {
                str2 = "";
            }
            c63622uj.A01(c59072n8.A01(), str2);
        }
    }

    @Override // X.InterfaceC63392uM
    public final void EDV(View view, InterfaceC73233Pz interfaceC73233Pz) {
        C14360o3.A0B(interfaceC73233Pz, 0);
        C14360o3.A0B(view, 1);
        if (interfaceC73233Pz.getId() != null) {
            C57112jm c57112jm = this.A01;
            C63622uj c63622uj = this.A02;
            String id = interfaceC73233Pz.getId();
            if (id != null) {
                c57112jm.A05(view, c63622uj.A00(id));
                return;
            }
            throw new IllegalStateException("Required value was null.");
        }
    }
}
