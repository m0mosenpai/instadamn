package X;

import com.instagram.common.session.UserSession;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: X.2EW, reason: invalid class name */
/* loaded from: classes.dex */
public final class C2EW {
    public final List A00;
    public final InterfaceC09390do A01;
    public final InterfaceC16820sZ A02;

    public final boolean A00(C83403nh c83403nh, C2EF c2ef) {
        C133205zm BIW;
        Long l;
        C14360o3.A0B(c83403nh, 0);
        if (!((Boolean) this.A02.invoke()).booleanValue() || (BIW = c2ef.BIW()) == null || (l = BIW.A00) == null) {
            return false;
        }
        long micros = TimeUnit.MILLISECONDS.toMicros(l.longValue());
        if (c83403nh.A1S() || c83403nh.C8i() <= micros || !C161867Mw.A02(c2ef.Aic()) || this.A00.contains(c83403nh.A10)) {
            return false;
        }
        ((C0f6) this.A01.getValue()).AEp("Open message blocked because thread was cutover", 817900627).report();
        return true;
    }

    public C2EW(UserSession userSession) {
        C9E1 c9e1 = new C9E1(userSession, 15);
        C2EX c2ex = C2EX.A00;
        C14360o3.A0B(c2ex, 2);
        this.A02 = c9e1;
        this.A01 = AbstractC09440dt.A00(EnumC09460dv.A02, new C9E1(c2ex, 16));
        this.A00 = AbstractC16960so.A1Q(C2EY.A1k, C2EY.A15);
    }
}
