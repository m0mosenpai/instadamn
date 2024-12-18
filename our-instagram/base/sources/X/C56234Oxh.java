package X;

import android.app.Activity;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.R;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.TypedParameterMap;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.ValueMapFilterModel;
import com.instagram.common.session.UserSession;
import com.instagram.creation.photo.edit.effectfilter.PhotoFilter;
import com.instagram.creation.photo.edit.tint.IgTintColorPicker;
import com.instagram.filterkit.filtergroup.model.intf.FilterGroupModel;
import com.instagram.ui.igeditseekbar.IgEditSeekBar;
import java.util.Map;

/* renamed from: X.Oxh, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C56234Oxh implements InterfaceC58189Pqv {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public View A08;
    public View A09;
    public View A0A;
    public TextView A0B;
    public TextView A0C;
    public C55982hj A0D;
    public IgTintColorPicker A0E;
    public C8MA A0F;
    public FilterGroupModel A0G;
    public IgEditSeekBar A0H;
    public Float A0I;
    public boolean A0J = true;
    public boolean A0K;
    public boolean A0L;
    public boolean A0M;
    public int A0N;
    public int A0O;
    public int A0P;
    public int A0Q;
    public View A0R;
    public View A0S;
    public View A0T;
    public ViewGroup A0U;
    public ValueMapFilterModel A0V;
    public C55952hg A0W;
    public C44428Jkf A0X;
    public final UserSession A0Y;

    public C56234Oxh(UserSession userSession) {
        this.A0Y = userSession;
    }

    @Override // X.InterfaceC58189Pqv
    public final View Aa0(Context context) {
        ViewGroup viewGroup = (ViewGroup) AbstractC31175DnJ.A07(AbstractC31172DnG.A09(context), null, R.layout.tint_adjust_layout, false);
        this.A0K = AbstractC43841Ja4.A04(context);
        View A0S = AbstractC166997dE.A0S(viewGroup, R.id.tint_type_adjust);
        this.A0S = A0S;
        A0S.setVisibility(0);
        TextView A0N = AbstractC167007dF.A0N(viewGroup, R.id.adjust_shadows_title);
        this.A0C = A0N;
        ViewOnClickListenerC55462OkH.A01(A0N, 25, this);
        TextView A0N2 = AbstractC167007dF.A0N(viewGroup, R.id.adjust_highlights_title);
        this.A0B = A0N2;
        ViewOnClickListenerC55462OkH.A01(A0N2, 26, this);
        View findViewById = ((Activity) AbstractC13320mI.A01(context, Activity.class)).findViewById(R.id.primary_accept_buttons);
        this.A08 = findViewById;
        if (findViewById != null) {
            findViewById.bringToFront();
            View findViewById2 = ((Activity) AbstractC13320mI.A01(context, Activity.class)).findViewById(R.id.secondary_accept_buttons);
            if (findViewById2 != null) {
                this.A0A = findViewById2;
                if (!this.A0K) {
                    AbstractC167007dF.A0N(findViewById2, R.id.adjust_title).setText(2131974777);
                }
                View A0S2 = AbstractC166997dE.A0S(findViewById2, R.id.button_accept_adjust);
                this.A0R = A0S2;
                ViewOnClickListenerC55462OkH.A01(A0S2, 27, this);
                View A0S3 = AbstractC166997dE.A0S(findViewById2, R.id.button_cancel_adjust);
                this.A0T = A0S3;
                ViewOnClickListenerC55462OkH.A01(A0S3, 28, this);
                View A0S4 = AbstractC166997dE.A0S(viewGroup, R.id.primary_tint_adjustment_view);
                this.A09 = A0S4;
                A0S4.bringToFront();
                C14360o3.A07(viewGroup.requireViewById(R.id.tint_picker_container));
                IgTintColorPicker igTintColorPicker = (IgTintColorPicker) AbstractC166997dE.A0R(viewGroup, R.id.tint_picker);
                this.A0E = igTintColorPicker;
                igTintColorPicker.setCurrentColor(this.A06);
                igTintColorPicker.setOnTintColorChangeListener(new P0B(this));
                TextView A0e = AbstractC166987dD.A0e(viewGroup, R.id.nux_tap_again_to_adjust);
                if (A0e != null) {
                    igTintColorPicker.A02 = A0e;
                    C14360o3.A07(viewGroup.requireViewById(R.id.tint_slider_container));
                    IgEditSeekBar igEditSeekBar = (IgEditSeekBar) AbstractC166997dE.A0R(viewGroup, R.id.tint_slider);
                    this.A0H = igEditSeekBar;
                    ((AbstractC66357UBy) igEditSeekBar).A01 = 0.0f;
                    ((AbstractC66357UBy) igEditSeekBar).A02 = 100;
                    igEditSeekBar.setCurrentValue(this.A05);
                    C56782PHz.A01(igEditSeekBar, this, 8);
                    C55952hg A00 = AbstractC13560mi.A00();
                    this.A0W = A00;
                    C55942hf A04 = C55942hf.A04(30.0d, 4.0d);
                    C55982hj A02 = A00.A02();
                    this.A0D = A02;
                    if (this.A0I != null) {
                        A02.A08(r0.floatValue(), true);
                    }
                    A02.A09(A04);
                    A02.A0A(new Ut2(this, 3));
                    A02.A06 = true;
                    this.A07 = context.getColor(R.color.grey_5);
                    this.A04 = context.getColor(R.color.badge_color);
                    this.A0Q = this.A06;
                    this.A0O = this.A01;
                    int i = this.A05;
                    this.A0P = i;
                    int i2 = this.A00;
                    this.A0N = i2;
                    this.A03 = i;
                    this.A02 = i2;
                    viewGroup.post(new PMP(viewGroup));
                    return viewGroup;
                }
                throw AbstractC166987dD.A14("Required value was null.");
            }
            throw AbstractC166987dD.A14("Required value was null.");
        }
        throw AbstractC166987dD.A14("Required value was null.");
    }

    @Override // X.InterfaceC58189Pqv
    public final boolean CJr(View view, MotionEvent motionEvent) {
        C8MA c8ma;
        C14360o3.A0B(motionEvent, 1);
        if (motionEvent.getAction() == 0) {
            this.A0M = true;
            FilterGroupModel filterGroupModel = this.A0G;
            if (filterGroupModel != null) {
                ValueMapFilterModel A00 = OXt.A00(filterGroupModel);
                if (A00 != null) {
                    A00.A00("tint_shadows_intensity", 0.0f);
                    A00.A00("tint_highlights_intensity", 0.0f);
                    float[] fArr = EnumC53258Ngw.A06.A01;
                    C14360o3.A07(fArr);
                    A00.A03("tint_shadows_color", fArr);
                    A00.A03("tint_highlights_color", fArr);
                    c8ma = this.A0F;
                    if (c8ma == null) {
                        throw AbstractC166987dD.A14("Required value was null.");
                    }
                } else {
                    throw AbstractC166987dD.A14("Required value was null.");
                }
            } else {
                throw AbstractC166987dD.A14("Required value was null.");
            }
        } else {
            if (motionEvent.getAction() == 1) {
                this.A0M = false;
                A00(this);
                c8ma = this.A0F;
                if (c8ma == null) {
                    throw AbstractC166987dD.A14("Required value was null.");
                }
            }
            return true;
        }
        c8ma.EGV();
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x002d, code lost:
    
        if (X.AbstractC55164OdS.A02(r1) != r2) goto L8;
     */
    @Override // X.InterfaceC58189Pqv
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean COQ(X.C44428Jkf r5, com.instagram.filterkit.filtergroup.model.intf.FilterGroupModel r6) {
        /*
            r4 = this;
            r3 = 0
            X.AbstractC167007dF.A1K(r5, r6)
            com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.ValueMapFilterModel r0 = X.OXt.A00(r6)
            if (r0 == 0) goto L34
            r4.A0V = r0
            com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.TypedParameterMap r0 = r0.A01
            java.util.Map r1 = r0.A01
            java.lang.String r0 = "tint_shadows_color"
            java.lang.Object r2 = r1.get(r0)
            float[] r2 = (float[]) r2
            java.lang.String r0 = "tint_highlights_color"
            java.lang.Object r1 = r1.get(r0)
            float[] r1 = (float[]) r1
            X.Ngw r0 = X.AbstractC55164OdS.A01(r2)
            X.Ngw r2 = X.EnumC53258Ngw.A06
            if (r0 != r2) goto L2f
            X.Ngw r1 = X.AbstractC55164OdS.A02(r1)
            r0 = 0
            if (r1 == r2) goto L30
        L2f:
            r0 = 1
        L30:
            r5.setChecked(r0)
            return r3
        L34:
            java.lang.IllegalStateException r0 = X.AbstractC166997dE.A0g()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C56234Oxh.COQ(X.Jkf, com.instagram.filterkit.filtergroup.model.intf.FilterGroupModel):boolean");
    }

    @Override // X.InterfaceC58189Pqv
    public final boolean DkF(View view, ViewGroup viewGroup, C8MA c8ma, FilterGroupModel filterGroupModel) {
        C14360o3.A0B(view, 0);
        AbstractC25233BEq.A0v(1, viewGroup, filterGroupModel, c8ma);
        this.A0X = (C44428Jkf) view;
        this.A0U = viewGroup;
        this.A0G = filterGroupModel;
        ViewTreeObserverOnGlobalLayoutListenerC55502Okv.A00(viewGroup.getViewTreeObserver(), viewGroup, this, 4);
        ValueMapFilterModel A00 = OXt.A00(filterGroupModel);
        if (A00 != null) {
            TypedParameterMap typedParameterMap = A00.A01;
            Map map = typedParameterMap.A02;
            Object obj = map.get("tint_shadows_intensity");
            if (obj != null) {
                this.A05 = (int) (AbstractC166987dD.A09(obj) * 100.0f);
                Object obj2 = map.get("tint_highlights_intensity");
                if (obj2 != null) {
                    this.A00 = (int) (100.0f * AbstractC166987dD.A09(obj2));
                    Map map2 = typedParameterMap.A01;
                    this.A06 = AbstractC55164OdS.A02((float[]) map2.get("tint_shadows_color")).ordinal();
                    this.A01 = AbstractC55164OdS.A02((float[]) map2.get("tint_highlights_color")).ordinal();
                    this.A0F = c8ma;
                    this.A0J = true;
                    TextView textView = this.A0B;
                    if (textView != null) {
                        textView.setTextColor(this.A07);
                    }
                    this.A0L = filterGroupModel.CUm(19);
                    A00(this);
                    c8ma.EGV();
                    return true;
                }
                throw AbstractC166987dD.A14("Required value was null.");
            }
            throw AbstractC166987dD.A14("Required value was null.");
        }
        throw AbstractC166987dD.A14("Required value was null.");
    }

    @Override // X.InterfaceC58189Pqv
    public final /* synthetic */ void onPause() {
    }

    @Override // X.InterfaceC58189Pqv
    public final /* synthetic */ void onResume() {
    }

    public static final void A00(C56234Oxh c56234Oxh) {
        FilterGroupModel filterGroupModel = c56234Oxh.A0G;
        if (filterGroupModel != null) {
            ValueMapFilterModel A00 = OXt.A00(filterGroupModel);
            if (A00 != null) {
                A00.A00("tint_shadows_intensity", c56234Oxh.A05 / 100.0f);
                A00.A00("tint_highlights_intensity", c56234Oxh.A00 / 100.0f);
                float[] fArr = MSW.A0Z(c56234Oxh.A06).A01;
                C14360o3.A07(fArr);
                A00.A03("tint_shadows_color", fArr);
                float[] fArr2 = EnumC53258Ngw.values()[c56234Oxh.A01].A00;
                C14360o3.A07(fArr2);
                A00.A03("tint_highlights_color", fArr2);
                FilterGroupModel filterGroupModel2 = c56234Oxh.A0G;
                if (filterGroupModel2 != null) {
                    filterGroupModel2.EUV(13, OXt.A02(A00));
                    return;
                }
                throw AbstractC166987dD.A14("Required value was null.");
            }
            throw AbstractC166987dD.A14("Required value was null.");
        }
        throw AbstractC166987dD.A14("Required value was null.");
    }

    public static final void A01(C56234Oxh c56234Oxh, int i) {
        float[] fArr;
        ValueMapFilterModel valueMapFilterModel;
        String str;
        if (c56234Oxh.A0J) {
            c56234Oxh.A06 = i;
            fArr = MSW.A0Z(i).A01;
            C14360o3.A07(fArr);
            valueMapFilterModel = c56234Oxh.A0V;
            if (valueMapFilterModel != null) {
                str = "tint_shadows_color";
            } else {
                throw AbstractC166987dD.A14("Required value was null.");
            }
        } else {
            c56234Oxh.A01 = i;
            fArr = MSW.A0Z(i).A00;
            C14360o3.A07(fArr);
            valueMapFilterModel = c56234Oxh.A0V;
            if (valueMapFilterModel != null) {
                str = "tint_highlights_color";
            } else {
                throw AbstractC166987dD.A14("Required value was null.");
            }
        }
        valueMapFilterModel.A03(str, fArr);
        C8MA c8ma = c56234Oxh.A0F;
        if (c8ma != null) {
            c8ma.EGV();
            return;
        }
        throw AbstractC166987dD.A14("Required value was null.");
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x002a, code lost:
    
        if (r4 > 0) goto L13;
     */
    @Override // X.InterfaceC58189Pqv
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Cvt(boolean r6) {
        /*
            r5 = this;
            if (r6 == 0) goto L72
            int r0 = r5.A06
            X.Ngw r1 = X.MSW.A0Z(r0)
            X.Ngw r0 = X.EnumC53258Ngw.A06
            if (r1 != r0) goto L12
            r0 = 50
            r5.A05 = r0
            r5.A0P = r0
        L12:
            int r4 = r5.A06
            r5.A0Q = r4
            int r2 = r5.A01
            r5.A0O = r2
            int r0 = r5.A05
            r5.A0P = r0
            int r0 = r5.A00
            r5.A0N = r0
        L22:
            X.Jkf r1 = r5.A0X
            if (r1 == 0) goto L83
            r3 = 0
            if (r2 > 0) goto L2c
            r0 = 0
            if (r4 <= 0) goto L2d
        L2c:
            r0 = 1
        L2d:
            r1.setChecked(r0)
            A00(r5)
            X.2hj r0 = r5.A0D
            r2 = 0
            if (r0 == 0) goto L3f
            java.util.concurrent.CopyOnWriteArraySet r0 = r0.A0D
            r0.clear()
            r5.A0D = r2
        L3f:
            r5.A0W = r2
            r5.A0U = r2
            android.view.View r0 = r5.A09
            if (r0 == 0) goto L4f
            r0.bringToFront()
            r0.setVisibility(r3)
            r5.A09 = r2
        L4f:
            android.view.View r1 = r5.A0A
            if (r1 == 0) goto L5a
            r0 = 8
            r1.setVisibility(r0)
            r5.A0A = r2
        L5a:
            android.view.View r0 = r5.A08
            if (r0 == 0) goto L63
            r0.setVisibility(r3)
            r5.A08 = r2
        L63:
            r5.A0R = r2
            r5.A0T = r2
            r5.A0S = r2
            r5.A0F = r2
            r5.A0G = r2
            r5.A0X = r2
            r5.A0H = r2
            return
        L72:
            int r4 = r5.A0Q
            r5.A06 = r4
            int r2 = r5.A0O
            r5.A01 = r2
            int r0 = r5.A0P
            r5.A05 = r0
            int r0 = r5.A0N
            r5.A00 = r0
            goto L22
        L83:
            java.lang.IllegalStateException r0 = X.AbstractC166997dE.A0g()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C56234Oxh.Cvt(boolean):void");
    }

    @Override // X.InterfaceC58189Pqv
    public final String getTitle() {
        C44428Jkf c44428Jkf = this.A0X;
        if (c44428Jkf != null) {
            InterfaceC50490MQs interfaceC50490MQs = c44428Jkf.A05.A01;
            C14360o3.A07(interfaceC50490MQs);
            String name = interfaceC50490MQs.getName();
            C14360o3.A07(name);
            return name;
        }
        throw AbstractC166997dE.A0g();
    }

    @Override // X.InterfaceC58189Pqv
    public final /* synthetic */ boolean COP(C44428Jkf c44428Jkf, PhotoFilter photoFilter) {
        return false;
    }
}
