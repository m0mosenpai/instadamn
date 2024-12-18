package X;

import com.instagram.common.recyclerview.ViewModelListUpdate;
import kotlin.Deprecated;

/* loaded from: classes8.dex */
public final class JXU implements InterfaceC65242xM {
    public final C66362zD A00;
    public final C27F A01;

    public final void A00(ViewModelListUpdate viewModelListUpdate) {
        C14360o3.A0B(viewModelListUpdate, 0);
        this.A00.A05(viewModelListUpdate);
        this.A01.A00 = viewModelListUpdate;
    }

    @Override // X.InterfaceC65242xM
    public final /* bridge */ /* synthetic */ Object getAdapter() {
        return this.A00;
    }

    @Override // X.InterfaceC65242xM
    public final int getCount() {
        return this.A00.getItemCount();
    }

    @Override // X.InterfaceC65242xM
    @Deprecated(message = "Getting an item by position leads to bad practices, since you rely on unsafe casting. Adapter could change type of internal items and your code will be broken.")
    public final Object getItem(int i) {
        return this.A00.A04(i);
    }

    public JXU(C66362zD c66362zD, C27F c27f) {
        this.A00 = c66362zD;
        this.A01 = c27f;
    }
}
