package X;

import com.instagram.camera.effect.models.CameraAREffect;

/* loaded from: classes9.dex */
public final class PI9 implements C8H3 {
    public final /* synthetic */ C52692NTd A00;

    public PI9(C52692NTd c52692NTd) {
        this.A00 = c52692NTd;
    }

    @Override // X.C8H3
    public final void Dyb(float f) {
        CameraAREffect A00;
        C54727OFe c54727OFe;
        C52692NTd c52692NTd = this.A00;
        InterfaceC09390do interfaceC09390do = c52692NTd.A0W;
        C54727OFe c54727OFe2 = (C54727OFe) interfaceC09390do.getValue();
        Object obj = c54727OFe2.A07.A00.first;
        C14360o3.A07(obj);
        boolean A1X = AbstractC167007dF.A1X(obj, EnumC1810181d.A11);
        boolean z = c54727OFe2.A03;
        C88X c88x = c54727OFe2.A01;
        boolean z2 = c54727OFe2.A04;
        if (A1X && z && c88x != null && (A00 = c88x.A00()) != null && A00.A0Z.get("nativeUIControlSlider") != null && !z2 && (c54727OFe = (C54727OFe) interfaceC09390do.getValue()) != null && c54727OFe.A01 != null) {
            c52692NTd.A0H.A03(new C56704PEw(f, true, false));
        }
    }
}
