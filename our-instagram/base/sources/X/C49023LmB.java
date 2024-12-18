package X;

import android.view.MotionEvent;
import com.instagram.common.session.UserSession;
import com.instagram.feed.widget.IgProgressImageView;
import com.instagram.model.direct.messageid.MessageIdentifier;
import java.util.List;

/* renamed from: X.LmB, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C49023LmB implements C7Q6 {
    public final InterfaceC11380iw A00;
    public final UserSession A01;
    public final InterfaceC165017Zq A02;

    public C49023LmB(InterfaceC11380iw interfaceC11380iw, UserSession userSession, InterfaceC165017Zq interfaceC165017Zq) {
        C14360o3.A0B(interfaceC165017Zq, 1);
        this.A02 = interfaceC165017Zq;
        this.A01 = userSession;
        this.A00 = interfaceC11380iw;
    }

    @Override // X.C7Q6
    public final /* bridge */ /* synthetic */ boolean DT4(MotionEvent motionEvent, Object obj, Object obj2) {
        KT8 kt8 = (KT8) obj;
        C49152LoV c49152LoV = (C49152LoV) obj2;
        boolean A1b = AbstractC25233BEq.A1b(kt8, c49152LoV, motionEvent);
        boolean BCt = kt8.BCt();
        MessageIdentifier BSy = kt8.BSy();
        InterfaceC165017Zq interfaceC165017Zq = this.A02;
        if (!AbstractC46806Kn1.A00((InterfaceC164967Zl) interfaceC165017Zq, BSy, BCt)) {
            AbstractC43821JZj.A00(this.A00, this.A01, null, "selfie_thumbnail_xma", "tap", "direct_thread", null, AbstractC167017dG.A0r("viewer_is_sender", String.valueOf(kt8.CVC())));
            List A1O = AbstractC16960so.A1O(kt8.A00);
            IgProgressImageView igProgressImageView = c49152LoV.A03;
            ((InterfaceC164957Zk) interfaceC165017Zq).CrH(igProgressImageView, JQ0.A0U(igProgressImageView), C05F.A00, A1O, 0, kt8.BCt(), false);
        }
        return A1b;
    }
}
