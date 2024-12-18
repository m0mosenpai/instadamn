package X;

import android.graphics.drawable.GradientDrawable;
import com.facebook.litho.annotations.Comparable;
import com.facebook.litho.annotations.Prop;

/* renamed from: X.Bpm, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26651Bpm extends AbstractC50792Va {

    @Comparable(type = 3)
    @Prop(optional = false, resType = EnumC27347C5c.COLOR)
    public int A00;

    @Comparable(type = 3)
    @Prop(optional = false, resType = EnumC27347C5c.DIMEN_SIZE)
    public int A01;

    public C26651Bpm() {
        super("Dot");
    }

    @Override // X.AbstractC50792Va
    public final AbstractC50812Vc A0c(C2XE c2xe) {
        int i = this.A01;
        int i2 = this.A00;
        GradientDrawable A0O = AbstractC25228BEl.A0O(1);
        A0O.setColor(i2);
        A0O.setSize(i, i);
        C80403iV A03 = C80393iU.A03(c2xe);
        A03.A0D(A0O);
        return A03.A0A();
    }

    @Override // X.AbstractC50812Vc
    public final Object[] A0X() {
        Integer A0p = AbstractC25227BEk.A0p();
        return new Object[]{A0p, A0p, A0p, A0p, Integer.valueOf(this.A00), Integer.valueOf(this.A01)};
    }
}
