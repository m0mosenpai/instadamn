package X;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.internal.NavigationMenuItemView;
import com.google.android.material.timepicker.ClockFaceView;
import com.instagram.react.modules.base.IgReactQEModule;

/* loaded from: classes11.dex */
public final class UEP extends C02V {
    public final int A00;
    public final Object A01;

    public UEP(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // X.C02V
    public final void A0S(View view, AccessibilityEvent accessibilityEvent) {
        if (7 - this.A00 != 0) {
            super.A0S(view, accessibilityEvent);
        } else {
            super.A0S(view, accessibilityEvent);
            accessibilityEvent.setChecked(((CheckableImageButton) this.A01).isChecked());
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    @Override // X.C02V
    public final boolean A0V(View view, int i, Bundle bundle) {
        switch (this.A00) {
            case 0:
                return ((C66493UJx) this.A01).A00.A0V(view, i, bundle);
            case 2:
                if (i == 1048576) {
                    Q5b q5b = (Q5b) this.A01;
                    if (q5b.A04) {
                        q5b.cancel();
                        return true;
                    }
                }
                return super.A0V(view, i, bundle);
            case 9:
                if (i == 1048576) {
                    ((AbstractC70175WEx) this.A01).A07(3);
                    return true;
                }
                return super.A0V(view, i, bundle);
            default:
                return super.A0V(view, i, bundle);
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    @Override // X.C02V
    public final void A0Y(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        boolean z;
        int i;
        boolean isChecked;
        Context context;
        int i2;
        switch (this.A00) {
            case 0:
                C66493UJx c66493UJx = (C66493UJx) this.A01;
                c66493UJx.A00.A0Y(view, accessibilityNodeInfoCompat);
                RecyclerView recyclerView = c66493UJx.A02;
                int A02 = RecyclerView.A02(view);
                C2UU c2uu = recyclerView.A0A;
                if (!(c2uu instanceof C66426UGz)) {
                    return;
                }
                ((C66426UGz) c2uu).A02(A02);
                return;
            case 1:
                super.A0Y(view, accessibilityNodeInfoCompat);
                accessibilityNodeInfoCompat.mInfo.setFocusable(false);
                accessibilityNodeInfoCompat.setClickable(false);
                accessibilityNodeInfoCompat.removeAction(C012804r.A0I);
                accessibilityNodeInfoCompat.removeAction(C012804r.A08);
                return;
            case 2:
                super.A0Y(view, accessibilityNodeInfoCompat);
                if (!((Q5b) this.A01).A04) {
                    z = false;
                    accessibilityNodeInfoCompat.mInfo.setDismissable(z);
                    return;
                }
                accessibilityNodeInfoCompat.addAction(1048576);
                z = true;
                accessibilityNodeInfoCompat.mInfo.setDismissable(z);
                return;
            case 3:
                super.A0Y(view, accessibilityNodeInfoCompat);
                ViewGroup viewGroup = (ViewGroup) this.A01;
                if (view instanceof MaterialButton) {
                    i = 0;
                    for (int i3 = 0; i3 < viewGroup.getChildCount(); i3++) {
                        if (viewGroup.getChildAt(i3) != view) {
                            if ((viewGroup.getChildAt(i3) instanceof MaterialButton) && viewGroup.getChildAt(i3).getVisibility() != 8) {
                                i++;
                            }
                        } else {
                            isChecked = ((MaterialButton) view).isChecked();
                            accessibilityNodeInfoCompat.mInfo.setCollectionItemInfo(AccessibilityNodeInfo.CollectionItemInfo.obtain(0, 1, i, 1, false, isChecked));
                            return;
                        }
                    }
                }
                i = -1;
                isChecked = ((MaterialButton) view).isChecked();
                accessibilityNodeInfoCompat.mInfo.setCollectionItemInfo(AccessibilityNodeInfo.CollectionItemInfo.obtain(0, 1, i, 1, false, isChecked));
                return;
            case 4:
            case 6:
            default:
                super.A0Y(view, accessibilityNodeInfoCompat);
                accessibilityNodeInfoCompat.mInfo.setCollectionInfo(null);
                return;
            case 5:
                super.A0Y(view, accessibilityNodeInfoCompat);
                UEx uEx = (UEx) this.A01;
                int i4 = 2131967848;
                if (uEx.A00.getVisibility() == 0) {
                    i4 = 2131967849;
                }
                accessibilityNodeInfoCompat.mInfo.setHintText(uEx.getString(i4));
                return;
            case 7:
                super.A0Y(view, accessibilityNodeInfoCompat);
                CheckableImageButton checkableImageButton = (CheckableImageButton) this.A01;
                accessibilityNodeInfoCompat.mInfo.setCheckable(checkableImageButton.A00);
                accessibilityNodeInfoCompat.mInfo.setChecked(checkableImageButton.isChecked());
                return;
            case 8:
                super.A0Y(view, accessibilityNodeInfoCompat);
                accessibilityNodeInfoCompat.mInfo.setCheckable(((NavigationMenuItemView) this.A01).A04);
                return;
            case 9:
                super.A0Y(view, accessibilityNodeInfoCompat);
                accessibilityNodeInfoCompat.addAction(1048576);
                z = true;
                accessibilityNodeInfoCompat.mInfo.setDismissable(z);
                return;
            case 10:
                super.A0Y(view, accessibilityNodeInfoCompat);
                i = ((Number) view.getTag(R.id.material_value_index)).intValue();
                if (i > 0) {
                    accessibilityNodeInfoCompat.mInfo.setTraversalAfter((View) ((ClockFaceView) this.A01).A07.get(i - 1));
                }
                isChecked = view.isSelected();
                accessibilityNodeInfoCompat.mInfo.setCollectionItemInfo(AccessibilityNodeInfo.CollectionItemInfo.obtain(0, 1, i, 1, false, isChecked));
                return;
            case 11:
                boolean A1a = AbstractC167017dG.A1a(view, accessibilityNodeInfoCompat);
                super.A0Y(view, accessibilityNodeInfoCompat);
                accessibilityNodeInfoCompat.mInfo.setFocusable(A1a);
                accessibilityNodeInfoCompat.addAction(C012804r.A0f);
                accessibilityNodeInfoCompat.setClassName("android.view.View");
                context = ((C47284Kuv) this.A01).A00.getContext();
                i2 = 2131965263;
                accessibilityNodeInfoCompat.setRoleDescription(context.getString(i2));
                return;
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                AbstractC167017dG.A1N(view, accessibilityNodeInfoCompat);
                super.A0Y(view, accessibilityNodeInfoCompat);
                context = ((C8JF) this.A01).A01;
                i2 = 2131954438;
                accessibilityNodeInfoCompat.setRoleDescription(context.getString(i2));
                return;
        }
    }
}
