package com.instagram.feed.ui.views;

import X.AbstractC55922hc;
import X.C110644yc;
import X.C14360o3;
import X.InterfaceC110654yd;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes2.dex */
public final class EndOfFeedDemarcatorCheckmark extends C110644yc implements InterfaceC110654yd {
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public EndOfFeedDemarcatorCheckmark(Context context) {
        this(context, null, 0);
        C14360o3.A0B(context, 1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EndOfFeedDemarcatorCheckmark(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C14360o3.A0B(context, 1);
        TypedArray typedArray = null;
        try {
            typedArray = getContext().obtainStyledAttributes(attributeSet, AbstractC55922hc.A0W, 0, i);
            this.A03 = typedArray.getInteger(3, this.A03);
            this.A01 = typedArray.getFloat(1, this.A01);
            this.A00 = typedArray.getFloat(0, this.A00);
            this.A02 = typedArray.getFloat(2, this.A02);
            typedArray.recycle();
        } catch (Throwable th) {
            if (typedArray != null) {
                typedArray.recycle();
            }
            throw th;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public EndOfFeedDemarcatorCheckmark(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        C14360o3.A0B(context, 1);
    }

    public /* synthetic */ EndOfFeedDemarcatorCheckmark(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
