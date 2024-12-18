package X;

import android.widget.EditText;

/* renamed from: X.WuU, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class RunnableC71468WuU implements Runnable {
    public final /* synthetic */ EditText A00;
    public final /* synthetic */ C70545Wcb A01;

    public RunnableC71468WuU(EditText editText, C70545Wcb c70545Wcb) {
        this.A01 = c70545Wcb;
        this.A00 = editText;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.A00.removeTextChangedListener(this.A01.A00.A00);
    }
}
