package X;

import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.litho.annotations.Comparable;
import com.facebook.litho.annotations.Prop;

/* renamed from: X.Bpn, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26652Bpn extends AbstractC50792Va {

    @Comparable(type = JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET)
    @Prop(optional = false, resType = EnumC27347C5c.NONE)
    public InterfaceC16620sF A00;

    @Override // X.AbstractC50812Vc
    public final boolean A0S() {
        return true;
    }

    public C26652Bpn() {
        super("SizeSpecsWrapperComponent");
    }

    @Override // X.AbstractC50812Vc
    public final Object[] A0X() {
        return new Object[]{this.A00};
    }

    @Override // X.AbstractC50792Va
    public final AbstractC50812Vc A0d(C2XE c2xe, int i, int i2) {
        C76133bI c76133bI;
        InterfaceC16620sF interfaceC16620sF = this.A00;
        AbstractC167007dF.A1E(c2xe, 0, interfaceC16620sF);
        C2XR c2xr = (C2XR) c2xe.A0E.get();
        if (c2xr instanceof C76133bI) {
            c76133bI = (C76133bI) c2xr;
        } else {
            c76133bI = null;
        }
        return (AbstractC50812Vc) interfaceC16620sF.invoke(new C76223bS(c2xe, c76133bI), new C78613fT(AbstractC78403f6.A00(i, i2)));
    }
}
