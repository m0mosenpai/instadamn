package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.react.modules.dialog.DialogModule;
import com.instagram.api.schemas.FeedItemType;
import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.4mg, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC104184mg {
    public static C38661qx parseFromJson(C16L c16l) {
        C0KX c0kx;
        String str;
        String A1P;
        C14360o3.A0B(c16l, 0);
        try {
            Integer num = null;
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            Boolean bool = null;
            String str2 = null;
            Boolean bool2 = null;
            Long l = null;
            Boolean bool3 = null;
            Boolean bool4 = null;
            Boolean bool5 = null;
            Boolean bool6 = null;
            FeedItemType feedItemType = null;
            Boolean bool7 = null;
            String str3 = null;
            Boolean bool8 = null;
            Boolean bool9 = null;
            ArrayList arrayList = null;
            String str4 = null;
            String str5 = null;
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                c16l.A1J();
                if ("action_text".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str2 = null;
                    } else {
                        str2 = c16l.A1P();
                    }
                } else if ("duration".equals(A0q)) {
                    num = Integer.valueOf(c16l.A1D());
                } else if ("dynamic_width_enabled".equals(A0q)) {
                    bool = Boolean.valueOf(c16l.A0d());
                } else if ("gradient_animation_enabled".equals(A0q)) {
                    bool2 = Boolean.valueOf(c16l.A0d());
                } else if (PublicKeyCredentialControllerUtility.JSON_KEY_ID.equals(A0q)) {
                    l = Long.valueOf(c16l.A0y());
                } else if ("is_unit_dismissable".equals(A0q)) {
                    bool3 = Boolean.valueOf(c16l.A0d());
                } else if ("large_profile_pictures_enabled".equals(A0q)) {
                    bool4 = Boolean.valueOf(c16l.A0d());
                } else if ("load_animation_enabled".equals(A0q)) {
                    bool5 = Boolean.valueOf(c16l.A0d());
                } else if ("multiple_gradients_enabled".equals(A0q)) {
                    bool6 = Boolean.valueOf(c16l.A0d());
                } else if ("netego_type".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        A1P = null;
                    } else {
                        A1P = c16l.A1P();
                    }
                    feedItemType = (FeedItemType) FeedItemType.A01.get(A1P);
                    if (feedItemType == null) {
                        feedItemType = FeedItemType.A2e;
                    }
                } else if ("no_follow_confirmation".equals(A0q)) {
                    bool7 = Boolean.valueOf(c16l.A0d());
                } else if ("ranking_algorithm".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str3 = null;
                    } else {
                        str3 = c16l.A1P();
                    }
                } else if ("shuffle_enabled".equals(A0q)) {
                    bool8 = Boolean.valueOf(c16l.A0d());
                } else if ("smaller_follow_tap_target_enabled".equals(A0q)) {
                    bool9 = Boolean.valueOf(c16l.A0d());
                } else if ("suggestions".equals(A0q)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = new ArrayList();
                        while (c16l.A1J() != C16R.A08) {
                            C47G parseFromJson = C47C.parseFromJson(c16l);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    } else {
                        arrayList = null;
                    }
                } else if (DialogModule.KEY_TITLE.equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str4 = null;
                    } else {
                        str4 = c16l.A1P();
                    }
                } else if ("tracking_token".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str5 = null;
                    } else {
                        str5 = c16l.A1P();
                    }
                }
                c16l.A0z();
            }
            if (str2 == null && (c16l instanceof C07950bF)) {
                ((C07950bF) c16l).A03.A00("action_text", "SimpleSuggestedUsersDict");
            } else if (num != null || !(c16l instanceof C07950bF)) {
                if (bool == null && (c16l instanceof C07950bF)) {
                    ((C07950bF) c16l).A03.A00("dynamic_width_enabled", "SimpleSuggestedUsersDict");
                } else if (bool2 == null && (c16l instanceof C07950bF)) {
                    ((C07950bF) c16l).A03.A00("gradient_animation_enabled", "SimpleSuggestedUsersDict");
                } else if (l == null && (c16l instanceof C07950bF)) {
                    ((C07950bF) c16l).A03.A00(PublicKeyCredentialControllerUtility.JSON_KEY_ID, "SimpleSuggestedUsersDict");
                } else if (bool3 == null && (c16l instanceof C07950bF)) {
                    ((C07950bF) c16l).A03.A00("is_unit_dismissable", "SimpleSuggestedUsersDict");
                } else if (bool4 == null && (c16l instanceof C07950bF)) {
                    ((C07950bF) c16l).A03.A00("large_profile_pictures_enabled", "SimpleSuggestedUsersDict");
                } else if (bool5 == null && (c16l instanceof C07950bF)) {
                    ((C07950bF) c16l).A03.A00("load_animation_enabled", "SimpleSuggestedUsersDict");
                } else if (bool6 == null && (c16l instanceof C07950bF)) {
                    ((C07950bF) c16l).A03.A00("multiple_gradients_enabled", "SimpleSuggestedUsersDict");
                } else if (feedItemType == null && (c16l instanceof C07950bF)) {
                    ((C07950bF) c16l).A03.A00("netego_type", "SimpleSuggestedUsersDict");
                } else if (bool7 == null && (c16l instanceof C07950bF)) {
                    ((C07950bF) c16l).A03.A00("no_follow_confirmation", "SimpleSuggestedUsersDict");
                } else {
                    if (str3 == null && (c16l instanceof C07950bF)) {
                        c0kx = ((C07950bF) c16l).A03;
                        str = "ranking_algorithm";
                    } else if (bool8 != null || !(c16l instanceof C07950bF)) {
                        if (bool9 == null && (c16l instanceof C07950bF)) {
                            c0kx = ((C07950bF) c16l).A03;
                            str = "smaller_follow_tap_target_enabled";
                        } else if (arrayList == null && (c16l instanceof C07950bF)) {
                            c0kx = ((C07950bF) c16l).A03;
                            str = "suggestions";
                        } else if (str4 == null && (c16l instanceof C07950bF)) {
                            c0kx = ((C07950bF) c16l).A03;
                            str = DialogModule.KEY_TITLE;
                        } else if (str5 == null && (c16l instanceof C07950bF)) {
                            c0kx = ((C07950bF) c16l).A03;
                            str = "tracking_token";
                        } else {
                            return new C38661qx(feedItemType, str2, str3, str4, str5, arrayList, num.intValue(), l.longValue(), bool.booleanValue(), bool2.booleanValue(), bool3.booleanValue(), bool4.booleanValue(), bool5.booleanValue(), bool6.booleanValue(), bool7.booleanValue(), bool8.booleanValue(), bool9.booleanValue());
                        }
                    } else {
                        c0kx = ((C07950bF) c16l).A03;
                        str = "shuffle_enabled";
                    }
                    c0kx.A00(str, "SimpleSuggestedUsersDict");
                }
            } else {
                ((C07950bF) c16l).A03.A00("duration", "SimpleSuggestedUsersDict");
            }
            throw C00O.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
