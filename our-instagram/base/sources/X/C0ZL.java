package X;

import com.facebook.logginginfra.falco.AppScopedIdentity;
import com.facebook.logginginfra.falco.Checksum;
import com.facebook.logginginfra.falco.FacebookIdentity;
import com.facebook.logginginfra.falco.Identity;
import com.facebook.logginginfra.falco.SetQPLConfigDirective;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.0ZL, reason: invalid class name */
/* loaded from: classes.dex */
public final class C0ZL {
    public final Checksum A00;
    public final Identity A01;
    public final C0ZH A02;
    public final C0eH A03;
    public final C0ZI A04;
    public final C0ZK A05;
    public final C0eF A06;

    public static Checksum A00(C109574wj c109574wj, Identity identity, C0eL c0eL, C0R9 c0r9, AtomicReference atomicReference) {
        Checksum checksum = null;
        try {
            C0ZL A02 = A02(c109574wj, identity, c0eL, c0r9, atomicReference);
            if (A02 == null) {
                return null;
            }
            checksum = A02.A00;
            return checksum;
        } catch (IOException e) {
            C0K8.A0H("QPLConfig", "failed to load config", e);
            return checksum;
        }
    }

    public static C0ZL A01(C109574wj c109574wj, Identity identity, C0eL c0eL, C0R9 c0r9, AtomicReference atomicReference) {
        try {
            return A02(c109574wj, identity, c0eL, c0r9, atomicReference);
        } catch (IOException e) {
            C0K8.A0H("QPLConfig", "failed to load config", e);
            return null;
        }
    }

    public static String A03(Identity identity) {
        String str;
        if (identity == null) {
            return null;
        }
        FacebookIdentity A04 = identity.A04();
        AppScopedIdentity A03 = identity.A03();
        if (A04 != null) {
            StringBuilder sb = new StringBuilder();
            sb.append(A04.A00(0));
            sb.append("_");
            sb.append(A04.A00(1));
            str = sb.toString();
        } else {
            if (A03 == null) {
                return null;
            }
            str = (String) A03.A00(2);
            if (str == null || str.trim().equals("")) {
                Number number = (Number) A03.A00(0);
                if (number == null) {
                    return null;
                }
                str = String.valueOf(number.longValue());
            }
        }
        return AbstractC50442Tn.A00.A01(str, AbstractC50482Ts.A05).toString();
    }

    public static void A04(C109574wj c109574wj, SetQPLConfigDirective setQPLConfigDirective, C0eL c0eL, C0ZL c0zl) {
        try {
            ObjectOutputStream A01 = c0eL.A01(A03(c0zl.A01));
            try {
                A01.writeInt(1);
                c109574wj.A01(setQPLConfigDirective, new YCB().Bit(new C4PN(A01)), "com.facebook.logginginfra.falco.SetQPLConfigDirective");
                A01.close();
            } finally {
            }
        } catch (IOException e) {
            C0K8.A0H("QPLConfig", "failed to save qpl config", e);
        }
    }

    public C0ZL(Checksum checksum, Identity identity, C0ZH c0zh, C0eH c0eH, C0ZI c0zi, C0ZK c0zk, C0eF c0eF) {
        this.A01 = identity;
        this.A04 = c0zi;
        this.A03 = c0eH;
        this.A05 = c0zk;
        this.A06 = c0eF;
        this.A02 = c0zh;
        this.A00 = checksum;
    }

    public static C0ZL A02(C109574wj c109574wj, Identity identity, C0eL c0eL, C0R9 c0r9, AtomicReference atomicReference) {
        ObjectInputStream A00 = c0eL.A00(A03(identity));
        try {
            C0ZL c0zl = null;
            if (atomicReference.get() == null) {
                int readInt = A00.readInt();
                if (readInt != 1) {
                    C0K8.A0O("QPLConfig", "unsupported config version %d", Integer.valueOf(readInt));
                } else {
                    SetQPLConfigDirective setQPLConfigDirective = (SetQPLConfigDirective) c109574wj.A00(new YCB().Bit(new C4PN(A00)), "com.facebook.logginginfra.falco.SetQPLConfigDirective");
                    if (atomicReference.get() == null) {
                        c0zl = new C0ZN(c0r9).A03(setQPLConfigDirective);
                    }
                }
            }
            A00.close();
            return c0zl;
        } catch (Throwable th) {
            try {
                A00.close();
                throw th;
            } catch (Throwable th2) {
                Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
                throw th;
            }
        }
    }
}
