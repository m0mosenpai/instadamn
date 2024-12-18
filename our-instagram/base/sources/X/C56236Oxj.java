package X;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.PointF;
import android.graphics.Rect;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.facebook.R;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.basic.SurfaceCropFilterModel;
import com.facebook.common.math.matrix.Matrix4;
import com.instagram.common.session.UserSession;
import com.instagram.creation.base.CropInfo;
import com.instagram.creation.base.PhotoSession;
import com.instagram.creation.base.ui.degreelabel.PillDegreeLabelManager;
import com.instagram.creation.base.ui.grid.GridLinesView;
import com.instagram.creation.base.ui.sliderview.RulerView;
import com.instagram.creation.base.ui.sliderview.SliderView;
import com.instagram.creation.photo.edit.effectfilter.PhotoFilter;
import com.instagram.creation.photo.edit.surfacecropfilter.SurfaceCropFilter;
import com.instagram.filterkit.filtergroup.model.intf.FilterGroupModel;

/* renamed from: X.Oxj, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C56236Oxj implements InterfaceC58189Pqv, XEM, InterfaceC57933Pmd {
    public View A00;
    public View A01;
    public ImageView A02;
    public InterfaceC58143Pq8 A03;
    public InterfaceC58143Pq8 A04;
    public InterfaceC58143Pq8 A05;
    public SliderView A06;
    public C54763OHu A07;
    public SurfaceCropFilter A08;
    public C8MA A09;
    public FilterGroupModel A0A;
    public C47Z A0B;
    public Integer A0C;
    public String A0D;
    public boolean A0E;
    public boolean A0F;
    public boolean A0G;
    public boolean A0H;
    public boolean A0I;
    public boolean A0J;
    public boolean A0K;
    public boolean A0L;
    public boolean A0M;
    public View A0N;
    public GridLinesView A0O;
    public GridLinesView A0P;
    public OM7 A0R;
    public final C55982hj A0V;
    public final C55982hj A0W;
    public final C55982hj A0X;
    public final C55942hf A0Y;
    public final C55942hf A0Z;
    public final C55952hg A0a;
    public final UserSession A0b;
    public final AnonymousClass841 A0c;
    public final float A0d;
    public final U7F A0f;
    public final String A0g;
    public final boolean A0h;
    public final SurfaceCropFilterModel.FullTransform A0U = new SurfaceCropFilterModel.FullTransform();
    public final SurfaceCropFilterModel.FullTransform A0e = new SurfaceCropFilterModel.FullTransform();
    public EnumC53113NeQ A0Q = EnumC53113NeQ.A03;
    public final SurfaceCropFilterModel.FitTransformParams A0T = new SurfaceCropFilterModel.FitTransformParams();
    public final SurfaceCropFilterModel.FitTransformParams A0S = new SurfaceCropFilterModel.FitTransformParams();

    @Override // X.InterfaceC58189Pqv
    public final void Cvt(boolean z) {
        boolean z2 = false;
        A04(false);
        SurfaceCropFilter surfaceCropFilter = this.A08;
        if (surfaceCropFilter != null) {
            if (!z) {
                surfaceCropFilter.A0O(this.A0e);
            } else {
                SurfaceCropFilterModel.FitTransformParams fitTransformParams = this.A0S;
                if (surfaceCropFilter.A0Q(fitTransformParams)) {
                    this.A08.A0M(fitTransformParams);
                }
                try {
                    this.A08.A0C(true);
                } catch (IllegalStateException e) {
                    AbstractC12120kG.A0H("Adjust tool exception", e);
                    this.A08.A0O(this.A0e);
                }
            }
        }
        FilterGroupModel filterGroupModel = this.A0A;
        filterGroupModel.getClass();
        filterGroupModel.EUV(5, this.A0L);
        FilterGroupModel filterGroupModel2 = this.A0A;
        filterGroupModel2.EUV(10, this.A0J);
        filterGroupModel2.EUV(9, this.A0K);
        filterGroupModel2.EUV(13, this.A0E);
        filterGroupModel2.EUV(17, this.A0G);
        boolean z3 = this.A0M;
        filterGroupModel2.EUV(19, z3);
        filterGroupModel2.EUV(21, z3);
        filterGroupModel2.EUV(22, this.A0F);
        A03(this);
        SurfaceCropFilter surfaceCropFilter2 = this.A08;
        if (surfaceCropFilter2 != null) {
            SurfaceCropFilterModel.FullTransform fullTransform = surfaceCropFilter2.A00.A06;
            if (fullTransform.A03 != 0.0f || fullTransform.A04 != 0.0f || fullTransform.A05 != 0.0f) {
                z2 = true;
            }
        }
        View view = this.A0N;
        if (view instanceof C44428Jkf) {
            ((C44428Jkf) view).setChecked(z2);
        } else {
            view.getClass();
            view.setSelected(z2);
        }
        GridLinesView gridLinesView = this.A0P;
        if (gridLinesView != null) {
            gridLinesView.setVisibility(8);
            this.A0P.A01 = null;
            this.A0P = null;
        }
        GridLinesView gridLinesView2 = this.A0O;
        if (gridLinesView2 != null) {
            gridLinesView2.setVisibility(8);
            this.A0O.A01 = null;
            this.A0O = null;
        }
        ImageView imageView = this.A02;
        imageView.getClass();
        imageView.setVisibility(8);
        this.A02 = null;
        InterfaceC58143Pq8 interfaceC58143Pq8 = this.A03;
        if (interfaceC58143Pq8 != null) {
            interfaceC58143Pq8.hide();
            this.A03 = null;
        }
        InterfaceC58143Pq8 interfaceC58143Pq82 = this.A04;
        if (interfaceC58143Pq82 != null) {
            interfaceC58143Pq82.hide();
            this.A04 = null;
        }
        InterfaceC58143Pq8 interfaceC58143Pq83 = this.A05;
        interfaceC58143Pq83.getClass();
        interfaceC58143Pq83.hide();
        this.A05 = null;
        this.A0f.A02();
        this.A0a.A04.clear();
        this.A0N = null;
        this.A06 = null;
        if (!this.A0I) {
            this.A01 = null;
            this.A09 = null;
            this.A08 = null;
            this.A0A = null;
        }
    }

    @Override // X.XEM
    public final void Du1(boolean z) {
    }

    @Override // X.InterfaceC58189Pqv
    public final /* synthetic */ void onPause() {
    }

    @Override // X.InterfaceC58189Pqv
    public final /* synthetic */ void onResume() {
    }

    private void A01() {
        SurfaceCropFilter surfaceCropFilter = this.A08;
        if (surfaceCropFilter != null) {
            SurfaceCropFilterModel.FitTransformParams fitTransformParams = this.A0S;
            boolean A0Q = surfaceCropFilter.A0Q(fitTransformParams);
            this.A0H = A0Q;
            if (A0Q) {
                SurfaceCropFilter surfaceCropFilter2 = this.A08;
                SurfaceCropFilterModel.FitTransformParams fitTransformParams2 = this.A0T;
                surfaceCropFilter2.A0L(fitTransformParams2);
                float f = (fitTransformParams.A02 + fitTransformParams2.A02) / 2.0f;
                fitTransformParams.A02 = f;
                float f2 = fitTransformParams2.A00;
                double d = 4.0f / f;
                fitTransformParams.A00 = fitTransformParams.A00 + LHK.A00(f2 - r5, d);
                float f3 = fitTransformParams2.A01;
                fitTransformParams.A01 = fitTransformParams.A01 + LHK.A00(f3 - r2, d);
                this.A08.A0M(fitTransformParams);
            }
        }
    }

    private void A02(EnumC53113NeQ enumC53113NeQ) {
        GridLinesView gridLinesView = this.A0P;
        int i = 0;
        if (gridLinesView != null) {
            int i2 = 8;
            if (enumC53113NeQ == EnumC53113NeQ.A03) {
                i2 = 0;
            }
            gridLinesView.setVisibility(i2);
        }
        GridLinesView gridLinesView2 = this.A0O;
        if (gridLinesView2 != null) {
            if (enumC53113NeQ != EnumC53113NeQ.A02) {
                i = 8;
            }
            gridLinesView2.setVisibility(i);
        }
    }

    public static void A03(C56236Oxj c56236Oxj) {
        C8MA c8ma = c56236Oxj.A09;
        c8ma.getClass();
        c8ma.EGV();
    }

    private void A04(boolean z) {
        if (this.A00 != null) {
            if (z) {
                InterfaceC19610xo A0w = AbstractC166987dD.A0w(AbstractC23021Ah.A00(this.A0b));
                A0w.E77("show_adjust_crop_nux", true);
                A0w.apply();
            }
            AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
            alphaAnimation.setDuration(300L);
            alphaAnimation.setAnimationListener(new WOU(0, this, this.A00));
            this.A00.startAnimation(alphaAnimation);
            this.A00 = null;
        }
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [X.OxZ, java.lang.Object, X.Pq8] */
    @Override // X.InterfaceC58189Pqv
    public final View Aa0(Context context) {
        final ViewGroup viewGroup;
        boolean z = this.A0h;
        LayoutInflater from = LayoutInflater.from(context);
        if (z) {
            viewGroup = (ViewGroup) from.inflate(R.layout.adjust_layout, (ViewGroup) null, false);
            RulerView rulerView = (RulerView) viewGroup.requireViewById(R.id.angle_ruler_view);
            rulerView.A01 = 0.3f;
            rulerView.A00 = 0.3f;
            rulerView.A07 = 1;
            ImageView imageView = (ImageView) ((Activity) AbstractC13320mI.A01(context, Activity.class)).requireViewById(R.id.actionbar_rotate90_button);
            this.A02 = imageView;
            imageView.setImageResource(R.drawable.straighten_glyph_rotate);
            Integer num = C05F.A00;
            PillDegreeLabelManager pillDegreeLabelManager = (PillDegreeLabelManager) viewGroup.requireViewById(R.id.rotate_x_container);
            ViewOnClickListenerC55465OkK.A01(pillDegreeLabelManager, 1, this, num);
            pillDegreeLabelManager.setDegreeLabelResource(R.drawable.perspectivey_icon);
            pillDegreeLabelManager.setDegree(A00(this, num));
            pillDegreeLabelManager.show();
            this.A03 = pillDegreeLabelManager;
            Integer num2 = C05F.A0C;
            PillDegreeLabelManager pillDegreeLabelManager2 = (PillDegreeLabelManager) viewGroup.requireViewById(R.id.rotate_z_container);
            ViewOnClickListenerC55465OkK.A01(pillDegreeLabelManager2, 1, this, num2);
            pillDegreeLabelManager2.setDegreeLabelResource(R.drawable.rotation_icon);
            pillDegreeLabelManager2.setDegree(A00(this, num2));
            pillDegreeLabelManager2.show();
            this.A05 = pillDegreeLabelManager2;
            Integer num3 = C05F.A01;
            PillDegreeLabelManager pillDegreeLabelManager3 = (PillDegreeLabelManager) viewGroup.requireViewById(R.id.rotate_y_container);
            ViewOnClickListenerC55465OkK.A01(pillDegreeLabelManager3, 1, this, num3);
            pillDegreeLabelManager3.setDegreeLabelResource(R.drawable.perspectivex_icon);
            pillDegreeLabelManager3.setDegree(A00(this, num3));
            pillDegreeLabelManager3.show();
            this.A04 = pillDegreeLabelManager3;
            this.A0C = num2;
            InterfaceC58143Pq8 interfaceC58143Pq8 = this.A05;
            interfaceC58143Pq8.getClass();
            interfaceC58143Pq8.setSelected(true);
            InterfaceC58143Pq8 interfaceC58143Pq82 = this.A03;
            interfaceC58143Pq82.getClass();
            interfaceC58143Pq82.setSelected(false);
            InterfaceC58143Pq8 interfaceC58143Pq83 = this.A04;
            interfaceC58143Pq83.getClass();
            interfaceC58143Pq83.setSelected(false);
        } else {
            viewGroup = (ViewGroup) from.inflate(R.layout.sliderview_whiteout_layout, (ViewGroup) null, false);
            RulerView rulerView2 = (RulerView) viewGroup.requireViewById(R.id.angle_ruler_view);
            rulerView2.A01 = 0.3f;
            rulerView2.A00 = 0.3f;
            rulerView2.A07 = 1;
            View view = this.A01;
            view.getClass();
            this.A02 = AbstractC31173DnH.A0I(view, R.id.filter_preview_rotate90_button);
            LinearLayout linearLayout = (LinearLayout) this.A01.requireViewById(R.id.degree_label_container);
            ?? obj = new Object();
            obj.A01 = linearLayout;
            obj.A02 = (TextView) linearLayout.getChildAt(0);
            obj.A00 = obj.A01.getChildAt(1);
            obj.A03 = true;
            obj.setDegree(0.0f);
            this.A05 = obj;
            ViewOnClickListenerC55462OkH viewOnClickListenerC55462OkH = new ViewOnClickListenerC55462OkH(this, 24);
            C0fQ.A00(viewOnClickListenerC55462OkH, obj.A00);
            C0fQ.A00(viewOnClickListenerC55462OkH, obj.A02);
            this.A05.show();
        }
        ImageView imageView2 = this.A02;
        imageView2.getClass();
        ViewOnClickListenerC55462OkH.A01(imageView2, 23, this);
        this.A02.setVisibility(0);
        SliderView sliderView = (SliderView) viewGroup.requireViewById(R.id.photo_sliderview);
        this.A06 = sliderView;
        sliderView.A05 = new C56244Oxr(this);
        this.A0C = C05F.A0C;
        float f = this.A0e.A05;
        if (f != 0.0f) {
            sliderView.A02(false, f);
        } else {
            sliderView.A02(true, this.A0d);
        }
        viewGroup.post(new Runnable() { // from class: X.PMN
            @Override // java.lang.Runnable
            public final void run() {
                viewGroup.requestLayout();
            }
        });
        return viewGroup;
    }

    @Override // X.InterfaceC58189Pqv
    public final boolean CJr(View view, MotionEvent motionEvent) {
        return this.A0f.onTouch(view, motionEvent);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0031, code lost:
    
        if (r0 != 0.0f) goto L22;
     */
    @Override // X.InterfaceC58189Pqv
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean COQ(X.C44428Jkf r5, com.instagram.filterkit.filtergroup.model.intf.FilterGroupModel r6) {
        /*
            r4 = this;
            java.lang.String r0 = "AdjustController_initializeTile()"
            com.instagram.creation.photo.edit.surfacecropfilter.SurfaceCropFilter r3 = X.A0R.A00(r6, r0)
            r2 = 0
            if (r3 == 0) goto L37
            monitor-enter(r3)
            com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.basic.SurfaceCropFilterModel r0 = r3.A00     // Catch: java.lang.Throwable -> L2a
            com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.basic.SurfaceCropFilterModel$FullTransform r0 = r0.A06     // Catch: java.lang.Throwable -> L2a
            float r0 = r0.A03     // Catch: java.lang.Throwable -> L2a
            monitor-exit(r3)
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L33
            monitor-enter(r3)
            com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.basic.SurfaceCropFilterModel r0 = r3.A00     // Catch: java.lang.Throwable -> L2a
            com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.basic.SurfaceCropFilterModel$FullTransform r0 = r0.A06     // Catch: java.lang.Throwable -> L2a
            float r0 = r0.A05     // Catch: java.lang.Throwable -> L2a
            monitor-exit(r3)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L33
            monitor-enter(r3)
            com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.basic.SurfaceCropFilterModel r0 = r3.A00     // Catch: java.lang.Throwable -> L2a
            com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.basic.SurfaceCropFilterModel$FullTransform r0 = r0.A06     // Catch: java.lang.Throwable -> L2a
            float r0 = r0.A04     // Catch: java.lang.Throwable -> L2a
            goto L2d
        L2a:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        L2d:
            monitor-exit(r3)
            int r1 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            r0 = 0
            if (r1 == 0) goto L34
        L33:
            r0 = 1
        L34:
            r5.setChecked(r0)
        L37:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C56236Oxj.COQ(X.Jkf, com.instagram.filterkit.filtergroup.model.intf.FilterGroupModel):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0015, code lost:
    
        if (r0.A0Q(r15) == false) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x002d, code lost:
    
        if (java.lang.Math.abs(r21) < 0.001d) goto L10;
     */
    @Override // X.XEM
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void DJE(float r20, float r21) {
        /*
            Method dump skipped, instructions count: 369
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C56236Oxj.DJE(float, float):void");
    }

    @Override // X.XEM
    public final void DJI() {
        this.A0a.A04.clear();
        this.A0H = false;
    }

    @Override // X.XEM
    public final void DU9(float f, float f2, float f3, float f4, float f5, float f6) {
        Pair pair;
        OM7 om7;
        Integer num;
        SurfaceCropFilter surfaceCropFilter;
        View view = this.A01;
        if (view != null && view.getParent() != null) {
            this.A01.getParent().requestDisallowInterceptTouchEvent(true);
        }
        if (this.A08 != null) {
            if (f5 != 1.0f || f3 != 0.0f || f4 != 0.0f) {
                if (f5 != 1.0f) {
                    A04(true);
                }
                if (this.A0H && (surfaceCropFilter = this.A08) != null) {
                    surfaceCropFilter.A0N(this.A0T, false);
                }
                View view2 = this.A01;
                view2.getClass();
                float A07 = f / AbstractC166987dD.A07(view2);
                float A00 = MSX.A00(f2, this.A01);
                SurfaceCropFilter surfaceCropFilter2 = this.A08;
                synchronized (surfaceCropFilter2) {
                    SurfaceCropFilterModel surfaceCropFilterModel = surfaceCropFilter2.A00;
                    Matrix4 matrix4 = surfaceCropFilterModel.A07;
                    SurfaceCropFilterModel.FullTransform fullTransform = surfaceCropFilterModel.A06;
                    PointF A01 = SurfaceCropFilter.A01(matrix4, fullTransform.A01, fullTransform.A02);
                    float f7 = (A07 - 0.5f) * 2.0f;
                    float f8 = (-(A00 - 0.5f)) * 2.0f;
                    float f9 = A01.x;
                    SurfaceCropFilterModel surfaceCropFilterModel2 = surfaceCropFilter2.A00;
                    SurfaceCropFilterModel.FullTransform fullTransform2 = surfaceCropFilterModel2.A06;
                    float f10 = fullTransform2.A06;
                    float f11 = f9 + (f7 / f10);
                    float f12 = A01.y + (f8 / f10);
                    float f13 = f10 * f5;
                    fullTransform2.A06 = f13;
                    float f14 = f11 - (f7 / f13);
                    A01.x = f14;
                    float f15 = f12 - (f8 / f13);
                    A01.y = f15;
                    PointF A02 = SurfaceCropFilter.A02(surfaceCropFilter2, f14, f15);
                    SurfaceCropFilter.A09(surfaceCropFilter2, A02.x, A02.y);
                    SurfaceCropFilter.A08(surfaceCropFilter2);
                    pair = new Pair(A02, Float.valueOf(surfaceCropFilterModel2.A06.A06));
                }
                String str = this.A0D;
                if (str != null) {
                    this.A0c.AAI((PointF) pair.first, str, AbstractC166987dD.A09(pair.second));
                }
                this.A08.A0D(f3 / AbstractC166987dD.A07(this.A01), MSX.A00(f4, this.A01));
                A01();
                A03(this);
                if (f3 > 0.0f && f4 > 0.0f && (om7 = this.A0R) != null) {
                    Integer num2 = om7.A04;
                    num = C05F.A01;
                    if (num2 != num) {
                        AnonymousClass229.A01(om7.A07).A28(false);
                    } else {
                        return;
                    }
                } else if (f3 < 0.0f && f4 < 0.0f && (om7 = this.A0R) != null) {
                    Integer num3 = om7.A04;
                    num = C05F.A00;
                    if (num3 != num) {
                        AnonymousClass229.A01(om7.A07).A28(true);
                    } else {
                        return;
                    }
                } else {
                    return;
                }
                om7.A04 = num;
            }
        }
    }

    @Override // X.InterfaceC58189Pqv
    public final boolean DkF(View view, ViewGroup viewGroup, C8MA c8ma, FilterGroupModel filterGroupModel) {
        this.A0N = view;
        this.A0A = filterGroupModel;
        this.A09 = c8ma;
        SurfaceCropFilter A00 = A0R.A00(filterGroupModel, "AdjustControlleronSelect()");
        this.A08 = A00;
        if (A00 != null) {
            SurfaceCropFilterModel.FullTransform fullTransform = this.A0U;
            synchronized (A00) {
                fullTransform.A01(A00.A00.A06);
            }
        }
        this.A0e.A01(this.A0U);
        this.A01 = viewGroup;
        this.A0P = (GridLinesView) viewGroup.requireViewById(R.id.straighten_grid_overlay_3);
        this.A0O = (GridLinesView) viewGroup.requireViewById(R.id.straighten_grid_overlay_6);
        GridLinesView gridLinesView = this.A0P;
        if (gridLinesView.getWidth() == 0 && gridLinesView.getHeight() == 0) {
            gridLinesView.A01 = this;
        } else {
            Dms(gridLinesView, gridLinesView.getWidth(), gridLinesView.getHeight());
        }
        GridLinesView gridLinesView2 = this.A0O;
        if (gridLinesView2.getWidth() == 0 && gridLinesView2.getHeight() == 0) {
            gridLinesView2.A01 = this;
        } else {
            Dms(gridLinesView2, gridLinesView2.getWidth(), gridLinesView2.getHeight());
        }
        A02(this.A0Q);
        FilterGroupModel filterGroupModel2 = this.A0A;
        this.A0L = filterGroupModel2.CUm(5);
        this.A0J = filterGroupModel2.CUm(10);
        this.A0K = filterGroupModel2.CUm(9);
        this.A0E = filterGroupModel2.CUm(13);
        this.A0G = filterGroupModel2.CUm(17);
        this.A0M = filterGroupModel2.CUm(19);
        this.A0F = filterGroupModel2.CUm(22);
        if (!AbstractC166987dD.A0x(this.A0b).getBoolean("show_adjust_crop_nux", false)) {
            View view2 = this.A01;
            ViewGroup viewGroup2 = (ViewGroup) view2;
            view2.getClass();
            this.A00 = AbstractC25228BEl.A0P(view2).inflate(R.layout.adjust_crop_nux, viewGroup2, false);
            viewGroup2.getClass();
            viewGroup2.addView(this.A00);
            AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
            alphaAnimation.setDuration(300L);
            this.A00.startAnimation(alphaAnimation);
        }
        FilterGroupModel filterGroupModel3 = this.A0A;
        filterGroupModel3.getClass();
        filterGroupModel3.EUV(5, false);
        FilterGroupModel filterGroupModel4 = this.A0A;
        filterGroupModel4.EUV(10, false);
        filterGroupModel4.EUV(9, false);
        filterGroupModel4.EUV(13, false);
        filterGroupModel4.EUV(17, false);
        filterGroupModel4.EUV(19, false);
        filterGroupModel4.EUV(21, false);
        filterGroupModel4.EUV(22, false);
        this.A09.EGV();
        return true;
    }

    @Override // X.XEM
    public final void Dma(float f, float f2) {
        EnumC53113NeQ enumC53113NeQ;
        EnumC53113NeQ enumC53113NeQ2 = this.A0Q;
        if (enumC53113NeQ2 instanceof NHH) {
            enumC53113NeQ = (EnumC53113NeQ) AbstractC009903n.A05(EnumC53113NeQ.values());
        } else {
            enumC53113NeQ = EnumC53113NeQ.values()[enumC53113NeQ2.ordinal() + 1];
        }
        this.A0Q = enumC53113NeQ;
        A02(enumC53113NeQ);
    }

    @Override // X.XEM
    public final void Dmp(float f, float f2, float f3, float f4) {
        C53613NnK c53613NnK;
        SurfaceCropFilter surfaceCropFilter = this.A08;
        if (surfaceCropFilter != null) {
            if (f3 != 0.0f || f4 != 0.0f) {
                if (this.A0H) {
                    surfaceCropFilter.A0N(this.A0T, false);
                }
                View view = this.A01;
                view.getClass();
                PointF A0D = this.A08.A0D(f3 / AbstractC166987dD.A07(view), MSX.A00(f4, this.A01));
                String str = this.A0D;
                if (str != null && (c53613NnK = (C53613NnK) ((MX5) this.A0c).A01.A0R.get(str)) != null) {
                    c53613NnK.A01 = A0D;
                }
                A01();
                A03(this);
            }
        }
    }

    @Override // X.InterfaceC58189Pqv
    public final String getTitle() {
        return this.A0g;
    }

    public C56236Oxj(Resources resources, UserSession userSession, AnonymousClass841 anonymousClass841, OM7 om7, float f, boolean z) {
        this.A0b = userSession;
        this.A0c = anonymousClass841;
        this.A0g = resources.getString(2131952479);
        this.A0d = f;
        this.A0h = z;
        this.A0R = om7;
        U7F u7f = new U7F();
        this.A0f = u7f;
        u7f.A02 = this;
        C55952hg A00 = AbstractC13560mi.A00();
        this.A0a = A00;
        C55942hf A04 = C55942hf.A04(30.0d, 9.0d);
        this.A0Y = A04;
        this.A0Z = C55942hf.A04(0.0d, 1.5d);
        C55982hj A02 = A00.A02();
        this.A0X = A02;
        A02.A09(A04);
        C55982hj A022 = A00.A02();
        A022.A00 = 0.001d;
        A022.A02 = 0.001d;
        this.A0V = A022;
        C55982hj A023 = A00.A02();
        A023.A00 = 0.001d;
        A023.A02 = 0.001d;
        this.A0W = A023;
    }

    public static float A00(C56236Oxj c56236Oxj, Integer num) {
        int intValue = num.intValue();
        if (intValue != 0) {
            SurfaceCropFilterModel.FullTransform fullTransform = c56236Oxj.A0U;
            if (intValue != 1) {
                return fullTransform.A05;
            }
            return fullTransform.A04;
        }
        return c56236Oxj.A0U.A03;
    }

    @Override // X.InterfaceC57933Pmd
    public final void Dms(GridLinesView gridLinesView, int i, int i2) {
        CropInfo cropInfo;
        float height;
        int width;
        Rect A0V;
        AnonymousClass841 A0Q = AbstractC43594JPz.A0Q(AbstractC13320mI.A01(gridLinesView.getContext(), InterfaceC189608af.class));
        int ATe = A0Q.ATe();
        PhotoSession A02 = ((MX5) A0Q).A01.A02();
        if (A02 != null && (cropInfo = A02.A05) != null) {
            int i3 = ATe % 180;
            Rect rect = cropInfo.A02;
            if (i3 == 0) {
                height = rect.width();
                width = rect.height();
            } else {
                height = rect.height();
                width = rect.width();
            }
            float f = height / width;
            float f2 = i;
            float f3 = i2;
            if (f2 / f3 <= f) {
                int i4 = (int) ((i2 - r1) / 2.0f);
                A0V = AbstractC166987dD.A0V(0, i4, i, ((int) ((f2 / f) + 0.5f)) + i4);
            } else {
                int i5 = (int) ((i - r1) / 2.0f);
                A0V = AbstractC166987dD.A0V(i5, 0, ((int) ((f3 * f) + 0.5f)) + i5, i2);
            }
            gridLinesView.setGridlinesRect(A0V);
            gridLinesView.A01 = null;
        }
    }

    @Override // X.InterfaceC58189Pqv
    public final /* synthetic */ boolean COP(C44428Jkf c44428Jkf, PhotoFilter photoFilter) {
        return false;
    }
}
