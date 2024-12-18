package X;

import android.content.Context;
import android.os.Handler;
import com.facebook.quicklog.EventBuilder;
import com.instagram.common.session.UserSession;

/* renamed from: X.Ghv, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37662Ghv implements C38Y, InterfaceC116905Qw {
    public Integer A00;
    public InterfaceC16820sZ A01;
    public C37752GjR A02;
    public Integer A03;
    public final Handler A04;
    public final InterfaceC15680qO A05;
    public final C59952od A06;
    public final Context A07;
    public final UserSession A08;
    public final IG4 A09;
    public final C37624GhJ A0A;

    public C37662Ghv(Context context, UserSession userSession, C59952od c59952od, IG4 ig4, C37624GhJ c37624GhJ) {
        C14360o3.A0B(ig4, 5);
        this.A06 = c59952od;
        this.A0A = c37624GhJ;
        this.A07 = context;
        this.A08 = userSession;
        this.A09 = ig4;
        Integer num = C05F.A00;
        this.A00 = num;
        this.A03 = num;
        this.A04 = new Handler(C1CG.A00());
        Ox4 ox4 = new Ox4(this, 1);
        C18150uz.A0B.A03(ox4);
        this.A05 = ox4;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0087  */
    @Override // X.InterfaceC116905Qw
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void D5E(X.C38971HDz r11) {
        /*
            r10 = this;
            r8 = 0
            X.C14360o3.A0B(r11, r8)
            X.5If r9 = r11.A01
            java.lang.Throwable r7 = r9.A01()
            boolean r6 = r7 instanceof java.io.IOException
            X.IG4 r1 = r10.A09
            java.lang.Integer r4 = X.C05F.A01
            r0 = 880747659(0x347f248b, float:2.376202E-7)
            X.02i r5 = r1.A00
            java.lang.String r3 = "clips_viewer_reliability"
            com.facebook.quicklog.EventBuilder r2 = r5.markEventBuilder(r0, r3)
            X.C14360o3.A0A(r2)
            X.Ow8 r1 = r1.A01
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r8)
            r1.A01 = r0
            if (r7 == 0) goto L2e
            java.lang.String r8 = r7.toString()
            if (r8 != 0) goto L9e
        L2e:
            java.lang.Object r0 = r9.A00()
            X.1up r0 = (X.InterfaceC40821up) r0
            if (r0 == 0) goto L3c
            java.lang.String r8 = r0.getErrorMessage()
            if (r8 != 0) goto L42
        L3c:
            r0 = 3678(0xe5e, float:5.154E-42)
            java.lang.String r8 = X.AbstractC111324zv.A00(r0)
        L42:
            if (r7 != 0) goto L9e
            java.lang.String r7 = "empty trace"
        L46:
            boolean r1 = r11.A02
            java.lang.String r0 = "is_first_page"
            com.facebook.quicklog.EventBuilder r2 = r2.annotate(r0, r1)
            int r1 = r11.A00
            java.lang.String r0 = "chunk_index"
            com.facebook.quicklog.EventBuilder r2 = r2.annotate(r0, r1)
            boolean r1 = r11.A04
            java.lang.String r0 = "is_refreshing"
            com.facebook.quicklog.EventBuilder r2 = r2.annotate(r0, r1)
            boolean r1 = r11.A03
            java.lang.String r0 = "is_prefetch_response"
            com.facebook.quicklog.EventBuilder r2 = r2.annotate(r0, r1)
            boolean r1 = r11.A06
            java.lang.String r0 = "is_streaming"
            com.facebook.quicklog.EventBuilder r2 = r2.annotate(r0, r1)
            boolean r1 = r11.A05
            java.lang.String r0 = "is_cached_response"
            com.facebook.quicklog.EventBuilder r1 = r2.annotate(r0, r1)
            java.lang.String r0 = "failure_reason"
            com.facebook.quicklog.EventBuilder r1 = r1.annotate(r0, r8)
            java.lang.String r0 = "trace"
            com.facebook.quicklog.EventBuilder r0 = r1.annotate(r0, r7)
            r0.report()
            if (r6 == 0) goto La3
            r0 = 880745295(0x347f1b4f, float:2.375866E-7)
            com.facebook.quicklog.EventBuilder r0 = r5.markEventBuilder(r0, r3)
            X.C14360o3.A0A(r0)
            r0.report()
            r1 = 35
            X.DGf r0 = new X.DGf
            r0.<init>(r10, r1)
            r10.A01 = r0
            return
        L9e:
            java.lang.String r7 = X.C2Ql.A00(r7)
            goto L46
        La3:
            java.lang.Integer r1 = r10.A03
            java.lang.Integer r0 = X.C05F.A00
            if (r1 != r0) goto Lb0
            r0 = 2131955578(0x7f130f7a, float:1.9547687E38)
            r10.A00(r0)
            return
        Lb0:
            r10.A00 = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C37662Ghv.D5E(X.HDz):void");
    }

    @Override // X.InterfaceC116905Qw
    public final void D5G(C37752GjR c37752GjR) {
        C14360o3.A0B(c37752GjR, 0);
        this.A02 = c37752GjR;
        this.A00 = C05F.A00;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0087, code lost:
    
        if (r1 != false) goto L6;
     */
    @Override // X.InterfaceC116905Qw
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void D5H(X.C37818GkY r6) {
        /*
            r5 = this;
            r0 = 0
            X.C14360o3.A0B(r6, r0)
            java.lang.Integer r0 = X.C05F.A00
            r5.A00 = r0
            r0 = 0
            r5.A01 = r0
            X.IG4 r4 = r5.A09
            r3 = 1
            r2 = 880742933(0x347f1215, float:2.3755304E-7)
            X.02i r1 = r4.A00
            java.lang.String r0 = "clips_viewer_reliability"
            com.facebook.quicklog.EventBuilder r2 = r1.markEventBuilder(r2, r0)
            X.C14360o3.A0A(r2)
            X.Ow8 r1 = r4.A01
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r3)
            r1.A01 = r0
            boolean r1 = r6.A0D
            java.lang.String r0 = "is_first_page"
            com.facebook.quicklog.EventBuilder r2 = r2.annotate(r0, r1)
            boolean r1 = r6.A0I
            java.lang.String r0 = "is_streaming"
            com.facebook.quicklog.EventBuilder r2 = r2.annotate(r0, r1)
            boolean r1 = r6.A0G
            java.lang.String r0 = "is_refreshing"
            com.facebook.quicklog.EventBuilder r2 = r2.annotate(r0, r1)
            boolean r1 = r6.A0F
            java.lang.String r0 = "is_prefetch_response"
            com.facebook.quicklog.EventBuilder r2 = r2.annotate(r0, r1)
            java.lang.String r1 = r6.A06
            java.lang.String r0 = "response_container_module"
            com.facebook.quicklog.EventBuilder r2 = r2.annotate(r0, r1)
            java.lang.String r1 = r6.A05
            java.lang.String r0 = "reels_page_index"
            com.facebook.quicklog.EventBuilder r2 = r2.annotate(r0, r1)
            int r1 = r6.A00
            java.lang.String r0 = "chunk_index"
            com.facebook.quicklog.EventBuilder r2 = r2.annotate(r0, r1)
            java.util.List r3 = r6.A09
            int r1 = r3.size()
            java.lang.String r0 = "response_size"
            com.facebook.quicklog.EventBuilder r2 = r2.annotate(r0, r1)
            X.5jj r4 = r6.A01
            X.4zP r0 = r4.BbA()
            boolean r1 = r0.BUt()
            java.lang.String r0 = "more_available"
            com.facebook.quicklog.EventBuilder r2 = r2.annotate(r0, r1)
            X.4zP r0 = r4.BbA()
            java.lang.String r0 = r0.BPp()
            if (r0 == 0) goto L89
            boolean r1 = X.AbstractC001900j.A0T(r0)
            r0 = 0
            if (r1 == 0) goto L8a
        L89:
            r0 = 1
        L8a:
            r1 = r0 ^ 1
            java.lang.String r0 = "has_max_id"
            com.facebook.quicklog.EventBuilder r2 = r2.annotate(r0, r1)
            boolean r1 = r4.CR4()
            java.lang.String r0 = "is_cached_response"
            com.facebook.quicklog.EventBuilder r0 = r2.annotate(r0, r1)
            r0.report()
            boolean r0 = r3.isEmpty()
            if (r0 == 0) goto Lab
            r0 = 2131955579(0x7f130f7b, float:1.954769E38)
            r5.A00(r0)
        Lab:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C37662Ghv.D5H(X.GkY):void");
    }

    @Override // X.C38Y
    public final void DXR(int i) {
    }

    @Override // X.C38Y
    public final void DXS(int i) {
    }

    @Override // X.C38Y
    public final void DXa(int i, int i2) {
    }

    @Override // X.C38Y
    public final void DXc(int i, int i2) {
    }

    @Override // X.C38Y
    public final void DY0() {
    }

    @Override // X.C38Y
    public final void Dim(float f, float f2) {
    }

    @Override // X.C38Y
    public final void Dj0(Integer num) {
        C14360o3.A0B(num, 0);
        this.A03 = num;
        if (num == C05F.A00 && this.A00 == C05F.A01) {
            A00(2131955578);
        }
    }

    @Override // X.C38Y
    public final void DrV() {
    }

    @Override // X.C38Y
    public final void DrY(C120985dq c120985dq, int i) {
    }

    private final void A00(int i) {
        C120985dq A02;
        C37624GhJ c37624GhJ = this.A0A;
        if (c37624GhJ.A01() > 0 && (A02 = c37624GhJ.A02()) != null && A02.A01 == EnumC129395t1.A08) {
            C37556GgC c37556GgC = this.A06.A0N;
            if (c37556GgC == null) {
                C14360o3.A0F("clipsViewerViewPager");
                throw C00O.createAndThrow();
            }
            int A03 = c37556GgC.A03();
            if (A03 > 0) {
                c37556GgC.A0F(A03 - 1, true);
            }
            C9GR.A0F(this.A07, "ghost_clips", i);
        }
    }

    @Override // X.InterfaceC116905Qw
    public final void D5F() {
        C37752GjR c37752GjR = this.A02;
        if (c37752GjR != null) {
            EventBuilder markEventBuilder = this.A09.A00.markEventBuilder(880739373, "clips_viewer_reliability");
            C14360o3.A0A(markEventBuilder);
            markEventBuilder.annotate("is_first_page", c37752GjR.A02).annotate("is_streaming", c37752GjR.A04).annotate("is_refreshing", c37752GjR.A03).report();
        }
        if (!C1LE.A03(this.A08)) {
            this.A00 = C05F.A00;
        }
    }
}
