package X;

import java.util.ArrayList;
import java.util.Map;

/* renamed from: X.IMq, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C41225IMq {
    public final Map A00 = AbstractC166987dD.A1I();
    public final Map A01 = AbstractC166987dD.A1I();
    public final /* synthetic */ C41226IMr A02;

    public C41225IMq(C41226IMr c41226IMr) {
        this.A02 = c41226IMr;
    }

    public final ArrayList A00() {
        ArrayList A1E = AbstractC166987dD.A1E();
        for (Object obj : this.A02.A00.A05) {
            Map map = this.A00;
            if (map.containsKey(obj)) {
                A1E.add(map.get(obj));
            }
        }
        return A1E;
    }

    public final ArrayList A01() {
        ArrayList A1E = AbstractC166987dD.A1E();
        for (Object obj : this.A02.A00.A05) {
            if (this.A00.containsKey(obj)) {
                A1E.add(obj);
            }
        }
        return A1E;
    }
}
