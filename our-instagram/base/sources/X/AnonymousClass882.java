package X;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.facebook.R;
import com.facebook.cameracore.mediapipeline.arengineservices.interfaces.EffectAttribution;
import com.instagram.ar.features.effectspage.models.EffectsPageModel;
import com.instagram.camera.effect.models.CameraAREffect;
import com.instagram.camera.effect.mq.IgCameraEffectsController;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.ui.widget.reboundviewpager.ReboundViewPager;
import com.instagram.common.ui.widget.touchinterceptorlayout.TouchInterceptorFrameLayout;
import com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider;
import com.instagram.creation.capture.quickcapture.dial.CameraProductTitleView;
import com.instagram.model.shopping.ProductItemWithAR;
import com.instagram.ui.widget.shutterbutton.ShutterButton;
import com.instagram.user.model.Product;
import instagram.features.clips.ar.features.effectspage.ui.EffectsPageFragment;
import java.util.List;
import java.util.UUID;

/* renamed from: X.882, reason: invalid class name */
/* loaded from: classes4.dex */
public final class AnonymousClass882 implements AnonymousClass883 {
    public int A00;
    public int A01;
    public View A02;
    public C4PX A03;
    public C174437pd A04;
    public ReboundViewPager A05;
    public C57012jc A06;
    public CameraProductTitleView A07;
    public C88M A08;
    public C88H A09;
    public C195328kY A0A;
    public boolean A0B;
    public boolean A0C;
    public boolean A0D;
    public boolean A0E;
    public float A0F;
    public float A0G;
    public final int A0H;
    public final int A0I;
    public final int A0J;
    public final Activity A0K;
    public final ViewStub A0L;
    public final ViewStub A0M;
    public final InterfaceC58362lv A0N;
    public final InterfaceC58362lv A0O;
    public final UserSession A0P;
    public final TouchInterceptorFrameLayout A0Q;
    public final TargetViewSizeProvider A0R;
    public final C87x A0S;
    public final C87x A0T;
    public final AnonymousClass889 A0U;
    public final C87y A0V;
    public final C1825687z A0W;
    public final ShutterButton A0X;
    public final InterfaceC09390do A0Y;
    public final InterfaceC09390do A0Z;
    public final InterfaceC09390do A0a;
    public final View A0b;
    public final ViewGroup A0c;
    public final AnonymousClass887 A0d;
    public final AnonymousClass885 A0e;

    /* JADX WARN: Type inference failed for: r0v5, types: [X.885] */
    public AnonymousClass882(Activity activity, UserSession userSession, TargetViewSizeProvider targetViewSizeProvider, C87x c87x, C1825687z c1825687z) {
        AUA aua;
        C14360o3.A0B(c1825687z, 1);
        C14360o3.A0B(targetViewSizeProvider, 4);
        C14360o3.A0B(c87x, 5);
        this.A0W = c1825687z;
        this.A0P = userSession;
        this.A0K = activity;
        this.A0R = targetViewSizeProvider;
        this.A0S = c87x;
        this.A0V = c87x;
        this.A0T = c87x;
        View view = c1825687z.A00;
        View requireViewById = view.requireViewById(R.id.dial_picker_shutter_button_container);
        C14360o3.A07(requireViewById);
        this.A0Q = (TouchInterceptorFrameLayout) requireViewById;
        this.A0e = new C668630d() { // from class: X.885
            @Override // X.C668630d, X.InterfaceC55932he
            public final void Dnk(C55982hj c55982hj) {
                C14360o3.A0B(c55982hj, 0);
                float f = (float) c55982hj.A09.A00;
                AnonymousClass882 anonymousClass882 = AnonymousClass882.this;
                ReboundViewPager reboundViewPager = anonymousClass882.A05;
                if (reboundViewPager == null) {
                    if (f != 0.0f) {
                        AbstractC12120kG.A07("PreCaptureDialViewController", AnonymousClass001.A0N("onSpringAtRest() mDialViewPager is null, progress=", f), null);
                    }
                } else {
                    if (f == 0.0f) {
                        reboundViewPager.setVisibility(4);
                        return;
                    }
                    C88H c88h = anonymousClass882.A09;
                    if (c88h == null) {
                        return;
                    }
                    c88h.CkA();
                }
            }

            @Override // X.C668630d, X.InterfaceC55932he
            public final void Dnm(C55982hj c55982hj) {
                C14360o3.A0B(c55982hj, 0);
                AnonymousClass882.this.FBj((float) c55982hj.A09.A00);
            }
        };
        this.A0d = new AnonymousClass887() { // from class: X.886
            @Override // X.AnonymousClass887
            public final void DDB(C88X c88x, String str, int i, boolean z) {
            }

            @Override // X.AnonymousClass887
            public final void DDD(C88X c88x, int i, boolean z) {
                throw C00O.createAndThrow();
            }

            @Override // X.AnonymousClass887
            public final void DNi(C88X c88x, int i) {
                C14360o3.A0B(c88x, 0);
                boolean A04 = c88x.A04();
                AnonymousClass882 anonymousClass882 = AnonymousClass882.this;
                if (A04) {
                    AnonymousClass882.A04(c88x, anonymousClass882);
                } else if (anonymousClass882.A0W.A03) {
                    ProductItemWithAR productItemWithAR = c88x.A06;
                    if (productItemWithAR != null) {
                        anonymousClass882.Eba(AbstractC38048Gob.A01(productItemWithAR.A01));
                    }
                } else {
                    anonymousClass882.ESj(c88x.A0G);
                }
                anonymousClass882.FAh();
            }
        };
        this.A0E = true;
        this.A0G = 1.0f;
        this.A0F = 1.0f;
        this.A00 = -1;
        if (C18U.A06(C06090Tz.A05, userSession, 36317818253612660L)) {
            aua = new AUA(this);
        } else {
            aua = null;
        }
        this.A0N = aua;
        InterfaceC58362lv interfaceC58362lv = new InterfaceC58362lv() { // from class: X.888
            @Override // X.InterfaceC58362lv
            public final /* bridge */ /* synthetic */ void onChanged(Object obj) {
                boolean booleanValue = ((Boolean) obj).booleanValue();
                AnonymousClass882 anonymousClass882 = AnonymousClass882.this;
                anonymousClass882.A0E = booleanValue;
                anonymousClass882.FAh();
            }
        };
        this.A0O = interfaceC58362lv;
        this.A0Y = AbstractC09440dt.A01(new C9ET(this, 0));
        this.A0a = AbstractC09440dt.A01(new C9ET(this, 2));
        this.A0Z = AbstractC09440dt.A01(new C9ET(this, 1));
        Context context = view.getContext();
        this.A0M = (ViewStub) view.requireViewById(R.id.dial_ar_effect_picker_container_stub);
        this.A0L = (ViewStub) view.findViewById(R.id.dial_ar_effect_picker_background_stub);
        this.A0X = (ShutterButton) view.findViewById(R.id.camera_shutter_button);
        this.A0b = view.findViewById(R.id.camera_shutter_button_container);
        this.A0c = (ViewGroup) view.requireViewById(R.id.effect_footer_container);
        Resources resources = context.getResources();
        this.A0I = resources.getDimensionPixelSize(R.dimen.audio_page_audio_filter_tooltip_vertical_offset);
        this.A0J = resources.getDimensionPixelSize(R.dimen.album_music_sticker_circular_album_art_size);
        this.A0H = resources.getDimensionPixelSize(R.dimen.ad_not_delivering_thumbnail_height);
        this.A0U = new AnonymousClass889(view, userSession, false, true);
        if (!C2B0.A00(C05F.A01)) {
            c87x.A00(aua, interfaceC58362lv);
        }
    }

    @Override // X.AnonymousClass883
    public final boolean CRL(MotionEvent motionEvent) {
        if (this.A0A == null) {
            return false;
        }
        int rawX = (int) motionEvent.getRawX();
        int rawY = (int) motionEvent.getRawY();
        Rect rect = new Rect();
        C195328kY c195328kY = this.A0A;
        if (c195328kY != null) {
            c195328kY.getGlobalVisibleRect(rect);
        }
        return !rect.contains(rawX, rawY);
    }

    @Override // X.AnonymousClass884
    public final void E5t() {
        this.A0B = true;
        A02();
        ShutterButton shutterButton = this.A0X;
        if (shutterButton != null) {
            shutterButton.setInnerCircleAlpha(0.0f);
        }
        onResume();
    }

    @Override // X.AnonymousClass883
    public final void EMI(String str, boolean z) {
        C88M c88m = this.A08;
        if (c88m != null) {
            EMP(c88m.A00(str), true);
        }
    }

    @Override // X.AnonymousClass883
    public final void Eex(boolean z) {
        this.A0C = true;
    }

    public static final CameraAREffect A00(AnonymousClass882 anonymousClass882) {
        C88X A02;
        C88M c88m = anonymousClass882.A08;
        if (c88m == null || (A02 = c88m.A02(c88m.A00)) == null) {
            return null;
        }
        return A02.A00();
    }

    private final void A01() {
        final Context context;
        View A01;
        View A012;
        View A013;
        CameraProductTitleView cameraProductTitleView;
        float f;
        ReboundViewPager reboundViewPager = this.A05;
        boolean z = false;
        if (reboundViewPager != null) {
            z = true;
        }
        int i = 4;
        Drawable drawable = null;
        if (!z) {
            AbstractC12120kG.A07("PreCaptureDialViewController", "updatePickerAlpha() was called but picker was not initialized", null);
            return;
        }
        float min = Math.min(this.A0G, this.A0F);
        if (reboundViewPager != null) {
            reboundViewPager.setAlpha(min);
            ReboundViewPager reboundViewPager2 = this.A05;
            int i2 = 0;
            if (reboundViewPager2 != null) {
                if (min > 0.0f) {
                    i = 0;
                }
                reboundViewPager2.setVisibility(i);
            }
            C1811981v c1811981v = this.A0S.A02.A08;
            if (c1811981v.A00 == C81S.A00) {
                FCE(min);
            }
            ShutterButton shutterButton = this.A0X;
            if (shutterButton != null) {
                C88M c88m = this.A08;
                if (c88m != null && c88m.getCount() != 0) {
                    f = 1.0f - min;
                } else {
                    f = 1.0f;
                }
                shutterButton.setInnerCircleAlpha(f);
            }
            if (this.A0W.A03 && (cameraProductTitleView = this.A07) != null) {
                int i3 = 0;
                if (min == 0.0f) {
                    i3 = 8;
                }
                cameraProductTitleView.setVisibility(i3);
                CameraProductTitleView cameraProductTitleView2 = this.A07;
                if (cameraProductTitleView2 != null) {
                    cameraProductTitleView2.setAlpha(min);
                }
            } else {
                C195328kY c195328kY = this.A0A;
                if (c195328kY != null && c1811981v.A00 != C128535rM.A00) {
                    if (!this.A0B) {
                        min = 0.0f;
                    }
                    c195328kY.setGroupAlpha(min);
                }
            }
            C57012jc c57012jc = this.A06;
            if (c57012jc != null) {
                if (!c57012jc.A04()) {
                    return;
                }
                if (this.A0G == 0.0f) {
                    i2 = 8;
                }
                c57012jc.A03(i2);
                C57012jc c57012jc2 = this.A06;
                if (c57012jc2 != null && (A013 = c57012jc2.A01()) != null) {
                    A013.setAlpha(this.A0G);
                }
                C57012jc c57012jc3 = this.A06;
                if (c57012jc3 != null && (A012 = c57012jc3.A01()) != null) {
                    context = A012.getContext();
                } else {
                    context = null;
                }
                C57012jc c57012jc4 = this.A06;
                if (c57012jc4 == null || (A01 = c57012jc4.A01()) == null) {
                    return;
                }
                if (context != null) {
                    final int A07 = AbstractC13880nE.A07(context);
                    drawable = new Drawable(context, A07) { // from class: X.7pr
                        public final int A00;
                        public final int A01;
                        public final Paint A02;

                        {
                            this.A01 = A07;
                            int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.ad_not_delivering_thumbnail_height);
                            this.A00 = dimensionPixelSize;
                            Paint paint = new Paint(1);
                            this.A02 = paint;
                            paint.setStyle(Paint.Style.FILL);
                            paint.setDither(true);
                            paint.setShader(new LinearGradient(0.0f, dimensionPixelSize, 0.0f, 0.0f, new int[]{context.getColor(C14640oc.A03() ? R.color.igds_prism_black_alpha_40 : R.color.black_40_transparent), 0}, (float[]) null, Shader.TileMode.CLAMP));
                            setBounds(0, 0, A07, dimensionPixelSize);
                        }

                        @Override // android.graphics.drawable.Drawable
                        public final void draw(Canvas canvas) {
                            C14360o3.A0B(canvas, 0);
                            canvas.drawRect(getBounds(), this.A02);
                        }

                        @Override // android.graphics.drawable.Drawable
                        public final int getOpacity() {
                            return -3;
                        }

                        @Override // android.graphics.drawable.Drawable
                        public final int getIntrinsicHeight() {
                            return this.A00;
                        }

                        @Override // android.graphics.drawable.Drawable
                        public final int getIntrinsicWidth() {
                            return this.A01;
                        }

                        @Override // android.graphics.drawable.Drawable
                        public final void setAlpha(int i4) {
                            this.A02.setAlpha(i4);
                        }

                        @Override // android.graphics.drawable.Drawable
                        public final void setColorFilter(ColorFilter colorFilter) {
                            this.A02.setColorFilter(colorFilter);
                        }
                    };
                }
                A01.setBackground(drawable);
                return;
            }
            throw new IllegalStateException("Required value was null.");
        }
        throw new IllegalStateException("Required value was null.");
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x00ef, code lost:
    
        if (r5 == false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00f3, code lost:
    
        if (r13.A0A != null) goto L29;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void A02() {
        /*
            Method dump skipped, instructions count: 330
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass882.A02():void");
    }

    private final void A03() {
        C88M c88m = this.A08;
        if (c88m != null) {
            C174437pd c174437pd = this.A04;
            c88m.A02 = c174437pd;
            if (c174437pd != null) {
                c174437pd.A00 = c88m.A04;
            }
            c88m.A03 = this.A0d;
            Integer valueOf = Integer.valueOf(c88m.A00);
            if (valueOf != null) {
                int intValue = valueOf.intValue();
                c88m.A07(intValue);
                ReboundViewPager reboundViewPager = this.A05;
                if (reboundViewPager != null) {
                    reboundViewPager.A0K(intValue);
                    ReboundViewPager reboundViewPager2 = this.A05;
                    if (reboundViewPager2 != null) {
                        C88M c88m2 = this.A08;
                        if (c88m2 != null) {
                            reboundViewPager2.A0N(c88m2, intValue);
                            return;
                        }
                        throw new IllegalArgumentException("Required value was null.");
                    }
                    return;
                }
                throw new IllegalStateException("Required value was null.");
            }
        }
    }

    public static final void A04(C88X c88x, AnonymousClass882 anonymousClass882) {
        Context context;
        String A01;
        SpannableStringBuilder spannableStringBuilder;
        InterfaceC09390do interfaceC09390do = anonymousClass882.A0Y;
        View view = (View) interfaceC09390do.getValue();
        if (view != null) {
            context = view.getContext();
        } else {
            context = null;
        }
        View view2 = (View) interfaceC09390do.getValue();
        int i = 0;
        if (view2 != null) {
            view2.setVisibility(0);
        }
        TextView textView = (TextView) anonymousClass882.A0a.getValue();
        if (textView != null) {
            C88Z c88z = c88x.A04;
            if (c88z == null) {
                c88z = C88Z.A0G;
            }
            if (c88z == C88Z.A0W && !c88x.A0O) {
                String str = c88x.A0G;
                C14360o3.A07(str);
                spannableStringBuilder = AMo.A04(context, str);
            } else {
                spannableStringBuilder = new SpannableStringBuilder(c88x.A0G);
            }
            textView.setText(spannableStringBuilder);
        }
        SpannableStringBuilder spannableStringBuilder2 = null;
        if (context != null && (A01 = c88x.A01(context)) != null) {
            spannableStringBuilder2 = AMo.A04(context, A01);
        }
        InterfaceC09390do interfaceC09390do2 = anonymousClass882.A0Z;
        TextView textView2 = (TextView) interfaceC09390do2.getValue();
        if (textView2 != null) {
            textView2.setText(spannableStringBuilder2);
        }
        View view3 = (View) interfaceC09390do2.getValue();
        if (view3 != null) {
            if (spannableStringBuilder2 == null) {
                i = 8;
            }
            view3.setVisibility(i);
        }
        View view4 = (View) interfaceC09390do.getValue();
        if (view4 != null) {
            C0fQ.A00(new ARN(c88x, anonymousClass882), view4);
        }
    }

    public static final void A05(final AnonymousClass882 anonymousClass882) {
        if (anonymousClass882.A0A == null) {
            InterfaceC195318kX interfaceC195318kX = new InterfaceC195318kX() { // from class: X.7pi
                @Override // X.InterfaceC195318kX
                public final void D5X() {
                    AnonymousClass882.this.A0V.DCx();
                }

                @Override // X.InterfaceC195318kX
                public final void DD0() {
                    AnonymousClass882.A06(AnonymousClass882.this);
                }

                @Override // X.InterfaceC195318kX
                public final void Di8() {
                    CameraAREffect A00;
                    AnonymousClass882 anonymousClass8822 = AnonymousClass882.this;
                    if (anonymousClass8822.A0A != null && (A00 = AnonymousClass882.A00(anonymousClass8822)) != null) {
                        boolean CcN = A00.CcN();
                        C87y c87y = anonymousClass8822.A0V;
                        if (CcN) {
                            c87y.DD8(A00);
                        } else {
                            c87y.DD5(A00);
                        }
                        C195328kY c195328kY = anonymousClass8822.A0A;
                        if (c195328kY != null) {
                            if (c195328kY.A01) {
                                c195328kY.setBookmarkIconExpanded(!CcN);
                            } else {
                                c195328kY.setBookmarkIcon(!CcN);
                            }
                        }
                    }
                }
            };
            Context context = anonymousClass882.A0W.A00.getContext();
            C14360o3.A07(context);
            anonymousClass882.A0A = new C195328kY(context, interfaceC195318kX, anonymousClass882.A0R.CV5());
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
            layoutParams.gravity = 17;
            ViewGroup viewGroup = anonymousClass882.A0c;
            if (viewGroup != null) {
                viewGroup.addView(anonymousClass882.A0A, layoutParams);
                return;
            }
            throw new IllegalStateException("Required value was null.");
        }
    }

    public static final void A06(AnonymousClass882 anonymousClass882) {
        CameraAREffect A00 = A00(anonymousClass882);
        if (A00 != null && A00.A0D()) {
            C87x c87x = (C87x) anonymousClass882.A0V;
            C81J c81j = c87x.A03;
            UserSession userSession = c81j.A0S;
            C14360o3.A07(userSession);
            Activity activity = c81j.A05;
            C14360o3.A07(activity);
            C22P c22p = (C22P) c87x.A08.invoke();
            EnumC114925Hg A002 = AbstractC191238dS.A00((C55U) c87x.A02.A08.A00);
            String moduleName = c87x.A04.getModuleName();
            IgCameraEffectsController igCameraEffectsController = c87x.A01.A00().A05;
            AnonymousClass818 anonymousClass818 = igCameraEffectsController.A07;
            EffectAttribution effectAttribution = null;
            if (anonymousClass818 == null) {
                AbstractC12120kG.A01("IgCameraEffectsController", "MQRenderer is null");
            } else if (anonymousClass818.A0D() != null) {
                effectAttribution = igCameraEffectsController.A07.A0D().mAttribution;
            }
            C14360o3.A0B(c22p, 3);
            C14360o3.A0B(A002, 4);
            String obj = UUID.randomUUID().toString();
            C14360o3.A07(obj);
            String str = A00.A0B;
            if (str != null) {
                String str2 = A00.A0C;
                if (str2 != null) {
                    ImageUrl imageUrl = A00.A07;
                    String str3 = A00.A0K;
                    String str4 = A00.A0M;
                    C14360o3.A07(str4);
                    String str5 = A00.A0S;
                    C14360o3.A07(str5);
                    EffectsPageModel effectsPageModel = new EffectsPageModel(effectAttribution, imageUrl, null, null, null, null, str, str2, str3, null, str4, str5, "", null, false, false, A00.CcN(), true, true, true, true, false);
                    EnumC223429tZ enumC223429tZ = EnumC223429tZ.EFFECT_FOOTER;
                    AbstractC40465Hwu.A00(activity, EffectsPageFragment.A00(enumC223429tZ, null, effectsPageModel, null, null, obj, null, null, null), A002, enumC223429tZ, c22p, EnumC50631MWs.A0J, userSession, C05F.A01, moduleName);
                    return;
                }
                throw new IllegalStateException("Required value was null.");
            }
            throw new IllegalStateException("Required value was null.");
        }
    }

    @Override // X.AnonymousClass884
    public final boolean AFk() {
        C3VZ c3vz;
        if (!this.A0B) {
            return false;
        }
        ReboundViewPager reboundViewPager = this.A05;
        if (reboundViewPager != null) {
            c3vz = reboundViewPager.A0O;
        } else {
            c3vz = null;
        }
        if (c3vz != C3VZ.A03) {
            return false;
        }
        return true;
    }

    @Override // X.AnonymousClass884
    public final void AJ8(C88M c88m, C88H c88h) {
        this.A09 = c88h;
        AnonymousClass889 anonymousClass889 = this.A0U;
        anonymousClass889.A02 = c88h;
        if (!C14360o3.A0K(this.A08, c88m)) {
            this.A08 = c88m;
            anonymousClass889.A01 = c88m;
            FAh();
            if (this.A05 != null) {
                A03();
            }
        }
    }

    @Override // X.AnonymousClass884
    public final int B6q() {
        ReboundViewPager reboundViewPager = this.A05;
        if (reboundViewPager != null) {
            return reboundViewPager.A09;
        }
        throw new IllegalStateException("Required value was null.");
    }

    @Override // X.AnonymousClass884
    public final int BM3() {
        ReboundViewPager reboundViewPager = this.A05;
        if (reboundViewPager != null) {
            return reboundViewPager.A0A;
        }
        throw new IllegalStateException("Required value was null.");
    }

    @Override // X.AnonymousClass884
    public final int Bd6() {
        return this.A0J;
    }

    @Override // X.AnonymousClass884
    public final InterfaceC55932he Bp9() {
        return this.A0e;
    }

    @Override // X.AnonymousClass883
    public final void CIw() {
        C190298bn A01 = C190298bn.A03.A01(this.A0P);
        if (A01 != null && A01.A00().A0J()) {
            this.A0V.DCx();
        }
        FAh();
    }

    @Override // X.AnonymousClass884
    public final boolean CaF() {
        if (this.A05 == null) {
            return false;
        }
        return true;
    }

    @Override // X.AnonymousClass883
    public final boolean Cdr() {
        return this.A0C;
    }

    @Override // X.AnonymousClass884
    public final void DmC() {
        ReboundViewPager reboundViewPager = this.A05;
        if (reboundViewPager != null) {
            reboundViewPager.requestDisallowInterceptTouchEvent(true);
        }
    }

    @Override // X.AnonymousClass883
    public final void E2s() {
        UserSession userSession = this.A0P;
        C191138dB.A01(EnumC223409tX.TAP_NEW_GROUP_ICON, AbstractC191128dA.A00(userSession), null);
        AbstractC22735A1f.A00(this.A0K, C88Z.A0Y, userSession, null, null, null);
    }

    @Override // X.AnonymousClass883
    public final void ECt() {
        C88X A01;
        C88M c88m = this.A08;
        if (c88m != null && (A01 = c88m.A01()) != null && A01.A04()) {
            A04(A01, this);
        }
    }

    @Override // X.AnonymousClass883
    public final void EJg() {
        C88M c88m = this.A08;
        if (c88m != null) {
            List list = c88m.A08;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                if (((C88X) list.get(i)).A04 == C88Z.A0G) {
                    c88m.A03(i);
                    return;
                }
            }
        }
    }

    @Override // X.AnonymousClass884
    public final void EMP(int i, boolean z) {
        C88M c88m;
        if (this.A05 != null && (c88m = this.A08) != null) {
            if (c88m.A07(i)) {
                ReboundViewPager reboundViewPager = this.A05;
                if (z) {
                    if (reboundViewPager != null) {
                        reboundViewPager.A0L(i, 0.0f);
                        return;
                    }
                    throw new IllegalStateException("Required value was null.");
                }
                if (reboundViewPager != null) {
                    reboundViewPager.A0K(i);
                    return;
                }
                throw new IllegalStateException("Required value was null.");
            }
            AbstractC12120kG.A07("PreCaptureDialViewController", "Invalid Scroll position passed", null);
        }
    }

    @Override // X.AnonymousClass884
    public final void EMq(String str) {
        C88M c88m = this.A08;
        if (c88m != null) {
            EMs(null, c88m.A00(str), false);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x001b, code lost:
    
        if (r0.Ejm(r1) != true) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0022, code lost:
    
        if (r1 == null) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0028, code lost:
    
        if (r1.A00() == null) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x002a, code lost:
    
        if (r2 == null) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x002c, code lost:
    
        r10 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x002f, code lost:
    
        if (r2.A0d == false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0054, code lost:
    
        if (r11.A0B != false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x003d, code lost:
    
        r1 = r11.A0A;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x003f, code lost:
    
        if (r1 == null) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0041, code lost:
    
        r8 = r1.A01;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0044, code lost:
    
        if (r8 != true) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0046, code lost:
    
        if (r12 == null) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x004c, code lost:
    
        if (r12.length() != 0) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x004e, code lost:
    
        r1.A0F();
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0051, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0073, code lost:
    
        if (r2 == null) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0075, code lost:
    
        r9 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x007e, code lost:
    
        if (((X.C87x) r11.A0V).A03.A3k == false) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0081, code lost:
    
        r1.setCurrentTitle(new X.C174587ps(r12, r5, r6, r7, r8, r9, r10));
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0089, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0080, code lost:
    
        r9 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0056, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0031, code lost:
    
        r10 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0032, code lost:
    
        if (r2 != null) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0034, code lost:
    
        r1 = r11.A0A;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0036, code lost:
    
        if (r1 == null) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0038, code lost:
    
        r1.setCurrentTitle(X.C174587ps.A07);
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x006e, code lost:
    
        if (r2.CcN() != true) goto L16;
     */
    @Override // X.AnonymousClass884
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void ESj(java.lang.String r12) {
        /*
            r11 = this;
            X.8kY r0 = r11.A0A
            if (r0 == 0) goto L51
            X.88M r1 = r11.A08
            r5 = 0
            if (r1 == 0) goto L71
            int r0 = r1.A00
            X.88X r1 = r1.A02(r0)
        Lf:
            r3 = 1
            if (r1 == 0) goto L1d
            X.88H r0 = r11.A09
            if (r0 == 0) goto L1d
            boolean r0 = r0.Ejm(r1)
            r6 = 1
            if (r0 == r3) goto L57
        L1d:
            r6 = 0
            if (r1 != 0) goto L57
            r2 = r5
        L21:
            r7 = 0
            if (r1 == 0) goto L31
        L24:
            com.instagram.camera.effect.models.CameraAREffect r0 = r1.A00()
            if (r0 == 0) goto L31
            if (r2 == 0) goto L31
            boolean r0 = r2.A0d
            r10 = 1
            if (r0 == 0) goto L52
        L31:
            r10 = 0
            if (r2 != 0) goto L52
            X.8kY r1 = r11.A0A
            if (r1 == 0) goto L3d
            X.7ps r0 = X.C174587ps.A07
            r1.setCurrentTitle(r0)
        L3d:
            X.8kY r1 = r11.A0A
            if (r1 == 0) goto L51
            boolean r8 = r1.A01
            r4 = r12
            if (r8 != r3) goto L73
            if (r12 == 0) goto L4e
            int r0 = r12.length()
            if (r0 != 0) goto L73
        L4e:
            r1.A0F()
        L51:
            return
        L52:
            boolean r0 = r11.A0B
            if (r0 != 0) goto L3d
            return
        L57:
            com.instagram.camera.effect.models.CameraAREffect r2 = r1.A00()
            X.87z r0 = r11.A0W
            android.view.View r0 = r0.A00
            android.content.Context r0 = r0.getContext()
            java.lang.String r5 = r1.A01(r0)
            if (r2 == 0) goto L21
            boolean r0 = r2.CcN()
            r7 = 1
            if (r0 == r3) goto L24
            goto L21
        L71:
            r1 = r5
            goto Lf
        L73:
            if (r2 == 0) goto L80
            X.87y r0 = r11.A0V
            X.87x r0 = (X.C87x) r0
            X.81J r0 = r0.A03
            boolean r0 = r0.A3k
            r9 = 1
            if (r0 == 0) goto L81
        L80:
            r9 = 0
        L81:
            X.7ps r3 = new X.7ps
            r3.<init>(r4, r5, r6, r7, r8, r9, r10)
            r1.setCurrentTitle(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass882.ESj(java.lang.String):void");
    }

    @Override // X.AnonymousClass883
    public final void ETf(float f) {
        ViewGroup viewGroup = this.A0c;
        if (viewGroup != null) {
            viewGroup.setAlpha(f);
        }
    }

    @Override // X.AnonymousClass883
    public final void ETg(boolean z) {
        C195328kY c195328kY;
        C195328kY c195328kY2;
        C195328kY c195328kY3 = this.A0A;
        if (c195328kY3 == null) {
            this.A0D = z;
            return;
        }
        boolean z2 = true;
        if (z) {
            c195328kY3.A0E();
            C195328kY c195328kY4 = this.A0A;
            if (c195328kY4 != null) {
                c195328kY4.setHorizontalMargin(0);
            }
            CameraAREffect A00 = A00(this);
            C195328kY c195328kY5 = this.A0A;
            if (c195328kY5 != null) {
                if (A00 == null || !A00.CcN()) {
                    z2 = false;
                }
                c195328kY5.setBookmarkIconExpanded(z2);
            }
            if (A00 != null || (c195328kY2 = this.A0A) == null) {
                return;
            }
            c195328kY2.A0F();
            return;
        }
        c195328kY3.A06.setTextSize(12.0f);
        c195328kY3.A05.setTextSize(12.0f);
        c195328kY3.setBackground(c195328kY3.A04);
        c195328kY3.A01 = false;
        C195328kY.A00(c195328kY3);
        C195328kY c195328kY6 = this.A0A;
        if (c195328kY6 != null) {
            c195328kY6.setHorizontalMargin(this.A01);
        }
        CameraAREffect A002 = A00(this);
        C195328kY c195328kY7 = this.A0A;
        if (c195328kY7 != null) {
            if (A002 == null || !A002.CcN()) {
                z2 = false;
            }
            c195328kY7.setBookmarkIcon(z2);
        }
        if (A002 != null || (c195328kY = this.A0A) == null) {
            return;
        }
        c195328kY.setCurrentTitle(C174587ps.A07);
    }

    @Override // X.AnonymousClass883
    public final void ETh(int i) {
        ViewGroup viewGroup = this.A0c;
        if (viewGroup != null) {
            viewGroup.setTranslationY(-i);
        }
    }

    @Override // X.AnonymousClass884
    public final void EVD(boolean z) {
        this.A0U.A05 = z;
    }

    @Override // X.AnonymousClass884
    public final void Eba(Product product) {
        CameraProductTitleView cameraProductTitleView = this.A07;
        if (cameraProductTitleView != null) {
            cameraProductTitleView.setProduct(product);
        }
    }

    @Override // X.AnonymousClass884
    public final void Ebe(boolean z) {
        CameraProductTitleView cameraProductTitleView = this.A07;
        if (cameraProductTitleView != null) {
            int i = 8;
            if (z) {
                i = 0;
            }
            cameraProductTitleView.setVisibility(i);
        }
    }

    @Override // X.AnonymousClass883
    public final void FAh() {
        ReboundViewPager reboundViewPager;
        EnumC74213Va enumC74213Va;
        C190298bn A01;
        C88M c88m = this.A08;
        if (c88m != null && this.A05 != null) {
            if (c88m.getCount() <= 1 || !this.A0E || ((A01 = C190298bn.A03.A01(this.A0P)) != null && A01.A00().A0J())) {
                reboundViewPager = this.A05;
                if (reboundViewPager != null) {
                    enumC74213Va = EnumC74213Va.A02;
                } else {
                    return;
                }
            } else {
                reboundViewPager = this.A05;
                if (reboundViewPager == null) {
                    return;
                } else {
                    enumC74213Va = EnumC74213Va.A04;
                }
            }
            reboundViewPager.setScrollMode(enumC74213Va);
        }
    }

    @Override // X.AnonymousClass883
    public final void FB1(float f) {
        this.A0F = 1.0f;
        if (this.A05 != null) {
            A01();
        }
    }

    @Override // X.AnonymousClass884
    public final void FBj(float f) {
        this.A0G = f;
        A01();
    }

    @Override // X.AnonymousClass883
    public final void FCE(float f) {
        View view = this.A0b;
        if (view != null) {
            view.setAlpha(f);
            int i = 4;
            if (f > 0.0f) {
                i = 0;
            }
            view.setVisibility(i);
        }
    }

    @Override // X.AnonymousClass884
    public final View getView() {
        return this.A05;
    }

    @Override // X.AnonymousClass883
    public final void hide() {
        if (this.A05 != null) {
            E5s();
        }
    }

    @Override // X.AnonymousClass883
    public final boolean isVisible() {
        return this.A0B;
    }

    @Override // X.AnonymousClass884
    public final void onPause() {
        if (this.A0B) {
            ReboundViewPager reboundViewPager = this.A05;
            if (reboundViewPager != null) {
                reboundViewPager.A0Q(this.A0U);
            }
            ReboundViewPager reboundViewPager2 = this.A05;
            if (reboundViewPager2 != null && reboundViewPager2.A0O != C3VZ.A03) {
                int rint = (int) Math.rint(reboundViewPager2.A01);
                if (this.A08 != null) {
                    rint = Math.min(r0.getCount() - 1, rint);
                }
                int max = Math.max(0, rint);
                this.A00 = max;
                ReboundViewPager reboundViewPager3 = this.A05;
                if (reboundViewPager3 != null) {
                    reboundViewPager3.A0K(max);
                }
            }
            C62882tR c62882tR = this.A0U.A03;
            if (c62882tR != null) {
                c62882tR.onPause();
            }
        }
    }

    @Override // X.AnonymousClass884
    public final void onResume() {
        int i;
        C88M c88m;
        if (this.A0B) {
            ReboundViewPager reboundViewPager = this.A05;
            if (reboundViewPager != null) {
                reboundViewPager.A0P(this.A0U);
            }
            if (this.A05 != null && (i = this.A00) >= 0 && (c88m = this.A08) != null) {
                c88m.A05(null, i, false, false, false);
                this.A00 = -1;
            }
        }
    }

    @Override // X.AnonymousClass883
    public final void DHi(C4PX c4px) {
        this.A03 = c4px;
    }

    @Override // X.AnonymousClass884
    public final void E5s() {
        onPause();
        this.A0B = false;
        ShutterButton shutterButton = this.A0X;
        if (shutterButton != null) {
            Application application = this.A0S.A03.A05.getApplication();
            C14360o3.A07(application);
            if (AbstractC184448Gi.A00(application)) {
                shutterButton.setInnerCircleAlpha(1.0f);
            }
        }
        FBj(0.0f);
        if (this.A0W.A03) {
            CameraProductTitleView cameraProductTitleView = this.A07;
            if (cameraProductTitleView != null) {
                cameraProductTitleView.setVisibility(8);
            }
        } else {
            ESj(null);
        }
        View view = (View) this.A0Y.getValue();
        if (view != null) {
            view.setVisibility(8);
        }
    }

    @Override // X.AnonymousClass883
    public final void ECs() {
        CameraAREffect A00 = A00(this);
        if (A00 != null) {
            ESj(A00.A0S);
        }
    }

    @Override // X.AnonymousClass884
    public final void EMs(String str, int i, boolean z) {
        A02();
        ReboundViewPager reboundViewPager = this.A05;
        if (reboundViewPager != null) {
            reboundViewPager.A0K(i);
            C88M c88m = this.A08;
            if (c88m != null) {
                c88m.A05(str, i, false, z, false);
            }
            this.A00 = -1;
            return;
        }
        throw new IllegalStateException("Required value was null.");
    }

    @Override // X.AnonymousClass884
    public final void FC1() {
        FAh();
    }

    @Override // X.AnonymousClass883
    public final void show() {
        C88X A01;
        E5t();
        FBj(1.0f);
        C88M c88m = this.A08;
        if (c88m != null && (A01 = c88m.A01()) != null) {
            if (A01.A04()) {
                A04(A01, this);
                return;
            }
            if (this.A0W.A03) {
                ProductItemWithAR productItemWithAR = A01.A06;
                if (productItemWithAR == null) {
                    return;
                }
                Eba(AbstractC38048Gob.A01(productItemWithAR.A01));
                return;
            }
            ESj(A01.A0G);
        }
    }
}
