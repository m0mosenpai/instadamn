package X;

import com.instagram.model.direct.stickerstore.DirectStoreSticker;
import java.io.IOException;
import java.io.StringWriter;
import kotlin.enums.EnumEntries;

/* renamed from: X.LBq, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC47847LBq {
    public static C49807LzE parseFromJson(C16L c16l) {
        String A1P;
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            Long l = null;
            EnumC46173KcB enumC46173KcB = null;
            C45026JwH c45026JwH = null;
            C148286ly c148286ly = null;
            C148286ly c148286ly2 = null;
            DirectStoreSticker directStoreSticker = null;
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("sticker_type".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        A1P = null;
                    } else {
                        A1P = c16l.A1P();
                    }
                    EnumEntries enumEntries = EnumC46173KcB.A01;
                    C14360o3.A0B(A1P, 0);
                    enumC46173KcB = (EnumC46173KcB) EnumC46173KcB.A00.get(A1P);
                    if (enumC46173KcB == null) {
                        enumC46173KcB = EnumC46173KcB.A07;
                    }
                } else if ("giphy_sticker".equals(A0s)) {
                    c45026JwH = AbstractC47868LCo.parseFromJson(c16l);
                } else if ("ai_sticker".equals(A0s)) {
                    c148286ly = AbstractC201088uq.parseFromJson(c16l);
                } else if ("cutout_sticker".equals(A0s)) {
                    c148286ly2 = AbstractC201088uq.parseFromJson(c16l);
                } else if ("store_sticker".equals(A0s)) {
                    directStoreSticker = AbstractC47870LCq.parseFromJson(c16l);
                } else {
                    l = AbstractC37303Gc4.A0O(c16l, l, A0s, "last_used_timestamp");
                }
                c16l.A0z();
            }
            if (enumC46173KcB == null && (c16l instanceof C07950bF)) {
                AbstractC166997dE.A1V("sticker_type", c16l, "RecentDirectSticker");
            } else if (l == null && (c16l instanceof C07950bF)) {
                AbstractC166997dE.A1V("last_used_timestamp", c16l, "RecentDirectSticker");
            } else {
                return new C49807LzE(c148286ly, c148286ly2, enumC46173KcB, c45026JwH, directStoreSticker, l.longValue());
            }
            throw C00O.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }

    public static String A00(C49807LzE c49807LzE) {
        StringWriter stringWriter = new StringWriter();
        C17z A0S = AbstractC167007dF.A0S(stringWriter);
        EnumC46173KcB enumC46173KcB = c49807LzE.A03;
        EnumEntries enumEntries = EnumC46173KcB.A01;
        A0S.A0S("sticker_type", enumC46173KcB.name());
        C45026JwH c45026JwH = c49807LzE.A04;
        if (c45026JwH != null) {
            A0S.A0r("giphy_sticker");
            AbstractC47868LCo.A00(A0S, c45026JwH);
        }
        C148286ly c148286ly = c49807LzE.A01;
        if (c148286ly != null) {
            A0S.A0r("ai_sticker");
            AbstractC201088uq.A00(A0S, c148286ly);
        }
        C148286ly c148286ly2 = c49807LzE.A02;
        if (c148286ly2 != null) {
            A0S.A0r("cutout_sticker");
            AbstractC201088uq.A00(A0S, c148286ly2);
        }
        DirectStoreSticker directStoreSticker = c49807LzE.A05;
        if (directStoreSticker != null) {
            A0S.A0r("store_sticker");
            AbstractC47870LCq.A00(A0S, directStoreSticker);
        }
        A0S.A0R("last_used_timestamp", c49807LzE.A00);
        return AbstractC167017dG.A0l(A0S, stringWriter);
    }
}
