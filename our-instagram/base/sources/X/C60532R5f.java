package X;

import android.os.Handler;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import com.facebook.react.uimanager.ViewGroupManager;
import java.util.HashMap;

/* renamed from: X.R5f, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C60532R5f extends T0b {
    public final int[] A00;
    public final int[] A01;
    public final C62959SZc[] A02;
    public final /* synthetic */ SZN A03;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C60532R5f(SZN szn, int[] iArr, int[] iArr2, C62959SZc[] c62959SZcArr, int i) {
        super(szn, i);
        this.A03 = szn;
        this.A00 = iArr;
        this.A02 = c62959SZcArr;
        this.A01 = iArr2;
    }

    @Override // X.InterfaceC65362Tit
    public final void ATI() {
        Animation A00;
        C63309ShF c63309ShF = this.A03.A0L;
        int i = super.A00;
        int[] iArr = this.A00;
        C62959SZc[] c62959SZcArr = this.A02;
        int[] iArr2 = this.A01;
        synchronized (c63309ShF) {
            HashMap hashMap = c63309ShF.A00;
            if (hashMap == null) {
                hashMap = AbstractC166987dD.A1G();
                c63309ShF.A00 = hashMap;
            }
            Integer valueOf = Integer.valueOf(i);
            if (!hashMap.containsKey(valueOf)) {
                c63309ShF.A00.put(valueOf, AbstractC166987dD.A1H());
            }
            java.util.Set set = (java.util.Set) c63309ShF.A00.get(valueOf);
            SparseArray sparseArray = c63309ShF.A03;
            ViewGroup viewGroup = (ViewGroup) sparseArray.get(i);
            ViewGroupManager viewGroupManager = (ViewGroupManager) c63309ShF.A04(i);
            if (viewGroup != null) {
                int childCount = viewGroupManager.getChildCount(viewGroup);
                if (iArr != null) {
                    int length = iArr.length - 1;
                    while (length >= 0) {
                        int i2 = iArr[length];
                        if (i2 >= 0) {
                            if (viewGroupManager.getChildAt(viewGroup, i2) == null) {
                                if (!c63309ShF.A04.get(i) || viewGroupManager.getChildCount(viewGroup) != 0) {
                                    throw new R3C(AnonymousClass001.A0x("Trying to remove a view index above child count ", " view tag: ", "\n detail: ", C63309ShF.A01(viewGroup, viewGroupManager, iArr, iArr2, c62959SZcArr), i2, i));
                                }
                            } else if (i2 < childCount) {
                                View childAt = viewGroupManager.getChildAt(viewGroup, i2);
                                if (c63309ShF.A09 && c63309ShF.A08.A02(childAt)) {
                                    int id = childAt.getId();
                                    if (iArr2 != null) {
                                        for (int i3 : iArr2) {
                                            if (i3 != id) {
                                            }
                                        }
                                    }
                                }
                                viewGroupManager.removeViewAt(viewGroup, i2);
                                length--;
                                childCount = i2;
                            } else {
                                throw new R3C(AnonymousClass001.A0x("Trying to remove an out of order view index:", " view tag: ", "\n detail: ", C63309ShF.A01(viewGroup, viewGroupManager, iArr, iArr2, c62959SZcArr), i2, i));
                            }
                        } else {
                            throw new R3C(AnonymousClass001.A0x("Trying to remove a negative view index:", " view tag: ", "\n detail: ", C63309ShF.A01(viewGroup, viewGroupManager, iArr, iArr2, c62959SZcArr), i2, i));
                        }
                    }
                }
                if (iArr2 != null) {
                    for (int i4 : iArr2) {
                        View view = (View) sparseArray.get(i4);
                        if (view != null) {
                            if (c63309ShF.A09) {
                                SZp sZp = c63309ShF.A08;
                                if (sZp.A02(view)) {
                                    set.add(Integer.valueOf(i4));
                                    C62691SMf c62691SMf = new C62691SMf(view, viewGroup, c63309ShF, viewGroupManager, set, i);
                                    AbstractC62998SaM abstractC62998SaM = sZp.A05;
                                    int left = view.getLeft();
                                    int top = view.getTop();
                                    int width = view.getWidth();
                                    int height = view.getHeight();
                                    if (abstractC62998SaM.A02() && (A00 = abstractC62998SaM.A00(view, left, top, width, height)) != null) {
                                        A00.setDuration(abstractC62998SaM.A01);
                                        A00.setStartOffset(abstractC62998SaM.A00);
                                        A00.setInterpolator(abstractC62998SaM.A02);
                                        SZp.A00(view, sZp);
                                        A00.setAnimationListener(new AnimationAnimationListenerC63519Som(0, sZp, c62691SMf));
                                        long duration = A00.getDuration();
                                        if (duration > sZp.A00) {
                                            if (sZp.A01 != null) {
                                                Handler A002 = C63255SgD.A00();
                                                A002.removeCallbacks(sZp.A01);
                                                A002.postDelayed(sZp.A01, duration);
                                            }
                                            sZp.A00 = duration;
                                        }
                                        view.startAnimation(A00);
                                    } else {
                                        c62691SMf.A00();
                                    }
                                }
                            }
                            c63309ShF.A08(view);
                        } else {
                            throw new R3C(AnonymousClass001.A05(i4, "Trying to destroy unknown view tag: ", "\n detail: ", C63309ShF.A01(viewGroup, viewGroupManager, iArr, iArr2, c62959SZcArr)));
                        }
                    }
                }
                if (c62959SZcArr != null) {
                    for (C62959SZc c62959SZc : c62959SZcArr) {
                        View view2 = (View) sparseArray.get(c62959SZc.A01);
                        if (view2 != null) {
                            int i5 = c62959SZc.A00;
                            if (!set.isEmpty()) {
                                i5 = 0;
                                int i6 = 0;
                                while (i5 < viewGroup.getChildCount() && i6 != i5) {
                                    if (!AbstractC58319PtB.A1W(set, viewGroup.getChildAt(i5).getId())) {
                                        i6++;
                                    }
                                    i5++;
                                }
                            }
                            viewGroupManager.addView(viewGroup, view2, i5);
                        } else {
                            throw new R3C(AnonymousClass001.A05(c62959SZc.A01, "Trying to add unknown view tag: ", "\n detail: ", C63309ShF.A01(viewGroup, viewGroupManager, iArr, iArr2, c62959SZcArr)));
                        }
                    }
                }
                if (set.isEmpty()) {
                    c63309ShF.A00.remove(valueOf);
                }
            }
        }
    }
}
