package com.instagram.creation.capture.quickcapture.faceeffectui.effectpicker;

import X.C14360o3;
import android.content.Context;
import android.util.AttributeSet;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes9.dex */
public final class ArEffectPickerRecyclerView extends RecyclerView {
    public String A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ArEffectPickerRecyclerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C14360o3.A0B(context, 1);
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public final boolean A1E(int i, int i2) {
        if ("video_call".equals(this.A00)) {
            i = (int) (i * 0.35d);
        }
        return super.A1E(i, i2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ArEffectPickerRecyclerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C14360o3.A0B(context, 1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ArEffectPickerRecyclerView(Context context) {
        super(context, null);
        C14360o3.A0B(context, 1);
    }
}
