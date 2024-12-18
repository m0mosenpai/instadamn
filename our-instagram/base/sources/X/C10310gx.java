package X;

import android.graphics.Rect;
import android.transition.Transition;
import android.transition.TransitionManager;
import android.transition.TransitionSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.0gx, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10310gx extends C06v {
    @Override // X.C06v
    public final boolean A0L() {
        AbstractC10360h2.A0H(4);
        return false;
    }

    @Override // X.C06v
    public final boolean A0N(Object obj) {
        AbstractC10360h2.A0H(2);
        return false;
    }

    @Override // X.C06v
    public final Object A03(Object obj) {
        if (obj != null) {
            return ((Transition) obj).clone();
        }
        return null;
    }

    @Override // X.C06v
    public final Object A04(Object obj) {
        if (obj == null) {
            return null;
        }
        TransitionSet transitionSet = new TransitionSet();
        transitionSet.addTransition((Transition) obj);
        return transitionSet;
    }

    @Override // X.C06v
    public final Object A05(Object obj, Object obj2, Object obj3) {
        Transition transition = (Transition) obj;
        Transition transition2 = (Transition) obj2;
        Transition transition3 = (Transition) obj3;
        if (transition != null) {
            if (transition2 != null) {
                transition = new TransitionSet().addTransition(transition).addTransition(transition2).setOrdering(1);
            }
        } else {
            transition = null;
            if (transition2 != null) {
                transition = transition2;
            }
        }
        if (transition3 != null) {
            TransitionSet transitionSet = new TransitionSet();
            if (transition != null) {
                transitionSet.addTransition(transition);
            }
            transitionSet.addTransition(transition3);
            return transitionSet;
        }
        return transition;
    }

    @Override // X.C06v
    public final Object A06(Object obj, Object obj2, Object obj3) {
        TransitionSet transitionSet = new TransitionSet();
        if (obj != null) {
            transitionSet.addTransition((Transition) obj);
        }
        transitionSet.addTransition((Transition) obj2);
        return transitionSet;
    }

    @Override // X.C06v
    public final void A07(final Rect rect, Object obj) {
        ((Transition) obj).setEpicenterCallback(new Transition.EpicenterCallback() { // from class: X.06t
            @Override // android.transition.Transition.EpicenterCallback
            public final Rect onGetEpicenter(Transition transition) {
                Rect rect2 = rect;
                if (rect2.isEmpty()) {
                    return null;
                }
                return rect2;
            }
        });
    }

    @Override // X.C06v
    public final void A08(View view, Object obj) {
        ((Transition) obj).addTarget(view);
    }

    @Override // X.C06v
    public final void A09(View view, Object obj) {
        if (view != null) {
            final Rect rect = new Rect();
            C06v.A00(view, rect);
            ((Transition) obj).setEpicenterCallback(new Transition.EpicenterCallback() { // from class: X.06p
                @Override // android.transition.Transition.EpicenterCallback
                public final Rect onGetEpicenter(Transition transition) {
                    return rect;
                }
            });
        }
    }

    @Override // X.C06v
    public final void A0A(final View view, Object obj, final ArrayList arrayList) {
        ((Transition) obj).addListener(new Transition.TransitionListener() { // from class: X.06q
            @Override // android.transition.Transition.TransitionListener
            public final void onTransitionCancel(Transition transition) {
            }

            @Override // android.transition.Transition.TransitionListener
            public final void onTransitionPause(Transition transition) {
            }

            @Override // android.transition.Transition.TransitionListener
            public final void onTransitionResume(Transition transition) {
            }

            @Override // android.transition.Transition.TransitionListener
            public final void onTransitionEnd(Transition transition) {
                transition.removeListener(this);
                view.setVisibility(8);
                ArrayList arrayList2 = arrayList;
                int size = arrayList2.size();
                for (int i = 0; i < size; i++) {
                    ((View) arrayList2.get(i)).setVisibility(0);
                }
            }

            @Override // android.transition.Transition.TransitionListener
            public final void onTransitionStart(Transition transition) {
                transition.removeListener(this);
                transition.addListener(this);
            }
        });
    }

    @Override // X.C06v
    public final void A0B(View view, Object obj, ArrayList arrayList) {
        Transition transition = (Transition) obj;
        List<View> targets = transition.getTargets();
        targets.clear();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            C06v.A01((View) arrayList.get(i), targets);
        }
        targets.add(view);
        arrayList.add(view);
        A0I(transition, arrayList);
    }

    @Override // X.C06v
    public final void A0C(ViewGroup viewGroup, Object obj) {
        TransitionManager.beginDelayedTransition(viewGroup, (Transition) obj);
    }

    @Override // X.C06v
    public final void A0D(C62731SNv c62731SNv, Fragment fragment, Object obj, final Runnable runnable) {
        ((Transition) obj).addListener(new Transition.TransitionListener() { // from class: X.06s
            @Override // android.transition.Transition.TransitionListener
            public final void onTransitionCancel(Transition transition) {
            }

            @Override // android.transition.Transition.TransitionListener
            public final void onTransitionPause(Transition transition) {
            }

            @Override // android.transition.Transition.TransitionListener
            public final void onTransitionResume(Transition transition) {
            }

            @Override // android.transition.Transition.TransitionListener
            public final void onTransitionStart(Transition transition) {
            }

            @Override // android.transition.Transition.TransitionListener
            public final void onTransitionEnd(Transition transition) {
                runnable.run();
            }
        });
    }

    @Override // X.C06v
    public final void A0H(Object obj, final Object obj2, Object obj3, final Object obj4, final ArrayList arrayList, ArrayList arrayList2, final ArrayList arrayList3) {
        ((Transition) obj).addListener(new Transition.TransitionListener() { // from class: X.06r
            @Override // android.transition.Transition.TransitionListener
            public final void onTransitionCancel(Transition transition) {
            }

            @Override // android.transition.Transition.TransitionListener
            public final void onTransitionPause(Transition transition) {
            }

            @Override // android.transition.Transition.TransitionListener
            public final void onTransitionResume(Transition transition) {
            }

            @Override // android.transition.Transition.TransitionListener
            public final void onTransitionStart(Transition transition) {
                Object obj5 = obj2;
                if (obj5 != null) {
                    C10310gx.this.A0O(obj5, arrayList, null);
                }
                Object obj6 = obj4;
                if (obj6 != null) {
                    C10310gx.this.A0O(obj6, arrayList3, null);
                }
            }

            @Override // android.transition.Transition.TransitionListener
            public final void onTransitionEnd(Transition transition) {
                transition.removeListener(this);
            }
        });
    }

    @Override // X.C06v
    public final void A0I(Object obj, ArrayList arrayList) {
        Transition transition = (Transition) obj;
        if (transition != null) {
            int i = 0;
            if (transition instanceof TransitionSet) {
                TransitionSet transitionSet = (TransitionSet) transition;
                int transitionCount = transitionSet.getTransitionCount();
                while (i < transitionCount) {
                    A0I(transitionSet.getTransitionAt(i), arrayList);
                    i++;
                }
                return;
            }
            List<Integer> targetIds = transition.getTargetIds();
            if (targetIds == null || targetIds.isEmpty()) {
                List<String> targetNames = transition.getTargetNames();
                if (targetNames == null || targetNames.isEmpty()) {
                    List<Class> targetTypes = transition.getTargetTypes();
                    if (targetTypes == null || targetTypes.isEmpty()) {
                        List<View> targets = transition.getTargets();
                        if (targets == null || targets.isEmpty()) {
                            int size = arrayList.size();
                            while (i < size) {
                                transition.addTarget((View) arrayList.get(i));
                                i++;
                            }
                        }
                    }
                }
            }
        }
    }

    @Override // X.C06v
    public final void A0J(Object obj, ArrayList arrayList, ArrayList arrayList2) {
        Transition transition = (Transition) obj;
        if (transition != null) {
            transition.getTargets().clear();
            transition.getTargets().addAll(arrayList2);
            A0O(transition, arrayList, arrayList2);
        }
    }

    @Override // X.C06v
    public final boolean A0M(Object obj) {
        return obj instanceof Transition;
    }

    public final void A0O(Object obj, ArrayList arrayList, ArrayList arrayList2) {
        List<View> targets;
        Transition transition = (Transition) obj;
        int i = 0;
        if (transition instanceof TransitionSet) {
            TransitionSet transitionSet = (TransitionSet) transition;
            int transitionCount = transitionSet.getTransitionCount();
            while (i < transitionCount) {
                A0O(transitionSet.getTransitionAt(i), arrayList, arrayList2);
                i++;
            }
            return;
        }
        List<Integer> targetIds = transition.getTargetIds();
        if (targetIds == null || targetIds.isEmpty()) {
            List<String> targetNames = transition.getTargetNames();
            if (targetNames == null || targetNames.isEmpty()) {
                List<Class> targetTypes = transition.getTargetTypes();
                if ((targetTypes == null || targetTypes.isEmpty()) && (targets = transition.getTargets()) != null && targets.size() == arrayList.size() && targets.containsAll(arrayList)) {
                    if (arrayList2 != null) {
                        int size = arrayList2.size();
                        while (i < size) {
                            transition.addTarget((View) arrayList2.get(i));
                            i++;
                        }
                    }
                    int size2 = arrayList.size();
                    while (true) {
                        size2--;
                        if (size2 >= 0) {
                            transition.removeTarget((View) arrayList.get(size2));
                        } else {
                            return;
                        }
                    }
                }
            }
        }
    }
}
