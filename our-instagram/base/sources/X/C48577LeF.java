package X;

import com.instagram.creation.base.VideoSession;
import com.instagram.filterkit.filtergroup.model.impl.FilterGroupModelImpl;
import com.instagram.filterkit.filtergroup.model.intf.FilterGroupModel;

/* renamed from: X.LeF, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C48577LeF implements InterfaceC57930Pma {
    public final VideoSession A00;

    @Override // X.InterfaceC57930Pma
    public final void ELh() {
        FilterGroupModelImpl filterGroupModelImpl;
        VideoSession videoSession = this.A00;
        FilterGroupModel filterGroupModel = videoSession.A0D;
        if (filterGroupModel != null) {
            filterGroupModelImpl = filterGroupModel.E3K();
        } else {
            filterGroupModelImpl = null;
        }
        videoSession.A0E = filterGroupModelImpl;
    }

    public C48577LeF(VideoSession videoSession) {
        this.A00 = videoSession;
    }
}
