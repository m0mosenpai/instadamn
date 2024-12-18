package X;

import android.widget.ImageView;
import com.facebook.litho.annotations.Comparable;
import com.facebook.litho.annotations.Prop;

/* renamed from: X.Bpt, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26658Bpt extends AbstractC50792Va {

    @Comparable(type = 3)
    @Prop(optional = false, resType = EnumC27347C5c.COLOR)
    public int A00;

    public C26658Bpt() {
        super("SolidColor");
    }

    public static C26280Bjn A03(C2XE c2xe) {
        return new C26280Bjn(c2xe, new C26658Bpt());
    }

    @Override // X.AbstractC50812Vc
    public final Object[] A0X() {
        return AbstractC25228BEl.A1Z(Float.valueOf(-1.0f), this.A00);
    }

    @Override // X.AbstractC50792Va
    public final AbstractC50812Vc A0c(C2XE c2xe) {
        int i = this.A00;
        C80403iV A03 = C80393iU.A03(c2xe);
        A03.A0E(ImageView.ScaleType.FIT_XY);
        A03.A0D(AbstractC25225BEi.A0G(i));
        return A03.A0A();
    }
}
