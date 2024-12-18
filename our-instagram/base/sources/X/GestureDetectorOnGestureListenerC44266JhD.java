package X;

import android.content.Context;
import android.content.res.Resources;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.creation.base.ui.mediatabbar.MediaTabBar;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: X.JhD, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class GestureDetectorOnGestureListenerC44266JhD extends FrameLayout implements GestureDetector.OnGestureListener {
    public float A00;
    public int A01;
    public View A02;
    public com.instagram.creation.base.ui.mediatabbar.Tab A03;
    public com.instagram.creation.base.ui.mediatabbar.Tab A04;
    public boolean A05;
    public boolean A06;
    public boolean A07;
    public boolean A08;
    public float A09;
    public TextView A0A;
    public Runnable A0B;
    public boolean A0C;
    public boolean A0D;
    public boolean A0E;
    public final GestureDetector A0F;
    public final C55982hj A0G;
    public final C55982hj A0H;
    public final MediaTabBar A0I;
    public final C44267JhE A0J;
    public final C44268JhF A0K;
    public final java.util.Set A0L;
    public final boolean A0M;

    public GestureDetectorOnGestureListenerC44266JhD(Context context) {
        super(context, null);
        GestureDetector gestureDetector = new GestureDetector(context, this);
        this.A0F = gestureDetector;
        this.A0H = AbstractC167007dF.A0R();
        C55982hj A0R = AbstractC167007dF.A0R();
        A0R.A09(AbstractC43880Jak.A00);
        A0R.A06 = true;
        this.A0G = A0R;
        this.A0L = new CopyOnWriteArraySet();
        this.A0J = new C44267JhE(this);
        this.A0K = new C44268JhF(this);
        this.A08 = true;
        Context context2 = getContext();
        this.A0M = AbstractC13620mo.A02(context2);
        this.A05 = true;
        gestureDetector.setIsLongpressEnabled(false);
        LayoutInflater.from(AbstractC53242c7.A0I(context, R.attr.mediaTabStyle)).inflate(R.layout.media_tab_host, this);
        MediaTabBar mediaTabBar = (MediaTabBar) requireViewById(R.id.media_tab_bar);
        this.A0I = mediaTabBar;
        ViewGroup.LayoutParams layoutParams = mediaTabBar.getLayoutParams();
        Resources resources = getResources();
        C14360o3.A07(context2);
        AbstractC31172DnG.A1F(resources, layoutParams, AbstractC43841Ja4.A04(context2) ? R.dimen.add_to_story_dual_destination_share_sheet_avatar_icon_size : R.dimen.biz_sign_up_divider_bottom_margin);
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        return true;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        C14360o3.A0B(motionEvent, 0);
        boolean z = false;
        if (motionEvent.getAction() == 0) {
            this.A0D = false;
            this.A09 = 0.0f;
            this.A06 = false;
            this.A07 = false;
            this.A00 = 0.0f;
        }
        if (this.A0H.A01 == 0.0d && this.A08) {
            if (this.A06 && !this.A0D) {
                z = true;
            }
            this.A0F.onTouchEvent(motionEvent);
        }
        return z;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final void onLongPress(MotionEvent motionEvent) {
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        C14360o3.A0B(motionEvent2, 1);
        C14360o3.A0A(motionEvent);
        float scaledTouchSlop = ViewConfiguration.get(getContext()).getScaledTouchSlop();
        float A00 = (float) AbstractC43594JPz.A00(AbstractC166987dD.A01(motionEvent.getRawX(), motionEvent2.getRawX()), AbstractC166987dD.A01(motionEvent.getRawY(), motionEvent2.getRawY()));
        float degrees = (float) Math.toDegrees(Math.asin(r2 / A00));
        if (A00 > scaledTouchSlop && !this.A06 && !this.A07) {
            this.A00 = motionEvent2.getRawX();
            if (degrees < 45.0f) {
                this.A06 = true;
            } else {
                this.A07 = true;
                return true;
            }
        }
        return true;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final void onShowPress(MotionEvent motionEvent) {
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        return false;
    }

    public final void setThemeBackground(Context context) {
        C14360o3.A0B(context, 0);
        AbstractC31172DnG.A1B(context, this, AbstractC53242c7.A0D(context));
    }

    public static final void A02(GestureDetectorOnGestureListenerC44266JhD gestureDetectorOnGestureListenerC44266JhD) {
        if (gestureDetectorOnGestureListenerC44266JhD.A02 == null) {
            View A0U = AbstractC167017dG.A0U(gestureDetectorOnGestureListenerC44266JhD, R.id.media_tab_bar_text_info_stub);
            gestureDetectorOnGestureListenerC44266JhD.A0A = AbstractC166987dD.A0e(A0U, R.id.media_tab_bar_text_info);
            gestureDetectorOnGestureListenerC44266JhD.A02 = A0U;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final float getClampedSpringValue() {
        return (float) Math.min(Math.max(this.A0G.A09.A00, 0.0d), (this.A0I.getChildCount() - 1) * getWidth());
    }

    private final void setDragOffset(float f) {
        this.A0G.A08(f, true);
    }

    public final void A03(com.instagram.creation.base.ui.mediatabbar.Tab tab, boolean z) {
        int i;
        if (!this.A0C) {
            this.A0B = new RunnableC44282JhY(this, tab, z);
            return;
        }
        if (tab == null) {
            return;
        }
        if (this.A0M) {
            i = (this.A0I.getChildCount() - 1) - tab.A00;
        } else {
            i = tab.A00;
        }
        int childCount = this.A0I.getChildCount() - 1;
        if (childCount > i) {
            childCount = i;
        }
        if (childCount < 0) {
            childCount = 0;
        }
        C55982hj c55982hj = this.A0G;
        double width = childCount * getWidth();
        if (z) {
            c55982hj.A06(width);
        } else {
            c55982hj.A08(width, true);
        }
        if (this.A0E) {
            return;
        }
        com.instagram.creation.base.ui.mediatabbar.Tab currentTab = getCurrentTab();
        Iterator it = this.A0L.iterator();
        while (it.hasNext()) {
            ((MQQ) it.next()).Drl(currentTab);
        }
        this.A04 = getCurrentTab();
        this.A0E = true;
    }

    public final com.instagram.creation.base.ui.mediatabbar.Tab getCurrentTab() {
        int currentIndex;
        MediaTabBar mediaTabBar = this.A0I;
        if (this.A0M) {
            currentIndex = (mediaTabBar.getChildCount() - 1) - getCurrentIndex();
        } else {
            currentIndex = getCurrentIndex();
        }
        View childAt = mediaTabBar.getChildAt(currentIndex);
        if (childAt != null) {
            return (com.instagram.creation.base.ui.mediatabbar.Tab) childAt.getTag();
        }
        return null;
    }

    public final int getTabCount() {
        return this.A0I.getChildCount();
    }

    public final int getTabHeight() {
        MediaTabBar mediaTabBar = this.A0I;
        int i = mediaTabBar.getLayoutParams().height;
        if (i <= 0) {
            return mediaTabBar.getHeight();
        }
        return i;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        this.A09 = f;
        return false;
    }

    public final void setTabPagingEnabled(boolean z) {
        this.A08 = z;
    }

    public final void setTabTranslationX(float f) {
        MediaTabBar mediaTabBar = this.A0I;
        mediaTabBar.setTranslationX(f * AbstractC166987dD.A07(mediaTabBar));
    }

    private final int getCurrentIndex() {
        return (int) Math.min(Math.max(Math.round(getCurrentProgress()), 0.0d), this.A0I.getChildCount() - 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final float getCurrentProgress() {
        return getClampedSpringValue() / getWidth();
    }

    private final float getDragOffset() {
        return getClampedSpringValue();
    }

    private final int getTargetIndex() {
        int currentIndex = getCurrentIndex();
        float currentProgress = getCurrentProgress() % 1.0f;
        double d = this.A0G.A09.A01;
        if (d > 0.0d) {
            if (currentProgress <= 0.5d) {
                currentIndex++;
            }
        } else if (d < 0.0d && currentProgress >= 0.5d) {
            currentIndex--;
        }
        if (currentIndex < 0) {
            currentIndex = 0;
        }
        int childCount = this.A0I.getChildCount() - 1;
        if (currentIndex > childCount) {
            return childCount;
        }
        return currentIndex;
    }

    private final float getTargetOffset() {
        return getTargetIndex() * getWidth();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        int A06 = C0f9.A06(876257023);
        super.onAttachedToWindow();
        this.A0G.A0A(this.A0J);
        if (this.A05) {
            this.A0H.A0A(this.A0K);
        } else {
            this.A0I.setVisibility(8);
        }
        C0f9.A0D(-1558042344, A06);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        int A06 = C0f9.A06(455441176);
        super.onDetachedFromWindow();
        this.A0G.A0B(this.A0J);
        this.A0H.A0B(this.A0K);
        C0f9.A0D(510412799, A06);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (z && !this.A0C) {
            this.A0C = true;
            Runnable runnable = this.A0B;
            if (runnable != null) {
                runnable.run();
                this.A0B = null;
            }
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        float f;
        int A05 = C0f9.A05(891406714);
        C14360o3.A0B(motionEvent, 0);
        if (this.A0H.A01 == 0.0d && this.A08) {
            this.A0F.onTouchEvent(motionEvent);
            float rawX = motionEvent.getRawX();
            if (!this.A06) {
                f = 0.0f;
            } else {
                f = rawX - this.A00;
            }
            int action = motionEvent.getAction();
            if (action != 1) {
                if (action == 2 && this.A06) {
                    setDragOffset(getClampedSpringValue() - f);
                }
            } else {
                float f2 = this.A09;
                setDragOffset(getClampedSpringValue() - f);
                C55982hj c55982hj = this.A0G;
                c55982hj.A07((-1.0f) * f2);
                c55982hj.A06(getTargetOffset());
            }
            this.A00 = motionEvent.getRawX();
            C0f9.A0C(-257315910, A05);
            return true;
        }
        C0f9.A0C(20990423, A05);
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z) {
        super.requestDisallowInterceptTouchEvent(z);
        this.A0D = z;
    }

    public final void setTextInfoBar(String str) {
        A02(this);
        this.A05 = false;
        this.A0I.setVisibility(8);
        View view = this.A02;
        if (view != null) {
            view.setVisibility(0);
            TextView textView = this.A0A;
            if (textView != null) {
                textView.setText(str);
                return;
            }
            throw AbstractC166987dD.A14("Required value was null.");
        }
        throw AbstractC166987dD.A14("Required value was null.");
    }
}
