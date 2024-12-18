package X;

import android.os.Parcelable;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.react.modules.intent.IntentModule;
import com.instagram.user.model.User;
import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.47C, reason: invalid class name */
/* loaded from: classes2.dex */
public abstract class C47C {
    public static C47G parseFromJson(C16L c16l) {
        String A1P;
        String A1P2;
        String A1P3;
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            String str = null;
            String str2 = null;
            String str3 = null;
            C47E c47e = null;
            Boolean bool = null;
            Boolean bool2 = null;
            String str4 = null;
            Boolean bool3 = null;
            ArrayList arrayList = null;
            Integer num = null;
            ArrayList arrayList2 = null;
            ArrayList arrayList3 = null;
            C115875Md c115875Md = null;
            Float f = null;
            String str5 = null;
            ArrayList arrayList4 = null;
            ArrayList arrayList5 = null;
            User user = null;
            String str6 = null;
            Float f2 = null;
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                c16l.A1J();
                if ("algorithm".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str = null;
                    } else {
                        str = c16l.A1P();
                    }
                } else if ("background_image_url".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str2 = null;
                    } else {
                        str2 = c16l.A1P();
                    }
                } else if ("caption".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str3 = null;
                    } else {
                        str3 = c16l.A1P();
                    }
                } else if ("custom_profile_pic_url".equals(A0q)) {
                    c47e = C47D.parseFromJson(c16l);
                } else if ("followed_by".equals(A0q)) {
                    bool = Boolean.valueOf(c16l.A0d());
                } else if ("has_stories".equals(A0q)) {
                    bool2 = Boolean.valueOf(c16l.A0d());
                } else if (PublicKeyCredentialControllerUtility.JSON_KEY_ICON.equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str4 = null;
                    } else {
                        str4 = c16l.A1P();
                    }
                } else if ("is_new_suggestion".equals(A0q)) {
                    bool3 = Boolean.valueOf(c16l.A0d());
                } else if ("large_urls".equals(A0q)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = new ArrayList();
                        while (c16l.A1J() != C16R.A08) {
                            if (c16l.A11() != C16R.A0G && (A1P3 = c16l.A1P()) != null) {
                                arrayList.add(A1P3);
                            }
                        }
                    } else {
                        arrayList = null;
                    }
                } else if ("media_count".equals(A0q)) {
                    num = Integer.valueOf(c16l.A1D());
                } else if ("media_ids".equals(A0q)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList2 = new ArrayList();
                        while (c16l.A1J() != C16R.A08) {
                            if (c16l.A11() != C16R.A0G && (A1P2 = c16l.A1P()) != null) {
                                arrayList2.add(A1P2);
                            }
                        }
                    } else {
                        arrayList2 = null;
                    }
                } else if ("media_infos".equals(A0q)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList3 = new ArrayList();
                        while (c16l.A1J() != C16R.A08) {
                            C38321qM A0C = C38321qM.A0h.A0C(c16l, true, false);
                            if (A0C != null) {
                                arrayList3.add(A0C);
                            }
                        }
                    } else {
                        arrayList3 = null;
                    }
                } else if ("preview_media".equals(A0q)) {
                    c115875Md = AbstractC34738FSd.parseFromJson(c16l);
                } else if ("score".equals(A0q)) {
                    f = new Float(c16l.A0U());
                } else if ("social_context".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str5 = null;
                    } else {
                        str5 = c16l.A1P();
                    }
                } else if ("social_context_facepile_users".equals(A0q)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList4 = new ArrayList();
                        while (c16l.A1J() != C16R.A08) {
                            Parcelable.Creator creator = User.CREATOR;
                            User A00 = AbstractC38851rI.A00(c16l, false);
                            if (A00 != null) {
                                arrayList4.add(A00);
                            }
                        }
                    } else {
                        arrayList4 = null;
                    }
                } else if ("thumbnail_urls".equals(A0q)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList5 = new ArrayList();
                        while (c16l.A1J() != C16R.A08) {
                            if (c16l.A11() != C16R.A0G && (A1P = c16l.A1P()) != null) {
                                arrayList5.add(A1P);
                            }
                        }
                    } else {
                        arrayList5 = null;
                    }
                } else if (PublicKeyCredentialControllerUtility.JSON_KEY_USER.equals(A0q)) {
                    Parcelable.Creator creator2 = User.CREATOR;
                    user = AbstractC38851rI.A00(c16l, false);
                } else if ("uuid".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str6 = null;
                    } else {
                        str6 = c16l.A1P();
                    }
                } else if (IntentModule.EXTRA_MAP_KEY_FOR_VALUE.equals(A0q)) {
                    f2 = new Float(c16l.A0U());
                }
                c16l.A0z();
            }
            if (str == null && (c16l instanceof C07950bF)) {
                ((C07950bF) c16l).A03.A00("algorithm", "SuggestedUserDict");
            } else if (str5 != null || !(c16l instanceof C07950bF)) {
                if (user == null && (c16l instanceof C07950bF)) {
                    ((C07950bF) c16l).A03.A00(PublicKeyCredentialControllerUtility.JSON_KEY_USER, "SuggestedUserDict");
                } else {
                    return new C47G(c115875Md, c47e, user, bool, bool2, bool3, f, f2, num, str, str2, str3, str4, str5, str6, arrayList, arrayList2, arrayList3, arrayList4, arrayList5);
                }
            } else {
                ((C07950bF) c16l).A03.A00("social_context", "SuggestedUserDict");
            }
            throw C00O.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
