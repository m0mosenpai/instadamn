package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider;
import com.instagram.model.direct.DirectShareTarget;
import com.instagram.pendingmedia.model.constants.ShareType;
import java.util.LinkedHashMap;
import java.util.List;

/* renamed from: X.8MW, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C8MW {
    public final Context A00;
    public final UserSession A01;
    public final AnonymousClass840 A02;
    public final String A03;
    public final C22P A04;
    public final C1GL A05;
    public final TargetViewSizeProvider A06;

    private final C47Z A00(C8r2 c8r2, A8X a8x, C55h c55h, C188538Ws c188538Ws, C195868lW c195868lW, String str, String str2, boolean z, boolean z2) {
        String str3;
        C47Z A03 = A03(null, c8r2, c188538Ws, c195868lW, str2);
        A03.A6C = z2;
        if (z2) {
            if (C18U.A06(C06090Tz.A05, this.A01, 36325660863640814L)) {
                A03.A53 = true;
            } else {
                A03.A4x = true;
            }
        }
        A03.A1R = c55h;
        C9NV c9nv = new C9NV(A03);
        if (a8x != null) {
            c9nv.A00.A3l = a8x.A02;
            A03.A0e = (System.currentTimeMillis() / 1000) - a8x.A01;
        }
        if (z) {
            EnumC223259tC enumC223259tC = EnumC223259tC.A0P;
            C14360o3.A0B(enumC223259tC, 0);
            c9nv.A00.A0d(enumC223259tC);
        }
        C47Z c47z = new C9NV(A03).A00;
        c47z.A3z = str;
        AnonymousClass840 anonymousClass840 = this.A02;
        if (anonymousClass840 != null) {
            str3 = anonymousClass840.A02.A01.A05();
        } else {
            str3 = null;
        }
        c47z.A2e = str3;
        return A03;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0090, code lost:
    
        if (r1.A02.A01.A0O != true) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C47Z A03(android.graphics.Point r28, X.C8r2 r29, X.C188538Ws r30, X.C195868lW r31, java.lang.String r32) {
        /*
            Method dump skipped, instructions count: 353
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C8MW.A03(android.graphics.Point, X.8r2, X.8Ws, X.8lW, java.lang.String):X.47Z");
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0013, code lost:
    
        if (r1 == com.instagram.pendingmedia.model.constants.ShareType.A0P) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C47Z A04(X.C8r2 r18, X.ACA r19, X.C9ZH r20, X.C211689Zc r21, X.A8X r22, X.C188538Ws r23, X.C195868lW r24, java.lang.Boolean r25, java.lang.String r26, java.lang.String r27, java.lang.String r28, java.lang.String r29, java.lang.String r30, java.lang.String r31, java.util.List r32, java.util.List r33, boolean r34) {
        /*
            Method dump skipped, instructions count: 233
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C8MW.A04(X.8r2, X.ACA, X.9ZH, X.9Zc, X.A8X, X.8Ws, X.8lW, java.lang.Boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List, java.util.List, boolean):X.47Z");
    }

    public C8MW(Context context, C22P c22p, UserSession userSession, C1GL c1gl, TargetViewSizeProvider targetViewSizeProvider, AnonymousClass840 anonymousClass840, String str) {
        this.A00 = context;
        this.A01 = userSession;
        this.A06 = targetViewSizeProvider;
        this.A02 = anonymousClass840;
        this.A03 = str;
        this.A05 = c1gl;
        this.A04 = c22p;
    }

    public final A5X A01(AbstractC24481Hr abstractC24481Hr, AbstractC24481Hr abstractC24481Hr2, C8r2 c8r2, A8X a8x, C195868lW c195868lW, String str, String str2, boolean z, boolean z2) {
        C55h c55h;
        String obj = C0HM.A00().toString();
        C14360o3.A07(obj);
        LinkedHashMap linkedHashMap = null;
        if (str2 != null) {
            c55h = new C55h(str2, null, false);
        } else {
            c55h = null;
        }
        C47Z A00 = A00(c8r2, a8x, c55h, null, c195868lW, "share_sheet", str, z, z2);
        A00.A3x = obj;
        A00.A13 = c195868lW.A02();
        if (abstractC24481Hr2 != null) {
            A00.A5w = true;
            C47Z A03 = C9O1.A03(this.A01, ShareType.A0Y);
            C14360o3.A07(A03);
            A00.A0V(A03);
        }
        Context context = this.A00;
        UserSession userSession = this.A01;
        AbstractC24481Hr A01 = AbstractC23021ADd.A01(context, c195868lW);
        C187028Qv c187028Qv = c8r2.A05;
        if (c187028Qv != null) {
            linkedHashMap = c187028Qv.A09;
        }
        C22987ABm c22987ABm = new C22987ABm(context, userSession, abstractC24481Hr, A01, A00, this.A03, linkedHashMap);
        if (abstractC24481Hr2 != null) {
            C9O1.A0B(userSession, null, abstractC24481Hr2, new C23855Ah7(context, userSession, c22987ABm, A00));
        } else {
            c22987ABm.A00(null);
        }
        String str3 = A00.A35;
        C14360o3.A0B(str3, 0);
        return new A5X(str3);
    }

    public final A5Y A02(C26086BgF c26086BgF, AbstractC24481Hr abstractC24481Hr, AbstractC24481Hr abstractC24481Hr2, C8r2 c8r2, ACA aca, C9ZH c9zh, C211689Zc c211689Zc, A8X a8x, A96 a96, C188538Ws c188538Ws, C195868lW c195868lW, Boolean bool, Boolean bool2, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, List list, List list2, boolean z, boolean z2) {
        String obj;
        LinkedHashMap linkedHashMap;
        C81663kb B3U;
        Integer num;
        boolean z3;
        C187028Qv c187028Qv;
        C14360o3.A0B(aca, 6);
        C47Z A04 = A04(c8r2, aca, c9zh, c211689Zc, a8x, c188538Ws, c195868lW, bool, str, str2, str3, str4, str5, str6, list, list2, z);
        AnonymousClass840 anonymousClass840 = this.A02;
        if (anonymousClass840 == null || (obj = anonymousClass840.A01.toString()) == null) {
            obj = this.A04.toString();
        }
        Context context = this.A00;
        UserSession userSession = this.A01;
        AbstractC24481Hr A01 = AbstractC23021ADd.A01(context, c195868lW);
        if (c8r2 != null && (c187028Qv = c8r2.A05) != null) {
            linkedHashMap = c187028Qv.A09;
        } else {
            linkedHashMap = null;
        }
        C1GL c1gl = this.A05;
        C9O1.A0C(userSession, aca, a96, A04);
        DirectShareTarget directShareTarget = aca.A00;
        if (directShareTarget != null && (B3U = AbstractC28761aE.A00(userSession).B3U(directShareTarget.A00())) != null) {
            if (z2) {
                num = C05F.A0Y;
            } else {
                num = C05F.A03;
            }
            L1W B2W = B3U.B2W();
            if (B2W != null) {
                z3 = AbstractC46831KnQ.A00(B2W);
            } else {
                z3 = false;
            }
            if (AbstractC159387Cy.A02(userSession, directShareTarget.A00(), Boolean.valueOf(z3), num, B3U.CWO()) != EnumC159397Cz.A06) {
                A04.A5D = true;
                A04.A53 = true;
            }
        }
        if (!z2 && !C9O1.A0G(userSession, directShareTarget)) {
            C40121td.A00(context, userSession).A0D(A04);
            C9O1.A0A(c26086BgF, userSession, aca, c211689Zc, A04, str7, str8);
        }
        if (abstractC24481Hr2 != null) {
            A04.A5w = true;
            C9O1.A0B(userSession, c1gl, abstractC24481Hr2, new C23859AhB(context, userSession, c1gl, abstractC24481Hr, A01, aca, directShareTarget, c211689Zc, a8x, A04, c195868lW, obj, str7, linkedHashMap, z2));
        } else {
            C216029hI c216029hI = new C216029hI(context, userSession, abstractC24481Hr, A01, new C23838Agn(context, c26086BgF, userSession, aca, directShareTarget, c211689Zc, a8x, A04, c195868lW, bool2, obj, str7, str8, z2), A04, linkedHashMap);
            if (c1gl == null) {
                C1GJ.A03(c216029hI);
            } else {
                c1gl.schedule(c216029hI);
            }
        }
        return new A5Y(A04.A35);
    }
}
