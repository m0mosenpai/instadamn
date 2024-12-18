package X;

import com.instagram.api.schemas.CreationToolEnum;

/* loaded from: classes7.dex */
public final class H3X extends C0T6 implements JJP {
    public final CreationToolEnum A00;

    public H3X(CreationToolEnum creationToolEnum) {
        C14360o3.A0B(creationToolEnum, 1);
        this.A00 = creationToolEnum;
    }

    @Override // X.JJP
    public final H3X Eu8() {
        return this;
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof H3X) && this.A00 == ((H3X) obj).A00);
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    @Override // X.JJP
    public final CreationToolEnum C9E() {
        return this.A00;
    }
}
