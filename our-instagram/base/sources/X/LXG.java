package X;

import android.view.ViewStub;
import com.instagram.ui.widget.textview.ComposerAutoCompleteTextView;

/* loaded from: classes8.dex */
public final class LXG implements InterfaceC168057f0 {
    public final ViewStub A00;
    public final ComposerAutoCompleteTextView A01;

    @Override // X.InterfaceC168057f0
    public final ComposerAutoCompleteTextView AeD() {
        return this.A01;
    }

    @Override // X.InterfaceC168057f0
    public final ViewStub Am5() {
        return this.A00;
    }

    public LXG(LYZ lyz) {
        L8I l8i = lyz.A02;
        if (l8i == null) {
            C14360o3.A0F("viewHolder");
            throw C00O.createAndThrow();
        }
        this.A01 = l8i.A0D;
        this.A00 = l8i.A09;
    }
}
