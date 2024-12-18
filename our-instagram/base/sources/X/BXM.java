package X;

import android.view.View;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes5.dex */
public final class BXM implements View.OnFocusChangeListener {
    public final List A00 = AbstractC166987dD.A1E();

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z) {
        Iterator it = this.A00.iterator();
        while (it.hasNext()) {
            ((View.OnFocusChangeListener) it.next()).onFocusChange(view, z);
        }
    }
}
