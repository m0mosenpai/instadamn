package X;

import android.content.Context;
import android.media.MediaCodecInfo;
import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.7pw, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C174627pw implements InterfaceC174637px {
    public int A00;
    public final Context A01;
    public final UserSession A02;

    public C174627pw(UserSession userSession, Context context) {
        C14360o3.A0B(userSession, 1);
        C14360o3.A0B(context, 2);
        this.A02 = userSession;
        Context applicationContext = context.getApplicationContext();
        C14360o3.A07(applicationContext);
        this.A01 = applicationContext;
        this.A00 = 2200;
    }

    @Override // X.InterfaceC174637px
    public final C176997tv ApU(EnumC174667q0 enumC174667q0, EnumC174667q0 enumC174667q02, List list, List list2, List list3, List list4, int i, int i2, int i3) {
        C176877tj A00;
        C176877tj c176877tj;
        C176877tj c176877tj2;
        int i4;
        C14360o3.A0B(list, 0);
        C14360o3.A0B(list2, 1);
        C14360o3.A0B(list3, 2);
        List A002 = AbstractC176907tm.A00(AbstractC176907tm.A01, AbstractC176887tk.A01(list3, list2));
        C14360o3.A07(A002);
        int min = Math.min(i2, i);
        float max = Math.max(i2, i) / min;
        int i5 = 1080;
        int min2 = Math.min(1080, min);
        C176877tj A003 = AbstractC176887tk.A00(A002, Math.round(min2 * max), min2);
        C14360o3.A07(A003);
        if (A003.A01 == 1080 && A003.A02 == 1920 && AbstractC176977tt.A00(this.A01)) {
            A00 = new C176877tj(1920, 1080);
        } else {
            Context context = this.A01;
            UserSession userSession = this.A02;
            if (!AbstractC176977tt.A00(context) || min <= 720 || !C18U.A06(C06090Tz.A05, userSession, 36323723833257527L)) {
                i5 = 720;
            }
            int min3 = Math.min(i5, min);
            A00 = AbstractC176887tk.A00(A002, Math.round(min3 * max), min3);
            C14360o3.A07(A00);
        }
        if (A00.A01 == 1080) {
            MediaCodecInfo.CodecCapabilities A004 = AbstractC176987tu.A00();
            if (A004 != null && A004.getVideoCapabilities() != null) {
                A004.getVideoCapabilities().getWidthAlignment();
            }
            MediaCodecInfo.CodecCapabilities A005 = AbstractC176987tu.A00();
            if (A005 != null && A005.getVideoCapabilities() != null) {
                i4 = A005.getVideoCapabilities().getHeightAlignment();
            } else {
                i4 = 16;
            }
            int i6 = 1080;
            if (1080 % i4 != 0) {
                i6 = 1088;
            }
            c176877tj = new C176877tj(1920, i6);
        } else {
            c176877tj = A00;
        }
        C176877tj A006 = A00(A00, list);
        if (list4 != null) {
            c176877tj2 = A00(A00, list4);
        } else {
            c176877tj2 = null;
        }
        return new C176997tv(A00, A006, c176877tj, c176877tj2);
    }

    @Override // X.InterfaceC174637px
    public final C176997tv Bcq(EnumC174667q0 enumC174667q0, List list, List list2, int i, int i2, int i3) {
        return new C176997tv(null, null, null, null);
    }

    @Override // X.InterfaceC174637px
    public final C176997tv Bfv(List list, int i, int i2, int i3) {
        return new C176997tv(null, null, null, null);
    }

    @Override // X.InterfaceC174637px
    public final C176997tv CFI(EnumC174667q0 enumC174667q0, List list, List list2, int i, int i2, int i3) {
        return new C176997tv(null, null, null, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0065 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0046 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final X.C176877tj A00(X.C176877tj r12, java.util.List r13) {
        /*
            r11 = this;
            java.util.HashMap r0 = X.AbstractC176907tm.A00
            java.util.List r4 = X.AbstractC176907tm.A00(r0, r13)
            X.C14360o3.A07(r4)
            int r6 = r11.A00
            r0 = 0
            java.lang.Object r8 = r4.get(r0)
            X.7tj r8 = (X.C176877tj) r8
            int r7 = r4.size()
            r5 = 1
        L17:
            if (r5 >= r7) goto L2f
            java.lang.Object r3 = r4.get(r5)
            X.7tj r3 = (X.C176877tj) r3
            int r2 = r3.A02
            int r0 = r3.A01
            int r2 = r2 * r0
            int r1 = r8.A02
            int r0 = r8.A01
            int r1 = r1 * r0
            if (r2 <= r1) goto L2c
            r8 = r3
        L2c:
            int r5 = r5 + 1
            goto L17
        L2f:
            int r0 = r8.A02
            float r7 = (float) r0
            int r0 = r8.A01
            float r0 = (float) r0
            float r7 = r7 / r0
            int r0 = r12.A02
            float r5 = (float) r0
            int r0 = r12.A01
            float r0 = (float) r0
            float r5 = r5 / r0
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Iterator r8 = r4.iterator()
        L46:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L70
            java.lang.Object r2 = r8.next()
            X.7tj r2 = (X.C176877tj) r2
            int r0 = r2.A02
            float r1 = (float) r0
            int r0 = r2.A01
            float r0 = (float) r0
            float r1 = r1 / r0
            int r0 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r0 >= 0) goto L69
            int r0 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r0 < 0) goto L46
            int r0 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
        L63:
            if (r0 > 0) goto L46
            r3.add(r2)
            goto L46
        L69:
            int r0 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r0 < 0) goto L46
            int r0 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            goto L63
        L70:
            boolean r0 = r3.isEmpty()
            if (r0 != 0) goto L77
            r4 = r3
        L77:
            java.util.Iterator r10 = r4.iterator()
            r9 = 0
            r7 = r9
            r8 = r9
        L7e:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto Lb8
            java.lang.Object r4 = r10.next()
            X.7tj r4 = (X.C176877tj) r4
            boolean r0 = X.AbstractC176887tk.A02(r4)
            if (r0 != 0) goto L7e
            if (r8 != 0) goto L93
            r8 = r4
        L93:
            int r0 = r4.A02
            float r3 = (float) r0
            float r1 = r3 / r5
            int r2 = r4.A01
            float r0 = (float) r2
            float r1 = r1 - r0
            float r1 = java.lang.Math.abs(r1)
            r0 = 1036831949(0x3dcccccd, float:0.1)
            float r3 = r3 * r0
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 >= 0) goto L7e
            if (r7 != 0) goto Lac
            r7 = r4
            goto L7e
        Lac:
            int r0 = r7.A01
            if (r0 <= r6) goto Lb2
            if (r2 < r0) goto Lb6
        Lb2:
            if (r0 >= r2) goto L7e
            if (r2 >= r6) goto L7e
        Lb6:
            r7 = r4
            goto L7e
        Lb8:
            if (r7 != 0) goto Lbe
            r7 = r9
            if (r8 == 0) goto Lbe
            return r8
        Lbe:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C174627pw.A00(X.7tj, java.util.List):X.7tj");
    }
}
