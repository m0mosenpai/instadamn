package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.graphql.enums.EnumHelper;
import java.io.IOException;

/* renamed from: X.Kr4, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC47047Kr4 {
    public static C47697L4e parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            C47697L4e c47697L4e = new C47697L4e();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                if (AbstractC37301Gc2.A1V(c16l, A0q)) {
                    c47697L4e.A05 = AbstractC167017dG.A0m(c16l);
                } else if (PublicKeyCredentialControllerUtility.JSON_KEY_NAME.equals(A0q)) {
                    c47697L4e.A06 = AbstractC167017dG.A0m(c16l);
                } else if ("device_position".equals(A0q)) {
                    c47697L4e.A04 = (EnumC223179sw) EnumHelper.A00(c16l.A1Q(), EnumC223179sw.UNSET_OR_UNRECOGNIZED_ENUM_VALUE);
                } else if ("attribution_user".equals(A0q)) {
                    c47697L4e.A00 = AbstractC47043Kr0.parseFromJson(c16l);
                } else if ("effect_action_sheet".equals(A0q)) {
                    c47697L4e.A01 = AbstractC47044Kr1.parseFromJson(c16l);
                } else if ("fan_club".equals(A0q)) {
                    c47697L4e.A02 = AbstractC47045Kr2.parseFromJson(c16l);
                } else if ("thumbnail_image".equals(A0q)) {
                    c47697L4e.A03 = AbstractC47046Kr3.parseFromJson(c16l);
                }
                c16l.A0z();
            }
            return c47697L4e;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
