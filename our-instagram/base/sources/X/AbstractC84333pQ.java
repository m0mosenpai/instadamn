package X;

import android.os.Parcelable;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.user.model.User;
import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.3pQ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC84333pQ {
    public static C4GH parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            Boolean bool = null;
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            String str = null;
            Boolean bool2 = null;
            Boolean bool3 = null;
            String str2 = null;
            Integer num = null;
            String str3 = null;
            Integer num2 = null;
            String str4 = null;
            ArrayList arrayList = null;
            User user = null;
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                c16l.A1J();
                if ("formatted_mashups_count".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str = null;
                    } else {
                        str = c16l.A1P();
                    }
                } else if ("is_light_weight_check".equals(A0q)) {
                    bool2 = Boolean.valueOf(c16l.A0d());
                } else if ("is_pivot_page_available".equals(A0q)) {
                    bool = Boolean.valueOf(c16l.A0d());
                } else if ("mashups_allowed".equals(A0q)) {
                    bool3 = Boolean.valueOf(c16l.A0d());
                } else if ("media_type".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str2 = null;
                    } else {
                        str2 = c16l.A1P();
                    }
                } else if ("non_privacy_filtered_mashups_media_count".equals(A0q)) {
                    num = Integer.valueOf(c16l.A1D());
                } else if ("pk".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str3 = null;
                    } else {
                        str3 = c16l.A1P();
                    }
                } else if ("privacy_filtered_mashups_media_count".equals(A0q)) {
                    num2 = Integer.valueOf(c16l.A1D());
                } else if ("product_type".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str4 = null;
                    } else {
                        str4 = c16l.A1P();
                    }
                } else if ("sidecar_child_media_ids".equals(A0q)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = new ArrayList();
                        while (c16l.A1J() != C16R.A08) {
                            Long valueOf = Long.valueOf(c16l.A0y());
                            if (valueOf != null) {
                                arrayList.add(valueOf);
                            }
                        }
                    } else {
                        arrayList = null;
                    }
                } else if (PublicKeyCredentialControllerUtility.JSON_KEY_USER.equals(A0q)) {
                    Parcelable.Creator creator = User.CREATOR;
                    user = AbstractC38851rI.A00(c16l, false);
                }
                c16l.A0z();
            }
            if (bool == null && (c16l instanceof C07950bF)) {
                ((C07950bF) c16l).A03.A00("is_pivot_page_available", "RemixOriginalMedia");
            } else if (str3 != null || !(c16l instanceof C07950bF)) {
                if (user == null && (c16l instanceof C07950bF)) {
                    ((C07950bF) c16l).A03.A00(PublicKeyCredentialControllerUtility.JSON_KEY_USER, "RemixOriginalMedia");
                } else {
                    return new C4GH(user, bool2, bool3, num, num2, str, str2, str3, str4, arrayList, bool.booleanValue());
                }
            } else {
                ((C07950bF) c16l).A03.A00("pk", "RemixOriginalMedia");
            }
            throw C00O.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
