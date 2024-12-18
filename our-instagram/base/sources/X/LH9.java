package X;

import com.instagram.common.session.UserSession;
import kotlin.Deprecated;

/* loaded from: classes8.dex */
public abstract class LH9 {
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00a0, code lost:
    
        if (r7.length == 0) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x004a, code lost:
    
        if (r0 == false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A01(android.content.Context r14, X.C74843Xy r15, X.C206409Bx r16, X.InterfaceC11380iw r17, com.instagram.common.session.UserSession r18, com.instagram.common.typedurl.ImageUrl r19, X.AnonymousClass791 r20, X.C158827Au r21, X.C7IM r22, java.lang.Integer r23) {
        /*
            Method dump skipped, instructions count: 282
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.LH9.A01(android.content.Context, X.3Xy, X.9Bx, X.0iw, com.instagram.common.session.UserSession, com.instagram.common.typedurl.ImageUrl, X.791, X.7Au, X.7IM, java.lang.Integer):void");
    }

    public static final int A00(EnumC46175KcD enumC46175KcD) {
        switch (enumC46175KcD.ordinal()) {
            case 0:
                return 0;
            case 1:
                return 1;
            case 2:
                return 2;
            case 3:
                return 3;
            case 4:
                return 4;
            default:
                return 5;
        }
    }

    @Deprecated(message = "Use other bindView")
    public static final void A02(C206409Bx c206409Bx, InterfaceC11380iw interfaceC11380iw, UserSession userSession, C158827Au c158827Au) {
        boolean A1b = AbstractC43593JPy.A1b(c158827Au);
        C86073se c86073se = c158827Au.A00;
        C47790L8w c47790L8w = (C47790L8w) c206409Bx.A00;
        boolean z = false;
        C116355Oo A00 = C3h3.A00(new C70591WdT(c47790L8w.A02, c47790L8w.A01, A00(c47790L8w.A00), c206409Bx.A01), null, AbstractC86053sc.A00, -1, A1b);
        if (c47790L8w.A03) {
            z = AbstractC31176DnK.A1a(C06090Tz.A05, userSession, 36329006643036113L);
        }
        AbstractC86053sc.A02(interfaceC11380iw, A00, c86073se, new float[8], true, z, A1b);
    }
}
