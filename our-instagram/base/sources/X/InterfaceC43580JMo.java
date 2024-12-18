package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.WearablesAppAttributionType;
import com.instagram.api.schemas.WorldLocationPagesInfo;
import com.instagram.user.model.User;

/* renamed from: X.JMo, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public interface InterfaceC43580JMo {
    public static final C41520IYv A00 = C41520IYv.A00;

    WearablesAppAttributionType AdN();

    Integer BF1();

    String BdQ();

    String BdR();

    String BdS();

    String BdU();

    User BdV();

    String BdW();

    WorldLocationPagesInfo CHs();

    InterfaceC43580JMo EBD(C1DY c1dy);

    H75 F3t(C1DY c1dy);

    H75 F3u(C1DV c1dv);

    TreeUpdaterJNI F7o();

    String getAttributionCtaActionUrl();

    String getAttributionCtaText();

    String getAttributionIconUrl();

    String getAttributionSubtitle();

    String getAttributionTitle();

    String getAttributionTopIconUrl();

    String getIconicHorizonWorldDeeplink();

    String getIconicHorizonWorldId();

    String getIconicHorizonWorldName();

    boolean isWearableMediaProducer();
}
