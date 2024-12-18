package X;

import com.instagram.api.schemas.BwPIconOverlayType;
import com.instagram.api.schemas.BwPPostClickLandingExperineceType;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.Hky, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract /* synthetic */ class AbstractC39788Hky {
    public static Map A00(JM2 jm2) {
        ArrayList arrayList;
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        if (jm2.B8H() != null) {
            A1I.put("formatted_price", jm2.B8H());
        }
        String str = null;
        if (jm2.BEq() != null) {
            List<BwPIconOverlayType> BEq = jm2.BEq();
            if (BEq != null) {
                arrayList = AbstractC167017dG.A0q(BEq);
                for (BwPIconOverlayType bwPIconOverlayType : BEq) {
                    C14360o3.A0B(bwPIconOverlayType, 0);
                    arrayList.add(bwPIconOverlayType.A00);
                }
            } else {
                arrayList = null;
            }
            A1I.put("icon_overlays", arrayList);
        }
        if (jm2.Beo() != null) {
            BwPPostClickLandingExperineceType Beo = jm2.Beo();
            if (Beo != null) {
                str = Beo.A00;
            }
            A1I.put("post_click_landing_experience", str);
        }
        if (jm2.Bep() != null) {
            A1I.put("post_click_url", jm2.Bep());
        }
        if (jm2.BgR() != null) {
            A1I.put("primary_text", jm2.BgR());
        }
        if (jm2.getSecondaryText() != null) {
            A1I.put("secondary_text", jm2.getSecondaryText());
        }
        return AbstractC06930Yk.A0B(A1I);
    }
}
