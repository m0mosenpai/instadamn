package X;

import android.app.Activity;
import android.content.res.Resources;
import android.graphics.Paint;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.StateListDrawable;
import android.graphics.drawable.shapes.Shape;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.common.ui.base.IgFrameLayout;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.direct.perf.constants.ThreadFetchReason;
import com.instagram.direct.request.response.GroupLinkPreviewResponse$Success;
import com.instagram.reels.interactive.view.AvatarView;
import com.instagram.ui.widget.progressbutton.ProgressButton;
import com.instagram.ui.widget.spinner.SpinnerImageView;
import java.io.Serializable;

/* loaded from: classes6.dex */
public final class EN8 extends AbstractC59962oe implements InterfaceC1119153d {
    public static final String __redex_internal_original_name = "GroupPreviewFragment";
    public ViewGroup A00;
    public IgTextView A01;
    public IgTextView A02;
    public IgTextView A03;
    public IgTextView A04;
    public IgTextView A05;
    public IgTextView A06;
    public IgTextView A07;
    public IgTextView A08;
    public IgImageView A09;
    public IgImageView A0A;
    public InterfaceC37196Ga7 A0C;
    public GroupLinkPreviewResponse$Success A0D;
    public AvatarView A0E;
    public AvatarView A0F;
    public ProgressButton A0G;
    public SpinnerImageView A0H;
    public boolean A0I;
    public boolean A0J;
    public IgFrameLayout A0K;
    public InterfaceC16820sZ A0L;
    public final InterfaceC09390do A0M = C37058GUs.A01(this, 20);
    public EnumC33373Ep6 A0B = EnumC33373Ep6.A0L;
    public final InterfaceC09390do A0O = AbstractC25225BEi.A0a(new C37058GUs(this, 22), new C37058GUs(this, 23), new C50170MDx(15, null, this), AbstractC25225BEi.A1D(C31838Dyx.class));
    public final InterfaceC09390do A0N = AbstractC60492pY.A02(this);

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "GroupLinkPreview";
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C14360o3.A0B(view, 0);
        C30D.A04(requireActivity(), AbstractC166997dE.A0N(this).getColor(R.color.igds_transparent_navigation_bar, requireActivity().getTheme()));
        super.onViewCreated(view, bundle);
        this.A0J = AbstractC167007dF.A1W(requireArguments().getString("GroupPreviewFragment.STORY_ID_KEY"));
        IgFrameLayout igFrameLayout = (IgFrameLayout) view;
        this.A0K = igFrameLayout;
        String str = "rootViewGroup";
        if (igFrameLayout != null) {
            this.A00 = (ViewGroup) AbstractC31178DnM.A0A(igFrameLayout, R.id.group_preview_sheet_content_stub);
            IgFrameLayout igFrameLayout2 = this.A0K;
            if (igFrameLayout2 != null) {
                this.A0H = (SpinnerImageView) igFrameLayout2.requireViewById(R.id.group_preview_spinner);
                ViewGroup viewGroup = this.A00;
                str = "contentViewGroup";
                if (viewGroup != null) {
                    this.A0F = (AvatarView) viewGroup.requireViewById(R.id.profile_photos);
                    ViewGroup viewGroup2 = this.A00;
                    if (viewGroup2 != null) {
                        this.A09 = AbstractC31172DnG.A0Z(viewGroup2, R.id.custom_profile_photo);
                        ViewGroup viewGroup3 = this.A00;
                        if (viewGroup3 != null) {
                            IgImageView A0Z = AbstractC31172DnG.A0Z(viewGroup3, R.id.subscriber_badge);
                            AbstractC166997dE.A19(requireContext(), A0Z, R.drawable.instagram_icons_exceptions_illo_subscriber_crown2_filled_68);
                            this.A0A = A0Z;
                            ViewGroup viewGroup4 = this.A00;
                            if (viewGroup4 != null) {
                                this.A0E = (AvatarView) viewGroup4.requireViewById(R.id.avatar);
                                ViewGroup viewGroup5 = this.A00;
                                if (viewGroup5 != null) {
                                    this.A08 = AbstractC31172DnG.A0X(viewGroup5, R.id.title);
                                    ViewGroup viewGroup6 = this.A00;
                                    if (viewGroup6 != null) {
                                        this.A07 = AbstractC31172DnG.A0X(viewGroup6, R.id.member_count);
                                        ViewGroup viewGroup7 = this.A00;
                                        if (viewGroup7 != null) {
                                            IgTextView A0X = AbstractC31172DnG.A0X(viewGroup7, R.id.connected_text);
                                            A0X.setVisibility(0);
                                            this.A02 = A0X;
                                            ViewGroup viewGroup8 = this.A00;
                                            if (viewGroup8 != null) {
                                                this.A05 = AbstractC31172DnG.A0X(viewGroup8, R.id.group_author_disclaimer);
                                                ViewGroup viewGroup9 = this.A00;
                                                if (viewGroup9 != null) {
                                                    this.A01 = AbstractC31172DnG.A0X(viewGroup9, R.id.conected_text_enhanced);
                                                    ViewGroup viewGroup10 = this.A00;
                                                    if (viewGroup10 != null) {
                                                        IgTextView A0X2 = AbstractC31172DnG.A0X(viewGroup10, R.id.join_explainer_text);
                                                        A0X2.setVisibility(0);
                                                        this.A04 = A0X2;
                                                        ViewGroup viewGroup11 = this.A00;
                                                        if (viewGroup11 != null) {
                                                            this.A06 = AbstractC31172DnG.A0X(viewGroup11, R.id.linkified_join_explainer_text);
                                                            ViewGroup viewGroup12 = this.A00;
                                                            if (viewGroup12 != null) {
                                                                ProgressButton progressButton = (ProgressButton) viewGroup12.requireViewById(R.id.join_chat_button);
                                                                C74843Xy c74843Xy = new C74843Xy();
                                                                c74843Xy.A06(AbstractC13880nE.A04(requireContext(), 8));
                                                                C162817Qs c162817Qs = new C162817Qs(c74843Xy, 126);
                                                                ShapeDrawable shapeDrawable = new ShapeDrawable(c162817Qs);
                                                                Resources.Theme theme = requireActivity().getTheme();
                                                                int color = AbstractC166997dE.A0N(this).getColor(AbstractC53242c7.A0C(getContext()), theme);
                                                                Shape shape = shapeDrawable.getShape();
                                                                Paint.Style style = Paint.Style.FILL;
                                                                AbstractC148406mA.A02(style, shapeDrawable, shape, 0.0f, color);
                                                                ShapeDrawable shapeDrawable2 = new ShapeDrawable(c162817Qs);
                                                                AbstractC148406mA.A02(style, shapeDrawable2, shapeDrawable2.getShape(), 0.0f, AbstractC166997dE.A0N(this).getColor(R.color.blue_5_30_transparent, theme));
                                                                StateListDrawable stateListDrawable = new StateListDrawable();
                                                                stateListDrawable.addState(new int[]{-16842910}, shapeDrawable2);
                                                                stateListDrawable.addState(new int[0], shapeDrawable);
                                                                progressButton.setBackground(stateListDrawable);
                                                                progressButton.setEnabled(false);
                                                                ViewOnClickListenerC35680FpF.A00(progressButton, 43, this);
                                                                this.A0G = progressButton;
                                                                ViewGroup viewGroup13 = this.A00;
                                                                if (viewGroup13 != null) {
                                                                    IgTextView A0X3 = AbstractC31172DnG.A0X(viewGroup13, R.id.decline_invite_button);
                                                                    A0X3.setVisibility(8);
                                                                    ViewOnClickListenerC35680FpF.A00(A0X3, 44, this);
                                                                    this.A03 = A0X3;
                                                                    if (this.A0B == EnumC33373Ep6.A0E) {
                                                                        AbstractC135966Db.A01(AbstractC166987dD.A0r(this.A0N)).A0A(EnumC33477ErC.SEEN, "");
                                                                        return;
                                                                    }
                                                                    return;
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    public static final void A00(Activity activity, EN8 en8, ThreadFetchReason threadFetchReason, String str) {
        if (activity != null && str != null) {
            LL3.A03(AbstractC166987dD.A0r(en8.A0N), threadFetchReason, new C36455G6f(activity, en8, str), 20, str, false);
        }
    }

    @Override // X.InterfaceC1119153d
    public final void Czx() {
        InterfaceC37196Ga7 interfaceC37196Ga7 = this.A0C;
        if (interfaceC37196Ga7 != null) {
            interfaceC37196Ga7.Czz(this.A0I);
        }
        EnumC33373Ep6 enumC33373Ep6 = this.A0B;
        if (enumC33373Ep6 != EnumC33373Ep6.A06 && enumC33373Ep6 != EnumC33373Ep6.A0F && enumC33373Ep6 != EnumC33373Ep6.A0E && !EnumC33373Ep6.A00.A00(enumC33373Ep6)) {
            InterfaceC16820sZ interfaceC16820sZ = this.A0L;
            if (interfaceC16820sZ != null) {
                interfaceC16820sZ.invoke();
            }
            this.A0L = null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x005a, code lost:
    
        if (r8 != false) goto L22;
     */
    @Override // X.InterfaceC1119153d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void D00() {
        /*
            r9 = this;
            X.0do r0 = r9.A0O
            java.lang.Object r0 = r0.getValue()
            X.Dyx r0 = (X.C31838Dyx) r0
            X.FQg r2 = r0.A04
            if (r2 == 0) goto L94
            boolean r0 = r2 instanceof X.C32791Ebv
            if (r0 != 0) goto L94
            boolean r0 = r2 instanceof X.C32790Ebu
            if (r0 != 0) goto L94
            boolean r0 = r2 instanceof X.C32789Ebt
            if (r0 != 0) goto L94
            X.Ebw r2 = (X.C32792Ebw) r2
            boolean r0 = r2.A0A
            if (r0 == 0) goto Lba
            com.instagram.common.session.UserSession r0 = r2.A00
            X.18A r1 = X.AnonymousClass189.A00(r0)
            com.instagram.direct.request.response.GroupLinkPreviewResponse$Success r4 = r2.A05
            java.lang.Long r3 = r4.A04
            java.lang.String r0 = java.lang.String.valueOf(r3)
            com.instagram.user.model.User r0 = r1.A02(r0)
            if (r0 == 0) goto Lb7
            X.17Q r1 = r0.A02
        L34:
            X.17Q r0 = X.C17Q.A06
            boolean r8 = X.AbstractC167007dF.A1X(r1, r0)
            X.0do r0 = r2.A07
            X.6ck r7 = X.AbstractC31172DnG.A0d(r0)
            com.instagram.direct.request.response.GroupLinkPreviewResponse$BroadcastThreadGroupLinkPreviewInfo r0 = r2.A04
            if (r0 == 0) goto Lb5
            int r6 = r0.A00
        L46:
            X.Ep6 r5 = r2.A01
            java.lang.String r4 = r4.A0A
            java.lang.String r3 = java.lang.String.valueOf(r3)
            r0 = 3
            X.C14360o3.A0B(r3, r0)
            X.1Mh r2 = X.AbstractC31172DnG.A0I(r7)
            r0 = 2
            if (r6 != r0) goto L5c
            r1 = 1
            if (r8 == 0) goto L5d
        L5c:
            r1 = 0
        L5d:
            boolean r0 = X.AbstractC25226BEj.A1Z(r2)
            if (r0 == 0) goto L94
            if (r1 == 0) goto L94
            java.util.HashMap r1 = X.AbstractC166987dD.A1G()
            java.lang.String r0 = "creator_igid"
            r1.put(r0, r3)
            java.lang.String r0 = X.C142846ck.A01(r5)
            if (r0 == 0) goto L77
            X.AbstractC31171DnF.A1T(r0, r1)
        L77:
            X.AbstractC31175DnJ.A1B(r2, r7)
            java.lang.String r0 = "not_subscribe_to_creator"
            X.AbstractC31174DnI.A1I(r2, r0)
            java.lang.String r0 = "subscribe_to_join_chat_sheet"
            r2.A0o(r0)
            java.lang.String r0 = X.C142846ck.A02(r5)
            X.AbstractC31178DnM.A1H(r2, r0, r6)
            r2.A0r(r4)
            r2.A0v(r1)
            r2.Cht()
        L94:
            X.Ep6 r1 = r9.A0B
            X.Ep6 r0 = X.EnumC33373Ep6.A06
            if (r1 != r0) goto La5
            boolean r0 = r9.A0I
            if (r0 == 0) goto La5
            X.Ga7 r0 = r9.A0C
            if (r0 == 0) goto La5
            r0.DV6()
        La5:
            androidx.fragment.app.FragmentActivity r2 = r9.getActivity()
            if (r2 == 0) goto Lb4
            r1 = 21
            X.GUs r0 = new X.GUs
            r0.<init>(r2, r1)
            r9.A0L = r0
        Lb4:
            return
        Lb5:
            r6 = 1
            goto L46
        Lb7:
            r1 = 0
            goto L34
        Lba:
            com.instagram.direct.request.response.GroupLinkPreviewResponse$Success r7 = r2.A05
            boolean r0 = r7.A0D
            if (r0 != 0) goto L94
            com.instagram.common.session.UserSession r6 = r2.A00
            X.18A r1 = X.AnonymousClass189.A00(r6)
            java.lang.Long r0 = r7.A04
            java.lang.String r0 = java.lang.String.valueOf(r0)
            com.instagram.user.model.User r5 = r1.A02(r0)
            if (r5 == 0) goto L94
            X.0do r0 = r2.A07
            X.6ck r4 = X.AbstractC31172DnG.A0d(r0)
            com.instagram.direct.request.response.GroupLinkPreviewResponse$BroadcastThreadGroupLinkPreviewInfo r0 = r2.A04
            if (r0 == 0) goto Lee
            int r3 = r0.A00
        Lde:
            X.Ep6 r2 = r2.A01
            java.lang.String r1 = r7.A0A
            X.2kX r0 = X.C57582kX.A00(r6)
            boolean r0 = r0.A0Q(r5)
            r4.A0G(r2, r1, r3, r0)
            goto L94
        Lee:
            r3 = 1
            goto Lde
        */
        throw new UnsupportedOperationException("Method not decompiled: X.EN8.D00():void");
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A0N);
    }

    @Override // X.AbstractC59972of
    public final void afterOnViewCreated() {
        C50679MYx c50679MYx;
        C50679MYx c50679MYx2;
        C50679MYx c50679MYx3;
        C07Y.A00(this).A00(new GSS(this, null, 32));
        C07Y.A00(this).A00(new GSR(this, null, 28));
        C07Y.A00(this).A00(new GSR(this, null, 29));
        C31838Dyx c31838Dyx = (C31838Dyx) this.A0O.getValue();
        Bundle requireArguments = requireArguments();
        GroupLinkPreviewResponse$Success groupLinkPreviewResponse$Success = this.A0D;
        Serializable serializable = requireArguments.getSerializable("GroupPreviewFragment.JOINING_SURFACE");
        C14360o3.A0C(serializable, "null cannot be cast to non-null type com.instagram.direct.channels.joinsurface.JoiningSurface");
        c31838Dyx.A03 = (EnumC33373Ep6) serializable;
        c31838Dyx.A05 = requireArguments.getString("GroupPreviewFragment.INVITE_LINK_SOURCE_KEY");
        String string = requireArguments.getString("GroupPreviewFragment.GROUP_LINK_HASH");
        if (string != null) {
            c50679MYx = new C50679MYx(string, c31838Dyx.A05, 33);
        } else {
            c50679MYx = null;
        }
        c31838Dyx.A00 = c50679MYx;
        String string2 = requireArguments.getString("GroupPreviewFragment.STORY_ID_KEY");
        if (string2 != null) {
            c50679MYx2 = new C50679MYx(string2, requireArguments.getString("GroupPreviewFragment.CHAT_STICKER_CHANNEL_TYPE"), 35);
        } else {
            c50679MYx2 = null;
        }
        c31838Dyx.A02 = c50679MYx2;
        c31838Dyx.A06 = requireArguments.getString("GroupPreviewFragment.NOTE_ID");
        String string3 = requireArguments.getString("GroupPreviewFragment.PINNED_SSC_THREAD_ID");
        if (string3 != null) {
            c50679MYx3 = new C50679MYx(string3, AbstractC31173DnH.A0k(requireArguments, "GroupPreviewFragment.FAN_CLUB_ID"), 34);
        } else {
            c50679MYx3 = null;
        }
        c31838Dyx.A01 = c50679MYx3;
        C33091Eir c33091Eir = c31838Dyx.A09;
        C50679MYx c50679MYx4 = c31838Dyx.A00;
        C50679MYx c50679MYx5 = c31838Dyx.A02;
        String str = c31838Dyx.A06;
        c33091Eir.A01.F8s(C32799Ec3.A00);
        AbstractC166987dD.A1Z(new PZ8(c50679MYx4, c50679MYx5, c50679MYx3, c33091Eir, groupLinkPreviewResponse$Success, str, null), ((C4A7) c33091Eir).A01);
        c31838Dyx.A07 = requireArguments.getString("GroupPreviewFragment.SC_INVITE_ID");
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(-95147176);
        super.onCreate(bundle);
        Serializable serializable = requireArguments().getSerializable("GroupPreviewFragment.JOINING_SURFACE");
        C14360o3.A0C(serializable, "null cannot be cast to non-null type com.instagram.direct.channels.joinsurface.JoiningSurface");
        this.A0B = (EnumC33373Ep6) serializable;
        C0f9.A09(-2022830603, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(712673213);
        C14360o3.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.group_preview_sheet, viewGroup, false);
        C14360o3.A0C(inflate, AbstractC111324zv.A00(48));
        C0f9.A09(1839829510, A02);
        return inflate;
    }
}
