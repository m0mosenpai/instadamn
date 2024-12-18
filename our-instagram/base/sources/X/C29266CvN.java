package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* renamed from: X.CvN, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C29266CvN implements InterfaceC71949XCb {
    public final int A00;
    public final Object A01;

    public C29266CvN(C48733Lh1 c48733Lh1, int i) {
        this.A00 = i;
        this.A01 = c48733Lh1;
    }

    @Override // X.InterfaceC71949XCb
    public final void DiF(C45105JxZ c45105JxZ) {
        C48733Lh1 c48733Lh1;
        UserSession userSession;
        Context context;
        String A01;
        Integer num;
        Integer num2;
        C37018GSz c37018GSz;
        InterfaceC16820sZ interfaceC16820sZ;
        switch (this.A00) {
            case 0:
                c48733Lh1 = (C48733Lh1) this.A01;
                userSession = c48733Lh1.A0G;
                context = c48733Lh1.A0D;
                A01 = c45105JxZ.A01();
                num = C05F.A0C;
                num2 = C05F.A0j;
                c37018GSz = new C37018GSz(9, c48733Lh1, c45105JxZ);
                interfaceC16820sZ = C29777DBv.A00;
                break;
            case 1:
                c48733Lh1 = (C48733Lh1) this.A01;
                userSession = c48733Lh1.A0G;
                context = c48733Lh1.A0D;
                A01 = c45105JxZ.A01();
                num = C05F.A0C;
                num2 = C05F.A01;
                c37018GSz = new C37018GSz(11, c48733Lh1, c45105JxZ);
                interfaceC16820sZ = C29778DBw.A00;
                break;
            case 2:
                C48733Lh1 c48733Lh12 = (C48733Lh1) this.A01;
                UserSession userSession2 = c48733Lh12.A0G;
                Context context2 = c48733Lh12.A0D;
                String A012 = c45105JxZ.A01();
                Integer num3 = C05F.A0C;
                LJL.A00(context2, c48733Lh12.A0F, userSession2, null, null, num3, num3, A012, null, c48733Lh12.A0U, new C37018GSz(13, c48733Lh12, c45105JxZ), C29779DBx.A00);
                return;
            default:
                return;
        }
        LJL.A00(context, c48733Lh1.A0F, userSession, null, null, num, num2, A01, null, c48733Lh1.A0U, c37018GSz, interfaceC16820sZ);
    }

    @Override // X.InterfaceC71949XCb
    public final void Dwl(C45105JxZ c45105JxZ) {
        C48733Lh1 c48733Lh1;
        UserSession userSession;
        String A01;
        Integer num;
        int i;
        switch (this.A00) {
            case 0:
                c48733Lh1 = (C48733Lh1) this.A01;
                userSession = c48733Lh1.A0G;
                A01 = c45105JxZ.A01();
                num = C05F.A0j;
                i = 10;
                break;
            case 1:
                c48733Lh1 = (C48733Lh1) this.A01;
                userSession = c48733Lh1.A0G;
                A01 = c45105JxZ.A01();
                num = C05F.A01;
                i = 12;
                break;
            case 2:
                c48733Lh1 = (C48733Lh1) this.A01;
                userSession = c48733Lh1.A0G;
                A01 = c45105JxZ.A01();
                num = C05F.A0C;
                i = 14;
                break;
            default:
                return;
        }
        LJL.A02(c48733Lh1.A0F, userSession, null, null, num, A01, null, c48733Lh1.A0U, new C37018GSz(i, c48733Lh1, c45105JxZ));
    }
}
