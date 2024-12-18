package X;

import android.graphics.RectF;
import com.instagram.model.reels.Reel;

/* renamed from: X.LxO, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C49693LxO implements InterfaceC37144GYf {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;

    public C49693LxO(int i, Object obj, Object obj2, Object obj3, Object obj4) {
        this.A00 = i;
        this.A04 = obj3;
        this.A02 = obj4;
        this.A01 = obj;
        this.A03 = obj2;
    }

    @Override // X.InterfaceC37144GYf
    public final void CyV() {
        if (this.A00 != 0) {
            C3KX c3kx = (C3KX) this.A04;
            String str = ((C105824pt) this.A01).A0e;
            str.getClass();
            Reel reel = (Reel) this.A02;
            C3KX.A06(c3kx, str, AbstractC37301Gc2.A0i(reel), AbstractC31171DnF.A0g(this.A03));
            C3KX.A01(reel, C3G2.A1E, c3kx, null, null);
            return;
        }
        JR2.A0C((RectF) this.A01, (InterfaceC50477MQf) this.A03, (JR2) this.A04, (C2EC) this.A02);
    }
}
