package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.model.mediasize.ExtendedImageUrl;
import java.util.List;

/* loaded from: classes7.dex */
public final class HJD extends AbstractC146246iN {
    public final List A00 = AbstractC166987dD.A1E();
    public final InterfaceC11380iw A01;

    @Override // X.AbstractC146246iN, android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        C14360o3.A0B(viewGroup, 2);
        if (view == null) {
            view = AbstractC31176DnK.A0A(LayoutInflater.from(AbstractC12290kX.A00), viewGroup, R.layout.layout_product_image);
        }
        int i2 = C3OO.FLAG_ADAPTER_FULLUPDATE;
        AbstractC37302Gc3.A0K(view, R.id.image).setUrl((ImageUrl) this.A00.get(i), this.A01);
        return view;
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return this.A00.size();
    }

    @Override // android.widget.Adapter
    public final /* bridge */ /* synthetic */ Object getItem(int i) {
        return this.A00.get(i);
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return ((ExtendedImageUrl) this.A00.get(i)).A0A.hashCode();
    }

    public HJD(InterfaceC11380iw interfaceC11380iw) {
        this.A01 = interfaceC11380iw;
    }
}
