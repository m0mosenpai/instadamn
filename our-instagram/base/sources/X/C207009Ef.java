package X;

import android.view.MotionEvent;
import android.view.View;

/* renamed from: X.9Ef, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C207009Ef extends C0YY implements InterfaceC16590sC {
    public final int A00;
    public final Object A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C207009Ef(Object obj, int i) {
        super(5);
        this.A00 = i;
        this.A01 = obj;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x000c. Please report as an issue. */
    @Override // X.InterfaceC16590sC
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        boolean z;
        switch (this.A00) {
            case 0:
                C38321qM c38321qM = (C38321qM) obj;
                C5qT c5qT = (C5qT) obj2;
                ((Number) obj3).intValue();
                View view = (View) obj4;
                MotionEvent motionEvent = (MotionEvent) obj5;
                C14360o3.A0B(c38321qM, 0);
                C14360o3.A0B(c5qT, 1);
                C14360o3.A0B(view, 3);
                C14360o3.A0B(motionEvent, 4);
                C30A c30a = ((C38P) this.A01).A0L;
                if (c30a != null) {
                    z = c30a.DuC(motionEvent, view, c38321qM, (c5qT.A01 * 3) + c5qT.A00);
                } else {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 1:
                InterfaceC92464Cd interfaceC92464Cd = (InterfaceC92464Cd) obj;
                C75113Zb c75113Zb = (C75113Zb) obj2;
                C2Fb c2Fb = (C2Fb) obj3;
                C81373k7 c81373k7 = (C81373k7) obj4;
                C14360o3.A0B(interfaceC92464Cd, 0);
                C14360o3.A0B(c75113Zb, 1);
                C14360o3.A0B(c2Fb, 2);
                C14360o3.A0B(c81373k7, 3);
                interfaceC92464Cd.D19((MotionEvent) obj5, c81373k7, (C38321qM) this.A01, c75113Zb, c2Fb);
                return C0eB.A00;
            default:
                C22849A5s c22849A5s = (C22849A5s) obj;
                C75113Zb c75113Zb2 = (C75113Zb) obj2;
                C2Fb c2Fb2 = (C2Fb) obj3;
                InterfaceC16820sZ interfaceC16820sZ = (InterfaceC16820sZ) obj5;
                C14360o3.A0B(c22849A5s, 0);
                C14360o3.A0B(c75113Zb2, 1);
                C14360o3.A0B(c2Fb2, 2);
                C14360o3.A0B(interfaceC16820sZ, 4);
                C38321qM c38321qM2 = (C38321qM) this.A01;
                C14360o3.A0B(c38321qM2, 0);
                c22849A5s.A00.Cv9((MotionEvent) obj4, null, c38321qM2, c75113Zb2, c2Fb2, interfaceC16820sZ);
                return C0eB.A00;
        }
    }
}
