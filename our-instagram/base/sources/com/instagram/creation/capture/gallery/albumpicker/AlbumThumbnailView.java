package com.instagram.creation.capture.gallery.albumpicker;

import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC167017dG;
import X.AbstractC31171DnF;
import X.C05F;
import X.C14360o3;
import X.C24164Ann;
import X.C3P9;
import X.C49657Lwo;
import X.C51737MtK;
import X.C51756Mtf;
import X.C8SF;
import X.C8Z4;
import X.C9BB;
import X.InterfaceC193828i3;
import X.JQ0;
import X.KKp;
import X.ViewOnTouchListenerC48084LQj;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.gallery.Medium;
import com.instagram.common.gallery.RemoteMedia;
import com.instagram.common.gallery.model.GalleryItem;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgLinearLayout;
import com.instagram.ui.widget.mediapicker.Folder;
import com.instagram.ui.widget.mediapicker.MediaPickerItemView;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes8.dex */
public final class AlbumThumbnailView extends IgLinearLayout {
    public C51756Mtf A00;
    public InterfaceC193828i3 A01;
    public C51737MtK A02;
    public final FrameLayout A03;
    public final ImageView A04;
    public final TextView A05;
    public final TextView A06;
    public final MediaPickerItemView A07;

    private final C9BB getGalleryItemState() {
        C9BB c9bb = new C9BB(null, 0, 0, 15, 3, false, false);
        c9bb.A02 = false;
        return c9bb;
    }

    public final void A00(C51737MtK c51737MtK, C51756Mtf c51756Mtf, UserSession userSession) {
        RemoteMedia A00;
        GalleryItem galleryItem;
        this.A00 = c51756Mtf;
        TextView textView = this.A05;
        String name = ((C8Z4) c51756Mtf.A00).getName();
        textView.setText(name);
        TextView textView2 = this.A06;
        C8Z4 c8z4 = (C8Z4) c51756Mtf.A00;
        String subtitle = c8z4.getSubtitle();
        if (subtitle.length() == 0) {
            subtitle = String.valueOf(c8z4.getSize());
        }
        textView2.setText(subtitle);
        this.A02 = c51737MtK;
        setContentDescription(name);
        C51756Mtf c51756Mtf2 = this.A00;
        if (c51756Mtf2 != null) {
            C8Z4 c8z42 = (C8Z4) c51756Mtf2.A00;
            Folder ACa = c8z42.ACa();
            if (ACa != null && c8z42.getSize() > 0) {
                galleryItem = AbstractC167017dG.A0d((Medium) ACa.A01().get(0));
            } else {
                C24164Ann ACh = c8z42.ACh();
                if (ACh != null && ACh.A00() != null && (A00 = ACh.A00()) != null) {
                    galleryItem = new GalleryItem(A00);
                }
            }
            setupThumbnailImage(userSession, galleryItem);
            return;
        }
        setupThumbnailIcon(R.drawable.instagram_no_photo_pano_outline_24);
    }

    private final void setupThumbnailIcon(int i) {
        this.A07.setVisibility(8);
        FrameLayout frameLayout = this.A03;
        frameLayout.setVisibility(0);
        frameLayout.getLayoutParams().height = this.A02.A00;
        frameLayout.getLayoutParams().width = this.A02.A01;
        this.A04.setImageResource(i);
    }

    private final void setupThumbnailImage(UserSession userSession, GalleryItem galleryItem) {
        MediaPickerItemView mediaPickerItemView = this.A07;
        mediaPickerItemView.setVisibility(0);
        this.A03.setVisibility(8);
        ViewGroup.LayoutParams layoutParams = mediaPickerItemView.getLayoutParams();
        C51737MtK c51737MtK = this.A02;
        layoutParams.width = c51737MtK.A01;
        layoutParams.height = c51737MtK.A00;
        mediaPickerItemView.setLayoutParams(layoutParams);
        if (galleryItem.A02()) {
            Context A0L = AbstractC166997dE.A0L(this);
            C51737MtK c51737MtK2 = this.A02;
            mediaPickerItemView.A03(getGalleryItemState(), new C8SF(A0L, userSession, C05F.A00, c51737MtK2.A01, c51737MtK2.A00, false), galleryItem, false, false, false, false);
            return;
        }
        if (!galleryItem.A04()) {
            return;
        }
        mediaPickerItemView.A04(getGalleryItemState(), galleryItem, C49657Lwo.A00, false, false, true, true, true, true);
    }

    public final void setAlbumPickerListener(InterfaceC193828i3 interfaceC193828i3) {
        this.A01 = interfaceC193828i3;
    }

    public /* synthetic */ AlbumThumbnailView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, JQ0.A0C(attributeSet, i2), JQ0.A03(i2, i));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AlbumThumbnailView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C14360o3.A0B(context, 1);
        this.A02 = new C51737MtK(context.getResources().getDimensionPixelOffset(R.dimen.album_thumbnail_image_size), context.getResources().getDimensionPixelOffset(R.dimen.album_thumbnail_image_size), 9);
        LayoutInflater.from(context).inflate(R.layout.album_with_thumbnail_layout, (ViewGroup) this, true);
        setOrientation(1);
        setGravity(1);
        this.A05 = AbstractC166987dD.A0e(this, R.id.album_title);
        this.A06 = AbstractC166987dD.A0e(this, R.id.album_media_count_text);
        MediaPickerItemView mediaPickerItemView = (MediaPickerItemView) findViewById(R.id.album_thumbnail_image);
        this.A07 = mediaPickerItemView;
        this.A03 = (FrameLayout) findViewById(R.id.album_thumbnail_icon_frame);
        this.A04 = AbstractC31171DnF.A08(this, R.id.album_thumbnail_icon);
        C3P9 A0s = AbstractC166987dD.A0s(this);
        A0s.A06 = false;
        A0s.A04 = new KKp(this, 10);
        ViewOnTouchListenerC48084LQj.A01(mediaPickerItemView, 8, A0s.A00());
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AlbumThumbnailView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        C14360o3.A0B(context, 1);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AlbumThumbnailView(Context context) {
        this(context, null, 0);
        C14360o3.A0B(context, 1);
    }
}
