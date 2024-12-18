package X;

import android.content.Context;
import android.content.res.Resources;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.facebook.R;
import com.instagram.api.schemas.MusicInfo;
import com.instagram.api.schemas.RIXUAspectRatio;
import com.instagram.api.schemas.RIXUCoverSize;
import com.instagram.api.schemas.RIXULayoutFormat;
import com.instagram.api.schemas.RIXULayoutStyle;
import com.instagram.api.schemas.TrackData;
import com.instagram.clips.animatedthumbnail.AnimatedThumbnailView;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.ui.base.IgSimpleImageView;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.widget.imageview.ConstrainedImageView;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.model.mediasize.ExtendedImageUrl;
import com.instagram.model.mediasize.SpritesheetInfo;
import com.instagram.ui.widget.roundedcornerlayout.RoundedCornerFrameLayout;
import java.util.AbstractCollection;
import java.util.List;

/* renamed from: X.5ue, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC130345ue {
    public static final C101544hP A00(final Context context, ViewGroup viewGroup, RIXUCoverSize rIXUCoverSize, final InterfaceC11380iw interfaceC11380iw, UserSession userSession, final C4E3 c4e3, C60S c60s, final boolean z, boolean z2, boolean z3) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        RoundedCornerFrameLayout roundedCornerFrameLayout;
        Integer valueOf;
        int i;
        int dimensionPixelSize;
        int dimensionPixelSize2;
        int ordinal;
        C9B2 c9b2;
        float f;
        int ordinal2;
        float dimensionPixelSize3;
        float f2;
        float f3;
        float f4;
        float A04;
        float f5;
        RoundedCornerFrameLayout roundedCornerFrameLayout2;
        RoundedCornerFrameLayout roundedCornerFrameLayout3;
        C14360o3.A0B(context, 0);
        C14360o3.A0B(userSession, 1);
        C14360o3.A0B(viewGroup, 2);
        C14360o3.A0B(interfaceC11380iw, 7);
        View inflate = LayoutInflater.from(context).inflate(R.layout.clips_netego_card, viewGroup, false);
        if (c60s != null && c60s.A00()) {
            C14360o3.A0A(inflate);
            RIXULayoutStyle rIXULayoutStyle = c60s.A02;
            if (rIXULayoutStyle != null) {
                int ordinal3 = rIXULayoutStyle.ordinal();
                if (ordinal3 != 1) {
                    if (ordinal3 == 2 && (inflate instanceof RoundedCornerFrameLayout) && (roundedCornerFrameLayout3 = (RoundedCornerFrameLayout) inflate) != null) {
                        roundedCornerFrameLayout3.setCornerRadius(0);
                        roundedCornerFrameLayout3.setStrokeWidth(0.0f);
                    }
                } else if ((inflate instanceof RoundedCornerFrameLayout) && (roundedCornerFrameLayout2 = (RoundedCornerFrameLayout) inflate) != null) {
                    roundedCornerFrameLayout2.setCornerRadius(context.getResources().getDimensionPixelSize(R.dimen.abc_button_padding_horizontal_material));
                }
            }
            ViewGroup.LayoutParams layoutParams = inflate.getLayoutParams();
            C14360o3.A0C(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ((ViewGroup.MarginLayoutParams) layoutParams).setMarginEnd(0);
        } else if (z3 && C18U.A06(C06090Tz.A05, userSession, 36325811188086159L)) {
            C14360o3.A0A(inflate);
            if ((inflate instanceof RoundedCornerFrameLayout) && (roundedCornerFrameLayout = (RoundedCornerFrameLayout) inflate) != null) {
                roundedCornerFrameLayout.setCornerRadius(context.getResources().getDimensionPixelSize(R.dimen.ab_test_media_thumbnail_preview_item_internal_padding));
            }
            int dimensionPixelSize4 = context.getResources().getDimensionPixelSize(R.dimen.account_discovery_bottom_gap);
            ViewGroup.LayoutParams layoutParams2 = inflate.getLayoutParams();
            if ((layoutParams2 instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams2) != null) {
                marginLayoutParams.setMarginEnd(dimensionPixelSize4);
            }
        }
        int i2 = C3OO.FLAG_ADAPTER_FULLUPDATE;
        C14360o3.A0A(inflate);
        final C101544hP c101544hP = new C101544hP(inflate);
        inflate.setTag(c101544hP);
        View.OnClickListener onClickListener = new View.OnClickListener() { // from class: X.5uh
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int A05 = C0f9.A05(676744300);
                C4E3 c4e32 = C4E3.this;
                if (c4e32 instanceof C125595m5) {
                    ((C125595m5) c4e32).A01 = c101544hP.A03;
                }
                C101544hP c101544hP2 = c101544hP;
                C120985dq c120985dq = c101544hP2.A01;
                if (c120985dq != null) {
                    c4e32.D2V(c120985dq, c101544hP2);
                    if (z) {
                        view.setAlpha(0.7f);
                    }
                    C0f9.A0C(698950269, A05);
                    return;
                }
                IllegalStateException illegalStateException = new IllegalStateException("Required value was null.");
                C0f9.A0C(923102244, A05);
                throw illegalStateException;
            }
        };
        C0fQ.A00(onClickListener, inflate);
        inflate.setOnTouchListener(new View.OnTouchListener() { // from class: X.5ui
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                C4E3 c4e32 = c4e3;
                C101544hP c101544hP2 = c101544hP;
                C120985dq c120985dq = c101544hP2.A01;
                if (c120985dq != null) {
                    C14360o3.A0A(view);
                    C14360o3.A0A(motionEvent);
                    return c4e32.D2W(context, motionEvent, view, c120985dq, interfaceC11380iw, c101544hP2.getBindingAdapterPosition());
                }
                throw new IllegalStateException("Required value was null.");
            }
        });
        C0fQ.A00(onClickListener, c101544hP.A06);
        c101544hP.A0E.A0E = new InterfaceC73023Pd() { // from class: X.5uj
            @Override // X.InterfaceC73023Pd
            public final void DFp() {
            }

            @Override // X.InterfaceC73023Pd
            public final void DPX(C73083Pj c73083Pj) {
                C14360o3.A0B(c73083Pj, 0);
                C120985dq c120985dq = c101544hP.A01;
                if (c120985dq != null) {
                    C4E3 c4e32 = c4e3;
                    C38321qM c38321qM = c120985dq.A02;
                    if (c38321qM != null) {
                        c4e32.Dae(c73083Pj, c38321qM);
                        return;
                    }
                    throw new IllegalStateException("Required value was null.");
                }
            }
        };
        Context context2 = inflate.getContext();
        C14360o3.A07(context2);
        if (c60s != null && c60s.A00()) {
            int A01 = AbstractC13890nF.A01(context2);
            RIXUAspectRatio rIXUAspectRatio = c60s.A00;
            if (rIXUAspectRatio != null) {
                int ordinal4 = rIXUAspectRatio.ordinal();
                if (ordinal4 != 1) {
                    if (ordinal4 == 2) {
                        f = 1.3333334f;
                    }
                } else {
                    f = 1.7777778f;
                }
                RIXULayoutFormat rIXULayoutFormat = c60s.A01;
                if (rIXULayoutFormat == null) {
                    ordinal2 = -1;
                } else {
                    ordinal2 = rIXULayoutFormat.ordinal();
                }
                if (ordinal2 != 2) {
                    if (ordinal2 == 3) {
                        RIXULayoutStyle rIXULayoutStyle2 = c60s.A02;
                        if (rIXULayoutStyle2 != null) {
                            int ordinal5 = rIXULayoutStyle2.ordinal();
                            if (ordinal5 != 1) {
                                if (ordinal5 == 2) {
                                    f4 = A01 / 3.0f;
                                    A04 = AbstractC13880nE.A04(context2, 1);
                                    f3 = 2.0f;
                                    f5 = f4 - (A04 / f3);
                                }
                            } else {
                                dimensionPixelSize3 = (A01 - (context2.getResources().getDimensionPixelSize(R.dimen.ab_test_media_thumbnail_preview_item_internal_padding) * 2)) - (2.0f * AbstractC13880nE.A04(context2, 8));
                                f2 = 3.0f;
                                f5 = dimensionPixelSize3 / f2;
                            }
                        }
                        throw new IllegalArgumentException("Invalid grid layout style");
                    }
                } else {
                    RIXULayoutStyle rIXULayoutStyle3 = c60s.A02;
                    if (rIXULayoutStyle3 != null) {
                        int ordinal6 = rIXULayoutStyle3.ordinal();
                        if (ordinal6 != 1) {
                            if (ordinal6 == 2) {
                                f3 = 2.0f;
                                f4 = A01 / 2.0f;
                                A04 = AbstractC13880nE.A04(context2, 1);
                                f5 = f4 - (A04 / f3);
                            }
                        } else {
                            dimensionPixelSize3 = (A01 - (context2.getResources().getDimensionPixelSize(R.dimen.ab_test_media_thumbnail_preview_item_internal_padding) * 2)) - AbstractC13880nE.A04(context2, 8);
                            f2 = 2.0f;
                            f5 = dimensionPixelSize3 / f2;
                        }
                    }
                    throw new IllegalArgumentException("Invalid grid layout style");
                }
                c9b2 = new C9B2((int) f5, (int) (f5 * f), 2);
                ViewGroup.LayoutParams layoutParams3 = inflate.findViewById(R.id.preview_container).getLayoutParams();
                int i3 = c9b2.A01;
                layoutParams3.width = i3;
                layoutParams3.height = c9b2.A00;
                c101544hP.A00 = i3;
                return c101544hP;
            }
            throw new IllegalArgumentException("Invalid grid aspect ratio");
        }
        if (z3) {
            C06090Tz c06090Tz = C06090Tz.A05;
            if (C18U.A06(c06090Tz, userSession, 36325811188086159L)) {
                int A012 = (int) C18U.A01(c06090Tz, userSession, 36607286164854349L);
                float A00 = (float) C18U.A00(c06090Tz, userSession, 37170236118336010L);
                int A013 = (((AbstractC13890nF.A01(context2) - (context2.getResources().getDimensionPixelSize(R.dimen.account_discovery_bottom_gap) * (A012 + 1))) - (context2.getResources().getDimensionPixelSize(R.dimen.account_recs_header_image_margin) * ((A012 * 2) + 1))) - ((int) AbstractC13880nE.A04(context2, 48))) / A012;
                c9b2 = new C9B2(A013, (int) (A013 * A00), 2);
                ViewGroup.LayoutParams layoutParams32 = inflate.findViewById(R.id.preview_container).getLayoutParams();
                int i32 = c9b2.A01;
                layoutParams32.width = i32;
                layoutParams32.height = c9b2.A00;
                c101544hP.A00 = i32;
                return c101544hP;
            }
        }
        C06090Tz c06090Tz2 = C06090Tz.A05;
        float A002 = (float) C18U.A00(c06090Tz2, userSession, 37170236118008328L);
        float A003 = (float) C18U.A00(c06090Tz2, userSession, 37170236118073865L);
        if (!z3 || z2 || A002 <= 0.0f || A003 <= 0.0f) {
            A002 = (float) C18U.A00(c06090Tz2, userSession, 37166211733127599L);
            A003 = (float) C18U.A00(c06090Tz2, userSession, 37166211733193136L);
            if (z2 || A002 <= 0.0f || A003 <= 0.0f) {
                if (rIXUCoverSize != null && (ordinal = rIXUCoverSize.ordinal()) != -1) {
                    if (ordinal != 1) {
                        if (ordinal != 3) {
                            if (ordinal != 4) {
                                if (ordinal != 0 && ordinal != 2) {
                                    throw new RuntimeException();
                                }
                            } else {
                                valueOf = Integer.valueOf(R.dimen.alert_dialog_width);
                                i = R.dimen.clips_netego_card_height_large;
                            }
                        } else {
                            valueOf = Integer.valueOf(R.dimen.clips_netego_card_width_medium);
                            i = R.dimen.clips_netego_card_height_medium;
                        }
                    } else {
                        valueOf = Integer.valueOf(R.dimen.avatar_sticker_max_height);
                        i = R.dimen.ai_agent_embodiment_video_container_size;
                    }
                    Integer valueOf2 = Integer.valueOf(i);
                    int intValue = valueOf.intValue();
                    int intValue2 = valueOf2.intValue();
                    Resources resources = context2.getResources();
                    dimensionPixelSize = resources.getDimensionPixelSize(intValue);
                    dimensionPixelSize2 = resources.getDimensionPixelSize(intValue2);
                    c9b2 = new C9B2(dimensionPixelSize, dimensionPixelSize2, 2);
                    ViewGroup.LayoutParams layoutParams322 = inflate.findViewById(R.id.preview_container).getLayoutParams();
                    int i322 = c9b2.A01;
                    layoutParams322.width = i322;
                    layoutParams322.height = c9b2.A00;
                    c101544hP.A00 = i322;
                    return c101544hP;
                }
                valueOf = Integer.valueOf(R.dimen.clips_netego_card_width);
                i = R.dimen.clips_netego_card_height;
                Integer valueOf22 = Integer.valueOf(i);
                int intValue3 = valueOf.intValue();
                int intValue22 = valueOf22.intValue();
                Resources resources2 = context2.getResources();
                dimensionPixelSize = resources2.getDimensionPixelSize(intValue3);
                dimensionPixelSize2 = resources2.getDimensionPixelSize(intValue22);
                c9b2 = new C9B2(dimensionPixelSize, dimensionPixelSize2, 2);
                ViewGroup.LayoutParams layoutParams3222 = inflate.findViewById(R.id.preview_container).getLayoutParams();
                int i3222 = c9b2.A01;
                layoutParams3222.width = i3222;
                layoutParams3222.height = c9b2.A00;
                c101544hP.A00 = i3222;
                return c101544hP;
            }
        }
        dimensionPixelSize = C1H4.A01(AbstractC13880nE.A00(context2, A002));
        dimensionPixelSize2 = C1H4.A01(AbstractC13880nE.A00(context2, A003));
        c9b2 = new C9B2(dimensionPixelSize, dimensionPixelSize2, 2);
        ViewGroup.LayoutParams layoutParams32222 = inflate.findViewById(R.id.preview_container).getLayoutParams();
        int i32222 = c9b2.A01;
        layoutParams32222.width = i32222;
        layoutParams32222.height = c9b2.A00;
        c101544hP.A00 = i32222;
        return c101544hP;
    }

    public static final void A01(Context context, C38688GzT c38688GzT, C120985dq c120985dq, InterfaceC11380iw interfaceC11380iw, UserSession userSession, C75113Zb c75113Zb, C38625GyS c38625GyS, C101544hP c101544hP, C62812tK c62812tK, C60S c60s, Integer num, List list, boolean z, boolean z2) {
        View view;
        MusicInfo BVc;
        TrackData BVV;
        List BzQ;
        C14360o3.A0B(context, 0);
        C14360o3.A0B(userSession, 1);
        C14360o3.A0B(c101544hP, 2);
        C14360o3.A0B(c75113Zb, 4);
        C14360o3.A0B(interfaceC11380iw, 6);
        C38321qM c38321qM = c120985dq.A02;
        if (c38321qM != null) {
            c101544hP.A01 = c120985dq;
            c75113Zb.A2p = true;
            c101544hP.A02 = c75113Zb;
            c101544hP.A03 = c38625GyS;
            C06090Tz c06090Tz = C06090Tz.A05;
            boolean z3 = false;
            if (C18U.A06(c06090Tz, userSession, 36318170441390073L) || (c60s != null && c60s.A00())) {
                z3 = true;
            }
            float f = 1.0f;
            if (z3) {
                view = c101544hP.itemView;
            } else {
                TypedValue typedValue = new TypedValue();
                context.getTheme().resolveAttribute(R.attr.seenMediaAlpha, typedValue, true);
                float f2 = typedValue.getFloat();
                view = c101544hP.itemView;
                if (((AbstractCollection) c62812tK.A02.A04).contains(c120985dq.getId())) {
                    f = f2;
                }
            }
            view.setAlpha(f);
            ExtendedImageUrl A1o = c38321qM.A1o(c101544hP.A00);
            if (A1o != null) {
                AnimatedThumbnailView animatedThumbnailView = c101544hP.A06;
                IgImageView igImageView = c101544hP.A0E;
                SpritesheetInfo A1u = c38321qM.A1u();
                C14360o3.A0B(animatedThumbnailView, 3);
                C14360o3.A0B(igImageView, 4);
                if (A1u != null && (BzQ = A1u.BzQ()) != null && AbstractC001800i.A0O(BzQ, 0) != null && z) {
                    ((ConstrainedImageView) animatedThumbnailView).A00 = 0.5625f;
                    animatedThumbnailView.A0I(interfaceC11380iw, A1u, C18U.A00(c06090Tz, userSession, 37158686951211097L), C18U.A01(c06090Tz, userSession, 36595736997398774L), C18U.A06(c06090Tz, userSession, 36314262021212676L));
                    animatedThumbnailView.setVisibility(0);
                    igImageView.setVisibility(8);
                } else {
                    igImageView.A0I = null;
                    igImageView.A0A = new C80673iw();
                    igImageView.A0K = c38321qM.BU6();
                    igImageView.setUrl(A1o, interfaceC11380iw);
                    igImageView.setVisibility(0);
                    animatedThumbnailView.setVisibility(8);
                }
            }
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
            IgTextView igTextView = c101544hP.A0C;
            igTextView.setLayoutParams(layoutParams);
            IgTextView igTextView2 = c101544hP.A0B;
            igTextView2.setLayoutParams(layoutParams);
            View view2 = c101544hP.A05;
            view2.setVisibility(8);
            View view3 = c101544hP.A04;
            view3.setVisibility(8);
            c101544hP.A0A.setVisibility(8);
            igTextView.setVisibility(8);
            igTextView2.setVisibility(8);
            InterfaceC56392iX interfaceC56392iX = c101544hP.A0G;
            interfaceC56392iX.setVisibility(8);
            c101544hP.A0D.setVisibility(8);
            IgSimpleImageView igSimpleImageView = c101544hP.A08;
            igSimpleImageView.setVisibility(8);
            c101544hP.A09.setVisibility(8);
            if (num == C05F.A01) {
                Resources resources = context.getResources();
                C3x9 clipsMetadata = c38321qM.A1a().A00.getClipsMetadata();
                if (clipsMetadata != null && (BVc = clipsMetadata.BVc()) != null && (BVV = BVc.BVV()) != null) {
                    LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
                    layoutParams2.gravity = 1;
                    String title = BVV.getTitle();
                    String str = "";
                    if (title == null) {
                        title = "";
                    }
                    igTextView.setLayoutParams(layoutParams2);
                    igTextView.setText(title);
                    igTextView.setContentDescription("");
                    igTextView.setVisibility(0);
                    C130395uk.A00 = true;
                    String displayArtist = BVV.getDisplayArtist();
                    if (displayArtist != null) {
                        str = displayArtist;
                    }
                    igTextView2.setLayoutParams(layoutParams2);
                    igTextView2.setText(str);
                    igTextView2.setContentDescription("");
                    igTextView2.setVisibility(0);
                    C130395uk.A00 = true;
                    BOM bom = new BOM(context, null, resources.getDimensionPixelSize(R.dimen.abc_dropdownitem_icon_width), resources.getDimensionPixelSize(R.dimen.abc_button_inset_vertical_material), 0, 0, 0, -1, false);
                    ImageUrl AsF = BVV.AsF();
                    ((ImageView) interfaceC56392iX.getView()).setImageDrawable(bom);
                    AbstractC38055Goi.A00((ImageView) interfaceC56392iX.getView(), AsF, null);
                    interfaceC56392iX.setVisibility(0);
                    C130395uk.A00 = true;
                    view2.setVisibility(0);
                } else {
                    throw new IllegalStateException("Required value was null.");
                }
            }
            if (c38688GzT != null) {
                C51756Mtf c51756Mtf = (C51756Mtf) c38688GzT.A02;
                if (c51756Mtf != null) {
                    C130395uk.A00(context, c51756Mtf, interfaceC11380iw, userSession, c38321qM, c101544hP);
                }
                C51756Mtf c51756Mtf2 = (C51756Mtf) c38688GzT.A03;
                if (c51756Mtf2 != null) {
                    C130395uk.A00(context, c51756Mtf2, interfaceC11380iw, userSession, c38321qM, c101544hP);
                }
                C51756Mtf c51756Mtf3 = (C51756Mtf) c38688GzT.A00;
                if (c51756Mtf3 != null) {
                    C130395uk.A00(context, c51756Mtf3, interfaceC11380iw, userSession, c38321qM, c101544hP);
                }
                C51756Mtf c51756Mtf4 = (C51756Mtf) c38688GzT.A01;
                if (c51756Mtf4 != null) {
                    C130395uk.A00(context, c51756Mtf4, interfaceC11380iw, userSession, c38321qM, c101544hP);
                }
            } else if (list != null && !list.isEmpty()) {
                C130395uk.A01(interfaceC11380iw, igSimpleImageView, list);
            }
            if (C130395uk.A00) {
                view3.setVisibility(0);
            }
            if (z2 && C18U.A06(c06090Tz, userSession, 36325811187365257L)) {
                AbstractC86593tX.A0f(new C9BS((Integer) null, 6, c38321qM.A6d(userSession)), c101544hP.A07, c75113Zb);
                return;
            }
            return;
        }
        throw new IllegalStateException("Required value was null.");
    }
}
