package X;

import android.view.View;
import com.facebook.R;

/* loaded from: classes11.dex */
public abstract class VTD {
    public static void A00(C69453Vnc c69453Vnc, int i, boolean z) {
        int i2;
        if (z) {
            c69453Vnc.A0A.setVisibility(i);
            c69453Vnc.A09.setVisibility(i);
        }
        if (i == 0) {
            i2 = c69453Vnc.A02.getResources().getDimensionPixelSize(R.dimen.abc_button_padding_horizontal_material);
        } else {
            i2 = 0;
        }
        View view = c69453Vnc.A02;
        view.setPadding(0, i2, 0, i2);
        view.setVisibility(i);
        c69453Vnc.A01.setVisibility(i);
    }
}
