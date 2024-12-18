package X;

import android.os.Parcelable;
import com.instagram.user.model.User;
import java.io.IOException;

/* renamed from: X.A1l, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC22741A1l {
    /* JADX WARN: Type inference failed for: r1v0, types: [X.9en, X.1um, X.1ul] */
    public static C214499en parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            ?? c40791um = new C40791um();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if (AbstractC111324zv.A00(4494).equals(A0s)) {
                    c40791um.A07 = AbstractC167017dG.A0m(c16l);
                } else if (AbstractC111324zv.A00(954).equals(A0s)) {
                    c40791um.A06 = AbstractC167017dG.A0m(c16l);
                } else if (AbstractC111324zv.A00(3874).equals(A0s)) {
                    c40791um.A02 = AbstractC167017dG.A0m(c16l);
                } else if ("time_left".equals(A0s)) {
                    c40791um.A09 = AbstractC167017dG.A0m(c16l);
                } else if (AbstractC111324zv.A00(197).equals(A0s)) {
                    c40791um.A00 = C38321qM.A00(c16l);
                } else if ("bloks_app".equals(A0s)) {
                    if (c16l.A11() != C16R.A0G) {
                        c16l.A1P();
                    }
                } else if ("sticker_description".equals(A0s)) {
                    c40791um.A08 = AbstractC167017dG.A0m(c16l);
                } else if ("nonprofit_beneficiary".equals(A0s)) {
                    Parcelable.Creator creator = User.CREATOR;
                    c40791um.A01 = AbstractC38851rI.A00(c16l, false);
                } else if ("charity_name".equals(A0s)) {
                    c40791um.A03 = AbstractC167017dG.A0m(c16l);
                } else if ("beneficiary_photo_url".equals(A0s)) {
                    c40791um.A04 = AbstractC167017dG.A0m(c16l);
                } else if (MSV.A00(182).equals(A0s)) {
                    c40791um.A05 = AbstractC167017dG.A0m(c16l);
                } else {
                    C55702hA.A01(c16l, c40791um, A0s);
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
