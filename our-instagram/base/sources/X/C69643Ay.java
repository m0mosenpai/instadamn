package X;

import com.instagram.model.reels.Reel;
import com.instagram.model.reels.ReelType;
import java.util.HashSet;

/* renamed from: X.3Ay, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C69643Ay implements InterfaceC43071ya {
    public C64012vM A00;
    public final C61252qn A01;

    @Override // X.InterfaceC43071ya
    public final void ATP(C59062n7 c59062n7, InterfaceC57162jr interfaceC57162jr) {
        C14360o3.A0B(c59062n7, 0);
        C14360o3.A0B(interfaceC57162jr, 1);
        int intValue = interfaceC57162jr.CFq(c59062n7).intValue();
        if (intValue != 0) {
            if (intValue != 1) {
                return;
            }
        } else {
            C61252qn c61252qn = this.A01;
            Object obj = c59062n7.A03;
            C14360o3.A06(obj);
            Reel reel = (Reel) obj;
            C3G5 c3g5 = C3G5.A0K;
            synchronized (c61252qn) {
                C14360o3.A0B(reel, 0);
                C3AZ c3az = c61252qn.A08;
                if (c3az != null) {
                    if (!C18U.A06(C06090Tz.A05, c3az.A02, 36325794008544640L) && reel.A0P == ReelType.A0n) {
                        HashSet hashSet = c3az.A03;
                        if (hashSet.add(reel) && hashSet.size() == 3) {
                            C3AZ.A01(c3g5, c3az, hashSet);
                            hashSet.clear();
                        }
                    }
                }
            }
        }
        C73173Ps c73173Ps = (C73173Ps) c59062n7.A04;
        C64012vM c64012vM = this.A00;
        Object obj2 = c59062n7.A03;
        C14360o3.A06(obj2);
        Reel reel2 = (Reel) obj2;
        int i = c73173Ps.A00;
        C70873Fz c70873Fz = c73173Ps.A01;
        Boolean bool = c73173Ps.A02;
        C14360o3.A0B(reel2, 0);
        C64012vM.A00(reel2, c70873Fz, c64012vM, null, null, bool, null, AnonymousClass001.A0R("viewpoint:", reel2.getId()), i);
    }

    public C69643Ay(C64012vM c64012vM, C61252qn c61252qn) {
        this.A00 = c64012vM;
        this.A01 = c61252qn;
    }
}
