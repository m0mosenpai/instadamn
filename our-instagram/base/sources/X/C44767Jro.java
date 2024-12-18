package X;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.media.ThumbnailUtils;
import android.os.Build;
import android.util.Size;
import android.view.TextureView;
import android.view.View;
import android.widget.LinearLayout;
import com.facebook.R;
import com.facebook.videolite.transcoder.base.composition.MediaComposition;
import com.instagram.api.schemas.ACRType;
import com.instagram.common.gallery.Medium;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgProgressBar;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.igds.components.gradient.IGGradientView;
import com.instagram.ui.simplevideolayout.SimpleVideoLayout;
import java.io.IOException;
import java.util.List;

/* renamed from: X.Jro, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44767Jro extends C3OO {
    public int A00;
    public C45077Jx6 A01;
    public final Activity A02;
    public final TextureView A03;
    public final View A04;
    public final LinearLayout A05;
    public final LinearLayout A06;
    public final C07T A07;
    public final UserSession A08;
    public final IgProgressBar A09;
    public final IgTextView A0A;
    public final IgTextView A0B;
    public final IgImageView A0C;
    public final C47942LFs A0D;
    public final C44535Jmf A0E;
    public final IGGradientView A0F;
    public final SimpleVideoLayout A0G;
    public final List A0H;
    public final InterfaceC11380iw A0I;
    public final IGGradientView A0J;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C44767Jro(Activity activity, View view, C07T c07t, InterfaceC11380iw interfaceC11380iw, UserSession userSession, C47942LFs c47942LFs, C44535Jmf c44535Jmf) {
        super(view);
        C14360o3.A0B(interfaceC11380iw, 1);
        AbstractC25234BEr.A1R(userSession, view, c44535Jmf, c47942LFs, c07t);
        C14360o3.A0B(activity, 7);
        this.A0I = interfaceC11380iw;
        this.A08 = userSession;
        this.A04 = view;
        this.A0E = c44535Jmf;
        this.A0D = c47942LFs;
        this.A07 = c07t;
        this.A02 = activity;
        this.A00 = -1;
        this.A0G = (SimpleVideoLayout) AbstractC166997dE.A0R(view, R.id.acr_browser_video_player);
        this.A03 = (TextureView) AbstractC166997dE.A0R(view, R.id.acr_browser_virtual_video_player_texture_view);
        this.A0C = AbstractC167007dF.A0T(view, R.id.acr_browser_video_image_placeholder);
        this.A05 = (LinearLayout) AbstractC166997dE.A0R(view, R.id.acr_browser_video_attribution_layout);
        this.A0A = AbstractC25231BEo.A0d(view, R.id.acr_browser_video_attribution_text);
        this.A09 = (IgProgressBar) AbstractC166997dE.A0R(view, R.id.acr_loading_indicator);
        this.A0B = AbstractC25231BEo.A0d(view, R.id.acr_browser_preview_title);
        this.A0F = (IGGradientView) AbstractC166997dE.A0R(view, R.id.acr_browser_top_background_gradient_view);
        this.A0J = (IGGradientView) AbstractC166997dE.A0R(view, R.id.acr_browser_bottom_background_gradient_view);
        this.A06 = (LinearLayout) AbstractC166997dE.A0R(view, R.id.feedback_menu_entrypoint_layout);
        this.A0H = AbstractC16960so.A1Q(EnumC46163Kc1.A04, EnumC46163Kc1.A05, EnumC46163Kc1.A06, EnumC46163Kc1.A02, EnumC46163Kc1.A03);
        ViewOnClickListenerC48063LPo.A00(view, 15, this);
    }

    private final void A00(int i, boolean z) {
        IGGradientView iGGradientView;
        this.A0B.setGravity(i);
        if (z) {
            this.A0F.setVisibility(0);
            iGGradientView = this.A0J;
        } else {
            this.A0J.setVisibility(0);
            iGGradientView = this.A0F;
        }
        iGGradientView.setVisibility(8);
    }

    public final void A01(C45077Jx6 c45077Jx6, int i) {
        Bitmap createImageThumbnail;
        C15980qs A00;
        EnumC15950qp enumC15950qp;
        this.A01 = c45077Jx6;
        this.A00 = i;
        if (!c45077Jx6.A00) {
            UserSession userSession = this.A08;
            if (C18U.A06(C06090Tz.A05, userSession, 36318307879884892L)) {
                String str = c45077Jx6.A09;
                if (str == null) {
                    str = AbstractC166997dE.A0p(this.A04.getContext(), 2131974936);
                }
                List list = this.A0H;
                EnumC46163Kc1 enumC46163Kc1 = (EnumC46163Kc1) list.get(i % list.size());
                IgTextView igTextView = this.A0B;
                igTextView.setVisibility(0);
                igTextView.setText(str);
                int ordinal = enumC46163Kc1.ordinal();
                if (ordinal != 0) {
                    if (ordinal != 1) {
                        if (ordinal != 2) {
                            if (ordinal != 3) {
                                if (ordinal == 4) {
                                    A00(81, false);
                                    igTextView.setAllCaps(false);
                                    igTextView.setTextSize(2, 40.0f);
                                    A00 = AbstractC15960qq.A00(AbstractC166997dE.A0L(this.A04));
                                    enumC15950qp = EnumC15950qp.A0g;
                                } else {
                                    throw B4Z.A00();
                                }
                            } else {
                                A00(81, false);
                                igTextView.setAllCaps(false);
                                igTextView.setTextSize(2, 40.0f);
                                A00 = AbstractC15960qq.A00(AbstractC166997dE.A0L(this.A04));
                                enumC15950qp = EnumC15950qp.A0u;
                            }
                        } else {
                            A00(8388659, true);
                            igTextView.setAllCaps(false);
                            igTextView.setTextSize(2, 35.0f);
                            A00 = AbstractC15960qq.A00(AbstractC166997dE.A0L(this.A04));
                            enumC15950qp = EnumC15950qp.A0C;
                        }
                    } else {
                        A00(49, true);
                        igTextView.setAllCaps(false);
                        igTextView.setTextSize(2, 60.0f);
                        A00 = AbstractC15960qq.A00(AbstractC166997dE.A0L(this.A04));
                        enumC15950qp = EnumC15950qp.A0B;
                    }
                } else {
                    A00(49, true);
                    igTextView.setAllCaps(true);
                    igTextView.setTextSize(2, 46.0f);
                    A00 = AbstractC15960qq.A00(AbstractC166997dE.A0L(this.A04));
                    enumC15950qp = EnumC15950qp.A0V;
                }
                igTextView.setTypeface(A00.A02(enumC15950qp));
            }
            LinearLayout linearLayout = this.A06;
            linearLayout.setVisibility(0);
            linearLayout.bringToFront();
            this.A0F.setVisibility(0);
            C0fQ.A00(new ViewOnClickListenerC48067LPs(c45077Jx6, this, i, 3), linearLayout);
            Context A0L = AbstractC166997dE.A0L(this.A04);
            List list2 = c45077Jx6.A0C;
            if (list2 != null) {
                Medium medium = (Medium) list2.get(0);
                this.A0G.setVisibility(8);
                this.A03.setVisibility(0);
                int A08 = AbstractC167007dF.A0K(A0L).widthPixels - (AbstractC167017dG.A08(A0L) * 2);
                IgImageView igImageView = this.A0C;
                igImageView.measure(View.MeasureSpec.makeMeasureSpec(A08, AbstractC63123SdR.MAX_SIGNED_POWER_OF_TWO), View.MeasureSpec.makeMeasureSpec((int) (A08 / 0.5625f), AbstractC63123SdR.MAX_SIGNED_POWER_OF_TWO));
                int measuredWidth = igImageView.getMeasuredWidth();
                int measuredHeight = igImageView.getMeasuredHeight();
                if (measuredWidth > 0 && measuredHeight > 0 && Build.VERSION.SDK_INT >= 29) {
                    try {
                        if (medium.Cff()) {
                            createImageThumbnail = ThumbnailUtils.createVideoThumbnail(AbstractC166987dD.A11(medium.A0X), new Size(measuredWidth, measuredHeight), null);
                        } else {
                            createImageThumbnail = ThumbnailUtils.createImageThumbnail(AbstractC166987dD.A11(medium.A0X), new Size(measuredWidth, measuredHeight), null);
                        }
                        C14360o3.A0A(createImageThumbnail);
                        igImageView.setImageBitmap(createImageThumbnail);
                    } catch (IOException e) {
                        AbstractC12120kG.A0I("ClipsACRBrowserItemViewHolder.loadThumbnailFromFilel#IOException", e, AbstractC06930Yk.A0E());
                    }
                }
                ACRType aCRType = c45077Jx6.A02;
                IgTextView igTextView2 = this.A0A;
                int i2 = 2131955214;
                if (aCRType == ACRType.A05) {
                    i2 = 2131955215;
                }
                AbstractC166987dD.A1P(A0L, igTextView2, i2);
                C0fQ.A00(ViewOnClickListenerC48053LPe.A00, this.A05);
                MediaComposition mediaComposition = c45077Jx6.A01;
                if (mediaComposition != null) {
                    this.A0D.A01(A0L, mediaComposition, userSession, this);
                    return;
                }
                this.A09.setVisibility(0);
                AbstractC166987dD.A1Z(new JTH(A0L, this.A0D, this, list2, userSession, (InterfaceC23621Ds) null, 28), AbstractC57302k5.A00(this.A07));
                return;
            }
            throw AbstractC166997dE.A0g();
        }
    }
}
