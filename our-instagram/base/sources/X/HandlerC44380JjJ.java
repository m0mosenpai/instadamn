package X;

import android.os.Handler;
import android.os.Looper;
import com.instagram.creation.base.ui.feedcolorfilterpicker.FilterPicker;

/* renamed from: X.JjJ, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class HandlerC44380JjJ extends Handler {
    public final /* synthetic */ FilterPicker A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HandlerC44380JjJ(Looper looper, FilterPicker filterPicker) {
        super(looper);
        this.A00 = filterPicker;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x002c, code lost:
    
        if (r4 == 2) goto L5;
     */
    @Override // android.os.Handler
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void handleMessage(android.os.Message r8) {
        /*
            r7 = this;
            com.instagram.creation.base.ui.feedcolorfilterpicker.FilterPicker r6 = r7.A00
            com.instagram.creation.base.ui.feedcolorfilterpicker.FilterPicker.A00(r6)
            long r2 = java.lang.System.currentTimeMillis()
            long r0 = r6.A00
            long r4 = r2 - r0
            int r1 = (int) r4
            int r0 = r6.getWidth()
            int r1 = r1 * r0
            int r5 = r1 / 500
            int r4 = r8.what
            r1 = 0
            r0 = 1
            if (r4 != r0) goto L2b
            int r5 = -r5
        L1c:
            r6.scrollBy(r5, r1)
        L1f:
            r6.A00 = r2
            android.os.Handler r3 = r6.A06
            int r2 = r8.what
            r0 = 10
            r3.sendEmptyMessageDelayed(r2, r0)
            return
        L2b:
            r0 = 2
            if (r4 != r0) goto L1f
            goto L1c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.HandlerC44380JjJ.handleMessage(android.os.Message):void");
    }
}
