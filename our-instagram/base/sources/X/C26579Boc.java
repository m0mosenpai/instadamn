package X;

import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrlBase;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Boc, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26579Boc extends AbstractC51572Yf {
    public final C120985dq A00;
    public final InterfaceC11380iw A01;
    public final UserSession A02;
    public final HashMap A03;

    private final C26646Bph A03(C2Z1 c2z1, C51722Yv c51722Yv, C38321qM c38321qM, int i, int i2, int i3) {
        String str;
        ImageUrlBase imageUrlBase;
        if (c38321qM != null) {
            str = c38321qM.getId();
            imageUrlBase = BNM.A00(AbstractC77363dM.A00(c2z1), c38321qM);
        } else {
            str = null;
            imageUrlBase = null;
        }
        HashMap hashMap = this.A03;
        String id = this.A00.getId();
        InterfaceC11380iw interfaceC11380iw = this.A01;
        int A0A = AbstractC25228BEl.A0A(c2z1, AbstractC77623dm.A04(c2z1));
        C75933ay c75933ay = C51722Yv.A02;
        return new C26646Bph(AbstractC25233BEq.A0X(C9CU.A00(null, C05F.A00, 0, AbstractC77623dm.A0D(c2z1, i)), c2z1, i2).A00(c51722Yv), interfaceC11380iw, imageUrlBase, str, id, "Unknown", hashMap, i3, A0A);
    }

    @Override // X.AbstractC51572Yf
    public final AbstractC50812Vc A0Y(C76223bS c76223bS) {
        int i;
        C38321qM c38321qM;
        C38321qM c38321qM2;
        C38321qM c38321qM3;
        C14360o3.A0B(c76223bS, 0);
        int A0I = AbstractC25231BEo.A0I(A04());
        int i2 = 0;
        int i3 = R.dimen.clips_fullcard_auto_created_reel_video_height;
        if (A0I >= 3) {
            i2 = 1;
            i3 = R.dimen.clips_fullcard_primary_video_height;
            i = R.dimen.ab_test_media_thumbnail_preview_item_width;
        } else {
            i = R.dimen.clips_fullcard_auto_created_reel_video_width;
        }
        List A04 = A04();
        boolean z = false;
        if (A0I >= 3) {
            z = true;
        }
        C75933ay c75933ay = C51722Yv.A02;
        C51722Yv A0X = AbstractC25233BEq.A0X(AbstractC25225BEi.A0h(null, AbstractC25225BEi.A0m(C05F.A00, 100.0f, 0)), c76223bS, i3);
        C2Z0 A12 = AbstractC25232BEp.A12(c76223bS);
        if (z) {
            C2Z0 A13 = AbstractC25232BEp.A13(A12);
            if (A04 != null) {
                c38321qM2 = (C38321qM) AbstractC001800i.A0O(A04, 1);
            } else {
                c38321qM2 = null;
            }
            A13.A00(A03(A13, C9CU.A00(null, C05F.A09, 0, AbstractC77623dm.A0D(A13, R.dimen.album_preview_add_item_circle_size)), c38321qM2, R.dimen.canvas_colour_wheel_offset_y, R.dimen.ai_agent_embodiment_video_container_size, 0));
            if (A04 != null) {
                c38321qM3 = (C38321qM) AbstractC001800i.A0O(A04, 2);
            } else {
                c38321qM3 = null;
            }
            A13.A00(A03(A13, null, c38321qM3, R.dimen.canvas_colour_wheel_offset_y, R.dimen.ai_agent_embodiment_video_container_size, 2));
            A12.A00(AbstractC76963ci.A0A(A13, A12));
        }
        if (A04 != null) {
            c38321qM = (C38321qM) AbstractC001800i.A0O(A04, 0);
        } else {
            c38321qM = null;
        }
        return AbstractC25226BEj.A0l(A03(A12, C9CV.A00(null, C05F.A0Y, EnumC77933eL.ABSOLUTE, 3), c38321qM, i, i3, i2), A12, c76223bS, A0X);
    }

    private final List A04() {
        List list;
        C38661Gz2 A02 = this.A00.A02();
        if (A02 != null && (list = A02.A0F) != null) {
            ArrayList A0q = AbstractC167017dG.A0q(list);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                A0q.add(((C111034zF) it.next()).A00);
            }
            return A0q;
        }
        return null;
    }

    public C26579Boc(C120985dq c120985dq, InterfaceC11380iw interfaceC11380iw, UserSession userSession, HashMap hashMap) {
        AbstractC25234BEr.A1P(interfaceC11380iw, userSession, hashMap);
        this.A01 = interfaceC11380iw;
        this.A02 = userSession;
        this.A00 = c120985dq;
        this.A03 = hashMap;
    }
}
