package X;

import java.util.Arrays;
import java.util.List;

/* loaded from: classes10.dex */
public final class SLR {
    public final C02Q A00;
    public final String A01;
    public final List A02;

    public final String toString() {
        return AnonymousClass001.A0S("LoadPath{decodePaths=", Arrays.toString(this.A02.toArray()), '}');
    }

    public SLR(C02Q c02q, Class cls, Class cls2, Class cls3, List list) {
        this.A00 = c02q;
        if (!list.isEmpty()) {
            this.A02 = list;
            this.A01 = AnonymousClass001.A15("Failed LoadPath{", cls.getSimpleName(), "->", cls2.getSimpleName(), "->", cls3.getSimpleName(), "}");
            return;
        }
        throw AbstractC166987dD.A12("Must not be empty.");
    }
}
