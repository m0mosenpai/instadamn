package X;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import com.google.common.collect.ImmutableList;
import java.util.List;

/* renamed from: X.W4v, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC70120W4v {
    public final AbstractC69335Vlh A00;

    public final void A01(C3OO c3oo) {
        Drawable drawable;
        Drawable newDrawable;
        C14360o3.A0B(c3oo, 0);
        AbstractC69335Vlh abstractC69335Vlh = this.A00;
        W4A w4a = abstractC69335Vlh.A02;
        if (w4a != null) {
            c3oo.itemView.setFocusable(true);
            View view = c3oo.itemView;
            C14360o3.A06(view);
            w4a.A01(view);
        }
        int i = abstractC69335Vlh.A00;
        if (i != 0) {
            c3oo.itemView.setId(i);
        }
        if (this instanceof C67692UwJ) {
            if (c3oo instanceof C67705UwW) {
                ProgressBar progressBar = ((C67705UwW) c3oo).A00;
                Drawable.ConstantState constantState = progressBar.getIndeterminateDrawable().getConstantState();
                if (constantState != null && (newDrawable = constantState.newDrawable()) != null) {
                    drawable = newDrawable.mutate();
                    if (drawable != null) {
                        drawable.setColorFilter(AbstractC46530KiV.A00(C05F.A05, C2FP.A02().A07().A00(AbstractC166997dE.A0L(progressBar), 20)));
                    }
                } else {
                    drawable = null;
                }
                progressBar.setIndeterminateDrawable(drawable);
            } else {
                throw AbstractC58323PtF.A0v(this);
            }
        } else if (this instanceof C67696UwN) {
            C67696UwN c67696UwN = (C67696UwN) this;
            if (c3oo instanceof C67708UwZ) {
                C67689UwG c67689UwG = c67696UwN.A00;
                InterfaceC72024XFm interfaceC72024XFm = ((AbstractC69335Vlh) c67689UwG).A01;
                if (interfaceC72024XFm != null) {
                    View view2 = c3oo.itemView;
                    C14360o3.A06(view2);
                    interfaceC72024XFm.EPs(view2);
                }
                AbstractC69677VtM abstractC69677VtM = c67689UwG.A04;
                if (abstractC69677VtM != null) {
                    abstractC69677VtM.A02(((C67708UwZ) c3oo).A00);
                }
                AbstractC69677VtM abstractC69677VtM2 = c67689UwG.A05;
                if (abstractC69677VtM2 != null) {
                    abstractC69677VtM2.A02(((C67708UwZ) c3oo).A01);
                }
                AbstractC69677VtM abstractC69677VtM3 = c67689UwG.A06;
                if (abstractC69677VtM3 != null) {
                    abstractC69677VtM3.A02(((C67708UwZ) c3oo).A02);
                }
                View.OnClickListener onClickListener = c67689UwG.A03;
                if (onClickListener != null) {
                    C0fQ.A00(onClickListener, c3oo.itemView);
                }
                C67708UwZ c67708UwZ = (C67708UwZ) c3oo;
                ViewStub viewStub = c67708UwZ.A03;
                int i2 = c67689UwG.A01;
                float f = c67689UwG.A00;
                String A00 = AbstractC111324zv.A00(35);
                if (i2 != 1) {
                    if (i2 == 2) {
                        ViewGroup.LayoutParams layoutParams = viewStub.getLayoutParams();
                        C14360o3.A0C(layoutParams, A00);
                        layoutParams.height = -1;
                    }
                } else {
                    ViewGroup.LayoutParams layoutParams2 = viewStub.getLayoutParams();
                    C14360o3.A0C(layoutParams2, A00);
                    LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) layoutParams2;
                    layoutParams3.weight = f;
                    ((ViewGroup.LayoutParams) layoutParams3).width = 0;
                }
                ViewStub viewStub2 = c67708UwZ.A04;
                if (c67689UwG.A02 == 1) {
                    ViewGroup.LayoutParams layoutParams4 = viewStub2.getLayoutParams();
                    C14360o3.A0C(layoutParams4, A00);
                    LinearLayout.LayoutParams layoutParams5 = (LinearLayout.LayoutParams) layoutParams4;
                    layoutParams5.weight = 1.0f;
                    ((ViewGroup.LayoutParams) layoutParams5).width = 0;
                }
            } else {
                throw AbstractC58323PtF.A0v(c67696UwN);
            }
        } else if (this instanceof C67691UwI) {
            if (c3oo instanceof C67704UwV) {
                C67704UwV c67704UwV = (C67704UwV) c3oo;
                AbstractC31174DnI.A1C(c67704UwV.A00, C2FP.A02().A07().A00(AbstractC37301Gc2.A03(c67704UwV), 14));
            } else {
                throw AbstractC58323PtF.A0v(this);
            }
        } else if (this instanceof C67694UwL) {
            C67694UwL c67694UwL = (C67694UwL) this;
            if (c3oo instanceof C67706UwX) {
                C67706UwX c67706UwX = (C67706UwX) c3oo;
                ViewGroup viewGroup = c67706UwX.A01;
                viewGroup.removeAllViews();
                List list = c67706UwX.A02;
                list.clear();
                C67688UwF c67688UwF = c67694UwL.A00;
                View view3 = c3oo.itemView;
                C14360o3.A06(view3);
                InterfaceC72024XFm interfaceC72024XFm2 = c67688UwF.A01;
                if (interfaceC72024XFm2 != null) {
                    interfaceC72024XFm2.EPs(view3);
                }
                for (AbstractC70120W4v abstractC70120W4v : c67688UwF.A00) {
                    AbstractC66440UHq D8Y = ((InterfaceC71899X9j) c67706UwX.A00.get(abstractC70120W4v.A00.A05)).D8Y(viewGroup);
                    list.add(D8Y);
                    viewGroup.addView(D8Y.itemView);
                    abstractC70120W4v.A01(D8Y);
                }
            } else {
                throw AbstractC58323PtF.A0v(c67694UwL);
            }
        } else {
            C67693UwK c67693UwK = (C67693UwK) this;
            if (c3oo instanceof C67707UwY) {
                View view4 = c3oo.itemView;
                C14360o3.A06(view4);
                C67685UwC c67685UwC = c67693UwK.A00;
                InterfaceC72024XFm interfaceC72024XFm3 = c67685UwC.A00;
                if (interfaceC72024XFm3 != null) {
                    interfaceC72024XFm3.EPs(view4);
                }
                c3oo.itemView.setElevation(1.0f);
                AbstractC69677VtM abstractC69677VtM4 = c67685UwC.A02;
                if (abstractC69677VtM4 != null) {
                    abstractC69677VtM4.A02(((C67707UwY) c3oo).A01);
                }
                AbstractC69677VtM abstractC69677VtM5 = c67685UwC.A01;
                if (abstractC69677VtM5 != null) {
                    abstractC69677VtM5.A02(((C67707UwY) c3oo).A00);
                }
            } else {
                throw AbstractC58323PtF.A0v(c67693UwK);
            }
        }
        abstractC69335Vlh.A04.invoke();
    }

    public static void A00(C67689UwG c67689UwG, ImmutableList.Builder builder) {
        builder.add((Object) new C67696UwN(c67689UwG));
    }

    public boolean A02(AbstractC70120W4v abstractC70120W4v) {
        InterfaceC72024XFm interfaceC72024XFm;
        InterfaceC72024XFm interfaceC72024XFm2;
        if (abstractC70120W4v != null) {
            AbstractC69335Vlh abstractC69335Vlh = this.A00;
            int i = abstractC69335Vlh.A00;
            AbstractC69335Vlh abstractC69335Vlh2 = abstractC70120W4v.A00;
            if (i == abstractC69335Vlh2.A00 && abstractC69335Vlh.A05 == abstractC69335Vlh2.A05 && C14360o3.A0K(abstractC69335Vlh.A03, abstractC69335Vlh2.A03)) {
                if (abstractC69335Vlh instanceof C67685UwC) {
                    interfaceC72024XFm = ((C67685UwC) abstractC69335Vlh).A00;
                } else {
                    interfaceC72024XFm = abstractC69335Vlh.A01;
                }
                if (abstractC69335Vlh2 instanceof C67685UwC) {
                    interfaceC72024XFm2 = ((C67685UwC) abstractC69335Vlh2).A00;
                } else {
                    interfaceC72024XFm2 = abstractC69335Vlh2.A01;
                }
                if (C14360o3.A0K(interfaceC72024XFm, interfaceC72024XFm2) && C14360o3.A0K(abstractC69335Vlh.A04, abstractC69335Vlh2.A04)) {
                    return true;
                }
            }
        }
        return false;
    }

    public AbstractC70120W4v(AbstractC69335Vlh abstractC69335Vlh) {
        this.A00 = abstractC69335Vlh;
    }
}
