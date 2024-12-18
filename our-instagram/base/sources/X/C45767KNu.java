package X;

import java.util.Map;

/* renamed from: X.KNu, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45767KNu extends AbstractC46412KgY {
    public final Map A00;

    public C45767KNu(Map map) {
        C14360o3.A0B(map, 1);
        this.A00 = map;
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof C45767KNu) && C14360o3.A0K(this.A00, ((C45767KNu) obj).A00));
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }
}
