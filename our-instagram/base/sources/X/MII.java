package X;

import com.instagram.common.gallery.Medium;
import com.instagram.common.gallery.RemoteMedia;
import com.instagram.common.gallery.metadata.MediaUploadMetadata;
import com.instagram.common.gallery.model.GalleryItem;
import com.instagram.creation.capture.gallery.ui.preview.GalleryPreviewMultiselectPager;
import java.io.File;
import java.io.IOException;

/* loaded from: classes8.dex */
public final class MII extends C0YY implements InterfaceC16660sJ {
    public final /* synthetic */ RemoteMedia A00;
    public final /* synthetic */ GalleryItem A01;
    public final /* synthetic */ GestureDetectorOnGestureListenerC43829JZs A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ boolean A04;
    public final /* synthetic */ boolean A05;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MII(RemoteMedia remoteMedia, GalleryItem galleryItem, GestureDetectorOnGestureListenerC43829JZs gestureDetectorOnGestureListenerC43829JZs, String str, boolean z, boolean z2) {
        super(1);
        this.A02 = gestureDetectorOnGestureListenerC43829JZs;
        this.A00 = remoteMedia;
        this.A03 = str;
        this.A01 = galleryItem;
        this.A05 = z;
        this.A04 = z2;
    }

    @Override // X.InterfaceC16660sJ
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        File file = (File) obj;
        try {
            GestureDetectorOnGestureListenerC43829JZs gestureDetectorOnGestureListenerC43829JZs = this.A02;
            RemoteMedia remoteMedia = this.A00;
            C14360o3.A0A(file);
            Medium A00 = C195428ki.A00(remoteMedia, file);
            MediaUploadMetadata mediaUploadMetadata = A00.A0G;
            mediaUploadMetadata.A0B = true;
            MediaUploadMetadata mediaUploadMetadata2 = remoteMedia.A02;
            mediaUploadMetadata2.A01 = this.A03;
            mediaUploadMetadata.A00(mediaUploadMetadata2);
            MediaUploadMetadata mediaUploadMetadata3 = A00.A0G;
            mediaUploadMetadata3.A09 = mediaUploadMetadata2.A03;
            O00.A00.put(A00.A0X, mediaUploadMetadata3);
            gestureDetectorOnGestureListenerC43829JZs.A1G.A02(A00, remoteMedia);
            GalleryPreviewMultiselectPager galleryPreviewMultiselectPager = gestureDetectorOnGestureListenerC43829JZs.A0I;
            if (galleryPreviewMultiselectPager != null) {
                galleryPreviewMultiselectPager.setPlaceholderMediumForGalleryItem(this.A01, A00);
            }
            if (this.A01 == gestureDetectorOnGestureListenerC43829JZs.A0B) {
                GestureDetectorOnGestureListenerC43829JZs.A0A(AbstractC167017dG.A0d(A00), gestureDetectorOnGestureListenerC43829JZs, this.A05, true, this.A04);
            }
        } catch (IOException e) {
            GestureDetectorOnGestureListenerC43829JZs gestureDetectorOnGestureListenerC43829JZs2 = this.A02;
            AbstractC208329Jr.A03(gestureDetectorOnGestureListenerC43829JZs2.A0x, this.A00, gestureDetectorOnGestureListenerC43829JZs2.A0z, "posts", e.getMessage());
            C9GR.A0F(AbstractC166997dE.A0L(gestureDetectorOnGestureListenerC43829JZs2), "gallery_meta_gallery_failed_to_cache", 2131963092);
            if (this.A01 == gestureDetectorOnGestureListenerC43829JZs2.A0B) {
                gestureDetectorOnGestureListenerC43829JZs2.A0a(C05F.A00, true);
            }
        }
        return C0eB.A00;
    }
}
