package X;

import android.content.Context;

/* renamed from: X.Opf, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C55771Opf implements InterfaceC58019Po5 {
    public InterfaceC58019Po5 A00;

    @Override // X.InterfaceC58019Po5
    public final MYB AUI(android.net.Uri uri) {
        AbstractC1808580n.A03("DefaultVideoMetadataExtractor.extract");
        MYB AUI = this.A00.AUI(uri);
        AbstractC1808580n.A01();
        return AUI;
    }

    @Override // X.InterfaceC58019Po5
    public final MYB AUJ(java.net.URL url) {
        AbstractC1808580n.A03("DefaultVideoMetadataExtractor.extract");
        MYB AUJ = this.A00.AUJ(url);
        AbstractC1808580n.A01();
        return AUJ;
    }

    public C55771Opf(Context context) {
        this.A00 = new C55773Oph(context, false);
    }
}
