package X;

import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

/* loaded from: classes6.dex */
public final class GLA implements Runnable {
    public final /* synthetic */ C32736Eb2 A00;

    public GLA(C32736Eb2 c32736Eb2) {
        this.A00 = c32736Eb2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str;
        C32736Eb2 c32736Eb2 = this.A00;
        C31826Dyk c31826Dyk = c32736Eb2.A03;
        if (c31826Dyk == null) {
            str = "promptNamingSuggestionsViewModel";
        } else {
            int size = ((List) c31826Dyk.A09.getValue()).size();
            if (size > 0) {
                InterfaceC56392iX interfaceC56392iX = c32736Eb2.A01;
                if (interfaceC56392iX == null) {
                    str = "suggestionRecyclerView";
                } else {
                    ((RecyclerView) interfaceC56392iX.getView()).A0o(size - 1);
                    return;
                }
            } else {
                return;
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }
}
