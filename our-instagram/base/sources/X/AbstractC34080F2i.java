package X;

import android.view.View;
import com.facebook.R;

/* renamed from: X.F2i, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC34080F2i {
    public static final void A00(View view, InterfaceC148366m6 interfaceC148366m6) {
        View findViewById = view.findViewById(R.id.nux_banner);
        if (findViewById != null && findViewById.getVisibility() == 0) {
            AbstractC34082F2k.A00(findViewById);
            interfaceC148366m6.DWL();
        }
    }
}
