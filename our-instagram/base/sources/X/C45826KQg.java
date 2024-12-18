package X;

import com.instagram.api.schemas.MusicInfo;

/* renamed from: X.KQg, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45826KQg extends AbstractC46432Kgs {
    public final MusicInfo A00;

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof C45826KQg) && C14360o3.A0K(this.A00, ((C45826KQg) obj).A00));
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    public C45826KQg(MusicInfo musicInfo) {
        this.A00 = musicInfo;
    }
}
