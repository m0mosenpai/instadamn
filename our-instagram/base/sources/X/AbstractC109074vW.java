package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.react.modules.dialog.DialogModule;
import com.instagram.debug.devoptions.sandboxselector.DevServerEntity;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.4vW, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC109074vW {
    public static C109084vX parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            C109854xD c109854xD = null;
            C914346k c914346k = null;
            C914346k c914346k2 = null;
            ArrayList arrayList = null;
            String str = null;
            C109874xF c109874xF = null;
            Integer num = null;
            Integer num2 = null;
            C914346k c914346k3 = null;
            Integer num3 = null;
            String str2 = null;
            String str3 = null;
            String str4 = null;
            String str5 = null;
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                c16l.A1J();
                if ("banner".equals(A0q)) {
                    c109854xD = AbstractC69854Vwf.parseFromJson(c16l);
                } else if ("banner_bloks_data".equals(A0q)) {
                    c914346k = IQ3.parseFromJson(c16l);
                } else if ("bloks_data".equals(A0q)) {
                    c914346k2 = IQ3.parseFromJson(c16l);
                } else if ("buttons".equals(A0q)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = new ArrayList();
                        while (c16l.A1J() != C16R.A08) {
                            C109854xD parseFromJson = AbstractC69854Vwf.parseFromJson(c16l);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    } else {
                        arrayList = null;
                    }
                } else if (DevServerEntity.COLUMN_DESCRIPTION.equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str = null;
                    } else {
                        str = c16l.A1P();
                    }
                } else if (PublicKeyCredentialControllerUtility.JSON_KEY_ICON.equals(A0q)) {
                    c109874xF = AbstractC69868Vwt.parseFromJson(c16l);
                } else if ("misinformation_type".equals(A0q)) {
                    num = Integer.valueOf(c16l.A1D());
                } else if ("overlay_applied_timestamp".equals(A0q)) {
                    num2 = Integer.valueOf(c16l.A1D());
                } else if ("overlay_bloks_data".equals(A0q)) {
                    c914346k3 = IQ3.parseFromJson(c16l);
                } else if ("overlay_layout".equals(A0q)) {
                    num3 = Integer.valueOf(c16l.A1D());
                } else if ("overlay_type".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str2 = null;
                    } else {
                        str2 = c16l.A1P();
                    }
                } else if (AbstractC37310GcC.A01(0, 10, 123).equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str3 = null;
                    } else {
                        str3 = c16l.A1P();
                    }
                } else if ("sub_category".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str4 = null;
                    } else {
                        str4 = c16l.A1P();
                    }
                } else if (DialogModule.KEY_TITLE.equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str5 = null;
                    } else {
                        str5 = c16l.A1P();
                    }
                }
                c16l.A0z();
            }
            return new C109084vX(c109854xD, c109874xF, c914346k, c914346k2, c914346k3, num, num2, num3, str, str2, str3, str4, str5, arrayList);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }

    public static void A00(AnonymousClass182 anonymousClass182, C109084vX c109084vX) {
        anonymousClass182.A0d();
        C109854xD c109854xD = c109084vX.A00;
        if (c109854xD != null) {
            anonymousClass182.A0r("banner");
            AbstractC69854Vwf.A00(anonymousClass182, c109854xD);
        }
        C914346k c914346k = c109084vX.A02;
        if (c914346k != null) {
            anonymousClass182.A0r("banner_bloks_data");
            IQ3.A00(anonymousClass182, c914346k);
        }
        C914346k c914346k2 = c109084vX.A03;
        if (c914346k2 != null) {
            anonymousClass182.A0r("bloks_data");
            IQ3.A00(anonymousClass182, c914346k2);
        }
        List<C109854xD> list = c109084vX.A0D;
        if (list != null) {
            C16V.A03(anonymousClass182, "buttons");
            for (C109854xD c109854xD2 : list) {
                if (c109854xD2 != null) {
                    AbstractC69854Vwf.A00(anonymousClass182, c109854xD2);
                }
            }
            anonymousClass182.A0Z();
        }
        String str = c109084vX.A08;
        if (str != null) {
            anonymousClass182.A0S(DevServerEntity.COLUMN_DESCRIPTION, str);
        }
        C109874xF c109874xF = c109084vX.A01;
        if (c109874xF != null) {
            anonymousClass182.A0r(PublicKeyCredentialControllerUtility.JSON_KEY_ICON);
            AbstractC69868Vwt.A00(anonymousClass182, c109874xF);
        }
        Integer num = c109084vX.A05;
        if (num != null) {
            anonymousClass182.A0Q("misinformation_type", num.intValue());
        }
        Integer num2 = c109084vX.A06;
        if (num2 != null) {
            anonymousClass182.A0Q("overlay_applied_timestamp", num2.intValue());
        }
        C914346k c914346k3 = c109084vX.A04;
        if (c914346k3 != null) {
            anonymousClass182.A0r("overlay_bloks_data");
            IQ3.A00(anonymousClass182, c914346k3);
        }
        Integer num3 = c109084vX.A07;
        if (num3 != null) {
            anonymousClass182.A0Q("overlay_layout", num3.intValue());
        }
        String str2 = c109084vX.A09;
        if (str2 != null) {
            anonymousClass182.A0S("overlay_type", str2);
        }
        String str3 = c109084vX.A0A;
        if (str3 != null) {
            anonymousClass182.A0S(AbstractC37310GcC.A01(0, 10, 123), str3);
        }
        String str4 = c109084vX.A0B;
        if (str4 != null) {
            anonymousClass182.A0S("sub_category", str4);
        }
        String str5 = c109084vX.A0C;
        if (str5 != null) {
            anonymousClass182.A0S(DialogModule.KEY_TITLE, str5);
        }
        anonymousClass182.A0a();
    }
}
