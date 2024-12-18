package X;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.fanclub.intf.UserPayFanclubUpsellParams;
import com.instagram.modal.ModalActivity;
import com.instagram.model.androidlink.AndroidLink;
import com.instagram.model.fbusertag.FBUserTag;
import com.instagram.model.hashtag.Hashtag;
import com.instagram.model.hashtag.HashtagImpl;
import com.instagram.profile.intf.UserDetailLaunchConfig;
import com.instagram.realtimeclient.GraphQLSubscriptionID;
import com.instagram.sponsored.analytics.SourceModelInfoParams;
import com.instagram.user.model.Product;
import com.instagram.user.model.User;
import java.util.List;

/* renamed from: X.32q, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C675132q implements InterfaceC60602pj, InterfaceC675232r {
    public static final C675332s A0T = new Object();
    public InterfaceC65232xL A00;
    public C81063jb A01;
    public InterfaceC61432r6 A02;
    public C1M1 A03;
    public String A04;
    public String A05;
    public boolean A06;
    public final Fragment A07;
    public final C675432t A08;
    public final C25671My A09;
    public final InterfaceC41501vz A0A;
    public final UserSession A0B;
    public final AnonymousClass337 A0C;
    public final AnonymousClass339 A0D;
    public final AnonymousClass331 A0E;
    public final C675732w A0F;
    public final C675532u A0G;
    public final C675832x A0H;
    public final AnonymousClass335 A0I;
    public final AnonymousClass338 A0J;
    public final C676032z A0K;
    public final C675632v A0L;
    public final C675932y A0M;
    public final AnonymousClass334 A0N;
    public final AnonymousClass336 A0O;
    public final AnonymousClass332 A0P;
    public final AnonymousClass330 A0Q;
    public final C24461Hp A0R;
    public final InterfaceC60442pS A0S;

    /* JADX WARN: Type inference failed for: r0v10, types: [X.32z] */
    /* JADX WARN: Type inference failed for: r0v11, types: [X.330] */
    /* JADX WARN: Type inference failed for: r0v12, types: [X.331] */
    /* JADX WARN: Type inference failed for: r0v13, types: [X.332] */
    /* JADX WARN: Type inference failed for: r0v15, types: [X.334] */
    /* JADX WARN: Type inference failed for: r0v16, types: [X.335] */
    /* JADX WARN: Type inference failed for: r0v17, types: [X.336] */
    /* JADX WARN: Type inference failed for: r0v18, types: [X.337] */
    /* JADX WARN: Type inference failed for: r0v19, types: [X.338] */
    /* JADX WARN: Type inference failed for: r0v20, types: [X.339] */
    /* JADX WARN: Type inference failed for: r0v5, types: [X.32u] */
    /* JADX WARN: Type inference failed for: r0v6, types: [X.32v] */
    /* JADX WARN: Type inference failed for: r0v7, types: [X.32w] */
    /* JADX WARN: Type inference failed for: r0v8, types: [X.32x] */
    /* JADX WARN: Type inference failed for: r0v9, types: [X.32y] */
    public C675132q(Fragment fragment, UserSession userSession, InterfaceC60442pS interfaceC60442pS) {
        C14360o3.A0B(interfaceC60442pS, 2);
        C14360o3.A0B(userSession, 3);
        this.A07 = fragment;
        this.A0S = interfaceC60442pS;
        this.A0B = userSession;
        this.A09 = AbstractC25651Mw.A00(userSession);
        this.A08 = new C675432t(userSession, interfaceC60442pS, this.A03);
        this.A0R = AbstractC24451Ho.A00(userSession);
        this.A0G = new InterfaceC42271xH() { // from class: X.32u
            @Override // X.InterfaceC42271xH
            public final /* bridge */ /* synthetic */ boolean A79(Object obj) {
                C72393Mm c72393Mm = (C72393Mm) obj;
                C14360o3.A0B(c72393Mm, 0);
                C675132q c675132q = C675132q.this;
                if (!C675132q.A01(c72393Mm.A02, c675132q, c72393Mm.A04) && !C675132q.A03(c675132q)) {
                    return false;
                }
                return true;
            }

            @Override // X.InterfaceC41501vz
            public final /* bridge */ /* synthetic */ void onEvent(Object obj) {
                int i;
                int A03 = C0f9.A03(263472007);
                C72393Mm c72393Mm = (C72393Mm) obj;
                int A032 = C0f9.A03(-2021979387);
                C14360o3.A0B(c72393Mm, 0);
                C38321qM c38321qM = c72393Mm.A02;
                String str = c72393Mm.A03;
                boolean z = c72393Mm.A04;
                C675132q c675132q = C675132q.this;
                UserSession userSession2 = c675132q.A0B;
                InterfaceC60442pS interfaceC60442pS2 = c675132q.A0S;
                AbstractC41750IeP.A04(userSession2, c38321qM, interfaceC60442pS2, str, z);
                AbstractC41750IeP.A05(c38321qM, c675132q.A00, C6T5.A00(), c675132q.A02, AnonymousClass317.A0Q);
                Fragment fragment2 = c675132q.A07;
                AbstractC41750IeP.A00(fragment2, userSession2, c38321qM);
                C38321qM A1g = c38321qM.A1g(userSession2);
                InterfaceC65232xL interfaceC65232xL = c675132q.A00;
                if (interfaceC65232xL != null) {
                    i = interfaceC65232xL.BRZ(A1g).A03;
                } else {
                    i = 0;
                }
                C31368DqX A02 = AbstractC31402Dr6.A02(userSession2, str, AbstractC111324zv.A00(4889), interfaceC60442pS2.getModuleName());
                A02.A0L = c675132q.A05;
                String id = A1g.getId();
                if (id != null) {
                    A02.A04 = new SourceModelInfoParams(id, -1, i);
                }
                if (c675132q.A06) {
                    FragmentActivity requireActivity = fragment2.requireActivity();
                    C6XJ c6xj = new C6XJ(requireActivity, AbstractC31364DqT.A03().A01.A01(userSession2, A02.A03()), userSession2, ModalActivity.class, "profile");
                    c6xj.A08();
                    c6xj.A0C(requireActivity);
                } else {
                    C675132q.A00(AbstractC31364DqT.A03().A01.A02(userSession2, A02.A03()), userSession2, c675132q, AbstractC111324zv.A00(551));
                }
                C0f9.A0A(542881157, A032);
                C0f9.A0A(1948586577, A03);
            }
        };
        this.A0L = new InterfaceC42271xH() { // from class: X.32v
            @Override // X.InterfaceC42271xH
            public final /* bridge */ /* synthetic */ boolean A79(Object obj) {
                C675132q c675132q = C675132q.this;
                if (!C675132q.A02(c675132q) && !C675132q.A03(c675132q)) {
                    return false;
                }
                return true;
            }

            @Override // X.InterfaceC41501vz
            public final /* bridge */ /* synthetic */ void onEvent(Object obj) {
                C0f9.A03(-1775673618);
                C0f9.A03(1280427380);
                throw new NullPointerException("getUserName");
            }
        };
        this.A0F = new InterfaceC42271xH() { // from class: X.32w
            @Override // X.InterfaceC42271xH
            public final /* bridge */ /* synthetic */ boolean A79(Object obj) {
                C72413Mo c72413Mo = (C72413Mo) obj;
                C14360o3.A0B(c72413Mo, 0);
                C675132q c675132q = C675132q.this;
                if (!C675132q.A01(c72413Mo.A02, c675132q, c72413Mo.A04) && !C675132q.A03(c675132q)) {
                    return false;
                }
                return true;
            }

            @Override // X.InterfaceC41501vz
            public final /* bridge */ /* synthetic */ void onEvent(Object obj) {
                String str;
                int i;
                int A03 = C0f9.A03(-729129568);
                C72413Mo c72413Mo = (C72413Mo) obj;
                int A032 = C0f9.A03(1460222098);
                C14360o3.A0B(c72413Mo, 0);
                C38321qM c38321qM = c72413Mo.A02;
                String str2 = c72413Mo.A03;
                boolean z = c72413Mo.A04;
                C675132q c675132q = C675132q.this;
                UserSession userSession2 = c675132q.A0B;
                InterfaceC60442pS interfaceC60442pS2 = c675132q.A0S;
                AbstractC41750IeP.A03(userSession2, c38321qM, interfaceC60442pS2, str2, z);
                AbstractC41750IeP.A05(c38321qM, c675132q.A00, C6T5.A00(), c675132q.A02, AnonymousClass317.A0B);
                Fragment fragment2 = c675132q.A07;
                AbstractC41750IeP.A00(fragment2, userSession2, c38321qM);
                C55772hI.A00(userSession2).A0A = c38321qM.A2u();
                if (c675132q.A06) {
                    FragmentActivity requireActivity = fragment2.requireActivity();
                    C6XJ c6xj = new C6XJ(requireActivity, WE2.A00(AbstractC1120253r.A00(str2), interfaceC60442pS2.getModuleName(), "DEFAULT"), userSession2, ModalActivity.class, "hashtag_feed");
                    c6xj.A08();
                    c6xj.A0C(requireActivity);
                } else {
                    HashtagImpl A00 = AbstractC1120253r.A00(str2);
                    String moduleName = interfaceC60442pS2.getModuleName();
                    if (z) {
                        str = "caption";
                    } else {
                        str = GraphQLSubscriptionID.INAPP_NOTIFICATION_TYPE_COMMENT;
                    }
                    Fragment A01 = WE2.A01(userSession2);
                    A01.setArguments(WE2.A00(A00, moduleName, str));
                    if (z) {
                        i = 4877;
                    } else {
                        i = 4878;
                    }
                    C675132q.A00(A01, userSession2, c675132q, AbstractC111324zv.A00(i));
                }
                C0f9.A0A(-425134405, A032);
                C0f9.A0A(907140509, A03);
            }
        };
        this.A0H = new InterfaceC42271xH() { // from class: X.32x
            @Override // X.InterfaceC42271xH
            public final /* bridge */ /* synthetic */ boolean A79(Object obj) {
                C675132q c675132q = C675132q.this;
                if (!C675132q.A02(c675132q) && !C675132q.A03(c675132q)) {
                    return false;
                }
                return true;
            }

            /* JADX WARN: Code restructure failed: missing block: B:28:0x007c, code lost:
            
                if (X.AnonymousClass471.A00(r6) != null) goto L29;
             */
            /* JADX WARN: Code restructure failed: missing block: B:42:0x00b4, code lost:
            
                if (X.C18U.A06(X.C06090Tz.A05, r4, 36328147649641713L) == false) goto L44;
             */
            /* JADX WARN: Code restructure failed: missing block: B:44:0x00b8, code lost:
            
                if (r13 != false) goto L46;
             */
            /* JADX WARN: Code restructure failed: missing block: B:45:0x00c9, code lost:
            
                r61 = false;
             */
            /* JADX WARN: Code restructure failed: missing block: B:47:0x00cf, code lost:
            
                if (r6.CdW() == false) goto L53;
             */
            /* JADX WARN: Code restructure failed: missing block: B:48:0x00d1, code lost:
            
                r54 = true;
             */
            /* JADX WARN: Code restructure failed: missing block: B:49:0x00de, code lost:
            
                if (X.C18U.A06(X.C06090Tz.A05, r4, 36330758989693961L) == false) goto L54;
             */
            /* JADX WARN: Code restructure failed: missing block: B:50:0x00e2, code lost:
            
                r1 = r3.A00;
             */
            /* JADX WARN: Code restructure failed: missing block: B:51:0x00e4, code lost:
            
                if (r1 == null) goto L85;
             */
            /* JADX WARN: Code restructure failed: missing block: B:52:0x00e6, code lost:
            
                r1 = r1.BRZ(r5);
             */
            /* JADX WARN: Code restructure failed: missing block: B:53:0x00ea, code lost:
            
                r21 = r6.BqK();
                r23 = r8.getModuleName();
             */
            /* JADX WARN: Code restructure failed: missing block: B:54:0x00f2, code lost:
            
                if (r15 == false) goto L79;
             */
            /* JADX WARN: Code restructure failed: missing block: B:55:0x00f4, code lost:
            
                r2 = null;
             */
            /* JADX WARN: Code restructure failed: missing block: B:56:0x00f6, code lost:
            
                r36 = X.C2TN.A02(r4, r6);
                r37 = r8.isOrganicEligible();
                r38 = r8.isSponsoredEligible();
                r3 = r3.A03;
             */
            /* JADX WARN: Code restructure failed: missing block: B:57:0x0104, code lost:
            
                if (r3 == null) goto L78;
             */
            /* JADX WARN: Code restructure failed: missing block: B:58:0x0106, code lost:
            
                r27 = r3.getSessionId();
             */
            /* JADX WARN: Code restructure failed: missing block: B:59:0x010a, code lost:
            
                if (r1 == null) goto L77;
             */
            /* JADX WARN: Code restructure failed: missing block: B:60:0x010c, code lost:
            
                r16 = java.lang.Integer.valueOf(r1.A03);
                r17 = java.lang.Integer.valueOf(r1.getPosition());
                r3 = r1.A2U;
                r19 = java.lang.Integer.valueOf(r1.A0W);
             */
            /* JADX WARN: Code restructure failed: missing block: B:61:0x0122, code lost:
            
                if (r15 != false) goto L76;
             */
            /* JADX WARN: Code restructure failed: missing block: B:63:0x0126, code lost:
            
                if (r0.A03 != null) goto L72;
             */
            /* JADX WARN: Code restructure failed: missing block: B:64:0x0128, code lost:
            
                r0 = (X.C9CG) X.AbstractC167967er.A00(r4).A00.get(r5.BqK());
             */
            /* JADX WARN: Code restructure failed: missing block: B:65:0x0138, code lost:
            
                if (r0 == null) goto L76;
             */
            /* JADX WARN: Code restructure failed: missing block: B:67:0x013c, code lost:
            
                if (r0.A03 == null) goto L76;
             */
            /* JADX WARN: Code restructure failed: missing block: B:68:0x013e, code lost:
            
                r43 = true;
             */
            /* JADX WARN: Code restructure failed: missing block: B:69:0x0140, code lost:
            
                X.AnonymousClass548.A00().A00().A00(r9.requireActivity(), null, new X.C26025BfE(r14, null, r16, r17, null, r19, null, r21, null, r23, r2, null, null, r27, null, null, null, null, X.AnonymousClass471.A03(r6), null, null, r6.A0s(), r36, r37, r38, false, false, r3, false, r43, r6.A63(), false, false, false, false, false, false, r51, false, r6.A4t(), r54, false, false, false, false, false, r60, r61), r4, null, null, X.AbstractC22725A0v.A00(r4).booleanValue(), false, r6.CdW());
             */
            /* JADX WARN: Code restructure failed: missing block: B:70:0x01be, code lost:
            
                r43 = false;
             */
            /* JADX WARN: Code restructure failed: missing block: B:71:0x01c1, code lost:
            
                r16 = null;
                r17 = null;
                r3 = false;
             */
            /* JADX WARN: Code restructure failed: missing block: B:72:0x01c8, code lost:
            
                r27 = null;
             */
            /* JADX WARN: Code restructure failed: missing block: B:73:0x01cc, code lost:
            
                r2 = r0.A03;
             */
            /* JADX WARN: Code restructure failed: missing block: B:74:0x01ce, code lost:
            
                if (r2 != null) goto L60;
             */
            /* JADX WARN: Code restructure failed: missing block: B:75:0x01d0, code lost:
            
                r2 = (X.C9CG) X.AbstractC167967er.A00(r4).A00.get(r5.BqK());
             */
            /* JADX WARN: Code restructure failed: missing block: B:76:0x01e0, code lost:
            
                if (r2 == null) goto L84;
             */
            /* JADX WARN: Code restructure failed: missing block: B:77:0x01e2, code lost:
            
                r2 = r2.A03;
             */
            /* JADX WARN: Code restructure failed: missing block: B:78:0x01e6, code lost:
            
                r2 = null;
             */
            /* JADX WARN: Code restructure failed: missing block: B:79:0x01e9, code lost:
            
                r1 = null;
             */
            /* JADX WARN: Code restructure failed: missing block: B:80:0x00e0, code lost:
            
                r54 = false;
             */
            /* JADX WARN: Code restructure failed: missing block: B:81:0x00ba, code lost:
            
                r61 = true;
             */
            /* JADX WARN: Code restructure failed: missing block: B:82:0x00c7, code lost:
            
                if (X.C18U.A06(X.C06090Tz.A05, r4, 36328147649707250L) != false) goto L49;
             */
            @Override // X.InterfaceC41501vz
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final /* bridge */ /* synthetic */ void onEvent(java.lang.Object r63) {
                /*
                    Method dump skipped, instructions count: 512
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C675832x.onEvent(java.lang.Object):void");
            }
        };
        this.A0M = new InterfaceC42271xH() { // from class: X.32y
            @Override // X.InterfaceC41501vz
            public final /* bridge */ /* synthetic */ void onEvent(Object obj) {
                String str;
                int A03 = C0f9.A03(-606921322);
                C72373Mk c72373Mk = (C72373Mk) obj;
                int A032 = C0f9.A03(39220146);
                C14360o3.A0B(c72373Mk, 0);
                C675132q c675132q = C675132q.this;
                C38321qM c38321qM = c72373Mk.A00;
                InterfaceC60442pS interfaceC60442pS2 = c675132q.A0S;
                UserSession userSession2 = c675132q.A0B;
                int i = -1;
                if (c38321qM.A5M()) {
                    i = 0;
                }
                C32U.A0Q(userSession2, c38321qM, interfaceC60442pS2, null, null, null, "number_of_likes", i);
                User CDj = c38321qM.A0C.CDj();
                if (CDj != null) {
                    str = CDj.getId();
                } else {
                    str = null;
                }
                C5M8.A02(userSession2, str, "number_of_likes_tapped");
                Fragment fragment2 = c675132q.A07;
                AbstractC41750IeP.A00(fragment2, userSession2, c38321qM);
                C675332s.A00(fragment2.getActivity(), interfaceC60442pS2, userSession2, c38321qM, c675132q.A00, "media_likes");
                C0f9.A0A(761124674, A032);
                C0f9.A0A(1363862846, A03);
            }

            @Override // X.InterfaceC42271xH
            public final /* bridge */ /* synthetic */ boolean A79(Object obj) {
                C675132q c675132q = C675132q.this;
                if (!C675132q.A02(c675132q) && !C675132q.A03(c675132q)) {
                    return false;
                }
                return true;
            }
        };
        this.A0K = new InterfaceC42271xH() { // from class: X.32z
            @Override // X.InterfaceC42271xH
            public final /* bridge */ /* synthetic */ boolean A79(Object obj) {
                C675132q c675132q = C675132q.this;
                if (!C675132q.A02(c675132q) && !C675132q.A03(c675132q)) {
                    return false;
                }
                return true;
            }

            @Override // X.InterfaceC41501vz
            public final /* bridge */ /* synthetic */ void onEvent(Object obj) {
                int A03 = C0f9.A03(-1271897043);
                C72383Ml c72383Ml = (C72383Ml) obj;
                int A032 = C0f9.A03(-914173978);
                C14360o3.A0B(c72383Ml, 0);
                C38321qM c38321qM = c72383Ml.A00;
                C675132q c675132q = C675132q.this;
                InterfaceC60442pS interfaceC60442pS2 = c675132q.A0S;
                UserSession userSession2 = c675132q.A0B;
                int i = -1;
                if (c38321qM.A5M()) {
                    i = 0;
                }
                C32U.A0Q(userSession2, c38321qM, interfaceC60442pS2, null, null, null, "number_of_mutual_followers", i);
                Fragment fragment2 = c675132q.A07;
                AbstractC41750IeP.A00(fragment2, userSession2, c38321qM);
                C82713mZ A04 = AbstractC82703mY.A04(c38321qM, interfaceC60442pS2, "gesture");
                A04.A0G(userSession2, c38321qM);
                A04.A0G(userSession2, c38321qM);
                A04.A7T = AbstractC111324zv.A00(1273);
                int i2 = -1;
                if (c38321qM.A5M()) {
                    i2 = 0;
                }
                C32U.A0E(userSession2, A04, c38321qM, interfaceC60442pS2, i2);
                C675332s.A00(fragment2.getActivity(), interfaceC60442pS2, userSession2, c38321qM, c675132q.A00, "media_followers");
                C0f9.A0A(-168665578, A032);
                C0f9.A0A(1681642853, A03);
            }
        };
        this.A0Q = new InterfaceC42271xH() { // from class: X.330
            @Override // X.InterfaceC41501vz
            public final /* bridge */ /* synthetic */ void onEvent(Object obj) {
                int A03 = C0f9.A03(590582993);
                C72363Mj c72363Mj = (C72363Mj) obj;
                int A032 = C0f9.A03(560188679);
                C14360o3.A0B(c72363Mj, 0);
                C38321qM c38321qM = c72363Mj.A00;
                C675132q c675132q = C675132q.this;
                InterfaceC60442pS interfaceC60442pS2 = c675132q.A0S;
                String A00 = AbstractC111324zv.A00(5008);
                UserSession userSession2 = c675132q.A0B;
                int i = -1;
                if (c38321qM.A5M()) {
                    i = 0;
                }
                C32U.A0Q(userSession2, c38321qM, interfaceC60442pS2, null, null, null, A00, i);
                Fragment fragment2 = c675132q.A07;
                AbstractC41750IeP.A00(fragment2, userSession2, c38321qM);
                C675332s.A00(fragment2.getActivity(), interfaceC60442pS2, userSession2, c38321qM, c675132q.A00, "media_views");
                C0f9.A0A(-652823306, A032);
                C0f9.A0A(-41683691, A03);
            }

            @Override // X.InterfaceC42271xH
            public final /* bridge */ /* synthetic */ boolean A79(Object obj) {
                C675132q c675132q = C675132q.this;
                if (!C675132q.A02(c675132q) && !C675132q.A03(c675132q)) {
                    return false;
                }
                return true;
            }
        };
        this.A0E = new InterfaceC42271xH() { // from class: X.331
            @Override // X.InterfaceC42271xH
            public final /* bridge */ /* synthetic */ boolean A79(Object obj) {
                C675132q c675132q = C675132q.this;
                if (!C675132q.A02(c675132q) && !C675132q.A03(c675132q)) {
                    return false;
                }
                return true;
            }

            /* JADX WARN: Code restructure failed: missing block: B:32:0x00c4, code lost:
            
                if (X.C18U.A06(X.C06090Tz.A05, r4, 36328147649641713L) == false) goto L33;
             */
            /* JADX WARN: Code restructure failed: missing block: B:34:0x00c8, code lost:
            
                if (r13 != false) goto L35;
             */
            /* JADX WARN: Code restructure failed: missing block: B:35:0x00d9, code lost:
            
                r65 = false;
             */
            /* JADX WARN: Code restructure failed: missing block: B:37:0x00df, code lost:
            
                if (r0.CdW() == false) goto L42;
             */
            /* JADX WARN: Code restructure failed: missing block: B:38:0x00e1, code lost:
            
                r58 = true;
             */
            /* JADX WARN: Code restructure failed: missing block: B:39:0x00ee, code lost:
            
                if (X.C18U.A06(X.C06090Tz.A05, r4, 36330758989693961L) == false) goto L43;
             */
            /* JADX WARN: Code restructure failed: missing block: B:40:0x00f2, code lost:
            
                r25 = r0.BqK();
                r27 = r8.getModuleName();
                r10 = null;
                r1 = (X.C9CG) X.AbstractC167967er.A00(r4).A00.get(r0.BqK());
             */
            /* JADX WARN: Code restructure failed: missing block: B:41:0x010d, code lost:
            
                if (r1 == null) goto L46;
             */
            /* JADX WARN: Code restructure failed: missing block: B:42:0x010f, code lost:
            
                r10 = r1.A03;
             */
            /* JADX WARN: Code restructure failed: missing block: B:44:0x0113, code lost:
            
                if (r5.A03 == false) goto L58;
             */
            /* JADX WARN: Code restructure failed: missing block: B:45:0x0115, code lost:
            
                r1 = r0.A0C.Ald();
             */
            /* JADX WARN: Code restructure failed: missing block: B:46:0x011b, code lost:
            
                if (r1 == null) goto L58;
             */
            /* JADX WARN: Code restructure failed: missing block: B:47:0x011d, code lost:
            
                r1 = r1.BeJ();
             */
            /* JADX WARN: Code restructure failed: missing block: B:48:0x0121, code lost:
            
                if (r1 == null) goto L58;
             */
            /* JADX WARN: Code restructure failed: missing block: B:49:0x0123, code lost:
            
                r29 = r1.getPollId();
             */
            /* JADX WARN: Code restructure failed: missing block: B:50:0x0127, code lost:
            
                r40 = X.C2TN.A02(r4, r0);
                r41 = r8.isOrganicEligible();
                r42 = r8.isSponsoredEligible();
                r1 = r3.A03;
             */
            /* JADX WARN: Code restructure failed: missing block: B:51:0x0135, code lost:
            
                if (r1 == null) goto L56;
             */
            /* JADX WARN: Code restructure failed: missing block: B:52:0x0137, code lost:
            
                r7 = r1.getSessionId();
             */
            /* JADX WARN: Code restructure failed: missing block: B:53:0x013b, code lost:
            
                r2 = r6.A03;
                r8 = r6.getPosition();
                r5 = r6.A2U;
                r3 = r6.A0W;
                X.AnonymousClass548.A00().A00().A00(r9.requireActivity(), null, new X.C26025BfE(r18, null, java.lang.Integer.valueOf(r2), java.lang.Integer.valueOf(r8), null, java.lang.Integer.valueOf(r3), null, r25, null, r27, r10, r29, null, r7, null, null, null, null, X.AnonymousClass471.A03(r0), null, null, r0.A0s(), r40, r41, r42, false, false, r5, false, false, r0.A63(), false, false, false, false, false, false, r55, false, r0.A4t(), r58, false, false, false, X.AnonymousClass471.A00.A05(r4, r0), false, r55, r65), r4, null, null, X.AbstractC22725A0v.A00(r4).booleanValue(), false, r0.CdW());
             */
            /* JADX WARN: Code restructure failed: missing block: B:54:0x01ce, code lost:
            
                r29 = null;
             */
            /* JADX WARN: Code restructure failed: missing block: B:55:0x00f0, code lost:
            
                r58 = false;
             */
            /* JADX WARN: Code restructure failed: missing block: B:56:0x00ca, code lost:
            
                r65 = true;
             */
            /* JADX WARN: Code restructure failed: missing block: B:57:0x00d7, code lost:
            
                if (X.C18U.A06(X.C06090Tz.A05, r4, 36328147649707250L) != false) goto L38;
             */
            @Override // X.InterfaceC41501vz
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final /* bridge */ /* synthetic */ void onEvent(java.lang.Object r67) {
                /*
                    Method dump skipped, instructions count: 473
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass331.onEvent(java.lang.Object):void");
            }
        };
        this.A0P = new InterfaceC42271xH() { // from class: X.332
            @Override // X.InterfaceC42271xH
            public final /* bridge */ /* synthetic */ boolean A79(Object obj) {
                C675132q c675132q = C675132q.this;
                if (!C675132q.A02(c675132q) && !C675132q.A03(c675132q)) {
                    return false;
                }
                return true;
            }

            /* JADX WARN: Code restructure failed: missing block: B:17:0x007d, code lost:
            
                if (X.C18U.A06(X.C06090Tz.A05, r8.A0B, 36330758989693961L) != false) goto L18;
             */
            /* JADX WARN: Multi-variable type inference failed */
            @Override // X.InterfaceC41501vz
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final /* bridge */ /* synthetic */ void onEvent(java.lang.Object r61) {
                /*
                    Method dump skipped, instructions count: 305
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass332.onEvent(java.lang.Object):void");
            }
        };
        this.A0A = new InterfaceC42271xH() { // from class: X.333
            @Override // X.InterfaceC42271xH
            public final /* bridge */ /* synthetic */ boolean A79(Object obj) {
                C675132q c675132q = C675132q.this;
                if (!C675132q.A02(c675132q) && !C675132q.A03(c675132q)) {
                    return false;
                }
                return true;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // X.InterfaceC41501vz
            public final /* bridge */ /* synthetic */ void onEvent(Object obj) {
                C65 c65;
                String str;
                EnumC222416a enumC222416a;
                UserPayFanclubUpsellParams userPayFanclubUpsellParams;
                UserDetailLaunchConfig A03;
                int i;
                String str2;
                int A032 = C0f9.A03(-1638393306);
                C72343Mh c72343Mh = (C72343Mh) obj;
                int A033 = C0f9.A03(-1785018239);
                C14360o3.A0B(c72343Mh, 0);
                C38321qM c38321qM = c72343Mh.A00;
                C675132q c675132q = C675132q.this;
                UserSession userSession2 = c675132q.A0B;
                C38321qM A1g = c38321qM.A1g(userSession2);
                User A2E = c38321qM.A2E(userSession2);
                User user = c72343Mh.A01;
                boolean equals = user.equals(A2E);
                C42546IsP c42546IsP = new C42546IsP(A1g, c38321qM, c675132q, c72343Mh);
                int A16 = c38321qM.A16(userSession2);
                if (A16 == -1) {
                    A16 = 0;
                }
                if (equals) {
                    if (c38321qM.A58()) {
                        c65 = C65.INFLUENCER;
                    } else {
                        c65 = C65.BRAND;
                    }
                } else {
                    c65 = C65.USER;
                }
                InterfaceC60442pS interfaceC60442pS2 = c675132q.A0S;
                boolean A2N = user.A2N();
                Integer valueOf = Integer.valueOf(A16);
                String str3 = null;
                if (C65.INFLUENCER == c65) {
                    str = "influencer_in_comments";
                } else {
                    str = null;
                }
                C32U.A0K(userSession2, c42546IsP, c65, A1g, interfaceC60442pS2, c675132q.A03, valueOf, str, A2N);
                Fragment fragment2 = c675132q.A07;
                AbstractC41750IeP.A00(fragment2, userSession2, c38321qM);
                EnumC222416a A0I = user.A0I();
                InterfaceC65232xL interfaceC65232xL = c675132q.A00;
                InterfaceC61432r6 interfaceC61432r6 = c675132q.A02;
                AnonymousClass317 anonymousClass317 = AnonymousClass317.A0J;
                if (A0I == null) {
                    enumC222416a = EnumC222416a.A08;
                } else {
                    enumC222416a = A0I;
                }
                AbstractC41750IeP.A05(c38321qM, interfaceC65232xL, new C6T6(null, null, "", enumC222416a.A02), interfaceC61432r6, anonymousClass317);
                if (!c38321qM.CdW()) {
                    c675132q.A0R.A06(c38321qM.BqK());
                }
                InterfaceC65232xL interfaceC65232xL2 = c675132q.A00;
                if (interfaceC65232xL2 != null) {
                    interfaceC65232xL2.BRZ(c38321qM);
                }
                INI ini = IBO.A00;
                if (!ini.A01(userSession2, c38321qM) && !ini.A00(userSession2, c38321qM)) {
                    InterfaceC65232xL interfaceC65232xL3 = c675132q.A00;
                    InterfaceC61432r6 interfaceC61432r62 = c675132q.A02;
                    AnonymousClass317 anonymousClass3172 = AnonymousClass317.A0K;
                    if (A0I == null) {
                        A0I = EnumC222416a.A08;
                    }
                    AbstractC41750IeP.A05(c38321qM, interfaceC65232xL3, new C6T6(null, null, "", A0I.A02), interfaceC61432r62, anonymousClass3172);
                } else {
                    Context context = fragment2.getContext();
                    if (context != null) {
                        C3MG.A00();
                        C3MF.A00(context, userSession2, c38321qM, new C42829Ix5(c38321qM, c675132q), "profile_username_caption");
                    }
                }
                if (c72343Mh.A04 && A2E != null && A2E.A03.B4O() != null) {
                    userPayFanclubUpsellParams = AbstractC35234FgS.A00(userSession2, A2E);
                } else {
                    userPayFanclubUpsellParams = null;
                }
                if (c38321qM.A1x() == EnumC76383bi.A0C && AbstractC151756sL.A01()) {
                    C84923qg A1V = c38321qM.A1V();
                    if (A1V != null) {
                        str2 = A1V.A0G;
                    } else {
                        str2 = null;
                    }
                    if (C14360o3.A0K(str2, c72343Mh.A03) && AbstractC151756sL.A00().A04(userSession2)) {
                        AbstractC151756sL.A00().A01().A04(fragment2.requireActivity(), userSession2, null, user.getId(), "profile_picture", true, false);
                        i = -1808416887;
                        C0f9.A0A(i, A033);
                        C0f9.A0A(-970844229, A032);
                    }
                }
                boolean CdW = A1g.CdW();
                String A00 = AbstractC111324zv.A00(1192);
                String A002 = AbstractC111324zv.A00(4897);
                if (CdW && AbstractC75103Za.A0Q(c38321qM, A16) && equals) {
                    C31368DqX A01 = AbstractC31402Dr6.A01(userSession2, user.getId(), A002, interfaceC60442pS2.getModuleName());
                    A01.A0L = c675132q.A05;
                    A01.A0N = c72343Mh.A03;
                    A01.A00 = userPayFanclubUpsellParams;
                    String id = A1g.getId();
                    if (id != null) {
                        A01.A04 = new SourceModelInfoParams(id, -1, A16);
                    }
                    if (new C154616xB(userSession2).A01(A1g.getId(), user.getId())) {
                        A01.A0O = A00;
                    }
                    A03 = A01.A03();
                    str3 = c72343Mh.A02;
                } else {
                    C31368DqX A012 = AbstractC31402Dr6.A01(userSession2, user.getId(), A002, interfaceC60442pS2.getModuleName());
                    A012.A0L = c675132q.A05;
                    A012.A0N = c72343Mh.A03;
                    A012.A00 = userPayFanclubUpsellParams;
                    Hashtag B7K = c38321qM.A0C.B7K();
                    if (fragment2 instanceof InterfaceC114465Eq) {
                        String A003 = AbstractC111324zv.A00(1141);
                        C14360o3.A0C(fragment2, A003);
                        InterfaceC114465Eq interfaceC114465Eq = (InterfaceC114465Eq) fragment2;
                        if (interfaceC114465Eq.BD4() != null) {
                            C14360o3.A0C(fragment2, A003);
                            B7K = interfaceC114465Eq.BD4();
                        }
                    }
                    if (B7K != null) {
                        A012.A03 = FAJ.A00(B7K);
                    }
                    if (equals) {
                        A012.A04 = new SourceModelInfoParams(c38321qM.BqK(), -1, A16);
                        if (A1g.A5P() && !A1g.CdW()) {
                            A012.A0O = "profile_clips";
                            A03 = A012.A03();
                        }
                    }
                    if (new C154616xB(userSession2).A01(A1g.getId(), user.getId()) && A1g.CdW()) {
                        A012.A0O = A00;
                    }
                    A03 = A012.A03();
                }
                C675132q.A00(AbstractC31364DqT.A03().A01.A02(userSession2, A03), userSession2, c675132q, str3);
                i = -2106908738;
                C0f9.A0A(i, A033);
                C0f9.A0A(-970844229, A032);
            }
        };
        this.A0N = new InterfaceC42271xH() { // from class: X.334
            @Override // X.InterfaceC42271xH
            public final /* bridge */ /* synthetic */ boolean A79(Object obj) {
                C675132q c675132q = C675132q.this;
                if (!C675132q.A02(c675132q) && !C675132q.A03(c675132q)) {
                    return false;
                }
                return true;
            }

            @Override // X.InterfaceC41501vz
            public final /* bridge */ /* synthetic */ void onEvent(Object obj) {
                InterfaceC60442pS interfaceC60442pS2;
                int A03 = C0f9.A03(1424685298);
                C72313Me c72313Me = (C72313Me) obj;
                int A032 = C0f9.A03(-2127461755);
                C14360o3.A0B(c72313Me, 0);
                C38321qM c38321qM = c72313Me.A01;
                String str = c72313Me.A02;
                C675132q c675132q = C675132q.this;
                UserSession userSession2 = c675132q.A0B;
                Fragment fragment2 = c675132q.A07;
                C14360o3.A0A(c38321qM);
                AbstractC41750IeP.A00(fragment2, userSession2, c38321qM);
                AbstractC41750IeP.A05(c38321qM, c675132q.A00, C6T5.A00(), c675132q.A02, AnonymousClass317.A0V);
                if (C14360o3.A0K(str, userSession2.userId)) {
                    C28421Zd A033 = AbstractC31364DqT.A03();
                    C08790ch A00 = AbstractC018607g.A00(fragment2);
                    C38321qM A1g = c38321qM.A1g(userSession2);
                    interfaceC60442pS2 = c675132q.A0S;
                    A033.A00(fragment2, A00, interfaceC60442pS2, c72313Me.A00, null, userSession2, A1g);
                } else {
                    C38321qM A1g2 = c38321qM.A1g(userSession2);
                    int A16 = c38321qM.A16(userSession2);
                    if (A16 == -1) {
                        A16 = 0;
                    }
                    interfaceC60442pS2 = c675132q.A0S;
                    C31368DqX A01 = AbstractC31402Dr6.A01(userSession2, str, AbstractC111324zv.A00(2706), interfaceC60442pS2.getModuleName());
                    A01.A0L = c675132q.A05;
                    String id = A1g2.getId();
                    if (id != null) {
                        A01.A04 = new SourceModelInfoParams(id, -1, A16);
                    }
                    C55772hI.A00(userSession2).A0A = c38321qM.A2u();
                    C675132q.A00(AbstractC31364DqT.A03().A01.A02(userSession2, A01.A03()), userSession2, c675132q, AbstractC111324zv.A00(4895));
                }
                AbstractC41750IeP.A01(userSession2, c38321qM, interfaceC60442pS2, str);
                AbstractC40897I9v.A00(AbstractC12220kQ.A01(interfaceC60442pS2, userSession2), EnumC39652Hih.A0y, interfaceC60442pS2.getModuleName(), c38321qM.BqK(), str, c72313Me.A03);
                C0f9.A0A(173383283, A032);
                C0f9.A0A(-1667818593, A03);
            }
        };
        this.A0I = new InterfaceC42271xH() { // from class: X.335
            @Override // X.InterfaceC42271xH
            public final /* bridge */ /* synthetic */ boolean A79(Object obj) {
                C675132q c675132q = C675132q.this;
                if (!C675132q.A02(c675132q) && !C675132q.A03(c675132q)) {
                    return false;
                }
                return true;
            }

            @Override // X.InterfaceC41501vz
            public final /* bridge */ /* synthetic */ void onEvent(Object obj) {
                int A03 = C0f9.A03(1375406354);
                C72323Mf c72323Mf = (C72323Mf) obj;
                int A032 = C0f9.A03(775794940);
                C14360o3.A0B(c72323Mf, 0);
                C38321qM c38321qM = c72323Mf.A00;
                FBUserTag fBUserTag = c72323Mf.A01;
                C675132q c675132q = C675132q.this;
                UserSession userSession2 = c675132q.A0B;
                Fragment fragment2 = c675132q.A07;
                AbstractC41750IeP.A00(fragment2, userSession2, c38321qM);
                AbstractC41750IeP.A05(c38321qM, c675132q.A00, C6T5.A00(), c675132q.A02, AnonymousClass317.A0V);
                if (!fBUserTag.A04) {
                    AbstractC55229Oez.A0D(fragment2, userSession2, c38321qM, fBUserTag);
                }
                C0f9.A0A(-57938896, A032);
                C0f9.A0A(-250189979, A03);
            }
        };
        this.A0O = new InterfaceC42271xH() { // from class: X.336
            @Override // X.InterfaceC42271xH
            public final /* bridge */ /* synthetic */ boolean A79(Object obj) {
                C675132q c675132q = C675132q.this;
                if (!C675132q.A02(c675132q) && !C675132q.A03(c675132q)) {
                    return false;
                }
                return true;
            }

            @Override // X.InterfaceC41501vz
            public final /* bridge */ /* synthetic */ void onEvent(Object obj) {
                String str;
                String Aw8;
                int i;
                FragmentActivity activity;
                String str2;
                String id;
                C75113Zb BRZ;
                int A03 = C0f9.A03(-1009119122);
                C72303Md c72303Md = (C72303Md) obj;
                int A032 = C0f9.A03(-315405590);
                C14360o3.A0B(c72303Md, 0);
                C38321qM c38321qM = c72303Md.A01;
                C675132q c675132q = C675132q.this;
                UserSession userSession2 = c675132q.A0B;
                C38321qM A1g = c38321qM.A1g(userSession2);
                Product product = c72303Md.A02;
                if (C14360o3.A0K(c72303Md.A03, true)) {
                    FragmentActivity activity2 = c675132q.A07.getActivity();
                    if (activity2 == null) {
                        i = -1322198266;
                    } else {
                        InterfaceC65232xL interfaceC65232xL = c675132q.A00;
                        if (interfaceC65232xL != null && (BRZ = interfaceC65232xL.BRZ(A1g)) != null) {
                            InterfaceC60442pS interfaceC60442pS2 = c675132q.A0S;
                            AbstractC41775Ier.A0B(userSession2, c38321qM, interfaceC60442pS2, c675132q.A05, false);
                            C1XJ.A00.A0s(activity2, userSession2, c38321qM, interfaceC60442pS2, BRZ, null, null, c675132q.A05, "shopping_indicator");
                            I7L.A00(userSession2).A00();
                            i = -888430017;
                        } else {
                            i = -1966069916;
                        }
                    }
                } else {
                    Fragment fragment2 = c675132q.A07;
                    AbstractC41750IeP.A00(fragment2, userSession2, A1g);
                    AbstractC41750IeP.A05(c38321qM, c675132q.A00, C6T5.A00(), c675132q.A02, AnonymousClass317.A0I);
                    String str3 = c675132q.A05;
                    if (str3 == null) {
                        str3 = c72303Md.A05;
                    }
                    boolean CdW = A1g.CdW();
                    InterfaceC60442pS interfaceC60442pS3 = c675132q.A0S;
                    if (CdW) {
                        AbstractC41665Ibx.A01(userSession2, c38321qM, A1g, interfaceC60442pS3, product);
                        C81063jb c81063jb = c675132q.A01;
                        if (c81063jb != null && c81063jb.A08(c38321qM, false) && (id = c38321qM.getId()) != null) {
                            C81063jb.A01(c81063jb, id, true);
                        }
                    } else {
                        AbstractC41775Ier.A07(userSession2, c38321qM, interfaceC60442pS3, product, str3, c72303Md.A04);
                    }
                    I7L.A00(userSession2).A00();
                    FragmentActivity activity3 = fragment2.getActivity();
                    if (activity3 == null) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("trying to navigate to fragment from host: ");
                        Object host = fragment2.getHost();
                        if (host != null) {
                            str2 = String.valueOf(host);
                        } else {
                            str2 = "null";
                        }
                        sb.append(str2);
                        sb.append(" ProductTagClickEvent from class: ");
                        sb.append(fragment2.getClass());
                        sb.append(" on null activity");
                        C0w9.A03("MediaLinkBroadcastHandler", sb.toString());
                        i = -1183962991;
                    } else if (fragment2.getHost() != null && (activity3.isFinishing() || ((activity = fragment2.getActivity()) != null && activity.isDestroyed()))) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("trying to navigate to fragment from host: ");
                        sb2.append(fragment2.getHost());
                        sb2.append(" ProductTagClickEvent from class: ");
                        sb2.append(fragment2.getClass());
                        sb2.append(" after activity finished");
                        C0w9.A03("MediaLinkBroadcastHandler", sb2.toString());
                        i = -296899107;
                    } else {
                        FragmentActivity activity4 = fragment2.getActivity();
                        if (activity4 != null) {
                            C42130Ile A0L = C1XJ.A00.A0L(activity4, userSession2, interfaceC60442pS3, product, "tags", str3);
                            AndroidLink androidLink = (AndroidLink) AbstractC001800i.A0J(c38321qM.A3Y());
                            if (androidLink != null && (Aw8 = androidLink.Aw8()) != null) {
                                android.net.Uri A033 = AbstractC08820cl.A03(Aw8);
                                C14360o3.A07(A033);
                                str = A033.getQueryParameter(AbstractC111324zv.A00(2658));
                            } else {
                                str = null;
                            }
                            A0L.A02(A1g, Integer.valueOf(c38321qM.A16(userSession2)));
                            A0L.A0b = true;
                            A0L.A08 = null;
                            A0L.A0X = A1g.CdW();
                            A0L.A0a = true;
                            A0L.A0N = c675132q.A04;
                            A0L.A09 = c38321qM.A29();
                            A0L.A0M = str;
                            User A2E = A1g.A2E(userSession2);
                            if (A2E != null) {
                                A0L.A0F = A2E.getId();
                            }
                            if (!A1g.A5r()) {
                                A0L.A05 = I7V.A00(A1g, product, c72303Md.A00);
                            }
                            C42130Ile.A01(A0L);
                        }
                        i = -888430017;
                    }
                }
                C0f9.A0A(i, A032);
                C0f9.A0A(1306719397, A03);
            }
        };
        this.A0C = new InterfaceC42271xH() { // from class: X.337
            @Override // X.InterfaceC42271xH
            public final /* bridge */ /* synthetic */ boolean A79(Object obj) {
                C675132q c675132q = C675132q.this;
                if (!C675132q.A02(c675132q) && !C675132q.A03(c675132q)) {
                    return false;
                }
                return true;
            }

            @Override // X.InterfaceC41501vz
            public final /* bridge */ /* synthetic */ void onEvent(Object obj) {
                C2Fb c2Fb;
                String str;
                C38321qM c38321qM;
                C38321qM c38321qM2;
                List A3h;
                C38321qM c38321qM3;
                int A03 = C0f9.A03(494115502);
                C72423Mp c72423Mp = (C72423Mp) obj;
                int A032 = C0f9.A03(415274961);
                C14360o3.A0B(c72423Mp, 0);
                EnumC71343Hv enumC71343Hv = EnumC71343Hv.A0H;
                Integer num = null;
                String str2 = null;
                C38321qM c38321qM4 = c72423Mp.A01;
                if (c38321qM4.A5M()) {
                    C75113Zb c75113Zb = c72423Mp.A02;
                    num = Integer.valueOf(c75113Zb.A03);
                    C675132q c675132q = C675132q.this;
                    Integer num2 = c75113Zb.A19;
                    if (c38321qM4.A4m()) {
                        int i = c75113Zb.A03;
                        int i2 = i - 1;
                        if (num2 != null && i == 0) {
                            i2 = num2.intValue();
                            str2 = c38321qM4.A3F(num2);
                        } else {
                            List AmB = c38321qM4.A0C.AmB();
                            String str3 = null;
                            if (AmB != null && (c38321qM2 = (C38321qM) AbstractC001800i.A0O(AmB, 0)) != null && (A3h = c38321qM2.A3h()) != null && (c38321qM3 = (C38321qM) AbstractC001800i.A0O(A3h, 0)) != null) {
                                str = c38321qM3.A2u();
                            } else {
                                str = null;
                            }
                            List AmB2 = c38321qM4.A0C.AmB();
                            if (AmB2 != null && (c38321qM = (C38321qM) AbstractC001800i.A0O(AmB2, 1)) != null) {
                                str3 = c38321qM.A2u();
                            }
                            if (str == null || !str.equals(str3)) {
                                i2 = c75113Zb.A03 + 3;
                            }
                        }
                        num = Integer.valueOf(i2);
                        C71313Hs.A00(c675132q.A0B).A06(c72423Mp.A00, EnumC71343Hv.A05, i2);
                    }
                }
                C675132q c675132q2 = C675132q.this;
                UserSession userSession2 = c675132q2.A0B;
                C71313Hs.A00(userSession2).A09(c72423Mp.A00, new C71353Hw(num, enumC71343Hv, null, str2), new String[0], 1);
                C689438f c689438f = new C689438f(userSession2, c675132q2.A0S, c675132q2.A01, c675132q2.A02, c675132q2.A03);
                Fragment fragment2 = c675132q2.A07;
                C75113Zb c75113Zb2 = c72423Mp.A02;
                if (c72423Mp.A03) {
                    c2Fb = C2Fb.A0A;
                } else {
                    c2Fb = C2Fb.A0B;
                }
                c689438f.A00(null, null, fragment2, c38321qM4, c75113Zb2, c2Fb, null);
                C0f9.A0A(-533276030, A032);
                C0f9.A0A(-2044973833, A03);
            }
        };
        this.A0J = new InterfaceC42271xH() { // from class: X.338
            @Override // X.InterfaceC42271xH
            public final /* bridge */ /* synthetic */ boolean A79(Object obj) {
                C675132q c675132q = C675132q.this;
                if (!C675132q.A02(c675132q) && !C675132q.A03(c675132q)) {
                    return false;
                }
                return true;
            }

            @Override // X.InterfaceC41501vz
            public final /* bridge */ /* synthetic */ void onEvent(Object obj) {
                int A03 = C0f9.A03(1392011005);
                C72453Ms c72453Ms = (C72453Ms) obj;
                int A032 = C0f9.A03(-218633502);
                C14360o3.A0B(c72453Ms, 0);
                EnumC71343Hv enumC71343Hv = EnumC71343Hv.A0H;
                Integer valueOf = Integer.valueOf(c72453Ms.A00);
                C75113Zb c75113Zb = c72453Ms.A03;
                c75113Zb.A19 = valueOf;
                C675132q c675132q = C675132q.this;
                UserSession userSession2 = c675132q.A0B;
                C71313Hs.A00(userSession2).A09(c72453Ms.A01, new C71353Hw(valueOf, enumC71343Hv, null, null), new String[0], 1);
                InterfaceC60442pS interfaceC60442pS2 = c675132q.A0S;
                C1M1 c1m1 = c675132q.A03;
                new C689438f(userSession2, interfaceC60442pS2, c675132q.A01, c675132q.A02, c1m1).A00(null, null, c675132q.A07, c72453Ms.A02, c75113Zb, C2Fb.A1r, null);
                C0f9.A0A(-2133713580, A032);
                C0f9.A0A(561626609, A03);
            }
        };
        this.A0D = new InterfaceC42271xH() { // from class: X.339
            @Override // X.InterfaceC42271xH
            public final /* bridge */ /* synthetic */ boolean A79(Object obj) {
                C675132q c675132q = C675132q.this;
                if (!C675132q.A02(c675132q) && !C675132q.A03(c675132q)) {
                    return false;
                }
                return true;
            }

            @Override // X.InterfaceC41501vz
            public final /* bridge */ /* synthetic */ void onEvent(Object obj) {
                int A03 = C0f9.A03(1883805922);
                C72443Mr c72443Mr = (C72443Mr) obj;
                int A032 = C0f9.A03(-1314669917);
                C14360o3.A0B(c72443Mr, 0);
                C675132q c675132q = C675132q.this;
                UserSession userSession2 = c675132q.A0B;
                Fragment fragment2 = c675132q.A07;
                FragmentActivity requireActivity = fragment2.requireActivity();
                InterfaceC60442pS interfaceC60442pS2 = c675132q.A0S;
                String moduleName = interfaceC60442pS2.getModuleName();
                C38321qM c38321qM = c72443Mr.A00;
                String str = null;
                String AdE = c38321qM.A0C.AdE();
                String A00 = AbstractC111324zv.A00(2373);
                C35265Fh0.A05(requireActivity, userSession2, moduleName, AdE, A00, false);
                User A2E = c38321qM.A2E(userSession2);
                if (A2E != null) {
                    str = A2E.getId();
                }
                AbstractC151386rg.A01(interfaceC60442pS2, userSession2, c38321qM, A00, str, AbstractC14490oL.A0A(fragment2.requireActivity()));
                C0f9.A0A(786252344, A032);
                C0f9.A0A(-669557004, A03);
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
    public final /* synthetic */ void onDestroy() {
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

    public static final void A00(Fragment fragment, UserSession userSession, C675132q c675132q, String str) {
        String str2;
        FragmentActivity activity = c675132q.A07.getActivity();
        if (activity == null) {
            str2 = "trying to navigate to fragment on null activity";
        } else {
            if (!activity.isFinishing() && !activity.isDestroyed()) {
                C140966Yy c140966Yy = new C140966Yy(activity, userSession);
                c140966Yy.A0E = true;
                c140966Yy.A08();
                c140966Yy.A0B(null, fragment);
                if (str != null) {
                    c140966Yy.A0B = str;
                }
                c140966Yy.A05();
                return;
            }
            str2 = "trying to navigate to fragment after activity finished";
        }
        C0w9.A03("MediaLinkBroadcastHandler", str2);
    }

    public static final boolean A01(C38321qM c38321qM, C675132q c675132q, boolean z) {
        C3DN A00;
        FragmentActivity activity = c675132q.A07.getActivity();
        if (activity != null && (A00 = C3DN.A00.A00(activity)) != null) {
            if (z) {
                UserSession userSession = c675132q.A0B;
                if (C25375BKs.A03(userSession, c38321qM)) {
                    if (C18U.A06(C06090Tz.A06, userSession, 36321537696540227L)) {
                        c675132q.A06 = true;
                    } else {
                        A00.A0B();
                        return true;
                    }
                }
            }
            return !((C3DP) A00).A0h;
        }
        return true;
    }

    public static final boolean A02(C675132q c675132q) {
        C3DN A00;
        FragmentActivity activity = c675132q.A07.getActivity();
        if (activity != null && (A00 = C3DN.A00.A00(activity)) != null && ((C3DP) A00).A0h) {
            return false;
        }
        return true;
    }

    public static final boolean A03(C675132q c675132q) {
        C3DN A00;
        FragmentActivity activity = c675132q.A07.getActivity();
        if (activity != null && (A00 = C3DN.A00.A00(activity)) != null) {
            C3DP c3dp = (C3DP) A00;
            if (c3dp.A0h && c3dp.A0g) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // X.InterfaceC60602pj
    public final void onPause() {
        C25671My c25671My = this.A09;
        c25671My.A02(this.A0O, C72303Md.class);
        c25671My.A02(this.A0N, C72313Me.class);
        c25671My.A02(this.A0I, C72323Mf.class);
        c25671My.A02(this.A0H, C72333Mg.class);
        c25671My.A02(this.A0A, C72343Mh.class);
        c25671My.A02(this.A0E, C72353Mi.class);
        c25671My.A02(this.A0Q, C72363Mj.class);
        c25671My.A02(this.A0M, C72373Mk.class);
        c25671My.A02(this.A0K, C72383Ml.class);
        c25671My.A02(this.A0G, C72393Mm.class);
        c25671My.A02(this.A0L, AbstractC72403Mn.class);
        c25671My.A02(this.A0F, C72413Mo.class);
        c25671My.A02(this.A0C, C72423Mp.class);
        c25671My.A02(this.A0P, C72433Mq.class);
        c25671My.A02(this.A0D, C72443Mr.class);
        c25671My.A02(this.A0J, C72453Ms.class);
    }

    @Override // X.InterfaceC60602pj
    public final void onResume() {
        C25671My c25671My = this.A09;
        c25671My.A01(this.A0O, C72303Md.class);
        c25671My.A01(this.A0N, C72313Me.class);
        c25671My.A01(this.A0I, C72323Mf.class);
        c25671My.A01(this.A0H, C72333Mg.class);
        c25671My.A01(this.A0A, C72343Mh.class);
        c25671My.A01(this.A0E, C72353Mi.class);
        c25671My.A01(this.A0Q, C72363Mj.class);
        c25671My.A01(this.A0M, C72373Mk.class);
        c25671My.A01(this.A0K, C72383Ml.class);
        c25671My.A01(this.A0G, C72393Mm.class);
        c25671My.A01(this.A0L, AbstractC72403Mn.class);
        c25671My.A01(this.A0F, C72413Mo.class);
        c25671My.A01(this.A0C, C72423Mp.class);
        c25671My.A01(this.A0P, C72433Mq.class);
        c25671My.A01(this.A0D, C72443Mr.class);
        c25671My.A01(this.A0J, C72453Ms.class);
    }
}
