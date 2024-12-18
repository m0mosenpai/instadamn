package X;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.instagram.common.session.UserSession;

/* renamed from: X.OaW, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C55076OaW {
    public int A00;
    public int A01;
    public int A02;
    public ValueAnimator A03;
    public View A04;
    public View A05;
    public RecyclerView A06;
    public BottomSheetBehavior A07;
    public C66362zD A08;
    public OFY A0A;
    public L6F A0B;
    public C7IK A0C;
    public final Context A0D;
    public final View A0E;
    public final FragmentActivity A0F;
    public final InterfaceC41501vz A0G;
    public final UserSession A0H;
    public final InterfaceC09390do A0I = AbstractC09440dt.A01(new C37017GSy(this, 43));
    public EnumC53149Nf4 A09 = EnumC53149Nf4.A05;

    /* JADX WARN: Removed duplicated region for block: B:17:0x0069 A[Catch: all -> 0x00c1, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0005, B:7:0x0009, B:11:0x001d, B:13:0x0023, B:15:0x0063, B:17:0x0069, B:19:0x0070, B:39:0x00be, B:41:0x0027, B:44:0x0030, B:46:0x0034, B:47:0x0037, B:49:0x003b, B:51:0x003e, B:53:0x0048, B:55:0x004c, B:56:0x004f, B:58:0x0053, B:59:0x0055, B:61:0x0059, B:63:0x005d, B:21:0x0073, B:23:0x0077, B:26:0x007f, B:28:0x0084, B:30:0x008a, B:32:0x008e, B:35:0x0095, B:36:0x00b9, B:37:0x007d), top: B:2:0x0001, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0070 A[Catch: all -> 0x00c1, TRY_LEAVE, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0005, B:7:0x0009, B:11:0x001d, B:13:0x0023, B:15:0x0063, B:17:0x0069, B:19:0x0070, B:39:0x00be, B:41:0x0027, B:44:0x0030, B:46:0x0034, B:47:0x0037, B:49:0x003b, B:51:0x003e, B:53:0x0048, B:55:0x004c, B:56:0x004f, B:58:0x0053, B:59:0x0055, B:61:0x0059, B:63:0x005d, B:21:0x0073, B:23:0x0077, B:26:0x007f, B:28:0x0084, B:30:0x008a, B:32:0x008e, B:35:0x0095, B:36:0x00b9, B:37:0x007d), top: B:2:0x0001, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0077 A[Catch: all -> 0x00bd, TryCatch #1 {, blocks: (B:21:0x0073, B:23:0x0077, B:26:0x007f, B:28:0x0084, B:30:0x008a, B:32:0x008e, B:35:0x0095, B:36:0x00b9, B:37:0x007d), top: B:20:0x0073, outer: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final synchronized void A01(X.C55076OaW r8, X.EnumC53149Nf4 r9) {
        /*
            monitor-enter(r8)
            com.google.android.material.bottomsheet.BottomSheetBehavior r4 = r8.A07     // Catch: java.lang.Throwable -> Lc1
            if (r4 == 0) goto Lbf
            X.Nf4 r0 = r8.A09     // Catch: java.lang.Throwable -> Lc1
            if (r0 == r9) goto Lbf
            r6 = 1
            r7 = 0
            r4.A0b(r6)     // Catch: java.lang.Throwable -> Lc1
            int r3 = r4.A0G     // Catch: java.lang.Throwable -> Lc1
            int r0 = r9.ordinal()     // Catch: java.lang.Throwable -> Lc1
            r1 = 3
            r5 = 2
            r2 = 0
            if (r0 == r7) goto L59
            if (r0 == r6) goto L3e
            if (r0 == r5) goto L27
            int r2 = r8.A01     // Catch: java.lang.Throwable -> Lc1
            X.OFY r0 = r8.A0A     // Catch: java.lang.Throwable -> Lc1
            if (r0 == 0) goto L25
            r0.A02 = r7     // Catch: java.lang.Throwable -> Lc1
        L25:
            r6 = 0
            goto L63
        L27:
            int r2 = r8.A01     // Catch: java.lang.Throwable -> Lc1
            X.Nf4 r1 = r8.A09     // Catch: java.lang.Throwable -> Lc1
            X.Nf4 r0 = X.EnumC53149Nf4.A05     // Catch: java.lang.Throwable -> Lc1
            if (r1 == r0) goto L30
            r6 = 0
        L30:
            X.L6F r0 = r8.A0B     // Catch: java.lang.Throwable -> Lc1
            if (r0 == 0) goto L37
            r0.A00(r2)     // Catch: java.lang.Throwable -> Lc1
        L37:
            X.OFY r0 = r8.A0A     // Catch: java.lang.Throwable -> Lc1
            if (r0 == 0) goto L62
            r0.A02 = r7     // Catch: java.lang.Throwable -> Lc1
            goto L62
        L3e:
            int r2 = r8.A02     // Catch: java.lang.Throwable -> Lc1
            X.Nf4 r1 = r8.A09     // Catch: java.lang.Throwable -> Lc1
            X.Nf4 r0 = X.EnumC53149Nf4.A05     // Catch: java.lang.Throwable -> Lc1
            boolean r1 = X.AbstractC167007dF.A1X(r1, r0)
            X.L6F r0 = r8.A0B     // Catch: java.lang.Throwable -> Lc1
            if (r0 == 0) goto L4f
            r0.A00(r2)     // Catch: java.lang.Throwable -> Lc1
        L4f:
            X.OFY r0 = r8.A0A     // Catch: java.lang.Throwable -> Lc1
            if (r0 == 0) goto L55
            r0.A02 = r6     // Catch: java.lang.Throwable -> Lc1
        L55:
            r4.A0b(r7)     // Catch: java.lang.Throwable -> Lc1
            goto L61
        L59:
            X.L6F r0 = r8.A0B     // Catch: java.lang.Throwable -> Lc1
            if (r0 == 0) goto L62
            r0.A00(r7)     // Catch: java.lang.Throwable -> Lc1
            goto L62
        L61:
            r6 = r1
        L62:
            r1 = 4
        L63:
            r8.A09 = r9     // Catch: java.lang.Throwable -> Lc1
            X.OFY r0 = r8.A0A     // Catch: java.lang.Throwable -> Lc1
            if (r0 == 0) goto L6e
            X.05A r0 = r0.A08     // Catch: java.lang.Throwable -> Lc1
            r0.Egh(r9)     // Catch: java.lang.Throwable -> Lc1
        L6e:
            if (r3 == r1) goto L73
            r4.A0W(r1)     // Catch: java.lang.Throwable -> Lc1
        L73:
            com.google.android.material.bottomsheet.BottomSheetBehavior r4 = r8.A07     // Catch: java.lang.Throwable -> Lbd
            if (r4 == 0) goto Lbf
            boolean r0 = r4.A0U     // Catch: java.lang.Throwable -> Lbd
            if (r0 == 0) goto L7d
            r3 = -1
            goto L7f
        L7d:
            int r3 = r4.A0E     // Catch: java.lang.Throwable -> Lbd
        L7f:
            android.animation.ValueAnimator r0 = r8.A03     // Catch: java.lang.Throwable -> Lbd
            r1 = 1
            if (r0 == 0) goto L91
            boolean r0 = r0.isRunning()     // Catch: java.lang.Throwable -> Lbd
            if (r0 != r1) goto L91
            android.animation.ValueAnimator r0 = r8.A03     // Catch: java.lang.Throwable -> Lbd
            if (r0 == 0) goto L91
            r0.cancel()     // Catch: java.lang.Throwable -> Lbd
        L91:
            if (r3 == r2) goto Lbf
            if (r6 == 0) goto Lb9
            int[] r0 = new int[]{r3, r2}     // Catch: java.lang.Throwable -> Lbd
            android.animation.ValueAnimator r2 = android.animation.ValueAnimator.ofInt(r0)     // Catch: java.lang.Throwable -> Lbd
            r1 = 4
            X.LM2 r0 = new X.LM2     // Catch: java.lang.Throwable -> Lbd
            r0.<init>(r4, r3, r1)     // Catch: java.lang.Throwable -> Lbd
            r2.addUpdateListener(r0)     // Catch: java.lang.Throwable -> Lbd
            X.Of3 r0 = new X.Of3     // Catch: java.lang.Throwable -> Lbd
            r0.<init>(r8, r5)     // Catch: java.lang.Throwable -> Lbd
            r2.addListener(r0)     // Catch: java.lang.Throwable -> Lbd
            r0 = 200(0xc8, double:9.9E-322)
            r2.setDuration(r0)     // Catch: java.lang.Throwable -> Lbd
            r2.start()     // Catch: java.lang.Throwable -> Lbd
            r8.A03 = r2     // Catch: java.lang.Throwable -> Lbd
            goto Lbf
        Lb9:
            r4.A0V(r2)     // Catch: java.lang.Throwable -> Lbd
            goto Lbf
        Lbd:
            r0 = move-exception
            throw r0     // Catch: java.lang.Throwable -> Lc1
        Lbf:
            monitor-exit(r8)
            return
        Lc1:
            r0 = move-exception
            monitor-exit(r8)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C55076OaW.A01(X.OaW, X.Nf4):void");
    }

    public static final EnumC53149Nf4 A00(C55076OaW c55076OaW) {
        int i = c55076OaW.A00;
        if (i == 0) {
            return EnumC53149Nf4.A05;
        }
        OFY ofy = c55076OaW.A0A;
        if (ofy != null && ofy.A02) {
            return EnumC53149Nf4.A03;
        }
        if (i != 1) {
            EnumC53149Nf4 enumC53149Nf4 = c55076OaW.A09;
            EnumC53149Nf4 enumC53149Nf42 = EnumC53149Nf4.A04;
            if (enumC53149Nf4 == enumC53149Nf42) {
                return enumC53149Nf42;
            }
        }
        return EnumC53149Nf4.A02;
    }

    public final void A02(C7IK c7ik) {
        this.A0C = c7ik;
        View view = this.A04;
        if (view != null) {
            view.setBackgroundTintList(ColorStateList.valueOf(c7ik.A02));
        }
        OFY ofy = this.A0A;
        if (ofy != null) {
            ofy.A01.Egh(c7ik);
        }
        C30D.A04(this.A0F, c7ik.A02);
    }

    public C55076OaW(UserSession userSession, FragmentActivity fragmentActivity, View view) {
        this.A0E = view;
        this.A0H = userSession;
        this.A0F = fragmentActivity;
        this.A0D = view.getContext();
        C56034Ou6 A00 = C56034Ou6.A00(this, 1);
        this.A0G = A00;
        AbstractC25651Mw.A00(userSession).A01(A00, C36076FwC.class);
    }
}
