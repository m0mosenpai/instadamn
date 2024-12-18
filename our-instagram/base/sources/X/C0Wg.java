package X;

import com.facebook.errorreporting.lacrima.common.check.DirectReports;
import java.util.HashMap;

/* renamed from: X.0Wg, reason: invalid class name */
/* loaded from: classes.dex */
public final class C0Wg {
    public final /* synthetic */ C0NK A00;
    public final /* synthetic */ C15300pk A01;

    public C0Wg(C0NK c0nk, C15300pk c15300pk) {
        this.A01 = c15300pk;
        this.A00 = c0nk;
    }

    public final void A00(Throwable th) {
        C0NK c0nk = this.A00;
        DirectReports.A02((String) c0nk.A0a.get(), (String) c0nk.A0P.get(), (String) c0nk.A0O.get(), (String) c0nk.A0Y.get(), th, new HashMap());
    }
}
