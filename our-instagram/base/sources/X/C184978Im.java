package X;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.view.View;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider;
import com.instagram.ui.widget.filmstriptimeline.FilmstripTimelineView;
import java.io.File;

/* renamed from: X.8Im, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C184978Im extends AbstractC184988In {
    public int A00;
    public int A01;
    public long A02;
    public TargetViewSizeProvider A03;
    public File A04;
    public Integer A05;
    public final C8J3 A06;
    public final C8J4 A07;
    public final C8J6 A08;
    public final InterfaceC09390do A09;
    public volatile String A0A;

    public C184978Im(Context context, View view, UserSession userSession, C1810981l c1810981l, TargetViewSizeProvider targetViewSizeProvider, C8HV c8hv, C8C0 c8c0, C1820485o c1820485o, C1813982r c1813982r, InterfaceC1810081c interfaceC1810081c) {
        super(context, view, userSession, c1810981l, c8hv, c8c0, c1820485o, c1813982r, interfaceC1810081c, false);
        this.A09 = AbstractC09440dt.A01(new InterfaceC16820sZ() { // from class: X.8J1
            @Override // X.InterfaceC16820sZ
            public final /* bridge */ /* synthetic */ Object invoke() {
                Context context2 = C184978Im.this.A0D;
                return new C9RW(context2, context2.getString(2131969964));
            }
        });
        this.A06 = new C8J2(this);
        this.A07 = new C8J4(this);
        this.A08 = new C8J6() { // from class: X.8J5
            @Override // X.C8J6
            public final void EGu(SurfaceTexture surfaceTexture, int i, int i2, int i3) {
                C23128AMg c23128AMg;
                C184978Im c184978Im = C184978Im.this;
                if (c184978Im.A0M.get() != 0) {
                    C177247uK c177247uK = ((AbstractC184988In) c184978Im).A05;
                    c177247uK.getClass();
                    InterfaceC178717wj interfaceC178717wj = ((C179697yJ) C177247uK.A00(c177247uK)).A00;
                    if (interfaceC178717wj != null && (c23128AMg = ((C178707wi) interfaceC178717wj).A02) != null) {
                        c23128AMg.A0K.post(new RunnableC24858AzJ(surfaceTexture, c23128AMg, i, i2, i3));
                    }
                }
            }
        };
        this.A03 = targetViewSizeProvider;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x001d, code lost:
    
        if (r1 == r0) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static synchronized void A01(final X.Y1s r4, final X.C184978Im r5, final boolean r6) {
        /*
            r2 = r5
            monitor-enter(r2)
            X.81f r0 = r5.A0U     // Catch: java.lang.Throwable -> L3d
            X.81f r1 = X.EnumC1810381f.A03     // Catch: java.lang.Throwable -> L3d
            if (r0 == r1) goto Lc
            X.81f r0 = r5.A0U     // Catch: java.lang.Throwable -> L3d
            if (r0 != 0) goto L10
        Lc:
            X.8Iq r0 = r5.A0T     // Catch: java.lang.Throwable -> L3d
            r5.A0C = r0     // Catch: java.lang.Throwable -> L3d
        L10:
            X.81f r0 = r5.A0U     // Catch: java.lang.Throwable -> L3d
            if (r0 == r1) goto L1f
            X.81f r0 = r5.A0U     // Catch: java.lang.Throwable -> L3d
            if (r0 == 0) goto L1f
            X.8Iq r1 = r5.A0C     // Catch: java.lang.Throwable -> L3d
            X.8Iq r0 = r5.A0T     // Catch: java.lang.Throwable -> L3d
            r5 = 1
            if (r1 != r0) goto L20
        L1f:
            r5 = 0
        L20:
            java.util.Map r1 = r2.A0L     // Catch: java.lang.Throwable -> L3d
            X.8Iq r0 = r2.A0T     // Catch: java.lang.Throwable -> L3d
            java.lang.Object r0 = r1.get(r0)     // Catch: java.lang.Throwable -> L3d
            X.A9w r0 = (X.C22952A9w) r0     // Catch: java.lang.Throwable -> L3d
            if (r0 == 0) goto L39
            int r3 = r0.A03     // Catch: java.lang.Throwable -> L3d
        L2e:
            X.AzP r0 = new X.AzP     // Catch: java.lang.Throwable -> L3d
            r1 = r4
            r4 = r6
            r0.<init>()     // Catch: java.lang.Throwable -> L3d
            X.C176567tE.A00(r0)     // Catch: java.lang.Throwable -> L3d
            goto L3b
        L39:
            r3 = 0
            goto L2e
        L3b:
            monitor-exit(r2)
            return
        L3d:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C184978Im.A01(X.Y1s, X.8Im, boolean):void");
    }

    public static synchronized void A02(C184978Im c184978Im) {
        C8RB c8rb;
        BDJ bdj;
        synchronized (c184978Im) {
            c184978Im.A0M.set(0);
            c184978Im.A04 = null;
            c184978Im.A0A = null;
            c184978Im.A01 = 0;
            c184978Im.A00 = 0;
            ((AbstractC184988In) c184978Im).A0A = false;
            c184978Im.A0L.clear();
            FilmstripTimelineView filmstripTimelineView = ((AbstractC184988In) c184978Im).A09;
            if (filmstripTimelineView != null && (bdj = (c8rb = filmstripTimelineView.A0B).A09) != null) {
                bdj.reset();
                c8rb.A09 = null;
            }
        }
    }

    public static boolean A03(C184978Im c184978Im, String str) {
        return str.equals(c184978Im.A0A) && c184978Im.A0M.get() != 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0048, code lost:
    
        if (((java.lang.Number) r14.second).floatValue() != r8.A01) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x004d, code lost:
    
        r6 = r8.A04;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x004f, code lost:
    
        if (r6 == null) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0055, code lost:
    
        if (r6.isEmpty() != false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0057, code lost:
    
        if (r7 == false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0059, code lost:
    
        r8 = r8.A05;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x005b, code lost:
    
        if (r8 == null) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0061, code lost:
    
        if (r8.isEmpty() == false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0064, code lost:
    
        r9 = r15.A01;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0066, code lost:
    
        if (r9 == 0) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0068, code lost:
    
        r10 = r15.A00;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x006a, code lost:
    
        if (r10 == 0) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x006c, code lost:
    
        r2 = r15.A05;
        r2.getClass();
        A01(new X.Y1s(new X.Y14(null, r8, r9, r10, 0, r2.intValue())), r15, true);
        r5.compareAndSet(4, 3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0087, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0088, code lost:
    
        r0 = X.AnonymousClass001.A02(r9, r15.A00, "update: w or h == 0, w= ", " h=");
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0063, code lost:
    
        r8 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x004b, code lost:
    
        if (r8 != null) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void A00(android.util.Pair r14, final X.C184978Im r15) {
        /*
            Method dump skipped, instructions count: 269
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C184978Im.A00(android.util.Pair, X.8Im):void");
    }
}
