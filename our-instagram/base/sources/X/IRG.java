package X;

import com.instagram.api.schemas.DropsEventPageNavigationMetadata;
import com.instagram.api.schemas.DropsEventPageNavigationMetadataImpl;
import com.instagram.debug.devoptions.signalsplayground.fragment.CreatorInspirationSignalsPlaygroundTestUsersFragment;
import com.instagram.model.shopping.drops.DropsLaunchAnimation;
import com.instagram.user.model.ProductCollection;
import com.instagram.user.model.ProductCollectionImpl;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public abstract class IRG {
    public static C38820H7m parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            ProductCollectionImpl productCollectionImpl = null;
            DropsLaunchAnimation dropsLaunchAnimation = null;
            DropsEventPageNavigationMetadataImpl dropsEventPageNavigationMetadataImpl = null;
            String str = null;
            String str2 = null;
            String str3 = null;
            ArrayList arrayList = null;
            String str4 = null;
            String str5 = null;
            String str6 = null;
            String str7 = null;
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("collection_metadata".equals(A0s)) {
                    productCollectionImpl = IT1.parseFromJson(c16l);
                } else if ("drops_launch_animation".equals(A0s)) {
                    dropsLaunchAnimation = I3V.parseFromJson(c16l);
                } else if ("event_page_navigation_metadata".equals(A0s)) {
                    dropsEventPageNavigationMetadataImpl = AbstractC39903Hmq.parseFromJson(c16l);
                } else if (AbstractC31171DnF.A1Y(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str = null;
                    } else {
                        str = c16l.A1P();
                    }
                } else if (AbstractC37300Gc1.A1J(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str2 = null;
                    } else {
                        str2 = c16l.A1P();
                    }
                } else if ("merchant_id".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str3 = null;
                    } else {
                        str3 = c16l.A1P();
                    }
                } else if ("stickers".equals(A0s)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = AbstractC166987dD.A1E();
                        while (c16l.A1J() != C16R.A08) {
                            H61 parseFromJson = AbstractC40320HuQ.parseFromJson(c16l);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    } else {
                        arrayList = null;
                    }
                } else if (AbstractC37300Gc1.A1D(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str4 = null;
                    } else {
                        str4 = c16l.A1P();
                    }
                } else if ("text_format".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str5 = null;
                    } else {
                        str5 = c16l.A1P();
                    }
                } else if (CreatorInspirationSignalsPlaygroundTestUsersFragment.INTENT_EXTRA_USER_ID.equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str6 = null;
                    } else {
                        str6 = c16l.A1P();
                    }
                } else if ("vibrant_text_color".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str7 = null;
                    } else {
                        str7 = c16l.A1P();
                    }
                }
                c16l.A0z();
            }
            return new C38820H7m(dropsEventPageNavigationMetadataImpl, dropsLaunchAnimation, productCollectionImpl, str, str2, str3, str4, str5, str6, str7, arrayList);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }

    public static void A00(AnonymousClass182 anonymousClass182, C38820H7m c38820H7m) {
        anonymousClass182.A0d();
        ProductCollection productCollection = c38820H7m.A02;
        if (productCollection != null) {
            anonymousClass182.A0r("collection_metadata");
            IT1.A00(anonymousClass182, productCollection.F7R(AbstractC37301Gc2.A08()));
        }
        DropsLaunchAnimation dropsLaunchAnimation = c38820H7m.A01;
        if (dropsLaunchAnimation != null) {
            anonymousClass182.A0r("drops_launch_animation");
            anonymousClass182.A0d();
            Boolean bool = dropsLaunchAnimation.A00;
            if (bool != null) {
                anonymousClass182.A0T("show_animation", bool.booleanValue());
            }
            anonymousClass182.A0a();
        }
        DropsEventPageNavigationMetadata dropsEventPageNavigationMetadata = c38820H7m.A00;
        if (dropsEventPageNavigationMetadata != null) {
            anonymousClass182.A0r("event_page_navigation_metadata");
            DropsEventPageNavigationMetadataImpl Et9 = dropsEventPageNavigationMetadata.Et9();
            anonymousClass182.A0d();
            String str = Et9.A00;
            if (str != null) {
                anonymousClass182.A0S("upcoming_event_id", str);
            }
            anonymousClass182.A0a();
        }
        AbstractC37301Gc2.A1D(anonymousClass182, c38820H7m.A03);
        String str2 = c38820H7m.A04;
        if (str2 != null) {
            anonymousClass182.A0S("media_id", str2);
        }
        AbstractC37301Gc2.A1I(anonymousClass182, c38820H7m.A05);
        List list = c38820H7m.A0A;
        if (list != null) {
            Iterator A0q = AbstractC37301Gc2.A0q(anonymousClass182, "stickers", list);
            while (A0q.hasNext()) {
                H61 h61 = (H61) A0q.next();
                if (h61 != null) {
                    anonymousClass182.A0d();
                    AbstractC37301Gc2.A1D(anonymousClass182, h61.A00);
                    anonymousClass182.A0a();
                }
            }
            anonymousClass182.A0Z();
        }
        AbstractC37301Gc2.A1E(anonymousClass182, c38820H7m.A06);
        String str3 = c38820H7m.A07;
        if (str3 != null) {
            anonymousClass182.A0S("text_format", str3);
        }
        String str4 = c38820H7m.A08;
        if (str4 != null) {
            anonymousClass182.A0S(CreatorInspirationSignalsPlaygroundTestUsersFragment.INTENT_EXTRA_USER_ID, str4);
        }
        String str5 = c38820H7m.A09;
        if (str5 != null) {
            anonymousClass182.A0S("vibrant_text_color", str5);
        }
        anonymousClass182.A0a();
    }
}
