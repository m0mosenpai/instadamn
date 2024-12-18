package X;

import com.facebook.common.dextricks.StringTreeSet;

/* renamed from: X.0Wh, reason: invalid class name */
/* loaded from: classes.dex */
public final class C0Wh {
    public int A00 = 0;
    public int A01 = 0;
    public int A02 = 0;
    public final C0Wf[] A03 = new C0Wf[128];

    public final synchronized void A00(C0Wf c0Wf) {
        C0Wf[] c0WfArr = this.A03;
        int i = this.A00;
        if (i == 128) {
            try {
                int i2 = this.A01;
                c0WfArr[i2] = null;
                this.A01 = (i2 + 1) % 128;
                this.A00 = StringTreeSet.MAX_SYMBOL_COUNT;
                i = StringTreeSet.MAX_SYMBOL_COUNT;
            } catch (Throwable th) {
                throw th;
            }
        } else if (i >= 128) {
            throw new IllegalStateException("Overflow");
        }
        int i3 = this.A02;
        c0WfArr[i3] = c0Wf;
        this.A02 = (i3 + 1) % 128;
        this.A00 = i + 1;
    }
}
