package X;

import com.instagram.model.direct.DirectThreadKey;
import com.instagram.model.direct.threadkey.impl.MsysThreadId;
import com.instagram.model.direct.threadkey.impl.mixed.DirectMsysMixedThreadKey;
import kotlin.Deprecated;
import kotlin.ReplaceWith;

/* loaded from: classes8.dex */
public abstract class JRE {
    public static final InterfaceC83733oI A05(C3o9 c3o9) {
        DirectThreadKey directThreadKey;
        Object obj = null;
        if (c3o9 == null) {
            return null;
        }
        if (c3o9 instanceof DirectThreadKey) {
            directThreadKey = (DirectThreadKey) c3o9;
        } else if (c3o9 instanceof DirectMsysMixedThreadKey) {
            directThreadKey = ((DirectMsysMixedThreadKey) c3o9).A00;
        } else {
            if (c3o9 instanceof MsysThreadId) {
                obj = c3o9;
                return (InterfaceC83733oI) obj;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Expected DirectThreadKey or MsysThreadId: ");
            sb.append(c3o9);
            throw new IllegalStateException(sb.toString());
        }
        String str = directThreadKey.A00;
        if (str != null) {
            obj = new C83693oE(str);
        }
        return (InterfaceC83733oI) obj;
    }

    @Deprecated(message = "DO NOT USE THIS METHOD. Passing around thread IDs as raw Strings is dangerous and is a sign that code is not properly data source agnostic.")
    public static final String A07(C3o9 c3o9) {
        DirectThreadKey directThreadKey;
        C14360o3.A0B(c3o9, 0);
        if (c3o9 instanceof DirectThreadKey) {
            directThreadKey = (DirectThreadKey) c3o9;
        } else if (c3o9 instanceof DirectMsysMixedThreadKey) {
            directThreadKey = ((DirectMsysMixedThreadKey) c3o9).A00;
        } else {
            if (c3o9 instanceof MsysThreadId) {
                return String.valueOf(((MsysThreadId) c3o9).A00);
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Expected DirectThreadKey or MsysThreadId: ");
            sb.append(c3o9);
            throw new IllegalStateException(sb.toString());
        }
        return directThreadKey.A00;
    }

    public static final String A08(C3o9 c3o9) {
        DirectThreadKey directThreadKey;
        C14360o3.A0B(c3o9, 0);
        if (c3o9 instanceof DirectThreadKey) {
            directThreadKey = (DirectThreadKey) c3o9;
        } else if (c3o9 instanceof DirectMsysMixedThreadKey) {
            directThreadKey = ((DirectMsysMixedThreadKey) c3o9).A00;
        } else {
            if (c3o9 instanceof MsysThreadId) {
                return null;
            }
            throw AbstractC43594JPz.A0o(c3o9, "Expected DirectThreadKey or MsysThreadId: ", AbstractC166987dD.A1C());
        }
        return directThreadKey.A01;
    }

    public static final EnumC92794Ds A00(C3o9 c3o9) {
        if (!(c3o9 instanceof DirectThreadKey) && !(c3o9 instanceof DirectMsysMixedThreadKey)) {
            if (c3o9 instanceof MsysThreadId) {
                return ((MsysThreadId) c3o9).A01;
            }
            throw AbstractC43594JPz.A0o(c3o9, "Expected DirectThreadKey or MsysThreadId: ", AbstractC166987dD.A1C());
        }
        return EnumC92794Ds.A05;
    }

    public static final DirectThreadKey A01(C3o9 c3o9) {
        if (c3o9 instanceof DirectThreadKey) {
            return (DirectThreadKey) c3o9;
        }
        if (c3o9 instanceof DirectMsysMixedThreadKey) {
            return ((DirectMsysMixedThreadKey) c3o9).A00;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Expected DirectThreadKey: ");
        sb.append(c3o9);
        throw new IllegalStateException(sb.toString());
    }

    public static final DirectThreadKey A02(C3o9 c3o9) {
        if (c3o9 instanceof DirectThreadKey) {
            return (DirectThreadKey) c3o9;
        }
        if (c3o9 instanceof DirectMsysMixedThreadKey) {
            return ((DirectMsysMixedThreadKey) c3o9).A00;
        }
        return null;
    }

    public static final MsysThreadId A03(C3o9 c3o9) {
        if (c3o9 instanceof MsysThreadId) {
            return (MsysThreadId) c3o9;
        }
        if (c3o9 instanceof DirectMsysMixedThreadKey) {
            return ((DirectMsysMixedThreadKey) c3o9).A01;
        }
        throw AbstractC43594JPz.A0o(c3o9, AbstractC111324zv.A00(3601), AbstractC166987dD.A1C());
    }

    public static final MsysThreadId A04(C3o9 c3o9) {
        if (c3o9 instanceof MsysThreadId) {
            return (MsysThreadId) c3o9;
        }
        if (c3o9 instanceof DirectMsysMixedThreadKey) {
            return ((DirectMsysMixedThreadKey) c3o9).A01;
        }
        return null;
    }

    @Deprecated(message = "Please migrate to new thread id logging API", replaceWith = @ReplaceWith(expression = "UnifiedThreadKeyLoggingUtil", imports = {}))
    public static final String A06(C3o9 c3o9) {
        DirectThreadKey directThreadKey;
        if (c3o9 instanceof DirectThreadKey) {
            directThreadKey = (DirectThreadKey) c3o9;
        } else if (c3o9 instanceof DirectMsysMixedThreadKey) {
            directThreadKey = ((DirectMsysMixedThreadKey) c3o9).A00;
        } else {
            if (c3o9 instanceof MsysThreadId) {
                return "-1";
            }
            throw AbstractC43594JPz.A0o(c3o9, "Expected DirectThreadKey or MsysThreadId: ", AbstractC166987dD.A1C());
        }
        return directThreadKey.A00;
    }

    public static final boolean A09(C3o9 c3o9) {
        if ((c3o9 instanceof MsysThreadId) && ((MsysThreadId) c3o9).A01 == EnumC92794Ds.A04) {
            return true;
        }
        return false;
    }

    public static final boolean A0A(C3o9 c3o9) {
        if (!(c3o9 instanceof DirectThreadKey) && !(c3o9 instanceof DirectMsysMixedThreadKey)) {
            return false;
        }
        return true;
    }
}
