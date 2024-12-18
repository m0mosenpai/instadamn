package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

/* renamed from: X.93W, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C93W {
    public static final long A03 = TimeUnit.HOURS.toSeconds(12);
    public final Context A00;
    public final UserSession A01;
    public final InterfaceC09390do A02 = AbstractC09440dt.A01(new C9E1(this, 45));

    public final C1ON A01(UserSession userSession, String str) {
        C2044593e c2044593e = new C2044593e(userSession);
        c2044593e.A08 = C93X.A00(C05F.A0Y).A06;
        c2044593e.A0A = str;
        c2044593e.A0I = true;
        c2044593e.A0H = true;
        c2044593e.A0K = true;
        long j = A03;
        if (j != -1) {
            j *= 1000;
        }
        c2044593e.A00 = j;
        c2044593e.A01 = this.A00;
        return c2044593e.A02(null);
    }

    public final C1ON A00(UserSession userSession) {
        C2044593e c2044593e = new C2044593e(userSession);
        c2044593e.A08 = C93X.A00(C05F.A0u).A06;
        c2044593e.A01 = this.A00;
        return c2044593e.A01();
    }

    public final void A02(C2044693f c2044693f) {
        final ArrayList A06 = C127895qI.A06(this.A01, null, c2044693f.A03);
        C11T.A02(new Runnable() { // from class: X.5qV
            /* JADX WARN: Code restructure failed: missing block: B:13:0x006b, code lost:
            
                if (((X.InterfaceC127965qP) r1).CQJ() == false) goto L14;
             */
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r0v20, types: [X.5qZ, X.1vV, java.lang.Object] */
            @Override // java.lang.Runnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void run() {
                /*
                    r23 = this;
                    r1 = r23
                    X.93W r5 = X.C93W.this
                    android.content.Context r0 = r5.A00
                    java.lang.Integer r18 = X.C05F.A01
                    java.lang.String r4 = "explore_popular"
                    com.instagram.common.session.UserSession r3 = r5.A01
                    X.5qW r6 = new X.5qW
                    r6.<init>(r3, r0, r4)
                    java.util.List r7 = r2
                    X.0Tz r2 = X.C06090Tz.A06
                    r0 = 36310383664824361(0x81001a00000029, double:3.026171067589743E-306)
                    boolean r21 = X.C18U.A06(r2, r3, r0)
                    X.0do r0 = r5.A02
                    java.lang.Object r0 = r0.getValue()
                    X.C14360o3.A07(r0)
                    java.lang.Boolean r0 = (java.lang.Boolean) r0
                    boolean r22 = r0.booleanValue()
                    r5 = 16
                    r0 = 1
                    X.C14360o3.A0B(r7, r0)
                    java.util.ArrayList r3 = new java.util.ArrayList
                    r3.<init>()
                    java.util.Iterator r14 = r7.iterator()
                    r13 = 0
                L3d:
                    boolean r0 = r14.hasNext()
                    if (r0 == 0) goto Lbd
                    java.lang.Object r7 = r14.next()
                    boolean r0 = r7 instanceof X.C128005qU
                    if (r0 == 0) goto L3d
                    X.5qU r7 = (X.C128005qU) r7
                    java.util.List r0 = r7.A02
                    java.util.Iterator r12 = r0.iterator()
                L53:
                    boolean r0 = r12.hasNext()
                    if (r0 == 0) goto Lc7
                    java.lang.Object r1 = r12.next()
                    X.5qN r1 = (X.AbstractC127945qN) r1
                    boolean r0 = r1 instanceof X.InterfaceC127965qP
                    if (r0 == 0) goto L6d
                    r0 = r1
                    X.5qP r0 = (X.InterfaceC127965qP) r0
                    boolean r0 = r0.CQJ()
                    r10 = 1
                    if (r0 != 0) goto L6e
                L6d:
                    r10 = 0
                L6e:
                    android.content.Context r15 = r6.A00
                    com.instagram.common.session.UserSession r0 = r6.A01
                    r19 = r4
                    r20 = r10
                    r16 = r0
                    r17 = r1
                    X.3ZM r9 = X.AbstractC128035qX.A00(r15, r16, r17, r18, r19, r20, r21, r22)
                    if (r9 == 0) goto L53
                    r0 = 0
                    X.C14360o3.A0B(r1, r0)
                    java.util.Map r0 = r7.A03
                    java.lang.Object r0 = r0.get(r1)
                    X.C14360o3.A0A(r0)
                    X.5qT r0 = (X.C5qT) r0
                    int r8 = r0.A01
                    int r8 = r8 + r13
                    java.lang.Integer r11 = java.lang.Integer.valueOf(r8)
                    int r2 = r0.A00
                    java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
                    android.util.Pair r1 = new android.util.Pair
                    r1.<init>(r11, r0)
                    X.5qZ r0 = new X.5qZ
                    r0.<init>()
                    r0.A00 = r1
                    r0.A01 = r10
                    X.1yf r1 = new X.1yf
                    r1.<init>(r9, r0)
                    X.9BP r0 = new X.9BP
                    r0.<init>(r1, r8, r2)
                    r3.add(r0)
                    int r0 = r3.size()
                    if (r0 <= r5) goto L53
                Lbd:
                    com.instagram.common.session.UserSession r0 = r6.A01
                    X.1yQ r0 = X.AbstractC42951yN.A00(r0)
                    r0.A06(r4, r3)
                    return
                Lc7:
                    int r0 = r7.A00
                    int r13 = r13 + r0
                    goto L3d
                */
                throw new UnsupportedOperationException("Method not decompiled: X.RunnableC128015qV.run():void");
            }
        });
    }

    public C93W(UserSession userSession, Context context) {
        this.A01 = userSession;
        this.A00 = context;
    }
}
