package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.ImmutablePandoOriginalSoundData;
import com.instagram.api.schemas.OriginalSoundData;
import com.instagram.api.schemas.OriginalSoundDataIntf;
import com.instagram.api.schemas.StickerTraySurface;
import com.instagram.api.schemas.SubscriptionStickerDictIntf;
import com.instagram.music.common.model.ImmutablePandoMusicOverlayStickerModel;
import com.instagram.music.common.model.MusicOverlayStickerModel;
import com.instagram.music.common.model.MusicOverlayStickerModelIntf;

/* renamed from: X.HTn, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39271HTn extends C17T implements C4A3 {
    public SubscriptionStickerDictIntf A00;
    public OriginalSoundDataIntf A01;
    public MusicOverlayStickerModelIntf A02;

    @Override // X.C4A3
    public final MusicOverlayStickerModelIntf BVW() {
        MusicOverlayStickerModelIntf musicOverlayStickerModelIntf = this.A02;
        if (musicOverlayStickerModelIntf == null) {
            return (MusicOverlayStickerModelIntf) A05(541071095, ImmutablePandoMusicOverlayStickerModel.class);
        }
        return musicOverlayStickerModelIntf;
    }

    @Override // X.C4A3
    public final OriginalSoundDataIntf BZw() {
        OriginalSoundDataIntf originalSoundDataIntf = this.A01;
        if (originalSoundDataIntf == null) {
            return (OriginalSoundDataIntf) A05(1082512652, ImmutablePandoOriginalSoundData.class);
        }
        return originalSoundDataIntf;
    }

    @Override // X.C4A3
    public final SubscriptionStickerDictIntf C3Y() {
        return AbstractC37302Gc3.A0F(this.A00, this);
    }

    @Override // X.C4A3
    public final StickerTraySurface C4I() {
        return AbstractC37303Gc4.A09(this, JBR.A00);
    }

    @Override // X.C4A3
    public final C4A2 F13(C1DY c1dy) {
        MusicOverlayStickerModel musicOverlayStickerModel;
        String A0d = A0d();
        String A0c = A0c();
        String A0b = A0b();
        String A0Z = A0Z();
        Float A0E = A0E();
        Float A0C = A0C();
        String A0e = A0e();
        Integer A0V = AbstractC37301Gc2.A0V(this);
        Integer A0W = AbstractC37301Gc2.A0W(this);
        Integer A0X = AbstractC37301Gc2.A0X(this);
        Integer A0Y = AbstractC37301Gc2.A0Y(this);
        String A0a = A0a();
        MusicOverlayStickerModelIntf BVW = BVW();
        OriginalSoundData originalSoundData = null;
        if (BVW != null) {
            musicOverlayStickerModel = BVW.F6j(c1dy);
        } else {
            musicOverlayStickerModel = null;
        }
        OriginalSoundDataIntf BZw = BZw();
        if (BZw != null) {
            originalSoundData = BZw.Exi(c1dy);
        }
        return new C4A2(originalSoundData, AbstractC37303Gc4.A09(this, JBR.A00), AbstractC37301Gc2.A09(c1dy, AbstractC37302Gc3.A0F(this.A00, this)), musicOverlayStickerModel, A0E, A0C, A0F(), A0D(), A0G(), A0J(), A0H(), A0I(), A0V, A0W, A0X, A0Y, AbstractC37301Gc2.A0a(this), A0d, A0c, A0b, A0Z, A0e, A0a);
    }

    @Override // X.C4A3
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC25234BEr.A0P(this, AbstractC37361Gd3.A00(this));
    }

    @Override // X.C4A3
    public final String AdC() {
        return A0d();
    }

    @Override // X.C4A3
    public final String AdO() {
        return A0c();
    }

    @Override // X.C4A3
    public final String AvN() {
        return A0b();
    }

    @Override // X.C4A3
    public final String Ayd() {
        return A0Z();
    }

    @Override // X.C4A3
    public final Float B29() {
        return A0E();
    }

    @Override // X.C4A3
    public final Float BDR() {
        return A0C();
    }

    @Override // X.C4A3
    public final Float Bpa() {
        return A0F();
    }

    @Override // X.C4A3
    public final Float Bzq() {
        return A0D();
    }

    @Override // X.C4A3
    public final Integer C0i() {
        return AbstractC37301Gc2.A0a(this);
    }

    @Override // X.C4A3
    public final Float CHf() {
        return A0G();
    }

    @Override // X.C4A3
    public final Float CI1() {
        return A0J();
    }

    @Override // X.C4A3
    public final Float CIa() {
        return A0H();
    }

    @Override // X.C4A3
    public final Float CIh() {
        return A0I();
    }

    @Override // X.C4A3
    public final Integer CUY() {
        return AbstractC37301Gc2.A0V(this);
    }

    @Override // X.C4A3
    public final Integer CVk() {
        return AbstractC37301Gc2.A0W(this);
    }

    @Override // X.C4A3
    public final Integer CaJ() {
        return AbstractC37301Gc2.A0X(this);
    }

    @Override // X.C4A3
    public final Integer Cdh() {
        return AbstractC37301Gc2.A0Y(this);
    }

    @Override // X.C4A3
    public final C4A3 EAR(C1DY c1dy) {
        MusicOverlayStickerModelIntf BVW = BVW();
        SubscriptionStickerDictIntf subscriptionStickerDictIntf = null;
        if (BVW != null) {
            BVW.EBy(c1dy);
        } else {
            BVW = null;
        }
        this.A02 = BVW;
        OriginalSoundDataIntf BZw = BZw();
        if (BZw != null) {
            BZw.E9V(c1dy);
        } else {
            BZw = null;
        }
        this.A01 = BZw;
        SubscriptionStickerDictIntf A0F = AbstractC37302Gc3.A0F(this.A00, this);
        if (A0F != null) {
            A0F.EAt(c1dy);
            subscriptionStickerDictIntf = A0F;
        }
        this.A00 = subscriptionStickerDictIntf;
        return this;
    }

    @Override // X.C4A3
    public final C4A2 F14(C1DV c1dv) {
        return F13(AbstractC25235BEs.A0b(c1dv));
    }

    @Override // X.C4A3
    public final String getId() {
        return A0e();
    }

    @Override // X.C4A3
    public final String getMediaType() {
        return A0a();
    }
}
