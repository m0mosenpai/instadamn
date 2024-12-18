package X;

import com.instagram.ui.widget.textview.ComposerAutoCompleteTextView;

/* loaded from: classes8.dex */
public final class LXF implements InterfaceC168097f4 {
    public final ComposerAutoCompleteTextView A00;

    @Override // X.InterfaceC168097f4
    public final /* bridge */ /* synthetic */ ComposerAutoCompleteTextView AeD() {
        return this.A00;
    }

    public LXF(LYZ lyz) {
        L8I l8i = lyz.A02;
        if (l8i == null) {
            C14360o3.A0F("viewHolder");
            throw C00O.createAndThrow();
        }
        this.A00 = l8i.A0D;
    }
}
