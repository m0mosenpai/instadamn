package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.ClipsMashupType;

/* renamed from: X.Gn8, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37966Gn8 extends C17T implements InterfaceC84163p3 {
    public C4GI A00;

    @Override // X.InterfaceC84163p3
    public final /* synthetic */ IMZ AKf() {
        return new IMZ(this);
    }

    @Override // X.InterfaceC84163p3
    public final ClipsMashupType BPi() {
        return (ClipsMashupType) A0N(-1254804651, C38001Gnm.A00);
    }

    @Override // X.InterfaceC84163p3
    public final C4GI BZr() {
        C4GI c4gi = this.A00;
        if (c4gi == null) {
            return (C4GI) A05(1923742710, HVq.class);
        }
        return c4gi;
    }

    @Override // X.InterfaceC84163p3
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC25234BEr.A0P(this, AbstractC37355Gcx.A00(this));
    }

    @Override // X.InterfaceC84163p3
    public final String B8F() {
        return A0i(-811800516);
    }

    @Override // X.InterfaceC84163p3
    public final Boolean BCG() {
        return getOptionalBooleanValueByHashCode(-1009480352);
    }

    @Override // X.InterfaceC84163p3
    public final Integer BXE() {
        return getOptionalIntValueByHashCode(546409413);
    }

    @Override // X.InterfaceC84163p3
    public final Integer Bgd() {
        return getOptionalIntValueByHashCode(1837239699);
    }

    @Override // X.InterfaceC84163p3
    public final Boolean CXM() {
        return getOptionalBooleanValueByHashCode(-1428701633);
    }

    @Override // X.InterfaceC84163p3
    public final Boolean CXN() {
        return getOptionalBooleanValueByHashCode(-1981942243);
    }

    @Override // X.InterfaceC84163p3
    public final Boolean Cc6() {
        return getOptionalBooleanValueByHashCode(-1847416696);
    }

    @Override // X.InterfaceC84163p3
    public final InterfaceC84163p3 EBH(C1DY c1dy) {
        C4GI BZr = BZr();
        if (BZr != null) {
            BZr.EBJ(c1dy);
        } else {
            BZr = null;
        }
        this.A00 = BZr;
        return this;
    }

    @Override // X.InterfaceC84163p3
    public final C84153p2 F4G(C1DY c1dy) {
        C4GH c4gh;
        boolean booleanValueByHashCode = getBooleanValueByHashCode(1792143740);
        String A0i = A0i(-811800516);
        boolean booleanValueByHashCode2 = getBooleanValueByHashCode(1273031908);
        Boolean optionalBooleanValueByHashCode = getOptionalBooleanValueByHashCode(-1009480352);
        boolean booleanValueByHashCode3 = getBooleanValueByHashCode(1603013096);
        Boolean optionalBooleanValueByHashCode2 = getOptionalBooleanValueByHashCode(-1428701633);
        Boolean optionalBooleanValueByHashCode3 = getOptionalBooleanValueByHashCode(-1981942243);
        boolean booleanValueByHashCode4 = getBooleanValueByHashCode(-517184853);
        Boolean optionalBooleanValueByHashCode4 = getOptionalBooleanValueByHashCode(-1847416696);
        ClipsMashupType BPi = BPi();
        boolean booleanValueByHashCode5 = getBooleanValueByHashCode(-98602216);
        Integer optionalIntValueByHashCode = getOptionalIntValueByHashCode(546409413);
        C4GI BZr = BZr();
        if (BZr != null) {
            c4gh = BZr.F4Q(c1dy);
        } else {
            c4gh = null;
        }
        return new C84153p2(BPi, c4gh, optionalBooleanValueByHashCode, optionalBooleanValueByHashCode2, optionalBooleanValueByHashCode3, optionalBooleanValueByHashCode4, optionalIntValueByHashCode, getOptionalIntValueByHashCode(1837239699), A0i, booleanValueByHashCode, booleanValueByHashCode2, booleanValueByHashCode3, booleanValueByHashCode4, booleanValueByHashCode5);
    }

    @Override // X.InterfaceC84163p3
    public final C84153p2 F4H(C1DV c1dv) {
        return F4G(AbstractC37304Gc5.A09(c1dv));
    }

    @Override // X.InterfaceC84163p3
    public final boolean getCanToggleMashupsAllowed() {
        return getBooleanValueByHashCode(1792143740);
    }

    @Override // X.InterfaceC84163p3
    public final boolean getHasBeenMashedUp() {
        return getBooleanValueByHashCode(1273031908);
    }

    @Override // X.InterfaceC84163p3
    public final boolean getMashupsAllowed() {
        return getBooleanValueByHashCode(-98602216);
    }

    @Override // X.InterfaceC84163p3
    public final boolean isCreatorRequestingMashup() {
        return getBooleanValueByHashCode(1603013096);
    }

    @Override // X.InterfaceC84163p3
    public final boolean isPivotPageAvailable() {
        return getBooleanValueByHashCode(-517184853);
    }
}
