package X;

import java.util.Arrays;
import java.util.List;

/* loaded from: classes10.dex */
public final class RVR extends TXM {
    public final List A00;

    public RVR(List list) {
        super(AnonymousClass001.A0R("Dependency cycle detected: ", Arrays.toString(list.toArray())));
        this.A00 = list;
    }
}
