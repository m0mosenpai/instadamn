package X;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.modal.ModalActivity;
import com.instagram.model.fbusertag.FBUserTag;
import com.instagram.realtimeclient.GraphQLSubscriptionID;
import com.instagram.user.model.Product;

/* renamed from: X.7cm, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C166747cm implements InterfaceC60602pj, InterfaceC675232r {
    public C1M1 A00;
    public final Fragment A01;
    public final FragmentActivity A02;
    public final C25671My A03;
    public final InterfaceC41501vz A04;
    public final InterfaceC41501vz A05;
    public final InterfaceC41501vz A06;
    public final InterfaceC41501vz A07;
    public final InterfaceC41501vz A08;
    public final InterfaceC41501vz A09;
    public final InterfaceC41501vz A0A;
    public final InterfaceC41501vz A0B;
    public final InterfaceC41501vz A0C;
    public final InterfaceC41501vz A0D;
    public final UserSession A0E;
    public final C166847cw A0F;
    public final InterfaceC60442pS A0G;

    /* JADX WARN: Type inference failed for: r0v12, types: [X.7cw] */
    public C166747cm(Fragment fragment, UserSession userSession, InterfaceC60442pS interfaceC60442pS) {
        C14360o3.A0B(userSession, 3);
        this.A01 = fragment;
        this.A0G = interfaceC60442pS;
        this.A0E = userSession;
        this.A02 = fragment.requireActivity();
        this.A03 = AbstractC25651Mw.A00(userSession);
        this.A06 = new InterfaceC41501vz() { // from class: X.7cn
            @Override // X.InterfaceC41501vz
            public final /* bridge */ /* synthetic */ void onEvent(Object obj) {
                int A03 = C0f9.A03(-401233057);
                C72393Mm c72393Mm = (C72393Mm) obj;
                int A032 = C0f9.A03(1498883482);
                C14360o3.A0B(c72393Mm, 0);
                C38321qM c38321qM = c72393Mm.A02;
                String str = c72393Mm.A03;
                boolean z = c72393Mm.A04;
                C166747cm c166747cm = C166747cm.this;
                UserSession userSession2 = c166747cm.A0E;
                InterfaceC60442pS interfaceC60442pS2 = c166747cm.A0G;
                AbstractC41750IeP.A04(userSession2, c38321qM, interfaceC60442pS2, str, z);
                Fragment fragment2 = c166747cm.A01;
                AbstractC41750IeP.A00(fragment2, userSession2, c38321qM);
                C6XJ c6xj = new C6XJ(c166747cm.A02, AbstractC31364DqT.A03().A01.A01(userSession2, AbstractC31402Dr6.A02(userSession2, str, "media_mention", interfaceC60442pS2.getModuleName()).A03()), userSession2, ModalActivity.class, "profile");
                c6xj.A05 = "user_mention";
                c6xj.A0C(fragment2.requireContext());
                C0f9.A0A(1679359495, A032);
                C0f9.A0A(1444480840, A03);
            }
        };
        this.A05 = new InterfaceC41501vz() { // from class: X.7co
            @Override // X.InterfaceC41501vz
            public final /* bridge */ /* synthetic */ void onEvent(Object obj) {
                String str;
                String str2;
                int A03 = C0f9.A03(1730657867);
                C72413Mo c72413Mo = (C72413Mo) obj;
                int A032 = C0f9.A03(1699658660);
                C14360o3.A0B(c72413Mo, 0);
                C38321qM c38321qM = c72413Mo.A02;
                String str3 = c72413Mo.A03;
                boolean z = c72413Mo.A04;
                C166747cm c166747cm = C166747cm.this;
                UserSession userSession2 = c166747cm.A0E;
                InterfaceC60442pS interfaceC60442pS2 = c166747cm.A0G;
                AbstractC41750IeP.A03(userSession2, c38321qM, interfaceC60442pS2, str3, z);
                Fragment fragment2 = c166747cm.A01;
                AbstractC41750IeP.A00(fragment2, userSession2, c38321qM);
                Bundle bundle = new Bundle();
                bundle.putParcelable("HashtagFeedFragment.ARGUMENT_HASHTAG", AbstractC1120253r.A00(str3));
                bundle.putString("HashtagFeedFragment.ARGUMENT_ENTRY_MODULE", interfaceC60442pS2.getModuleName());
                if (z) {
                    str = "caption";
                } else {
                    str = GraphQLSubscriptionID.INAPP_NOTIFICATION_TYPE_COMMENT;
                }
                bundle.putString("HashtagFeedFragment.ARGUMENT_ENTRY_TRIGGER", str);
                C6XJ c6xj = new C6XJ(c166747cm.A02, bundle, userSession2, ModalActivity.class, "hashtag_feed");
                if (z) {
                    str2 = "media_caption_hashtag";
                } else {
                    str2 = "media_comments_hashtag";
                }
                c6xj.A05 = str2;
                c6xj.A0D = false;
                c6xj.A0C(fragment2.requireContext());
                C0f9.A0A(1303033928, A032);
                C0f9.A0A(-1678094000, A03);
            }
        };
        this.A07 = new InterfaceC41501vz() { // from class: X.7cp
            @Override // X.InterfaceC41501vz
            public final /* bridge */ /* synthetic */ void onEvent(Object obj) {
                String str;
                String str2;
                int A03 = C0f9.A03(-1463703112);
                C72333Mg c72333Mg = (C72333Mg) obj;
                int A032 = C0f9.A03(-1141547635);
                C14360o3.A0B(c72333Mg, 0);
                C38321qM c38321qM = c72333Mg.A01;
                String str3 = null;
                if (c38321qM != null) {
                    C166747cm c166747cm = C166747cm.this;
                    UserSession userSession2 = c166747cm.A0E;
                    C38321qM A1g = c38321qM.A1g(userSession2);
                    if (!A1g.A4k()) {
                        boolean z = false;
                        if (c72333Mg.A02 == C05F.A01) {
                            z = true;
                        }
                        InterfaceC60442pS interfaceC60442pS2 = c166747cm.A0G;
                        if (z) {
                            str = "caption";
                            str2 = null;
                        } else {
                            str = "preview_comment";
                            str2 = c72333Mg.A03;
                        }
                        AbstractC41750IeP.A02(userSession2, A1g, interfaceC60442pS2, str, str2);
                        Fragment fragment2 = c166747cm.A01;
                        AbstractC41750IeP.A00(fragment2, userSession2, A1g);
                        EnumC120785dO enumC120785dO = c72333Mg.A00;
                        String BqK = A1g.BqK();
                        String moduleName = interfaceC60442pS2.getModuleName();
                        String str4 = c72333Mg.A03;
                        boolean A02 = C2TN.A02(userSession2, A1g);
                        boolean isOrganicEligible = interfaceC60442pS2.isOrganicEligible();
                        boolean isSponsoredEligible = interfaceC60442pS2.isSponsoredEligible();
                        if (enumC120785dO == null) {
                            if (z) {
                                enumC120785dO = EnumC120785dO.EXPANDED_CAPTION;
                            } else {
                                enumC120785dO = EnumC120785dO.PREVIEW_COMMENT;
                            }
                        }
                        C1M1 c1m1 = c166747cm.A00;
                        if (c1m1 != null) {
                            str3 = c1m1.getSessionId();
                        }
                        AnonymousClass548.A00().A00().A00(fragment2.requireActivity(), null, new C26025BfE(enumC120785dO, null, 0, 0, null, null, null, BqK, null, moduleName, str4, null, null, str3, null, null, null, null, null, null, null, A1g.A0s(), A02, isOrganicEligible, isSponsoredEligible, false, false, false, false, false, A1g.A63(), false, false, false, false, false, false, false, false, A1g.A4t(), A1g.CdW(), false, false, false, false, false, false, false), userSession2, null, null, AbstractC22725A0v.A00(userSession2).booleanValue(), true, A1g.CdW());
                    }
                }
                C0f9.A0A(1305059978, A032);
                C0f9.A0A(-512737976, A03);
            }
        };
        this.A09 = new InterfaceC41501vz() { // from class: X.7cq
            @Override // X.InterfaceC41501vz
            public final /* bridge */ /* synthetic */ void onEvent(Object obj) {
                int A03 = C0f9.A03(462178672);
                C72373Mk c72373Mk = (C72373Mk) obj;
                int A032 = C0f9.A03(701643055);
                C14360o3.A0B(c72373Mk, 0);
                C166747cm c166747cm = C166747cm.this;
                C38321qM c38321qM = c72373Mk.A00;
                InterfaceC60442pS interfaceC60442pS2 = c166747cm.A0G;
                UserSession userSession2 = c166747cm.A0E;
                int i = -1;
                if (c38321qM.A5M()) {
                    i = 0;
                }
                C32U.A0Q(userSession2, c38321qM, interfaceC60442pS2, null, null, null, "number_of_likes", i);
                Fragment fragment2 = c166747cm.A01;
                AbstractC41750IeP.A00(fragment2, userSession2, c38321qM);
                FragmentActivity fragmentActivity = c166747cm.A02;
                Bundle bundle = new Bundle();
                bundle.putString("LikesListFragment.MEDIA_ID", c38321qM.getId());
                C6XJ c6xj = new C6XJ(fragmentActivity, bundle, userSession2, ModalActivity.class, "likers_list");
                c6xj.A05 = "media_likes";
                c6xj.A0C(fragment2.requireContext());
                C0f9.A0A(1600426780, A032);
                C0f9.A0A(1505863896, A03);
            }
        };
        this.A0D = new InterfaceC41501vz() { // from class: X.7cr
            @Override // X.InterfaceC41501vz
            public final /* bridge */ /* synthetic */ void onEvent(Object obj) {
                int A03 = C0f9.A03(-1888931444);
                C72363Mj c72363Mj = (C72363Mj) obj;
                int A032 = C0f9.A03(702783449);
                C14360o3.A0B(c72363Mj, 0);
                C38321qM c38321qM = c72363Mj.A00;
                C166747cm c166747cm = C166747cm.this;
                InterfaceC60442pS interfaceC60442pS2 = c166747cm.A0G;
                UserSession userSession2 = c166747cm.A0E;
                int i = -1;
                if (c38321qM.A5M()) {
                    i = 0;
                }
                C32U.A0Q(userSession2, c38321qM, interfaceC60442pS2, null, null, null, "number_of_views", i);
                Fragment fragment2 = c166747cm.A01;
                AbstractC41750IeP.A00(fragment2, userSession2, c38321qM);
                FragmentActivity fragmentActivity = c166747cm.A02;
                Bundle bundle = new Bundle();
                bundle.putString("LikesListFragment.MEDIA_ID", c38321qM.getId());
                C6XJ c6xj = new C6XJ(fragmentActivity, bundle, userSession2, ModalActivity.class, "likers_list");
                c6xj.A05 = "media_views";
                c6xj.A0C(fragment2.requireContext());
                C0f9.A0A(-1625664464, A032);
                C0f9.A0A(-1809195196, A03);
            }
        };
        this.A04 = new InterfaceC41501vz() { // from class: X.7cs
            @Override // X.InterfaceC41501vz
            public final /* bridge */ /* synthetic */ void onEvent(Object obj) {
                String str;
                AnonymousClass520 Ald;
                InterfaceC101404gy BeJ;
                int A03 = C0f9.A03(1325537559);
                C72353Mi c72353Mi = (C72353Mi) obj;
                int A032 = C0f9.A03(-775349098);
                C14360o3.A0B(c72353Mi, 0);
                C38321qM c38321qM = c72353Mi.A00;
                if (!c38321qM.A4k()) {
                    C75113Zb c75113Zb = c72353Mi.A01;
                    C166747cm c166747cm = C166747cm.this;
                    UserSession userSession2 = c166747cm.A0E;
                    InterfaceC60442pS interfaceC60442pS2 = c166747cm.A0G;
                    String str2 = null;
                    AbstractC41750IeP.A02(userSession2, c38321qM, interfaceC60442pS2, "comment_count", null);
                    Fragment fragment2 = c166747cm.A01;
                    AbstractC41750IeP.A00(fragment2, userSession2, c38321qM);
                    String BqK = c38321qM.BqK();
                    String moduleName = interfaceC60442pS2.getModuleName();
                    if (c72353Mi.A03 && (Ald = c38321qM.A0C.Ald()) != null && (BeJ = Ald.BeJ()) != null) {
                        str = BeJ.getPollId();
                    } else {
                        str = null;
                    }
                    boolean A02 = C2TN.A02(userSession2, c38321qM);
                    boolean isOrganicEligible = interfaceC60442pS2.isOrganicEligible();
                    boolean isSponsoredEligible = interfaceC60442pS2.isSponsoredEligible();
                    EnumC120785dO enumC120785dO = EnumC120785dO.VIEW_ALL_COMMENTS_FROM_SLIDE_THREAD;
                    C1M1 c1m1 = c166747cm.A00;
                    if (c1m1 != null) {
                        str2 = c1m1.getSessionId();
                    }
                    AnonymousClass548.A00().A00().A00(fragment2.requireActivity(), null, new C26025BfE(enumC120785dO, null, Integer.valueOf(c75113Zb.A03), Integer.valueOf(c75113Zb.getPosition()), null, Integer.valueOf(c75113Zb.A0W), null, BqK, null, moduleName, null, str, null, str2, null, null, null, null, null, null, null, c38321qM.A0s(), A02, isOrganicEligible, isSponsoredEligible, false, false, c75113Zb.A2U, false, false, c38321qM.A63(), false, false, false, false, false, false, false, false, c38321qM.A4t(), c38321qM.CdW(), false, false, false, false, false, false, false), userSession2, null, null, AbstractC22725A0v.A00(userSession2).booleanValue(), true, c38321qM.CdW());
                }
                C0f9.A0A(-129357920, A032);
                C0f9.A0A(-927352201, A03);
            }
        };
        this.A0C = new InterfaceC41501vz() { // from class: X.7ct
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:25:0x00ed  */
            /* JADX WARN: Removed duplicated region for block: B:27:0x00f5  */
            @Override // X.InterfaceC41501vz
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final /* bridge */ /* synthetic */ void onEvent(java.lang.Object r25) {
                /*
                    Method dump skipped, instructions count: 335
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C166817ct.onEvent(java.lang.Object):void");
            }
        };
        this.A0A = new InterfaceC41501vz() { // from class: X.7cu
            @Override // X.InterfaceC41501vz
            public final /* bridge */ /* synthetic */ void onEvent(Object obj) {
                InterfaceC60442pS interfaceC60442pS2;
                int A03 = C0f9.A03(369387372);
                C72313Me c72313Me = (C72313Me) obj;
                int A032 = C0f9.A03(1443655001);
                C14360o3.A0B(c72313Me, 0);
                C38321qM c38321qM = c72313Me.A01;
                String str = c72313Me.A02;
                C166747cm c166747cm = C166747cm.this;
                UserSession userSession2 = c166747cm.A0E;
                Fragment fragment2 = c166747cm.A01;
                C14360o3.A0A(c38321qM);
                AbstractC41750IeP.A00(fragment2, userSession2, c38321qM);
                if (C14360o3.A0K(str, userSession2.userId)) {
                    C28421Zd A033 = AbstractC31364DqT.A03();
                    C08790ch A00 = AbstractC018607g.A00(fragment2);
                    C38321qM A1g = c38321qM.A1g(userSession2);
                    interfaceC60442pS2 = c166747cm.A0G;
                    A033.A00(fragment2, A00, interfaceC60442pS2, null, null, userSession2, A1g);
                } else {
                    C28431Ze c28431Ze = AbstractC31364DqT.A03().A01;
                    interfaceC60442pS2 = c166747cm.A0G;
                    C6XJ c6xj = new C6XJ(c166747cm.A02, c28431Ze.A01(userSession2, AbstractC31402Dr6.A01(userSession2, str, "media_people_tag", interfaceC60442pS2.getModuleName()).A03()), userSession2, ModalActivity.class, "profile");
                    c6xj.A05 = "media_tagged_user";
                    c6xj.A0C(fragment2.requireContext());
                }
                AbstractC41750IeP.A01(userSession2, c38321qM, interfaceC60442pS2, str);
                C0f9.A0A(-34319552, A032);
                C0f9.A0A(789585059, A03);
            }
        };
        this.A08 = new InterfaceC41501vz() { // from class: X.7cv
            @Override // X.InterfaceC41501vz
            public final /* bridge */ /* synthetic */ void onEvent(Object obj) {
                int A03 = C0f9.A03(883596158);
                C72323Mf c72323Mf = (C72323Mf) obj;
                int A032 = C0f9.A03(1368735359);
                C14360o3.A0B(c72323Mf, 0);
                C38321qM c38321qM = c72323Mf.A00;
                FBUserTag fBUserTag = c72323Mf.A01;
                C166747cm c166747cm = C166747cm.this;
                UserSession userSession2 = c166747cm.A0E;
                Fragment fragment2 = c166747cm.A01;
                AbstractC41750IeP.A00(fragment2, userSession2, c38321qM);
                if (!fBUserTag.A04) {
                    AbstractC55229Oez.A0D(fragment2, userSession2, c38321qM, fBUserTag);
                }
                C0f9.A0A(-1674741224, A032);
                C0f9.A0A(-1584920711, A03);
            }
        };
        this.A0F = new InterfaceC42271xH() { // from class: X.7cw
            /* JADX WARN: Multi-variable type inference failed */
            @Override // X.InterfaceC41501vz
            public final /* bridge */ /* synthetic */ void onEvent(Object obj) {
                String str;
                Integer num;
                Integer num2;
                boolean z;
                Integer num3;
                int i;
                int A03 = C0f9.A03(1526803554);
                C72433Mq c72433Mq = (C72433Mq) obj;
                int A032 = C0f9.A03(-2014384225);
                C14360o3.A0B(c72433Mq, 0);
                C166747cm c166747cm = C166747cm.this;
                Fragment fragment2 = c166747cm.A01;
                if (fragment2 instanceof InterfaceC11480j6) {
                    C14360o3.A0C(fragment2, "null cannot be cast to non-null type com.instagram.common.analytics.intf.ExtraNavigationInfoModule");
                    C11520jB E6b = ((InterfaceC11480j6) fragment2).E6b();
                    if (E6b != null && C14360o3.A0K(c72433Mq.A02, E6b.A01(new C11500j9(C05F.A0u, "media_id")))) {
                        if (fragment2 instanceof InterfaceC60092or) {
                            C14360o3.A0C(fragment2, "null cannot be cast to non-null type com.instagram.base.fragment.ScrollToTopFragment");
                            ((InterfaceC60092or) fragment2).EMT();
                        }
                        i = -566899561;
                        C0f9.A0A(i, A032);
                        C0f9.A0A(2141456989, A03);
                    }
                }
                C38321qM c38321qM = c72433Mq.A01;
                C75113Zb c75113Zb = c72433Mq.A04;
                String str2 = c72433Mq.A02;
                InterfaceC60442pS interfaceC60442pS2 = c166747cm.A0G;
                String moduleName = interfaceC60442pS2.getModuleName();
                String str3 = c72433Mq.A05;
                UserSession userSession2 = c166747cm.A0E;
                boolean A02 = C2TN.A02(userSession2, c38321qM);
                boolean isOrganicEligible = interfaceC60442pS2.isOrganicEligible();
                boolean isSponsoredEligible = interfaceC60442pS2.isSponsoredEligible();
                EnumC120785dO enumC120785dO = EnumC120785dO.CAROUSEL_SLIDE_MENTION;
                C1M1 c1m1 = c166747cm.A00;
                if (c1m1 != null) {
                    str = c1m1.getSessionId();
                } else {
                    str = null;
                }
                if (c75113Zb != null) {
                    num = Integer.valueOf(c75113Zb.A03);
                    num2 = Integer.valueOf(c75113Zb.getPosition());
                    z = c75113Zb.A2U;
                    num3 = Integer.valueOf(c75113Zb.A0W);
                } else {
                    num = null;
                    num2 = null;
                    z = false;
                    num3 = null;
                }
                AnonymousClass548.A00().A00().A00(fragment2.requireActivity(), null, new C26025BfE(enumC120785dO, null, num, num2, null, num3, Integer.valueOf(c72433Mq.A00), str2, null, moduleName, str3, null, null, str, null, c38321qM.BqK(), null, null, null, null, null, c38321qM.A0s(), A02, isOrganicEligible, isSponsoredEligible, false, false, z, true, c72433Mq.A06, c38321qM.A63(), false, false, false, false, false, false, false, false, c38321qM.A4t(), c38321qM.CdW(), false, false, false, false, false, false, false), userSession2, null, null, AbstractC22725A0v.A00(userSession2).booleanValue(), true, c38321qM.CdW());
                i = 146573871;
                C0f9.A0A(i, A032);
                C0f9.A0A(2141456989, A03);
            }

            @Override // X.InterfaceC42271xH
            public final /* bridge */ /* synthetic */ boolean A79(Object obj) {
                return true;
            }
        };
        this.A0B = new InterfaceC41501vz() { // from class: X.7cx
            @Override // X.InterfaceC41501vz
            public final /* bridge */ /* synthetic */ void onEvent(Object obj) {
                int A03 = C0f9.A03(-2024633084);
                C72303Md c72303Md = (C72303Md) obj;
                int A032 = C0f9.A03(-1018270168);
                C14360o3.A0B(c72303Md, 0);
                C38321qM c38321qM = c72303Md.A01;
                C166747cm c166747cm = C166747cm.this;
                UserSession userSession2 = c166747cm.A0E;
                C38321qM A1g = c38321qM.A1g(userSession2);
                Product product = c72303Md.A02;
                Fragment fragment2 = c166747cm.A01;
                AbstractC41750IeP.A00(fragment2, userSession2, A1g);
                boolean CdW = A1g.CdW();
                InterfaceC60442pS interfaceC60442pS2 = c166747cm.A0G;
                if (CdW) {
                    AbstractC41665Ibx.A01(userSession2, c38321qM, A1g, interfaceC60442pS2, product);
                } else {
                    AbstractC41775Ier.A07(userSession2, c38321qM, interfaceC60442pS2, product, c72303Md.A05, c72303Md.A04);
                }
                C42130Ile A0L = C1XJ.A00.A0L(fragment2.requireActivity(), userSession2, interfaceC60442pS2, product, "tags", null);
                A0L.A02(A1g, Integer.valueOf(c38321qM.A16(userSession2)));
                A0L.A0Z = true;
                A0L.A0b = true;
                A0L.A08 = null;
                A0L.A05 = I7V.A00(A1g, product, c72303Md.A00);
                A0L.A0a = true;
                C42130Ile.A01(A0L);
                C0f9.A0A(842129996, A032);
                C0f9.A0A(-539071806, A03);
            }
        };
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void ADK(View view) {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void D8S(View view) {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onActivityResult(int i, int i2, Intent intent) {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onConfigurationChanged(Configuration configuration) {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onCreate() {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onDestroyView() {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onSaveInstanceState(Bundle bundle) {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onStart() {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onStop() {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onViewCreated(View view, Bundle bundle) {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onViewStateRestored(Bundle bundle) {
    }

    private final void A00() {
        C25671My c25671My = this.A03;
        c25671My.A02(this.A0B, C72303Md.class);
        c25671My.A02(this.A0A, C72313Me.class);
        c25671My.A02(this.A08, C72323Mf.class);
        c25671My.A02(this.A07, C72333Mg.class);
        c25671My.A02(this.A0C, C72343Mh.class);
        c25671My.A02(this.A04, C72353Mi.class);
        c25671My.A02(this.A0D, C72363Mj.class);
        c25671My.A02(this.A09, C72373Mk.class);
        c25671My.A02(this.A06, C72393Mm.class);
        c25671My.A02(this.A05, C72413Mo.class);
        c25671My.A02(this.A0F, C72433Mq.class);
    }

    @Override // X.InterfaceC60602pj
    public final void onResume() {
        C25671My c25671My = this.A03;
        c25671My.A01(this.A0B, C72303Md.class);
        c25671My.A01(this.A0A, C72313Me.class);
        c25671My.A01(this.A08, C72323Mf.class);
        c25671My.A01(this.A07, C72333Mg.class);
        c25671My.A01(this.A0C, C72343Mh.class);
        c25671My.A01(this.A04, C72353Mi.class);
        c25671My.A01(this.A0D, C72363Mj.class);
        c25671My.A01(this.A09, C72373Mk.class);
        c25671My.A01(this.A06, C72393Mm.class);
        c25671My.A01(this.A05, C72413Mo.class);
        c25671My.A01(this.A0F, C72433Mq.class);
    }

    @Override // X.InterfaceC60602pj
    public final void onDestroy() {
        A00();
    }

    @Override // X.InterfaceC60602pj
    public final void onPause() {
        A00();
    }
}
