package X;

import android.app.Activity;
import android.view.View;
import androidx.compose.ui.platform.ComposeView;
import com.facebook.systrace.Systrace;
import com.instagram.common.session.UserSession;

/* loaded from: classes5.dex */
public final class BVT implements View.OnAttachStateChangeListener {
    public final /* synthetic */ View A00;
    public final /* synthetic */ ComposeView A01;
    public final /* synthetic */ C19270xB A02;
    public final /* synthetic */ C26612Bp9 A03;

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
    }

    public BVT(View view, ComposeView composeView, C19270xB c19270xB, C26612Bp9 c26612Bp9) {
        this.A00 = view;
        this.A03 = c26612Bp9;
        this.A02 = c19270xB;
        this.A01 = composeView;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.A00.removeOnAttachStateChangeListener(this);
        if (Systrace.A0E(1L)) {
            C0fO.A01("ThreadsComposePrimitiveComponent.bind(uiState)", 513012778);
        }
        try {
            C26612Bp9 c26612Bp9 = this.A03;
            Activity activity = c26612Bp9.A00;
            UserSession userSession = c26612Bp9.A01;
            C26269Bjc c26269Bjc = c26612Bp9.A03;
            CR3 cr3 = c26612Bp9.A02;
            BVV.A00(activity, this.A01, this.A02, userSession, cr3, c26269Bjc);
            if (Systrace.A0E(1L)) {
                C0fO.A00(2036644666);
            }
        } catch (Throwable th) {
            if (Systrace.A0E(1L)) {
                C0fO.A00(-1829731391);
            }
            throw th;
        }
    }
}
