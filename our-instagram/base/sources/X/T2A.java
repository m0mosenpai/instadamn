package X;

import android.media.MediaFormat;
import androidx.media3.container.Mp4OrientationData;
import java.io.FileOutputStream;

/* loaded from: classes10.dex */
public final class T2A implements InterfaceC71993XEh {
    public MediaFormat A00;
    public MediaFormat A01;
    public InterfaceC65187TfV A02;
    public InterfaceC65187TfV A03;
    public InterfaceC65556Tmb A04;
    public Integer A05;
    public String A06;
    public final C69199VjS A07;

    @Override // X.InterfaceC71993XEh
    public final String BVz() {
        return "Media3";
    }

    private final void A00() {
        C63638Sr0 c63638Sr0;
        if (this.A04 != null) {
            MediaFormat mediaFormat = this.A01;
            C63638Sr0 c63638Sr02 = null;
            if (mediaFormat != null) {
                C70130W5r A01 = AbstractC69805Vvr.A01(mediaFormat);
                InterfaceC65556Tmb interfaceC65556Tmb = this.A04;
                if (interfaceC65556Tmb != null) {
                    c63638Sr0 = interfaceC65556Tmb.AAe(A01);
                } else {
                    c63638Sr0 = null;
                }
                this.A03 = c63638Sr0;
            }
            MediaFormat mediaFormat2 = this.A00;
            if (mediaFormat2 != null) {
                C70130W5r A012 = AbstractC69805Vvr.A01(mediaFormat2);
                InterfaceC65556Tmb interfaceC65556Tmb2 = this.A04;
                if (interfaceC65556Tmb2 != null) {
                    c63638Sr02 = interfaceC65556Tmb2.AAe(A012);
                }
                this.A02 = c63638Sr02;
            }
            Integer num = this.A05;
            if (num != null) {
                int intValue = num.intValue();
                InterfaceC65556Tmb interfaceC65556Tmb3 = this.A04;
                if (interfaceC65556Tmb3 != null) {
                    interfaceC65556Tmb3.A9S(new Mp4OrientationData(intValue));
                }
            }
        }
    }

    @Override // X.InterfaceC71993XEh
    public final void EQ1(MediaFormat mediaFormat) {
        this.A00 = mediaFormat;
        A00();
    }

    @Override // X.InterfaceC71993XEh
    public final void Egv(MediaFormat mediaFormat) {
        this.A01 = mediaFormat;
        A00();
    }

    @Override // X.InterfaceC71993XEh
    public final void FEO(XD8 xd8) {
        InterfaceC65556Tmb interfaceC65556Tmb;
        InterfaceC65187TfV interfaceC65187TfV = this.A02;
        if (interfaceC65187TfV != null && (interfaceC65556Tmb = this.A04) != null) {
            interfaceC65556Tmb.FEi(xd8.Aie(), interfaceC65187TfV, xd8.AjR());
        }
    }

    @Override // X.InterfaceC71993XEh
    public final void FEt(XD8 xd8) {
        InterfaceC65556Tmb interfaceC65556Tmb;
        InterfaceC65187TfV interfaceC65187TfV = this.A03;
        if (interfaceC65187TfV != null && xd8 != null && (interfaceC65556Tmb = this.A04) != null) {
            interfaceC65556Tmb.FEi(xd8.Aie(), interfaceC65187TfV, xd8.AjR());
        }
    }

    @Override // X.InterfaceC71993XEh
    public final boolean isStarted() {
        return AbstractC167007dF.A1W(this.A04);
    }

    @Override // X.InterfaceC71993XEh
    public final void start() {
        InterfaceC65556Tmb c63640Sr2;
        FileOutputStream fileOutputStream = new FileOutputStream(this.A06);
        if (this.A07.A03) {
            c63640Sr2 = new C63639Sr1(fileOutputStream);
        } else {
            SFK sfk = new SFK();
            c63640Sr2 = new C63640Sr2(sfk, new C63370SiZ(InterfaceC65602Tnr.A00, new SKy(sfk, 0), fileOutputStream));
        }
        this.A04 = c63640Sr2;
        A00();
    }

    @Override // X.InterfaceC71993XEh
    public final void stop() {
        InterfaceC65556Tmb interfaceC65556Tmb = this.A04;
        if (interfaceC65556Tmb != null) {
            interfaceC65556Tmb.close();
        }
        this.A04 = null;
    }

    public T2A(C69199VjS c69199VjS) {
        this.A07 = c69199VjS;
    }

    @Override // X.InterfaceC71993XEh
    public final void AJA(String str) {
        this.A06 = str;
    }

    @Override // X.InterfaceC71993XEh
    public final void EaE(int i) {
        this.A05 = Integer.valueOf(i);
        A00();
    }
}
