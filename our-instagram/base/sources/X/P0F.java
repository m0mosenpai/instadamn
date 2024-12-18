package X;

import android.content.DialogInterface;
import android.content.Intent;
import android.location.Location;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.api.schemas.BrandedContentGatingInfo;
import com.instagram.api.schemas.BrandedContentProjectMetadata;
import com.instagram.api.schemas.UserMonetizationProductType;
import com.instagram.api.schemas.VisualSearchSuggestedProductContainer;
import com.instagram.clips.model.metadata.ClipsFanClubMetadata;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgSimpleImageView;
import com.instagram.creation.publishscreen.fragment.clips.ClipsProfileVisibilityFragment;
import com.instagram.creation.sharesheet.rowitems.model.PublishScreenCategoryType;
import com.instagram.modal.ModalActivity;
import com.instagram.model.fundraiser.NewFundraiserInfo;
import com.instagram.model.shopping.video.ShoppingCreationConfig;
import com.instagram.pendingmedia.model.BrandedContentTag;
import com.instagram.pendingmedia.model.ClipInfo;
import com.instagram.shopping.model.taggingfeed.TaggingFeedMultiSelectState;
import com.instagram.tagging.api.model.MediaSuggestedProductTag;
import com.instagram.user.model.Product;
import com.instagram.user.model.UpcomingEvent;
import com.instagram.user.model.UpcomingEventImpl;
import com.instagram.user.model.User;
import com.instagram.wellbeing.fundraiser.model.ExistingStandaloneFundraiserForFeedModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes9.dex */
public final class P0F implements InterfaceC58310Pt2 {
    public final UserSession A00;
    public final C50991Mfy A01;
    public final NJR A02;
    public final FragmentActivity A03;
    public final C44475Jlh A04;
    public final InterfaceC11380iw A05;
    public final O7X A06;
    public final C54970OTc A07;
    public final C54816OKr A08;

    public P0F(FragmentActivity fragmentActivity, C44475Jlh c44475Jlh, InterfaceC11380iw interfaceC11380iw, UserSession userSession, O7X o7x, C50991Mfy c50991Mfy, C54970OTc c54970OTc, NJR njr, C54816OKr c54816OKr) {
        C14360o3.A0B(userSession, 2);
        AbstractC25234BEr.A0k(4, c44475Jlh, c50991Mfy, c54970OTc, o7x);
        C14360o3.A0B(interfaceC11380iw, 9);
        this.A03 = fragmentActivity;
        this.A00 = userSession;
        this.A02 = njr;
        this.A04 = c44475Jlh;
        this.A01 = c50991Mfy;
        this.A07 = c54970OTc;
        this.A06 = o7x;
        this.A08 = c54816OKr;
        this.A05 = interfaceC11380iw;
    }

    @Override // X.InterfaceC58310Pt2
    public final void CoZ(IgSimpleImageView igSimpleImageView) {
        C14360o3.A0B(igSimpleImageView, 0);
        C54970OTc c54970OTc = this.A07;
        if (!c54970OTc.A00) {
            UserSession userSession = c54970OTc.A01;
            C23031Ai A00 = AbstractC23021Ah.A00(userSession);
            InterfaceC16530ry interfaceC16530ry = A00.A7i;
            C0YR[] c0yrArr = C23031Ai.A8c;
            if (!AbstractC167017dG.A1b(A00, interfaceC16530ry, c0yrArr, 182)) {
                C23031Ai A002 = AbstractC23021Ah.A00(userSession);
                AbstractC167007dF.A1L(A002, A002.A7i, c0yrArr, 182, true);
                c54970OTc.A00 = true;
                C54970OTc.A00(igSimpleImageView, c54970OTc, null, EnumC58132lV.A02, AbstractC166997dE.A0q(igSimpleImageView.getResources(), 2131955277));
            }
        }
    }

    @Override // X.InterfaceC58310Pt2
    public final void Cod(View view) {
        C14360o3.A0B(view, 0);
        if (this.A02.A0U.A07) {
            C54970OTc c54970OTc = this.A07;
            if (!c54970OTc.A00) {
                c54970OTc.A00 = true;
                C54970OTc.A00(view, c54970OTc, null, EnumC58132lV.A02, AbstractC166997dE.A0q(view.getResources(), 2131955369));
            }
        }
    }

    @Override // X.InterfaceC58310Pt2
    public final boolean Col() {
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:13:? A[RETURN, SYNTHETIC] */
    @Override // X.InterfaceC58310Pt2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Con(com.instagram.common.ui.base.IgSimpleImageView r9, int r10) {
        /*
            r8 = this;
            r0 = 0
            X.C14360o3.A0B(r9, r0)
            X.OTc r5 = r8.A07
            X.NJR r0 = r8.A02
            X.NK1 r0 = r0.A0U
            boolean r2 = r0.A05
            boolean r1 = r0.A06
            boolean r0 = r5.A00
            if (r0 != 0) goto L47
            if (r2 == 0) goto L47
            r4 = 0
            r3 = 1
            if (r1 == 0) goto L48
            com.instagram.common.session.UserSession r7 = r5.A01
            X.1Ai r1 = X.AbstractC23021Ah.A00(r7)
            X.0ry r0 = r1.A2h
            X.0YR[] r6 = X.C23031Ai.A8c
            r2 = 427(0x1ab, float:5.98E-43)
            boolean r0 = X.AbstractC167017dG.A1b(r1, r0, r6, r2)
            if (r0 != 0) goto L48
            X.1Ai r1 = X.AbstractC23021Ah.A00(r7)
            X.0ry r0 = r1.A2h
            X.AbstractC167007dF.A1L(r1, r0, r6, r2, r3)
            android.content.res.Resources r1 = r9.getResources()
            r0 = 2131964676(0x7f133304, float:1.956614E38)
            java.lang.String r1 = X.AbstractC43594JPz.A0t(r1, r10, r0)
        L3e:
            if (r1 == 0) goto L47
            r5.A00 = r3
            X.2lV r0 = X.EnumC58132lV.A02
            X.C54970OTc.A00(r9, r5, r4, r0, r1)
        L47:
            return
        L48:
            com.instagram.common.session.UserSession r7 = r5.A01
            X.1Ai r1 = X.AbstractC23021Ah.A00(r7)
            X.0ry r0 = r1.A2d
            X.0YR[] r6 = X.C23031Ai.A8c
            r2 = 425(0x1a9, float:5.96E-43)
            boolean r0 = X.AbstractC167017dG.A1b(r1, r0, r6, r2)
            if (r0 != 0) goto L6f
            X.1Ai r1 = X.AbstractC23021Ah.A00(r7)
            X.0ry r0 = r1.A2d
            X.AbstractC167007dF.A1L(r1, r0, r6, r2, r3)
            android.content.res.Resources r1 = r9.getResources()
            r0 = 2131964675(0x7f133303, float:1.9566138E38)
        L6a:
            java.lang.String r1 = r1.getString(r0)
            goto L3e
        L6f:
            if (r10 != 0) goto L47
            X.1Ai r1 = X.AbstractC23021Ah.A00(r7)
            X.0ry r0 = r1.A2g
            r2 = 426(0x1aa, float:5.97E-43)
            boolean r0 = X.AbstractC167017dG.A1b(r1, r0, r6, r2)
            if (r0 != 0) goto L47
            X.1Ai r1 = X.AbstractC23021Ah.A00(r7)
            X.0ry r0 = r1.A2g
            X.AbstractC167007dF.A1L(r1, r0, r6, r2, r3)
            android.content.res.Resources r1 = r9.getResources()
            r0 = 2131969939(0x7f134793, float:1.9576815E38)
            goto L6a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.P0F.Con(com.instagram.common.ui.base.IgSimpleImageView, int):void");
    }

    @Override // X.InterfaceC58310Pt2
    public final void Cp5(boolean z) {
    }

    @Override // X.InterfaceC58310Pt2
    public final void Cp8() {
    }

    @Override // X.InterfaceC58310Pt2
    public final void CvP(AbstractC59962oe abstractC59962oe) {
        EnumC76383bi enumC76383bi;
        C47Z c47z = this.A02.A02;
        if (c47z != null) {
            enumC76383bi = c47z.A1F;
        } else {
            enumC76383bi = null;
        }
        if (enumC76383bi != EnumC76383bi.A04 && enumC76383bi != EnumC76383bi.A0C) {
            AbstractC55224Oeq.A0B(this.A03, this.A00, "REELS", false);
        } else {
            A01(abstractC59962oe, enumC76383bi);
        }
    }

    @Override // X.InterfaceC58310Pt2
    public final void Cw1(C50821Mcw c50821Mcw) {
        C54970OTc c54970OTc = this.A07;
        IgSimpleImageView igSimpleImageView = c50821Mcw.A0B;
        C14360o3.A0B(igSimpleImageView, 0);
        if (!c54970OTc.A00) {
            UserSession userSession = c54970OTc.A01;
            if (C151866sW.A02(userSession, true) != C05F.A0C) {
                C23031Ai A00 = AbstractC23021Ah.A00(userSession);
                InterfaceC16530ry interfaceC16530ry = A00.A2w;
                C0YR[] c0yrArr = C23031Ai.A8c;
                if (!AbstractC167017dG.A1b(A00, interfaceC16530ry, c0yrArr, 153)) {
                    C23031Ai A002 = AbstractC23021Ah.A00(userSession);
                    AbstractC167007dF.A1L(A002, A002.A2w, c0yrArr, 153, true);
                    c54970OTc.A00 = true;
                    C54970OTc.A00(igSimpleImageView, c54970OTc, null, EnumC58132lV.A02, AbstractC166997dE.A0q(igSimpleImageView.getResources(), 2131956783));
                }
            }
        }
        UserSession userSession2 = this.A00;
        AnonymousClass229.A01(userSession2).A15(EnumC114925Hg.CLIPS, C81X.A0A);
        C28221Yb A003 = C27S.A00();
        C56128Ovo c56128Ovo = (C56128Ovo) userSession2.A01(C56128Ovo.class, new C57258Pbg(null, userSession2, 41));
        if (A003.A03().A02(userSession2)) {
            UserSession userSession3 = c56128Ovo.A00;
            OIK oik = new OIK(userSession3, AbstractC40691uc.A01(userSession3), c56128Ovo.A01);
            AbstractC166987dD.A1Z(new MCD(oik, null, 46), AbstractC167017dG.A0w(C12L.A00, 909209444));
        }
    }

    @Override // X.InterfaceC58310Pt2
    public final void CyO(List list, long j) {
    }

    @Override // X.InterfaceC58310Pt2
    public final void D0M(AbstractC59962oe abstractC59962oe) {
        NJR njr = this.A02;
        C47Z c47z = njr.A02;
        if (c47z != null) {
            if (njr.A0O.A02 != null) {
                C193328hC A0O = AbstractC31175DnJ.A0O(abstractC59962oe);
                A0O.A0A(2131963876);
                int i = 2131963874;
                if (AbstractC63302u8.A00(this.A00).A04(UserMonetizationProductType.A0E)) {
                    i = 2131963875;
                }
                A0O.A09(i);
                AbstractC31176DnK.A1W(A0O);
                return;
            }
            FragmentActivity fragmentActivity = this.A03;
            UserSession userSession = this.A00;
            C140966Yy A0r = AbstractC25225BEi.A0r(fragmentActivity, userSession);
            List list = c47z.A4C;
            if (list == null) {
                list = C16930sl.A00;
            }
            BrandedContentProjectMetadata brandedContentProjectMetadata = c47z.A0t;
            A0r.A0D(AbstractC54944ORu.A00(c47z.A0s, brandedContentProjectMetadata, userSession, c47z.A3t, "reel", list, false, false, false, false, c47z.A5i));
            A0r.A04();
            LL0.A02(this.A05, userSession, C05F.A0H, C05F.A1F, LB9.A00(userSession));
        }
    }

    @Override // X.InterfaceC58310Pt2
    public final void DGO(C82G c82g, AbstractC59962oe abstractC59962oe) {
        C14360o3.A0B(c82g, 1);
        C55052Oa3.A00(c82g, abstractC59962oe, this.A00, null, "com.bloks.www.ig.reel.xpost.migration_v_three_upsell_launcher");
    }

    @Override // X.InterfaceC58310Pt2
    public final void DMx(boolean z) {
    }

    @Override // X.InterfaceC58310Pt2
    public final void DWh(String str) {
    }

    @Override // X.InterfaceC58310Pt2
    public final void DWj(boolean z) {
    }

    @Override // X.InterfaceC58178Pqi
    public final void DWu(InterfaceC58087PpC interfaceC58087PpC, UpcomingEvent upcomingEvent) {
        C14360o3.A0B(interfaceC58087PpC, 0);
        O7X o7x = this.A06;
        AbstractC69933Cc.A01();
        EnumC53233NgW enumC53233NgW = EnumC53233NgW.A03;
        N6R n6r = new N6R();
        Bundle A0b = AbstractC166987dD.A0b();
        A0b.putSerializable("prior_surface", enumC53233NgW);
        A0b.putParcelable("initial_upcoming_event", upcomingEvent);
        n6r.A06 = interfaceC58087PpC;
        n6r.setArguments(A0b);
        AbstractC31177DnL.A16(n6r, o7x.A00, o7x.A01);
    }

    @Override // X.InterfaceC58178Pqi
    public final void DWv(InterfaceC58087PpC interfaceC58087PpC, List list) {
        C14360o3.A0B(interfaceC58087PpC, 0);
        O7X o7x = this.A06;
        AbstractC69933Cc.A01();
        EnumC53233NgW enumC53233NgW = EnumC53233NgW.A03;
        C52124N4x c52124N4x = new C52124N4x();
        c52124N4x.A01 = interfaceC58087PpC;
        Bundle A0b = AbstractC166987dD.A0b();
        A0b.putSerializable("prior_surface", enumC53233NgW);
        A0b.putStringArrayList("upcoming_event_ids", AbstractC166987dD.A1F(list));
        c52124N4x.setArguments(A0b);
        AbstractC31177DnL.A16(c52124N4x, o7x.A00, o7x.A01);
    }

    @Override // X.InterfaceC58178Pqi
    public final void Dwt() {
    }

    @Override // X.InterfaceC58310Pt2
    public final void E2B(boolean z) {
    }

    @Override // X.InterfaceC58310Pt2
    public final void E2h(C54400O2g c54400O2g) {
        C14360o3.A0B(c54400O2g, 0);
        AnonymousClass229.A01(this.A00).A1Y(C81X.A1N);
        O7X o7x = this.A06;
        UserSession userSession = o7x.A01;
        O7Z A00 = AbstractC53937NtA.A00(userSession);
        A00.A01.flowMarkPoint(A00.A00, "LINK_HIGHLIGHTS_LIST_ENTERED");
        AbstractC69933Cc.A01();
        N7H n7h = new N7H();
        Bundle A05 = AbstractC31178DnM.A05(userSession);
        A05.putBoolean("uses_creation_state_machine", false);
        n7h.A00 = c54400O2g;
        n7h.setArguments(A05);
        AbstractC31177DnL.A16(n7h, o7x.A00, userSession);
    }

    @Override // X.InterfaceC58310Pt2
    public final void Ekv(C130135uJ c130135uJ, String str, String str2, boolean z) {
    }

    @Override // X.InterfaceC58310Pt2
    public final void ElP(View view, String str) {
        boolean A1R = AbstractC167007dF.A1R(0, view, str);
        C54970OTc c54970OTc = this.A07;
        UserSession userSession = c54970OTc.A01;
        C46552Bt A00 = AbstractC46542Bs.A00(userSession);
        if (C200108tF.A01.A0F(userSession)) {
            InterfaceC19630xq interfaceC19630xq = A00.A04;
            if (interfaceC19630xq.getBoolean("PREFERENCE_Always_Show_Panavision_CCP_Nux", false) || !interfaceC19630xq.getBoolean("PREFERENCE_HAS_SEEN_SHARE_TO_FACEBOOK_TOOLTIP_ON_PANAVISION_M15", false)) {
                if (C197838ou.A03(C82G.A0N, C82H.A10, userSession)) {
                    c54970OTc.A00 = A1R;
                    view.postDelayed(new PTF(view, c54970OTc, A00, str), 400L);
                }
            }
        }
    }

    @Override // X.InterfaceC58310Pt2
    public final void ElY(C65782Tu0 c65782Tu0, InterfaceC16820sZ interfaceC16820sZ) {
        int i;
        DialogInterface.OnClickListener A00;
        C14360o3.A0B(c65782Tu0, 0);
        C193328hC A0H = AbstractC31171DnF.A0H(this.A03);
        A0H.A0A(c65782Tu0.A02);
        A0H.A09(c65782Tu0.A01);
        Number number = (Number) c65782Tu0.A05;
        if (number != null) {
            i = number.intValue();
            A00 = new DialogInterfaceOnClickListenerC48023LMs(c65782Tu0, 18);
        } else {
            i = 2131968948;
            A00 = DialogInterfaceOnClickListenerC55319Ogh.A00(interfaceC16820sZ, 40);
        }
        A0H.A0J(A00, i);
        Number number2 = (Number) c65782Tu0.A03;
        if (number2 != null) {
            A0H.A0I(null, number2.intValue());
        }
        AbstractC166987dD.A1W(A0H);
    }

    public static Bundle A00(E72 e72, String str) {
        Bundle bundle = new Bundle();
        bundle.putString("clips_share_sheet_draft_info_session_id", str);
        if (e72 != null) {
            bundle.putBoolean("clips_is_voice_translations_on", e72.A01);
            bundle.putBoolean("clips_is_lip_sync_on", e72.A02);
            bundle.putInt("clips_selected_languages_count", ((List) e72.A00).size());
        }
        return bundle;
    }

    private final void A01(AbstractC59962oe abstractC59962oe, EnumC76383bi enumC76383bi) {
        C193328hC A0O;
        int i;
        if (enumC76383bi == EnumC76383bi.A04) {
            A0O = AbstractC31175DnJ.A0O(abstractC59962oe);
            A0O.A0A(2131953265);
            i = 2131953264;
        } else {
            if (enumC76383bi != EnumC76383bi.A0C || !AbstractC151756sL.A01() || !AbstractC151756sL.A00().A05(this.A00)) {
                return;
            }
            A0O = AbstractC31175DnJ.A0O(abstractC59962oe);
            MSX.A0t();
            A0O.A0A(2131969042);
            MSX.A0t();
            i = 2131969041;
        }
        A0O.A09(i);
        AbstractC31176DnK.A1W(A0O);
    }

    private final void A02(AbstractC59962oe abstractC59962oe, ShoppingCreationConfig shoppingCreationConfig) {
        String str;
        String str2;
        ArrayList A0q;
        User user;
        String A00;
        BrandedContentTag A07;
        BrandedContentTag A072;
        long size;
        NJR njr = this.A02;
        C47Z c47z = njr.A02;
        if (c47z != null) {
            UserSession userSession = this.A00;
            String str3 = njr.A0k;
            C38686GzR c38686GzR = c47z.A0q;
            InterfaceC11380iw interfaceC11380iw = this.A05;
            if (AbstractC199308rX.A03(userSession)) {
                if (c38686GzR == null) {
                    size = 0;
                } else {
                    size = AbstractC55225Oes.A04(c38686GzR).size();
                }
                InterfaceC02590Ai A01 = AbstractC55216Oef.A01(AbstractC12220kQ.A01(interfaceC11380iw, userSession), userSession, "ig_suggested_tags_open_tagging", str3);
                A01.AAP(AbstractC50635MWw.A01(), str3);
                AbstractC50522MSa.A1D(A01, userSession.userId);
                A01.AAP("user_tag_type", "seller");
                MSY.A18(A01, false);
                A01.A9K("high_confidence_suggestions_count", Long.valueOf(size));
                Long A0d = AbstractC167007dF.A0d();
                A01.A9K("medium_confidence_suggestions_count", A0d);
                A01.A9K("low_confidence_suggestions_count", A0d);
                A01.AAQ(null, "suggested_tags_info");
                A01.AAP("media_format", "reels");
                A01.Cht();
            }
            ArrayList arrayList = null;
            if (c47z.A07() != null && (A072 = c47z.A07()) != null) {
                str = A072.A01;
            } else {
                str = null;
            }
            if (c47z.A07() != null && (A07 = c47z.A07()) != null) {
                str2 = A07.A02;
            } else {
                str2 = null;
            }
            I6K.A00(userSession).A05(str3, interfaceC11380iw.getModuleName(), AbstractC166987dD.A10(userSession).A1u(), "reels");
            TaggingFeedMultiSelectState taggingFeedMultiSelectState = njr.A0V.A02;
            if (C18U.A06(C06090Tz.A05, userSession, 36319849772752589L)) {
                O7X o7x = this.A06;
                String str4 = c47z.A35;
                C14360o3.A0B(str4, 0);
                UserSession userSession2 = o7x.A01;
                N5Q n5q = new N5Q();
                Bundle A08 = MSX.A08(userSession2);
                A08.putString("ClipsConstants.ARG_CLIPS_SHARE_SHEET_PENDING_MEDIA_KEY", str4);
                A08.putString("ClipsConstants.ARG_CLIPS_SHARE_SHEET_WATERFALL_ID", str3);
                A08.putString("ClipsConstants.ARG_CLIPS_SHARE_SHEET_BRANDED_CONTENT_TAG_USER_ID", str);
                A08.putString("ClipsConstants.ARG_CLIPS_SHARE_SHEET_BRANDED_CONTENT_TAG_USERNAME", str2);
                A08.putParcelable("ClipsConstants.ARG_CLIPS_SHARE_SHEET_SHOPPING_CREATION_CONFIG", shoppingCreationConfig);
                n5q.setArguments(A08);
                AbstractC31177DnL.A0w(null, n5q, o7x.A00, userSession2);
                return;
            }
            ClipInfo clipInfo = c47z.A1N;
            Long A0V = AbstractC31171DnF.A0V(clipInfo.A05 - clipInfo.A07);
            if (Ny2.A00(userSession)) {
                A0q = null;
            } else {
                List A09 = AbstractC55225Oes.A09(c47z.A43);
                A0q = AbstractC167017dG.A0q(A09);
                Iterator it = A09.iterator();
                while (it.hasNext()) {
                    A0q.add(MSZ.A0e(it).A0H);
                }
            }
            if (Ny2.A00(userSession)) {
                List A073 = AbstractC55225Oes.A07(c47z.A43);
                arrayList = AbstractC166987dD.A1E();
                Iterator it2 = A073.iterator();
                while (it2.hasNext()) {
                    Product A0e = MSZ.A0e(it2);
                    if (A0e != null && (user = A0e.A0B) != null && (A00 = AbstractC76433bn.A00(user)) != null) {
                        String str5 = A0e.A0H;
                        C14360o3.A0B(str5, 0);
                        arrayList.add(new VisualSearchSuggestedProductContainer(MSZ.A0D(A00), AbstractC25232BEp.A0t(AbstractC003100w.A0k(10, str5))));
                    }
                }
            }
            AbstractC54313NzX.A00(abstractC59962oe, userSession, c47z, taggingFeedMultiSelectState, A0V, str3, str, null, A0q, arrayList);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0075, code lost:
    
        if (r1.length() <= 0) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0098, code lost:
    
        if (X.C18U.A06(X.C06090Tz.A05, r6, 36324913539265113L) == false) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00cb, code lost:
    
        if (X.C51754Mtd.A0M(r3) == X.EnumC76383bi.A06) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00f8, code lost:
    
        if (r1.A01 != true) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0017, code lost:
    
        if (X.MSZ.A1W(r6) != false) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0118, code lost:
    
        if (r3.A04().A09 == com.instagram.api.schemas.MediaGenAIDetectionMethod.A08) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x012e, code lost:
    
        if (r1.A5O != true) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x013f, code lost:
    
        if (r3.A04().A0K != null) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0028, code lost:
    
        if (r1.A5t != true) goto L11;
     */
    @Override // X.InterfaceC58310Pt2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.instagram.business.scheduling.model.NonSupportedContentSchedulingFeatures CD1() {
        /*
            Method dump skipped, instructions count: 329
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.P0F.CD1():com.instagram.business.scheduling.model.NonSupportedContentSchedulingFeatures");
    }

    @Override // X.InterfaceC58310Pt2
    public final void Clh(String str) {
        UserSession userSession = this.A00;
        AnonymousClass229.A01(userSession).A1Y(C81X.A0r);
        InterfaceC11380iw interfaceC11380iw = this.A05;
        MYO A02 = C55183Odo.A02(this.A02.A02);
        C14360o3.A0B(A02, 2);
        C448724r c448724r = AnonymousClass229.A01(userSession).A0F;
        InterfaceC02590Ai A0M = MSZ.A0M(c448724r);
        if (A0M.isSampled()) {
            MSW.A1N(C81X.A12, A0M);
            AbstractC166987dD.A1S(A0M, AbstractC50522MSa.A0i(A0M, c448724r, "IG_CAMERA_CLIPS_FUNDED_CONTENT_SELECTION"));
            AbstractC50522MSa.A16(C22P.A0h, A0M, 2);
            MSZ.A1A(EnumC50631MWs.A0I, A0M);
            MSZ.A1B(A02, A0M, "media_source");
            AbstractC31175DnJ.A14(A0M, interfaceC11380iw);
            A0M.AAP("dialog_selection", str);
            AbstractC167017dG.A1C(A0M);
        }
    }

    @Override // X.InterfaceC58310Pt2
    public final void Coh(String str) {
        C54632OBh c54632OBh;
        C50627MWo c50627MWo;
        C54632OBh c54632OBh2;
        NK8 nk8 = this.A02.A0O;
        C50627MWo c50627MWo2 = nk8.A04().A03;
        C65782Tu0 c65782Tu0 = null;
        if (c50627MWo2 != null && (c54632OBh = (C54632OBh) c50627MWo2.A01) != null && !c54632OBh.A02.isEmpty() && (c50627MWo = nk8.A04().A03) != null && (c54632OBh2 = (C54632OBh) c50627MWo.A01) != null && c54632OBh2.A01 != null) {
            c65782Tu0 = new C65782Tu0(2131963886, 2131963887);
        }
        if (c65782Tu0 != null) {
            ElY(c65782Tu0, null);
            return;
        }
        Clh(null);
        O7X o7x = this.A06;
        AbstractC69933Cc.A01();
        UserSession userSession = o7x.A01;
        Bundle A05 = AbstractC31178DnM.A05(userSession);
        A05.putString("ClipsConstants.ARG_CLIPS_FUNDED_CONTENT_DEAL_ID", str);
        A05.putBoolean("ClipsConstants.ARG_CLIPS_SHOULD_SHOW_BONUSES_DEAL", false);
        FragmentActivity fragmentActivity = o7x.A00;
        AbstractC31171DnF.A0L(fragmentActivity, A05, userSession, ModalActivity.class, AbstractC111324zv.A00(2985)).A0A(fragmentActivity, 97);
    }

    @Override // X.InterfaceC58310Pt2
    public final void Cvb(AbstractC59962oe abstractC59962oe, User user) {
        EnumC76383bi enumC76383bi;
        C47Z c47z = this.A02.A02;
        if (c47z != null) {
            enumC76383bi = c47z.A1F;
        } else {
            enumC76383bi = null;
        }
        if (enumC76383bi != EnumC76383bi.A04 && enumC76383bi != EnumC76383bi.A0C) {
            String id = user.getId();
            String AnC = user.A03.AnC();
            UserSession userSession = this.A00;
            C06090Tz c06090Tz = C06090Tz.A06;
            String A04 = C18U.A04(c06090Tz, userSession, 36881051674542449L);
            int A07 = AbstractC25225BEi.A07(c06090Tz, userSession, 36599576697769572L);
            FBT(new NewFundraiserInfo(id, A04, user.B8y(), "", null, AnC, null, "ONBOARDED", AbstractC166987dD.A1E(), A07, C18U.A06(c06090Tz, userSession, 36318101721192329L)));
            return;
        }
        A01(abstractC59962oe, enumC76383bi);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x005a, code lost:
    
        if (X.C18U.A06(X.C06090Tz.A06, r5.A01, 36319076678769575L) == false) goto L16;
     */
    @Override // X.InterfaceC58310Pt2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Cw0(X.AbstractC59962oe r19) {
        /*
            r18 = this;
            r16 = 0
            r4 = r18
            X.NJR r3 = r4.A02
            X.47Z r2 = r3.A02
            if (r2 == 0) goto L9f
            X.5qm r0 = X.NJR.A03(r3)
            if (r0 == 0) goto L9f
            X.MYO r1 = X.C55183Odo.A02(r2)
            X.MYO r0 = X.MYO.CAPTURE
            boolean r1 = X.AbstractC167007dF.A1X(r1, r0)
            X.GzR r0 = r2.A0q
            r12 = 0
            if (r0 == 0) goto La0
            java.lang.String r11 = r0.A02
        L21:
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r1)
            boolean r14 = r2.A5i
            java.util.List r13 = r2.A4C
            if (r13 != 0) goto L2f
            java.util.ArrayList r13 = X.AbstractC166987dD.A1E()
        L2f:
            com.instagram.api.schemas.BrandedContentProjectMetadata r9 = r2.A0t
            com.instagram.api.schemas.BrandedContentGatingInfo r8 = r2.A0s
            com.instagram.common.session.UserSession r2 = r4.A00
            android.content.Context r1 = r19.requireContext()
            com.instagram.monetization.repository.MonetizationRepository r0 = X.AbstractC63302u8.A00(r2)
            X.OKo r5 = new X.OKo
            r5.<init>(r1, r2, r0)
            com.instagram.monetization.repository.MonetizationRepository r1 = r5.A02
            com.instagram.api.schemas.UserMonetizationProductType r0 = com.instagram.api.schemas.UserMonetizationProductType.A0D
            boolean r0 = r1.A03(r0)
            if (r0 == 0) goto L5c
            com.instagram.common.session.UserSession r6 = r5.A01
            X.0Tz r5 = X.C06090Tz.A06
            r0 = 36319076678769575(0x81080200021ba7, double:3.031668564612654E-306)
            boolean r0 = X.C18U.A06(r5, r6, r0)
            r15 = 1
            if (r0 != 0) goto L5d
        L5c:
            r15 = 0
        L5d:
            boolean r0 = r3.A0l
            com.instagram.creation.sharesheet.advancedsettings.config.ClipsAdvancedSettingsConfig r7 = new com.instagram.creation.sharesheet.advancedsettings.config.ClipsAdvancedSettingsConfig
            r17 = r0
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            X.O7Z r0 = X.AbstractC53937NtA.A00(r2)
            X.1QT r6 = r0.A01
            long r0 = r0.A00
            java.lang.String r5 = "ADVANCED_SETTINGS_ENTERED"
            r6.flowMarkPoint(r0, r5)
            X.22C r5 = X.AnonymousClass229.A01(r2)
            X.81X r1 = X.C81X.A0A
            X.NjV r0 = X.EnumC53380NjV.A05
            r5.A1C(r0, r1)
            android.os.Bundle r5 = r19.requireArguments()
            java.lang.String r1 = r3.A0k
            java.lang.String r0 = "ClipsConstants.ARG_CLIPS_ADVANCED_SETTINGS"
            r5.putParcelable(r0, r7)
            java.lang.String r0 = "ClipsConstants.ARGS_WATERFALL_ID"
            r5.putString(r0, r1)
            X.N5M r1 = new X.N5M
            r1.<init>()
            r1.setArguments(r5)
            androidx.fragment.app.FragmentActivity r0 = r4.A03
            X.6Yy r0 = X.AbstractC25225BEi.A0r(r0, r2)
            X.AbstractC31175DnJ.A0s(r12, r1, r0)
        L9f:
            return
        La0:
            r11 = r12
            goto L21
        */
        throw new UnsupportedOperationException("Method not decompiled: X.P0F.Cw0(X.2oe):void");
    }

    @Override // X.InterfaceC58310Pt2
    public final void Cxf() {
        UserSession userSession = this.A00;
        AnonymousClass229.A01(userSession).A1o(this.A05.getModuleName());
        AnonymousClass229.A01(userSession).A1C(EnumC53380NjV.A07, C81X.A0Q);
        if (this.A02.A02 != null) {
            N7G n7g = new N7G();
            C189448aO A0W = AbstractC31174DnI.A0W(MSX.A08(userSession), n7g, userSession);
            A0W.A0T = n7g;
            FragmentActivity fragmentActivity = this.A03;
            AbstractC25226BEj.A1M(fragmentActivity, A0W, 2131955273);
            AbstractC25225BEi.A1Q(A0W, false);
            C56766PHj.A00(A0W, this, 4);
            C189478aR A00 = A0W.A00();
            A00.A02(fragmentActivity, n7g);
            n7g.A03 = A00;
            C52367NFg c52367NFg = n7g.A01;
            if (c52367NFg != null) {
                c52367NFg.A01 = A00;
            }
        }
    }

    @Override // X.InterfaceC58310Pt2
    public final void CyF() {
        Fragment n5s;
        C128175qm A03 = NJR.A03(this.A02);
        if (A03 != null) {
            FragmentActivity fragmentActivity = this.A03;
            UserSession userSession = this.A00;
            C140966Yy A0P = AbstractC31173DnH.A0P(fragmentActivity, userSession);
            String str = A03.A0T;
            E72 e72 = A03.A03;
            if (C18U.A06(AbstractC166997dE.A0U(str), userSession, 36323092474047436L)) {
                new N47().setArguments(A00(e72, str));
                n5s = new N47();
            } else {
                Bundle A00 = A00(e72, str);
                n5s = new N5S();
                n5s.setArguments(A00);
            }
            A0P.A0D(n5s);
            A0P.A04();
        }
    }

    @Override // X.InterfaceC58310Pt2
    public final void D3F(AbstractC59962oe abstractC59962oe) {
        C128175qm A03 = NJR.A03(this.A02);
        if (A03 != null) {
            AnonymousClass229.A01(this.A00).A1Z(C81X.A02);
            if (A03.A0R != null) {
                FBT(null);
                FB6(null);
                return;
            }
            C193328hC A0O = AbstractC31175DnJ.A0O(abstractC59962oe);
            A0O.A0A(2131972258);
            A0O.A09(2131972256);
            A0O.A0L(DialogInterfaceOnClickListenerC55319Ogh.A00(this, 39), 2131972248);
            A0O.A06();
            AbstractC166987dD.A1W(A0O);
        }
    }

    @Override // X.InterfaceC58310Pt2
    public final void DCl(NewFundraiserInfo newFundraiserInfo) {
        String str = newFundraiserInfo.A01;
        if (str != null) {
            UserSession userSession = this.A00;
            if (C18U.A06(C06090Tz.A05, userSession, 36317448886031533L)) {
                AbstractC55215Oed.A08(this.A05, userSession, "draft_fundraiser_row", "REELS", null, null);
                FragmentActivity fragmentActivity = this.A03;
                String str2 = newFundraiserInfo.A07;
                AbstractC55224Oeq.A07(fragmentActivity, userSession, Integer.valueOf(newFundraiserInfo.A00), str, "REELS", str2, newFundraiserInfo.A05, newFundraiserInfo.A03, (String) AbstractC166987dD.A17(this.A02.A0P.A02), newFundraiserInfo.A08);
            }
        }
    }

    @Override // X.InterfaceC58310Pt2
    public final void DPB(AbstractC59962oe abstractC59962oe, boolean z, boolean z2) {
        C81X c81x;
        UserSession userSession = this.A00;
        AnonymousClass229.A01(userSession).A1W(EnumC50631MWs.A0L, abstractC59962oe.getModuleName(), "SHARE_TO_FACEBOOK", true, C200108tF.A06(userSession));
        C22C A01 = AnonymousClass229.A01(userSession);
        if (z) {
            c81x = C81X.A2F;
        } else {
            c81x = C81X.A2E;
        }
        A01.A1C(EnumC53380NjV.A0I, c81x);
        NJR njr = this.A02;
        NKM nkm = njr.A0i;
        if (nkm.A04().A08 != null && !MSZ.A1W(nkm.A01)) {
            ElY(new C65782Tu0(2131961932, 2131961968), null);
            return;
        }
        OXw.A01(abstractC59962oe.requireContext(), userSession, MSX.A0Z(z2 ? 1 : 0), C05F.A01, C180377zR.A00(userSession), AbstractC166997dE.A0t(userSession), z, njr.A0l);
    }

    @Override // X.InterfaceC58310Pt2
    public final void DXm() {
        Fragment n5x;
        C47Z c47z = this.A02.A02;
        if (c47z != null) {
            UserSession userSession = this.A00;
            boolean A01 = LB9.A01(userSession);
            C140966Yy A00 = FT2.A00(this.A03, userSession);
            if (A01) {
                List list = c47z.A4C;
                if (list == null) {
                    list = AbstractC166987dD.A1E();
                }
                BrandedContentProjectMetadata brandedContentProjectMetadata = c47z.A0t;
                n5x = AbstractC55149OdC.A04(c47z.A0s, brandedContentProjectMetadata, "reel", c47z.A3t, list, false, false, c47z.A5i, false, false, false, true, c47z.A51);
            } else {
                boolean z = c47z.A51;
                List list2 = c47z.A4C;
                if (list2 == null) {
                    list2 = AbstractC166987dD.A1E();
                }
                BrandedContentProjectMetadata brandedContentProjectMetadata2 = c47z.A0t;
                BrandedContentGatingInfo brandedContentGatingInfo = c47z.A0s;
                boolean z2 = c47z.A5i;
                String str = c47z.A3t;
                boolean A1V = AbstractC167007dF.A1V(list2);
                n5x = new N5X();
                n5x.setArguments(AbstractC55149OdC.A00(brandedContentGatingInfo, brandedContentProjectMetadata2, "reel", str, list2, z, A1V, z2));
            }
            A00.A0D(n5x);
            A00.A04();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x007d, code lost:
    
        if (r7 != false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x008f, code lost:
    
        if (r6.A00 == null) goto L32;
     */
    @Override // X.InterfaceC58310Pt2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void DY6() {
        /*
            r32 = this;
            r8 = r32
            X.NJR r10 = r8.A02
            X.47Z r0 = r10.A02
            X.5qm r7 = X.NJR.A03(r10)
            if (r0 == 0) goto Lc8
            if (r7 == 0) goto Lc8
            com.instagram.common.session.UserSession r9 = r8.A00
            X.O7Z r1 = X.AbstractC53937NtA.A00(r9)
            X.1QT r4 = r1.A01
            long r1 = r1.A00
            java.lang.String r3 = "PEOPLE_TAGGING_ENTERED"
            r4.flowMarkPoint(r1, r3)
            java.lang.String r5 = r0.A2X
            if (r5 != 0) goto L23
            java.lang.String r5 = ""
        L23:
            X.0iw r1 = r8.A05
            java.lang.String r1 = r1.getModuleName()
            X.22P r11 = X.C22P.A0h
            X.OOQ.A00(r11, r9, r1)
            X.22C r1 = X.AnonymousClass229.A01(r9)
            X.81X r6 = X.C81X.A2e
            X.NjV r3 = X.EnumC53380NjV.A0L
            java.lang.String r2 = "IG_CAMERA_TAG_PEOPLE_TAP"
            r4 = 1
            X.24r r1 = r1.A0F
            r1.A0V(r3, r6, r2, r4)
            X.22C r1 = X.AnonymousClass229.A01(r9)
            r1.A0j()
            X.O7X r3 = r8.A06
            java.util.List r2 = r7.A0q
            if (r2 != 0) goto L4d
            X.0sl r2 = X.C16930sl.A00
        L4d:
            java.lang.String r9 = r7.A0U
            java.util.List r1 = r7.A0n
            if (r1 != 0) goto L55
            X.0sl r1 = X.C16930sl.A00
        L55:
            X.3bi r14 = r7.A0K
            if (r14 != 0) goto L5b
            X.3bi r14 = X.EnumC76383bi.A06
        L5b:
            java.lang.String r6 = r7.A0W
            r8 = 0
            if (r6 == 0) goto Lc9
            X.22P r12 = X.C22P.valueOf(r6)
        L64:
            com.instagram.music.common.model.AudioOverlayTrack r6 = r7.A0N
            if (r6 == 0) goto L6a
            java.lang.String r8 = r6.A0B
        L6a:
            boolean r6 = r10.A0l
            r10 = r6 ^ 1
            X.Mtf r6 = r7.A02
            boolean r29 = X.AbstractC167007dF.A1W(r6)
            java.util.List r6 = r7.A0m
            if (r6 == 0) goto L7f
            boolean r7 = r6.isEmpty()
            r6 = 0
            if (r7 == 0) goto L80
        L7f:
            r6 = 1
        L80:
            r30 = r6 ^ 1
            r28 = 0
            X.AbstractC25234BEr.A0j(r4, r2, r1, r14, r5)
            X.H2v r6 = r0.A0v
            if (r6 == 0) goto L91
            java.lang.Integer r6 = r6.A00
            r27 = 1
            if (r6 != 0) goto L93
        L91:
            r27 = 0
        L93:
            com.instagram.common.session.UserSession r13 = r3.A01
            java.lang.String r7 = r0.A35
            X.3bi r6 = r0.A1F
            X.3bi r0 = X.EnumC76383bi.A07
            boolean r26 = X.AbstractC167007dF.A1X(r6, r0)
            java.lang.Boolean r15 = java.lang.Boolean.valueOf(r10)
            r6 = 0
            X.0sl r0 = X.C16930sl.A00
            X.AbstractC25229BEm.A1O(r7, r4, r0)
            r18 = r6
            r19 = r7
            r20 = r8
            r21 = r6
            r22 = r2
            r23 = r1
            r24 = r6
            r25 = r0
            r31 = r28
            r17 = r5
            r16 = r9
            X.N6M r1 = X.AbstractC53939NtC.A00(r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31)
            androidx.fragment.app.FragmentActivity r0 = r3.A00
            X.AbstractC31178DnM.A0t(r6, r1, r0, r13)
        Lc8:
            return
        Lc9:
            r12 = r8
            goto L64
        */
        throw new UnsupportedOperationException("Method not decompiled: X.P0F.DY6():void");
    }

    @Override // X.InterfaceC58310Pt2
    public final void DbZ() {
        FragmentActivity fragmentActivity;
        int i;
        C128175qm A03 = NJR.A03(this.A02);
        if (A03 != null) {
            UserSession userSession = this.A00;
            boolean z = A03.A0y;
            EnumC76383bi enumC76383bi = A03.A0K;
            ClipsProfileVisibilityFragment clipsProfileVisibilityFragment = new ClipsProfileVisibilityFragment();
            Bundle A08 = MSX.A08(userSession);
            A08.putBoolean("HIDE_FROM_PROFILE_GRID", z);
            if (enumC76383bi != null) {
                A08.putString("AUDIENCE", enumC76383bi.A00);
            }
            C189448aO A0W = AbstractC31174DnI.A0W(A08, clipsProfileVisibilityFragment, userSession);
            if (enumC76383bi == EnumC76383bi.A0C && AbstractC151756sL.A01()) {
                fragmentActivity = this.A03;
                MSX.A0t();
                i = 2131969025;
            } else {
                fragmentActivity = this.A03;
                i = 2131955692;
            }
            AbstractC25226BEj.A1M(fragmentActivity, A0W, i);
            AbstractC25225BEi.A1Q(A0W, false);
            A0W.A0U = new C36720GGp(1);
            C189478aR A00 = A0W.A00();
            A00.A02(fragmentActivity, clipsProfileVisibilityFragment);
            if (clipsProfileVisibilityFragment.isAdded()) {
                InterfaceC09390do interfaceC09390do = clipsProfileVisibilityFragment.A00;
                AbstractC31178DnM.A11(clipsProfileVisibilityFragment, new PYw(A00, null, 18), ((C50883MeE) interfaceC09390do.getValue()).A01);
                AbstractC31178DnM.A11(clipsProfileVisibilityFragment, new PYw(this, null, 19), ((C50883MeE) interfaceC09390do.getValue()).A00);
            }
        }
    }

    @Override // X.InterfaceC58310Pt2
    public final void DcT(AbstractC59962oe abstractC59962oe, PublishScreenCategoryType publishScreenCategoryType) {
        O7X o7x = this.A06;
        String moduleName = abstractC59962oe.getModuleName();
        Bundle requireArguments = abstractC59962oe.requireArguments();
        String str = this.A02.A0k;
        C14360o3.A0B(moduleName, 0);
        EnumC53117NeU enumC53117NeU = EnumC53117NeU.A02;
        requireArguments.putString("publish_screen_category_parent_module_name", moduleName);
        requireArguments.putParcelable("publish_screen_category_type", publishScreenCategoryType);
        requireArguments.putString("ClipsConstants.ARGS_WATERFALL_ID", str);
        requireArguments.putSerializable("publish_screen_type", enumC53117NeU);
        requireArguments.putBoolean("should_show_customized_action_bar", false);
        C52146N5v c52146N5v = new C52146N5v();
        c52146N5v.setArguments(requireArguments);
        AbstractC31178DnM.A0y(c52146N5v, o7x.A00, o7x.A01);
    }

    @Override // X.InterfaceC58310Pt2
    public final void DdU(AbstractC59962oe abstractC59962oe, boolean z, boolean z2) {
        C81X c81x;
        EnumC31515Dsz enumC31515Dsz;
        String str;
        int i;
        UserSession userSession = this.A00;
        C22C A01 = AnonymousClass229.A01(userSession);
        if (z) {
            c81x = C81X.A1s;
        } else {
            c81x = C81X.A1r;
        }
        A01.A1C(EnumC53380NjV.A0G, c81x);
        NJR njr = this.A02;
        NKM nkm = njr.A0i;
        UserSession userSession2 = nkm.A01;
        ClipsFanClubMetadata A00 = F19.A00(userSession2, nkm.A00, nkm.A09, nkm.A0A);
        if (A00 != null) {
            enumC31515Dsz = A00.A00;
        } else {
            enumC31515Dsz = null;
        }
        if (enumC31515Dsz == EnumC31515Dsz.A06) {
            i = 2131977058;
        } else if (C51754Mtd.A0M(nkm) == EnumC76383bi.A07) {
            i = 2131961940;
        } else if (nkm.A04().A08 != null && !MSZ.A1W(userSession2)) {
            i = 2131961931;
        } else {
            if (z2) {
                str = "SHARE_TO_FACEBOOK";
            } else {
                str = "RECOMMEND_TO_FACEBOOK";
            }
            AnonymousClass229.A01(userSession).A1W(EnumC50631MWs.A0L, this.A05.getModuleName(), str, false, AbstractC46542Bs.A00(userSession).A0C());
            OXw.A01(abstractC59962oe.requireContext(), userSession, MSX.A0Z(z2 ? 1 : 0), C05F.A00, C180377zR.A00(userSession), AbstractC166997dE.A0t(userSession), z, njr.A0l);
            return;
        }
        ElY(new C65782Tu0(i, 2131961967), null);
    }

    @Override // X.InterfaceC58310Pt2
    public final void DfE() {
        String A0p;
        C128175qm A03 = NJR.A03(this.A02);
        if (A03 == null || (A0p = A03.A0g) == null) {
            A0p = AbstractC166997dE.A0p(this.A03, 2131955765);
        }
        InterfaceC11380iw interfaceC11380iw = this.A05;
        UserSession userSession = this.A00;
        LBG.A01(interfaceC11380iw, userSession, null, null);
        AnonymousClass229.A01(userSession).A1C(EnumC53380NjV.A0H, C81X.A1u);
        O7Z A00 = AbstractC53937NtA.A00(userSession);
        A00.A01.flowMarkPoint(A00.A00, "RENAME_AUDIO_ENTERED");
        AbstractC31175DnJ.A0s(null, AbstractC46664Kkh.A00(A0p, null, null, "0", false), AbstractC25225BEi.A0r(this.A03, userSession));
    }

    @Override // X.InterfaceC58310Pt2
    public final void Dqd(AbstractC59962oe abstractC59962oe, ExistingStandaloneFundraiserForFeedModel existingStandaloneFundraiserForFeedModel) {
        EnumC76383bi enumC76383bi;
        C47Z c47z = this.A02.A02;
        if (c47z != null) {
            enumC76383bi = c47z.A1F;
        } else {
            enumC76383bi = null;
        }
        if (enumC76383bi != EnumC76383bi.A04 && enumC76383bi != EnumC76383bi.A0C) {
            FB6(existingStandaloneFundraiserForFeedModel);
        } else {
            A01(abstractC59962oe, enumC76383bi);
        }
    }

    @Override // X.InterfaceC58310Pt2
    public final void Dqh(boolean z, int i) {
        String str;
        NJR njr = this.A02;
        C47Z c47z = njr.A02;
        if (c47z != null) {
            UserSession userSession = this.A00;
            InterfaceC11380iw interfaceC11380iw = this.A05;
            String str2 = njr.A0k;
            ArrayList arrayList = c47z.A43;
            if (arrayList != null && !arrayList.isEmpty() && (str = c47z.A2g) != null) {
                AbstractC55216Oef.A06(AbstractC55216Oef.A00(arrayList), C56141Ow2.A04.A00(userSession).A00(str2, str), interfaceC11380iw, userSession, str, i, c47z.A0t(), z);
            }
        }
    }

    @Override // X.InterfaceC58310Pt2
    public final void Ds6(View view) {
        C54970OTc c54970OTc = this.A07;
        if (!c54970OTc.A00) {
            UserSession userSession = c54970OTc.A01;
            if (Ny2.A00(userSession)) {
                C23031Ai A00 = AbstractC23021Ah.A00(userSession);
                InterfaceC16530ry interfaceC16530ry = A00.A0f;
                C0YR[] c0yrArr = C23031Ai.A8c;
                if (!AbstractC167017dG.A1b(A00, interfaceC16530ry, c0yrArr, 185)) {
                    C23031Ai A002 = AbstractC23021Ah.A00(userSession);
                    AbstractC167007dF.A1L(A002, A002.A0f, c0yrArr, 185, true);
                    c54970OTc.A00 = true;
                    C54970OTc.A00(view, c54970OTc, null, EnumC58132lV.A02, AbstractC166997dE.A0q(view.getResources(), 2131975147));
                }
            }
        }
        C54816OKr c54816OKr = this.A08;
        if (c54816OKr != null) {
            UserSession userSession2 = this.A00;
            String moduleName = this.A05.getModuleName();
            C14360o3.A0B(moduleName, 2);
            AbstractC50666MYj.A00(userSession2).A0B(EnumC39584Hdu.A04, moduleName, Ny2.A00(userSession2));
            c54816OKr.A01(null);
        }
    }

    @Override // X.InterfaceC58310Pt2
    public final void Ds7(AbstractC59962oe abstractC59962oe, ShoppingCreationConfig shoppingCreationConfig) {
        int i;
        UserSession userSession = this.A00;
        String moduleName = abstractC59962oe.getModuleName();
        C14360o3.A0B(moduleName, 1);
        AbstractC50666MYj.A00(userSession).A0C(EnumC39584Hdu.A04, moduleName, Ny2.A00(userSession));
        AnonymousClass229.A01(userSession).A1C(EnumC53380NjV.A0M, C81X.A2f);
        NKH nkh = this.A02.A0V;
        if (C51754Mtd.A0M(nkh) == EnumC76383bi.A04) {
            i = 2131953921;
        } else if (nkh.A04().A08 != null) {
            i = 2131953922;
        } else {
            A02(abstractC59962oe, shoppingCreationConfig);
            return;
        }
        ElY(new C65782Tu0(i, 2131970056), null);
    }

    @Override // X.InterfaceC58310Pt2
    public final void Dwf(AbstractC59962oe abstractC59962oe, boolean z, boolean z2) {
        UserSession userSession = this.A00;
        C22C A01 = AnonymousClass229.A01(userSession);
        EnumC50631MWs enumC50631MWs = EnumC50631MWs.A0L;
        A01.A1W(enumC50631MWs, abstractC59962oe.getModuleName(), "SHARE_TO_FACEBOOK", true, C200108tF.A06(userSession));
        C22C A012 = AnonymousClass229.A01(userSession);
        A012.A0F.A0U(EnumC53380NjV.A0I, enumC50631MWs, abstractC59962oe.getModuleName());
        NKM nkm = this.A02.A0i;
        C65782Tu0 c65782Tu0 = null;
        if (nkm.A04().A08 != null && !MSZ.A1W(nkm.A01)) {
            c65782Tu0 = new C65782Tu0(2131961932, 2131961968);
        }
        if (c65782Tu0 != null) {
            ElY(c65782Tu0, null);
        } else {
            AbstractC34213F7l.A00().A01(abstractC59962oe, userSession, new PK3(abstractC59962oe, this, z, z2)).A06(EnumC72412Xd8.A0G.A01(), null);
        }
    }

    @Override // X.InterfaceC58178Pqi
    public final void Dwp(UpcomingEvent upcomingEvent) {
        this.A02.A0g.A09(upcomingEvent);
    }

    @Override // X.InterfaceC58178Pqi
    public final void Dwq(UpcomingEvent upcomingEvent) {
        this.A02.A0g.A08(upcomingEvent);
    }

    @Override // X.InterfaceC58178Pqi
    public final void Dws() {
        this.A02.A0g.A09(null);
    }

    @Override // X.InterfaceC58310Pt2
    public final void E2k(Location location, long j) {
        C128175qm A03 = NJR.A03(this.A02);
        if (A03 != null) {
            O7X o7x = this.A06;
            String str = A03.A0T;
            UserSession userSession = o7x.A01;
            O7Z A00 = AbstractC53937NtA.A00(userSession);
            A00.A01.flowMarkPoint(A00.A00, "ADD_LOCATION_ENTERED");
            AbstractC69933Cc.A01();
            AbstractC31177DnL.A0w(null, N5Z.A00(null, "CLIPS", str, -1L, true, false), o7x.A00, userSession);
        }
    }

    @Override // X.InterfaceC58310Pt2
    public final void E5H(NewFundraiserInfo newFundraiserInfo) {
        String str = newFundraiserInfo.A01;
        if (str != null) {
            UserSession userSession = this.A00;
            if (C18U.A06(C06090Tz.A06, userSession, 36317448886031533L)) {
                FragmentActivity fragmentActivity = this.A03;
                String str2 = newFundraiserInfo.A07;
                Integer valueOf = Integer.valueOf(newFundraiserInfo.A00);
                String str3 = newFundraiserInfo.A05;
                List list = newFundraiserInfo.A08;
                String str4 = newFundraiserInfo.A03;
                String str5 = (String) AbstractC166987dD.A17(this.A02.A0P.A02);
                AbstractC167017dG.A1O(userSession, str);
                AbstractC54282Nz2.A00(AbstractC166987dD.A0O(fragmentActivity), userSession, "com.instagram.social_impact.fundraiser.nonprofit_creation_details_for_feed.component.view", AbstractC55224Oeq.A00(valueOf, str, "REELS", str2, str3, str4, str5, list), 60L);
            }
        }
    }

    @Override // X.InterfaceC58310Pt2
    public final void FB6(ExistingStandaloneFundraiserForFeedModel existingStandaloneFundraiserForFeedModel) {
        C51754Mtd A00;
        C52474NJs c52474NJs = this.A02.A0P;
        C51757Mtg c51757Mtg = c52474NJs.A04().A06;
        C51757Mtg c51757Mtg2 = null;
        String str = null;
        if (c51757Mtg != null) {
            if (existingStandaloneFundraiserForFeedModel != null) {
                str = c52474NJs.A00.userId;
            }
            c51757Mtg2 = new C51757Mtg(c51757Mtg.A01, existingStandaloneFundraiserForFeedModel, str, 12);
        }
        A00 = C51754Mtd.A00(null, null, null, null, null, null, c51757Mtg2, null, null, null, null, null, c52474NJs.A04(), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -524289, 262143, false, false, false, false, false, false, false, false, false, false, false, false, false);
        c52474NJs.A07(A00);
    }

    @Override // X.InterfaceC58310Pt2
    public final void FBT(NewFundraiserInfo newFundraiserInfo) {
        C51754Mtd A00;
        C52474NJs c52474NJs = this.A02.A0P;
        C51757Mtg c51757Mtg = c52474NJs.A04().A06;
        C51757Mtg c51757Mtg2 = null;
        String str = null;
        if (c51757Mtg != null) {
            if (newFundraiserInfo != null) {
                str = c52474NJs.A00.userId;
            }
            c51757Mtg2 = new C51757Mtg(newFundraiserInfo, c51757Mtg.A00, str, 12);
        }
        A00 = C51754Mtd.A00(null, null, null, null, null, null, c51757Mtg2, null, null, null, null, null, c52474NJs.A04(), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -524289, 262143, false, false, false, false, false, false, false, false, false, false, false, false, false);
        c52474NJs.A07(A00);
    }

    @Override // X.InterfaceC58310Pt2
    public final void FCy(UpcomingEvent upcomingEvent) {
        C47Z c47z = this.A02.A02;
        if (c47z != null) {
            UpcomingEventImpl upcomingEventImpl = null;
            if (upcomingEvent != null) {
                upcomingEventImpl = upcomingEvent.F7b(null);
            }
            c47z.A1p = upcomingEventImpl;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v3, types: [X.0sl] */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r5v0, types: [X.0sl] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v2, types: [X.0sl] */
    /* JADX WARN: Type inference failed for: r5v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v4, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r5v5, types: [java.util.AbstractCollection, java.util.ArrayList] */
    @Override // X.InterfaceC58310Pt2
    public final void onActivityResult(int i, int i2, Intent intent) {
        C38686GzR c38686GzR;
        ?? r5;
        C51754Mtd A00;
        String str;
        ?? r52;
        ?? r4;
        List list;
        List list2;
        ArrayList arrayList;
        if (i != 16) {
            if (i != 97) {
                if (i == 2002) {
                    this.A01.A00(intent);
                    return;
                }
                return;
            } else {
                if (intent == null) {
                    return;
                }
                String stringExtra = intent.getStringExtra("ClipsConstants.ARG_CLIPS_FUNDED_CONTENT_DEAL_ID");
                NK8 nk8 = this.A02.A0O;
                nk8.A02 = intent.getStringExtra("ClipsConstants.ARG_CLIPS_FUNDED_CONTENT_DEAL_NAME");
                nk8.A08(stringExtra);
                return;
            }
        }
        if (intent == null) {
            return;
        }
        NKH nkh = this.A02.A0V;
        InterfaceC11380iw interfaceC11380iw = this.A05;
        C47Z c47z = nkh.A01;
        ArrayList arrayList2 = null;
        if (c47z != null) {
            c38686GzR = c47z.A0q;
        } else {
            c38686GzR = null;
        }
        C41747IeL c41747IeL = AbstractC54344O0c.A00;
        String str2 = nkh.A08;
        C38686GzR A002 = AbstractC55225Oes.A00(c38686GzR, c41747IeL.A04(intent, str2));
        UserSession userSession = nkh.A06;
        if (c38686GzR != null && A002 != null) {
            List<String> A04 = AbstractC55225Oes.A04(c38686GzR);
            List A042 = AbstractC55225Oes.A04(A002);
            r5 = AbstractC166987dD.A1E();
            for (String str3 : A04) {
                if (!A042.contains(str3)) {
                    r5.add(str3);
                    AbstractC55216Oef.A05(null, null, interfaceC11380iw, userSession, EnumC53230NgS.A05, null, null, str2, "remove", str3, str3, null, "reels", "seller", 0, false);
                }
            }
        } else {
            r5 = C16930sl.A00;
        }
        nkh.A05 = r5;
        nkh.A02 = C41747IeL.A00(intent);
        C47Z c47z2 = nkh.A01;
        if (c47z2 != null) {
            c47z2.A0q = A002;
        }
        A00 = C51754Mtd.A00(null, null, null, null, null, null, null, A002, null, null, null, null, nkh.A04(), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1025, 262143, false, false, false, false, false, false, false, false, false, false, false, false, false);
        nkh.A07(A00);
        C47Z c47z3 = nkh.A01;
        if (c47z3 != null && (arrayList = c47z3.A43) != null) {
            NKH.A00(nkh, arrayList);
        }
        C47Z c47z4 = nkh.A01;
        if (c47z4 != null) {
            arrayList2 = c47z4.A43;
        }
        if (Ny2.A00(userSession)) {
            str = "opt";
        } else {
            str = "seller";
        }
        List<MediaSuggestedProductTag> A07 = AbstractC55225Oes.A07(arrayList2);
        if (!A07.isEmpty()) {
            if (A002 != null && (list2 = (List) A002.A01) != null) {
                r52 = AbstractC167007dF.A0i(list2);
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    r52.add(((C38682GzN) it.next()).A05);
                }
            } else {
                r52 = C16930sl.A00;
            }
            if (A002 != null && (list = (List) A002.A01) != null) {
                r4 = AbstractC167007dF.A0i(list);
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    MSZ.A1S(r4, it2);
                }
            } else {
                r4 = C16930sl.A00;
            }
            for (MediaSuggestedProductTag mediaSuggestedProductTag : A07) {
                String A043 = mediaSuggestedProductTag.A04();
                String A13 = MSW.A13(mediaSuggestedProductTag);
                if (r4.contains(A13) || r52.contains(A043)) {
                    AbstractC55216Oef.A05(null, null, interfaceC11380iw, userSession, EnumC53230NgS.A04, null, null, str2, "add", A13, A13, null, "reels", str, 0, false);
                }
            }
        }
        if (A002 == null) {
            return;
        }
        C42346Ip8 A003 = I6K.A00(userSession);
        int i3 = 0;
        int A0I = AbstractC25231BEo.A0I((List) A002.A01);
        if (A002.A03 != null) {
            i3 = 1;
        }
        A003.A01(A0I, i3, interfaceC11380iw.getModuleName());
    }

    @Override // X.InterfaceC58310Pt2
    public final void DJC(String str, ArrayList arrayList, boolean z) {
        Bundle A0C = AbstractC31177DnL.A0C(arrayList);
        A0C.putBoolean("enableGeoGating", z);
        A0C.putStringArrayList("selectedRegions", arrayList);
        A0C.putString("settingType", str);
        AbstractC27401Ut.getInstance();
        C64501TGn c64501TGn = new C64501TGn(this.A00, "IgMediaGeoGatingSettingsApp");
        FragmentActivity fragmentActivity = this.A03;
        c64501TGn.A07 = fragmentActivity.getString(2131973624);
        c64501TGn.A00(A0C);
        c64501TGn.EqV(fragmentActivity).A04();
    }

    @Override // X.InterfaceC58310Pt2
    public final void DJb(C54586O9n c54586O9n, String str) {
        boolean A1Y = AbstractC25229BEm.A1Y(c54586O9n);
        LLN.A03(c54586O9n.A00, C05F.A02, C05F.A08, null, AbstractC63302u8.A00(c54586O9n.A02).A04(UserMonetizationProductType.A0A), A1Y);
        FragmentActivity fragmentActivity = this.A03;
        UserSession userSession = this.A00;
        AbstractC31175DnJ.A0s(null, C27S.A00().A02().A00(userSession, "ADVANCED_SETTINGS", null, str, A1Y), AbstractC25225BEi.A0r(fragmentActivity, userSession));
    }

    @Override // X.InterfaceC58310Pt2
    public final void Dqg(AbstractC59962oe abstractC59962oe, ShoppingCreationConfig shoppingCreationConfig, MediaSuggestedProductTag mediaSuggestedProductTag, int i) {
        String str;
        String str2;
        A02(abstractC59962oe, shoppingCreationConfig);
        C47Z c47z = this.A02.A02;
        if (c47z != null) {
            str = c47z.A2g;
        } else {
            str = null;
        }
        UserSession userSession = this.A00;
        InterfaceC11380iw interfaceC11380iw = this.A05;
        String str3 = null;
        Product A07 = mediaSuggestedProductTag.A07();
        if (str != null && A07 != null) {
            String str4 = A07.A0H;
            User user = A07.A0B;
            if (user != null) {
                str3 = AbstractC76433bn.A00(user);
            }
            Float A08 = mediaSuggestedProductTag.A08();
            if (Ny2.A00(userSession)) {
                str2 = "opt";
            } else {
                str2 = "seller";
            }
            AbstractC55216Oef.A07(interfaceC11380iw, userSession, A08, str, str4, str3, "reels", str2, i);
        }
        C22C A01 = AnonymousClass229.A01(userSession);
        A01.A0F.A0U(EnumC53380NjV.A0M, EnumC50631MWs.A0L, interfaceC11380iw.getModuleName());
    }
}
