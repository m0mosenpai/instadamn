package X;

/* renamed from: X.8qo, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C198888qo extends C8KC {
    public final boolean A00;

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof C198888qo) && this.A00 == ((C198888qo) obj).A00);
    }

    public C198888qo(boolean z) {
        super("replace_clip_flow");
        this.A00 = z;
    }

    public final int hashCode() {
        if (!this.A00) {
            return 1237;
        }
        return 1231;
    }

    public C198888qo() {
        this(false);
    }
}
