package X;

import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import java.util.List;

/* renamed from: X.7HR, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C7HR extends C7H2 {
    public final UserSession A00;
    public final C7FK A01;
    public final InterfaceC16820sZ A02;

    public static final boolean A00(C7HR c7hr, Integer num) {
        UserSession userSession;
        C06090Tz c06090Tz;
        long j;
        List BSH;
        User user;
        if (num == null) {
            return false;
        }
        C2EE c2ee = (C2EE) c7hr.A02.invoke();
        int intValue = num.intValue();
        if (intValue == 1012) {
            if (c2ee == null || (BSH = c2ee.BSH()) == null || (user = (User) AbstractC001800i.A0J(BSH)) == null || !user.A1U()) {
                return false;
            }
            userSession = c7hr.A00;
            c06090Tz = C06090Tz.A05;
            j = 36325669453837559L;
        } else {
            if (intValue != 1014) {
                return false;
            }
            userSession = c7hr.A00;
            c06090Tz = C06090Tz.A05;
            j = 36325669453968633L;
        }
        return C18U.A06(c06090Tz, userSession, j);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ C7HR(com.instagram.common.session.UserSession r13, X.InterfaceC160027Fo r14, final X.InterfaceC160017Fn r15, X.InterfaceC16820sZ r16) {
        /*
            r12 = this;
            X.7G5 r0 = X.C7G5.A00
            r2 = r13
            boolean r0 = r0.A01(r13)
            if (r0 == 0) goto L34
            X.7GY r3 = X.C7GY.A07
        Lb:
            X.7GX r4 = X.C7GX.A03
            X.7GY r0 = X.C7GY.A07
            if (r3 != r0) goto L2e
            X.7H5 r5 = new X.7H5
            r5.<init>(r3, r4, r14)
        L16:
            r8 = -1
            r6 = 0
            r11 = 64
            r1 = r12
            r7 = r16
            r9 = r8
            r10 = r8
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            r12.A00 = r13
            r12.A02 = r7
            X.7FK r0 = new X.7FK
            r0.<init>(r13)
            r12.A01 = r0
            return
        L2e:
            X.7HS r5 = new X.7HS
            r5.<init>(r15)
            goto L16
        L34:
            X.7GY r3 = X.C7GY.A04
            goto Lb
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C7HR.<init>(com.instagram.common.session.UserSession, X.7Fo, X.7Fn, X.0sZ):void");
    }
}
