package X;

import android.os.Handler;
import com.facebook.quicklog.MarkerEditor;

/* renamed from: X.Jf7, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44142Jf7 {
    public static C44142Jf7 A09;
    public static final C46896Kod A0A = new Object();
    public Handler A00;
    public final C006802i A01;
    public volatile int A02;
    public volatile int A03;
    public volatile int A04;
    public volatile boolean A05;
    public volatile boolean A06;
    public volatile boolean A07;
    public volatile boolean A08;

    public final void A03(String str, String str2) {
        C14360o3.A0B(str, 0);
        C006802i c006802i = this.A01;
        c006802i.markerAnnotate(31797299, "from_pk", str);
        if (str2 != null && str2.length() != 0) {
            c006802i.markerAnnotate(31797299, "to_pk", str2);
        }
    }

    public static final synchronized C44142Jf7 A00(C006802i c006802i) {
        C44142Jf7 c44142Jf7;
        synchronized (C44142Jf7.class) {
            synchronized (A0A) {
                C14360o3.A0B(c006802i, 0);
                c44142Jf7 = A09;
                if (c44142Jf7 == null) {
                    c44142Jf7 = new C44142Jf7(c006802i);
                    A09 = c44142Jf7;
                }
            }
        }
        return c44142Jf7;
    }

    public final void A01() {
        this.A08 = false;
        this.A07 = false;
        this.A06 = false;
        this.A05 = false;
        this.A02 = 0;
        this.A03 = 0;
        this.A04 = 0;
        C006802i c006802i = this.A01;
        c006802i.markerStart(31797299);
        MarkerEditor withMarker = c006802i.withMarker(31797299);
        withMarker.setSurviveUserSwitch(true);
        withMarker.markerEditingCompleted();
        C41761wQ c41761wQ = AbstractC47176KtB.A00;
        c41761wQ.A01();
        C49799Lz6.A00(C1334460n.A06.A0F(), c41761wQ, C50367MLu.A01(c006802i, 49), 2);
        Handler handler = this.A00;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
        Handler A0J = AbstractC167007dF.A0J();
        this.A00 = A0J;
        A0J.postDelayed(new M1P(this), 20000L);
    }

    public final void A02(C71933Kq c71933Kq) {
        C006802i c006802i = this.A01;
        c006802i.markerAnnotate(31797299, "total_badge_count", c71933Kq.A02);
        int i = c71933Kq.A00;
        if (i != -1) {
            c006802i.markerAnnotate(31797299, "open_badge_count", i);
        }
        int i2 = c71933Kq.A01;
        if (i2 != -1) {
            c006802i.markerAnnotate(31797299, "e2ee_badge_count", i2);
        }
    }

    public C44142Jf7(C006802i c006802i) {
        this.A01 = c006802i;
    }
}
