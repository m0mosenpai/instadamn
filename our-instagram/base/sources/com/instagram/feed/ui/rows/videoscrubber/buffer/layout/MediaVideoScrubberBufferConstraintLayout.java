package com.instagram.feed.ui.rows.videoscrubber.buffer.layout;

import X.AbstractC167017dG;
import X.AbstractC25236BEt;
import X.C00O;
import X.C14360o3;
import X.C43d;
import X.C50355MLh;
import X.InterfaceC16660sJ;
import X.InterfaceC16820sZ;
import X.L80;
import X.ViewOnLayoutChangeListenerC28672ClK;
import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.constraintlayout.widget.ConstraintLayout;

/* loaded from: classes8.dex */
public final class MediaVideoScrubberBufferConstraintLayout extends ConstraintLayout implements C43d {
    public boolean A00;
    public L80 A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MediaVideoScrubberBufferConstraintLayout(Context context) {
        super(context);
        C14360o3.A0B(context, 1);
    }

    @Override // X.C43d
    public final void CNq(InterfaceC16820sZ interfaceC16820sZ, InterfaceC16660sJ interfaceC16660sJ, int i, int i2) {
        C14360o3.A0B(interfaceC16660sJ, 3);
        this.A01 = new L80(interfaceC16820sZ, interfaceC16660sJ, new C50355MLh(this, 4), new C50355MLh(this, 5), i, i2);
        if (isLaidOut() && !isLayoutRequested()) {
            int A03 = AbstractC167017dG.A03(getContext());
            AbstractC25236BEt.A0f(new Rect(0, 0, A03, i2), this, A03, i2);
        } else {
            addOnLayoutChangeListener(new ViewOnLayoutChangeListenerC28672ClK(this, i2, 1));
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

    @Override // X.C43d
    public void setBufferEnabled(boolean z) {
        this.A00 = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MediaVideoScrubberBufferConstraintLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        AbstractC167017dG.A1P(context, attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MediaVideoScrubberBufferConstraintLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        AbstractC167017dG.A1P(context, attributeSet);
    }
}
