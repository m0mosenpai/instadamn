package X;

import android.animation.Animator;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.feed.widget.IgProgressImageView;
import com.instagram.ui.mediaactions.LikeActionView;
import com.instagram.ui.widget.bannertoast.BannerToast;
import com.instagram.ui.widget.roundedcornerlayout.RoundedCornerFrameLayout;
import com.instagram.ui.widget.slidecontentlayout.SlideContentLayout;
import com.instagram.ui.widget.textureview.ScalingTextureView;

/* renamed from: X.6Ot, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C138376Ot extends AbstractC143566dv implements InterfaceC143626e2, InterfaceC143646e4 {
    public UserSession A00;
    public C105824pt A01;
    public C41181vS A02;
    public C41551w4 A03;
    public C141596ac A04;
    public NXR A05;
    public C52819NZc A06;
    public C54724OFb A07;
    public ODS A08;
    public C56162OwU A09;
    public C56178Owl A0A;
    public C52828NZl A0B;
    public C54730OFh A0C;
    public C56180Own A0D;
    public OMQ A0E;
    public OJp A0F;
    public OE9 A0G;
    public C55064OaK A0H;
    public C56044OuG A0I;
    public C52841NZy A0J;
    public O9D A0K;
    public C56161OwT A0L;
    public OCV A0M;
    public OF2 A0N;
    public C54731OFi A0O;
    public final View A0P;
    public final View A0Q;
    public final View A0R;
    public final View A0S;
    public final View A0T;
    public final ViewGroup A0U;
    public final ViewGroup A0V;
    public final ConstraintLayout A0W;
    public final IgImageView A0X;
    public final C57012jc A0Y;
    public final C57012jc A0Z;
    public final C86073se A0a;
    public final IgProgressImageView A0b;
    public final C50548MTf A0c;
    public final InterfaceC145376gw A0d;
    public final C50549MTg A0e;
    public final C143656e5 A0f;
    public final C3PX A0g;
    public final LikeActionView A0h;
    public final RoundedCornerFrameLayout A0i;
    public final SlideContentLayout A0j;
    public final View A0k;
    public final View A0l;
    public final ViewGroup A0m;
    public final EditText A0n;
    public final FrameLayout A0o;
    public final TextView A0p;
    public final ConstraintLayout A0q;
    public final C57012jc A0r;
    public final C57012jc A0s;
    public final ScalingTextureView A0t;
    public final InterfaceC09390do A0u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C138376Ot(View view, UserSession userSession, InterfaceC145376gw interfaceC145376gw) {
        super(view);
        ViewStub viewStub;
        ViewStub viewStub2;
        ViewStub viewStub3;
        C56161OwT c56161OwT;
        C57012jc c57012jc;
        ScalingTextureView scalingTextureView;
        IgImageView igImageView;
        ViewStub viewStub4;
        C14360o3.A0B(view, 1);
        this.A0d = interfaceC145376gw;
        this.A00 = userSession;
        View findViewById = view.findViewById(R.id.iglive_reel_layout);
        C14360o3.A07(findViewById);
        ViewGroup viewGroup = (ViewGroup) findViewById;
        this.A0V = viewGroup;
        this.A0u = C1XM.A00(new C9EH(this, 12));
        this.A0c = new C50548MTf(view);
        View findViewById2 = view.findViewById(R.id.reel_viewer_zero_rating_data_banner_stub);
        if (findViewById2 instanceof ViewStub) {
            viewStub = (ViewStub) findViewById2;
        } else {
            viewStub = null;
        }
        this.A0Z = new C57012jc(viewStub);
        View findViewById3 = view.findViewById(R.id.iglive_reactions_layout);
        C14360o3.A07(findViewById3);
        this.A0T = findViewById3;
        this.A0k = view.findViewById(R.id.iglive_reactions_composer);
        this.A0n = (EditText) view.findViewById(R.id.comment_composer_edit_text);
        View findViewById4 = view.findViewById(R.id.iglive_label_row_layout);
        C14360o3.A07(findViewById4);
        this.A0Q = findViewById4;
        View findViewById5 = view.findViewById(R.id.iglive_label_layout);
        C14360o3.A07(findViewById5);
        this.A0q = (ConstraintLayout) findViewById5;
        View findViewById6 = view.findViewById(R.id.iglive_label);
        C14360o3.A07(findViewById6);
        this.A0p = (TextView) findViewById6;
        View findViewById7 = findViewById4.findViewById(R.id.iglive_view_count_container);
        C14360o3.A07(findViewById7);
        this.A0R = findViewById7;
        View findViewById8 = view.findViewById(R.id.iglive_permissions_container);
        C14360o3.A07(findViewById8);
        this.A0m = (ViewGroup) findViewById8;
        View findViewById9 = view.findViewById(R.id.supporter_big_heart);
        C14360o3.A07(findViewById9);
        this.A0h = (LikeActionView) findViewById9;
        this.A0g = C3PW.A00(view, R.id.iglive_expired_view_stub);
        View findViewById10 = view.findViewById(R.id.iglive_reel_content);
        C14360o3.A07(findViewById10);
        this.A0P = findViewById10;
        View findViewById11 = view.findViewById(R.id.iglive_confetti_stub);
        if (findViewById11 instanceof ViewStub) {
            viewStub2 = (ViewStub) findViewById11;
        } else {
            viewStub2 = null;
        }
        this.A0r = new C57012jc(viewStub2);
        View findViewById12 = view.findViewById(R.id.iglive_userpay_animation_stub);
        if (findViewById12 instanceof ViewStub) {
            viewStub3 = (ViewStub) findViewById12;
        } else {
            viewStub3 = null;
        }
        this.A0Y = new C57012jc(viewStub3);
        if (AbstractC109224vo.A05(this.A00)) {
            c56161OwT = new C56161OwT(viewGroup, this.A00);
        } else {
            c56161OwT = null;
        }
        this.A0L = c56161OwT;
        ConstraintLayout constraintLayout = (ConstraintLayout) C3PW.A00(view, R.id.iglive_media_layout_stub).A00().findViewById(R.id.iglive_surface_view_frame);
        this.A0W = constraintLayout;
        this.A0i = (RoundedCornerFrameLayout) constraintLayout.findViewById(R.id.iglive_media_layout);
        this.A0j = (SlideContentLayout) view.findViewById(R.id.interactivity_question_sticker_container);
        this.A0X = (IgImageView) this.A0i.findViewById(R.id.reel_viewer_broadcast_cover);
        if (!C4R8.A00(this.A00, "reel_live_viewer")) {
            View findViewById13 = this.A0i.findViewById(R.id.reel_viewer_texture_viewstub);
            if (findViewById13 instanceof ViewStub) {
                viewStub4 = (ViewStub) findViewById13;
            } else {
                viewStub4 = null;
            }
            c57012jc = new C57012jc(viewStub4);
        } else {
            c57012jc = null;
        }
        this.A0s = c57012jc;
        this.A0e = new C50549MTg(this.A0i);
        this.A0l = this.A0i.findViewById(R.id.reel_viewer_top_shadow);
        IgProgressImageView igProgressImageView = (IgProgressImageView) this.A0i.findViewById(R.id.reel_viewer_image_view);
        this.A0b = igProgressImageView;
        igProgressImageView.getIgImageView().setScaleType(ImageView.ScaleType.CENTER_CROP);
        IgProgressImageView igProgressImageView2 = this.A0b;
        Context context = view.getContext();
        igProgressImageView2.setPlaceHolderColor(context.getColor(AbstractC53242c7.A0H(context, R.attr.igds_color_stories_loading_background)));
        IgProgressImageView igProgressImageView3 = this.A0b;
        Drawable drawable = context.getDrawable(R.drawable.video_determinate_progress);
        C14360o3.A0A(drawable);
        igProgressImageView3.setProgressBarDrawable(drawable);
        View findViewById14 = this.A0i.findViewById(R.id.media_cover_view_stub);
        C14360o3.A0C(findViewById14, "null cannot be cast to non-null type android.view.ViewStub");
        this.A0a = AbstractC86053sc.A00((ViewStub) findViewById14);
        View findViewById15 = this.A0i.findViewById(R.id.media_url_share_interstitial_view_stub);
        C14360o3.A0C(findViewById15, "null cannot be cast to non-null type android.view.ViewStub");
        this.A0f = new C143656e5((ViewStub) findViewById15);
        if (c57012jc != null) {
            scalingTextureView = (ScalingTextureView) c57012jc.A01();
        } else {
            scalingTextureView = null;
        }
        this.A0t = scalingTextureView;
        this.A0U = viewGroup;
        this.A0o = C4R8.A00(this.A00, "reel_live_viewer") ? this.A0i : null;
        C52828NZl c52828NZl = this.A0B;
        if (c52828NZl != null) {
            igImageView = c52828NZl.A0G;
        } else {
            igImageView = null;
        }
        this.A0S = igImageView;
    }

    public final void A02(AbstractC59962oe abstractC59962oe, boolean z) {
        C2GT c2gt;
        OCV ocv = this.A0M;
        if (ocv != null) {
            ((C50885MeG) ocv.A03.getValue()).A01.A05(abstractC59962oe.getViewLifecycleOwner());
        }
        C54724OFb c54724OFb = this.A07;
        if (c54724OFb != null) {
            ((C50916Mel) c54724OFb.A0B.getValue()).A00.A05(abstractC59962oe.getViewLifecycleOwner());
        }
        C52841NZy c52841NZy = this.A0J;
        if (c52841NZy != null) {
            c52841NZy.A05(abstractC59962oe);
        }
        C56162OwU c56162OwU = this.A09;
        if (c56162OwU != null) {
            AnonymousClass195 anonymousClass195 = c56162OwU.A01;
            if (anonymousClass195 != null) {
                anonymousClass195.AGH(null);
            }
            c56162OwU.A01 = null;
            InterfaceC09390do interfaceC09390do = c56162OwU.A0G;
            ((C51026MgZ) interfaceC09390do.getValue()).A01.A05(abstractC59962oe.getViewLifecycleOwner());
            C51026MgZ c51026MgZ = (C51026MgZ) interfaceC09390do.getValue();
            c51026MgZ.A0B.A0E.Egh(false);
            c51026MgZ.A0F.Egh(new C51699MsU(null, "", false, false, false));
            EditText editText = c56162OwU.A07;
            editText.setOnFocusChangeListener(null);
            editText.setOnClickListener(null);
            editText.setOnEditorActionListener(null);
            editText.removeTextChangedListener(c56162OwU.A0B);
            editText.setText("");
            editText.setHint(2131956426);
            Animator animator = c56162OwU.A00;
            if (animator != null) {
                animator.removeAllListeners();
            }
            Animator animator2 = c56162OwU.A00;
            if (animator2 != null) {
                animator2.cancel();
            }
        }
        OMQ omq = this.A0E;
        if (omq != null) {
            omq.A04();
        }
        C52828NZl c52828NZl = this.A0B;
        if (c52828NZl != null) {
            C50971Mfe c50971Mfe = c52828NZl.A01;
            if (c50971Mfe != null && (c2gt = c50971Mfe.A00) != null) {
                c2gt.A05(abstractC59962oe.getViewLifecycleOwner());
            }
            c52828NZl.A01 = null;
        }
        OF2 of2 = this.A0N;
        if (of2 != null) {
            AnonymousClass195 anonymousClass1952 = of2.A00;
            if (anonymousClass1952 != null) {
                anonymousClass1952.AGH(null);
            }
            of2.A00 = null;
            C51003MgA c51003MgA = (C51003MgA) of2.A07.getValue();
            C54706OEi c54706OEi = c51003MgA.A03;
            c54706OEi.A00 = null;
            c54706OEi.A01 = null;
            c51003MgA.A04.A00 = null;
        }
        C54730OFh c54730OFh = this.A0C;
        if (c54730OFh != null) {
            AnonymousClass195 anonymousClass1953 = c54730OFh.A00;
            if (anonymousClass1953 != null) {
                anonymousClass1953.AGH(null);
            }
            c54730OFh.A00 = null;
            C51005MgC c51005MgC = (C51005MgC) c54730OFh.A0D.getValue();
            C141796aw A00 = AbstractC141776au.A00(c51005MgC);
            AbstractC23641Du.A03(C05F.A00, AnonymousClass191.A00, new C57164PZi(c51005MgC, (InterfaceC23621Ds) null, 28), A00);
            c51005MgC.A03.A05.A08();
        }
        C52819NZc c52819NZc = this.A06;
        if (c52819NZc != null) {
            C52863NaK c52863NaK = c52819NZc.A03;
            c52863NaK.A05();
            ((AbstractC52821NZe) c52819NZc).A03.A04.A05(((PJ0) c52819NZc).A04.getViewLifecycleOwner());
            if (!z) {
                C51169MjD c51169MjD = c52819NZc.A07;
                c51169MjD.A06.clear();
                c51169MjD.A01();
                ((PJ0) c52819NZc).A03.requestLayout();
                ((C3PX) ((AbstractC52821NZe) c52819NZc).A04.getValue()).A00().setVisibility(8);
                c52863NaK.A04 = false;
                c52863NaK.A02 = false;
                c52863NaK.A03 = false;
                AnonymousClass195 anonymousClass1954 = c52863NaK.A01;
                if (anonymousClass1954 != null) {
                    anonymousClass1954.AGH(null);
                }
                c52863NaK.A01 = null;
                AnonymousClass195 anonymousClass1955 = c52863NaK.A00;
                if (anonymousClass1955 != null) {
                    anonymousClass1955.AGH(null);
                }
                c52863NaK.A00 = null;
            }
        }
        OJp oJp = this.A0F;
        if (oJp != null) {
            AnonymousClass195 anonymousClass1956 = oJp.A00;
            if (anonymousClass1956 != null) {
                anonymousClass1956.AGH(null);
            }
            oJp.A00 = null;
            ((C50939Mf8) oJp.A08.getValue()).A00.A05(oJp.A03.getViewLifecycleOwner());
        }
        OE9 oe9 = this.A0G;
        if (oe9 != null) {
            AnonymousClass195 anonymousClass1957 = oe9.A00;
            if (anonymousClass1957 != null) {
                anonymousClass1957.AGH(null);
            }
            oe9.A00 = null;
            C50954MfN c50954MfN = (C50954MfN) oe9.A05.getValue();
            c50954MfN.A01 = false;
            c50954MfN.A00 = false;
        }
        O9D o9d = this.A0K;
        if (o9d != null) {
            AnonymousClass195 anonymousClass1958 = o9d.A00;
            if (anonymousClass1958 != null) {
                anonymousClass1958.AGH(null);
            }
            o9d.A00 = null;
        }
        C56180Own c56180Own = this.A0D;
        if (c56180Own != null) {
            AnonymousClass195 anonymousClass1959 = c56180Own.A00;
            if (anonymousClass1959 != null) {
                anonymousClass1959.AGH(null);
            }
            c56180Own.A00 = null;
        }
        C54731OFi c54731OFi = this.A0O;
        if (c54731OFi != null) {
            C50959MfS c50959MfS = (C50959MfS) c54731OFi.A09.getValue();
            OF1 of1 = c50959MfS.A05;
            C1Df c1Df = of1.A00;
            if (c1Df != null) {
                c1Df.cancel();
            }
            of1.A00 = null;
            AnonymousClass195 anonymousClass19510 = c50959MfS.A00;
            if (anonymousClass19510 != null) {
                anonymousClass19510.AGH(null);
            }
            c50959MfS.A00 = null;
            AnonymousClass195 anonymousClass19511 = c54731OFi.A02;
            if (anonymousClass19511 != null) {
                anonymousClass19511.AGH(null);
            }
            c54731OFi.A02 = null;
        }
        NXR nxr = this.A05;
        if (nxr != null) {
            C50980Mfn c50980Mfn = (C50980Mfn) nxr.A06.getValue();
            AnonymousClass195 anonymousClass19512 = c50980Mfn.A01;
            if (anonymousClass19512 != null) {
                anonymousClass19512.AGH(null);
            }
            c50980Mfn.A01 = null;
            AnonymousClass195 anonymousClass19513 = nxr.A00;
            if (anonymousClass19513 != null) {
                anonymousClass19513.AGH(null);
            }
            nxr.A00 = null;
        }
    }

    @Override // X.InterfaceC143646e4
    public final void Dds(C141596ac c141596ac, int i) {
        C41181vS c41181vS;
        C14360o3.A0B(c141596ac, 0);
        C41551w4 c41551w4 = this.A03;
        if (c41551w4 != null && (c41181vS = this.A02) != null && i == 2) {
            this.A0d.DPU(c41181vS, c41551w4, c141596ac.A18);
        }
    }

    public final void A00() {
        C50549MTg c50549MTg = this.A0e;
        if (c50549MTg != null) {
            c50549MTg.A00().A08();
            c50549MTg.A00().setVisibility(8);
        }
    }

    public final void A01() {
        C50549MTg c50549MTg = this.A0e;
        InterfaceC09390do interfaceC09390do = c50549MTg.A03;
        if (((C3PX) interfaceC09390do.getValue()).A01()) {
            BannerToast bannerToast = (BannerToast) ((C3PX) interfaceC09390do.getValue()).A00();
            BannerToast.A00(bannerToast);
            C55982hj c55982hj = bannerToast.A00;
            c55982hj.getClass();
            c55982hj.A04();
        }
        c50549MTg.A01.setVisibility(8);
        A00();
    }

    public final void A03(boolean z) {
        View view = this.A0T;
        int i = 0;
        int i2 = 8;
        if (z) {
            i2 = 0;
        }
        view.setVisibility(i2);
        C52828NZl c52828NZl = this.A0B;
        if (c52828NZl != null) {
            View view2 = c52828NZl.A03;
            if (!z) {
                i = 8;
            }
            view2.setVisibility(i);
        }
        AbstractC13880nE.A0O(view);
    }

    @Override // X.InterfaceC143586dx
    public final IgProgressImageView BGy() {
        return this.A0b;
    }

    @Override // X.InterfaceC143596dy
    public final C41181vS Blb() {
        return this.A02;
    }

    @Override // X.InterfaceC143586dx
    public final FrameLayout Blf() {
        return this.A0o;
    }

    @Override // X.InterfaceC143586dx
    public final ScalingTextureView C6w() {
        return this.A0t;
    }

    @Override // X.InterfaceC143626e2
    public final void ERN(float f) {
        View view = this.A0T;
        view.setVisibility(0);
        view.setAlpha(f);
    }
}
