package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;

/* renamed from: X.4hS, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC101574hS {
    public static C101584hT parseFromJson(C16L c16l) {
        String A1P;
        C14360o3.A0B(c16l, 0);
        try {
            C101584hT c101584hT = new C101584hT();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                c16l.A1J();
                if ("archived_media_timestamp".equals(A0q)) {
                    c101584hT.A06 = Long.valueOf(c16l.A0y());
                } else if ("expiring_media_action_summary".equals(A0q)) {
                    c101584hT.A03 = AbstractC101654ha.parseFromJson(c16l);
                } else {
                    String str = null;
                    HashSet hashSet = null;
                    String str2 = null;
                    ArrayList arrayList = null;
                    if ("seen_user_ids".equals(A0q)) {
                        if (c16l.A11() == C16R.A0C) {
                            hashSet = new HashSet();
                            while (c16l.A1J() != C16R.A08) {
                                if (c16l.A11() != C16R.A0G && (A1P = c16l.A1P()) != null) {
                                    hashSet.add(A1P);
                                }
                            }
                        }
                        c101584hT.A0C = hashSet;
                    } else if ("media".equals(A0q)) {
                        c101584hT.A05 = C38321qM.A0h.A0C(c16l, true, false);
                    } else if ("playback_duration_secs".equals(A0q)) {
                        c101584hT.A08 = Long.valueOf(c16l.A0y());
                    } else if ("reply_type".equals(A0q)) {
                        if (c16l.A11() != C16R.A0G) {
                            str2 = c16l.A1P();
                        }
                        c101584hT.A0A = str2;
                    } else if ("seen_count".equals(A0q)) {
                        c101584hT.A00 = c16l.A1D();
                    } else if ("tap_models".equals(A0q)) {
                        if (c16l.A11() == C16R.A0C) {
                            arrayList = new ArrayList();
                            while (c16l.A1J() != C16R.A08) {
                                C84823qW parseFromJson = AbstractC1123155i.parseFromJson(c16l);
                                if (parseFromJson != null) {
                                    arrayList.add(parseFromJson);
                                }
                            }
                        }
                        c101584hT.A0B = arrayList;
                    } else if ("url_expire_at_secs".equals(A0q)) {
                        c101584hT.A07 = Long.valueOf(c16l.A0y());
                    } else if ("view_mode".equals(A0q)) {
                        if (c16l.A11() != C16R.A0G) {
                            str = c16l.A1P();
                        }
                        c101584hT.A09 = str;
                    } else if ("story_app_attribution".equals(A0q)) {
                        c101584hT.A01 = AbstractC46849Kni.parseFromJson(c16l);
                    } else if ("seen_info".equals(A0q)) {
                        c101584hT.A02 = AbstractC46848Knh.parseFromJson(c16l);
                    }
                }
                c16l.A0z();
            }
            return c101584hT;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }

    public static void A00(AnonymousClass182 anonymousClass182, C101584hT c101584hT) {
        anonymousClass182.A0d();
        Long l = c101584hT.A06;
        if (l != null) {
            anonymousClass182.A0R("archived_media_timestamp", l.longValue());
        }
        if (c101584hT.A03 != null) {
            anonymousClass182.A0r("expiring_media_action_summary");
            AbstractC101654ha.A00(anonymousClass182, c101584hT.A03);
        }
        if (c101584hT.A0C != null) {
            C16V.A03(anonymousClass182, "seen_user_ids");
            for (String str : c101584hT.A0C) {
                if (str != null) {
                    anonymousClass182.A0u(str);
                }
            }
            anonymousClass182.A0Z();
        }
        if (c101584hT.A05 != null) {
            anonymousClass182.A0r("media");
            C38321qM c38321qM = c101584hT.A05;
            C38801rC c38801rC = C38321qM.A0h;
            C38801rC.A07(anonymousClass182, c38321qM);
        }
        Long l2 = c101584hT.A08;
        if (l2 != null) {
            anonymousClass182.A0R("playback_duration_secs", l2.longValue());
        }
        String str2 = c101584hT.A0A;
        if (str2 != null) {
            anonymousClass182.A0S("reply_type", str2);
        }
        anonymousClass182.A0Q("seen_count", c101584hT.A00);
        if (c101584hT.A0B != null) {
            C16V.A03(anonymousClass182, "tap_models");
            for (C84823qW c84823qW : c101584hT.A0B) {
                if (c84823qW != null) {
                    AbstractC1123155i.A00(anonymousClass182, c84823qW);
                }
            }
            anonymousClass182.A0Z();
        }
        Long l3 = c101584hT.A07;
        if (l3 != null) {
            anonymousClass182.A0R("url_expire_at_secs", l3.longValue());
        }
        String str3 = c101584hT.A09;
        if (str3 != null) {
            anonymousClass182.A0S("view_mode", str3);
        }
        if (c101584hT.A01 != null) {
            anonymousClass182.A0r("story_app_attribution");
            L4E l4e = c101584hT.A01;
            anonymousClass182.A0d();
            String str4 = l4e.A03;
            if (str4 != null) {
                anonymousClass182.A0S(PublicKeyCredentialControllerUtility.JSON_KEY_ID, str4);
            }
            String str5 = l4e.A04;
            if (str5 != null) {
                anonymousClass182.A0S(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, str5);
            }
            String str6 = l4e.A05;
            if (str6 != null) {
                anonymousClass182.A0S("link", str6);
            }
            String str7 = l4e.A02;
            if (str7 != null) {
                anonymousClass182.A0S("content_url", str7);
            }
            String str8 = l4e.A01;
            if (str8 != null) {
                anonymousClass182.A0S(AbstractC43591JPw.A00(66), str8);
            }
            if (l4e.A00 != null) {
                anonymousClass182.A0r(AbstractC43591JPw.A00(67));
                AbstractC222616c.A01(anonymousClass182, l4e.A00);
            }
            anonymousClass182.A0a();
        }
        if (c101584hT.A02 != null) {
            anonymousClass182.A0r("seen_info");
            C47573Kzj c47573Kzj = c101584hT.A02;
            anonymousClass182.A0d();
            String str9 = c47573Kzj.A01;
            if (str9 != null) {
                anonymousClass182.A0S("object_id", str9);
            }
            String str10 = c47573Kzj.A00;
            if (str10 != null) {
                anonymousClass182.A0S("mime_type", str10);
            }
            anonymousClass182.A0a();
        }
        anonymousClass182.A0a();
    }
}
