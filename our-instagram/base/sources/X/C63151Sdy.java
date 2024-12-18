package X;

import android.app.PendingIntent;
import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import android.os.Messenger;
import com.google.firebase.iid.zzm;

/* renamed from: X.Sdy, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63151Sdy {
    public static int A06;
    public static PendingIntent A07;
    public Messenger A00;
    public zzm A01;
    public final Context A03;
    public final C63301Sh5 A05;
    public final C005001p A04 = new C005001p(0);
    public Messenger A02 = new Messenger(new RMT(Looper.getMainLooper(), this));

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:53:0x00f8
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1166)
        	at jadx.core.dex.visitors.regions.RegionMaker.processTryCatchBlocks(RegionMaker.java:1022)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:55)
        */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00d5 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final android.os.Bundle A00(android.os.Bundle r10, X.C63151Sdy r11) {
        /*
            Method dump skipped, instructions count: 264
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C63151Sdy.A00(android.os.Bundle, X.Sdy):android.os.Bundle");
    }

    public static final void A01(Bundle bundle, C63151Sdy c63151Sdy, String str) {
        C005001p c005001p = c63151Sdy.A04;
        synchronized (c005001p) {
            C58411Pup c58411Pup = (C58411Pup) c005001p.remove(str);
            if (c58411Pup == null) {
                android.util.Log.w("FirebaseInstanceId", AbstractC58321PtD.A0w("Missing callback for ", str));
            } else {
                c58411Pup.A01(bundle);
            }
        }
    }

    public C63151Sdy(Context context, C63301Sh5 c63301Sh5) {
        this.A03 = context;
        this.A05 = c63301Sh5;
    }
}
