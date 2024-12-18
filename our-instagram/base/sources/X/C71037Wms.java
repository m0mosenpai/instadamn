package X;

import android.view.View;
import android.view.ViewGroup;
import java.util.List;

/* renamed from: X.Wms, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C71037Wms implements InterfaceC125355lh {
    public final int A00;
    public final Object A01;

    public C71037Wms(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    @Override // X.InterfaceC125355lh
    public final void onFinish() {
        View view;
        String str;
        switch (this.A00) {
            case 0:
                C70185WFo c70185WFo = (C70185WFo) this.A01;
                List list = c70185WFo.A0E;
                synchronized (list) {
                    int i = c70185WFo.A01 + 1;
                    c70185WFo.A01 = i;
                    if (i == list.size()) {
                        c70185WFo.A01 = 0;
                        View view2 = c70185WFo.A07;
                        Runnable runnable = c70185WFo.A0C;
                        view2.removeCallbacks(runnable);
                        view2.post(runnable);
                        Runnable runnable2 = c70185WFo.A0D;
                        view2.removeCallbacks(runnable2);
                        view2.post(runnable2);
                        return;
                    }
                    c70185WFo.A07.postDelayed(new RunnableC71302WrW(c70185WFo), 1000L);
                    return;
                }
            case 1:
                view = ((C70185WFo) this.A01).A02;
                if (view == null) {
                    str = "instructionImageView";
                    C14360o3.A0F(str);
                    throw C00O.createAndThrow();
                }
                view.setVisibility(4);
                return;
            case 2:
                view = ((C70185WFo) this.A01).A03;
                if (view == null) {
                    str = "instructionTextView";
                    C14360o3.A0F(str);
                    throw C00O.createAndThrow();
                }
                view.setVisibility(4);
                return;
            case 3:
                ViewOnKeyListenerC67976V4r viewOnKeyListenerC67976V4r = (ViewOnKeyListenerC67976V4r) this.A01;
                int intValue = viewOnKeyListenerC67976V4r.A09.intValue();
                if (intValue != 1) {
                    if (intValue != 2) {
                        return;
                    }
                    viewOnKeyListenerC67976V4r.A09 = C05F.A00;
                    C67882V0n c67882V0n = viewOnKeyListenerC67976V4r.A0J;
                    if (c67882V0n == null) {
                        return;
                    }
                    c67882V0n.A02();
                    return;
                }
                viewOnKeyListenerC67976V4r.A09 = C05F.A00;
                ViewOnKeyListenerC67976V4r.A00(viewOnKeyListenerC67976V4r);
                return;
            case 4:
                ((InterfaceC16820sZ) this.A01).invoke();
                return;
            case 5:
                ViewOnTouchListenerC65896Tw0 viewOnTouchListenerC65896Tw0 = (ViewOnTouchListenerC65896Tw0) this.A01;
                double d = ViewOnTouchListenerC65896Tw0.A0e;
                viewOnTouchListenerC65896Tw0.A0X.DOM();
                return;
            case 6:
                ViewGroup viewGroup = ((RunnableC71632Wxe) this.A01).A06.A00;
                viewGroup.getClass();
                viewGroup.setVisibility(0);
                return;
            default:
                XDT xdt = (XDT) this.A01;
                if (xdt != null) {
                    xdt.DDH();
                    return;
                }
                return;
        }
    }
}
