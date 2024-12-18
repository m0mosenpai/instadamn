package X;

import com.instagram.model.direct.threadkey.impl.MsysThreadId;
import com.instagram.model.direct.threadkey.impl.mixed.DirectMsysMixedThreadKey;
import kotlin.Deprecated;

/* renamed from: X.66e, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC1345466e {
    public static final C83693oE A01(InterfaceC83733oI interfaceC83733oI) {
        C14360o3.A0B(interfaceC83733oI, 0);
        C83693oE A02 = A02(interfaceC83733oI);
        if (A02 != null) {
            return A02;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Expected DirectThreadId: ");
        sb.append(interfaceC83733oI);
        throw new IllegalStateException(sb.toString());
    }

    public static final C83693oE A02(InterfaceC83733oI interfaceC83733oI) {
        C14360o3.A0B(interfaceC83733oI, 0);
        if (interfaceC83733oI instanceof C83693oE) {
            return (C83693oE) interfaceC83733oI;
        }
        if (interfaceC83733oI instanceof EgH) {
            return ((EgH) interfaceC83733oI).A00;
        }
        return null;
    }

    public static final MsysThreadId A03(InterfaceC83733oI interfaceC83733oI) {
        C14360o3.A0B(interfaceC83733oI, 0);
        MsysThreadId A04 = A04(interfaceC83733oI);
        if (A04 != null) {
            return A04;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Expected MsysThreadId: ");
        sb.append(interfaceC83733oI);
        throw new IllegalStateException(sb.toString());
    }

    public static final MsysThreadId A04(InterfaceC83733oI interfaceC83733oI) {
        C14360o3.A0B(interfaceC83733oI, 0);
        if (interfaceC83733oI instanceof MsysThreadId) {
            return (MsysThreadId) interfaceC83733oI;
        }
        if (interfaceC83733oI instanceof EgH) {
            return ((EgH) interfaceC83733oI).A01;
        }
        return null;
    }

    public static final C3o9 A05(InterfaceC83733oI interfaceC83733oI) {
        Object obj;
        C14360o3.A0B(interfaceC83733oI, 0);
        if (interfaceC83733oI instanceof C83693oE) {
            obj = C7P4.A00((C83693oE) interfaceC83733oI);
        } else {
            boolean z = interfaceC83733oI instanceof MsysThreadId;
            obj = interfaceC83733oI;
            if (!z) {
                if (interfaceC83733oI instanceof EgH) {
                    EgH egH = (EgH) interfaceC83733oI;
                    obj = new DirectMsysMixedThreadKey(C7P4.A00(egH.A00), egH.A01);
                } else {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Expected DirectThreadId or MsysThreadId: ");
                    sb.append(interfaceC83733oI);
                    throw new IllegalStateException(sb.toString());
                }
            }
        }
        return (C3o9) obj;
    }

    @Deprecated(message = "DO NOT USE THIS METHOD. Passing around thread IDs as raw Strings is dangerous and is a sign that code is not properly data source agnostic.")
    public static final String A06(InterfaceC83733oI interfaceC83733oI) {
        C83693oE c83693oE;
        C14360o3.A0B(interfaceC83733oI, 0);
        if (interfaceC83733oI instanceof C83693oE) {
            c83693oE = (C83693oE) interfaceC83733oI;
        } else {
            if (interfaceC83733oI instanceof MsysThreadId) {
                return String.valueOf(((MsysThreadId) interfaceC83733oI).A00);
            }
            if (interfaceC83733oI instanceof EgH) {
                c83693oE = ((EgH) interfaceC83733oI).A00;
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("Expected DirectThreadId or MsysThreadId: ");
                sb.append(interfaceC83733oI);
                throw new IllegalStateException(sb.toString());
            }
        }
        return c83693oE.A00;
    }

    public static final String A07(InterfaceC83733oI interfaceC83733oI) {
        C83693oE c83693oE;
        C14360o3.A0B(interfaceC83733oI, 0);
        if (interfaceC83733oI instanceof C83693oE) {
            c83693oE = (C83693oE) interfaceC83733oI;
        } else {
            if (interfaceC83733oI instanceof MsysThreadId) {
                return "-1";
            }
            if (interfaceC83733oI instanceof EgH) {
                c83693oE = ((EgH) interfaceC83733oI).A00;
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("Expected DirectThreadId or MsysThreadId: ");
                sb.append(interfaceC83733oI);
                throw new IllegalStateException(sb.toString());
            }
        }
        return c83693oE.A00;
    }

    public static final EnumC92794Ds A00(InterfaceC83733oI interfaceC83733oI) {
        if (interfaceC83733oI instanceof C83693oE) {
            return EnumC92794Ds.A05;
        }
        if (interfaceC83733oI instanceof C163787Us) {
            return EnumC92794Ds.A06;
        }
        if (interfaceC83733oI instanceof MsysThreadId) {
            return ((MsysThreadId) interfaceC83733oI).A01;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Expected DirectThreadId or MsysThreadId: ");
        sb.append(interfaceC83733oI);
        throw new IllegalStateException(sb.toString());
    }
}
