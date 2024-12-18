package X;

import android.os.Parcelable;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.common.api.base.CacheBehaviorLogger;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.user.model.User;
import java.io.IOException;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Ide, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C41708Ide {
    /* JADX WARN: Type inference failed for: r0v4, types: [X.HAs, X.1um] */
    public static C38896HAs parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            ?? c40791um = new C40791um();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                A01(c16l, c40791um, AbstractC166997dE.A0s(c16l));
                c16l.A0z();
            }
            return c40791um;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }

    public static void A01(C16L c16l, C38896HAs c38896HAs, String str) {
        if ("simple_action".equals(str)) {
            c38896HAs.A02 = IRW.parseFromJson(c16l);
            return;
        }
        ArrayList arrayList = null;
        if (AbstractC58317Pt9.A00(117).equals(str)) {
            c38896HAs.A03 = AbstractC167017dG.A0m(c16l);
            return;
        }
        if ("navbar_count_pages".equals(str)) {
            c38896HAs.A07 = c16l.A0d();
            return;
        }
        if ("navbar_count_pages_offset".equals(str)) {
            c38896HAs.A00 = c16l.A1D();
            return;
        }
        if ("has_skip".equals(str)) {
            c38896HAs.A08 = c16l.A0d();
            return;
        }
        if ("survey_id".equals(str)) {
            c38896HAs.A04 = AbstractC167017dG.A0m(c16l);
            return;
        }
        if ("pages".equals(str)) {
            if (c16l.A11() == C16R.A0C) {
                arrayList = AbstractC166987dD.A1E();
                while (c16l.A1J() != C16R.A08) {
                    C41021IEq parseFromJson = I2I.parseFromJson(c16l);
                    if (parseFromJson != null) {
                        arrayList.add(parseFromJson);
                    }
                }
            }
            c38896HAs.A06 = arrayList;
            return;
        }
        if ("ending_screen".equals(str)) {
            c38896HAs.A01 = AbstractC40657I0p.parseFromJson(c16l);
        } else if ("survey_type".equals(str)) {
            c38896HAs.A05 = AbstractC167017dG.A0m(c16l);
        } else {
            C55702hA.A01(c16l, c38896HAs, str);
        }
    }

    public static String A00(C38896HAs c38896HAs) {
        String str;
        String str2;
        StringWriter A0O = AbstractC37300Gc1.A0O();
        C17z A0S = AbstractC167007dF.A0S(A0O);
        if (c38896HAs.A02 != null) {
            A0S.A0r("simple_action");
            IRW.A00(A0S, c38896HAs.A02);
        }
        String str3 = c38896HAs.A03;
        if (str3 != null) {
            A0S.A0S(AbstractC58317Pt9.A00(117), str3);
        }
        A0S.A0T("navbar_count_pages", c38896HAs.A07);
        A0S.A0Q("navbar_count_pages_offset", c38896HAs.A00);
        A0S.A0T("has_skip", c38896HAs.A08);
        String str4 = c38896HAs.A04;
        if (str4 != null) {
            A0S.A0S("survey_id", str4);
        }
        if (c38896HAs.A06 != null) {
            C16V.A03(A0S, "pages");
            loop0: for (C41021IEq c41021IEq : c38896HAs.A06) {
                if (c41021IEq != null) {
                    A0S.A0d();
                    AbstractC37301Gc2.A1D(A0S, c41021IEq.A00);
                    if (c41021IEq.A01 != null) {
                        C16V.A03(A0S, "modules");
                        for (IKO iko : c41021IEq.A01) {
                            if (iko != null) {
                                A0S.A0d();
                                if (iko.A06 != null) {
                                    A0S.A0r("feed_item");
                                    IGZ igz = iko.A06;
                                    A0S.A0d();
                                    if (igz.A01 != null) {
                                        A0S.A0r("media_or_ad");
                                        C38321qM c38321qM = igz.A01;
                                        C38801rC c38801rC = C38321qM.A0h;
                                        C38801rC.A07(A0S, c38321qM);
                                    }
                                    if (igz.A02 != null) {
                                        A0S.A0r(AbstractC111324zv.A00(2391));
                                        IGY igy = igz.A02;
                                        A0S.A0d();
                                        if (igy.A00 != null) {
                                            A0S.A0r("media_or_ad");
                                            C38321qM c38321qM2 = igy.A00;
                                            C38801rC c38801rC2 = C38321qM.A0h;
                                            C38801rC.A07(A0S, c38321qM2);
                                        }
                                        if (igy.A01 != null) {
                                            A0S.A0r("follow_hashtag_info");
                                            AbstractC109614wn.A00(A0S, igy.A01);
                                        }
                                        Integer num = igy.A02;
                                        if (num != null) {
                                            A0S.A0Q("brs_severity", num.intValue());
                                        }
                                        A0S.A0a();
                                    }
                                    if (igz.A00 != null) {
                                        A0S.A0r("explore_story");
                                        C88523xA c88523xA = igz.A00;
                                        A0S.A0d();
                                        C39531sa c39531sa = c88523xA.A03;
                                        if (c39531sa != null) {
                                            A0S.A0r("ad");
                                            AbstractC39241s1.A00(A0S, c39531sa);
                                        }
                                        Boolean bool = c88523xA.A04;
                                        if (bool != null) {
                                            A0S.A0T("allow_feedback", bool.booleanValue());
                                        }
                                        Integer num2 = c88523xA.A07;
                                        if (num2 != null) {
                                            A0S.A0Q("brs_severity", num2.intValue());
                                        }
                                        List list = c88523xA.A0F;
                                        if (list != null) {
                                            Iterator A0q = AbstractC37301Gc2.A0q(A0S, "feed_recs_hide_reasons", list);
                                            while (A0q.hasNext()) {
                                                InterfaceC43467JIf interfaceC43467JIf = (InterfaceC43467JIf) A0q.next();
                                                if (interfaceC43467JIf != null) {
                                                    H3M h3m = (H3M) interfaceC43467JIf;
                                                    A0S.A0d();
                                                    AbstractC37301Gc2.A1D(A0S, h3m.A00);
                                                    AbstractC37301Gc2.A1E(A0S, h3m.A01);
                                                    A0S.A0a();
                                                }
                                            }
                                            A0S.A0Z();
                                        }
                                        String str5 = c88523xA.A0A;
                                        if (str5 != null) {
                                            A0S.A0S("feed_survey_integration_id", str5);
                                        }
                                        Integer num3 = c88523xA.A08;
                                        if (num3 != null) {
                                            A0S.A0Q("global_position", num3.intValue());
                                        }
                                        AbstractC37301Gc2.A1D(A0S, c88523xA.A0B);
                                        String str6 = c88523xA.A0C;
                                        if (str6 != null) {
                                            A0S.A0S("inventory_source", str6);
                                        }
                                        Boolean bool2 = c88523xA.A05;
                                        if (bool2 != null) {
                                            A0S.A0T("is_eof", bool2.booleanValue());
                                        }
                                        Boolean bool3 = c88523xA.A06;
                                        if (bool3 != null) {
                                            A0S.A0T("is_seen", bool3.booleanValue());
                                        }
                                        InterfaceC39571se interfaceC39571se = c88523xA.A00;
                                        if (interfaceC39571se != null) {
                                            A0S.A0r("item_client_gap_rules");
                                            AbstractC39551sc.A00(A0S, interfaceC39571se.Eyq());
                                        }
                                        C38321qM c38321qM3 = c88523xA.A01;
                                        if (c38321qM3 != null) {
                                            A0S.A0r("media");
                                            C38801rC c38801rC3 = C38321qM.A0h;
                                            C38801rC.A07(A0S, c38321qM3);
                                        }
                                        C38321qM c38321qM4 = c88523xA.A02;
                                        if (c38321qM4 != null) {
                                            A0S.A0r("media_or_ad");
                                            C38801rC c38801rC4 = C38321qM.A0h;
                                            C38801rC.A07(A0S, c38321qM4);
                                        }
                                        String str7 = c88523xA.A0D;
                                        if (str7 != null) {
                                            A0S.A0S("mezql_token", str7);
                                        }
                                        String str8 = c88523xA.A0E;
                                        if (str8 != null) {
                                            A0S.A0S(CacheBehaviorLogger.SOURCE, str8);
                                        }
                                        Integer num4 = c88523xA.A09;
                                        if (num4 != null) {
                                            A0S.A0Q("view_state_item_type", num4.intValue());
                                        }
                                        A0S.A0a();
                                    }
                                    A0S.A0a();
                                }
                                if (iko.A01 != null) {
                                    A0S.A0r("question_list");
                                    IPM.A00(A0S, iko.A01);
                                }
                                if (iko.A07 != null) {
                                    A0S.A0r("reel");
                                    AbstractC38741r6.A00(A0S, iko.A07);
                                }
                                if (iko.A00 != null) {
                                    A0S.A0r("clips_item");
                                    AbstractC111024zE.A00(A0S, iko.A00);
                                }
                                if (iko.A04 != null) {
                                    A0S.A0r("business_card");
                                    C41221IMm c41221IMm = iko.A04;
                                    A0S.A0d();
                                    String str9 = c41221IMm.A01;
                                    if (str9 != null) {
                                        A0S.A0S("pk", str9);
                                        c41221IMm.A00();
                                        A0S.A0r(PublicKeyCredentialControllerUtility.JSON_KEY_USER);
                                        User A00 = c41221IMm.A00();
                                        Parcelable.Creator creator = User.CREATOR;
                                        AbstractC38851rI.A08(A0S, A00);
                                        if (c41221IMm.A02 != null) {
                                            C16V.A03(A0S, "image_urls");
                                            List<ImageUrl> list2 = c41221IMm.A02;
                                            if (list2 != null) {
                                                for (ImageUrl imageUrl : list2) {
                                                    if (imageUrl != null) {
                                                        AbstractC222616c.A01(A0S, imageUrl);
                                                    }
                                                }
                                                A0S.A0Z();
                                                A0S.A0a();
                                            }
                                        }
                                        str2 = "imageUrlList";
                                        break loop0;
                                    }
                                    str2 = "businessCardId";
                                    break loop0;
                                }
                                A0S.A0a();
                            }
                        }
                        A0S.A0Z();
                    }
                    A0S.A0a();
                }
            }
            A0S.A0Z();
        }
        if (c38896HAs.A01 != null) {
            A0S.A0r("ending_screen");
            C41008IEd c41008IEd = c38896HAs.A01;
            A0S.A0d();
            switch (c41008IEd.A01.intValue()) {
                case 0:
                    str = "simple_action";
                    break;
                case 1:
                    str = "thank_you";
                    break;
                default:
                    str = "unknown";
                    break;
            }
            A0S.A0S(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, str);
            if (c41008IEd.A00 != null) {
                A0S.A0r("simple_action");
                C38611qr c38611qr = c41008IEd.A00;
                if (c38611qr != null) {
                    IRW.A00(A0S, c38611qr);
                    A0S.A0a();
                }
            }
            str2 = "simpleActionDict";
            C14360o3.A0F(str2);
            throw C00O.createAndThrow();
        }
        String str10 = c38896HAs.A05;
        if (str10 != null) {
            A0S.A0S("survey_type", str10);
        }
        C55702hA.A00(A0S, c38896HAs);
        return AbstractC167017dG.A0l(A0S, A0O);
    }
}
