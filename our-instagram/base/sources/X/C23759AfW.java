package X;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewStub;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.widget.reboundviewpager.ReboundViewPager;
import com.instagram.common.ui.widget.touchinterceptorlayout.TouchInterceptorFrameLayout;
import com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider;
import com.instagram.ui.widget.shutterbutton.ShutterButton;
import com.instagram.user.model.Product;

/* renamed from: X.AfW, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C23759AfW implements AnonymousClass884 {
    public int A01;
    public int A02;
    public int A03;
    public View A05;
    public C174437pd A06;
    public ReboundViewPager A07;
    public C88M A08;
    public C88H A09;
    public boolean A0A;
    public final Context A0B;
    public final ViewStub A0C;
    public final ViewStub A0D;
    public final TouchInterceptorFrameLayout A0E;
    public final TargetViewSizeProvider A0F;
    public final AnonymousClass889 A0G;
    public final ShutterButton A0H;
    public final View A0I;
    public final UserSession A0K;
    public final InterfaceC55932he A0J = new C668630d() { // from class: X.9e1
        @Override // X.C668630d, X.InterfaceC55932he
        public final void Dnk(C55982hj c55982hj) {
            C14360o3.A0B(c55982hj, 0);
            float f = (float) c55982hj.A09.A00;
            C23759AfW c23759AfW = C23759AfW.this;
            ReboundViewPager reboundViewPager = c23759AfW.A07;
            if (reboundViewPager == null) {
                if (f != 0.0f) {
                    C0w9.A03("ArCommercePrimaryDialViewController", AnonymousClass001.A0N("onSpringAtRest() dialViewPager is null, progress=", f));
                }
            } else {
                if (f == 0.0f) {
                    reboundViewPager.setVisibility(4);
                    return;
                }
                C88H c88h = c23759AfW.A09;
                if (c88h == null) {
                    return;
                }
                c88h.CkA();
            }
        }

        @Override // X.C668630d, X.InterfaceC55932he
        public final void Dnm(C55982hj c55982hj) {
            C14360o3.A0B(c55982hj, 0);
            C23759AfW.this.FBj((float) c55982hj.A09.A00);
        }
    };
    public final AnonymousClass887 A0L = new C23753AfQ(this);
    public float A00 = 1.0f;
    public int A04 = -1;

    public C23759AfW(View view, UserSession userSession, TargetViewSizeProvider targetViewSizeProvider) {
        this.A0I = view;
        this.A0K = userSession;
        this.A0F = targetViewSizeProvider;
        this.A0D = (ViewStub) AbstractC166987dD.A0c(view, R.id.dial_ar_effect_picker_container_stub);
        this.A0E = (TouchInterceptorFrameLayout) AbstractC166987dD.A0c(view, R.id.dial_picker_shutter_button_container);
        this.A0G = new AnonymousClass889(view, userSession, false, true);
        this.A0C = (ViewStub) AbstractC166987dD.A0c(view, R.id.dial_ar_effect_picker_background_stub);
        this.A0H = (ShutterButton) AbstractC166987dD.A0c(view, R.id.camera_shutter_button);
        Context context = view.getContext();
        this.A0B = context;
        Resources resources = context.getResources();
        this.A03 = resources.getDimensionPixelSize(R.dimen.dynamic_ads_picker_padding_top);
        this.A02 = resources.getDimensionPixelSize(R.dimen.album_music_sticker_circular_album_art_size);
        this.A01 = resources.getDimensionPixelSize(R.dimen.ad_not_delivering_thumbnail_height);
    }

    @Override // X.AnonymousClass884
    public final void E5t() {
        this.A0A = true;
        A00();
        this.A0H.setInnerCircleAlpha(0.0f);
        onResume();
    }

    @Override // X.AnonymousClass884
    public final void ESj(String str) {
    }

    @Override // X.AnonymousClass884
    public final void Eba(Product product) {
    }

    @Override // X.AnonymousClass884
    public final void Ebe(boolean z) {
    }

    @Override // X.AnonymousClass884
    public final void FC1() {
    }

    private final void A00() {
        if (this.A07 == null) {
            Context context = this.A0B;
            Resources resources = context.getResources();
            int A00 = C88P.A00(context);
            float f = A00;
            float A002 = InterfaceC1812882f.A00(this.A0F);
            int i = this.A02;
            this.A06 = new C174437pd(AbstractC174417pb.A00(f, A002 / 2.0f, AbstractC166987dD.A04(resources, R.dimen.abc_dialog_padding_material), AbstractC166987dD.A04(resources, R.dimen.abc_star_medium), AbstractC166987dD.A04(resources, R.dimen.abc_alert_dialog_button_dimen)), f, A002, i, this.A03);
            ReboundViewPager reboundViewPager = this.A07;
            if (reboundViewPager == null) {
                View inflate = this.A0D.inflate();
                C14360o3.A0C(inflate, "null cannot be cast to non-null type com.instagram.common.ui.widget.reboundviewpager.ReboundViewPager");
                reboundViewPager = (ReboundViewPager) inflate;
                this.A07 = reboundViewPager;
                this.A0G.A00 = reboundViewPager;
            }
            View view = this.A05;
            if (view == null) {
                view = this.A0C.inflate();
                this.A05 = view;
            }
            AbstractC13880nE.A0W(reboundViewPager, i);
            C14360o3.A0A(view);
            AbstractC13880nE.A0W(view, this.A01);
            reboundViewPager.setVisibility(0);
            reboundViewPager.A0C = A00;
            reboundViewPager.A0M(4, false);
            reboundViewPager.setPageSpacing(0.0f);
            reboundViewPager.setScrollMode(EnumC74213Va.A04);
            reboundViewPager.setItemPositioner(this.A06);
            this.A0G.A00("ar_commerce_primary_dial");
            C174537pn c174537pn = new C174537pn(context, this.A0H, reboundViewPager, new C23756AfT(this));
            this.A0E.A00(c174537pn.A02, c174537pn.A01);
            A01();
        }
    }

    private final void A01() {
        C88M c88m = this.A08;
        if (c88m != null) {
            C174437pd c174437pd = this.A06;
            c88m.A02 = c174437pd;
            if (c174437pd != null) {
                c174437pd.A00 = c88m.A04;
            }
            c88m.A03 = this.A0L;
            int i = c88m.A00;
            if (!c88m.A07(i)) {
                i = 0;
            }
            ReboundViewPager reboundViewPager = this.A07;
            if (reboundViewPager != null) {
                reboundViewPager.A0K(i);
            }
            ReboundViewPager reboundViewPager2 = this.A07;
            if (reboundViewPager2 != null) {
                reboundViewPager2.A0N(c88m, i);
            }
        }
    }

    @Override // X.AnonymousClass884
    public final boolean AFk() {
        ReboundViewPager reboundViewPager;
        if (!this.A0A || (reboundViewPager = this.A07) == null || reboundViewPager.A0O != C3VZ.A03) {
            return false;
        }
        return true;
    }

    @Override // X.AnonymousClass884
    public final void AJ8(C88M c88m, C88H c88h) {
        this.A09 = c88h;
        AnonymousClass889 anonymousClass889 = this.A0G;
        anonymousClass889.A02 = c88h;
        if (this.A08 != c88m) {
            this.A08 = c88m;
            anonymousClass889.A01 = c88m;
            if (AbstractC167007dF.A1W(this.A07)) {
                A01();
            }
        }
    }

    @Override // X.AnonymousClass884
    public final int B6q() {
        ReboundViewPager reboundViewPager = this.A07;
        if (reboundViewPager != null) {
            return reboundViewPager.A09;
        }
        throw AbstractC166997dE.A0g();
    }

    @Override // X.AnonymousClass884
    public final int BM3() {
        ReboundViewPager reboundViewPager = this.A07;
        if (reboundViewPager != null) {
            return reboundViewPager.A0A;
        }
        throw AbstractC166997dE.A0g();
    }

    @Override // X.AnonymousClass884
    public final int Bd6() {
        return this.A02;
    }

    @Override // X.AnonymousClass884
    public final InterfaceC55932he Bp9() {
        return this.A0J;
    }

    @Override // X.AnonymousClass884
    public final boolean CaF() {
        return AbstractC167007dF.A1W(this.A07);
    }

    @Override // X.AnonymousClass884
    public final void DmC() {
        ReboundViewPager reboundViewPager = this.A07;
        if (reboundViewPager != null) {
            reboundViewPager.requestDisallowInterceptTouchEvent(true);
        }
    }

    @Override // X.AnonymousClass884
    public final void EMP(int i, boolean z) {
        C88M c88m;
        if (AbstractC167007dF.A1W(this.A07) && (c88m = this.A08) != null) {
            if (c88m.A07(i)) {
                ReboundViewPager reboundViewPager = this.A07;
                if (z) {
                    if (reboundViewPager != null) {
                        reboundViewPager.A0L(i, 0.0f);
                        return;
                    }
                    return;
                } else {
                    if (reboundViewPager == null) {
                        return;
                    }
                    reboundViewPager.A0K(i);
                    return;
                }
            }
            C0w9.A03("ArCommercePrimaryDialViewController", "Invalid Scroll position passed");
        }
    }

    @Override // X.AnonymousClass884
    public final void EMq(String str) {
        C88M c88m = this.A08;
        if (c88m != null) {
            EMs(null, c88m.A00(str), false);
        }
    }

    @Override // X.AnonymousClass884
    public final void EVD(boolean z) {
        this.A0G.A05 = z;
    }

    @Override // X.AnonymousClass884
    public final void FBj(float f) {
        float f2;
        this.A00 = f;
        if (!AbstractC167007dF.A1W(this.A07)) {
            C0w9.A03("ArCommercePrimaryDialViewController", "updatePickerAlpha() was called but picker was not initialized");
            return;
        }
        ReboundViewPager reboundViewPager = this.A07;
        if (reboundViewPager != null) {
            reboundViewPager.setAlpha(f);
        }
        ReboundViewPager reboundViewPager2 = this.A07;
        if (reboundViewPager2 != null) {
            int i = 4;
            if (this.A00 > 0.0f) {
                i = 0;
            }
            reboundViewPager2.setVisibility(i);
        }
        ShutterButton shutterButton = this.A0H;
        C88M c88m = this.A08;
        if (c88m != null && c88m.getCount() != 0) {
            f2 = 1.0f - this.A00;
        } else {
            f2 = 1.0f;
        }
        shutterButton.setInnerCircleAlpha(f2);
    }

    @Override // X.AnonymousClass884
    public final View getView() {
        return this.A07;
    }

    @Override // X.AnonymousClass884
    public final void onPause() {
        C3VZ c3vz;
        ReboundViewPager reboundViewPager;
        if (this.A0A) {
            if (AbstractC167007dF.A1W(this.A07) && (reboundViewPager = this.A07) != null) {
                reboundViewPager.A0Q(this.A0G);
            }
            if (AbstractC167007dF.A1W(this.A07)) {
                ReboundViewPager reboundViewPager2 = this.A07;
                if (reboundViewPager2 != null) {
                    c3vz = reboundViewPager2.A0O;
                } else {
                    c3vz = null;
                }
                if (c3vz != C3VZ.A03) {
                    if (reboundViewPager2 != null) {
                        int A01 = C1H4.A01(reboundViewPager2.A01);
                        C88M c88m = this.A08;
                        if (c88m != null) {
                            int count = c88m.getCount() - 1;
                            if (count > A01) {
                                count = A01;
                            }
                            A01 = count;
                        }
                        int i = 0;
                        if (0 < A01) {
                            i = A01;
                        }
                        this.A04 = i;
                        ReboundViewPager reboundViewPager3 = this.A07;
                        if (reboundViewPager3 != null) {
                            reboundViewPager3.A0K(i);
                        }
                    } else {
                        throw AbstractC166997dE.A0g();
                    }
                }
            }
            C62882tR c62882tR = this.A0G.A03;
            if (c62882tR != null) {
                c62882tR.onPause();
            }
        }
    }

    @Override // X.AnonymousClass884
    public final void onResume() {
        C88M c88m;
        int i;
        ReboundViewPager reboundViewPager;
        if (this.A0A) {
            if (AbstractC167007dF.A1W(this.A07) && (reboundViewPager = this.A07) != null) {
                reboundViewPager.A0P(this.A0G);
            }
            if (AbstractC167007dF.A1W(this.A07) && (c88m = this.A08) != null && (i = this.A04) >= 0) {
                c88m.A03(i);
                this.A04 = -1;
            }
        }
    }

    @Override // X.AnonymousClass884
    public final void E5s() {
        onPause();
        this.A0A = false;
        this.A0H.setInnerCircleAlpha(1.0f);
    }

    @Override // X.AnonymousClass884
    public final void EMs(String str, int i, boolean z) {
        A00();
        ReboundViewPager reboundViewPager = this.A07;
        if (reboundViewPager != null) {
            reboundViewPager.A0K(i);
        }
        C88M c88m = this.A08;
        if (c88m != null) {
            c88m.A05(str, i, false, z, false);
        }
        this.A04 = -1;
    }
}
