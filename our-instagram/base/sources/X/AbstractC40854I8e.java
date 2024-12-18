package X;

import com.instagram.common.textwithentities.model.TextWithEntities;
import java.io.IOException;

/* renamed from: X.I8e, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC40854I8e {
    public static C38645Gym parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            C38645Gym c38645Gym = new C38645Gym();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("item".equals(A0s)) {
                    c38645Gym.A00 = AbstractC40856I8g.parseFromJson(c16l);
                } else if ("item_type".equals(A0s)) {
                    EnumC39574Hdk enumC39574Hdk = (EnumC39574Hdk) EnumC39574Hdk.A01.get(AbstractC37304Gc5.A0c(c16l));
                    if (enumC39574Hdk == null) {
                        enumC39574Hdk = EnumC39574Hdk.A07;
                    }
                    c38645Gym.A07 = enumC39574Hdk;
                } else if ("behavior".equals(A0s)) {
                    EnumC39576Hdm enumC39576Hdm = (EnumC39576Hdm) EnumC39576Hdm.A01.get(AbstractC37304Gc5.A0c(c16l));
                    if (enumC39576Hdm == null) {
                        enumC39576Hdm = EnumC39576Hdm.A09;
                    }
                    c38645Gym.A06 = enumC39576Hdm;
                } else if ("behavior_meta".equals(A0s)) {
                    c38645Gym.A02 = AbstractC40853I8d.parseFromJson(c16l);
                } else if ("image_thumbnail_meta".equals(A0s)) {
                    C51759Mti parseFromJson = AbstractC40855I8f.parseFromJson(c16l);
                    C14360o3.A0B(parseFromJson, 0);
                    c38645Gym.A01 = parseFromJson;
                } else if ("primary_text".equals(A0s)) {
                    TextWithEntities parseFromJson2 = AbstractC40571Hyr.parseFromJson(c16l);
                    C14360o3.A0B(parseFromJson2, 0);
                    c38645Gym.A03 = parseFromJson2;
                } else if ("secondary_text".equals(A0s)) {
                    c38645Gym.A04 = AbstractC40571Hyr.parseFromJson(c16l);
                } else if ("tertiary_text".equals(A0s)) {
                    c38645Gym.A05 = AbstractC40571Hyr.parseFromJson(c16l);
                } else if ("show_caret".equals(A0s)) {
                    c38645Gym.A09 = c16l.A0d();
                } else if ("has_variants".equals(A0s)) {
                    c38645Gym.A08 = c16l.A0d();
                }
                c16l.A0z();
            }
            return c38645Gym;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
