package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import com.instagram.model.androidlink.AndroidLink;
import java.util.List;

/* renamed from: X.35Y, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C35Y extends AnonymousClass346 {
    public final InterfaceC60442pS A00;
    public final C681335b A01;
    public final C681635e A02;
    public final C35Z A03;
    public final C681535d A04;

    @Override // X.AnonymousClass346, X.AnonymousClass347
    public final void Cu2(C59072n8 c59072n8, C38321qM c38321qM, C75113Zb c75113Zb) {
        C14360o3.A0B(c59072n8, 0);
        C14360o3.A0B(c38321qM, 1);
        if (AbstractC75423a9.A02(c38321qM, this.A00)) {
            c59072n8.A00(this.A03);
            c59072n8.A00(this.A04);
        }
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [X.35d] */
    /* JADX WARN: Type inference failed for: r0v4, types: [X.35e] */
    public C35Y(FragmentActivity fragmentActivity, final UserSession userSession, final InterfaceC60442pS interfaceC60442pS) {
        this.A00 = interfaceC60442pS;
        C62732tC c62732tC = AbstractC62712tA.A00(userSession).A00;
        C1BX c1bx = c62732tC.A00;
        C14360o3.A07(c1bx);
        this.A03 = new C35Z(fragmentActivity, c1bx, userSession, interfaceC60442pS);
        C1BX c1bx2 = c62732tC.A01;
        C14360o3.A07(c1bx2);
        this.A01 = new C681335b(fragmentActivity, c1bx2, userSession, interfaceC60442pS);
        this.A04 = new InterfaceC43071ya(userSession, interfaceC60442pS) { // from class: X.35d
            public static final InterfaceC08100bW A02 = new C1QF("IgSecureUriParser").A00;
            public final UserSession A00;
            public final InterfaceC60442pS A01;

            @Override // X.InterfaceC43071ya
            public final void ATP(C59062n7 c59062n7, InterfaceC57162jr interfaceC57162jr) {
                String str;
                EnumC906041v enumC906041v;
                String A01;
                android.net.Uri A00;
                String str2;
                String str3;
                String A012;
                C14360o3.A0B(c59062n7, 0);
                C14360o3.A0B(interfaceC57162jr, 1);
                UserSession userSession2 = this.A00;
                if (C18U.A06(C06090Tz.A05, userSession2, 36312174669202409L)) {
                    String str4 = null;
                    EnumC906041v enumC906041v2 = null;
                    if (interfaceC57162jr.CFq(c59062n7) == C05F.A0C) {
                        AndroidLink androidLink = (AndroidLink) AbstractC001800i.A0J(((C38321qM) c59062n7.A03).A3Y());
                        if (androidLink != null) {
                            str3 = androidLink.Aw8();
                            enumC906041v2 = AbstractC114965Hm.A01(androidLink);
                        } else {
                            str3 = null;
                        }
                        if (enumC906041v2 == EnumC906041v.AD_DESTINATION_SHOPPING_PDP && str3 != null && (A012 = C5L4.A01(androidLink)) != null) {
                            IBU.A01.A00(userSession2, A012);
                            return;
                        }
                        return;
                    }
                    if (interfaceC57162jr.CFq(c59062n7) != C05F.A00) {
                        return;
                    }
                    C38321qM c38321qM = (C38321qM) c59062n7.A03;
                    AndroidLink androidLink2 = (AndroidLink) AbstractC001800i.A0J(c38321qM.A3Y());
                    if (androidLink2 != null) {
                        str = androidLink2.Aw8();
                        enumC906041v = AbstractC114965Hm.A01(androidLink2);
                    } else {
                        str = null;
                        enumC906041v = null;
                    }
                    if (enumC906041v != EnumC906041v.AD_DESTINATION_SHOPPING_PDP || str == null || (A01 = C5L4.A01(androidLink2)) == null || (A00 = AbstractC08820cl.A00(A02, str)) == null) {
                        return;
                    }
                    String A07 = AbstractC41071vF.A07(userSession2, c38321qM);
                    if (A07 != null) {
                        str2 = AbstractC41071vF.A0F(userSession2, c38321qM);
                        str4 = c38321qM.getId();
                    } else {
                        str2 = null;
                    }
                    String A002 = C5L4.A00(androidLink2);
                    String queryParameter = A00.getQueryParameter(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY);
                    if (queryParameter == null) {
                        queryParameter = "";
                    }
                    IBU.A01.A01(userSession2, A01, A002, A07, str2, str4, this.A01.getModuleName(), queryParameter);
                }
            }

            {
                this.A00 = userSession;
                this.A01 = interfaceC60442pS;
            }
        };
        this.A02 = new InterfaceC43071ya(userSession, interfaceC60442pS) { // from class: X.35e
            public static final InterfaceC08100bW A02 = new C1QF("IgSecureUriParser").A00;
            public final UserSession A00;
            public final InterfaceC60442pS A01;

            @Override // X.InterfaceC43071ya
            public final void ATP(C59062n7 c59062n7, InterfaceC57162jr interfaceC57162jr) {
                String str;
                EnumC906041v enumC906041v;
                String A01;
                android.net.Uri A00;
                String str2;
                String str3;
                String A012;
                C14360o3.A0B(c59062n7, 0);
                C14360o3.A0B(interfaceC57162jr, 1);
                UserSession userSession2 = this.A00;
                if (C18U.A06(C06090Tz.A05, userSession2, 36312174669202409L)) {
                    Integer CFq = interfaceC57162jr.CFq(c59062n7);
                    C14360o3.A07(CFq);
                    if (CFq != C05F.A01) {
                        C38321qM c38321qM = (C38321qM) c59062n7.A03;
                        List AmB = c38321qM.A0C.AmB();
                        if (AmB != null && !AmB.isEmpty()) {
                            String str4 = null;
                            EnumC906041v enumC906041v2 = null;
                            if (CFq == C05F.A0C) {
                                AndroidLink androidLink = (AndroidLink) AbstractC001800i.A0J(((C38321qM) AmB.get(((C42C) c59062n7.A04).A00)).A3Y());
                                if (androidLink != null) {
                                    str3 = androidLink.Aw8();
                                    enumC906041v2 = AbstractC114965Hm.A01(androidLink);
                                } else {
                                    str3 = null;
                                }
                                if (enumC906041v2 == EnumC906041v.AD_DESTINATION_SHOPPING_PDP && str3 != null && (A012 = C5L4.A01(androidLink)) != null) {
                                    IBU.A01.A00(userSession2, A012);
                                    return;
                                }
                                return;
                            }
                            if (CFq != C05F.A00) {
                                return;
                            }
                            AndroidLink androidLink2 = (AndroidLink) AbstractC001800i.A0J(((C38321qM) AmB.get(((C42C) c59062n7.A04).A00)).A3Y());
                            if (androidLink2 != null) {
                                str = androidLink2.Aw8();
                                enumC906041v = AbstractC114965Hm.A01(androidLink2);
                            } else {
                                str = null;
                                enumC906041v = null;
                            }
                            if (enumC906041v != EnumC906041v.AD_DESTINATION_SHOPPING_PDP || str == null || (A01 = C5L4.A01(androidLink2)) == null || (A00 = AbstractC08820cl.A00(A02, str)) == null) {
                                return;
                            }
                            C14360o3.A0A(c38321qM);
                            String A07 = AbstractC41071vF.A07(userSession2, c38321qM);
                            if (A07 != null) {
                                str2 = AbstractC41071vF.A0F(userSession2, c38321qM);
                                str4 = c38321qM.getId();
                            } else {
                                str2 = null;
                            }
                            String A002 = C5L4.A00(androidLink2);
                            String queryParameter = A00.getQueryParameter(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY);
                            if (queryParameter == null) {
                                queryParameter = "";
                            }
                            IBU.A01.A01(userSession2, A01, A002, A07, str2, str4, this.A01.getModuleName(), queryParameter);
                        }
                    }
                }
            }

            {
                this.A00 = userSession;
                this.A01 = interfaceC60442pS;
            }
        };
    }
}
