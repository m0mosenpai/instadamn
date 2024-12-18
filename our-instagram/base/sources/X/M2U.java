package X;

import com.instagram.ui.widget.nametag.NametagCardView;

/* loaded from: classes8.dex */
public final class M2U implements Runnable {
    public final /* synthetic */ NametagCardView A00;

    public M2U(NametagCardView nametagCardView) {
        this.A00 = nametagCardView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.A00.invalidate();
    }
}
