package X;

import android.os.Parcelable;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.user.model.User;
import java.io.IOException;

/* renamed from: X.9zF, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC226579zF {
    /* JADX WARN: Type inference failed for: r1v0, types: [X.83m, java.lang.Object] */
    public static C1815983m parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            ?? obj = new Object();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if (PublicKeyCredentialControllerUtility.JSON_KEY_USER.equals(A0s)) {
                    Parcelable.Creator creator = User.CREATOR;
                    obj.A04 = AbstractC38851rI.A00(c16l, false);
                } else if ("original_media_id".equals(A0s)) {
                    obj.A06 = AbstractC167017dG.A0m(c16l);
                } else if (AbstractC111324zv.A00(4751).equals(A0s)) {
                    obj.A08 = c16l.A0d();
                } else if (AbstractC111324zv.A00(1103).equals(A0s)) {
                    obj.A05 = AbstractC167017dG.A0m(c16l);
                } else if ("media_duration".equals(A0s)) {
                    obj.A03 = c16l.A1D();
                } else if ("container_width".equals(A0s)) {
                    obj.A02 = c16l.A1D();
                } else if ("container_height".equals(A0s)) {
                    obj.A01 = c16l.A1D();
                } else if (AbstractC111324zv.A00(1094).equals(A0s)) {
                    obj.A00 = (float) c16l.A0U();
                } else if (AbstractC111324zv.A00(1063).equals(A0s)) {
                    obj.A09 = c16l.A0d();
                } else if (AbstractC111324zv.A00(4530).equals(A0s)) {
                    obj.A07 = c16l.A0d();
                }
                c16l.A0z();
            }
            return obj;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
