package X;

import com.facebook.onecamera.outputcontrollers.camera.basic.BasicCameraOutputController;
import java.io.File;
import java.util.UUID;

/* loaded from: classes12.dex */
public final class XW1 extends AbstractC184688Hj {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public XW1(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A01 = obj2;
        this.A02 = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC184688Hj
    public final void A01(Exception exc) {
        InterfaceC16530ry interfaceC16530ry;
        C0YR[] c0yrArr;
        XQ2 xq2;
        switch (this.A00) {
            case 0:
                ((C208789Lm) this.A01).A0d = false;
                ((AbstractC184688Hj) this.A02).A01(exc);
                return;
            case 1:
                C14360o3.A0B(exc, 0);
                XQ2 xq22 = (XQ2) this.A02;
                interfaceC16530ry = xq22.A05;
                c0yrArr = XQ2.A06;
                xq2 = xq22;
                break;
            case 2:
                C14360o3.A0B(exc, 0);
                XQ3 xq3 = (XQ3) this.A02;
                interfaceC16530ry = xq3.A09;
                c0yrArr = XQ3.A0B;
                xq2 = xq3;
                break;
            case 3:
                AbstractC12120kG.A0B("BoomerangCaptureController", AnonymousClass001.A0R("Camera not initialised in startRecording: ", ((File) this.A02).getAbsolutePath()), exc);
                ((AbstractC184988In) this.A01).A0E(false);
                return;
            case 4:
                C14360o3.A0B(exc, 0);
                ((AbstractC70118W4q) this.A01).A03(exc);
                return;
            default:
                return;
        }
        InterfaceC1814282u interfaceC1814282u = (InterfaceC1814282u) AbstractC31171DnF.A0Y(xq2, interfaceC16530ry, c0yrArr, 1);
        if (interfaceC1814282u == null) {
            return;
        }
        interfaceC1814282u.DEf(exc);
    }

    @Override // X.AbstractC184688Hj
    public final /* bridge */ /* synthetic */ void A02(Object obj) {
        C9TO c9to;
        double d;
        double d2;
        double d3;
        switch (this.A00) {
            case 0:
                ((AbstractC184688Hj) this.A02).A02(obj);
                return;
            case 1:
                c9to = ((XQ2) this.A02).A02;
                break;
            case 2:
                c9to = ((XQ3) this.A02).A02;
                break;
            case 3:
                XZO xzo = (XZO) this.A01;
                boolean z = true;
                xzo.A0M.set(1);
                C174757qB c174757qB = ((AbstractC184988In) xzo).A04;
                c174757qB.getClass();
                xzo.A03 = c174757qB.A0A();
                xzo.A0G = UUID.randomUUID().toString();
                C174757qB c174757qB2 = ((AbstractC184988In) xzo).A04;
                InterfaceC179847yZ A02 = C174757qB.A02(c174757qB2);
                int A07 = c174757qB2.A07();
                C175007qa c175007qa = ((BasicCameraOutputController) A02).A04;
                AbstractC05810Sj.A00(c175007qa);
                xzo.A00 = c175007qa.A0N.AFE(A07, 0);
                xzo.A02 = xzo.A03.width();
                xzo.A01 = xzo.A03.height();
                if (C18U.A06(C06090Tz.A05, ((AbstractC184988In) xzo).A0F, 36310680017567982L)) {
                    d = xzo.A02;
                    d3 = d;
                    d2 = xzo.A01;
                } else {
                    d = xzo.A01;
                    d2 = xzo.A02;
                    d3 = d2;
                }
                if (0.5625d > d / d2) {
                    xzo.A01 = (int) (d3 / 0.5625d);
                }
                int A072 = ((AbstractC184988In) xzo).A04.A07();
                if (A072 != 1) {
                    z = false;
                }
                xzo.A09 = z;
                File file = xzo.A08;
                file.getClass();
                xzo.A06 = new Y1s(new Y14(null, file.getAbsolutePath(), xzo.A02, xzo.A01, xzo.A00, A072));
                xzo.A0D = Integer.MAX_VALUE;
                ((C18240vB) xzo.A0B.getValue()).ATO(new XZK(xzo, xzo.A0G, xzo.A02, xzo.A01));
                return;
            case 4:
                C177447ue c177447ue = (C177447ue) obj;
                C14360o3.A0B(c177447ue, 0);
                OWY owy = (OWY) this.A02;
                Object A022 = c177447ue.A03.A02(AbstractC176797tb.A0q);
                if (A022 != null) {
                    OWY.A00((C176877tj) A022, (AbstractC70118W4q) this.A01, owy);
                    return;
                }
                throw AbstractC166997dE.A0g();
            default:
                InterfaceC174767qC interfaceC174767qC = (InterfaceC174767qC) this.A01;
                interfaceC174767qC.EUf(new XW2(1, interfaceC174767qC, obj, this.A02));
                return;
        }
        if (c9to == null) {
            C14360o3.A0F("cameraPreview");
            throw C00O.createAndThrow();
        }
        c9to.A04((InterfaceC196578mn) this.A01);
    }
}
