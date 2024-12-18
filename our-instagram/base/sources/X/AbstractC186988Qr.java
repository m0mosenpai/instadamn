package X;

import android.content.Context;
import android.view.View;
import com.instagram.igds.components.mediabutton.IgdsMediaButton;

/* renamed from: X.8Qr, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC186988Qr {
    public static final IgdsMediaButton A00(Context context, Integer num) {
        int generateViewId;
        IgdsMediaButton igdsMediaButton = new IgdsMediaButton(context, null, 0);
        igdsMediaButton.setSize(EnumC151046r5.A04);
        igdsMediaButton.setButtonStyle(EnumC151036r4.A03);
        igdsMediaButton.setLayoutParams(new C56302iJ(-2, -2));
        if (num != null) {
            generateViewId = num.intValue();
        } else {
            generateViewId = View.generateViewId();
        }
        igdsMediaButton.setId(generateViewId);
        return igdsMediaButton;
    }
}
