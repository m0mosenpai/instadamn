package X;

import android.graphics.Point;
import android.media.MediaMetadataRetriever;
import com.instagram.camera.effect.models.CameraAREffect;
import com.instagram.creation.capture.quickcapture.freetransform.transformmatrix.TransformMatrixConfig;
import com.instagram.pendingmedia.model.ClipInfo;
import java.util.List;

/* renamed from: X.9N6, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C9N6 {
    public final float A00;
    public final int A01;
    public final int A02;
    public final Point A03;
    public final CameraAREffect A04;
    public final TransformMatrixConfig A05;
    public final ClipInfo A06;
    public final ClipInfo A07;
    public final String A08;
    public final List A09;
    public final boolean A0A;

    public C9N6(Point point, CameraAREffect cameraAREffect, TransformMatrixConfig transformMatrixConfig, ClipInfo clipInfo, ClipInfo clipInfo2, String str, List list, float f, int i, int i2, boolean z) {
        String str2;
        this.A06 = clipInfo;
        this.A07 = clipInfo2;
        this.A04 = cameraAREffect;
        this.A00 = f;
        this.A09 = list;
        this.A02 = i;
        this.A01 = i2;
        this.A05 = transformMatrixConfig;
        this.A08 = str;
        boolean A1W = AbstractC167007dF.A1W(cameraAREffect);
        if (transformMatrixConfig != null && !A1W && !transformMatrixConfig.A08.A01() && (str2 = clipInfo.A0F) != null) {
            MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
            mediaMetadataRetriever.setDataSource(str2);
            String extractMetadata = mediaMetadataRetriever.extractMetadata(18);
            if (extractMetadata != null) {
                Integer.parseInt(extractMetadata);
                String extractMetadata2 = mediaMetadataRetriever.extractMetadata(19);
                if (extractMetadata2 != null) {
                    Integer.parseInt(extractMetadata2);
                    try {
                        mediaMetadataRetriever.release();
                    } catch (Exception unused) {
                    }
                } else {
                    throw AbstractC166987dD.A14("Required value was null.");
                }
            } else {
                throw AbstractC166987dD.A14("Required value was null.");
            }
        }
        this.A03 = point;
        this.A0A = z;
    }
}
