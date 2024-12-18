package X;

import com.instagram.common.gallery.RemoteMedia;
import com.instagram.common.gallery.metadata.MediaUploadMetadata;
import com.instagram.common.typedurl.SimpleImageUrl;
import com.instagram.ui.widget.mediapicker.Folder;

/* renamed from: X.Ann, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C24164Ann implements C8Z4 {
    public final int A00;
    public final String A01;
    public final String A02;
    public final Integer A03;
    public final String A04;

    public C24164Ann(Integer num, String str, String str2, String str3, int i) {
        C14360o3.A0B(str, 2);
        this.A00 = i;
        this.A02 = str;
        this.A01 = str2;
        this.A04 = str3;
        this.A03 = num;
    }

    @Override // X.C8Z4
    public final Folder ACa() {
        return null;
    }

    @Override // X.C8Z4
    public final C24164Ann ACh() {
        return this;
    }

    @Override // X.C8Z4
    public final String getSubtitle() {
        return "";
    }

    public final RemoteMedia A00() {
        String str = this.A04;
        if (str == null) {
            return null;
        }
        String A0g = AnonymousClass001.A0g(this.A02, ": ", str);
        SimpleImageUrl simpleImageUrl = new SimpleImageUrl(str);
        return new RemoteMedia(new MediaUploadMetadata(null, null, null, null, null, null, null, null, null, null, null, false), simpleImageUrl, simpleImageUrl, null, null, null, A0g, simpleImageUrl.getUrl(), 0, false, false, false);
    }

    @Override // X.C8Z4
    public final int BF3() {
        return this.A00;
    }

    @Override // X.C8Z4
    public final Integer CBv() {
        return C05F.A01;
    }

    @Override // X.C8Z4
    public final String getName() {
        return this.A02;
    }

    @Override // X.C8Z4
    public final int getSize() {
        return AbstractC167017dG.A0K(this.A03);
    }
}
