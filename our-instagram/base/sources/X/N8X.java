package X;

import com.instagram.music.common.model.AudioType;

/* loaded from: classes9.dex */
public final class N8X extends AbstractC53440NkT {
    public final AudioType A00;

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof N8X) && this.A00 == ((N8X) obj).A00);
    }

    public final int hashCode() {
        return AbstractC167017dG.A0M(this.A00);
    }

    public N8X(AudioType audioType) {
        this.A00 = audioType;
    }
}
