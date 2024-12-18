package X;

import android.content.Context;
import android.view.MotionEvent;
import android.view.TextureView;

/* renamed from: X.Mbo, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50781Mbo extends TextureView {
    public final /* synthetic */ C55720Oom A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C50781Mbo(Context context, C55720Oom c55720Oom) {
        super(context);
        this.A00 = c55720Oom;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int i;
        int A05 = C0f9.A05(-756837661);
        boolean z = false;
        C14360o3.A0B(motionEvent, 0);
        super.onTouchEvent(motionEvent);
        if (isEnabled()) {
            this.A00.A04.invoke(motionEvent);
            z = true;
            i = -1639074059;
        } else {
            i = -2137337258;
        }
        C0f9.A0C(i, A05);
        return z;
    }
}
