package X;

import com.instagram.user.model.User;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.IRq, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC41345IRq {
    public static C38828H7z parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            ArrayList arrayList = null;
            while (c16l.A1J() != C16R.A09) {
                if (AbstractC31177DnL.A1V(c16l, "templates")) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = AbstractC166987dD.A1E();
                        while (c16l.A1J() != C16R.A08) {
                            C38827H7y parseFromJson = AbstractC40778I5g.parseFromJson(c16l);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    } else {
                        arrayList = null;
                    }
                }
                c16l.A0z();
            }
            if (arrayList == null && (c16l instanceof C07950bF)) {
                AbstractC166997dE.A1V("templates", c16l, "TemplateInfoCollection");
                throw C00O.createAndThrow();
            }
            return new C38828H7z(arrayList);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }

    public static void A00(AnonymousClass182 anonymousClass182, C38828H7z c38828H7z) {
        anonymousClass182.A0d();
        List list = c38828H7z.A00;
        if (list != null) {
            Iterator A0q = AbstractC37301Gc2.A0q(anonymousClass182, "templates", list);
            while (A0q.hasNext()) {
                JM1 jm1 = (JM1) A0q.next();
                if (jm1 != null) {
                    C38827H7y F79 = jm1.F79(AbstractC37301Gc2.A08());
                    anonymousClass182.A0d();
                    String str = F79.A01;
                    if (str != null) {
                        anonymousClass182.A0S("image_url", str);
                    }
                    User user = F79.A00;
                    if (user != null) {
                        AbstractC37300Gc1.A0x(anonymousClass182, user, "template_author");
                    }
                    String str2 = F79.A02;
                    if (str2 != null) {
                        anonymousClass182.A0S("template_id", str2);
                    }
                    anonymousClass182.A0a();
                }
            }
            anonymousClass182.A0Z();
        }
        anonymousClass182.A0a();
    }
}
