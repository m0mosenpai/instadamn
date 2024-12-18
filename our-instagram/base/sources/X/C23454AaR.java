package X;

import android.media.Image;
import android.media.ImageReader;
import android.view.Surface;
import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: X.AaR, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C23454AaR implements InterfaceC175547rU {
    public Image A00;
    public C177047u0 A01;
    public C175227qw A02;
    public C23578AcX A03;
    public ImageReader A04;
    public AbstractC176797tb A05;
    public boolean A06;
    public final C196708n0 A0B = new Object();
    public final C1814082s A07 = new C1814082s();
    public final ImageReader.OnImageAvailableListener A09 = new API(this, 1);
    public final Callable A08 = new CallableC24924B0x(this, 1);
    public final InterfaceC177137u9 A0A = new C23446AaJ(this);

    @Override // X.InterfaceC175547rU
    public final boolean Ce5() {
        return false;
    }

    public static void A00(C23454AaR c23454AaR) {
        C23331AWa c23331AWa;
        Surface surface;
        if (c23454AaR.A03 != null && c23454AaR.A04 != null) {
            boolean CLA = c23454AaR.CLA();
            C23578AcX c23578AcX = c23454AaR.A03;
            if (CLA) {
                surface = c23454AaR.A04.getSurface();
                c23331AWa = c23578AcX.A04;
            } else {
                c23331AWa = c23578AcX.A04;
                surface = null;
            }
            c23331AWa.A0F = surface;
            c23331AWa.A0J = true;
        }
    }

    public static void A01(C23454AaR c23454AaR) {
        C196708n0 c196708n0;
        AbstractC176797tb abstractC176797tb;
        C175227qw c175227qw = c23454AaR.A02;
        if (c175227qw != null) {
            if (c175227qw.A09()) {
                if (c23454AaR.A00 != null && c23454AaR.A05 != null && c23454AaR.CLA()) {
                    C177047u0 c177047u0 = c23454AaR.A01;
                    try {
                        if (c177047u0 != null && (abstractC176797tb = c23454AaR.A05) != null && AbstractC167017dG.A1Y(AbstractC176797tb.A0U, abstractC176797tb)) {
                            C177627uw c177627uw = c177047u0.A09;
                            if (c177627uw != null) {
                                C177637ux c177637ux = c177627uw.A01[((c177627uw.A00 + 3) - 1) % 3];
                                if (c177637ux != null) {
                                    c196708n0 = c23454AaR.A0B;
                                    C196708n0.A00(c23454AaR.A00, c177637ux, c196708n0, c23454AaR.A06);
                                } else {
                                    return;
                                }
                            } else {
                                return;
                            }
                        } else {
                            c196708n0 = c23454AaR.A0B;
                            c196708n0.A02(c23454AaR.A00, null, null, null, null, null, c23454AaR.A06, false);
                        }
                        List list = c23454AaR.A07.A00;
                        int size = list.size();
                        for (int i = 0; i < size; i++) {
                            ((InterfaceC25160BBf) list.get(i)).Dad(c196708n0);
                        }
                    } catch (RuntimeException unused) {
                    }
                    c23454AaR.A0B.A01();
                    c23454AaR.A00.close();
                    c23454AaR.A00 = null;
                    return;
                }
                return;
            }
            throw new RuntimeException("Method tryToNotifyCpuFrame() must run on the Optic Background Thread.");
        }
    }

    @Override // X.InterfaceC175547rU
    public final boolean A9B(InterfaceC25160BBf interfaceC25160BBf) {
        C1814082s c1814082s = this.A07;
        int size = c1814082s.A00.size();
        boolean A01 = c1814082s.A01(interfaceC25160BBf);
        int size2 = c1814082s.A00.size();
        if (size == 0 && size2 > 0) {
            A00(this);
        }
        return A01;
    }

    @Override // X.InterfaceC175547rU
    public final void A9H(List list) {
        C1814082s c1814082s = this.A07;
        int size = c1814082s.A00.size();
        int size2 = list.size();
        for (int i = 0; i < size2; i++) {
            c1814082s.A01(list.get(i));
        }
        int size3 = c1814082s.A00.size();
        if (size == 0 && size3 > 0) {
            A00(this);
        }
    }

    @Override // X.InterfaceC175547rU
    public final void AHp() {
        C1814082s c1814082s = this.A07;
        int size = c1814082s.A00.size();
        c1814082s.A00();
        if (size > 0) {
            A00(this);
        }
    }

    @Override // X.InterfaceC175547rU
    public final InterfaceC177137u9 B8a() {
        return this.A0A;
    }

    @Override // X.InterfaceC175547rU
    public final List BNp() {
        return this.A07.A00;
    }

    @Override // X.InterfaceC175547rU
    public final boolean CLA() {
        return AbstractC166987dD.A1b(this.A07.A00);
    }

    @Override // X.InterfaceC175547rU
    public final void CNs(InterfaceC174657pz interfaceC174657pz, AbstractC176767tY abstractC176767tY, AbstractC176797tb abstractC176797tb, C176877tj c176877tj, C175227qw c175227qw, int i) {
        this.A02 = c175227qw;
        this.A06 = AbstractC167007dF.A1S(AbstractC176767tY.A0T, abstractC176767tY);
        this.A05 = abstractC176797tb;
        int i2 = c176877tj.A02;
        int i3 = c176877tj.A01;
        float min = Math.min(1.0f, 600.0f / Math.max(i2, i3));
        ImageReader newInstance = ImageReader.newInstance(AbstractC166987dD.A0A(i2, min), AbstractC166987dD.A0A(min, i3), 1, 1);
        this.A04 = newInstance;
        newInstance.setOnImageAvailableListener(this.A09, null);
        A00(this);
    }

    @Override // X.InterfaceC175547rU
    public final boolean EFc(InterfaceC25160BBf interfaceC25160BBf) {
        C1814082s c1814082s = this.A07;
        int size = c1814082s.A00.size();
        boolean A02 = c1814082s.A02(interfaceC25160BBf);
        int size2 = c1814082s.A00.size();
        if (size > 0 && size2 == 0) {
            A00(this);
        }
        return A02;
    }

    @Override // X.InterfaceC175547rU
    public final Surface getSurface() {
        ImageReader imageReader = this.A04;
        if (imageReader != null) {
            return imageReader.getSurface();
        }
        throw AbstractC166987dD.A14("Getting image reader surface without initialize.");
    }

    @Override // X.InterfaceC175547rU
    public final void release() {
        if (this.A03 != null && this.A07.A00.size() > 0) {
            C23331AWa c23331AWa = this.A03.A04;
            c23331AWa.A0F = null;
            c23331AWa.A0J = true;
        }
        ImageReader imageReader = this.A04;
        if (imageReader != null) {
            imageReader.setOnImageAvailableListener(null, null);
            this.A04.close();
            this.A04 = null;
        }
        Image image = this.A00;
        if (image != null) {
            image.close();
            this.A00 = null;
        }
        this.A02 = null;
        this.A05 = null;
        this.A01 = null;
    }
}
