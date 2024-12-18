package X;

import com.facebook.systrace.Systrace;
import com.instagram.common.session.UserSession;
import java.util.Arrays;

/* renamed from: X.3cz, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C77133cz {
    public final UserSession A00;
    public final InterfaceC77113cx A01;
    public final C59712oE A02;
    public final C57532kS A03;
    public final C57602kZ A04;

    public C77133cz(UserSession userSession, InterfaceC77113cx interfaceC77113cx) {
        C14360o3.A0B(interfaceC77113cx, 2);
        this.A00 = userSession;
        this.A01 = interfaceC77113cx;
        this.A03 = C57532kS.A00(userSession);
        this.A04 = C57602kZ.A00(userSession);
        this.A02 = new C59712oE(userSession);
    }

    public final int A01(C38321qM c38321qM) {
        C14360o3.A0B(c38321qM, 0);
        C57532kS c57532kS = this.A03;
        C57602kZ c57602kZ = this.A04;
        UserSession userSession = this.A00;
        return Arrays.hashCode(new Object[]{Integer.valueOf(c38321qM.A0w()), Integer.valueOf(c38321qM.A0s()), Boolean.valueOf(c57532kS.A0N(c38321qM)), Boolean.valueOf(c57602kZ.A0O(c38321qM)), Boolean.valueOf(c38321qM.A4k()), c38321qM.A20(), Boolean.valueOf(C77153d1.A00(userSession, c38321qM)), Boolean.valueOf(C77153d1.A01(userSession, c38321qM)), Integer.valueOf(c38321qM.A0p())});
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x005e, code lost:
    
        if (r79.A02.A02(r82) == false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0085, code lost:
    
        if (X.C18U.A06(X.C06090Tz.A05, r1.A00, 36328203484347718L) == false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00d0, code lost:
    
        if (r82.A5h() != false) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00ee, code lost:
    
        if (r1.A01() == false) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0197, code lost:
    
        if (X.C18U.A06(r8, r5, 36330668795642840L) != false) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x02ab, code lost:
    
        if (r0 != X.EnumC65592xv.A0p.ordinal()) goto L97;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0046, code lost:
    
        if (r79.A02.A02(r82) == false) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x02de, code lost:
    
        if (X.C18U.A06(r8, r0, 36328345218072026L) != false) goto L104;
     */
    /* JADX WARN: Removed duplicated region for block: B:102:0x02f6  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0227  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x029b  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x02c8  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x02ef  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C85233rE A02(android.content.Context r80, X.C84953qj r81, X.C38321qM r82, X.InterfaceC60442pS r83, X.C75113Zb r84) {
        /*
            Method dump skipped, instructions count: 967
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C77133cz.A02(android.content.Context, X.3qj, X.1qM, X.2pS, X.3Zb):X.3rE");
    }

    public static final void A00(String str, InterfaceC16820sZ interfaceC16820sZ) {
        if (Systrace.A0E(1L)) {
            C0fO.A01(AnonymousClass001.A0R("UseCaseActions/MediaUfi - ", str), 2092577082);
        }
        interfaceC16820sZ.invoke();
        if (Systrace.A0E(1L)) {
            C0fO.A00(174780795);
        }
    }
}
