package X;

import com.facebook.exoplayer.monitor.VpsEventCallback;

/* renamed from: X.Vsg, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C69639Vsg {
    public int A00 = 3;
    public Integer A01 = C05F.A00;
    public final C92224Bc A02;
    public final VpsEventCallback A03;
    public final C69407Vmr A04;
    public final C92304Bk A05;
    public final AbstractC123255i0 A06;
    public final String A07;

    public C69639Vsg(C92224Bc c92224Bc, VpsEventCallback vpsEventCallback, C69407Vmr c69407Vmr, C92304Bk c92304Bk, AbstractC123255i0 abstractC123255i0, String str) {
        this.A06 = abstractC123255i0;
        this.A05 = c92304Bk;
        this.A03 = vpsEventCallback;
        this.A07 = str;
        this.A02 = c92224Bc;
        this.A04 = c69407Vmr;
    }

    public final void A00(Integer num) {
        synchronized (this.A01) {
            if (this.A01 == C05F.A00) {
                this.A01 = num;
                this.A06.A00();
            }
        }
    }
}
