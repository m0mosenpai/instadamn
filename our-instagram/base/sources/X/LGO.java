package X;

import java.util.Arrays;

/* loaded from: classes8.dex */
public final class LGO {
    public static final LGO A01 = new LGO(EnumC46141Kbf.PRESENCE);
    public final EnumC46141Kbf A00;

    public final boolean equals(Object obj) {
        if (this != obj) {
            return obj != null && getClass() == obj.getClass() && this.A00 == ((LGO) obj).A00;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.A00, null});
    }

    public LGO(EnumC46141Kbf enumC46141Kbf) {
        this.A00 = enumC46141Kbf;
    }
}
