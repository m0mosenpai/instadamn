package X;

import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.6of, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C149866of implements InterfaceC149876og {
    public float A00;
    public int A01;
    public final ArrayList A03 = new ArrayList();
    public Integer A02 = C05F.A00;

    public C149866of(int i) {
        this.A00 = 1.0f;
        this.A01 = i;
        this.A00 = 1.0f;
    }

    @Override // X.InterfaceC149876og
    public final void A90(InterfaceC25220BDu interfaceC25220BDu) {
        this.A03.add(interfaceC25220BDu);
    }

    @Override // X.InterfaceC149876og
    public final int Bpw() {
        return this.A01;
    }

    @Override // X.InterfaceC149876og
    public final int Bpx() {
        return 0;
    }

    @Override // X.InterfaceC149876og
    public final int Bpy() {
        return 0;
    }

    @Override // X.InterfaceC149876og
    public final int Bpz() {
        return 0;
    }

    @Override // X.InterfaceC149876og
    public final float CIm() {
        return this.A00;
    }

    @Override // X.InterfaceC149876og
    public final void EQr(Integer num) {
        Iterator it = this.A03.iterator();
        while (it.hasNext()) {
            InterfaceC25220BDu interfaceC25220BDu = (InterfaceC25220BDu) it.next();
            int i = 2;
            if (num == C05F.A00) {
                i = 1;
            }
            interfaceC25220BDu.setCaptureDevicePosition(i);
        }
    }

    @Override // X.InterfaceC149876og
    public final void ERD(Integer num) {
        if (this.A02 != num) {
            int intValue = num.intValue();
            int i = 2;
            if (intValue != 1) {
                if (intValue != 2) {
                    if (intValue == 0) {
                        i = -1;
                    } else {
                        throw new IllegalArgumentException("Incomplete setCaptureContext handling");
                    }
                }
            } else {
                i = 1;
            }
            this.A02 = num;
            Iterator it = this.A03.iterator();
            while (it.hasNext()) {
                ((InterfaceC25220BDu) it.next()).setCaptureContext(i);
            }
        }
    }

    @Override // X.InterfaceC149876og
    public final void capturePhoto() {
        Iterator it = this.A03.iterator();
        while (it.hasNext()) {
            ((InterfaceC25220BDu) it.next()).capturePhoto();
        }
    }

    @Override // X.InterfaceC149876og
    public final void finishCapturePhoto() {
        Iterator it = this.A03.iterator();
        while (it.hasNext()) {
            ((InterfaceC25220BDu) it.next()).finishCapturePhoto();
        }
    }

    @Override // X.InterfaceC149876og
    public final void setCaptureDeviceSize(int i, int i2) {
        Iterator it = this.A03.iterator();
        while (it.hasNext()) {
            ((InterfaceC25220BDu) it.next()).setCaptureDeviceSize(i, i2);
        }
    }

    @Override // X.InterfaceC149876og
    public final void setPreviewViewInfo(int i, int i2, float f) {
        Iterator it = this.A03.iterator();
        while (it.hasNext()) {
            ((InterfaceC25220BDu) it.next()).setPreviewViewInfo(i, i2, f);
        }
    }

    @Override // X.InterfaceC149876og
    public final void setRotation(int i) {
        Iterator it = this.A03.iterator();
        while (it.hasNext()) {
            ((InterfaceC25220BDu) it.next()).setRotation(i);
        }
    }

    @Override // X.InterfaceC149876og
    public final void setZoomFactor(float f) {
        if (this.A00 != f) {
            this.A00 = f;
            Iterator it = this.A03.iterator();
            while (it.hasNext()) {
                ((InterfaceC25220BDu) it.next()).setZoomFactor(this.A00);
            }
        }
    }

    @Override // X.InterfaceC149876og
    public final void startRecording() {
        Iterator it = this.A03.iterator();
        while (it.hasNext()) {
            ((InterfaceC25220BDu) it.next()).startRecording();
        }
    }

    @Override // X.InterfaceC149876og
    public final void stop() {
        this.A03.clear();
    }

    @Override // X.InterfaceC149876og
    public final void stopRecording() {
        Iterator it = this.A03.iterator();
        while (it.hasNext()) {
            ((InterfaceC25220BDu) it.next()).stopRecording();
        }
    }
}
