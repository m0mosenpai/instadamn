package com.instagram.feed.ui.rows.videoscrubber.buffer.layout;

import X.AbstractC010103p;
import X.AbstractC16960so;
import X.C00O;
import X.C14360o3;
import X.C43d;
import X.C50355MLh;
import X.InterfaceC16660sJ;
import X.InterfaceC16820sZ;
import X.L80;
import X.LQB;
import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.RelativeLayout;
import com.facebook.R;

/* loaded from: classes2.dex */
public final class MediaVideoScrubberBufferRelativeLayout extends RelativeLayout implements C43d {
    public boolean A00;
    public L80 A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MediaVideoScrubberBufferRelativeLayout(Context context) {
        super(context);
        C14360o3.A0B(context, 1);
    }

    @Override // X.C43d
    public final void CNq(InterfaceC16820sZ interfaceC16820sZ, InterfaceC16660sJ interfaceC16660sJ, int i, int i2) {
        C14360o3.A0B(interfaceC16660sJ, 3);
        this.A01 = new L80(interfaceC16820sZ, interfaceC16660sJ, new C50355MLh(this, 8), new C50355MLh(this, 9), i, i2);
        if (isLaidOut() && !isLayoutRequested()) {
            int dimensionPixelSize = getContext().getResources().getDimensionPixelSize(R.dimen.ab_test_media_thumbnail_preview_item_internal_padding);
            AbstractC010103p.A0H(this, AbstractC16960so.A1Q(new Rect(0, 0, dimensionPixelSize, i2), new Rect(getWidth() - dimensionPixelSize, 0, getWidth(), i2)));
        } else {
            addOnLayoutChangeListener(new LQB(this, i2));
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        C14360o3.A0B(motionEvent, 0);
        if (!this.A00) {
            return super.dispatchTouchEvent(motionEvent);
        }
        L80 l80 = this.A01;
        if (l80 == null) {
            C14360o3.A0F("bufferLayoutDelegate");
            throw C00O.createAndThrow();
        }
        return l80.A00(motionEvent);
    }

    public static final /* synthetic */ boolean A00(MotionEvent motionEvent, MediaVideoScrubberBufferRelativeLayout mediaVideoScrubberBufferRelativeLayout) {
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // X.C43d
    public void setBufferEnabled(boolean z) {
        this.A00 = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MediaVideoScrubberBufferRelativeLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C14360o3.A0B(context, 1);
        C14360o3.A0B(attributeSet, 2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MediaVideoScrubberBufferRelativeLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C14360o3.A0B(context, 1);
        C14360o3.A0B(attributeSet, 2);
    }
}
