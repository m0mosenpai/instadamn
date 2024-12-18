package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.ImmutablePandoStoryPromptTappableData;
import com.instagram.api.schemas.StickerTraySurface;
import com.instagram.api.schemas.StoryPromptTappableData;
import com.instagram.api.schemas.StoryPromptTappableDataIntf;
import com.instagram.api.schemas.SubscriptionStickerDictIntf;

/* loaded from: classes7.dex */
public final class HTz extends C17T implements InterfaceC109364wL {
    public SubscriptionStickerDictIntf A00;
    public StoryPromptTappableDataIntf A01;

    @Override // X.InterfaceC109364wL
    public final /* synthetic */ C69488VoB AKa() {
        return new C69488VoB(this);
    }

    @Override // X.InterfaceC109364wL
    public final StoryPromptTappableDataIntf Bii() {
        StoryPromptTappableDataIntf storyPromptTappableDataIntf = this.A01;
        if (storyPromptTappableDataIntf == null) {
            return (StoryPromptTappableDataIntf) A05(-305109662, ImmutablePandoStoryPromptTappableData.class);
        }
        return storyPromptTappableDataIntf;
    }

    @Override // X.InterfaceC109364wL
    public final SubscriptionStickerDictIntf C3Y() {
        return AbstractC37302Gc3.A0F(this.A00, this);
    }

    @Override // X.InterfaceC109364wL
    public final StickerTraySurface C4I() {
        return AbstractC37303Gc4.A09(this, C43283JBc.A00);
    }

    @Override // X.InterfaceC109364wL
    public final C109354wK F1N(C1DY c1dy) {
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
        StoryPromptTappableDataIntf Bii = Bii();
        StoryPromptTappableData storyPromptTappableData = null;
        if (Bii != null) {
            storyPromptTappableData = Bii.F1L(c1dy);
        }
        Float A0F = A0F();
        Float A0D = A0D();
        Integer A0a2 = AbstractC37301Gc2.A0a(this);
        return new C109354wK(AbstractC37303Gc4.A09(this, C43283JBc.A00), storyPromptTappableData, AbstractC37301Gc2.A09(c1dy, AbstractC37302Gc3.A0F(this.A00, this)), A0E, A0C, A0F, A0D, A0G(), A0J(), A0H(), A0I(), A0V, A0W, A0X, A0Y, A0a2, A0d, A0c, A0b, A0Z, A0e, A0a);
    }

    @Override // X.InterfaceC109364wL
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC25234BEr.A0P(this, VP6.A00(this));
    }

    @Override // X.InterfaceC109364wL
    public final String AdC() {
        return A0d();
    }

    @Override // X.InterfaceC109364wL
    public final String AdO() {
        return A0c();
    }

    @Override // X.InterfaceC109364wL
    public final String AvN() {
        return A0b();
    }

    @Override // X.InterfaceC109364wL
    public final String Ayd() {
        return A0Z();
    }

    @Override // X.InterfaceC109364wL
    public final Float B29() {
        return A0E();
    }

    @Override // X.InterfaceC109364wL
    public final Float BDR() {
        return A0C();
    }

    @Override // X.InterfaceC109364wL
    public final Float Bpa() {
        return A0F();
    }

    @Override // X.InterfaceC109364wL
    public final Float Bzq() {
        return A0D();
    }

    @Override // X.InterfaceC109364wL
    public final Integer C0i() {
        return AbstractC37301Gc2.A0a(this);
    }

    @Override // X.InterfaceC109364wL
    public final Float CHf() {
        return A0G();
    }

    @Override // X.InterfaceC109364wL
    public final Float CI1() {
        return A0J();
    }

    @Override // X.InterfaceC109364wL
    public final Float CIa() {
        return A0H();
    }

    @Override // X.InterfaceC109364wL
    public final Float CIh() {
        return A0I();
    }

    @Override // X.InterfaceC109364wL
    public final Integer CUY() {
        return AbstractC37301Gc2.A0V(this);
    }

    @Override // X.InterfaceC109364wL
    public final Integer CVk() {
        return AbstractC37301Gc2.A0W(this);
    }

    @Override // X.InterfaceC109364wL
    public final Integer CaJ() {
        return AbstractC37301Gc2.A0X(this);
    }

    @Override // X.InterfaceC109364wL
    public final Integer Cdh() {
        return AbstractC37301Gc2.A0Y(this);
    }

    @Override // X.InterfaceC109364wL
    public final InterfaceC109364wL EAZ(C1DY c1dy) {
        StoryPromptTappableDataIntf Bii = Bii();
        SubscriptionStickerDictIntf subscriptionStickerDictIntf = null;
        if (Bii != null) {
            Bii.EAY(c1dy);
        } else {
            Bii = null;
        }
        this.A01 = Bii;
        SubscriptionStickerDictIntf A0F = AbstractC37302Gc3.A0F(this.A00, this);
        if (A0F != null) {
            A0F.EAt(c1dy);
            subscriptionStickerDictIntf = A0F;
        }
        this.A00 = subscriptionStickerDictIntf;
        return this;
    }

    @Override // X.InterfaceC109364wL
    public final C109354wK F1O(C1DV c1dv) {
        return F1N(AbstractC37304Gc5.A09(c1dv));
    }

    @Override // X.InterfaceC109364wL
    public final String getId() {
        return A0e();
    }

    @Override // X.InterfaceC109364wL
    public final String getMediaType() {
        return A0a();
    }
}
