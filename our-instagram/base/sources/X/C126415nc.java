package X;

import com.facebook.msys.mci.UrlResponse;
import java.io.File;

/* renamed from: X.5nc, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C126415nc {
    public final UrlResponse A00;
    public final File A01;
    public final byte[] A02;

    public C126415nc(UrlResponse urlResponse, File file, byte[] bArr) {
        if (bArr == null && file == null) {
            throw new IllegalArgumentException("Must provide either a non-null responseBody or downloadFile");
        }
        this.A01 = file;
        this.A02 = bArr;
        this.A00 = urlResponse;
    }
}
