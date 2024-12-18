package X;

/* renamed from: X.8DU, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C8DU {
    public C8DV A00 = null;

    public final void A00(int i) {
        int i2;
        C8DV c8dv = this.A00;
        if (c8dv != null) {
            i2 = c8dv.A04.size();
        } else {
            i2 = 0;
        }
        if (i >= i2) {
            AbstractC12120kG.A07("TextModeBackgroundManager", "Tried to set TextColorSchemeList index to out of bounds index.", null);
            return;
        }
        while (true) {
            C8DV c8dv2 = this.A00;
            if (c8dv2 != null) {
                if (c8dv2.A00 == i) {
                    return;
                } else {
                    c8dv2.A00();
                }
            }
        }
    }
}
