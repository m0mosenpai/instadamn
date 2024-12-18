package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.AppreciationUFIEntryActionType;

/* renamed from: X.5Qb, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C116725Qb extends C0T6 implements InterfaceC116735Qc {
    public final int A00;
    public final AppreciationUFIEntryActionType A01;

    public C116725Qb(AppreciationUFIEntryActionType appreciationUFIEntryActionType, int i) {
        C14360o3.A0B(appreciationUFIEntryActionType, 1);
        this.A01 = appreciationUFIEntryActionType;
        this.A00 = i;
    }

    @Override // X.InterfaceC116735Qc
    public final C116725Qb Eqv() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C116725Qb) {
                C116725Qb c116725Qb = (C116725Qb) obj;
                if (this.A01 != c116725Qb.A01 || this.A00 != c116725Qb.A00) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (this.A01.hashCode() * 31) + this.A00;
    }

    @Override // X.InterfaceC116735Qc
    public final /* bridge */ /* synthetic */ IGE AKG() {
        return new IGE(this);
    }

    @Override // X.InterfaceC116735Qc
    public final AppreciationUFIEntryActionType AYg() {
        return this.A01;
    }

    @Override // X.InterfaceC116735Qc
    public final int B9q() {
        return this.A00;
    }

    @Override // X.InterfaceC116735Qc
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTAppreciationUFIEntryObject", AbstractC39745HkH.A00(this));
    }
}
