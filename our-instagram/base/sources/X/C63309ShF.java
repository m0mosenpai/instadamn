package X;

import android.graphics.Matrix;
import android.graphics.RectF;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.uimanager.RootViewManager;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.uimanager.ViewManager;
import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import java.util.HashMap;

/* renamed from: X.ShF, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63309ShF {
    public HashMap A00;
    public final RectF A01;
    public final SparseArray A02;
    public final SparseArray A03;
    public final SparseBooleanArray A04;
    public final T0X A05;
    public final RootViewManager A06;
    public final ComponentCallbacks2C63415Sjt A07;
    public final SZp A08;
    public volatile boolean A09;

    /* JADX WARN: Type inference failed for: r1v0, types: [com.facebook.react.uimanager.ViewManager, com.facebook.react.uimanager.RootViewManager] */
    public C63309ShF(ComponentCallbacks2C63415Sjt componentCallbacks2C63415Sjt) {
        ?? viewManager = new ViewManager(null);
        this.A05 = new T0X();
        this.A08 = new SZp();
        this.A01 = AbstractC166987dD.A0X();
        this.A07 = componentCallbacks2C63415Sjt;
        this.A03 = AbstractC58318PtA.A0G();
        this.A02 = AbstractC58318PtA.A0G();
        this.A04 = new SparseBooleanArray();
        this.A06 = viewManager;
    }

    public final synchronized View A03(int i) {
        View A00;
        A00 = A00(this, i);
        if (A00 == null) {
            throw new R3C(AnonymousClass001.A0c("Trying to resolve view with tag ", " which doesn't exist", i));
        }
        return A00;
    }

    public final synchronized ViewManager A04(int i) {
        ViewManager viewManager;
        viewManager = (ViewManager) this.A02.get(i);
        if (viewManager == null) {
            throw new R3C(AnonymousClass001.A0c("ViewManager for tag ", " could not be found.\n", i));
        }
        return viewManager;
    }

    @Deprecated
    public final synchronized void A05(int i, int i2, ReadableArray readableArray) {
        View A00 = A00(this, i);
        if (A00 != null) {
            A04(i).receiveCommand(A00, i2, readableArray);
        } else {
            throw new RuntimeException(AnonymousClass001.A02(i, i2, "Trying to send command to a non-existing view with tag [", "] and command "));
        }
    }

    public final synchronized void A06(int i, String str, ReadableArray readableArray) {
        View A00 = A00(this, i);
        if (A00 != null) {
            A04(i).receiveCommand(A00, str, readableArray);
        } else {
            throw new RuntimeException(AnonymousClass001.A05(i, "Trying to send command to a non-existing view with tag [", "] and command ", str));
        }
    }

    public final synchronized void A07(int i, int[] iArr) {
        View A00 = A00(this, i);
        if (A00 != null) {
            View view = (View) C69828VwE.A00(A00);
            if (view != null) {
                A02(view, iArr);
                int i2 = iArr[0];
                int i3 = iArr[1];
                A02(A00, iArr);
                iArr[0] = iArr[0] - i2;
                iArr[1] = iArr[1] - i3;
            } else {
                String A0c = AnonymousClass001.A0c("Native view ", " is no longer on screen", i);
                C14360o3.A0B(A0c, 1);
                throw new RuntimeException(A0c);
            }
        } else {
            String A0c2 = AnonymousClass001.A0c("No native view for ", " currently exists", i);
            C14360o3.A0B(A0c2, 1);
        }
    }

    public final synchronized void A08(View view) {
        if (view != null) {
            SparseArray sparseArray = this.A02;
            if (sparseArray.get(view.getId()) != null) {
                if (!this.A04.get(view.getId())) {
                    A04(view.getId()).onDropViewInstance(view);
                }
                ViewManager viewManager = (ViewManager) sparseArray.get(view.getId());
                if ((view instanceof ViewGroup) && (viewManager instanceof ViewGroupManager)) {
                    ViewGroup viewGroup = (ViewGroup) view;
                    ViewGroupManager viewGroupManager = (ViewGroupManager) viewManager;
                    int childCount = viewGroupManager.getChildCount(viewGroup);
                    while (true) {
                        childCount--;
                        if (childCount < 0) {
                            break;
                        }
                        View childAt = viewGroupManager.getChildAt(viewGroup, childCount);
                        if (childAt == null) {
                            C0I2.A03("NativeViewHierarchyManager", "Unable to drop null child view");
                        } else if (this.A03.get(childAt.getId()) != null) {
                            A08(childAt);
                        }
                    }
                    viewGroupManager.removeAllViews(viewGroup);
                }
                this.A03.remove(view.getId());
                sparseArray.remove(view.getId());
            }
        }
    }

    public final synchronized void A09(SKS sks, int i) {
        try {
            A04(i).updateProperties(A03(i), sks);
        } catch (R3C e) {
            C0I2.A05("NativeViewHierarchyManager", AnonymousClass001.A0O("Unable to update properties for view tag ", i), e);
        }
    }

    public static View A00(C63309ShF c63309ShF, int i) {
        return (View) c63309ShF.A03.get(i);
    }

    private void A02(View view, int[] iArr) {
        RectF rectF = this.A01;
        rectF.set(0.0f, 0.0f, view.getWidth(), view.getHeight());
        while (true) {
            Matrix matrix = view.getMatrix();
            if (!matrix.isIdentity()) {
                matrix.mapRect(rectF);
            }
            rectF.offset(view.getLeft(), view.getTop());
            Object parent = view.getParent();
            if (parent instanceof View) {
                view = (View) parent;
                rectF.offset(-view.getScrollX(), -view.getScrollY());
            } else {
                float f = rectF.left;
                iArr[0] = Math.round(f);
                float f2 = rectF.top;
                iArr[1] = Math.round(f2);
                iArr[2] = Math.round(rectF.right - f);
                iArr[3] = Math.round(rectF.bottom - f2);
                return;
            }
        }
    }

    public static String A01(ViewGroup viewGroup, ViewGroupManager viewGroupManager, int[] iArr, int[] iArr2, C62959SZc[] c62959SZcArr) {
        StringBuilder A1C = AbstractC166987dD.A1C();
        if (viewGroup != null) {
            A1C.append(AnonymousClass001.A08(viewGroup.getId(), "View tag:", " View Type:", viewGroup.getClass().toString(), "\n"));
            A1C.append(AnonymousClass001.A0c("  children(", "): [\n", viewGroupManager.getChildCount(viewGroup)));
            for (int i = 0; viewGroupManager.getChildAt(viewGroup, i) != null; i += 16) {
                int i2 = 0;
                while (true) {
                    int i3 = i + i2;
                    if (viewGroupManager.getChildAt(viewGroup, i3) != null && i2 < 16) {
                        A1C.append(AnonymousClass001.A03(viewGroupManager.getChildAt(viewGroup, i3).getId(), InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1));
                        i2++;
                    }
                }
                A1C.append("\n");
            }
            A1C.append(" ],\n");
        }
        if (iArr != null) {
            int length = iArr.length;
            A1C.append(AnonymousClass001.A0c("  indicesToRemove(", "): [\n", length));
            for (int i4 = 0; i4 < length; i4 += 16) {
                int i5 = 0;
                while (true) {
                    int i6 = i4 + i5;
                    if (i6 < length && i5 < 16) {
                        A1C.append(AnonymousClass001.A03(iArr[i6], InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1));
                        i5++;
                    }
                }
                A1C.append("\n");
            }
            A1C.append(" ],\n");
        }
        if (c62959SZcArr != null) {
            int length2 = c62959SZcArr.length;
            A1C.append(AnonymousClass001.A0c("  viewsToAdd(", "): [\n", length2));
            for (int i7 = 0; i7 < length2; i7 += 16) {
                int i8 = 0;
                while (true) {
                    int i9 = i7 + i8;
                    if (i9 < length2 && i8 < 16) {
                        C62959SZc c62959SZc = c62959SZcArr[i9];
                        A1C.append(AnonymousClass001.A0n("[", InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1, "],", c62959SZc.A00, c62959SZc.A01));
                        i8++;
                    }
                }
                A1C.append("\n");
            }
            A1C.append(" ],\n");
        }
        if (iArr2 != null) {
            int length3 = iArr2.length;
            A1C.append(AnonymousClass001.A0c("  tagsToDelete(", "): [\n", length3));
            for (int i10 = 0; i10 < length3; i10 += 16) {
                int i11 = 0;
                while (true) {
                    int i12 = i10 + i11;
                    if (i12 < length3 && i11 < 16) {
                        A1C.append(AnonymousClass001.A03(iArr2[i12], InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1));
                        i11++;
                    }
                }
                A1C.append("\n");
            }
            A1C.append(" ]\n");
        }
        return A1C.toString();
    }
}
