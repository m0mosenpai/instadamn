package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.StickerTraySurface;
import com.instagram.api.schemas.SubscriptionStickerDictIntf;

/* loaded from: classes7.dex */
public final class HUB extends C17T implements InterfaceC73635YQx {
    public SubscriptionStickerDictIntf A00;
    public InterfaceC43575JMj A01;

    @Override // X.InterfaceC73635YQx
    public final InterfaceC43575JMj Bt5() {
        InterfaceC43575JMj interfaceC43575JMj = this.A01;
        if (interfaceC43575JMj == null) {
            return (InterfaceC43575JMj) A05(18141532, HX4.class);
        }
        return interfaceC43575JMj;
    }

    @Override // X.InterfaceC73635YQx
    public final SubscriptionStickerDictIntf C3Y() {
        return AbstractC37302Gc3.A0F(this.A00, this);
    }

    @Override // X.InterfaceC73635YQx
    public final StickerTraySurface C4I() {
        return AbstractC37303Gc4.A09(this, C43289JBi.A00);
    }

    @Override // X.InterfaceC73635YQx
    public final H62 F1j(C1DY c1dy) {
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
        InterfaceC43575JMj Bt5 = Bt5();
        C38820H7m c38820H7m = null;
        if (Bt5 != null) {
            c38820H7m = Bt5.F6J(c1dy);
        }
        Float A0D = A0D();
        Integer A0a2 = AbstractC37301Gc2.A0a(this);
        return new H62(AbstractC37303Gc4.A09(this, C43289JBi.A00), AbstractC37301Gc2.A09(c1dy, AbstractC37302Gc3.A0F(this.A00, this)), c38820H7m, A0E, A0C, A0F, A0D, A0G(), A0J(), A0H(), A0I(), A0V, A0W, A0X, A0Y, A0a2, A0d, A0c, A0b, A0Z, A0e, A0a);
    }

    @Override // X.InterfaceC73635YQx
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC25234BEr.A0P(this, AbstractC72617Xhx.A00(this));
    }

    @Override // X.InterfaceC73635YQx
    public final String AdC() {
        return A0d();
    }

    @Override // X.InterfaceC73635YQx
    public final String AdO() {
        return A0c();
    }

    @Override // X.InterfaceC73635YQx
    public final String AvN() {
        return A0b();
    }

    @Override // X.InterfaceC73635YQx
    public final String Ayd() {
        return A0Z();
    }

    @Override // X.InterfaceC73635YQx
    public final Float B29() {
        return A0E();
    }

    @Override // X.InterfaceC73635YQx
    public final Float BDR() {
        return A0C();
    }

    @Override // X.InterfaceC73635YQx
    public final Float Bpa() {
        return A0F();
    }

    @Override // X.InterfaceC73635YQx
    public final Float Bzq() {
        return A0D();
    }

    @Override // X.InterfaceC73635YQx
    public final Integer C0i() {
        return AbstractC37301Gc2.A0a(this);
    }

    @Override // X.InterfaceC73635YQx
    public final Float CHf() {
        return A0G();
    }

    @Override // X.InterfaceC73635YQx
    public final Float CI1() {
        return A0J();
    }

    @Override // X.InterfaceC73635YQx
    public final Float CIa() {
        return A0H();
    }

    @Override // X.InterfaceC73635YQx
    public final Float CIh() {
        return A0I();
    }

    @Override // X.InterfaceC73635YQx
    public final Integer CUY() {
        return AbstractC37301Gc2.A0V(this);
    }

    @Override // X.InterfaceC73635YQx
    public final Integer CVk() {
        return AbstractC37301Gc2.A0W(this);
    }

    @Override // X.InterfaceC73635YQx
    public final Integer CaJ() {
        return AbstractC37301Gc2.A0X(this);
    }

    @Override // X.InterfaceC73635YQx
    public final Integer Cdh() {
        return AbstractC37301Gc2.A0Y(this);
    }

    @Override // X.InterfaceC73635YQx
    public final InterfaceC73635YQx EAi(C1DY c1dy) {
        InterfaceC43575JMj Bt5 = Bt5();
        SubscriptionStickerDictIntf subscriptionStickerDictIntf = null;
        if (Bt5 != null) {
            Bt5.EBr(c1dy);
        } else {
            Bt5 = null;
        }
        this.A01 = Bt5;
        SubscriptionStickerDictIntf A0F = AbstractC37302Gc3.A0F(this.A00, this);
        if (A0F != null) {
            A0F.EAt(c1dy);
            subscriptionStickerDictIntf = A0F;
        }
        this.A00 = subscriptionStickerDictIntf;
        return this;
    }

    @Override // X.InterfaceC73635YQx
    public final H62 F1k(C1DV c1dv) {
        return F1j(AbstractC25235BEs.A0b(c1dv));
    }

    @Override // X.InterfaceC73635YQx
    public final String getId() {
        return A0e();
    }

    @Override // X.InterfaceC73635YQx
    public final String getMediaType() {
        return A0a();
    }
}
