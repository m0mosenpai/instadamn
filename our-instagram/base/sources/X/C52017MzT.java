package X;

import com.facebook.rsys.mediastats.gen.MediaStats;
import com.facebook.rsys.mediastats.gen.MediaStatsListener;
import com.instagram.rtc.rsys.models.IgCallModel;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.MzT, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C52017MzT extends MediaStatsListener {
    public final /* synthetic */ C52018MzU A00;

    @Override // com.facebook.rsys.mediastats.gen.MediaStatsListener
    public final void onMediaStats(ArrayList arrayList) {
        C14360o3.A0B(arrayList, 0);
        C54453O4h c54453O4h = this.A00.A02;
        ArrayList A0q = AbstractC167017dG.A0q(arrayList);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            A0q.add(new ODK((MediaStats) it.next()));
        }
        InterfaceC06180Ui interfaceC06180Ui = c54453O4h.A00.A0C.A02;
        C14360o3.A0B(interfaceC06180Ui, 0);
        C51883MwR c51883MwR = (C51883MwR) AbstractC001800i.A0J(interfaceC06180Ui.Bn0());
        if (c51883MwR != null) {
            String str = c51883MwR.A01;
            IgCallModel igCallModel = c51883MwR.A00;
            C14360o3.A0B(str, 0);
            interfaceC06180Ui.F8m(new C51883MwR(igCallModel, str, A0q));
        }
    }

    public C52017MzT(C52018MzU c52018MzU) {
        this.A00 = c52018MzU;
    }
}
