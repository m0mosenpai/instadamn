package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.bloks.hosting.IgBloksScreenConfig;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import java.util.BitSet;
import java.util.HashMap;
import java.util.LinkedHashMap;

/* renamed from: X.Gjl, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final /* synthetic */ class C37770Gjl extends C03E implements InterfaceC16660sJ {
    public C37770Gjl(Object obj) {
        super(1, obj, BKA.class, "launchBIOProductDetailsPage", "launchBIOProductDetailsPage(Lcom/instagram/feed/media/Media;)V", 0);
    }

    @Override // X.InterfaceC16660sJ
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        String obj2;
        C38321qM c38321qM = (C38321qM) obj;
        C14360o3.A0B(c38321qM, 0);
        BKA bka = (BKA) this.receiver;
        UserSession userSession = bka.A04;
        InterfaceC60442pS interfaceC60442pS = bka.A05;
        String id = c38321qM.getId();
        String str = "";
        if (id == null) {
            id = "";
        }
        C09530e4 A1L = AbstractC166987dD.A1L("post_igid", id);
        InterfaceC84473pq BGH = c38321qM.A0C.BGH();
        if (BGH != null && (obj2 = Long.valueOf(BGH.BF4()).toString()) != null) {
            str = obj2;
        }
        LinkedHashMap A0p = AbstractC25233BEq.A0p("product_id", str, A1L);
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A01(interfaceC60442pS, userSession), "ig_ads_conversion_funnel");
        A0f.A8R(EnumC53368NjJ.BIO_IG_REELS, ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY);
        A0f.AAP("event", "buyer_click_inquiry_cta");
        A0f.AAP("consumer_igid", userSession.userId);
        A0f.AAP("seller_igid", AbstractC37302Gc3.A0a(userSession, c38321qM));
        AbstractC37300Gc1.A0u(A0f, A0p);
        A0f.Cht();
        IgBloksScreenConfig A0C = AbstractC31171DnF.A0C(userSession);
        String A00 = AbstractC111324zv.A00(100);
        A0C.A0R = A00;
        A0C.A0P = C05F.A01;
        FragmentActivity fragmentActivity = bka.A01;
        HashMap A1G = AbstractC166987dD.A1G();
        HashMap A1G2 = AbstractC166987dD.A1G();
        HashMap A1G3 = AbstractC166987dD.A1G();
        BitSet bitSet = new BitSet(1);
        String id2 = c38321qM.getId();
        if (id2 == null) {
            id2 = "";
        }
        A1G.put("ig_post_id", id2);
        bitSet.set(0);
        if (bitSet.nextClearBit(0) >= 1) {
            C66277U6x A0H = AbstractC31179DnN.A0H(A00, A1G, A1G2);
            A0H.A03 = null;
            A0H.A02 = null;
            A0H.A04 = null;
            A0H.A08(A1G3);
            A0H.A04(fragmentActivity, A0C);
            return C0eB.A00;
        }
        throw AbstractC31173DnH.A0f();
    }
}
