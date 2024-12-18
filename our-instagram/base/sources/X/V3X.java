package X;

import com.instagram.model.hashtag.Hashtag;
import com.instagram.model.reels.Reel;
import java.util.List;

/* loaded from: classes11.dex */
public final class V3X extends C1P1 {
    public final int A00;
    public final Object A01;

    public V3X(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    @Override // X.C1P1
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A03;
        int i;
        switch (this.A00) {
            case 0:
                A03 = C0f9.A03(102230818);
                C38898HAu c38898HAu = (C38898HAu) obj;
                int A032 = C0f9.A03(-26578409);
                V1E v1e = (V1E) this.A01;
                v1e.A0B = true;
                C69730VuP c69730VuP = new C69730VuP(v1e.A04);
                c69730VuP.A08 = Integer.valueOf(c38898HAu.A00);
                Hashtag A00 = c69730VuP.A00();
                v1e.A04 = A00;
                if (!v1e.A0C) {
                    C14360o3.A0B(A00, 0);
                    if (!AbstractC1120253r.A03(A00)) {
                        v1e.A0C = true;
                    }
                }
                C69314VlM c69314VlM = v1e.A06;
                Reel reel = c69314VlM.A02;
                v1e.A06 = new C69314VlM(c69314VlM.A00, c69314VlM.A01, reel, c69314VlM.A04, c38898HAu.A06);
                V1E.A00(v1e);
                C0f9.A0A(-861657054, A032);
                i = -1822786822;
                C0f9.A0A(i, A03);
                return;
            case 1:
                C0f9.A03(-846731341);
                C0f9.A03(1416558105);
                throw new NullPointerException("getReelResponseItem");
            case 2:
                A03 = C0f9.A03(261877705);
                C67818Uyr c67818Uyr = (C67818Uyr) obj;
                int A033 = C0f9.A03(-1421572617);
                super.onSuccess(c67818Uyr);
                List list = c67818Uyr.A00.A06;
                if (list != null) {
                    ((V1E) this.A01).A0A = list;
                }
                V1E.A00((V1E) this.A01);
                C0f9.A0A(989117571, A033);
                i = -49837264;
                C0f9.A0A(i, A03);
                return;
            default:
                A03 = C0f9.A03(1691921133);
                C67818Uyr c67818Uyr2 = (C67818Uyr) obj;
                int A034 = C0f9.A03(527285945);
                super.onSuccess(c67818Uyr2);
                List list2 = c67818Uyr2.A00.A06;
                if (list2 != null) {
                    ((V1D) this.A01).A06 = list2;
                }
                V1D.A00((V1D) this.A01);
                C0f9.A0A(201456940, A034);
                i = -1432202318;
                C0f9.A0A(i, A03);
                return;
        }
    }
}
