package X;

import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import com.instagram.feed.widget.IgProgressImageView;
import com.instagram.ui.widget.roundedcornerlayout.RoundedCornerFrameLayout;

/* renamed from: X.6dv, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC143566dv extends C3OO implements InterfaceC143576dw {
    @Override // X.InterfaceC143576dw
    public final boolean AGV() {
        C65731Tt6 c65731Tt6;
        if ((this instanceof C143556du) && (c65731Tt6 = ((C143556du) this).A1Z.A02) != null) {
            View view = c65731Tt6.A02;
            boolean z = false;
            if (view.getVisibility() == 0) {
                z = true;
            }
            view.setVisibility(8);
            c65731Tt6.A01 = true;
            return z;
        }
        return false;
    }

    @Override // X.InterfaceC143576dw
    public final View Aoi() {
        if (this instanceof C143556du) {
            return ((C143556du) this).A01;
        }
        return null;
    }

    @Override // X.InterfaceC143576dw
    public final View AsV() {
        if (this instanceof C143556du) {
            return ((C143556du) this).A1e.A07;
        }
        return null;
    }

    @Override // X.InterfaceC143576dw
    public final View B2s() {
        if (this instanceof C143556du) {
            return ((C143556du) this).A03;
        }
        return null;
    }

    @Override // X.InterfaceC143576dw
    public final View B43() {
        if (this instanceof C143556du) {
            return ((C143556du) this).A1e.A08;
        }
        return null;
    }

    @Override // X.InterfaceC143576dw
    public RoundedCornerFrameLayout BRC() {
        if (this instanceof C143556du) {
            return ((C143556du) this).A1q;
        }
        if (this instanceof C140436Wx) {
            return ((C140436Wx) this).A0q;
        }
        if (this instanceof C138376Ot) {
            return ((C138376Ot) this).A0i;
        }
        if (this instanceof C138246Of) {
            Object value = ((C138246Of) this).A0B.getValue();
            C14360o3.A07(value);
            return (RoundedCornerFrameLayout) value;
        }
        return null;
    }

    @Override // X.InterfaceC143586dx
    public final C86013sY BRe() {
        if (this instanceof C140436Wx) {
            return ((C140436Wx) this).A0I;
        }
        if (this instanceof C143556du) {
            return ((C143556du) this).A0f;
        }
        return null;
    }

    @Override // X.InterfaceC143576dw
    public final View Bi2() {
        if (this instanceof C143556du) {
            return ((C143556du) this).A1V;
        }
        if (this instanceof C138376Ot) {
            return ((C138376Ot) this).A0S;
        }
        return null;
    }

    @Override // X.InterfaceC143576dw
    public ViewGroup Bld() {
        if (this instanceof C140436Wx) {
            return ((C140436Wx) this).A0S;
        }
        if (this instanceof C143556du) {
            return ((C143556du) this).A1k;
        }
        if (this instanceof C138376Ot) {
            return ((C138376Ot) this).A0U;
        }
        if (this instanceof C138246Of) {
            return ((C138246Of) this).A04;
        }
        return null;
    }

    @Override // X.InterfaceC143576dw
    public final View C0z() {
        if (this instanceof C143556du) {
            return ((C143556du) this).A1e.A09;
        }
        return null;
    }

    @Override // X.InterfaceC143576dw
    public final View C29() {
        if (this instanceof C143556du) {
            return ((C143556du) this).A1e.A06;
        }
        return null;
    }

    @Override // X.InterfaceC143576dw
    public final View C2E() {
        if (this instanceof C143556du) {
            return ((C143556du) this).A1e.A1f.getView();
        }
        return null;
    }

    @Override // X.InterfaceC143576dw
    public final C50561MTs C2R() {
        if (this instanceof C143556du) {
            return ((C143556du) this).A1e.A0l;
        }
        return null;
    }

    @Override // X.InterfaceC143576dw
    public InterfaceC56392iX C5B() {
        if (this instanceof C143556du) {
            return ((C143556du) this).A10;
        }
        if (this instanceof C140436Wx) {
            return ((C140436Wx) this).A0J;
        }
        if (this instanceof C138246Of) {
            return (InterfaceC56392iX) ((C138246Of) this).A0L.getValue();
        }
        return null;
    }

    @Override // X.InterfaceC143576dw
    public View C9H() {
        if (this instanceof C143556du) {
            return ((C143556du) this).A1e.A1M;
        }
        if (this instanceof C140436Wx) {
            return ((C140436Wx) this).A06.A01;
        }
        return null;
    }

    @Override // X.InterfaceC143576dw
    public final View C9I() {
        if (this instanceof C143556du) {
            return ((C143556du) this).A1e.A0F;
        }
        return null;
    }

    @Override // X.InterfaceC143576dw
    public final View C9J() {
        if (this instanceof C143556du) {
            return ((C143556du) this).A1e.A0y;
        }
        return null;
    }

    @Override // X.InterfaceC143576dw
    public final View CGQ() {
        if (this instanceof C143556du) {
            return ((C143556du) this).A1e.A0S;
        }
        return null;
    }

    @Override // X.InterfaceC143586dx
    public void D0K(boolean z) {
        IgProgressImageView BGy;
        if (this instanceof C140436Wx) {
            BGy = ((C140436Wx) this).A0L;
        } else if (this instanceof C143556du) {
            BGy = ((C143556du) this).BGy();
        } else {
            if (this instanceof C138376Ot) {
                ((C138376Ot) this).A0d.DzH(z);
                return;
            }
            if (!(this instanceof C138246Of)) {
                return;
            }
            C138246Of c138246Of = (C138246Of) this;
            c138246Of.A00().setVisibility(0);
            Object value = c138246Of.A06.getValue();
            C14360o3.A07(value);
            ((View) value).setVisibility(0);
            return;
        }
        BGy.setVisibility(0);
    }

    @Override // X.InterfaceC143576dw
    public final void EJj() {
        if (this instanceof C143556du) {
            C141926bB c141926bB = ((C143556du) this).A1Z;
            C65731Tt6 c65731Tt6 = c141926bB.A02;
            if (c65731Tt6 == null) {
                View A01 = c141926bB.A01.A01();
                C14360o3.A07(A01);
                c65731Tt6 = new C65731Tt6(A01);
                c141926bB.A02 = c65731Tt6;
            }
            View view = c65731Tt6.A02;
            view.setVisibility(0);
            view.setAlpha(1.0f);
            c65731Tt6.A01 = false;
        }
    }

    @Override // X.InterfaceC143586dx
    public final void Egt(int i) {
        View view;
        boolean z;
        if (this instanceof C138376Ot) {
            C138376Ot c138376Ot = (C138376Ot) this;
            if (i != 0) {
                if (i == 8) {
                    c138376Ot.A00();
                    return;
                }
                return;
            } else {
                C50549MTg c50549MTg = c138376Ot.A0e;
                if (c50549MTg == null) {
                    return;
                }
                c50549MTg.A00().A06();
                c50549MTg.A00().setVisibility(0);
                return;
            }
        }
        if (this instanceof C143556du) {
            C143556du c143556du = (C143556du) this;
            if (i == 0) {
                InterfaceC56392iX interfaceC56392iX = c143556du.A11;
                interfaceC56392iX.getView().setContentDescription(c143556du.A0S.getContext().getString(2131971949));
                if (!c143556du.A0K) {
                    AbstractC56932jR.A06(interfaceC56392iX.getView(), 500L);
                    c143556du.A0K = true;
                }
            } else {
                c143556du.A0K = false;
                if (i == 8) {
                    if (AbstractC25351Lp.A00(c143556du.A0e).A01() && !c143556du.A11.CWW()) {
                        return;
                    }
                    c143556du.A11.getView().setVisibility(8);
                    return;
                }
            }
            view = c143556du.A11.getView();
        } else if (this instanceof C140436Wx) {
            C140436Wx c140436Wx = (C140436Wx) this;
            if (i == 0) {
                if (!c140436Wx.A0C) {
                    AbstractC56932jR.A06(c140436Wx.A0Y.A08, 500L);
                    z = true;
                }
                view = c140436Wx.A0Y.A08;
            } else {
                z = false;
            }
            c140436Wx.A0C = z;
            view = c140436Wx.A0Y.A08;
        } else {
            if (!(this instanceof C138246Of)) {
                return;
            }
            Object value = ((C138246Of) this).A0Q.getValue();
            C14360o3.A07(value);
            view = (View) value;
        }
        view.setVisibility(i);
    }

    @Override // X.InterfaceC143576dw
    public final void EnN() {
        if (this instanceof C143556du) {
            C141926bB c141926bB = ((C143556du) this).A1Z;
            C65731Tt6 c65731Tt6 = c141926bB.A02;
            if (c65731Tt6 == null) {
                View A01 = c141926bB.A01.A01();
                C14360o3.A07(A01);
                c65731Tt6 = new C65731Tt6(A01);
                c141926bB.A02 = c65731Tt6;
            }
            if (c65731Tt6.A00 == null) {
                AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
                c65731Tt6.A00 = alphaAnimation;
                alphaAnimation.setStartOffset(300L);
                AlphaAnimation alphaAnimation2 = c65731Tt6.A00;
                C14360o3.A0A(alphaAnimation2);
                alphaAnimation2.setDuration(400L);
                AlphaAnimation alphaAnimation3 = c65731Tt6.A00;
                C14360o3.A0A(alphaAnimation3);
                alphaAnimation3.setAnimationListener(new AnimationAnimationListenerC65732Tt7(c65731Tt6));
            }
            c65731Tt6.A02.startAnimation(c65731Tt6.A00);
        }
    }

    @Override // X.InterfaceC143586dx
    public void onSurfaceTextureDestroyed() {
        View view;
        if (this instanceof C140436Wx) {
            view = ((C140436Wx) this).A0L;
        } else if (this instanceof C143556du) {
            view = ((C143556du) this).BGy();
        } else if (this instanceof C138376Ot) {
            view = ((C138376Ot) this).A0X;
        } else {
            if (!(this instanceof C138246Of)) {
                return;
            }
            Object value = ((C138246Of) this).A07.getValue();
            C14360o3.A07(value);
            view = (View) value;
        }
        view.setVisibility(0);
    }
}
