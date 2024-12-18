package X;

import android.app.Activity;
import android.content.DialogInterface;
import androidx.fragment.app.FragmentActivity;
import com.google.common.collect.ImmutableSet;
import com.instagram.common.session.UserSession;
import com.instagram.user.follow.BlockButton;
import com.instagram.user.model.User;
import java.util.BitSet;
import java.util.HashMap;
import java.util.HashSet;

/* loaded from: classes11.dex */
public final class WHj implements DialogInterface.OnClickListener {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;

    public WHj(int i, Object obj, Object obj2, Object obj3) {
        this.A00 = i;
        this.A01 = obj;
        this.A03 = obj3;
        this.A02 = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, X.XCT] */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v6, types: [java.lang.Object] */
    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        switch (this.A00) {
            case 0:
                C102884kP c102884kP = (C102884kP) this.A02;
                InterfaceC103384lE A0A = c102884kP.A0A();
                if (A0A == null) {
                    return;
                }
                Object obj = this.A01;
                C6FQ c6fq = (C6FQ) this.A03;
                C6FX A0I = AbstractC31179DnN.A0I(c102884kP);
                A0I.A02(obj);
                AbstractC25227BEk.A1M(c6fq, A0I, A0A);
                return;
            case 1:
                UserSession userSession = (UserSession) this.A03;
                C70399WUb.A00(userSession).A0G(VG4.A1P, "meta_verified_success_dialog");
                FragmentActivity fragmentActivity = (FragmentActivity) this.A02;
                InterfaceC11380iw interfaceC11380iw = (InterfaceC11380iw) this.A01;
                C14360o3.A0B(interfaceC11380iw, 2);
                C62862tP A04 = C62862tP.A04(fragmentActivity, interfaceC11380iw, userSession);
                HashMap hashMap = new HashMap();
                HashMap hashMap2 = new HashMap();
                BitSet bitSet = new BitSet(1);
                hashMap.put("entrypoint", "ig_boost_creation_success_dialog");
                bitSet.set(0);
                ?? obj2 = new Object();
                if (bitSet.nextClearBit(0) >= 1) {
                    C69618VsL c69618VsL = new C69618VsL(AbstractC111324zv.A00(366));
                    c69618VsL.A04 = AbstractC191768eY.A01(hashMap);
                    c69618VsL.A03 = hashMap2;
                    c69618VsL.A02 = obj2;
                    c69618VsL.A00(fragmentActivity, A04);
                    return;
                }
                throw new IllegalStateException("Missing Required Props");
            case 2:
                WGH.A06((Activity) this.A01, (Integer) this.A03);
                InterfaceC71983XDs interfaceC71983XDs = (InterfaceC71983XDs) this.A02;
                if (interfaceC71983XDs == null) {
                    return;
                }
                interfaceC71983XDs.Dat();
                return;
            case 3:
                AbstractC69975Vyq.A00(((C71120WoH) this.A01).A01, ((C69427VnC) this.A02).A07, C05F.A03);
                Object obj3 = (C68251VJn) this.A03;
                InterfaceC72015XFd interfaceC72015XFd = obj3.A05;
                String obj4 = VHn.A0A.toString();
                C71118WoF c71118WoF = (C71118WoF) interfaceC72015XFd;
                int i2 = c71118WoF.A00;
                int i3 = i2 + 1;
                for (int i4 = i3; i4 < c71118WoF.A03.size(); i4++) {
                    if (((C69427VnC) c71118WoF.A03.get(i4)).A08.equals(obj4)) {
                        while (i3 < c71118WoF.A03.size()) {
                            C69427VnC c69427VnC = (C69427VnC) c71118WoF.A03.get(i3);
                            if (c69427VnC.A08.equals(obj4)) {
                                C69427VnC c69427VnC2 = c71118WoF.A01;
                                Object obj5 = obj3;
                                if (c69427VnC2 != null) {
                                    obj5 = c69427VnC2.A03.DV9(c69427VnC, obj3, 1);
                                }
                                if (i2 != -1 && !((C69427VnC) c71118WoF.A03.get(i2)).A06) {
                                    c71118WoF.A04.push(Integer.valueOf(i2));
                                }
                                c71118WoF.A00 = i3;
                                c71118WoF.A01 = c69427VnC;
                                obj3 = c69427VnC.A02.DV9(c69427VnC, obj5, 1);
                                c71118WoF.A02 = obj3;
                                i3 = c71118WoF.A03.size();
                            }
                            i3++;
                        }
                        return;
                    }
                }
                throw new IllegalStateException(AnonymousClass001.A0g("Step '", obj4, "' not in remaining flow steps."));
            case 4:
                BlockButton blockButton = (BlockButton) this.A03;
                User user = (User) this.A02;
                BlockButton.A00((C67893V1b) this.A01, blockButton, user);
                BlockButton.A02(blockButton, user);
                return;
            default:
                Object obj6 = this.A01;
                if (obj6 != null) {
                    HashSet hashSet = new HashSet();
                    hashSet.add(obj6);
                    ((WD6) this.A03).A03.A01(C05F.A01, (Integer) this.A02, hashSet);
                    return;
                }
                WD6 wd6 = (WD6) this.A03;
                OKY oky = wd6.A03;
                Integer num = C05F.A01;
                ImmutableSet A03 = ImmutableSet.A03(wd6.A02.A06.A00);
                C14360o3.A07(A03);
                oky.A01(num, (Integer) this.A02, new HashSet(A03));
                return;
        }
    }
}
