package X;

import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.Jaw, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43889Jaw extends AbstractC154146wP {
    public final int A00;
    public final int A01;
    public final Object A02;

    public C43889Jaw(Object obj, int i, int i2) {
        this.A00 = i2;
        this.A02 = obj;
        this.A01 = i;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    @Override // X.AbstractC154146wP
    public final int A03(int i) {
        int i2;
        int i3;
        EnumC39586Hdw enumC39586Hdw;
        switch (this.A00) {
            case 0:
                try {
                    i2 = ((C2UU) this.A02).getItemViewType(i);
                } catch (IndexOutOfBoundsException e) {
                    AbstractC12120kG.A0A("GalleryPickerGridSpanSizeUtil", "adapter.getItemViewType failed", e);
                    i2 = 1;
                }
                C66362zD c66362zD = (C66362zD) this.A02;
                i3 = this.A01;
                if (i2 == c66362zD.A01(LZG.class) || i2 == c66362zD.A01(LZH.class) || i2 == c66362zD.A01(C43857JaN.class) || i2 == c66362zD.A01(LZI.class)) {
                    return i3;
                }
                return 1;
            case 1:
                C2UU c2uu = ((RecyclerView) this.A02).A0A;
                if (c2uu != null) {
                    i3 = 1;
                    if (i < c2uu.getItemCount()) {
                        int itemViewType = c2uu.getItemViewType(i);
                        if (itemViewType != 2 && itemViewType != 3 && itemViewType != 6 && itemViewType != 7 && itemViewType != 8) {
                            return 1;
                        }
                        return this.A01;
                    }
                    return i3;
                }
                throw new IllegalStateException("Required value was null.");
            default:
                if (((AbstractC43842Ja5) this.A02).isModelClass(i, C56092OvC.class)) {
                    enumC39586Hdw = EnumC39586Hdw.A0M;
                } else {
                    enumC39586Hdw = EnumC39586Hdw.A0N;
                }
                int ordinal = enumC39586Hdw.ordinal();
                i3 = 2;
                if (ordinal == 4 || ordinal == 3) {
                    return 2 / this.A01;
                }
                return i3;
        }
    }
}
