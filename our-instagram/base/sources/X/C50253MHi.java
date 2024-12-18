package X;

import com.instagram.common.session.UserSession;
import java.util.LinkedHashMap;

/* renamed from: X.MHi, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C50253MHi extends C0YY implements InterfaceC16820sZ {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final String A03;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C50253MHi(Object obj, Object obj2, String str, int i) {
        super(0);
        this.A00 = i;
        this.A01 = obj;
        this.A02 = obj2;
        this.A03 = str;
    }

    public static C127395pI A00(UserSession userSession, String str) {
        return new C127395pI(userSession, new C42975IzR(userSession, str), EnumC64222vh.A03);
    }

    /* JADX WARN: Code restructure failed: missing block: B:67:0x0333, code lost:
    
        if (r2 == X.C3Q0.PREPARED) goto L66;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0004. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:14:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:16:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0351  */
    @Override // X.InterfaceC16820sZ
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ java.lang.Object invoke() {
        /*
            Method dump skipped, instructions count: 1858
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C50253MHi.invoke():java.lang.Object");
    }

    public static LinkedHashMap A01(UFS ufs, C50253MHi c50253MHi) {
        C70073W1q A05 = ufs.A05();
        Throwable th = (Throwable) c50253MHi.A01;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        C70199WGm.A08(A05, linkedHashMap);
        if (th != null) {
            linkedHashMap.put("error_message", C2Ql.A00(th));
        }
        return linkedHashMap;
    }
}
