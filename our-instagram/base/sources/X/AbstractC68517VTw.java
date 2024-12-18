package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.graphql.enums.EnumHelper;
import java.io.IOException;

/* renamed from: X.VTw, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC68517VTw {
    public static C69458Vnh parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            C69458Vnh c69458Vnh = new C69458Vnh();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("comment_count".equals(A0s)) {
                    c69458Vnh.A00 = c16l.A1D();
                } else if ("engagement".equals(A0s)) {
                    c69458Vnh.A01 = c16l.A1D();
                } else if ("like_count".equals(A0s)) {
                    c69458Vnh.A02 = c16l.A1D();
                } else if ("save_count".equals(A0s)) {
                    c69458Vnh.A03 = c16l.A1D();
                } else if ("shopping_outbound_click_count".equals(A0s)) {
                    c69458Vnh.A04 = c16l.A1D();
                } else if ("shopping_product_click_count".equals(A0s)) {
                    c69458Vnh.A05 = c16l.A1D();
                } else if (AbstractC111324zv.A00(1366).equals(A0s)) {
                    c69458Vnh.A06 = c16l.A1D();
                } else if (AbstractC43591JPw.A00(73).equals(A0s)) {
                    c16l.A0y();
                } else if (PublicKeyCredentialControllerUtility.JSON_KEY_ID.equals(A0s)) {
                    c69458Vnh.A0B = AbstractC167017dG.A0m(c16l);
                } else if ("instagram_media_id".equals(A0s)) {
                    c69458Vnh.A0C = AbstractC167017dG.A0m(c16l);
                } else if ("instagram_media_owner_id".equals(A0s)) {
                    AbstractC31178DnM.A1I(c16l);
                } else if ("instagram_media_type".equals(A0s)) {
                    c69458Vnh.A0A = (EnumC68175VEt) EnumHelper.A00(c16l.A1Q(), EnumC68175VEt.A02);
                } else if ("image".equals(A0s)) {
                    c69458Vnh.A07 = AbstractC68501VTg.parseFromJson(c16l);
                } else if ("instagram_media_owner_profile_image".equals(A0s)) {
                    c69458Vnh.A08 = AbstractC68515VTu.parseFromJson(c16l);
                } else if ("inline_insights_node".equals(A0s)) {
                    c69458Vnh.A09 = AbstractC68516VTv.parseFromJson(c16l);
                }
                c16l.A0z();
            }
            return c69458Vnh;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
