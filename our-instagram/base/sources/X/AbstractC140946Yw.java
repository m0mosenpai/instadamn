package X;

import com.instagram.model.direct.DirectThreadKey;
import com.instagram.model.direct.threadkey.impl.MsysThreadId;
import com.instagram.model.direct.threadkey.impl.mixed.DirectMsysMixedThreadKey;
import kotlin.Deprecated;

/* renamed from: X.6Yw, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC140946Yw {
    public static final EnumC92794Ds A00(InterfaceC83713oG interfaceC83713oG) {
        C14360o3.A0B(interfaceC83713oG, 0);
        if (interfaceC83713oG instanceof InterfaceC83703oF) {
            return EnumC92794Ds.A05;
        }
        if (interfaceC83713oG instanceof InterfaceC2056098k) {
            return ((InterfaceC2056098k) interfaceC83713oG).CAo();
        }
        if (interfaceC83713oG instanceof C163787Us) {
            return EnumC92794Ds.A06;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Expected DirectThreadTarget or MsysThreadTarget: ");
        sb.append(interfaceC83713oG);
        throw new IllegalStateException(sb.toString());
    }

    public static final InterfaceC83703oF A01(InterfaceC83713oG interfaceC83713oG) {
        C14360o3.A0B(interfaceC83713oG, 0);
        InterfaceC83703oF A02 = A02(interfaceC83713oG);
        if (A02 != null) {
            return A02;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Expected DirectThreadTarget: ");
        sb.append(interfaceC83713oG);
        throw new IllegalStateException(sb.toString());
    }

    public static final InterfaceC83703oF A02(InterfaceC83713oG interfaceC83713oG) {
        C14360o3.A0B(interfaceC83713oG, 0);
        if (interfaceC83713oG instanceof InterfaceC83703oF) {
            return (InterfaceC83703oF) interfaceC83713oG;
        }
        if (interfaceC83713oG instanceof C163787Us) {
            return ((C163787Us) interfaceC83713oG).A00;
        }
        return null;
    }

    public static final InterfaceC2056098k A03(InterfaceC83713oG interfaceC83713oG) {
        C14360o3.A0B(interfaceC83713oG, 0);
        InterfaceC2056098k A04 = A04(interfaceC83713oG);
        if (A04 != null) {
            return A04;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Expected MsysThreadTarget: ");
        sb.append(interfaceC83713oG);
        throw new IllegalStateException(sb.toString());
    }

    public static final InterfaceC2056098k A04(InterfaceC83713oG interfaceC83713oG) {
        C14360o3.A0B(interfaceC83713oG, 0);
        if (interfaceC83713oG instanceof InterfaceC2056098k) {
            return (InterfaceC2056098k) interfaceC83713oG;
        }
        if (interfaceC83713oG instanceof C163787Us) {
            return ((C163787Us) interfaceC83713oG).A01;
        }
        return null;
    }

    public static final InterfaceC83733oI A05(InterfaceC83713oG interfaceC83713oG) {
        C83693oE c83693oE;
        MsysThreadId msysThreadId;
        C14360o3.A0B(interfaceC83713oG, 0);
        if (!(interfaceC83713oG instanceof InterfaceC83733oI)) {
            if (!(interfaceC83713oG instanceof C163787Us)) {
                return null;
            }
            C163787Us c163787Us = (C163787Us) interfaceC83713oG;
            InterfaceC83703oF interfaceC83703oF = c163787Us.A00;
            if (!(interfaceC83703oF instanceof C83693oE) || (c83693oE = (C83693oE) interfaceC83703oF) == null) {
                return null;
            }
            InterfaceC2056098k interfaceC2056098k = c163787Us.A01;
            if (!(interfaceC2056098k instanceof MsysThreadId) || (msysThreadId = (MsysThreadId) interfaceC2056098k) == null) {
                return null;
            }
            interfaceC83713oG = new EgH(c83693oE, msysThreadId);
        }
        return (InterfaceC83733oI) interfaceC83713oG;
    }

    @Deprecated(message = "Please use threadId (existing thread) or recipientIds (pending thread).")
    public static final C3o9 A06(InterfaceC83713oG interfaceC83713oG) {
        C14360o3.A0B(interfaceC83713oG, 0);
        Object obj = null;
        if (interfaceC83713oG instanceof C83693oE) {
            obj = new DirectThreadKey(((C83693oE) interfaceC83713oG).A00, null);
        } else if (interfaceC83713oG instanceof C122145g6) {
            obj = new DirectThreadKey(((C122145g6) interfaceC83713oG).A00);
        } else if (interfaceC83713oG instanceof MsysThreadId) {
            obj = interfaceC83713oG;
        } else if (interfaceC83713oG instanceof C163787Us) {
            C163787Us c163787Us = (C163787Us) interfaceC83713oG;
            InterfaceC2056098k interfaceC2056098k = c163787Us.A01;
            if (interfaceC2056098k instanceof MsysThreadId) {
                C3o9 A06 = A06(c163787Us.A00);
                C14360o3.A0C(A06, "null cannot be cast to non-null type com.instagram.model.direct.DirectThreadKey");
                C3o9 A062 = A06(interfaceC2056098k);
                C14360o3.A0C(A062, AbstractC43591JPw.A00(1210));
                obj = new DirectMsysMixedThreadKey((DirectThreadKey) A06, (MsysThreadId) A062);
            }
        } else {
            if (interfaceC83713oG instanceof C23974Ak9) {
                return null;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Cannot be converted to UnifiedThreadKey: ");
            sb.append(interfaceC83713oG);
            throw new IllegalStateException(sb.toString());
        }
        return (C3o9) obj;
    }

    public static final boolean A08(InterfaceC83713oG interfaceC83713oG) {
        C14360o3.A0B(interfaceC83713oG, 0);
        return A02(interfaceC83713oG) != null;
    }

    public static final boolean A07(InterfaceC83713oG interfaceC83713oG) {
        if ((interfaceC83713oG instanceof InterfaceC2056098k) && ((InterfaceC2056098k) interfaceC83713oG).CAo() == EnumC92794Ds.A04) {
            return true;
        }
        return false;
    }
}
