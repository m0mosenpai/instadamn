package X;

import com.instagram.common.session.UserSession;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* renamed from: X.Iz7, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C42955Iz7 implements InterfaceC671231d {
    public InterfaceC42381xS A00;
    public final C68033V7e A01;
    public final UserSession A02;

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
        int intValue;
        C14360o3.A0B(interfaceC42381xS, 0);
        Object BUM = interfaceC42381xS.BUM();
        C206259Bi c206259Bi = (C206259Bi) BUM;
        C130455uq c130455uq = (C130455uq) c206259Bi.A02;
        UserSession userSession = this.A02;
        Object A05 = C127895qI.A05(userSession, null, c130455uq, true);
        C40861ut c40861ut = (C40861ut) c206259Bi.A04;
        if (c40861ut != null) {
            num = Integer.valueOf(c40861ut.A09());
        } else {
            num = null;
        }
        if (num != null && (intValue = num.intValue()) >= 0) {
            C68033V7e c68033V7e = this.A01;
            if (intValue <= c68033V7e.A05()) {
                Number number = (Number) c206259Bi.A03;
                if (number == null) {
                    StringBuilder A1C = AbstractC166987dD.A1C();
                    A1C.append("page index is null, model type: ");
                    C0w9.A03("SearchGridAdsSponsoredContentInjector", AbstractC166997dE.A0v(BUM.getClass(), A1C));
                }
                if (A05 != null) {
                    if (C32V.A03(userSession)) {
                        return C05F.A03;
                    }
                    c68033V7e.A08(intValue, AbstractC37302Gc3.A02(number), A05);
                    this.A00 = interfaceC42381xS;
                    return C05F.A00;
                }
                return C05F.A1F;
            }
        }
        StringBuilder A1C2 = AbstractC166987dD.A1C();
        A1C2.append("Attempted to inject an Ad section out of bounds at target position: ");
        A1C2.append(num);
        A1C2.append(", current grid section size is ");
        A1C2.append(this.A01.A05());
        C0w9.A03("SearchGridAdsSponsoredContentInjector", A1C2.toString());
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
        throw AbstractC166987dD.A1D("Ad Pod is not supported for Search Grid Ads.");
    }

    @Override // X.InterfaceC671231d
    public final /* bridge */ /* synthetic */ boolean CWc(Object obj) {
        C206259Bi c206259Bi = (C206259Bi) obj;
        C14360o3.A0B(c206259Bi, 0);
        return AbstractC167007dF.A1W(this.A01.A07(((C130455uq) c206259Bi.A02).A00()));
    }

    @Override // X.InterfaceC671231d
    public final InterfaceC42381xS Cpq() {
        return this.A00;
    }

    @Override // X.InterfaceC671231d
    public final /* bridge */ /* synthetic */ void E6t(Object obj) {
        throw AbstractC166987dD.A1D("HP Push-Up is not supported for Search Grid Ads");
    }

    public C42955Iz7(UserSession userSession, C68033V7e c68033V7e) {
        this.A01 = c68033V7e;
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
