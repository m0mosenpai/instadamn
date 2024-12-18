package X;

import android.os.Parcelable;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.user.model.User;
import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.DqM, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC31357DqM {
    public static C47O parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            C47O c47o = new C47O(null);
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                c16l.A1J();
                if ("is_new_suggestion".equals(A0q)) {
                    c47o.A0D = c16l.A0d();
                } else {
                    String str = null;
                    String str2 = null;
                    String str3 = null;
                    String str4 = null;
                    ArrayList arrayList = null;
                    ArrayList arrayList2 = null;
                    if ("algorithm".equals(A0q)) {
                        if (c16l.A11() != C16R.A0G) {
                            str2 = c16l.A1P();
                        }
                        C14360o3.A0B(str2, 0);
                        c47o.A04 = str2;
                    } else if ("uuid".equals(A0q)) {
                        if (c16l.A11() != C16R.A0G) {
                            str3 = c16l.A1P();
                        }
                        C14360o3.A0B(str3, 0);
                        c47o.A08 = str3;
                    } else if ("social_context".equals(A0q)) {
                        if (c16l.A11() != C16R.A0G) {
                            str4 = c16l.A1P();
                        }
                        C14360o3.A0B(str4, 0);
                        c47o.A05 = str4;
                    } else if ("user_story".equals(A0q)) {
                        c47o.A02 = AbstractC40710I2q.parseFromJson(c16l);
                    } else if ("followed_by".equals(A0q)) {
                        c47o.A0C = c16l.A0d();
                    } else if ("media_infos".equals(A0q)) {
                        if (c16l.A11() == C16R.A0C) {
                            arrayList = new ArrayList();
                            while (c16l.A1J() != C16R.A08) {
                                C38321qM A0C = C38321qM.A0h.A0C(c16l, true, false);
                                if (A0C != null) {
                                    arrayList.add(A0C);
                                }
                            }
                        }
                        C14360o3.A0B(arrayList, 0);
                        c47o.A09 = arrayList;
                    } else if (PublicKeyCredentialControllerUtility.JSON_KEY_USER.equals(A0q)) {
                        Parcelable.Creator creator = User.CREATOR;
                        User A00 = AbstractC38851rI.A00(c16l, false);
                        C14360o3.A0B(A00, 0);
                        c47o.A03 = A00;
                    } else if ("social_context_facepile_users".equals(A0q)) {
                        if (c16l.A11() == C16R.A0C) {
                            arrayList2 = new ArrayList();
                            while (c16l.A1J() != C16R.A08) {
                                Parcelable.Creator creator2 = User.CREATOR;
                                User A002 = AbstractC38851rI.A00(c16l, false);
                                if (A002 != null) {
                                    arrayList2.add(A002);
                                }
                            }
                        }
                        C14360o3.A0B(arrayList2, 0);
                        c47o.A0A = arrayList2;
                    } else if ("interest_topic".equals(A0q)) {
                        if (c16l.A11() != C16R.A0G) {
                            str = c16l.A1P();
                        }
                        c47o.A07 = str;
                    } else if ("custom_profile_pic_url".equals(A0q)) {
                        c47o.A01 = C17Y.parseFromJson(c16l);
                    }
                }
                c16l.A0z();
            }
            c47o.A00();
            return c47o;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
