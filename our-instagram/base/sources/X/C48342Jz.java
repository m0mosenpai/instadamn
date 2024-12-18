package X;

import android.content.Context;
import android.content.pm.PackageItemInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import java.io.File;
import java.util.List;

/* renamed from: X.2Jz, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C48342Jz implements C2K0 {
    public final C2K3 A00;
    public final C2K3 A01;
    public final C2K3 A02;
    public final C2K3 A03;
    public final C2K3 A04;
    public final C2K3 A05;
    public final C2K3 A06;
    public final C2K3 A07;
    public final C2K3 A08;
    public final C2K3 A09;
    public final C2K3 A0A;
    public final C48342Jz A0B = this;

    public /* synthetic */ C48342Jz(final C48322Jx c48322Jx) {
        final C2K2 c2k2 = new C2K2(c48322Jx);
        this.A01 = c2k2;
        final C2K7 c2k7 = new C2K7(new C2K3(c2k2) { // from class: X.2K6
            public final C2K3 A00;

            {
                this.A00 = c2k2;
            }

            @Override // X.C2K3
            public final /* bridge */ /* synthetic */ Object FFc() {
                Context A00 = ((C2K2) this.A00).A00();
                C2KQ c2kq = C2KP.A02;
                return new C2KP(A00, A00.getPackageName());
            }
        });
        this.A02 = c2k7;
        final C2K7 c2k72 = new C2K7(new C2K3(c48322Jx) { // from class: X.2K9
            public final C48322Jx A00;

            {
                this.A00 = c48322Jx;
            }

            @Override // X.C2K3
            public final /* synthetic */ Object FFc() {
                C48432Kk c48432Kk;
                Context context = this.A00.A00;
                synchronized (C48432Kk.class) {
                    c48432Kk = C48432Kk.A08;
                    if (c48432Kk == null) {
                        c48432Kk = new C48432Kk(context, EnumC48452Km.A02);
                        C48432Kk.A08 = c48432Kk;
                    }
                }
                return c48432Kk;
            }
        });
        this.A03 = c2k72;
        final C2K7 c2k73 = new C2K7(new C2K3(c2k2) { // from class: X.2KA
            public final C2K3 A00;

            {
                this.A00 = c2k2;
            }

            @Override // X.C2K3
            public final /* bridge */ /* synthetic */ Object FFc() {
                return new C48492Kq(((C2K2) this.A00).A00());
            }
        });
        this.A04 = c2k73;
        final C2K7 c2k74 = new C2K7(new C2K3(c2k2) { // from class: X.2KB
            public final C2K3 A00;

            {
                this.A00 = c2k2;
            }

            @Override // X.C2K3
            public final /* bridge */ /* synthetic */ Object FFc() {
                return new C48502Kr(((C2K2) this.A00).A00());
            }
        });
        this.A05 = c2k74;
        final C2K7 c2k75 = new C2K7(new C2K3(c2k7, c2k72, c2k73, c2k74) { // from class: X.2KC
            public final C2K3 A00;
            public final C2K3 A01;
            public final C2K3 A02;
            public final C2K3 A03;

            {
                this.A00 = c2k7;
                this.A01 = c2k72;
                this.A02 = c2k73;
                this.A03 = c2k74;
            }

            @Override // X.C2K3
            public final /* bridge */ /* synthetic */ Object FFc() {
                Object FFc = this.A00.FFc();
                C48432Kk c48432Kk = (C48432Kk) this.A01.FFc();
                return new C48522Ku((C2KP) FFc, (C48502Kr) this.A03.FFc(), (C48492Kq) this.A02.FFc(), c48432Kk);
            }
        });
        this.A06 = c2k75;
        final C2K7 c2k76 = new C2K7(new C2K3(c2k2) { // from class: X.2KD
            public final C2K3 A00;

            {
                this.A00 = c2k2;
            }

            @Override // X.C2K3
            public final /* bridge */ /* synthetic */ Object FFc() {
                String string;
                Context A00 = ((C2K2) this.A00).A00();
                try {
                    Bundle bundle = ((PackageItemInfo) A00.getPackageManager().getApplicationInfo(A00.getPackageName(), 128)).metaData;
                    if (bundle != null && (string = bundle.getString("local_testing_dir")) != null) {
                        return new File(A00.getExternalFilesDir(null), string);
                    }
                } catch (PackageManager.NameNotFoundException unused) {
                }
                return null;
            }
        });
        this.A07 = c2k76;
        final C2K3 c2k3 = new C2K3(c2k76) { // from class: X.2KE
            public final C2K3 A00;

            {
                this.A00 = c2k76;
            }

            /* JADX WARN: Code restructure failed: missing block: B:104:0x015d, code lost:
            
                r0 = java.util.Collections.unmodifiableMap(r16);
             */
            /* JADX WARN: Code restructure failed: missing block: B:105:0x0161, code lost:
            
                if (r0 == null) goto L71;
             */
            /* JADX WARN: Code restructure failed: missing block: B:106:0x0163, code lost:
            
                r1 = new X.RP6(r7, r0);
             */
            /* JADX WARN: Code restructure failed: missing block: B:107:0x0168, code lost:
            
                r2.close();
             */
            /* JADX WARN: Code restructure failed: missing block: B:108:0x016b, code lost:
            
                return r1;
             */
            /* JADX WARN: Code restructure failed: missing block: B:110:?, code lost:
            
                throw new java.lang.NullPointerException("Null splitInstallErrorCodeByModule");
             */
            /* JADX WARN: Code restructure failed: missing block: B:83:?, code lost:
            
                throw new org.xmlpull.v1.XmlPullParserException(java.lang.String.format("'%s' element does not contain 'module'/'errorCode' attributes.", "split-install-error"), r3, null);
             */
            @Override // X.C2K3
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final /* bridge */ /* synthetic */ java.lang.Object FFc() {
                /*
                    Method dump skipped, instructions count: 433
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C2KE.FFc():java.lang.Object");
            }
        };
        this.A08 = c2k3;
        final C2K7 c2k77 = new C2K7(new C2K3(c2k2, c2k76, c2k73, c2k3) { // from class: X.2KF
            public final C2K3 A00;
            public final C2K3 A01;
            public final C2K3 A02;
            public final C2K3 A03;

            {
                this.A00 = c2k2;
                this.A01 = c2k76;
                this.A02 = c2k73;
                this.A03 = c2k3;
            }

            @Override // X.C2K3
            public final /* bridge */ /* synthetic */ Object FFc() {
                Context A00 = ((C2K2) this.A00).A00();
                File file = (File) this.A01.FFc();
                return new T7R(A00, new C2K7(this.A03), (C48492Kq) this.A02.FFc(), file);
            }
        });
        this.A09 = c2k77;
        final C2K7 c2k78 = new C2K7(new C2K3(c2k75, c2k77, c2k76) { // from class: X.2KG
            public final C2K3 A00;
            public final C2K3 A01;
            public final C2K3 A02;

            {
                this.A00 = c2k75;
                this.A01 = c2k77;
                this.A02 = c2k76;
            }

            @Override // X.C2K3
            public final /* bridge */ /* synthetic */ Object FFc() {
                final C2K8 c2k8 = (C2K8) this.A00;
                final C2K8 c2k82 = (C2K8) this.A01;
                final C2K8 c2k83 = (C2K8) this.A02;
                return new C2Ju(c2k8, c2k82, c2k83) { // from class: X.2KJ
                    public final C2K8 A00;
                    public final C2K8 A01;
                    public final C2K8 A02;

                    {
                        this.A00 = c2k8;
                        this.A01 = c2k82;
                        this.A02 = c2k83;
                    }

                    private final C2Ju A00() {
                        C2K8 c2k84;
                        if (this.A02.FFc() != null) {
                            c2k84 = this.A01;
                        } else {
                            c2k84 = this.A00;
                        }
                        return (C2Ju) c2k84.FFc();
                    }

                    @Override // X.C2Ju
                    public final C5KS AGW(int i) {
                        return A00().AGW(i);
                    }

                    @Override // X.C2Ju
                    public final C5KS AOV(List list) {
                        return A00().AOV(list);
                    }

                    @Override // X.C2Ju
                    public final C5KS AOW(List list) {
                        return A00().AOW(list);
                    }

                    @Override // X.C2Ju
                    public final java.util.Set BIV() {
                        return A00().BIV();
                    }

                    @Override // X.C2Ju
                    public final C5KS Btp() {
                        return A00().Btp();
                    }

                    @Override // X.C2Ju
                    public final void EDP(C2KM c2km) {
                        A00().EDP(c2km);
                    }

                    @Override // X.C2Ju
                    public final C5KS EnT(C58640PzD c58640PzD) {
                        return A00().EnT(c58640PzD);
                    }
                };
            }
        });
        this.A0A = c2k78;
        this.A00 = new C2K7(new C2K3(c2k78, c48322Jx) { // from class: X.2KH
            public final C2K3 A00;
            public final C48322Jx A01;

            {
                this.A01 = c48322Jx;
                this.A00 = c2k78;
            }

            @Override // X.C2K3
            public final /* bridge */ /* synthetic */ Object FFc() {
                Object FFc = this.A00.FFc();
                if (FFc != null) {
                    return FFc;
                }
                throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
            }
        });
    }
}
