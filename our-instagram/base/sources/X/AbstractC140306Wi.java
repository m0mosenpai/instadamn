package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.6Wi, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC140306Wi {
    public static final C101394gx A00(InterfaceC41201vU interfaceC41201vU) {
        List BlY;
        C14360o3.A0B(interfaceC41201vU, 0);
        if (interfaceC41201vU.CY4() && (BlY = interfaceC41201vU.BlY(EnumC75383a5.A0x)) != null && !BlY.isEmpty()) {
            return ((C84823qW) BlY.get(0)).A0D();
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [X.1OW, X.1OV] */
    public static final void A01(Context context, UserSession userSession, InterfaceC101404gy interfaceC101404gy, Integer num, Integer num2, String str, String str2, String str3, String str4, int i, boolean z) {
        C14360o3.A0B(userSession, 1);
        C14360o3.A0B(str2, 6);
        C14360o3.A0B(str4, 8);
        String A09 = AbstractC15820qc.A09(context);
        String A00 = AbstractC37865GlK.A00(interfaceC101404gy);
        ?? c1ow = new C1OW();
        c1ow.A04 = str;
        c1ow.A05 = A00;
        c1ow.A02 = num2;
        c1ow.A01 = num;
        c1ow.A06 = A09;
        c1ow.A07 = str2;
        c1ow.A03 = str3;
        c1ow.A08 = str4;
        c1ow.A00 = i;
        c1ow.A09 = false;
        c1ow.A0A = z;
        C26141Ov.A01(userSession).A0B(c1ow);
    }

    public static final int[] A02(UserSession userSession, InterfaceC41201vU interfaceC41201vU) {
        C14360o3.A0B(userSession, 0);
        C14360o3.A0B(interfaceC41201vU, 1);
        C101394gx A00 = A00(interfaceC41201vU);
        if (A00 != null) {
            return A03(userSession, A00, false);
        }
        throw new IllegalStateException("Required value was null.");
    }

    public static final int[] A04(UserSession userSession, InterfaceC101404gy interfaceC101404gy, boolean z) {
        int round;
        C14360o3.A0B(userSession, 0);
        C14360o3.A0B(interfaceC101404gy, 1);
        int[] A03 = A03(userSession, interfaceC101404gy, z);
        int length = A03.length;
        float f = 0.0f;
        for (int i : A03) {
            f += i;
        }
        int[] iArr = new int[length];
        if (f == 0.0f) {
            return A03;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < length; i3++) {
            if (i3 == length - 1) {
                round = 100 - i2;
                if (round < 0) {
                    round = 0;
                }
            } else {
                round = Math.round((A03[i3] / f) * 100.0f);
                i2 += round;
            }
            iArr[i3] = round;
        }
        return iArr;
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x00fe A[LOOP:0: B:43:0x00fc->B:44:0x00fe, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final int[] A03(com.instagram.common.session.UserSession r8, X.InterfaceC101404gy r9, boolean r10) {
        /*
            Method dump skipped, instructions count: 277
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC140306Wi.A03(com.instagram.common.session.UserSession, X.4gy, boolean):int[]");
    }
}
