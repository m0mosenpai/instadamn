package X;

import android.os.Handler;
import com.facebook.quicklog.QuickPerformanceLogger;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes8.dex */
public final class LJd {
    public int A00;
    public Handler A01;
    public C125875mc A02;
    public ACD A03;
    public C135656Br A04;
    public Runnable A05;
    public boolean A06;
    public boolean A07;
    public boolean A08;
    public final C6Eh A09;
    public final C6Eh A0A;
    public final QuickPerformanceLogger A0B;
    public final C47576Kzm A0C;
    public final String A0D;
    public final String A0E;
    public final String A0F;
    public final java.util.Set A0G;
    public final java.util.Set A0H;
    public final java.util.Set A0I;
    public final AtomicBoolean A0J;
    public final HashMap A0K;

    public LJd(QuickPerformanceLogger quickPerformanceLogger, C47576Kzm c47576Kzm, String str, String str2, String str3, HashMap hashMap) {
        AbstractC25233BEq.A0x(1, str, str2, str3);
        this.A0D = str;
        this.A0B = quickPerformanceLogger;
        this.A0C = c47576Kzm;
        this.A0E = str2;
        this.A0F = str3;
        this.A0K = hashMap;
        this.A0A = new LVO(this, 1);
        this.A09 = new LVO(this, 0);
        this.A0J = new AtomicBoolean(false);
        this.A07 = true;
        this.A0G = AbstractC31171DnF.A0l();
        this.A0H = AbstractC31171DnF.A0l();
        this.A0I = AbstractC31171DnF.A0l();
    }

    public static final void A00(LJd lJd, Boolean bool, Integer num, String str, String str2) {
        int hashCode = lJd.A0D.hashCode();
        QuickPerformanceLogger quickPerformanceLogger = lJd.A0B;
        if (quickPerformanceLogger.isMarkerOn(755177991, hashCode)) {
            if (str2 != null) {
                quickPerformanceLogger.markerAnnotate(755177991, hashCode, str, str2);
            }
            if (bool != null) {
                quickPerformanceLogger.markerAnnotate(755177991, hashCode, str, bool.booleanValue());
            }
            if (num != null) {
                quickPerformanceLogger.markerAnnotate(755177991, hashCode, str, num.intValue());
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0011, code lost:
    
        if (r14.equals("SwitchAccount") != false) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001b, code lost:
    
        if (r12.A06 != false) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A01(X.LJd r12, java.lang.Runnable r13, java.lang.String r14) {
        /*
            Method dump skipped, instructions count: 277
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.LJd.A01(X.LJd, java.lang.Runnable, java.lang.String):void");
    }

    public static final void A02(LJd lJd, String str) {
        int hashCode = lJd.A0D.hashCode();
        QuickPerformanceLogger quickPerformanceLogger = lJd.A0B;
        if (quickPerformanceLogger.isMarkerOn(755177991, hashCode)) {
            quickPerformanceLogger.markerPoint(755177991, hashCode, str);
        }
    }
}
