package X;

import com.facebook.rsys.audio.gen.AudioOutputRoute;

/* renamed from: X.NTz, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C52714NTz extends AbstractC54988OTw {
    public boolean A00;
    public boolean A01;
    public boolean A02;
    public boolean A03;
    public boolean A04;
    public boolean A05;
    public boolean A06;
    public boolean A07;
    public final C56052OuT A08;
    public final NU1 A09;
    public final C54447O4b A0A;
    public final InterfaceC09390do A0B;
    public final C05A A0C;

    public C52714NTz(NU1 nu1, C54446O4a c54446O4a, C54447O4b c54447O4b, InterfaceC16820sZ interfaceC16820sZ) {
        super(c54446O4a);
        this.A0A = c54447O4b;
        this.A09 = nu1;
        this.A0B = C57548PgM.A00(interfaceC16820sZ, 14);
        this.A08 = new C56052OuT(this);
        this.A02 = true;
        AudioOutputRoute audioOutputRoute = AudioOutputRoute.EARPIECE;
        C14360o3.A08(audioOutputRoute);
        this.A0C = AbstractC25225BEi.A1H(new C56624PBu(audioOutputRoute));
    }

    public static final void A00(C52714NTz c52714NTz) {
        boolean z;
        if (!c52714NTz.A01 || c52714NTz.A05 || c52714NTz.A07 || (c52714NTz.A02 && c52714NTz.A06)) {
            z = true;
        } else {
            z = false;
        }
        C54812OKl c54812OKl = (C54812OKl) c52714NTz.A0B.getValue();
        if (z) {
            c54812OKl.A01(false);
        } else {
            c54812OKl.A00(0);
        }
    }
}
