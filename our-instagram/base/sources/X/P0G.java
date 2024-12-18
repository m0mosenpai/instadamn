package X;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.location.Location;
import android.os.Bundle;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import com.facebook.common.callercontext.CallerContext;
import com.instagram.api.schemas.BrandedContentGatingInfo;
import com.instagram.api.schemas.BrandedContentProjectMetadata;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgSimpleImageView;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.creation.publishscreen.fragment.feed.FollowersShareFragment;
import com.instagram.creation.sharesheet.rowitems.model.PublishScreenCategoryType;
import com.instagram.model.fundraiser.NewFundraiserInfo;
import com.instagram.model.shopping.video.ShoppingCreationConfig;
import com.instagram.quickpromotion.intf.QPTooltipAnchor;
import com.instagram.shopping.model.taggingfeed.ProductCollectionFeedTaggingMeta;
import com.instagram.tagging.api.model.MediaSuggestedProductTag;
import com.instagram.user.model.UpcomingEvent;
import com.instagram.user.model.UpcomingEventImpl;
import com.instagram.user.model.User;
import com.instagram.wellbeing.fundraiser.model.ExistingStandaloneFundraiserForFeedModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.enums.EnumEntries;

/* loaded from: classes9.dex */
public final class P0G implements InterfaceC58310Pt2, InterfaceC58001Pnl {
    public OL7 A00;
    public P1E A01;
    public InterfaceC196338mP A02;
    public C50808McV A03;
    public final C22P A04;
    public final AbstractC59962oe A05;
    public final UserSession A06;
    public final NJK A07;
    public final NJQ A08;
    public final C50991Mfy A09;
    public final C54402O2i A0A;
    public final P0J A0B;

    public final void A04(String str) {
        C14360o3.A0B(str, 0);
        if (str.equals(EnumC72412Xd8.A0k.A01())) {
            C196068lw.A00(this.A06).A01(FollowersShareFragment.A0z, this.A02, "feed_composer");
        }
    }

    @Override // X.InterfaceC58310Pt2
    public final void Clh(String str) {
    }

    @Override // X.InterfaceC58310Pt2
    public final void CoZ(IgSimpleImageView igSimpleImageView) {
        C14360o3.A0B(igSimpleImageView, 0);
        C23031Ai A00 = AbstractC23021Ah.A00(this.A06);
        if (!AbstractC167017dG.A1b(A00, A00.A1F, C23031Ai.A8c, 183)) {
            C5SU A0U = AbstractC167007dF.A0U(this.A05.requireActivity(), 2131962417);
            A0U.A03(igSimpleImageView);
            A0U.A02();
            A0U.A0A = true;
            igSimpleImageView.postDelayed(new PQP(this, NMC.A00(A0U, this, 1)), 500L);
        }
    }

    @Override // X.InterfaceC58310Pt2
    public final void Cod(View view) {
    }

    @Override // X.InterfaceC58310Pt2
    public final void Coh(String str) {
    }

    @Override // X.InterfaceC58310Pt2
    public final void Con(IgSimpleImageView igSimpleImageView, int i) {
    }

    @Override // X.InterfaceC58310Pt2
    public final void CvP(AbstractC59962oe abstractC59962oe) {
    }

    @Override // X.InterfaceC58310Pt2
    public final void Cvb(AbstractC59962oe abstractC59962oe, User user) {
    }

    @Override // X.InterfaceC58001Pnl
    public final void Cx3(EnumC53382NjX enumC53382NjX) {
        C50808McV c50808McV;
        C14360o3.A0B(enumC53382NjX, 0);
        UserSession userSession = this.A06;
        if (!AbstractC55222Oeo.A0A(userSession)) {
            C06090Tz c06090Tz = C06090Tz.A05;
            if (!C18U.A06(c06090Tz, userSession, 36328336628137431L) && !C18U.A06(c06090Tz, userSession, 36328336628202968L)) {
                A00(enumC53382NjX, enumC53382NjX.A0A(OX2.A02(this.A07)));
            }
            if (enumC53382NjX == EnumC53382NjX.A05) {
                OZu oZu = OZu.A00;
                NJK njk = this.A07;
                if (oZu.A01(userSession, njk.A08().A00)) {
                    C47Z A02 = OX2.A02(njk);
                    AbstractC59962oe abstractC59962oe = this.A05;
                    GZR gzr = njk.A0A;
                    if (gzr != null) {
                        enumC53382NjX.A05(abstractC59962oe, userSession, A02, gzr, null, C57525Pfz.A00(this, 12), false);
                        if (!AbstractC55222Oeo.A0A(userSession) && (c50808McV = this.A03) != null) {
                            c50808McV.A06(OX2.A02(njk));
                            return;
                        }
                        return;
                    }
                    C14360o3.A0F("authorizeListener");
                    throw C00O.createAndThrow();
                }
            }
        }
    }

    @Override // X.InterfaceC58310Pt2
    public final void CyF() {
    }

    @Override // X.InterfaceC58310Pt2
    public final void D0M(AbstractC59962oe abstractC59962oe) {
    }

    @Override // X.InterfaceC58310Pt2
    public final void D3F(AbstractC59962oe abstractC59962oe) {
    }

    @Override // X.InterfaceC58310Pt2
    public final void DCl(NewFundraiserInfo newFundraiserInfo) {
    }

    @Override // X.InterfaceC58310Pt2
    public final void DGO(C82G c82g, AbstractC59962oe abstractC59962oe) {
    }

    @Override // X.InterfaceC58310Pt2
    public final void DJb(C54586O9n c54586O9n, String str) {
    }

    @Override // X.InterfaceC58310Pt2
    public final void DPB(AbstractC59962oe abstractC59962oe, boolean z, boolean z2) {
    }

    @Override // X.InterfaceC58178Pqi
    public final void DWu(InterfaceC58087PpC interfaceC58087PpC, UpcomingEvent upcomingEvent) {
        C14360o3.A0B(interfaceC58087PpC, 0);
        UserSession userSession = this.A06;
        if (C18U.A06(C06090Tz.A05, userSession, 36322431048296688L)) {
            AbstractC69933Cc.A01();
            EnumC53233NgW enumC53233NgW = EnumC53233NgW.A04;
            N6R n6r = new N6R();
            Bundle A0b = AbstractC166987dD.A0b();
            A0b.putSerializable("prior_surface", enumC53233NgW);
            A0b.putParcelable("initial_upcoming_event", upcomingEvent);
            n6r.A06 = interfaceC58087PpC;
            C189448aO A0W = AbstractC31174DnI.A0W(A0b, n6r, userSession);
            AbstractC25225BEi.A1Q(A0W, true);
            A0W.A03 = 0.9f;
            A0W.A1E = true;
            AbstractC31173DnH.A1G(this.A05, n6r, A0W.A00());
            return;
        }
        C50695MZq.A00(userSession, new NL5(interfaceC58087PpC, upcomingEvent, false));
    }

    @Override // X.InterfaceC58178Pqi
    public final void DWv(InterfaceC58087PpC interfaceC58087PpC, List list) {
        C14360o3.A0B(interfaceC58087PpC, 0);
        C50695MZq.A00(this.A06, new NL3(interfaceC58087PpC, list));
    }

    @Override // X.InterfaceC58310Pt2
    public final void DbZ() {
    }

    @Override // X.InterfaceC58310Pt2
    public final void DdU(AbstractC59962oe abstractC59962oe, boolean z, boolean z2) {
    }

    @Override // X.InterfaceC58310Pt2
    public final void DfE() {
    }

    @Override // X.InterfaceC58310Pt2
    public final void Dqd(AbstractC59962oe abstractC59962oe, ExistingStandaloneFundraiserForFeedModel existingStandaloneFundraiserForFeedModel) {
    }

    @Override // X.InterfaceC58310Pt2
    public final void Dqg(AbstractC59962oe abstractC59962oe, ShoppingCreationConfig shoppingCreationConfig, MediaSuggestedProductTag mediaSuggestedProductTag, int i) {
    }

    @Override // X.InterfaceC58310Pt2
    public final void Dqh(boolean z, int i) {
    }

    @Override // X.InterfaceC58310Pt2
    public final void Ds6(View view) {
    }

    @Override // X.InterfaceC58310Pt2
    public final void Ds7(AbstractC59962oe abstractC59962oe, ShoppingCreationConfig shoppingCreationConfig) {
    }

    @Override // X.InterfaceC58310Pt2
    public final void Dwf(AbstractC59962oe abstractC59962oe, boolean z, boolean z2) {
    }

    @Override // X.InterfaceC58310Pt2
    public final void E2h(C54400O2g c54400O2g) {
    }

    @Override // X.InterfaceC58310Pt2
    public final void E5H(NewFundraiserInfo newFundraiserInfo) {
    }

    @Override // X.InterfaceC58310Pt2
    public final void Ekv(C130135uJ c130135uJ, String str, String str2, boolean z) {
        N5K A00 = AbstractC53951NtO.A00(str2);
        A00.A01 = new C56367P1c(0, this, c130135uJ);
        C189448aO A0X = AbstractC31177DnL.A0X(this.A06, false);
        AbstractC59962oe abstractC59962oe = this.A05;
        A0X.A0F = ViewConfiguration.get(abstractC59962oe.requireActivity()).getScaledPagingTouchSlop();
        A0X.A0U = new C56761PHe(this, c130135uJ, str, str2);
        C189478aR A002 = A0X.A00();
        if (z) {
            AbstractC167007dF.A0J().postDelayed(new PST(this, A00, A002), 500L);
        } else {
            AbstractC31173DnH.A1G(abstractC59962oe, A00, A002);
        }
    }

    @Override // X.InterfaceC58310Pt2
    public final void ElP(View view, String str) {
    }

    @Override // X.InterfaceC58310Pt2
    public final void ElY(C65782Tu0 c65782Tu0, InterfaceC16820sZ interfaceC16820sZ) {
        int i;
        DialogInterface.OnClickListener A00;
        C14360o3.A0B(c65782Tu0, 0);
        C193328hC A0b = AbstractC31176DnK.A0b(this.A05);
        A0b.A0A(c65782Tu0.A02);
        A0b.A09(c65782Tu0.A01);
        Number number = (Number) c65782Tu0.A05;
        if (number != null) {
            i = number.intValue();
            A00 = new DialogInterfaceOnClickListenerC48023LMs(c65782Tu0, 19);
        } else {
            i = 2131968948;
            A00 = DialogInterfaceOnClickListenerC55319Ogh.A00(interfaceC16820sZ, 44);
        }
        A0b.A0J(A00, i);
        Number number2 = (Number) c65782Tu0.A03;
        if (number2 != null) {
            A0b.A0I(null, number2.intValue());
        }
        AbstractC166987dD.A1W(A0b);
    }

    @Override // X.InterfaceC58310Pt2
    public final void FB6(ExistingStandaloneFundraiserForFeedModel existingStandaloneFundraiserForFeedModel) {
    }

    @Override // X.InterfaceC58310Pt2
    public final void FBT(NewFundraiserInfo newFundraiserInfo) {
    }

    @Override // X.InterfaceC58310Pt2
    public final void FCy(UpcomingEvent upcomingEvent) {
    }

    private final void A00(EnumC53382NjX enumC53382NjX, boolean z) {
        if (enumC53382NjX == EnumC53382NjX.A05) {
            UserSession userSession = this.A06;
            if (!C37855Gl9.A00.A0K(userSession)) {
                if (z) {
                    if (AbstractC166987dD.A0x(userSession).getInt("fb_feed_crossposting_advanced_settings_tooltip", 0) < 3 && C196218mC.A00(userSession)) {
                        C52481NJz c52481NJz = this.A08.A0G;
                        PZT.A03(c52481NJz, c52481NJz.A02, 38);
                        return;
                    }
                    return;
                }
                C200018t5 c200018t5 = this.A07.A0L;
                AbstractC59962oe abstractC59962oe = this.A05;
                C54804OJy A00 = AbstractC54221Nxz.A00(abstractC59962oe.requireActivity(), C82G.A0B, userSession);
                A00.A00 = abstractC59962oe.requireContext();
                A00.A0A = C6WI.A02();
                A00.A01 = abstractC59962oe;
                c200018t5.A01(null, A00, new PGT(this, 1));
            }
        }
    }

    public final void A01() {
        OL7 ol7;
        if (!AbstractC55222Oeo.A0A(this.A06) && (ol7 = this.A00) != null) {
            ol7.A00();
        }
    }

    public final void A02() {
        C50808McV c50808McV;
        if (!AbstractC55222Oeo.A0A(this.A06) && (c50808McV = this.A03) != null) {
            c50808McV.A06(OX2.A02(this.A07));
        }
        A01();
    }

    public final void A03() {
        P1E p1e;
        IgTextView igTextView;
        NJK njk;
        boolean A01;
        if (this.A03 != null) {
            UserSession userSession = this.A06;
            if (!AbstractC55222Oeo.A0A(userSession)) {
                EnumEntries enumEntries = EnumC53382NjX.A03;
                Iterator<E> it = AbstractC54198Nxc.A00(userSession).iterator();
                boolean z = false;
                while (it.hasNext()) {
                    EnumC53382NjX enumC53382NjX = (EnumC53382NjX) it.next();
                    if (enumC53382NjX == EnumC53382NjX.A05) {
                        OZu oZu = OZu.A00;
                        njk = this.A07;
                        A01 = oZu.A01(userSession, njk.A08().A00);
                    } else {
                        njk = this.A07;
                        A01 = EnumC53382NjX.A01(njk.A08().A00);
                    }
                    if (A01) {
                        z = true;
                    } else {
                        enumC53382NjX.A08(OX2.A02(njk), false);
                    }
                }
                C50808McV c50808McV = this.A03;
                C14360o3.A0A(c50808McV);
                c50808McV.A07 = this;
                C50808McV c50808McV2 = this.A03;
                C14360o3.A0A(c50808McV2);
                c50808McV2.A06(OX2.A02(this.A07));
                float f = 0.3f;
                if (z) {
                    f = 1.0f;
                }
                C131975xX c131975xX = C131965xW.A05;
                if (!C131975xX.A01(userSession) && (p1e = this.A01) != null && (igTextView = p1e.A07) != null) {
                    igTextView.setAlpha(f);
                }
            }
        }
        A01();
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0019, code lost:
    
        if (X.C18U.A06(X.C06090Tz.A05, r6.A06, 36325523424556172L) != false) goto L6;
     */
    @Override // X.InterfaceC58310Pt2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.instagram.business.scheduling.model.NonSupportedContentSchedulingFeatures CD1() {
        /*
            r6 = this;
            X.NJK r5 = r6.A07
            X.47Z r0 = X.OX2.A02(r5)
            boolean r0 = r0.A5T
            r4 = 0
            if (r0 == 0) goto L1b
            com.instagram.common.session.UserSession r3 = r6.A06
            X.0Tz r2 = X.C06090Tz.A05
            r0 = 36325523424556172(0x810ddf0000348c, double:3.0357455126070596E-306)
            boolean r0 = X.C18U.A06(r2, r3, r0)
            r3 = 1
            if (r0 == 0) goto L1c
        L1b:
            r3 = 0
        L1c:
            com.instagram.common.session.UserSession r2 = r6.A06
            X.47Z r1 = X.OX2.A02(r5)
            r0 = 0
            com.instagram.business.scheduling.model.NonSupportedContentSchedulingFeatures r0 = X.C151866sW.A00(r2, r0, r1, r3, r4)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.P0G.CD1():com.instagram.business.scheduling.model.NonSupportedContentSchedulingFeatures");
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x003e, code lost:
    
        if (r1.A00 == null) goto L8;
     */
    @Override // X.InterfaceC58310Pt2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean Col() {
        /*
            r11 = this;
            X.NJQ r2 = r11.A08
            X.NJc r0 = r2.A03
            X.47Z r9 = r0.A04()
            X.2oe r0 = r11.A05
            android.content.Context r0 = r0.requireContext()
            X.OSw r6 = new X.OSw
            r6.<init>(r0)
            com.instagram.common.session.UserSession r1 = r11.A06
            X.Ovx r0 = X.AbstractC53982Ntt.A00(r1)
            X.05A r0 = r0.A02
            java.lang.Iterable r0 = X.AbstractC31172DnG.A0w(r0)
            java.util.List r0 = X.AbstractC001800i.A0a(r0)
            boolean r10 = X.AbstractC166987dD.A1b(r0)
            boolean r0 = X.AbstractC55222Oeo.A0A(r1)
            if (r0 == 0) goto L9c
            X.NJy r0 = r2.A0D
            X.0UO r0 = r0.A05
            java.lang.Object r1 = r0.getValue()
            X.Msi r1 = (X.C51713Msi) r1
            boolean r0 = r1.A03
            if (r0 == 0) goto L40
            X.5xZ r0 = r1.A00
            r8 = 1
            if (r0 != 0) goto L41
        L40:
            r8 = 0
        L41:
            boolean r7 = r9.A5i
            X.NJw r0 = r2.A0N
            X.0UO r0 = r0.A05
            java.lang.Object r0 = r0.getValue()
            X.MSf r0 = (X.C50526MSf) r0
            boolean r5 = r0.A00
            java.lang.String r0 = r9.A2d
            r4 = 0
            boolean r3 = X.AbstractC167007dF.A1W(r0)
            com.instagram.music.common.model.MusicOverlayStickerModel r0 = r9.A1J
            boolean r2 = X.AbstractC167007dF.A1W(r0)
            X.3bi r1 = r9.A1F
            X.3bi r0 = X.EnumC76383bi.A04
            if (r1 != r0) goto L63
            r4 = 1
        L63:
            boolean r0 = r9.A67
            if (r10 == 0) goto L72
            r1 = 2131961953(0x7f132861, float:1.9560617E38)
        L6a:
            r0 = 2131961960(0x7f132868, float:1.9560632E38)
            X.C54966OSw.A00(r6, r0, r1)
            r0 = 1
            return r0
        L72:
            if (r8 == 0) goto L78
            r1 = 2131961955(0x7f132863, float:1.9560622E38)
            goto L6a
        L78:
            if (r7 == 0) goto L7e
            r1 = 2131961947(0x7f13285b, float:1.9560605E38)
            goto L6a
        L7e:
            if (r5 == 0) goto L84
            r1 = 2131961946(0x7f13285a, float:1.9560603E38)
            goto L6a
        L84:
            if (r3 == 0) goto L8a
            r1 = 2131961950(0x7f13285e, float:1.9560611E38)
            goto L6a
        L8a:
            if (r2 == 0) goto L90
            r1 = 2131961954(0x7f132862, float:1.956062E38)
            goto L6a
        L90:
            if (r4 == 0) goto L96
            r1 = 2131961949(0x7f13285d, float:1.956061E38)
            goto L6a
        L96:
            if (r0 == 0) goto L9f
            r1 = 2131961958(0x7f132866, float:1.9560628E38)
            goto L6a
        L9c:
            boolean r8 = r9.A5T
            goto L41
        L9f:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.P0G.Col():boolean");
    }

    @Override // X.InterfaceC58310Pt2
    public final void Cp8() {
        C50808McV c50808McV;
        C47Z A02 = OX2.A02(this.A07);
        if (!AbstractC55222Oeo.A0A(this.A06) && (c50808McV = this.A03) != null) {
            c50808McV.A06(A02);
        }
        A01();
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0074, code lost:
    
        if (r4.A04().A67 != false) goto L14;
     */
    @Override // X.InterfaceC58310Pt2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Cw0(X.AbstractC59962oe r11) {
        /*
            r10 = this;
            com.instagram.common.session.UserSession r1 = r10.A06
            X.AHF r2 = X.MX1.A00(r1)
            java.lang.String r0 = "ADVANCED_SETTINGS_TAPPED"
            r2.A04(r0)
            X.22C r2 = X.AnonymousClass229.A01(r1)
            X.81X r0 = X.C81X.A0A
            r2.A1Y(r0)
            X.NJQ r5 = r10.A08
            X.NJc r4 = r5.A03
            X.47Z r0 = r4.A04()
            java.util.List r8 = r0.A4C
            if (r8 != 0) goto L24
            java.util.ArrayList r8 = X.AbstractC166987dD.A1E()
        L24:
            X.47Z r0 = r4.A04()
            X.H2v r0 = r0.A0v
            r7 = 0
            if (r0 == 0) goto L4d
            java.lang.Integer r0 = r0.A00
            if (r0 == 0) goto L4d
            java.util.concurrent.TimeUnit r6 = java.util.concurrent.TimeUnit.SECONDS
            X.47Z r0 = r4.A00
            X.C14360o3.A0A(r0)
            X.H2v r0 = r0.A0v
            X.C14360o3.A0A(r0)
            java.lang.Integer r0 = r0.A00
            int r0 = X.MSX.A05(r0)
            long r2 = (long) r0
            long r2 = r6.toMillis(r2)
            java.util.Date r7 = new java.util.Date
            r7.<init>(r2)
        L4d:
            r4.A04()
            r4.A04()
            X.47Z r0 = r4.A04()
            java.lang.String r6 = r0.A3t
            X.47Z r0 = r4.A04()
            r0.A0n()
            X.47Z r0 = r4.A04()
            r0.A0o()
            boolean r0 = r5.A0G()
            if (r0 != 0) goto L76
            X.47Z r0 = r4.A04()
            boolean r0 = r0.A67
            r9 = 0
            if (r0 == 0) goto L77
        L76:
            r9 = 1
        L77:
            X.47Z r0 = r4.A04()
            com.instagram.api.schemas.BrandedContentGatingInfo r5 = r0.A0s
            X.22P r4 = r10.A04
            X.NL7 r3 = new X.NL7
            r3.<init>(r4, r5, r6, r7, r8, r9)
            X.C50695MZq.A00(r1, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.P0G.Cw0(X.2oe):void");
    }

    @Override // X.InterfaceC58310Pt2
    public final void Cw1(C50821Mcw c50821Mcw) {
        TextView textView = c50821Mcw.A0A;
        P0J p0j = this.A0B;
        p0j.ED5(textView, QPTooltipAnchor.A04);
        if (this.A08.A03.A04().A11()) {
            p0j.ED5(textView, QPTooltipAnchor.A05);
        }
        UserSession userSession = this.A06;
        InterfaceC16530ry interfaceC16530ry = AbstractC23021Ah.A00(userSession).A33;
        C0YR[] c0yrArr = C23031Ai.A8c;
        if (!AbstractC167017dG.A1b(r1, interfaceC16530ry, c0yrArr, 154)) {
            AbstractC13880nE.A0u(textView, new PUL(4, textView, this));
        }
        C23031Ai A00 = AbstractC23021Ah.A00(userSession);
        if (!(!AbstractC167017dG.A1b(A00, A00.A33, c0yrArr, 154)) && C151866sW.A00.A08(userSession)) {
            C23031Ai A002 = AbstractC23021Ah.A00(userSession);
            if (!AbstractC167017dG.A1b(A002, A002.A2w, c0yrArr, 153)) {
                Context A06 = AbstractC31173DnH.A06(textView, 1);
                AbstractC31171DnF.A1O(A06);
                C5SU A0U = AbstractC167007dF.A0U((Activity) A06, 2131956783);
                A0U.A0F = true;
                A0U.A03(textView);
                A0U.A02();
                A0U.A0A = true;
                A0U.A0B = true;
                textView.getViewTreeObserver().addOnScrollChangedListener(new ViewTreeObserverOnScrollChangedListenerC35723Fpx(0, textView, NMC.A00(A0U, userSession, 3)));
            }
        }
    }

    @Override // X.InterfaceC58310Pt2
    public final void Cxf() {
        UserSession userSession = this.A06;
        C22C A01 = AnonymousClass229.A01(userSession);
        AbstractC59962oe abstractC59962oe = this.A05;
        A01.A1o(abstractC59962oe.getModuleName());
        AnonymousClass229.A01(userSession).A1C(EnumC53380NjV.A07, C81X.A0Q);
        N7G n7g = new N7G();
        C189448aO A0W = AbstractC31174DnI.A0W(MSX.A08(userSession), n7g, userSession);
        A0W.A0T = n7g;
        AbstractC25226BEj.A1M(abstractC59962oe.requireContext(), A0W, 2131953267);
        AbstractC25225BEi.A1Q(A0W, false);
        C56766PHj.A00(A0W, this, 5);
        C189478aR A00 = A0W.A00();
        AbstractC31173DnH.A1G(abstractC59962oe, n7g, A00);
        n7g.A03 = A00;
        C52367NFg c52367NFg = n7g.A01;
        if (c52367NFg != null) {
            c52367NFg.A01 = A00;
        }
    }

    @Override // X.InterfaceC58310Pt2
    public final void CyO(List list, long j) {
        NKC nkc = this.A08.A0Q;
        C25621Ms A0M = AbstractC31177DnL.A0M(nkc.A00);
        A0M.A0B("upcoming_events/add_event_from_product/");
        A0M.A9s("tagged_product_ids", AbstractC31175DnJ.A0b(list));
        A0M.A0E("tagged_merchant_id", j);
        C1ON A0e = AbstractC25227BEk.A0e(A0M, C38897HAt.class, IRL.class);
        C50689MZh.A00(A0e, nkc, 11);
        C1GJ.A04(A0e, -5);
    }

    @Override // X.InterfaceC58310Pt2
    public final void DJC(String str, ArrayList arrayList, boolean z) {
        C50695MZq.A00(this.A06, new C52500NKt());
    }

    @Override // X.InterfaceC58310Pt2
    public final void DMx(boolean z) {
        this.A08.A03.A04().A5Z = z;
    }

    @Override // X.InterfaceC58310Pt2
    public final void DWh(String str) {
        FragmentActivity requireActivity = this.A05.requireActivity();
        UserSession userSession = this.A06;
        N7Q n7q = new N7Q();
        AbstractC25233BEq.A15(n7q, "OPEN_CAROUSEL_EXISTING_PROMPT_ARG", str);
        C189448aO A0y = AbstractC25225BEi.A0y(userSession);
        AbstractC25226BEj.A1M(requireActivity, A0y, 2131969175);
        A0y.A11 = false;
        A0y.A0T = n7q;
        A0y.A0U = n7q;
        MSW.A1L(requireActivity, A0y, 2131969172);
        A0y.A1J = false;
        A0y.A0K = new ViewOnClickListenerC55463OkI(n7q, 51);
        A0y.A0h = requireActivity.getString(2131969174);
        A0y.A1N = true;
        A0y.A0w = true;
        A0y.A14 = false;
        C189478aR A00 = A0y.A00();
        n7q.A01 = A00;
        A00.A02(requireActivity, n7q);
    }

    @Override // X.InterfaceC58310Pt2
    public final void DWj(boolean z) {
        C81X c81x;
        Context requireContext = this.A05.requireContext();
        UserSession userSession = this.A06;
        C55101ObE c55101ObE = new C55101ObE(userSession, requireContext);
        C22C A00 = AnonymousClass229.A00(c55101ObE.A01, c55101ObE.A07, null, null, null, null);
        EnumC114925Hg enumC114925Hg = EnumC114925Hg.FEED;
        Boolean valueOf = Boolean.valueOf(z);
        C448724r c448724r = A00.A0F;
        boolean booleanValue = valueOf.booleanValue();
        InterfaceC02590Ai A0M = MSZ.A0M(c448724r);
        if (A0M.isSampled()) {
            if (booleanValue) {
                c81x = C81X.A0M;
            } else {
                c81x = C81X.A1k;
            }
            MSW.A1N(c81x, A0M);
            MSW.A1V(A0M, "IG_CAMERA_CLIPS_SHARE_SHEET_ENTITY_TAP");
            C22M c22m = c448724r.A04;
            A0M.AAP("camera_session_id", MSX.A0f(c22m));
            A0M.A8R(enumC114925Hg, "camera_destination");
            MSX.A1F(A0M, c22m);
            AbstractC167017dG.A1B(A0M);
            MSW.A1M(EnumC50631MWs.A0L, A0M);
            AbstractC50522MSa.A1E(A0M, "camera_session_id", AbstractC166997dE.A0n());
            AbstractC167017dG.A1C(A0M);
        }
        EgZ.A04.A02(requireContext, userSession, null, false, true);
    }

    /* JADX WARN: Type inference failed for: r6v0, types: [X.NKn, X.MZs] */
    @Override // X.InterfaceC58310Pt2
    public final void DXm() {
        AbstractC50697MZs abstractC50697MZs;
        C193328hC A0O;
        NJQ njq = this.A08;
        NK3 nk3 = njq.A0I;
        if (nk3.A08().A1J != null) {
            if (!C18U.A06(C06090Tz.A06, this.A06, 36313974257551706L)) {
                A0O = AbstractC31175DnJ.A0O(this.A05);
                A0O.A0A(2131952287);
                A0O.A09(2131952286);
                A0O.A0I(null, 2131968948);
                AbstractC166987dD.A1W(A0O);
                return;
            }
        }
        if (njq.A0G()) {
            A0O = AbstractC31175DnJ.A0O(this.A05);
            A0O.A0A(2131956248);
            A0O.A09(2131956247);
            A0O.A07();
            AbstractC166987dD.A1W(A0O);
            return;
        }
        UserSession userSession = this.A06;
        if (LB9.A01(userSession)) {
            OGF ogf = AbstractC54944ORu.A00;
            boolean z = nk3.A08().A5i;
            List list = nk3.A08().A4C;
            if (list == null) {
                list = C16930sl.A00;
            }
            abstractC50697MZs = ogf.A00(nk3.A08().A0s, nk3.A08().A0t, userSession, null, list, z, nk3.A08().A51);
        } else {
            boolean z2 = nk3.A08().A51;
            boolean z3 = nk3.A08().A5i;
            List list2 = nk3.A08().A4C;
            if (list2 == null) {
                list2 = C16930sl.A00;
            }
            BrandedContentProjectMetadata brandedContentProjectMetadata = nk3.A08().A0t;
            BrandedContentGatingInfo brandedContentGatingInfo = nk3.A08().A0s;
            ?? abstractC50697MZs2 = new AbstractC50697MZs("partnership_label_and_ads");
            abstractC50697MZs2.A03 = z2;
            abstractC50697MZs2.A04 = z3;
            abstractC50697MZs2.A02 = list2;
            abstractC50697MZs2.A01 = brandedContentProjectMetadata;
            abstractC50697MZs2.A00 = brandedContentGatingInfo;
            abstractC50697MZs = abstractC50697MZs2;
        }
        C50695MZq.A00(userSession, abstractC50697MZs);
        MX1.A00(userSession).A04("PARTNERSHIP_LABEL_AND_ADS_TAPPED");
    }

    @Override // X.InterfaceC58310Pt2
    public final void DcT(AbstractC59962oe abstractC59962oe, PublishScreenCategoryType publishScreenCategoryType) {
        C50695MZq.A00(this.A06, new NL4(abstractC59962oe.requireArguments(), publishScreenCategoryType, abstractC59962oe.getModuleName()));
    }

    @Override // X.InterfaceC58178Pqi
    public final void Dwp(UpcomingEvent upcomingEvent) {
        this.A08.A0Q.A09(upcomingEvent);
    }

    @Override // X.InterfaceC58178Pqi
    public final void Dwq(UpcomingEvent upcomingEvent) {
        this.A08.A0Q.A08(upcomingEvent);
    }

    @Override // X.InterfaceC58178Pqi
    public final void Dws() {
        this.A08.A0Q.A09(null);
        C6WI.A01();
    }

    @Override // X.InterfaceC58178Pqi
    public final void Dwt() {
        AnonymousClass229.A01(this.A06).A1Y(C81X.A05);
    }

    @Override // X.InterfaceC58310Pt2
    public final void E2B(boolean z) {
        EnumC53382NjX enumC53382NjX = ((C51713Msi) this.A08.A0D.A05.getValue()).A01;
        if (enumC53382NjX != null) {
            UserSession userSession = this.A06;
            C06090Tz c06090Tz = C06090Tz.A05;
            if (!C18U.A06(c06090Tz, userSession, 36328336628137431L) && !C18U.A06(c06090Tz, userSession, 36328336628202968L)) {
                A00(enumC53382NjX, z);
            }
            if (enumC53382NjX == EnumC53382NjX.A05) {
                OZu oZu = OZu.A00;
                NJK njk = this.A07;
                if (oZu.A01(userSession, njk.A08().A00)) {
                    C47Z A02 = OX2.A02(njk);
                    AbstractC59962oe abstractC59962oe = this.A05;
                    Boolean valueOf = Boolean.valueOf(z);
                    GZR gzr = njk.A0A;
                    if (gzr != null) {
                        enumC53382NjX.A05(abstractC59962oe, userSession, A02, gzr, valueOf, C57356PdG.A00, true);
                    } else {
                        C14360o3.A0F("authorizeListener");
                        throw C00O.createAndThrow();
                    }
                }
            }
        }
    }

    @Override // X.InterfaceC58310Pt2
    public final void onActivityResult(int i, int i2, Intent intent) {
        AHF A00;
        String str;
        EnumC53382NjX enumC53382NjX;
        if (i != 1000) {
            if (i != 1001) {
                if (i != 1004) {
                    if (i != 2002) {
                        if (i != 5152) {
                            NJK njk = this.A07;
                            if (njk.A08().A00 != null) {
                                UserSession userSession = this.A06;
                                C47Z A02 = OX2.A02(njk);
                                CallerContext callerContext = C55621On6.A00;
                                if (i == 64206) {
                                    enumC53382NjX = EnumC53382NjX.A05;
                                } else {
                                    enumC53382NjX = null;
                                }
                                if (i2 == -1 && enumC53382NjX != null && enumC53382NjX != EnumC53382NjX.A05 && !(!enumC53382NjX.A09(userSession))) {
                                    enumC53382NjX.A08(A02, true);
                                }
                            }
                            A02();
                            return;
                        }
                        if (i2 != -1) {
                            return;
                        }
                        if (intent != null) {
                            UpcomingEvent upcomingEvent = (UpcomingEvent) intent.getParcelableExtra("upcoming_live");
                            NJK njk2 = this.A07;
                            C47Z A022 = OX2.A02(njk2);
                            UpcomingEventImpl upcomingEventImpl = null;
                            if (upcomingEvent != null) {
                                upcomingEventImpl = upcomingEvent.F7b(null);
                            }
                            A022.A1p = upcomingEventImpl;
                            this.A08.A0Q.A09(OX2.A02(njk2).A1p);
                            return;
                        }
                        throw AbstractC166987dD.A14("Required value was null.");
                    }
                    this.A09.A00(intent);
                    return;
                }
                if (i2 != -1) {
                    return;
                }
                C47705L4m c47705L4m = this.A07.A02;
                if (c47705L4m != null) {
                    if (intent != null) {
                        c47705L4m.A07.invoke(new PQG(intent, c47705L4m));
                        return;
                    }
                    throw AbstractC166987dD.A14("Required value was null.");
                }
                C14360o3.A0F("addMusicRowViewController");
                throw C00O.createAndThrow();
            }
            if (i2 != -1) {
                return;
            }
            if (intent != null) {
                ArrayList parcelableArrayListExtra = intent.getParcelableArrayListExtra("media_tagging_info_list");
                if (parcelableArrayListExtra != null) {
                    ProductCollectionFeedTaggingMeta productCollectionFeedTaggingMeta = (ProductCollectionFeedTaggingMeta) intent.getParcelableExtra("tagged_collection_info");
                    NJQ njq = this.A08;
                    NKA nka = njq.A08;
                    nka.A01 = intent.getBooleanExtra("has_seen_OPT_tooltip", false);
                    ArrayList<String> stringArrayListExtra = intent.getStringArrayListExtra("tagged_seller_ids");
                    if (stringArrayListExtra != null) {
                        nka.A00 = stringArrayListExtra;
                    }
                    njq.A0A.A09(productCollectionFeedTaggingMeta, parcelableArrayListExtra, true);
                    nka.A08(parcelableArrayListExtra);
                    return;
                }
                throw AbstractC166987dD.A14("Required value was null.");
            }
            throw AbstractC166987dD.A14("Required value was null.");
        }
        if (i2 == -1) {
            if (intent != null) {
                ArrayList parcelableArrayListExtra2 = intent.getParcelableArrayListExtra("media_tagging_info_list");
                if (parcelableArrayListExtra2 != null) {
                    ProductCollectionFeedTaggingMeta productCollectionFeedTaggingMeta2 = (ProductCollectionFeedTaggingMeta) intent.getParcelableExtra("tagged_collection_info");
                    NJQ njq2 = this.A08;
                    NKA nka2 = njq2.A08;
                    nka2.A01 = intent.getBooleanExtra("has_seen_OPT_tooltip", false);
                    ArrayList<String> stringArrayListExtra2 = intent.getStringArrayListExtra("tagged_seller_ids");
                    if (stringArrayListExtra2 != null) {
                        nka2.A00 = stringArrayListExtra2;
                    }
                    nka2.A08(parcelableArrayListExtra2);
                    njq2.A0A.A09(productCollectionFeedTaggingMeta2, parcelableArrayListExtra2, false);
                    A00 = MX1.A00(this.A06);
                    str = "TAG_PEOPLE_SAVED";
                } else {
                    throw AbstractC166987dD.A14("Required value was null.");
                }
            } else {
                throw AbstractC166987dD.A14("Required value was null.");
            }
        } else {
            A00 = MX1.A00(this.A06);
            str = "TAG_PEOPLE_CANCELED";
        }
        A00.A04(str);
    }

    public P0G(C22P c22p, AbstractC59962oe abstractC59962oe, UserSession userSession, NJK njk, P0J p0j, NJQ njq, C50991Mfy c50991Mfy, C54402O2i c54402O2i) {
        MSZ.A1O(userSession, njq);
        AbstractC167007dF.A1I(p0j, 6, c22p);
        this.A06 = userSession;
        this.A05 = abstractC59962oe;
        this.A07 = njk;
        this.A08 = njq;
        this.A09 = c50991Mfy;
        this.A0B = p0j;
        this.A0A = c54402O2i;
        this.A04 = c22p;
        this.A02 = new P1O(this, 1);
    }

    @Override // X.InterfaceC58310Pt2
    public final void Cp5(boolean z) {
        C50808McV c50808McV;
        A03();
        if (!AbstractC55222Oeo.A0A(this.A06) && (c50808McV = this.A03) != null) {
            c50808McV.A0C = this.A08.A0G();
        }
        if (z) {
            Col();
            Cp8();
        }
    }

    @Override // X.InterfaceC58310Pt2
    public final void DY6() {
        EnumC76383bi enumC76383bi;
        C6WI.A01().A0S = true;
        UserSession userSession = this.A06;
        AnonymousClass229.A01(userSession).A1Y(C81X.A2e);
        MX1.A00(userSession).A04("TAG_PEOPLE_TAPPED");
        AnonymousClass229.A01(userSession).A0j();
        AbstractC59962oe abstractC59962oe = this.A05;
        NJK njk = this.A07;
        AnonymousClass841 A07 = njk.A07();
        C52458NJc A08 = njk.A08();
        C47Z c47z = njk.A08().A00;
        AbstractC50867Mdy A05 = njk.A05();
        C14360o3.A0C(A05, "null cannot be cast to non-null type com.instagram.creation.publishscreen.viewmodel.FeedPublishScreenViewModel");
        boolean z = ((NJQ) A05).A08.A01;
        boolean z2 = ((C51721Msy) this.A08.A07.A04.getValue()).A04;
        List list = OX2.A01(njk).A08.A04;
        AbstractC50867Mdy A052 = njk.A05();
        C14360o3.A0C(A052, "null cannot be cast to non-null type com.instagram.creation.publishscreen.viewmodel.FeedPublishScreenViewModel");
        ArrayList arrayList = ((NJQ) A052).A08.A00;
        C55099ObA A09 = njk.A09();
        C14360o3.A0B(list, 7);
        C55772hI.A00(userSession).A06(abstractC59962oe.getActivity());
        C55104ObH c55104ObH = new C55104ObH(abstractC59962oe.requireContext(), EnumC53319Nhv.A07);
        boolean z3 = false;
        c55104ObH.A02 = false;
        EnumC76383bi enumC76383bi2 = null;
        if (c47z != null) {
            enumC76383bi = c47z.A1F;
        } else {
            enumC76383bi = null;
        }
        c55104ObH.A0D = AbstractC167007dF.A1X(enumC76383bi, EnumC76383bi.A07);
        if (c47z != null) {
            enumC76383bi2 = c47z.A1F;
        }
        c55104ObH.A0C = AbstractC167007dF.A1X(enumC76383bi2, EnumC76383bi.A04);
        if (c47z != null && c47z.A67) {
            z3 = true;
        }
        c55104ObH.A0G = z3;
        c55104ObH.A0A = z;
        c55104ObH.A03(userSession);
        c55104ObH.A0J = AbstractC55108ObP.A03(userSession, A07, c47z, A09);
        ArrayList A0q = AbstractC167017dG.A0q(list);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AbstractC167017dG.A1V(A0q, it);
        }
        c55104ObH.A07 = AbstractC166987dD.A1F(A0q);
        c55104ObH.A08 = AbstractC166987dD.A1F(arrayList);
        c55104ObH.A0H = true;
        if (A07.CPp()) {
            List CpK = A07.CpK();
            ArrayList A1E = AbstractC166987dD.A1E();
            Iterator it2 = CpK.iterator();
            while (it2.hasNext()) {
                C47Z BcC = A08.A03.BcC(MSW.A0R(it2).BcD());
                if (BcC != null) {
                    A1E.add(BcC);
                }
            }
            c55104ObH.A05(A07, A1E);
            c55104ObH.A0E = z2;
        } else if (c47z != null) {
            c55104ObH.A04(A07, c47z);
        }
        C12260kU.A06(abstractC59962oe, c55104ObH.A02(), 1000);
    }

    @Override // X.InterfaceC58310Pt2
    public final void E2k(Location location, long j) {
        C6WI.A01().A0O = true;
        UserSession userSession = this.A06;
        MX1.A00(userSession).A04("LOCATION_TAPPED");
        AnonymousClass229.A01(userSession).A1Y(C81X.A03);
        if (C18U.A06(C06090Tz.A05, userSession, 36322431048100079L)) {
            AbstractC69933Cc.A01();
            N5Z A00 = N5Z.A00(location, "POST", null, j, true, true);
            C189448aO A0X = AbstractC31177DnL.A0X(userSession, true);
            A0X.A03 = 0.9f;
            A0X.A1E = true;
            AbstractC59962oe abstractC59962oe = this.A05;
            AbstractC31172DnG.A1L(abstractC59962oe, A0X, 2131973220);
            C14360o3.A0C(A00, "null cannot be cast to non-null type com.instagram.ui.bottomsheet.BottomSheetDelegate");
            A0X.A0T = A00;
            AbstractC31177DnL.A14(abstractC59962oe, A00, A0X);
            return;
        }
        C50695MZq.A00(userSession, new NL2(location, j));
    }
}
