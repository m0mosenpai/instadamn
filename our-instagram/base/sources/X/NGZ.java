package X;

import com.instagram.creation.base.MediaSession;

/* loaded from: classes9.dex */
public final class NGZ extends AbstractRunnableC14200nk {
    public final /* synthetic */ C52254NAu A00;
    public final /* synthetic */ MediaSession A01;
    public final /* synthetic */ C47Z A02;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NGZ(C52254NAu c52254NAu, MediaSession mediaSession, C47Z c47z) {
        super(542);
        this.A00 = c52254NAu;
        this.A02 = c47z;
        this.A01 = mediaSession;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C52254NAu c52254NAu = this.A00;
        C5L6 c5l6 = C5L6.A0E;
        C47Z c47z = this.A02;
        MediaSession mediaSession = this.A01;
        C52254NAu.A0D(c52254NAu, c5l6, mediaSession, c47z);
        C52254NAu.A0D(c52254NAu, C5L6.A08, mediaSession, c47z);
    }
}
