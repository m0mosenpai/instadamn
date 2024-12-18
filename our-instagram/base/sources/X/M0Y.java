package X;

import com.instagram.igds.components.search.IgdsInlineSearchBox;

/* loaded from: classes8.dex */
public final class M0Y implements Runnable {
    public final /* synthetic */ KD6 A00;

    public M0Y(KD6 kd6) {
        this.A00 = kd6;
    }

    @Override // java.lang.Runnable
    public final void run() {
        IgdsInlineSearchBox igdsInlineSearchBox = this.A00.A0J;
        if (igdsInlineSearchBox != null) {
            igdsInlineSearchBox.A0E.requestFocus();
        }
    }
}
