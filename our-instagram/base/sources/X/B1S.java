package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.media.MediaMetadataRetriever;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.SimpleImageUrl;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.concurrent.Callable;

/* loaded from: classes4.dex */
public final class B1S implements Callable {
    public final C195868lW A00;
    public final WeakReference A01;
    public final Context A02;
    public final UserSession A03;
    public final /* synthetic */ C8SH A04;

    public B1S(Context context, UserSession userSession, C219859nX c219859nX, C195868lW c195868lW, C8SH c8sh) {
        this.A04 = c8sh;
        this.A03 = userSession;
        this.A02 = context;
        this.A00 = c195868lW;
        this.A01 = new WeakReference(c219859nX);
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        C219859nX c219859nX = (C219859nX) this.A01.get();
        C195868lW c195868lW = this.A00;
        String str = c195868lW.A0k;
        if (c219859nX != null && c195868lW.equals(c219859nX.A00) && str != null) {
            MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
            try {
                try {
                    mediaMetadataRetriever.setDataSource(str);
                    long j = c195868lW.A0H * 1000;
                    Bitmap frameAtTime = mediaMetadataRetriever.getFrameAtTime(j, 2);
                    if (frameAtTime == null && (frameAtTime = mediaMetadataRetriever.getFrameAtTime(j, 0)) == null && (frameAtTime = mediaMetadataRetriever.getFrameAtTime(j, 1)) == null) {
                        frameAtTime = mediaMetadataRetriever.getFrameAtTime(j, 3);
                    }
                    if (frameAtTime != null) {
                        C8SH c8sh = this.A04;
                        Bitmap A0A = C1NC.A0A(frameAtTime, c8sh.A01, c8sh.A00, true);
                        AbstractC916948n.A04().mkdirs();
                        File file = new File(AbstractC916948n.A04(), AnonymousClass001.A0r(MSV.A00(422), AnonymousClass001.A02(c195868lW.A0H, c195868lW.A06, "_thumbnail_", "_"), ".jpeg", System.currentTimeMillis()));
                        try {
                            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(file));
                            try {
                                AbstractC50673MYr.A00(Bitmap.CompressFormat.JPEG, A0A, bufferedOutputStream);
                                bufferedOutputStream.close();
                                A0A.recycle();
                                return new SimpleImageUrl(android.net.Uri.fromFile(file).toString(), A0A.getWidth(), A0A.getHeight());
                            } finally {
                            }
                        } catch (Throwable th) {
                            A0A.recycle();
                            throw th;
                        }
                    }
                    throw new IOException(AnonymousClass001.A0O("Failed to extract frame at time", c195868lW.A0H));
                } catch (RuntimeException e) {
                    String A0u = AnonymousClass001.A0u("Failed to setup retriever and getFrameAtTime", str, "\n", e.getMessage());
                    C14360o3.A0B(A0u, 1);
                    AbstractC12120kG.A04("VideoThumbnailLoader", A0u, 817901858, e);
                    throw new IOException(AnonymousClass001.A0R("Failed to setup retriever and getFrameAtTime", str), e);
                }
            } finally {
                mediaMetadataRetriever.release();
            }
        }
        return null;
    }
}
