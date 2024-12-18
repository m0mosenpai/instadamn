package X;

import android.app.Activity;
import android.content.Intent;
import android.location.Location;
import com.instagram.common.gallery.metadata.MediaUploadMetadata;
import com.instagram.creation.base.CropInfo;
import com.instagram.model.creation.MediaCaptureConfig;
import com.instagram.pendingmedia.model.recipients.PendingRecipient;
import java.io.File;

/* renamed from: X.Ozn, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C56326Ozn implements InterfaceC69913Ca {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ Activity A02;
    public final /* synthetic */ Location A03;
    public final /* synthetic */ android.net.Uri A04;
    public final /* synthetic */ C22P A05;
    public final /* synthetic */ MediaUploadMetadata A06;
    public final /* synthetic */ CropInfo A07;
    public final /* synthetic */ AnonymousClass840 A08;
    public final /* synthetic */ MediaCaptureConfig A09;
    public final /* synthetic */ PendingRecipient A0A;
    public final /* synthetic */ String A0B;
    public final /* synthetic */ String A0C;
    public final /* synthetic */ boolean A0D;
    public final /* synthetic */ boolean A0E;

    @Override // X.InterfaceC69913Ca
    public final /* synthetic */ void CKE(Intent intent) {
    }

    @Override // X.InterfaceC69913Ca
    public final /* synthetic */ void Cv3(int i, int i2) {
    }

    @Override // X.InterfaceC69913Ca
    public final /* synthetic */ void Cv4(int i, int i2) {
    }

    @Override // X.InterfaceC69913Ca
    public final /* synthetic */ void En7(File file, int i) {
    }

    @Override // X.InterfaceC69913Ca
    public final void EnX(Intent intent, int i) {
        C14360o3.A0B(intent, 0);
        intent.putExtra("isFromQcc", true);
        intent.putExtra("photoDataPath", this.A0B);
        intent.putExtra("isPhotoEdit", true);
        intent.putExtra("photoLocation", this.A03);
        CropInfo cropInfo = this.A07;
        if (cropInfo != null) {
            intent.putExtra("photoCropInfo", cropInfo);
        }
        intent.putExtra("isMirrored", this.A0D);
        int i2 = this.A00;
        intent.putExtra("mediaSource", i2);
        if (i2 == 1) {
            intent.putExtra("photoStartingCropType", C5L6.A0E);
        }
        intent.putExtra("mediaOrientation", this.A01);
        MediaCaptureConfig mediaCaptureConfig = this.A09;
        if (mediaCaptureConfig != null) {
            intent.setExtrasClassLoader(MediaCaptureConfig.class.getClassLoader());
            intent.putExtra("captureConfig", mediaCaptureConfig);
        }
        intent.putExtra("cameraEntryPoint", this.A05);
        String str = this.A0C;
        if (str != null) {
            intent.putExtra("originalMediaPath", str);
        }
        android.net.Uri uri = this.A04;
        if (uri != null) {
            intent.putExtra("originalMediaUri", uri.toString());
        }
        AnonymousClass840 anonymousClass840 = this.A08;
        if (anonymousClass840 != null) {
            intent.putExtra(AbstractC43591JPw.A00(89), AbstractC43593JPy.A0R(anonymousClass840));
        }
        intent.putExtra("media_upload_metadata", this.A06);
        intent.putExtra("targetGroupProfile", this.A0A);
        intent.putExtra("is_quiet_posting_flow", this.A0E);
        C12260kU.A08(this.A02, intent, i);
    }

    public C56326Ozn(Activity activity, Location location, android.net.Uri uri, C22P c22p, MediaUploadMetadata mediaUploadMetadata, CropInfo cropInfo, AnonymousClass840 anonymousClass840, MediaCaptureConfig mediaCaptureConfig, PendingRecipient pendingRecipient, String str, String str2, int i, int i2, boolean z, boolean z2) {
        this.A0B = str;
        this.A03 = location;
        this.A07 = cropInfo;
        this.A0D = z;
        this.A00 = i;
        this.A01 = i2;
        this.A09 = mediaCaptureConfig;
        this.A05 = c22p;
        this.A0C = str2;
        this.A04 = uri;
        this.A08 = anonymousClass840;
        this.A06 = mediaUploadMetadata;
        this.A0A = pendingRecipient;
        this.A0E = z2;
        this.A02 = activity;
    }
}
