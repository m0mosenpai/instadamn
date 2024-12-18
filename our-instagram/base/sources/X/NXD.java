package X;

import java.util.List;

/* loaded from: classes9.dex */
public final class NXD extends AbstractC53538Nm5 {
    public final List A00;

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof NXD) && C14360o3.A0K(this.A00, ((NXD) obj).A00));
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    public NXD(List list) {
        this.A00 = list;
    }
}
