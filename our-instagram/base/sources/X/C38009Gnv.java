package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.ImmutablePandoMusicInfo;
import com.instagram.api.schemas.ImmutablePandoOriginalSoundData;
import com.instagram.api.schemas.MusicInfo;
import com.instagram.api.schemas.MusicInfoImpl;
import com.instagram.api.schemas.OriginalSoundData;
import com.instagram.api.schemas.OriginalSoundDataIntf;
import java.util.List;

/* renamed from: X.Gnv, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38009Gnv extends C17T implements C3XR {
    public MusicInfo A00;
    public OriginalSoundDataIntf A01;

    @Override // X.C3XR
    public final MusicInfo BVc() {
        MusicInfo musicInfo = this.A00;
        if (musicInfo == null) {
            return (MusicInfo) A05(-780321144, ImmutablePandoMusicInfo.class);
        }
        return musicInfo;
    }

    @Override // X.C3XR
    public final OriginalSoundDataIntf BZw() {
        OriginalSoundDataIntf originalSoundDataIntf = this.A01;
        if (originalSoundDataIntf == null) {
            return (OriginalSoundDataIntf) A05(1082512652, ImmutablePandoOriginalSoundData.class);
        }
        return originalSoundDataIntf;
    }

    @Override // X.C3XR
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC25234BEr.A0P(this, AbstractC37366Gd8.A00(this));
    }

    @Override // X.C3XR
    public final List BdH() {
        return A0n(1840235574);
    }

    @Override // X.C3XR
    public final C3XR E9P(C1DY c1dy) {
        MusicInfo BVc = BVc();
        OriginalSoundDataIntf originalSoundDataIntf = null;
        if (BVc != null) {
            BVc.E9O(c1dy);
        } else {
            BVc = null;
        }
        this.A00 = BVc;
        OriginalSoundDataIntf BZw = BZw();
        if (BZw != null) {
            BZw.E9V(c1dy);
            originalSoundDataIntf = BZw;
        }
        this.A01 = originalSoundDataIntf;
        return this;
    }

    @Override // X.C3XR
    public final C3XQ Ex0(C1DY c1dy) {
        MusicInfoImpl musicInfoImpl;
        MusicInfo BVc = BVc();
        OriginalSoundData originalSoundData = null;
        if (BVc != null) {
            musicInfoImpl = BVc.Ewy(c1dy);
        } else {
            musicInfoImpl = null;
        }
        OriginalSoundDataIntf BZw = BZw();
        if (BZw != null) {
            originalSoundData = BZw.Exi(c1dy);
        }
        return new C3XQ(musicInfoImpl, originalSoundData, A0n(1840235574));
    }

    @Override // X.C3XR
    public final C3XQ Ex1(C1DV c1dv) {
        return Ex0(AbstractC25235BEs.A0b(c1dv));
    }
}
