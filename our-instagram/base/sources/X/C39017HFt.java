package X;

import android.content.Context;
import android.view.View;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.model.reels.Reel;
import java.util.List;

/* renamed from: X.HFt, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39017HFt extends C1P1 {
    public final ImageUrl A00;
    public final /* synthetic */ C38928HCb A01;

    public C39017HFt(ImageUrl imageUrl, C38928HCb c38928HCb) {
        C14360o3.A0B(imageUrl, 2);
        this.A01 = c38928HCb;
        this.A00 = imageUrl;
    }

    @Override // X.C1P1
    public final void onFail(AbstractC115105If abstractC115105If) {
        int i;
        int A03 = C0f9.A03(-312060975);
        Context context = this.A01.getContext();
        if (context == null) {
            i = -1385471040;
        } else {
            C9GR.A0C(context, "createSingleSongMusicRequest_unknown_error_occured");
            i = 1029833827;
        }
        C0f9.A0A(i, A03);
    }

    @Override // X.C1P1
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int i;
        C37771pE c37771pE;
        int A03 = C0f9.A03(1942980036);
        C38875H9x c38875H9x = (C38875H9x) obj;
        int A032 = C0f9.A03(-1333317738);
        C14360o3.A0B(c38875H9x, 0);
        List list = c38875H9x.A00;
        if (list != null && !list.isEmpty() && (c37771pE = (C37771pE) list.get(0)) != null) {
            C38928HCb c38928HCb = this.A01;
            C24088AmZ c24088AmZ = new C24088AmZ(c38928HCb, 3);
            C42793IwV c42793IwV = c38928HCb.A07;
            if (c42793IwV == null) {
                C14360o3.A0F("trackCoverReelHolder");
                throw C00O.createAndThrow();
            }
            AbstractC125325le.A04(c24088AmZ, new View[]{c42793IwV.A02}, true);
            Reel A0I = C1OU.A04(AbstractC166987dD.A0r(c38928HCb.A0E)).A0I(c37771pE, false);
            ImageUrl imageUrl = this.A00;
            C1NB c1nb = A0I.A0W;
            if (c1nb != null) {
                c1nb.ESL(imageUrl);
            }
            c38928HCb.A05 = A0I;
            i = -1431672617;
        } else {
            i = -2023569631;
        }
        C0f9.A0A(i, A032);
        C0f9.A0A(1093894309, A03);
    }
}
