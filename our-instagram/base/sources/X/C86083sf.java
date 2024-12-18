package X;

import android.content.Context;
import android.view.ViewStub;
import android.view.animation.DecelerateInterpolator;
import com.instagram.ui.widget.slideouticon.SlideInAndOutIconView;

/* renamed from: X.3sf, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C86083sf {
    public final Context A00;
    public final InterfaceC09390do A01;
    public final InterfaceC09390do A02;

    public static final void A00(C86083sf c86083sf, boolean z) {
        float f = 0.0f;
        float f2 = 1.0f;
        if (z) {
            f2 = 0.0f;
            f = 1.0f;
        }
        if (c86083sf.A01().getAlpha() != f) {
            c86083sf.A01().setAlpha(f2);
            c86083sf.A01().animate().alpha(f).setDuration(200L).start();
        }
    }

    public final SlideInAndOutIconView A01() {
        Object value = this.A02.getValue();
        C14360o3.A07(value);
        return (SlideInAndOutIconView) value;
    }

    public C86083sf(Context context, ViewStub viewStub, boolean z) {
        this.A00 = context;
        C17050sx A01 = AbstractC09440dt.A01(new C9EJ(viewStub, 21));
        this.A01 = A01;
        if (!z) {
            C14360o3.A07(A01.getValue());
        }
        this.A02 = AbstractC09440dt.A01(new C9EJ(this, 22));
    }

    public final void A02(int i) {
        A01().setIcon(this.A00.getDrawable(i));
        A01().setVisibility(0);
        A01().animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(200L).setInterpolator(new DecelerateInterpolator()).withEndAction(new RunnableC71361WsW(this)).start();
    }
}
