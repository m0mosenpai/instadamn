package X;

import android.os.Handler;
import android.os.Looper;

/* renamed from: X.5J5, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C5J5 {
    public Runnable A00;
    public String A01;
    public boolean A02;
    public boolean A03;
    public final long A04;
    public final long A05;
    public final long A06;
    public final Handler A07;
    public final C006802i A08;
    public final Runnable A09;
    public final Runnable A0A;
    public final String A0B;
    public final String A0C;

    public C5J5(String str, String str2, long j, long j2, long j3, final long j4) {
        C14360o3.A0B(str, 1);
        C14360o3.A0B(str2, 5);
        this.A0B = str;
        this.A06 = j;
        this.A04 = j2;
        this.A05 = j3;
        this.A0C = str2;
        this.A08 = C006802i.A0p;
        this.A07 = new Handler(Looper.getMainLooper());
        this.A0A = new Runnable() { // from class: X.5J6
            @Override // java.lang.Runnable
            public final void run() {
                C5J5 c5j5 = C5J5.this;
                c5j5.A03 = false;
                c5j5.A08.markerDrop(817897470);
            }
        };
        this.A09 = new Runnable() { // from class: X.5J7
            @Override // java.lang.Runnable
            public final void run() {
                C5J5 c5j5 = C5J5.this;
                C006802i c006802i = c5j5.A08;
                c006802i.markerAnnotate(817897470, "app_restart_module", c5j5.A0B);
                c006802i.markerAnnotate(817897470, "logview_group_by", "app_restart_module");
                c006802i.markerAnnotate(817897470, "rebound_time", c5j5.A05);
                c006802i.markerEnd(817897470, (short) 2);
                c5j5.A03 = false;
            }
        };
        this.A01 = "coldstart";
        this.A00 = new Runnable() { // from class: X.5J8
            @Override // java.lang.Runnable
            public final void run() {
                C5J5 c5j5 = C5J5.this;
                C006802i c006802i = c5j5.A08;
                c006802i.A0e(817897470, j4);
                c006802i.markerAnnotate(817897470, "last_nav_chain", c5j5.A0C);
                c5j5.A03 = true;
                c5j5.A07.postDelayed(c5j5.A0A, c5j5.A06);
            }
        };
    }
}
