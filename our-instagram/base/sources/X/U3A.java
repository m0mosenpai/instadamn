package X;

import android.os.Parcelable;
import com.instagram.model.hashtag.HashtagImpl;
import com.instagram.user.model.User;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes11.dex */
public final class U3A {
    public static U3B parseFromJson(C16L c16l) {
        List list;
        List list2;
        List list3;
        C14360o3.A0B(c16l, 0);
        try {
            U3B u3b = new U3B();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                c16l.A1J();
                ArrayList arrayList = null;
                if ("list".equals(A0q)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = new ArrayList();
                        while (c16l.A1J() != C16R.A08) {
                            U0v parseFromJson = U0u.parseFromJson(c16l);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    }
                    u3b.A00 = arrayList;
                } else if ("users".equals(A0q)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = new ArrayList();
                        while (c16l.A1J() != C16R.A08) {
                            Parcelable.Creator creator = User.CREATOR;
                            User A00 = AbstractC38851rI.A00(c16l, false);
                            if (A00 != null) {
                                arrayList.add(A00);
                            }
                        }
                    }
                    u3b.A03 = arrayList;
                } else if ("tags".equals(A0q)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = new ArrayList();
                        while (c16l.A1J() != C16R.A08) {
                            HashtagImpl parseFromJson2 = AbstractC109614wn.parseFromJson(c16l);
                            if (parseFromJson2 != null) {
                                arrayList.add(parseFromJson2);
                            }
                        }
                    }
                    u3b.A02 = arrayList;
                } else {
                    U3D.A00(c16l, u3b, A0q);
                }
                c16l.A0z();
            }
            List list4 = u3b.A00;
            if (list4 == null || (list = U12.A00(U13.A00, list4)) == null) {
                list = C16930sl.A00;
            }
            u3b.A01 = list;
            if (list.isEmpty()) {
                List list5 = u3b.A03;
                if (list5 != null) {
                    list2 = U12.A01(list5);
                } else {
                    list2 = C16930sl.A00;
                }
                u3b.A01 = list2;
                if (list2.isEmpty()) {
                    List list6 = u3b.A02;
                    if (list6 == null || (list3 = U12.A02(list6)) == null) {
                        list3 = C16930sl.A00;
                    }
                    u3b.A01 = list3;
                    return u3b;
                }
                return u3b;
            }
            return u3b;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
