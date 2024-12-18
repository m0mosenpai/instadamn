package X;

import java.io.ByteArrayOutputStream;

/* loaded from: classes8.dex */
public final class JZ0 implements Runnable {
    public final /* synthetic */ C24261Gv A00;
    public final /* synthetic */ C7UR A01;
    public final /* synthetic */ ByteArrayOutputStream A02;
    public final /* synthetic */ Runnable A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ boolean A06;
    public final /* synthetic */ boolean A07;

    public JZ0(C24261Gv c24261Gv, C7UR c7ur, ByteArrayOutputStream byteArrayOutputStream, Runnable runnable, String str, String str2, boolean z, boolean z2) {
        this.A00 = c24261Gv;
        this.A04 = str;
        this.A02 = byteArrayOutputStream;
        this.A01 = c7ur;
        this.A05 = str2;
        this.A03 = runnable;
        this.A07 = z;
        this.A06 = z2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C7UR c7ur = C7UR.A0A;
        C24261Gv c24261Gv = this.A00;
        String str = this.A04;
        byte[] byteArray = this.A02.toByteArray();
        C14360o3.A07(byteArray);
        if (C7US.A01(c24261Gv, str, byteArray)) {
            C7UR.A01(c24261Gv, this.A01, this.A03, this.A05, str, this.A07, this.A06);
            return;
        }
        this.A03.run();
    }
}
