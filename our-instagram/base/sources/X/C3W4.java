package X;

import android.view.View;
import android.view.ViewStub;
import android.widget.FrameLayout;
import com.instagram.ui.widget.slideouticon.SlideInAndOutIconView;

/* renamed from: X.3W4, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3W4 {
    public final C57012jc A00;
    public final InterfaceC09390do A01 = AbstractC09440dt.A01(new C9E0(this, 4));

    public final FrameLayout A00() {
        View A01 = this.A00.A01();
        C14360o3.A0C(A01, "null cannot be cast to non-null type android.widget.FrameLayout");
        return (FrameLayout) A01;
    }

    public final SlideInAndOutIconView A01() {
        Object value = this.A01.getValue();
        C14360o3.A07(value);
        return (SlideInAndOutIconView) value;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [X.2jc, java.lang.Object] */
    public C3W4(View view) {
        ?? obj = new Object();
        obj.A00 = view;
        this.A00 = obj;
    }

    public C3W4(ViewStub viewStub) {
        this.A00 = new C57012jc(viewStub);
    }
}
