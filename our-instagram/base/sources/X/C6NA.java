package X;

import androidx.compose.ui.layout.SubcomposeSlotReusePolicy;

/* renamed from: X.6NA, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C6NA {
    public C6NM A00;
    public final SubcomposeSlotReusePolicy A01;
    public final InterfaceC16620sF A02;
    public final InterfaceC16620sF A03;
    public final InterfaceC16620sF A04;

    public static final C6NM A00(C6NA c6na) {
        C6NM c6nm = c6na.A00;
        if (c6nm != null) {
            return c6nm;
        }
        throw new IllegalArgumentException("SubcomposeLayoutState is not attached to SubcomposeLayout");
    }

    public C6NA(SubcomposeSlotReusePolicy subcomposeSlotReusePolicy) {
        this.A01 = subcomposeSlotReusePolicy;
        this.A04 = new C206989Ed(this, 9);
        this.A02 = new C206989Ed(this, 7);
        this.A03 = new C206989Ed(this, 8);
    }

    public C6NA() {
        this(AU2.A00);
    }
}
