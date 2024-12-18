package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* renamed from: X.OVq, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C55008OVq {
    public final Context A00;
    public final UserSession A01;
    public final InterfaceC16820sZ A02;
    public final InterfaceC16820sZ A03;
    public final InterfaceC16820sZ A04;

    public static final C81663kb A00(C55008OVq c55008OVq) {
        String str;
        InterfaceC16820sZ interfaceC16820sZ = c55008OVq.A02;
        C51677Ms8 c51677Ms8 = (C51677Ms8) interfaceC16820sZ.invoke();
        String str2 = null;
        if (c51677Ms8 == null || (str = c51677Ms8.A04) == null) {
            C51679MsA c51679MsA = (C51679MsA) c55008OVq.A04.invoke();
            if (c51679MsA != null) {
                str = c51679MsA.A05;
            } else {
                C51678Ms9 c51678Ms9 = (C51678Ms9) c55008OVq.A03.invoke();
                if (c51678Ms9 == null || (str = c51678Ms9.A08) == null) {
                    return null;
                }
            }
        }
        C51677Ms8 c51677Ms82 = (C51677Ms8) interfaceC16820sZ.invoke();
        if (c51677Ms82 != null) {
            str2 = c51677Ms82.A05;
        }
        return C2DU.A04((C2DU) AbstractC28761aE.A00(c55008OVq.A01), str, str2);
    }

    public final String A01() {
        String str;
        C51677Ms8 c51677Ms8 = (C51677Ms8) this.A02.invoke();
        if (c51677Ms8 == null || (str = c51677Ms8.A04) == null) {
            C51679MsA c51679MsA = (C51679MsA) this.A04.invoke();
            if (c51679MsA != null) {
                return c51679MsA.A05;
            }
            return null;
        }
        return str;
    }

    public C55008OVq(Context context, UserSession userSession, InterfaceC16820sZ interfaceC16820sZ, InterfaceC16820sZ interfaceC16820sZ2, InterfaceC16820sZ interfaceC16820sZ3) {
        this.A00 = context;
        this.A01 = userSession;
        this.A02 = interfaceC16820sZ;
        this.A04 = interfaceC16820sZ2;
        this.A03 = interfaceC16820sZ3;
    }
}
