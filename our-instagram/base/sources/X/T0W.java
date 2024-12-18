package X;

import com.instagram.react.delegate.IgReactDelegate;

/* loaded from: classes10.dex */
public final class T0W implements InterfaceC65357Til {
    public final /* synthetic */ IgReactDelegate A00;

    public T0W(IgReactDelegate igReactDelegate) {
        this.A00 = igReactDelegate;
    }

    @Override // X.InterfaceC65357Til
    public final void CP8() {
        IgReactDelegate igReactDelegate = this.A00;
        igReactDelegate.A0A = true;
        ((AbstractC62448SCb) igReactDelegate).A00.getActivity().onBackPressed();
    }
}
