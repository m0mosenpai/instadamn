package X;

import com.instagram.creation.fragment.EditMediaInfoFragment;
import com.instagram.location.intf.LocationSignalPackage;

/* renamed from: X.P4m, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C56450P4m implements InterfaceC57959Pn5 {
    public final /* synthetic */ EditMediaInfoFragment A00;

    public C56450P4m(EditMediaInfoFragment editMediaInfoFragment) {
        this.A00 = editMediaInfoFragment;
    }

    @Override // X.InterfaceC57959Pn5
    public final void DQG(LocationSignalPackage locationSignalPackage) {
        EditMediaInfoFragment editMediaInfoFragment = this.A00;
        editMediaInfoFragment.A01 = locationSignalPackage.BOK();
        editMediaInfoFragment.A0K = locationSignalPackage;
        EditMediaInfoFragment.A05(editMediaInfoFragment);
    }
}
