package X;

import java.util.Map;

/* loaded from: classes11.dex */
public final class Vh4 {
    public boolean A00;
    public final C69585Vro A01;
    public final Map A02;

    public Vh4(C69585Vro c69585Vro, Map map, boolean z) {
        this.A01 = c69585Vro;
        this.A02 = map;
        if (z && !this.A00) {
            this.A00 = true;
            c69585Vro.A02.A01.add(this);
        }
    }
}
