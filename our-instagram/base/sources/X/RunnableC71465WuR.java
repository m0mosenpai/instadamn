package X;

import android.widget.EditText;

/* renamed from: X.WuR, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class RunnableC71465WuR implements Runnable {
    public final /* synthetic */ EditText A00;
    public final /* synthetic */ C70543WcZ A01;

    public RunnableC71465WuR(EditText editText, C70543WcZ c70543WcZ) {
        this.A01 = c70543WcZ;
        this.A00 = editText;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.A00.removeTextChangedListener(this.A01.A00.A02);
    }
}
