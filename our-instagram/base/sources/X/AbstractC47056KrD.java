package X;

import com.instagram.infocenter.model.InfoCenterFactShareInfo;
import java.io.IOException;

/* renamed from: X.KrD, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC47056KrD {
    public static InfoCenterFactShareInfo parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            InfoCenterFactShareInfo infoCenterFactShareInfo = new InfoCenterFactShareInfo();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("info_center_type".equals(A0s)) {
                    infoCenterFactShareInfo.A00 = AbstractC47054KrB.A00(c16l.A1Q());
                } else if ("fact_name".equals(A0s)) {
                    infoCenterFactShareInfo.A0A = AbstractC167017dG.A0m(c16l);
                } else if ("bloks_bundle_id".equals(A0s)) {
                    infoCenterFactShareInfo.A02 = AbstractC167017dG.A0m(c16l);
                } else if ("header_title".equals(A0s)) {
                    infoCenterFactShareInfo.A0G = AbstractC167017dG.A0m(c16l);
                } else if ("header_subtitle".equals(A0s)) {
                    infoCenterFactShareInfo.A0F = AbstractC167017dG.A0m(c16l);
                } else if ("header_icon_url".equals(A0s)) {
                    infoCenterFactShareInfo.A0D = AbstractC167017dG.A0m(c16l);
                } else if ("header_icon_width".equals(A0s)) {
                    infoCenterFactShareInfo.A0E = AbstractC167017dG.A0m(c16l);
                } else if ("header_icon_height".equals(A0s)) {
                    infoCenterFactShareInfo.A0C = AbstractC167017dG.A0m(c16l);
                } else if ("card_background_image_url".equals(A0s)) {
                    infoCenterFactShareInfo.A04 = AbstractC167017dG.A0m(c16l);
                } else if ("card_background_image_width".equals(A0s)) {
                    infoCenterFactShareInfo.A05 = AbstractC167017dG.A0m(c16l);
                } else if ("card_background_image_height".equals(A0s)) {
                    infoCenterFactShareInfo.A03 = AbstractC167017dG.A0m(c16l);
                } else if ("story_background_image_url".equals(A0s)) {
                    infoCenterFactShareInfo.A0I = AbstractC167017dG.A0m(c16l);
                } else if ("story_background_image_width".equals(A0s)) {
                    infoCenterFactShareInfo.A0J = AbstractC167017dG.A0m(c16l);
                } else if ("story_background_image_height".equals(A0s)) {
                    infoCenterFactShareInfo.A0H = AbstractC167017dG.A0m(c16l);
                } else if ("fact_title".equals(A0s)) {
                    infoCenterFactShareInfo.A0B = AbstractC167017dG.A0m(c16l);
                } else if ("content_source".equals(A0s)) {
                    infoCenterFactShareInfo.A07 = AbstractC167017dG.A0m(c16l);
                } else if ("content_body".equals(A0s)) {
                    infoCenterFactShareInfo.A06 = AbstractC167017dG.A0m(c16l);
                } else if ("deep_link_url".equals(A0s)) {
                    infoCenterFactShareInfo.A09 = AbstractC167017dG.A0m(c16l);
                } else if ("all_facts_deep_link_url".equals(A0s)) {
                    infoCenterFactShareInfo.A01 = AbstractC167017dG.A0m(c16l);
                } else if ("cta_button_text".equals(A0s)) {
                    infoCenterFactShareInfo.A08 = AbstractC167017dG.A0m(c16l);
                }
                c16l.A0z();
            }
            return infoCenterFactShareInfo;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
