package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.io.IOException;
import java.util.ArrayList;

/* loaded from: classes11.dex */
public abstract class U3i {
    public static C66193U3j parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            C66193U3j c66193U3j = new C66193U3j();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                c16l.A1J();
                ArrayList arrayList = null;
                String str = null;
                String str2 = null;
                ArrayList arrayList2 = null;
                if ("document".equals(A0q)) {
                    if (c16l.A11() != C16R.A0G) {
                        str = c16l.A1P();
                    }
                    c66193U3j.A01 = str;
                } else if (PublicKeyCredentialControllerUtility.JSON_KEY_NAME.equals(A0q)) {
                    if (c16l.A11() != C16R.A0G) {
                        str2 = c16l.A1P();
                    }
                    c66193U3j.A02 = str2;
                } else if ("metadata".equals(A0q)) {
                    c66193U3j.A00 = AbstractC66196U3m.parseFromJson(c16l);
                } else if ("bitmaps".equals(A0q)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList2 = new ArrayList();
                        while (c16l.A1J() != C16R.A08) {
                            C66195U3l parseFromJson = AbstractC66194U3k.parseFromJson(c16l);
                            if (parseFromJson != null) {
                                arrayList2.add(parseFromJson);
                            }
                        }
                    }
                    c66193U3j.A03 = arrayList2;
                } else if ("states".equals(A0q)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = new ArrayList();
                        while (c16l.A1J() != C16R.A08) {
                            C69005Vfh parseFromJson2 = AbstractC68544VUx.parseFromJson(c16l);
                            if (parseFromJson2 != null) {
                                arrayList.add(parseFromJson2);
                            }
                        }
                    }
                    c66193U3j.A04 = arrayList;
                }
                c16l.A0z();
            }
            return c66193U3j;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
