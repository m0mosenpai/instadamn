package X;

import java.util.concurrent.TimeUnit;

/* renamed from: X.G3v, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36394G3v implements GXY {
    public final /* synthetic */ long A00;
    public final /* synthetic */ C18920wW A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ String A04;

    public C36394G3v(C18920wW c18920wW, String str, String str2, String str3, long j) {
        this.A01 = c18920wW;
        this.A04 = str;
        this.A03 = str2;
        this.A00 = j;
        this.A02 = str3;
    }

    @Override // X.GXY
    public final void Dsp() {
        long seconds = TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis());
        C18920wW c18920wW = this.A01;
        String str = this.A04;
        String str2 = this.A03;
        String str3 = this.A02;
        if (str2.length() == 0) {
            str2 = str3;
        }
        AbstractC66181U2w.A03(c18920wW, str, str2, "", "", this.A00, seconds);
    }
}
