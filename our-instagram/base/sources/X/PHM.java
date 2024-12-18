package X;

import android.view.View;
import android.view.animation.RotateAnimation;
import com.facebook.R;
import com.instagram.direct.fragment.recipientpicker.controller.DirectPrivateStoryRecipientController;
import com.instagram.tagging.activity.TaggingActivity;
import java.util.ArrayList;

/* loaded from: classes9.dex */
public final class PHM implements InterfaceC125355lh {
    public final int A00;
    public final Object A01;

    public PHM(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public static void A00(AbstractC125325le abstractC125325le, Object obj, int i) {
        abstractC125325le.A05 = new PHM(obj, i);
        abstractC125325le.A0H();
    }

    @Override // X.InterfaceC125355lh
    public final void onFinish() {
        View view;
        switch (this.A00) {
            case 0:
                ((NS8) this.A01).A01.A00 = null;
                return;
            case 1:
                view = ((CountDownTimerC50750MbF) this.A01).A02.A08;
                break;
            case 2:
                C50643MXf c50643MXf = (C50643MXf) this.A01;
                C50643MXf.A0A(c50643MXf, false);
                view = c50643MXf.A0N;
                break;
            case 3:
                ((DirectPrivateStoryRecipientController) this.A01).A04.requireViewById(R.id.send_button).setClickable(true);
                return;
            case 4:
                ((MYM) this.A01).A0A.setVisibility(4);
                return;
            case 5:
                AbstractC166987dD.A1Y(this.A01);
                return;
            case 6:
                OUL oul = (OUL) this.A01;
                oul.A00.postDelayed(oul.A05, 1000L);
                return;
            case 7:
                OUL oul2 = (OUL) this.A01;
                oul2.A01.setVisibility(8);
                TaggingActivity taggingActivity = (TaggingActivity) oul2.A04;
                C55136Oc4 c55136Oc4 = taggingActivity.A0F;
                if (c55136Oc4 == null) {
                    C14360o3.A0F("helpTextController");
                } else {
                    ArrayList arrayList = taggingActivity.A0N;
                    if (arrayList == null) {
                        AbstractC50522MSa.A0t();
                    } else {
                        boolean z = false;
                        if (AbstractC50523MSb.A0J(taggingActivity, arrayList).A03 == EnumC40111tc.A0Q && TaggingActivity.A00(taggingActivity) == 0) {
                            z = true;
                        }
                        c55136Oc4.A03(z, AbstractC167007dF.A1W(taggingActivity.A0E));
                        return;
                    }
                }
                throw C00O.createAndThrow();
            case 8:
                RotateAnimation A00 = AbstractC55163OdR.A00();
                View view2 = (View) this.A01;
                A00.setAnimationListener(new AnimationAnimationListenerC35726Fq0(view2, 8));
                view2.startAnimation(A00);
                return;
            default:
                C11T.A04(new PP9((C25370BKn) this.A01), 1000L);
                return;
        }
        view.setVisibility(8);
    }
}
