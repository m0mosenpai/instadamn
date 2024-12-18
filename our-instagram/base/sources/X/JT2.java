package X;

import android.graphics.Bitmap;
import com.google.common.collect.ImmutableMap;
import com.google.common.util.concurrent.SettableFuture;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes8.dex */
public final class JT2 implements C1NJ {
    public final /* synthetic */ MUD A00;
    public final /* synthetic */ XP9 A01;
    public final /* synthetic */ SettableFuture A02;
    public final /* synthetic */ AtomicBoolean A03;

    @Override // X.C1NJ
    public final void Cza(InterfaceC59502nt interfaceC59502nt, C73033Pe c73033Pe) {
        boolean A1R = AbstractC167007dF.A1R(0, interfaceC59502nt, c73033Pe);
        Bitmap bitmap = c73033Pe.A01;
        if (bitmap != null) {
            SettableFuture settableFuture = this.A02;
            MUD mud = this.A00;
            String str = c73033Pe.A04;
            if (str == null) {
                str = "unknown";
            }
            settableFuture.set(ImmutableMap.of((Object) mud.A01, (Object) new C44238Jgi(bitmap, str)));
            return;
        }
        MUD mud2 = this.A00;
        AtomicBoolean atomicBoolean = this.A03;
        XP9 xp9 = this.A01;
        SettableFuture settableFuture2 = this.A02;
        String A0u = AnonymousClass001.A0u("onBitmapLoaded, bitmap is null. name: ", mud2.A01, ", uri: ", interfaceC59502nt.Ba1());
        C14360o3.A0B(A0u, A1R ? 1 : 0);
        Exception exc = new Exception(A0u, null);
        if (atomicBoolean.compareAndSet(false, A1R)) {
            xp9.CxS(exc);
            ImmutableMap.Builder builder = new ImmutableMap.Builder();
            builder.put("url", interfaceC59502nt.Ba1());
            Integer num = C05F.A01;
            ImmutableMap buildOrThrow = builder.buildOrThrow();
            C14360o3.A07(buildOrThrow);
            xp9.DnK(buildOrThrow, num, "Bitmap is null");
        }
        settableFuture2.setException(exc);
    }

    @Override // X.C1NJ
    public final void DLP(InterfaceC59502nt interfaceC59502nt, C82183lf c82183lf) {
        C14360o3.A0B(interfaceC59502nt, 0);
        String A0u = AnonymousClass001.A0u("onImageError, name: ", this.A00.A01, ", uri: ", interfaceC59502nt.Ba1());
        C14360o3.A0B(A0u, 1);
        Exception exc = new Exception(A0u, null);
        if (this.A03.compareAndSet(false, true)) {
            XP9 xp9 = this.A01;
            xp9.CxS(exc);
            ImmutableMap.Builder builder = new ImmutableMap.Builder();
            builder.put("url", interfaceC59502nt.Ba1());
            Integer num = C05F.A01;
            ImmutableMap buildOrThrow = builder.buildOrThrow();
            C14360o3.A07(buildOrThrow);
            xp9.DnK(buildOrThrow, num, "onImageError ");
        }
        this.A02.setException(exc);
    }

    @Override // X.C1NJ
    public final void DLW(InterfaceC59502nt interfaceC59502nt, int i) {
    }

    public JT2(MUD mud, XP9 xp9, SettableFuture settableFuture, AtomicBoolean atomicBoolean) {
        this.A00 = mud;
        this.A03 = atomicBoolean;
        this.A01 = xp9;
        this.A02 = settableFuture;
    }
}
