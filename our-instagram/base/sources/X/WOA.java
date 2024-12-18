package X;

import android.view.View;
import android.view.ViewGroup;
import com.instagram.ui.widget.radiogroup.IgRadioGroup;

/* loaded from: classes11.dex */
public final class WOA implements ViewGroup.OnHierarchyChangeListener {
    public ViewGroup.OnHierarchyChangeListener A00;
    public final /* synthetic */ IgRadioGroup A01;

    public WOA(IgRadioGroup igRadioGroup) {
        this.A01 = igRadioGroup;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.ViewGroup.OnHierarchyChangeListener
    public final void onChildViewAdded(View view, View view2) {
        IgRadioGroup igRadioGroup = this.A01;
        if (view == igRadioGroup && (view2 instanceof InterfaceC72038XGg)) {
            if (view2.getId() == -1) {
                view2.setId(View.generateViewId());
            }
            ((InterfaceC72038XGg) view2).A9c(igRadioGroup.A01);
        }
        ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = this.A00;
        if (onHierarchyChangeListener != null) {
            onHierarchyChangeListener.onChildViewAdded(view, view2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.ViewGroup.OnHierarchyChangeListener
    public final void onChildViewRemoved(View view, View view2) {
        IgRadioGroup igRadioGroup = this.A01;
        if (view == igRadioGroup && (view2 instanceof InterfaceC72038XGg)) {
            ((InterfaceC72038XGg) view2).EFv(igRadioGroup.A01);
        }
        ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = this.A00;
        if (onHierarchyChangeListener != null) {
            onHierarchyChangeListener.onChildViewRemoved(view, view2);
        }
    }
}
