package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.widget.imageview.ConstrainedImageView;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.feed.su.model.MiddleStateCardUser;
import com.instagram.model.mediasize.ExtendedImageUrl;
import com.instagram.user.model.User;
import java.util.List;

/* loaded from: classes8.dex */
public final class KBN extends AbstractC59962oe {
    public static final String __redex_internal_original_name = "MiddleStateProfilePreviewCardFragment";
    public int A00;
    public int A01;
    public View A02;
    public MiddleStateCardUser A03;
    public C123835ix A04;
    public User A05;
    public C63702ur A06;
    public String A07;
    public String A08;
    public String A09;
    public String A0A;
    public String A0B;
    public final InterfaceC09390do A0E;
    public final InterfaceC09390do A0F;
    public final String A0D = "middle_state_profile_preview_card";
    public int A0C = -1;
    public final InterfaceC41501vz A0G = new C44288Jhe(this, 18);

    public final void A04(User user, List list, boolean z) {
        String str;
        C38321qM c38321qM;
        ExtendedImageUrl A1o;
        View view = this.A02;
        Integer num = null;
        if (view != null) {
            ViewGroup A0C = AbstractC31176DnK.A0C(view, R.id.profile_preview_card_user_media_container);
            if (user != null) {
                num = user.A0M();
            }
            if (num == C05F.A0C) {
                A01(R.drawable.instagram_lock_outline_96, AbstractC166997dE.A0p(requireContext(), 2131975479), AbstractC166997dE.A0p(requireContext(), 2131962734));
            } else if (AbstractC166987dD.A1b(list)) {
                A0C.getLayoutParams().height = -2;
                int i = 0;
                do {
                    LayoutInflater from = LayoutInflater.from(getContext());
                    View view2 = this.A02;
                    if (view2 != null) {
                        int i2 = 0;
                        View inflate = from.inflate(R.layout.grid_row_container, (ViewGroup) view2, false);
                        C14360o3.A0C(inflate, "null cannot be cast to non-null type android.widget.LinearLayout");
                        ViewGroup viewGroup = (ViewGroup) inflate;
                        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
                        if (i < 1) {
                            layoutParams.setMargins(0, 0, 0, AbstractC167017dG.A07(requireContext()));
                        }
                        viewGroup.setLayoutParams(layoutParams);
                        do {
                            int i3 = (i * 3) + i2;
                            if (i3 < list.size()) {
                                c38321qM = (C38321qM) list.get(i3);
                            } else {
                                c38321qM = null;
                            }
                            ConstrainedImageView constrainedImageView = new ConstrainedImageView(requireContext());
                            if (c38321qM != null && (A1o = c38321qM.A1o(AbstractC166997dE.A0N(this).getDimensionPixelSize(R.dimen.caption_overlay_offset_with_social_bubble_and_uas))) != null) {
                                constrainedImageView.setUrl(AbstractC166987dD.A0o(this.A0E), A1o, this);
                            }
                            LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(0, -2, 1.0f);
                            if (i2 < 2) {
                                layoutParams2.setMarginEnd(AbstractC167017dG.A07(requireContext()));
                            }
                            constrainedImageView.setLayoutParams(layoutParams2);
                            constrainedImageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
                            viewGroup.addView(constrainedImageView);
                            i2++;
                        } while (i2 < 3);
                        A0C.addView(viewGroup);
                        i++;
                    }
                } while (i < 2);
            } else if (z) {
                C14360o3.A0B(A0C, 0);
                A01(R.drawable.instagram_arrow_cw_pano_outline_24, AbstractC166997dE.A0p(requireContext(), 2131956850), "");
                View A0S = AbstractC166997dE.A0S(A0C, R.id.profile_preview_card_empty_state_icon);
                int dimensionPixelSize = AbstractC166997dE.A0N(this).getDimensionPixelSize(R.dimen.abc_dialog_padding_material);
                AbstractC43592JPx.A1G(A0S, dimensionPixelSize);
                AbstractC43592JPx.A1F(A0S, dimensionPixelSize);
            } else {
                if (user != null) {
                    str = AbstractC31178DnM.A0c(requireContext(), user, 2131968587);
                    C14360o3.A07(str);
                } else {
                    str = "";
                }
                A01(R.drawable.empty_state_camera, AbstractC166997dE.A0p(requireContext(), 2131968586), str);
            }
            ViewOnClickListenerC48074LPz.A01(A0C, 51, this);
            A0C.setVisibility(0);
            return;
        }
        C14360o3.A0F("containerView");
        throw C00O.createAndThrow();
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        AbstractC31176DnK.A0Q(this.A0E).A01(this.A0G, C3MC.class);
        AbstractC43593JPy.A1E(getViewLifecycleOwner(), ((C50890MeL) this.A0F.getValue()).A00, new C50268MHx(32, view, this), 42);
    }

    public final void A00() {
        FragmentActivity activity;
        int i = this.A0C;
        if (i != -1 && (activity = getActivity()) != null) {
            C30D.A04(activity, i);
        }
        C28431Ze A02 = AbstractC31364DqT.A02();
        InterfaceC09390do interfaceC09390do = this.A0E;
        UserSession A0r = AbstractC166987dD.A0r(interfaceC09390do);
        UserSession A0r2 = AbstractC166987dD.A0r(interfaceC09390do);
        String str = this.A0A;
        if (str == null) {
            C14360o3.A0F("userId");
            throw C00O.createAndThrow();
        }
        C31368DqX A01 = AbstractC31402Dr6.A01(A0r2, str, "middle_state_profile_preview_card", this.A0D);
        A01.A0i = true;
        Fragment A022 = A02.A02(A0r, A01.A03());
        C140966Yy A0c = AbstractC25231BEo.A0c(requireActivity(), interfaceC09390do);
        A0c.A08();
        A0c.A0D(A022);
        A0c.A04();
    }

    public final void A01(int i, String str, String str2) {
        View view = this.A02;
        if (view == null) {
            C14360o3.A0F("containerView");
            throw C00O.createAndThrow();
        }
        View A0S = AbstractC166997dE.A0S(view, R.id.profile_preview_card_empty_state_container);
        ImageView A0D = AbstractC31176DnK.A0D(A0S, R.id.profile_preview_card_empty_state_icon);
        TextView A0N = AbstractC167007dF.A0N(A0S, R.id.profile_preview_card_empty_state_title);
        TextView A0N2 = AbstractC167007dF.A0N(A0S, R.id.profile_preview_card_empty_state_subtitle);
        A0S.setVisibility(0);
        A0D.setImageResource(i);
        A0N.setText(str);
        if (str2.length() > 0) {
            A0N2.setText(str2);
        } else {
            A0N2.setVisibility(8);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x00b2, code lost:
    
        if (r10 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x00ad, code lost:
    
        if (r10 != null) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A02(android.view.View r9, com.instagram.user.model.User r10) {
        /*
            r8 = this;
            if (r10 == 0) goto Lac
            X.17P r0 = r10.A03
            java.lang.Integer r0 = r0.B7S()
            if (r0 == 0) goto Lac
            int r4 = r0.intValue()
        Le:
            X.17P r0 = r10.A03
            java.lang.Integer r0 = r0.B7X()
            if (r0 == 0) goto Lb1
            int r7 = r0.intValue()
        L1a:
            X.17P r0 = r10.A03
            java.lang.Integer r0 = r0.BQb()
            if (r0 == 0) goto Lb6
            int r6 = r0.intValue()
        L26:
            r0 = 2131438516(0x7f0b2bb4, float:1.8498961E38)
            android.view.View r0 = r9.findViewById(r0)
            r3 = 0
            X.2iX r5 = X.AbstractC56372iV.A00(r0)
            android.view.View r1 = r5.getView()
            r0 = 2131440443(0x7f0b333b, float:1.850287E38)
            android.widget.TextView r2 = X.AbstractC166997dE.A0T(r1, r0)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r4)
            android.content.res.Resources r0 = X.AbstractC166997dE.A0N(r8)
            r4 = 1
            java.lang.String r0 = X.AbstractC43744JWe.A00(r0, r1, r3, r4)
            r2.setText(r0)
            android.view.View r1 = r5.getView()
            r0 = 2131440445(0x7f0b333d, float:1.8502874E38)
            android.widget.TextView r2 = X.AbstractC166997dE.A0T(r1, r0)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r7)
            android.content.res.Resources r0 = X.AbstractC166997dE.A0N(r8)
            java.lang.String r0 = X.AbstractC43744JWe.A00(r0, r1, r3, r4)
            r2.setText(r0)
            android.view.View r1 = r5.getView()
            r0 = 2131440451(0x7f0b3343, float:1.8502886E38)
            android.widget.TextView r2 = X.AbstractC166997dE.A0T(r1, r0)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r6)
            android.content.res.Resources r0 = X.AbstractC166997dE.A0N(r8)
            java.lang.String r0 = X.AbstractC43744JWe.A00(r0, r1, r3, r4)
            r2.setText(r0)
            android.view.View r1 = r5.getView()
            r0 = 2131440432(0x7f0b3330, float:1.8502847E38)
            android.view.View r0 = r1.requireViewById(r0)
            r0.setBackground(r3)
            android.view.View r1 = r5.getView()
            r0 = 2131440426(0x7f0b332a, float:1.8502835E38)
            android.view.View r0 = r1.requireViewById(r0)
            r0.setBackground(r3)
            android.view.View r1 = r5.getView()
            r0 = 2131440427(0x7f0b332b, float:1.8502837E38)
            android.view.View r0 = r1.requireViewById(r0)
            r0.setBackground(r3)
            return
        Lac:
            r4 = 0
            if (r10 == 0) goto Lb1
            goto Le
        Lb1:
            r7 = 0
            if (r10 == 0) goto Lb6
            goto L1a
        Lb6:
            r6 = 0
            goto L26
        */
        throw new UnsupportedOperationException("Method not decompiled: X.KBN.A02(android.view.View, com.instagram.user.model.User):void");
    }

    public final void A05(String str) {
        MiddleStateCardUser middleStateCardUser = this.A03;
        String str2 = "middleStateCardUser";
        if (middleStateCardUser != null) {
            if (middleStateCardUser.A0A) {
                String str3 = this.A0A;
                if (str3 != null) {
                    String str4 = this.A07;
                    if (str4 == null) {
                        str2 = "containerModule";
                    } else {
                        String str5 = "";
                        String str6 = middleStateCardUser.A00;
                        int i = this.A01;
                        int i2 = this.A00;
                        String str7 = middleStateCardUser.A07;
                        String str8 = middleStateCardUser.A04;
                        String str9 = middleStateCardUser.A05;
                        String str10 = middleStateCardUser.A06;
                        String str11 = middleStateCardUser.A03;
                        if (str11 != null) {
                            str5 = str11;
                        }
                        C63702ur c63702ur = this.A06;
                        if (c63702ur != null) {
                            C63702ur.A04(c63702ur, str6, str4, null, str, str5, str8, str9, str10, str7, str3, "middle_state_profile", i2, i);
                            return;
                        }
                        return;
                    }
                }
            } else {
                C123835ix c123835ix = this.A04;
                if (c123835ix != null) {
                    String str12 = this.A0A;
                    if (str12 != null) {
                        int i3 = this.A00;
                        String str13 = middleStateCardUser.A01;
                        if (str13 != null) {
                            c123835ix.A03(str12, str13, "middle_state_profile", middleStateCardUser.A00, middleStateCardUser.A07, i3);
                            return;
                        }
                        throw AbstractC166997dE.A0g();
                    }
                } else {
                    return;
                }
            }
            str2 = "userId";
        }
        C14360o3.A0F(str2);
        throw C00O.createAndThrow();
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        String str = this.A07;
        if (str == null) {
            C14360o3.A0F("containerModule");
            throw C00O.createAndThrow();
        }
        return str;
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A0E);
    }

    public KBN() {
        J7S j7s = new J7S(this, 33);
        InterfaceC09390do A00 = AbstractC09440dt.A00(EnumC09460dv.A02, new J7S(new J7S(this, 30), 31));
        this.A0F = AbstractC25225BEi.A0a(new J7S(A00, 32), j7s, new D8M(29, null, A00), AbstractC25225BEi.A1D(C50890MeL.class));
        this.A0E = AbstractC60492pY.A02(this);
    }

    public final void A03(View view, User user) {
        View A0E = AbstractC31173DnH.A0E(AbstractC167007dF.A0M(view, R.id.profile_header_avatar_container_top_left_stub), R.layout.profile_header_user_avatar);
        IgImageView A0T = AbstractC167007dF.A0T(A0E, R.id.row_profile_header_imageview);
        if (user != null) {
            user.Bhu();
            AbstractC31173DnH.A1T(this, A0T, user);
        } else {
            AbstractC166997dE.A19(requireContext(), A0T, R.drawable.profile_anonymous_user);
        }
        ViewGroup.MarginLayoutParams A0G = AbstractC31177DnL.A0G(A0T);
        int A02 = AbstractC31171DnF.A02(AbstractC166997dE.A0N(this), R.dimen.activation_card_icon_container_width);
        ((ViewGroup.LayoutParams) A0G).height = A02;
        ((ViewGroup.LayoutParams) A0G).width = A02;
        A0G.bottomMargin = AbstractC167017dG.A06(requireContext());
        A0T.setLayoutParams(A0G);
        AbstractC31176DnK.A1D(A0E, R.id.reel_ring);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(-50512349);
        super.onCreate(bundle);
        MiddleStateCardUser middleStateCardUser = (MiddleStateCardUser) AbstractC153636vY.A00(requireArguments(), MiddleStateCardUser.class, "ARG_MIDDLE_STATE_CARD_USER");
        this.A03 = middleStateCardUser;
        if (middleStateCardUser != null) {
            this.A0A = middleStateCardUser.A08;
            String str = middleStateCardUser.A09;
            String str2 = "";
            if (str == null) {
                str = "";
            }
            this.A0B = str;
            String str3 = middleStateCardUser.A02;
            if (str3 == null) {
                str3 = "";
            }
            this.A09 = str3;
            this.A00 = requireArguments().getInt("ARG_ITEM_POSITION");
            this.A01 = requireArguments().getInt("ARG_VIEW_STATE_ITEM_TYPE");
            String string = requireArguments().getString("ARG_DISPLAY_FORMAT");
            if (string == null) {
                string = "";
            }
            this.A08 = string;
            String string2 = requireArguments().getString("ARG_CONTAINER_MODULE");
            if (string2 != null) {
                str2 = string2;
            }
            this.A07 = str2;
            this.A0C = requireArguments().getInt("ARG_INITIAL_NAVIGATION_BAR_COLOR");
            MiddleStateCardUser middleStateCardUser2 = this.A03;
            if (middleStateCardUser2 != null) {
                boolean z = middleStateCardUser2.A0A;
                UserSession A0r = AbstractC166987dD.A0r(this.A0E);
                if (z) {
                    this.A06 = new C63702ur(this, A0r);
                } else {
                    this.A04 = new C123835ix(this, A0r);
                }
                C0f9.A09(-1268465324, A02);
                return;
            }
        }
        C14360o3.A0F("middleStateCardUser");
        throw C00O.createAndThrow();
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(740799425);
        C14360o3.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.profile_preview_card, viewGroup, false);
        this.A02 = inflate;
        if (inflate == null) {
            C14360o3.A0F("containerView");
            throw C00O.createAndThrow();
        }
        C0f9.A09(-1355409893, A02);
        return inflate;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        int A02 = C0f9.A02(-815063147);
        super.onDestroyView();
        AbstractC31176DnK.A0Q(this.A0E).A02(this.A0G, C3MC.class);
        C0f9.A09(995440015, A02);
    }
}
