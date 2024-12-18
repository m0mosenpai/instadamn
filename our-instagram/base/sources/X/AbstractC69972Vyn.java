package X;

import com.instagram.model.mediasize.ExtendedImageUrl;
import com.instagram.user.model.User;

/* renamed from: X.Vyn, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC69972Vyn {
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, X.UPU] */
    public static final UPU A00(User user) {
        C14360o3.A0B(user, 0);
        C26068Bfw c26068Bfw = null;
        ?? obj = new Object();
        obj.A07 = "";
        obj.A09 = "";
        obj.A06 = null;
        obj.A00 = null;
        obj.A08 = null;
        obj.A04 = null;
        obj.A03 = null;
        obj.A05 = null;
        obj.A01 = null;
        obj.A02 = null;
        obj.A07 = user.getId();
        obj.A09 = user.getUsername();
        obj.A06 = user.getFullName();
        ExtendedImageUrl A0D = user.A0D();
        if (A0D != null) {
            c26068Bfw = new C26068Bfw();
            String str = A0D.A0A;
            C14360o3.A0B(str, 0);
            c26068Bfw.A02 = str;
            c26068Bfw.A01 = A0D.getWidth();
            c26068Bfw.A00 = A0D.getHeight();
        }
        obj.A00 = c26068Bfw;
        obj.A08 = user.Bhu().getUrl();
        obj.A04 = user.A03.CfY();
        obj.A03 = user.A0J();
        return obj;
    }

    public static final User A01(UPU upu) {
        C14360o3.A0B(upu, 0);
        User user = new User(upu.A07, upu.A09);
        user.A0q(upu.A06);
        C26068Bfw c26068Bfw = upu.A00;
        if (c26068Bfw != null) {
            user.A0j(new ExtendedImageUrl(c26068Bfw.A02, c26068Bfw.A01, c26068Bfw.A00));
        }
        user.A0r(upu.A08);
        user.A03.Egl(upu.A04);
        user.A0m(upu.A03);
        return user;
    }
}
