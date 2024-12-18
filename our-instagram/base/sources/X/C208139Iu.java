package X;

import android.os.Parcelable;
import com.instagram.user.model.User;
import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.9Iu, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C208139Iu {
    /* JADX WARN: Type inference failed for: r1v0, types: [X.1um, X.9ed, X.1ul] */
    public static C214399ed parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            ?? c40791um = new C40791um();
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
                            User A00 = AbstractC38851rI.A00(c16l, true);
                            if (A00 != null) {
                                arrayList.add(A00);
                            }
                        }
                    }
                    c40791um.A00 = arrayList;
                } else {
                    C55702hA.A01(c16l, c40791um, A0q);
                }
                c16l.A0z();
            }
            return c40791um;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
