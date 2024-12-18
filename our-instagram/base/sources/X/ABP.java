package X;

import androidx.recyclerview.widget.RecyclerView;
import com.instagram.model.reels.Reel;
import java.util.ArrayList;

/* loaded from: classes4.dex */
public final class ABP {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C156136zh A01;
    public final /* synthetic */ String A02;

    public ABP(C156136zh c156136zh, String str, int i) {
        this.A01 = c156136zh;
        this.A00 = i;
        this.A02 = str;
    }

    public final void A00(RecyclerView recyclerView) {
        C156136zh c156136zh = this.A01;
        int i = this.A00;
        Reel A03 = c156136zh.A07.A03(this.A02);
        ArrayList A1E = AbstractC166987dD.A1E();
        A1E.add(A03);
        C156136zh.A00(recyclerView, A03, C3G2.A1Z, c156136zh, null, A1E, i);
    }
}
