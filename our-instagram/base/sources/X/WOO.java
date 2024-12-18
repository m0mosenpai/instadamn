package X;

import android.animation.AnimatorSet;
import android.view.View;
import android.view.ViewTreeObserver;
import com.instagram.ui.widget.expanding.ExpandingListView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* loaded from: classes11.dex */
public final class WOO implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ int A00;
    public final /* synthetic */ View A01;
    public final /* synthetic */ ViewTreeObserver A02;
    public final /* synthetic */ ExpandingListView A03;
    public final /* synthetic */ HashMap A04;

    public WOO(View view, ViewTreeObserver viewTreeObserver, ExpandingListView expandingListView, HashMap hashMap, int i) {
        this.A03 = expandingListView;
        this.A02 = viewTreeObserver;
        this.A01 = view;
        this.A04 = hashMap;
        this.A00 = i;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        this.A02.removeOnPreDrawListener(this);
        ArrayList arrayList = new ArrayList();
        ExpandingListView expandingListView = this.A03;
        View view = this.A01;
        int indexOfChild = expandingListView.indexOfChild(view);
        if (indexOfChild >= 0) {
            int i = indexOfChild - 1;
            if (expandingListView.getChildAt(i) != null) {
                View childAt = expandingListView.getChildAt(i);
                int childCount = expandingListView.getChildCount();
                int top = view.getTop();
                HashMap hashMap = this.A04;
                Object obj = hashMap.get(view);
                obj.getClass();
                int i2 = top - ((int[]) obj)[0];
                HashSet hashSet = new HashSet();
                while (indexOfChild < childCount) {
                    View childAt2 = expandingListView.getChildAt(indexOfChild);
                    int[] iArr = (int[]) hashMap.get(childAt2);
                    hashSet.add(childAt2);
                    if (iArr == null) {
                        int top2 = childAt2.getTop();
                        int i3 = this.A00;
                        childAt2.setTop(top2 - i3);
                        childAt2.setBottom(childAt2.getBottom() - i3);
                    } else {
                        childAt2.setTop(iArr[0]);
                        childAt2.setBottom(iArr[1]);
                    }
                    if (childAt2.getParent() == null) {
                        expandingListView.A02.add(childAt2);
                        float f = this.A00;
                        arrayList.add(ExpandingListView.A00(childAt2, childAt, f, f, i2));
                    } else {
                        if (childAt2 != view) {
                            float f2 = this.A00;
                            arrayList.add(ExpandingListView.A00(childAt2, childAt, f2, f2, i2));
                        }
                        childAt2.setHasTransientState(false);
                    }
                    indexOfChild++;
                }
                Iterator A0l = AbstractC167007dF.A0l(hashMap);
                while (A0l.hasNext()) {
                    View view2 = (View) A0l.next();
                    if (!hashSet.contains(view2) && view2 != childAt) {
                        Object obj2 = hashMap.get(view2);
                        obj2.getClass();
                        view2.setTop(((int[]) obj2)[0]);
                        Object obj3 = hashMap.get(view2);
                        obj3.getClass();
                        view2.setBottom(((int[]) obj3)[1]);
                        expandingListView.A02.add(view2);
                        float f3 = this.A00;
                        arrayList.add(ExpandingListView.A00(view2, childAt, f3, f3, i2));
                    }
                }
                arrayList.add(ExpandingListView.A00(view, childAt, 0.0f, this.A00, i2));
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.playTogether(arrayList);
                U5Q.A00(animatorSet, this, 24);
                animatorSet.start();
            }
        }
        return true;
    }
}
