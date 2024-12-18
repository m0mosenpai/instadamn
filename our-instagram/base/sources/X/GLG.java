package X;

import com.instagram.igds.components.search.IgdsInlineSearchBox;

/* loaded from: classes6.dex */
public final class GLG implements Runnable {
    public final /* synthetic */ IgdsInlineSearchBox A00;

    public GLG(IgdsInlineSearchBox igdsInlineSearchBox) {
        this.A00 = igdsInlineSearchBox;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.A00.A04();
    }
}
