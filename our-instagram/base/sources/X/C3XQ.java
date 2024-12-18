package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.MusicInfo;
import com.instagram.api.schemas.OriginalSoundData;
import com.instagram.api.schemas.OriginalSoundDataIntf;
import java.util.List;

/* renamed from: X.3XQ, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3XQ extends C0T6 implements C3XR {
    public final MusicInfo A00;
    public final OriginalSoundData A01;
    public final List A02;

    @Override // X.C3XR
    public final C3XR E9P(C1DY c1dy) {
        return this;
    }

    @Override // X.C3XR
    public final C3XQ Ex0(C1DY c1dy) {
        return this;
    }

    @Override // X.C3XR
    public final C3XQ Ex1(C1DV c1dv) {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C3XQ) {
                C3XQ c3xq = (C3XQ) obj;
                if (!C14360o3.A0K(this.A00, c3xq.A00) || !C14360o3.A0K(this.A01, c3xq.A01) || !C14360o3.A0K(this.A02, c3xq.A02)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        MusicInfo musicInfo = this.A00;
        int hashCode = (musicInfo == null ? 0 : musicInfo.hashCode()) * 31;
        OriginalSoundData originalSoundData = this.A01;
        int hashCode2 = (hashCode + (originalSoundData == null ? 0 : originalSoundData.hashCode())) * 31;
        List list = this.A02;
        return hashCode2 + (list != null ? list.hashCode() : 0);
    }

    @Override // X.C3XR
    public final MusicInfo BVc() {
        return this.A00;
    }

    @Override // X.C3XR
    public final /* bridge */ /* synthetic */ OriginalSoundDataIntf BZw() {
        return this.A01;
    }

    @Override // X.C3XR
    public final List BdH() {
        return this.A02;
    }

    @Override // X.C3XR
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTMusicMetadataDict", AbstractC37366Gd8.A00(this));
    }

    public C3XQ(MusicInfo musicInfo, OriginalSoundData originalSoundData, List list) {
        this.A00 = musicInfo;
        this.A01 = originalSoundData;
        this.A02 = list;
    }
}
