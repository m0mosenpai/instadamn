package X;

import android.content.Context;
import android.view.View;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgTextView;

/* renamed from: X.3EQ, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3EQ {
    public C19L A00;
    public AnonymousClass195 A01;
    public boolean A02;
    public final Context A03;
    public final InterfaceC11380iw A04;
    public final C12N A05;
    public final UserSession A06;
    public final C3EJ A07;
    public final C3ES A08;
    public final Integer A09;
    public final String A0A;
    public final InterfaceC09390do A0B;
    public final InterfaceC09390do A0C;
    public final C0UO A0D;

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0021, code lost:
    
        if (X.C18U.A06(X.C06090Tz.A05, r13.A06, 36314828956044106L) != false) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A00(X.C3EQ r13, X.C3ET r14) {
        /*
            r8 = 0
            r3 = 1
            boolean r0 = r14.A01
            r9 = r13
            if (r0 == 0) goto L23
            boolean r0 = r14.A03
            if (r0 == 0) goto L23
            boolean r0 = r14.A04
            if (r0 == 0) goto L23
            boolean r0 = r14.A05
            if (r0 == 0) goto L23
            com.instagram.common.session.UserSession r4 = r13.A06
            X.0Tz r2 = X.C06090Tz.A05
            r0 = 36314828956044106(0x81042500010b4a, double:3.028982287656861E-306)
            boolean r0 = X.C18U.A06(r2, r4, r0)
            r4 = 1
            if (r0 == 0) goto L24
        L23:
            r4 = 0
        L24:
            X.195 r1 = r13.A01
            if (r1 == 0) goto L2c
            r0 = 0
            r1.AGH(r0)
        L2c:
            java.lang.Long r0 = r14.A00
            if (r0 == 0) goto L86
            long r1 = r0.longValue()
            X.0do r0 = r13.A0B
            java.lang.Object r7 = r0.getValue()
            java.lang.String r7 = (java.lang.String) r7
            java.lang.Object[] r3 = new java.lang.Object[r3]
            long r5 = java.lang.System.currentTimeMillis()
            long r5 = r5 - r1
            r1 = 0
            int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r0 < 0) goto L83
            r0 = 1000(0x3e8, double:4.94E-321)
            long r5 = r5 / r0
            java.lang.String r0 = android.text.format.DateUtils.formatElapsedTime(r5)
            X.C14360o3.A07(r0)
        L53:
            r3[r8] = r0
            java.lang.String r3 = X.AbstractC13670mt.A06(r7, r3)
            if (r4 == 0) goto L79
            r12 = 1000(0x3e8, double:4.94E-321)
            X.195 r0 = r9.A01
            r10 = 0
            if (r0 == 0) goto L65
            r0.AGH(r10)
        L65:
            X.19L r2 = r9.A00
            if (r2 == 0) goto L77
            r11 = 3
            X.9D7 r8 = new X.9D7
            r8.<init>(r9, r10, r11, r12)
            X.191 r1 = X.AnonymousClass191.A00
            java.lang.Integer r0 = X.C05F.A00
            X.1Dx r10 = X.AbstractC23641Du.A03(r0, r1, r8, r2)
        L77:
            r9.A01 = r10
        L79:
            X.3EJ r0 = r9.A07
            r0.A01(r3, r4)
            boolean r0 = r14.A03
            r9.A02 = r0
            return
        L83:
            java.lang.String r0 = ""
            goto L53
        L86:
            X.0do r0 = r13.A0B
            java.lang.Object r7 = r0.getValue()
            java.lang.String r7 = (java.lang.String) r7
            java.lang.Object[] r3 = new java.lang.Object[r3]
            X.0do r0 = r13.A0C
            java.lang.Object r0 = r0.getValue()
            goto L53
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C3EQ.A00(X.3EQ, X.3ET):void");
    }

    public final void A01() {
        IgTextView igTextView;
        C3EJ c3ej = this.A07;
        c3ej.A00 = null;
        if (c3ej.A03 && (igTextView = c3ej.A02) != null) {
            C0fQ.A00(null, igTextView);
        }
        c3ej.A01("", false);
        C19L c19l = this.A00;
        if (c19l != null) {
            AnonymousClass194.A05(null, c19l);
        }
        this.A00 = null;
        this.A01 = null;
    }

    public final void A02() {
        IgTextView igTextView;
        C19L c19l = this.A00;
        if (c19l != null) {
            AnonymousClass194.A05(null, c19l);
        }
        this.A00 = AnonymousClass194.A02(AnonymousClass190.A02(((C12M) this.A05).A04, new AnonymousClass197(null)));
        C3EJ c3ej = this.A07;
        View.OnClickListener onClickListener = new View.OnClickListener() { // from class: X.3L8
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C7T3 c7t3;
                int A05 = C0f9.A05(671341732);
                C3EQ c3eq = C3EQ.this;
                C3ES c3es = c3eq.A08;
                UserSession userSession = c3es.A06;
                C56139Ovz A01 = MWJ.A01(userSession);
                if (A01 != null && A01.A09()) {
                    int intValue = c3eq.A09.intValue();
                    if (intValue != 1) {
                        if (intValue != 2) {
                            if (intValue == 0) {
                                c7t3 = C7T3.A0H;
                            } else {
                                throw new RuntimeException();
                            }
                        } else {
                            c7t3 = C7T3.A0K;
                        }
                    } else {
                        c7t3 = C7T3.A0B;
                    }
                    new OKi(c3es.A04, c3eq.A04, userSession).A01(c7t3.A00);
                } else {
                    C0K8.A0D(c3eq.A0A, "Ongoing call bar clicked, but no active call");
                }
                C0f9.A0C(692705550, A05);
            }
        };
        c3ej.A00 = onClickListener;
        if (c3ej.A03 && (igTextView = c3ej.A02) != null) {
            C0fQ.A00(onClickListener, igTextView);
        }
        C19L c19l2 = this.A00;
        if (c19l2 != null) {
            AbstractC23641Du.A03(C05F.A00, AnonymousClass191.A00, new C206649Cv(this, null, 15), c19l2);
        }
    }

    public /* synthetic */ C3EQ(Context context, InterfaceC11380iw interfaceC11380iw, UserSession userSession, C3EJ c3ej, Integer num) {
        String str;
        C3ES A00 = C3ER.A00().A00(context, userSession);
        C14360o3.A0B(A00, 6);
        this.A09 = num;
        this.A03 = context;
        this.A06 = userSession;
        this.A07 = c3ej;
        this.A04 = interfaceC11380iw;
        this.A08 = A00;
        this.A05 = C12L.A00;
        this.A0D = AbstractC208910l.A02(A00.A0D);
        this.A02 = true;
        this.A0B = C1XM.A00(new C9E3(this, 44));
        this.A0C = C1XM.A00(new C9E3(this, 45));
        switch (num.intValue()) {
            case 0:
                str = "THREAD";
                break;
            case 1:
                str = "INBOX";
                break;
            default:
                str = "MAIN_ACTIVITY";
                break;
        }
        this.A0A = AnonymousClass001.A0R("OngoingCallBarPresenter_", str);
    }
}
