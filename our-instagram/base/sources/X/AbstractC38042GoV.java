package X;

import android.os.Parcelable;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.react.modules.intent.IntentModule;
import com.instagram.user.model.User;
import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.GoV, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC38042GoV {
    public static C47M parseFromJson(C16L c16l) {
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
            String str5 = null;
            Boolean bool3 = null;
            ArrayList arrayList = null;
            Integer num = null;
            ArrayList arrayList2 = null;
            ArrayList arrayList3 = null;
            C115875Md c115875Md = null;
            String str6 = null;
            Float f = null;
            String str7 = null;
            ArrayList arrayList4 = null;
            ArrayList arrayList5 = null;
            C54M c54m = null;
            User user = null;
            C115895Mf c115895Mf = null;
            String str8 = null;
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
                } else if ("interest_topic".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str5 = null;
                    } else {
                        str5 = c16l.A1P();
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
                            C38321qM A00 = C38321qM.A00(c16l);
                            if (A00 != null) {
                                arrayList3.add(A00);
                            }
                        }
                    } else {
                        arrayList3 = null;
                    }
                } else if ("preview_media".equals(A0q)) {
                    c115875Md = AbstractC34738FSd.parseFromJson(c16l);
                } else if ("reel_media_id".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str6 = null;
                    } else {
                        str6 = c16l.A1P();
                    }
                } else if ("score".equals(A0q)) {
                    f = new Float(c16l.A0U());
                } else if ("social_context".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str7 = null;
                    } else {
                        str7 = c16l.A1P();
                    }
                } else if ("social_context_facepile_users".equals(A0q)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList4 = new ArrayList();
                        while (c16l.A1J() != C16R.A08) {
                            Parcelable.Creator creator = User.CREATOR;
                            User A002 = AbstractC38851rI.A00(c16l, false);
                            if (A002 != null) {
                                arrayList4.add(A002);
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
                } else if ("upsell_invite_card".equals(A0q)) {
                    c54m = C54L.parseFromJson(c16l);
                } else if (PublicKeyCredentialControllerUtility.JSON_KEY_USER.equals(A0q)) {
                    Parcelable.Creator creator2 = User.CREATOR;
                    user = AbstractC38851rI.A00(c16l, false);
                } else if ("user_story".equals(A0q)) {
                    c115895Mf = AbstractC40710I2q.parseFromJson(c16l);
                } else if ("uuid".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str8 = null;
                    } else {
                        str8 = c16l.A1P();
                    }
                } else if (IntentModule.EXTRA_MAP_KEY_FOR_VALUE.equals(A0q)) {
                    f2 = new Float(c16l.A0U());
                }
                c16l.A0z();
            }
            return new C47M(c54m, c115875Md, c47e, c115895Mf, user, bool, bool2, bool3, f, f2, num, str, str2, str3, str4, str5, str6, str7, str8, arrayList, arrayList2, arrayList3, arrayList4, arrayList5);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
