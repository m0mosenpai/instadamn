package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.WearablesAppAttributionType;
import com.instagram.api.schemas.WorldLocationPagesInfo;
import com.instagram.user.model.User;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.Hwh, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract /* synthetic */ class AbstractC40452Hwh {
    public static Map A00(InterfaceC43580JMo interfaceC43580JMo) {
        String str;
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        if (interfaceC43580JMo.getAttributionCtaActionUrl() != null) {
            A1I.put(AbstractC111324zv.A00(1947), interfaceC43580JMo.getAttributionCtaActionUrl());
        }
        if (interfaceC43580JMo.getAttributionCtaText() != null) {
            A1I.put(AbstractC111324zv.A00(1948), interfaceC43580JMo.getAttributionCtaText());
        }
        if (interfaceC43580JMo.getAttributionIconUrl() != null) {
            A1I.put("attribution_icon_url", interfaceC43580JMo.getAttributionIconUrl());
        }
        if (interfaceC43580JMo.getAttributionSubtitle() != null) {
            A1I.put(AbstractC111324zv.A00(1949), interfaceC43580JMo.getAttributionSubtitle());
        }
        if (interfaceC43580JMo.getAttributionTitle() != null) {
            A1I.put("attribution_title", interfaceC43580JMo.getAttributionTitle());
        }
        if (interfaceC43580JMo.getAttributionTopIconUrl() != null) {
            A1I.put(AbstractC111324zv.A00(1950), interfaceC43580JMo.getAttributionTopIconUrl());
        }
        TreeUpdaterJNI treeUpdaterJNI = null;
        if (interfaceC43580JMo.AdN() != null) {
            WearablesAppAttributionType AdN = interfaceC43580JMo.AdN();
            if (AdN != null) {
                str = AdN.A00;
            } else {
                str = null;
            }
            A1I.put("attribution_type", str);
        }
        if (interfaceC43580JMo.BF1() != null) {
            A1I.put(AbstractC111324zv.A00(2472), interfaceC43580JMo.BF1());
        }
        if (interfaceC43580JMo.getIconicHorizonWorldDeeplink() != null) {
            A1I.put(AbstractC111324zv.A00(2473), interfaceC43580JMo.getIconicHorizonWorldDeeplink());
        }
        if (interfaceC43580JMo.getIconicHorizonWorldId() != null) {
            A1I.put(AbstractC111324zv.A00(2474), interfaceC43580JMo.getIconicHorizonWorldId());
        }
        if (interfaceC43580JMo.getIconicHorizonWorldName() != null) {
            A1I.put(AbstractC111324zv.A00(2475), interfaceC43580JMo.getIconicHorizonWorldName());
        }
        interfaceC43580JMo.isWearableMediaProducer();
        A1I.put(AbstractC111324zv.A00(2645), Boolean.valueOf(interfaceC43580JMo.isWearableMediaProducer()));
        if (interfaceC43580JMo.BdQ() != null) {
            A1I.put("pivot_page_cta_label", interfaceC43580JMo.BdQ());
        }
        if (interfaceC43580JMo.BdR() != null) {
            A1I.put("pivot_page_cta_url", interfaceC43580JMo.BdR());
        }
        if (interfaceC43580JMo.BdS() != null) {
            A1I.put("pivot_page_description", interfaceC43580JMo.BdS());
        }
        if (interfaceC43580JMo.BdU() != null) {
            A1I.put("pivot_page_image_url", interfaceC43580JMo.BdU());
        }
        User BdV = interfaceC43580JMo.BdV();
        if (BdV != null) {
            A1I.put("pivot_page_micro_user_dict", BdV.A07());
        }
        if (interfaceC43580JMo.BdW() != null) {
            A1I.put("pivot_page_title", interfaceC43580JMo.BdW());
        }
        if (interfaceC43580JMo.CHs() != null) {
            WorldLocationPagesInfo CHs = interfaceC43580JMo.CHs();
            if (CHs != null) {
                treeUpdaterJNI = CHs.F7o();
            }
            A1I.put(AbstractC111324zv.A00(3317), treeUpdaterJNI);
        }
        return AbstractC06930Yk.A0B(A1I);
    }
}
