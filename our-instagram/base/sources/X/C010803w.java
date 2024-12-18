package X;

import android.os.SystemClock;

/* renamed from: X.03w, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C010803w implements C0LR {
    public long A00;
    public Integer A01;

    @Override // X.C0LR
    public final Integer BW4() {
        return C05F.A0f;
    }

    @Override // X.C0LR
    public final /* synthetic */ boolean CKv(Integer num) {
        return false;
    }

    @Override // X.C0LR
    public final void E4h(C024209q c024209q, C0M6 c0m6) {
        C10860hv c10860hv;
        long currentTimeMillis = System.currentTimeMillis();
        long uptimeMillis = SystemClock.uptimeMillis() - this.A00;
        Integer num = this.A01;
        if (num == C05F.A00) {
            c024209q.A02(C0LK.A2z, Long.valueOf(currentTimeMillis));
            c10860hv = C0LK.A31;
        } else {
            if (num != C05F.A01) {
                return;
            }
            c024209q.A02(C0LK.A26, Long.valueOf(currentTimeMillis));
            c10860hv = C0LK.A27;
        }
        c024209q.A02(c10860hv, Long.valueOf(uptimeMillis));
    }
}
