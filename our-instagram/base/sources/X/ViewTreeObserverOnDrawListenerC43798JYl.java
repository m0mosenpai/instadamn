package X;

import android.view.ViewTreeObserver;
import java.lang.ref.WeakReference;

/* renamed from: X.JYl, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class ViewTreeObserverOnDrawListenerC43798JYl implements ViewTreeObserver.OnDrawListener {
    public final /* synthetic */ WeakReference A00;

    public ViewTreeObserverOnDrawListenerC43798JYl(WeakReference weakReference) {
        this.A00 = weakReference;
    }

    @Override // android.view.ViewTreeObserver.OnDrawListener
    public final void onDraw() {
        C43916JbR c43916JbR = (C43916JbR) this.A00.get();
        if (c43916JbR != null) {
            InterfaceC09390do interfaceC09390do = c43916JbR.A08;
            if (((C2DU) ((C2DS) interfaceC09390do.getValue())).A0H.A0F) {
                ((AbstractC69603Au) c43916JbR.A07.getValue()).A0J("iris_sequence_id", String.valueOf(((C2DU) ((C2DS) interfaceC09390do.getValue())).A0C.A08()));
            }
            InterfaceC09390do interfaceC09390do2 = c43916JbR.A07;
            ((C98O) interfaceC09390do2.getValue()).A08.A00();
            C43939Jbo c43939Jbo = (C43939Jbo) interfaceC09390do2.getValue();
            int i = c43939Jbo.A01;
            if (i <= c43939Jbo.A02) {
                c43939Jbo.A0E(AnonymousClass001.A0O("on_will_render_", i));
                c43939Jbo.A01++;
            }
        }
    }
}
