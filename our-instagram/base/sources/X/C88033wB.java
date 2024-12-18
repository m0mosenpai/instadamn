package X;

import android.os.Message;
import android.os.SystemClock;

/* renamed from: X.3wB, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C88033wB {
    public int A00;
    public Class A07;
    public Class A08;
    public Class A09;
    public long A06 = -1;
    public boolean A0A = true;
    public long A02 = -1;
    public long A01 = -1;
    public long A03 = -1;
    public long A05 = -1;
    public long A04 = -1;

    public final void A03() {
        this.A00 = 0;
        this.A09 = null;
        this.A07 = null;
        this.A08 = null;
        this.A06 = -1L;
        this.A0A = true;
        this.A02 = -1L;
        this.A01 = -1L;
        this.A03 = -1L;
        this.A05 = -1L;
        this.A04 = -1L;
    }

    public final long A00() {
        if (this.A05 != -1) {
            return this.A04 - this.A01;
        }
        return 0L;
    }

    public final long A01() {
        long j = this.A05;
        if (j == -1) {
            j = SystemClock.uptimeMillis();
        }
        return j - this.A02;
    }

    public final void A05(Message message) {
        if (message == null) {
            this.A0A = true;
            return;
        }
        this.A0A = false;
        this.A00 = message.what;
        if (message.getTarget() != null) {
            this.A09 = message.getTarget().getClass();
        }
        if (message.getCallback() != null) {
            this.A07 = message.getCallback().getClass();
        }
        Object obj = message.obj;
        if (obj != null) {
            this.A08 = obj.getClass();
        }
        if (message.getWhen() <= 0) {
            return;
        }
        this.A06 = message.getWhen();
    }

    public final boolean A06(long j) {
        boolean z = false;
        if (this.A05 != -1) {
            z = true;
        }
        if (!z || A01() <= j) {
            return false;
        }
        return true;
    }

    public final void A02() {
        this.A02 = SystemClock.uptimeMillis();
        this.A01 = SystemClock.currentThreadTimeMillis();
        this.A03 = System.currentTimeMillis();
    }

    public final void A04() {
        this.A05 = SystemClock.uptimeMillis();
        this.A04 = SystemClock.currentThreadTimeMillis();
    }
}
