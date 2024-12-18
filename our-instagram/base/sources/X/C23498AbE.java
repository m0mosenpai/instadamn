package X;

import java.io.File;

/* renamed from: X.AbE, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C23498AbE implements X9U {
    public final /* synthetic */ C195518kr A00;

    public C23498AbE(C195518kr c195518kr) {
        this.A00 = c195518kr;
    }

    @Override // X.X9U
    public final File createTempFile(String str, String str2) {
        C14360o3.A0B(str, 0);
        File file = new File(this.A00.A00, "temp");
        AbstractC13530mf.A08(file);
        File createTempFile = File.createTempFile(str, str2, file);
        C14360o3.A07(createTempFile);
        return createTempFile;
    }
}
