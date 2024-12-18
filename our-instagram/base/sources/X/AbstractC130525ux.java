package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.react.modules.dialog.DialogModule;
import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.5ux, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC130525ux {
    public static C130535uy parseFromJson(C16L c16l) {
        EnumC130545uz enumC130545uz;
        C14360o3.A0B(c16l, 0);
        try {
            C130535uy c130535uy = new C130535uy();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                c16l.A1J();
                String str = null;
                String str2 = null;
                String str3 = null;
                String str4 = null;
                String str5 = null;
                ArrayList arrayList = null;
                String str6 = null;
                if (PublicKeyCredentialControllerUtility.JSON_KEY_ID.equals(A0q)) {
                    if (c16l.A11() != C16R.A0G) {
                        str2 = c16l.A1P();
                    }
                    C14360o3.A0B(str2, 0);
                    c130535uy.A0A = str2;
                } else if ("design".equals(A0q)) {
                    String A1Q = c16l.A1Q();
                    C14360o3.A0B(A1Q, 0);
                    EnumC132885zD enumC132885zD = (EnumC132885zD) EnumC132885zD.A01.get(A1Q);
                    if (enumC132885zD == null) {
                        enumC132885zD = EnumC132885zD.A08;
                    }
                    c130535uy.A06 = enumC132885zD;
                } else if ("label".equals(A0q)) {
                    if (c16l.A11() != C16R.A0G) {
                        str3 = c16l.A1P();
                    }
                    c130535uy.A0B = str3;
                } else if ("badge_label".equals(A0q)) {
                    if (c16l.A11() != C16R.A0G) {
                        str4 = c16l.A1P();
                    }
                    c130535uy.A08 = str4;
                } else if (PublicKeyCredentialControllerUtility.JSON_KEY_TYPE.equals(A0q)) {
                    if (c16l.A11() != C16R.A0G) {
                        str5 = c16l.A1P();
                    }
                    C14360o3.A0B(str5, 0);
                    c130535uy.A0D = str5;
                } else if (DialogModule.KEY_ITEMS.equals(A0q)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = new ArrayList();
                        while (c16l.A1J() != C16R.A08) {
                            C111034zF parseFromJson = AbstractC111024zE.parseFromJson(c16l);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    }
                    C14360o3.A0B(arrayList, 0);
                    c130535uy.A0E = arrayList;
                } else if ("tag".equals(A0q)) {
                    if (c16l.A11() != C16R.A0G) {
                        c16l.A1P();
                    }
                } else if ("max_id".equals(A0q)) {
                    if (c16l.A11() != C16R.A0G) {
                        str6 = c16l.A1P();
                    }
                    c130535uy.A0C = str6;
                } else if ("more_available".equals(A0q)) {
                    c130535uy.A0F = c16l.A0d();
                } else if ("content_source".equals(A0q)) {
                    if (c16l.A11() != C16R.A0G) {
                        str = c16l.A1P();
                    }
                    c130535uy.A09 = str;
                } else if ("chaining_info".equals(A0q)) {
                    c130535uy.A02 = AbstractC130555v0.parseFromJson(c16l);
                }
                c16l.A0z();
            }
            EnumC132895zE enumC132895zE = (EnumC132895zE) EnumC132895zE.A01.get(c130535uy.A0D);
            if (enumC132895zE == null) {
                enumC132895zE = EnumC132895zE.A05;
            }
            c130535uy.A07 = enumC132895zE;
            C125905mf A00 = InterfaceC111084zP.A00.A00(c130535uy.A0F);
            A00.A00 = c130535uy.A0C;
            c130535uy.A03 = A00.A00();
            String str7 = c130535uy.A09;
            if (str7 == null || (enumC130545uz = (EnumC130545uz) EnumC130545uz.A01.get(str7)) == null) {
                enumC130545uz = EnumC130545uz.A05;
            }
            c130535uy.A05 = enumC130545uz;
            return c130535uy;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
