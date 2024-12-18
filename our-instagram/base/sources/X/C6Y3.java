package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.6Y3, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C6Y3 {
    public final C145816he A00;
    public final UserSession A01;

    public static final boolean A00(C38011pl c38011pl) {
        Integer num;
        Integer num2;
        Integer num3;
        Integer num4;
        Integer num5;
        Integer num6;
        Float f;
        return (c38011pl == null || (num = c38011pl.A0D) == null || num.intValue() != 0 || (num2 = c38011pl.A0E) == null || num2.intValue() != 0 || (num3 = c38011pl.A08) == null || num3.intValue() != 0 || (num4 = c38011pl.A04) == null || num4.intValue() != 0 || (num5 = c38011pl.A05) == null || num5.intValue() != 0 || (num6 = c38011pl.A0B) == null || num6.intValue() != 0 || (f = c38011pl.A02) == null || Double.compare(f.doubleValue(), 0.0d) != 0) ? false : true;
    }

    public C6Y3(UserSession userSession, C145816he c145816he) {
        this.A01 = userSession;
        this.A00 = c145816he;
    }
}
