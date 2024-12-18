package X;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;

/* renamed from: X.IkP, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class ViewOnTouchListenerC42056IkP implements View.OnTouchListener {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;

    public ViewOnTouchListenerC42056IkP(int i, Object obj, Object obj2, Object obj3) {
        this.A00 = i;
        this.A02 = obj;
        this.A01 = obj2;
        this.A03 = obj3;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        AbstractC42425IqS abstractC42425IqS;
        C38321qM c38321qM;
        Object obj;
        switch (this.A00) {
            case 2:
                abstractC42425IqS = ((C38095GpO) this.A03).A03;
                c38321qM = ((HKU) this.A02).A01.A00;
                break;
            case 3:
                InterfaceC43449JHn interfaceC43449JHn = (InterfaceC43449JHn) this.A01;
                C38321qM c38321qM2 = (C38321qM) this.A03;
                C5qT c5qT = (C5qT) this.A02;
                C14360o3.A0A(view);
                C14360o3.A0A(motionEvent);
                return interfaceC43449JHn.DSM(motionEvent, view, c5qT, c38321qM2);
            case 4:
                abstractC42425IqS = ((C38094GpN) this.A03).A03;
                c38321qM = ((HKV) this.A02).A01;
                break;
            case 5:
                return false;
            case 6:
                ((GestureDetector) this.A02).onTouchEvent(motionEvent);
                int action = motionEvent.getAction();
                if (action != 1 && action != 3) {
                    return true;
                }
                InterfaceC144766fw interfaceC144766fw = (InterfaceC144766fw) this.A01;
                interfaceC144766fw.Dji();
                if (((C144526fY) this.A03).A01) {
                    return true;
                }
                interfaceC144766fw.Djh();
                return true;
            case 7:
                ((GestureDetector) this.A02).onTouchEvent(motionEvent);
                int action2 = motionEvent.getAction();
                if (action2 == 1 || action2 == 3) {
                    InterfaceC144766fw interfaceC144766fw2 = (InterfaceC144766fw) this.A01;
                    interfaceC144766fw2.Dji();
                    if (!((C144526fY) this.A03).A01) {
                        interfaceC144766fw2.Djf();
                        return true;
                    }
                    return true;
                }
                return true;
            default:
                abstractC42425IqS = (AbstractC42425IqS) this.A01;
                c38321qM = ((C37931GmT) this.A03).BQN();
                obj = this.A02;
                C14360o3.A0A(view);
                C14360o3.A0A(motionEvent);
                return abstractC42425IqS.DSM(motionEvent, view, (C5qT) obj, c38321qM);
        }
        obj = this.A01;
        C14360o3.A0A(view);
        C14360o3.A0A(motionEvent);
        return abstractC42425IqS.DSM(motionEvent, view, (C5qT) obj, c38321qM);
    }
}
