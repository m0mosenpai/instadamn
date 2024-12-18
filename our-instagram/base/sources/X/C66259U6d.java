package X;

import android.os.Parcelable;
import com.instagram.user.model.User;
import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.U6d, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C66259U6d {
    /* JADX WARN: Type inference failed for: r0v5, types: [X.VnX, java.lang.Object] */
    public static C66260U6e parseFromJson(C16L c16l) {
        String A1P;
        C14360o3.A0B(c16l, 0);
        try {
            C66260U6e c66260U6e = new C66260U6e();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                c16l.A1J();
                ArrayList arrayList = null;
                ArrayList arrayList2 = null;
                ArrayList arrayList3 = null;
                ArrayList arrayList4 = null;
                ArrayList arrayList5 = null;
                ArrayList arrayList6 = null;
                String str = null;
                String str2 = null;
                ArrayList arrayList7 = null;
                String str3 = null;
                if ("viewers".equals(A0q)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList2 = new ArrayList();
                        while (c16l.A1J() != C16R.A08) {
                            C9C8 parseFromJson = AbstractC38269GsE.parseFromJson(c16l);
                            if (parseFromJson != null) {
                                arrayList2.add(parseFromJson);
                            }
                        }
                    }
                    c66260U6e.A0G = arrayList2;
                } else if ("story_likers".equals(A0q)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList3 = new ArrayList();
                        while (c16l.A1J() != C16R.A08) {
                            Parcelable.Creator creator = User.CREATOR;
                            User A00 = AbstractC38851rI.A00(c16l, false);
                            if (A00 != null) {
                                arrayList3.add(A00);
                            }
                        }
                    }
                    c66260U6e.A0D = arrayList3;
                } else if ("users".equals(A0q)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList4 = new ArrayList();
                        while (c16l.A1J() != C16R.A08) {
                            Parcelable.Creator creator2 = User.CREATOR;
                            User A002 = AbstractC38851rI.A00(c16l, false);
                            if (A002 != null) {
                                arrayList4.add(A002);
                            }
                        }
                    }
                    c66260U6e.A0F = arrayList4;
                } else if ("shared_with_users".equals(A0q)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList5 = new ArrayList();
                        while (c16l.A1J() != C16R.A08) {
                            if (c16l.A11() != C16R.A0G && (A1P = c16l.A1P()) != null) {
                                arrayList5.add(A1P);
                            }
                        }
                    }
                    c66260U6e.A0C = arrayList5;
                } else if ("multi_author_stories".equals(A0q)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList6 = new ArrayList();
                        while (c16l.A1J() != C16R.A08) {
                            C69146Vib parseFromJson2 = VW0.parseFromJson(c16l);
                            if (parseFromJson2 != null) {
                                arrayList6.add(parseFromJson2);
                            }
                        }
                    }
                    c66260U6e.A0A = arrayList6;
                } else if ("total_viewer_count".equals(A0q)) {
                    c66260U6e.A02 = c16l.A1D();
                } else if ("next_max_id".equals(A0q)) {
                    if (c16l.A11() != C16R.A0G) {
                        str = c16l.A1P();
                    }
                    c66260U6e.A09 = str;
                } else if ("mas_view_count_megaphone_learn_more_url".equals(A0q)) {
                    if (c16l.A11() != C16R.A0G) {
                        str2 = c16l.A1P();
                    }
                    c66260U6e.A08 = str2;
                } else if ("show_mas_view_count_megaphone".equals(A0q)) {
                    c66260U6e.A0J = c16l.A0d();
                } else if ("megaphone".equals(A0q)) {
                    c66260U6e.A04 = VW7.parseFromJson(c16l);
                } else if ("updated_media".equals(A0q)) {
                    c66260U6e.A03 = C38321qM.A0h.A0B(c16l, true);
                } else if ("reactions".equals(A0q)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList7 = new ArrayList();
                        while (c16l.A1J() != C16R.A08) {
                            C38754H4u parseFromJson3 = AbstractC68389VOx.parseFromJson(c16l);
                            if (parseFromJson3 != null) {
                                arrayList7.add(parseFromJson3);
                            }
                        }
                    }
                    c66260U6e.A0B = arrayList7;
                } else if ("cursor".equals(A0q)) {
                    if (c16l.A11() != C16R.A0G) {
                        str3 = c16l.A1P();
                    }
                    c66260U6e.A07 = str3;
                } else if ("is_fb_story_archived".equals(A0q)) {
                    c66260U6e.A06 = Boolean.valueOf(c16l.A0d());
                } else if ("nonfriend_viewer_count".equals(A0q)) {
                    c66260U6e.A00 = c16l.A1D();
                } else if ("fb_viewer_count".equals(A0q)) {
                    c66260U6e.A01 = c16l.A1D();
                } else if ("story_prompt_info".equals(A0q)) {
                    c66260U6e.A05 = AbstractC54134NwW.parseFromJson(c16l);
                } else if ("top_story_comments".equals(A0q)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = new ArrayList();
                        while (c16l.A1J() != C16R.A08) {
                            C38891rO parseFromJson4 = AbstractC38841rG.parseFromJson(c16l);
                            if (parseFromJson4 != null) {
                                arrayList.add(parseFromJson4);
                            }
                        }
                    }
                    c66260U6e.A0E = arrayList;
                } else if ("has_more_comments".equals(A0q)) {
                    c66260U6e.A0I = c16l.A0d();
                } else {
                    C55702hA.A01(c16l, c66260U6e, A0q);
                }
                c16l.A0z();
            }
            if (c66260U6e.A0J) {
                String str4 = c66260U6e.A08;
                ?? obj = new Object();
                obj.A05 = str4;
                c66260U6e.A04 = obj;
                return c66260U6e;
            }
            return c66260U6e;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
