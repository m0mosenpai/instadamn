package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import java.io.File;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.1Y7, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1Y7 {
    public static final C1YD A06 = new Object();
    public C74283Vj A00;
    public File A01;
    public final Context A02;
    public final UserSession A03;
    public final List A04;
    public final AtomicInteger A05;

    public C1Y7(Context context, UserSession userSession, AtomicInteger atomicInteger) {
        C14360o3.A0B(context, 1);
        C14360o3.A0B(userSession, 2);
        C14360o3.A0B(atomicInteger, 3);
        this.A02 = context;
        this.A03 = userSession;
        this.A05 = atomicInteger;
        C01L A1I = C0eM.A1I();
        if (C18U.A06(C06090Tz.A05, userSession, 36320463953076743L)) {
            A1I.add(new Object());
        }
        this.A04 = C0eM.A1J(A1I);
    }

    public final void A02(C1X7 c1x7) {
        C14360o3.A0B(c1x7, 0);
        A01();
        C74283Vj c74283Vj = this.A00;
        if (c74283Vj != null) {
            c1x7.DM5(c74283Vj, EnumC73363Qm.A03, C16930sl.A00, A00(this));
            this.A00 = null;
            return;
        }
        c1x7.DM4(EnumC73363Qm.A03, "ColdStartFeedCache response is null");
    }

    public static final long A00(C1Y7 c1y7) {
        if (c1y7.A01 == null) {
            c1y7.A01();
        }
        File file = c1y7.A01;
        if (file != null) {
            return file.lastModified();
        }
        return -1L;
    }

    /* JADX WARN: Removed duplicated region for block: B:83:0x01ba  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A01() {
        /*
            Method dump skipped, instructions count: 456
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1Y7.A01():void");
    }
}
