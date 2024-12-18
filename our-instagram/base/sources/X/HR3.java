package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.StickerTraySurface;
import com.instagram.api.schemas.SubscriptionStickerDict;
import com.instagram.api.schemas.SubscriptionStickerDictIntf;
import com.instagram.user.model.ImmutablePandoUserDict;
import com.instagram.user.model.User;

/* loaded from: classes7.dex */
public final class HR3 extends C17T implements AnonymousClass447 {
    public SubscriptionStickerDictIntf A00;
    public User A01;

    @Override // X.AnonymousClass447
    public final SubscriptionStickerDictIntf C3Y() {
        return AbstractC37302Gc3.A0F(this.A00, this);
    }

    @Override // X.AnonymousClass447
    public final StickerTraySurface C4I() {
        return AbstractC37303Gc4.A09(this, JAE.A00);
    }

    @Override // X.AnonymousClass447
    public final User CDj() {
        return this.A01;
    }

    @Override // X.AnonymousClass447
    public final AnonymousClass447 E9H(C1DY c1dy) {
        SubscriptionStickerDictIntf A0F = AbstractC37302Gc3.A0F(this.A00, this);
        if (A0F != null) {
            A0F.EAt(c1dy);
        } else {
            A0F = null;
        }
        this.A00 = A0F;
        this.A01 = AbstractC31179DnN.A0T(c1dy, this);
        return this;
    }

    @Override // X.AnonymousClass447
    public final AnonymousClass446 Ewb(C1DY c1dy) {
        SubscriptionStickerDict subscriptionStickerDict;
        User A0N;
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
        Float A0F = A0F();
        Float A0D = A0D();
        Integer A0a2 = AbstractC37301Gc2.A0a(this);
        SubscriptionStickerDictIntf A0F2 = AbstractC37302Gc3.A0F(this.A00, this);
        User user = null;
        if (A0F2 != null) {
            subscriptionStickerDict = A0F2.F2W(c1dy);
        } else {
            subscriptionStickerDict = null;
        }
        StickerTraySurface A09 = AbstractC37303Gc4.A09(this, JAE.A00);
        ImmutablePandoUserDict A0R = AbstractC37301Gc2.A0R(this);
        if (A0R != null && (A0N = AbstractC37300Gc1.A0N(c1dy, A0R)) != null) {
            user = AbstractC37300Gc1.A0M(c1dy, A0N);
        }
        return new AnonymousClass446(A09, subscriptionStickerDict, user, A0E, A0C, A0F, A0D, A0G(), A0J(), A0H(), A0I(), A0V, A0W, A0X, A0Y, A0a2, A0d, A0c, A0b, A0Z, A0e, A0a, AbstractC37303Gc4.A0V(this));
    }

    @Override // X.AnonymousClass447
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC25234BEr.A0P(this, AbstractC37373GdF.A00(this));
    }

    @Override // X.AnonymousClass447
    public final String AdC() {
        return A0d();
    }

    @Override // X.AnonymousClass447
    public final String AdO() {
        return A0c();
    }

    @Override // X.AnonymousClass447
    public final String AvN() {
        return A0b();
    }

    @Override // X.AnonymousClass447
    public final String Ayd() {
        return A0Z();
    }

    @Override // X.AnonymousClass447
    public final Float B29() {
        return A0E();
    }

    @Override // X.AnonymousClass447
    public final Float BDR() {
        return A0C();
    }

    @Override // X.AnonymousClass447
    public final Float Bpa() {
        return A0F();
    }

    @Override // X.AnonymousClass447
    public final Float Bzq() {
        return A0D();
    }

    @Override // X.AnonymousClass447
    public final Integer C0i() {
        return AbstractC37301Gc2.A0a(this);
    }

    @Override // X.AnonymousClass447
    public final Float CHf() {
        return A0G();
    }

    @Override // X.AnonymousClass447
    public final Float CI1() {
        return A0J();
    }

    @Override // X.AnonymousClass447
    public final Float CIa() {
        return A0H();
    }

    @Override // X.AnonymousClass447
    public final Float CIh() {
        return A0I();
    }

    @Override // X.AnonymousClass447
    public final Integer CUY() {
        return AbstractC37301Gc2.A0V(this);
    }

    @Override // X.AnonymousClass447
    public final Integer CVk() {
        return AbstractC37301Gc2.A0W(this);
    }

    @Override // X.AnonymousClass447
    public final Integer CaJ() {
        return AbstractC37301Gc2.A0X(this);
    }

    @Override // X.AnonymousClass447
    public final Integer Cdh() {
        return AbstractC37301Gc2.A0Y(this);
    }

    @Override // X.AnonymousClass447
    public final AnonymousClass446 Ewc(C1DV c1dv) {
        return Ewb(AbstractC25235BEs.A0b(c1dv));
    }

    @Override // X.AnonymousClass447
    public final String getId() {
        return A0e();
    }

    @Override // X.AnonymousClass447
    public final String getMediaType() {
        return A0a();
    }

    @Override // X.AnonymousClass447
    public final String getUserId() {
        return AbstractC37303Gc4.A0V(this);
    }
}
