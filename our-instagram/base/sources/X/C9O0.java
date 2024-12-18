package X;

import android.graphics.Rect;
import com.instagram.common.session.UserSession;
import com.instagram.direct.stella.StellaIpcDirectMessagingServiceClient;
import com.instagram.pendingmedia.model.ClipInfo;

/* renamed from: X.9O0, reason: invalid class name */
/* loaded from: classes4.dex */
public abstract class C9O0 {
    public static final ClipInfo A00(UserSession userSession, C195868lW c195868lW, C44059Jdk c44059Jdk, int i, int i2) {
        ClipInfo clipInfo;
        int i3;
        int i4;
        int A00;
        C44059Jdk c44059Jdk2 = c44059Jdk;
        C14360o3.A0B(userSession, 3);
        if (c44059Jdk == null) {
            if (c195868lW.A00 == 2) {
                c44059Jdk2 = new C44059Jdk(c195868lW.A0k, c195868lW.A01, c195868lW.A07, false);
            } else {
                c44059Jdk2 = C44059Jdk.A00(c195868lW.A0k, 0);
            }
            C14360o3.A07(c44059Jdk2);
        }
        float f = i / i2;
        if (c195868lW.A0v == null && c195868lW.A18) {
            String str = c44059Jdk2.A07;
            C14360o3.A07(str);
            clipInfo = MY3.A03(userSession, str, c44059Jdk2.A03, StellaIpcDirectMessagingServiceClient.KEEP_CONNECTION_ALIVE_MS);
            clipInfo.A00 = f;
            clipInfo.A07 = c195868lW.A0H;
            if (c195868lW.A1G) {
                clipInfo.A07 = c195868lW.A0J;
                i4 = c195868lW.A0I;
            } else {
                i4 = c195868lW.A06;
                if (i4 <= 0) {
                    int i5 = clipInfo.A05;
                    if (i5 > 15000) {
                        if (!c195868lW.A1C) {
                            A00 = 60000;
                        } else {
                            A00 = C1LE.A00(userSession);
                        }
                        i4 = Math.min(i5, A00);
                    }
                }
            }
            clipInfo.A05 = i4;
        } else {
            clipInfo = new ClipInfo(null, 16777215);
            clipInfo.A03 = c195868lW.A01;
            if (c195868lW.A19) {
                int i6 = c195868lW.A0K;
                int i7 = c195868lW.A08;
                clipInfo.A09 = i6;
                clipInfo.A06 = i7;
                clipInfo.A0C = Integer.valueOf(c195868lW.A09);
            } else {
                int i8 = c195868lW.A08;
                int i9 = c195868lW.A0K;
                clipInfo.A09 = i8;
                clipInfo.A06 = i9;
            }
            int i10 = c195868lW.A0B;
            if (i10 > 0 && (i3 = c195868lW.A0A) > 0) {
                f = i10 / i3;
            }
            clipInfo.A00 = f;
            if (c195868lW.A1I || c195868lW.A13) {
                clipInfo.A0J = true;
                clipInfo.A0E = "boomerang";
            }
            long j = c44059Jdk2.A03;
            clipInfo.A07 = c195868lW.A0H;
            int i11 = c195868lW.A06;
            if (i11 <= 0) {
                i11 = (int) j;
            }
            clipInfo.A05 = i11;
            clipInfo.A0A = j;
            clipInfo.A0F = c195868lW.A0k;
        }
        if (c195868lW.A15) {
            clipInfo.A0K = true;
        }
        Rect A01 = c195868lW.A01();
        if (A01 != null && A01.width() == A01.height() && i != i2) {
            clipInfo.A0N = true;
        }
        clipInfo.A0O = c44059Jdk2.A09;
        return clipInfo;
    }
}
