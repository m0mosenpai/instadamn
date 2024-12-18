package X;

import android.content.Context;
import android.view.View;
import com.facebook.rendercore.RenderTreeNode;
import java.util.Collections;

/* renamed from: X.3h4, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3h4 {
    public C2WS A00;
    public RenderTreeNode A01;
    public boolean A02;
    public final C3h5 A03;
    public final Object A04;

    /* JADX WARN: Type inference failed for: r0v2, types: [X.3h5, java.lang.Object] */
    public C3h4(RenderTreeNode renderTreeNode, Object obj) {
        C14360o3.A0B(renderTreeNode, 1);
        C14360o3.A0B(obj, 2);
        this.A04 = obj;
        this.A01 = renderTreeNode;
        this.A03 = new Object();
    }

    public final void A00(Context context) {
        C2Wm A00;
        String obj;
        Class cls;
        InterfaceC50822Vd A0I = this.A01.A06.A0I();
        Object obj2 = this.A04;
        C14360o3.A0B(A0I, 1);
        if (C2V1.A03 && (obj2 instanceof C2WS)) {
            ((C2WS) obj2).A0J();
        }
        if (A0I.BeU().A01 && (A00 = C51382Xl.A00(context, A0I, A0I.E4c())) != null) {
            if (C51382Xl.A01 != null && (obj2 instanceof View)) {
                Object BeR = A0I.BeR();
                if (!(BeR instanceof Class) || (cls = (Class) BeR) == null || (obj = cls.getSimpleName()) == null) {
                    obj = BeR.toString();
                }
                C14360o3.A07(Collections.singletonList(obj));
            }
            A00.EE6(obj2);
        }
    }
}
