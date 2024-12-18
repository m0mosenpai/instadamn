package X;

import android.widget.TextView;

/* renamed from: X.WsU, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class RunnableC71359WsU implements Runnable {
    public final /* synthetic */ C69453Vnc A00;

    public RunnableC71359WsU(C69453Vnc c69453Vnc) {
        this.A00 = c69453Vnc;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C69453Vnc c69453Vnc = this.A00;
        int width = ((c69453Vnc.A02.getWidth() - c69453Vnc.A08.getWidth()) - c69453Vnc.A05.getWidth()) - c69453Vnc.A03.getWidth();
        TextView textView = c69453Vnc.A06;
        if (width < textView.getWidth()) {
            textView.setVisibility(8);
            c69453Vnc.A07.setVisibility(0);
        }
    }
}
