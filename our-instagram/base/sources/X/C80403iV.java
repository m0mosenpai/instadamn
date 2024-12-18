package X;

import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import java.util.BitSet;

/* renamed from: X.3iV, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C80403iV extends AbstractC77733dx {
    public C2XE A00;
    public C80393iU A01;
    public final BitSet A02;
    public final String[] A03;

    public C80403iV(C2XE c2xe, C80393iU c80393iU) {
        super(c80393iU, c2xe, 0);
        this.A03 = new String[]{"drawable"};
        BitSet bitSet = new BitSet(1);
        this.A02 = bitSet;
        this.A01 = c80393iU;
        this.A00 = c2xe;
        bitSet.clear();
    }

    public final void A0C() {
        this.A01.A02 = true;
    }

    public final C80393iU A0A() {
        AbstractC77733dx.A00(this.A02, this.A03, 1);
        A03();
        return this.A01;
    }

    public final void A0B() {
        A0E(ImageView.ScaleType.FIT_CENTER);
    }

    public final void A0D(Drawable drawable) {
        this.A01.A00 = drawable;
        this.A02.set(0);
    }

    public final void A0E(ImageView.ScaleType scaleType) {
        this.A01.A01 = scaleType;
    }
}
