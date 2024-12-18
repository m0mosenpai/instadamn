package com.facebook.acra.anr.multisignal;

import X.AbstractC09770fa;
import X.AnonymousClass001;
import X.C06420Vj;
import X.C08140bc;
import X.C09V;
import X.C09X;
import X.C0K8;
import X.C0L6;
import X.C0M9;
import X.C0SL;
import X.C11240ig;
import X.EnumC07670ah;
import X.InterfaceC04550Lx;
import android.os.ConditionVariable;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.SystemClock;
import com.facebook.acra.anr.multisignal.MultiSignalANRDetector;
import com.facebook.acra.anr.sigquit.SigquitDetectorLacrima;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public class MultiSignalANRDetector {
    public static Map A0f = new HashMap();
    public int A00;
    public long A01;
    public long A02;
    public long A03;
    public long A04;
    public long A05;
    public long A06;
    public long A07;
    public long A08;
    public long A09;
    public long A0A;
    public C09V A0B;
    public C0SL A0C;
    public EnumC07670ah A0D;
    public String A0F;
    public String A0G;
    public String A0H;
    public String A0I;
    public boolean A0J;
    public boolean A0K;
    public boolean A0L;
    public boolean A0M;
    public boolean A0N;
    public boolean A0O;
    public boolean A0P;
    public boolean A0Q;
    public final Handler A0S;
    public final C09X A0V;
    public final InterfaceC04550Lx A0W;
    public final C0M9 A0X;
    public final HandlerThread A0d;
    public volatile boolean A0e;
    public String A0E = "MultiSignalANRDetector";
    public final Object A0Y = new Object();
    public final AtomicBoolean A0a = new AtomicBoolean(false);
    public final ConditionVariable A0R = new ConditionVariable();
    public final AtomicReference A0b = new AtomicReference();
    public final AtomicReference A0c = new AtomicReference();
    public final Runnable A0Z = new Runnable() { // from class: X.097
        @Override // java.lang.Runnable
        public final void run() {
            MultiSignalANRDetector multiSignalANRDetector = MultiSignalANRDetector.this;
            C0K8.A0D(multiSignalANRDetector.A0E, "On confirmation expired");
            if (multiSignalANRDetector.A0P) {
                multiSignalANRDetector.A02(C09M.AM_EXPIRED, false, false);
                multiSignalANRDetector.A0P = false;
                if (multiSignalANRDetector.A0J) {
                    C06420Vj c06420Vj = multiSignalANRDetector.A0X.A03;
                    c06420Vj.A03 = SystemClock.uptimeMillis();
                    C06420Vj.A00(c06420Vj);
                }
                if (multiSignalANRDetector.A0D == EnumC07670ah.A04) {
                    MultiSignalANRDetector.A01(multiSignalANRDetector);
                }
            }
        }
    };
    public final C11240ig A0T = new C11240ig(this);
    public final C08140bc A0U = new C08140bc(this);

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0071, code lost:
    
        if (r28.A0N != false) goto L16;
     */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01c9 A[Catch: IOException -> 0x020e, TryCatch #0 {IOException -> 0x020e, blocks: (B:33:0x00ac, B:35:0x00bb, B:39:0x00e0, B:40:0x00fe, B:42:0x0104, B:44:0x011a, B:46:0x0120, B:47:0x0127, B:48:0x012f, B:51:0x0137, B:53:0x01c9, B:54:0x01d8, B:56:0x01de), top: B:32:0x00ac }] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01de A[Catch: IOException -> 0x020e, TRY_LEAVE, TryCatch #0 {IOException -> 0x020e, blocks: (B:33:0x00ac, B:35:0x00bb, B:39:0x00e0, B:40:0x00fe, B:42:0x0104, B:44:0x011a, B:46:0x0120, B:47:0x0127, B:48:0x012f, B:51:0x0137, B:53:0x01c9, B:54:0x01d8, B:56:0x01de), top: B:32:0x00ac }] */
    /* JADX WARN: Removed duplicated region for block: B:59:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void A00(X.C09M r27, com.facebook.acra.anr.multisignal.MultiSignalANRDetector r28) {
        /*
            Method dump skipped, instructions count: 539
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.acra.anr.multisignal.MultiSignalANRDetector.A00(X.09M, com.facebook.acra.anr.multisignal.MultiSignalANRDetector):void");
    }

    public static void A01(MultiSignalANRDetector multiSignalANRDetector) {
        C0K8.A0P(multiSignalANRDetector.A0E, "Clearing error state has pending report %b", Boolean.valueOf(multiSignalANRDetector.A0J));
        if (multiSignalANRDetector.A0J) {
            long uptimeMillis = SystemClock.uptimeMillis() - multiSignalANRDetector.A01;
            C06420Vj c06420Vj = multiSignalANRDetector.A0X.A03;
            c06420Vj.A0A = uptimeMillis;
            C06420Vj.A00(c06420Vj);
            c06420Vj.A0P = false;
            multiSignalANRDetector.A0J = false;
        }
        multiSignalANRDetector.A0H = null;
        multiSignalANRDetector.A0I = null;
        multiSignalANRDetector.A0A = 0L;
        multiSignalANRDetector.A09 = 0L;
        multiSignalANRDetector.A08 = 0L;
        multiSignalANRDetector.A07 = 0L;
        multiSignalANRDetector.A0F = null;
        multiSignalANRDetector.A0G = null;
        multiSignalANRDetector.A06 = 0L;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0041, code lost:
    
        if (r1 != 3) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00b5, code lost:
    
        if (r1 == X.EnumC07670ah.A05) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0115, code lost:
    
        if (r2 != false) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0061, code lost:
    
        if (r1 != 3) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0121, code lost:
    
        if (r1 == 4) goto L97;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x016d, code lost:
    
        r0 = X.EnumC07670ah.A04;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x006a, code lost:
    
        if (r1 != 0) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0079, code lost:
    
        if (r1 != 2) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x008a, code lost:
    
        if (r1 != 3) goto L92;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x001d. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00ba A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0118  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A02(X.C09M r10, boolean r11, boolean r12) {
        /*
            Method dump skipped, instructions count: 398
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.acra.anr.multisignal.MultiSignalANRDetector.A02(X.09M, boolean, boolean):void");
    }

    /* JADX WARN: Type inference failed for: r0v16, types: [X.09X, java.lang.Object, com.facebook.acra.anr.sigquit.SigquitDetectorLacrima] */
    public MultiSignalANRDetector(InterfaceC04550Lx interfaceC04550Lx, C0M9 c0m9) {
        this.A0X = c0m9;
        C09X c09x = SigquitDetectorLacrima.sInstance;
        C09X c09x2 = c09x;
        if (c09x == null) {
            ?? obj = new Object();
            obj.mListener = this;
            SigquitDetectorLacrima.sInstance = obj;
            c09x2 = obj;
        }
        this.A0V = c09x2;
        this.A0D = EnumC07670ah.A04;
        this.A0B = new C09V(c0m9.A01, c0m9.A04);
        this.A0W = interfaceC04550Lx;
        HandlerThread handlerThread = new HandlerThread(AnonymousClass001.A0R("MultiSignalANRDetectorThread:", C0L6.A01()));
        AbstractC09770fa.A00(handlerThread);
        this.A0d = handlerThread;
        handlerThread.start();
        this.A0S = new Handler(handlerThread.getLooper());
    }
}
