package X;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentActivity;
import com.facebook.R;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.common.callercontext.CallerContextable;
import com.facebook.common.stringformat.StringFormatUtil;
import com.instagram.actionbar.ActionButton;
import com.instagram.aistudio.profile.model.AiStudioProfileBannerModel;
import com.instagram.avatar.ui.UpdateProfilePicturePagerAdapter$UpdateProfileTabType;
import com.instagram.avatars.coinflip.AvatarCoinFlipConfig;
import com.instagram.avatars.coinflip.ProfileCoinFlipView;
import com.instagram.business.analytics.logger.BusinessFlowAnalyticsLogger;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgFrameLayout;
import com.instagram.common.ui.text.TitleTextView;
import com.instagram.common.ui.widget.imageview.CircularImageView;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.igds.components.banner.IgdsBanner;
import com.instagram.igds.components.form.IgFormField;
import com.instagram.igds.components.headline.IgdsHeadline;
import com.instagram.igds.components.megaphone.IgdsPrismMegaphone;
import com.instagram.music.common.model.MusicAssetModel;
import com.instagram.profile.edit.controller.EditProfileFieldsController;
import com.instagram.quickpromotion.intf.QPTooltipAnchor;
import com.instagram.quickpromotion.intf.QuickPromotionSlot;
import com.instagram.ui.widget.textview.ImageWithTitleTextView;
import com.instagram.user.model.User;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* renamed from: X.DwQ, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31721DwQ extends AbstractC59962oe implements InterfaceC37218GaT, InterfaceC69913Ca, InterfaceC60122ou, C53U, CallerContextable {
    public static final EnumC69993Ci A1c = EnumC69993Ci.IG_EDIT_PROFILE;
    public static final String __redex_internal_original_name = "EditProfileFragment";
    public View A01;
    public View A02;
    public View A03;
    public View A04;
    public ViewStub A05;
    public ViewStub A06;
    public ViewStub A07;
    public ViewStub A08;
    public ViewStub A09;
    public ViewStub A0A;
    public ViewStub A0B;
    public ListView A0C;
    public ScrollView A0D;
    public TextView A0E;
    public TextView A0F;
    public TextView A0G;
    public TextView A0H;
    public TextView A0I;
    public TextView A0J;
    public TextView A0K;
    public TextView A0L;
    public TextView A0M;
    public ActionButton A0N;
    public C3CZ A0O;
    public C60852q9 A0P;
    public C74H A0Q;
    public AvatarCoinFlipConfig A0R;
    public ProfileCoinFlipView A0S;
    public C35198Ffq A0T;
    public UserSession A0V;
    public TitleTextView A0W;
    public CircularImageView A0X;
    public IgImageView A0Y;
    public C57012jc A0Z;
    public C57012jc A0a;
    public InterfaceC56392iX A0b;
    public InterfaceC56392iX A0c;
    public InterfaceC69973Cg A0d;
    public C5SW A0e;
    public C34649FOh A0f;
    public OIW A0h;
    public C31822Dyg A0i;
    public C31370Dqa A0j;
    public C32409EPk A0k;
    public EditProfileFieldsController A0l;
    public FJX A0m;
    public C151696sF A0n;
    public C155506yf A0o;
    public C64842wi A0p;
    public C64742wY A0q;
    public ImageWithTitleTextView A0r;
    public User A0s;
    public OHc A0t;
    public Boolean A0u;
    public String A0v;
    public List A0w;
    public boolean A0y;
    public boolean A0z;
    public boolean A11;
    public boolean A12;
    public boolean A14;
    public boolean A15;
    public boolean A16;
    public boolean A17;
    public boolean A18;
    public boolean A19;
    public Bundle A1A;
    public ViewStub A1B;
    public ViewStub A1C;
    public ViewStub A1D;
    public ViewStub A1E;
    public ViewStub A1F;
    public TextView A1G;
    public ConstraintLayout A1H;
    public BusinessFlowAnalyticsLogger A1I;
    public IgFrameLayout A1J;
    public C57012jc A1K;
    public IgFormField A1L;
    public ImageWithTitleTextView A1M;
    public ImageWithTitleTextView A1N;
    public final ArrayList A1Q = AbstractC166987dD.A1E();
    public boolean A13 = false;
    public final C36576GBa A1O = new C36576GBa(this);
    public C31590DuI A0U = null;
    public MWW A0g = null;
    public android.net.Uri A00 = null;
    public boolean A10 = false;
    public final ViewTreeObserver.OnScrollChangedListener A1S = new ViewTreeObserverOnScrollChangedListenerC55505Oky(this, 2);
    public boolean A0x = false;
    public final InterfaceC41501vz A1U = C31728DwZ.A00(this, 19);
    public final InterfaceC41501vz A1X = C31728DwZ.A00(this, 20);
    public final InterfaceC41501vz A1V = C31728DwZ.A00(this, 21);
    public final InterfaceC41501vz A1Z = C31728DwZ.A00(this, 22);
    public final InterfaceC41501vz A1a = C31728DwZ.A00(this, 23);
    public final InterfaceC41501vz A1W = C31728DwZ.A00(this, 24);
    public final InterfaceC41501vz A1b = C31728DwZ.A00(this, 25);
    public final InterfaceC42271xH A1T = C31728DwZ.A00(this, 26);
    public final InterfaceC41501vz A1Y = C31728DwZ.A00(this, 18);
    public final View.OnClickListener A1R = new ViewOnClickListenerC31724DwT(this, 66);
    public final InterfaceC58091PpG A1P = new C36775GIy(this);

    @Override // X.C53U
    public final boolean CK6() {
        return false;
    }

    @Override // X.InterfaceC69913Ca
    public final /* synthetic */ void CKE(Intent intent) {
    }

    @Override // X.InterfaceC69913Ca
    public final /* synthetic */ void Cv3(int i, int i2) {
    }

    @Override // X.InterfaceC69913Ca
    public final /* synthetic */ void Cv4(int i, int i2) {
    }

    @Override // X.InterfaceC69913Ca
    public final /* synthetic */ void En7(File file, int i) {
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "edit_profile";
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x000b, code lost:
    
        if (r9 == 11) goto L6;
     */
    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onActivityResult(int r9, int r10, android.content.Intent r11) {
        /*
            r8 = this;
            r3 = r11
            super.onActivityResult(r9, r10, r11)
            boolean r0 = r8.A18
            r2 = 11
            if (r0 != 0) goto Ld
            r1 = 0
            if (r9 != r2) goto Le
        Ld:
            r1 = 1
        Le:
            X.3CZ r0 = r8.A0O
            r0.A08(r11, r9, r10, r1)
            r1 = 1111(0x457, float:1.557E-42)
            r0 = -1
            if (r9 != r1) goto L38
            if (r10 != r0) goto L37
            android.content.Context r2 = r8.requireContext()
            com.instagram.common.session.UserSession r4 = r8.A0V
            r0 = 2
            X.PUh r7 = new X.PUh
            r7.<init>(r8, r0)
            r0 = 14
            X.DvH r5 = new X.DvH
            r5.<init>(r8, r0)
            r0 = 19
            X.DvH r6 = new X.DvH
            r6.<init>(r8, r0)
            X.AbstractC151826sS.A01(r2, r3, r4, r5, r6, r7)
        L37:
            return
        L38:
            if (r9 != r2) goto L37
            if (r0 != r10) goto L37
            X.AbstractC25226BEj.A1P(r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C31721DwQ.onActivityResult(int, int, android.content.Intent):void");
    }

    public static ProfileCoinFlipView A00(C31721DwQ c31721DwQ) {
        ProfileCoinFlipView profileCoinFlipView;
        if (c31721DwQ.A0n == null || c31721DwQ.A1H == null || (profileCoinFlipView = c31721DwQ.A0S) == null || c31721DwQ.A0R == null) {
            return null;
        }
        C74K.A03(profileCoinFlipView.getContext(), profileCoinFlipView, c31721DwQ.A0V, null, R.dimen.action_button_min_width);
        c31721DwQ.A0S.setProfilePicUrl(c31721DwQ.A0s.Bhu(), c31721DwQ);
        c31721DwQ.A0S.setAvatarDrawables(c31721DwQ.A0n.A01(c31721DwQ.A0R));
        ProfileCoinFlipView profileCoinFlipView2 = c31721DwQ.A0S;
        C74K.A01(profileCoinFlipView2.getContext(), c31721DwQ.A0R, profileCoinFlipView2, c31721DwQ, c31721DwQ.A0V);
        if (!AbstractC31248DoW.A01(c31721DwQ.A0V)) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) c31721DwQ.A0S.getLayoutParams();
            marginLayoutParams.topMargin = AbstractC25228BEl.A0M(c31721DwQ.A0S).getDimensionPixelSize(R.dimen.edit_profile_frame_pop_offset);
            c31721DwQ.A0S.setLayoutParams(marginLayoutParams);
        }
        c31721DwQ.A0Q = new C74H(c31721DwQ.A1H, EnumC152426tV.A03, c31721DwQ.A0S, null, new C65881Tvk(3), new C31651DvH(c31721DwQ, 23), new C31651DvH(c31721DwQ, 24), new C65881Tvk(4), AbstractC31248DoW.A01(c31721DwQ.A0V), true, false);
        return c31721DwQ.A0S;
    }

    public static C151696sF A01(C31721DwQ c31721DwQ) {
        InterfaceC56392iX interfaceC56392iX = c31721DwQ.A0c;
        if (interfaceC56392iX == null) {
            interfaceC56392iX = AbstractC166997dE.A0X(c31721DwQ.A03, R.id.avatar_view_stub);
            c31721DwQ.A0c = interfaceC56392iX;
        }
        ProfileCoinFlipView profileCoinFlipView = (ProfileCoinFlipView) interfaceC56392iX.getView().requireViewById(R.id.avatar_view);
        AbstractC010103p.A0B(profileCoinFlipView, new C50827MdK(c31721DwQ, 1));
        UserSession userSession = c31721DwQ.A0V;
        Context requireContext = c31721DwQ.requireContext();
        WeakReference A16 = AbstractC25225BEi.A16(c31721DwQ.requireActivity());
        WeakReference A162 = AbstractC25225BEi.A16(c31721DwQ);
        ConstraintLayout constraintLayout = c31721DwQ.A1H;
        InterfaceC56392iX interfaceC56392iX2 = c31721DwQ.A0b;
        if (interfaceC56392iX2 == null) {
            InterfaceC56392iX interfaceC56392iX3 = c31721DwQ.A0c;
            if (interfaceC56392iX3 == null) {
                interfaceC56392iX3 = AbstractC166997dE.A0X(c31721DwQ.A03, R.id.avatar_view_stub);
                c31721DwQ.A0c = interfaceC56392iX3;
            }
            interfaceC56392iX2 = AbstractC166997dE.A0X(interfaceC56392iX3.getView(), R.id.avatar_new_badge_view_stub);
            c31721DwQ.A0b = interfaceC56392iX2;
        }
        ConstraintLayout constraintLayout2 = c31721DwQ.A1H;
        IgFrameLayout igFrameLayout = c31721DwQ.A1J;
        InterfaceC56392iX interfaceC56392iX4 = c31721DwQ.A0c;
        if (interfaceC56392iX4 == null) {
            interfaceC56392iX4 = AbstractC166997dE.A0X(c31721DwQ.A03, R.id.avatar_view_stub);
            c31721DwQ.A0c = interfaceC56392iX4;
        }
        C151696sF c151696sF = new C151696sF(requireContext, constraintLayout, profileCoinFlipView, c31721DwQ, userSession, interfaceC56392iX2, new C151706sG(igFrameLayout, interfaceC56392iX4.getView(), constraintLayout2), A16, A162, new C31651DvH(c31721DwQ, 15), new C31651DvH(c31721DwQ, 16), new C31651DvH(c31721DwQ, 19), new C31651DvH(c31721DwQ, 17), new C31651DvH(c31721DwQ, 18), new GRS(c31721DwQ, 6));
        c31721DwQ.requireActivity().getLifecycle().A09(c151696sF);
        return c151696sF;
    }

    private void A04() {
        C97N.A00(C97M.A00(this.A0V)).AV3(new C9CN(CallerContext.A00(C31721DwQ.class), AbstractC111324zv.A00(2483), "ig_edit_profile", "edit_profile", "loading"), C97J.A00, new C35918Ftc(this, 0));
    }

    public static void A05(View view, C31721DwQ c31721DwQ) {
        if (c31721DwQ.A10) {
            view.setAlpha(0.3f);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x003f, code lost:
    
        if (r4.A0N().isEmpty() == false) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0047, code lost:
    
        if (r4.A03.getProfilePicId() != null) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0059, code lost:
    
        if (r4.getFullName().isEmpty() == false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0069, code lost:
    
        if (r4.A0N().isEmpty() == false) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void A06(X.C31721DwQ r5) {
        /*
            android.view.View r1 = r5.A03
            r0 = 2131432937(0x7f0b15e9, float:1.8487646E38)
            android.view.View r2 = r1.findViewById(r0)
            com.instagram.common.session.UserSession r0 = r5.A0V
            com.instagram.user.model.User r4 = X.AbstractC166987dD.A10(r0)
            if (r2 == 0) goto L4c
            com.instagram.common.session.UserSession r5 = r5.A0V
            X.0Tz r3 = X.C06090Tz.A05
            r0 = 36324402438221978(0x810cda0002309a, double:3.0350365963354657E-306)
            boolean r3 = X.AbstractC31178DnM.A1X(r3, r5, r0)
            r1 = 1
            java.lang.String r0 = r4.getFullName()
            if (r3 == 0) goto L4f
            if (r0 == 0) goto L4d
            java.lang.String r0 = r4.getFullName()
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L4d
            java.lang.String r0 = r4.A0N()
            if (r0 == 0) goto L4d
            java.lang.String r0 = r4.A0N()
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L4d
        L41:
            X.17P r0 = r4.A03
            java.lang.String r0 = r0.getProfilePicId()
            if (r0 == 0) goto L4d
        L49:
            r2.setEnabled(r1)
        L4c:
            return
        L4d:
            r1 = 0
            goto L49
        L4f:
            if (r0 == 0) goto L5b
            java.lang.String r0 = r4.getFullName()
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L49
        L5b:
            java.lang.String r0 = r4.A0N()
            if (r0 == 0) goto L41
            java.lang.String r0 = r4.A0N()
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L49
            goto L41
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C31721DwQ.A06(X.DwQ):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0028, code lost:
    
        if (r1 == false) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void A07(X.C31721DwQ r2) {
        /*
            X.FOh r1 = r2.A0f
            if (r1 == 0) goto L39
            android.view.View r0 = r2.mView
            if (r0 == 0) goto L39
            java.lang.String r0 = r1.A0D
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            android.widget.TextView r1 = r2.A0L
            if (r0 == 0) goto L3a
            X.AbstractC31171DnF.A14(r1)
            android.widget.TextView r1 = r2.A0L
            r0 = 2131952304(0x7f1302b0, float:1.9541047E38)
        L1a:
            r1.setHint(r0)
            X.FOh r0 = r2.A0f
            java.lang.Boolean r0 = r0.A07
            if (r0 == 0) goto L2a
            boolean r1 = r0.booleanValue()
            r0 = 1
            if (r1 != 0) goto L2b
        L2a:
            r0 = 0
        L2b:
            com.instagram.ui.widget.textview.ImageWithTitleTextView r1 = r2.A1M
            if (r0 == 0) goto L47
            r0 = 0
            r1.setVisibility(r0)
            com.instagram.ui.widget.textview.ImageWithTitleTextView r1 = r2.A1M
            r0 = 7
            X.ViewOnClickListenerC31723DwS.A01(r1, r0, r2)
        L39:
            return
        L3a:
            X.FOh r0 = r2.A0f
            java.lang.String r0 = r0.A0D
            r1.setText(r0)
            android.widget.TextView r1 = r2.A0L
            r0 = 2131961585(0x7f1326f1, float:1.9559871E38)
            goto L1a
        L47:
            r0 = 8
            r1.setVisibility(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C31721DwQ.A07(X.DwQ):void");
    }

    public static void A08(C31721DwQ c31721DwQ) {
        TextView textView;
        int i;
        C34649FOh c34649FOh = c31721DwQ.A0f;
        if (c34649FOh != null && c31721DwQ.mView != null) {
            if (!TextUtils.isEmpty(c34649FOh.A0M) && c31721DwQ.A0f.A0Z) {
                int color = c31721DwQ.requireContext().getColor(R.color.design_dark_default_color_on_background);
                Drawable drawable = c31721DwQ.A1N.A01;
                if (drawable != null) {
                    AbstractC166997dE.A1F(drawable.mutate(), color);
                }
                c31721DwQ.A1N.setVisibility(0);
                ViewOnClickListenerC31723DwS.A01(c31721DwQ.A1N, 8, c31721DwQ);
            } else {
                c31721DwQ.A1N.setVisibility(8);
            }
            boolean isEmpty = TextUtils.isEmpty(c31721DwQ.A0f.A0M);
            TextView textView2 = c31721DwQ.A0M;
            if (!isEmpty) {
                textView2.setText(c31721DwQ.A0f.A0M);
                textView = c31721DwQ.A0M;
                i = 2131961607;
            } else {
                AbstractC31171DnF.A14(textView2);
                textView = c31721DwQ.A0M;
                i = 2131952339;
            }
            textView.setHint(i);
        }
    }

    public static void A09(C31721DwQ c31721DwQ) {
        IgFormField igFormField;
        Context requireContext;
        int i;
        String str;
        if (c31721DwQ.A0f != null && c31721DwQ.mView != null && AbstractC31177DnL.A1W(c31721DwQ.A0V)) {
            c31721DwQ.A1L.setVisibility(AbstractC31175DnJ.A01(c31721DwQ.A13 ? 1 : 0));
            c31721DwQ.A1L.getMEditText().setFocusableInTouchMode(false);
            c31721DwQ.requireContext().getString(2131963176);
            c31721DwQ.A1L.setInPickerMode(new ViewOnClickListenerC31724DwT(c31721DwQ, 59));
            A05(c31721DwQ.A1L, c31721DwQ);
            C36576GBa c36576GBa = c31721DwQ.A1O;
            c36576GBa.A00 = false;
            C34649FOh c34649FOh = c31721DwQ.A0f;
            int i2 = c34649FOh.A00;
            if (i2 != 1) {
                if (i2 != 2) {
                    igFormField = c31721DwQ.A1L;
                    if (i2 != 4) {
                        requireContext = c31721DwQ.requireContext();
                        i = 2131963178;
                    } else {
                        str = c34649FOh.A0C;
                        str.getClass();
                        igFormField.setText(str);
                        c36576GBa.A00 = true;
                    }
                } else {
                    igFormField = c31721DwQ.A1L;
                    requireContext = c31721DwQ.requireContext();
                    i = 2131963174;
                }
            } else {
                igFormField = c31721DwQ.A1L;
                requireContext = c31721DwQ.requireContext();
                i = 2131963175;
            }
            str = requireContext.getString(i);
            igFormField.setText(str);
            c36576GBa.A00 = true;
        }
    }

    public static void A0A(C31721DwQ c31721DwQ) {
        if (Boolean.TRUE.equals(Boolean.valueOf(AbstractC167007dF.A1T(AbstractC31174DnI.A0m(c31721DwQ.A0V).B2x())))) {
            View requireView = c31721DwQ.requireView();
            TextView A0T = AbstractC166997dE.A0T(requireView, R.id.personal_information_entry_point);
            if (A0T != null) {
                AbstractC56952jT.A01(A0T);
            }
            A0T.setVisibility(AbstractC31175DnJ.A01(c31721DwQ.A13 ? 1 : 0));
            boolean z = C1QI.A0E().A00;
            Context requireContext = c31721DwQ.requireContext();
            AbstractC166987dD.A1O(requireContext, A0T, AbstractC31179DnN.A00(requireContext, c31721DwQ, z ? 1 : 0));
            A05(A0T, c31721DwQ);
            C0fQ.A00(new ViewOnClickListenerC35687FpM(c31721DwQ, c31721DwQ, 16), A0T);
            AbstractC31172DnG.A1J(requireView, R.id.edit_profile_personal_information_fields, 8);
        }
    }

    public static void A0C(C31721DwQ c31721DwQ) {
        if (!c31721DwQ.A15) {
            c31721DwQ.A04();
            C31702Dw7.A00(c31721DwQ, AbstractC152476ta.A06(c31721DwQ.A0V), 0);
        }
    }

    public static void A0D(C31721DwQ c31721DwQ) {
        View view;
        int i;
        String string;
        if (!c31721DwQ.A13 && c31721DwQ.A0f != null && C36A.A0A(c31721DwQ.A0V)) {
            if (C2E7.A03(c31721DwQ.A0s)) {
                c31721DwQ.A1E.setVisibility(0);
                view = c31721DwQ.A03;
                i = R.id.professional_profile_music_settings_stub;
            } else {
                c31721DwQ.A1D.setVisibility(0);
                view = c31721DwQ.A03;
                i = R.id.personal_profile_music_settings_stub;
            }
            View requireViewById = view.requireViewById(i);
            AbstractC31173DnH.A1E(requireViewById, c31721DwQ, 2131968028);
            AbstractC166997dE.A0T(requireViewById, R.id.contact_text).setText(2131968028);
            TextView A0T = AbstractC166997dE.A0T(requireViewById, R.id.contact_summary);
            A0T.setMaxLines(1);
            A0T.setEllipsize(TextUtils.TruncateAt.END);
            Context requireContext = c31721DwQ.requireContext();
            MWW mww = c31721DwQ.A0g;
            if (mww != null) {
                MusicAssetModel musicAssetModel = mww.A02;
                string = String.format(Locale.getDefault(), "%s · %s", musicAssetModel.A0D, musicAssetModel.A0I);
            } else {
                string = requireContext.getString(2131967962);
            }
            A0T.setText(string);
            ViewOnClickListenerC31723DwS.A01(requireViewById, 3, c31721DwQ);
        }
    }

    public static void A0E(C31721DwQ c31721DwQ) {
        String string;
        String A00;
        boolean z;
        if (c31721DwQ.A0f != null) {
            UserSession userSession = c31721DwQ.A0V;
            if (C18U.A06(AbstractC25225BEi.A0j(userSession, 0), userSession, 36324685906129288L)) {
                C34649FOh c34649FOh = c31721DwQ.A0f;
                C128555rO c128555rO = c34649FOh.A03;
                if (c128555rO != null) {
                    string = CK7.A00(c128555rO);
                    A00 = AbstractC111324zv.A00(5249);
                    z = true;
                } else {
                    if (!c34649FOh.A0S) {
                        return;
                    }
                    string = AbstractC166997dE.A0N(c31721DwQ).getString(2131972919);
                    A00 = AbstractC111324zv.A00(1247);
                    z = false;
                }
                c31721DwQ.A1F.setVisibility(0);
                View requireViewById = c31721DwQ.A03.requireViewById(R.id.school_settings_stub);
                AbstractC31173DnH.A1E(requireViewById, c31721DwQ, 2131972920);
                AbstractC166997dE.A0T(requireViewById, R.id.contact_text).setText(2131972920);
                TextView A0T = AbstractC166997dE.A0T(requireViewById, R.id.contact_summary);
                A0T.setMaxLines(1);
                A0T.setEllipsize(TextUtils.TruncateAt.END);
                A0T.setText(string);
                if (z) {
                    AbstractC166987dD.A1O(c31721DwQ.requireContext(), A0T, AbstractC53242c7.A07(c31721DwQ.requireContext()));
                }
                C0fQ.A00(new ViewOnClickListenerC35671Fp6(A00, c31721DwQ, 14), requireViewById);
            }
        }
    }

    public static void A0F(C31721DwQ c31721DwQ) {
        ViewGroup.LayoutParams layoutParams;
        C3DN A0r;
        if (c31721DwQ.A0n != null && c31721DwQ.A0S != null && c31721DwQ.A0Y != null && c31721DwQ.A1J != null && c31721DwQ.A0c != null && c31721DwQ.A0j != null) {
            FragmentActivity activity = c31721DwQ.getActivity();
            if (activity != null && (A0r = AbstractC31172DnG.A0r(activity)) != null && !((C3DP) A0r).A0b) {
                A0r.A0B();
            }
            c31721DwQ.A0S.setVisibility(8);
            c31721DwQ.A0Y.setVisibility(0);
            if (c31721DwQ.A0X != null) {
                if (AbstractC73003Pb.A02(c31721DwQ.A0V, c31721DwQ.A0s)) {
                    c31721DwQ.A0X.setVisibility(0);
                }
            }
            c31721DwQ.A1J.setVisibility(0);
            View view = c31721DwQ.A0c.getView();
            view.setScaleX(Math.abs(view.getScaleX()));
            view.setVisibility(0);
            C151696sF c151696sF = c31721DwQ.A0n;
            View view2 = c151696sF.A05;
            if (view2 != null && (layoutParams = view2.getLayoutParams()) != null) {
                Context context = c151696sF.A04;
                layoutParams.width = (context.getResources().getDimensionPixelOffset(R.dimen.action_button_min_width) * 2) + context.getResources().getDimensionPixelOffset(R.dimen.abc_dialog_padding_top_material);
            }
        }
    }

    public static void A0G(C31721DwQ c31721DwQ) {
        C31370Dqa c31370Dqa;
        AvatarCoinFlipConfig avatarCoinFlipConfig;
        if (c31721DwQ.A10) {
            A0K(c31721DwQ, "edit_photo_and_avatar");
            return;
        }
        if (!AbstractC31248DoW.A05(c31721DwQ.A0V) && C20Y.A00(c31721DwQ.A0V).A01.A00 == C125535lz.A00) {
            UserSession userSession = c31721DwQ.A0V;
            C14360o3.A0B(userSession, 1);
            if (AbstractC31248DoW.A06(userSession, true) && (c31370Dqa = c31721DwQ.A0j) != null && (avatarCoinFlipConfig = c31721DwQ.A0R) != null && !avatarCoinFlipConfig.A08) {
                String str = c31721DwQ.A0V.userId;
                C14360o3.A0B(str, 0);
                InterfaceC19630xq interfaceC19630xq = c31370Dqa.A0A.A00.A00;
                String A00 = MSV.A00(162);
                if (!AbstractC31174DnI.A1X(interfaceC19630xq, A00, str)) {
                    AbstractC31175DnJ.A0N(c31721DwQ.A0V).A02(c31721DwQ.requireActivity(), AbstractC33780Ew6.A00(c31721DwQ.A0R, "edit_profile"));
                    C31370Dqa c31370Dqa2 = c31721DwQ.A0j;
                    String str2 = c31721DwQ.A0V.userId;
                    C14360o3.A0B(str2, 0);
                    AbstractC31177DnL.A1M(c31370Dqa2.A0A.A00.A00.ARD(), A00, str2, true);
                    EnumC69993Ci enumC69993Ci = A1c;
                    C3CZ.A0B = enumC69993Ci;
                    UserSession userSession2 = c31721DwQ.A0V;
                    Long.parseLong(userSession2.userId);
                    AbstractC31719DwO.A00(enumC69993Ci, userSession2, "change_profile_photo_button_clicked", "photo_editing", null, null, null);
                }
            }
        }
        if (c31721DwQ.A0P()) {
            return;
        }
        A0B(c31721DwQ);
        EnumC69993Ci enumC69993Ci2 = A1c;
        C3CZ.A0B = enumC69993Ci2;
        UserSession userSession22 = c31721DwQ.A0V;
        Long.parseLong(userSession22.userId);
        AbstractC31719DwO.A00(enumC69993Ci2, userSession22, "change_profile_photo_button_clicked", "photo_editing", null, null, null);
    }

    public static void A0H(C31721DwQ c31721DwQ) {
        C32281EJs A05;
        C33613EtP c33613EtP;
        c31721DwQ.A0f.getClass();
        C33601EtD c33601EtD = c31721DwQ.A0f.A06;
        if (c33601EtD != null && (c33613EtP = c33601EtD.A00) != null) {
            A05 = AbstractC31364DqT.A02().A05(c31721DwQ.A0s, c31721DwQ.A0f.A0F, c33613EtP.A00, c33613EtP.A01, c33613EtP.A02, c33613EtP.A03);
        } else {
            A05 = AbstractC31364DqT.A02().A05(c31721DwQ.A0s, c31721DwQ.A0f.A0F, "", "", false, false);
        }
        FragmentActivity activity = c31721DwQ.getActivity();
        if (activity != null) {
            AbstractC31177DnL.A15(A05, activity, c31721DwQ.A0V);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:68:0x0282, code lost:
    
        if (r1.equals("variant_get_a_verified_badge") != false) goto L90;
     */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01e4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void A0I(X.C31721DwQ r9) {
        /*
            Method dump skipped, instructions count: 657
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C31721DwQ.A0I(X.DwQ):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:120:0x037e, code lost:
    
        if (X.C2E7.A00(r11.A0s) != false) goto L102;
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x0155, code lost:
    
        if (r1 == false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0120, code lost:
    
        if (r0.booleanValue() != false) goto L31;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void A0J(X.C31721DwQ r11) {
        /*
            Method dump skipped, instructions count: 975
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C31721DwQ.A0J(X.DwQ):void");
    }

    public static void A0L(C31721DwQ c31721DwQ, String str) {
        C44306Jhx c44306Jhx;
        C151696sF c151696sF = c31721DwQ.A0n;
        if (c151696sF != null) {
            C14360o3.A0B(str, 0);
            ProfileCoinFlipView profileCoinFlipView = c151696sF.A06;
            if (profileCoinFlipView != null) {
                Drawable drawable = ((AbstractC1569172v) profileCoinFlipView).A03.getDrawable();
                String str2 = null;
                if ((drawable instanceof C44306Jhx) && (c44306Jhx = (C44306Jhx) drawable) != null) {
                    str2 = c44306Jhx.A0D;
                }
                if (!str.equals(str2)) {
                    AbstractC31171DnF.A08(profileCoinFlipView, R.id.avatar).setScaleType(ImageView.ScaleType.FIT_XY);
                    profileCoinFlipView.setAvatarImageDrawable(C151696sF.A00(c151696sF, str, 0.0f));
                    AbstractC166997dE.A18(c151696sF.A04, profileCoinFlipView, 2131961566);
                }
            }
        }
    }

    public static void A0M(C31721DwQ c31721DwQ, String str, String str2, Map map) {
        BusinessFlowAnalyticsLogger businessFlowAnalyticsLogger = c31721DwQ.A1I;
        if (businessFlowAnalyticsLogger != null) {
            businessFlowAnalyticsLogger.Cm3(new Y7A(str, "edit_profile", str2, null, null, map, null, null));
        }
    }

    public static void A0N(C31721DwQ c31721DwQ, boolean z) {
        View view = c31721DwQ.mView;
        if (view != null) {
            int i = 0;
            view.requireViewById(R.id.edit_profile_fields).setVisibility(AbstractC167007dF.A05(z ? 1 : 0));
            View requireViewById = c31721DwQ.mView.requireViewById(R.id.loading_spinner);
            if (z) {
                i = 8;
            }
            requireViewById.setVisibility(i);
        }
    }

    private boolean A0O() {
        C34649FOh c34649FOh = this.A0f;
        if (c34649FOh == null || F9Q.A00(this.A0V, c34649FOh) == C05F.A00) {
            return false;
        }
        return true;
    }

    private boolean A0P() {
        C34649FOh c34649FOh = this.A0f;
        if (c34649FOh == null || F9Q.A00(this.A0V, c34649FOh) != C05F.A01) {
            return false;
        }
        return true;
    }

    public static boolean A0Q(C31721DwQ c31721DwQ) {
        C31590DuI c31590DuI = c31721DwQ.A0U;
        if (c31590DuI == null || !TextUtils.isEmpty(c31590DuI.A02) || !c31721DwQ.A0s.A2H()) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC37218GaT
    public final AiStudioProfileBannerModel Aak() {
        C31822Dyg c31822Dyg = this.A0i;
        if (c31822Dyg == null) {
            return null;
        }
        return (AiStudioProfileBannerModel) AbstractC31172DnG.A0E(c31822Dyg.A02).A02();
    }

    @Override // X.InterfaceC37218GaT
    public final View.OnClickListener B8x() {
        return ViewOnClickListenerC31723DwS.A00(this, 11);
    }

    @Override // X.AbstractC59972of
    public final void afterOnViewCreated() {
        if (this.A0j != null) {
            UserSession userSession = this.A0V;
            C14360o3.A0B(userSession, 1);
            if (AbstractC31248DoW.A06(userSession, true)) {
                C31370Dqa c31370Dqa = this.A0j;
                AbstractC31176DnK.A1Z(c31370Dqa, AbstractC141776au.A00(c31370Dqa), 14);
            }
        }
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        AbstractC31179DnN.A1K(this, 8);
        super.onConfigurationChanged(configuration);
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.A03 = view;
        ScrollView scrollView = (ScrollView) view.requireViewById(R.id.edit_profile_fields);
        this.A0D = scrollView;
        if (this.A13) {
            scrollView.setFillViewport(true);
        }
        this.A1H = (ConstraintLayout) view.requireViewById(R.id.profile_pic_and_avatar_container);
        this.A0Y = AbstractC31172DnG.A0Z(view, R.id.profile_pic_imageview);
        this.A0X = AbstractC31173DnH.A0T(view, R.id.profile_pic_birthday_confetti_imageview);
        this.A1J = (IgFrameLayout) view.requireViewById(R.id.profile_pic_wrapper);
        this.A1H.setVisibility(AbstractC31175DnJ.A01(this.A13 ? 1 : 0));
        C3P9 c3p9 = new C3P9(this.A0Y);
        c3p9.A0D = true;
        c3p9.A07 = true;
        c3p9.A04 = new C56157OwP(this, 1);
        c3p9.A00();
        TitleTextView titleTextView = (TitleTextView) view.requireViewById(R.id.change_avatar_button);
        this.A0W = titleTextView;
        AbstractC56952jT.A01(titleTextView);
        TitleTextView titleTextView2 = this.A0W;
        Context requireContext = requireContext();
        int i = 2131961639;
        if (AbstractC31248DoW.A05(this.A0V)) {
            i = 2131955025;
        }
        AbstractC31173DnH.A12(requireContext, titleTextView2, i);
        this.A0W.setTextAppearance(requireContext(), R.style.igds_emphasized_body_1);
        TitleTextView titleTextView3 = this.A0W;
        boolean z = C1QI.A0E().A00;
        Context requireContext2 = requireContext();
        AbstractC166987dD.A1O(requireContext2, titleTextView3, AbstractC31179DnN.A00(requireContext2, this, z ? 1 : 0));
        this.A0W.setVisibility(AbstractC31175DnJ.A01(this.A13 ? 1 : 0));
        A05(this.A0W, this);
        ViewOnClickListenerC31724DwT.A01(this.A0W, this, 67);
        this.A0L = AbstractC166997dE.A0T(view, R.id.email);
        this.A0M = AbstractC166997dE.A0T(view, R.id.phone);
        this.A1L = AbstractC31172DnG.A0k(view, R.id.gender);
        View requireViewById = view.requireViewById(R.id.edit_personal_ads_link);
        this.A02 = requireViewById;
        requireViewById.setVisibility(8);
        this.A05 = AbstractC31173DnH.A0G(view, R.id.account_category_stub);
        this.A0B = AbstractC31173DnH.A0G(view, R.id.featured_accounts_stub);
        this.A1B = AbstractC31173DnH.A0G(view, R.id.business_category_stub);
        this.A1C = AbstractC31173DnH.A0G(view, R.id.collab_status_stub);
        this.A0A = AbstractC31173DnH.A0G(view, R.id.diversity_info_stub);
        this.A06 = AbstractC31173DnH.A0G(view, R.id.business_contact_stub);
        this.A08 = AbstractC31173DnH.A0G(view, R.id.business_profile_display_stub);
        this.A1E = AbstractC31173DnH.A0G(view, R.id.professional_profile_music_settings_stub);
        this.A1D = AbstractC31173DnH.A0G(view, R.id.personal_profile_music_settings_stub);
        this.A1F = AbstractC31173DnH.A0G(view, R.id.school_settings_stub);
        this.A01 = view.requireViewById(R.id.business_conversion_section);
        this.A07 = AbstractC31173DnH.A0G(view, R.id.business_page_stub);
        TextView A0T = AbstractC166997dE.A0T(view, R.id.business_header);
        this.A0F = A0T;
        AbstractC56932jR.A03(A0T);
        this.A09 = AbstractC31173DnH.A0G(view, R.id.business_support_links_stub);
        this.A1M = (ImageWithTitleTextView) view.requireViewById(R.id.confirm_your_email);
        this.A1N = (ImageWithTitleTextView) view.requireViewById(R.id.confirm_your_phone_number);
        this.A0I = AbstractC166997dE.A0T(view, R.id.profile_data_transparency);
        ViewOnClickListenerC31724DwT.A01(this.A0L, this, 68);
        ViewOnClickListenerC31724DwT.A01(this.A0M, this, 69);
        if (this.A0f != null) {
            A0I(this);
            A0N(this, true);
        } else {
            A0N(this, false);
        }
        if (AbstractC35181FfY.A03(this.A0V, this.A0s)) {
            UserSession userSession = this.A0V;
            C32539EUp.A00(this, AbstractC152476ta.A08(userSession, userSession.userId), 42);
            this.A0B.setVisibility(0);
            this.A0w = AbstractC166987dD.A1E();
            ListView listView = (ListView) this.A03.requireViewById(R.id.featured_accounts_list_view);
            this.A0C = listView;
            listView.setAdapter((ListAdapter) this.A0k);
            LJW.A00(this.A0C);
        }
        String AY1 = this.A0s.A03.AY1();
        if (AY1 != null && AY1.length() != 0) {
            this.A05.setVisibility(0);
            View requireViewById2 = this.A03.requireViewById(R.id.account_category);
            TextView A0T2 = AbstractC166997dE.A0T(requireViewById2, R.id.account_category_text);
            this.A0E = A0T2;
            A0T2.setText(this.A0s.A03.AY1());
            ViewOnClickListenerC31723DwS.A01(requireViewById2, 5, this);
        }
        if (!AbstractC31248DoW.A05(this.A0V)) {
            this.A0j = (C31370Dqa) new C52942bb(new C31362DqR(this.A0V, "edit_profile"), requireActivity()).A00(C31370Dqa.class);
        }
        this.A0P = (C60852q9) AbstractC31175DnJ.A0A(this).A00(C60852q9.class);
        if (!AbstractC31248DoW.A05(this.A0V)) {
            InterfaceC56392iX interfaceC56392iX = this.A0c;
            if (interfaceC56392iX == null) {
                interfaceC56392iX = AbstractC166997dE.A0X(this.A03, R.id.avatar_view_stub);
                this.A0c = interfaceC56392iX;
            }
            this.A0c = interfaceC56392iX;
            interfaceC56392iX.setVisibility(0);
            UserSession userSession2 = this.A0V;
            if (C18U.A06(AbstractC25225BEi.A0j(userSession2, 0), userSession2, 36315915583557327L)) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.A0c.getView().getLayoutParams();
                marginLayoutParams.topMargin -= AbstractC25228BEl.A0M(this.A0c.getView()).getDimensionPixelSize(R.dimen.edit_profile_frame_pop_offset);
                this.A0c.getView().setLayoutParams(marginLayoutParams);
            }
        }
        this.A0n = A01(this);
        if (AbstractC31248DoW.A05(this.A0V)) {
            InterfaceC56392iX interfaceC56392iX2 = this.A0c;
            if (interfaceC56392iX2 != null) {
                AbstractC31172DnG.A1T(interfaceC56392iX2, 8);
            }
        } else {
            this.A0n.A02();
            UserSession userSession3 = this.A0n.A09;
            if (!C14360o3.A0K(C20Y.A00(userSession3).A01.A00, C125535lz.A00) && !C21B.A00(userSession3).A00.getBoolean("has_seen_avatar_upsell_dialog_in_edit_profile", false) && !AbstractC1565371b.A00(userSession3)) {
                C151696sF c151696sF = this.A0n;
                Activity activity = (Activity) c151696sF.A0C.get();
                if (activity != null) {
                    AbstractC46619Kjw.A00(activity, null, null, c151696sF.A07, c151696sF.A09, "ig_edit_profile", AbstractC43591JPw.A00(389), 2131956938);
                }
                AbstractC31177DnL.A1N(C21B.A00(c151696sF.A09).A00, "has_seen_avatar_upsell_dialog_in_edit_profile", true);
            }
        }
        if (!AbstractC31248DoW.A05(this.A0V)) {
            UserSession userSession4 = this.A0V;
            C14360o3.A0B(userSession4, 1);
            if (AbstractC31248DoW.A06(userSession4, true)) {
                this.A0S = (ProfileCoinFlipView) AbstractC31177DnL.A0U(this.A03, R.id.profile_coin_flip_view_stub).A01().findViewById(R.id.profile_coin_flip_view);
            }
            C31370Dqa c31370Dqa = this.A0j;
            if (c31370Dqa != null) {
                C31470DsE.A01(getViewLifecycleOwner(), c31370Dqa.A02, this, 33);
            }
            C31370Dqa c31370Dqa2 = this.A0j;
            if (c31370Dqa2 != null) {
                C31470DsE.A01(getViewLifecycleOwner(), c31370Dqa2.A00, this, 32);
            }
        }
        C60852q9 c60852q9 = this.A0P;
        c60852q9.getClass();
        Context requireContext3 = requireContext();
        UserSession userSession5 = this.A0V;
        AbstractC151826sS.A02(requireContext3, getViewLifecycleOwner(), this.A0O, c60852q9, userSession5, A01(this), "ig_edit_profile", new C31651DvH(this, 20), new C31651DvH(this, 21), new GRY(this, 1), new C57093PUg(this, 1));
        C31822Dyg c31822Dyg = this.A0i;
        UserSession userSession6 = this.A0V;
        C06090Tz A0j = AbstractC25225BEi.A0j(userSession6, 0);
        if (C18U.A06(A0j, userSession6, 36325081043120825L) && c31822Dyg != null) {
            c31822Dyg.A00();
            C31470DsE.A01(getViewLifecycleOwner(), AbstractC31172DnG.A0E(c31822Dyg.A02), this, 35);
        }
        C14360o3.A0B(this.A0V, 0);
        C35929Ftn c35929Ftn = new C35929Ftn(this, 2);
        FragmentActivity requireActivity = requireActivity();
        requireActivity.getSupportFragmentManager().A0u(new C35758Fqv(c35929Ftn, 3), requireActivity, "page_linking_request");
        A03();
        C57012jc c57012jc = this.A0a;
        if (c57012jc != null) {
            c57012jc.A03(8);
        }
        C23031Ai A00 = AbstractC23021Ah.A00(this.A0V);
        InterfaceC19630xq interfaceC19630xq = A00.A01;
        int i2 = interfaceC19630xq.getInt("mpp_megaphone_impression_count", 0);
        int i3 = interfaceC19630xq.getInt("mpp_megaphone_dismiss_count", 0);
        boolean z2 = interfaceC19630xq.getBoolean("has_clicked_on_cta_mpp_megaphone", false);
        if (this.A0a == null) {
            UserSession userSession7 = this.A0V;
            C14360o3.A0B(userSession7, 0);
            if (i2 < AbstractC25225BEi.A07(A0j, userSession7, 36611310548752652L)) {
                UserSession userSession8 = this.A0V;
                C14360o3.A0B(userSession8, 0);
                if (i3 < AbstractC25225BEi.A07(A0j, userSession8, 36611310548687115L) && !z2) {
                    UserSession userSession9 = this.A0V;
                    C14360o3.A0B(userSession9, 0);
                    if (C18U.A06(A0j, userSession9, 36329835571921449L)) {
                        C57012jc A0U = AbstractC31177DnL.A0U(this.A03, R.id.edit_profile_multiple_profile_picture_megaphone_stub);
                        this.A0a = A0U;
                        IgdsPrismMegaphone igdsPrismMegaphone = (IgdsPrismMegaphone) A0U.A01();
                        igdsPrismMegaphone.setPrimaryButton(AbstractC25228BEl.A0M(igdsPrismMegaphone).getString(2131961633), new ViewOnClickListenerC35687FpM(15, this, A00));
                        igdsPrismMegaphone.A02 = new GRQ(A00, i3, 3);
                        UserSession userSession10 = this.A0V;
                        C14360o3.A0B(userSession10, 0);
                        if (C18U.A06(A0j, userSession10, 36329835571921449L)) {
                            igdsPrismMegaphone.A01.setStyle(EnumC99704do.A06);
                        }
                    }
                }
            }
        }
        C57012jc c57012jc2 = this.A0a;
        if (c57012jc2 != null) {
            c57012jc2.A03(0);
            AbstractC167007dF.A18(interfaceC19630xq, "mpp_megaphone_impression_count", i2 + 1);
        }
        if (this.A13) {
            AbstractC31176DnK.A1E(this.A03, R.id.edit_profile_divider, 8);
            AbstractC31176DnK.A1E(this.A03, R.id.edit_profile_fields_bottom_divider, 8);
            View A0A = AbstractC31178DnM.A0A(this.A03, R.id.complete_your_profile_headline_stubs);
            IgdsHeadline igdsHeadline = (IgdsHeadline) A0A.findViewById(R.id.complete_your_profile_headline_title);
            if (igdsHeadline != null) {
                igdsHeadline.setHeadline(2131956556);
                igdsHeadline.setBody(2131956555);
                igdsHeadline.setCircularImageUrl(AbstractC31174DnI.A0T(this.A0V, C17060sy.A01), null);
            }
            View findViewById = A0A.findViewById(R.id.take_photo_button);
            if (findViewById != null) {
                ViewOnClickListenerC31724DwT.A01(findViewById, this, 61);
            }
            View findViewById2 = A0A.findViewById(R.id.camera_roll_button);
            if (findViewById2 != null) {
                ViewOnClickListenerC31724DwT.A01(findViewById2, this, 62);
            }
            A0A.setVisibility(0);
            View A0A2 = AbstractC31178DnM.A0A(this.A03, R.id.complete_your_profile_bottom_buttons_stubs);
            View findViewById3 = A0A2.findViewById(R.id.finish_button);
            if (findViewById3 != null) {
                ViewOnClickListenerC31723DwS.A01(findViewById3, 12, this);
            }
            A06(this);
            View findViewById4 = A0A2.findViewById(R.id.skip_button);
            if (findViewById4 != null) {
                ViewOnClickListenerC31723DwS.A01(findViewById4, 12, this);
            }
            A0A2.setVisibility(0);
        }
    }

    public static String A02(Context context, CharSequence charSequence, int i) {
        String string = context.getString(i);
        if (TextUtils.isEmpty(charSequence)) {
            return string;
        }
        return StringFormatUtil.formatStrLocaleSafe("%s, %s", charSequence, string);
    }

    private void A03() {
        int i;
        C57012jc c57012jc;
        int i2;
        if ((A0O() || A0P()) && this.mView != null) {
            i = 0;
            if (this.A1K == null) {
                C57012jc A0U = AbstractC31177DnL.A0U(this.A03, R.id.open_ac_profile_detail_stub);
                this.A1K = A0U;
                IgdsBanner igdsBanner = (IgdsBanner) A0U.A01();
                int intValue = F9Q.A00(this.A0V, this.A0f).intValue();
                if (intValue != 2) {
                    if (intValue == 1) {
                        igdsBanner.setBody(2131969102);
                        i2 = 2131969098;
                    }
                    G81.A00(igdsBanner, this, 8);
                    C1571673v.A0B(AbstractC31171DnF.A0D("nme_profile_editing_banner"), this.A0V, false);
                } else {
                    int i3 = 2131969100;
                    if (AbstractC31178DnM.A1X(C06090Tz.A05, this.A0V, 36321580644574840L)) {
                        i3 = 2131969101;
                    }
                    igdsBanner.setBody(i3);
                    i2 = 2131969099;
                }
                igdsBanner.setAction(i2);
                G81.A00(igdsBanner, this, 8);
                C1571673v.A0B(AbstractC31171DnF.A0D("nme_profile_editing_banner"), this.A0V, false);
            }
            c57012jc = this.A1K;
            if (c57012jc == null) {
                return;
            }
        } else {
            c57012jc = this.A1K;
            if (c57012jc == null) {
                return;
            } else {
                i = 8;
            }
        }
        c57012jc.A03(i);
    }

    public static void A0B(C31721DwQ c31721DwQ) {
        C151696sF c151696sF;
        if ((c31721DwQ.A0P() && AbstractC31248DoW.A05(c31721DwQ.A0V)) || (c151696sF = c31721DwQ.A0n) == null) {
            return;
        }
        if (c151696sF.A06()) {
            c31721DwQ.A0n.A04(c31721DwQ.requireActivity());
            return;
        }
        UpdateProfilePicturePagerAdapter$UpdateProfileTabType updateProfilePicturePagerAdapter$UpdateProfileTabType = UpdateProfilePicturePagerAdapter$UpdateProfileTabType.A04;
        UserSession userSession = c31721DwQ.A0V;
        boolean z = c31721DwQ.A0x;
        boolean z2 = !c31721DwQ.A0P();
        C14360o3.A0B(userSession, 1);
        C31720DwP A00 = AbstractC33775Ew1.A00(updateProfilePicturePagerAdapter$UpdateProfileTabType, userSession, "ig_edit_profile", z, z2, true);
        C189448aO A0y = AbstractC25225BEi.A0y(c31721DwQ.A0V);
        A0y.A0f = C31720DwP.__redex_internal_original_name;
        AbstractC31177DnL.A14(c31721DwQ, A00, A0y);
    }

    public static void A0K(C31721DwQ c31721DwQ, String str) {
        AbstractC35176FfT.A02(c31721DwQ.requireContext(), c31721DwQ.A0V, str);
    }

    @Override // X.InterfaceC37218GaT
    public final /* bridge */ /* synthetic */ InterfaceC37280Gbh Bhd() {
        return this.A1O;
    }

    @Override // X.InterfaceC37218GaT
    public final View.OnClickListener CE9() {
        return this.A1R;
    }

    @Override // X.InterfaceC37218GaT
    public final boolean CSq() {
        return !A0O();
    }

    @Override // X.InterfaceC37218GaT
    public final boolean CSt() {
        return !A0O();
    }

    @Override // X.InterfaceC69913Ca
    public final void EnX(Intent intent, int i) {
        if (getContext() != null && AbstractC86593tX.A0o(getContext(), intent)) {
            C12260kU.A06(this, intent, i);
        }
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [X.Ffp, java.lang.Object] */
    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        String string;
        if (getActivity() != null) {
            ?? obj = new Object();
            if (this.A13) {
                string = "";
            } else {
                string = AbstractC166997dE.A0N(this).getString(2131961612);
            }
            obj.A02 = string;
            this.A0N = C31722DwR.A00(new ViewOnClickListenerC31724DwT(this, 63), interfaceC56362iU, obj);
            if (!this.A13) {
                interfaceC56362iU.EkS(true);
                AbstractC31176DnK.A1C(ViewOnClickListenerC31723DwS.A00(this, 12), AbstractC31174DnI.A0K(), interfaceC56362iU);
            } else {
                interfaceC56362iU.EkS(false);
                C3LO A0B = AbstractC31171DnF.A0B();
                A0B.A0F = new C3LP(requireContext(), R.drawable.instagram_settings_pano_outline_24);
                A0B.A05 = 2131966337;
                AbstractC31176DnK.A1B(ViewOnClickListenerC31723DwS.A00(this, 6), A0B, interfaceC56362iU);
            }
            if (this.A0f == null) {
                interfaceC56362iU.setIsLoading(this.A15);
                this.A0N.setBackground(null);
                this.A0N.setButtonResource(R.drawable.instagram_arrow_cw_pano_outline_24);
            }
            this.A0N.setVisibility(8);
        }
    }

    @Override // X.AbstractC59962oe
    public final AbstractC18680vv getSession() {
        return this.A0V;
    }

    /* JADX WARN: Type inference failed for: r3v44, types: [java.lang.Object, X.1oD] */
    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(-2085351862);
        super.onCreate(bundle);
        Bundle requireArguments = requireArguments();
        this.A0V = AbstractC31176DnK.A0S(this);
        this.A0v = AbstractC31173DnH.A0j(requireArguments, "edit_profile_entry");
        this.A13 = requireArguments.getBoolean("is_complete_your_profile", false);
        EditProfileFieldsController editProfileFieldsController = new EditProfileFieldsController(AbstractC018607g.A00(this), this.A0V, this.A13);
        this.A0l = editProfileFieldsController;
        registerLifecycleListener(editProfileFieldsController);
        this.A0s = AbstractC166987dD.A10(this.A0V);
        this.A0U = (C31590DuI) C97N.A00(C97M.A00(this.A0V)).AuS(new C9CN(CallerContext.A00(C31721DwQ.class), AbstractC111324zv.A00(2483), "ig_edit_profile", "edit_profile", "loading"));
        if (C37161oE.A00 == null) {
            C37161oE.A00 = new Object();
        }
        this.A1I = AbstractC151606s6.A00(EnumC151596s5.A07, this, this.A0V, AbstractC166997dE.A0n());
        this.A0o = AbstractC155496ye.A00(this.A0V);
        setRetainInstance(true);
        boolean z = C3CZ.A0G;
        UserSession userSession = this.A0V;
        AbstractC10360h2 A0I = AbstractC31174DnI.A0I(this);
        User user = this.A0s;
        C35905FtP c35905FtP = new C35905FtP(this, 3);
        Integer num = C05F.A0s;
        GRS grs = new GRS(this, 6);
        C14360o3.A0B(userSession, 1);
        AbstractC167007dF.A1F(A0I, 3, user);
        this.A0O = new C3CZ(this, A0I, c35905FtP, userSession, user, num, grs);
        this.A0m = new FJX(this.A0V, requireContext());
        if (bundle != null) {
            this.A18 = bundle.getBoolean("bundle_request_business_pages_from_ux_flow", false);
            this.A1A = bundle;
        }
        this.A0d = AbstractC69933Cc.A00(requireContext(), this.A0V, this);
        A0C(this);
        C27961Xa A00 = AbstractC54912fq.A00();
        UserSession userSession2 = this.A0V;
        HashMap A1G = AbstractC166987dD.A1G();
        A1G.put(QPTooltipAnchor.A0v, new GCS());
        C64742wY A05 = A00.A05(userSession2, A1G);
        this.A0q = A05;
        C27961Xa A002 = AbstractC54912fq.A00();
        UserSession userSession3 = this.A0V;
        QuickPromotionSlot quickPromotionSlot = QuickPromotionSlot.A0Q;
        C54922fr A0S = AbstractC31175DnJ.A0S();
        A0S.A01(new C31450Dru(this, 1), A05);
        this.A0p = AbstractC31175DnJ.A0T(this, userSession3, A0S, A002, quickPromotionSlot);
        this.A0T = new C35198Ffq(this, this.A0V, AbstractC166997dE.A0n(), this.A0v);
        this.A0k = new C32409EPk(this, this);
        ArrayList A01 = AbstractC35181FfY.A01(this.A0V, this.A0s);
        C32409EPk c32409EPk = this.A0k;
        List list = c32409EPk.A00;
        list.clear();
        Iterator it = A01.iterator();
        while (it.hasNext()) {
            list.add(new FJW(AbstractC25226BEj.A15(it)));
        }
        C32409EPk.A00(c32409EPk);
        if (AbstractC35181FfY.A03(this.A0V, this.A0s)) {
            UserSession userSession4 = this.A0V;
            C14360o3.A0B(userSession4, 0);
            C32539EUp.A00(this, AbstractC151506rw.A03(userSession4, A01), 41);
        }
        C31470DsE.A00(this, AbstractC155486yb.A00(this.A0V).A01, 34);
        C25671My A003 = AbstractC25651Mw.A00(this.A0V);
        A003.A01(this.A1U, C36100Fwa.class);
        A003.A01(this.A1X, C36102Fwc.class);
        A003.A01(this.A1Y, C3HS.class);
        A003.A01(this.A1V, C36108Fwi.class);
        A003.A01(this.A1Z, C36089FwP.class);
        A003.A01(this.A1a, C36090FwQ.class);
        A003.A01(this.A1b, C2AS.class);
        A003.A01(this.A1T, C36104Fwe.class);
        A003.A01(this.A1W, C36101Fwb.class);
        C30D.A04(requireActivity(), requireContext().getColor(AbstractC53242c7.A0D(requireContext())));
        UserSession userSession5 = this.A0V;
        if (!C18U.A06(AbstractC25225BEi.A0j(userSession5, 0), userSession5, 36328053160754244L)) {
            AbstractC70201WGq.A0D(this.A0V);
        }
        C907442n c907442n = new C907442n(AbstractC25225BEi.A0b(), E5B.class, "FxSettingsPersonalDetailsShouldShowInAc", false);
        UserSession userSession6 = this.A0V;
        C14360o3.A0B(userSession6, 0);
        C31702Dw7.A00(this, AbstractC31178DnM.A0H(c907442n, userSession6), 2);
        C19270xB A0D = AbstractC31171DnF.A0D("contact_point_update");
        C37091o7.A00().Cof(requireContext(), A0D, this.A0V, EnumC39589Hdz.A0L);
        this.A0i = (C31822Dyg) new C52942bb(new EVv(this.A0V), requireActivity()).A00(C31822Dyg.class);
        this.A10 = AbstractC1565371b.A00(this.A0V);
        C0f9.A09(1757777248, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-371930103);
        View inflate = layoutInflater.inflate(R.layout.fragment_edit_profile, viewGroup, false);
        ViewStub A0G = AbstractC31173DnH.A0G(inflate, R.id.edit_profile_fields_stub);
        A0G.setLayoutResource(R.layout.edit_profile_fields);
        registerLifecycleListener(this.A0q);
        ScrollView scrollView = (ScrollView) inflate.requireViewById(R.id.edit_profile_fields);
        UserSession userSession = this.A0V;
        C14360o3.A0B(userSession, 0);
        if (C3BQ.A00(userSession).booleanValue()) {
            C06090Tz c06090Tz = C06090Tz.A05;
            if (C18U.A06(c06090Tz, userSession, 2342172050217517039L)) {
                UserSession userSession2 = this.A0V;
                C14360o3.A0B(userSession2, 0);
                if (C18U.A06(c06090Tz, userSession2, 2342172050218106868L)) {
                    OIW oiw = new OIW(getViewLifecycleOwner(), requireActivity(), this.A0V);
                    this.A0h = oiw;
                    String A00 = MSV.A00(779);
                    AbstractC166987dD.A1Z(new PZQ(oiw, A00, null, 5), C07Y.A00(oiw.A00));
                }
            }
        }
        this.A0l.A0C(A0G.inflate(), scrollView, requireActivity(), getViewLifecycleOwner(), this.A0h, this, this.A0s, true, true);
        C0f9.A09(-1519778800, A02);
        return inflate;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroy() {
        int A02 = C0f9.A02(-2106841943);
        C25671My A00 = AbstractC25651Mw.A00(this.A0V);
        A00.A02(this.A1U, C36100Fwa.class);
        A00.A02(this.A1X, C36102Fwc.class);
        A00.A02(this.A1Y, C3HS.class);
        A00.A02(this.A1V, C36108Fwi.class);
        A00.A02(this.A1Z, C36089FwP.class);
        A00.A02(this.A1a, C36090FwQ.class);
        A00.A02(this.A1b, C2AS.class);
        A00.A02(this.A1T, C36104Fwe.class);
        A00.A02(this.A1W, C36101Fwb.class);
        super.onDestroy();
        C0f9.A09(1515525636, A02);
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        C151706sG c151706sG;
        int A02 = C0f9.A02(1782103383);
        super.onDestroyView();
        C37161oE.A00();
        UserSession userSession = this.A0V;
        String id = this.A0s.getId();
        InterfaceC58091PpG interfaceC58091PpG = this.A1P;
        AbstractC167017dG.A1O(userSession, interfaceC58091PpG);
        Map map = AbstractC54281Nz1.A00(userSession).A01;
        java.util.Set set = (java.util.Set) map.get(id);
        if (set == null) {
            set = AbstractC31171DnF.A0l();
        }
        set.remove(interfaceC58091PpG);
        map.put(id, set);
        unregisterLifecycleListener(this.A0q);
        C151696sF c151696sF = this.A0n;
        if (c151696sF != null && (c151706sG = c151696sF.A0B) != null) {
            ((C55982hj) c151706sG.A02.getValue()).A00();
            ((C55982hj) c151706sG.A03.getValue()).A00();
        }
        C74H c74h = this.A0Q;
        if (c74h != null) {
            c74h.A03();
        }
        C31429DrZ A00 = AbstractC31428DrY.A00(this.A0V);
        if (A00 != null && A00.A00) {
            A00.A03.markerEnd(129898941, (short) 3);
            A00.A00 = false;
        }
        this.A0n = null;
        this.A0D = null;
        this.A0Y = null;
        this.A0X = null;
        this.A0W = null;
        this.A0L = null;
        this.A0M = null;
        this.A1L = null;
        this.A1M = null;
        this.A1N = null;
        this.A0r = null;
        this.A0I = null;
        this.A0N = null;
        this.A04 = null;
        this.A0B = null;
        this.A02 = null;
        this.A0A = null;
        this.A0K = null;
        this.A0J = null;
        this.A0c = null;
        this.A1H = null;
        this.A0a = null;
        this.A1K = null;
        this.A0Z = null;
        this.A1J = null;
        this.A1C = null;
        this.A0H = null;
        this.A0S = null;
        C0f9.A09(-1535535603, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        Window window;
        Window window2;
        int A02 = C0f9.A02(-1995793765);
        super.onPause();
        if (getRootActivity() != null && (window2 = getRootActivity().getWindow()) != null) {
            window2.setSoftInputMode(48);
        }
        AbstractC31179DnN.A1K(this, 0);
        if (getRootActivity() != null && (window = getRootActivity().getWindow()) != null) {
            AbstractC13880nE.A0O(window.getDecorView());
        }
        C0f9.A09(-38924602, A02);
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onResume() {
        Boolean Bw9;
        Window window;
        int A02 = C0f9.A02(-1176107272);
        super.onResume();
        if (getRootActivity() != null && (window = getRootActivity().getWindow()) != null) {
            window.setSoftInputMode(16);
        }
        AbstractC31179DnN.A1K(this, AbstractC167007dF.A05(this.A13 ? 1 : 0));
        if (!this.A13 && !C2E7.A01(this.A0s) && !C4K3.A00(this.A0V) && (Bw9 = this.A0s.A03.Bw9()) != null && Bw9.booleanValue()) {
            this.A01.setVisibility(0);
            TextView A0T = AbstractC166997dE.A0T(this.A01, R.id.business_conversion_entry);
            if (A0T != null) {
                AbstractC56952jT.A01(A0T);
            }
            CallerContext callerContext = C35792FrU.A00;
            boolean z = C1QI.A0E().A00;
            Context requireContext = requireContext();
            AbstractC166987dD.A1O(requireContext, A0T, AbstractC31179DnN.A00(requireContext, this, z ? 1 : 0));
            A0T.setText(2131975085);
            A05(A0T, this);
            ViewOnClickListenerC31724DwT.A01(A0T, this, 70);
        } else {
            this.A01.setVisibility(8);
        }
        A0J(this);
        A04();
        A0D(this);
        A0E(this);
        if (this.A0y || this.A16 || this.A17 || this.A0z) {
            this.A0y = false;
            this.A16 = false;
            this.A17 = false;
            this.A0z = false;
            A0C(this);
        }
        this.A0O.A03();
        UserSession userSession = this.A0V;
        C61972ry A0L = AbstractC31178DnM.A0L(this);
        C14360o3.A0B(userSession, 0);
        User A0Y = AbstractC166997dE.A0Y(userSession);
        C25621Ms A0M = AbstractC31177DnL.A0M(userSession);
        A0M.A0B("fundraiser/can_create_personal_fundraisers/");
        C1ON A0R = AbstractC31172DnG.A0R(null, A0M, C32130EAd.class, C34740FSf.class, false);
        C31714DwJ.A00(A0R, A0Y, 21);
        A0L.schedule(A0R);
        UserSession userSession2 = this.A0V;
        String valueOf = String.valueOf(this.A0s.A03.getFbidV2());
        AbstractC34896FZi.A00 = null;
        AbstractC34896FZi.A01(new C32486ESm(), userSession2, valueOf);
        A06(this);
        C0f9.A09(-1564452687, A02);
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        TextView textView = this.A0L;
        if (textView != null) {
            bundle.putString("bundle_email_field", AbstractC31174DnI.A0u(textView));
        }
        TextView textView2 = this.A0M;
        if (textView2 != null) {
            bundle.putString("bundle_phone_field", AbstractC31174DnI.A0u(textView2));
        }
        bundle.putBoolean("bundle_saved_change", this.A12);
        bundle.putBoolean("bundle_request_business_pages_from_ux_flow", this.A18);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStart() {
        int A02 = C0f9.A02(-2144183342);
        super.onStart();
        this.A0D.getViewTreeObserver().addOnScrollChangedListener(this.A1S);
        C0f9.A09(1692158595, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStop() {
        int A02 = C0f9.A02(-1616910401);
        super.onStop();
        this.A0D.getViewTreeObserver().removeOnScrollChangedListener(this.A1S);
        C0f9.A09(-1293846262, A02);
    }
}
