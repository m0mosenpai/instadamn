package X;

import android.os.Parcelable;
import com.instagram.api.schemas.SocialContextType;
import com.instagram.user.model.User;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.3vC, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC87453vC {
    public static C87493vH parseFromJson(C16L c16l) {
        String A1P;
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            Integer num = null;
            ArrayList arrayList = null;
            ArrayList arrayList2 = null;
            String str = null;
            User user = null;
            ArrayList arrayList3 = null;
            SocialContextType socialContextType = null;
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                c16l.A1J();
                if ("social_context_action_metadata".equals(A0q)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = new ArrayList();
                        while (c16l.A1J() != C16R.A08) {
                            C87473vF parseFromJson = AbstractC87463vE.parseFromJson(c16l);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    } else {
                        arrayList = null;
                    }
                } else if ("social_context_facepile_users".equals(A0q)) {
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
                } else if ("social_context_info_str".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str = null;
                    } else {
                        str = c16l.A1P();
                    }
                } else if ("social_context_source_user".equals(A0q)) {
                    Parcelable.Creator creator2 = User.CREATOR;
                    user = AbstractC38851rI.A00(c16l, false);
                } else if ("social_context_subitems".equals(A0q)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList3 = new ArrayList();
                        while (c16l.A1J() != C16R.A08) {
                            C87823vq parseFromJson2 = AbstractC87813vp.parseFromJson(c16l);
                            if (parseFromJson2 != null) {
                                arrayList3.add(parseFromJson2);
                            }
                        }
                    } else {
                        arrayList3 = null;
                    }
                } else if ("social_context_type".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        A1P = null;
                    } else {
                        A1P = c16l.A1P();
                    }
                    socialContextType = (SocialContextType) SocialContextType.A01.get(A1P);
                    if (socialContextType == null) {
                        socialContextType = SocialContextType.A0N;
                    }
                } else if ("social_context_users_count".equals(A0q)) {
                    num = Integer.valueOf(c16l.A1D());
                }
                c16l.A0z();
            }
            if (arrayList2 == null && (c16l instanceof C07950bF)) {
                ((C07950bF) c16l).A03.A00("social_context_facepile_users", "SocialContextInfo");
            } else if (socialContextType != null || !(c16l instanceof C07950bF)) {
                if (num == null && (c16l instanceof C07950bF)) {
                    ((C07950bF) c16l).A03.A00("social_context_users_count", "SocialContextInfo");
                } else {
                    return new C87493vH(socialContextType, user, str, arrayList, arrayList2, arrayList3, num.intValue());
                }
            } else {
                ((C07950bF) c16l).A03.A00("social_context_type", "SocialContextInfo");
            }
            throw C00O.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }

    public static void A00(AnonymousClass182 anonymousClass182, C87493vH c87493vH) {
        anonymousClass182.A0d();
        List<InterfaceC87483vG> list = c87493vH.A04;
        if (list != null) {
            C16V.A03(anonymousClass182, "social_context_action_metadata");
            for (InterfaceC87483vG interfaceC87483vG : list) {
                if (interfaceC87483vG != null) {
                    C87473vF Ezc = interfaceC87483vG.Ezc();
                    anonymousClass182.A0d();
                    String str = Ezc.A01;
                    if (str != null) {
                        anonymousClass182.A0S("action_data", str);
                    }
                    String str2 = Ezc.A02;
                    if (str2 != null) {
                        anonymousClass182.A0S("action_id", str2);
                    }
                    Boolean bool = Ezc.A00;
                    if (bool != null) {
                        anonymousClass182.A0T("is_high_value", bool.booleanValue());
                    }
                    anonymousClass182.A0a();
                }
            }
            anonymousClass182.A0Z();
        }
        List<User> list2 = c87493vH.A05;
        if (list2 != null) {
            C16V.A03(anonymousClass182, "social_context_facepile_users");
            for (User user : list2) {
                if (user != null) {
                    Parcelable.Creator creator = User.CREATOR;
                    AbstractC38851rI.A08(anonymousClass182, user);
                }
            }
            anonymousClass182.A0Z();
        }
        String str3 = c87493vH.A03;
        if (str3 != null) {
            anonymousClass182.A0S("social_context_info_str", str3);
        }
        User user2 = c87493vH.A02;
        if (user2 != null) {
            anonymousClass182.A0r("social_context_source_user");
            Parcelable.Creator creator2 = User.CREATOR;
            AbstractC38851rI.A08(anonymousClass182, user2);
        }
        List<InterfaceC87833vr> list3 = c87493vH.A06;
        if (list3 != null) {
            C16V.A03(anonymousClass182, "social_context_subitems");
            for (InterfaceC87833vr interfaceC87833vr : list3) {
                if (interfaceC87833vr != null) {
                    C87823vq Ezf = interfaceC87833vr.Ezf();
                    anonymousClass182.A0d();
                    anonymousClass182.A0Q("subitem_count", Ezf.A00);
                    String str4 = Ezf.A01;
                    if (str4 != null) {
                        anonymousClass182.A0S("subitem_str", str4);
                    }
                    anonymousClass182.A0a();
                }
            }
            anonymousClass182.A0Z();
        }
        SocialContextType socialContextType = c87493vH.A01;
        if (socialContextType != null) {
            anonymousClass182.A0S("social_context_type", socialContextType.A00);
        }
        anonymousClass182.A0Q("social_context_users_count", c87493vH.A00);
        anonymousClass182.A0a();
    }
}
