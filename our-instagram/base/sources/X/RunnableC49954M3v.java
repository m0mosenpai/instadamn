package X;

import com.instagram.common.ui.base.IgEditText;
import com.instagram.music.common.model.AudioOverlayTrack;

/* renamed from: X.M3v, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class RunnableC49954M3v implements Runnable {
    public final /* synthetic */ C45466KBb A00;
    public final /* synthetic */ AudioOverlayTrack A01;

    public RunnableC49954M3v(C45466KBb c45466KBb, AudioOverlayTrack audioOverlayTrack) {
        this.A00 = c45466KBb;
        this.A01 = audioOverlayTrack;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C45466KBb c45466KBb = this.A00;
        C45466KBb.A0P(c45466KBb, this.A01, false);
        IgEditText igEditText = c45466KBb.A0I;
        if (igEditText == null) {
            C14360o3.A0F("noteEditText");
            throw C00O.createAndThrow();
        }
        AbstractC13880nE.A0O(igEditText);
    }
}
