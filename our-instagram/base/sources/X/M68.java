package X;

import android.content.Context;

/* loaded from: classes8.dex */
public final class M68 implements Runnable {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ InterfaceC58152PqH A01;
    public final /* synthetic */ C146106i8 A02;
    public final /* synthetic */ Integer A03;

    public M68(Context context, InterfaceC58152PqH interfaceC58152PqH, C146106i8 c146106i8, Integer num) {
        this.A02 = c146106i8;
        this.A00 = context;
        this.A03 = num;
        this.A01 = interfaceC58152PqH;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C41451vu c41451vu = C41451vu.A01;
        C146106i8 c146106i8 = this.A02;
        c146106i8.A0L = true;
        AbstractC31175DnJ.A0l(this.A00, c146106i8, this.A03.intValue());
        c146106i8.A0A(this.A01);
        AbstractC31178DnM.A1N(c41451vu, c146106i8);
    }
}
