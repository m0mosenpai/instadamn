package X;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.EditText;
import androidx.appcompat.widget.SearchView;
import com.instagram.discovery.mediamap.fragment.LocationSearchFragment;
import com.instagram.survey.structuredsurvey.views.SurveyEditTextListItemView;

/* loaded from: classes11.dex */
public final class WNY implements View.OnFocusChangeListener {
    public final int A00;
    public final Object A01;

    public WNY(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z) {
        VIW viw;
        String str;
        VEQ veq;
        switch (this.A00) {
            case 0:
                SearchView searchView = (SearchView) this.A01;
                View.OnFocusChangeListener onFocusChangeListener = searchView.A02;
                if (onFocusChangeListener == null) {
                    return;
                }
                onFocusChangeListener.onFocusChange(searchView, z);
                return;
            case 1:
                C67677Uvp c67677Uvp = (C67677Uvp) this.A01;
                UvM uvM = c67677Uvp.A04;
                str = "viewModel";
                if (uvM != null) {
                    MSX.A1B(uvM.A0E, z);
                    Boolean bool = true;
                    UvM uvM2 = c67677Uvp.A04;
                    if (uvM2 != null) {
                        if (bool.equals(uvM2.A06.A02())) {
                            c67677Uvp.setStyle(VEQ.A07);
                        } else {
                            if (z) {
                                UvM uvM3 = c67677Uvp.A04;
                                if (uvM3 != null) {
                                    if (uvM3.A0Q) {
                                        veq = VEQ.A05;
                                    } else {
                                        veq = VEQ.A08;
                                    }
                                }
                            } else {
                                veq = VEQ.A06;
                            }
                            c67677Uvp.A0P(veq, true);
                            UvM uvM4 = c67677Uvp.A04;
                            if (uvM4 != null) {
                                C67677Uvp.A06(c67677Uvp, (C70071W1o) uvM4.A07.A02());
                            }
                        }
                        C67677Uvp.A05(c67677Uvp);
                        return;
                    }
                }
                C14360o3.A0F(str);
                throw C00O.createAndThrow();
            case 2:
                boolean z2 = true;
                boolean z3 = !TextUtils.isEmpty(((EditText) view).getText());
                C67776Uxs c67776Uxs = (C67776Uxs) this.A01;
                if (!z3 || !z) {
                    z2 = false;
                }
                C67776Uxs.A00(c67776Uxs, z2);
                return;
            case 3:
                C67777Uxt c67777Uxt = (C67777Uxt) this.A01;
                ((AbstractC69084Vha) c67777Uxt).A02.setEndIconActivated(z);
                if (z) {
                    return;
                }
                C67777Uxt.A02(c67777Uxt, false);
                c67777Uxt.A06 = false;
                return;
            case 4:
                UFV A00 = C70827Whk.A00((C70827Whk) this.A01);
                if (z) {
                    viw = C68026V6u.A00;
                } else {
                    viw = C68027V6v.A00;
                }
                UFV.A02(viw, A00);
                return;
            case 5:
                C70861WiR c70861WiR = (C70861WiR) this.A01;
                if (z) {
                    ((C88W) c70861WiR.A0S.getValue()).A00();
                    C14360o3.A0A(view);
                    C14360o3.A0B(view, 0);
                    AbstractC13880nE.A0S(view);
                    return;
                }
                if (c70861WiR.A0E.length() == 0) {
                    c70861WiR.A0E = c70861WiR.A0H.getString(2131955125);
                }
                ((C88W) c70861WiR.A0S.getValue()).A01();
                AbstractC167007dF.A1C(view);
                AbstractC13880nE.A0O(view);
                return;
            case 6:
                if (!(view instanceof EditText)) {
                    return;
                }
                C70860WiQ c70860WiQ = (C70860WiQ) this.A01;
                if (z) {
                    ((C88W) c70860WiQ.A0J.getValue()).A00();
                    C14360o3.A0B(view, 0);
                    AbstractC13880nE.A0S(view);
                    return;
                }
                EditText editText = c70860WiQ.A04;
                if (editText == null) {
                    str = "questionView";
                } else {
                    if (editText.hasFocus()) {
                        return;
                    }
                    ViewGroup viewGroup = c70860WiQ.A02;
                    if (viewGroup == null) {
                        str = "optionsContainer";
                    } else {
                        C12500ku c12500ku = new C12500ku(viewGroup);
                        while (c12500ku.hasNext()) {
                            if (((View) c12500ku.next()).hasFocus()) {
                                return;
                            }
                        }
                        ((C88W) c70860WiQ.A0J.getValue()).A01();
                        C14360o3.A0B(view, 0);
                        AbstractC13880nE.A0O(view);
                        C70860WiQ.A02(c70860WiQ);
                        return;
                    }
                }
                C14360o3.A0F(str);
                throw C00O.createAndThrow();
            case 7:
                LocationSearchFragment locationSearchFragment = (LocationSearchFragment) this.A01;
                if (view != locationSearchFragment.mSearchEditText) {
                    return;
                }
                LocationSearchFragment.A00(locationSearchFragment, z);
                return;
            case 8:
                UB6.A02(view, (UB6) this.A01, z);
                if (z) {
                    return;
                }
                ViewParent parent = view.getParent();
                parent.getClass();
                SurveyEditTextListItemView surveyEditTextListItemView = (SurveyEditTextListItemView) parent;
                ((VAW) ((UCs) surveyEditTextListItemView).A00).A00(AbstractC167007dF.A0g(surveyEditTextListItemView.A00));
                return;
            case 9:
                UB6.A02(view, (UB6) this.A01, z);
                return;
            default:
                UB6 ub6 = (UB6) this.A01;
                UB6.A02(view, ub6, z);
                if (z) {
                    Object parent2 = view.getParent();
                    parent2.getClass();
                    UB6.A01((View) parent2, ub6);
                    return;
                }
                return;
        }
    }
}
