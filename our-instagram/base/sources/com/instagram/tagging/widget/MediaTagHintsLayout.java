package com.instagram.tagging.widget;

import X.AbstractC125325le;
import X.AbstractC80603ip;
import X.C05F;
import X.C24093Ame;
import X.C3VZ;
import X.C71039Wmu;
import X.C75113Zb;
import X.C86393tC;
import X.J0M;
import android.content.Context;
import android.graphics.PointF;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.tagging.model.Tag;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.webrtc.CameraVideoCapturer;

/* loaded from: classes2.dex */
public class MediaTagHintsLayout extends ViewGroup {
    public int A00;
    public int A01;
    public UserSession A02;
    public Runnable A03;
    public Runnable A04;
    public final Handler A05;
    public final int A06;
    public final Map A07;

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5 = i3 - i;
        int i6 = i4 - i2;
        for (Map.Entry entry : this.A07.entrySet()) {
            View view = (View) entry.getValue();
            PointF A00 = ((Tag) entry.getKey()).A00();
            A00.getClass();
            int i7 = (int) (i5 * A00.x);
            int i8 = (int) (i6 * ((Tag) entry.getKey()).A00().y);
            int i9 = this.A06;
            view.layout(i7 - i9, i8 - i9, i7 + i9, i8 + i9);
        }
    }

    public static boolean A00(C75113Zb c75113Zb, int i) {
        if (c75113Zb.A22 && i == c75113Zb.A03 && c75113Zb.A0i == C3VZ.A03 && !c75113Zb.A1y && !c75113Zb.A1z) {
            return false;
        }
        return true;
    }

    public final void A01() {
        Runnable runnable = this.A04;
        if (runnable != null) {
            this.A05.removeCallbacks(runnable);
            this.A04 = null;
        }
        Runnable runnable2 = this.A03;
        if (runnable2 != null) {
            this.A05.removeCallbacks(runnable2);
            this.A03 = null;
        }
    }

    public final void A02(C86393tC c86393tC, boolean z) {
        Integer num = c86393tC.A01;
        Integer num2 = C05F.A01;
        if (num != num2) {
            c86393tC.A01 = num2;
            int i = 0;
            if (z) {
                while (i < getChildCount()) {
                    getChildAt(i);
                    View childAt = getChildAt(i);
                    C71039Wmu c71039Wmu = new C71039Wmu(c86393tC, this);
                    AbstractC125325le A01 = AbstractC125325le.A01(childAt, 1);
                    if (A01.A0W()) {
                        A01.A05 = new J0M(childAt, c71039Wmu, A01);
                    } else {
                        AbstractC80603ip.A04(childAt, new C24093Ame(childAt, c71039Wmu));
                    }
                    i++;
                }
                return;
            }
            while (i < getChildCount()) {
                View childAt2 = getChildAt(i);
                childAt2.setScaleX(0.0f);
                childAt2.setScaleY(0.0f);
                childAt2.setVisibility(8);
                i++;
            }
            c86393tC.A05 = true;
        }
    }

    public void setTags(List list) {
        Map map = this.A07;
        map.clear();
        removeAllViewsInLayout();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Tag tag = (Tag) it.next();
            if (tag.A00() != null) {
                Context context = getContext();
                ImageView imageView = new ImageView(context);
                imageView.setImageDrawable(context.getDrawable(R.drawable.tag_hint_with_shadow));
                imageView.setAlpha(0.0f);
                map.put(tag, imageView);
                addView(imageView);
            }
        }
    }

    public MediaTagHintsLayout(Context context) {
        super(context);
        this.A06 = getResources().getDimensionPixelSize(R.dimen.asset_picker_cell_margin);
        this.A07 = new HashMap();
        this.A05 = new Handler(Looper.getMainLooper());
        this.A01 = CameraVideoCapturer.CameraStatistics.CAMERA_FREEZE_REPORT_TIMOUT_MS;
        this.A00 = CameraVideoCapturer.CameraStatistics.CAMERA_OBSERVER_PERIOD_MS;
    }

    public void setHideDelayMs(int i) {
        this.A00 = i;
    }

    public void setShowDelayMs(int i) {
        this.A01 = i;
    }

    public void setUserSession(UserSession userSession) {
        this.A02 = userSession;
    }

    public MediaTagHintsLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.A06 = getResources().getDimensionPixelSize(R.dimen.asset_picker_cell_margin);
        this.A07 = new HashMap();
        this.A05 = new Handler(Looper.getMainLooper());
        this.A01 = CameraVideoCapturer.CameraStatistics.CAMERA_FREEZE_REPORT_TIMOUT_MS;
        this.A00 = CameraVideoCapturer.CameraStatistics.CAMERA_OBSERVER_PERIOD_MS;
    }

    public MediaTagHintsLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.A06 = getResources().getDimensionPixelSize(R.dimen.asset_picker_cell_margin);
        this.A07 = new HashMap();
        this.A05 = new Handler(Looper.getMainLooper());
        this.A01 = CameraVideoCapturer.CameraStatistics.CAMERA_FREEZE_REPORT_TIMOUT_MS;
        this.A00 = CameraVideoCapturer.CameraStatistics.CAMERA_OBSERVER_PERIOD_MS;
    }
}
