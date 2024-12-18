package X;

import android.os.Process;
import com.facebook.breakpad.BreakpadManager;

/* renamed from: X.9vQ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC224399vQ {
    public static final Object A00(C6FW c6fw) {
        Object A01 = c6fw.A01();
        C14360o3.A0C(A01, "null cannot be cast to non-null type kotlin.String");
        String str = (String) A01;
        int hashCode = str.hashCode();
        if (hashCode != -1488800881) {
            if (hashCode != -26746833) {
                if (hashCode == 78445 && str.equals("OOM")) {
                    throw new OutOfMemoryError("Bloks Action bk.action.reliability.CrashNow triggered OOM");
                }
                return null;
            }
            if (str.equals("EXCEPTION")) {
                BreakpadManager.crashThisProcess();
                return null;
            }
            return null;
        }
        if (str.equals("SIGKILL")) {
            Process.sendSignal(Process.myPid(), 9);
            return null;
        }
        return null;
    }
}
