package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.GtJ, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38324GtJ extends AbstractC52922bZ {
    public final C2GT A00;
    public final C42347Ip9 A01;
    public final String A02;
    public final String A03;
    public final boolean A04;

    public static final boolean A00(C38685GzQ c38685GzQ) {
        C39336HZb c39336HZb;
        if (c38685GzQ.A00 == C05F.A00) {
            AbstractC39668Hix abstractC39668Hix = (AbstractC39668Hix) c38685GzQ.A01;
            if (!(abstractC39668Hix instanceof C39335HZa)) {
                if ((abstractC39668Hix instanceof C39336HZb) && (c39336HZb = (C39336HZb) abstractC39668Hix) != null && c39336HZb.A00 != null) {
                    return true;
                }
                return false;
            }
            return true;
        }
        return false;
    }

    public /* synthetic */ C38324GtJ(UserSession userSession, String str, String str2, boolean z) {
        C42347Ip9 A00 = I92.A00(userSession, z);
        AbstractC167007dF.A1G(str, 2, A00);
        this.A03 = str;
        this.A02 = str2;
        this.A04 = z;
        this.A01 = A00;
        this.A00 = AbstractC58232lf.A00(AnonymousClass191.A00, C0ST.A01(AnonymousClass111.A01(new C43171J6q(this, null, 38), new MV5(24, this, A00.A0D(str2)))));
    }
}
