package com.instagram.quickpromotion.sdk;

import X.AbstractC09440dt;
import X.AbstractC12990ll;
import X.AbstractC31546DtW;
import X.C05F;
import X.C12P;
import X.C12T;
import X.C14360o3;
import X.C55412gg;
import X.C55442gk;
import X.C55452gl;
import X.C9EO;
import X.InterfaceC09390do;
import X.InterfaceC13060ls;
import X.InterfaceC16660sJ;
import X.InterfaceC16820sZ;
import com.instagram.common.session.UserSession;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;

/* loaded from: classes2.dex */
public final class InstagramQpSdkModule implements InterfaceC13060ls {
    public static final Set A05;
    public static final InterfaceC16660sJ A06;
    public final UserSession A00;
    public final C55452gl A01;
    public final C55412gg A02;
    public final InterfaceC09390do A03;
    public final InterfaceC16820sZ A04;

    public /* synthetic */ InstagramQpSdkModule(UserSession userSession) {
        C9EO c9eo = new C9EO(userSession, 7);
        C55452gl c55452gl = (C55452gl) C55452gl.A02.getValue();
        C55412gg c55412gg = C55412gg.A02;
        this.A00 = userSession;
        this.A04 = c9eo;
        this.A01 = c55452gl;
        this.A02 = c55412gg;
        this.A03 = AbstractC09440dt.A01(new C9EO(this, 9));
    }

    @Override // X.InterfaceC13060ls
    public final void Cww(AbstractC12990ll abstractC12990ll) {
    }

    @Override // X.InterfaceC13060ls
    public final void Cwy(AbstractC12990ll abstractC12990ll) {
        C14360o3.A0B(abstractC12990ll, 0);
        try {
            if ((abstractC12990ll instanceof UserSession) && ((UserSession) abstractC12990ll) != null) {
                synchronized (this) {
                    this.A03.getValue();
                    C12T c12t = C12P.A00;
                }
            }
        } catch (Exception e) {
            UserSession userSession = this.A00;
            if (userSession != null) {
                AbstractC31546DtW.A00(userSession, C05F.A1F, "Error getting promotions on app foreground", e);
            }
        }
    }

    static {
        Set newSetFromMap = Collections.newSetFromMap(new WeakHashMap(8));
        C14360o3.A07(newSetFromMap);
        A05 = newSetFromMap;
        A06 = C55442gk.A00;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(7:1|(2:3|(4:5|6|7|(1:(8:10|11|12|(4:15|(2:17|(2:30|(2:32|33)(1:34))(2:21|(2:25|26)))(2:35|(2:37|38)(1:39))|27|13)|40|41|42|(10:44|(4:47|(3:50|(3:52|(3:60|61|(6:63|64|(2:67|65)|68|69|70)(1:71))(3:54|(2:57|55)|58)|59)(1:72)|48)|76|45)|77|78|(2:81|79)|82|83|(3:90|(1:92)|93)(1:85)|86|(7:88|12|(1:13)|40|41|42|(5:94|95|(1:97)|98|99)(0))(1:89))(0))(2:100|101))(5:102|84|114|42|(0)(0))))|124|6|7|(0)(0)|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x037d, code lost:
    
        r1 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x037e, code lost:
    
        r0 = new X.C09540e5(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x037c, code lost:
    
        throw new java.lang.NullPointerException(X.AnonymousClass001.A0R(X.AbstractC58317Pt9.A00(889), X.SSP.A01(r1)));
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0237 A[Catch: all -> 0x037d, TryCatch #2 {all -> 0x037d, blocks: (B:11:0x021d, B:12:0x0220, B:13:0x0231, B:15:0x0237, B:23:0x0251, B:25:0x0255, B:27:0x0341, B:30:0x02ef, B:32:0x02f3, B:35:0x02a5, B:37:0x02a9, B:41:0x0346, B:42:0x00c9, B:44:0x00cf, B:45:0x0108, B:47:0x010e, B:48:0x0118, B:50:0x011e, B:52:0x012a, B:61:0x0136, B:64:0x013c, B:65:0x0141, B:67:0x0147, B:69:0x0152, B:55:0x0156, B:57:0x015c, B:73:0x0369, B:74:0x037c, B:78:0x0167, B:79:0x0185, B:81:0x018b, B:83:0x01b3, B:85:0x01f5, B:90:0x01f8, B:92:0x0202, B:93:0x0204, B:94:0x034d, B:103:0x0084, B:113:0x00b0, B:114:0x00b1, B:119:0x0367, B:105:0x0085, B:106:0x0093, B:112:0x00af, B:116:0x0364, B:117:0x0365, B:108:0x0094, B:110:0x00a1), top: B:7:0x0029, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00cf A[Catch: all -> 0x037d, TryCatch #2 {all -> 0x037d, blocks: (B:11:0x021d, B:12:0x0220, B:13:0x0231, B:15:0x0237, B:23:0x0251, B:25:0x0255, B:27:0x0341, B:30:0x02ef, B:32:0x02f3, B:35:0x02a5, B:37:0x02a9, B:41:0x0346, B:42:0x00c9, B:44:0x00cf, B:45:0x0108, B:47:0x010e, B:48:0x0118, B:50:0x011e, B:52:0x012a, B:61:0x0136, B:64:0x013c, B:65:0x0141, B:67:0x0147, B:69:0x0152, B:55:0x0156, B:57:0x015c, B:73:0x0369, B:74:0x037c, B:78:0x0167, B:79:0x0185, B:81:0x018b, B:83:0x01b3, B:85:0x01f5, B:90:0x01f8, B:92:0x0202, B:93:0x0204, B:94:0x034d, B:103:0x0084, B:113:0x00b0, B:114:0x00b1, B:119:0x0367, B:105:0x0085, B:106:0x0093, B:112:0x00af, B:116:0x0364, B:117:0x0365, B:108:0x0094, B:110:0x00a1), top: B:7:0x0029, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x034d A[Catch: all -> 0x037d, TRY_LEAVE, TryCatch #2 {all -> 0x037d, blocks: (B:11:0x021d, B:12:0x0220, B:13:0x0231, B:15:0x0237, B:23:0x0251, B:25:0x0255, B:27:0x0341, B:30:0x02ef, B:32:0x02f3, B:35:0x02a5, B:37:0x02a9, B:41:0x0346, B:42:0x00c9, B:44:0x00cf, B:45:0x0108, B:47:0x010e, B:48:0x0118, B:50:0x011e, B:52:0x012a, B:61:0x0136, B:64:0x013c, B:65:0x0141, B:67:0x0147, B:69:0x0152, B:55:0x0156, B:57:0x015c, B:73:0x0369, B:74:0x037c, B:78:0x0167, B:79:0x0185, B:81:0x018b, B:83:0x01b3, B:85:0x01f5, B:90:0x01f8, B:92:0x0202, B:93:0x0204, B:94:0x034d, B:103:0x0084, B:113:0x00b0, B:114:0x00b1, B:119:0x0367, B:105:0x0085, B:106:0x0093, B:112:0x00af, B:116:0x0364, B:117:0x0365, B:108:0x0094, B:110:0x00a1), top: B:7:0x0029, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:68:0x021a -> B:12:0x0220). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object A00(android.content.Context r35, com.instagram.common.session.UserSession r36, X.InterfaceC55322gX r37, X.C55732hE r38, X.C61102qY r39, X.C917748z r40, com.instagram.quickpromotion.sdk.InstagramQpSdkModule r41, java.util.Map r42, X.InterfaceC23621Ds r43, X.C19L r44) {
        /*
            Method dump skipped, instructions count: 930
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.quickpromotion.sdk.InstagramQpSdkModule.A00(android.content.Context, com.instagram.common.session.UserSession, X.2gX, X.2hE, X.2qY, X.48z, com.instagram.quickpromotion.sdk.InstagramQpSdkModule, java.util.Map, X.1Ds, X.19L):java.lang.Object");
    }
}
