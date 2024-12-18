package X;

import android.content.Context;
import android.graphics.Point;
import com.instagram.common.session.UserSession;
import com.instagram.pendingmedia.model.ClipInfo;

/* renamed from: X.Odw, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C55190Odw {
    public final Point A00;
    public final C47Z A01;
    public final Context A02;
    public final UserSession A03;
    public final ClipInfo A04;
    public final ODO A05;

    private int A00() {
        float min;
        double d;
        Point point = this.A00;
        int i = point.x;
        int i2 = point.y;
        String str = this.A04.A0E;
        Context context = this.A02;
        float f = this.A01.A02;
        boolean A1P = AbstractC167007dF.A1P(i, 1080);
        UserSession userSession = this.A03;
        Point A02 = ALe.A02(context, userSession, f, AbstractC54249NyU.A00(context, userSession, Integer.MAX_VALUE, A1P, false));
        ODO odo = this.A05;
        float f2 = (float) odo.A04;
        float f3 = i / i2;
        if (f3 < odo.A00) {
            if (i2 < i) {
                min = Math.min(Math.max((f3 - 1.0f) / 0.7777778f, 0.0f), 1.0f);
                d = odo.A02;
            } else if (i2 > i) {
                min = Math.min(Math.max((f3 - 1.0f) / (-0.4375f), 0.0f), 1.0f);
                d = odo.A03;
            }
            f2 += min * (((float) d) - f2);
        }
        if ("boomerang".equals(str)) {
            f2 = (float) (f2 * odo.A01);
        }
        return Math.max(AbstractC166987dD.A0A(A02.x * A02.y, f2), AbstractC166987dD.A0A(i * i2, f2));
    }

    public static C55190Odw A01(Context context, UserSession userSession, C47Z c47z, boolean z) {
        boolean z2;
        Point A00;
        long j;
        boolean z3 = c47z.A60;
        boolean z4 = c47z.A61;
        boolean A1W = AbstractC167007dF.A1W(c47z.A1K);
        if (z3 && (A1W || z4)) {
            C15900qk.A01();
            long A002 = C15900qk.A00(context, false);
            C06090Tz c06090Tz = C06090Tz.A05;
            if (C18U.A01(c06090Tz, userSession, 36601612512661785L) * 1048576 <= A002) {
                if (c47z.A0r != null) {
                    j = 36319557715041810L;
                } else {
                    j = 36320137535692889L;
                }
                z2 = C18U.A06(c06090Tz, userSession, j);
                A00 = ALe.A00(c47z.A02, AbstractC54249NyU.A00(context, userSession, c47z.A1N.A09, z, z2));
                if (A00.x > 0 || A00.y <= 0) {
                    C0f5 AEp = C18950wb.A01.AEp("NEGATIVE_RENDER_SIZE", 817901174);
                    AEp.ABW("NEGATIVE_RENDER_SIZE", String.format("Negative video render size for portrait surface w=%d h=%d. Original media %s has source type %d, camera capture type %s, and size w=%d h=%d", A03(A00, c47z)));
                    AEp.report();
                }
                return new C55190Odw(context, A00, userSession, c47z);
            }
        }
        z2 = false;
        A00 = ALe.A00(c47z.A02, AbstractC54249NyU.A00(context, userSession, c47z.A1N.A09, z, z2));
        if (A00.x > 0) {
        }
        C0f5 AEp2 = C18950wb.A01.AEp("NEGATIVE_RENDER_SIZE", 817901174);
        AEp2.ABW("NEGATIVE_RENDER_SIZE", String.format("Negative video render size for portrait surface w=%d h=%d. Original media %s has source type %d, camera capture type %s, and size w=%d h=%d", A03(A00, c47z)));
        AEp2.report();
        return new C55190Odw(context, A00, userSession, c47z);
    }

    public static C55190Odw A02(Context context, UserSession userSession, C47Z c47z, boolean z, boolean z2) {
        boolean z3;
        Point A00;
        long j;
        if (z) {
            boolean z4 = c47z.A60;
            boolean z5 = c47z.A61;
            boolean A1W = AbstractC167007dF.A1W(c47z.A1K);
            if (z4 && (A1W || z5)) {
                C15900qk.A01();
                long A002 = C15900qk.A00(context, false);
                C06090Tz c06090Tz = C06090Tz.A05;
                if (C18U.A01(c06090Tz, userSession, 36601612512661785L) * 1048576 <= A002) {
                    if (c47z.A0r != null) {
                        j = 36319557715041810L;
                    } else {
                        j = 36320137535692889L;
                    }
                    z3 = C18U.A06(c06090Tz, userSession, j);
                    A00 = ALe.A00(c47z.A02, (AbstractC54249NyU.A00(context, userSession, c47z.A1N.A09, false, z3) * 16) / 9);
                    if (A00.x > 0 || A00.y <= 0) {
                        C0f5 AEp = C18950wb.A01.AEp("NEGATIVE_RENDER_SIZE", 817901174);
                        AEp.ABW("NEGATIVE_RENDER_SIZE", String.format("Negative video render size for landscape surface w=%d h=%d. Original media %s has source type %d, camera capture type %s, and size w=%d h=%d", A03(A00, c47z)));
                        AEp.report();
                    }
                    return new C55190Odw(context, A00, userSession, c47z);
                }
            }
            z3 = false;
            A00 = ALe.A00(c47z.A02, (AbstractC54249NyU.A00(context, userSession, c47z.A1N.A09, false, z3) * 16) / 9);
            if (A00.x > 0) {
            }
            C0f5 AEp2 = C18950wb.A01.AEp("NEGATIVE_RENDER_SIZE", 817901174);
            AEp2.ABW("NEGATIVE_RENDER_SIZE", String.format("Negative video render size for landscape surface w=%d h=%d. Original media %s has source type %d, camera capture type %s, and size w=%d h=%d", A03(A00, c47z)));
            AEp2.report();
            return new C55190Odw(context, A00, userSession, c47z);
        }
        return A01(context, userSession, c47z, z2);
    }

    public static Object[] A03(Point point, C47Z c47z) {
        Integer valueOf = Integer.valueOf(point.x);
        Integer valueOf2 = Integer.valueOf(point.y);
        String str = c47z.A3t;
        Integer valueOf3 = Integer.valueOf(c47z.A0K);
        String str2 = c47z.A2V;
        ClipInfo clipInfo = c47z.A1N;
        return new Object[]{valueOf, valueOf2, str, valueOf3, str2, Integer.valueOf(clipInfo.A09), Integer.valueOf(clipInfo.A06)};
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x012a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r7v1, types: [X.VoJ, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int A04() {
        /*
            Method dump skipped, instructions count: 432
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C55190Odw.A04():int");
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, X.ODO] */
    public C55190Odw(Context context, Point point, UserSession userSession, C47Z c47z) {
        double d;
        this.A03 = userSession;
        this.A02 = context;
        this.A01 = c47z;
        this.A04 = c47z.A1N;
        this.A00 = point;
        ?? obj = new Object();
        if (!c47z.A5V && !c47z.A5D) {
            d = 7.0d;
        } else {
            d = 2.2d;
        }
        obj.A04 = d;
        obj.A03 = d;
        obj.A02 = 9.722200393676758d;
        obj.A01 = 1.2999999523162842d;
        obj.A00 = 100000.0d;
        this.A05 = obj;
    }

    public C55190Odw() {
    }
}
