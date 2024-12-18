package X;

import android.view.MotionEvent;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.model.direct.messageid.DirectMessageIdentifier;
import java.util.List;

/* renamed from: X.Lm6, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C49018Lm6 implements C7Q6 {
    public final C7Zf A00;
    public final UserSession A01;

    public C49018Lm6(UserSession userSession, C7Zf c7Zf) {
        C14360o3.A0B(c7Zf, 1);
        this.A00 = c7Zf;
        this.A01 = userSession;
    }

    @Override // X.C7Q6
    public final /* bridge */ /* synthetic */ boolean DT4(MotionEvent motionEvent, Object obj, Object obj2) {
        ImageUrl imageUrl;
        List list;
        KTH kth = (KTH) obj;
        C49154LoX c49154LoX = (C49154LoX) obj2;
        boolean A1R = AbstractC167007dF.A1R(0, kth, c49154LoX);
        C7QY c7qy = kth.A03;
        C9C9 c9c9 = c7qy.A08;
        if (c9c9.A01.length() > 0) {
            boolean BCt = c7qy.BCt();
            DirectMessageIdentifier directMessageIdentifier = c7qy.A0L;
            C7Zf c7Zf = this.A00;
            if (!AbstractC46806Kn1.A00((InterfaceC164967Zl) c7Zf, directMessageIdentifier, BCt)) {
                AbstractC1583778x abstractC1583778x = c7qy.A0F;
                InterfaceC164887Zb interfaceC164887Zb = (InterfaceC164887Zb) c7Zf;
                String str = c9c9.A01;
                String str2 = c9c9.A00;
                if (abstractC1583778x != null && (abstractC1583778x instanceof C158737Aj)) {
                    list = AbstractC166987dD.A1J(((C158737Aj) abstractC1583778x).A00);
                } else {
                    list = null;
                }
                interfaceC164887Zb.Cs7(null, null, new E6B(AbstractC13880nE.A0G(c49154LoX.A08), 0.0f), directMessageIdentifier, null, null, null, str, str2, null, null, null, null, null, null, list, null, null, null, null, A1R ? 1 : 0, false);
            }
        } else {
            AbstractC46452KhC abstractC46452KhC = kth.A05;
            if (abstractC46452KhC instanceof KV5) {
                String str3 = kth.A07;
                boolean BCt2 = c7qy.BCt();
                DirectMessageIdentifier directMessageIdentifier2 = c7qy.A0L;
                C7Zf c7Zf2 = this.A00;
                if (!AbstractC46806Kn1.A00((InterfaceC164967Zl) c7Zf2, directMessageIdentifier2, BCt2)) {
                    ((InterfaceC165447aX) c7Zf2).Cr6(AbstractC13880nE.A0G(c49154LoX.A08), str3, null);
                    return A1R;
                }
            } else if (abstractC46452KhC instanceof KV4) {
                AbstractC1583778x abstractC1583778x2 = c7qy.A0F;
                if (abstractC1583778x2 instanceof C158737Aj) {
                    imageUrl = ((C158737Aj) abstractC1583778x2).A00;
                } else {
                    imageUrl = null;
                    AbstractC166987dD.A1T(C18950wb.A01, AbstractC167017dG.A0n(abstractC1583778x2, "Invalid media: ", AbstractC166987dD.A1C()), 817891009);
                }
                String str4 = kth.A07;
                C40971v4 c40971v4 = ((KV4) abstractC46452KhC).A00;
                boolean BCt3 = c7qy.BCt();
                DirectMessageIdentifier directMessageIdentifier3 = c7qy.A0L;
                C7Zf c7Zf3 = this.A00;
                if (!AbstractC46806Kn1.A00((InterfaceC164967Zl) c7Zf3, directMessageIdentifier3, BCt3)) {
                    c7Zf3.Cqj(AbstractC13880nE.A0G(c49154LoX.A08), imageUrl, null, directMessageIdentifier3, c40971v4, false, false, str4, null, null, null, null, null, c7qy.CVC());
                    return A1R;
                }
            } else {
                throw AbstractC43594JPz.A0o(abstractC46452KhC, "Invalid typeSpecificFields: ", AbstractC166987dD.A1C());
            }
        }
        return A1R;
    }
}
