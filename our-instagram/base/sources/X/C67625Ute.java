package X;

import java.util.Arrays;

/* renamed from: X.Ute, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C67625Ute extends C121775fV implements XLC {
    public final InterfaceC121765fU[] A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C67625Ute(InterfaceC121765fU... interfaceC121765fUArr) {
        super((InterfaceC121765fU[]) Arrays.copyOf(interfaceC121765fUArr, interfaceC121765fUArr.length));
        C14360o3.A0B(interfaceC121765fUArr, 1);
        this.A00 = interfaceC121765fUArr;
    }

    @Override // X.XLD
    public final void DrN(IllegalArgumentException illegalArgumentException) {
        for (InterfaceC121765fU interfaceC121765fU : this.A00) {
            if (interfaceC121765fU instanceof XLC) {
                ((XLD) interfaceC121765fU).DrN(illegalArgumentException);
            }
        }
    }
}
