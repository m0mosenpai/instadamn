package X;

import android.content.Context;
import android.os.Looper;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* renamed from: X.07n, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC019307n {
    public int A00;
    public Context A01;
    public InterfaceC019207m A02;
    public boolean A03;
    public boolean A04;
    public boolean A05;
    public boolean A06;
    public boolean A07;

    public void A00() {
    }

    public void A01() {
    }

    public abstract void A02();

    public abstract boolean A05();

    public void A03(Object obj) {
        Object obj2 = this.A02;
        if (obj2 != null) {
            C2GT c2gt = (C2GT) obj2;
            if (Looper.myLooper() == Looper.getMainLooper()) {
                c2gt.A0B(obj);
            } else {
                c2gt.A0A(obj);
            }
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(64);
        Class<?> cls = getClass();
        sb.append(cls.getSimpleName());
        sb.append("{");
        sb.append(Integer.toHexString(System.identityHashCode(cls)));
        sb.append(" id=");
        sb.append(this.A00);
        sb.append("}");
        return sb.toString();
    }

    @Deprecated
    public void A04(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.print(str);
        printWriter.print("mId=");
        printWriter.print(this.A00);
        printWriter.print(" mListener=");
        printWriter.println(this.A02);
        if (this.A07 || this.A04 || this.A05) {
            printWriter.print(str);
            printWriter.print("mStarted=");
            printWriter.print(this.A07);
            printWriter.print(" mContentChanged=");
            printWriter.print(this.A04);
            printWriter.print(" mProcessingChange=");
            printWriter.println(this.A05);
        }
        if (this.A03 || this.A06) {
            printWriter.print(str);
            printWriter.print("mAbandoned=");
            printWriter.print(this.A03);
            printWriter.print(" mReset=");
            printWriter.println(this.A06);
        }
    }
}
