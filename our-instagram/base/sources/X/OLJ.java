package X;

/* loaded from: classes9.dex */
public final class OLJ {
    public final C69475Vny A00;

    public final C69013Vfp A00() {
        C69013Vfp c69013Vfp = this.A00.A01;
        if (c69013Vfp != null) {
            return c69013Vfp;
        }
        C14360o3.A0F("leadAdsAdvertiserProfile");
        throw C00O.createAndThrow();
    }

    public final C69135ViQ A01() {
        C69135ViQ c69135ViQ = this.A00.A05;
        if (c69135ViQ != null) {
            return c69135ViQ;
        }
        C14360o3.A0F("leadAdsQuestionPage");
        throw C00O.createAndThrow();
    }

    public final boolean A02() {
        OUJ ouj = this.A00.A06;
        if (ouj != null) {
            return AbstractC167007dF.A1W(ouj.A00);
        }
        C14360o3.A0F("leadAdsThankYouPage");
        throw C00O.createAndThrow();
    }

    public OLJ(C69475Vny c69475Vny) {
        this.A00 = c69475Vny;
    }
}
