package X;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;
import com.facebook.common.callercontext.CallerContext;
import com.google.common.collect.ImmutableList;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.direct.fragment.recipientpicker.controller.DirectPrivateStoryRecipientController;
import com.instagram.direct.fragment.recipientpicker.controller.DirectPrivateStoryRecipientControllerLifecycleUtil;
import com.instagram.igds.components.bottomsheet.BottomSheetFragment;
import com.instagram.igds.components.button.IgdsButton;
import com.instagram.model.direct.DirectShareTarget;
import com.instagram.model.shopping.reels.ReelProductLink;
import com.instagram.pendingmedia.model.recipients.PendingRecipient;
import com.instagram.ui.widget.search.SearchController;
import com.instagram.user.model.Product;
import com.instagram.user.model.ProductDetailsProductItemDict;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/* loaded from: classes9.dex */
public final class N6V extends AbstractC59962oe implements InterfaceC60072op, InterfaceC189488aT, C51D, InterfaceC60112ot, XBK, InterfaceC25176BBy {
    public static final String __redex_internal_original_name = "DirectPrivateStoryRecipientFragment";
    public UserSession A00;
    public G05 A01;
    public String A02;
    public RecyclerView A03;
    public C57112jm A04;
    public InterfaceC58031PoH A05;
    public DirectPrivateStoryRecipientController A06;

    @Override // X.InterfaceC189488aT
    public final int Aqi() {
        return -1;
    }

    @Override // X.InterfaceC189488aT
    public final int C9V() {
        return 0;
    }

    @Override // X.InterfaceC60112ot
    public final boolean CPM() {
        return false;
    }

    @Override // X.InterfaceC189488aT
    public final boolean CQm() {
        return true;
    }

    @Override // X.InterfaceC189488aT
    public final float Cnp() {
        return 1.0f;
    }

    @Override // X.InterfaceC189498aU
    public final void DOM() {
    }

    @Override // X.InterfaceC189498aU
    public final void DON(int i) {
    }

    @Override // X.InterfaceC189488aT
    public final boolean Ei2() {
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0096, code lost:
    
        if (r1 != 0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00a7, code lost:
    
        if (r1 != 1) goto L22;
     */
    @Override // X.InterfaceC60122ou
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void configureActionBar(X.InterfaceC56362iU r8) {
        /*
            r7 = this;
            r0 = 0
            r8.EkF(r0)
            com.instagram.direct.fragment.recipientpicker.controller.DirectPrivateStoryRecipientController r3 = r7.A06
            if (r3 == 0) goto L73
            r6 = 2131237958(0x7f081c46, float:1.8092181E38)
            boolean r0 = r3.A0u
            r5 = 0
            r4 = 1
            if (r0 == 0) goto L74
            r0 = 2131973639(0x7f135607, float:1.958432E38)
            r8.Efu(r0)
            X.3LO r2 = X.AbstractC31171DnF.A0B()
            java.lang.Integer r0 = X.C05F.A00
            r2.A02(r0)
            r1 = 20
            X.FpR r0 = new X.FpR
            r0.<init>(r3, r1)
            X.AbstractC31176DnK.A1B(r0, r2, r8)
        L2a:
            boolean r0 = r3.A0n
            if (r0 == 0) goto Lb6
            r0 = 2131629709(0x7f0e168d, float:1.8886747E38)
            android.view.View r2 = r8.ESm(r0, r5, r5, r4)
            android.widget.TextView r1 = X.AbstractC31180DnO.A06(r2)
            r0 = 2131973725(0x7f13565d, float:1.9584494E38)
            r1.setText(r0)
            r0 = 2131429550(0x7f0b08ae, float:1.8480776E38)
            android.widget.TextView r6 = X.AbstractC166997dE.A0T(r2, r0)
            r0 = 2131430841(0x7f0b0db9, float:1.8483394E38)
            android.widget.TextView r2 = X.AbstractC166997dE.A0T(r2, r0)
            r0 = 2131954754(0x7f130c42, float:1.9546016E38)
            r6.setText(r0)
            r0 = 2131956832(0x7f131460, float:1.955023E38)
            r2.setText(r0)
            r1 = 60
            X.OkL r0 = new X.OkL
            r0.<init>(r3, r1)
            X.C0fQ.A00(r0, r6)
            r1 = 19
            X.FpR r0 = new X.FpR
            r0.<init>(r3, r1)
            X.C0fQ.A00(r0, r2)
            r8.EkF(r4)
            r8.EkS(r5)
        L73:
            return
        L74:
            java.lang.String r1 = r3.A0S
            java.lang.String r0 = "830547164036012"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto Lae
            r6 = 2131239093(0x7f0820b5, float:1.8094483E38)
            java.util.ArrayList r0 = r3.A0W
            if (r0 == 0) goto Lac
            int r2 = r0.size()
        L89:
            java.util.ArrayList r0 = r3.A0X
            if (r0 == 0) goto Laa
            int r1 = r0.size()
        L91:
            if (r2 != r4) goto La2
            r0 = 2131968125(0x7f13407d, float:1.9573136E38)
            if (r1 == 0) goto L9b
        L98:
            r0 = 2131968124(0x7f13407c, float:1.9573134E38)
        L9b:
            r8.Efu(r0)
            r8.EkF(r4)
            goto L2a
        La2:
            if (r2 != 0) goto L98
            r0 = 2131968126(0x7f13407e, float:1.9573138E38)
            if (r1 == r4) goto L9b
            goto L98
        Laa:
            r1 = 0
            goto L91
        Lac:
            r2 = 0
            goto L89
        Lae:
            r0 = 2131960433(0x7f132271, float:1.9557535E38)
            r8.Efu(r0)
            goto L2a
        Lb6:
            r8.EkS(r4)
            X.3LO r2 = X.AbstractC31171DnF.A0B()
            r2.A01(r6)
            r1 = 62
            X.OkL r0 = new X.OkL
            r0.<init>(r3, r1)
            X.AbstractC31176DnK.A1C(r0, r2, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.N6V.configureActionBar(X.2iU):void");
    }

    @Override // X.C51D
    public final /* synthetic */ void configureElementAboveTitle(InterfaceC56392iX interfaceC56392iX) {
    }

    @Override // X.InterfaceC189488aT
    public final /* synthetic */ boolean ABC() {
        return false;
    }

    @Override // X.InterfaceC189488aT
    public final /* synthetic */ boolean ANe() {
        return false;
    }

    @Override // X.XBK
    public final int Abo() {
        DirectPrivateStoryRecipientController directPrivateStoryRecipientController = this.A06;
        if (directPrivateStoryRecipientController == null) {
            return 0;
        }
        return directPrivateStoryRecipientController.A01;
    }

    @Override // X.InterfaceC189488aT
    public final View C5a() {
        return this.mView;
    }

    @Override // X.InterfaceC189488aT
    /* renamed from: CO7 */
    public final float Cpk() {
        DirectPrivateStoryRecipientController directPrivateStoryRecipientController = this.A06;
        if (directPrivateStoryRecipientController != null && directPrivateStoryRecipientController.A0i) {
            return 1.0f;
        }
        return 0.6f;
    }

    @Override // X.C51D
    public final /* synthetic */ EnumC27385C6o backPressDestination() {
        return EnumC27385C6o.A02;
    }

    @Override // X.C51E
    public final /* synthetic */ boolean doNotDismissOnDraggingDown() {
        return false;
    }

    @Override // X.C51E
    public final /* synthetic */ boolean doNotDragWhenDismissLocked() {
        return false;
    }

    @Override // X.C51E
    public final /* synthetic */ boolean doNotFlingWhenDismissLocked() {
        return false;
    }

    @Override // X.C51E
    public final /* synthetic */ int dragLockBouncePx() {
        return 0;
    }

    @Override // X.C51E
    public final /* synthetic */ double getDragUpReleaseRatio() {
        return 0.5d;
    }

    @Override // X.C51E
    public final /* synthetic */ int getExtraDragSpace() {
        return 0;
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return this.A02;
    }

    @Override // X.AbstractC59962oe
    public final AbstractC18680vv getSession() {
        return this.A00;
    }

    @Override // X.C51E
    public final /* synthetic */ double getSwipeDownDistanceAdjustment() {
        return 0.5d;
    }

    @Override // X.C51E
    public final /* synthetic */ double getSwipeUpDistanceAdjustment() {
        return 0.0d;
    }

    @Override // X.C51E
    public final /* synthetic */ boolean includeFragmentDragSpace() {
        return false;
    }

    @Override // X.C51D
    public final /* synthetic */ boolean isElementAboveTitleEnabled() {
        return false;
    }

    @Override // X.C51E
    public final /* synthetic */ boolean isScrolledToBottom() {
        return true;
    }

    @Override // X.InterfaceC189488aT, X.C51D
    public final boolean isScrolledToTop() {
        AbstractC70663Fe abstractC70663Fe = this.A03.A0D;
        abstractC70663Fe.getClass();
        return AbstractC110854yx.A03((LinearLayoutManager) abstractC70663Fe);
    }

    @Override // X.InterfaceC60072op
    public final boolean onBackPressed() {
        DirectPrivateStoryRecipientController directPrivateStoryRecipientController = this.A06;
        if (directPrivateStoryRecipientController != null) {
            if (!directPrivateStoryRecipientController.A0k) {
                int i = 0;
                if (directPrivateStoryRecipientController.A0F.A09()) {
                    i = -1;
                }
                DirectPrivateStoryRecipientController.A08(directPrivateStoryRecipientController, i, false);
                return true;
            }
            AbstractC59962oe abstractC59962oe = directPrivateStoryRecipientController.A0w;
            if (abstractC59962oe.getChildFragmentManager().A0L() > 0) {
                abstractC59962oe.getChildFragmentManager().A0b();
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // X.InterfaceC189488aT, X.C51D
    public final void onBottomSheetClosed() {
        DirectPrivateStoryRecipientController directPrivateStoryRecipientController;
        InterfaceC58031PoH interfaceC58031PoH = this.A05;
        if (interfaceC58031PoH != null && (directPrivateStoryRecipientController = this.A06) != null) {
            interfaceC58031PoH.Dlo(this.A06.A0E(), directPrivateStoryRecipientController.A0F.A09());
        }
    }

    @Override // X.InterfaceC189488aT, X.C51D
    public final void onBottomSheetPositionChanged(int i, int i2) {
        InterfaceC58031PoH interfaceC58031PoH = this.A05;
        if (interfaceC58031PoH != null) {
            interfaceC58031PoH.onBottomSheetPositionChanged(i, i2);
        }
        View view = this.mView;
        DirectPrivateStoryRecipientController directPrivateStoryRecipientController = this.A06;
        if (directPrivateStoryRecipientController != null && view != null) {
            float A08 = AbstractC166987dD.A08(view);
            float min = Math.min(1.0f, Math.max((A08 - i) / A08, 0.0f));
            View view2 = directPrivateStoryRecipientController.A04;
            if (view2 != null) {
                if (min < 0.2f) {
                    if (view2.getVisibility() != 8) {
                        directPrivateStoryRecipientController.A04.setVisibility(8);
                    }
                } else {
                    DirectPrivateStoryRecipientController.A05(directPrivateStoryRecipientController);
                }
            }
            if (directPrivateStoryRecipientController.A0R == C05F.A00 && min < 1.0f) {
                directPrivateStoryRecipientController.A0i = false;
            }
        }
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        ViewGroup viewGroup;
        C1ON A0H;
        int i;
        super.onViewCreated(view, bundle);
        RecyclerView A0G = AbstractC31172DnG.A0G(view, R.id.recipients_rv);
        this.A03 = A0G;
        AbstractC31174DnI.A15(getContext(), A0G);
        final DirectPrivateStoryRecipientController directPrivateStoryRecipientController = this.A06;
        if (directPrivateStoryRecipientController != null) {
            FrameLayout frameLayout = (FrameLayout) view.requireViewById(R.id.recipients_list);
            ViewStub A07 = AbstractC31171DnF.A07(view, R.id.bottom_sheet_drag_handle);
            RecyclerView A0G2 = AbstractC31172DnG.A0G(frameLayout, R.id.recipients_rv);
            directPrivateStoryRecipientController.A06 = A0G2;
            if (directPrivateStoryRecipientController.A0k) {
                view.setBackground(null);
                FragmentActivity activity = directPrivateStoryRecipientController.A0w.getActivity();
                AbstractC31172DnG.A1B(activity, frameLayout, AbstractC53242c7.A02(activity));
                if (directPrivateStoryRecipientController.A0r) {
                    A07.getClass();
                    A07.inflate();
                }
                if (directPrivateStoryRecipientController.A00 > 0.0f) {
                    AbstractC13880nE.A0W(view, (int) (AbstractC13880nE.A06(r5.getContext()) * directPrivateStoryRecipientController.A00));
                }
            } else if (directPrivateStoryRecipientController.A0l) {
                A0G2.setBackground(null);
            }
            directPrivateStoryRecipientController.mListContainer = frameLayout;
            List list = directPrivateStoryRecipientController.A1J;
            if (list != null && !list.isEmpty() && list.get(0) != null) {
                list.get(0);
            }
            GZY pk1 = new PK1(directPrivateStoryRecipientController, 2);
            C28301Yr A00 = AbstractC34213F7l.A00();
            AbstractC12990ll abstractC12990ll = directPrivateStoryRecipientController.A0B;
            AbstractC59962oe abstractC59962oe = directPrivateStoryRecipientController.A0w;
            Ef3 A01 = A00.A01(abstractC59962oe, abstractC12990ll, pk1);
            Context context = abstractC59962oe.getContext();
            UserSession userSession = directPrivateStoryRecipientController.A0B;
            MR8 mr8 = directPrivateStoryRecipientController.A1I;
            InterfaceC58308Pt0 interfaceC58308Pt0 = directPrivateStoryRecipientController.A1G;
            InterfaceC58308Pt0 interfaceC58308Pt02 = directPrivateStoryRecipientController.A1F;
            PG1 pg1 = directPrivateStoryRecipientController.A15;
            C54409O2p c54409O2p = directPrivateStoryRecipientController.A16;
            P26 p26 = directPrivateStoryRecipientController.A1C;
            C54410O2q c54410O2q = directPrivateStoryRecipientController.A17;
            P26 p262 = directPrivateStoryRecipientController.A1D;
            P27 p27 = directPrivateStoryRecipientController.A18;
            P28 p28 = directPrivateStoryRecipientController.A19;
            FFU ffu = directPrivateStoryRecipientController.A1A;
            C54406O2m c54406O2m = directPrivateStoryRecipientController.A14;
            C54411O2r c54411O2r = directPrivateStoryRecipientController.A1B;
            C54404O2k c54404O2k = directPrivateStoryRecipientController.A12;
            boolean z = directPrivateStoryRecipientController.A0u;
            boolean z2 = directPrivateStoryRecipientController.A0c;
            boolean z3 = directPrivateStoryRecipientController.A0d;
            boolean z4 = directPrivateStoryRecipientController.A0e;
            boolean z5 = directPrivateStoryRecipientController.A0b;
            boolean z6 = directPrivateStoryRecipientController.A1L;
            boolean z7 = directPrivateStoryRecipientController.A0l;
            C684436h c684436h = directPrivateStoryRecipientController.A09;
            InterfaceC58010Pnu interfaceC58010Pnu = directPrivateStoryRecipientController.A0Q;
            C52199N8o c52199N8o = new C52199N8o(context, c684436h, abstractC59962oe, userSession, directPrivateStoryRecipientController.A0D, c54404O2k, c54406O2m, pg1, c54409O2p, c54410O2q, p27, p28, ffu, c54411O2r, directPrivateStoryRecipientController, directPrivateStoryRecipientController, interfaceC58308Pt0, interfaceC58308Pt02, p26, p262, directPrivateStoryRecipientController.A0J, A01, directPrivateStoryRecipientController.A0L, directPrivateStoryRecipientController.A0N, directPrivateStoryRecipientController.A0P, mr8, interfaceC58010Pnu, directPrivateStoryRecipientController.A0Z, z, z2, z3, z4, z5, z6, z7);
            directPrivateStoryRecipientController.A0H = c52199N8o;
            c52199N8o.setHasStableIds(true);
            String moduleName = abstractC59962oe.getModuleName();
            Context context2 = abstractC59962oe.getContext();
            UserSession userSession2 = directPrivateStoryRecipientController.A0B;
            InterfaceC37209GaK interfaceC37209GaK = directPrivateStoryRecipientController.A1H;
            InterfaceC58010Pnu interfaceC58010Pnu2 = directPrivateStoryRecipientController.A0Q;
            C54408O2o c54408O2o = new C54408O2o(directPrivateStoryRecipientController);
            C19270xB A0D = AbstractC31171DnF.A0D(moduleName);
            boolean A1W = AbstractC167007dF.A1W(directPrivateStoryRecipientController.A1E);
            UserSession userSession3 = directPrivateStoryRecipientController.A0B;
            C06090Tz c06090Tz = C06090Tz.A05;
            directPrivateStoryRecipientController.A0I = new C52192N8h(context2, A0D, userSession2, c54404O2k, c54408O2o, directPrivateStoryRecipientController, interfaceC37209GaK, interfaceC58010Pnu2, moduleName, A1W, AbstractC31178DnM.A1X(c06090Tz, userSession3, 36314790302124857L));
            C1UC activity2 = abstractC59962oe.getActivity();
            if (activity2 instanceof C2d9) {
                viewGroup = MSW.A0B(((BaseFragmentActivity) ((C2d9) activity2)).A0L);
            } else {
                viewGroup = (ViewGroup) view;
            }
            SearchController searchController = new SearchController(abstractC59962oe.getActivity(), viewGroup, directPrivateStoryRecipientController.A0I, directPrivateStoryRecipientController.A0B, null, directPrivateStoryRecipientController, -1, -1, true);
            directPrivateStoryRecipientController.mSearchController = searchController;
            abstractC59962oe.registerLifecycleListener(searchController);
            directPrivateStoryRecipientController.mSearchController.A07 = true;
            InterfaceC169357h9 A03 = AbstractC31674Dvf.A03(abstractC59962oe.getContext(), directPrivateStoryRecipientController.A0B, new C61972ry(abstractC59962oe.getContext(), AbstractC018607g.A00(abstractC59962oe)), "story_share_sheet", "story_share_sheet", null, AbstractC31178DnM.A01(c06090Tz, directPrivateStoryRecipientController.A0B, 36602196628083314L), 0, true, directPrivateStoryRecipientController.A0m);
            directPrivateStoryRecipientController.A0O = A03;
            A03.EYJ(directPrivateStoryRecipientController);
            String str = "";
            directPrivateStoryRecipientController.A0O.Eby("");
            directPrivateStoryRecipientController.A06.setAdapter(directPrivateStoryRecipientController.A0H);
            directPrivateStoryRecipientController.A0H.A06();
            directPrivateStoryRecipientController.A06.A14(directPrivateStoryRecipientController);
            View inflate = LayoutInflater.from(abstractC59962oe.getContext()).inflate(R.layout.direct_private_story_recipient_send_button, (ViewGroup) abstractC59962oe.requireActivity().findViewById(android.R.id.content), false);
            directPrivateStoryRecipientController.A04 = inflate;
            IgdsButton A0W = AbstractC31173DnH.A0W(inflate, R.id.send_button);
            directPrivateStoryRecipientController.A0K = A0W;
            C0fQ.A00(new ViewOnClickListenerC55466OkL(directPrivateStoryRecipientController, 61), A0W);
            directPrivateStoryRecipientController.A04.setVisibility(8);
            ((ViewGroup) abstractC59962oe.requireActivity().findViewById(android.R.id.content)).addView(directPrivateStoryRecipientController.A04);
            C25671My A002 = AbstractC25651Mw.A00(directPrivateStoryRecipientController.A0B);
            A002.A01(directPrivateStoryRecipientController, Ot5.class);
            A002.A01(directPrivateStoryRecipientController.A0x, C55964Osw.class);
            abstractC59962oe.schedule(new EZF(directPrivateStoryRecipientController, 1));
            DirectPrivateStoryRecipientController.A05(directPrivateStoryRecipientController);
            directPrivateStoryRecipientController.A06.setVerticalScrollBarEnabled(false);
            Context requireContext = abstractC59962oe.requireContext();
            Resources resources = requireContext.getResources();
            int A05 = AbstractC166997dE.A05(resources);
            if (directPrivateStoryRecipientController.A0t) {
                int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.account_discovery_bottom_gap);
                View A0U = AbstractC167017dG.A0U(view, R.id.direct_private_share_message_view);
                AbstractC13880nE.A0i(A0U, A05, A05);
                AbstractC13880nE.A0j(A0U, dimensionPixelSize, dimensionPixelSize);
                View requireViewById = view.requireViewById(R.id.direct_private_share_message_view_divider);
                AbstractC31173DnH.A0z(requireContext, requireViewById, R.drawable.elevated_searchbar_background);
                requireViewById.setVisibility(0);
                A0U.setBackgroundResource(AbstractC53242c7.A02(requireContext));
                EditText editText = (EditText) A0U.requireViewById(R.id.direct_private_share_message_box);
                directPrivateStoryRecipientController.A05 = editText;
                editText.setPadding(dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize);
                directPrivateStoryRecipientController.A05.setHint(2131960653);
                IgImageView A0a = AbstractC31172DnG.A0a(AbstractC31173DnH.A0E(AbstractC31173DnH.A0G(view, R.id.direct_private_share_write_message_thumbnail_stub), R.layout.direct_private_share_write_message_thumbnail_user_avatar), R.id.avatar_image_view);
                if (A0a != null) {
                    AbstractC31173DnH.A1T(abstractC59962oe, A0a, AbstractC166987dD.A10(directPrivateStoryRecipientController.A0B));
                }
            }
            String str2 = directPrivateStoryRecipientController.A0S;
            if (str2 != null && str2.equals("830547164036012")) {
                AbstractC31176DnK.A1E(view, R.id.avatar_image_view, 8);
                AbstractC31176DnK.A1E(view, R.id.direct_private_share_message_view_divider, 8);
                RecyclerView A0G3 = AbstractC31172DnG.A0G(AbstractC167017dG.A0U(view, R.id.direct_private_share_media_container_stub), R.id.direct_share_media_container_recycler_view);
                A0G3.setLayoutManager(new C51098Mi0(abstractC59962oe.requireContext(), directPrivateStoryRecipientController));
                A0G3.setAdapter(new C44566Jnn(abstractC59962oe, directPrivateStoryRecipientController.A0B, directPrivateStoryRecipientController.A0V, directPrivateStoryRecipientController.A0W, directPrivateStoryRecipientController.A0X));
                A0G3.setVisibility(0);
            }
            if (directPrivateStoryRecipientController.A0s && !TextUtils.isEmpty(directPrivateStoryRecipientController.A0T)) {
                C160657Hz c160657Hz = new C160657Hz(requireContext, AbstractC31173DnH.A0G(view, R.id.direct_private_share_link_preview_stub));
                C47954LGp A003 = AbstractC46924Kp5.A00(requireContext, directPrivateStoryRecipientController.A0B);
                C44999Jvp A004 = A003.A00(directPrivateStoryRecipientController.A0T);
                if (A004 != null) {
                    c160657Hz.A02(A004.A07, A004.A06, A004.A09);
                } else {
                    directPrivateStoryRecipientController.A0z.A02(A003.A01.A0S(C0eB.A00).A0K(new C48358LaY(3, directPrivateStoryRecipientController, A003)).A0M(new C43651JSj(0)).A0G().A0O(AbstractC142856cl.A01), new PKD(c160657Hz, 0));
                }
            }
            if (directPrivateStoryRecipientController.A0q) {
                final TextView textView = (TextView) AbstractC167017dG.A0U(view, R.id.direct_share_sheet_logged_in_as_label_stub);
                textView.setText(AbstractC07900bA.A01(requireContext.getResources(), new String[]{AbstractC31173DnH.A0n(directPrivateStoryRecipientController.A0B, C17060sy.A01)}, 2131959797));
                AbstractC13880nE.A0q(textView, new Runnable() { // from class: X.PQb
                    @Override // java.lang.Runnable
                    public final void run() {
                        DirectPrivateStoryRecipientController directPrivateStoryRecipientController2 = directPrivateStoryRecipientController;
                        TextView textView2 = textView;
                        View view2 = directPrivateStoryRecipientController2.A04;
                        if (view2 != null) {
                            AbstractC13880nE.A0U(view2, textView2.getHeight());
                        }
                    }
                });
            }
            C131995xZ A005 = C196068lw.A00(directPrivateStoryRecipientController.A0B).A00(CallerContext.A01("DirectPrivateStoryRecipientController"));
            if (C196068lw.A03(A005)) {
                UserSession userSession4 = directPrivateStoryRecipientController.A0B;
                C14360o3.A0B(userSession4, 0);
                if (AbstractC166997dE.A0Y(userSession4).A0T().contains(EnumC199318rY.A0G) || AbstractC166997dE.A0Y(userSession4).A0T().contains(EnumC199318rY.A0C) || AbstractC166997dE.A0Y(userSession4).A0T().contains(EnumC199318rY.A0H) || AbstractC166997dE.A0Y(userSession4).A0T().contains(EnumC199318rY.A09) || AbstractC166997dE.A0Y(userSession4).A0T().contains(EnumC199318rY.A0A)) {
                    ArrayList A1E = AbstractC166987dD.A1E();
                    boolean z8 = false;
                    if (list != null && !list.isEmpty() && list.get(0) != null) {
                        C47Z c47z = (C47Z) list.get(0);
                        List list2 = c47z.A4b;
                        EnumC75383a5 enumC75383a5 = EnumC75383a5.A0y;
                        if (C48r.A00(enumC75383a5, list2) != null) {
                            A1E.add(C48r.A00(enumC75383a5, c47z.A4b).A0H().A0H);
                        }
                        if (!AbstractC83893oY.A00(c47z.A4Z) && MSW.A0a(c47z.A4Z).A05 != null) {
                            ReelProductLink reelProductLink = MSW.A0a(c47z.A4Z).A05;
                            C14360o3.A0B(reelProductLink, 0);
                            ProductDetailsProductItemDict productDetailsProductItemDict = reelProductLink.A00;
                            Product product = null;
                            if (productDetailsProductItemDict != null) {
                                product = new Product(null, productDetailsProductItemDict);
                            }
                            String str3 = product.A0H;
                            if (str3 != null) {
                                A1E.add(str3);
                            }
                        }
                        if (!AbstractC83893oY.A00(c47z.A4Z) && MSW.A0a(c47z.A4Z).A03 != null) {
                            z8 = true;
                        }
                    }
                    if (!A1E.isEmpty() || z8) {
                        if (C196068lw.A02(A005)) {
                            str = A005.A03;
                        }
                        OE4 oe4 = new OE4(abstractC59962oe.getContext(), AbstractC018607g.A00(abstractC59962oe), directPrivateStoryRecipientController.A0B, directPrivateStoryRecipientController.A13, str);
                        if (!A1E.isEmpty() && z8) {
                            C2JM A0b = AbstractC25225BEi.A0b();
                            ImmutableList copyOf = ImmutableList.copyOf((Collection) A1E);
                            A0b.A05("product_ids", copyOf);
                            boolean A1W2 = AbstractC167007dF.A1W(copyOf);
                            boolean A1X = AbstractC43594JPz.A1X(A0b, "page_id", oe4.A05);
                            C18C.A0E(A1W2);
                            C18C.A0E(A1X);
                            C907442n c907442n = new C907442n(A0b, C51530MpG.class, "FBProductAndShopCrossTaggingEligibility", false);
                            UserSession userSession5 = oe4.A03;
                            C14360o3.A0B(userSession5, 0);
                            A0H = AbstractC31178DnM.A0H(c907442n, userSession5);
                            i = 27;
                        } else if (!A1E.isEmpty()) {
                            oe4.A00 = C05F.A00;
                            C2JM A0b2 = AbstractC25225BEi.A0b();
                            ImmutableList copyOf2 = ImmutableList.copyOf((Collection) A1E);
                            A0b2.A05("product_ids", copyOf2);
                            boolean A1W3 = AbstractC167007dF.A1W(copyOf2);
                            boolean A1X2 = AbstractC43594JPz.A1X(A0b2, "page_id", oe4.A05);
                            C18C.A0E(A1W3);
                            C18C.A0E(A1X2);
                            C907442n c907442n2 = new C907442n(A0b2, C51532MpI.class, "FBProductCrossTaggingEligibility", false);
                            UserSession userSession6 = oe4.A03;
                            C14360o3.A0B(userSession6, 0);
                            A0H = AbstractC31178DnM.A0H(c907442n2, userSession6);
                            i = 25;
                        } else if (z8) {
                            C2JM A0b3 = AbstractC25225BEi.A0b();
                            C18C.A0E(AbstractC43594JPz.A1X(A0b3, "page_id", oe4.A05));
                            C907442n c907442n3 = new C907442n(A0b3, C51534MpK.class, "FBShopCrossTaggingEligibility", false);
                            UserSession userSession7 = oe4.A03;
                            C14360o3.A0B(userSession7, 0);
                            A0H = AbstractC31178DnM.A0H(c907442n3, userSession7);
                            i = 26;
                        }
                        C50689MZh.A00(A0H, oe4, i);
                        C1GJ.A00(oe4.A01, oe4.A02, A0H);
                    }
                }
            }
            C35021Fbu c35021Fbu = new C35021Fbu(directPrivateStoryRecipientController.A0B, requireContext);
            if (c35021Fbu.A01()) {
                FragmentActivity activity3 = abstractC59962oe.getActivity();
                activity3.getClass();
                AbstractC10360h2 supportFragmentManager = activity3.getSupportFragmentManager();
                Fragment A0Q = supportFragmentManager.A0Q(AbstractC111324zv.A00(1515));
                if (A0Q instanceof BottomSheetFragment) {
                    C14240no c14240no = new C14240no(supportFragmentManager);
                    c14240no.A0M(A0Q);
                    c14240no.A00();
                }
                c35021Fbu.A00(new Runnable() { // from class: X.PMo
                    @Override // java.lang.Runnable
                    public final void run() {
                        DirectPrivateStoryRecipientController.A03(DirectPrivateStoryRecipientController.this);
                    }
                });
            }
        }
        C57112jm c57112jm = this.A04;
        if (c57112jm != null) {
            c57112jm.A06(this.A03, C71163Hc.A00(this));
        }
    }

    @Override // X.C51D
    public final /* synthetic */ boolean useCustomScrollDetermination() {
        return false;
    }

    @Override // X.InterfaceC189488aT
    public final int Ahd(Context context) {
        return ViewConfiguration.get(context).getScaledTouchSlop();
    }

    @Override // X.C51E
    public final /* synthetic */ float getSwipeDownFlingVelocity() {
        return 3500.0f;
    }

    @Override // X.C51E
    public final /* synthetic */ float getSwipeUpFlingVelocity() {
        return 3500.0f;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onActivityResult(int i, int i2, Intent intent) {
        Comparable A00;
        super.onActivityResult(i, i2, intent);
        DirectPrivateStoryRecipientController directPrivateStoryRecipientController = this.A06;
        if (directPrivateStoryRecipientController != null) {
            if (i != 2001) {
                if (i == 2002) {
                    directPrivateStoryRecipientController.A0H.A06();
                    return;
                }
                return;
            }
            if (i2 != -1) {
                return;
            }
            intent.getClass();
            DirectShareTarget directShareTarget = (DirectShareTarget) intent.getParcelableExtra(AbstractC111324zv.A00(771));
            if (directShareTarget != null) {
                directPrivateStoryRecipientController.A0v.put(directShareTarget, intent.getStringExtra("bundle_query_session_id"));
            }
            C52199N8o c52199N8o = directPrivateStoryRecipientController.A0H;
            Map map = c52199N8o.A0b;
            int size = map.size();
            Map map2 = c52199N8o.A0c;
            if (size + map2.size() < 50) {
                LinkedList linkedList = c52199N8o.A0Z;
                Iterator it = linkedList.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    Object next = it.next();
                    if (next.equals(directShareTarget)) {
                        linkedList.remove(next);
                        break;
                    }
                }
                linkedList.add(0, directShareTarget);
                List unmodifiableList = Collections.unmodifiableList(directShareTarget.A0Q);
                if (unmodifiableList.size() == 1) {
                    A00 = ((PendingRecipient) unmodifiableList.get(0)).getId();
                } else {
                    map2 = map;
                    A00 = directShareTarget.A00();
                }
                map2.put(A00, directShareTarget);
                directPrivateStoryRecipientController.A0H.A06();
            } else {
                UserSession userSession = directPrivateStoryRecipientController.A0B;
                AbstractC59962oe abstractC59962oe = directPrivateStoryRecipientController.A0w;
                Context context = abstractC59962oe.getContext();
                AbstractC167017dG.A1N(userSession, context);
                C9GR.A07(context, 2131960539);
                C162337Ov.A0M(abstractC59962oe, userSession);
            }
            DirectPrivateStoryRecipientController.A05(directPrivateStoryRecipientController);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x0232, code lost:
    
        if (r10 != 1) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x02bc, code lost:
    
        if (X.AbstractC46924Kp5.A00(r3.requireContext().getApplicationContext(), r4.A0B).A02(r4.A0T) == false) goto L55;
     */
    @Override // androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onCreate(android.os.Bundle r21) {
        /*
            Method dump skipped, instructions count: 1130
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.N6V.onCreate(android.os.Bundle):void");
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-77714834);
        View A0A = AbstractC31172DnG.A0A(layoutInflater, viewGroup, R.layout.direct_private_story_recipient_fragment_layout);
        C0f9.A09(1913991505, A02);
        return A0A;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroy() {
        int A02 = C0f9.A02(286998224);
        super.onDestroy();
        this.A06 = null;
        this.A05 = null;
        G05 g05 = this.A01;
        if (g05 != null) {
            g05.A08();
        }
        C0f9.A09(1033734922, A02);
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        int i;
        int A02 = C0f9.A02(1660712408);
        super.onDestroyView();
        DirectPrivateStoryRecipientController directPrivateStoryRecipientController = this.A06;
        if (directPrivateStoryRecipientController == null) {
            i = 731140063;
        } else {
            C25671My A00 = AbstractC25651Mw.A00(directPrivateStoryRecipientController.A0B);
            A00.A02(directPrivateStoryRecipientController, Ot5.class);
            A00.A02(directPrivateStoryRecipientController.A0x, C55964Osw.class);
            A00.A02(directPrivateStoryRecipientController.A0y, C211849aB.class);
            directPrivateStoryRecipientController.A0O.DEw();
            AbstractC59962oe abstractC59962oe = directPrivateStoryRecipientController.A0w;
            abstractC59962oe.unregisterLifecycleListener(directPrivateStoryRecipientController.mSearchController);
            directPrivateStoryRecipientController.mSearchController.onDestroyView();
            View view = directPrivateStoryRecipientController.A04;
            C55942hf c55942hf = C150956qv.A02;
            AbstractC125325le.A00(view).A0G();
            DirectPrivateStoryRecipientControllerLifecycleUtil.cleanupReferences(directPrivateStoryRecipientController);
            ((ViewGroup) abstractC59962oe.requireActivity().findViewById(android.R.id.content)).removeView(directPrivateStoryRecipientController.A04);
            View view2 = directPrivateStoryRecipientController.A04;
            if (view2 != null) {
                view2.requireViewById(R.id.send_button).setOnClickListener(null);
            }
            G05 g05 = directPrivateStoryRecipientController.A1E;
            if (g05 != null) {
                ArrayList A04 = directPrivateStoryRecipientController.A0F.A04(InterfaceC37292Gbt.class);
                g05.A0C(abstractC59962oe, directPrivateStoryRecipientController.A0M, abstractC59962oe.getModuleName(), directPrivateStoryRecipientController.A0U, A04);
            }
            directPrivateStoryRecipientController.A04 = null;
            directPrivateStoryRecipientController.A0v.clear();
            directPrivateStoryRecipientController.A0z.A01();
            i = 1776319665;
        }
        C0f9.A09(i, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        int i;
        int A02 = C0f9.A02(516034368);
        super.onPause();
        DirectPrivateStoryRecipientController directPrivateStoryRecipientController = this.A06;
        if (directPrivateStoryRecipientController == null) {
            i = -1432336406;
        } else {
            SearchController searchController = directPrivateStoryRecipientController.mSearchController;
            Integer num = searchController.A03;
            Integer num2 = C05F.A00;
            if (num != num2) {
                searchController.A01(num2, 0.0f, 0.0f, false);
            }
            directPrivateStoryRecipientController.A0F.A05();
            i = 833079740;
        }
        C0f9.A09(i, A02);
    }

    @Override // X.InterfaceC25176BBy
    public final void EYH(InterfaceC58031PoH interfaceC58031PoH) {
        this.A05 = interfaceC58031PoH;
    }
}
