package X;

import android.view.MotionEvent;
import com.instagram.common.session.UserSession;

/* renamed from: X.LmH, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C49029LmH implements C7Q6 {
    public final C7Ze A00;
    public final InterfaceC11380iw A01;
    public final UserSession A02;

    public final boolean A01(C7QY c7qy, C44780Js1 c44780Js1) {
        boolean A1R = AbstractC167007dF.A1R(0, c7qy, c44780Js1);
        C9C9 c9c9 = c7qy.A08;
        ((InterfaceC164887Zb) this.A00).Cs7(null, null, null, c7qy.A0L, null, null, null, c9c9.A01, c9c9.A00, null, null, null, null, null, null, null, null, null, null, null, A1R ? 1 : 0, false);
        A00(c7qy, this, false);
        return A1R;
    }

    public static final void A00(C7QY c7qy, C49029LmH c49029LmH, boolean z) {
        String str;
        String str2;
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A01(c49029LmH.A01, c49029LmH.A02), "direct_message_generic_xma_tap");
        if (A0f.isSampled()) {
            InterfaceC83733oI interfaceC83733oI = c7qy.A0M;
            if (interfaceC83733oI == null || (str = AbstractC92784Dr.A02(interfaceC83733oI)) == null) {
                str = "";
            }
            AbstractC31171DnF.A1H(A0f, str);
            A0f.AAP("xma_content_type", c7qy.A0Y);
            A0f.A9K("xma_content_id", c7qy.A0S);
            if (z) {
                str2 = "primary_cta";
            } else {
                str2 = "body";
            }
            A0f.AAP("tap_target", str2);
            A0f.Cht();
        }
    }

    @Override // X.C7Q6
    public final /* bridge */ /* synthetic */ boolean DT4(MotionEvent motionEvent, Object obj, Object obj2) {
        return A01((C7QY) obj, (C44780Js1) obj2);
    }

    public C49029LmH(InterfaceC11380iw interfaceC11380iw, UserSession userSession, C7Ze c7Ze) {
        this.A02 = userSession;
        this.A00 = c7Ze;
        this.A01 = interfaceC11380iw;
    }
}
