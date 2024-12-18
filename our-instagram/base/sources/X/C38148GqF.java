package X;

import com.instagram.common.session.UserSession;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* renamed from: X.GqF, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38148GqF implements InterfaceC671231d {
    public InterfaceC42381xS A00;
    public final C38086GpF A01;
    public final UserSession A02;
    public final C37934GmW A03;

    @Override // X.InterfaceC671231d
    public final float Aug() {
        throw C00O.createAndThrow();
    }

    @Override // X.InterfaceC671231d
    public final int Bef() {
        throw C00O.createAndThrow();
    }

    @Override // X.InterfaceC671231d
    public final Integer COV(InterfaceC42381xS interfaceC42381xS, C1PZ c1pz, int i) {
        Integer num;
        Number A0Q;
        AbstractC167007dF.A1D(interfaceC42381xS, 0, c1pz);
        C206259Bi c206259Bi = (C206259Bi) interfaceC42381xS.BUM();
        C130455uq c130455uq = (C130455uq) c206259Bi.A02;
        UserSession userSession = this.A02;
        Object A05 = C127895qI.A05(userSession, null, c130455uq, true);
        C40861ut c40861ut = (C40861ut) c206259Bi.A04;
        if (c40861ut != null) {
            int A09 = c40861ut.A09();
            num = Integer.valueOf(A09);
            if (num != null && A09 >= 0) {
                C38086GpF c38086GpF = this.A01;
                if (A09 <= c38086GpF.A01.A03.size()) {
                    if (A05 != null) {
                        if (C32V.A02(userSession)) {
                            return C05F.A03;
                        }
                        String str = this.A03.A05;
                        if (str == null) {
                            str = "";
                        }
                        c38086GpF.A06(str, A05, A09);
                        this.A00 = interfaceC42381xS;
                        return C05F.A00;
                    }
                    return C05F.A1F;
                }
            }
        } else {
            num = null;
        }
        long A01 = C18U.A01(C06090Tz.A05, userSession, 36597356200528683L);
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("Attempted to inject an ad section out of bounds at target position: ");
        A1C.append(num);
        A1C.append(", current grid section size is ");
        C38086GpF c38086GpF2 = this.A01;
        A1C.append(c38086GpF2.A01.A03.size());
        C0w9.A04("explore_grid_acp", A1C.toString(), (int) A01);
        String str2 = this.A03.A05;
        if (str2 == null) {
            str2 = "";
        }
        Long A0j = AbstractC25231BEo.A0j(0, str2);
        if (A0j != null && (A0Q = AbstractC37300Gc1.A0Q(A0j, c38086GpF2.A05)) != null && A0Q.intValue() > 0) {
            return C05F.A01;
        }
        return C05F.A0C;
    }

    @Override // X.InterfaceC671231d
    public final void DrH() {
        this.A00 = null;
    }

    @Override // X.InterfaceC671231d
    public final void E6u(String str, List list, int i, int i2, int i3, int i4) {
    }

    @Override // X.InterfaceC671231d
    public final InterfaceC42381xS F9D() {
        return null;
    }

    @Override // X.InterfaceC671231d
    public final List AGp() {
        return C16930sl.A00;
    }

    @Override // X.InterfaceC671231d
    public final /* bridge */ /* synthetic */ void AHZ(Object obj) {
        throw AbstractC166987dD.A1D("Ad Pod is not supported for Explore Grid Ads.");
    }

    @Override // X.InterfaceC671231d
    public final /* bridge */ /* synthetic */ boolean CWc(Object obj) {
        C206259Bi c206259Bi = (C206259Bi) obj;
        C14360o3.A0B(c206259Bi, 0);
        C38086GpF c38086GpF = this.A01;
        C38321qM A00 = ((C130455uq) c206259Bi.A02).A00();
        if (A00 != null && c38086GpF.A01.A04(A00) != null) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC671231d
    public final InterfaceC42381xS Cpq() {
        return this.A00;
    }

    @Override // X.InterfaceC671231d
    public final /* bridge */ /* synthetic */ void E6t(Object obj) {
        throw AbstractC166987dD.A1D("HP Push-Up is not supported for Explore Grid Ads");
    }

    public C38148GqF(UserSession userSession, C38086GpF c38086GpF, C37934GmW c37934GmW) {
        this.A01 = c38086GpF;
        this.A03 = c37934GmW;
        this.A02 = userSession;
    }

    @Override // X.InterfaceC671231d
    public final List BZU() {
        List emptyList = Collections.emptyList();
        C14360o3.A07(emptyList);
        return emptyList;
    }

    @Override // X.InterfaceC671231d
    public final List BZa() {
        List emptyList = Collections.emptyList();
        C14360o3.A07(emptyList);
        return emptyList;
    }

    @Override // X.InterfaceC671231d
    public final int Bee() {
        throw C00O.createAndThrow();
    }

    @Override // X.InterfaceC671231d
    public final /* bridge */ /* synthetic */ Object BUP(int i) {
        return null;
    }

    @Override // X.InterfaceC671231d
    public final /* bridge */ /* synthetic */ boolean F9C(Object obj, String str, Map map) {
        return false;
    }
}
