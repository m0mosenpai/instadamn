package X;

import com.instagram.common.gallery.Medium;
import com.instagram.common.gallery.metadata.MediaUploadMetadata;

/* renamed from: X.Jh6, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class RunnableC44260Jh6 implements Runnable {
    public final /* synthetic */ Medium A00;
    public final /* synthetic */ MediaUploadMetadata A01;

    public RunnableC44260Jh6(Medium medium, MediaUploadMetadata mediaUploadMetadata) {
        this.A00 = medium;
        this.A01 = mediaUploadMetadata;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.A00.A0G.A00(this.A01);
    }
}
