package X;

import android.content.Context;
import android.graphics.RectF;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.fragment.app.FragmentActivity;
import com.instagram.api.schemas.OriginalitySourceMediaInfo;
import com.instagram.clips.intf.ClipsViewerSource;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.creation.capture.quickcapture.thirdpartymedia.viewer.GiphyAttributionFragment;
import com.instagram.feed.media.EffectPreviewIntf;
import com.instagram.model.people.PeopleTag;
import com.instagram.user.model.UpcomingEvent;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes5.dex */
public final class BKA {
    public final Context A00;
    public final FragmentActivity A01;
    public final AbstractC59962oe A02;
    public final ClipsViewerSource A03;
    public final UserSession A04;
    public final InterfaceC60442pS A05;
    public final C37604Ggz A06;
    public final IG5 A07;
    public final C37671Gi4 A08;
    public final String A09;
    public final InterfaceC16620sF A0A;
    public final InterfaceC16610sE A0B;

    public final void A05(C38321qM c38321qM) {
        InterfaceC107774tM BEB;
        List AZh;
        InterfaceC107754tK interfaceC107754tK;
        String BlW;
        List AZh2;
        InterfaceC107754tK interfaceC107754tK2;
        String str = null;
        C3t0 c3t0 = new C3t0(this.A02, this.A05, this.A04, null);
        User A14 = AbstractC25226BEj.A14(c38321qM);
        if (A14 != null && (BEB = c38321qM.A0C.BEB()) != null && (AZh = BEB.AZh()) != null && (interfaceC107754tK = (InterfaceC107754tK) AbstractC001800i.A0O(AZh, 0)) != null && (BlW = interfaceC107754tK.BlW()) != null) {
            Context context = this.A00;
            float A0A = AbstractC13880nE.A0A(context) / 2.0f;
            float A09 = AbstractC13880nE.A09(context) / 2.0f;
            InterfaceC107774tM BEB2 = c38321qM.A0C.BEB();
            if (BEB2 != null && (AZh2 = BEB2.AZh()) != null && (interfaceC107754tK2 = (InterfaceC107754tK) AbstractC001800i.A0J(AZh2)) != null) {
                str = interfaceC107754tK2.getMediaId();
            }
            c3t0.A00(new RectF(A0A, A09, A0A, A09), null, C3G2.A15, A14, BlW, str);
        }
    }

    public final void A09(C38321qM c38321qM) {
        ImageUrl imageUrl;
        String str;
        boolean z;
        InterfaceC43580JMo A0t = AbstractC25226BEj.A0t(c38321qM);
        if (A0t != null) {
            User BdV = A0t.BdV();
            String str2 = null;
            if (BdV != null) {
                str2 = BdV.getUsername();
                imageUrl = BdV.Bhu();
                z = BdV.isVerified();
                str = BdV.getId();
            } else {
                imageUrl = null;
                str = null;
                z = false;
            }
            CLI.A00(this.A01, this.A04, imageUrl, c38321qM, A0t.BdW(), str2, A0t.BdS(), A0t.BdU(), str, c38321qM.getId(), "reels", z);
        }
    }

    public final void A0D(C38321qM c38321qM, boolean z, boolean z2) {
        int i;
        Bundle A00 = A00(c38321qM, this);
        ArrayList<? extends Parcelable> A3M = c38321qM.A3M();
        if (z) {
            A3M = AbstractC55229Oez.A06(c38321qM.A3M(), c38321qM.A0C.getCoauthorProducers());
            A3M.add(0, new PeopleTag(AbstractC25226BEj.A14(c38321qM)));
            A00.putBoolean(MSV.A00(486), true);
        }
        if (z2) {
            A00.putString(MSV.A00(29), "collab_post_follow_button_from_clips_surface");
        }
        A00.putParcelableArrayList("tagged_people", A3M);
        UserSession userSession = this.A04;
        A00.putString("IgSessionManager.SESSION_TOKEN_KEY", userSession.token);
        A00.putBoolean("is_from_clips", true);
        ArrayList A3Q = c38321qM.A3Q();
        String A0t = AbstractC25231BEo.A0t(c38321qM.A2E(userSession));
        if (A3Q != null && !A3Q.isEmpty() && OWJ.A00.A01(userSession, A0t, c38321qM.A5P()) && !z) {
            ArrayList<? extends Parcelable> A1E = AbstractC166987dD.A1E();
            A1E.addAll(A3Q);
            A00.putParcelableArrayList(MSV.A00(588), A1E);
        }
        ENN enn = new ENN();
        enn.setArguments(A00);
        Context context = this.A00;
        if (z) {
            i = 2131975156;
        } else {
            i = 2131955947;
            if (c38321qM.A5R()) {
                i = 2131961142;
            }
        }
        AbstractC25227BEk.A1N(enn, AbstractC166997dE.A0p(context, i), this.A0B, true);
    }

    public static Bundle A00(C38321qM c38321qM, BKA bka) {
        Bundle bundle = new Bundle();
        bundle.putString("media_id", c38321qM.getId());
        bundle.putSerializable("media_type", c38321qM.BRp());
        bundle.putString("prior_module", bka.A05.getModuleName());
        return bundle;
    }

    public final void A01() {
        C189448aO A0y = AbstractC25225BEi.A0y(this.A04);
        AbstractC25226BEj.A1M(this.A00, A0y, 2131964723);
        A0y.A0c = "Featuring x, y, and z";
        A0y.A00().A02(this.A01, new C26706Bqn());
    }

    public final void A03(C38321qM c38321qM) {
        EnumC124565kK enumC124565kK;
        Context context = this.A00;
        UserSession userSession = this.A04;
        String moduleName = this.A05.getModuleName();
        String A2u = c38321qM.A2u();
        if (c38321qM.A5P()) {
            enumC124565kK = EnumC124565kK.REEL;
        } else {
            enumC124565kK = EnumC124565kK.POST;
        }
        C124575kL.A00(context, enumC124565kK, c38321qM.A1J(), userSession, moduleName, A2u, false);
    }

    public final void A06(C38321qM c38321qM) {
        CMF.A00.A00(this.A01, EnumC223429tZ.REELS_ATTRIBUTION, C8JW.A09, this.A04, c38321qM.getId(), this.A05.getModuleName());
    }

    public final void A0A(C38321qM c38321qM) {
        String str;
        ImageUrl imageUrl;
        InterfaceC31131DmE AoB = c38321qM.A0C.AoB();
        if (AoB != null) {
            InterfaceC31133DmG BdT = AoB.BdT();
            User BhV = BdT.BhV();
            boolean z = false;
            String str2 = null;
            if (BhV != null) {
                str = BhV.getUsername();
                User BhV2 = BdT.BhV();
                if (BhV2 != null) {
                    imageUrl = BhV2.Bhu();
                } else {
                    imageUrl = null;
                }
                User BhV3 = BdT.BhV();
                if (BhV3 != null) {
                    z = BhV3.isVerified();
                }
                User BhV4 = BdT.BhV();
                if (BhV4 != null) {
                    str2 = BhV4.getId();
                }
            } else {
                str = null;
                imageUrl = null;
            }
            String id = c38321qM.getId();
            if (id != null) {
                AbstractC37834Gko.A04(this.A01, this.A04, BdT.AxF(), imageUrl, AoB.getAttributionAppId(), AoB.getAttributionAppName(), BdT.getContentUrl(), str, str2, BdT.getMediaCount(), id, z);
            }
        }
    }

    public final void A0B(C38321qM c38321qM) {
        UserSession userSession = this.A04;
        UpcomingEvent A2B = c38321qM.A2B(userSession);
        if (A2B != null) {
            C29395CxS c29395CxS = new C29395CxS();
            C28341Yv A00 = AbstractC22762A2g.A00();
            Context context = this.A00;
            InterfaceC60442pS interfaceC60442pS = this.A05;
            A00.A01(context, userSession, interfaceC60442pS, c29395CxS, A2B, c38321qM.A1g(userSession).getId(), interfaceC60442pS.getModuleName(), "attribute_pills", false, false);
        }
    }

    public final void A0C(C38321qM c38321qM) {
        String Bua = c38321qM.A0C.Bua();
        if (Bua != null) {
            AbstractC41776Ies.A09(this.A01, this.A04, C2Fb.A0n, AbstractC65857TvJ.A01(Bua), this.A05.getModuleName());
        }
    }

    public /* synthetic */ BKA(Context context, FragmentActivity fragmentActivity, AbstractC59962oe abstractC59962oe, ClipsViewerSource clipsViewerSource, UserSession userSession, InterfaceC60442pS interfaceC60442pS, IG5 ig5, C37671Gi4 c37671Gi4, String str, InterfaceC16620sF interfaceC16620sF, InterfaceC16610sE interfaceC16610sE) {
        C37604Ggz A00 = AbstractC37497GfF.A00(userSession);
        AbstractC25234BEr.A0k(4, userSession, interfaceC60442pS, c37671Gi4, clipsViewerSource);
        AbstractC25229BEm.A1J(ig5, 9, A00);
        this.A00 = context;
        this.A01 = fragmentActivity;
        this.A02 = abstractC59962oe;
        this.A04 = userSession;
        this.A05 = interfaceC60442pS;
        this.A08 = c37671Gi4;
        this.A03 = clipsViewerSource;
        this.A09 = str;
        this.A07 = ig5;
        this.A06 = A00;
        this.A0B = interfaceC16610sE;
        this.A0A = interfaceC16620sF;
    }

    public final void A02(C8JW c8jw, EffectPreviewIntf effectPreviewIntf, C38321qM c38321qM, C75113Zb c75113Zb) {
        boolean z;
        String A0p = AbstractC25231BEo.A0p();
        Long A0j = AbstractC25231BEo.A0j(0, effectPreviewIntf.getId());
        if (A0j != null) {
            long longValue = A0j.longValue();
            InterfaceC60442pS interfaceC60442pS = this.A05;
            AbstractC37670Gi3.A0L(EnumC39652Hih.A0E, c8jw, this.A04, c38321qM, interfaceC60442pS, A0p, this.A06.A01, this.A07.A00, longValue, c75113Zb.getPosition());
        }
        C37671Gi4.A00(this.A08, C05F.A0C);
        if (!AbstractC41732Ie4.A04(effectPreviewIntf)) {
            String id = effectPreviewIntf.getId();
            String str = this.A09;
            if (str == null || this.A03 != ClipsViewerSource.A08 || !str.equals(id)) {
                z = true;
                FragmentActivity fragmentActivity = this.A01;
                UserSession userSession = this.A04;
                AbstractC37834Gko.A01(fragmentActivity, c8jw, this.A05, userSession, effectPreviewIntf, c38321qM, AbstractC41770Iem.A03(c38321qM), A0p, AbstractC25226BEj.A1G(c38321qM), AbstractC41770Iem.A0A(userSession, c38321qM), AbstractC37843Gkx.A00(c38321qM), z);
            }
        }
        z = false;
        FragmentActivity fragmentActivity2 = this.A01;
        UserSession userSession2 = this.A04;
        AbstractC37834Gko.A01(fragmentActivity2, c8jw, this.A05, userSession2, effectPreviewIntf, c38321qM, AbstractC41770Iem.A03(c38321qM), A0p, AbstractC25226BEj.A1G(c38321qM), AbstractC41770Iem.A0A(userSession2, c38321qM), AbstractC37843Gkx.A00(c38321qM), z);
    }

    public final void A04(C38321qM c38321qM) {
        Bundle A0b = AbstractC166987dD.A0b();
        A0b.putString("media_id", c38321qM.getId());
        GiphyAttributionFragment giphyAttributionFragment = new GiphyAttributionFragment();
        giphyAttributionFragment.setArguments(A0b);
        this.A0B.invoke(giphyAttributionFragment, AbstractC166997dE.A0p(this.A01, 2131975475), AbstractC166997dE.A0b());
    }

    public final void A07(C38321qM c38321qM) {
        String str;
        User CDj;
        Bundle A00 = A00(c38321qM, this);
        C76263bW c76263bW = C76263bW.A00;
        UserSession userSession = this.A04;
        ArrayList A05 = c76263bW.A05(userSession, c38321qM);
        if (!A05.isEmpty()) {
            A00.putParcelableArrayList("tagged_people", A05);
        }
        A00.putString(MSV.A00(29), AnonymousClass001.A0R("clips_viewer_mashup_content_clips", "_bottom_sheet"));
        A00.putString("IgSessionManager.SESSION_TOKEN_KEY", userSession.token);
        A00.putBoolean("is_from_clips", true);
        OriginalitySourceMediaInfo A002 = C76263bW.A00(c38321qM);
        if (A002 != null && (CDj = A002.CDj()) != null) {
            str = CDj.getId();
        } else {
            str = null;
        }
        String A003 = AbstractC43591JPw.A00(49);
        A00.putString(A003, str);
        A00.putString(A003, AbstractC25231BEo.A0t(C76263bW.A01(c38321qM)));
        ENN enn = new ENN();
        enn.setArguments(A00);
        AbstractC25227BEk.A1N(enn, AbstractC166997dE.A0p(this.A00, 2131955948), this.A0B, true);
    }

    public final void A08(C38321qM c38321qM) {
        String str;
        User CDj;
        Bundle A00 = A00(c38321qM, this);
        C76263bW c76263bW = C76263bW.A00;
        UserSession userSession = this.A04;
        ArrayList A04 = c76263bW.A04(userSession, c38321qM);
        if (!A04.isEmpty()) {
            A00.putParcelableArrayList("tagged_people", A04);
        }
        A00.putString(MSV.A00(29), AnonymousClass001.A0R("clips_viewer_original_content_clips", "_bottom_sheet"));
        A00.putString("IgSessionManager.SESSION_TOKEN_KEY", userSession.token);
        A00.putBoolean("is_from_clips", true);
        OriginalitySourceMediaInfo A002 = C76263bW.A00(c38321qM);
        if (A002 != null && (CDj = A002.CDj()) != null) {
            str = CDj.getId();
        } else {
            str = null;
        }
        A00.putString(AbstractC43591JPw.A00(49), str);
        ENN enn = new ENN();
        enn.setArguments(A00);
        AbstractC25227BEk.A1N(enn, AbstractC166997dE.A0p(this.A00, 2131955948), this.A0B, true);
    }
}
