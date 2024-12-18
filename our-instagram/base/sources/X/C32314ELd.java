package X;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import com.facebook.R;
import com.google.android.material.tabs.TabLayout;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.ui.base.IgSimpleImageView;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.debug.devoptions.metadata.view.ThreadMetadataOverrideFragment;
import com.instagram.direct.capabilities.Capabilities;
import com.instagram.direct.lockedchat.LockedChatKillSwitch;
import com.instagram.direct.ui.collections.DirectThreadDetailsCollectionRowViewModel;
import com.instagram.igds.components.textcell.IgdsListCell;
import com.instagram.model.direct.threadkey.impl.MsysThreadId;
import com.instagram.quickpromotion.intf.QuickPromotionSlot;
import com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView;
import com.instagram.ui.widget.nestablescrollingview.NestableViewPager;
import java.util.AbstractList;
import java.util.ArrayList;

/* renamed from: X.ELd, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32314ELd extends AbstractC59962oe implements InterfaceC60072op, InterfaceC37197Ga8, InterfaceC37157GYu, InterfaceC60122ou {
    public static final String __redex_internal_original_name = "ThreadDetailHomePageFragment";
    public LinearLayout A00;
    public TabLayout A01;
    public C18920wW A02;
    public Capabilities A03;
    public EnumC33414Epl A04;
    public FRI A05;
    public FRI A06;
    public FRI A07;
    public FRI A08;
    public FRI A09;
    public FRI A0A;
    public FRI A0B;
    public FRI A0C;
    public FRI A0D;
    public FRI A0E;
    public FRI A0F;
    public FRI A0G;
    public FRI A0H;
    public FRI A0I;
    public FRI A0J;
    public FRI A0K;
    public FRI A0L;
    public FRI A0M;
    public FRI A0N;
    public FRI A0O;
    public FRI A0P;
    public InterfaceC37169GZg A0Q;
    public C69293Vl1 A0R;
    public C34589FLy A0S;
    public C34632FNp A0T;
    public C31539DtP A0U;
    public C33090Eip A0V;
    public C5G2 A0W;
    public EHQ A0X;
    public C32056E6i A0Y;
    public E70 A0Z;
    public WDF A0a;
    public IgdsListCell A0b;
    public InterfaceC83733oI A0c;
    public C64842wi A0d;
    public Integer A0e;
    public boolean A0f;
    public boolean A0g;
    public boolean A0h;
    public boolean A0i;
    public boolean A0j;
    public boolean A0k;
    public boolean A0l;
    public boolean A0m;
    public View A0n;
    public LinearLayout A0o;
    public TextView A0p;
    public TextView A0q;
    public TextView A0r;
    public TextView A0s;
    public InterfaceC56392iX A0t;
    public C31786Dy5 A0u;
    public FRI A0v;
    public FRI A0w;
    public GradientSpinnerAvatarView A0x;
    public NestableViewPager A0y;
    public final C2GT A0z;
    public final C2GS A10;
    public final DirectThreadDetailsCollectionRowViewModel A12;
    public final C64752wZ A13;
    public final InterfaceC09390do A15;
    public final InterfaceC09390do A16;
    public final InterfaceC09390do A17;
    public final InterfaceC09390do A18;
    public final C31728DwZ A19;
    public final InterfaceC42271xH A1A;
    public final C41761wQ A11 = AbstractC31173DnH.A0S();
    public final ArrayList A14 = AbstractC166987dD.A1E();

    public static final void A0A(C32314ELd c32314ELd) {
        E70 e70;
        String A07;
        Context context = c32314ELd.getContext();
        if (context != null && (e70 = c32314ELd.A0Z) != null && !C35244Fgd.A03((Activity) context, context, c32314ELd, AbstractC166987dD.A0r(c32314ELd.A17), null, C7KH.A00(e70), false)) {
            if (c32314ELd.A0k) {
                C18920wW c18920wW = c32314ELd.A02;
                if (c18920wW == null) {
                    C14360o3.A0F("typedLogger");
                    throw C00O.createAndThrow();
                }
                InterfaceC83733oI interfaceC83733oI = e70.A0L;
                if (interfaceC83733oI != null && (A07 = AbstractC1345466e.A07(interfaceC83733oI)) != null) {
                    InterfaceC02590Ai A0f = AbstractC166987dD.A0f(c18920wW, "armadillo_igd_group_profile_change_group_photo");
                    if (A0f.isSampled()) {
                        AbstractC31171DnF.A1F(A0f, A07);
                        A0f.A7v("is_e2ee", AbstractC166997dE.A0b());
                        A0f.Cht();
                    }
                }
            }
            WDF wdf = c32314ELd.A0a;
            if (wdf != null) {
                wdf.A02(AbstractC167007dF.A1W(e70.A0C));
            }
        }
    }

    public static final void A0G(C32314ELd c32314ELd, C32107E9f c32107E9f) {
        E70 e70 = c32314ELd.A0Z;
        if (e70 != null) {
            C35140Feh c35140Feh = C35140Feh.A00;
            UserSession A0r = AbstractC166987dD.A0r(c32314ELd.A17);
            FragmentActivity requireActivity = c32314ELd.requireActivity();
            Capabilities capabilities = c32314ELd.A03;
            if (capabilities == null) {
                C14360o3.A0F("threadCapabilities");
                throw C00O.createAndThrow();
            }
            c35140Feh.A01(c32314ELd, requireActivity, c32314ELd, A0r, capabilities, e70, c32107E9f);
        }
    }

    public static final void A0H(C32314ELd c32314ELd, C32107E9f c32107E9f) {
        E70 e70 = c32314ELd.A0Z;
        if (e70 != null) {
            C35225FgI c35225FgI = C35225FgI.A00;
            UserSession A0r = AbstractC166987dD.A0r(c32314ELd.A17);
            FragmentActivity requireActivity = c32314ELd.requireActivity();
            boolean z = c32314ELd.A0j;
            C64842wi c64842wi = c32314ELd.A0d;
            if (c64842wi == null) {
                C14360o3.A0F("quickPromotionDelegate");
                throw C00O.createAndThrow();
            }
            c35225FgI.A03(requireActivity, c32314ELd, A0r, e70, c32107E9f, c64842wi, z);
        }
    }

    public static final void A0I(C32314ELd c32314ELd, C32107E9f c32107E9f) {
        String str;
        E70 e70 = c32314ELd.A0Z;
        if (e70 != null) {
            C35141Fei c35141Fei = C35141Fei.A00;
            Context requireContext = c32314ELd.requireContext();
            UserSession A0r = AbstractC166987dD.A0r(c32314ELd.A17);
            FragmentActivity requireActivity = c32314ELd.requireActivity();
            C18920wW c18920wW = c32314ELd.A02;
            if (c18920wW == null) {
                str = "typedLogger";
            } else {
                C08790ch A00 = AbstractC018607g.A00(c32314ELd);
                C31539DtP c31539DtP = c32314ELd.A0U;
                str = "restrictController";
                if (c31539DtP != null) {
                    c35141Fei.A01(requireContext, requireActivity, A00, c32314ELd, c18920wW, A0r, c31539DtP, e70, c32107E9f, c31539DtP);
                    return;
                }
            }
            C14360o3.A0F(str);
            throw C00O.createAndThrow();
        }
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return __redex_internal_original_name;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        InterfaceC09390do interfaceC09390do = this.A17;
        UserSession A0r = AbstractC166987dD.A0r(interfaceC09390do);
        C06090Tz c06090Tz = C06090Tz.A05;
        if (C18U.A06(c06090Tz, A0r, 36329075362512897L)) {
            AbstractC31174DnI.A1E(getViewLifecycleOwner(), this.A0z, new C50359MLl(this, 21), 20);
        }
        this.A0o = AbstractC31172DnG.A0B(view, R.id.thread_details_header);
        this.A0x = (GradientSpinnerAvatarView) view.requireViewById(R.id.group_photo_avatar);
        this.A0t = AbstractC56372iV.A01(view.requireViewById(R.id.direct_group_photo_faceswarm_stub), false, false);
        this.A0s = AbstractC166997dE.A0T(view, R.id.thread_title);
        this.A0r = AbstractC166997dE.A0T(view, R.id.thread_subtitle);
        this.A0p = AbstractC166997dE.A0T(view, R.id.change_title_photo);
        this.A00 = AbstractC31172DnG.A0B(view, R.id.shortcuts_container);
        this.A0K = A00(view, R.id.invite_link_section);
        this.A0v = A00(view, R.id.customer_details);
        this.A0P = A00(view, R.id.theme_section);
        this.A0J = A00(view, R.id.dmm_section);
        this.A0w = A00(view, R.id.people_section);
        this.A0H = A00(view, R.id.create_group_section);
        this.A0G = A00(view, R.id.chat_controls_section);
        this.A0F = A00(view, R.id.channel_insights_section);
        this.A0D = A00(view, R.id.channel_controls_section);
        this.A0E = A00(view, R.id.best_practices_section);
        this.A0L = A00(view, R.id.nicknames_section);
        this.A0M = A00(view, R.id.privacy_controls_section);
        this.A0O = A00(view, R.id.restrict_button);
        this.A0C = A00(view, R.id.block_button);
        this.A0N = A00(view, R.id.report_button);
        this.A0b = AbstractC31173DnH.A0Y(view, R.id.agent_embodiment_section);
        this.A09 = A00(view, R.id.agent_hallucination_disclaimer);
        this.A08 = A00(view, R.id.agent_data_usage_section);
        this.A07 = A00(view, R.id.ai_agent_creator_button);
        this.A0I = A00(view, R.id.creator_ai_replies_toggle);
        this.A0A = A00(view, R.id.agent_memu_section);
        this.A06 = A00(view, R.id.ai_studio_section);
        this.A0B = A00(view, R.id.agent_voice_settings_section);
        this.A05 = A00(view, R.id.add_ai_section);
        this.A0n = view.requireViewById(R.id.shared_section);
        this.A0q = AbstractC166997dE.A0T(view, R.id.viewpager_label);
        this.A01 = (TabLayout) view.requireViewById(R.id.tab_layout);
        NestableViewPager nestableViewPager = (NestableViewPager) view.requireViewById(R.id.thread_details_pager);
        this.A0y = nestableViewPager;
        if (nestableViewPager != null) {
            nestableViewPager.setAdapter(this.A0u);
            TabLayout tabLayout = this.A01;
            String str = "tabLayout";
            if (tabLayout != null) {
                NestableViewPager nestableViewPager2 = this.A0y;
                if (nestableViewPager2 != null) {
                    tabLayout.setupWithViewPager(nestableViewPager2);
                    int color = view.getContext().getColor(AbstractC31174DnI.A05(this));
                    TabLayout tabLayout2 = this.A01;
                    if (tabLayout2 != null) {
                        tabLayout2.A0C = color;
                        tabLayout2.A0D(new C35868Fsi(this, 1));
                        UserSession A0r2 = AbstractC166987dD.A0r(interfaceC09390do);
                        C14360o3.A0B(A0r2, 0);
                        if (C18U.A06(c06090Tz, A0r2, 36314214775654898L)) {
                            this.A0R = new C69293Vl1(view);
                        }
                        C41761wQ c41761wQ = this.A11;
                        InterfaceC37169GZg interfaceC37169GZg = this.A0Q;
                        if (interfaceC37169GZg == null) {
                            str = "clientInfra";
                        } else {
                            GKK.A00(interfaceC37169GZg.BOE().APK().A0M(new C36264FzH(0, GVV.A00)).A0C(), c41761wQ, this, 5);
                            this.A0W = AbstractC161117Jw.A00(AbstractC166987dD.A0r(interfaceC09390do));
                            A07(this);
                            A0E(this);
                            C64842wi c64842wi = this.A0d;
                            if (c64842wi == null) {
                                str = "quickPromotionDelegate";
                            } else {
                                c64842wi.DiZ();
                                return;
                            }
                        }
                    }
                }
            }
            C14360o3.A0F(str);
            throw C00O.createAndThrow();
        }
        C14360o3.A0F("viewPager");
        throw C00O.createAndThrow();
    }

    public static final ELx A02(C32314ELd c32314ELd) {
        String str;
        UserSession A0r = AbstractC166987dD.A0r(c32314ELd.A17);
        Capabilities capabilities = c32314ELd.A03;
        if (capabilities == null) {
            str = "threadCapabilities";
        } else {
            InterfaceC83733oI interfaceC83733oI = c32314ELd.A0c;
            if (interfaceC83733oI == null) {
                str = "threadId";
            } else {
                return AbstractC34092F2u.A00(A0r, capabilities, interfaceC83733oI, c32314ELd.requireArguments().getInt(AbstractC111324zv.A00(18), 0), c32314ELd.A0j);
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    public static final void A04(Context context, FRI fri, String str, int i, int i2) {
        fri.A00.setVisibility(0);
        IgSimpleImageView igSimpleImageView = fri.A02;
        igSimpleImageView.setVisibility(0);
        fri.A04.setVisibility(8);
        TypedValue typedValue = AbstractC85953sP.A00;
        Drawable drawable = null;
        try {
            Drawable drawable2 = context.getDrawable(i);
            if (drawable2 != null) {
                drawable = drawable2.mutate();
                C14360o3.A07(drawable);
                AbstractC166997dE.A1F(drawable, i2);
            }
        } catch (Resources.NotFoundException unused) {
        }
        igSimpleImageView.setImageDrawable(drawable);
        IgTextView igTextView = fri.A05;
        igTextView.setTextColor(i2);
        igTextView.setText(str);
    }

    public static final void A05(EnumC33502Erb enumC33502Erb, C32314ELd c32314ELd) {
        String str;
        InterfaceC83733oI interfaceC83733oI;
        InterfaceC83733oI interfaceC83733oI2;
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A01(c32314ELd, AbstractC166987dD.A0r(c32314ELd.A17)), "direct_thread_details_click_action");
        A0f.A8R(enumC33502Erb, "action");
        E70 e70 = c32314ELd.A0Z;
        Boolean bool = null;
        if (e70 != null && (interfaceC83733oI2 = e70.A0L) != null) {
            str = AbstractC1345466e.A07(interfaceC83733oI2);
        } else {
            str = null;
        }
        AbstractC31171DnF.A1F(A0f, str);
        E70 e702 = c32314ELd.A0Z;
        if (e702 != null && (interfaceC83733oI = e702.A0L) != null) {
            bool = Boolean.valueOf(interfaceC83733oI instanceof MsysThreadId);
        }
        A0f.A7v("is_e2ee", bool);
        A0f.Cht();
    }

    public static final void A06(C32314ELd c32314ELd) {
        String str;
        ImageUrl imageUrl;
        InterfaceC09390do interfaceC09390do = c32314ELd.A17;
        UserSession A0r = AbstractC166987dD.A0r(interfaceC09390do);
        C06090Tz c06090Tz = C06090Tz.A05;
        if (C18U.A06(c06090Tz, A0r, 36324385258221708L)) {
            E70 e70 = c32314ELd.A0Z;
            if (e70 != null) {
                ArrayList A05 = AbstractC81683kd.A05(C17060sy.A01.A01(AbstractC166987dD.A0r(interfaceC09390do)), AbstractC31171DnF.A0n(e70.A0c), !E70.A04(e70));
                if (e70.A0x) {
                    str = e70.A0P;
                    if (str == null) {
                        throw AbstractC166997dE.A0g();
                    }
                } else {
                    str = "";
                }
                UserSession A0r2 = AbstractC166987dD.A0r(interfaceC09390do);
                InterfaceC83733oI interfaceC83733oI = c32314ELd.A0c;
                if (interfaceC83733oI != null) {
                    E70 e702 = c32314ELd.A0Z;
                    if (e702 != null) {
                        imageUrl = e702.A0C;
                    } else {
                        imageUrl = null;
                    }
                    ArrayList<? extends Parcelable> A1F = AbstractC166987dD.A1F(A05);
                    int i = e70.A09;
                    C14360o3.A0B(A0r2, 0);
                    EIL eil = new EIL();
                    Bundle A0b = AbstractC166987dD.A0b();
                    AbstractC60492pY.A03(A0b, A0r2);
                    AbstractC35077Fco.A02(A0b, interfaceC83733oI, "DirectFragment.DIRECT_FRAGMENT_ARGUMENT_THREAD_ID");
                    A0b.putString("thread_title", str);
                    A0b.putParcelable("thread_picture_image_url", imageUrl);
                    A0b.putParcelableArrayList("members_picture_image_url", A1F);
                    A0b.putString("analytics_entrypoint", "thread_details");
                    A0b.putInt("DirectThreadDetailFragment.THREAD_SUBTYPE", i);
                    eil.setArguments(A0b);
                    UserSession A0r3 = AbstractC166987dD.A0r(interfaceC09390do);
                    InterfaceC83733oI interfaceC83733oI2 = c32314ELd.A0c;
                    if (interfaceC83733oI2 != null) {
                        new L7D(c32314ELd, A0r3, "thread_details", AbstractC1345466e.A07(interfaceC83733oI2)).A00(EnumC46300KeW.TAP_CHANGE_NAME_IMAGE, null);
                        AbstractC31174DnI.A1M(AbstractC31173DnH.A0O(null, eil, c32314ELd.requireActivity(), AbstractC166987dD.A0r(interfaceC09390do)), __redex_internal_original_name);
                        return;
                    }
                }
                C14360o3.A0F("threadId");
                throw C00O.createAndThrow();
            }
            return;
        }
        E70 e703 = c32314ELd.A0Z;
        boolean z = false;
        if (e703 != null) {
            if (e703.A09 == 29) {
                z = true;
                C142846ck A00 = AbstractC147806l5.A00(AbstractC166987dD.A0r(interfaceC09390do));
                int A06 = e703.A06();
                String A03 = E70.A03(e703);
                String str2 = e703.A0Q;
                C25531Mh A0I = AbstractC31172DnG.A0I(A00);
                if (AbstractC25226BEj.A1Z(A0I)) {
                    AbstractC31175DnJ.A1B(A0I, A00);
                    AbstractC31174DnI.A1I(A0I, "change_name_photo_sheet_rendered");
                    A0I.A0o("change_name_photo_text");
                    AbstractC31177DnL.A1H(A0I, A00, AbstractC31179DnN.A0a(A0I, "thread_details", A03, str2, A06));
                }
            }
            C50674MYs c50674MYs = new C50674MYs(c32314ELd.requireContext(), AbstractC166987dD.A0r(interfaceC09390do));
            int i2 = 2131968870;
            if (C18U.A05(c06090Tz, AbstractC166987dD.A0r(interfaceC09390do))) {
                i2 = 2131968868;
            }
            c50674MYs.A03(new ViewOnClickListenerC35672Fp7(2, e703, c32314ELd, z), i2);
            int i3 = 2131958825;
            if (C18U.A05(c06090Tz, AbstractC166987dD.A0r(interfaceC09390do))) {
                i3 = 2131958824;
            }
            c50674MYs.A03(new ViewOnClickListenerC35672Fp7(3, e703, c32314ELd, z), i3);
            c50674MYs.A03(ViewOnClickListenerC35657For.A00, 2131954754);
            c50674MYs.A05 = true;
            C31727DwY.A02(c32314ELd, c50674MYs);
            return;
        }
        throw AbstractC166997dE.A0g();
    }

    public static final void A07(C32314ELd c32314ELd) {
        InterfaceC37169GZg interfaceC37169GZg = c32314ELd.A0Q;
        if (interfaceC37169GZg == null) {
            C14360o3.A0F("clientInfra");
            throw C00O.createAndThrow();
        }
        InterfaceC37279GbW.A00(interfaceC37169GZg);
    }

    public static final void A09(C32314ELd c32314ELd) {
        FragmentActivity activity;
        E70 e70 = c32314ELd.A0Z;
        if (e70 != null && (activity = c32314ELd.getActivity()) != null) {
            InterfaceC09390do interfaceC09390do = c32314ELd.A17;
            C32056E6i A01 = C35252Fgl.A01(AbstractC166987dD.A0r(interfaceC09390do), e70);
            UserSession A0r = AbstractC166987dD.A0r(interfaceC09390do);
            Bundle A0C = AbstractC31177DnL.A0C(A0r);
            AbstractC03240Dh.A00(A0C, A0r);
            EMZ emz = new EMZ();
            emz.setArguments(A0C);
            InterfaceC37169GZg interfaceC37169GZg = c32314ELd.A0Q;
            if (interfaceC37169GZg == null) {
                C14360o3.A0F("clientInfra");
                throw C00O.createAndThrow();
            }
            emz.A02 = interfaceC37169GZg.C78();
            emz.A01 = A01;
            emz.A03 = "thread_details";
            C189448aO A0y = AbstractC25225BEi.A0y(AbstractC166987dD.A0r(interfaceC09390do));
            A0y.A17 = true;
            AbstractC31173DnH.A0w(activity, emz, A0y);
        }
    }

    public static final void A0B(C32314ELd c32314ELd) {
        E70 e70;
        String str;
        String str2;
        C33617EtT c33617EtT;
        FRI fri = c32314ELd.A0v;
        String str3 = "customerDetails";
        if (fri != null) {
            A0J(fri);
            Context context = c32314ELd.getContext();
            if (context != null && (e70 = c32314ELd.A0Z) != null && !E70.A04(e70) && e70.A09 != 1012) {
                InterfaceC09390do interfaceC09390do = c32314ELd.A17;
                UserSession A0r = AbstractC166987dD.A0r(interfaceC09390do);
                if (C18U.A06(AbstractC25225BEi.A0j(A0r, 0), A0r, 36324651546194250L)) {
                    FRI fri2 = c32314ELd.A0v;
                    if (fri2 != null) {
                        UserSession A0r2 = AbstractC166987dD.A0r(interfaceC09390do);
                        InterfaceC83733oI interfaceC83733oI = c32314ELd.A0c;
                        if (interfaceC83733oI == null) {
                            str3 = "threadId";
                        } else {
                            C83693oE A02 = AbstractC1345466e.A02(interfaceC83733oI);
                            if (A02 == null || (str = A02.A00) == null) {
                                str = "";
                            }
                            C14360o3.A0B(A0r2, 0);
                            C16920sk c16920sk = C16920sk.A00;
                            C14360o3.A0C(c16920sk, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.emptyMap, V of kotlin.collections.MapsKt__MapsKt.emptyMap>");
                            C35142Fej.A00(A0r2, "customer_details_thread_details_entry_point_impression", str, c16920sk);
                            AbstractC25227BEk.A12(fri2.A05, c32314ELd, 2131959588);
                            IgSimpleImageView igSimpleImageView = fri2.A02;
                            igSimpleImageView.setVisibility(0);
                            AbstractC166997dE.A19(context, igSimpleImageView, R.drawable.instagram_contacts_pano_outline_24);
                            View view = fri2.A00;
                            view.setVisibility(0);
                            C33090Eip c33090Eip = c32314ELd.A0V;
                            if (c33090Eip == null) {
                                str3 = "customerDetailsRepository";
                            } else {
                                AbstractC33541EsF abstractC33541EsF = (AbstractC33541EsF) c33090Eip.A05.getValue();
                                if (!(abstractC33541EsF instanceof C32807EcB) || (((str2 = (c33617EtT = (C33617EtT) ((C32807EcB) abstractC33541EsF).A00).A02) == null || str2.length() == 0) && (((str2 = c33617EtT.A05) == null || str2.length() == 0) && (((str2 = c33617EtT.A03) == null || str2.length() == 0) && ((str2 = c33617EtT.A01) == null || str2.length() == 0))))) {
                                    str2 = null;
                                }
                                IgTextView igTextView = fri2.A04;
                                if (str2 == null || str2.length() == 0) {
                                    str2 = c32314ELd.getString(2131959587);
                                }
                                igTextView.setText(str2);
                                igTextView.setVisibility(0);
                                ViewOnClickListenerC35680FpF.A00(view, 12, c32314ELd);
                                return;
                            }
                        }
                    }
                } else {
                    return;
                }
            } else {
                return;
            }
        }
        C14360o3.A0F(str3);
        throw C00O.createAndThrow();
    }

    public static final void A0C(C32314ELd c32314ELd) {
        Context context;
        String A03;
        int i;
        Object[] objArr;
        Object A032;
        E70 e70 = c32314ELd.A0Z;
        if (e70 != null && (context = c32314ELd.getContext()) != null) {
            int i2 = 8;
            if (E70.A04(e70) && !e70.A0C() && AbstractC166987dD.A1b(AbstractC001800i.A0a(e70.A0T))) {
                ((FKW) c32314ELd.A18.getValue()).A02.add(EnumC33518Err.A08);
                FRI fri = c32314ELd.A0w;
                if (fri != null) {
                    fri.A02.setVisibility(0);
                    FRI fri2 = c32314ELd.A0w;
                    if (fri2 != null) {
                        AbstractC166997dE.A19(context, fri2.A02, R.drawable.instagram_users_pano_outline_24);
                        FRI fri3 = c32314ELd.A0w;
                        if (fri3 != null) {
                            ViewOnClickListenerC35680FpF.A00(fri3.A00, 14, c32314ELd);
                            FRI fri4 = c32314ELd.A0w;
                            if (fri4 != null) {
                                AbstractC31173DnH.A1E(fri4.A00, c32314ELd, 2131959126);
                                FRI fri5 = c32314ELd.A0w;
                                if (fri5 != null) {
                                    AbstractC56952jT.A01(fri5.A00);
                                    FRI fri6 = c32314ELd.A0w;
                                    if (fri6 != null) {
                                        AbstractC25227BEk.A12(fri6.A05, c32314ELd, 2131959126);
                                        FRI fri7 = c32314ELd.A0w;
                                        if (fri7 != null) {
                                            IgTextView igTextView = fri7.A04;
                                            InterfaceC09390do interfaceC09390do = c32314ELd.A17;
                                            UserSession A0r = AbstractC166987dD.A0r(interfaceC09390do);
                                            C14360o3.A0B(A0r, 1);
                                            ArrayList A04 = C7KH.A04(A0r, e70, EnumC31337Dq2.A05, false);
                                            int size = A04.size();
                                            if (size != 0) {
                                                if (size != 1) {
                                                    if (size != 2) {
                                                        if (size != 3) {
                                                            i = 2131959110;
                                                            objArr = new Object[3];
                                                            objArr[0] = A03(A04, 0);
                                                            objArr[1] = A03(A04, 1);
                                                            A032 = Integer.valueOf(A04.size() - 2);
                                                        } else {
                                                            i = 2131959148;
                                                            objArr = new Object[3];
                                                            objArr[0] = A03(A04, 0);
                                                            objArr[1] = A03(A04, 1);
                                                            A032 = A03(A04, 2);
                                                        }
                                                        objArr[2] = A032;
                                                    } else {
                                                        i = 2131959153;
                                                        objArr = new Object[]{A03(A04, 0), A03(A04, 1)};
                                                    }
                                                    A03 = context.getString(i, objArr);
                                                    C14360o3.A0A(A03);
                                                } else {
                                                    A03 = A03(A04, 0);
                                                }
                                                igTextView.setText(A03);
                                                FRI fri8 = c32314ELd.A0w;
                                                if (fri8 != null) {
                                                    A0K(fri8, 0);
                                                    FRI fri9 = c32314ELd.A0w;
                                                    if (fri9 != null) {
                                                        IgSimpleImageView igSimpleImageView = fri9.A03;
                                                        if (c32314ELd.A0f) {
                                                            i2 = 0;
                                                        }
                                                        igSimpleImageView.setVisibility(i2);
                                                        if (e70.A09 == 29) {
                                                            C142846ck A00 = AbstractC147806l5.A00(AbstractC166987dD.A0r(interfaceC09390do));
                                                            int A06 = e70.A06();
                                                            String A033 = E70.A03(e70);
                                                            String str = e70.A0Q;
                                                            C25531Mh A0I = AbstractC31172DnG.A0I(A00);
                                                            if (AbstractC25226BEj.A1Z(A0I)) {
                                                                AbstractC31175DnJ.A1B(A0I, A00);
                                                                AbstractC31174DnI.A1K(A0I, "people_section_rendered");
                                                                A0I.A0o("people_section");
                                                                A0I.A0h(AbstractC31179DnN.A0a(A0I, "thread_details", A033, str, A06));
                                                                A0I.Cht();
                                                                return;
                                                            }
                                                            return;
                                                        }
                                                        return;
                                                    }
                                                }
                                            } else {
                                                throw AbstractC166987dD.A14("At least one member should exist in a group");
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            } else {
                FRI fri10 = c32314ELd.A0w;
                if (fri10 != null) {
                    A0K(fri10, 8);
                    return;
                }
            }
            C14360o3.A0F("peopleSection");
            throw C00O.createAndThrow();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x0132, code lost:
    
        if (r5 == false) goto L64;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01b2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A0D(X.C32314ELd r26) {
        /*
            Method dump skipped, instructions count: 905
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C32314ELd.A0D(X.ELd):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x00e7, code lost:
    
        if (A0M(r42) != false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:248:0x0608, code lost:
    
        if (X.C161867Mw.A02(r8) == false) goto L209;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00fa, code lost:
    
        if (r5 != false) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:308:0x06e4, code lost:
    
        if (r5.A09 != 29) goto L263;
     */
    /* JADX WARN: Code restructure failed: missing block: B:420:0x0872, code lost:
    
        if (X.C18U.A06(r6, r7, 36319377334279566L) == false) goto L829;
     */
    /* JADX WARN: Code restructure failed: missing block: B:701:0x0d15, code lost:
    
        if (X.C18U.A06(X.C06090Tz.A05, X.AbstractC166987dD.A0r(r42.A17), 36325081043710655L) == false) goto L588;
     */
    /* JADX WARN: Code restructure failed: missing block: B:706:0x0d37, code lost:
    
        if (X.C18U.A06(X.C06090Tz.A05, X.AbstractC166987dD.A0r(r42.A17), 36325081043645118L) != false) goto L594;
     */
    /* JADX WARN: Code restructure failed: missing block: B:783:0x0e8a, code lost:
    
        if (X.AbstractC166997dE.A0Y(r15).CS0(r3) == false) goto L658;
     */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0428  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x04c4  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x04eb  */
    /* JADX WARN: Removed duplicated region for block: B:394:0x0831  */
    /* JADX WARN: Removed duplicated region for block: B:423:0x0879  */
    /* JADX WARN: Removed duplicated region for block: B:460:0x1181  */
    /* JADX WARN: Removed duplicated region for block: B:575:0x0b0e  */
    /* JADX WARN: Removed duplicated region for block: B:597:0x113f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A0E(X.C32314ELd r42) {
        /*
            Method dump skipped, instructions count: 4843
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C32314ELd.A0E(X.ELd):void");
    }

    public static void A0J(FRI fri) {
        fri.A00.setVisibility(8);
    }

    public static void A0K(FRI fri, int i) {
        fri.A00.setVisibility(i);
    }

    public static final boolean A0L(C32314ELd c32314ELd) {
        C189478aR A0x = AbstractC25228BEl.A0x(c32314ELd.getActivity(), C3DN.A00);
        if (A0x != null && A0x.A0S() && (A0x.A03.A0M() instanceof C32314ELd)) {
            return true;
        }
        return false;
    }

    public static final boolean A0M(C32314ELd c32314ELd) {
        int i;
        E70 e70 = c32314ELd.A0Z;
        if (e70 != null) {
            UserSession A0r = AbstractC166987dD.A0r(c32314ELd.A17);
            C14360o3.A0B(A0r, 0);
            C17060sy.A01.A01(A0r);
            if (e70.A0K == null && !e70.A0m) {
                if (C161867Mw.A01(A0r, e70.A0D) && !C18U.A06(C06090Tz.A05, A0r, 36325312971224047L)) {
                    return false;
                }
                if ((!e70.A0v && (i = e70.A09) != 29 && !C4GR.A02(i)) || E70.A05(e70)) {
                    return false;
                }
                C06090Tz c06090Tz = C06090Tz.A05;
                if (!C18U.A06(c06090Tz, A0r, 36314214775654898L) || e70.A0k) {
                    return false;
                }
                InterfaceC83733oI interfaceC83733oI = e70.A0L;
                if (!AbstractC140946Yw.A08(interfaceC83733oI)) {
                    C14360o3.A0B(interfaceC83733oI, 0);
                    if (!(interfaceC83733oI instanceof MsysThreadId) || !C18U.A06(c06090Tz, A0r, 36318363714132083L)) {
                        return false;
                    }
                    return true;
                }
                return true;
            }
            return false;
        }
        return false;
    }

    public final UserSession A0N() {
        return AbstractC166987dD.A0r(this.A17);
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0r(this.A17);
    }

    @Override // X.InterfaceC60072op
    public final boolean onBackPressed() {
        C31786Dy5 c31786Dy5 = this.A0u;
        NestableViewPager nestableViewPager = this.A0y;
        if (nestableViewPager != null) {
            if (nestableViewPager.getVisibility() == 0 && c31786Dy5 != null && c31786Dy5.getCount() > 0) {
                NestableViewPager nestableViewPager2 = this.A0y;
                if (nestableViewPager2 != null) {
                    InterfaceC08430c6 A01 = c31786Dy5.A01(nestableViewPager2.getCurrentItem());
                    if (A01 instanceof InterfaceC60072op) {
                        return ((InterfaceC60072op) A01).onBackPressed();
                    }
                    return false;
                }
            } else {
                return false;
            }
        }
        C14360o3.A0F("viewPager");
        throw C00O.createAndThrow();
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [X.2wZ, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v3, types: [com.instagram.direct.ui.collections.DirectThreadDetailsCollectionRowViewModel, java.lang.Object] */
    public C32314ELd() {
        AbstractC54912fq.A00();
        this.A13 = new Object();
        ArrayList A1E = AbstractC166987dD.A1E();
        ?? obj = new Object();
        obj.A01 = A1E;
        obj.A00 = null;
        obj.A02 = false;
        obj.A03 = false;
        this.A12 = obj;
        C2GS c2gs = new C2GS();
        this.A10 = c2gs;
        this.A0z = c2gs;
        this.A18 = C37052GUi.A00(this, 17);
        C37052GUi c37052GUi = new C37052GUi(this, 11);
        InterfaceC09390do A00 = AbstractC09440dt.A00(EnumC09460dv.A02, new C37052GUi(new C37052GUi(this, 14), 15));
        this.A16 = AbstractC25225BEi.A0a(new C37052GUi(A00, 16), c37052GUi, new C37018GSz(33, A00, null), AbstractC25225BEi.A1D(C50900MeV.class));
        this.A0e = C05F.A01;
        this.A15 = C37052GUi.A00(this, 10);
        this.A19 = C31728DwZ.A00(this, 1);
        this.A1A = C31728DwZ.A00(this, 2);
        this.A17 = AbstractC60492pY.A02(this);
    }

    public static FRI A00(View view, int i) {
        View requireViewById = view.requireViewById(i);
        C14360o3.A07(requireViewById);
        return new FRI(requireViewById);
    }

    public static final ENA A01(C32314ELd c32314ELd) {
        int i;
        String str;
        boolean z = c32314ELd.requireArguments().getBoolean("DirectThreadDetailFragment.SHOULD_ALLOW_LEAVE_CONVERSATION", true);
        UserSession A0r = AbstractC166987dD.A0r(c32314ELd.A17);
        Capabilities capabilities = c32314ELd.A03;
        if (capabilities == null) {
            str = "threadCapabilities";
        } else {
            InterfaceC83733oI interfaceC83733oI = c32314ELd.A0c;
            if (interfaceC83733oI == null) {
                str = "threadId";
            } else {
                E70 e70 = c32314ELd.A0Z;
                if (e70 != null) {
                    i = e70.A09;
                } else {
                    i = 0;
                }
                return AbstractC34090F2s.A00(A0r, capabilities, interfaceC83733oI, i, z, false);
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    public static String A03(AbstractList abstractList, int i) {
        return ((C32107E9f) abstractList.get(i)).A00.getUsername();
    }

    public static final void A08(C32314ELd c32314ELd) {
        AbstractC31179DnN.A10(A01(c32314ELd), c32314ELd);
        E70 e70 = c32314ELd.A0Z;
        if (e70 != null && e70.A09 == 29) {
            C142846ck A00 = AbstractC147806l5.A00(AbstractC166987dD.A0r(c32314ELd.A17));
            int A06 = e70.A06();
            String A03 = E70.A03(e70);
            String str = e70.A0Q;
            C25531Mh A0I = AbstractC31172DnG.A0I(A00);
            if (AbstractC25226BEj.A1Z(A0I)) {
                AbstractC31175DnJ.A1B(A0I, A00);
                AbstractC31174DnI.A1I(A0I, "people_sheet_rendered");
                A0I.A0o("people_section");
                A0I.A0h(AbstractC31179DnN.A0a(A0I, "thread_details", A03, str, A06));
                A0I.Cht();
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:55:0x010b, code lost:
    
        if (X.C18U.A06(X.C06090Tz.A05, X.AbstractC166987dD.A0r(r2), 36322748877056475L) != false) goto L52;
     */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0171  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A0F(X.C32314ELd r12) {
        /*
            Method dump skipped, instructions count: 445
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C32314ELd.A0F(X.ELd):void");
    }

    @Override // X.InterfaceC37157GYu
    public final void AHL() {
        A08(this);
    }

    @Override // X.InterfaceC37197Ga8
    public final void APy() {
        A0E(this);
    }

    @Override // X.InterfaceC37197Ga8
    public final void Ch3() {
        String str;
        FragmentActivity activity = getActivity();
        if (activity != null && !AbstractC46763KmK.A00(activity)) {
            this.A11.A01();
            activity.finish();
        }
        InterfaceC83733oI interfaceC83733oI = this.A0c;
        if (interfaceC83733oI == null) {
            C14360o3.A0F("threadId");
            throw C00O.createAndThrow();
        }
        C83693oE A02 = AbstractC1345466e.A02(interfaceC83733oI);
        if (A02 != null && (str = A02.A00) != null) {
            AbstractC25651Mw.A00(AbstractC166987dD.A0r(this.A17)).E4s(new LYK(str, false));
        }
    }

    @Override // X.InterfaceC37197Ga8
    public final void ChP() {
        A07(this);
    }

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        AbstractC25235BEs.A1H(interfaceC56362iU);
        interfaceC56362iU.setTitle("");
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onActivityResult(int i, int i2, Intent intent) {
        WDF wdf;
        super.onActivityResult(i, i2, intent);
        if (i == 9587 && i2 == 9683) {
            C3DO c3do = C3DN.A00;
            C3DN A00 = c3do.A00(requireActivity());
            if (A00 != null && ((C3DP) A00).A0h) {
                AbstractC167017dG.A0y(requireActivity(), c3do);
            }
            getParentFragmentManager().A0c(((C14240no) getParentFragmentManager().A0S(0)).A00);
        }
        if (intent != null && (wdf = this.A0a) != null) {
            InterfaceC69973Cg interfaceC69973Cg = wdf.A0E;
            interfaceC69973Cg.onActivityResult(i, i2, intent);
            AbstractC50666MYj.A00(((C69963Cf) interfaceC69973Cg).A04).A09(null, 6);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        IllegalArgumentException A12;
        int i;
        String str;
        int A02 = C0f9.A02(1204472011);
        super.onCreate(bundle);
        Bundle requireArguments = requireArguments();
        Context requireContext = requireContext();
        Capabilities capabilities = (Capabilities) requireArguments.getParcelable("DirectFragment.DIRECT_FRAGMENT_THREAD_CAPABILITIES");
        if (capabilities != null) {
            this.A03 = capabilities;
            InterfaceC83733oI A00 = AbstractC35077Fco.A00(requireArguments, "DirectFragment.DIRECT_FRAGMENT_ARGUMENT_THREAD_ID");
            if (A00 != null) {
                this.A0c = A00;
                String str2 = "threadId";
                this.A0k = A00 instanceof MsysThreadId;
                InterfaceC09390do interfaceC09390do = this.A17;
                UserSession A0r = AbstractC166987dD.A0r(interfaceC09390do);
                InterfaceC83733oI interfaceC83733oI = this.A0c;
                if (interfaceC83733oI != null) {
                    Capabilities capabilities2 = this.A03;
                    if (capabilities2 == null) {
                        str2 = "threadCapabilities";
                    } else {
                        InterfaceC37169GZg A01 = C7KH.A01(requireContext, A0r, capabilities2, interfaceC83733oI);
                        this.A0Q = A01;
                        if (A01 == null) {
                            str2 = "clientInfra";
                        } else {
                            InterfaceC37279GbW.A01(A01);
                            this.A0j = requireArguments.getBoolean("DirectFragment.DIRECT_FRAGMENT_ARGUMENT_IS_ELIGIBLE_FOR_DMM", false);
                            this.A02 = AbstractC31176DnK.A0O(AbstractC166987dD.A0r(interfaceC09390do), __redex_internal_original_name);
                            UserSession A0r2 = AbstractC166987dD.A0r(interfaceC09390do);
                            C06090Tz c06090Tz = C06090Tz.A05;
                            this.A0l = C18U.A06(c06090Tz, A0r2, 36314889085979534L);
                            UserSession A0r3 = AbstractC166987dD.A0r(interfaceC09390do);
                            InterfaceC83733oI interfaceC83733oI2 = this.A0c;
                            if (interfaceC83733oI2 != null) {
                                C83693oE A022 = AbstractC1345466e.A02(interfaceC83733oI2);
                                if (A022 == null || (str = A022.A00) == null) {
                                    str = "";
                                }
                                Integer num = C05F.A00;
                                this.A0V = new C33090Eip(A0r3, num, str);
                                this.A0S = new C34589FLy(AbstractC166987dD.A0r(interfaceC09390do), new C34419FFj(this));
                                AbstractC10360h2 childFragmentManager = getChildFragmentManager();
                                C14360o3.A07(childFragmentManager);
                                this.A0u = new C31786Dy5(childFragmentManager, this);
                                C27961Xa A002 = AbstractC54912fq.A00();
                                UserSession A0r4 = AbstractC166987dD.A0r(interfaceC09390do);
                                QuickPromotionSlot quickPromotionSlot = QuickPromotionSlot.A0N;
                                C54922fr A0S = AbstractC31175DnJ.A0S();
                                A0S.A02 = new GCN(this, 0);
                                A0S.A00 = new GCM(this, 0);
                                A0S.A0B = false;
                                this.A0d = AbstractC31175DnJ.A0T(this, A0r4, A0S, A002, quickPromotionSlot);
                                UserSession A0r5 = AbstractC166987dD.A0r(interfaceC09390do);
                                C64842wi c64842wi = this.A0d;
                                if (c64842wi == null) {
                                    str2 = "quickPromotionDelegate";
                                } else {
                                    C31539DtP c31539DtP = new C31539DtP(A0r5, this, c64842wi);
                                    this.A0U = c31539DtP;
                                    registerLifecycleListener(c31539DtP);
                                    this.A0T = new C34632FNp(requireContext, AbstractC166987dD.A0r(interfaceC09390do), new C34420FFk(this));
                                    if (C18U.A06(c06090Tz, AbstractC166987dD.A0r(interfaceC09390do), 36329075362512897L)) {
                                        AbstractC23641Du.A03(num, AnonymousClass191.A00, new GSR(this, null, 26), C07Y.A00(this));
                                    }
                                    InterfaceC83733oI interfaceC83733oI3 = this.A0c;
                                    if (interfaceC83733oI3 != null) {
                                        C83693oE A023 = AbstractC1345466e.A02(interfaceC83733oI3);
                                        if (A023 != null) {
                                            UserSession A0r6 = AbstractC166987dD.A0r(interfaceC09390do);
                                            String str3 = A023.A00;
                                            String str4 = this.A12.A00;
                                            EV0 A003 = EV0.A00(this, 10);
                                            C14360o3.A0B(A0r6, 0);
                                            C14360o3.A0B(str3, 1);
                                            C25621Ms A0M = AbstractC31177DnL.A0M(A0r6);
                                            A0M.A0B("collections/list/");
                                            A0M.A0R(C32205EDe.class, FXH.class);
                                            A0M.A9s(ThreadMetadataOverrideFragment.BUNDLE_THREAD_ID, str3);
                                            A0M.A0D("count", 4);
                                            A0M.A9s("show_without_media", "false");
                                            A0M.A0H("max_id", str4);
                                            AbstractC31175DnJ.A1K(A0M, A003);
                                        }
                                        C0f9.A09(612418348, A02);
                                        return;
                                    }
                                }
                            }
                        }
                    }
                }
                C14360o3.A0F(str2);
                throw C00O.createAndThrow();
            }
            A12 = AbstractC31172DnG.A0t();
            i = 1585894657;
        } else {
            A12 = AbstractC166987dD.A12("threadCapabilities can't be null");
            i = -943125304;
        }
        C0f9.A09(i, A02);
        throw A12;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-2115907009);
        C14360o3.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.direct_thread_details_home_fragment, viewGroup, false);
        C0f9.A09(1286637551, A02);
        return inflate;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroy() {
        int A02 = C0f9.A02(1230255380);
        super.onDestroy();
        C34632FNp c34632FNp = this.A0T;
        if (c34632FNp != null) {
            E70 e70 = this.A0Z;
            if (e70 != null) {
                e70.A08();
            }
            c34632FNp.A01.A00.dispose();
        }
        C31786Dy5 c31786Dy5 = this.A0u;
        if (c31786Dy5 != null) {
            c31786Dy5.A00.clear();
        }
        this.A0u = null;
        C31539DtP c31539DtP = this.A0U;
        if (c31539DtP == null) {
            C14360o3.A0F("restrictController");
            throw C00O.createAndThrow();
        }
        unregisterLifecycleListener(c31539DtP);
        WDF wdf = this.A0a;
        if (wdf != null) {
            wdf.A02 = null;
        }
        C0f9.A09(-1646704648, A02);
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        int A02 = C0f9.A02(-333264665);
        NestableViewPager nestableViewPager = this.A0y;
        if (nestableViewPager == null) {
            C14360o3.A0F("viewPager");
            throw C00O.createAndThrow();
        }
        nestableViewPager.setAdapter(null);
        this.A11.A01();
        super.onDestroyView();
        C0f9.A09(-140315011, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        int A02 = C0f9.A02(-1459618579);
        super.onPause();
        InterfaceC37169GZg interfaceC37169GZg = this.A0Q;
        if (interfaceC37169GZg != null) {
            interfaceC37169GZg.BOE().stop();
            InterfaceC37169GZg interfaceC37169GZg2 = this.A0Q;
            if (interfaceC37169GZg2 != null) {
                InterfaceC50513MRq B5I = interfaceC37169GZg2.B5I();
                if (B5I != null) {
                    B5I.stop();
                }
                C25671My A00 = AbstractC25651Mw.A00(AbstractC166987dD.A0r(this.A17));
                A00.A02(this.A19, C2Io.class);
                A00.A02(this.A1A, C42281xI.class);
                C34632FNp c34632FNp = this.A0T;
                if (c34632FNp != null) {
                    c34632FNp.A01.A01();
                }
                C0f9.A09(37046401, A02);
                return;
            }
        }
        C14360o3.A0F("clientInfra");
        throw C00O.createAndThrow();
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onResume() {
        E70 e70;
        C5G2 c5g2;
        String str;
        EHQ ehq;
        C83693oE A02;
        int A022 = C0f9.A02(49502270);
        super.onResume();
        InterfaceC09390do interfaceC09390do = this.A17;
        if (LockedChatKillSwitch.isLockedChatEnabled(AbstractC166987dD.A0r(interfaceC09390do), false) && (e70 = this.A0Z) != null && e70.A02 == 1 && (c5g2 = this.A0W) != null) {
            InterfaceC83733oI interfaceC83733oI = e70.A0L;
            if (interfaceC83733oI != null && (A02 = AbstractC1345466e.A02(interfaceC83733oI)) != null) {
                str = A02.A00;
            } else {
                str = null;
            }
            if (c5g2.A00(str)) {
                EHQ ehq2 = this.A0X;
                if (ehq2 == null) {
                    ehq2 = AbstractC34107F3j.A00("thread_details_page", null);
                    this.A0X = ehq2;
                    ehq2.A04 = new C37052GUi(this, 12);
                    ehq2.A03 = new C37052GUi(this, 13);
                }
                Dialog dialog = ((C0SG) ehq2).A01;
                if ((dialog == null || !dialog.isShowing()) && (ehq = this.A0X) != null) {
                    ehq.A0B(getParentFragmentManager(), AbstractC111324zv.A00(2680));
                }
            }
        }
        InterfaceC37169GZg interfaceC37169GZg = this.A0Q;
        if (interfaceC37169GZg != null) {
            InterfaceC37279GbW.A01(interfaceC37169GZg);
            InterfaceC37169GZg interfaceC37169GZg2 = this.A0Q;
            if (interfaceC37169GZg2 != null) {
                InterfaceC50513MRq B5I = interfaceC37169GZg2.B5I();
                if (C7KH.A07(AbstractC166987dD.A0r(interfaceC09390do)) && B5I != null) {
                    GSS.A02(B5I, this, C07Y.A00(this), 26);
                    B5I.start();
                }
                C25671My A00 = AbstractC25651Mw.A00(AbstractC166987dD.A0r(interfaceC09390do));
                A00.A01(this.A19, C2Io.class);
                A00.A01(this.A1A, C42281xI.class);
                A07(this);
                C0f9.A09(-1747863420, A022);
                return;
            }
        }
        C14360o3.A0F("clientInfra");
        throw C00O.createAndThrow();
    }
}
