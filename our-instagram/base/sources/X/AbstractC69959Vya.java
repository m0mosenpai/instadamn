package X;

import com.instagram.model.venue.Venue;
import java.util.Locale;

/* renamed from: X.Vya, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC69959Vya {
    public static final C11520jB A00(C38321qM c38321qM) {
        C14360o3.A0B(c38321qM, 0);
        C11520jB c11520jB = new C11520jB();
        Venue A27 = c38321qM.A27();
        if (A27 != null) {
            c11520jB.A04(AbstractC128995sK.A01, A27.A04());
            c11520jB.A04(AbstractC128995sK.A02, A27.A00.getName());
        }
        C11500j9 c11500j9 = AbstractC128995sK.A06;
        String lowerCase = "PLACE".toLowerCase(Locale.ROOT);
        C14360o3.A07(lowerCase);
        c11520jB.A04(c11500j9, lowerCase);
        return c11520jB;
    }

    public static final C11520jB A01(Venue venue) {
        C11520jB c11520jB = new C11520jB();
        if (venue != null) {
            c11520jB.A04(AbstractC128995sK.A03, venue.A04());
            c11520jB.A04(AbstractC128995sK.A04, venue.A00.getName());
        }
        return c11520jB;
    }
}
