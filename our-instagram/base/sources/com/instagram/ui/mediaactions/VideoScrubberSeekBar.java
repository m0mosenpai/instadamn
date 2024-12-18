package com.instagram.ui.mediaactions;

import X.AbstractC166987dD;
import X.C05F;
import X.C14360o3;
import X.C43750JWm;
import X.C45036JwR;
import X.InterfaceC09390do;
import X.JQ0;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.util.AttributeSet;
import android.view.View;
import android.widget.SeekBar;
import androidx.appcompat.widget.AppCompatSeekBar;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes8.dex */
public final class VideoScrubberSeekBar extends AppCompatSeekBar implements SeekBar.OnSeekBarChangeListener {
    public SeekBar.OnSeekBarChangeListener A00;
    public final C43750JWm A01;

    @Override // androidx.appcompat.widget.AppCompatSeekBar, android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final void onDraw(Canvas canvas) {
        float f;
        C14360o3.A0B(canvas, 0);
        C43750JWm c43750JWm = this.A01;
        List<C45036JwR> list = c43750JWm.A05;
        if ((!list.isEmpty()) && (!list.isEmpty())) {
            AppCompatSeekBar appCompatSeekBar = c43750JWm.A04;
            int measuredWidth = (appCompatSeekBar.getMeasuredWidth() - appCompatSeekBar.getPaddingLeft()) - appCompatSeekBar.getPaddingRight();
            Path path = c43750JWm.A03;
            path.reset();
            for (C45036JwR c45036JwR : list) {
                float paddingLeft = appCompatSeekBar.getPaddingLeft() + (measuredWidth * c45036JwR.A03);
                View view = (View) c45036JwR.A02.get();
                if (view != null) {
                    f = view.getScaleX();
                } else {
                    f = 1.0f;
                }
                InterfaceC09390do interfaceC09390do = c43750JWm.A0A;
                float floatValue = ((Number) interfaceC09390do.getValue()).floatValue() * f;
                InterfaceC09390do interfaceC09390do2 = c43750JWm.A0B;
                path.addCircle(paddingLeft, (appCompatSeekBar.getMeasuredHeight() - ((Number) interfaceC09390do.getValue()).floatValue()) + ((Number) interfaceC09390do2.getValue()).floatValue(), floatValue + ((Number) interfaceC09390do2.getValue()).floatValue(), Path.Direction.CCW);
            }
            canvas.clipOutPath(path);
        }
        super.onDraw(canvas);
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00cc A[LOOP:1: B:38:0x00c6->B:40:0x00cc, LOOP_END] */
    /* JADX WARN: Type inference failed for: r4v0, types: [boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void setupKeyFrameMarkersForAds(android.app.Activity r12, java.lang.String r13, java.util.List r14, java.lang.Long r15) {
        /*
            r11 = this;
            r3 = 0
            boolean r4 = X.AbstractC167007dF.A1R(r3, r12, r13)
            X.JWm r6 = r11.A01
            if (r14 == 0) goto Led
            boolean r0 = r14.isEmpty()
            if (r0 != 0) goto Led
            if (r15 == 0) goto Led
            long r0 = r15.longValue()
            r7 = 0
            int r2 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r2 <= 0) goto Led
            java.util.ArrayList r2 = X.AbstractC166987dD.A1E()
            java.util.Iterator r8 = r14.iterator()
        L23:
            boolean r5 = r8.hasNext()
            if (r5 == 0) goto L46
            java.lang.Object r5 = r8.next()
            X.JLC r5 = (X.JLC) r5
            java.lang.Integer r5 = r5.Bzr()
            if (r5 == 0) goto L23
            int r5 = r5.intValue()
            float r7 = (float) r5
            float r5 = (float) r0
            float r7 = r7 / r5
            java.lang.Float r5 = java.lang.Float.valueOf(r7)
            if (r5 == 0) goto L23
            r2.add(r5)
            goto L23
        L46:
            java.lang.StringBuilder r5 = X.AbstractC166987dD.A1C()
            java.lang.String r0 = "\n      setupAdKeyFrameMarkers:\n      clipId = "
            r5.append(r0)
            r5.append(r13)
            java.lang.String r0 = "\n      videoDurationMs = "
            r5.append(r0)
            r5.append(r15)
            java.lang.String r0 = "\n      videoHighlights = [\n          "
            r5.append(r0)
            java.lang.String r1 = ",\n          "
            r10 = 0
            X.JE7 r0 = X.JE7.A00
            java.lang.String r0 = X.AbstractC25226BEj.A1H(r1, r14, r0)
            r5.append(r0)
            java.lang.String r0 = "\n      ]\n      Computed markerLocations = "
            r5.append(r0)
            r5.append(r2)
            java.lang.String r0 = "\n      "
            java.lang.String r0 = X.AbstractC166997dE.A0x(r0, r5)
            X.AbstractC16490ru.A0p(r0)
            int r0 = r2.size()
            if (r0 < r4) goto Led
            r0 = 16908290(0x1020002, float:2.3877235E-38)
            android.view.View r0 = r12.findViewById(r0)
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            if (r0 == 0) goto L93
            android.view.View r1 = r0.getChildAt(r3)
            if (r1 != 0) goto L94
        L93:
            r1 = 0
        L94:
            r9 = 0
            if (r1 == 0) goto Laf
            r0 = 2131430148(0x7f0b0b04, float:1.8481989E38)
            android.view.View r0 = r1.findViewById(r0)
            android.widget.FrameLayout r0 = (android.widget.FrameLayout) r0
            if (r0 != 0) goto Lb8
            r0 = 2131430147(0x7f0b0b03, float:1.8481987E38)
            android.view.ViewStub r0 = X.AbstractC31171DnF.A07(r1, r0)
            if (r0 == 0) goto Laf
            android.view.View r9 = r0.inflate()
        Laf:
            boolean r0 = r9 instanceof com.instagram.common.ui.base.IgFrameLayout
            if (r0 == 0) goto Led
            android.widget.FrameLayout r9 = (android.widget.FrameLayout) r9
            if (r9 != 0) goto Lb9
            return
        Lb8:
            r9 = r0
        Lb9:
            java.util.List r8 = r6.A05
            r8.clear()
            java.util.ArrayList r7 = X.AbstractC167017dG.A0q(r2)
            java.util.Iterator r5 = r2.iterator()
        Lc6:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto Le7
            java.lang.Object r0 = r5.next()
            float r4 = X.AbstractC166987dD.A09(r0)
            java.lang.ref.WeakReference r3 = X.AbstractC25225BEi.A16(r10)
            java.lang.ref.WeakReference r2 = X.AbstractC25225BEi.A16(r10)
            java.lang.Integer r1 = X.C05F.A00
            X.JwR r0 = new X.JwR
            r0.<init>(r1, r3, r2, r4)
            r7.add(r0)
            goto Lc6
        Le7:
            r8.addAll(r7)
            X.C43750JWm.A00(r12, r9, r6, r13)
        Led:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.ui.mediaactions.VideoScrubberSeekBar.setupKeyFrameMarkersForAds(android.app.Activity, java.lang.String, java.util.List, java.lang.Long):void");
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        Object next;
        Integer num;
        InterfaceC09390do interfaceC09390do;
        SeekBar.OnSeekBarChangeListener onSeekBarChangeListener = this.A00;
        if (onSeekBarChangeListener != null) {
            onSeekBarChangeListener.onProgressChanged(seekBar, i, z);
        }
        C43750JWm c43750JWm = this.A01;
        List<C45036JwR> list = c43750JWm.A05;
        if (AbstractC166987dD.A1b(list)) {
            AppCompatSeekBar appCompatSeekBar = c43750JWm.A04;
            float max = i / appCompatSeekBar.getMax();
            if (z && !c43750JWm.A02 && i != c43750JWm.A00) {
                c43750JWm.A02 = true;
            }
            ArrayList A1E = AbstractC166987dD.A1E();
            for (Object obj : list) {
                if (((C45036JwR) obj).A03 <= max) {
                    A1E.add(obj);
                }
            }
            Iterator it = A1E.iterator();
            if (!it.hasNext()) {
                next = null;
            } else {
                next = it.next();
                if (it.hasNext()) {
                    float f = ((C45036JwR) next).A03;
                    do {
                        Object next2 = it.next();
                        float f2 = ((C45036JwR) next2).A03;
                        if (Float.compare(f, f2) < 0) {
                            next = next2;
                            f = f2;
                        }
                    } while (it.hasNext());
                }
            }
            C45036JwR c45036JwR = (C45036JwR) next;
            for (C45036JwR c45036JwR2 : list) {
                Integer num2 = c45036JwR2.A00;
                if (c45036JwR2.equals(c45036JwR) && c43750JWm.A02) {
                    num = C05F.A0C;
                } else if (c45036JwR2.A03 < max) {
                    num = C05F.A01;
                } else {
                    num = C05F.A00;
                }
                c45036JwR2.A00 = num;
                if (num != num2) {
                    int intValue = num.intValue();
                    if (intValue != 0) {
                        if (intValue != 1) {
                            interfaceC09390do = c43750JWm.A07;
                        } else {
                            interfaceC09390do = c43750JWm.A06;
                        }
                        C43750JWm.A02(c45036JwR2, c43750JWm, ((Number) interfaceC09390do.getValue()).intValue(), -1);
                    } else {
                        C43750JWm.A02(c45036JwR2, c43750JWm, ((Number) c43750JWm.A06.getValue()).intValue(), ((Number) c43750JWm.A09.getValue()).intValue());
                    }
                }
            }
            if (z) {
                if (c45036JwR != null) {
                    if (!c45036JwR.equals(c43750JWm.A01)) {
                        appCompatSeekBar.setHapticFeedbackEnabled(true);
                        appCompatSeekBar.performHapticFeedback(1);
                        c43750JWm.A01 = c45036JwR;
                        return;
                    } else if (c45036JwR.equals(c43750JWm.A01)) {
                        return;
                    }
                }
                c43750JWm.A01 = null;
            }
        }
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStartTrackingTouch(SeekBar seekBar) {
        SeekBar.OnSeekBarChangeListener onSeekBarChangeListener = this.A00;
        if (onSeekBarChangeListener != null) {
            onSeekBarChangeListener.onStartTrackingTouch(seekBar);
        }
        C43750JWm c43750JWm = this.A01;
        if (AbstractC166987dD.A1b(c43750JWm.A05) && seekBar != null) {
            int progress = seekBar.getProgress();
            if (Integer.valueOf(progress) != null) {
                c43750JWm.A02 = false;
                c43750JWm.A00 = progress;
            }
        }
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStopTrackingTouch(SeekBar seekBar) {
        SeekBar.OnSeekBarChangeListener onSeekBarChangeListener = this.A00;
        if (onSeekBarChangeListener != null) {
            onSeekBarChangeListener.onStopTrackingTouch(seekBar);
        }
        C43750JWm c43750JWm = this.A01;
        if (AbstractC166987dD.A1b(c43750JWm.A05)) {
            if (seekBar != null) {
                seekBar.getProgress();
            }
            c43750JWm.A02 = false;
        }
    }

    @Override // android.widget.SeekBar
    public void setOnSeekBarChangeListener(SeekBar.OnSeekBarChangeListener onSeekBarChangeListener) {
        this.A00 = onSeekBarChangeListener;
        super.setOnSeekBarChangeListener(this);
    }

    public /* synthetic */ VideoScrubberSeekBar(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, JQ0.A0C(attributeSet, i2), JQ0.A03(i2, i));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VideoScrubberSeekBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C14360o3.A0B(context, 1);
        this.A01 = new C43750JWm(this);
        super.setOnSeekBarChangeListener(this);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public VideoScrubberSeekBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        C14360o3.A0B(context, 1);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public VideoScrubberSeekBar(Context context) {
        this(context, null, 0);
        C14360o3.A0B(context, 1);
    }
}
