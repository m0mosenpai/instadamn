package X;

import android.os.Parcelable;
import com.instagram.user.model.User;
import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.7og, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC173887og {
    public static C173897oh parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            C173897oh c173897oh = new C173897oh();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                c16l.A1J();
                if ("users".equals(A0q)) {
                    ArrayList arrayList = null;
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
                    c173897oh.A00 = arrayList;
                } else {
                    C55702hA.A01(c16l, c173897oh, A0q);
                }
                c16l.A0z();
            }
            return c173897oh;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
