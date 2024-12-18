package X;

import com.instagram.common.ui.base.IgEditText;

/* renamed from: X.M0t, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class RunnableC49874M0t implements Runnable {
    public final /* synthetic */ C45466KBb A00;

    public RunnableC49874M0t(C45466KBb c45466KBb) {
        this.A00 = c45466KBb;
    }

    @Override // java.lang.Runnable
    public final void run() {
        IgEditText igEditText = this.A00.A0I;
        if (igEditText == null) {
            C14360o3.A0F("noteEditText");
            throw C00O.createAndThrow();
        }
        AbstractC43592JPx.A1J(igEditText);
    }
}
