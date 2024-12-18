package com.instagram.sponsored.serverrendered;

import X.AbstractC09440dt;
import X.C14360o3;
import X.C206839Do;
import X.C64V;
import X.C64W;
import X.C64Z;
import X.C9C9;
import X.InterfaceC09390do;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.instagram.showreel.composition.ui.IgShowreelCompositionView;
import com.instagram.showreelnative.ui.common.ShowreelNativeMediaView;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes3.dex */
public final class IgShowreelView extends FrameLayout {
    public final IgShowreelCompositionView A00;
    public final ShowreelNativeMediaView A01;
    public final InterfaceC09390do A02;
    public final InterfaceC09390do A03;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public IgShowreelView(Context context) {
        this(context, null, 0);
        C14360o3.A0B(context, 1);
    }

    private final C64W getConfigProvider() {
        return (C64W) this.A02.getValue();
    }

    private final C9C9 getIntegrationPoint() {
        return (C9C9) this.A03.getValue();
    }

    public final IgShowreelCompositionView getShowreelCompositionView() {
        return this.A00;
    }

    public final ShowreelNativeMediaView getShowreelNativeView() {
        return this.A01;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IgShowreelView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C14360o3.A0B(context, 1);
        this.A03 = AbstractC09440dt.A01(C64V.A00);
        this.A02 = AbstractC09440dt.A01(new C206839Do(context, 23));
        this.A01 = new ShowreelNativeMediaView(context, getIntegrationPoint(), (C64Z) null, getConfigProvider());
        this.A00 = new IgShowreelCompositionView(context);
    }

    public /* synthetic */ IgShowreelView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public IgShowreelView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        C14360o3.A0B(context, 1);
    }
}
