package X;

import com.instagram.archive.fragment.ArchiveReelRecycleBinFragment;
import java.util.List;

/* renamed from: X.Oql, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C55835Oql implements XA4 {
    public final /* synthetic */ ArchiveReelRecycleBinFragment A00;

    public C55835Oql(ArchiveReelRecycleBinFragment archiveReelRecycleBinFragment) {
        this.A00 = archiveReelRecycleBinFragment;
    }

    @Override // X.XA4
    public final void Dx1(List list) {
        ArchiveReelRecycleBinFragment archiveReelRecycleBinFragment = this.A00;
        int firstVisiblePosition = AbstractC37300Gc1.A02(archiveReelRecycleBinFragment).getFirstVisiblePosition();
        InterfaceC56392iX interfaceC56392iX = archiveReelRecycleBinFragment.downloadAllButtonStubHolder;
        if (interfaceC56392iX != null) {
            interfaceC56392iX.getView().setVisibility(MSY.A01(firstVisiblePosition));
        } else {
            C14360o3.A0F("downloadAllButtonStubHolder");
            throw C00O.createAndThrow();
        }
    }
}
