package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.react.modules.dialog.DialogModule;
import java.io.IOException;
import java.util.ArrayList;

/* loaded from: classes11.dex */
public abstract class VVU {
    public static V80 parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            V80 v80 = new V80();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("dismissible".equals(A0s)) {
                    v80.A0H = c16l.A0d();
                } else if (PublicKeyCredentialControllerUtility.JSON_KEY_ICON.equals(A0s)) {
                    v80.A01 = AbstractC222616c.A00(c16l);
                } else if ("icon_width_dp".equals(A0s)) {
                    v80.A04 = AbstractC166997dE.A0h(c16l);
                } else if ("icon_height_dp".equals(A0s)) {
                    v80.A03 = AbstractC166997dE.A0h(c16l);
                } else {
                    ArrayList arrayList = null;
                    if (DialogModule.KEY_MESSAGE.equals(A0s)) {
                        v80.A0B = AbstractC167017dG.A0m(c16l);
                    } else if ("message_color".equals(A0s)) {
                        v80.A0C = AbstractC167017dG.A0m(c16l);
                    } else if (DialogModule.KEY_TITLE.equals(A0s)) {
                        v80.A0D = AbstractC167017dG.A0m(c16l);
                    } else if ("title_color".equals(A0s)) {
                        v80.A0E = AbstractC167017dG.A0m(c16l);
                    } else if (PublicKeyCredentialControllerUtility.JSON_KEY_TYPE.equals(A0s)) {
                        v80.A0F = AbstractC167017dG.A0m(c16l);
                    } else if ("background_color".equals(A0s)) {
                        v80.A05 = AbstractC167017dG.A0m(c16l);
                    } else if ("dismiss_button_color".equals(A0s)) {
                        v80.A09 = AbstractC167017dG.A0m(c16l);
                    } else if ("button_location".equals(A0s)) {
                        v80.A08 = AbstractC167017dG.A0m(c16l);
                    } else if ("megaphone_version".equals(A0s)) {
                        v80.A0A = AbstractC167017dG.A0m(c16l);
                    } else if ("button_layout".equals(A0s)) {
                        v80.A07 = AbstractC167017dG.A0m(c16l);
                    } else if ("buttons".equals(A0s)) {
                        if (c16l.A11() == C16R.A0C) {
                            arrayList = new ArrayList();
                            while (c16l.A1J() != C16R.A08) {
                                C69393Vmd parseFromJson = VVT.parseFromJson(c16l);
                                if (parseFromJson != null) {
                                    arrayList.add(parseFromJson);
                                }
                            }
                        }
                        v80.A0G = arrayList;
                    } else if ("bottom_icon".equals(A0s)) {
                        v80.A00 = AbstractC222616c.A00(c16l);
                    } else if ("bottom_message".equals(A0s)) {
                        v80.A06 = AbstractC167017dG.A0m(c16l);
                    } else {
                        F7U.A00(c16l, v80, A0s);
                    }
                }
                c16l.A0z();
            }
            if ("v3".equalsIgnoreCase(v80.A0A)) {
                VE7 ve7 = (VE7) VE7.A01.get(v80.A07);
                if (ve7 != null) {
                    v80.A02 = ve7;
                    return v80;
                }
                throw new IllegalStateException("Unsupported button layout");
            }
            return v80;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
