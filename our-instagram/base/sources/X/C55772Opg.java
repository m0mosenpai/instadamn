package X;

import android.content.Context;
import android.os.Build;

/* renamed from: X.Opg, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C55772Opg implements InterfaceC58019Po5 {
    public C66013Ty9 A00;
    public final C66014TyA A01;
    public final C55773Oph A02;

    /* JADX WARN: Type inference failed for: r0v15, types: [X.PpU, java.lang.Object] */
    @Override // X.InterfaceC58019Po5
    public final MYB AUI(android.net.Uri uri) {
        Exception e;
        AbstractC1808580n.A03("ExtendedVideoMetadataExtractor.extract");
        C66014TyA c66014TyA = this.A01;
        if (c66014TyA.A01()) {
            C66013Ty9 c66013Ty9 = this.A00;
            if (c66013Ty9 == null) {
                c66013Ty9 = new C66013Ty9(c66014TyA);
                this.A00 = c66013Ty9;
            }
            try {
                MYB AUI = c66013Ty9.AUI(uri);
                MYB AUI2 = this.A02.AUI(uri);
                int i = AUI.A02;
                int i2 = AUI.A01;
                if (Build.VERSION.SDK_INT >= 30) {
                    i = AUI2.A02;
                    i2 = AUI2.A01;
                } else {
                    String path = uri.getPath();
                    AbstractC1126356r.A06(path);
                    try {
                        C50719MaI A00 = C50719MaI.A00(new Object(), path);
                        if (A00 != null) {
                            i = A00.A02;
                            i2 = A00.A01;
                        }
                    } catch (Exception e2) {
                        C0K8.A0F("MediaFormatUtil", "Exception while extracting video media format metadata:", e2);
                    }
                }
                long j = AUI.A07;
                int i3 = AUI.A05;
                int i4 = AUI.A03;
                int i5 = AUI.A04;
                long j2 = AUI.A06;
                long j3 = AUI.A08;
                int i6 = AUI.A00;
                MYB myb = new MYB(AUI.A09, AUI.A0E, null, AUI.A0C, AUI2.A0G, AUI2.A0F, AUI.A0B, AUI.A0A, AUI.A0D, "VIDEO", null, i3, i4, i5, i, i2, i6, j, j2, j3, AUI2.A0K);
                AbstractC1808580n.A01();
                return myb;
            } catch (Exception e3) {
                e = e3;
            }
        } else {
            e = null;
        }
        try {
            MYB AUI3 = this.A02.AUI(uri);
            AbstractC1808580n.A01();
            return AUI3;
        } catch (Exception e4) {
            if (e != null) {
                StackTraceElement[] stackTrace = e.getStackTrace();
                throw new RuntimeException(AnonymousClass001.A18("Exception in ExtendedVideoMetadataExtractor: ", e.getMessage(), "\nstack trace: ", stackTrace[0].toString(), "\n", stackTrace[1].toString(), "\n", stackTrace[2].toString(), "\n"), e4);
            }
            throw new RuntimeException("Exception in ExtendedVideoMetadataExtractor: ", e4);
        }
    }

    @Override // X.InterfaceC58019Po5
    public final MYB AUJ(java.net.URL url) {
        AbstractC1808580n.A03("ExtendedVideoMetadataExtractor.extract");
        try {
            MYB AUJ = this.A02.AUJ(url);
            AbstractC1808580n.A01();
            return AUJ;
        } catch (Exception e) {
            throw new RuntimeException("Exception in ExtendedVideoMetadataExtractor: ", e);
        }
    }

    public C55772Opg(Context context, C66014TyA c66014TyA) {
        this.A01 = c66014TyA;
        this.A02 = new C55773Oph(context, false);
    }
}
