package X;

import android.os.Bundle;
import com.google.common.collect.ImmutableList;
import com.instagram.api.schemas.AdsAPIInstagramPosition;
import com.instagram.api.schemas.XIGIGBoostCallToAction;
import com.instagram.api.schemas.XIGIGBoostDestination;
import com.instagram.common.session.UserSession;
import com.instagram.music.common.model.AudioOverlayTrack;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes11.dex */
public final class UFB extends C9U7 {
    public final Bundle A00;
    public final AudioOverlayTrack A01;

    @Override // X.C9U7
    public final AbstractC52922bZ A02(C152406tQ c152406tQ, Class cls, String str) {
        AbstractC167027dH.A12(str, cls, c152406tQ);
        UserSession A06 = C023409i.A0A.A06(this.A00);
        Object A00 = c152406tQ.A00("destination");
        if (A00 != null) {
            XIGIGBoostDestination valueOf = XIGIGBoostDestination.valueOf((String) A00);
            Object A002 = c152406tQ.A00("media_id");
            if (A002 != null) {
                String str2 = (String) A002;
                Object A003 = c152406tQ.A00("call_to_action");
                if (A003 != null) {
                    XIGIGBoostCallToAction valueOf2 = XIGIGBoostCallToAction.valueOf((String) A003);
                    List list = (List) c152406tQ.A00("instagram_positions");
                    if (list != null) {
                        ArrayList A0i = AbstractC167007dF.A0i(list);
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            A0i.add(AdsAPIInstagramPosition.valueOf((String) it.next()));
                        }
                        ArrayList A004 = C6PZ.A00(valueOf, A06, A0i);
                        ArrayList arrayList = new ArrayList();
                        Iterator it2 = A004.iterator();
                        while (it2.hasNext()) {
                            Object next = it2.next();
                            AdsAPIInstagramPosition adsAPIInstagramPosition = (AdsAPIInstagramPosition) next;
                            if (adsAPIInstagramPosition != AdsAPIInstagramPosition.A0A || C6PZ.A03(adsAPIInstagramPosition, valueOf, A06)) {
                                arrayList.add(next);
                            }
                        }
                        boolean A1a = AbstractC31177DnL.A1a((Boolean) c152406tQ.A00("is_fb_placement_eligible"));
                        boolean A1a2 = AbstractC31177DnL.A1a((Boolean) c152406tQ.A00("is_fb_placement_selected"));
                        boolean A1a3 = AbstractC31177DnL.A1a((Boolean) c152406tQ.A00("is_ad_format_preferences_eligible"));
                        boolean A1a4 = AbstractC31177DnL.A1a((Boolean) c152406tQ.A00("should_show_creative_optimization_toggle"));
                        boolean A1Z = AbstractC50523MSb.A1Z(c152406tQ, "should_show_multi_advertiser_ads_toggle");
                        Object A005 = c152406tQ.A00("special_requirement_categories");
                        if (A005 != null) {
                            List list2 = (List) A005;
                            String str3 = (String) c152406tQ.A00("political_ad_byline_text");
                            boolean A1Z2 = AbstractC50523MSb.A1Z(c152406tQ, "is_view_pager_child");
                            String obj = valueOf2.toString();
                            ArrayList A0i2 = AbstractC167007dF.A0i(arrayList);
                            Iterator it3 = arrayList.iterator();
                            while (it3.hasNext()) {
                                AbstractC166997dE.A1S(it3.next(), A0i2);
                            }
                            return new UFJ(valueOf2, valueOf, new C69289Vkx(ImmutableList.copyOf((Collection) A0i2), A06, str2, obj, list2), A06, this.A01, str2, str3, arrayList, A1a, A1a2, A1a3, A1a4, A1Z, A1Z2);
                        }
                        throw new IllegalStateException("Required value was null.");
                    }
                    throw new IllegalStateException("Required value was null.");
                }
                throw new IllegalStateException("Required value was null.");
            }
            throw new IllegalStateException("Required value was null.");
        }
        throw new IllegalStateException("Required value was null.");
    }

    public UFB(Bundle bundle, InterfaceC08430c6 interfaceC08430c6, AudioOverlayTrack audioOverlayTrack) {
        super(bundle, interfaceC08430c6);
        this.A00 = bundle;
        this.A01 = audioOverlayTrack;
    }
}
