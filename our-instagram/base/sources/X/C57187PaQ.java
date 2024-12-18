package X;

import com.instagram.camera.effect.models.CameraAREffect;
import com.instagram.common.typedurl.ImageUrl;

/* renamed from: X.PaQ, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C57187PaQ extends AbstractC23611Dp implements InterfaceC16590sC {
    public Object A00;
    public boolean A01;
    public boolean A02;
    public boolean A03;
    public final int A04;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C57187PaQ(int i, InterfaceC23621Ds interfaceC23621Ds) {
        super(5, interfaceC23621Ds);
        this.A04 = i;
    }

    @Override // X.InterfaceC16590sC
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        int i;
        int i2 = this.A04;
        boolean A1a = AbstractC166987dD.A1a(obj);
        boolean A1a2 = AbstractC166987dD.A1a(obj2);
        boolean A1a3 = AbstractC166987dD.A1a(obj4);
        InterfaceC23621Ds interfaceC23621Ds = (InterfaceC23621Ds) obj5;
        if (i2 != 0) {
            i = 1;
        } else {
            i = 0;
        }
        C57187PaQ c57187PaQ = new C57187PaQ(i, interfaceC23621Ds);
        c57187PaQ.A01 = A1a;
        c57187PaQ.A02 = A1a2;
        c57187PaQ.A00 = obj3;
        c57187PaQ.A03 = A1a3;
        return c57187PaQ.invokeSuspend(C0eB.A00);
    }

    @Override // X.C1Dr
    public final Object invokeSuspend(Object obj) {
        CameraAREffect A00;
        int i = this.A04;
        AbstractC09560e7.A00(obj);
        if (i != 0) {
            boolean z = this.A01;
            boolean z2 = this.A02;
            C88X c88x = (C88X) this.A00;
            boolean z3 = this.A03;
            boolean z4 = true;
            if (!z || z2 || c88x == null || (A00 = c88x.A00()) == null || A00.A0Z.get("nativeUIControlPicker") == null || !z3) {
                z4 = false;
            }
            return Boolean.valueOf(z4);
        }
        return new C51748MtX((ImageUrl) this.A00, this.A01, this.A02, this.A03);
    }
}
