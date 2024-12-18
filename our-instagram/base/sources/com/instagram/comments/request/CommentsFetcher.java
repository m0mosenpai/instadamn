package com.instagram.comments.request;

import X.AbstractC111324zv;
import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC167017dG;
import X.AbstractC168857gK;
import X.AbstractC25226BEj;
import X.AbstractC43592JPx;
import X.AbstractC43594JPz;
import X.AbstractC57302k5;
import X.C006802i;
import X.C06090Tz;
import X.C07T;
import X.C0w9;
import X.C14360o3;
import X.C166497cI;
import X.C168827gH;
import X.C18U;
import X.C1DS;
import X.C1DU;
import X.C26065Bft;
import X.C38321qM;
import X.C38891rO;
import X.C51575MqT;
import X.C54627OBc;
import X.C57382kD;
import X.C84923qg;
import X.EnumC166067ba;
import X.EnumC166477cG;
import X.J7Q;
import android.util.LruCache;
import com.instagram.common.session.UserSession;
import java.util.List;
import java.util.Map;

/* loaded from: classes9.dex */
public final class CommentsFetcher {
    public EnumC166477cG A00;
    public C38321qM A01;
    public boolean A02;
    public final C07T A03;
    public final C54627OBc A04;
    public final UserSession A05;
    public final int A06;
    public final String A07;
    public final boolean A08;

    /* JADX WARN: Removed duplicated region for block: B:12:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object A00(X.C26065Bft r17, com.instagram.comments.request.CommentsFetcher r18, X.EnumC166477cG r19, X.InterfaceC23621Ds r20, long r21, boolean r23, boolean r24) {
        /*
            Method dump skipped, instructions count: 442
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.comments.request.CommentsFetcher.A00(X.Bft, com.instagram.comments.request.CommentsFetcher, X.7cG, X.1Ds, long, boolean, boolean):java.lang.Object");
    }

    public static final void A01(C26065Bft c26065Bft, CommentsFetcher commentsFetcher, C168827gH c168827gH, EnumC166477cG enumC166477cG, long j, boolean z, boolean z2) {
        C84923qg c84923qg;
        C166497cI c166497cI = C166497cI.A00;
        UserSession userSession = commentsFetcher.A05;
        c166497cI.A04(enumC166477cG, z);
        C84923qg c84923qg2 = null;
        commentsFetcher.A00 = null;
        if (enumC166477cG != EnumC166477cG.A02) {
            if (z) {
                C54627OBc c54627OBc = commentsFetcher.A04;
                AbstractC167017dG.A1O(c168827gH, c26065Bft);
                c54627OBc.A00.put(c26065Bft.A03, new C51575MqT(c26065Bft, c168827gH, c54627OBc.A01.now(), j));
                c54627OBc.A02.remove(c26065Bft);
            } else {
                C1DU A00 = C1DS.A00(userSession);
                C38891rO c38891rO = c168827gH.A02;
                if (c38891rO != null) {
                    c84923qg2 = AbstractC168857gK.A00(A00, c38891rO);
                }
                C38321qM c38321qM = commentsFetcher.A01;
                if (c38321qM.CdW() && c84923qg2 == null) {
                    c38321qM.A1V();
                }
                List A01 = AbstractC168857gK.A01(A00, c168827gH.A0D);
                List A012 = AbstractC168857gK.A01(A00, c168827gH.A0E);
                int i = c168827gH.A01;
                boolean z3 = c168827gH.A0G;
                C14360o3.A0K(c168827gH.A06, AbstractC166997dE.A0b());
                boolean z4 = commentsFetcher.A02;
                String str = c168827gH.A0B;
                String str2 = c168827gH.A0C;
                boolean z5 = c168827gH.A0J;
                C38891rO c38891rO2 = c168827gH.A03;
                if (c38891rO2 != null) {
                    c84923qg = AbstractC168857gK.A00(A00, c38891rO2);
                } else {
                    c84923qg = null;
                }
                c38321qM.A49(c84923qg, enumC166477cG, null, str, str2, A01, A012, i, z3, z2, z4, z5);
                commentsFetcher.A02 = false;
            }
        }
        c166497cI.A01(userSession, enumC166477cG, z);
    }

    public static final void A02(C26065Bft c26065Bft, CommentsFetcher commentsFetcher, C168827gH c168827gH, EnumC166477cG enumC166477cG, Throwable th, boolean z) {
        String A00;
        String str;
        C166497cI c166497cI = C166497cI.A00;
        UserSession userSession = commentsFetcher.A05;
        c166497cI.A03(enumC166477cG, z);
        commentsFetcher.A00 = null;
        if (z) {
            commentsFetcher.A04.A02.remove(c26065Bft);
        }
        StringBuilder A0x = AbstractC43594JPz.A0x(enumC166477cG);
        A0x.append(AbstractC111324zv.A00(4146));
        A0x.append(enumC166477cG);
        if (c168827gH != null) {
            StringBuilder A1C = AbstractC166987dD.A1C();
            A1C.append(AbstractC111324zv.A00(5609));
            A1C.append(c168827gH.mErrorTitle);
            A1C.append(AbstractC111324zv.A00(5610));
            A1C.append(c168827gH.mErrorType);
            A1C.append(AbstractC111324zv.A00(5608));
            A1C.append(c168827gH.getErrorMessage());
            A1C.append("|| Status: ");
            A1C.append(c168827gH.getStatus());
            A1C.append(AbstractC111324zv.A00(5611));
            A1C.append(c168827gH.mStatusCode);
            A00 = A1C.toString();
        } else {
            A00 = AbstractC111324zv.A00(3629);
        }
        A0x.append(A00);
        A0x.append(AbstractC111324zv.A00(3343));
        if (th == null || (str = th.getMessage()) == null) {
            str = "null";
        }
        C0w9.A03(AbstractC111324zv.A00(3543), AbstractC166997dE.A0x(str, A0x));
        c166497cI.A01(userSession, enumC166477cG, z);
    }

    public final void A03(EnumC166067ba enumC166067ba, Integer num, long j) {
        EnumC166477cG enumC166477cG = EnumC166477cG.A04;
        String id = this.A01.getId();
        if (id != null) {
            boolean z = this.A08;
            UserSession userSession = this.A05;
            C26065Bft c26065Bft = new C26065Bft(enumC166067ba, num, id, z, C18U.A06(C06090Tz.A05, userSession, 36322091745683450L));
            C166497cI c166497cI = C166497cI.A00;
            c166497cI.A02(userSession, enumC166477cG, true);
            C54627OBc c54627OBc = this.A04;
            String str = c26065Bft.A03;
            LruCache lruCache = c54627OBc.A00;
            C51575MqT c51575MqT = (C51575MqT) lruCache.get(str);
            if (c51575MqT != null) {
                if (c54627OBc.A01.now() - c51575MqT.A01 < c51575MqT.A00) {
                    C14360o3.A0K(c51575MqT.A02, c26065Bft);
                }
                lruCache.remove(str);
            }
            if (this.A00 == null) {
                Map map = c54627OBc.A02;
                map.get(c26065Bft);
                C14360o3.A0B(enumC166477cG, 1);
                C006802i A0N = AbstractC43592JPx.A0N();
                A0N.markerPoint(16659282, "network_request_made");
                C166497cI.A00(A0N, enumC166477cG, true);
                map.put(c26065Bft, AbstractC25226BEj.A1L(new CommentsFetcher$launchFetchJobAndMaybeAddToOngoingPrefetchJobMap$job$1(c26065Bft, this, enumC166477cG, null, j, false, true), AbstractC57302k5.A00(this.A03)));
                return;
            }
            C006802i A0N2 = AbstractC43592JPx.A0N();
            A0N2.markerPoint(16659282, "ongoing_fetch_clash");
            C166497cI.A00(A0N2, enumC166477cG, true);
            c166497cI.A01(userSession, enumC166477cG, true);
            return;
        }
        throw AbstractC166997dE.A0g();
    }

    public CommentsFetcher(C07T c07t, UserSession userSession, C38321qM c38321qM, String str, int i) {
        this.A07 = str;
        this.A05 = userSession;
        this.A01 = c38321qM;
        this.A06 = i;
        this.A03 = c07t;
        this.A04 = (C54627OBc) userSession.A01(C54627OBc.class, new J7Q(userSession, 19));
        this.A08 = new C57382kD(userSession).A00();
    }
}
