package X;

import android.content.Context;
import android.view.ViewGroup;
import com.instagram.common.gallery.Medium;
import com.instagram.common.gallery.model.GalleryItem;
import com.instagram.ui.widget.mediapicker.MediaPickerItemView;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes8.dex */
public final class Jo2 extends C2UU implements InterfaceC189068Yw {
    public final Context A00;
    public final C8SG A01;
    public final MQJ A02;
    public final List A03 = AbstractC166987dD.A1E();

    @Override // X.InterfaceC189068Yw
    public final void EdU(GalleryItem galleryItem, boolean z, boolean z2) {
    }

    @Override // X.InterfaceC189068Yw
    public final void EYj(List list, String str) {
        List list2 = this.A03;
        list2.clear();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Medium A0l = AbstractC166987dD.A0l(it);
            C14360o3.A0B(A0l, 1);
            list2.add(AbstractC167017dG.A0d(A0l));
        }
        notifyDataSetChanged();
    }

    @Override // X.C2UU
    public final /* bridge */ /* synthetic */ void onBindViewHolder(C3OO c3oo, int i) {
        MediaPickerItemView mediaPickerItemView = (MediaPickerItemView) c3oo.itemView;
        GalleryItem galleryItem = (GalleryItem) this.A03.get(i);
        C9BB c9bb = new C9BB();
        C0fQ.A00(new LPM(13, c9bb, this, galleryItem, mediaPickerItemView), mediaPickerItemView);
        mediaPickerItemView.setOnLongClickListener(new ViewOnLongClickListenerC44303Jhu(7, this, mediaPickerItemView, galleryItem, c9bb));
        mediaPickerItemView.A03(c9bb, this.A01, galleryItem, false, false, false, false);
    }

    @Override // X.C2UU
    public final /* bridge */ /* synthetic */ C3OO onCreateViewHolder(ViewGroup viewGroup, int i) {
        int i2 = C3OO.FLAG_ADAPTER_FULLUPDATE;
        return new C3OO(new MediaPickerItemView(this.A00));
    }

    public Jo2(Context context, C8SG c8sg, MQJ mqj) {
        this.A00 = context;
        this.A01 = c8sg;
        this.A02 = mqj;
    }

    @Override // X.InterfaceC189068Yw
    public final List ANA() {
        return AbstractC166987dD.A1E();
    }

    @Override // X.C2UU
    public final int getItemCount() {
        int A03 = C0f9.A03(1695667109);
        int size = this.A03.size();
        C0f9.A0A(-1605918793, A03);
        return size;
    }
}
