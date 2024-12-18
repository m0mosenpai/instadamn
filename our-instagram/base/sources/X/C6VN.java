package X;

import com.facebook.stash.core.FileStash;
import java.io.File;

/* renamed from: X.6VN, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C6VN implements C6VO {
    public static volatile C6VN A01;
    public final FileStash A00 = C1M7.A01().A05(538797458);

    @Override // X.C6VO
    public final File BoX(String str) {
        return this.A00.getFile(str);
    }

    @Override // X.C6VO
    public final File COc(String str) {
        return this.A00.insertFile(str);
    }

    @Override // X.C6VO
    public final boolean remove(String str) {
        return this.A00.remove(str);
    }
}
