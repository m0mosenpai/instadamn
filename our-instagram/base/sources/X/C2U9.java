package X;

import android.graphics.Rect;
import android.view.View;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

/* renamed from: X.2U9, reason: invalid class name */
/* loaded from: classes.dex */
public final class C2U9 {
    public static boolean A06;
    public final InterfaceC57092jk A02;
    public final WeakReference A03;
    public final List A04 = new LinkedList();
    public final List A05 = new ArrayList();
    public final Rect A01 = new Rect();
    public final Rect A00 = new Rect();

    public final void A00(List list) {
        List list2;
        boolean z;
        if (A06) {
            list.clear();
            list2 = this.A05;
            list2.clear();
            View view = (View) this.A03.get();
            if (view != null) {
                Rect rect = this.A01;
                if (view.getGlobalVisibleRect(rect) && !rect.isEmpty()) {
                    list2.add(rect);
                    int i = 0;
                    while (true) {
                        InterfaceC57092jk interfaceC57092jk = this.A02;
                        if (i >= interfaceC57092jk.size()) {
                            break;
                        }
                        InterfaceC57142jp AXJ = interfaceC57092jk.AXJ(i);
                        Rect rect2 = this.A00;
                        AXJ.Ao7(rect2);
                        int i2 = 0;
                        while (i2 < list2.size()) {
                            Rect rect3 = (Rect) list2.get(i2);
                            if (Rect.intersects(rect2, rect3)) {
                                int i3 = rect2.top;
                                if (i3 > rect3.top) {
                                    list2.set(i2, new Rect(rect3.left, rect3.top, rect3.right, i3));
                                    z = false;
                                } else {
                                    z = true;
                                }
                                int i4 = rect2.bottom;
                                if (i4 < rect3.bottom) {
                                    Rect rect4 = new Rect(rect3.left, i4, rect3.right, rect3.bottom);
                                    if (z) {
                                        list2.set(i2, rect4);
                                    } else {
                                        list2.add(rect4);
                                    }
                                    z = false;
                                }
                                int i5 = rect2.left;
                                if (i5 > rect3.left) {
                                    Rect rect5 = new Rect(rect3.left, Math.max(rect3.top, rect2.top), i5, Math.min(rect3.bottom, rect2.bottom));
                                    if (z) {
                                        list2.set(i2, rect5);
                                    } else {
                                        list2.add(rect5);
                                    }
                                    z = false;
                                }
                                int i6 = rect2.right;
                                if (i6 < rect3.right) {
                                    Rect rect6 = new Rect(i6, Math.max(rect3.top, rect2.top), rect3.right, Math.min(rect3.bottom, rect2.bottom));
                                    if (z) {
                                        list2.set(i2, rect6);
                                    } else {
                                        list2.add(rect6);
                                    }
                                } else if (z) {
                                    list2.remove(i2);
                                    i2--;
                                }
                            }
                            i2++;
                        }
                        i++;
                    }
                } else {
                    return;
                }
            } else {
                return;
            }
        } else {
            list.clear();
            list2 = this.A04;
            list2.clear();
            View view2 = (View) this.A03.get();
            if (view2 != null) {
                Rect rect7 = this.A01;
                if (view2.getGlobalVisibleRect(rect7) && !rect7.isEmpty()) {
                    list2.add(rect7);
                    for (InterfaceC57142jp interfaceC57142jp : this.A02) {
                        Rect rect8 = this.A00;
                        interfaceC57142jp.Ao7(rect8);
                        ListIterator listIterator = list2.listIterator();
                        while (listIterator.hasNext()) {
                            Object next = listIterator.next();
                            next.getClass();
                            Rect rect9 = (Rect) next;
                            if (Rect.intersects(rect8, rect9)) {
                                listIterator.remove();
                                int i7 = rect8.top;
                                int i8 = rect9.top;
                                if (i7 > i8) {
                                    listIterator.add(new Rect(rect9.left, i8, rect9.right, i7));
                                }
                                int i9 = rect8.bottom;
                                int i10 = rect9.bottom;
                                if (i9 < i10) {
                                    listIterator.add(new Rect(rect9.left, i9, rect9.right, i10));
                                }
                                int i11 = rect8.left;
                                int i12 = rect9.left;
                                if (i11 > i12) {
                                    listIterator.add(new Rect(i12, Math.max(rect9.top, rect8.top), i11, Math.min(rect9.bottom, rect8.bottom)));
                                }
                                int i13 = rect8.right;
                                int i14 = rect9.right;
                                if (i13 < i14) {
                                    listIterator.add(new Rect(i13, Math.max(rect9.top, rect8.top), i14, Math.min(rect9.bottom, rect8.bottom)));
                                }
                            }
                        }
                    }
                } else {
                    return;
                }
            } else {
                return;
            }
        }
        list.addAll(list2);
    }

    public C2U9(View view, InterfaceC57092jk interfaceC57092jk) {
        this.A03 = new WeakReference(view);
        this.A02 = interfaceC57092jk;
    }
}
