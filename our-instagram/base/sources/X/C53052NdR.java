package X;

import com.instagram.clips.audio.model.AudioPageAssetModel;
import com.instagram.music.common.config.MusicAttributionConfig;

/* renamed from: X.NdR, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C53052NdR extends AbstractC53585Nmr {
    public final AudioPageAssetModel A00;
    public final MusicAttributionConfig A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C53052NdR) {
                C53052NdR c53052NdR = (C53052NdR) obj;
                if (!C14360o3.A0K(this.A01, c53052NdR.A01) || !C14360o3.A0K(this.A00, c53052NdR.A00)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0I(this.A00, AbstractC166987dD.A0G(this.A01));
    }

    public C53052NdR(AudioPageAssetModel audioPageAssetModel, MusicAttributionConfig musicAttributionConfig) {
        this.A01 = musicAttributionConfig;
        this.A00 = audioPageAssetModel;
    }
}
