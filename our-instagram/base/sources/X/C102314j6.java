package X;

import java.io.Closeable;
import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedList;

/* renamed from: X.4j6, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C102314j6 extends AbstractC102324j7 {
    public LinkedList A00;
    public transient Closeable A01;

    public static C102314j6 A00(TI1 ti1, Throwable th) {
        C102314j6 c102314j6;
        if (th instanceof C102314j6) {
            c102314j6 = (C102314j6) th;
        } else {
            String A09 = C914045z.A09(th);
            if (A09 == null || A09.isEmpty()) {
                A09 = AnonymousClass001.A0g("(was ", th.getClass().getName(), ")");
            }
            Closeable closeable = null;
            if (th instanceof AnonymousClass401) {
                Object A05 = ((AnonymousClass401) th).A05();
                if (A05 instanceof Closeable) {
                    closeable = (Closeable) A05;
                }
            }
            c102314j6 = new C102314j6(closeable, A09, th);
        }
        LinkedList linkedList = c102314j6.A00;
        if (linkedList == null) {
            linkedList = new LinkedList();
            c102314j6.A00 = linkedList;
        }
        if (linkedList.size() < 1000) {
            linkedList.addFirst(ti1);
        }
        return c102314j6;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [X.TI1, java.lang.Object] */
    public static C102314j6 A02(Object obj, String str, Throwable th) {
        ?? obj2 = new Object();
        obj2.A00 = -1;
        obj2.A03 = obj;
        if (str != null) {
            obj2.A02 = str;
            return A00(obj2, th);
        }
        throw new NullPointerException("Cannot pass null fieldName");
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.TI1, java.lang.Object] */
    public static C102314j6 A03(Object obj, Throwable th, int i) {
        ?? obj2 = new Object();
        obj2.A03 = obj;
        obj2.A00 = i;
        return A00(obj2, th);
    }

    public C102314j6(Closeable closeable, String str) {
        super(str);
        this.A01 = closeable;
        if (closeable instanceof C16L) {
            super.A00 = ((C16L) closeable).A1I();
        }
    }

    public static C102314j6 A01(IOException iOException) {
        return new C102314j6(null, String.format("Unexpected IOException (of type %s): %s", iOException.getClass().getName(), C914045z.A09(iOException)));
    }

    public final String A09() {
        StringBuilder sb;
        String message = super.getMessage();
        LinkedList linkedList = this.A00;
        if (linkedList != null) {
            if (message == null) {
                sb = new StringBuilder();
            } else {
                sb = new StringBuilder(message);
            }
            sb.append(" (through reference chain: ");
            Iterator it = linkedList.iterator();
            while (it.hasNext()) {
                sb.append(it.next().toString());
                if (it.hasNext()) {
                    sb.append("->");
                }
            }
            sb.append(')');
            return sb.toString();
        }
        return message;
    }

    @Override // java.lang.Throwable
    public final String getLocalizedMessage() {
        return A09();
    }

    @Override // X.AnonymousClass400, java.lang.Throwable
    public String getMessage() {
        return A09();
    }

    public C102314j6(Closeable closeable, String str, Throwable th) {
        super(str, th);
        TID A1I;
        super.A00 = null;
        this.A01 = closeable;
        if (th instanceof AnonymousClass401) {
            A1I = ((AnonymousClass400) ((AnonymousClass401) th)).A00;
        } else if (!(closeable instanceof C16L)) {
            return;
        } else {
            A1I = ((C16L) closeable).A1I();
        }
        super.A00 = A1I;
    }
}
