package X;

import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;

/* renamed from: X.TXr, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C64866TXr extends RuntimeException {
    public Throwable A00;
    public final List A01;
    public final String A02;

    @Override // java.lang.Throwable
    public final synchronized Throwable getCause() {
        Throwable th;
        th = this.A00;
        if (th == null) {
            th = new RuntimeException();
            HashSet A1H = AbstractC166987dD.A1H();
            Throwable th2 = th;
            for (Throwable th3 : this.A01) {
                if (!A1H.contains(th3)) {
                    A1H.add(th3);
                    ArrayList A1E = AbstractC166987dD.A1E();
                    Throwable cause = th3.getCause();
                    if (cause != null && cause != th3) {
                        while (true) {
                            A1E.add(cause);
                            Throwable cause2 = cause.getCause();
                            if (cause2 == null || cause2 == cause) {
                                break;
                            }
                            cause = cause2;
                        }
                    }
                    Iterator it = A1E.iterator();
                    while (it.hasNext()) {
                        Throwable th4 = (Throwable) it.next();
                        if (A1H.contains(th4)) {
                            th3 = AbstractC166987dD.A18("Duplicate found in causal chain so cropping to prevent loop ...");
                        } else {
                            A1H.add(th4);
                        }
                    }
                    try {
                        th2.initCause(th3);
                    } catch (Throwable unused) {
                    }
                    Throwable cause3 = th2.getCause();
                    if (cause3 != null && this.A00 != cause3) {
                        while (true) {
                            Throwable cause4 = cause3.getCause();
                            if (cause4 == null || cause4 == cause3) {
                                break;
                            }
                            cause3 = cause4;
                        }
                        th2 = cause3;
                    }
                }
            }
            this.A00 = th;
        }
        return th;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return this.A02;
    }

    @Override // java.lang.Throwable
    public final void printStackTrace(PrintStream printStream) {
        StringBuilder A0q = AbstractC58318PtA.A0q(128);
        A0q.append(this);
        A0q.append('\n');
        for (StackTraceElement stackTraceElement : getStackTrace()) {
            A0q.append("\tat ");
            A0q.append(stackTraceElement);
            A0q.append('\n');
        }
        int i = 1;
        for (Throwable th : this.A01) {
            A0q.append("  ComposedException ");
            A0q.append(i);
            A0q.append(" :\n");
            A00("\t", A0q, th);
            i++;
        }
        printStream.println((Object) A0q.toString());
    }

    public C64866TXr(Iterable iterable) {
        LinkedHashSet A0l = AbstractC31171DnF.A0l();
        ArrayList A1E = AbstractC166987dD.A1E();
        if (iterable != null) {
            for (Object obj : iterable) {
                if (obj instanceof C64866TXr) {
                    A0l.addAll(((C64866TXr) obj).A01);
                } else {
                    A0l.add(obj == null ? AbstractC166987dD.A15("Throwable was null!") : obj);
                }
            }
        } else {
            A0l.add(AbstractC166987dD.A15("errors was null"));
        }
        if (!A0l.isEmpty()) {
            A1E.addAll(A0l);
            List unmodifiableList = Collections.unmodifiableList(A1E);
            this.A01 = unmodifiableList;
            this.A02 = AnonymousClass001.A03(unmodifiableList.size(), " exceptions occurred. ");
            return;
        }
        throw AbstractC166987dD.A12("errors is empty");
    }

    private void A00(String str, StringBuilder sb, Throwable th) {
        sb.append(str);
        sb.append(th);
        sb.append('\n');
        for (StackTraceElement stackTraceElement : th.getStackTrace()) {
            sb.append("\t\tat ");
            sb.append(stackTraceElement);
            sb.append('\n');
        }
        if (th.getCause() != null) {
            sb.append("\tCaused by: ");
            A00("", sb, th.getCause());
        }
    }

    @Override // java.lang.Throwable
    public final void printStackTrace(PrintWriter printWriter) {
        StringBuilder A0q = AbstractC58318PtA.A0q(128);
        A0q.append(this);
        A0q.append('\n');
        for (StackTraceElement stackTraceElement : getStackTrace()) {
            A0q.append("\tat ");
            A0q.append(stackTraceElement);
            A0q.append('\n');
        }
        int i = 1;
        for (Throwable th : this.A01) {
            A0q.append("  ComposedException ");
            A0q.append(i);
            A0q.append(" :\n");
            A00("\t", A0q, th);
            i++;
        }
        printWriter.println((Object) A0q.toString());
    }

    @Override // java.lang.Throwable
    public final void printStackTrace() {
        printStackTrace(System.err);
    }
}
