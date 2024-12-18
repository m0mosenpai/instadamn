package X;

import android.view.View;
import android.view.ViewGroup;

@Deprecated
/* renamed from: X.7g3, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC168697g3 implements InterfaceC65642y0 {
    @Override // X.InterfaceC65642y0
    public final int getIdentifier(int i, Object obj, Object obj2) {
        return 0;
    }

    @Override // X.InterfaceC65642y0
    public final int getViewModelHash(int i, Object obj, Object obj2) {
        return 0;
    }

    @Override // X.InterfaceC65642y0
    public final String getViewSubTypeName(int i, Object obj) {
        return null;
    }

    @Override // X.InterfaceC65642y0
    public final void onViewAttachedToWindow(View view, int i, Object obj, Object obj2) {
    }

    @Override // X.InterfaceC65642y0
    public final void onViewDetachedFromWindow(View view, int i, Object obj, Object obj2) {
    }

    @Override // X.InterfaceC65642y0
    public final void onViewRecycled(View view, int i, Object obj, Object obj2) {
    }

    @Override // X.InterfaceC65642y0
    public final void bindView(int i, View view, Object obj, Object obj2) {
        int A03 = C0f9.A03(86546705);
        UnsupportedOperationException unsupportedOperationException = new UnsupportedOperationException(AnonymousClass001.A0u(getClass().getSimpleName(), " was used in a RecyclerView adapter but doesn't implement ", "bindView", "!"));
        C0f9.A0A(-195732508, A03);
        throw unsupportedOperationException;
    }

    @Override // X.InterfaceC65642y0
    public final View createView(int i, ViewGroup viewGroup) {
        int A03 = C0f9.A03(-2142740490);
        UnsupportedOperationException unsupportedOperationException = new UnsupportedOperationException(AnonymousClass001.A0u(getClass().getSimpleName(), " was used in a RecyclerView adapter but doesn't implement ", "createView", "!"));
        C0f9.A0A(1444493804, A03);
        throw unsupportedOperationException;
    }

    @Override // X.InterfaceC65642y0
    public final String getBinderGroupName() {
        return getClass().getSimpleName();
    }

    @Override // X.InterfaceC65642y0
    public final String getViewTypeName(int i) {
        return AnonymousClass001.A06(i, getClass().getSimpleName(), "[", "]");
    }
}
