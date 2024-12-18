package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: X.OIo, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C54775OIo {
    public C55143Od2 A00;
    public final UserSession A01;
    public final C19L A02;
    public final O1H A03;

    public C54775OIo(O1H o1h, UserSession userSession, C19L c19l) {
        C14360o3.A0B(userSession, 1);
        this.A01 = userSession;
        this.A03 = o1h;
        this.A02 = c19l;
    }

    public final Object A00(Context context, String str, InterfaceC23621Ds interfaceC23621Ds, boolean z) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = C24891Jo.A04;
        C24891Jo c24891Jo = new C24891Jo(1, C1E2.A02(interfaceC23621Ds));
        c24891Jo.A0I();
        C55143Od2 c55143Od2 = this.A00;
        if (c55143Od2 == null) {
            c55143Od2 = new C55143Od2(context, null, new C50526MSf(3, 0, false), this.A02);
            this.A00 = c55143Od2;
        }
        C55606Omp c55606Omp = new C55606Omp(c24891Jo);
        if (c55143Od2 == null) {
            C14360o3.A0F("avatarRichMediaViewerProvider");
            throw C00O.createAndThrow();
        }
        UserSession userSession = this.A01;
        C14360o3.A0B(str, 1);
        c55143Od2.A07 = userSession;
        OJA oja = new OJA(c55143Od2.A0B, new C55607Omq(c55143Od2), userSession, c55143Od2.A0H);
        oja.A00 = str;
        oja.A00(c55606Omp);
        if (!z) {
            c24891Jo.resumeWith(true);
        }
        return c24891Jo.A0E();
    }
}
