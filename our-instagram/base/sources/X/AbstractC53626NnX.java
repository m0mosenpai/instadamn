package X;

import android.content.Context;
import android.graphics.drawable.Drawable;

/* renamed from: X.NnX, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC53626NnX {
    public int A00;
    public String A01;
    public String A02;

    public final C88X A00(Context context) {
        Drawable drawable;
        C189128Zd c189128Zd;
        Drawable drawable2;
        N8K n8k = (N8K) this;
        if (n8k instanceof C52101N3b) {
            C14360o3.A0B(context, 0);
            C88Z c88z = C88Z.A0H;
            int i = ((AbstractC53626NnX) n8k).A00;
            if (i != 0) {
                drawable2 = context.getDrawable(i);
            } else {
                drawable2 = null;
            }
            c189128Zd = new C189128Zd(drawable2, c88z, n8k.A02);
            c189128Zd.A03 = n8k.A01;
        } else {
            C14360o3.A0B(context, 0);
            C88Z c88z2 = C88Z.A05;
            int i2 = ((AbstractC53626NnX) n8k).A00;
            if (i2 != 0) {
                drawable = context.getDrawable(i2);
            } else {
                drawable = null;
            }
            c189128Zd = new C189128Zd(drawable, c88z2, n8k.A02);
            c189128Zd.A03 = n8k.A01;
            c189128Zd.A00 = n8k.A00;
        }
        return new C88X(c189128Zd);
    }
}
