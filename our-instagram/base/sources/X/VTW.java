package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.io.IOException;
import java.util.ArrayList;

/* loaded from: classes11.dex */
public abstract class VTW {
    public static C69231Vjz parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            C69231Vjz c69231Vjz = new C69231Vjz();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("has_audio".equals(A0s)) {
                    c69231Vjz.A03 = c16l.A0d();
                } else if ("video_duration".equals(A0s)) {
                    c16l.A1D();
                } else {
                    ArrayList arrayList = null;
                    if (PublicKeyCredentialControllerUtility.JSON_KEY_ID.equals(A0s)) {
                        c69231Vjz.A01 = AbstractC167017dG.A0m(c16l);
                    } else if ("image_versions2".equals(A0s)) {
                        c69231Vjz.A00 = VTV.parseFromJson(c16l);
                    } else if ("video_versions".equals(A0s)) {
                        if (c16l.A11() == C16R.A0C) {
                            arrayList = new ArrayList();
                            while (c16l.A1J() != C16R.A08) {
                                C69232Vk0 parseFromJson = VTX.parseFromJson(c16l);
                                if (parseFromJson != null) {
                                    arrayList.add(parseFromJson);
                                }
                            }
                        }
                        c69231Vjz.A02 = arrayList;
                    }
                }
                c16l.A0z();
            }
            return c69231Vjz;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
