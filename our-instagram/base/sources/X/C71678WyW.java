package X;

import com.instagram.common.session.UserSession;
import kotlinx.serialization.PolymorphicSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* renamed from: X.WyW, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C71678WyW implements InterfaceC09250da, InterfaceC16820sZ {
    public final int A00;
    public final Object A01;

    public C71678WyW(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    /* JADX WARN: Type inference failed for: r3v4, types: [X.W4a, java.lang.Object] */
    @Override // X.InterfaceC16820sZ
    public final Object invoke() {
        switch (this.A00) {
            case 0:
                AbstractC12990ll abstractC12990ll = (AbstractC12990ll) this.A01;
                ?? obj = new Object();
                obj.A03 = null;
                obj.A01 = null;
                obj.A02 = null;
                obj.A05 = null;
                obj.A00 = abstractC12990ll;
                return obj;
            case 1:
                return new C70399WUb((UserSession) this.A01);
            case 2:
                return new C72787Xn7((AbstractC12990ll) this.A01);
            case 3:
                PolymorphicSerializer polymorphicSerializer = (PolymorphicSerializer) this.A01;
                C14360o3.A0B(polymorphicSerializer, 0);
                C71708WzZ A00 = AbstractC70142W6u.A00("kotlinx.serialization.Polymorphic", new C71680WyY(polymorphicSerializer, 3), X6L.A00, new SerialDescriptor[0]);
                InterfaceC16510rw interfaceC16510rw = polymorphicSerializer.A01;
                C14360o3.A0B(interfaceC16510rw, 1);
                return new C71705WzW(interfaceC16510rw, A00);
            default:
                C71708WzZ c71708WzZ = (C71708WzZ) this.A01;
                return Integer.valueOf(AbstractC68613VXo.A00(c71708WzZ, c71708WzZ.A05));
        }
    }
}
