package X;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.facebook.R;
import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.forker.Process;
import com.instagram.comments.mvvm.data.MediaCommentListRepository;
import com.instagram.common.cache.base.CacheKeyGenerator;
import com.instagram.common.session.UserSession;
import com.instagram.model.mediasize.GifUrlImpl;
import com.instagram.react.modules.base.IgReactQEModule;
import com.instagram.shopping.intf.ProductDetailsPageArguments;
import com.instagram.shopping.model.analytics.ProductDetailsPageLoggingInfo;
import com.instagram.ui.widget.roundedcornerlayout.RoundedCornerFrameLayout;
import go.Seq;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes7.dex */
public final class J7Q extends C0YY implements InterfaceC16820sZ {
    public final int A00;
    public final Object A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public J7Q(Object obj, int i) {
        super(0);
        this.A00 = i;
        this.A01 = obj;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0004. Please report as an issue. */
    @Override // X.InterfaceC16820sZ
    public final /* bridge */ /* synthetic */ Object invoke() {
        C38321qM BQN;
        float f;
        C05A c05a;
        Object c7d3;
        C25814BbV c25814BbV;
        C05A c05a2;
        Object c9b4;
        String str;
        C42797IwZ c42797IwZ;
        IIE iie;
        String str2;
        C1ON c1on;
        switch (this.A00) {
            case 0:
            case 4:
                ((RoundedCornerFrameLayout) this.A01).setCornerRadius(0);
                return C0eB.A00;
            case 1:
                C169277h1 c169277h1 = ((C26609Bp6) this.A01).A02;
                return new GifUrlImpl(c169277h1.A03, c169277h1.A05, c169277h1.A01, c169277h1.A00);
            case 2:
                ImageView imageView = (ImageView) this.A01;
                imageView.setImageDrawable(null);
                imageView.setElevation(0.0f);
                return C0eB.A00;
            case 3:
                ImageView imageView2 = (ImageView) this.A01;
                imageView2.setImageDrawable(null);
                imageView2.setOnClickListener(null);
                imageView2.setOnLongClickListener(null);
                return C0eB.A00;
            case 5:
                AbstractC168777gB.A04((C168757g9) this.A01);
                return C0eB.A00;
            case 6:
                return new C27815COe(((C25814BbV) this.A01).A0E);
            case 7:
                C25814BbV c25814BbV2 = (C25814BbV) this.A01;
                return new C28355CfF(c25814BbV2.A08, c25814BbV2.A0A, c25814BbV2.A0B, (C28212CcA) c25814BbV2.A0L.getValue(), c25814BbV2.A0E, c25814BbV2.A0H);
            case 8:
                C25814BbV c25814BbV3 = (C25814BbV) this.A01;
                MediaCommentListRepository mediaCommentListRepository = c25814BbV3.A0A;
                UserSession userSession = c25814BbV3.A0E;
                C26025BfE c26025BfE = c25814BbV3.A08;
                return new C28212CcA(mediaCommentListRepository, userSession, c26025BfE.A0F, c26025BfE.A0f);
            case 9:
                C25814BbV c25814BbV4 = (C25814BbV) this.A01;
                InterfaceC38371qR interfaceC38371qR = c25814BbV4.A0B.A00;
                if (interfaceC38371qR != null && (BQN = interfaceC38371qR.BQN()) != null && BQN.A6F()) {
                    if (C18U.A06(C06090Tz.A05, c25814BbV4.A0E, 36318221982308412L)) {
                        List C1L = BQN.A0C.C1L();
                        if (C1L != null) {
                            int size = C1L.size();
                            if (size > 3) {
                                f = 0.9f;
                            } else if (size != 0) {
                                f = (size * 0.09f) + 0.525f;
                            }
                            c05a = c25814BbV4.A0N;
                            c7d3 = new C7d3(f);
                            c05a.Egh(c7d3);
                        }
                        f = 0.615f;
                        c05a = c25814BbV4.A0N;
                        c7d3 = new C7d3(f);
                        c05a.Egh(c7d3);
                    }
                }
                return C0eB.A00;
            case 10:
                c05a = ((C25814BbV) this.A01).A0N;
                c7d3 = new C9B4(false, 0);
                c05a.Egh(c7d3);
                return C0eB.A00;
            case 11:
                c25814BbV = (C25814BbV) this.A01;
                c05a2 = c25814BbV.A0N;
                c9b4 = new C9B4(true, 0);
                c05a2.Egh(c9b4);
                c25814BbV.A0A.A0F();
                return C0eB.A00;
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                c05a = ((C25814BbV) this.A01).A0N;
                c7d3 = C167047dJ.A00;
                c05a.Egh(c7d3);
                return C0eB.A00;
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                c25814BbV = (C25814BbV) this.A01;
                c05a2 = c25814BbV.A0N;
                c9b4 = C167057dK.A00;
                c05a2.Egh(c9b4);
                c25814BbV.A0A.A0F();
                return C0eB.A00;
            case 14:
            case 18:
                c05a = ((C25814BbV) this.A01).A0N;
                c7d3 = new C9BK(new H76("onUnrestrictFailed"));
                c05a.Egh(c7d3);
                return C0eB.A00;
            case Process.SIGTERM /* 15 */:
                return new C27816COf(((C25814BbV) this.A01).A0A);
            case 16:
            case 17:
                return new Object[((InterfaceC19390xP[]) this.A01).length];
            case Process.SIGSTOP /* 19 */:
                return new C54627OBc((UserSession) this.A01);
            case 20:
                return new C54593O9u((UserSession) this.A01);
            case 21:
                ProductDetailsPageArguments productDetailsPageArguments = ((C41121IIm) this.A01).A00;
                String str3 = productDetailsPageArguments.A0U;
                if (str3 == null || (str = productDetailsPageArguments.A0N) == null) {
                    return null;
                }
                return new ProductDetailsPageLoggingInfo(str3, str3, str);
            case 22:
                C41726Idx c41726Idx = ((AbstractC39046HGw) this.A01).A07;
                if (c41726Idx != null) {
                    return c41726Idx;
                }
                str2 = "pageState";
                C14360o3.A0F(str2);
                throw C00O.createAndThrow();
            case 23:
                return ((AbstractC39046HGw) this.A01).A01;
            case 24:
                HE1 he1 = (HE1) this.A01;
                View view = ((AbstractC39046HGw) he1).A00;
                Object obj = null;
                if (view != null) {
                    obj = view.getTag();
                }
                C41610Iaz c41610Iaz = C41610Iaz.A00;
                UserSession userSession2 = he1.A03;
                C14360o3.A0C(obj, "null cannot be cast to non-null type com.instagram.shopping.adapter.pdp.herocarousel.HeroCarouselProductVideoViewBinder.Holder");
                IID iid = (IID) obj;
                IN1 in1 = he1.A01;
                C14360o3.A0C(in1, "null cannot be cast to non-null type com.instagram.shopping.model.pdp.herocarousel.HeroCarouselProductVideoModel");
                C39349HZo c39349HZo = (C39349HZo) in1;
                IKK ikk = he1.A08;
                if (ikk != null) {
                    INQ inq = ((AbstractC39046HGw) he1).A03;
                    if (inq != null) {
                        C38376GuD c38376GuD = ((AbstractC39046HGw) he1).A04;
                        if (c38376GuD != null) {
                            JPq jPq = ((AbstractC39046HGw) he1).A05;
                            if (jPq != null) {
                                InterfaceC60442pS interfaceC60442pS = he1.A00;
                                INL inl = he1.A09;
                                if (inl != null) {
                                    c41610Iaz.A00(interfaceC60442pS, userSession2, iid, inq, c38376GuD, jPq, ikk, c39349HZo, inl);
                                    View view2 = iid.A02.A01;
                                    view2.setOnClickListener(null);
                                    view2.setClickable(false);
                                    view2.setFocusable(false);
                                    return C0eB.A00;
                                }
                                str2 = "viewpointHelper";
                                C14360o3.A0F(str2);
                                throw C00O.createAndThrow();
                            }
                            str2 = "delegate";
                            C14360o3.A0F(str2);
                            throw C00O.createAndThrow();
                        }
                        str2 = "animationController";
                        C14360o3.A0F(str2);
                        throw C00O.createAndThrow();
                    }
                    str2 = "videoController";
                    C14360o3.A0F(str2);
                    throw C00O.createAndThrow();
                }
                str2 = "heroCarouselItemState";
                C14360o3.A0F(str2);
                throw C00O.createAndThrow();
            case 25:
                HE2 he2 = (HE2) this.A01;
                View view3 = ((AbstractC39046HGw) he2).A00;
                if (view3 != null) {
                    UserSession userSession3 = he2.A03;
                    Object tag = view3.getTag();
                    C14360o3.A0C(tag, "null cannot be cast to non-null type com.instagram.shopping.adapter.pdp.herocarousel.HeroCarouselPhotoMediaViewBinder.Holder");
                    C41068IGl c41068IGl = (C41068IGl) tag;
                    IN1 in12 = he2.A01;
                    C14360o3.A0C(in12, "null cannot be cast to non-null type com.instagram.shopping.model.pdp.herocarousel.HeroCarouselReelModel");
                    C39352HZr c39352HZr = (C39352HZr) in12;
                    IKK ikk2 = he2.A08;
                    if (ikk2 != null) {
                        C38376GuD c38376GuD2 = ((AbstractC39046HGw) he2).A04;
                        if (c38376GuD2 != null) {
                            JPq jPq2 = ((AbstractC39046HGw) he2).A05;
                            if (jPq2 != null) {
                                InterfaceC60442pS interfaceC60442pS2 = he2.A00;
                                INL inl2 = he2.A09;
                                if (inl2 != null) {
                                    AbstractC167017dG.A1N(userSession3, c41068IGl);
                                    AbstractC25234BEr.A1R(c39352HZr, ikk2, c38376GuD2, jPq2, interfaceC60442pS2);
                                    C42797IwZ c42797IwZ2 = c41068IGl.A02;
                                    C14360o3.A0B(c42797IwZ2, 1);
                                    C38321qM c38321qM = c39352HZr.A00;
                                    C41679Id8.A00(interfaceC60442pS2, userSession3, c38321qM, c42797IwZ2, c38376GuD2, jPq2, c39352HZr, ikk2, inl2, new C29901DGp(25, jPq2, c39352HZr, ikk2, c42797IwZ2));
                                    C41688IdH.A00(userSession3, c38321qM, c41068IGl, ikk2);
                                    INL inl3 = he2.A09;
                                    if (inl3 != null) {
                                        C14360o3.A0C(in12, "null cannot be cast to non-null type com.instagram.shopping.model.pdp.herocarousel.HeroCarouselReelModel");
                                        inl3.A00(view3, c39352HZr.A02);
                                        Object tag2 = view3.getTag();
                                        C14360o3.A0C(tag2, "null cannot be cast to non-null type com.instagram.shopping.adapter.pdp.herocarousel.HeroCarouselPhotoMediaViewBinder.Holder");
                                        c42797IwZ = ((C41068IGl) tag2).A02;
                                        C14360o3.A0B(c42797IwZ, 0);
                                        ViewGroup viewGroup = c42797IwZ.A03.A00;
                                        viewGroup.setOnClickListener(null);
                                        viewGroup.setClickable(false);
                                        viewGroup.setFocusable(false);
                                        View view4 = c42797IwZ.A02.A01;
                                        view4.setOnClickListener(null);
                                        view4.setClickable(false);
                                        view4.setFocusable(false);
                                    }
                                }
                                str2 = "viewpointHelper";
                                C14360o3.A0F(str2);
                                throw C00O.createAndThrow();
                            }
                            str2 = "delegate";
                            C14360o3.A0F(str2);
                            throw C00O.createAndThrow();
                        }
                        str2 = "animationController";
                        C14360o3.A0F(str2);
                        throw C00O.createAndThrow();
                    }
                    str2 = "heroCarouselItemState";
                    C14360o3.A0F(str2);
                    throw C00O.createAndThrow();
                }
                return C0eB.A00;
            case 26:
                HE3 he3 = (HE3) this.A01;
                Object A0X = AbstractC37302Gc3.A0X(((AbstractC39046HGw) he3).A00);
                C41700IdT c41700IdT = C41700IdT.A00;
                UserSession userSession4 = he3.A03;
                C14360o3.A0C(A0X, "null cannot be cast to non-null type com.instagram.shopping.adapter.pdp.herocarousel.HeroCarouselVideoMediaViewBinder.Holder");
                iie = (IIE) A0X;
                IN1 in13 = he3.A01;
                C14360o3.A0C(in13, "null cannot be cast to non-null type com.instagram.shopping.model.pdp.herocarousel.HeroCarouselReelModel");
                C39352HZr c39352HZr2 = (C39352HZr) in13;
                IKK ikk3 = he3.A08;
                if (ikk3 != null) {
                    INQ inq2 = ((AbstractC39046HGw) he3).A03;
                    if (inq2 != null) {
                        C38376GuD c38376GuD3 = ((AbstractC39046HGw) he3).A04;
                        if (c38376GuD3 != null) {
                            JPq jPq3 = ((AbstractC39046HGw) he3).A05;
                            if (jPq3 != null) {
                                InterfaceC60442pS interfaceC60442pS3 = he3.A00;
                                INL inl4 = he3.A09;
                                if (inl4 != null) {
                                    c41700IdT.A02(interfaceC60442pS3, userSession4, iie, inq2, c38376GuD3, jPq3, ikk3, c39352HZr2, inl4);
                                    c42797IwZ = iie.A02;
                                    C14360o3.A0B(c42797IwZ, 0);
                                    ViewGroup viewGroup2 = c42797IwZ.A03.A00;
                                    viewGroup2.setOnClickListener(null);
                                    viewGroup2.setClickable(false);
                                    viewGroup2.setFocusable(false);
                                    View view42 = c42797IwZ.A02.A01;
                                    view42.setOnClickListener(null);
                                    view42.setClickable(false);
                                    view42.setFocusable(false);
                                    return C0eB.A00;
                                }
                                str2 = "viewpointHelper";
                                C14360o3.A0F(str2);
                                throw C00O.createAndThrow();
                            }
                            str2 = "delegate";
                            C14360o3.A0F(str2);
                            throw C00O.createAndThrow();
                        }
                        str2 = "animationController";
                        C14360o3.A0F(str2);
                        throw C00O.createAndThrow();
                    }
                    str2 = "videoController";
                    C14360o3.A0F(str2);
                    throw C00O.createAndThrow();
                }
                str2 = "heroCarouselItemState";
                C14360o3.A0F(str2);
                throw C00O.createAndThrow();
            case 27:
                Object obj2 = ((C15370ps) this.A01).A00;
                C14360o3.A06(obj2);
                return obj2;
            case 28:
                HE4 he4 = (HE4) this.A01;
                Object A0X2 = AbstractC37302Gc3.A0X(((AbstractC39046HGw) he4).A00);
                C41700IdT c41700IdT2 = C41700IdT.A00;
                UserSession userSession5 = he4.A03;
                C14360o3.A0C(A0X2, "null cannot be cast to non-null type com.instagram.shopping.adapter.pdp.herocarousel.HeroCarouselVideoMediaViewBinder.Holder");
                iie = (IIE) A0X2;
                IN1 in14 = he4.A01;
                C14360o3.A0C(in14, "null cannot be cast to non-null type com.instagram.shopping.model.pdp.herocarousel.HeroCarouselFeedMediaModel");
                C39350HZp c39350HZp = (C39350HZp) in14;
                IKK ikk4 = he4.A08;
                if (ikk4 != null) {
                    INQ inq3 = ((AbstractC39046HGw) he4).A03;
                    if (inq3 != null) {
                        C38376GuD c38376GuD4 = ((AbstractC39046HGw) he4).A04;
                        if (c38376GuD4 != null) {
                            JPq jPq4 = ((AbstractC39046HGw) he4).A05;
                            if (jPq4 != null) {
                                InterfaceC60442pS interfaceC60442pS4 = he4.A00;
                                INL inl5 = he4.A09;
                                if (inl5 != null) {
                                    c41700IdT2.A01(interfaceC60442pS4, userSession5, iie, inq3, c38376GuD4, jPq4, c39350HZp, ikk4, inl5);
                                    c42797IwZ = iie.A02;
                                    C14360o3.A0B(c42797IwZ, 0);
                                    ViewGroup viewGroup22 = c42797IwZ.A03.A00;
                                    viewGroup22.setOnClickListener(null);
                                    viewGroup22.setClickable(false);
                                    viewGroup22.setFocusable(false);
                                    View view422 = c42797IwZ.A02.A01;
                                    view422.setOnClickListener(null);
                                    view422.setClickable(false);
                                    view422.setFocusable(false);
                                    return C0eB.A00;
                                }
                                str2 = "viewpointHelper";
                                C14360o3.A0F(str2);
                                throw C00O.createAndThrow();
                            }
                            str2 = "delegate";
                            C14360o3.A0F(str2);
                            throw C00O.createAndThrow();
                        }
                        str2 = "animationController";
                        C14360o3.A0F(str2);
                        throw C00O.createAndThrow();
                    }
                    str2 = "videoController";
                    C14360o3.A0F(str2);
                    throw C00O.createAndThrow();
                }
                str2 = "heroCarouselItemState";
                C14360o3.A0F(str2);
                throw C00O.createAndThrow();
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL /* 29 */:
                Context context = ((AbstractC39047HGx) this.A01).A0P().A00;
                AbstractC31171DnF.A1P(context);
                View decorView = ((Activity) context).getWindow().getDecorView();
                C14360o3.A0C(decorView, "null cannot be cast to non-null type android.view.ViewGroup");
                return new ViewOnTouchListenerC676833i((ViewGroup) decorView, false);
            case 30:
                return ((C38434GvH) this.A01).A00.findViewById(R.id.header);
            case 31:
                c1on = (C1ON) this.A01;
                c1on.cancel();
                return C0eB.A00;
            case 32:
                ((InterfaceC24741Ir) this.A01).F8s(MUq.A00);
                return C0eB.A00;
            case 33:
                c1on = (C1ON) this.A01;
                c1on.A00 = new C37360Gd2(0);
                c1on.cancel();
                return C0eB.A00;
            case 34:
                return new C42075Iki();
            case 35:
                ((C131565ws) this.A01).setRenderTree(null);
                return C0eB.A00;
            case 36:
                return new CacheKeyGenerator((UserSession) this.A01);
            case 37:
                return new C61072qV((UserSession) this.A01);
            case 38:
                return new C43601zh((UserSession) this.A01);
            case 39:
                return ((Context) this.A01).getCacheDir();
            case 40:
            case Seq.NULL_REFNUM /* 41 */:
                ((C14510oO) this.A01).A00 = false;
                return C0eB.A00;
            case Seq.RefTracker.REF_OFFSET /* 42 */:
                ((View) this.A01).postInvalidate();
                return C0eB.A00;
            case 43:
                return ((InterfaceC08830cm) this.A01).get();
            case 44:
            case 45:
                ((InterfaceC12870lZ) this.A01).onAppForegrounded();
                return C0eB.A00;
            case JITProfilePQR.MEGA_ZIP_NAME_PREFIX_LEN /* 46 */:
                InterfaceC41801wU interfaceC41801wU = (InterfaceC41801wU) ((AtomicReference) this.A01).getAndSet(EnumC137086Im.INSTANCE);
                if (interfaceC41801wU != null) {
                    interfaceC41801wU.dispose();
                }
                return C0eB.A00;
            case 47:
                return new C41097IHo((Context) this.A01);
            default:
                AbstractC166987dD.A1Y(this.A01);
                return C0eB.A00;
        }
    }
}
