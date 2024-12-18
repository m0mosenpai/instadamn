package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.react.modules.dialog.DialogModule;
import com.instagram.reels.memories.model.MemoryItem;
import java.io.IOException;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes4.dex */
public abstract class ADL {
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, X.88X] */
    public static C88X parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            ?? obj = new Object();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if (PublicKeyCredentialControllerUtility.JSON_KEY_TYPE.equals(A0s)) {
                    obj.A04 = AbstractC225759xu.A00(c16l.A1Q());
                } else {
                    ArrayList arrayList = null;
                    if (PublicKeyCredentialControllerUtility.JSON_KEY_NAME.equals(A0s)) {
                        obj.A0G = AbstractC167017dG.A0m(c16l);
                    } else if ("thumbnail_url".equals(A0s)) {
                        obj.A05 = AbstractC222616c.A00(c16l);
                    } else if ("ar_effect".equals(A0s)) {
                        obj.A03 = AbstractC120315cU.parseFromJson(c16l);
                    } else if (AbstractC111324zv.A00(1172).equals(A0s)) {
                        if (c16l.A11() == C16R.A0C) {
                            arrayList = AbstractC166987dD.A1E();
                            while (c16l.A1J() != C16R.A08) {
                                C101394gx parseFromJson = AbstractC101354gs.parseFromJson(c16l);
                                if (parseFromJson != null) {
                                    arrayList.add(parseFromJson);
                                }
                            }
                        }
                        obj.A0I = arrayList;
                    } else if ("question_stickers".equals(A0s)) {
                        if (c16l.A11() == C16R.A0C) {
                            arrayList = AbstractC166987dD.A1E();
                            while (c16l.A1J() != C16R.A08) {
                                URE parseFromJson2 = ADF.parseFromJson(c16l);
                                if (parseFromJson2 != null) {
                                    arrayList.add(parseFromJson2);
                                }
                            }
                        }
                        obj.A0J = arrayList;
                    } else if ("quiz_info".equals(A0s)) {
                        obj.A0B = A28.parseFromJson(c16l);
                    } else if ("countdown_info".equals(A0s)) {
                        obj.A07 = AEG.parseFromJson(c16l);
                    } else if ("cards".equals(A0s)) {
                        if (c16l.A11() == C16R.A0C) {
                            arrayList = AbstractC166987dD.A1E();
                            while (c16l.A1J() != C16R.A08) {
                                A8Z parseFromJson3 = A29.parseFromJson(c16l);
                                if (parseFromJson3 != null) {
                                    arrayList.add(parseFromJson3);
                                }
                            }
                        }
                        obj.A0L = arrayList;
                    } else if ("gifs_info".equals(A0s)) {
                        obj.A02 = IOA.parseFromJson(c16l);
                    } else if ("otd_info".equals(A0s)) {
                        obj.A09 = AbstractC22751A1v.parseFromJson(c16l);
                    } else if (AbstractC111324zv.A00(1331).equals(A0s)) {
                        obj.A0C = AbstractC41345IRq.parseFromJson(c16l);
                    } else if ("mention_info".equals(A0s)) {
                        obj.A0A = AbstractC22753A1x.parseFromJson(c16l);
                    } else if ("product_item_with_ar".equals(A0s)) {
                        obj.A06 = IR9.parseFromJson(c16l);
                    } else if (AbstractC111324zv.A00(955).equals(A0s)) {
                        if (c16l.A11() == C16R.A0C) {
                            arrayList = AbstractC166987dD.A1E();
                            while (c16l.A1J() != C16R.A08) {
                                AbstractC167017dG.A1H(c16l, arrayList);
                            }
                        }
                        obj.A0H = arrayList;
                    } else if ("fundraiser_sticker_model".equals(A0s)) {
                        obj.A08 = AEH.parseFromJson(c16l);
                    }
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

    public static String A00(C88X c88x) {
        StringWriter stringWriter = new StringWriter();
        C17z A0S = AbstractC167007dF.A0S(stringWriter);
        C88Z c88z = c88x.A04;
        if (c88z != null) {
            A0S.A0S(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, c88z.A00);
        }
        String str = c88x.A0G;
        if (str != null) {
            A0S.A0S(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, str);
        }
        if (c88x.A05 != null) {
            A0S.A0r("thumbnail_url");
            AbstractC222616c.A01(A0S, c88x.A05);
        }
        if (c88x.A03 != null) {
            A0S.A0r("ar_effect");
            AbstractC120315cU.A00(A0S, c88x.A03);
        }
        if (c88x.A0I != null) {
            C16V.A03(A0S, AbstractC111324zv.A00(1172));
            for (C101394gx c101394gx : c88x.A0I) {
                if (c101394gx != null) {
                    AbstractC101354gs.A00(A0S, c101394gx, true);
                }
            }
            A0S.A0Z();
        }
        if (c88x.A0J != null) {
            C16V.A03(A0S, "question_stickers");
            for (URE ure : c88x.A0J) {
                if (ure != null) {
                    ADF.A00(A0S, ure, true);
                }
            }
            A0S.A0Z();
        }
        if (c88x.A0B != null) {
            A0S.A0r("quiz_info");
            C22881A7b c22881A7b = c88x.A0B;
            A0S.A0d();
            String str2 = c22881A7b.A00;
            if (str2 != null) {
                A0S.A0S("prompt", str2);
            }
            if (c22881A7b.A01 != null) {
                C16V.A03(A0S, "suggestions");
                Iterator it = c22881A7b.A01.iterator();
                while (it.hasNext()) {
                    AbstractC167017dG.A1F(A0S, it);
                }
                A0S.A0Z();
            }
            A0S.A0a();
        }
        if (c88x.A07 != null) {
            A0S.A0r("countdown_info");
            C214509eo c214509eo = c88x.A07;
            A0S.A0d();
            String str3 = c214509eo.A00;
            if (str3 != null) {
                A0S.A0S("max_id", str3);
            }
            A0S.A0T("more_available", c214509eo.A02);
            A0S.A0T("show_see_all", c214509eo.A03);
            if (c214509eo.A01 != null) {
                C16V.A03(A0S, "countdowns");
                for (URL url : c214509eo.A01) {
                    if (url != null) {
                        AbstractC69879Vx4.A00(A0S, url, true);
                    }
                }
                A0S.A0Z();
            }
            C55702hA.A00(A0S, c214509eo);
            A0S.A0a();
        }
        if (c88x.A0L != null) {
            C16V.A03(A0S, "cards");
            for (A8Z a8z : c88x.A0L) {
                if (a8z != null) {
                    A0S.A0d();
                    if (a8z.A00 != null) {
                        A0S.A0r("background_url");
                        AbstractC222616c.A01(A0S, a8z.A00);
                    }
                    String str4 = a8z.A01;
                    if (str4 != null) {
                        A0S.A0S("text", str4);
                    }
                    String str5 = a8z.A02;
                    if (str5 != null) {
                        A0S.A0S(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, str5);
                    }
                    A0S.A0a();
                }
            }
            A0S.A0Z();
        }
        if (c88x.A02 != null) {
            A0S.A0r("gifs_info");
            IOA.A00(A0S, c88x.A02);
        }
        if (c88x.A09 != null) {
            A0S.A0r("otd_info");
            A68 a68 = c88x.A09;
            A0S.A0d();
            if (a68.A00 != null) {
                C16V.A03(A0S, DialogModule.KEY_ITEMS);
                for (MemoryItem memoryItem : a68.A00) {
                    if (memoryItem != null) {
                        A0S.A0d();
                        EnumC222889sT enumC222889sT = memoryItem.A00;
                        if (enumC222889sT != null) {
                            A0S.A0S("item_type", enumC222889sT.A00);
                        }
                        if (memoryItem.A01 != null) {
                            A0S.A0r("item_payload");
                            AEK.A00(A0S, memoryItem.A01);
                        }
                        A0S.A0a();
                    }
                }
                A0S.A0Z();
            }
            A0S.A0a();
        }
        if (c88x.A0C != null) {
            A0S.A0r(AbstractC111324zv.A00(1331));
            AbstractC41345IRq.A00(A0S, c88x.A0C);
        }
        if (c88x.A0A != null) {
            A0S.A0r("mention_info");
            A69 a69 = c88x.A0A;
            A0S.A0d();
            if (a69.A00 != null) {
                C16V.A03(A0S, "media_dicts");
                for (C38321qM c38321qM : a69.A00) {
                    if (c38321qM != null) {
                        AtomicBoolean atomicBoolean = C38321qM.A0i;
                        C38801rC.A07(A0S, c38321qM);
                    }
                }
                A0S.A0Z();
            }
            A0S.A0a();
        }
        if (c88x.A06 != null) {
            A0S.A0r("product_item_with_ar");
            IR9.A00(A0S, c88x.A06);
        }
        if (c88x.A0H != null) {
            C16V.A03(A0S, AbstractC111324zv.A00(955));
            Iterator it2 = c88x.A0H.iterator();
            while (it2.hasNext()) {
                AbstractC167017dG.A1G(A0S, it2);
            }
            A0S.A0Z();
        }
        if (c88x.A08 != null) {
            A0S.A0r("fundraiser_sticker_model");
            AEH.A00(A0S, c88x.A08, true);
        }
        return AbstractC167017dG.A0l(A0S, stringWriter);
    }
}
