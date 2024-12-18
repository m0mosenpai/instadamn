package X;

import android.content.Context;
import com.facebook.R;
import com.instagram.api.schemas.MidCardClipsClickedAction;
import com.instagram.api.schemas.MidCardLayoutType;
import com.instagram.common.session.UserSession;
import java.util.HashMap;

/* renamed from: X.Bno, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26529Bno extends AbstractC51572Yf {
    public final C26268Bjb A00;
    public final CR1 A01;
    public final boolean A02;
    public final int A03;
    public final InterfaceC11380iw A04;
    public final UserSession A05;
    public final InterfaceC31055Dkv A06;
    public final String A07;
    public final HashMap A08;
    public final HashMap A09;
    public final InterfaceC16820sZ A0A;
    public final InterfaceC16820sZ A0B;
    public final InterfaceC16820sZ A0C;
    public final boolean A0D;

    @Override // X.AbstractC51572Yf
    public final AbstractC50812Vc A0Y(C76223bS c76223bS) {
        C14360o3.A0B(c76223bS, 0);
        Context A00 = AbstractC77363dM.A00(c76223bS);
        C26268Bjb c26268Bjb = this.A00;
        C0UO c0uo = c26268Bjb.A0B;
        C008002u A002 = C10E.A00(BHX.A03(A00, (C5QE) c0uo.getValue()));
        InterfaceC16820sZ interfaceC16820sZ = null;
        AbstractC18560vj.A03(AnonymousClass194.A01(), new C15340po(new C57159PZd(c76223bS, A002, (InterfaceC23621Ds) null, 23), c0uo));
        C51762Yz A003 = AbstractC77073ct.A00(c76223bS, C29891DGf.A00(this, 19));
        Object A004 = AbstractC77183d4.A00(c76223bS, C29891DGf.A00(A003, 20), new Object[0]);
        AbstractC77313dH.A00(c76223bS, new D8I(18, A004, this), AbstractC25230BEn.A1a());
        if (this.A0D) {
            InterfaceC11380iw interfaceC11380iw = this.A04;
            C75933ay c75933ay = C51722Yv.A02;
            C51722Yv A0C = AbstractC25234BEr.A0C(null, AbstractC25225BEi.A0n(C05F.A00, 0, AbstractC77623dm.A0D(c76223bS, this.A03)), 0);
            boolean A1W = AbstractC25229BEm.A1W(A003);
            InterfaceC31055Dkv interfaceC31055Dkv = this.A06;
            MidCardClipsClickedAction midCardClipsClickedAction = c26268Bjb.A01;
            InterfaceC31122Dm5 interfaceC31122Dm5 = c26268Bjb.A02;
            InterfaceC16820sZ interfaceC16820sZ2 = this.A0B;
            if (A1W) {
                interfaceC16820sZ = this.A0A;
            }
            MidCardLayoutType midCardLayoutType = c26268Bjb.A05;
            HashMap hashMap = this.A09;
            int i = c26268Bjb.A00;
            return new C26531Bnq(A0C, midCardClipsClickedAction, interfaceC31122Dm5, midCardLayoutType, interfaceC11380iw, c26268Bjb.A06, interfaceC31055Dkv, null, null, c26268Bjb.A08, hashMap, interfaceC16820sZ2, interfaceC16820sZ, A002, R.dimen.ab_test_media_thumbnail_preview_item_internal_padding, R.dimen.account_discovery_bottom_gap, i, A1W);
        }
        UserSession userSession = this.A05;
        InterfaceC11380iw interfaceC11380iw2 = this.A04;
        HashMap hashMap2 = this.A08;
        C75933ay c75933ay2 = C51722Yv.A02;
        C51722Yv A0C2 = AbstractC25234BEr.A0C(null, AbstractC25225BEi.A0n(C05F.A00, 0, AbstractC77623dm.A0D(c76223bS, this.A03)), 0);
        InterfaceC31055Dkv interfaceC31055Dkv2 = this.A06;
        boolean A1W2 = AbstractC25229BEm.A1W(A003);
        MidCardClipsClickedAction midCardClipsClickedAction2 = c26268Bjb.A01;
        InterfaceC31122Dm5 interfaceC31122Dm52 = c26268Bjb.A02;
        InterfaceC16820sZ interfaceC16820sZ3 = this.A0B;
        if (A1W2) {
            interfaceC16820sZ = this.A0A;
        }
        InterfaceC16820sZ interfaceC16820sZ4 = this.A0C;
        return new C26534Bnt(A0C2, midCardClipsClickedAction2, interfaceC31122Dm52, interfaceC11380iw2, userSession, interfaceC31055Dkv2, c26268Bjb, this.A07, hashMap2, c26268Bjb.A0A, interfaceC16820sZ3, interfaceC16820sZ, interfaceC16820sZ4, A002, A1W2);
    }

    public C26529Bno(InterfaceC11380iw interfaceC11380iw, UserSession userSession, InterfaceC31055Dkv interfaceC31055Dkv, C26268Bjb c26268Bjb, CR1 cr1, String str, HashMap hashMap, HashMap hashMap2, InterfaceC16820sZ interfaceC16820sZ, InterfaceC16820sZ interfaceC16820sZ2, InterfaceC16820sZ interfaceC16820sZ3, boolean z, boolean z2) {
        C14360o3.A0B(userSession, 1);
        AbstractC25234BEr.A0k(2, interfaceC11380iw, interfaceC31055Dkv, hashMap, hashMap2);
        AbstractC25229BEm.A1N(cr1, 13, str);
        this.A05 = userSession;
        this.A04 = interfaceC11380iw;
        this.A0D = z;
        this.A00 = c26268Bjb;
        this.A06 = interfaceC31055Dkv;
        this.A08 = hashMap;
        this.A09 = hashMap2;
        this.A03 = R.dimen.clips_mega_card_center_video_width;
        this.A0A = interfaceC16820sZ;
        this.A0C = interfaceC16820sZ2;
        this.A0B = interfaceC16820sZ3;
        this.A02 = z2;
        this.A01 = cr1;
        this.A07 = str;
    }
}
