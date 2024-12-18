package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.IGLiveBadgeSettings;
import com.instagram.api.schemas.LiveUserPaySupportTier;

/* renamed from: X.NQf, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C52632NQf extends C17T implements InterfaceC109844xC {
    @Override // X.InterfaceC109844xC
    public final IGLiveBadgeSettings AfH() {
        return (IGLiveBadgeSettings) A0N(759758260, C57610PhM.A00);
    }

    @Override // X.InterfaceC109844xC
    public final InterfaceC109814x8 Bbh() {
        return (InterfaceC109814x8) A05(2016232121, C52633NQg.class);
    }

    @Override // X.InterfaceC109844xC
    public final LiveUserPaySupportTier CGK() {
        return (LiveUserPaySupportTier) A0N(1226226015, C57611PhN.A00);
    }

    @Override // X.InterfaceC109844xC
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI(AbstractC53783NqZ.A00(this), this);
    }

    @Override // X.InterfaceC109844xC
    public final Integer AfI() {
        return getOptionalIntValueByHashCode(-672601792);
    }

    @Override // X.InterfaceC109844xC
    public final Boolean BPm() {
        return getOptionalBooleanValueByHashCode(-802404186);
    }

    @Override // X.InterfaceC109844xC
    public final C109834xB Ew4() {
        C109804x7 c109804x7;
        IGLiveBadgeSettings AfH = AfH();
        Integer optionalIntValueByHashCode = getOptionalIntValueByHashCode(-672601792);
        Boolean optionalBooleanValueByHashCode = getOptionalBooleanValueByHashCode(-802404186);
        InterfaceC109814x8 Bbh = Bbh();
        if (Bbh != null) {
            c109804x7 = Bbh.Ew5();
        } else {
            c109804x7 = null;
        }
        return new C109834xB(AfH, CGK(), c109804x7, optionalBooleanValueByHashCode, optionalIntValueByHashCode);
    }
}
