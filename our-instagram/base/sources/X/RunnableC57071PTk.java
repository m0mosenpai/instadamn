package X;

import com.instagram.creation.photo.edit.effectfilter.PhotoFilter;
import com.instagram.filterkit.filtergroup.model.intf.FilterGroupModel;

/* renamed from: X.PTk, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class RunnableC57071PTk implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ C56208OxH A02;
    public final /* synthetic */ PhotoFilter A03;
    public final /* synthetic */ FilterGroupModel A04;
    public final /* synthetic */ InterfaceC16660sJ A05;

    public RunnableC57071PTk(C56208OxH c56208OxH, PhotoFilter photoFilter, FilterGroupModel filterGroupModel, InterfaceC16660sJ interfaceC16660sJ, int i, int i2) {
        this.A04 = filterGroupModel;
        this.A03 = photoFilter;
        this.A02 = c56208OxH;
        this.A01 = i;
        this.A00 = i2;
        this.A05 = interfaceC16660sJ;
    }

    @Override // java.lang.Runnable
    public final void run() {
        FilterGroupModel filterGroupModel = this.A04;
        if (filterGroupModel != null) {
            filterGroupModel.EUT(this.A03.A03, 17);
        }
        C56208OxH c56208OxH = this.A02;
        c56208OxH.A08.A02.post(new PTZ(c56208OxH, filterGroupModel, this.A05, this.A01, this.A00));
    }
}
