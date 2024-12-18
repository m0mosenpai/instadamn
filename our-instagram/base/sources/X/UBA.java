package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import com.facebook.R;

/* loaded from: classes11.dex */
public final class UBA extends BaseAdapter {
    public final ViewOnKeyListenerC67976V4r A00;
    public final V2O A01;
    public final InterfaceC11380iw A02;

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public final int getItemViewType(int i) {
        return 0;
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        C14360o3.A0B(viewGroup, 2);
        if (view == null) {
            view = AbstractC25226BEj.A0R(AbstractC25228BEl.A0P(viewGroup), viewGroup, R.layout.canvas_media_block, false);
            view.setTag(new UJ0(view));
        }
        Context A0L = AbstractC166997dE.A0L(view);
        Object tag = view.getTag();
        if (tag != null) {
            UJ0 uj0 = (UJ0) tag;
            V2O v2o = this.A01;
            XLM xlm = (XLM) v2o.A00.A00.get(i);
            C14360o3.A0C(xlm, AbstractC111324zv.A00(482));
            V2M v2m = (V2M) xlm;
            ViewOnKeyListenerC67976V4r viewOnKeyListenerC67976V4r = this.A00;
            InterfaceC11380iw interfaceC11380iw = this.A02;
            String id = v2o.getId();
            if (id != null) {
                VS6.A00(A0L, viewOnKeyListenerC67976V4r, v2m, uj0, interfaceC11380iw, null, id);
                return view;
            }
            throw new IllegalStateException("Required value was null.");
        }
        throw new IllegalStateException("Required value was null.");
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public final int getViewTypeCount() {
        return 1;
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return this.A01.A00.A00.size();
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i) {
        return this.A01.A00.A00.get(i);
    }

    public UBA(ViewOnKeyListenerC67976V4r viewOnKeyListenerC67976V4r, V2O v2o, InterfaceC11380iw interfaceC11380iw) {
        this.A01 = v2o;
        this.A00 = viewOnKeyListenerC67976V4r;
        this.A02 = interfaceC11380iw;
    }
}
