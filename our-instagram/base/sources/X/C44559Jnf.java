package X;

import android.view.ViewGroup;
import com.instagram.common.gallery.model.GalleryItem;
import com.instagram.ui.widget.mediapicker.MediaPickerItemView;
import java.util.List;

/* renamed from: X.Jnf, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44559Jnf extends C2UU {
    public final MQK A00;
    public final List A01 = AbstractC166987dD.A1E();
    public final List A02 = AbstractC166987dD.A1E();

    @Override // X.C2UU
    public final /* bridge */ /* synthetic */ C3OO onCreateViewHolder(ViewGroup viewGroup, int i) {
        C14360o3.A0B(viewGroup, 0);
        int i2 = MediaPickerItemView.A0X;
        return new C44609JpF(new MediaPickerItemView(AbstractC166997dE.A0L(viewGroup), (MQJ) null, true));
    }

    @Override // X.C2UU
    public final /* bridge */ /* synthetic */ void onBindViewHolder(C3OO c3oo, int i) {
        C44609JpF c44609JpF = (C44609JpF) c3oo;
        C14360o3.A0B(c44609JpF, 0);
        GalleryItem galleryItem = (GalleryItem) this.A01.get(i);
        MediaPickerItemView mediaPickerItemView = c44609JpF.A00;
        C0fQ.A00(new ViewOnClickListenerC48068LPt(7, this, galleryItem, mediaPickerItemView), mediaPickerItemView);
        mediaPickerItemView.setOnLongClickListener(new LQL(mediaPickerItemView, 2));
        C14360o3.A0B(galleryItem, 0);
        List list = this.A02;
        String str = galleryItem.A0A;
        mediaPickerItemView.A04(new C9BB(null, list.indexOf(str), 0, 4, 3, AbstractC25230BEn.A1S(list.indexOf(str), -1), false), galleryItem, C49658Lwp.A00, true, false, false, false, false, true);
    }

    public C44559Jnf(MQK mqk) {
        this.A00 = mqk;
    }

    @Override // X.C2UU
    public final int getItemCount() {
        int A03 = C0f9.A03(-1077353631);
        int size = this.A01.size();
        C0f9.A0A(-622305816, A03);
        return size;
    }
}
