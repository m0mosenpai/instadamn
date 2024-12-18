package X;

import android.view.View;
import android.view.ViewGroup;

/* renamed from: X.2xz, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC65632xz implements InterfaceC65642y0 {
    @Override // X.InterfaceC65642y0
    public int getIdentifier(int i, Object obj, Object obj2) {
        return Integer.MAX_VALUE;
    }

    @Override // X.InterfaceC65642y0
    public int getViewModelHash(int i, Object obj, Object obj2) {
        return Integer.MAX_VALUE;
    }

    @Override // X.InterfaceC65642y0
    public String getViewSubTypeName(int i, Object obj) {
        return null;
    }

    public boolean isEnabled(int i, Object obj, Object obj2) {
        return true;
    }

    @Override // X.InterfaceC65642y0
    public void onViewAttachedToWindow(View view, int i, Object obj, Object obj2) {
    }

    @Override // X.InterfaceC65642y0
    public void onViewDetachedFromWindow(View view, int i, Object obj, Object obj2) {
    }

    @Override // X.InterfaceC65642y0
    public void onViewRecycled(View view, int i, Object obj, Object obj2) {
    }

    @Override // X.InterfaceC65642y0
    public String getBinderGroupName() {
        return getClass().getSimpleName();
    }

    @Override // X.InterfaceC65642y0
    public View getView(int i, View view, ViewGroup viewGroup, Object obj, Object obj2) {
        int A03 = C0f9.A03(-2048425802);
        if (view == null) {
            view = createView(i, viewGroup);
        }
        bindView(i, view, obj, obj2);
        C0f9.A0A(1534779901, A03);
        return view;
    }

    @Override // X.InterfaceC65642y0
    public String getViewTypeName(int i) {
        return AnonymousClass001.A06(i, getBinderGroupName(), "[", "]");
    }
}
