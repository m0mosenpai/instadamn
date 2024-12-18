package X;

import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.Ns6, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC53874Ns6 {
    public static final String A00() {
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        C14360o3.A0A(stackTrace);
        Object[] A0a = AbstractC06960Yn.A0a(stackTrace, 3, stackTrace.length);
        ArrayList A1E = AbstractC166987dD.A1E();
        for (Object obj : A0a) {
            String className = ((StackTraceElement) obj).getClassName();
            C14360o3.A07(className);
            AbstractC25228BEl.A1Q(obj, A1E, AbstractC001900j.A0a(className, "IgdsShowToastEvent", false) ? 1 : 0);
        }
        ArrayList A1E2 = AbstractC166987dD.A1E();
        for (Object obj2 : A1E) {
            String className2 = ((StackTraceElement) obj2).getClassName();
            C14360o3.A07(className2);
            AbstractC25228BEl.A1Q(obj2, A1E2, AbstractC001900j.A0a(className2, "IgdsToastUtil", false) ? 1 : 0);
        }
        ArrayList A1E3 = AbstractC166987dD.A1E();
        for (Object obj3 : A1E2) {
            String className3 = ((StackTraceElement) obj3).getClassName();
            C14360o3.A07(className3);
            AbstractC25228BEl.A1Q(obj3, A1E3, AbstractC001900j.A0a(className3, "IgShowSnackBarEvent", false) ? 1 : 0);
        }
        if (A1E3.isEmpty()) {
            return "unknown_caller";
        }
        String className4 = ((StackTraceElement) A1E3.get(0)).getClassName();
        C14360o3.A07(className4);
        String str = (String) AbstractC001800i.A0K(AbstractC167007dF.A0m(className4, ".", 0));
        ArrayList A1E4 = AbstractC166987dD.A1E();
        for (StackTraceElement stackTraceElement : stackTrace) {
            String className5 = stackTraceElement.getClassName();
            C14360o3.A07(className5);
            if (AbstractC001900j.A0a(className5, str, false)) {
                A1E4.add(stackTraceElement);
            }
        }
        ArrayList A0q = AbstractC167017dG.A0q(A1E4);
        Iterator it = A1E4.iterator();
        while (it.hasNext()) {
            A0q.add(((StackTraceElement) it.next()).getMethodName());
        }
        return AnonymousClass001.A0T(str, AbstractC25226BEj.A1H("->", AbstractC001800i.A0Y(A0q), null), ':');
    }
}
