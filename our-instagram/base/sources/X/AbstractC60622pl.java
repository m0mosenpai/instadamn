package X;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;

/* renamed from: X.2pl, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC60622pl {
    public static final boolean A02(C3FQ c3fq, float f) {
        C14360o3.A0B(c3fq, 0);
        if (((c3fq instanceof C3FO) || (c3fq instanceof C3FP)) && ((C3FP) c3fq).A03.computeVerticalScrollOffset() >= f) {
            return true;
        }
        return false;
    }

    public static final ViewOnTouchListenerC60632pm A00(Context context, Float f, boolean z) {
        int i = C1I2.DEFAULT_FIRST_VISIBLE_ITEM_POSITION;
        return new ViewOnTouchListenerC60632pm(context, new Handler(Looper.getMainLooper()), f, z);
    }

    /* JADX WARN: Code restructure failed: missing block: B:0:?, code lost:
    
        r1 = r1;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean A01(androidx.fragment.app.Fragment r1) {
        /*
        L0:
            if (r1 == 0) goto L9
            androidx.fragment.app.Fragment r0 = r1.mParentFragment
            if (r0 == 0) goto L9
            androidx.fragment.app.Fragment r1 = r1.mParentFragment
            goto L0
        L9:
            boolean r0 = r1 instanceof X.InterfaceC60132ov
            if (r0 == 0) goto L16
            X.2ov r1 = (X.InterfaceC60132ov) r1
            boolean r1 = r1.CcV()
            r0 = 1
            if (r1 != 0) goto L17
        L16:
            r0 = 0
        L17:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC60622pl.A01(androidx.fragment.app.Fragment):boolean");
    }
}
