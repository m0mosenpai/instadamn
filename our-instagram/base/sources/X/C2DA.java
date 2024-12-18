package X;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.ui.blur.BlurUtil;
import com.instagram.debug.network.DebugNetworkShapingRequestCallbackWrapper;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.concurrent.Semaphore;

/* renamed from: X.2DA, reason: invalid class name */
/* loaded from: classes.dex */
public final class C2DA implements InterfaceC26491Qe {
    public static DebugNetworkShapingRequestCallbackWrapper A0O;
    public static final int[] A0P = {1, 8, 4, 2, 1, 1, 1, 1, 1};
    public int A00;
    public long A02;
    public C59722oF A04;
    public AbstractC12990ll A06;
    public final int A07;
    public final int A08;
    public final C0f6 A09;
    public final C1O2 A0A;
    public final C59562nz A0B;
    public final C59592o2 A0D;
    public final ImageUrl A0E;
    public final String A0F;
    public final int A0G;
    public final InterfaceC11560jF A0H;
    public final C1QY A0I;
    public final C1NZ A0J;
    public final String A0K;
    public final List A0L;
    public final boolean A0M;
    public final boolean A0N;
    public boolean A05 = false;
    public final C74013Tp A0C = new C74013Tp();
    public int A01 = 0;
    public long A03 = System.currentTimeMillis();

    private void A00() {
        int i;
        Bitmap A00;
        C59592o2 c59592o2 = this.A0D;
        if (c59592o2.A01 != null) {
            C74013Tp c74013Tp = this.A0C;
            int i2 = c74013Tp.A01;
            C80673iw c80673iw = c59592o2.A01;
            if (c80673iw != null && i2 > c80673iw.A01 && (i = c74013Tp.A01) > this.A01) {
                int i3 = c74013Tp.A00;
                this.A04.getClass();
                int i4 = 1;
                boolean z = false;
                if (i < 4) {
                    z = true;
                    i4 = A0P[i];
                }
                Semaphore semaphore = this.A0A.A04.A0K.A00;
                if (semaphore == null) {
                    synchronized (C25761Ni.class) {
                        BitmapFactory.Options options = new BitmapFactory.Options();
                        options.inSampleSize = i4;
                        A00 = C0fL.A00(this.A04.A02, 0, i3 + 2, options);
                    }
                } else {
                    try {
                        semaphore.acquire();
                        BitmapFactory.Options options2 = new BitmapFactory.Options();
                        options2.inSampleSize = i4;
                        A00 = C0fL.A00(this.A04.A02, 0, i3 + 2, options2);
                        semaphore.release();
                    } catch (InterruptedException unused) {
                        return;
                    }
                }
                if (A00 != null) {
                    if (z) {
                        BlurUtil.blurInPlace(A00, (4 - i) * 3);
                    }
                    C59562nz c59562nz = this.A0B;
                    c59562nz.A09 = new C61332qv(A00, this.A0E.Ar1());
                    c59562nz.A0V = i;
                    HandlerC25861Nt handlerC25861Nt = c59562nz.A0c.A0N;
                    handlerC25861Nt.sendMessage(handlerC25861Nt.obtainMessage(5, c59562nz));
                }
            }
        }
    }

    private void A01(String str) {
        int i;
        if (!this.A05) {
            C59722oF c59722oF = this.A04;
            if (c59722oF != null) {
                C74013Tp c74013Tp = this.A0C;
                c74013Tp.A00(c59722oF);
                i = c74013Tp.A01;
                if (i > 0) {
                    int i2 = c74013Tp.A00;
                    C59722oF c59722oF2 = this.A04;
                    c59722oF2.A02[i2 + 1] = -39;
                    int i3 = c59722oF2.A00;
                    int i4 = (i3 - i2) - 2;
                    if (!c59722oF2.A01) {
                        c59722oF2.A00 = Math.max(i3 - i4, 0);
                        c59722oF2.A01 = true;
                    } else {
                        throw new RuntimeException("The buffer is already frozen");
                    }
                }
            } else {
                i = 0;
            }
            InterfaceC11560jF interfaceC11560jF = this.A0H;
            String str2 = "null";
            if (interfaceC11560jF != null) {
                ImageUrl imageUrl = this.A0E;
                String str3 = "null";
                if (str != null) {
                    str3 = str;
                }
                interfaceC11560jF.Cjv(imageUrl, str3, "NetworkImageLoader", 20003);
            }
            C59562nz c59562nz = this.A0B;
            C59722oF c59722oF3 = this.A04;
            String Ar1 = this.A0E.Ar1();
            if (str != null) {
                str2 = str;
            }
            c59562nz.A0D(c59722oF3, Ar1, str2, i, 0, false, false);
            this.A04 = null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x00c1, code lost:
    
        if (r5 > r9) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01c5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.InterfaceC27191Tt A02() {
        /*
            Method dump skipped, instructions count: 475
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2DA.A02():X.1Tt");
    }

    public final void finalize() {
        if (this.A04 == null) {
        } else {
            throw new IllegalThreadStateException("byte array not cleaned up");
        }
    }

    @Override // X.InterfaceC26491Qe
    public final void onComplete() {
        if (!this.A05) {
            InterfaceC11560jF interfaceC11560jF = this.A0H;
            if (interfaceC11560jF != null) {
                interfaceC11560jF.Cjx(this.A0E);
            }
            this.A04.getClass();
            C59722oF c59722oF = this.A04;
            c59722oF.A01 = true;
            this.A0B.A0D(c59722oF, this.A0E.Ar1(), null, this.A0G, 0, true, false);
            this.A04 = null;
        }
    }

    @Override // X.InterfaceC26491Qe
    public final void onNewData(ByteBuffer byteBuffer) {
        int i;
        int i2;
        int i3;
        if (!this.A05) {
            try {
                this.A04.getClass();
                this.A04.A03(byteBuffer);
                this.A04.getClass();
                long j = this.A02;
                if (j > 0) {
                    i = (int) ((this.A04.A00 / ((float) j)) * 100.0f);
                    if (this.A0D.A04 && (i3 = i / 10) > this.A00) {
                        C59562nz c59562nz = this.A0B;
                        c59562nz.A0U = i;
                        HandlerC25861Nt handlerC25861Nt = c59562nz.A0c.A0N;
                        handlerC25861Nt.sendMessage(handlerC25861Nt.obtainMessage(1, c59562nz));
                        this.A00 = i3;
                    }
                } else {
                    i = 0;
                }
                C59592o2 c59592o2 = this.A0D;
                if (c59592o2.A01 != null && i < this.A07) {
                    long j2 = this.A03;
                    C80673iw c80673iw = c59592o2.A01;
                    if (c80673iw != null) {
                        i2 = c80673iw.A00;
                    } else {
                        i2 = Integer.MAX_VALUE;
                    }
                    if (j2 + i2 < System.currentTimeMillis()) {
                        C59562nz c59562nz2 = this.A0B;
                        synchronized (c59562nz2) {
                            for (InterfaceC59502nt interfaceC59502nt : c59562nz2.A0O) {
                                InterfaceC58872ml BiQ = interfaceC59502nt.BiQ();
                                if (BiQ != null && BiQ.CbF(interfaceC59502nt)) {
                                    C74013Tp c74013Tp = this.A0C;
                                    if (c74013Tp.A00(this.A04)) {
                                        int i4 = c74013Tp.A00;
                                        byte[] bArr = this.A04.A02;
                                        int i5 = i4 + 1;
                                        byte b = bArr[i5];
                                        if (b != -39) {
                                            bArr[i5] = -39;
                                            C0f6 c0f6 = this.A09;
                                            try {
                                                A00();
                                                this.A01 = c74013Tp.A01;
                                                this.A03 = System.currentTimeMillis();
                                                this.A04.A02[i5] = b;
                                                return;
                                            } catch (Error | Exception e) {
                                                int i6 = c74013Tp.A01;
                                                String simpleName = e.getClass().getSimpleName();
                                                C14360o3.A0B(simpleName, 3);
                                                AbstractC107914ta.A00(c0f6, "ERROR_DECODING_FAILED", new C57564Pgc(i6, "NetworkImageLoader::deliverProgressiveImage", simpleName));
                                                throw e;
                                            }
                                        }
                                        return;
                                    }
                                    return;
                                }
                            }
                        }
                    }
                }
            } catch (OutOfMemoryError e2) {
                throw e2;
            }
        }
    }

    @Override // X.InterfaceC26491Qe
    public final void onResponseStarted(C3JQ c3jq) {
        InterfaceC11560jF interfaceC11560jF = this.A0H;
        if (interfaceC11560jF != null) {
            interfaceC11560jF.Ck2(this.A0E);
        }
        if (this.A0M && !c3jq.A01()) {
            this.A05 = true;
            this.A04 = null;
            C59562nz c59562nz = this.A0B;
            ImageUrl imageUrl = this.A0E;
            String Ar1 = imageUrl.Ar1();
            int i = c3jq.A01;
            c59562nz.A0D(null, Ar1, null, 0, i, false, false);
            if (interfaceC11560jF != null) {
                interfaceC11560jF.Cjv(imageUrl, null, "NetworkImageLoader", i);
            }
        }
        if (!this.A05) {
            if (this.A04 == null) {
                this.A04 = this.A0A.A03.A00();
            }
            C23781El A00 = c3jq.A00("Content-Length");
            if (A00 != null) {
                try {
                    this.A02 = Long.parseLong(A00.A01);
                } catch (NumberFormatException unused) {
                }
            } else {
                this.A02 = -1L;
            }
            int i2 = this.A08;
            if (i2 > 0) {
                try {
                    this.A04.getClass();
                    C59722oF c59722oF = this.A04;
                    int i3 = c59722oF.A00;
                    if (i3 == 0) {
                        C59732oG CHm = this.A0A.A00().CHm(this.A0F);
                        if (CHm.A00 != null) {
                            C60262p9 c60262p9 = (C60262p9) CHm.A00();
                            C59732oG c59732oG = c60262p9.A00;
                            if (c59732oG.A00 != null && i2 == ((C107954te) c59732oG.A00()).A00.optInt("scan", -1) + 1) {
                                this.A04.A02(c60262p9.A01);
                            }
                        }
                        c59722oF = this.A04;
                        i3 = c59722oF.A00;
                        if (i3 < 2 || c59722oF.A02[i3 - 1] != -39) {
                            StringBuilder sb = new StringBuilder();
                            sb.append("Error loading existing scans (");
                            sb.append(i2 - 1);
                            sb.append("), from ByteArray of size (");
                            sb.append(i3);
                            sb.append("), for url(");
                            sb.append(this.A0E.CDP());
                            sb.append(")");
                            throw new IOException(sb.toString());
                        }
                    }
                    if (!c59722oF.A01) {
                        int max = Math.max(i3 - 2, 0);
                        c59722oF.A00 = max;
                        long j = this.A02;
                        if (j != -1) {
                            this.A02 = j + max;
                        }
                        C74013Tp c74013Tp = this.A0C;
                        int i4 = i2 - 1;
                        c74013Tp.A03 = 0;
                        c74013Tp.A02 = max;
                        c74013Tp.A00 = max;
                        c74013Tp.A01 = i4;
                        c74013Tp.A04 = i4;
                        c74013Tp.A05 = 2;
                        this.A01 = i4;
                        return;
                    }
                    throw new RuntimeException("The buffer is already frozen");
                } catch (IOException e) {
                    this.A05 = true;
                    this.A04 = null;
                    C0w9.A07("resumable_downloads", e);
                    C59562nz c59562nz2 = this.A0B;
                    C25821No c25821No = c59562nz2.A0c;
                    synchronized (c25821No.A0O) {
                        c59562nz2.A06.getClass();
                        c59562nz2.A06.cancel();
                        if (c59562nz2.A0Y != C05F.A0C) {
                            C1O2 c1o2 = c25821No.A0G;
                            ImageUrl imageUrl2 = c59562nz2.A0L;
                            int i5 = c59562nz2.A0X;
                            List list = c59562nz2.A0a;
                            String A0L = c25821No.A0L(imageUrl2);
                            C59592o2 c59592o2 = c59562nz2.A0J;
                            int i6 = c25821No.A0A;
                            C1QY A002 = c59562nz2.A0I.A00();
                            boolean z = c25821No.A0W;
                            c59562nz2.A06 = new C2DA(c25821No.A0E, c25821No.A0F, A002, c1o2, c59562nz2, c25821No.A0L, c59592o2, null, c59562nz2.A0K, imageUrl2, A0L, "onFailToLoadExistingScans", list, 0, i5, i6, z, c59562nz2.A0Q).A02();
                        } else {
                            C59562nz.A09(c59562nz2, "network", "CANCELLED", c25821No.A0S);
                        }
                    }
                }
            }
        }
    }

    public C2DA(C0f6 c0f6, InterfaceC11560jF interfaceC11560jF, C1QY c1qy, C1O2 c1o2, C59562nz c59562nz, C1NZ c1nz, C59592o2 c59592o2, C59722oF c59722oF, AbstractC12990ll abstractC12990ll, ImageUrl imageUrl, String str, String str2, List list, int i, int i2, int i3, boolean z, boolean z2) {
        this.A0K = str2;
        this.A0A = c1o2;
        this.A0B = c59562nz;
        this.A0F = str;
        this.A0E = imageUrl;
        this.A08 = i;
        this.A0G = i2;
        this.A04 = c59722oF;
        this.A0L = list;
        this.A07 = i3;
        this.A0D = c59592o2;
        this.A0I = c1qy;
        this.A0H = interfaceC11560jF;
        this.A0M = z;
        this.A0N = z2;
        this.A0J = c1nz;
        this.A09 = c0f6;
        this.A06 = abstractC12990ll;
    }

    @Override // X.InterfaceC26491Qe
    public final void onFailed(IOException iOException) {
        A01(iOException.getMessage());
    }
}
