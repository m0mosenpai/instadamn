package X;

import android.content.Context;

/* renamed from: X.F8k, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC34238F8k {
    public static final void A00(Context context, int i) {
        int i2;
        Object[] objArr;
        Integer valueOf;
        C14360o3.A0B(context, 0);
        int ceil = (int) Math.ceil(i / 60.0f);
        if (ceil > 1) {
            i2 = 2131974269;
            objArr = new Object[1];
            valueOf = Integer.valueOf(ceil);
        } else {
            i2 = 2131974270;
            objArr = new Object[1];
            valueOf = Integer.valueOf(i);
        }
        objArr[0] = valueOf;
        String string = context.getString(i2, objArr);
        C14360o3.A0A(string);
        AbstractC35254Fgn.A05(context, string, context.getString(2131974271));
    }
}
