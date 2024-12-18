package X;

import com.instagram.creation.base.MediaSession;

/* loaded from: classes9.dex */
public final class NHB extends AbstractC53443NkW {
    public final MediaSession A00;

    public NHB(MediaSession mediaSession) {
        C14360o3.A0B(mediaSession, 1);
        this.A00 = mediaSession;
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof NHB) && C14360o3.A0K(this.A00, ((NHB) obj).A00));
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }
}
