package X;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.common.session.UserSession;
import com.instagram.ui.widget.edittext.AnimatedHintsTextLayout;

/* loaded from: classes11.dex */
public final class U31 implements InterfaceC60152ox {
    public final int A00;
    public final Object A01;

    public U31(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // X.InterfaceC60152ox
    public final void DOK(int i, boolean z) {
        C7EL c7el;
        WTY wty;
        Activity rootActivity;
        AnimatedHintsTextLayout animatedHintsTextLayout;
        switch (this.A00) {
            case 0:
                C67904V1t c67904V1t = (C67904V1t) this.A01;
                if (c67904V1t.mView == null || (wty = c67904V1t.A00) == null || (rootActivity = c67904V1t.getRootActivity()) == null || rootActivity.getWindow() == null) {
                    return;
                }
                Activity rootActivity2 = c67904V1t.getRootActivity();
                if (rootActivity2 != null) {
                    if (!AbstractC13880nE.A0y(rootActivity2)) {
                        return;
                    }
                    Integer num = wty.A03;
                    if (num != null && num.intValue() == 16) {
                        Boolean bool = wty.A02;
                        if (bool == null || bool.equals(false)) {
                            Activity rootActivity3 = c67904V1t.getRootActivity();
                            if (rootActivity3 != null) {
                                AbstractC18680vv session = c67904V1t.getSession();
                                C14360o3.A0C(session, "null cannot be cast to non-null type com.instagram.common.session.UserSession");
                                i -= AbstractC53242c7.A0G(rootActivity3, AbstractC57322k7.A01((UserSession) session));
                            } else {
                                throw new IllegalStateException("Required value was null.");
                            }
                        }
                    } else {
                        i = 0;
                    }
                    int max = Math.max(i, 0);
                    View view = c67904V1t.mView;
                    if (view != null) {
                        View rootView = view.getRootView();
                        C14360o3.A07(rootView);
                        AbstractC13880nE.A0Y(rootView, max);
                        if (max <= 0) {
                            return;
                        }
                        View view2 = c67904V1t.mView;
                        if (view2 != null) {
                            View findFocus = view2.findFocus();
                            if (findFocus == null) {
                                return;
                            }
                            View.OnFocusChangeListener onFocusChangeListener = findFocus.getOnFocusChangeListener();
                            findFocus.setOnFocusChangeListener(null);
                            findFocus.post(new RunnableC71473WuZ(onFocusChangeListener, findFocus));
                            return;
                        }
                        throw new IllegalStateException("Required value was null.");
                    }
                    throw new IllegalStateException("Required value was null.");
                }
                throw new IllegalStateException("Required value was null.");
            case 1:
                ((C69554VrJ) this.A01).A00(new C66639URd(i));
                return;
            case 2:
                WjH wjH = (WjH) this.A01;
                wjH.A00 = AbstractC167007dF.A1O(i);
                float f = -i;
                ViewGroup viewGroup = wjH.A05;
                if (viewGroup.getTranslationY() != f) {
                    AbstractC125325le A00 = AbstractC125325le.A00(viewGroup);
                    A00.A0G();
                    AbstractC125325le A0E = A00.A0A().A0E(WEW.A0F);
                    A0E.A0K(f);
                    A0E.A0H();
                }
                c7el = wjH.A07;
                break;
            case 3:
                WjI wjI = (WjI) this.A01;
                wjI.A01 = AbstractC167007dF.A1O(i);
                float f2 = -i;
                ViewGroup viewGroup2 = wjI.A04;
                if (viewGroup2.getTranslationY() != f2) {
                    AbstractC125325le A002 = AbstractC125325le.A00(viewGroup2);
                    A002.A0G();
                    AbstractC125325le A0E2 = A002.A0A().A0E(WEW.A0F);
                    A0E2.A0K(f2);
                    A0E2.A0H();
                }
                c7el = wjI.A08;
                break;
            case 4:
                C65918TwP c65918TwP = (C65918TwP) this.A01;
                if (!c65918TwP.A0O || (animatedHintsTextLayout = c65918TwP.A05) == null) {
                    return;
                }
                ViewGroup.MarginLayoutParams A0G = AbstractC31177DnL.A0G(animatedHintsTextLayout);
                A0G.bottomMargin = Math.max(0, i - AbstractC57322k7.A00(c65918TwP.requireActivity()));
                animatedHintsTextLayout.setLayoutParams(A0G);
                return;
            default:
                ((U28) this.A01).A00 = i;
                return;
        }
        c7el.DOL(i);
    }
}
