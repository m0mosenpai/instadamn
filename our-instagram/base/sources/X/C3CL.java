package X;

import com.instagram.api.schemas.DemarcatorActionType;
import com.instagram.api.schemas.DemarcatorStyleEnum;
import com.instagram.api.schemas.FeedItemType;

/* renamed from: X.3CL, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3CL implements InterfaceC38381qS {
    public C1XV A00;
    public final DemarcatorActionType A01;
    public final DemarcatorActionType A02;
    public final DemarcatorStyleEnum A03;
    public final C110414yD A04;
    public final C110434yF A05;
    public final C110424yE A06;
    public final C1XV A07;
    public final Integer A08;
    public final String A09;
    public final String A0A;
    public final String A0B;
    public final String A0C;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        String str = this.A04.A0B;
        C110414yD c110414yD = ((C3CL) obj).A04;
        if (str == null) {
            return c110414yD.A0B == null;
        }
        return str.equals(c110414yD.A0B);
    }

    @Override // X.InterfaceC38381qS
    public final C1XV B5n() {
        return this.A07;
    }

    @Override // X.InterfaceC38381qS
    public final Integer BA3() {
        return this.A04.A09;
    }

    @Override // X.InterfaceC38381qS
    public final InterfaceC39571se BK1() {
        return this.A04.A04;
    }

    @Override // X.InterfaceC38381qS
    public final String CAR() {
        return this.A04.A0B;
    }

    @Override // X.InterfaceC38381qS
    public final Integer CCj() {
        return C05F.A01;
    }

    @Override // X.InterfaceC38381qS
    public final Integer CFr() {
        return this.A04.A0A;
    }

    @Override // X.InterfaceC38381qS, X.InterfaceC38411qV
    public final String getId() {
        return this.A04.A0B;
    }

    public final int hashCode() {
        String str = this.A04.A0B;
        if (str != null) {
            return str.hashCode();
        }
        return super.hashCode();
    }

    public C3CL(C110414yD c110414yD, C1XV c1xv) {
        C110424yE c110424yE;
        this.A04 = c110414yD;
        this.A07 = c1xv;
        this.A0C = c110414yD.A0F;
        this.A0B = c110414yD.A0E;
        this.A08 = c110414yD.A08;
        this.A03 = c110414yD.A02;
        this.A01 = c110414yD.A00;
        this.A09 = c110414yD.A0C;
        this.A02 = c110414yD.A01;
        this.A0A = c110414yD.A0D;
        InterfaceC110404yC interfaceC110404yC = c110414yD.A05;
        if (interfaceC110404yC != null) {
            c110424yE = new C110424yE(interfaceC110404yC);
        } else {
            c110424yE = null;
        }
        this.A06 = c110424yE;
        InterfaceC110384yA interfaceC110384yA = c110414yD.A06;
        this.A05 = interfaceC110384yA != null ? new C110434yF(interfaceC110384yA) : null;
        FeedItemType feedItemType = c110414yD.A03;
        if (feedItemType != null) {
            this.A00 = (C1XV) C1XV.A01.get(feedItemType.A00);
        }
    }
}
