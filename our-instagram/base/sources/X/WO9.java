package X;

import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.chip.Chip;
import com.google.android.material.chip.ChipGroup;

/* loaded from: classes11.dex */
public final class WO9 implements ViewGroup.OnHierarchyChangeListener {
    public ViewGroup.OnHierarchyChangeListener A00;
    public final /* synthetic */ ChipGroup A01;

    public WO9(ChipGroup chipGroup) {
        this.A01 = chipGroup;
    }

    @Override // android.view.ViewGroup.OnHierarchyChangeListener
    public final void onChildViewAdded(View view, View view2) {
        ChipGroup chipGroup;
        int id;
        int i;
        ChipGroup chipGroup2 = this.A01;
        if (view == chipGroup2 && (view2 instanceof Chip)) {
            if (view2.getId() == -1) {
                view2.setId(View.generateViewId());
            }
            Chip chip = (Chip) view2;
            if (chip.isChecked() && (id = chip.getId()) != (i = (chipGroup = (ChipGroup) view).A00)) {
                if (i != -1 && chipGroup.A03) {
                    ChipGroup.A00(chipGroup, i, false);
                }
                if (id != -1) {
                    ChipGroup.A00(chipGroup, id, true);
                }
                chipGroup.A00 = id;
            }
            chip.A03 = chipGroup2.A08;
        }
        ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = this.A00;
        if (onHierarchyChangeListener != null) {
            onHierarchyChangeListener.onChildViewAdded(view, view2);
        }
    }

    @Override // android.view.ViewGroup.OnHierarchyChangeListener
    public final void onChildViewRemoved(View view, View view2) {
        if (view == this.A01 && (view2 instanceof Chip)) {
            ((Chip) view2).A03 = null;
        }
        ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = this.A00;
        if (onHierarchyChangeListener != null) {
            onHierarchyChangeListener.onChildViewRemoved(view, view2);
        }
    }
}
