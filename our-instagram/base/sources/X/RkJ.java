package X;

import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes10.dex */
public final class RkJ extends Exception {
    public static final StackTraceElement[] A06 = new StackTraceElement[0];
    public InterfaceC65617To8 A00;
    public Class A01;
    public Exception A02;
    public Integer A03;
    public String A04;
    public final List A05;

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        return this;
    }

    public static void A00(RkJ rkJ, Throwable th, List list) {
        if (th instanceof RkJ) {
            Iterator it = ((RkJ) th).A05.iterator();
            while (it.hasNext()) {
                A00(rkJ, (Throwable) it.next(), list);
            }
            return;
        }
        list.add(th);
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        String str;
        String str2;
        String str3;
        String str4;
        StringBuilder A0q = AbstractC58318PtA.A0q(71);
        A0q.append(this.A04);
        Class cls = this.A01;
        String str5 = "";
        if (cls == null) {
            str = "";
        } else {
            str = AbstractC167017dG.A0n(cls, ", ", AbstractC166987dD.A1C());
        }
        A0q.append(str);
        Integer num = this.A03;
        if (num == null) {
            str2 = "";
        } else {
            switch (num.intValue()) {
                case 1:
                    str4 = "REMOTE";
                    break;
                case 2:
                    str4 = "DATA_DISK_CACHE";
                    break;
                case 3:
                    str4 = "RESOURCE_DISK_CACHE";
                    break;
                case 4:
                    str4 = "MEMORY_CACHE";
                    break;
                default:
                    str4 = "LOCAL";
                    break;
            }
            str2 = AnonymousClass001.A0R(", ", str4);
        }
        A0q.append(str2);
        InterfaceC65617To8 interfaceC65617To8 = this.A00;
        if (interfaceC65617To8 != null) {
            str5 = AbstractC167017dG.A0n(interfaceC65617To8, ", ", AbstractC166987dD.A1C());
        }
        A0q.append(str5);
        ArrayList A1E = AbstractC166987dD.A1E();
        A00(this, this, A1E);
        if (!A1E.isEmpty()) {
            if (A1E.size() == 1) {
                str3 = "\nThere was 1 root cause:";
            } else {
                A0q.append("\nThere were ");
                A0q.append(A1E.size());
                str3 = " root causes:";
            }
            A0q.append(str3);
            Iterator it = A1E.iterator();
            while (it.hasNext()) {
                Throwable th = (Throwable) it.next();
                A0q.append('\n');
                A0q.append(MSY.A0h(th));
                A0q.append('(');
                A0q.append(th.getMessage());
                A0q.append(')');
            }
            A0q.append("\n call GlideException#logRootCauses(String) for more detail");
        }
        return A0q.toString();
    }

    public RkJ(String str, List list) {
        this.A04 = str;
        setStackTrace(A06);
        this.A05 = list;
    }

    public static void A01(Appendable appendable, Throwable th) {
        try {
            appendable.append(th.getClass().toString()).append(": ").append(th.getMessage()).append('\n');
        } catch (IOException unused) {
            throw AbstractC58318PtA.A0f(th);
        }
    }

    public static void A02(Appendable appendable, List list) {
        try {
            int size = list.size();
            int i = 0;
            while (i < size) {
                int i2 = i + 1;
                appendable.append("Cause (").append(String.valueOf(i2)).append(" of ").append(String.valueOf(size)).append("): ");
                Throwable th = (Throwable) list.get(i);
                if (th instanceof RkJ) {
                    RkJ rkJ = (RkJ) th;
                    A01(appendable, rkJ);
                    A02(new TIL(appendable), rkJ.A05);
                } else {
                    A01(appendable, th);
                }
                i = i2;
            }
        } catch (IOException e) {
            throw AbstractC58318PtA.A0f(e);
        }
    }

    @Override // java.lang.Throwable
    public final void printStackTrace(PrintStream printStream) {
        A01(printStream, this);
        A02(new TIL(printStream), this.A05);
    }

    @Override // java.lang.Throwable
    public final void printStackTrace(PrintWriter printWriter) {
        A01(printWriter, this);
        A02(new TIL(printWriter), this.A05);
    }

    @Override // java.lang.Throwable
    public final void printStackTrace() {
        printStackTrace(System.err);
    }
}
