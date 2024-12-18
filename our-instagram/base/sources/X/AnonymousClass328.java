package X;

import com.instagram.common.session.UserSession;
import java.util.Map;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.328, reason: invalid class name */
/* loaded from: classes2.dex */
public abstract class AnonymousClass328 {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ AnonymousClass328[] A01;
    public static final AnonymousClass328 A02;
    public static final AnonymousClass328 A03;
    public static final AnonymousClass328 A04;

    /* JADX WARN: Code restructure failed: missing block: B:18:0x00fb, code lost:
    
        if (r22.A00().Byg() != X.C05F.A01) goto L13;
     */
    /* JADX WARN: Removed duplicated region for block: B:34:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x010a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int A01(com.instagram.common.session.UserSession r17, X.InterfaceC62242sP r18, X.InterfaceC669530m r19, X.InterfaceC671231d r20, X.C31E r21, X.C1PY r22, X.InterfaceC671531g r23, java.util.Map r24, int r25, boolean r26, boolean r27, boolean r28) {
        /*
            Method dump skipped, instructions count: 318
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass328.A01(com.instagram.common.session.UserSession, X.2sP, X.30m, X.31d, X.31E, X.1PY, X.31g, java.util.Map, int, boolean, boolean, boolean):int");
    }

    public final InterfaceC42381xS A02(UserSession userSession, InterfaceC62242sP interfaceC62242sP, InterfaceC671231d interfaceC671231d, Map map) {
        Object BUM;
        C5I5 c5i5;
        C14360o3.A0B(interfaceC671231d, 0);
        C14360o3.A0B(map, 1);
        C14360o3.A0B(interfaceC62242sP, 2);
        InterfaceC42381xS Cpq = interfaceC671231d.Cpq();
        if (Cpq != null && (BUM = Cpq.BUM()) != null && A00(userSession, interfaceC62242sP, BUM)) {
            C5I4 c5i4 = (C5I4) map.get(interfaceC62242sP.BF8(BUM));
            if (c5i4 != null) {
                c5i5 = c5i4.C03();
            } else {
                c5i5 = null;
            }
            if (c5i5 == C5I5.A03) {
                return Cpq;
            }
        }
        return null;
    }

    static {
        AnonymousClass328 anonymousClass328 = new AnonymousClass328() { // from class: X.329
        };
        A02 = anonymousClass328;
        AnonymousClass328 anonymousClass3282 = new AnonymousClass328() { // from class: X.32A
        };
        A04 = anonymousClass3282;
        AnonymousClass328 anonymousClass3283 = new AnonymousClass328() { // from class: X.32B
        };
        A03 = anonymousClass3283;
        AnonymousClass328[] anonymousClass328Arr = {anonymousClass328, anonymousClass3282, anonymousClass3283};
        A01 = anonymousClass328Arr;
        A00 = AbstractC12190kN.A00(anonymousClass328Arr);
    }

    public static final boolean A00(UserSession userSession, InterfaceC62242sP interfaceC62242sP, Object obj) {
        if (interfaceC62242sP.BVE(obj) != C05F.A00 || userSession == null) {
            return true;
        }
        return !C18U.A06(C06090Tz.A06, userSession, 36317792484005445L);
    }

    public AnonymousClass328(String str, int i) {
    }
}
