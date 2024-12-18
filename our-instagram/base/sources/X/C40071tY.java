package X;

import java.io.File;
import java.io.IOException;
import java.util.UUID;

/* renamed from: X.1tY, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C40071tY extends AbstractC40081tZ {
    public final int A00;
    public final AbstractC40011tS A01;
    public final File A02;
    public final String A03;

    public C40071tY(InterfaceC38361qQ interfaceC38361qQ, C39901tE c39901tE, AbstractC40011tS abstractC40011tS, C04060Jx c04060Jx, File file, int i, int i2, int i3, int i4) {
        super(interfaceC38361qQ, c39901tE, c04060Jx, i, i2, i3);
        this.A02 = file;
        this.A01 = abstractC40011tS;
        this.A03 = UUID.randomUUID().toString();
        this.A00 = i4;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x00c4, code lost:
    
        r7 = A00(r2, r8);
     */
    @Override // X.AbstractC40081tZ
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ X.AbstractC41001v7 A06(X.AbstractC41001v7 r16, java.lang.String r17) {
        /*
            Method dump skipped, instructions count: 259
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C40071tY.A06(X.1v7, java.lang.String):X.1v7");
    }

    @Override // X.AbstractC40081tZ
    public final /* bridge */ /* synthetic */ Object A07() {
        AbstractC41001v7 abstractC41001v7 = super.A02;
        if (abstractC41001v7 == null) {
            return null;
        }
        return ((C40981v5) abstractC41001v7).A00;
    }

    private C40981v5 A00(AbstractC40721uf abstractC40721uf, File file) {
        if (!file.getParentFile().isDirectory() && !file.getParentFile().mkdirs()) {
            StringBuilder sb = new StringBuilder();
            sb.append("Unable to create parent directories for: ");
            sb.append(file);
            throw new IOException(sb.toString());
        }
        return new C40981v5(abstractC40721uf, this, file);
    }
}
