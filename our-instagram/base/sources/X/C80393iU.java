package X;

import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.litho.annotations.Comparable;
import com.facebook.litho.annotations.Prop;
import java.util.BitSet;

/* renamed from: X.3iU, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C80393iU extends AbstractC50792Va {

    @Comparable(type = JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET)
    @Prop(optional = false, resType = EnumC27347C5c.DRAWABLE)
    public Drawable A00;

    @Comparable(type = JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET)
    @Prop(optional = true, resType = EnumC27347C5c.NONE)
    public ImageView.ScaleType A01;

    @Comparable(type = 3)
    @Prop(optional = true, resType = EnumC27347C5c.NONE)
    public boolean A02;

    public C80393iU() {
        super("Image");
        this.A02 = true;
    }

    public static C80403iV A03(C2XE c2xe) {
        return new C80403iV(c2xe, new C80393iU());
    }

    @Override // X.AbstractC50812Vc
    public final Object[] A0X() {
        return new Object[]{this.A00, this.A01, Boolean.valueOf(this.A02)};
    }

    @Override // X.AbstractC50792Va
    public final AbstractC50812Vc A0c(C2XE c2xe) {
        Drawable drawable = this.A00;
        ImageView.ScaleType scaleType = this.A01;
        boolean z = this.A02;
        C14360o3.A0B(c2xe, 0);
        if (C2V3.usePrimitiveImage && C2V3.enablePrimitiveMeasurementFix) {
            if (scaleType == null) {
                scaleType = ImageView.ScaleType.FIT_CENTER;
            }
            return new C26599Bow(drawable, scaleType, z);
        }
        C80423iX c80423iX = new C80423iX(c2xe, new C80413iW());
        C80413iW c80413iW = c80423iX.A01;
        c80413iW.A00 = drawable;
        BitSet bitSet = c80423iX.A02;
        bitSet.set(0);
        if (scaleType == null) {
            scaleType = ImageView.ScaleType.FIT_CENTER;
        }
        c80413iW.A01 = scaleType;
        c80413iW.A02 = z;
        AbstractC77733dx.A00(bitSet, c80423iX.A03, 1);
        c80423iX.A03();
        C14360o3.A0A(c80413iW);
        return c80413iW;
    }
}
