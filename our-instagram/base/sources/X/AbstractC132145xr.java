package X;

import android.content.Context;
import com.facebook.systrace.Systrace;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.5xr, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC132145xr {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0192 A[Catch: all -> 0x01bf, TryCatch #1 {all -> 0x01bf, blocks: (B:5:0x0017, B:7:0x001f, B:8:0x0025, B:9:0x004d, B:11:0x0053, B:13:0x0062, B:25:0x018c, B:27:0x0192, B:29:0x0198, B:68:0x01a1, B:70:0x01a7, B:71:0x01ad, B:74:0x01ae, B:15:0x006a, B:17:0x006f, B:19:0x0075, B:20:0x008d, B:22:0x0096, B:23:0x009e, B:31:0x00a5, B:33:0x00a9, B:35:0x00be, B:37:0x00c2, B:39:0x00c8, B:40:0x00e0, B:41:0x00ed, B:43:0x00f1, B:44:0x010a, B:46:0x0110, B:48:0x0118, B:49:0x0129, B:51:0x0133, B:53:0x0137, B:55:0x013d, B:57:0x0155, B:62:0x015e, B:63:0x0168, B:65:0x016c), top: B:4:0x0017, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0198 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r4v10, types: [X.69Q] */
    /* JADX WARN: Type inference failed for: r4v3, types: [X.Bhj] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.C5Hb A01(android.content.Context r25, X.InterfaceC11380iw r26, X.C5Hc r27) {
        /*
            Method dump skipped, instructions count: 461
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC132145xr.A01(android.content.Context, X.0iw, X.5Hc):X.5Hb");
    }

    public static final C5Hb A00(Context context, InterfaceC11380iw interfaceC11380iw, UserSession userSession, Double d, Integer num, List list, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        C5Hc c5Hc;
        if (Systrace.A0E(1L)) {
            C0fO.A01("TifuPostHelper.convertToPosts", -480504020);
        }
        if (list == null) {
            try {
                list = C16930sl.A00;
            } catch (Throwable th) {
                if (Systrace.A0E(1L)) {
                    C0fO.A00(-121834202);
                }
                throw th;
            }
        }
        ArrayList arrayList = new ArrayList();
        int i = 0;
        for (Object obj : list) {
            int i2 = i + 1;
            if (i < 0) {
                AbstractC16960so.A1U();
                throw C00O.createAndThrow();
            }
            C38321qM c38321qM = (C38321qM) obj;
            String id = c38321qM.getId();
            if (id != null) {
                if (Systrace.A0E(1L)) {
                    C0fO.A01("TifuPostHelper.toFeedPostRows", -1220890539);
                }
                try {
                    C5Hc A00 = C132155xs.A00.A00(userSession, c38321qM, d, num, i, true, false, true, z2, z3, z, z4, z5, z6, false, false);
                    if (Systrace.A0E(1L)) {
                        C0fO.A00(1944882357);
                    }
                    if (C18U.A06(C06090Tz.A05, userSession, 36326266454423333L)) {
                        c5Hc = A01(context, interfaceC11380iw, A00);
                    } else {
                        c5Hc = C5HZ.A01;
                    }
                    arrayList.add(new C9C6(c38321qM.A0C.C8I(), c38321qM, id, A00, c5Hc, C3YS.A00(userSession).A05(c38321qM)));
                } catch (Throwable th2) {
                    if (Systrace.A0E(1L)) {
                        C0fO.A00(-1442807197);
                        throw th2;
                    }
                    throw th2;
                }
            }
            i = i2;
        }
        C5Hb A03 = AbstractC133095zb.A03(arrayList);
        if (Systrace.A0E(1L)) {
            C0fO.A00(1422039293);
        }
        return A03;
    }
}
