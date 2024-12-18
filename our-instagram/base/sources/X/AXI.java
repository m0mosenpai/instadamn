package X;

import com.facebook.cameracore.mediapipeline.arengineservices.modules.DynamicServiceModule;
import java.util.AbstractCollection;

/* loaded from: classes4.dex */
public final class AXI implements InterfaceC1820085k {
    public final EnumC27091Ti A00;

    @Override // X.InterfaceC1820085k
    public final synchronized void Chc(InterfaceC1819985j interfaceC1819985j) {
        try {
            interfaceC1819985j.onSuccess(AbstractC224719vw.A00(this.A00));
        } catch (RuntimeException e) {
            interfaceC1819985j.DG7(false, e);
        }
    }

    public static void A00(BDA bda, C0Gd c0Gd, EnumC27091Ti enumC27091Ti, AbstractCollection abstractCollection) {
        abstractCollection.add(new DynamicServiceModule(bda, new AXI(enumC27091Ti), c0Gd));
    }

    @Override // X.InterfaceC1820085k
    public final C80B ASl() {
        return AbstractC224719vw.A00(this.A00);
    }

    public AXI(EnumC27091Ti enumC27091Ti) {
        this.A00 = enumC27091Ti;
    }
}
