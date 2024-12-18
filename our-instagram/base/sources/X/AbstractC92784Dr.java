package X;

import com.instagram.model.direct.threadkey.impl.MsysThreadId;

/* renamed from: X.4Dr, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC92784Dr {
    public static final Long A01(InterfaceC83713oG interfaceC83713oG) {
        InterfaceC2056098k interfaceC2056098k;
        C14360o3.A0B(interfaceC83713oG, 0);
        if (interfaceC83713oG instanceof InterfaceC2056098k) {
            interfaceC2056098k = (InterfaceC2056098k) interfaceC83713oG;
        } else if (interfaceC83713oG instanceof C163787Us) {
            interfaceC2056098k = ((C163787Us) interfaceC83713oG).A01;
        } else {
            return null;
        }
        if (interfaceC2056098k instanceof MsysThreadId) {
            return ((MsysThreadId) interfaceC2056098k).A02;
        }
        return null;
    }

    public static final String A02(InterfaceC83713oG interfaceC83713oG) {
        InterfaceC83703oF interfaceC83703oF;
        C14360o3.A0B(interfaceC83713oG, 0);
        if (interfaceC83713oG instanceof InterfaceC83703oF) {
            interfaceC83703oF = (InterfaceC83703oF) interfaceC83713oG;
        } else if (interfaceC83713oG instanceof C163787Us) {
            interfaceC83703oF = ((C163787Us) interfaceC83713oG).A00;
        } else {
            return null;
        }
        if (interfaceC83703oF instanceof C83693oE) {
            return ((C83693oE) interfaceC83703oF).A00;
        }
        return null;
    }

    public static final EnumC92794Ds A00(InterfaceC83713oG interfaceC83713oG) {
        if (interfaceC83713oG instanceof InterfaceC83703oF) {
            return EnumC92794Ds.A05;
        }
        if (interfaceC83713oG instanceof C163787Us) {
            return EnumC92794Ds.A06;
        }
        if (interfaceC83713oG instanceof InterfaceC2056098k) {
            return ((InterfaceC2056098k) interfaceC83713oG).CAo();
        }
        return null;
    }
}
