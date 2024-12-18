package X;

import com.instagram.common.ui.base.IgEditText;

/* loaded from: classes8.dex */
public final class M13 implements Runnable {
    public final /* synthetic */ C45466KBb A00;

    public M13(C45466KBb c45466KBb) {
        this.A00 = c45466KBb;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C45466KBb c45466KBb = this.A00;
        IgEditText igEditText = c45466KBb.A0I;
        if (igEditText == null) {
            C14360o3.A0F("noteEditText");
            throw C00O.createAndThrow();
        }
        igEditText.invalidate();
        c45466KBb.A1B.postDelayed(this, 16L);
    }
}
