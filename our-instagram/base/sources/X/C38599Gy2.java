package X;

import com.instagram.api.schemas.IGMusicArtistPinningErrorType;

/* renamed from: X.Gy2, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38599Gy2 extends C0T6 {
    public final IGMusicArtistPinningErrorType A00;
    public final boolean A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C38599Gy2) {
                C38599Gy2 c38599Gy2 = (C38599Gy2) obj;
                if (this.A00 != c38599Gy2.A00 || this.A01 != c38599Gy2.A01) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0K(this.A01, AbstractC167017dG.A0M(this.A00) * 31);
    }

    public C38599Gy2(IGMusicArtistPinningErrorType iGMusicArtistPinningErrorType, boolean z) {
        this.A00 = iGMusicArtistPinningErrorType;
        this.A01 = z;
    }
}
