package X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;

/* renamed from: X.U7y, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C66300U7y extends AnimatorListenerAdapter {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public C66300U7y(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = obj2;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.A00) {
            case 0:
                ((C005001p) this.A02).remove(animator);
                ((AbstractC66024TyM) this.A01).A0F.remove(animator);
                return;
            case 1:
                C66340UAd c66340UAd = (C66340UAd) this.A02;
                C69465Vno c69465Vno = (C69465Vno) this.A01;
                VaZ vaZ = c69465Vno.A09;
                if (vaZ == null || c66340UAd.A03.hasMessages(1, c69465Vno)) {
                    return;
                }
                C66340UAd.A04(c69465Vno, c66340UAd, vaZ);
                return;
            case 2:
                ((View) this.A01).getLayoutParams().height = -2;
                AbstractC43592JPx.A1F((View) this.A02, -2);
                return;
            case 3:
                ImageView imageView = (ImageView) this.A01;
                imageView.setVisibility(8);
                imageView.setImageDrawable(null);
                break;
            case 4:
                break;
            case 5:
                AbstractC43593JPy.A1Q(this.A01);
                ((C54768OIf) this.A02).A01 = false;
                return;
            case 6:
                OU9 ou9 = (OU9) this.A02;
                View view = ou9.A02;
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                C14360o3.A0C(layoutParams, AbstractC111324zv.A00(35));
                LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
                InterfaceC71963XCp interfaceC71963XCp = (InterfaceC71963XCp) this.A01;
                layoutParams2.weight = 1.0f;
                int i = 0;
                ((ViewGroup.LayoutParams) layoutParams2).width = 0;
                if (ou9.A04) {
                    ((ViewGroup.MarginLayoutParams) layoutParams2).rightMargin = 0;
                    if (ou9.A00) {
                        i = view.getLeft();
                    }
                    ((ViewGroup.MarginLayoutParams) layoutParams2).leftMargin = i;
                } else {
                    ((ViewGroup.MarginLayoutParams) layoutParams2).leftMargin = 0;
                    if (ou9.A00) {
                        i = view.getLeft();
                    }
                    ((ViewGroup.MarginLayoutParams) layoutParams2).rightMargin = i;
                }
                view.setLayoutParams(layoutParams2);
                interfaceC71963XCp.DDW();
                return;
            default:
                ((View) this.A01).setVisibility(8);
                ((View) this.A02).setVisibility(8);
                return;
        }
        ((View) this.A02).setVisibility(0);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.A00) {
            case 0:
                ((AbstractC66024TyM) this.A01).A0F.add(animator);
                return;
            case 1:
                ((C69465Vno) this.A01).A0A = false;
                return;
            case 2:
            case 3:
            case 5:
            default:
                super.onAnimationStart(animator);
                return;
            case 4:
                ((View) this.A01).setVisibility(0);
                return;
            case 6:
                ((InterfaceC71963XCp) this.A01).onStart();
                return;
            case 7:
                return;
        }
    }
}
