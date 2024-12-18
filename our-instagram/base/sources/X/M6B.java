package X;

import com.instagram.common.session.UserSession;
import com.instagram.creation.activity.MediaCaptureActivity;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes8.dex */
public final class M6B implements Runnable {
    public final /* synthetic */ C43871Jab A00;
    public final /* synthetic */ C47Z A01;
    public final /* synthetic */ List A02;
    public final /* synthetic */ boolean A03;

    public M6B(C43871Jab c43871Jab, C47Z c47z, List list, boolean z) {
        this.A00 = c43871Jab;
        this.A01 = c47z;
        this.A02 = list;
        this.A03 = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        UserSession userSession;
        AbstractC50697MZs nlb;
        MXB mxb;
        C43871Jab c43871Jab = this.A00;
        InterfaceC58286Pse interfaceC58286Pse = c43871Jab.A0D;
        if (interfaceC58286Pse != null && (mxb = ((MediaCaptureActivity) interfaceC58286Pse).A07) != null) {
            mxb.A08(C05F.A00);
        }
        boolean z = ((MX5) c43871Jab.A0C).A01.A0M;
        if (c43871Jab.A00 != null) {
            C40131tg c40131tg = C40121td.A0G;
            UserSession userSession2 = c43871Jab.A09;
            c40131tg.A01(AbstractC25225BEi.A0F(userSession2), userSession2).A0F(this.A01, this.A02);
            A5B a5b = c43871Jab.A00;
            if (a5b != null) {
                C189588ad c189588ad = a5b.A00;
                c189588ad.EDa(new RunnableC56861PLg(c189588ad));
            }
            c43871Jab.A00 = null;
            return;
        }
        if (z && !this.A03) {
            C43871Jab.A03(c43871Jab, this.A01, this.A02);
            return;
        }
        MN3 mn3 = c43871Jab.A0A;
        if (mn3 != null) {
            C47Z c47z = this.A01;
            List list = this.A02;
            MediaCaptureActivity mediaCaptureActivity = (MediaCaptureActivity) mn3;
            String A0E = c47z.A0E();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C47Z A0l = AbstractC43592JPx.A0l(it);
                C14360o3.A0B(A0E, 0);
                A0l.A2a = A0E;
            }
            mediaCaptureActivity.A0B.A0F(c47z, list);
            if (c43871Jab.A04 && !c43871Jab.A03) {
                userSession = c43871Jab.A09;
                nlb = new C52497NKq();
            } else {
                userSession = c43871Jab.A09;
                nlb = new NLB(c43871Jab.A03);
            }
            C50695MZq.A00(userSession, nlb);
            return;
        }
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("mPendingAlbumServiceDelegate is null. showFeedInStoriesCamera=");
        A1C.append(z);
        A1C.append(" hasExistingSessionEdits=");
        A1C.append(this.A03);
        A1C.append(" isStandaloneMode=");
        A1C.append(c43871Jab.A04);
        A1C.append(" subMediaSize=");
        List list2 = this.A02;
        A1C.append(list2.size());
        AbstractC12120kG.A07("GalleryAlbumController_onAlbumSubmediaImported", A1C.toString(), null);
        C43871Jab.A03(c43871Jab, this.A01, list2);
    }
}
