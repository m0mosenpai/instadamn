package X;

import android.content.Context;
import com.facebook.litho.ComponentTree;

/* renamed from: X.3ac, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C75713ac {
    public Context A00;
    public AbstractC50812Vc A01;
    public InterfaceC170287ih A02;
    public InterfaceC51012Vx A03;
    public C75803al A05;
    public C2V3 A06;

    @Deprecated
    public final C2XU A08;
    public final C2XU A09;
    public Boolean A07 = null;
    public C2VK A04 = null;

    public final ComponentTree A00() {
        boolean z;
        if (this.A01 == null) {
            this.A01 = new AbstractC50812Vc();
        }
        Boolean bool = this.A07;
        if (bool != null) {
            z = bool.booleanValue();
        } else {
            z = this.A06.A0M;
        }
        C2V3 c2v3 = this.A06;
        String str = c2v3.A07;
        boolean z2 = false;
        C2V3 A00 = C2V3.A00(null, c2v3, null, null, null, null, null, null, -1, 31, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false);
        boolean z3 = A00.A0P;
        C2VF c2vf = A00.A02;
        C2V6 c2v6 = A00.A03;
        C2V8 c2v8 = A00.A01;
        Integer num = A00.A05;
        boolean z4 = A00.A0X;
        boolean z5 = A00.A00;
        boolean z6 = A00.A09;
        boolean z7 = A00.A0J;
        boolean z8 = A00.A0C;
        boolean z9 = A00.A0A;
        boolean z10 = A00.A0L;
        boolean z11 = A00.A0S;
        Integer num2 = A00.A06;
        boolean z12 = A00.A0E;
        boolean z13 = A00.A0G;
        InterfaceC16660sJ interfaceC16660sJ = A00.A08;
        boolean z14 = A00.A0W;
        boolean z15 = A00.A0I;
        boolean z16 = A00.A0F;
        boolean z17 = A00.A0H;
        boolean z18 = A00.A0D;
        boolean z19 = A00.A0N;
        if (str == null) {
            str = this.A01.A0H();
        }
        if (z) {
            z2 = true;
        }
        this.A06 = AbstractC75743af.A00(c2v8, A00, c2vf, c2v6, num, num2, str, interfaceC16660sJ, z6, z9, z8, z18, z12, z16, z13, z17, z5, z15, z7, z10, z2, z19, z3, z11, z14, z4);
        return new ComponentTree(this);
    }

    public C75713ac(C2XE c2xe) {
        this.A06 = c2xe.A02.A01;
        this.A09 = c2xe.A07;
        this.A08 = c2xe.A06;
        this.A00 = c2xe.A0C;
    }
}
