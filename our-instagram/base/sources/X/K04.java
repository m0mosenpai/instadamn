package X;

/* loaded from: classes8.dex */
public final class K04 extends C0T6 implements InterfaceC66482zP {
    public final boolean A00;

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof K04) && this.A00 == ((K04) obj).A00);
    }

    @Override // X.InterfaceC66482zP
    public final /* bridge */ /* synthetic */ Object getKey() {
        return "ai_sticker_generate_more_button";
    }

    public final int hashCode() {
        if (!this.A00) {
            return 1237;
        }
        return 1231;
    }

    @Override // X.InterfaceC66492zQ
    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        return false;
    }

    public K04(boolean z) {
        this.A00 = z;
    }

    public K04() {
        this(false);
    }
}
