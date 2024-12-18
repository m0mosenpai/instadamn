package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.VUx, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC68544VUx {
    public static C69005Vfh parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            C69005Vfh c69005Vfh = new C69005Vfh();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                ArrayList arrayList = null;
                if (PublicKeyCredentialControllerUtility.JSON_KEY_NAME.equals(A0s)) {
                    c69005Vfh.A00 = AbstractC167017dG.A0m(c16l);
                } else if ("event_actions".equals(A0s)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = new ArrayList();
                        while (c16l.A1J() != C16R.A08) {
                            C69004Vfg parseFromJson = AbstractC68543VUw.parseFromJson(c16l);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    }
                    c69005Vfh.A01 = arrayList;
                }
                c16l.A0z();
            }
            return c69005Vfh;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
