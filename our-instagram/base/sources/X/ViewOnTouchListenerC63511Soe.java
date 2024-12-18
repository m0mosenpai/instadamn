package X;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import java.util.List;

/* renamed from: X.Soe, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class ViewOnTouchListenerC63511Soe implements View.OnTouchListener {
    public final int A00;
    public final Object A01;

    public ViewOnTouchListenerC63511Soe(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public static void A00(View view, int i, Object obj) {
        view.setOnTouchListener(new ViewOnTouchListenerC63511Soe(obj, i));
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        String str;
        switch (this.A00) {
            case 6:
                if (!view.hasFocus()) {
                    view.requestFocus();
                    return false;
                }
                return false;
            case 7:
                return true;
            case 8:
                ((GestureDetector) this.A01).onTouchEvent(motionEvent);
                return false;
            case 9:
                Rb4 rb4 = (Rb4) this.A01;
                if (!rb4.A06) {
                    rb4.A06 = true;
                    C18920wW c18920wW = rb4.A00;
                    List list = null;
                    if (c18920wW == null) {
                        str = "typedLogger";
                    } else {
                        InterfaceC02590Ai A00 = c18920wW.A00(C12180kM.A05, "playable_ads_user_start_interaction");
                        String str2 = rb4.A04;
                        if (str2 == null) {
                            str = "eventSessionID";
                        } else {
                            A00.AAP(AbstractC31189DnY.A03(21, 10, 42), str2);
                            A00.AAP(AbstractC111324zv.A00(528), rb4.A03);
                            String str3 = rb4.A05;
                            if (str3 != null) {
                                list = AbstractC009903n.A0J(new String[]{str3});
                            }
                            A00.AAk("tracking", list);
                            A00.Cht();
                            return false;
                        }
                    }
                    C14360o3.A0F(str);
                    throw C00O.createAndThrow();
                }
                return false;
            default:
                Q7i q7i = (Q7i) this.A01;
                WO6 wo6 = q7i.A01;
                if (wo6 == null) {
                    wo6 = new WO6(q7i.getActivity(), ((C0SG) q7i).A01.getWindow().getDecorView(), q7i);
                    q7i.A01 = wo6;
                }
                return wo6.onTouch(view, motionEvent);
        }
    }
}
