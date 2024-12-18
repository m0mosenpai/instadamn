package X;

import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.facebook.onecamera.outputcontrollers.camera.basic.BasicCameraOutputController;
import com.meta.compose.component.swipeable.SwipeableState;

/* loaded from: classes4.dex */
public final class B5Z extends AbstractC23611Dp implements InterfaceC16620sF {
    public Object A00;
    public final float A01;
    public final int A02;
    public final Object A03;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public B5Z(SwipeableState swipeableState, InterfaceC23621Ds interfaceC23621Ds, float f) {
        super(2, interfaceC23621Ds);
        this.A02 = 2;
        this.A01 = f;
        this.A03 = swipeableState;
    }

    @Override // X.C1Dr
    public final InterfaceC23621Ds create(Object obj, InterfaceC23621Ds interfaceC23621Ds) {
        Object obj2;
        Object obj3;
        float f;
        int i;
        switch (this.A02) {
            case 0:
                obj2 = this.A03;
                obj3 = this.A00;
                f = this.A01;
                i = 0;
                break;
            case 1:
                obj2 = this.A03;
                obj3 = this.A00;
                f = this.A01;
                i = 1;
                break;
            default:
                B5Z b5z = new B5Z((SwipeableState) this.A03, interfaceC23621Ds, this.A01);
                b5z.A00 = obj;
                return b5z;
        }
        return new B5Z(obj2, obj3, interfaceC23621Ds, f, i);
    }

    @Override // X.C1Dr
    public final Object invokeSuspend(Object obj) {
        WindowManager windowManager;
        Display defaultDisplay;
        switch (this.A02) {
            case 0:
                AbstractC09560e7.A00(obj);
                DisplayMetrics displayMetrics = new DisplayMetrics();
                FragmentActivity activity = ((Fragment) this.A03).getActivity();
                if (activity != null && (windowManager = activity.getWindowManager()) != null && (defaultDisplay = windowManager.getDefaultDisplay()) != null) {
                    defaultDisplay.getMetrics(displayMetrics);
                }
                ((C3DN) this.A00).A0G(this.A01);
                break;
            case 1:
                AbstractC09560e7.A00(obj);
                C184848Hz c184848Hz = (C184848Hz) this.A03;
                C1EM.A00(C8I1.A03, C8I1.A02, c184848Hz.A09);
                C174757qB c174757qB = (C174757qB) this.A00;
                float f = this.A01;
                AbstractC184688Hj abstractC184688Hj = c184848Hz.A06;
                C175007qa c175007qa = ((BasicCameraOutputController) C174757qB.A02(c174757qB)).A04;
                if (c175007qa != null) {
                    c175007qa.A0N.EmH(abstractC184688Hj, f);
                    break;
                }
                break;
            default:
                AbstractC09560e7.A00(obj);
                ((InterfaceC30901DiE) this.A00).AQM(this.A01 - AbstractC166987dD.A09(((SwipeableState) this.A03).A04.getValue()));
                break;
        }
        return C0eB.A00;
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((B5Z) AbstractC166987dD.A1M(obj2, obj, this)).invokeSuspend(C0eB.A00);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public B5Z(Object obj, Object obj2, InterfaceC23621Ds interfaceC23621Ds, float f, int i) {
        super(2, interfaceC23621Ds);
        this.A02 = i;
        this.A03 = obj;
        this.A00 = obj2;
        this.A01 = f;
    }
}
