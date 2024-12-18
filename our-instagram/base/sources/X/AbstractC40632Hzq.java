package X;

import com.instagram.igds.components.button.IgdsButton;

/* renamed from: X.Hzq, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC40632Hzq {
    public static final void A00(C38523Gwj c38523Gwj, C75113Zb c75113Zb) {
        int intValue = c75113Zb.A15.intValue();
        if (intValue != 0) {
            if (intValue != 2) {
                IgdsButton igdsButton = c38523Gwj.A02;
                igdsButton.setEnabled(true);
                igdsButton.setLoading(false);
                return;
            }
            c38523Gwj.A02.setEnabled(false);
            return;
        }
        IgdsButton igdsButton2 = c38523Gwj.A02;
        igdsButton2.setEnabled(false);
        igdsButton2.setLoading(true);
    }
}
