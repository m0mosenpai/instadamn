package X;

import com.instagram.common.gallery.Medium;
import java.io.File;

/* renamed from: X.PTb, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class RunnableC57062PTb implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ int A02;
    public final /* synthetic */ InterfaceC58036PoM A03;
    public final /* synthetic */ File A04;

    public RunnableC57062PTb(InterfaceC58036PoM interfaceC58036PoM, File file, int i, int i2, int i3) {
        this.A04 = file;
        this.A01 = i;
        this.A00 = i2;
        this.A02 = i3;
        this.A03 = interfaceC58036PoM;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Medium A03 = C8IU.A03(this.A04, 3, 0);
        int i = this.A01;
        int i2 = this.A00;
        A03.A0B = i;
        A03.A04 = i2;
        C195868lW c195868lW = new C195868lW(A03, i, i2, 0);
        int i3 = this.A02;
        c195868lW.A07 = i3;
        c195868lW.A0H = 0;
        c195868lW.A06 = i3;
        this.A03.Dv4(c195868lW, i3);
    }
}
