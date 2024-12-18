package X;

import java.util.Map;

/* loaded from: classes9.dex */
public final class NIS extends AbstractC53448Nkb {
    public final Map A00;

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof NIS) && C14360o3.A0K(this.A00, ((NIS) obj).A00));
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    public NIS(Map map) {
        this.A00 = map;
    }
}
