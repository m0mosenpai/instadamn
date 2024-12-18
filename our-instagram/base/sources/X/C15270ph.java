package X;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

/* renamed from: X.0ph, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C15270ph implements C0N9 {
    public final int A00;
    public final int A01;
    public final Object A02;
    public final boolean A03;

    public C15270ph(InterfaceC08830cm interfaceC08830cm, int i, int i2, boolean z) {
        this.A00 = i2;
        if (i2 != 0) {
            this.A02 = interfaceC08830cm;
            this.A03 = z;
            this.A01 = i;
        } else {
            this.A02 = interfaceC08830cm;
            this.A03 = z;
            this.A01 = i;
        }
    }

    @Override // X.C0N9
    public final /* bridge */ /* synthetic */ Object ALP(C0NK c0nk) {
        if (this.A00 != 0) {
            InterfaceC08830cm interfaceC08830cm = (InterfaceC08830cm) this.A02;
            boolean z = this.A03;
            int i = this.A01;
            return new C03060Ch(c0nk.A04(), c0nk.A05(), interfaceC08830cm, i, z);
        }
        final C0Pe A05 = c0nk.A05();
        final C0LW A04 = c0nk.A04();
        final InterfaceC08830cm interfaceC08830cm2 = (InterfaceC08830cm) this.A02;
        final boolean z2 = this.A03;
        final int i2 = this.A01;
        return new C0OO(A04, A05, interfaceC08830cm2, i2, z2) { // from class: X.0We
            public final int A00;
            public final C0LW A01;
            public final C0Pe A02;
            public final InterfaceC08830cm A03;
            public final boolean A04;

            @Override // X.C0OO
            public final /* synthetic */ C0Z0 BNJ() {
                return null;
            }

            public static Properties A00(File file) {
                Properties properties = new Properties();
                if (file != null) {
                    try {
                        FileInputStream fileInputStream = new FileInputStream(file);
                        try {
                            properties.load(fileInputStream);
                            fileInputStream.close();
                            return properties;
                        } finally {
                        }
                    } catch (IOException e) {
                        C0K8.A0H("lacrima", "Error while reading Anr report", e);
                        C0PC.A00().DEh("ReadAnrReport", e, null);
                    }
                }
                return properties;
            }

            @Override // X.C0OO
            public final C0OP BW2() {
                return C0OP.A05;
            }

            /* JADX WARN: Code restructure failed: missing block: B:75:0x017d, code lost:
            
                if (r0 != false) goto L72;
             */
            /* JADX WARN: Code restructure failed: missing block: B:78:0x015c, code lost:
            
                if (r4 != null) goto L44;
             */
            /* JADX WARN: Removed duplicated region for block: B:39:0x00b7  */
            @Override // X.C0OO
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void start() {
                /*
                    Method dump skipped, instructions count: 402
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C06560We.start():void");
            }

            {
                this.A02 = A05;
                this.A01 = A04;
                this.A03 = interfaceC08830cm2;
                this.A04 = z2;
                this.A00 = i2;
            }

            @Override // X.C0OO
            public final /* synthetic */ int BDP() {
                return 100000;
            }
        };
    }
}
