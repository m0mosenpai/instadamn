package X;

import com.facebook.proxygen.TraceFieldType;

/* loaded from: classes8.dex */
public final class L94 {
    public final int A00;
    public final C006802i A01;
    public final boolean A02;
    public final boolean A03;
    public final boolean A04;
    public final boolean A05;

    public final void A00(String str) {
        C006802i c006802i = this.A01;
        int i = this.A00;
        c006802i.markerPoint(20132336, i, "preview_fetch_task_completed");
        c006802i.markerAnnotate(20132336, i, "preview_fetch_task_state", str);
    }

    public final void A01(String str, Integer num) {
        C006802i c006802i = this.A01;
        int i = this.A00;
        c006802i.markerAnnotate(20132336, i, "error", str);
        if (num != null) {
            c006802i.markerAnnotate(20132336, i, TraceFieldType.ErrorCode, num.intValue());
        }
        c006802i.markerEnd(20132336, i, (short) 3);
    }

    public L94(C006802i c006802i, int i, boolean z, boolean z2, boolean z3, boolean z4) {
        this.A01 = c006802i;
        this.A00 = i;
        this.A02 = z;
        this.A04 = z2;
        this.A03 = z3;
        this.A05 = z4;
    }
}
