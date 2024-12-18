package X;

import android.content.Context;
import com.instagram.process.instagram.InstagramApplicationForMainProcess;
import java.io.File;
import java.io.FileInputStream;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;

/* renamed from: X.0KS, reason: invalid class name */
/* loaded from: classes.dex */
public final class C0KS extends C0YY implements InterfaceC16820sZ {
    public final /* synthetic */ InstagramApplicationForMainProcess A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0KS(InstagramApplicationForMainProcess instagramApplicationForMainProcess) {
        super(0);
        this.A00 = instagramApplicationForMainProcess;
    }

    @Override // X.InterfaceC16820sZ
    public final /* bridge */ /* synthetic */ Object invoke() {
        final Context applicationContext = this.A00.context.getApplicationContext();
        C14360o3.A07(applicationContext);
        return new AbstractC211911v(applicationContext) { // from class: X.141
            public final Context A00;

            @Override // X.AbstractC211911v
            public final void A04(C226418s c226418s) {
                C14360o3.A0B(c226418s, 0);
                long j = this.A01;
                long j2 = super.A00;
                c226418s.A0Q(c226418s.A02, "LAYOUTS_MLOCK_INIT_START", j);
                c226418s.A0Q(c226418s.A02, "LAYOUTS_MLOCK_INIT_END", j2);
            }

            @Override // X.AbstractC211911v
            public final String A06() {
                return "BundledLayoutLoaderMlockInitializer";
            }

            {
                this.A00 = applicationContext;
            }

            @Override // X.AbstractC211911v
            public final void A07() {
                int A01 = (int) C20150ym.A01(AbstractC20070ye.A00(18597921356257662L));
                if (A01 != 0) {
                    float A00 = C20150ym.A00(AbstractC20070ye.A00(19160871309869691L));
                    if (A00 > 0.0f && ((float) C0AT.A01[0]) < A00 * 1024.0f * 1024.0f) {
                        return;
                    }
                    File file = new File(C23161Av.A00(this.A00).AXd(null, 2093722256), "layouts.bin");
                    if (!file.exists()) {
                        return;
                    }
                    InterfaceC09390do interfaceC09390do = C27111Tk.A02;
                    if (AbstractC25061Kk.A00().A0E() || AbstractC25061Kk.A00().A0D()) {
                        return;
                    }
                    FileInputStream fileInputStream = new FileInputStream(file);
                    FileChannel channel = fileInputStream.getChannel();
                    MappedByteBuffer map = channel.map(FileChannel.MapMode.READ_ONLY, 0L, channel.size());
                    C14360o3.A0A(map);
                    C27111Tk.A01 = new C62534SFl(fileInputStream, map, channel);
                    String canonicalPath = file.getCanonicalPath();
                    C14360o3.A07(canonicalPath);
                    C70779Wgs c70779Wgs = new C70779Wgs(canonicalPath, A01, C20150ym.A07(AbstractC20070ye.A00(18316446379623474L)));
                    C218914p.A05(c70779Wgs);
                    boolean A07 = C20150ym.A07(AbstractC20070ye.A00(18316446379689011L));
                    C68021V6n c68021V6n = new C68021V6n(c70779Wgs, true);
                    if (A07) {
                        c68021V6n.run();
                    } else {
                        C14120nc.A00().ATO(c68021V6n);
                    }
                }
            }
        };
    }
}
