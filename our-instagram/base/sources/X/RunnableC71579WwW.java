package X;

import com.instagram.tagging.widget.MediaTagHintsLayout;

/* renamed from: X.WwW, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class RunnableC71579WwW implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C75113Zb A01;
    public final /* synthetic */ MediaTagHintsLayout A02;

    public RunnableC71579WwW(C75113Zb c75113Zb, MediaTagHintsLayout mediaTagHintsLayout, int i) {
        this.A02 = mediaTagHintsLayout;
        this.A01 = c75113Zb;
        this.A00 = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C75113Zb c75113Zb = this.A01;
        int i = this.A00;
        boolean A00 = MediaTagHintsLayout.A00(c75113Zb, i);
        MediaTagHintsLayout mediaTagHintsLayout = this.A02;
        if (!A00) {
            mediaTagHintsLayout.A02.getClass();
            mediaTagHintsLayout.A02(c75113Zb.A07(i, -1), true);
        }
        Runnable runnable = mediaTagHintsLayout.A03;
        if (runnable != null) {
            mediaTagHintsLayout.A05.removeCallbacks(runnable);
            mediaTagHintsLayout.A03 = null;
        }
    }
}
