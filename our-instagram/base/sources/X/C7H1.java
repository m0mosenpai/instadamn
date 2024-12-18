package X;

import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import java.util.List;

/* renamed from: X.7H1, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C7H1 extends C7H2 {
    public final UserSession A00;
    public final C7FK A01;
    public final C159947Fg A02;
    public final InterfaceC16820sZ A03;
    public final boolean A04;

    public static final boolean A00(C7H1 c7h1, Integer num) {
        UserSession userSession;
        C06090Tz c06090Tz;
        long j;
        List BSH;
        User user;
        if (num == null) {
            return false;
        }
        C2EE c2ee = (C2EE) c7h1.A03.invoke();
        int intValue = num.intValue();
        if (intValue == 1012) {
            if (c2ee == null || (BSH = c2ee.BSH()) == null || (user = (User) AbstractC001800i.A0J(BSH)) == null || !user.A1U()) {
                return false;
            }
            userSession = c7h1.A00;
            c06090Tz = C06090Tz.A05;
            j = 36325669453772022L;
        } else {
            if (intValue != 1014) {
                return false;
            }
            userSession = c7h1.A00;
            c06090Tz = C06090Tz.A05;
            j = 36325669454034170L;
        }
        return C18U.A06(c06090Tz, userSession, j);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C7H1(com.instagram.common.session.UserSession r13, X.C7GY r14, X.InterfaceC160027Fo r15, X.C159947Fg r16, X.InterfaceC16820sZ r17, boolean r18) {
        /*
            r12 = this;
            r8 = 2131963057(0x7f132cb1, float:1.9562857E38)
            r9 = 2131238703(0x7f081f2f, float:1.8093692E38)
            X.7GX r4 = X.C7GX.A06
            X.7GY r0 = X.C7GY.A07
            r3 = r14
            if (r14 != r0) goto L33
            X.7H5 r5 = new X.7H5
            r5.<init>(r14, r4, r15)
        L12:
            X.7H3 r5 = (X.C7H3) r5
            r6 = 0
            r11 = 64
            r1 = r12
            r2 = r13
            r7 = r17
            r10 = r8
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            r12.A00 = r13
            r12.A03 = r7
            r0 = r16
            r12.A02 = r0
            r0 = r18
            r12.A04 = r0
            X.7FK r0 = new X.7FK
            r0.<init>(r13)
            r12.A01 = r0
            return
        L33:
            X.7H4 r5 = new X.7H4
            r5.<init>()
            goto L12
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C7H1.<init>(com.instagram.common.session.UserSession, X.7GY, X.7Fo, X.7Fg, X.0sZ, boolean):void");
    }
}
