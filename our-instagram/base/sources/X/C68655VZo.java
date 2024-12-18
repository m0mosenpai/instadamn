package X;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.widget.PopupWindow;

/* renamed from: X.VZo, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C68655VZo {
    public final PopupWindow A00;

    public C68655VZo(Context context) {
        PopupWindow popupWindow = new PopupWindow(context);
        this.A00 = popupWindow;
        popupWindow.setBackgroundDrawable(new ColorDrawable(0));
        popupWindow.setContentView(new C131555wr(context));
        popupWindow.setInputMethodMode(1);
    }
}
