package X;

import com.facebook.common.dextricks.OdexSchemeArtXdex;
import java.io.IOException;
import java.util.Collections;
import java.util.Map;

/* loaded from: classes10.dex */
public final class T4Z implements InterfaceC92354Bq {
    public long A00;
    public long A01;
    public android.net.Uri A02;
    public InterfaceC92354Bq A03;
    public String A04;
    public boolean A05;
    public long A06;
    public C2BC A07;
    public C49802Qq A08;
    public boolean A09;
    public boolean A0A;
    public final InterfaceC92354Bq A0B = new C4C1(false);
    public final InterfaceC92354Bq A0C;
    public final InterfaceC92354Bq A0D;
    public final C2QE A0E;

    private final void A00() {
        try {
            InterfaceC92354Bq interfaceC92354Bq = this.A03;
            if (!C14360o3.A0K(interfaceC92354Bq, this.A0B)) {
                C14360o3.A0K(interfaceC92354Bq, this.A0C);
            }
            this.A03.close();
        } finally {
            this.A09 = false;
            C49802Qq c49802Qq = this.A08;
            if (c49802Qq != null) {
                this.A0E.EEJ(c49802Qq);
                this.A08 = null;
            }
        }
    }

    @Override // X.InterfaceC92354Bq
    public final /* synthetic */ void cancel() {
    }

    @Override // X.InterfaceC92354Bq
    public final void close() {
        this.A02 = null;
        try {
            A00();
            this.A0D.close();
        } catch (IOException e) {
            if (this.A03 == this.A0B || (e instanceof C1121554i)) {
                this.A05 = true;
            }
            throw e;
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [boolean, X.T4Z] */
    @Override // X.InterfaceC92354Bq
    public final long open(C4C7 c4c7) {
        String A19;
        long j;
        String queryParameter;
        Long A0j;
        C14360o3.A0B(c4c7, 0);
        android.net.Uri uri = c4c7.A06;
        C14360o3.A06(uri);
        ?? A09 = LLT.A09(uri.toString());
        if (A09 != 0) {
            try {
                this.A02 = uri;
                LJJ ljj = C48517LdF.A08;
                String queryParameter2 = uri.getQueryParameter("sha256");
                if (queryParameter2 != null) {
                    A19 = AbstractC62268S4n.A00(queryParameter2);
                } else {
                    A19 = AbstractC166987dD.A19(uri);
                }
                this.A04 = A19;
                long j2 = c4c7.A04;
                this.A01 = j2;
                long j3 = c4c7.A03;
                this.A0A = this.A05;
                android.net.Uri uri2 = this.A02;
                if (uri2 != null && (queryParameter = uri2.getQueryParameter("file_length")) != null && (A0j = AbstractC166997dE.A0j(queryParameter)) != null) {
                    j = A0j.longValue();
                } else {
                    j = -1;
                }
                if (j3 == -1 && !this.A0A) {
                    long A00 = S2H.A00(this.A0E.Ar2(this.A04));
                    this.A00 = A00;
                    if (A00 != -1) {
                        long j4 = A00 - j2;
                        this.A00 = j4;
                        if (j4 <= 0) {
                            StringBuilder A1C = AbstractC166987dD.A1C();
                            A1C.append("DataSpec.position: ");
                            A1C.append(j2);
                            A1C.append(" originalFileLength: ");
                            A1C.append(j);
                            throw new C93224Fy(AbstractC58320PtC.A13(" bytesRemaining: ", A1C, j4), 2008);
                        }
                    }
                } else {
                    long j5 = j - this.A01;
                    if (j3 > j5) {
                        j3 = j5;
                    }
                    if (j3 < -1) {
                        j3 = -1;
                    }
                    this.A00 = j3;
                }
                A02(false);
                long j6 = this.A00;
                if (j6 == -1) {
                    long j7 = j - j2;
                    if (j7 < -1) {
                        j7 = -1;
                    }
                    this.A00 = j7;
                    j6 = j7;
                }
                long Ajd = this.A0E.Ajd(this.A01, this.A04, j6);
                if (1 <= Ajd) {
                    long j8 = this.A00;
                    if (Ajd < j8) {
                        long j9 = j8 - Ajd;
                        Map emptyMap = Collections.emptyMap();
                        android.net.Uri uri3 = this.A02;
                        if (uri3 == null) {
                            uri3 = android.net.Uri.EMPTY;
                        }
                        String str = this.A04;
                        C4C6 c4c6 = new C4C6();
                        C4B8.A02(uri3);
                        this.A0D.open(new C4C7(uri3, c4c6, str, emptyMap, null, 1, 0, 0L, Ajd, j9));
                    }
                }
                return this.A00;
            } catch (IOException e) {
                InterfaceC92354Bq interfaceC92354Bq = A09.A03;
                InterfaceC92354Bq interfaceC92354Bq2 = A09.A0B;
                if (interfaceC92354Bq == interfaceC92354Bq2 || (e instanceof C1121554i)) {
                    A09.A05 = true;
                }
                if (interfaceC92354Bq == interfaceC92354Bq2) {
                    return A09.open(c4c7);
                }
                throw e;
            }
        }
        throw new C93214Fx(c4c7, "Invalid uri", 1004, 1);
    }

    @Override // X.InterfaceC92364Br
    public final int read(byte[] bArr, int i, int i2) {
        C14360o3.A0B(bArr, 0);
        if (i2 == 0) {
            return 0;
        }
        if (this.A00 == 0) {
            return -1;
        }
        try {
            if (this.A01 >= this.A06) {
                A02(true);
            }
            int read = this.A03.read(bArr, i, i2);
            if (read == -1) {
                InterfaceC92354Bq interfaceC92354Bq = this.A03;
                if (!C14360o3.A0K(interfaceC92354Bq, this.A0B)) {
                    C14360o3.A0K(interfaceC92354Bq, this.A0C);
                }
            }
            if (read != -1) {
                long j = read;
                this.A01 += j;
                long j2 = this.A00;
                if (j2 != -1) {
                    this.A00 = j2 - j;
                    return read;
                }
            } else {
                if (this.A09) {
                    A01(0L);
                    return read;
                }
                long j3 = this.A00;
                if (j3 <= 0) {
                    if (j3 == -1) {
                    }
                }
                A00();
                A02(false);
                return read(bArr, i, i2);
            }
            return read;
        } catch (IOException e) {
            if (this.A09) {
                Throwable th = e;
                do {
                    if ((th instanceof C93224Fy) && ((C93224Fy) th).A00 == 2008) {
                        A01(0L);
                        return -1;
                    }
                    th = th.getCause();
                } while (th != null);
            }
            if (this.A03 == this.A0B || (e instanceof C1121554i)) {
                this.A05 = true;
            }
            throw e;
        }
    }

    private final void A01(long j) {
        this.A00 = j;
        if (this.A03 == this.A0C) {
            C2QE c2qe = this.A0E;
            long A00 = S2H.A00(c2qe.Ar2(this.A04));
            long j2 = this.A01 + j;
            if (A00 < j2) {
                SEO seo = new SEO();
                seo.A01.put("exo_len", Long.valueOf(j2));
                seo.A00.remove("exo_len");
                c2qe.AC5(seo, this.A04);
            }
        }
    }

    private final void A02(boolean z) {
        C49802Qq Enn;
        boolean z2;
        C4C7 c4c7;
        InterfaceC92354Bq interfaceC92354Bq;
        long j;
        if (this.A0A) {
            Enn = null;
        } else {
            Enn = this.A0E.Enn(C05F.A0C, this.A04, this.A01, this.A00);
        }
        if (Enn == null) {
            interfaceC92354Bq = this.A0D;
            Map emptyMap = Collections.emptyMap();
            android.net.Uri uri = this.A02;
            if (uri == null) {
                uri = android.net.Uri.EMPTY;
            }
            long j2 = this.A01;
            long j3 = this.A00;
            if (j3 <= 0) {
                j3 = -1;
            }
            String str = this.A04;
            C4C6 c4c6 = new C4C6();
            C4B8.A02(uri);
            z2 = true;
            c4c7 = new C4C7(uri, c4c6, str, emptyMap, null, 1, 0, 0L, j2, j3);
        } else if (Enn.A07) {
            android.net.Uri fromFile = android.net.Uri.fromFile(Enn.A05);
            long j4 = this.A01 - Enn.A04;
            long j5 = Enn.A03 - j4;
            long j6 = this.A00;
            if (j6 != -1) {
                j5 = Math.min(j5, j6);
            }
            Map emptyMap2 = Collections.emptyMap();
            if (fromFile == null) {
                fromFile = android.net.Uri.EMPTY;
            }
            if (j5 <= 0) {
                j5 = -1;
            }
            String str2 = this.A04;
            C4C6 c4c62 = new C4C6();
            C4B8.A02(fromFile);
            z2 = true;
            c4c7 = new C4C7(fromFile, c4c62, str2, emptyMap2, null, 1, 0, 0L, j4, j5);
            interfaceC92354Bq = this.A0B;
        } else {
            long j7 = Enn.A03;
            if (j7 == -1) {
                j7 = this.A00;
            } else {
                long j8 = this.A00;
                if (j8 != -1) {
                    j7 = Math.min(j7, j8);
                }
            }
            Map emptyMap3 = Collections.emptyMap();
            android.net.Uri uri2 = this.A02;
            if (uri2 == null) {
                uri2 = android.net.Uri.EMPTY;
            }
            long j9 = this.A01;
            if (j7 <= 0) {
                j7 = -1;
            }
            String str3 = this.A04;
            C4C6 c4c63 = new C4C6();
            C4B8.A02(uri2);
            z2 = true;
            c4c7 = new C4C7(uri2, c4c63, str3, emptyMap3, null, 1, 0, 0L, j9, j7);
            interfaceC92354Bq = this.A0C;
        }
        if (!this.A0A && interfaceC92354Bq == this.A0D) {
            j = this.A01 + OdexSchemeArtXdex.STATE_DO_PERIODIC_PGO_COMP_FINISHED;
        } else {
            j = Long.MAX_VALUE;
        }
        this.A06 = j;
        boolean z3 = true;
        if (z) {
            InterfaceC92354Bq interfaceC92354Bq2 = this.A03;
            InterfaceC92354Bq interfaceC92354Bq3 = this.A0D;
            C4B8.A04(AbstractC167007dF.A1X(interfaceC92354Bq2, interfaceC92354Bq3));
            if (interfaceC92354Bq != interfaceC92354Bq3) {
                try {
                    A00();
                } catch (IOException e) {
                    if (Enn != null && (!Enn.A07) == z2) {
                        this.A0E.EEJ(Enn);
                    }
                    throw e;
                }
            } else {
                return;
            }
        }
        if (Enn != null && (!Enn.A07)) {
            this.A08 = Enn;
        }
        this.A03 = interfaceC92354Bq;
        if (c4c7.A03 != -1) {
            z3 = false;
        }
        this.A09 = z3;
        long open = interfaceC92354Bq.open(c4c7);
        if (this.A09 && open != -1) {
            A01(open);
        }
    }

    @Override // X.InterfaceC92354Bq
    public final android.net.Uri getUri() {
        return this.A02;
    }

    public T4Z(InterfaceC92354Bq interfaceC92354Bq, C2QE c2qe) {
        this.A0E = c2qe;
        this.A0D = interfaceC92354Bq;
        this.A0C = new T4V(new T4T(c2qe), interfaceC92354Bq);
        this.A03 = interfaceC92354Bq;
    }

    @Override // X.InterfaceC92354Bq
    public final void addTransferListener(C2BC c2bc) {
        this.A07 = c2bc;
    }

    @Override // X.InterfaceC92354Bq
    public final /* synthetic */ Map getResponseHeaders() {
        return Collections.emptyMap();
    }
}
