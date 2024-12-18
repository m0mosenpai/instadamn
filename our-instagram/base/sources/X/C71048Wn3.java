package X;

import android.view.View;

/* renamed from: X.Wn3, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C71048Wn3 implements InterfaceC143526dr {
    public final int A00;
    public final Object A01;

    public C71048Wn3(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // X.InterfaceC143526dr
    public final void DgX() {
        View view;
        int i;
        switch (this.A00) {
            case 0:
                ViewOnKeyListenerC67976V4r viewOnKeyListenerC67976V4r = (ViewOnKeyListenerC67976V4r) this.A01;
                int intValue = viewOnKeyListenerC67976V4r.A09.intValue();
                if (intValue != 1) {
                    if (intValue == 2) {
                        view = viewOnKeyListenerC67976V4r.A00;
                        if (view != null) {
                            view.setTranslationY(viewOnKeyListenerC67976V4r.A0E);
                            i = 8;
                            view.setVisibility(i);
                        }
                        C14360o3.A0F("canvasContainer");
                        throw C00O.createAndThrow();
                    }
                } else {
                    view = viewOnKeyListenerC67976V4r.A00;
                    if (view != null) {
                        view.setTranslationY(0.0f);
                        i = 0;
                        view.setVisibility(i);
                    }
                    C14360o3.A0F("canvasContainer");
                    throw C00O.createAndThrow();
                }
                viewOnKeyListenerC67976V4r.A0R.onFinish();
                return;
            case 1:
                ((InterfaceC16820sZ) this.A01).invoke();
                return;
            default:
                ((View) this.A01).setVisibility(0);
                return;
        }
    }
}
