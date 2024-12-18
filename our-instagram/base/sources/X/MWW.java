package X;

import com.instagram.music.common.model.MusicAssetModel;

/* loaded from: classes9.dex */
public final class MWW extends C0T6 {
    public final int A00;
    public final int A01;
    public final MusicAssetModel A02;
    public final String A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof MWW) {
                MWW mww = (MWW) obj;
                if (this.A01 != mww.A01 || this.A00 != mww.A00 || !C14360o3.A0K(this.A02, mww.A02) || !C14360o3.A0K(this.A03, mww.A03)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166997dE.A0J(this.A02, ((this.A01 * 31) + this.A00) * 31) + AbstractC167017dG.A0O(this.A03);
    }

    public MWW(MusicAssetModel musicAssetModel, String str, int i, int i2) {
        this.A01 = i;
        this.A00 = i2;
        this.A02 = musicAssetModel;
        this.A03 = str;
    }
}
