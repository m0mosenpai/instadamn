package X;

import android.os.Handler;
import android.view.View;
import android.widget.EditText;
import java.lang.ref.Reference;

/* renamed from: X.Q7a, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class RunnableC58753Q7a extends AbstractC106884rp implements Runnable {
    public final Reference A00;

    @Override // X.AbstractC106884rp
    public final void A00() {
        Handler handler;
        View view = (View) this.A00.get();
        if (view != null && (handler = view.getHandler()) != null) {
            handler.post(this);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        Snw.A00((EditText) this.A00.get(), 1);
    }

    public RunnableC58753Q7a(EditText editText) {
        this.A00 = AbstractC25225BEi.A16(editText);
    }
}
