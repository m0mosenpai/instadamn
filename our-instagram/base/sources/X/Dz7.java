package X;

import android.app.Activity;
import android.content.res.Resources;
import com.google.common.collect.ImmutableList;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.direct.fragment.cardgallery.repository.DirectCardGalleryRepository;
import com.instagram.direct.prompts.DirectPromptTypes;
import com.instagram.direct.thread.analytics.DirectThreadAnalyticsParams;
import com.instagram.direct.wellbeing.harmfulcontent.ondevicenudity.view.data.PrivacyMediaOverlayViewModel;
import com.instagram.model.direct.DirectThreadKey;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes6.dex */
public class Dz7 extends AbstractC52922bZ {
    public AnonymousClass195 A00;
    public final Resources A01;
    public final C2GT A02;
    public final C2GT A03;
    public final UserSession A04;
    public final C35039FcC A05;
    public final DirectCardGalleryRepository A06;
    public final AnonymousClass988 A07;
    public final C7IM A08;
    public final DirectThreadKey A09;
    public final String A0A;
    public final String A0B;
    public final String A0C;
    public final String A0D;
    public final InterfaceC09390do A0E;
    public final InterfaceC09390do A0F;
    public final InterfaceC09390do A0G;
    public final DirectThreadAnalyticsParams A0H;
    public final C75H A0I;
    public final List A0J;
    public final List A0K;

    public final void A06() {
        AnonymousClass195 anonymousClass195;
        AnonymousClass195 anonymousClass1952;
        if (this instanceof C32713Eae) {
            C32713Eae c32713Eae = (C32713Eae) this;
            synchronized (this) {
                String str = (String) c32713Eae.A06.A0T.getValue();
                if (str != null && ((anonymousClass1952 = c32713Eae.A00) == null || anonymousClass1952.CRW())) {
                    c32713Eae.A00 = AbstractC25226BEj.A1L(new PYc(c32713Eae, str, null, 21), AbstractC141776au.A00(c32713Eae));
                }
            }
        }
        if (this instanceof C32715Eag) {
            C32715Eag c32715Eag = (C32715Eag) this;
            synchronized (this) {
                String str2 = (String) c32715Eag.A06.A0T.getValue();
                if (str2 != null && ((anonymousClass195 = c32715Eag.A00) == null || anonymousClass195.CRW())) {
                    c32715Eag.A00 = AbstractC25226BEj.A1L(new PYc(c32715Eag, str2, null, 20), AbstractC141776au.A00(c32715Eag));
                }
            }
        }
    }

    public final synchronized void A07() {
        String str;
        if (this instanceof C32713Eae) {
            synchronized (this) {
                AnonymousClass195 anonymousClass195 = this.A00;
                if (anonymousClass195 == null || anonymousClass195.CRW()) {
                    this.A00 = AbstractC25226BEj.A1L(new GSR(this, null, 0), AbstractC141776au.A00(this));
                }
            }
        }
        if (this instanceof C32715Eag) {
            synchronized (this) {
                AnonymousClass195 anonymousClass1952 = this.A00;
                if (anonymousClass1952 == null || anonymousClass1952.CRW()) {
                    this.A00 = AbstractC25226BEj.A1L(new D4v(this, null, 48), AbstractC141776au.A00(this));
                }
            }
        } else if (this instanceof C32714Eaf) {
            C32714Eaf c32714Eaf = (C32714Eaf) this;
            synchronized (this) {
                AnonymousClass195 anonymousClass1953 = ((Dz7) c32714Eaf).A00;
                if ((anonymousClass1953 == null || anonymousClass1953.CRW()) && (str = c32714Eaf.A0B) != null) {
                    if (anonymousClass1953 != null) {
                        c32714Eaf.A02.Egh(C32720Eal.A00);
                    }
                    ((Dz7) c32714Eaf).A00 = AbstractC25226BEj.A1L(new PYc(c32714Eaf, str, null, 19), AbstractC141776au.A00(c32714Eaf));
                }
            }
        } else {
            synchronized (this) {
                AnonymousClass195 anonymousClass1954 = this.A00;
                if (anonymousClass1954 == null || anonymousClass1954.CRW()) {
                    this.A00 = AbstractC25226BEj.A1L(new D4v(this, null, 45), AbstractC141776au.A00(this));
                }
            }
        }
    }

    public final synchronized void A08() {
        AnonymousClass195 anonymousClass195 = this.A00;
        if (anonymousClass195 == null || anonymousClass195.CRW()) {
            this.A00 = AbstractC25226BEj.A1L(new D4v(this, null, 46), AbstractC141776au.A00(this));
        }
    }

    public final void A09(Activity activity, InterfaceC11380iw interfaceC11380iw, EnumC65855TvH enumC65855TvH, VG2 vg2, String str, String str2) {
        String str3;
        C81543kP c81543kP;
        C81543kP c81543kP2;
        String str4;
        String str5;
        int i;
        String str6;
        C14360o3.A0B(enumC65855TvH, 5);
        if (str != null && str2 != null && (str3 = this.A09.A00) != null) {
            UserSession userSession = this.A04;
            String str7 = this.A0D;
            LL1.A03(activity, interfaceC11380iw, userSession, C7D2.A01(str7), enumC65855TvH, vg2, str, this.A0C, str2, str3);
            String str8 = userSession.userId;
            InterfaceC09390do interfaceC09390do = this.A0G;
            int A03 = AbstractC31181DnP.A03(interfaceC09390do);
            C2EC c2ec = (C2EC) interfaceC09390do.getValue();
            if (c2ec != null) {
                c81543kP = AbstractC31172DnG.A0g(c2ec);
            } else {
                c81543kP = null;
            }
            boolean A06 = C160857It.A06(c81543kP, str8, A03);
            String str9 = userSession.userId;
            int A032 = AbstractC31181DnP.A03(interfaceC09390do);
            C2EC c2ec2 = (C2EC) interfaceC09390do.getValue();
            if (c2ec2 != null) {
                c81543kP2 = AbstractC31172DnG.A0g(c2ec2);
            } else {
                c81543kP2 = null;
            }
            boolean A05 = C160857It.A05(c81543kP2, str9, A032);
            if (C7D2.A01(str7) == DirectPromptTypes.A05) {
                C36298Fzs A0e = AbstractC31172DnG.A0e(this.A0E);
                C2ED c2ed = (C2ED) interfaceC09390do.getValue();
                if (c2ed != null) {
                    str4 = c2ed.C7I();
                } else {
                    str4 = null;
                }
                C2ED c2ed2 = (C2ED) interfaceC09390do.getValue();
                if (c2ed2 != null) {
                    str5 = c2ed2.C7q();
                } else {
                    str5 = null;
                }
                C2EE c2ee = (C2EE) interfaceC09390do.getValue();
                if (c2ee != null) {
                    i = c2ee.AdZ();
                } else {
                    i = 0;
                }
                Integer valueOf = Integer.valueOf(i);
                if (A06) {
                    str6 = "MODERATOR";
                } else if (A05) {
                    str6 = "COLLABORATOR";
                } else {
                    str6 = "VIEWER";
                }
                C36298Fzs.A03(null, A0e, valueOf, str4, str5, "challenge_submission_reported", "tap", "report_button", "challenge_view_submission_detail_sheet", AbstractC25233BEq.A0p("submission_id", str, AbstractC166987dD.A1L("user_type", str6)));
            }
        }
    }

    public final void A0A(String str) {
        C14360o3.A0B(str, 0);
        String str2 = this.A09.A00;
        if (str2 != null) {
            AbstractC166987dD.A1Z(new MBX(this, str2, str, (InterfaceC23621Ds) null, 14), AbstractC141776au.A00(this));
        }
    }

    public final void A0B(String str, boolean z, boolean z2) {
        String str2;
        if (z2 && (str2 = this.A0B) != null) {
            C35039FcC c35039FcC = this.A05;
            if (c35039FcC != null) {
                c35039FcC.A03(str2, str);
                return;
            }
            return;
        }
        AbstractC166987dD.A1Z(new PXZ(this, str, null, 5, z), AbstractC141776au.A00(this));
    }

    public Dz7(Resources resources, UserSession userSession, C35039FcC c35039FcC, DirectCardGalleryRepository directCardGalleryRepository, AnonymousClass988 anonymousClass988, C7IM c7im, C75H c75h, DirectThreadKey directThreadKey, String str, String str2, String str3, String str4, List list, List list2) {
        DirectThreadAnalyticsParams directThreadAnalyticsParams;
        AnonymousClass059 A02;
        ArrayList arrayList;
        String str5;
        PrivacyMediaOverlayViewModel privacyMediaOverlayViewModel;
        Long l;
        C910143t c910143t;
        C35039FcC c35039FcC2;
        AbstractC167027dH.A13(resources, userSession, directThreadKey);
        AbstractC167007dF.A1H(str2, 5, str4);
        C14360o3.A0B(directCardGalleryRepository, 8);
        C14360o3.A0B(c75h, 10);
        AbstractC25229BEm.A1L(anonymousClass988, 11, c7im);
        this.A01 = resources;
        this.A04 = userSession;
        this.A09 = directThreadKey;
        this.A0C = str;
        this.A0A = str2;
        this.A0B = str3;
        this.A0D = str4;
        this.A06 = directCardGalleryRepository;
        this.A0K = list;
        this.A0I = c75h;
        this.A07 = anonymousClass988;
        this.A08 = c7im;
        this.A0J = list2;
        this.A05 = c35039FcC;
        this.A0F = AbstractC09440dt.A01(C37051GUh.A00(this, 40));
        this.A0E = AbstractC09440dt.A01(C37051GUh.A00(this, 39));
        C17050sx A01 = AbstractC09440dt.A01(C37051GUh.A00(this, 43));
        this.A0G = A01;
        C2EC c2ec = (C2EC) A01.getValue();
        if (c2ec != null) {
            directThreadAnalyticsParams = AbstractC1578876x.A01(c2ec, false);
        } else {
            directThreadAnalyticsParams = null;
        }
        this.A0H = directThreadAnalyticsParams;
        A07();
        if (c35039FcC != null) {
            AbstractC166987dD.A1Z(new D4v(this, null, 44), AbstractC141776au.A00(this));
        }
        M9S m9s = new M9S(new InterfaceC19390xP[]{directCardGalleryRepository.A0U}, 0);
        C141796aw A00 = AbstractC141776au.A00(this);
        C10H c10h = C10I.A01;
        AnonymousClass059 A012 = AbstractC208910l.A01(new E62(null), A00, m9s, c10h);
        AnonymousClass191 anonymousClass191 = AnonymousClass191.A00;
        this.A02 = AbstractC58232lf.A00(anonymousClass191, A012);
        C0UO c0uo = directCardGalleryRepository.A0M;
        C0UO c0uo2 = directCardGalleryRepository.A0I;
        C0UO c0uo3 = directCardGalleryRepository.A0G;
        C0UO c0uo4 = directCardGalleryRepository.A0P;
        C0UO c0uo5 = directCardGalleryRepository.A0V;
        C0UO c0uo6 = directCardGalleryRepository.A0R;
        C0UO c0uo7 = directCardGalleryRepository.A0Q;
        C0UO c0uo8 = directCardGalleryRepository.A0K;
        C0UO c0uo9 = directCardGalleryRepository.A0T;
        C0UO c0uo10 = directCardGalleryRepository.A0L;
        if (str3 != null && (c35039FcC2 = this.A05) != null) {
            A02 = c35039FcC2.A01(str3);
        } else {
            A02 = AbstractC208910l.A02(AbstractC31171DnF.A0o());
        }
        C31199Dni c31199Dni = new C31199Dni(0, new InterfaceC19390xP[]{c0uo, c0uo2, c0uo3, c0uo4, c0uo5, c0uo6, c0uo7, c0uo8, c0uo9, c0uo10, A02, directCardGalleryRepository.A0H, directCardGalleryRepository.A0S, directCardGalleryRepository.A0W, directCardGalleryRepository.A0N, directCardGalleryRepository.A0O}, this);
        C141796aw A002 = AbstractC141776au.A00(this);
        C83403nh A04 = A04();
        C16930sl c16930sl = C16930sl.A00;
        if (list != null) {
            arrayList = AbstractC167007dF.A0i(list);
            int i = 0;
            for (Object obj : list) {
                int i2 = i + 1;
                if (i < 0) {
                    AbstractC16960so.A1U();
                    throw C00O.createAndThrow();
                }
                ImageUrl imageUrl = (ImageUrl) obj;
                if (list2 != null) {
                    str5 = (String) AbstractC001800i.A0O(list2, i);
                } else {
                    str5 = null;
                }
                if (A04 != null) {
                    ImmutableList A0H = A04.A0H();
                    if (A0H != null && (c910143t = (C910143t) AbstractC001800i.A0O(A0H, i)) != null) {
                        l = Long.valueOf(c910143t.A0K);
                    } else {
                        l = null;
                    }
                    C1575675q c1575675q = new C1575675q(userSession, A04, String.valueOf(l));
                    if (c1575675q.A06()) {
                        privacyMediaOverlayViewModel = c1575675q.A05(resources, false);
                        arrayList.add(new C45201Jzh(imageUrl, privacyMediaOverlayViewModel, str5));
                        i = i2;
                    }
                }
                privacyMediaOverlayViewModel = null;
                arrayList.add(new C45201Jzh(imageUrl, privacyMediaOverlayViewModel, str5));
                i = i2;
            }
        } else {
            arrayList = null;
        }
        this.A03 = AbstractC58232lf.A00(anonymousClass191, AbstractC208910l.A01(new C32055E6h(null, null, null, null, null, null, false, null, null, null, AbstractC166987dD.A1E(), c16930sl, c16930sl, c16930sl, arrayList, 0, false, false), A002, c31199Dni, c10h));
    }

    public static C32055E6h A00(Dz7 dz7) {
        return (C32055E6h) dz7.A03.A02();
    }

    public static C2EC A01(Dz7 dz7) {
        return (C2EC) dz7.A0G.getValue();
    }

    public static final void A02(C2EC c2ec, InterfaceC16660sJ interfaceC16660sJ) {
        if (c2ec != null) {
            interfaceC16660sJ.invoke(c2ec);
        } else {
            C18950wb.A00("DirectCardGalleryViewModel-thread is null", 20134884, false);
        }
    }

    public final C83403nh A04() {
        return C2JD.A00(this.A04).BSh(this.A09, this.A0C);
    }

    public final void A05() {
        if (this instanceof C32713Eae) {
            GWH.A01(A01(this), this, 17);
            return;
        }
        boolean z = this instanceof C32715Eag;
        C2EC A01 = A01(this);
        if (z) {
            GWH.A01(A01, this, 16);
        } else {
            GWH.A01(A01, this, 11);
        }
    }

    public final boolean A0C() {
        C32055E6h A00;
        if ((this instanceof C32715Eag) && (A00 = A00(this)) != null) {
            return AbstractC31177DnL.A1b(A00.A05);
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0011, code lost:
    
        if (r1 == 0) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean A0D() {
        /*
            r2 = this;
            com.instagram.direct.fragment.cardgallery.repository.DirectCardGalleryRepository r0 = r2.A06
            X.0UO r0 = r0.A0T
            java.lang.Object r0 = r0.getValue()
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            if (r0 == 0) goto L13
            int r1 = r0.length()
            r0 = 0
            if (r1 != 0) goto L14
        L13:
            r0 = 1
        L14:
            r0 = r0 ^ 1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Dz7.A0D():boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:101:0x022f, code lost:
    
        if (X.C18U.A06(X.C06090Tz.A05, r2, 36324247820054547L) == false) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x0245, code lost:
    
        if (r1.A01() != true) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00e2, code lost:
    
        if (r37 == null) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0153, code lost:
    
        if (X.AbstractC001800i.A0u(r68, r5) != true) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0194, code lost:
    
        if (r1.A1c() != false) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x01ad, code lost:
    
        if (X.C18U.A06(X.C06090Tz.A05, r2, 36324247820054547L) == false) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x01c3, code lost:
    
        if (r1.A01() != true) goto L82;
     */
    /* JADX WARN: Removed duplicated region for block: B:53:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01f9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public X.C32055E6h A03(X.C37838Gks r57, X.EnumC33345Eoe r58, com.instagram.user.model.User r59, java.lang.Boolean r60, java.lang.Boolean r61, java.lang.Boolean r62, java.lang.Boolean r63, java.lang.String r64, java.lang.String r65, java.lang.String r66, java.lang.String r67, java.util.ArrayList r68, java.util.List r69, int r70, boolean r71) {
        /*
            Method dump skipped, instructions count: 788
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Dz7.A03(X.Gks, X.Eoe, com.instagram.user.model.User, java.lang.Boolean, java.lang.Boolean, java.lang.Boolean, java.lang.Boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.ArrayList, java.util.List, int, boolean):X.E6h");
    }
}
