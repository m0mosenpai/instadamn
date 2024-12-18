package X;

import android.view.View;
import com.instagram.igds.components.search.IgdsInlineSearchBox;

/* loaded from: classes7.dex */
public final class HJ7 extends C3PD {
    public final /* synthetic */ IgdsInlineSearchBox A00;

    @Override // X.C3PD, X.C3PE
    public final boolean DsE(View view) {
        C14360o3.A0B(view, 0);
        if (!view.isEnabled()) {
            return false;
        }
        view.performHapticFeedback(3);
        this.A00.A01();
        return true;
    }

    public HJ7(IgdsInlineSearchBox igdsInlineSearchBox) {
        this.A00 = igdsInlineSearchBox;
    }
}
