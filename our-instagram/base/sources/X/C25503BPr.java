package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

/* renamed from: X.BPr, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final /* synthetic */ class C25503BPr extends C03E implements InterfaceC16660sJ {
    public C25503BPr(Object obj) {
        super(1, obj, BKB.class, "launchContentAppreciationSheet", "launchContentAppreciationSheet(Lcom/instagram/feed/media/Media;)V", 0);
    }

    @Override // X.InterfaceC16660sJ
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        C38321qM c38321qM = (C38321qM) obj;
        BKB bkb = (BKB) AbstractC25229BEm.A0o(c38321qM, this);
        C47719L5g c47719L5g = (C47719L5g) bkb.A01.A00.getValue();
        FragmentActivity fragmentActivity = bkb.A00;
        UserSession userSession = bkb.A02;
        c47719L5g.A00(fragmentActivity, (MO5) bkb.A04.invoke(), bkb.A03, userSession, c38321qM, C05F.A01, null);
        return C0eB.A00;
    }
}
