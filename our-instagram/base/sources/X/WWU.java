package X;

import java.util.ArrayList;
import java.util.Map;

/* loaded from: classes11.dex */
public final class WWU implements X99 {
    public String A00;

    @Override // X.X99
    public final void ATJ(C69585Vro c69585Vro, Map map) {
        Vh4 vh4 = (Vh4) c69585Vro.A03.get(this.A00);
        if (vh4 != null && vh4.A00) {
            vh4.A00 = false;
            ArrayList arrayList = vh4.A01.A02.A01;
            int indexOf = arrayList.indexOf(vh4);
            if (indexOf != -1) {
                arrayList.remove(indexOf);
            }
        }
    }
}
