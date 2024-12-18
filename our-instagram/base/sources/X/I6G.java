package X;

import android.content.Context;
import android.content.res.Resources;
import com.instagram.ui.widget.autowidthtogglebutton.AutoWidthToggleButton;

/* loaded from: classes7.dex */
public abstract class I6G {
    public static final void A00(Context context, C38628GyV c38628GyV, AutoWidthToggleButton autoWidthToggleButton, String str) {
        String string;
        String string2;
        AbstractC167017dG.A1O(autoWidthToggleButton, context);
        autoWidthToggleButton.setTextOn(context.getResources().getString(c38628GyV.A06));
        autoWidthToggleButton.setTextOff(context.getResources().getString(c38628GyV.A05));
        Resources resources = context.getResources();
        int i = c38628GyV.A04;
        if (str != null) {
            string = AbstractC166997dE.A0r(resources, str, i);
        } else {
            string = resources.getString(i);
        }
        autoWidthToggleButton.setContentDescriptionOn(string);
        Resources resources2 = context.getResources();
        int i2 = c38628GyV.A03;
        if (str != null) {
            string2 = AbstractC166997dE.A0r(resources2, str, i2);
        } else {
            string2 = resources2.getString(i2);
        }
        autoWidthToggleButton.setContentDescriptionOff(string2);
    }
}
