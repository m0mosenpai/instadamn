package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.StickerTraySurface;
import com.instagram.api.schemas.SubscriptionStickerDict;
import com.instagram.api.schemas.SubscriptionStickerDictIntf;
import com.instagram.api.schemas.UpcomingEventStickerSource;
import com.instagram.model.upcomingeventsmetadata.ImmutablePandoUpcomingEventMedia;
import com.instagram.model.upcomingeventsmetadata.UpcomingEventMedia;
import com.instagram.model.upcomingeventsmetadata.UpcomingEventMediaImpl;
import com.instagram.user.model.ImmutablePandoUpcomingEvent;
import com.instagram.user.model.UpcomingEvent;
import com.instagram.user.model.UpcomingEventImpl;

/* renamed from: X.HUg, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39283HUg extends C17T implements InterfaceC43582JMq {
    public SubscriptionStickerDictIntf A00;
    public UpcomingEvent A01;

    @Override // X.InterfaceC43582JMq
    public final UpcomingEventStickerSource Byd() {
        return (UpcomingEventStickerSource) A0N(-896505829, C43301JBu.A00);
    }

    @Override // X.InterfaceC43582JMq
    public final SubscriptionStickerDictIntf C3Y() {
        return AbstractC37302Gc3.A0F(this.A00, this);
    }

    @Override // X.InterfaceC43582JMq
    public final StickerTraySurface C4I() {
        return AbstractC37303Gc4.A09(this, C43302JBv.A00);
    }

    @Override // X.InterfaceC43582JMq
    public final UpcomingEvent CD4() {
        UpcomingEvent upcomingEvent = this.A01;
        if (upcomingEvent == null) {
            return (UpcomingEvent) A05(-2094458441, ImmutablePandoUpcomingEvent.class);
        }
        return upcomingEvent;
    }

    @Override // X.InterfaceC43582JMq
    public final UpcomingEventMedia CD6() {
        return (UpcomingEventMedia) A05(-1257076900, ImmutablePandoUpcomingEventMedia.class);
    }

    @Override // X.InterfaceC43582JMq
    public final InterfaceC43582JMq EAr(C1DY c1dy) {
        SubscriptionStickerDictIntf A0F = AbstractC37302Gc3.A0F(this.A00, this);
        UpcomingEvent upcomingEvent = null;
        if (A0F != null) {
            A0F.EAt(c1dy);
        } else {
            A0F = null;
        }
        this.A00 = A0F;
        UpcomingEvent CD4 = CD4();
        if (CD4 != null) {
            CD4.ECI(c1dy);
            upcomingEvent = CD4;
        }
        this.A01 = upcomingEvent;
        return this;
    }

    @Override // X.InterfaceC43582JMq
    public final H6I F2O(C1DY c1dy) {
        SubscriptionStickerDict subscriptionStickerDict;
        UpcomingEventImpl upcomingEventImpl;
        String A0d = A0d();
        String A0c = A0c();
        String A0i = A0i(-315456317);
        String A0b = A0b();
        String A0Z = A0Z();
        Float A0E = A0E();
        Float A0C = A0C();
        String A0e = A0e();
        Boolean optionalBooleanValueByHashCode = getOptionalBooleanValueByHashCode(-12574059);
        Integer A0V = AbstractC37301Gc2.A0V(this);
        Integer A0W = AbstractC37301Gc2.A0W(this);
        Integer A0X = AbstractC37301Gc2.A0X(this);
        Integer A0Y = AbstractC37301Gc2.A0Y(this);
        String A0f = A0f();
        String A0a = A0a();
        Float A0F = A0F();
        UpcomingEventStickerSource Byd = Byd();
        Float A0D = A0D();
        Integer A0a2 = AbstractC37301Gc2.A0a(this);
        SubscriptionStickerDictIntf A0F2 = AbstractC37302Gc3.A0F(this.A00, this);
        UpcomingEventMediaImpl upcomingEventMediaImpl = null;
        if (A0F2 != null) {
            subscriptionStickerDict = A0F2.F2W(c1dy);
        } else {
            subscriptionStickerDict = null;
        }
        StickerTraySurface A09 = AbstractC37303Gc4.A09(this, C43302JBv.A00);
        String A0i2 = A0i(1825632156);
        UpcomingEvent CD4 = CD4();
        if (CD4 != null) {
            upcomingEventImpl = CD4.F7a(c1dy);
        } else {
            upcomingEventImpl = null;
        }
        UpcomingEventMedia CD6 = CD6();
        if (CD6 != null) {
            upcomingEventMediaImpl = CD6.F6f();
        }
        return new H6I(A09, subscriptionStickerDict, Byd, upcomingEventMediaImpl, upcomingEventImpl, optionalBooleanValueByHashCode, A0E, A0C, A0F, A0D, A0G(), A0J(), A0H(), A0I(), A0V, A0W, A0X, A0Y, A0a2, A0d, A0c, A0i, A0b, A0Z, A0e, A0f, A0a, A0i2);
    }

    @Override // X.InterfaceC43582JMq
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC25234BEr.A0P(this, AbstractC40355Huz.A00(this));
    }

    @Override // X.InterfaceC43582JMq
    public final String AdC() {
        return A0d();
    }

    @Override // X.InterfaceC43582JMq
    public final String AdO() {
        return A0c();
    }

    @Override // X.InterfaceC43582JMq
    public final String AqW() {
        return A0i(-315456317);
    }

    @Override // X.InterfaceC43582JMq
    public final String AvN() {
        return A0b();
    }

    @Override // X.InterfaceC43582JMq
    public final String Ayd() {
        return A0Z();
    }

    @Override // X.InterfaceC43582JMq
    public final Float B29() {
        return A0E();
    }

    @Override // X.InterfaceC43582JMq
    public final Float BDR() {
        return A0C();
    }

    @Override // X.InterfaceC43582JMq
    public final Float Bpa() {
        return A0F();
    }

    @Override // X.InterfaceC43582JMq
    public final Float Bzq() {
        return A0D();
    }

    @Override // X.InterfaceC43582JMq
    public final Integer C0i() {
        return AbstractC37301Gc2.A0a(this);
    }

    @Override // X.InterfaceC43582JMq
    public final String C8B() {
        return A0i(1825632156);
    }

    @Override // X.InterfaceC43582JMq
    public final Float CHf() {
        return A0G();
    }

    @Override // X.InterfaceC43582JMq
    public final Float CI1() {
        return A0J();
    }

    @Override // X.InterfaceC43582JMq
    public final Float CIa() {
        return A0H();
    }

    @Override // X.InterfaceC43582JMq
    public final Float CIh() {
        return A0I();
    }

    @Override // X.InterfaceC43582JMq
    public final Boolean CRh() {
        return getOptionalBooleanValueByHashCode(-12574059);
    }

    @Override // X.InterfaceC43582JMq
    public final Integer CUY() {
        return AbstractC37301Gc2.A0V(this);
    }

    @Override // X.InterfaceC43582JMq
    public final Integer CVk() {
        return AbstractC37301Gc2.A0W(this);
    }

    @Override // X.InterfaceC43582JMq
    public final Integer CaJ() {
        return AbstractC37301Gc2.A0X(this);
    }

    @Override // X.InterfaceC43582JMq
    public final Integer Cdh() {
        return AbstractC37301Gc2.A0Y(this);
    }

    @Override // X.InterfaceC43582JMq
    public final H6I F2P(C1DV c1dv) {
        return F2O(AbstractC25235BEs.A0b(c1dv));
    }

    @Override // X.InterfaceC43582JMq
    public final String getId() {
        return A0e();
    }

    @Override // X.InterfaceC43582JMq
    public final String getMediaId() {
        return A0f();
    }

    @Override // X.InterfaceC43582JMq
    public final String getMediaType() {
        return A0a();
    }
}
