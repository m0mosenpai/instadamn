package X;

import com.instagram.common.recyclerview.ViewModelListUpdate;
import com.instagram.common.session.UserSession;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.WkB, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70908WkB implements InterfaceC60442pS, InterfaceC57923PmT {
    public static final String __redex_internal_original_name = "MediaThumbnailPreviewPresenter";
    public int A00;
    public C70605Wdj A01;
    public C38321qM A02;
    public boolean A03;
    public final Vb0 A04;
    public final C69644Vsl A05;
    public final XDK A06;
    public final C30A A07;
    public final C30E A08;
    public final Map A09;

    public C70908WkB(C69644Vsl c69644Vsl, UserSession userSession, C154796xU c154796xU, C30A c30a) {
        C14360o3.A0B(userSession, 1);
        this.A05 = c69644Vsl;
        this.A07 = c30a;
        this.A04 = new Vb0(userSession, c154796xU);
        this.A06 = new C70782Wgv(this, 3);
        this.A09 = new LinkedHashMap();
        this.A08 = new C30E(AbstractC166997dE.A0L(c69644Vsl.A04), null, userSession, this, null, "", true, false, true, true, false);
        this.A00 = -1;
        c69644Vsl.A00 = this;
        V5Q v5q = c69644Vsl.A06;
        v5q.A02 = userSession;
        v5q.A01 = this;
        v5q.A00 = new Vb1(c69644Vsl);
        c69644Vsl.A07.A05(new ViewModelListUpdate());
        c30a.ETB(new Wk9(this, 1));
    }

    public static final void A01(C66489UJr c66489UJr, C70908WkB c70908WkB, C38321qM c38321qM, int i) {
        if (c70908WkB.A03 && c38321qM.BRp() == EnumC40111tc.A0a) {
            C30E c30e = c70908WkB.A08;
            if (!c38321qM.equals(c30e.A0G())) {
                A03(c70908WkB, "media_mismatch");
                c30e.A0S(c38321qM, c70908WkB, c66489UJr, new C4QP(false, false, false, false), i, i, A00(c70908WkB, c38321qM).A01(), true, false);
                c70908WkB.A00 = i;
            }
        }
    }

    public static final void A03(C70908WkB c70908WkB, String str) {
        C30E c30e = c70908WkB.A08;
        if (c30e.A0G() != null) {
            c30e.A0V(str, true, true);
            c70908WkB.A00 = -1;
        }
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "promote_media_picker_thumbnail_preview";
    }

    @Override // X.InterfaceC60442pS
    public final boolean isOrganicEligible() {
        return false;
    }

    @Override // X.InterfaceC60442pS
    public final boolean isSponsoredEligible() {
        return false;
    }

    public static final C75113Zb A00(C70908WkB c70908WkB, C38321qM c38321qM) {
        Map map = c70908WkB.A09;
        String id = c38321qM.getId();
        if (id != null) {
            Object obj = map.get(id);
            if (obj == null) {
                obj = AbstractC37303Gc4.A0E(c38321qM);
                map.put(id, obj);
            }
            return (C75113Zb) obj;
        }
        throw AbstractC166997dE.A0g();
    }

    public static final void A02(C70908WkB c70908WkB) {
        C66489UJr c66489UJr;
        C69644Vsl c69644Vsl = c70908WkB.A05;
        int A00 = c69644Vsl.A00();
        int A002 = c69644Vsl.A00();
        if (A002 != -1) {
            C66362zD c66362zD = c69644Vsl.A07;
            if (c66362zD.A04(A002) instanceof C70790Wh3) {
                Object A04 = c66362zD.A04(A002);
                C14360o3.A0C(A04, "null cannot be cast to non-null type com.instagram.business.promote.mediapicker.viewmodel.MediaThumbnailPreviewViewModel");
                C38321qM c38321qM = ((C70790Wh3) A04).A00;
                C3OO A0V = c69644Vsl.A04.A0V(c69644Vsl.A00());
                if ((A0V instanceof C66489UJr) && (c66489UJr = (C66489UJr) A0V) != null && A00 != -1) {
                    A01(c66489UJr, c70908WkB, c38321qM, A00);
                }
            }
        }
    }

    @Override // X.InterfaceC57923PmT
    public final void destroy() {
        this.A08.A0L();
    }
}
