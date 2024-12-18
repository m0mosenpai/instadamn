package X;

import android.text.Editable;

/* loaded from: classes5.dex */
public final class BYQ extends Editable.Factory {
    @Override // android.text.Editable.Factory
    public final Editable newEditable(CharSequence charSequence) {
        return new BYR(this, charSequence);
    }
}
