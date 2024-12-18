package X;

import android.animation.ValueAnimator;
import android.content.Intent;
import android.view.View;
import com.instagram.common.session.UserSession;
import com.instagram.model.reels.Reel;
import com.instagram.user.model.User;
import instagram.features.stories.fragment.ReelViewerFragment;
import java.util.List;

/* renamed from: X.6mT, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C148586mT implements InterfaceC145136gY, InterfaceC147946lQ {
    public InterfaceC41501vz A00;
    public InterfaceC41501vz A01;
    public UserSession A02;
    public C1GL A03;
    public InterfaceC1118853a A04;
    public InterfaceC147266kB A05;
    public C147196jv A06;
    public C145876hk A07;
    public C147316kH A08;
    public C145906hn A09;
    public boolean A0A;

    @Override // X.InterfaceC145136gY
    public final /* synthetic */ void DNK(Reel reel) {
    }

    @Override // X.InterfaceC145136gY
    public final /* synthetic */ void DOJ(int i) {
    }

    @Override // X.InterfaceC145136gY
    public final /* synthetic */ void DPQ() {
    }

    @Override // X.InterfaceC145136gY
    public final /* synthetic */ void DPR() {
    }

    @Override // X.InterfaceC145136gY
    public final /* synthetic */ void DWn() {
    }

    @Override // X.InterfaceC147946lQ
    public final void Dc1(C41181vS c41181vS, C41551w4 c41551w4, C141596ac c141596ac, float f) {
    }

    @Override // X.InterfaceC145136gY
    public final /* synthetic */ void Djr(int i) {
    }

    @Override // X.InterfaceC145136gY
    public final /* synthetic */ void Djs(int i, int i2) {
    }

    @Override // X.InterfaceC145136gY
    public final /* synthetic */ void Dju(int i, int i2) {
    }

    @Override // X.InterfaceC145136gY
    public final /* synthetic */ void Djv() {
    }

    @Override // X.InterfaceC145136gY
    public final /* synthetic */ void Dyy() {
    }

    @Override // X.InterfaceC145136gY
    public final /* synthetic */ void Dz0() {
    }

    @Override // X.InterfaceC145136gY
    public final /* synthetic */ void Dz7() {
    }

    @Override // X.InterfaceC145136gY
    public final /* synthetic */ void E00(C41181vS c41181vS, InterfaceC143586dx interfaceC143586dx) {
    }

    @Override // X.InterfaceC145136gY
    public final /* synthetic */ void onActivityResult(int i, int i2, Intent intent) {
    }

    @Override // X.InterfaceC145136gY
    public final /* synthetic */ void onDestroy() {
    }

    public static void A00(UserSession userSession, C1GL c1gl, C41181vS c41181vS, C141596ac c141596ac, C38080Gp9 c38080Gp9) {
        C104294ms c104294ms = c41181vS.A09;
        c104294ms.getClass();
        int size = c104294ms.A01().size();
        List A00 = c104294ms.A00();
        C25621Ms c25621Ms = new C25621Ms(userSession);
        c25621Ms.A05();
        c25621Ms.A0B("discover/ayml/");
        c25621Ms.A0S(HA3.class, IR2.class);
        c25621Ms.A9s("module", "stories");
        c25621Ms.A9s("phone_id", C11830jh.A04.A01(userSession).A02(C19T.A2G));
        c25621Ms.A9s("forced_user_ids", C71473Il.A00(',').A02(A00));
        C06090Tz c06090Tz = C06090Tz.A05;
        if (C18U.A06(c06090Tz, userSession, 36317491837867239L)) {
            c25621Ms.A0D("max_number_to_display", Long.valueOf(C18U.A01(c06090Tz, userSession, 36598966814510419L)).intValue());
        }
        C1ON A0N = c25621Ms.A0N();
        A0N.A00 = new C39014HFq(c104294ms, c141596ac, c38080Gp9, size);
        c1gl.schedule(A0N);
    }

    public static void A01(C148586mT c148586mT, Integer num) {
        View AuA = c148586mT.A04.AuA();
        if (AuA != null && (AuA.getTag() instanceof C38080Gp9)) {
            C38080Gp9 c38080Gp9 = (C38080Gp9) AuA.getTag();
            C41181vS c41181vS = c38080Gp9.A06;
            if (c41181vS != null && !c41181vS.A1V()) {
                return;
            }
            int intValue = num.intValue();
            if (intValue != 0) {
                if (intValue != 3) {
                    C6SZ c6sz = c38080Gp9.A0V.A07;
                    if (intValue != 1) {
                        if (c6sz == null) {
                            return;
                        }
                        ValueAnimator valueAnimator = c6sz.A03;
                        if (!valueAnimator.isPaused()) {
                            return;
                        }
                        valueAnimator.resume();
                        return;
                    }
                    if (c6sz == null) {
                        return;
                    }
                    ValueAnimator valueAnimator2 = c6sz.A03;
                    if (valueAnimator2.isPaused()) {
                        return;
                    }
                    valueAnimator2.pause();
                    return;
                }
                C6SZ c6sz2 = c38080Gp9.A0V.A07;
                if (c6sz2 == null) {
                    return;
                }
                ValueAnimator valueAnimator3 = c6sz2.A03;
                if (!valueAnimator3.isRunning()) {
                    return;
                }
                valueAnimator3.end();
                return;
            }
            C6SZ c6sz3 = c38080Gp9.A0V.A07;
            if (c6sz3 == null) {
                return;
            }
            ValueAnimator valueAnimator4 = c6sz3.A03;
            if (valueAnimator4.isRunning()) {
                return;
            }
            valueAnimator4.start();
        }
    }

    public final void A02() {
        C104294ms c104294ms;
        C144576fd c144576fd;
        C6SE c6se;
        C104294ms c104294ms2;
        InterfaceC1118853a interfaceC1118853a = this.A04;
        View AuA = interfaceC1118853a.AuA();
        if (AuA != null) {
            if (AuA.getTag() instanceof C38080Gp9) {
                C38080Gp9 c38080Gp9 = (C38080Gp9) AuA.getTag();
                C41181vS c41181vS = c38080Gp9.A06;
                if (c41181vS != null && c41181vS.A1V() && (c104294ms2 = c41181vS.A09) != null && c104294ms2.A00.A0E) {
                    c6se = c38080Gp9.A0V;
                } else {
                    return;
                }
            } else {
                if (!(AuA.getTag() instanceof C143556du)) {
                    return;
                }
                Object tag = AuA.getTag();
                tag.getClass();
                C143556du c143556du = (C143556du) tag;
                C41181vS AuU = interfaceC1118853a.AuU();
                if (AuU == null || !AuU.A1C() || AuU.A0e != EnumC41231vY.A06 || (c104294ms = AuU.A09) == null || !c104294ms.A00.A0E || (c144576fd = c143556du.A0F) == null || (c6se = c144576fd.A03) == null) {
                    return;
                }
            }
            c6se.A00();
        }
    }

    public final void A03() {
        InterfaceC1118853a interfaceC1118853a = this.A04;
        C41181vS AuU = interfaceC1118853a.AuU();
        C18C.A07(AuU, "Current reel item shouldn't be empty when suggested users Netego unit is restarting play!");
        ((ReelViewerFragment) interfaceC1118853a).A1C.C00(AuU).A02(0.0f);
        C147316kH c147316kH = this.A08;
        c147316kH.A02();
        C104294ms c104294ms = AuU.A09;
        C18C.A07(c104294ms, "SU unit is missing suggested users model");
        int i = c104294ms.A00.A00;
        int i2 = i * 1000;
        if (i == 0) {
            i2 = 15000;
        }
        c147316kH.A04(AuU, i2);
    }

    public final void A04(String str) {
        C144576fd c144576fd;
        C6SE c6se;
        InterfaceC1118853a interfaceC1118853a = this.A04;
        View AuA = interfaceC1118853a.AuA();
        if (AuA != null) {
            if (AuA.getTag() instanceof C38080Gp9) {
                C38080Gp9 c38080Gp9 = (C38080Gp9) AuA.getTag();
                C41181vS c41181vS = c38080Gp9.A06;
                if (c41181vS != null && c41181vS.A1V()) {
                    c6se = c38080Gp9.A0V;
                } else {
                    return;
                }
            } else {
                if (!(AuA.getTag() instanceof C143556du)) {
                    return;
                }
                Object tag = AuA.getTag();
                tag.getClass();
                C143556du c143556du = (C143556du) tag;
                C41181vS AuU = interfaceC1118853a.AuU();
                if (AuU == null || !AuU.A1C() || AuU.A0e != EnumC41231vY.A06 || (c144576fd = c143556du.A0F) == null || (c6se = c144576fd.A03) == null) {
                    return;
                }
            }
            if (c6se.A05 != null) {
                if (c6se.A06 != null) {
                    C41181vS c41181vS2 = c6se.A08;
                    if (c41181vS2 != null) {
                        C104294ms c104294ms = c41181vS2.A09;
                        C141596ac c141596ac = c6se.A09;
                        if (c141596ac != null) {
                            int i = c141596ac.A0M;
                            if (c104294ms != null) {
                                List A01 = c104294ms.A01();
                                int size = A01.size();
                                int length = c6se.A04().length;
                                for (int i2 = 0; i2 < length; i2++) {
                                    User user = ((C139196Sa) ((InterfaceC139206Sb) A01.get((i + i2) % size))).A02;
                                    if (C14360o3.A0K(user.getId(), str)) {
                                        C6SY c6sy = c6se.A04()[i2];
                                        C141596ac c141596ac2 = c6se.A09;
                                        if (c141596ac2 != null) {
                                            C6SW.A02(c141596ac2, c6sy, user);
                                            c6sy.A0E.A0J.A04(c6se.A05, c6se.A06, user);
                                            return;
                                        }
                                        throw new IllegalStateException("Required value was null.");
                                    }
                                }
                                return;
                            }
                            return;
                        }
                        throw new IllegalStateException("Required value was null.");
                    }
                    throw new IllegalStateException("Required value was null.");
                }
                throw new IllegalStateException("Required value was null.");
            }
            throw new IllegalStateException("Required value was null.");
        }
    }

    @Override // X.InterfaceC145136gY
    public final /* synthetic */ boolean BWM() {
        return false;
    }

    @Override // X.InterfaceC145136gY
    public final /* synthetic */ int Bs6() {
        return 0;
    }

    @Override // X.InterfaceC145136gY
    public final /* synthetic */ boolean Buz() {
        return false;
    }

    @Override // X.InterfaceC145136gY
    public final /* synthetic */ boolean Cc5() {
        return false;
    }

    @Override // X.InterfaceC145136gY
    public final void D8t(C41181vS c41181vS, C41551w4 c41551w4, InterfaceC143576dw interfaceC143576dw, C141596ac c141596ac) {
        A01(this, C05F.A00);
        if (c41181vS.A1V()) {
            if (Boolean.valueOf(C18U.A06(C06090Tz.A05, this.A02, 36325149762401059L)).booleanValue()) {
                boolean z = c141596ac.A11;
                C104294ms c104294ms = c41181vS.A09;
                if (z && c104294ms != null) {
                    int i = AbstractC139216Sc.A00;
                    for (int i2 = 0; i2 < i; i2++) {
                        AbstractC139216Sc.A04(((C139196Sa) ((InterfaceC139206Sb) c104294ms.A01().get((AbstractC139216Sc.A01 + i2) % c104294ms.A01().size()))).A02.getId());
                    }
                    return;
                }
                AbstractC139216Sc.A02 = System.currentTimeMillis();
            }
        }
    }

    @Override // X.InterfaceC145136gY
    public final void DXv(String str) {
        A01(this, C05F.A01);
    }

    @Override // X.InterfaceC145136gY
    public final void DhB() {
        A01(this, C05F.A0C);
    }

    @Override // X.InterfaceC145136gY
    public final /* synthetic */ boolean DrR() {
        return false;
    }

    @Override // X.InterfaceC145136gY
    public final /* synthetic */ boolean Dra() {
        return false;
    }

    @Override // X.InterfaceC145136gY
    public final /* synthetic */ boolean DsD() {
        return false;
    }

    @Override // X.InterfaceC145136gY
    public final void onDestroyView() {
        C38080Gp9 c38080Gp9;
        C41181vS c41181vS;
        A01(this, C05F.A0N);
        C25671My A00 = AbstractC25651Mw.A00(this.A02);
        A00.A02(this.A01, C3MC.class);
        A00.A02(this.A00, C42281xI.class);
        A02();
        View AuA = this.A04.AuA();
        if (AuA != null && (AuA.getTag() instanceof C38080Gp9) && (c41181vS = (c38080Gp9 = (C38080Gp9) AuA.getTag()).A06) != null && c41181vS.A1V()) {
            if (Boolean.valueOf(C18U.A06(C06090Tz.A05, this.A02, 36325149762401059L)).booleanValue()) {
                c38080Gp9.A00();
            }
        }
    }

    @Override // X.InterfaceC147946lQ
    public final boolean CoF(C41181vS c41181vS, C41551w4 c41551w4, C141596ac c141596ac, float f) {
        if (c41181vS.A1V() && !this.A0A && !c141596ac.A0s && f >= 0.33f) {
            this.A0A = true;
            UserSession userSession = this.A02;
            C23031Ai A00 = AbstractC23021Ah.A00(userSession);
            InterfaceC16530ry interfaceC16530ry = A00.A5Z;
            C0YR[] c0yrArr = C23031Ai.A8c;
            if (!((Boolean) interfaceC16530ry.CES(A00, c0yrArr[255])).booleanValue()) {
                interfaceC16530ry.Egi(A00, true, c0yrArr[255]);
                InterfaceC1118853a interfaceC1118853a = this.A04;
                View AuA = interfaceC1118853a.AuA();
                if (AuA != null && AuA.getTag() != null) {
                    C38080Gp9 c38080Gp9 = (C38080Gp9) interfaceC1118853a.AuA().getTag();
                    C143746eH c143746eH = c38080Gp9.A0Q.A07;
                    if (c143746eH.A04 != null) {
                        C147256kA c147256kA = (C147256kA) this.A05;
                        C5SU c5su = new C5SU(c147256kA.A01, c147256kA.A02, new C149686oL(2131974078));
                        c5su.A03(c143746eH.A04);
                        c5su.A06(EnumC58132lV.A02);
                        c5su.A0G = true;
                        c5su.A04 = new C42705Iv0(this, c38080Gp9);
                        c5su.A00().A07(userSession);
                    }
                }
            }
        }
        return false;
    }
}
