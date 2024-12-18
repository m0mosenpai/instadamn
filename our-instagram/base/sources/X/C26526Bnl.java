package X;

import com.facebook.R;
import com.instagram.api.schemas.MidCardClipsClickedAction;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Bnl, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26526Bnl extends AbstractC51572Yf {
    public final float A00;
    public final InterfaceC11380iw A01;
    public final UserSession A02;
    public final InterfaceC31025DkO A03;
    public final InterfaceC31055Dkv A04;
    public final BVE A05;
    public final BWM A06;
    public final C26265BjY A07;
    public final String A08;
    public final HashMap A09;
    public final HashMap A0A;
    public final List A0B;

    @Override // X.AbstractC51572Yf
    public final AbstractC50812Vc A0Y(C76223bS c76223bS) {
        ArrayList A0i;
        MidCardClipsClickedAction midCardClipsClickedAction;
        C2WH c2wh;
        String A0F;
        C14360o3.A0B(c76223bS, 0);
        BWM bwm = this.A06;
        C26136BhN c26136BhN = bwm.A03;
        if (bwm.A00 != null) {
            List<C26267Bja> list = this.A07.A02;
            A0i = AbstractC167007dF.A0i(list);
            for (C26267Bja c26267Bja : list) {
                InterfaceC11380iw interfaceC11380iw = this.A01;
                String str = c26267Bja.A08;
                String str2 = c26267Bja.A07;
                C75933ay c75933ay = C51722Yv.A02;
                C51722Yv A0C = AbstractC25234BEr.A0C(null, AbstractC25225BEi.A0m(C05F.A00, 100.0f, 0), 0);
                int i = c26267Bja.A02;
                int i2 = c26267Bja.A01;
                boolean z = c26267Bja.A09;
                InterfaceC31055Dkv interfaceC31055Dkv = this.A04;
                C26133BhK c26133BhK = c26136BhN.A06;
                A0i.add(new C26531Bnq(A0C, c26133BhK.A00, (InterfaceC31122Dm5) AbstractC001800i.A0O(c26133BhK.A07, 0), c26267Bja.A03, interfaceC11380iw, c26267Bja.A05, interfaceC31055Dkv, str, str2, c26267Bja.A06, this.A0A, null, null, null, i, i2, c26267Bja.A00, z));
            }
        } else {
            C26133BhK c26133BhK2 = c26136BhN.A06;
            List list2 = c26133BhK2.A08;
            ArrayList A1E = AbstractC166987dD.A1E();
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                String id = ((C111034zF) it.next()).A00.getId();
                if (id != null) {
                    A1E.add(id);
                }
            }
            List<C26267Bja> list3 = this.A07.A02;
            A0i = AbstractC167007dF.A0i(list3);
            for (C26267Bja c26267Bja2 : list3) {
                List list4 = c26133BhK2.A07;
                int i3 = c26267Bja2.A00;
                InterfaceC31122Dm5 interfaceC31122Dm5 = (InterfaceC31122Dm5) AbstractC001800i.A0O(list4, i3);
                UserSession userSession = this.A02;
                InterfaceC11380iw interfaceC11380iw2 = this.A01;
                HashMap hashMap = this.A09;
                C008002u A00 = C10E.A00(String.valueOf(c26267Bja2.A04));
                C75933ay c75933ay2 = C51722Yv.A02;
                C51722Yv A0C2 = AbstractC25234BEr.A0C(null, AbstractC25225BEi.A0m(C05F.A00, 100.0f, 0), 0);
                InterfaceC31055Dkv interfaceC31055Dkv2 = this.A04;
                boolean z2 = c26267Bja2.A09;
                if (interfaceC31122Dm5 != null) {
                    midCardClipsClickedAction = interfaceC31122Dm5.AYN();
                } else {
                    midCardClipsClickedAction = null;
                }
                A0i.add(new C26534Bnt(A0C2, midCardClipsClickedAction, interfaceC31122Dm5, interfaceC11380iw2, userSession, interfaceC31055Dkv2, c26267Bja2, this.A08, hashMap, A1E, null, (InterfaceC16820sZ) AbstractC001800i.A0O(this.A0B, i3), null, A00, z2));
            }
        }
        BVE bve = this.A05;
        C26133BhK c26133BhK3 = c26136BhN.A06;
        String str3 = c26133BhK3.A06;
        String str4 = c26133BhK3.A05;
        float f = this.A00;
        C51759Mti BgM = this.A03.BgM();
        if (BgM != null) {
            C2XE c2xe = c76223bS.A05;
            int A0H = AbstractC53242c7.A0H(c2xe.A0C, R.attr.igds_color_text_on_white);
            C75933ay c75933ay3 = C51722Yv.A02;
            C51722Yv A002 = C9CU.A00(C9CU.A00(C9CU.A00(AbstractC25233BEq.A0b(null, C05F.A00, 0), C05F.A0Y, 0, AbstractC77623dm.A0D(c76223bS, R.dimen.audience_selector_pill_layout_height)), C05F.A0A, 0, AbstractC25227BEk.A09(c76223bS)), C05F.A04, 0, AbstractC77623dm.A07(c76223bS));
            C2Z0 A0P = AbstractC167007dF.A0P(c2xe);
            C5QE c5qe = (C5QE) BgM.A00;
            if (c5qe == null || (A0F = BHX.A03(AbstractC25226BEj.A0O(A0P), c5qe)) == null) {
                A0F = AbstractC77623dm.A0F(A0P, 2131963729);
            }
            A0P.A00(new BVK(AbstractC25234BEr.A0B(null, AbstractC25225BEi.A0m(C05F.A01, 1.0f, 1), 1.0f), (InterfaceC16820sZ) BgM.A01, C10E.A00(A0F), R.drawable.rounded_white_button, A0H, 0, 232));
            c2wh = AbstractC76963ci.A0F(A0P, c76223bS, A002);
        } else {
            c2wh = null;
        }
        return new C26504BnP(bve, null, c2wh, str3, str4, A0i, f, true, false);
    }

    public C26526Bnl(InterfaceC11380iw interfaceC11380iw, UserSession userSession, InterfaceC31025DkO interfaceC31025DkO, InterfaceC31055Dkv interfaceC31055Dkv, BVE bve, BWM bwm, C26265BjY c26265BjY, String str, HashMap hashMap, HashMap hashMap2, List list, float f) {
        AbstractC25234BEr.A1P(interfaceC11380iw, userSession, interfaceC31055Dkv);
        AbstractC167007dF.A1I(hashMap, 7, hashMap2);
        C14360o3.A0B(str, 12);
        this.A01 = interfaceC11380iw;
        this.A02 = userSession;
        this.A06 = bwm;
        this.A04 = interfaceC31055Dkv;
        this.A07 = c26265BjY;
        this.A05 = bve;
        this.A09 = hashMap;
        this.A0A = hashMap2;
        this.A0B = list;
        this.A00 = f;
        this.A03 = interfaceC31025DkO;
        this.A08 = str;
    }
}
