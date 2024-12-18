package X;

import android.os.Parcelable;
import com.instagram.debug.devoptions.sandboxselector.DevServerEntity;
import com.instagram.user.model.User;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

/* renamed from: X.1sw, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC39731sw {
    public static C39741sx parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            C16R A11 = c16l.A11();
            C16R c16r = C16R.A0D;
            if (A11 != c16r) {
                c16l.A0z();
                return null;
            }
            C5Fa c5Fa = null;
            String str = null;
            String str2 = null;
            C5FI c5fi = null;
            String str3 = null;
            String str4 = null;
            C5Fa c5Fa2 = null;
            C5FI c5fi2 = null;
            C110864yy c110864yy = null;
            HashMap hashMap = null;
            ArrayList arrayList = null;
            Boolean bool = null;
            String str5 = null;
            String str6 = null;
            Integer num = null;
            while (true) {
                C16R A1J = c16l.A1J();
                C16R c16r2 = C16R.A09;
                if (A1J != c16r2) {
                    String A0q = c16l.A0q();
                    c16l.A1J();
                    if ("ad_disclaimer_info".equals(A0q)) {
                        c5Fa = IR6.parseFromJson(c16l);
                    } else if ("background_color".equals(A0q)) {
                        if (c16l.A11() == C16R.A0G) {
                            str = null;
                        } else {
                            str = c16l.A1P();
                        }
                    } else if ("background_color_alpha".equals(A0q)) {
                        if (c16l.A11() == C16R.A0G) {
                            str2 = null;
                        } else {
                            str2 = c16l.A1P();
                        }
                    } else if ("caption_area".equals(A0q)) {
                        c5fi = IR5.parseFromJson(c16l);
                    } else if ("default_caption".equals(A0q)) {
                        if (c16l.A11() == C16R.A0G) {
                            str3 = null;
                        } else {
                            str3 = c16l.A1P();
                        }
                    } else if (DevServerEntity.COLUMN_DESCRIPTION.equals(A0q)) {
                        if (c16l.A11() == C16R.A0G) {
                            str4 = null;
                        } else {
                            str4 = c16l.A1P();
                        }
                    } else if ("disclaimer_context".equals(A0q)) {
                        c5Fa2 = IR6.parseFromJson(c16l);
                    } else if ("headline_position".equals(A0q)) {
                        c5fi2 = IR5.parseFromJson(c16l);
                    } else if ("keyword_highlight_info_list".equals(A0q)) {
                        c110864yy = IR7.parseFromJson(c16l);
                    } else if ("mention_user_list".equals(A0q)) {
                        if (c16l.A11() == c16r) {
                            hashMap = new HashMap();
                            while (c16l.A1J() != c16r2) {
                                String A1P = c16l.A1P();
                                c16l.A1J();
                                if (c16l.A11() == C16R.A0G) {
                                    hashMap.put(A1P, null);
                                } else {
                                    Parcelable.Creator creator = User.CREATOR;
                                    User A00 = AbstractC38851rI.A00(c16l, false);
                                    if (A00 != null) {
                                        hashMap.put(A1P, A00);
                                    }
                                }
                            }
                        } else {
                            hashMap = null;
                        }
                    } else if ("mentioned_users".equals(A0q)) {
                        if (c16l.A11() == C16R.A0C) {
                            arrayList = new ArrayList();
                            while (c16l.A1J() != C16R.A08) {
                                Parcelable.Creator creator2 = User.CREATOR;
                                User A002 = AbstractC38851rI.A00(c16l, false);
                                if (A002 != null) {
                                    arrayList.add(A002);
                                }
                            }
                        } else {
                            arrayList = null;
                        }
                    } else if ("show_headline".equals(A0q)) {
                        bool = Boolean.valueOf(c16l.A0d());
                    } else if ("text".equals(A0q)) {
                        if (c16l.A11() == C16R.A0G) {
                            str5 = null;
                        } else {
                            str5 = c16l.A1P();
                        }
                    } else if ("text_color".equals(A0q)) {
                        if (c16l.A11() == C16R.A0G) {
                            str6 = null;
                        } else {
                            str6 = c16l.A1P();
                        }
                    } else if ("text_size".equals(A0q)) {
                        num = Integer.valueOf(c16l.A1D());
                    }
                    c16l.A0z();
                } else {
                    return new C39741sx(c5fi, c5fi2, c5Fa, c5Fa2, c110864yy, bool, num, str, str2, str3, str4, str5, str6, hashMap, arrayList);
                }
            }
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
