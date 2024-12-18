package X;

import com.instagram.api.schemas.InspirationSignalType;
import com.instagram.clips.model.metadata.PlaylistContext;
import com.instagram.common.session.UserSession;
import com.instagram.search.common.analytics.SearchContext;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.350, reason: invalid class name */
/* loaded from: classes2.dex */
public final class AnonymousClass350 implements InterfaceC64122vX {
    public static final AnonymousClass351 A08 = new Object();
    public final UserSession A02;
    public final InterfaceC60442pS A03;
    public final C61382r1 A04;
    public final C1M1 A05;
    public final C28091Xn A06;
    public final String A07;
    public SearchContext A01 = new SearchContext(null, null, null, null, null, null, null, null);
    public PlaylistContext A00 = new PlaylistContext(null);

    @Override // X.InterfaceC64122vX
    public final /* bridge */ /* synthetic */ Object AGl(C82383m1 c82383m1, Object obj, Object obj2, String str) {
        int A02;
        C38321qM A1e;
        C38576Gxf c38576Gxf;
        String str2;
        String str3;
        List<InspirationSignalType> BxK;
        InspirationSignalType inspirationSignalType;
        String A2u;
        Long A0k;
        InterfaceC38371qR interfaceC38371qR = (InterfaceC38371qR) obj;
        C75113Zb c75113Zb = (C75113Zb) obj2;
        C14360o3.A0B(interfaceC38371qR, 0);
        C14360o3.A0B(c75113Zb, 1);
        C14360o3.A0B(c82383m1, 2);
        C38321qM BQN = interfaceC38371qR.BQN();
        String str4 = this.A07;
        if (C14360o3.A0K(str4, "instagram_organic_vpvd_imp")) {
            InterfaceC60442pS interfaceC60442pS = this.A03;
            InterfaceC43508JJu BPR = BQN.A0C.BPR();
            if (BPR != null && (BxK = BPR.BxK()) != null && (inspirationSignalType = (InspirationSignalType) AbstractC001800i.A0J(BxK)) != null && (A2u = BQN.A2u()) != null && (A0k = AbstractC003100w.A0k(10, A2u)) != null) {
                UserSession userSession = this.A02;
                String str5 = inspirationSignalType.A00;
                C14360o3.A0B(str5, 3);
                C18920wW A01 = AbstractC12220kQ.A01(interfaceC60442pS, userSession);
                InterfaceC02590Ai A00 = A01.A00(A01.A00, "ig_lumen_impression");
                if (A00.isSampled()) {
                    ArrayList arrayList = new ArrayList(AbstractC06950Ym.A1E(BxK, 10));
                    for (InspirationSignalType inspirationSignalType2 : BxK) {
                        C0Zx c0Zx = new C0Zx();
                        c0Zx.A06("signal", inspirationSignalType2.A00);
                        arrayList.add(c0Zx);
                    }
                    A00.A9K("media_ig_id", A0k);
                    A00.AAP("signal", str5);
                    A00.AAP("container_module", interfaceC60442pS.getModuleName());
                    A00.AAk("recommendation_info", arrayList);
                    A00.AAP("canonical_nav_chain", AbstractC25041Ki.A00);
                    A00.Cht();
                }
            }
            C38321qM BQN2 = interfaceC38371qR.BQN();
            C28091Xn c28091Xn = this.A06;
            AbstractC37898Glt.A00(this.A00, this.A02, BQN2, interfaceC60442pS, c75113Zb, this.A04, this.A01, this.A05, c82383m1, Boolean.valueOf(!c28091Xn.A02(BQN2.A3E(r11, false))), str);
            return null;
        }
        AnonymousClass351 anonymousClass351 = A08;
        InterfaceC60442pS interfaceC60442pS2 = this.A03;
        UserSession userSession2 = this.A02;
        C19280xC A002 = anonymousClass351.A00(userSession2, interfaceC38371qR, interfaceC60442pS2, c75113Zb, this.A05, c82383m1, str4, str);
        if (BQN.A5M()) {
            C38321qM A1e2 = BQN.A1e(0);
            C38321qM A1e3 = BQN.A1e(c75113Zb.A03);
            if (A1e2 != null && A1e3 != null) {
                A002.A0C("carousel_cover_media_id", A1e2.getId());
                A002.A0C("carousel_media_id", A1e3.getId());
                A002.A08(Integer.valueOf(BQN.A0p()), "carousel_size");
                A002.A08(Integer.valueOf(A1e3.BRp().A00), "carousel_m_t");
                A002.A08(Integer.valueOf(c75113Zb.A03), "carousel_index");
                String BPW = BQN.A0C.BPW();
                if (BPW != null) {
                    A002.A0C("main_feed_carousel_starting_media_id", BPW);
                }
            }
        }
        if (BQN.CdW() && (c38576Gxf = BQN.A0B) != null) {
            A002.A09("is_multi_ads", true);
            A002.A08(Integer.valueOf(c38576Gxf.A00), "multi_ads_type");
            A002.A0C("multi_ads_unit_id", c38576Gxf.A01);
            if (c38576Gxf.A04) {
                A002.A0C("hscroll_seed_media_id", c38576Gxf.A03);
                str2 = c38576Gxf.A02;
                str3 = "hscroll_seed_media_author_igid";
            } else {
                str2 = c38576Gxf.A03;
                str3 = "hscroll_seed_ad_id";
            }
            A002.A0C(str3, str2);
        }
        if (BQN.CdW() && !BQN.Cff() && (c82383m1.A04 >= 2000 || c82383m1.A05 >= 2000)) {
            A002.A09("is_ad_engaged_view", true);
        }
        C38321qM c38321qM = BQN;
        if (BQN.A5M() && (A1e = BQN.A1e(c75113Zb.A03)) != null) {
            c38321qM = A1e;
        }
        long j = 0;
        if (c38321qM.Cff() && c38321qM.A1C() > 0) {
            A02 = (int) ((c75113Zb.A05 / c38321qM.A1C()) * 100.0d);
        } else {
            if (c38321qM.A5x()) {
                if (C18U.A06(C06090Tz.A05, userSession2, 36312114536711082L)) {
                    A02 = c75113Zb.A02();
                } else {
                    if (c75113Zb.A0o()) {
                        j = 100;
                    }
                    A002.A0B("media_loading_progress", Long.valueOf(j));
                }
            }
            A002.A09("client_sub_impression", Boolean.valueOf(!this.A06.A02(BQN.A3E(userSession2, false))));
            return A002;
        }
        A002.A08(Integer.valueOf(A02), "media_loading_progress");
        A002.A09("client_sub_impression", Boolean.valueOf(!this.A06.A02(BQN.A3E(userSession2, false))));
        return A002;
    }

    @Override // X.InterfaceC64122vX
    public final /* bridge */ /* synthetic */ C19280xC AMA(Object obj) {
        C19280xC c19280xC = (C19280xC) obj;
        C14360o3.A0B(c19280xC, 0);
        return c19280xC;
    }

    public AnonymousClass350(UserSession userSession, InterfaceC60442pS interfaceC60442pS, C61382r1 c61382r1, C1M1 c1m1, C28091Xn c28091Xn, String str) {
        this.A03 = interfaceC60442pS;
        this.A06 = c28091Xn;
        this.A07 = str;
        this.A02 = userSession;
        this.A05 = c1m1;
        this.A04 = c61382r1;
    }
}
