package X;

import com.facebook.superpack.SuperpackArchive;
import com.facebook.superpack.SuperpackFileInputStream;
import java.io.InputStream;

/* renamed from: X.Sww, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63970Sww implements InterfaceC03200Dd {
    public static final C63970Sww A00 = new C63970Sww();

    @Override // X.InterfaceC03200Dd
    public final SuperpackFileInputStream AOL(InputStream inputStream) {
        C14360o3.A0B(inputStream, 0);
        String str = SuperpackArchive.TAG;
        return SuperpackFileInputStream.createFromSingletonArchiveInputStream(inputStream, "spo", Runtime.getRuntime().availableProcessors());
    }
}
