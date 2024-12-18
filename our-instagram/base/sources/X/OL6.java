package X;

import com.facebook.react.modules.dialog.DialogModule;
import com.instagram.creation.base.MediaSession;
import com.instagram.filterkit.filtergroup.model.intf.FilterGroupModel;

/* loaded from: classes9.dex */
public final class OL6 {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public MediaSession A04;
    public C5QB A05;
    public String A06;
    public boolean A07;
    public FilterGroupModel A08;

    public final FilterGroupModel A00() {
        FilterGroupModel filterGroupModel = this.A08;
        if (filterGroupModel == null) {
            C0f5 AEp = C18950wb.A01.AEp("getFilterGroupModel", 817891240);
            AEp.ABW(DialogModule.KEY_MESSAGE, "filter group model was null");
            AEp.report();
            return null;
        }
        return filterGroupModel.E3K();
    }

    public final void A01(FilterGroupModel filterGroupModel) {
        if (filterGroupModel == null) {
            C0f5 AEp = C18950wb.A01.AEp("setFilterGroupModel", 817891240);
            AEp.ABW(DialogModule.KEY_MESSAGE, "FilterGroupModel passed into setFilterGroupModel was null");
            AEp.report();
            return;
        }
        this.A08 = filterGroupModel.E3K();
    }
}
