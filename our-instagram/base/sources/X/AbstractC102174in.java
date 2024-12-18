package X;

import android.os.Parcelable;
import com.instagram.user.model.User;
import java.io.IOException;

/* renamed from: X.4in, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC102174in {
    public static C102184io parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            Boolean bool = null;
            Boolean bool2 = null;
            User user = null;
            String str = null;
            String str2 = null;
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                c16l.A1J();
                if ("is_pending".equals(A0q)) {
                    bool = Boolean.valueOf(c16l.A0d());
                } else if ("permission".equals(A0q)) {
                    bool2 = Boolean.valueOf(c16l.A0d());
                } else if ("sponsor".equals(A0q)) {
                    Parcelable.Creator creator = User.CREATOR;
                    user = AbstractC38851rI.A00(c16l, false);
                } else if ("sponsor_id".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str = null;
                    } else {
                        str = c16l.A1P();
                    }
                } else if (AbstractC50531MSk.A02(42, 8, 43).equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str2 = null;
                    } else {
                        str2 = c16l.A1P();
                    }
                }
                c16l.A0z();
            }
            if (user == null && (c16l instanceof C07950bF)) {
                ((C07950bF) c16l).A03.A00("sponsor", "SponsorTag");
                throw C00O.createAndThrow();
            }
            return new C102184io(user, bool, bool2, str, str2);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }

    public static void A00(AnonymousClass182 anonymousClass182, C102184io c102184io) {
        anonymousClass182.A0d();
        Boolean bool = c102184io.A01;
        if (bool != null) {
            anonymousClass182.A0T("is_pending", bool.booleanValue());
        }
        Boolean bool2 = c102184io.A02;
        if (bool2 != null) {
            anonymousClass182.A0T("permission", bool2.booleanValue());
        }
        User user = c102184io.A00;
        if (user != null) {
            anonymousClass182.A0r("sponsor");
            Parcelable.Creator creator = User.CREATOR;
            AbstractC38851rI.A08(anonymousClass182, user);
        }
        String str = c102184io.A03;
        if (str != null) {
            anonymousClass182.A0S("sponsor_id", str);
        }
        String str2 = c102184io.A04;
        if (str2 != null) {
            anonymousClass182.A0S(AbstractC50531MSk.A00(), str2);
        }
        anonymousClass182.A0a();
    }
}
