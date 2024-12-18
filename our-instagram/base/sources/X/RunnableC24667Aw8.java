package X;

import android.text.Editable;
import android.widget.EditText;

/* renamed from: X.Aw8, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class RunnableC24667Aw8 implements Runnable {
    public final /* synthetic */ C202848y2 A00;
    public final /* synthetic */ Integer A01;

    public RunnableC24667Aw8(C202848y2 c202848y2, Integer num) {
        this.A00 = c202848y2;
        this.A01 = num;
    }

    @Override // java.lang.Runnable
    public final void run() {
        EditText editText = this.A00.A02;
        editText.onPreDraw();
        Editable text = editText.getText();
        AbstractC209689Pe.A03(editText.getLayout(), text, this.A01, editText.getTextSize());
    }
}
