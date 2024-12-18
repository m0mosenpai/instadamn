package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.StickerTraySurface;
import com.instagram.api.schemas.SubscriptionStickerDictIntf;
import com.instagram.api.schemas.UpcomingEventStickerSource;
import com.instagram.common.api.base.CacheBehaviorLogger;
import com.instagram.model.upcomingeventsmetadata.UpcomingEventMedia;
import com.instagram.user.model.UpcomingEvent;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.Huz, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract /* synthetic */ class AbstractC40355Huz {
    public static Map A00(InterfaceC43582JMq interfaceC43582JMq) {
        TreeUpdaterJNI treeUpdaterJNI;
        String str;
        TreeUpdaterJNI treeUpdaterJNI2;
        String str2;
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        if (interfaceC43582JMq.AdC() != null) {
            A1I.put("attribution", interfaceC43582JMq.AdC());
        }
        if (interfaceC43582JMq.AdO() != null) {
            A1I.put("attribution_url", interfaceC43582JMq.AdO());
        }
        if (interfaceC43582JMq.AqW() != null) {
            A1I.put("consumption_disabled_reason", interfaceC43582JMq.AqW());
        }
        if (interfaceC43582JMq.AvN() != null) {
            A1I.put("custom_text_color", interfaceC43582JMq.AvN());
        }
        if (interfaceC43582JMq.Ayd() != null) {
            A1I.put("display_type", interfaceC43582JMq.Ayd());
        }
        if (interfaceC43582JMq.B29() != null) {
            AbstractC37303Gc4.A1N(interfaceC43582JMq.B29(), A1I);
        }
        if (interfaceC43582JMq.BDR() != null) {
            AbstractC37303Gc4.A1L(interfaceC43582JMq.BDR(), A1I);
        }
        if (interfaceC43582JMq.getId() != null) {
            AbstractC37300Gc1.A12(interfaceC43582JMq.getId(), A1I);
        }
        if (interfaceC43582JMq.CRh() != null) {
            A1I.put("is_consumption_disabled", interfaceC43582JMq.CRh());
        }
        if (interfaceC43582JMq.CUY() != null) {
            A1I.put("is_fb_sticker", interfaceC43582JMq.CUY());
        }
        if (interfaceC43582JMq.CVk() != null) {
            A1I.put("is_hidden", interfaceC43582JMq.CVk());
        }
        if (interfaceC43582JMq.CaJ() != null) {
            A1I.put("is_pinned", interfaceC43582JMq.CaJ());
        }
        if (interfaceC43582JMq.Cdh() != null) {
            A1I.put("is_sticker", interfaceC43582JMq.Cdh());
        }
        if (interfaceC43582JMq.getMediaId() != null) {
            AbstractC37300Gc1.A18(interfaceC43582JMq.getMediaId(), A1I);
        }
        if (interfaceC43582JMq.getMediaType() != null) {
            AbstractC37300Gc1.A19(interfaceC43582JMq.getMediaType(), A1I);
        }
        if (interfaceC43582JMq.Bpa() != null) {
            AbstractC37303Gc4.A1M(interfaceC43582JMq.Bpa(), A1I);
        }
        TreeUpdaterJNI treeUpdaterJNI3 = null;
        if (interfaceC43582JMq.Byd() != null) {
            UpcomingEventStickerSource Byd = interfaceC43582JMq.Byd();
            if (Byd != null) {
                str2 = Byd.A00;
            } else {
                str2 = null;
            }
            A1I.put(CacheBehaviorLogger.SOURCE, str2);
        }
        if (interfaceC43582JMq.Bzq() != null) {
            AbstractC37303Gc4.A1O(interfaceC43582JMq.Bzq(), A1I);
        }
        if (interfaceC43582JMq.C0i() != null) {
            A1I.put("sticker_style_enum", interfaceC43582JMq.C0i());
        }
        if (interfaceC43582JMq.C3Y() != null) {
            SubscriptionStickerDictIntf C3Y = interfaceC43582JMq.C3Y();
            if (C3Y != null) {
                treeUpdaterJNI2 = C3Y.F7o();
            } else {
                treeUpdaterJNI2 = null;
            }
            A1I.put("subscription_sticker", treeUpdaterJNI2);
        }
        if (interfaceC43582JMq.C4I() != null) {
            StickerTraySurface C4I = interfaceC43582JMq.C4I();
            if (C4I != null) {
                str = C4I.A00;
            } else {
                str = null;
            }
            A1I.put("surface", str);
        }
        if (interfaceC43582JMq.C8B() != null) {
            A1I.put("thumbnail_url", interfaceC43582JMq.C8B());
        }
        if (interfaceC43582JMq.CD4() != null) {
            UpcomingEvent CD4 = interfaceC43582JMq.CD4();
            if (CD4 != null) {
                treeUpdaterJNI = CD4.F7o();
            } else {
                treeUpdaterJNI = null;
            }
            A1I.put("upcoming_event", treeUpdaterJNI);
        }
        if (interfaceC43582JMq.CD6() != null) {
            UpcomingEventMedia CD6 = interfaceC43582JMq.CD6();
            if (CD6 != null) {
                treeUpdaterJNI3 = CD6.F7o();
            }
            A1I.put("upcoming_event_media", treeUpdaterJNI3);
        }
        if (interfaceC43582JMq.CHf() != null) {
            AbstractC37303Gc4.A1K(interfaceC43582JMq.CHf(), A1I);
        }
        if (interfaceC43582JMq.CI1() != null) {
            AbstractC37302Gc3.A1V(interfaceC43582JMq.CI1(), A1I);
        }
        if (interfaceC43582JMq.CIa() != null) {
            AbstractC37303Gc4.A1I(interfaceC43582JMq.CIa(), A1I);
        }
        if (interfaceC43582JMq.CIh() != null) {
            AbstractC37303Gc4.A1J(interfaceC43582JMq.CIh(), A1I);
        }
        return AbstractC06930Yk.A0B(A1I);
    }
}
