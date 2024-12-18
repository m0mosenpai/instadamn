package X;

import com.facebook.superpack.SuperpackFileInputStream;
import java.io.InputStream;

/* renamed from: X.Swv, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63969Swv implements InterfaceC03200Dd {
    public static final C63969Swv A00 = new C63969Swv();

    @Override // X.InterfaceC03200Dd
    public final SuperpackFileInputStream AOL(InputStream inputStream) {
        C14360o3.A0B(inputStream, 0);
        return SuperpackFileInputStream.createFromSingletonArchiveInputStream(inputStream, "xz");
    }
}
