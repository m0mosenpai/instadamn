package X;

import android.view.CollapsibleActionView;
import android.view.View;
import android.widget.FrameLayout;

/* renamed from: X.UBw, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C66355UBw extends FrameLayout implements InterfaceC71932XBh {
    public final CollapsibleActionView A00;

    @Override // X.InterfaceC71932XBh
    public final void onActionViewCollapsed() {
        this.A00.onActionViewCollapsed();
    }

    @Override // X.InterfaceC71932XBh
    public final void onActionViewExpanded() {
        this.A00.onActionViewExpanded();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C66355UBw(View view) {
        super(view.getContext());
        this.A00 = (CollapsibleActionView) view;
        addView(view);
    }
}
