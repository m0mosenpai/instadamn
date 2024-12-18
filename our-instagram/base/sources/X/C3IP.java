package X;

import java.io.FileInputStream;
import java.nio.channels.FileChannel;

/* renamed from: X.3IP, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3IP extends AbstractC60252p8 {
    public final String A00;

    @Override // X.AbstractC60252p8
    public final FileChannel A01() {
        return ((FileInputStream) super.A00).getChannel();
    }

    public C3IP(C1H2 c1h2) {
        super(new FileInputStream(c1h2.A02()));
        c1h2.A00();
        this.A00 = c1h2.A02().getAbsolutePath();
    }
}
