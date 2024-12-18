package X;

import com.instagram.creation.base.ui.feedcolorfilterpicker.FeedColorFilterPicker;
import com.instagram.creation.base.ui.feedcolorfilterpicker.FilterPicker;

/* loaded from: classes8.dex */
public final class KLL extends AbstractRunnableC14200nk {
    public final /* synthetic */ FilterPicker A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KLL(FilterPicker filterPicker) {
        super(346);
        this.A00 = filterPicker;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C47283Kuu c47283Kuu = new C47283Kuu();
        FilterPicker filterPicker = this.A00;
        c47283Kuu.A00 = AbstractC166987dD.A1F(filterPicker.A07);
        InterfaceC58110PpZ interfaceC58110PpZ = ((FeedColorFilterPicker) filterPicker).A05;
        if (interfaceC58110PpZ != null) {
            interfaceC58110PpZ.DtC(c47283Kuu);
        }
    }
}
