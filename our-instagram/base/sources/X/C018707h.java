package X;

import java.io.PrintWriter;

/* renamed from: X.07h, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C018707h implements InterfaceC58362lv {
    public boolean A00 = false;
    public final InterfaceC018507f A01;
    public final AbstractC019307n A02;

    @Override // X.InterfaceC58362lv
    public final void onChanged(Object obj) {
        this.A00 = true;
        this.A01.DPn(this.A02, obj);
    }

    public final boolean A01() {
        return this.A00;
    }

    public final String toString() {
        return this.A01.toString();
    }

    public C018707h(InterfaceC018507f interfaceC018507f, AbstractC019307n abstractC019307n) {
        this.A02 = abstractC019307n;
        this.A01 = interfaceC018507f;
    }

    public final void A00(PrintWriter printWriter, String str) {
        printWriter.print(str);
        printWriter.print("mDeliveredData=");
        printWriter.println(this.A00);
    }
}
