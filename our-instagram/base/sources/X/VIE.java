package X;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes11.dex */
public final class VIE extends IllegalArgumentException {
    public final List A00;

    @Override // java.lang.Throwable
    public final String toString() {
        String A05 = AbstractC13670mt.A05("|", this.A00);
        if (A05 == null) {
            return "";
        }
        return A05;
    }

    public VIE(VD5 vd5, String str) {
        super(str);
        ArrayList arrayList = new ArrayList();
        this.A00 = arrayList;
        arrayList.add(new C69557VrM(vd5, str));
    }

    public VIE() {
        this.A00 = new ArrayList();
    }
}
