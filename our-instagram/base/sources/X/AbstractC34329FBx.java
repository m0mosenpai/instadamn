package X;

import android.widget.Button;

/* renamed from: X.FBx, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC34329FBx {
    public static void A00(C50676MYu c50676MYu, C31903E0j c31903E0j) {
        int i = c50676MYu.A02;
        Button button = c31903E0j.A00;
        if (i != 0) {
            button.setText(i);
        } else {
            button.setText(c50676MYu.A04);
        }
        C0fQ.A00(c50676MYu.A0A, button);
        AbstractC166987dD.A1O(AbstractC31172DnG.A05(c31903E0j), button, c50676MYu.A08);
        button.setAlpha(c50676MYu.A07);
    }
}
