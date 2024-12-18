package X;

import android.content.Context;
import java.io.File;
import java.util.Map;

/* renamed from: X.0tC, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C17170tC extends C0UZ {
    public final C17180tD A00;
    public final C04w A01;

    @Override // X.C0UZ
    public final C06110Ub A02(Context context, Map map, int i, int i2) {
        return new C06110Ub(false, false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:89:0x01aa, code lost:
    
        if (r4 == null) goto L72;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:50:0x01c5  */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.net.HttpURLConnection, java.lang.Object, X.0tP] */
    @Override // X.C0UZ
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C06110Ub A03(android.content.Context r10, java.util.Map r11, int r12, int r13) {
        /*
            Method dump skipped, instructions count: 624
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C17170tC.A03(android.content.Context, java.util.Map, int, int):X.0Ub");
    }

    @Override // X.C0UZ
    public final String A04() {
        return "Instagram Instacrash Remedy";
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [X.04w, java.lang.Object] */
    public C17170tC() {
        int i = AnonymousClass046.A01;
        C17180tD c17180tD = C17180tD.A00;
        ?? obj = new Object();
        C14360o3.A0B(c17180tD, 3);
        this.A00 = c17180tD;
        this.A01 = obj;
    }

    @Override // X.C0UZ
    public final void A05(Context context, C06100Ua c06100Ua) {
        C04w c04w = this.A01;
        if (!c04w.A01) {
            C04w.A00(context, c04w);
            c04w.A01 = true;
        }
        AnonymousClass047 anonymousClass047 = c04w.A00;
        if (anonymousClass047 != null) {
            boolean z = false;
            if (AbstractC19730y1.A00(AbstractC12960li.A00).A00.getString("current", null) != null) {
                z = true;
            }
            AnonymousClass046.A02(context, anonymousClass047, z);
            c04w.A00 = null;
            new File(context.getApplicationInfo().dataDir, "ig_crash_log_session").delete();
        }
    }
}
