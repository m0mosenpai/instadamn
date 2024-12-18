package X;

import android.os.Parcelable;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.api.schemas.CreateModeType;
import com.instagram.user.model.User;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.5dh, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC120905dh {
    public static C120915dj parseFromJson(C16L c16l) {
        String A1P;
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            ArrayList arrayList = null;
            ArrayList arrayList2 = null;
            H3P h3p = null;
            H3S h3s = null;
            String str = null;
            ArrayList arrayList3 = null;
            C38828H7z c38828H7z = null;
            String str2 = null;
            CreateModeType createModeType = null;
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                c16l.A1J();
                if ("cards".equals(A0q)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = new ArrayList();
                        while (c16l.A1J() != C16R.A08) {
                            H2X parseFromJson = AbstractC39798Hl8.parseFromJson(c16l);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    } else {
                        arrayList = null;
                    }
                } else if ("fundraiser_sticker_suggestions".equals(A0q)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList2 = new ArrayList();
                        while (c16l.A1J() != C16R.A08) {
                            Parcelable.Creator creator = User.CREATOR;
                            User A00 = AbstractC38851rI.A00(c16l, false);
                            if (A00 != null) {
                                arrayList2.add(A00);
                            }
                        }
                    } else {
                        arrayList2 = null;
                    }
                } else if ("gifs_info".equals(A0q)) {
                    h3p = IOA.parseFromJson(c16l);
                } else if ("group_poll_info".equals(A0q)) {
                    h3s = AbstractC39948Hnd.parseFromJson(c16l);
                } else if (PublicKeyCredentialControllerUtility.JSON_KEY_NAME.equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str = null;
                    } else {
                        str = c16l.A1P();
                    }
                } else if ("poll_stickers".equals(A0q)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList3 = new ArrayList();
                        while (c16l.A1J() != C16R.A08) {
                            H4X parseFromJson2 = AbstractC40150HrJ.parseFromJson(c16l);
                            if (parseFromJson2 != null) {
                                arrayList3.add(parseFromJson2);
                            }
                        }
                    } else {
                        arrayList3 = null;
                    }
                } else if ("templates_info".equals(A0q)) {
                    c38828H7z = AbstractC41345IRq.parseFromJson(c16l);
                } else if ("thumbnail_url".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str2 = null;
                    } else {
                        str2 = c16l.A1P();
                    }
                } else if (PublicKeyCredentialControllerUtility.JSON_KEY_TYPE.equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        A1P = null;
                    } else {
                        A1P = c16l.A1P();
                    }
                    createModeType = (CreateModeType) CreateModeType.A01.get(A1P);
                    if (createModeType == null) {
                        createModeType = CreateModeType.A0X;
                    }
                }
                c16l.A0z();
            }
            return new C120915dj(createModeType, h3p, h3s, c38828H7z, str, str2, arrayList, arrayList2, arrayList3);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }

    public static void A00(AnonymousClass182 anonymousClass182, C120915dj c120915dj) {
        anonymousClass182.A0d();
        List<InterfaceC43527JKn> list = c120915dj.A06;
        if (list != null) {
            C16V.A03(anonymousClass182, "cards");
            for (InterfaceC43527JKn interfaceC43527JKn : list) {
                if (interfaceC43527JKn != null) {
                    H2X Erd = interfaceC43527JKn.Erd();
                    anonymousClass182.A0d();
                    String str = Erd.A00;
                    if (str != null) {
                        anonymousClass182.A0S("background_url", str);
                    }
                    String str2 = Erd.A01;
                    if (str2 != null) {
                        anonymousClass182.A0S("text", str2);
                    }
                    String str3 = Erd.A02;
                    if (str3 != null) {
                        anonymousClass182.A0S(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, str3);
                    }
                    anonymousClass182.A0a();
                }
            }
            anonymousClass182.A0Z();
        }
        List<User> list2 = c120915dj.A07;
        if (list2 != null) {
            C16V.A03(anonymousClass182, "fundraiser_sticker_suggestions");
            for (User user : list2) {
                if (user != null) {
                    Parcelable.Creator creator = User.CREATOR;
                    AbstractC38851rI.A08(anonymousClass182, user);
                }
            }
            anonymousClass182.A0Z();
        }
        H3P h3p = c120915dj.A01;
        if (h3p != null) {
            anonymousClass182.A0r("gifs_info");
            IOA.A00(anonymousClass182, h3p);
        }
        JJO jjo = c120915dj.A02;
        if (jjo != null) {
            anonymousClass182.A0r("group_poll_info");
            H3S Etz = jjo.Etz();
            anonymousClass182.A0d();
            List<String> list3 = Etz.A00;
            if (list3 != null) {
                C16V.A03(anonymousClass182, "group_poll_prompt_suggestions");
                for (String str4 : list3) {
                    if (str4 != null) {
                        anonymousClass182.A0u(str4);
                    }
                }
                anonymousClass182.A0Z();
            }
            anonymousClass182.A0a();
        }
        String str5 = c120915dj.A04;
        if (str5 != null) {
            anonymousClass182.A0S(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, str5);
        }
        List<H4X> list4 = c120915dj.A08;
        if (list4 != null) {
            C16V.A03(anonymousClass182, "poll_stickers");
            for (H4X h4x : list4) {
                if (h4x != null) {
                    anonymousClass182.A0d();
                    String str6 = h4x.A00;
                    if (str6 != null) {
                        anonymousClass182.A0S(PublicKeyCredentialControllerUtility.JSON_KEY_ID, str6);
                    }
                    List<JL2> list5 = h4x.A02;
                    if (list5 != null) {
                        C16V.A03(anonymousClass182, "tallies");
                        for (JL2 jl2 : list5) {
                            if (jl2 != null) {
                                H4Y Ey3 = jl2.Ey3();
                                anonymousClass182.A0d();
                                anonymousClass182.A0Q("count", Ey3.A01);
                                anonymousClass182.A0P("font_size", Ey3.A00);
                                String str7 = Ey3.A02;
                                if (str7 != null) {
                                    anonymousClass182.A0S("text", str7);
                                }
                                anonymousClass182.A0a();
                            }
                        }
                        anonymousClass182.A0Z();
                    }
                    String str8 = h4x.A01;
                    if (str8 != null) {
                        anonymousClass182.A0S("text", str8);
                    }
                    anonymousClass182.A0a();
                }
            }
            anonymousClass182.A0Z();
        }
        C38828H7z c38828H7z = c120915dj.A03;
        if (c38828H7z != null) {
            anonymousClass182.A0r("templates_info");
            AbstractC41345IRq.A00(anonymousClass182, c38828H7z);
        }
        String str9 = c120915dj.A05;
        if (str9 != null) {
            anonymousClass182.A0S("thumbnail_url", str9);
        }
        CreateModeType createModeType = c120915dj.A00;
        if (createModeType != null) {
            anonymousClass182.A0S(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, createModeType.A00);
        }
        anonymousClass182.A0a();
    }
}
