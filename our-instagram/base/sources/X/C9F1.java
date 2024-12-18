package X;

import android.view.MotionEvent;

/* renamed from: X.9F1, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C9F1 extends C0YY implements InterfaceC16600sD {
    public final int A00;
    public final Object A01;
    public final Object A02;

    @Override // X.InterfaceC16600sD
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        if (this.A00 != 0) {
            C22849A5s c22849A5s = (C22849A5s) obj;
            C75113Zb c75113Zb = (C75113Zb) obj2;
            MotionEvent motionEvent = (MotionEvent) obj3;
            InterfaceC16820sZ interfaceC16820sZ = (InterfaceC16820sZ) obj4;
            C14360o3.A0B(c22849A5s, 0);
            C14360o3.A0B(c75113Zb, 1);
            C14360o3.A0B(interfaceC16820sZ, 3);
            C92494Cg c92494Cg = (C92494Cg) this.A01;
            c92494Cg.A01(B7E.A00);
            C006802i c006802i = c92494Cg.A00;
            if (c006802i != null) {
                c006802i.markerPoint(1056313521, "on_use_case_handling");
            }
            C38321qM c38321qM = (C38321qM) this.A02;
            C14360o3.A0B(c38321qM, 0);
            c22849A5s.A00.Cv9(motionEvent, null, c38321qM, c75113Zb, C2Fb.A3F, interfaceC16820sZ);
        } else {
            InterfaceC92464Cd interfaceC92464Cd = (InterfaceC92464Cd) obj;
            C75113Zb c75113Zb2 = (C75113Zb) obj2;
            C81373k7 c81373k7 = (C81373k7) obj3;
            MotionEvent motionEvent2 = (MotionEvent) obj4;
            C14360o3.A0B(interfaceC92464Cd, 0);
            C14360o3.A0B(c75113Zb2, 1);
            C14360o3.A0B(c81373k7, 2);
            C92494Cg c92494Cg2 = (C92494Cg) this.A01;
            c92494Cg2.A01(B7E.A00);
            C006802i c006802i2 = c92494Cg2.A00;
            if (c006802i2 != null) {
                c006802i2.markerPoint(1056313521, "on_use_case_handling");
            }
            C38321qM c38321qM2 = (C38321qM) this.A02;
            if (c38321qM2.A0A == null) {
                interfaceC92464Cd.D18(motionEvent2, c81373k7, c38321qM2, c75113Zb2);
            }
        }
        return C0eB.A00;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9F1(C92494Cg c92494Cg, C38321qM c38321qM, int i) {
        super(4);
        this.A00 = i;
        this.A01 = c92494Cg;
        this.A02 = c38321qM;
    }
}
