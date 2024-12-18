package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;

/* renamed from: X.U4j, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C66213U4j extends View {
    public final Drawable A00;

    public void setIsSwirlAnimating(boolean z) {
        Drawable drawable = this.A00;
        if (drawable instanceof U8Z) {
            ((U8Z) drawable).A01(z);
        }
    }

    public C66213U4j(Context context, EnumC191908em enumC191908em, EnumC68205VFx enumC68205VFx, C6FH c6fh, float[] fArr, float f, int i) {
        super(context);
        boolean CSL = c6fh.CSL();
        Integer num = C05F.A0u;
        C14360o3.A0B(enumC191908em, 0);
        if (XPC.A00(enumC191908em).AVw(num)) {
            this.A00 = new C66227U4x(i, fArr);
            setLayerType(2, null);
            setAlpha(f);
        } else {
            U8Z u8z = new U8Z(context, fArr, i, CSL);
            this.A00 = u8z;
            if (enumC68205VFx.equals(EnumC68205VFx.A04)) {
                u8z.A01(true);
            }
        }
        setBackground(this.A00);
    }

    public final void A00(int i, int i2) {
        setMeasuredDimension(i, i2);
    }
}
