package X;

import android.content.Context;
import com.google.common.collect.ImmutableList;
import com.instagram.common.session.UserSession;
import com.instagram.direct.thread.analytics.DirectThreadAnalyticsParams;
import com.instagram.model.direct.messageid.DirectMessageIdentifier;
import com.instagram.model.mediasize.ExtendedImageUrl;
import com.instagram.user.model.User;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: X.78i, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1582378i {
    public final C1583378t A00;
    public final Map A01;

    /* JADX WARN: Multi-variable type inference failed */
    public C1582378i() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 3);
    }

    public final C7QY A01(Context context, UserSession userSession, C7QL c7ql, AnonymousClass988 anonymousClass988, C160787Im c160787Im) {
        C14360o3.A0B(context, 0);
        C14360o3.A0B(userSession, 2);
        C14360o3.A0B(anonymousClass988, 4);
        InterfaceC1582578k interfaceC1582578k = (InterfaceC1582578k) this.A01.get(c160787Im.A0e.A10);
        if (interfaceC1582578k == null) {
            interfaceC1582578k = this.A00;
        }
        return interfaceC1582578k.AMI(context, userSession, c7ql, anonymousClass988, c160787Im);
    }

    public final C7QY A02(Context context, UserSession userSession, C7QL c7ql, AnonymousClass988 anonymousClass988, C160787Im c160787Im, AnonymousClass442 anonymousClass442) {
        C910143t c910143t;
        long j;
        C14360o3.A0B(context, 0);
        C14360o3.A0B(userSession, 3);
        C14360o3.A0B(anonymousClass988, 5);
        C2EY c2ey = anonymousClass442.A0F;
        if (c2ey == C2EY.A1k) {
            C83403nh c83403nh = c160787Im.A0e;
            C14360o3.A07(c83403nh);
            AnonymousClass442 A0P = c83403nh.A0P();
            if (A0P != null) {
                C101864hx c101864hx = A0P.A05;
                if (c101864hx != null) {
                    DirectMessageIdentifier A0V = c83403nh.A0V();
                    Long l = A0P.A0P;
                    if (l != null) {
                        j = l.longValue();
                    } else {
                        j = 0;
                    }
                    return C78r.A01(C7QM.A02(userSession, c160787Im, A0P), c7ql, C78r.A00(context, userSession, c160787Im, c101864hx, j, false), A0V);
                }
                throw new IllegalStateException("Required value was null.");
            }
            throw new IllegalStateException("Required value was null.");
        }
        if (c2ey == C2EY.A1s) {
            C83403nh c83403nh2 = c160787Im.A0e;
            C14360o3.A07(c83403nh2);
            AnonymousClass442 A0P2 = c83403nh2.A0P();
            if (A0P2 != null) {
                C38321qM c38321qM = A0P2.A0C;
                if (c38321qM == null) {
                    return null;
                }
                DirectMessageIdentifier A0V2 = c83403nh2.A0V();
                ExtendedImageUrl A1q = c38321qM.A1q(context);
                if (A1q != null) {
                    String str = null;
                    C158737Aj c158737Aj = new C158737Aj(A1q, false, Float.valueOf(c38321qM.A0m()), null, null, null, null, null, null, null);
                    C2EY c2ey2 = A0P2.A0F;
                    C14360o3.A07(c2ey2);
                    String str2 = c83403nh2.A1u;
                    C14360o3.A07(str2);
                    C9C9 c9c9 = new C9C9(LBk.A01(userSession, C47842LBj.A00(), c2ey2, c38321qM, new MHL(userSession, 1)), str2, 5);
                    EnumC910243u enumC910243u = EnumC910243u.SINGLE;
                    User user = c160787Im.A0K;
                    if (user != null) {
                        str = user.getUsername();
                    }
                    return new C7QY(null, null, null, c9c9, null, null, null, null, C7QM.A02(userSession, c160787Im, A0P2), c7ql, null, null, c158737Aj, null, null, null, enumC910243u, null, A0V2, null, null, null, null, null, null, null, str, null, null, null, null, null, null, null, null, null, null, null, null, 0, 0, 0, false, false, false, false, false, false, false, false, false, false);
                }
                throw new IllegalStateException("Required value was null.");
            }
            throw new IllegalStateException("Required value was null.");
        }
        ImmutableList A01 = anonymousClass442.A01();
        if (A01 != null && (c910143t = (C910143t) AbstractC001800i.A0O(A01, 0)) != null) {
            C1583378t c1583378t = this.A00;
            C1583678w A012 = C1583378t.A01(c910143t, anonymousClass988.A19);
            C7TT c7tt = c160787Im.A0G;
            return c1583378t.A06(context, userSession, c7ql, anonymousClass988, A012, c160787Im, anonymousClass442, c910143t, C1583378t.A05(c910143t, c7tt.A0P, c7tt.A08, true));
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x010b, code lost:
    
        if (((X.AbstractC129515tG) r13.get(0)).A00.CVC() != false) goto L38;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C7SZ A03(android.content.Context r37, com.instagram.common.session.UserSession r38, X.C7QL r39, X.AnonymousClass988 r40, X.C160787Im r41, boolean r42) {
        /*
            Method dump skipped, instructions count: 297
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1582378i.A03(android.content.Context, com.instagram.common.session.UserSession, X.7QL, X.988, X.7Im, boolean):X.7SZ");
    }

    public /* synthetic */ C1582378i(C1583378t c1583378t, Map map, DefaultConstructorMarker defaultConstructorMarker, int i) {
        C09530e4 c09530e4 = new C09530e4(C2EY.A1F, C1582478j.A00);
        C2EY c2ey = C2EY.A1Q;
        C1582678l c1582678l = C1582678l.A00;
        C09530e4 c09530e42 = new C09530e4(c2ey, c1582678l);
        C09530e4 c09530e43 = new C09530e4(C2EY.A0H, c1582678l);
        C2EY c2ey2 = C2EY.A1g;
        C1582778m c1582778m = C1582778m.A00;
        C09530e4 c09530e44 = new C09530e4(c2ey2, c1582778m);
        C09530e4 c09530e45 = new C09530e4(C2EY.A1V, c1582778m);
        C09530e4 c09530e46 = new C09530e4(C2EY.A1A, c1582778m);
        C2EY c2ey3 = C2EY.A0t;
        C1582878n c1582878n = C1582878n.A00;
        LinkedHashMap A06 = AbstractC06930Yk.A06(c09530e4, c09530e42, c09530e43, c09530e44, c09530e45, c09530e46, new C09530e4(c2ey3, c1582878n), new C09530e4(C2EY.A0W, c1582878n), new C09530e4(C2EY.A1B, C1582978o.A00), new C09530e4(C2EY.A0k, C1583078p.A00), new C09530e4(C2EY.A1a, C1583178q.A00), new C09530e4(C2EY.A1k, C78r.A00), new C09530e4(C2EY.A1s, C1583278s.A00));
        C1583378t c1583378t2 = C1583378t.A00;
        C14360o3.A0B(A06, 1);
        C14360o3.A0B(c1583378t2, 2);
        this.A01 = A06;
        this.A00 = c1583378t2;
    }

    public static final DirectThreadAnalyticsParams A00(C160787Im c160787Im) {
        C83403nh c83403nh = c160787Im.A0e;
        if (!c83403nh.A1c()) {
            C7TT c7tt = c160787Im.A0G;
            C14360o3.A07(c7tt);
            return AbstractC1578876x.A00(c7tt, c83403nh.A2G);
        }
        return null;
    }
}
