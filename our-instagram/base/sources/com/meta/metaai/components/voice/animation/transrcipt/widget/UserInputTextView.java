package com.meta.metaai.components.voice.animation.transrcipt.widget;

import X.C14360o3;
import X.C34971Faw;
import X.C3WF;
import X.GJV;
import X.GX7;
import android.content.Context;
import android.util.AttributeSet;
import android.view.Choreographer;
import android.view.View;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes6.dex */
public final class UserInputTextView extends C3WF {
    public GX7 A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UserInputTextView(Context context) {
        super(context, null);
        C14360o3.A0B(context, 1);
    }

    @Override // android.widget.TextView, android.view.View
    public final void onVisibilityChanged(View view, int i) {
        C14360o3.A0B(view, 0);
        super.onVisibilityChanged(view, i);
        GX7 gx7 = this.A00;
        if (gx7 != null) {
            C34971Faw c34971Faw = ((GJV) gx7).A00;
            if (i == 0) {
                C34971Faw.A00(c34971Faw);
            } else {
                c34971Faw.A04 = false;
                Choreographer.getInstance().removeFrameCallback(c34971Faw.A09);
            }
        }
    }

    public final void setOnVisibilityChangeListener(GX7 gx7) {
        this.A00 = gx7;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UserInputTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C14360o3.A0B(context, 1);
    }

    public /* synthetic */ UserInputTextView(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }
}
