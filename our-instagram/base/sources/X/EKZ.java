package X;

import android.app.Activity;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.InputFilter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.gallery.Medium;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.widget.imageview.CircularImageView;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.direct.fragment.permanentmedia.DirectAggregatedMediaViewerController;
import com.instagram.igds.components.mediabutton.IgdsMediaButton;
import com.instagram.model.direct.DirectShareTarget;
import com.instagram.model.direct.DirectThreadKey;
import com.instagram.ui.text.backinterceptedittext.BackInterceptEditText;
import com.instagram.ui.widget.framelayout.MediaFrameLayout;
import com.instagram.user.model.User;
import java.util.Map;

/* loaded from: classes6.dex */
public final class EKZ extends AbstractC59962oe implements InterfaceC60072op {
    public static final String __redex_internal_original_name = "DirectDailyPromptsAddResponseFragment";
    public int A00;
    public View A01;
    public View A02;
    public ViewGroup A03;
    public C56352iT A04;
    public IgTextView A05;
    public IgImageView A06;
    public DirectAggregatedMediaViewerController A07;
    public IgdsMediaButton A08;
    public DirectThreadKey A09;
    public BackInterceptEditText A0A;
    public boolean A0B;
    public View A0C;
    public ImageView A0D;
    public ImageView A0E;
    public ImageView A0F;
    public IgTextView A0G;
    public IgTextView A0H;
    public CircularImageView A0I;
    public C3I9 A0J;
    public C36297Fzr A0K;
    public DirectShareTarget A0L;
    public MediaFrameLayout A0M;
    public final InterfaceC09390do A0N;
    public final InterfaceC09390do A0O;
    public final InterfaceC41501vz A0P;
    public final InterfaceC60152ox A0Q;

    public static final void A04(EKZ ekz, boolean z) {
        View view;
        int i = 0;
        if (z && C7HD.A01(AbstractC166987dD.A0r(ekz.A0N))) {
            IgTextView igTextView = ekz.A0H;
            if (igTextView != null) {
                AbstractC31177DnL.A0q(ekz.getContext(), igTextView, R.attr.igds_color_primary_text_on_media);
            }
            CircularImageView circularImageView = ekz.A0I;
            if (circularImageView != null) {
                circularImageView.A0H(AbstractC166997dE.A0N(ekz).getDimensionPixelSize(R.dimen.account_recs_header_image_margin), AbstractC167007dF.A09(ekz.getContext(), R.attr.igds_photo_border));
            }
            view = ekz.A0C;
            if (view == null) {
                return;
            }
        } else {
            IgTextView igTextView2 = ekz.A0H;
            if (igTextView2 != null) {
                AbstractC31177DnL.A0q(ekz.getContext(), igTextView2, R.attr.igds_color_secondary_text);
            }
            CircularImageView circularImageView2 = ekz.A0I;
            if (circularImageView2 != null) {
                circularImageView2.setStrokeAlpha(0);
            }
            view = ekz.A0C;
            if (view == null) {
                return;
            } else {
                i = 8;
            }
        }
        view.setVisibility(i);
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "DirectDailyPromptsResponseCreationFragment";
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        String str2;
        int i;
        String str3;
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        AbstractC008903d.A00(AbstractC31178DnM.A0B(this), new LRT(3, this, view));
        C56352iT A01 = C56342iS.A01(new ViewOnClickListenerC35666Fp0(this, 36), AbstractC31176DnK.A0C(view, R.id.action_bar_container));
        this.A04 = A01;
        A01.A0X(C35893FtD.A00);
        this.A02 = view.findViewById(R.id.root);
        this.A0G = AbstractC31172DnG.A0Y(view, R.id.daily_prompt_title);
        this.A0I = (CircularImageView) view.findViewById(R.id.daily_prompt_profile_picture);
        this.A0H = AbstractC31172DnG.A0Y(view, R.id.daily_prompt_username);
        this.A0A = (BackInterceptEditText) view.findViewById(R.id.daily_prompt_edittext);
        this.A05 = AbstractC31172DnG.A0Y(view, R.id.daily_prompt_max_character_count);
        this.A0M = (MediaFrameLayout) view.findViewById(R.id.daily_prompt_card);
        this.A0D = AbstractC31171DnF.A08(view, R.id.daily_prompts_media_button);
        InterfaceC09390do interfaceC09390do = this.A0N;
        ViewGroup viewGroup = null;
        if (!C7HD.A01(AbstractC166987dD.A0r(interfaceC09390do))) {
            viewGroup = (ViewGroup) view.findViewById(R.id.daily_prompts_media_container);
        }
        this.A03 = viewGroup;
        boolean A012 = C7HD.A01(AbstractC166987dD.A0r(interfaceC09390do));
        int i2 = R.id.daily_prompts_media_preview;
        if (A012) {
            i2 = R.id.daily_prompts_full_bleed_media_preview;
        }
        this.A06 = AbstractC31172DnG.A0a(view, i2);
        this.A0C = view.findViewById(R.id.media_gradient_overlay);
        this.A0F = AbstractC31171DnF.A08(view, R.id.daily_prompts_text_button);
        boolean A013 = C7HD.A01(AbstractC166987dD.A0r(interfaceC09390do));
        int i3 = R.id.daily_prompts_edit_photo_button;
        if (A013) {
            i3 = R.id.daily_prompts_full_bleed_edit_photo_button;
        }
        this.A08 = (IgdsMediaButton) view.findViewById(i3);
        this.A0E = AbstractC31171DnF.A08(view, R.id.send_button);
        this.A01 = view.findViewById(R.id.gallery);
        TextView A0e = AbstractC166987dD.A0e(view, R.id.disclaimer_text);
        int i4 = 2131958962;
        if (C18U.A06(C06090Tz.A05, AbstractC166987dD.A0o(interfaceC09390do), 36328070340754589L)) {
            i4 = 2131958961;
        }
        AbstractC25227BEk.A12(A0e, this, i4);
        MediaFrameLayout mediaFrameLayout = this.A0M;
        if (mediaFrameLayout != null) {
            mediaFrameLayout.A00 = -1.0f;
        }
        ImageView imageView = this.A0F;
        if (imageView != null) {
            imageView.setSelected(true);
        }
        ImageView imageView2 = this.A0F;
        if (imageView2 != null) {
            ViewOnClickListenerC35666Fp0.A00(imageView2, 37, this);
        }
        ImageView imageView3 = this.A0D;
        if (imageView3 != null) {
            ViewOnClickListenerC35666Fp0.A00(imageView3, 38, this);
        }
        ImageView imageView4 = this.A0E;
        if (imageView4 != null) {
            ViewOnClickListenerC35666Fp0.A00(imageView4, 39, this);
        }
        IgTextView igTextView = this.A0G;
        if (igTextView != null) {
            Bundle bundle2 = this.mArguments;
            if (bundle2 == null || (str3 = bundle2.getString("card_gallery_collection_title")) == null) {
                str3 = "";
            }
            igTextView.setText(str3);
        }
        User A0g = AbstractC31176DnK.A0g(C17060sy.A01, interfaceC09390do);
        CircularImageView circularImageView = this.A0I;
        if (circularImageView != null) {
            circularImageView.setUrl(A0g.A0C(), this);
        }
        IgTextView igTextView2 = this.A0H;
        if (igTextView2 != null) {
            AbstractC31173DnH.A1F(igTextView2, A0g);
        }
        BackInterceptEditText backInterceptEditText = this.A0A;
        if (backInterceptEditText != null) {
            C35469Fl4.A00(backInterceptEditText, this, 18);
        }
        BackInterceptEditText backInterceptEditText2 = this.A0A;
        if (backInterceptEditText2 != null) {
            backInterceptEditText2.setFilters(new InputFilter[]{new InputFilter.LengthFilter(140)});
        }
        BackInterceptEditText backInterceptEditText3 = this.A0A;
        if (backInterceptEditText3 != null) {
            backInterceptEditText3.requestFocus();
        }
        BackInterceptEditText backInterceptEditText4 = this.A0A;
        if (backInterceptEditText4 != null) {
            AbstractC13880nE.A0T(backInterceptEditText4);
            InterfaceC09390do interfaceC09390do2 = this.A0O;
            C05A c05a = ((C31836Dyv) interfaceC09390do2.getValue()).A08;
            AnonymousClass191 anonymousClass191 = AnonymousClass191.A00;
            AbstractC31174DnI.A1E(getViewLifecycleOwner(), AbstractC58232lf.A00(anonymousClass191, c05a), new C50261MHq(this, 0), 21);
            AbstractC31174DnI.A1E(getViewLifecycleOwner(), AbstractC58232lf.A00(anonymousClass191, ((C31836Dyv) interfaceC09390do2.getValue()).A09), new C50261MHq(this, 1), 21);
            C3I8 A014 = C3I7.A01(this, false, true);
            this.A0J = A014;
            A014.A9e(this.A0Q);
            IgdsMediaButton igdsMediaButton = this.A08;
            if (igdsMediaButton != null) {
                ViewOnClickListenerC35666Fp0.A00(igdsMediaButton, 40, this);
            }
            AbstractC167007dF.A0x(this.A05);
            C36297Fzr c36297Fzr = this.A0K;
            if (c36297Fzr == null) {
                str = "dailyPromptsLogger";
            } else {
                DirectThreadKey directThreadKey = this.A09;
                str = "threadKey";
                if (directThreadKey != null) {
                    String str4 = directThreadKey.A00;
                    String str5 = directThreadKey.A01;
                    int i5 = requireArguments().getInt("direct_channel_audience_type", 0);
                    String string = requireArguments().getString("channel_user_type");
                    if (string == null) {
                        string = "";
                    }
                    String string2 = requireArguments().getString("card_gallery_entry_point");
                    if (string2 == null) {
                        string2 = "";
                    }
                    Map A0n = AbstractC167007dF.A0n("user_type", string);
                    int hashCode = string2.hashCode();
                    if (hashCode != -562683047) {
                        if (hashCode != 279056467) {
                            if (hashCode == 956980699 && string2.equals("channel_daily_prompt_persistent_banner")) {
                                i = 901;
                                str2 = AbstractC43591JPw.A00(i);
                            }
                            str2 = "thread_view";
                        } else {
                            if (string2.equals("channel_daily_prompt_xma")) {
                                i = 902;
                                str2 = AbstractC43591JPw.A00(i);
                            }
                            str2 = "thread_view";
                        }
                    } else {
                        if (string2.equals("channel_daily_prompt_responses")) {
                            str2 = "add_response_button";
                        }
                        str2 = "thread_view";
                    }
                    C36297Fzr.A02(c36297Fzr, str4, str5, "daily_prompt_response_creation_sheet_rendered", "tap", str2, "daily_prompt_responses_sheet", A0n, i5);
                    return;
                }
            }
            C14360o3.A0F(str);
            throw C00O.createAndThrow();
        }
        throw AbstractC166997dE.A0g();
    }

    public static final void A00(Medium medium, EKZ ekz) {
        float f;
        MediaFrameLayout mediaFrameLayout = ekz.A0M;
        if (mediaFrameLayout != null) {
            if (C7HD.A01(AbstractC166987dD.A0r(ekz.A0N)) && medium != null) {
                f = AbstractC34144F4u.A00(Integer.valueOf(medium.A0B), Integer.valueOf(medium.A04));
            } else {
                f = -1.0f;
            }
            mediaFrameLayout.A00 = f;
        }
    }

    public static final void A01(EKZ ekz) {
        BackInterceptEditText backInterceptEditText = ekz.A0A;
        if (backInterceptEditText != null) {
            AbstractC13880nE.A0O(backInterceptEditText);
            InterfaceC09390do interfaceC09390do = ekz.A0N;
            C189448aO A0g = AbstractC25231BEo.A0g(interfaceC09390do);
            A0g.A0B = AbstractC53242c7.A0H(ekz.requireActivity(), R.attr.statusBarBackgroundColor);
            AbstractC25225BEi.A1Q(A0g, true);
            A0g.A03 = 0.7f;
            A0g.A04 = 0.9f;
            C189478aR A00 = A0g.A00();
            Activity A002 = AbstractC13110lx.A00(ekz.requireActivity());
            UserSession A0M = AbstractC31180DnO.A0M(interfaceC09390do);
            KDR kdr = new KDR();
            Bundle A0b = AbstractC166987dD.A0b();
            AbstractC60492pY.A04(A0b, A0M);
            kdr.setArguments(A0b);
            kdr.A01 = ekz;
            A00.A02(A002, kdr);
            return;
        }
        throw AbstractC166997dE.A0g();
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0017, code lost:
    
        if (X.AbstractC31176DnK.A1b(((X.C31836Dyv) r3.A0O.getValue()).A08) == false) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A02(X.EKZ r3) {
        /*
            android.widget.ImageView r2 = r3.A0E
            if (r2 == 0) goto L1d
            boolean r0 = r3.A0B
            if (r0 != 0) goto L19
            X.0do r0 = r3.A0O
            java.lang.Object r0 = r0.getValue()
            X.Dyv r0 = (X.C31836Dyv) r0
            X.05A r0 = r0.A08
            boolean r1 = X.AbstractC31176DnK.A1b(r0)
            r0 = 1
            if (r1 != 0) goto L1a
        L19:
            r0 = 0
        L1a:
            r2.setEnabled(r0)
        L1d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.EKZ.A02(X.EKZ):void");
    }

    public static final void A03(EKZ ekz, int i) {
        if (140 - i <= 5) {
            IgTextView igTextView = ekz.A05;
            if (igTextView != null) {
                igTextView.setVisibility(0);
            }
            IgTextView igTextView2 = ekz.A05;
            if (igTextView2 != null) {
                igTextView2.setText(ekz.getString(2131958960, AbstractC25228BEl.A1Z(Integer.valueOf(i), 140)));
                return;
            }
            return;
        }
        AbstractC167007dF.A0x(ekz.A05);
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A0N);
    }

    @Override // X.InterfaceC60072op
    public final boolean onBackPressed() {
        DirectAggregatedMediaViewerController directAggregatedMediaViewerController = this.A07;
        if (directAggregatedMediaViewerController != null) {
            return directAggregatedMediaViewerController.A0l();
        }
        return false;
    }

    public EKZ() {
        C37056GUm c37056GUm = new C37056GUm(this, 5);
        InterfaceC09390do A00 = AbstractC09440dt.A00(EnumC09460dv.A02, new C37056GUm(new C37056GUm(this, 2), 3));
        this.A0O = AbstractC25225BEi.A0a(new C37056GUm(A00, 4), c37056GUm, new MHU(33, null, A00), AbstractC25225BEi.A1D(C31836Dyv.class));
        this.A0Q = new G0M(this, 3);
        this.A0P = C31650DvG.A00(this, 38);
        this.A0N = AbstractC60492pY.A02(this);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(571070183);
        super.onCreate(bundle);
        C04L.A00(AbstractC31174DnI.A0H(this), false);
        this.A09 = JRE.A01(AbstractC43826JZo.A00(requireArguments(), "DirectStoryViewerFragment.ARGUMENTS_THREAD_KEY"));
        Parcelable parcelable = requireArguments().getParcelable("DirectThreadSharedMediaFragment.DIRECT_SHARED_MEDID_SHARED_TARGET");
        Parcelable.Creator creator = DirectShareTarget.CREATOR;
        C14360o3.A08(creator);
        this.A0L = (DirectShareTarget) ((Parcelable) C0B1.A01(creator, parcelable, DirectShareTarget.class));
        this.A0K = AbstractC34062F1p.A00(AbstractC166987dD.A0r(this.A0N));
        C0f9.A09(1923576785, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(1842937217);
        C14360o3.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.daily_prompts_response_fragment, viewGroup, false);
        C0f9.A09(1413380306, A02);
        return inflate;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroy() {
        int A02 = C0f9.A02(-1207162695);
        super.onDestroy();
        C3I9 c3i9 = this.A0J;
        if (c3i9 == null) {
            AbstractC31171DnF.A0r();
            throw C00O.createAndThrow();
        }
        c3i9.EFx(this.A0Q);
        unregisterLifecycleListener(this.A07);
        C0f9.A09(1744123826, A02);
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        int A02 = C0f9.A02(-97636945);
        super.onDestroyView();
        this.A02 = null;
        this.A0G = null;
        this.A0I = null;
        this.A0H = null;
        this.A0A = null;
        this.A05 = null;
        this.A0M = null;
        this.A0D = null;
        this.A0F = null;
        this.A0E = null;
        this.A01 = null;
        this.A03 = null;
        this.A06 = null;
        this.A0C = null;
        this.A08 = null;
        C0f9.A09(714108930, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        int A02 = C0f9.A02(-2022583756);
        super.onPause();
        C3I9 c3i9 = this.A0J;
        if (c3i9 == null) {
            AbstractC31171DnF.A0r();
            throw C00O.createAndThrow();
        }
        c3i9.onStop();
        AbstractC31176DnK.A0Q(this.A0N).A02(this.A0P, C7MN.class);
        C0f9.A09(-1193293666, A02);
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onResume() {
        int A02 = C0f9.A02(-591536154);
        super.onResume();
        C3I9 c3i9 = this.A0J;
        if (c3i9 == null) {
            AbstractC31171DnF.A0r();
            throw C00O.createAndThrow();
        }
        c3i9.Dnr(getActivity());
        AbstractC31176DnK.A0Q(this.A0N).A01(this.A0P, C7MN.class);
        C0f9.A09(2013335106, A02);
    }
}
