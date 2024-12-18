package X;

import com.instagram.creation.base.PhotoSession;
import com.instagram.filterkit.filtergroup.model.impl.FilterGroupModelImpl;
import com.instagram.filterkit.filtergroup.model.intf.FilterGroupModel;

/* renamed from: X.OxQ, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C56217OxQ implements InterfaceC57930Pma {
    public final PhotoSession A00;

    @Override // X.InterfaceC57930Pma
    public final void ELh() {
        FilterGroupModelImpl filterGroupModelImpl;
        PhotoSession photoSession = this.A00;
        FilterGroupModel filterGroupModel = photoSession.A07;
        if (filterGroupModel != null) {
            filterGroupModelImpl = filterGroupModel.E3K();
        } else {
            filterGroupModelImpl = null;
        }
        photoSession.A08 = filterGroupModelImpl;
    }

    public C56217OxQ(PhotoSession photoSession) {
        this.A00 = photoSession;
    }
}
