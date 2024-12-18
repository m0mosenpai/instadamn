package X;

import com.instagram.api.schemas.StickerTraySurface;
import com.instagram.api.schemas.SubscriptionStickerDict;
import com.instagram.api.schemas.UpcomingEventStickerSource;
import com.instagram.common.api.base.CacheBehaviorLogger;
import com.instagram.model.upcomingeventsmetadata.UpcomingEventMedia;
import com.instagram.model.upcomingeventsmetadata.UpcomingEventMediaImpl;
import com.instagram.user.model.UpcomingEvent;
import com.instagram.user.model.UpcomingEventImpl;
import java.io.IOException;

/* loaded from: classes7.dex */
public abstract class IPI {
    public static H6I parseFromJson(C16L c16l) {
        String A1P;
        String A1P2;
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            String str = null;
            String str2 = null;
            String str3 = null;
            String str4 = null;
            String str5 = null;
            Float f = null;
            Float f2 = null;
            String str6 = null;
            Boolean bool = null;
            Integer num = null;
            Integer num2 = null;
            Integer num3 = null;
            Integer num4 = null;
            String str7 = null;
            String str8 = null;
            Float f3 = null;
            UpcomingEventStickerSource upcomingEventStickerSource = null;
            Float f4 = null;
            Integer num5 = null;
            SubscriptionStickerDict subscriptionStickerDict = null;
            StickerTraySurface stickerTraySurface = null;
            String str9 = null;
            UpcomingEventImpl upcomingEventImpl = null;
            UpcomingEventMediaImpl upcomingEventMediaImpl = null;
            Float f5 = null;
            Float f6 = null;
            Float f7 = null;
            Float f8 = null;
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                if (AbstractC37301Gc2.A1X(c16l, A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str = null;
                    } else {
                        str = c16l.A1P();
                    }
                } else if (AbstractC37300Gc1.A1Y(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str2 = null;
                    } else {
                        str2 = c16l.A1P();
                    }
                } else if ("consumption_disabled_reason".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str3 = null;
                    } else {
                        str3 = c16l.A1P();
                    }
                } else if (AbstractC37300Gc1.A1Z(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str4 = null;
                    } else {
                        str4 = c16l.A1P();
                    }
                } else if (AbstractC37300Gc1.A1T(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str5 = null;
                    } else {
                        str5 = c16l.A1P();
                    }
                } else if (AbstractC37300Gc1.A1R(A0q)) {
                    f = AbstractC167007dF.A0a(c16l);
                } else if (AbstractC37300Gc1.A1H(A0q)) {
                    f2 = AbstractC167007dF.A0a(c16l);
                } else if (AbstractC31171DnF.A1Y(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str6 = null;
                    } else {
                        str6 = c16l.A1P();
                    }
                } else if ("is_consumption_disabled".equals(A0q)) {
                    bool = AbstractC166997dE.A0d(c16l);
                } else if (AbstractC37300Gc1.A1U(A0q)) {
                    num = AbstractC166997dE.A0h(c16l);
                } else if (AbstractC37300Gc1.A1M(A0q)) {
                    num2 = AbstractC166997dE.A0h(c16l);
                } else if (AbstractC37300Gc1.A1N(A0q)) {
                    num3 = AbstractC166997dE.A0h(c16l);
                } else if (AbstractC37300Gc1.A1P(A0q)) {
                    num4 = AbstractC166997dE.A0h(c16l);
                } else if (AbstractC37300Gc1.A1J(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str7 = null;
                    } else {
                        str7 = c16l.A1P();
                    }
                } else if (AbstractC37300Gc1.A1O(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str8 = null;
                    } else {
                        str8 = c16l.A1P();
                    }
                } else if (AbstractC37300Gc1.A1K(A0q)) {
                    f3 = AbstractC167007dF.A0Z(c16l);
                } else if (CacheBehaviorLogger.SOURCE.equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        A1P2 = null;
                    } else {
                        A1P2 = c16l.A1P();
                    }
                    upcomingEventStickerSource = (UpcomingEventStickerSource) UpcomingEventStickerSource.A01.get(A1P2);
                    if (upcomingEventStickerSource == null) {
                        upcomingEventStickerSource = UpcomingEventStickerSource.A06;
                    }
                } else if (AbstractC37300Gc1.A1V(A0q)) {
                    f4 = AbstractC167007dF.A0Z(c16l);
                } else if (AbstractC37300Gc1.A1a(A0q)) {
                    num5 = AbstractC166997dE.A0h(c16l);
                } else if (AbstractC37300Gc1.A1b(A0q)) {
                    subscriptionStickerDict = ADI.parseFromJson(c16l);
                } else if (AbstractC37300Gc1.A1I(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        A1P = null;
                    } else {
                        A1P = c16l.A1P();
                    }
                    stickerTraySurface = AbstractC41282IOx.A01(A1P);
                } else if ("thumbnail_url".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str9 = null;
                    } else {
                        str9 = c16l.A1P();
                    }
                } else if ("upcoming_event".equals(A0q)) {
                    upcomingEventImpl = IT3.parseFromJson(c16l);
                } else if ("upcoming_event_media".equals(A0q)) {
                    upcomingEventMediaImpl = IRM.parseFromJson(c16l);
                } else if (AbstractC37300Gc1.A1G(A0q)) {
                    f5 = AbstractC167007dF.A0Z(c16l);
                } else if (AbstractC37300Gc1.A1A(A0q)) {
                    f6 = AbstractC167007dF.A0Z(c16l);
                } else if (AbstractC37300Gc1.A1B(A0q)) {
                    f7 = AbstractC167007dF.A0Z(c16l);
                } else {
                    f8 = AbstractC37303Gc4.A0L(c16l, f8, A0q);
                }
                c16l.A0z();
            }
            return new H6I(stickerTraySurface, subscriptionStickerDict, upcomingEventStickerSource, upcomingEventMediaImpl, upcomingEventImpl, bool, f, f2, f3, f4, f5, f6, f7, f8, num, num2, num3, num4, num5, str, str2, str3, str4, str5, str6, str7, str8, str9);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }

    public static void A00(AnonymousClass182 anonymousClass182, H6I h6i) {
        anonymousClass182.A0d();
        AbstractC37301Gc2.A1H(anonymousClass182, h6i.A0J);
        AbstractC37301Gc2.A1K(anonymousClass182, h6i.A0K);
        String str = h6i.A0L;
        if (str != null) {
            anonymousClass182.A0S("consumption_disabled_reason", str);
        }
        AbstractC37301Gc2.A1L(anonymousClass182, h6i.A0M);
        AbstractC37301Gc2.A1J(anonymousClass182, h6i.A0N);
        AbstractC37302Gc3.A1G(anonymousClass182, h6i.A06);
        AbstractC37302Gc3.A1E(anonymousClass182, h6i.A07);
        AbstractC37301Gc2.A1D(anonymousClass182, h6i.A0O);
        Boolean bool = h6i.A05;
        if (bool != null) {
            anonymousClass182.A0T("is_consumption_disabled", bool.booleanValue());
        }
        AbstractC37302Gc3.A18(anonymousClass182, h6i.A0E);
        AbstractC37302Gc3.A15(anonymousClass182, h6i.A0F);
        AbstractC37302Gc3.A16(anonymousClass182, h6i.A0G);
        AbstractC37302Gc3.A17(anonymousClass182, h6i.A0H);
        String str2 = h6i.A0P;
        if (str2 != null) {
            anonymousClass182.A0S("media_id", str2);
        }
        AbstractC37301Gc2.A1G(anonymousClass182, h6i.A0Q);
        AbstractC37302Gc3.A1F(anonymousClass182, h6i.A08);
        UpcomingEventStickerSource upcomingEventStickerSource = h6i.A02;
        if (upcomingEventStickerSource != null) {
            anonymousClass182.A0S(CacheBehaviorLogger.SOURCE, upcomingEventStickerSource.A00);
        }
        AbstractC37302Gc3.A1H(anonymousClass182, h6i.A09);
        AbstractC37302Gc3.A19(anonymousClass182, h6i.A0I);
        AbstractC37302Gc3.A14(anonymousClass182, h6i.A01);
        AbstractC37302Gc3.A13(anonymousClass182, h6i.A00);
        String str3 = h6i.A0R;
        if (str3 != null) {
            anonymousClass182.A0S("thumbnail_url", str3);
        }
        UpcomingEvent upcomingEvent = h6i.A04;
        if (upcomingEvent != null) {
            anonymousClass182.A0r("upcoming_event");
            IT3.A00(anonymousClass182, upcomingEvent.F7b(AbstractC37301Gc2.A08()));
        }
        UpcomingEventMedia upcomingEventMedia = h6i.A03;
        if (upcomingEventMedia != null) {
            anonymousClass182.A0r("upcoming_event_media");
            IRM.A00(anonymousClass182, upcomingEventMedia.F6f());
        }
        AbstractC37302Gc3.A1D(anonymousClass182, h6i.A0A);
        AbstractC37302Gc3.A1A(anonymousClass182, h6i.A0B);
        AbstractC37302Gc3.A1B(anonymousClass182, h6i.A0C);
        AbstractC37302Gc3.A1C(anonymousClass182, h6i.A0D);
        anonymousClass182.A0a();
    }
}
