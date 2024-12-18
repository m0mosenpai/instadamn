package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.ImageView;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.feed.widget.IgProgressImageView;
import com.instagram.ui.widget.framelayout.MediaFrameLayout;

/* renamed from: X.6S6, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C6S6 {
    public static final C6S6 A00 = new Object();

    public static final ViewGroup A00(ViewGroup viewGroup, C80673iw c80673iw, UserSession userSession, InterfaceC59152nG interfaceC59152nG) {
        ViewGroup viewGroup2;
        C14360o3.A0B(viewGroup, 0);
        C14360o3.A0B(userSession, 3);
        Context context = viewGroup.getContext();
        C14360o3.A07(context);
        LayoutInflater from = LayoutInflater.from(context);
        C14360o3.A07(from);
        if (!C18U.A06(C06090Tz.A05, userSession, 36323255681887341L)) {
            View inflate = from.inflate(R.layout.layout_netego_reel_item, viewGroup, false);
            C14360o3.A0C(inflate, "null cannot be cast to non-null type android.view.ViewGroup");
            viewGroup2 = (ViewGroup) inflate;
            viewGroup2.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        } else {
            View A002 = C50802Vb.A00(from, new ViewGroup.LayoutParams(-1, -1), viewGroup, R.layout.layout_netego_reel_item, 0, false, true);
            C14360o3.A0C(A002, "null cannot be cast to non-null type android.view.ViewGroup");
            viewGroup2 = (ViewGroup) A002;
        }
        C38080Gp9 c38080Gp9 = new C38080Gp9(viewGroup2, userSession);
        c38080Gp9.A03 = interfaceC59152nG;
        c38080Gp9.A01 = c80673iw;
        c38080Gp9.A0a.setLayerType(1, null);
        viewGroup2.setTag(c38080Gp9);
        return viewGroup2;
    }

    public static final void A02(InterfaceC11380iw interfaceC11380iw, UserSession userSession, C41181vS c41181vS, C141596ac c141596ac, C38080Gp9 c38080Gp9, InterfaceC144936gD interfaceC144936gD, boolean z) {
        Context context;
        ImageUrl A08;
        C57012jc c57012jc;
        IgProgressImageView igProgressImageView;
        IgProgressImageView igProgressImageView2;
        C38321qM c38321qM = c41181vS.A0b;
        if (c38321qM != null) {
            c38080Gp9.A06 = c41181vS;
            if (c38080Gp9.A00 == null) {
                View inflate = c38080Gp9.A0C.inflate();
                c38080Gp9.A00 = inflate;
                if (inflate != null) {
                    c38080Gp9.A09 = (MediaFrameLayout) inflate.requireViewById(R.id.reel_viewer_media_container);
                    ViewStub viewStub = null;
                    if (!C4R8.A00(c38080Gp9.A0E, "reel_netego_viewer")) {
                        View view = c38080Gp9.A00;
                        if (view != null) {
                            viewStub = (ViewStub) view.findViewById(R.id.reel_viewer_texture_viewstub);
                        }
                        c57012jc = new C57012jc(viewStub);
                    } else {
                        c57012jc = null;
                    }
                    c38080Gp9.A04 = c57012jc;
                    MediaFrameLayout mediaFrameLayout = c38080Gp9.A09;
                    if (mediaFrameLayout != null) {
                        IgProgressImageView igProgressImageView3 = (IgProgressImageView) mediaFrameLayout.requireViewById(R.id.reel_viewer_image_view);
                        c38080Gp9.A05 = igProgressImageView3;
                        if (igProgressImageView3 != null) {
                            igProgressImageView3.getIgImageView().setScaleType(ImageView.ScaleType.CENTER_CROP);
                        }
                        IgProgressImageView igProgressImageView4 = c38080Gp9.A05;
                        if (igProgressImageView4 != null) {
                            MediaFrameLayout mediaFrameLayout2 = c38080Gp9.A09;
                            if (mediaFrameLayout2 != null) {
                                Context context2 = mediaFrameLayout2.getContext();
                                igProgressImageView4.setPlaceHolderColor(context2.getColor(AbstractC53242c7.A0H(context2, R.attr.igds_color_stories_loading_background)));
                            } else {
                                throw new IllegalArgumentException("Required value was null.");
                            }
                        }
                        IgProgressImageView igProgressImageView5 = c38080Gp9.A05;
                        if (igProgressImageView5 != null) {
                            View view2 = c38080Gp9.A00;
                            if (view2 != null) {
                                Drawable drawable = view2.getContext().getDrawable(R.drawable.video_determinate_progress);
                                if (drawable != null) {
                                    igProgressImageView5.setProgressBarDrawable(drawable);
                                } else {
                                    throw new IllegalArgumentException("drawable video_determinate_progress should not be null");
                                }
                            } else {
                                throw new IllegalArgumentException("Required value was null.");
                            }
                        }
                        InterfaceC59152nG interfaceC59152nG = c38080Gp9.A03;
                        if (interfaceC59152nG != null && (igProgressImageView2 = c38080Gp9.A05) != null) {
                            igProgressImageView2.setPostProcessor(interfaceC59152nG);
                        }
                        C80673iw c80673iw = c38080Gp9.A01;
                        if (c80673iw != null && (igProgressImageView = c38080Gp9.A05) != null) {
                            igProgressImageView.setProgressiveImageConfig(c80673iw);
                        }
                        MediaFrameLayout mediaFrameLayout3 = c38080Gp9.A09;
                        if (mediaFrameLayout3 != null) {
                            mediaFrameLayout3.A00 = -1.0f;
                        }
                    } else {
                        throw new IllegalArgumentException("Required value was null.");
                    }
                } else {
                    throw new IllegalArgumentException("Required value was null.");
                }
            }
            View view3 = c38080Gp9.A00;
            if (view3 != null) {
                view3.setVisibility(0);
                c141596ac.A03(c38080Gp9);
                c38080Gp9.A08 = c141596ac;
                IgProgressImageView igProgressImageView6 = c38080Gp9.A05;
                if (igProgressImageView6 != null) {
                    if (z) {
                        igProgressImageView6.setEnableProgressBar(false);
                    }
                    c38080Gp9.A01();
                    c141596ac.A0l = false;
                    IgProgressImageView igProgressImageView7 = c38080Gp9.A05;
                    if (igProgressImageView7 != null) {
                        igProgressImageView7.setMiniPreviewPayload(c41181vS.A0S());
                    }
                    IgProgressImageView igProgressImageView8 = c38080Gp9.A05;
                    if (igProgressImageView8 != null) {
                        igProgressImageView8.setExpiration(c41181vS.A02());
                    }
                    IgProgressImageView igProgressImageView9 = c38080Gp9.A05;
                    if (igProgressImageView9 != null) {
                        igProgressImageView9.A0A(new YFG(interfaceC11380iw, userSession, c38321qM, c41181vS, c141596ac, c38080Gp9, interfaceC144936gD), R.id.listener_id_for_reel_image_load);
                    }
                    AbstractC141686al.A03(interfaceC11380iw, userSession, c38321qM);
                    if (c38321qM.A4w()) {
                        AbstractC140696Xx.A00(userSession).A0C(c41181vS, false);
                        android.net.Uri uri = c38321qM.A05;
                        if (uri != null) {
                            A08 = AbstractC81033jX.A00(uri, -1, -1);
                            IgProgressImageView igProgressImageView10 = c38080Gp9.A05;
                            if (igProgressImageView10 != null) {
                                igProgressImageView10.setUrl(A08, interfaceC11380iw);
                            }
                        } else {
                            throw new IllegalArgumentException("Required value was null.");
                        }
                    } else {
                        IgProgressImageView igProgressImageView11 = c38080Gp9.A05;
                        if (igProgressImageView11 != null && (context = igProgressImageView11.getContext()) != null && c41181vS.A08(context) != null && c41181vS.A06() != null) {
                            AbstractC140696Xx.A00(userSession).A0C(c41181vS, false);
                            A08 = c41181vS.A08(context);
                            if (A08 != null) {
                                IgProgressImageView igProgressImageView12 = c38080Gp9.A05;
                                if (igProgressImageView12 != null) {
                                    ImageUrl A082 = c41181vS.A08(context);
                                    if (A082 != null) {
                                        ImageUrl A06 = c41181vS.A06();
                                        if (A06 != null) {
                                            igProgressImageView12.setUrlWithFallback(A082, A06, interfaceC11380iw);
                                        } else {
                                            throw new IllegalArgumentException("Required value was null.");
                                        }
                                    } else {
                                        throw new IllegalArgumentException("Required value was null.");
                                    }
                                }
                            } else {
                                throw new IllegalArgumentException("Required value was null.");
                            }
                        }
                        interfaceC144936gD.E13(c41181vS);
                        return;
                    }
                    if (z) {
                        if (c38080Gp9.A0A == null) {
                            View inflate2 = c38080Gp9.A0D.inflate();
                            C14360o3.A0C(inflate2, MSV.A00(241));
                            MediaFrameLayout mediaFrameLayout4 = (MediaFrameLayout) inflate2;
                            c38080Gp9.A0A = mediaFrameLayout4;
                            if (mediaFrameLayout4 != null) {
                                mediaFrameLayout4.A00 = -1.0f;
                                IgImageView igImageView = (IgImageView) mediaFrameLayout4.requireViewById(R.id.netego_background_image);
                                c38080Gp9.A02 = igImageView;
                                if (igImageView != null) {
                                    igImageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
                                }
                            } else {
                                throw new IllegalArgumentException("Required value was null.");
                            }
                        }
                        MediaFrameLayout mediaFrameLayout5 = c38080Gp9.A0A;
                        if (mediaFrameLayout5 != null) {
                            mediaFrameLayout5.setVisibility(0);
                        }
                        IgImageView igImageView2 = c38080Gp9.A02;
                        if (igImageView2 != null) {
                            igImageView2.A0I = C23708Aeh.A00;
                            igImageView2.setUrl(A08, interfaceC11380iw);
                        }
                        View view4 = c38080Gp9.A00;
                        if (view4 != null) {
                            view4.setVisibility(8);
                        }
                    }
                    interfaceC144936gD.E13(c41181vS);
                    return;
                }
                throw new IllegalStateException("Required value was null.");
            }
            throw new IllegalArgumentException("media view is null when it needs to be shown");
        }
        throw new IllegalStateException("Media should be not null when binding media");
    }

    /* JADX WARN: Code restructure failed: missing block: B:158:0x04ef, code lost:
    
        if (X.C14360o3.A0K(r3, r5) != false) goto L165;
     */
    /* JADX WARN: Code restructure failed: missing block: B:219:0x05e6, code lost:
    
        if (r3.size() != 1) goto L225;
     */
    /* JADX WARN: Code restructure failed: missing block: B:499:0x0c72, code lost:
    
        if (r6 != null) goto L499;
     */
    /* JADX WARN: Code restructure failed: missing block: B:543:0x0cb4, code lost:
    
        if (r6 != null) goto L499;
     */
    /* JADX WARN: Code restructure failed: missing block: B:621:0x0ec6, code lost:
    
        if (r10.AhE(X.C06090Tz.A04, 36328113289837748L) == false) goto L613;
     */
    /* JADX WARN: Code restructure failed: missing block: B:625:0x0ed9, code lost:
    
        if (r10.AhE(X.C06090Tz.A04, 36328113289968822L) == false) goto L618;
     */
    /* JADX WARN: Code restructure failed: missing block: B:629:0x0eec, code lost:
    
        if (r10.AhE(X.C06090Tz.A04, 36328113290034359L) == false) goto L623;
     */
    /* JADX WARN: Code restructure failed: missing block: B:633:0x0eff, code lost:
    
        if (r10.AhE(X.C06090Tz.A04, 36328113289903285L) == false) goto L628;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:88:0x025f. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:487:0x0c3b  */
    /* JADX WARN: Removed duplicated region for block: B:493:0x0c5c  */
    /* JADX WARN: Removed duplicated region for block: B:502:0x0c7a  */
    /* JADX WARN: Removed duplicated region for block: B:538:0x0ca0  */
    /* JADX WARN: Removed duplicated region for block: B:546:0x0c4e A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v184, types: [X.2zJ, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v186, types: [X.LZB, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v21, types: [com.instagram.common.ui.widget.imageview.CircularImageView, com.instagram.common.ui.widget.imageview.IgImageView] */
    /* JADX WARN: Type inference failed for: r3v46, types: [X.LZB, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v67, types: [X.LZB, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v127, types: [X.6RH[]] */
    /* JADX WARN: Type inference failed for: r7v19, types: [X.2zG] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A01(X.InterfaceC11380iw r43, X.InterfaceC62872tQ r44, com.instagram.common.session.UserSession r45, final X.C41181vS r46, final X.C41551w4 r47, X.C141596ac r48, X.C38080Gp9 r49, final X.InterfaceC144936gD r50, int r51, int r52) {
        /*
            Method dump skipped, instructions count: 5070
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C6S6.A01(X.0iw, X.2tQ, com.instagram.common.session.UserSession, X.1vS, X.1w4, X.6ac, X.Gp9, X.6gD, int, int):void");
    }
}
