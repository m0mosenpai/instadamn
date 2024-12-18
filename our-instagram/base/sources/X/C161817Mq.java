package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.ui.widget.loadmore.LoadMoreButton;

/* renamed from: X.7Mq, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C161817Mq extends AbstractC66412zI {
    public final C7IV A00;

    public C161817Mq(C7IV c7iv) {
        C14360o3.A0B(c7iv, 1);
        this.A00 = c7iv;
    }

    public final C161827Ms A00(ViewGroup viewGroup) {
        C14360o3.A0B(viewGroup, 0);
        View A00 = LoadMoreButton.A00(viewGroup.getContext(), R.layout.thread_message_load_more_empty, viewGroup);
        int i = C3OO.FLAG_ADAPTER_FULLUPDATE;
        return new C161827Ms(A00, new C7Mr(this));
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ void bind(InterfaceC66482zP interfaceC66482zP, C3OO c3oo) {
        C7VB c7vb = (C7VB) interfaceC66482zP;
        C161827Ms c161827Ms = (C161827Ms) c3oo;
        C14360o3.A0B(c7vb, 0);
        C14360o3.A0B(c161827Ms, 1);
        C7IV c7iv = c161827Ms.A00;
        c7iv.A00 = c7vb;
        if (c7iv.CXf() && !c7iv.isLoading() && !c7iv.CUG() && c7iv.CLJ()) {
            c7iv.Chd();
        }
        c161827Ms.A01.A04(c7iv, null);
    }

    @Override // X.AbstractC66422zJ
    public final Class modelClass() {
        return C7VB.class;
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ void unbind(C3OO c3oo) {
        C161827Ms c161827Ms = (C161827Ms) c3oo;
        C14360o3.A0B(c161827Ms, 0);
        c161827Ms.A00.A00 = null;
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        return A00(viewGroup);
    }
}
