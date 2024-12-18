package X;

import com.instagram.common.gallery.Medium;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

/* loaded from: classes8.dex */
public final class KML extends AbstractRunnableC14200nk {
    public final /* synthetic */ long A00;
    public final /* synthetic */ long A01;
    public final /* synthetic */ Medium A02;
    public final /* synthetic */ C8NW A03;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KML(Medium medium, C8NW c8nw, long j, long j2) {
        super(469, 3, false, false);
        this.A03 = c8nw;
        this.A02 = medium;
        this.A01 = j;
        this.A00 = j2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        File A11;
        boolean z;
        C8NW c8nw = this.A03;
        try {
            A11 = File.createTempFile(AnonymousClass001.A0R("tmp_video_", AbstractC166997dE.A0n()), ".mp4", c8nw.A0f.getCacheDir());
        } catch (IOException e) {
            C0K8.A0F("FileUtil", "failed to create temp file", e);
            A11 = AbstractC166987dD.A11("");
        }
        C14360o3.A07(A11);
        if (AbstractC43592JPx.A04(A11.getAbsolutePath()) > 0) {
            ArrayList A1E = AbstractC166987dD.A1E();
            A1E.add(EnumC53110NeN.A03);
            String str = this.A02.A0X;
            String absolutePath = A11.getAbsolutePath();
            C14360o3.A07(absolutePath);
            z = No1.A00(str, absolutePath, A1E, this.A01, this.A00);
        } else {
            z = false;
        }
        C11T.A02(new RunnableC24883Azi(this.A02, c8nw, A11, this.A00, this.A01, z));
    }
}
