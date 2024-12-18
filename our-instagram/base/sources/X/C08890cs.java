package X;

import java.io.FileDescriptor;
import java.io.PrintWriter;

/* renamed from: X.0cs, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C08890cs extends C2GS implements InterfaceC019207m {
    public C07X A00;
    public C018707h A01;
    public AbstractC019307n A02;
    public final int A03;
    public final AbstractC019307n A04;

    @Override // X.C2GT
    public final void A03() {
        AbstractC019307n abstractC019307n = this.A04;
        abstractC019307n.A07 = true;
        abstractC019307n.A06 = false;
        abstractC019307n.A03 = false;
        abstractC019307n.A02();
    }

    @Override // X.C2GT
    public final void A04() {
        this.A04.A07 = false;
    }

    public final AbstractC019307n A0D(C07X c07x, InterfaceC018507f interfaceC018507f) {
        AbstractC019307n abstractC019307n = this.A04;
        C018707h c018707h = new C018707h(interfaceC018507f, abstractC019307n);
        A06(c07x, c018707h);
        InterfaceC58362lv interfaceC58362lv = this.A01;
        if (interfaceC58362lv != null) {
            A08(interfaceC58362lv);
        }
        this.A00 = c07x;
        this.A01 = c018707h;
        return abstractC019307n;
    }

    public final AbstractC019307n A0E(boolean z) {
        AbstractC019307n abstractC019307n = this.A04;
        abstractC019307n.A05();
        abstractC019307n.A03 = true;
        abstractC019307n.A00();
        C018707h c018707h = this.A01;
        if (c018707h != null) {
            A08(c018707h);
        }
        InterfaceC019207m interfaceC019207m = abstractC019307n.A02;
        if (interfaceC019207m != null) {
            if (interfaceC019207m == this) {
                abstractC019307n.A02 = null;
                if ((c018707h == null || c018707h.A01()) && !z) {
                    return abstractC019307n;
                }
                abstractC019307n.A01();
                abstractC019307n.A06 = true;
                abstractC019307n.A07 = false;
                abstractC019307n.A03 = false;
                abstractC019307n.A04 = false;
                abstractC019307n.A05 = false;
                return this.A02;
            }
            throw new IllegalArgumentException("Attempting to unregister the wrong listener");
        }
        throw new IllegalStateException("No listener register");
    }

    public final void A0F() {
        C07X c07x = this.A00;
        C018707h c018707h = this.A01;
        if (c07x != null && c018707h != null) {
            super.A08(c018707h);
            A06(c07x, c018707h);
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(64);
        sb.append("LoaderInfo{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" #");
        sb.append(this.A03);
        sb.append(" : ");
        Class<?> cls = this.A04.getClass();
        sb.append(cls.getSimpleName());
        sb.append("{");
        sb.append(Integer.toHexString(System.identityHashCode(cls)));
        sb.append("}}");
        return sb.toString();
    }

    public C08890cs(AbstractC019307n abstractC019307n, AbstractC019307n abstractC019307n2, int i) {
        this.A03 = i;
        this.A04 = abstractC019307n;
        this.A02 = abstractC019307n2;
        if (abstractC019307n.A02 == null) {
            abstractC019307n.A02 = this;
            abstractC019307n.A00 = i;
            return;
        }
        throw new IllegalStateException("There is already a listener registered");
    }

    @Override // X.C2GT
    public final void A08(InterfaceC58362lv interfaceC58362lv) {
        super.A08(interfaceC58362lv);
        this.A00 = null;
        this.A01 = null;
    }

    @Override // X.C2GT
    public final void A0B(Object obj) {
        super.A0B(obj);
        AbstractC019307n abstractC019307n = this.A02;
        if (abstractC019307n != null) {
            abstractC019307n.A01();
            abstractC019307n.A06 = true;
            abstractC019307n.A07 = false;
            abstractC019307n.A03 = false;
            abstractC019307n.A04 = false;
            abstractC019307n.A05 = false;
            this.A02 = null;
        }
    }

    public final void A0G(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        String str2;
        printWriter.print(str);
        printWriter.print("mId=");
        printWriter.print(this.A03);
        printWriter.print(" mArgs=");
        printWriter.println((Object) null);
        printWriter.print(str);
        printWriter.print("mLoader=");
        AbstractC019307n abstractC019307n = this.A04;
        printWriter.println(abstractC019307n);
        abstractC019307n.A04(AnonymousClass001.A0R(str, "  "), fileDescriptor, printWriter, strArr);
        if (this.A01 != null) {
            printWriter.print(str);
            printWriter.print("mCallbacks=");
            printWriter.println(this.A01);
            this.A01.A00(printWriter, AnonymousClass001.A0R(str, "  "));
        }
        printWriter.print(str);
        printWriter.print("mData=");
        Object A02 = A02();
        StringBuilder sb = new StringBuilder(64);
        if (A02 == null) {
            str2 = "null";
        } else {
            Class<?> cls = A02.getClass();
            sb.append(cls.getSimpleName());
            sb.append("{");
            sb.append(Integer.toHexString(System.identityHashCode(cls)));
            str2 = "}";
        }
        sb.append(str2);
        printWriter.println(sb.toString());
        printWriter.print(str);
        printWriter.print("mStarted=");
        boolean z = false;
        if (super.A00 > 0) {
            z = true;
        }
        printWriter.println(z);
    }
}
