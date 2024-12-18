package X;

import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.IdL, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C41692IdL {
    public final C42347Ip9 A00;
    public final String A01;
    public final String A02;
    public final C05A A03;
    public final C05A A04;
    public final C05A A05;
    public final C05A A06;
    public final boolean A07;

    public static final C38685GzQ A00(C38685GzQ c38685GzQ, int i) {
        List list = (List) c38685GzQ.A02;
        List A0d = AbstractC001800i.A0d(list, i);
        AbstractC39668Hix abstractC39668Hix = (AbstractC39668Hix) c38685GzQ.A01;
        if (!(abstractC39668Hix instanceof C39336HZb)) {
            if (list.size() > i) {
                abstractC39668Hix = new C39336HZb(null);
            } else {
                abstractC39668Hix = C39335HZa.A00;
            }
        }
        Integer num = (Integer) c38685GzQ.A00;
        AbstractC167027dH.A12(A0d, num, abstractC39668Hix);
        return new C38685GzQ(abstractC39668Hix, num, A0d);
    }

    public static final boolean A01(EnumC39623HeX enumC39623HeX, C41692IdL c41692IdL, boolean z) {
        Object obj;
        if (z) {
            C38685GzQ A05 = AbstractC37300Gc1.A04(c41692IdL.A04).A05(enumC39623HeX);
            if (A05 != null) {
                obj = A05.A00;
            } else {
                obj = null;
            }
            if (obj == C05F.A0C) {
                return false;
            }
        }
        return true;
    }

    public /* synthetic */ C41692IdL(UserSession userSession, String str, String str2, boolean z) {
        C42347Ip9 A00 = I92.A00(userSession, z);
        AbstractC167007dF.A1G(str, 2, A00);
        this.A02 = str;
        this.A01 = str2;
        this.A07 = z;
        this.A00 = A00;
        this.A03 = AbstractC25225BEi.A1H(2);
        this.A06 = AbstractC25225BEi.A1H(6);
        this.A05 = AbstractC25225BEi.A1H(6);
        this.A04 = A00.A0D(str2);
    }
}
