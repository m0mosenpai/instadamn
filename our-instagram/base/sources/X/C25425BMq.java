package X;

import android.app.Activity;
import android.content.Context;
import android.view.MotionEvent;
import com.instagram.api.schemas.ReelsMediaInteractivityType;
import com.instagram.common.session.UserSession;

/* renamed from: X.BMq, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C25425BMq extends ScaleGestureDetectorOnScaleGestureListenerC65851TvC {
    public final C120985dq A00;
    public final UserSession A01;
    public final C75113Zb A02;
    public final C37616GhB A03;
    public final String A04;
    public final InterfaceC16820sZ A05;
    public final Activity A06;
    public final Context A07;
    public final JPb A08;
    public final InterfaceC11380iw A09;
    public final SPM A0A;
    public final InterfaceC31137Dmc A0B;
    public final C27845CPi A0C;
    public final boolean A0D;
    public final boolean A0E;
    public final boolean A0F;
    public final boolean A0G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0065, code lost:
    
        if (X.C18U.A06(r3, r19, 36325055273120424L) == false) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x007f, code lost:
    
        if (X.C18U.A06(r3, r19, 36325055273185961L) == false) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C25425BMq(android.app.Activity r14, android.content.Context r15, X.C120985dq r16, X.JPb r17, X.InterfaceC11380iw r18, com.instagram.common.session.UserSession r19, X.C75113Zb r20, X.SPM r21, X.InterfaceC31137Dmc r22, X.C27845CPi r23, X.C37616GhB r24, java.lang.String r25, X.InterfaceC16820sZ r26, boolean r27) {
        /*
            r13 = this;
            r0 = 3
            r10 = r19
            X.C14360o3.A0B(r10, r0)
            r0 = 4
            r8 = r16
            r9 = r17
            r11 = r22
            r2 = r23
            X.AbstractC25234BEr.A0k(r0, r11, r8, r9, r2)
            r0 = 11
            r1 = r24
            X.C14360o3.A0B(r1, r0)
            r0 = 12
            r4 = r18
            r3 = r20
            X.AbstractC25229BEm.A1M(r3, r0, r4)
            r7 = 0
            r5 = r13
            r6 = r15
            r12 = r7
            r5.<init>(r6, r7, r8, r9, r10, r11, r12)
            r13.A07 = r15
            r13.A06 = r14
            r13.A01 = r10
            r13.A0B = r11
            r13.A00 = r8
            r13.A08 = r9
            r13.A0C = r2
            r0 = r25
            r13.A04 = r0
            r0 = r26
            r13.A05 = r0
            r0 = r27
            r13.A0G = r0
            r13.A03 = r1
            r13.A02 = r3
            r13.A09 = r4
            r0 = r21
            r13.A0A = r0
            X.0Tz r3 = X.C06090Tz.A06
            r0 = 36325055273251498(0x810d72000232aa, double:3.03544945183689E-306)
            boolean r0 = X.C18U.A06(r3, r10, r0)
            r2 = 1
            if (r0 == 0) goto L67
            r0 = 36325055273120424(0x810d72000032a8, double:3.035449451753998E-306)
            boolean r1 = X.C18U.A06(r3, r10, r0)
            r0 = 1
            if (r1 != 0) goto L68
        L67:
            r0 = 0
        L68:
            r13.A0E = r0
            r0 = 36325055273251498(0x810d72000232aa, double:3.03544945183689E-306)
            boolean r0 = X.C18U.A06(r3, r10, r0)
            if (r0 == 0) goto L81
            r0 = 36325055273185961(0x810d72000132a9, double:3.035449451795444E-306)
            boolean r1 = X.C18U.A06(r3, r10, r0)
            r0 = 1
            if (r1 != 0) goto L82
        L81:
            r0 = 0
        L82:
            r13.A0D = r0
            boolean r0 = r8.A0J()
            if (r0 == 0) goto L98
            r0 = 36326803324811384(0x810f0900003878, double:3.0365549266822003E-306)
            boolean r0 = X.C18U.A06(r3, r10, r0)
            if (r0 == 0) goto L98
        L95:
            r13.A0F = r2
            return
        L98:
            r2 = 0
            goto L95
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C25425BMq.<init>(android.app.Activity, android.content.Context, X.5dq, X.JPb, X.0iw, com.instagram.common.session.UserSession, X.3Zb, X.SPM, X.Dmc, X.CPi, X.GhB, java.lang.String, X.0sZ, boolean):void");
    }

    @Override // X.ScaleGestureDetectorOnScaleGestureListenerC65851TvC, android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        C14360o3.A0B(motionEvent, 0);
        C37644Ghd C09 = this.A08.C09(this.A00);
        if ((this.A0E && C09.A0J == null) || this.A0F) {
            A02(motionEvent, ReelsMediaInteractivityType.A06);
        }
        return super.onSingleTapConfirmed(motionEvent);
    }

    @Override // X.ScaleGestureDetectorOnScaleGestureListenerC65851TvC
    public final void A00(MotionEvent motionEvent) {
        if (this.A0D) {
            A02(motionEvent, ReelsMediaInteractivityType.A05);
        }
        super.A00(motionEvent);
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x00b5, code lost:
    
        if (r31 != com.instagram.api.schemas.ReelsMediaInteractivityType.A05) goto L32;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A02(android.view.MotionEvent r30, com.instagram.api.schemas.ReelsMediaInteractivityType r31) {
        /*
            r29 = this;
            r7 = r29
            X.5dq r6 = r7.A00
            X.1qM r2 = r6.A02
            if (r2 == 0) goto Lce
            float r1 = r30.getX()
            float r0 = r30.getY()
            android.graphics.PointF r13 = new android.graphics.PointF
            r13.<init>(r1, r0)
            X.1rF r0 = r2.A0C
            X.DmD r16 = r0.Bm3()
            if (r16 == 0) goto Lce
            com.instagram.common.session.UserSession r5 = r7.A01
            r3 = 0
            X.C14360o3.A0B(r5, r3)
            X.0Tz r2 = X.C06090Tz.A06
            r0 = 36325055273906866(0x810d72000c32b2, double:3.035449452251347E-306)
            boolean r0 = X.C18U.A06(r2, r5, r0)
            if (r0 == 0) goto Le9
            java.lang.String r1 = r16.BDM()
            if (r1 == 0) goto Le9
            r10 = 38
            r8 = 2
            java.lang.String r9 = " "
            java.lang.String[] r0 = new java.lang.String[]{r9}
            r4 = 0
            java.util.List r0 = X.AbstractC001900j.A0R(r1, r0, r3)
            java.lang.StringBuilder r3 = X.AbstractC166987dD.A1C()
            java.lang.StringBuilder r2 = X.AbstractC166987dD.A1C()
            java.util.Iterator r12 = r0.iterator()
        L50:
            boolean r0 = r12.hasNext()
            if (r0 == 0) goto L73
            java.lang.String r1 = X.AbstractC166987dD.A1B(r12)
            int r11 = r2.length()
            int r0 = r1.length()
            int r11 = r11 + r0
            int r0 = r11 + 1
            if (r0 <= r10) goto Ldb
            int r4 = r4 + 1
            if (r4 != r8) goto Lcf
            java.lang.String r0 = "..."
            r2.append(r0)
            r3.append(r2)
        L73:
            int r0 = r2.length()
            if (r0 <= 0) goto L7e
            if (r4 >= r8) goto L7e
            r3.append(r2)
        L7e:
            java.lang.String r4 = X.AbstractC166987dD.A19(r3)
        L82:
            android.view.View r14 = r7.A00
            if (r14 == 0) goto Lce
            r0 = 37
            X.DGf r26 = X.C29891DGf.A00(r7, r0)
            X.BMk r11 = X.C25419BMk.A00
            if (r4 != 0) goto L99
            android.content.Context r1 = r7.A07
            r0 = 2131963699(0x7f132f33, float:1.9564159E38)
            java.lang.String r4 = X.AbstractC166997dE.A0p(r1, r0)
        L99:
            X.GhB r10 = r7.A03
            X.1v4 r21 = r6.A06()
            X.3Zb r9 = r7.A02
            X.0iw r8 = r7.A09
            X.CPi r3 = r7.A0C
            android.app.Activity r12 = r7.A06
            X.SPM r2 = r7.A0A
            boolean r1 = r7.A0E
            boolean r0 = r7.A0D
            r15 = r31
            if (r0 == 0) goto Lb7
            com.instagram.api.schemas.ReelsMediaInteractivityType r0 = com.instagram.api.schemas.ReelsMediaInteractivityType.A05
            r28 = 1
            if (r15 == r0) goto Lb9
        Lb7:
            r28 = 0
        Lb9:
            r19 = r5
            r20 = r9
            r22 = r2
            r23 = r3
            r24 = r10
            r25 = r4
            r27 = r1
            r17 = r6
            r18 = r8
            r11.A02(r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28)
        Lce:
            return
        Lcf:
            r3.append(r2)
            java.lang.String r0 = "\n"
            r3.append(r0)
            java.lang.StringBuilder r2 = X.AbstractC166987dD.A1C()
        Ldb:
            int r0 = r2.length()
            if (r0 <= 0) goto Le4
            r2.append(r9)
        Le4:
            r2.append(r1)
            goto L50
        Le9:
            java.lang.String r4 = r7.A04
            goto L82
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C25425BMq.A02(android.view.MotionEvent, com.instagram.api.schemas.ReelsMediaInteractivityType):void");
    }
}
