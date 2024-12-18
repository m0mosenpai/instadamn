package X;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Color;
import android.os.Bundle;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import com.facebook.R;
import com.instagram.actionbar.ActionButton;
import com.instagram.common.api.base.CacheBehaviorLogger;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import com.instagram.igds.components.banner.IgdsBanner;
import com.instagram.igds.components.form.IgFormField;
import com.instagram.user.model.User;

/* renamed from: X.ENp, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32366ENp extends C53Z implements InterfaceC60122ou, InterfaceC60152ox {
    public static final String __redex_internal_original_name = "EditBioFragment";
    public View A00;
    public View A01;
    public View A02;
    public ViewStub A03;
    public ImageView A04;
    public TextView A05;
    public TextView A06;
    public AnonymousClass693 A07;
    public ActionButton A08;
    public WFL A09;
    public C32024E5c A0A;
    public User A0B;
    public boolean A0C;
    public TextView A0D;
    public C3I9 A0E;
    public String A0F;
    public boolean A0G;
    public final FHD A0H = new FHD(this);

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "profile_edit_bio";
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        C14360o3.A0B(configuration, 0);
        AbstractC31179DnN.A1J(this, 8);
        super.onConfigurationChanged(configuration);
    }

    /* JADX WARN: Type inference failed for: r12v4, types: [X.0oO, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r20v0, types: [X.0pQ, java.lang.Object] */
    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        CharSequence charSequence;
        String str;
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        C3I9 c3i9 = this.A0E;
        if (c3i9 == null) {
            str = "keyboardHeightChangeDetector";
        } else {
            c3i9.A9e(this);
            this.A01 = view.requireViewById(R.id.edit_bio_layout);
            IgFormField igFormField = (IgFormField) AbstractC166997dE.A0R(view, R.id.caption_edit_text);
            igFormField.setLabelText(AbstractC166997dE.A0N(this).getString(2131953809));
            igFormField.setInputType(131073);
            AbstractC55110ObT.A00(igFormField);
            igFormField.setMaxLength(AbstractC166997dE.A0N(this).getInteger(R.integer.abc_config_activityShortDur));
            igFormField.A0D();
            TextView textView = (TextView) AbstractC166997dE.A0S(view, R.id.caption_limit_text);
            UserSession session = getSession();
            C06090Tz A0j = AbstractC25225BEi.A0j(session, 0);
            if (C18U.A06(A0j, session, 36330840594072622L)) {
                C35008Fbf c35008Fbf = new C35008Fbf(getSession());
                C32024E5c c32024E5c = c35008Fbf.A01;
                C14360o3.A0B(c32024E5c, 0);
                this.A0A = c32024E5c;
                String A0N = C17060sy.A01.A01(getSession()).A0N();
                boolean z = true;
                if (A0N == null || (!A0N.equals("") && A0N.length() != 0)) {
                    z = false;
                }
                c32024E5c.A05 = z;
                EditText mEditText = igFormField.getMEditText();
                String str2 = c35008Fbf.A00.A02;
                c32024E5c.A02 = str2;
                mEditText.setHint(str2);
                boolean A01 = AbstractC154816xW.A01(getSession());
                int i = R.id.edit_bio_cta_shuffle_button_accessory_bar_container;
                if (!A01) {
                    i = R.id.edit_bio_cta_shuffle_button_container;
                }
                ViewStub A0M = AbstractC167007dF.A0M(view, i);
                this.A03 = A0M;
                if (A0M == null) {
                    str = "editBioCtaShuffleViewStub";
                } else {
                    View inflate = A0M.inflate();
                    this.A00 = inflate;
                    String str3 = "editBioCtaShuffleContainer";
                    if (inflate != null) {
                        inflate.setVisibility(0);
                        View view2 = this.A00;
                        if (view2 != null) {
                            this.A05 = AbstractC166997dE.A0T(view2, R.id.edit_bio_cta_shuffle_button_text);
                            View view3 = this.A00;
                            if (view3 != null) {
                                this.A04 = AbstractC31173DnH.A0I(view3, R.id.edit_bio_cta_shuffle_button_icon);
                                if (AbstractC154816xW.A01(getSession())) {
                                    View view4 = this.A00;
                                    if (view4 != null) {
                                        view4.setPadding(AbstractC167017dG.A03(view4.getContext()), 0, 0, 0);
                                    }
                                }
                                TextView textView2 = this.A05;
                                if (textView2 != null) {
                                    AbstractC31173DnH.A19(AbstractC166997dE.A0N(this), textView2, 2131974079);
                                }
                                TextView textView3 = this.A05;
                                if (textView3 != null) {
                                    View view5 = this.A00;
                                    if (view5 != null) {
                                        AbstractC31177DnL.A0z(textView3, view5.getContext());
                                    }
                                }
                                View view6 = this.A00;
                                if (view6 != null) {
                                    int color = view6.getContext().getColor(R.color.igds_primary_icon);
                                    View view7 = this.A00;
                                    if (view7 != null) {
                                        AnonymousClass693 A00 = C68U.A00(view7.getContext(), R.raw.canvas_dice_animation);
                                        if (A00 != null) {
                                            C6PK.A00(new C56502ij(Color.red(color), Color.green(color), Color.blue(color), Color.alpha(color)), A00.A01);
                                            A00.EMk(0.0f);
                                        } else {
                                            A00 = null;
                                        }
                                        this.A07 = A00;
                                        ImageView imageView = this.A04;
                                        if (imageView == null) {
                                            str = "editBioCtaShuffleButtonIcon";
                                        } else {
                                            imageView.setImageDrawable(A00);
                                            View view8 = this.A00;
                                            if (view8 != null) {
                                                ViewOnClickListenerC35684FpJ.A00(view8, igFormField, this, c35008Fbf, 42);
                                                C32024E5c c32024E5c2 = this.A0A;
                                                if (c32024E5c2 != null) {
                                                    ?? obj = new Object();
                                                    C0fQ.A00(new ViewOnClickListenerC35610Fo1(15, igFormField, c32024E5c2, c35008Fbf, obj), igFormField.getMEditText());
                                                    igFormField.getMEditText().addTextChangedListener(new C35472Fl8(igFormField, this, c35008Fbf, obj, new Object()));
                                                } else {
                                                    str3 = "currentPromptLogData";
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    C14360o3.A0F(str3);
                    throw C00O.createAndThrow();
                }
            }
            if (C14640oc.A09()) {
                textView.setVisibility(8);
            }
            ListView listView = (ListView) AbstractC166997dE.A0S(view, R.id.entity_suggestions_list);
            if (AbstractC154816xW.A01(getSession())) {
                this.A06 = AbstractC166997dE.A0T(view, R.id.mention_button);
                this.A0D = AbstractC166997dE.A0T(view, R.id.hashtag_button);
                View requireViewById = view.requireViewById(R.id.accessory_bar);
                C14360o3.A0B(requireViewById, 0);
                this.A02 = requireViewById;
            }
            UserSession session2 = getSession();
            requireActivity();
            C14360o3.A0B(session2, 1);
            AbstractC151786sO.A00 = true;
            UserSession session3 = getSession();
            EditText mEditText2 = igFormField.getMEditText();
            TextView textView4 = this.A06;
            TextView textView5 = this.A0D;
            String str4 = this.A0F;
            if (str4 == null) {
                str = "entryPoint";
            } else {
                this.A09 = new WFL(mEditText2, listView, textView4, textView5, textView, this, this, session3, this.A0H, str4);
                if (AbstractC166987dD.A0x(getSession()).getBoolean("should_show_bio_accessory_buttons_tooltip", true) && AbstractC154816xW.A01(getSession())) {
                    FragmentActivity activity = getActivity();
                    if (this.A06 != null && activity != null) {
                        int dimensionPixelSize = activity.getResources().getDimensionPixelSize(R.dimen.abc_alert_dialog_button_dimen) / 2;
                        TextView textView6 = this.A06;
                        if (textView6 != null) {
                            textView6.postDelayed(new GQZ(textView6, activity, this, dimensionPixelSize), 100L);
                        }
                    }
                }
                if (C18U.A06(A0j, getSession(), 36328525606698600L) || C18U.A06(A0j, getSession(), 36328525606764137L)) {
                    View view9 = this.A01;
                    if (view9 == null) {
                        str = "layoutView";
                    } else {
                        IgdsBanner igdsBanner = (IgdsBanner) AbstractC166997dE.A0R(view9, R.id.profile_data_transparency_banner);
                        if (C18U.A06(A0j, getSession(), 36328525606698600L)) {
                            charSequence = AbstractC166997dE.A0N(this).getString(2131957519);
                        } else {
                            String A0v = AbstractC25227BEk.A0v(this, 2131957521);
                            SpannableStringBuilder A08 = AbstractC31178DnM.A08(this, A0v, 2131957520);
                            Context context = getContext();
                            if (context != null) {
                                AnonymousClass773.A02(A08, new Em1(this, context.getColor(AbstractC53242c7.A06(getContext()))), A0v);
                                charSequence = A08;
                            } else {
                                throw AbstractC166997dE.A0g();
                            }
                        }
                        AbstractC31172DnG.A1U(igdsBanner, charSequence, true);
                        AbstractC151856sV.A00(getSession(), C05F.A00);
                        igdsBanner.setVisibility(0);
                    }
                }
                if (!this.A0G) {
                    A00(this);
                    return;
                }
                return;
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    @Override // X.InterfaceC60152ox
    public final void DOK(int i, boolean z) {
        if (z) {
            View view = this.A01;
            if (view != null) {
                AbstractC13880nE.A0Y(view, i);
                return;
            }
        } else {
            View view2 = this.A01;
            if (view2 != null) {
                AbstractC13880nE.A0Y(view2, 0);
                return;
            }
        }
        C14360o3.A0F("layoutView");
        throw C00O.createAndThrow();
    }

    public static final void A00(C32366ENp c32366ENp) {
        UserSession session = c32366ENp.getSession();
        User user = c32366ENp.A0B;
        String str = "displayedUser";
        if (user != null) {
            boolean A1T = AbstractC167007dF.A1T(user.A03.Bww());
            User user2 = c32366ENp.A0B;
            if (user2 != null) {
                String A0N = user2.A0N();
                InterfaceC19630xq A0g = AbstractC31174DnI.A0g(C1AT.A01(session), C1AV.A3C, c32366ENp);
                if (!A0g.getBoolean("education_banner_dismiss_key", false) && A1T && C18U.A06(AbstractC25225BEi.A0j(session, 0), session, 36323749603061333L) && A0N != null) {
                    C18920wW A01 = AbstractC12220kQ.A01(c32366ENp, session);
                    View view = c32366ENp.A01;
                    if (view == null) {
                        str = "layoutView";
                    } else {
                        IgdsBanner igdsBanner = (IgdsBanner) AbstractC166997dE.A0R(view, R.id.teen_education_banner);
                        igdsBanner.A00 = new C36499G7x(A01, A0g, A0N);
                        boolean A1X = AbstractC167007dF.A1X(AbstractC166997dE.A0Y(session).A0M(), C05F.A0C);
                        android.net.Uri A0B = AbstractC25227BEk.A0B(AbstractC63260SgI.A01(c32366ENp.requireActivity(), "https://help.instagram.com/347751748650214/?helpref=uf_share"));
                        String A0v = AbstractC25227BEk.A0v(c32366ENp, 2131961572);
                        int i = 2131961574;
                        if (A1X) {
                            i = 2131961573;
                        }
                        AbstractC31172DnG.A1U(igdsBanner, AnonymousClass773.A00(A0B, A0v, AbstractC31174DnI.A0w(c32366ENp, A0v, i)), true);
                        igdsBanner.setVisibility(0);
                        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(A01, "ig_bio_education");
                        AbstractC31171DnF.A1B(A0f, "impression");
                        A0f.AAP(CacheBehaviorLogger.SOURCE, "edit_bio");
                        A0f.AAP("biography", A0N);
                        A0f.Cht();
                        return;
                    }
                } else {
                    return;
                }
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        C35197Ffp A00 = C35197Ffp.A00(interfaceC56362iU);
        C35197Ffp.A01(AbstractC166997dE.A0N(this), A00, 2131953809);
        this.A08 = C31722DwR.A00(ViewOnClickListenerC31723DwS.A00(this, 15), interfaceC56362iU, A00);
        C35026Fbz c35026Fbz = new C35026Fbz(C05F.A00);
        c35026Fbz.A01 = 2131956237;
        c35026Fbz.A00 = 2131961124;
        C35026Fbz.A00(interfaceC56362iU, c35026Fbz);
        AbstractC31176DnK.A1C(ViewOnClickListenerC31723DwS.A00(this, 16), AbstractC31176DnK.A0I(), interfaceC56362iU);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(581673541);
        super.onCreate(bundle);
        this.A0F = requireArguments().getString(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, "edit_profile");
        this.A0E = C3I7.A01(this, false, true);
        UserSession session = getSession();
        this.A0B = AbstractC166987dD.A10(session);
        AbstractC155496ye.A00(session).A06("edit_bio");
        String str = this.A0F;
        if (str == null) {
            AbstractC31171DnF.A0x();
            throw C00O.createAndThrow();
        }
        boolean equals = str.equals("quick_promotion");
        this.A0G = equals;
        if (equals && !this.A0C) {
            C31702Dw7.A00(this, AbstractC152476ta.A06(getSession()), 7);
        }
        C0f9.A09(-2096267438, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(3816650);
        C14360o3.A0B(layoutInflater, 0);
        boolean A01 = AbstractC154816xW.A01(getSession());
        int i = R.layout.edit_bio_layout;
        if (A01) {
            i = R.layout.edit_bio_with_accessory_bar_layout;
        }
        View inflate = layoutInflater.inflate(i, viewGroup, false);
        C0f9.A09(-976759650, A02);
        return inflate;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        int A02 = C0f9.A02(-296208057);
        super.onDestroyView();
        C3I9 c3i9 = this.A0E;
        if (c3i9 == null) {
            AbstractC31171DnF.A0r();
            throw C00O.createAndThrow();
        }
        c3i9.EFx(this);
        UserSession session = getSession();
        FragmentActivity requireActivity = requireActivity();
        AbstractC151786sO.A00 = AbstractC25229BEm.A1Y(session);
        AbstractC151786sO.A00(requireActivity, session);
        FA7.A00(session).A03(EnumC33422Ept.A05, "edit_bio_cancel");
        C0f9.A09(-1698905899, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        int A02 = C0f9.A02(-1714935689);
        AbstractC31179DnN.A1J(this, 0);
        super.onPause();
        if (AbstractC31174DnI.A0H(this) != null) {
            AbstractC13880nE.A0O(AbstractC31178DnM.A0B(this));
        }
        C0f9.A09(-1439075745, A02);
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onResume() {
        int A02 = C0f9.A02(-580303399);
        AbstractC31179DnN.A1J(this, 8);
        super.onResume();
        WFL wfl = this.A09;
        if (wfl == null) {
            C14360o3.A0F("searchController");
            throw C00O.createAndThrow();
        }
        Editable text = wfl.A06.getText();
        C14360o3.A07(text);
        WFL.A00(text, wfl);
        if (AbstractC31174DnI.A0H(this) != null) {
            View A0B = AbstractC31178DnM.A0B(this);
            C14360o3.A07(A0B);
            AbstractC13880nE.A0R(A0B);
        }
        C0f9.A09(-668629119, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStart() {
        int A02 = C0f9.A02(-908724859);
        super.onStart();
        C3I9 c3i9 = this.A0E;
        if (c3i9 == null) {
            AbstractC31171DnF.A0r();
            throw C00O.createAndThrow();
        }
        c3i9.Dnr(requireActivity());
        C0f9.A09(1680455257, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStop() {
        int A02 = C0f9.A02(181539976);
        super.onStop();
        C3I9 c3i9 = this.A0E;
        if (c3i9 == null) {
            AbstractC31171DnF.A0r();
            throw C00O.createAndThrow();
        }
        c3i9.onStop();
        C0f9.A09(-1626122321, A02);
    }
}
