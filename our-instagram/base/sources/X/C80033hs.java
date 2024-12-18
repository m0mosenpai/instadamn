package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.api.schemas.SocialContextType;
import com.instagram.common.session.UserSession;
import com.instagram.modal.ModalActivity;
import com.instagram.user.model.User;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* renamed from: X.3hs, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C80033hs implements InterfaceC80043ht {
    public final int A00;
    public final UserSession A01;
    public final InterfaceC75403a7 A02;
    public final InterfaceC87303un A03;
    public final C38321qM A04;
    public final InterfaceC60442pS A05;
    public final C75113Zb A06;
    public final C1M1 A07;

    public C80033hs(UserSession userSession, InterfaceC75403a7 interfaceC75403a7, InterfaceC87303un interfaceC87303un, C38321qM c38321qM, InterfaceC60442pS interfaceC60442pS, C75113Zb c75113Zb, C1M1 c1m1) {
        C14360o3.A0B(c38321qM, 1);
        C14360o3.A0B(c75113Zb, 2);
        C14360o3.A0B(interfaceC60442pS, 4);
        this.A04 = c38321qM;
        this.A06 = c75113Zb;
        this.A01 = userSession;
        this.A05 = interfaceC60442pS;
        this.A07 = c1m1;
        this.A03 = interfaceC87303un;
        this.A02 = interfaceC75403a7;
        this.A00 = c75113Zb.getPosition();
    }

    @Override // X.InterfaceC80043ht
    public final C51722Yv Apk(String str) {
        InterfaceC75403a7 interfaceC75403a7;
        EnumC65592xv enumC65592xv;
        C14360o3.A0B(str, 0);
        C38321qM c38321qM = this.A04;
        List A3n = c38321qM.A3n();
        Object obj = null;
        if (A3n != null) {
            Iterator it = A3n.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                if (C14360o3.A0K(((C84923qg) next).A0G, str)) {
                    obj = next;
                    break;
                }
            }
            C84923qg c84923qg = (C84923qg) obj;
            if (c84923qg != null && (interfaceC75403a7 = this.A02) != null) {
                boolean A03 = AbstractC65492xl.A00(this.A01).A03(c38321qM, EnumC65542xq.A04, this.A05.getModuleName());
                C75933ay c75933ay = C51722Yv.A02;
                C79233gU c79233gU = new C79233gU(c84923qg, c38321qM, this.A06, 0);
                C76623c7 A1a = c38321qM.A1a();
                if (A03) {
                    enumC65592xv = EnumC65592xv.A0f;
                } else {
                    enumC65592xv = EnumC65592xv.A0r;
                }
                return AbstractC27671CIq.A00(c75933ay, interfaceC75403a7, enumC65592xv, A1a, c79233gU);
            }
        }
        return C51722Yv.A02;
    }

    @Override // X.InterfaceC80043ht
    public final void D0W(SocialContextType socialContextType, int i, long j) {
        String str;
        C14360o3.A0B(socialContextType, 0);
        InterfaceC60442pS interfaceC60442pS = this.A05;
        UserSession userSession = this.A01;
        C1M1 c1m1 = this.A07;
        if (c1m1 == null || (str = c1m1.getSessionId()) == null) {
            str = "";
        }
        AbstractC37862GlH.A02(socialContextType, userSession, this.A04, interfaceC60442pS, str, null, this.A00, i, j, false);
    }

    @Override // X.InterfaceC80043ht
    public final void D2X(String str, String str2, boolean z, String str3) {
        UserSession userSession = this.A01;
        AbstractC25651Mw.A00(userSession).E4s(new C72433Mq(userSession, this.A04, this.A06, str3, str, str2, true));
    }

    @Override // X.InterfaceC80043ht
    public final void DHY(SocialContextType socialContextType, String str, int i, long j) {
        String str2;
        C14360o3.A0B(socialContextType, 2);
        InterfaceC60442pS interfaceC60442pS = this.A05;
        UserSession userSession = this.A01;
        C1M1 c1m1 = this.A07;
        if (c1m1 == null || (str2 = c1m1.getSessionId()) == null) {
            str2 = "";
        }
        AbstractC37862GlH.A05(socialContextType, userSession, this.A04, interfaceC60442pS, str2, null, str, this.A00, i, j, false);
    }

    @Override // X.InterfaceC80043ht
    public final void DK7(String str) {
        C25671My A00 = AbstractC25651Mw.A00(this.A01);
        C38321qM c38321qM = this.A04;
        String lowerCase = str.toLowerCase();
        C14360o3.A07(lowerCase);
        A00.E4s(new C72413Mo(null, null, c38321qM, lowerCase, false));
    }

    @Override // X.InterfaceC80043ht
    public final void DQj(FragmentActivity fragmentActivity, InterfaceC11380iw interfaceC11380iw, UserSession userSession, EnumC27426C8t enumC27426C8t, long j) {
        C14360o3.A0B(enumC27426C8t, 0);
        C14360o3.A0B(userSession, 2);
        C14360o3.A0B(interfaceC11380iw, 3);
        C14360o3.A0B(fragmentActivity, 4);
        int ordinal = enumC27426C8t.ordinal();
        if (ordinal != 2) {
            if (ordinal != 3) {
                if (ordinal != 4) {
                    if (ordinal != 0) {
                        if (ordinal == 1) {
                            C7JA.A01(fragmentActivity, userSession, "Friendly Feed Launchers", AbstractC111324zv.A00(1511), C3HM.A00(), C29744DAo.A00);
                            return;
                        }
                        throw new RuntimeException();
                    }
                    C3HM.A00();
                    AbstractC23111AHa.A02(fragmentActivity, userSession, null, "255779170859461", false);
                    return;
                }
                User A02 = AnonymousClass189.A00(userSession).A02(String.valueOf(j));
                if (A02 == null) {
                    return;
                }
                AbstractC35261Fgv.A04(fragmentActivity, userSession, new C33268EnP(), A02, AbstractC111324zv.A00(3118), interfaceC11380iw.getModuleName(), null, false);
                return;
            }
            User A022 = AnonymousClass189.A00(userSession).A02(String.valueOf(j));
            if (A022 == null) {
                return;
            }
            C28261Yl.A00.A00(fragmentActivity, fragmentActivity, userSession, A022, null, interfaceC11380iw.getModuleName(), null, A022.getUsername());
            return;
        }
        new C6XJ(fragmentActivity, AbstractC31364DqT.A03().A01.A01(userSession, AbstractC31402Dr6.A01(userSession, String.valueOf(j), "feed_social_context_bubble_long_press", interfaceC11380iw.getModuleName()).A03()), userSession, ModalActivity.class, "profile").A0C(fragmentActivity);
    }

    @Override // X.InterfaceC80043ht
    public final void DfW(SocialContextType socialContextType, int i, long j) {
        String str;
        C14360o3.A0B(socialContextType, 2);
        InterfaceC60442pS interfaceC60442pS = this.A05;
        UserSession userSession = this.A01;
        C1M1 c1m1 = this.A07;
        if (c1m1 == null || (str = c1m1.getSessionId()) == null) {
            str = "";
        }
        AbstractC37862GlH.A03(socialContextType, userSession, this.A04, interfaceC60442pS, str, null, this.A00, i, j, false);
    }

    @Override // X.InterfaceC80043ht
    public final void DnD(SocialContextType socialContextType, List list) {
        String str;
        C14360o3.A0B(socialContextType, 1);
        InterfaceC60442pS interfaceC60442pS = this.A05;
        UserSession userSession = this.A01;
        C1M1 c1m1 = this.A07;
        if (c1m1 == null || (str = c1m1.getSessionId()) == null) {
            str = "";
        }
        AbstractC37862GlH.A06(socialContextType, userSession, this.A04, interfaceC60442pS, str, null, list, this.A00, false);
    }

    @Override // X.InterfaceC80043ht
    public final void Dxx(String str) {
        C25671My A00 = AbstractC25651Mw.A00(this.A01);
        C38321qM c38321qM = this.A04;
        String lowerCase = str.toLowerCase(Locale.ROOT);
        C14360o3.A07(lowerCase);
        A00.E4s(new C72393Mm(null, null, c38321qM, lowerCase, false));
    }

    @Override // X.InterfaceC80043ht
    public final C51722Yv B5a() {
        C75933ay c75933ay = C51722Yv.A02;
        C76623c7 A1a = this.A04.A1a();
        return AbstractC77823e9.A00(EnumC71343Hv.A0j, c75933ay, this.A01, A1a, this.A05, Integer.valueOf(this.A06.A02), false, false);
    }

    @Override // X.InterfaceC80043ht
    public final void D65(String str, String str2, boolean z) {
        C32955Eem A00 = InterfaceC38901rP.A00.A00();
        A00.A0r = str;
        A00.A0t = str2;
        A00.A0E = Boolean.valueOf(z);
        C84923qg c84923qg = new C84923qg(A00.A00());
        InterfaceC87303un interfaceC87303un = this.A03;
        if (interfaceC87303un != null) {
            interfaceC87303un.D6F(c84923qg, this.A04, this.A06);
        }
    }

    @Override // X.InterfaceC80043ht
    public final void D6M(long j, int i, String str) {
        AbstractC25651Mw.A00(this.A01).E4s(new C72333Mg(EnumC120785dO.FEED_SOCIAL_CONTEXT_BUBBLE, this.A04, C05F.A00, str));
    }

    @Override // X.InterfaceC80043ht
    public final void DP3(long j, int i, boolean z) {
        String str;
        InterfaceC60442pS interfaceC60442pS = this.A05;
        UserSession userSession = this.A01;
        C1M1 c1m1 = this.A07;
        if (c1m1 == null || (str = c1m1.getSessionId()) == null) {
            str = "";
        }
        AbstractC37862GlH.A04(SocialContextType.A0C, userSession, this.A04, interfaceC60442pS, str, null, this.A00, i, j, false, z);
    }

    @Override // X.InterfaceC80043ht
    public final void DsX() {
        AbstractC25651Mw.A00(this.A01).E4s(new C72353Mi(this.A04, this.A06, false, false));
    }

    @Override // X.InterfaceC80043ht
    public final void Dy3(long j, int i) {
        AbstractC37862GlH.A07(this.A01, this.A04, this.A05, j, false);
    }
}
