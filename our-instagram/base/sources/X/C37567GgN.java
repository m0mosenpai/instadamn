package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.GgN, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37567GgN implements InterfaceC149606oD {
    public final Context A00;
    public final InterfaceC11380iw A01;
    public final UserSession A02;
    public java.util.Set preparedMedias = AbstractC31171DnF.A0l();
    public final Map A03 = new ConcurrentHashMap();

    @Override // X.InterfaceC149606oD
    public final /* synthetic */ void onProgressUpdate(int i, int i2, boolean z) {
    }

    public final void A00() {
        Map map = this.A03;
        ArrayList A17 = AbstractC25225BEi.A17(map.size());
        Iterator A15 = AbstractC166997dE.A15(map);
        while (A15.hasNext()) {
            ((J28) AbstractC31176DnK.A0j(A15)).A01();
            A17.add(C0eB.A00);
        }
        map.clear();
        this.preparedMedias.clear();
    }

    @Override // X.InterfaceC149606oD
    public final void DzY(C38321qM c38321qM) {
        Map map = this.A03;
        if (map.containsKey(c38321qM) && c38321qM != null) {
            this.preparedMedias.add(c38321qM);
        }
        if (this.preparedMedias.size() == map.size()) {
            ArrayList A17 = AbstractC25225BEi.A17(map.size());
            Iterator A15 = AbstractC166997dE.A15(map);
            while (A15.hasNext()) {
                J28.A00((J28) AbstractC31176DnK.A0j(A15));
                A17.add(C0eB.A00);
            }
        }
    }

    @Override // X.InterfaceC149606oD
    public final void onCompletion() {
        Map map = this.A03;
        LinkedHashMap A18 = AbstractC25225BEi.A18(AbstractC16850sd.A0L(map.size()));
        Iterator A15 = AbstractC166997dE.A15(map);
        while (A15.hasNext()) {
            Map.Entry A1K = AbstractC166987dD.A1K(A15);
            Object key = A1K.getKey();
            C5TA c5ta = ((J28) A1K.getValue()).A01;
            if (c5ta != null) {
                c5ta.A09("paused_for_replay");
            }
            J28.A00((J28) A1K.getValue());
            A18.put(key, C0eB.A00);
        }
    }

    public C37567GgN(Context context, InterfaceC11380iw interfaceC11380iw, UserSession userSession) {
        this.A00 = context;
        this.A02 = userSession;
        this.A01 = interfaceC11380iw;
    }

    public final void A01(Map map) {
        ArrayList A17 = AbstractC25225BEi.A17(map.size());
        Iterator A15 = AbstractC166997dE.A15(map);
        while (A15.hasNext()) {
            C39440HbS c39440HbS = (C39440HbS) AbstractC31176DnK.A0j(A15);
            J28 j28 = new J28(this.A00, this.A01, this.A02, this);
            this.A03.put(c39440HbS.A00, j28);
            j28.A02(c39440HbS, false);
            A17.add(C0eB.A00);
        }
    }
}
