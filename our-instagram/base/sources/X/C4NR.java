package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.react.modules.dialog.DialogModule;
import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.4NR, reason: invalid class name */
/* loaded from: classes2.dex */
public abstract class C4NR {
    public static C4NM parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            C4NM c4nm = new C4NM();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                c16l.A1J();
                if (DialogModule.KEY_TITLE.equals(A0q)) {
                    C4NN parseFromJson = C4NS.parseFromJson(c16l);
                    C14360o3.A0B(parseFromJson, 0);
                    c4nm.A09 = parseFromJson;
                } else if ("content".equals(A0q)) {
                    c4nm.A03 = AbstractC117085Rr.parseFromJson(c16l);
                } else if ("footer".equals(A0q)) {
                    c4nm.A05 = AbstractC117105Rt.parseFromJson(c16l);
                } else if ("primary_action".equals(A0q)) {
                    c4nm.A01 = C4NU.parseFromJson(c16l);
                } else if ("secondary_action".equals(A0q)) {
                    c4nm.A02 = C4NU.parseFromJson(c16l);
                } else if ("image".equals(A0q)) {
                    c4nm.A07 = C5Rx.parseFromJson(c16l);
                } else if ("dark_mode_image".equals(A0q)) {
                    c4nm.A06 = C5Rx.parseFromJson(c16l);
                } else if ("dismiss_action".equals(A0q)) {
                    c4nm.A00 = C4NU.parseFromJson(c16l);
                } else {
                    ArrayList arrayList = null;
                    if ("bullet_list".equals(A0q)) {
                        if (c16l.A11() == C16R.A0C) {
                            arrayList = new ArrayList();
                            while (c16l.A1J() != C16R.A08) {
                                C69144ViZ parseFromJson2 = AbstractC68571VVy.parseFromJson(c16l);
                                if (parseFromJson2 != null) {
                                    arrayList.add(parseFromJson2);
                                }
                            }
                        }
                        c4nm.A0A = arrayList;
                    } else if ("social_context".equals(A0q)) {
                        c4nm.A08 = AbstractC117125Rv.parseFromJson(c16l);
                    } else if ("social_context_images".equals(A0q)) {
                        if (c16l.A11() == C16R.A0C) {
                            arrayList = new ArrayList();
                            while (c16l.A1J() != C16R.A08) {
                                C5Ry parseFromJson3 = C5Rx.parseFromJson(c16l);
                                if (parseFromJson3 != null) {
                                    arrayList.add(parseFromJson3);
                                }
                            }
                        }
                        c4nm.A0C = arrayList;
                    } else if ("bloks_payload".equals(A0q)) {
                        c4nm.A04 = AbstractC37925GmM.parseFromJson(c16l);
                    } else if ("story_bucket_generated_cards".equals(A0q)) {
                        if (c16l.A11() == C16R.A0C) {
                            arrayList = new ArrayList();
                            while (c16l.A1J() != C16R.A08) {
                                IF1 parseFromJson4 = I54.parseFromJson(c16l);
                                if (parseFromJson4 != null) {
                                    arrayList.add(parseFromJson4);
                                }
                            }
                        }
                        c4nm.A0B = arrayList;
                    } else {
                        C55702hA.A01(c16l, c4nm, A0q);
                    }
                }
                c16l.A0z();
            }
            c4nm.A01();
            return c4nm;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }

    public static void A00(AnonymousClass182 anonymousClass182, C4NM c4nm) {
        anonymousClass182.A0d();
        anonymousClass182.A0r(DialogModule.KEY_TITLE);
        C4NN c4nn = c4nm.A09;
        anonymousClass182.A0d();
        String str = c4nn.A00;
        if (str != null) {
            anonymousClass182.A0S("text", str);
        }
        anonymousClass182.A0a();
        if (c4nm.A03 != null) {
            anonymousClass182.A0r("content");
            C117095Rs c117095Rs = c4nm.A03;
            anonymousClass182.A0d();
            String str2 = c117095Rs.A00;
            if (str2 != null) {
                anonymousClass182.A0S("text", str2);
            }
            anonymousClass182.A0a();
        }
        if (c4nm.A05 != null) {
            anonymousClass182.A0r("footer");
            C117115Ru c117115Ru = c4nm.A05;
            anonymousClass182.A0d();
            String str3 = c117115Ru.A00;
            if (str3 != null) {
                anonymousClass182.A0S("text", str3);
            }
            anonymousClass182.A0a();
        }
        if (c4nm.A01 != null) {
            anonymousClass182.A0r("primary_action");
            C4NU.A00(anonymousClass182, c4nm.A01);
        }
        if (c4nm.A02 != null) {
            anonymousClass182.A0r("secondary_action");
            C4NU.A00(anonymousClass182, c4nm.A02);
        }
        if (c4nm.A07 != null) {
            anonymousClass182.A0r("image");
            C5Rx.A00(anonymousClass182, c4nm.A07);
        }
        if (c4nm.A06 != null) {
            anonymousClass182.A0r("dark_mode_image");
            C5Rx.A00(anonymousClass182, c4nm.A06);
        }
        if (c4nm.A00 != null) {
            anonymousClass182.A0r("dismiss_action");
            C4NU.A00(anonymousClass182, c4nm.A00);
        }
        if (c4nm.A0A != null) {
            C16V.A03(anonymousClass182, "bullet_list");
            for (C69144ViZ c69144ViZ : c4nm.A0A) {
                if (c69144ViZ != null) {
                    anonymousClass182.A0d();
                    String str4 = c69144ViZ.A02;
                    if (str4 != null) {
                        anonymousClass182.A0S(DialogModule.KEY_TITLE, str4);
                    }
                    String str5 = c69144ViZ.A01;
                    if (str5 != null) {
                        anonymousClass182.A0S("subtitle", str5);
                    }
                    if (c69144ViZ.A00 != null) {
                        anonymousClass182.A0r(PublicKeyCredentialControllerUtility.JSON_KEY_ICON);
                        C5Rx.A00(anonymousClass182, c69144ViZ.A00);
                    }
                    anonymousClass182.A0a();
                }
            }
            anonymousClass182.A0Z();
        }
        if (c4nm.A08 != null) {
            anonymousClass182.A0r("social_context");
            C117135Rw c117135Rw = c4nm.A08;
            anonymousClass182.A0d();
            String str6 = c117135Rw.A00;
            if (str6 != null) {
                anonymousClass182.A0S("text", str6);
            }
            anonymousClass182.A0a();
        }
        if (c4nm.A0C != null) {
            C16V.A03(anonymousClass182, "social_context_images");
            for (C5Ry c5Ry : c4nm.A0C) {
                if (c5Ry != null) {
                    C5Rx.A00(anonymousClass182, c5Ry);
                }
            }
            anonymousClass182.A0Z();
        }
        if (c4nm.A04 != null) {
            anonymousClass182.A0r("bloks_payload");
            IF0 if0 = c4nm.A04;
            anonymousClass182.A0d();
            if (if0.A01 != null) {
                anonymousClass182.A0r("layout");
                C58590PyH.A01.A01(anonymousClass182, if0.A01.A00);
            }
            if (if0.A00 != null) {
                anonymousClass182.A0r("bloks_data");
                C45127Jxw c45127Jxw = if0.A00;
                anonymousClass182.A0d();
                C58590PyH c58590PyH = (C58590PyH) c45127Jxw.A00;
                if (c58590PyH != null) {
                    anonymousClass182.A0r("layout");
                    C58590PyH.A01.A01(anonymousClass182, c58590PyH.A00);
                }
                String str7 = c45127Jxw.A01;
                if (str7 != null) {
                    anonymousClass182.A0S("payload", str7);
                }
                anonymousClass182.A0a();
            }
            anonymousClass182.A0a();
        }
        if (c4nm.A0B != null) {
            C16V.A03(anonymousClass182, "story_bucket_generated_cards");
            for (IF1 if1 : c4nm.A0B) {
                if (if1 != null) {
                    anonymousClass182.A0d();
                    if (if1.A00 != null) {
                        anonymousClass182.A0r(AbstractC111324zv.A00(2497));
                        ICZ icz = if1.A00;
                        anonymousClass182.A0d();
                        String str8 = icz.A00;
                        if (str8 != null) {
                            anonymousClass182.A0S(PublicKeyCredentialControllerUtility.JSON_KEY_ID, str8);
                        }
                        anonymousClass182.A0a();
                    }
                    if (if1.A01 != null) {
                        anonymousClass182.A0r("ig_media");
                        C40953ICa c40953ICa = if1.A01;
                        anonymousClass182.A0d();
                        String str9 = c40953ICa.A00;
                        if (str9 != null) {
                            anonymousClass182.A0S(MSV.A00(33), str9);
                        }
                        anonymousClass182.A0a();
                    }
                    anonymousClass182.A0a();
                }
            }
            anonymousClass182.A0Z();
        }
        C55702hA.A00(anonymousClass182, c4nm);
        anonymousClass182.A0a();
    }
}
