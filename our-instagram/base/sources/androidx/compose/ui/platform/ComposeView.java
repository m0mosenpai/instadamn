package androidx.compose.ui.platform;

import X.AbstractC74873Yc;
import X.AbstractC74903Yf;
import X.C5TM;
import X.C74883Yd;
import X.InterfaceC09390do;
import X.InterfaceC16620sF;
import X.InterfaceC74953Yl;
import android.content.Context;
import android.util.AttributeSet;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes3.dex */
public final class ComposeView extends C5TM {
    public boolean A00;
    public final InterfaceC74953Yl A01;

    public ComposeView(Context context) {
        this(context, null, 0);
    }

    public static /* synthetic */ void getShouldCreateCompositionOnAttachedToWindow$annotations() {
    }

    public final void setContent(InterfaceC16620sF interfaceC16620sF) {
        this.A00 = true;
        this.A01.Egh(interfaceC16620sF);
        if (isAttachedToWindow()) {
            A03();
        }
    }

    @Override // X.C5TM
    public boolean getShouldCreateCompositionOnAttachedToWindow() {
        return this.A00;
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return getClass().getName();
    }

    public ComposeView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C74883Yd A00 = AbstractC74873Yc.A00();
        InterfaceC09390do interfaceC09390do = AbstractC74903Yf.A01;
        this.A01 = new ParcelableSnapshotMutableState(A00, null);
    }

    public /* synthetic */ ComposeView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    public ComposeView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }
}
