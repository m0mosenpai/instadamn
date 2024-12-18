package X;

/* renamed from: X.Gng, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37995Gng extends C0T6 {
    public final int A00 = 0;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;
    public final Object A06;
    public final Object A07;
    public final Object A08;
    public final Object A09;
    public final Object A0A;
    public final Object A0B;

    public C37995Gng(JFW jfw, InterfaceC16820sZ interfaceC16820sZ, InterfaceC16820sZ interfaceC16820sZ2, InterfaceC16820sZ interfaceC16820sZ3, InterfaceC16820sZ interfaceC16820sZ4, InterfaceC16820sZ interfaceC16820sZ5, InterfaceC16820sZ interfaceC16820sZ6, InterfaceC16820sZ interfaceC16820sZ7, InterfaceC16660sJ interfaceC16660sJ, InterfaceC16660sJ interfaceC16660sJ2, InterfaceC16620sF interfaceC16620sF) {
        C14360o3.A0B(jfw, 1);
        this.A06 = jfw;
        this.A09 = interfaceC16660sJ;
        this.A08 = interfaceC16820sZ;
        this.A07 = interfaceC16660sJ2;
        this.A0B = interfaceC16820sZ2;
        this.A03 = interfaceC16820sZ3;
        this.A0A = interfaceC16620sF;
        this.A04 = interfaceC16820sZ4;
        this.A02 = interfaceC16820sZ5;
        this.A05 = interfaceC16820sZ6;
        this.A01 = interfaceC16820sZ7;
    }

    public final boolean equals(Object obj) {
        Object obj2;
        Object obj3;
        if (this.A00 != 0) {
            if (this != obj) {
                if (obj instanceof C37995Gng) {
                    C37995Gng c37995Gng = (C37995Gng) obj;
                    if (c37995Gng.A00 == 1 && C14360o3.A0K(this.A06, c37995Gng.A06) && C14360o3.A0K(this.A09, c37995Gng.A09) && C14360o3.A0K(this.A08, c37995Gng.A08) && C14360o3.A0K(this.A07, c37995Gng.A07) && C14360o3.A0K(this.A0B, c37995Gng.A0B) && C14360o3.A0K(this.A03, c37995Gng.A03) && C14360o3.A0K(this.A0A, c37995Gng.A0A) && C14360o3.A0K(this.A04, c37995Gng.A04) && C14360o3.A0K(this.A02, c37995Gng.A02) && C14360o3.A0K(this.A05, c37995Gng.A05)) {
                        obj2 = this.A01;
                        obj3 = c37995Gng.A01;
                    } else {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                return true;
            }
        } else if (this != obj) {
            if (!(obj instanceof C37995Gng)) {
                return false;
            }
            C37995Gng c37995Gng2 = (C37995Gng) obj;
            if (c37995Gng2.A00 != 0 || !C14360o3.A0K(this.A04, c37995Gng2.A04) || !C14360o3.A0K(this.A02, c37995Gng2.A02) || !C14360o3.A0K(this.A09, c37995Gng2.A09) || !C14360o3.A0K(this.A07, c37995Gng2.A07) || !C14360o3.A0K(this.A01, c37995Gng2.A01) || !C14360o3.A0K(this.A08, c37995Gng2.A08) || !C14360o3.A0K(this.A0A, c37995Gng2.A0A) || !C14360o3.A0K(this.A03, c37995Gng2.A03) || !C14360o3.A0K(this.A06, c37995Gng2.A06) || !C14360o3.A0K(this.A0B, c37995Gng2.A0B)) {
                return false;
            }
            obj2 = this.A05;
            obj3 = c37995Gng2.A05;
        } else {
            return true;
        }
        if (!C14360o3.A0K(obj2, obj3)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int A0J;
        Object obj;
        if (this.A00 != 0) {
            A0J = AbstractC166997dE.A0J(this.A05, AbstractC166997dE.A0J(this.A02, AbstractC166997dE.A0J(this.A04, AbstractC166997dE.A0J(this.A0A, AbstractC166997dE.A0J(this.A03, AbstractC166997dE.A0J(this.A0B, AbstractC166997dE.A0J(this.A07, AbstractC166997dE.A0J(this.A08, AbstractC166997dE.A0J(this.A09, AbstractC166987dD.A0G(this.A06))))))))));
            obj = this.A01;
        } else {
            A0J = AbstractC166997dE.A0J(this.A0B, AbstractC166997dE.A0J(this.A06, AbstractC166997dE.A0J(this.A03, AbstractC166997dE.A0J(this.A0A, AbstractC166997dE.A0J(this.A08, AbstractC166997dE.A0J(this.A01, AbstractC166997dE.A0J(this.A07, AbstractC166997dE.A0J(this.A09, AbstractC166997dE.A0J(this.A02, AbstractC166987dD.A0G(this.A04))))))))));
            obj = this.A05;
        }
        return AbstractC166987dD.A0I(obj, A0J);
    }

    public final String toString() {
        if (this.A00 != 0) {
            return super.toString();
        }
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("AdUniversalCTAUiActions(getCarouselMedia=");
        A1C.append(this.A04);
        A1C.append(", getCarouselIndex=");
        A1C.append(this.A02);
        A1C.append(", getMediaStatePosition=");
        A1C.append(this.A09);
        A1C.append(", getLinkFromAdMedia=");
        A1C.append(this.A07);
        A1C.append(", getAdOverlaySubtitle=");
        A1C.append(this.A01);
        A1C.append(", getLinkText=");
        A1C.append(this.A08);
        A1C.append(", isAd=");
        A1C.append(this.A0A);
        A1C.append(", setStyledCTAColor=");
        A1C.append(this.A03);
        A1C.append(", getIGAutomatedLoggingTrackingDataGenerator=");
        A1C.append(this.A06);
        A1C.append(", onClickCTAButton=");
        A1C.append(this.A0B);
        A1C.append(", getCurrentMedia=");
        return AbstractC167017dG.A0o(this.A05, A1C);
    }

    public C37995Gng(InterfaceC16820sZ interfaceC16820sZ, InterfaceC16820sZ interfaceC16820sZ2, InterfaceC16820sZ interfaceC16820sZ3, InterfaceC16820sZ interfaceC16820sZ4, InterfaceC16820sZ interfaceC16820sZ5, InterfaceC16660sJ interfaceC16660sJ, InterfaceC16660sJ interfaceC16660sJ2, InterfaceC16660sJ interfaceC16660sJ3, InterfaceC16620sF interfaceC16620sF, InterfaceC16620sF interfaceC16620sF2, InterfaceC16610sE interfaceC16610sE) {
        this.A04 = interfaceC16820sZ;
        this.A02 = interfaceC16820sZ2;
        this.A09 = interfaceC16820sZ3;
        this.A07 = interfaceC16660sJ;
        this.A01 = interfaceC16660sJ2;
        this.A08 = interfaceC16660sJ3;
        this.A0A = interfaceC16820sZ4;
        this.A03 = interfaceC16620sF;
        this.A06 = interfaceC16620sF2;
        this.A0B = interfaceC16610sE;
        this.A05 = interfaceC16820sZ5;
    }
}
