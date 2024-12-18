package X;

import android.os.SystemClock;
import com.facebook.exoplayer.monitor.VpsEventCallback;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.4Bc, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C92224Bc {
    public boolean A02;
    public C92244Be A03;
    public C4B6 A04;
    public boolean A05;
    public final VpsEventCallback A06;
    public final C2A7 A07;
    public final String A08;
    public final boolean A09;
    public final AtomicInteger A0A;
    public C92254Bf A01 = null;
    public int A00 = -1;

    public final synchronized void A00() {
        C92244Be c92244Be;
        C92254Bf c92254Bf;
        if (this.A05 && (c92244Be = this.A03) != null) {
            C4B6 c4b6 = c92244Be.A01;
            VpsEventCallback vpsEventCallback = this.A06;
            if (vpsEventCallback != null && (c92254Bf = this.A01) != null) {
                AbstractC121925fk.A00(c92254Bf, vpsEventCallback, c4b6, this.A08, this.A00, 1L, this.A09, false, true, this.A02);
                this.A01 = null;
            }
        }
    }

    public final synchronized void A01(C92244Be c92244Be, C4B6 c4b6) {
        SystemClock.elapsedRealtime();
        this.A04 = c4b6;
        this.A03 = c92244Be;
    }

    public C92224Bc(VpsEventCallback vpsEventCallback, C2A7 c2a7, String str, int i, boolean z, boolean z2, boolean z3) {
        this.A08 = str;
        this.A07 = c2a7;
        this.A06 = vpsEventCallback;
        this.A09 = z;
        this.A0A = new AtomicInteger(i);
        this.A05 = z2;
        this.A02 = z3;
    }
}
