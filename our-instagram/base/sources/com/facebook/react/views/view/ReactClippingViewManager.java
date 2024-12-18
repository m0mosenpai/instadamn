package com.facebook.react.views.view;

import X.AbstractC05810Sj;
import X.AbstractC167017dG;
import X.AbstractC25229BEm;
import X.C14360o3;
import X.Q4W;
import android.view.View;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.uimanager.annotations.ReactProp;

/* loaded from: classes10.dex */
public abstract class ReactClippingViewManager extends ViewGroupManager {
    public ReactClippingViewManager() {
        super(null);
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager
    public View getChildAt(Q4W q4w, int i) {
        C14360o3.A0B(q4w, 0);
        if (q4w.A07) {
            if (i >= 0 && i < q4w.A00) {
                View[] viewArr = q4w.A08;
                AbstractC05810Sj.A00(viewArr);
                return viewArr[i];
            }
            return null;
        }
        return q4w.getChildAt(i);
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager
    public int getChildCount(Q4W q4w) {
        C14360o3.A0B(q4w, 0);
        if (q4w.A07) {
            return q4w.A00;
        }
        return q4w.getChildCount();
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager
    public void removeAllViews(Q4W q4w) {
        C14360o3.A0B(q4w, 0);
        if (q4w.A07) {
            AbstractC05810Sj.A00(q4w.A08);
            for (int i = 0; i < q4w.A00; i++) {
                q4w.A08[i].removeOnLayoutChangeListener(q4w.A05);
            }
            q4w.removeAllViewsInLayout();
            q4w.A00 = 0;
            return;
        }
        q4w.removeAllViews();
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager
    public void removeViewAt(Q4W q4w, int i) {
        C14360o3.A0B(q4w, 0);
        if (q4w.A07) {
            View childAt = getChildAt(q4w, i);
            if (childAt != null) {
                if (childAt.getParent() != null) {
                    q4w.removeView(childAt);
                }
                AbstractC05810Sj.A02(q4w.A07);
                AbstractC05810Sj.A00(q4w.A01);
                AbstractC05810Sj.A00(q4w.A08);
                childAt.removeOnLayoutChangeListener(q4w.A05);
                int i2 = q4w.A00;
                View[] viewArr = q4w.A08;
                AbstractC05810Sj.A00(viewArr);
                int i3 = 0;
                while (true) {
                    if (i3 < i2) {
                        if (viewArr[i3] == childAt) {
                            break;
                        } else {
                            i3++;
                        }
                    } else {
                        i3 = -1;
                        break;
                    }
                }
                if (q4w.A08[i3].getParent() != null) {
                    int i4 = 0;
                    for (int i5 = 0; i5 < i3; i5++) {
                        if (q4w.A08[i5].getParent() == null) {
                            i4++;
                        }
                    }
                    q4w.removeViewsInLayout(i3 - i4, 1);
                }
                View[] viewArr2 = q4w.A08;
                AbstractC05810Sj.A00(viewArr2);
                int i6 = q4w.A00;
                int i7 = i6 - 1;
                if (i3 != i7) {
                    if (i3 >= 0 && i3 < i6) {
                        System.arraycopy(viewArr2, i3 + 1, viewArr2, i3, (i6 - i3) - 1);
                        i7 = q4w.A00 - 1;
                    } else {
                        throw new IndexOutOfBoundsException();
                    }
                }
                q4w.A00 = i7;
                viewArr2[i7] = null;
                return;
            }
            return;
        }
        q4w.removeViewAt(i);
    }

    @ReactProp(name = "removeClippedSubviews")
    public void setRemoveClippedSubviews(Q4W q4w, boolean z) {
        C14360o3.A0B(q4w, 0);
        q4w.setRemoveClippedSubviews(z);
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager
    public void addView(Q4W q4w, View view, int i) {
        AbstractC167017dG.A1N(q4w, view);
        if (q4w.A07) {
            AbstractC05810Sj.A00(q4w.A01);
            AbstractC05810Sj.A00(q4w.A08);
            View[] viewArr = q4w.A08;
            AbstractC05810Sj.A00(viewArr);
            int i2 = q4w.A00;
            int length = viewArr.length;
            if (i == i2) {
                if (length == i2) {
                    View[] viewArr2 = new View[length + 12];
                    q4w.A08 = viewArr2;
                    System.arraycopy(viewArr, 0, viewArr2, 0, length);
                    viewArr = q4w.A08;
                }
                int i3 = q4w.A00;
                q4w.A00 = i3 + 1;
                viewArr[i3] = view;
            } else if (i < i2) {
                if (length == i2) {
                    View[] viewArr3 = new View[length + 12];
                    q4w.A08 = viewArr3;
                    System.arraycopy(viewArr, 0, viewArr3, 0, i);
                    System.arraycopy(viewArr, i, q4w.A08, i + 1, i2 - i);
                    viewArr = q4w.A08;
                } else {
                    System.arraycopy(viewArr, i, viewArr, i + 1, i2 - i);
                }
                viewArr[i] = view;
                q4w.A00++;
            } else {
                throw AbstractC25229BEm.A0l("index=", " count=", i, i2);
            }
            int i4 = 0;
            for (int i5 = 0; i5 < i; i5++) {
                if (q4w.A08[i5].getParent() == null) {
                    i4++;
                }
            }
            Q4W.A02(q4w.A01, q4w, i, i4);
            view.addOnLayoutChangeListener(q4w.A05);
            return;
        }
        q4w.addView(view, i);
    }
}
