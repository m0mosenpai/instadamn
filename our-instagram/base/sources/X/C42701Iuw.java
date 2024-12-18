package X;

import android.view.View;
import com.instagram.common.session.UserSession;
import java.io.IOException;
import java.util.Collections;

/* renamed from: X.Iuw, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C42701Iuw implements InterfaceC58152PqH {
    public boolean A00 = false;
    public final /* synthetic */ InterfaceC11380iw A01;
    public final /* synthetic */ C1P1 A02;
    public final /* synthetic */ C38321qM A03;
    public final /* synthetic */ C39702HjY A04;
    public final /* synthetic */ Integer A05;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, X.1vN] */
    @Override // X.InterfaceC58152PqH
    public final void onButtonClick(View view) {
        this.A00 = true;
        UserSession userSession = this.A04.A01;
        C23031Ai A00 = AbstractC23021Ah.A00(userSession);
        String id = this.A03.getId();
        id.getClass();
        A00.A0r(id);
        AbstractC25651Mw.A00(userSession).A05(new Object());
    }

    @Override // X.InterfaceC58152PqH
    public final /* synthetic */ void onTextClick(View view) {
    }

    public C42701Iuw(InterfaceC11380iw interfaceC11380iw, C1P1 c1p1, C38321qM c38321qM, C39702HjY c39702HjY, Integer num) {
        this.A04 = c39702HjY;
        this.A03 = c38321qM;
        this.A05 = num;
        this.A02 = c1p1;
        this.A01 = interfaceC11380iw;
    }

    @Override // X.InterfaceC58152PqH
    public final void onDismiss() {
        if (!this.A00) {
            C39702HjY c39702HjY = this.A04;
            UserSession userSession = c39702HjY.A01;
            C23031Ai A00 = AbstractC23021Ah.A00(userSession);
            C38321qM c38321qM = this.A03;
            String id = c38321qM.getId();
            id.getClass();
            A00.A0r(id);
            Integer num = this.A05;
            C1P1 c1p1 = this.A02;
            if (num.intValue() != 1) {
                try {
                    C1ON A01 = IRZ.A01(c39702HjY.A01, c39702HjY.A02, Collections.singleton(c38321qM.getId()));
                    A01.A00 = new HGP(c1p1, c39702HjY, C05F.A0C);
                    C1GJ.A03(A01);
                } catch (IOException unused) {
                    C9GR.A0F(AbstractC25225BEi.A0F(c39702HjY.A01), "photos_and_videos_of_you_fail_to_remove_io_exception", 2131969611);
                }
            } else {
                C1ON A002 = IRZ.A00(c39702HjY.A01, "remove", c39702HjY.A02, Collections.singleton(c38321qM.getId()));
                A002.A00 = new HGP(c1p1, c39702HjY, C05F.A01);
                C1GJ.A03(A002);
            }
            C37091o7.A00().Cor(c39702HjY.A00, this.A01, userSession, EnumC39589Hdz.A0Q, 1);
        }
    }

    @Override // X.InterfaceC58152PqH
    public final void onShow() {
        java.util.Set A1H;
        C23031Ai A00 = AbstractC23021Ah.A00(this.A04.A01);
        String id = this.A03.getId();
        id.getClass();
        InterfaceC19630xq interfaceC19630xq = A00.A01;
        if (interfaceC19630xq.contains("profile_pending_hide_or_remove_medias")) {
            A1H = AbstractC001800i.A0j(interfaceC19630xq.C2v("profile_pending_hide_or_remove_medias"));
        } else {
            A1H = AbstractC166987dD.A1H();
        }
        A1H.add(id);
        InterfaceC19610xo ARD = interfaceC19630xq.ARD();
        ARD.E7L("profile_pending_hide_or_remove_medias", A1H);
        ARD.apply();
    }
}
