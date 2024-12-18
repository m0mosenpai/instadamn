package X;

/* renamed from: X.VJs, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC68255VJs {
    public final void A00() {
        if (this instanceof UKF) {
            UCo uCo = ((UKF) this).A00;
            if (!uCo.A04) {
                uCo.setVisibility(uCo.A01);
                return;
            }
            return;
        }
        UCo uCo2 = ((UKE) this).A00;
        uCo2.setIndeterminate(false);
        uCo2.A01(0, false);
        uCo2.A01(uCo2.A00, uCo2.A06);
    }
}
