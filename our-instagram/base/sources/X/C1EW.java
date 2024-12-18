package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.mainfeed.network.FeedCacheCoordinator;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.LinkedHashMap;

/* renamed from: X.1EW, reason: invalid class name */
/* loaded from: classes.dex */
public abstract class C1EW {
    /* JADX WARN: Multi-variable type inference failed */
    public static final C1EY A01(final UserSession userSession, final boolean z) {
        C53A c53a;
        C06090Tz c06090Tz = C06090Tz.A05;
        if (C18U.A06(c06090Tz, userSession, 36317775303546422L)) {
            return C1EY.A01;
        }
        if (C18U.A06(c06090Tz, userSession, 36328431117418000L)) {
            if (C18U.A06(c06090Tz, userSession, 36328431117811220L)) {
                Context context = AbstractC12290kX.A00;
                C14360o3.A07(context);
                C55913Os5 A00 = Nv4.A00(context, userSession);
                A00.A03 = z;
                c53a = A00;
                if (z) {
                    A00.A06.clear();
                    A00.A02 = false;
                    A00.A01 = false;
                    c53a = A00;
                }
            } else {
                Context context2 = AbstractC12290kX.A00;
                C14360o3.A07(context2);
                c53a = new C53A(userSession, context2, z);
            }
            return c53a;
        }
        final Context context3 = AbstractC12290kX.A00;
        C14360o3.A07(context3);
        return new C1EY(userSession, context3, z) { // from class: X.1EX
            public final InterfaceC09390do A00;
            public final InterfaceC09390do A01;
            public final long A02;
            public final File A03;
            public final Boolean A04;
            public final boolean A05;

            @Override // X.C1EY
            public final InputStream FEF(C23781El c23781El, final InputStream inputStream) {
                String str;
                if (c23781El == null || (str = c23781El.A01) == null) {
                    str = "";
                }
                if (!this.A05 || !str.equals("cache")) {
                    return inputStream;
                }
                final File file = this.A03;
                if (file == null) {
                    file = (File) this.A00.getValue();
                }
                Boolean bool = this.A04;
                if (bool == null) {
                    bool = (Boolean) this.A01.getValue();
                }
                final boolean booleanValue = bool.booleanValue();
                final long j = this.A02;
                return new InputStream(file, inputStream, j, booleanValue) { // from class: X.3Vi
                    public BufferedOutputStream A00;
                    public boolean A01;
                    public final long A02;
                    public final File A03;
                    public final File A04;
                    public final InputStream A05;
                    public final boolean A06;

                    {
                        C14360o3.A0B(file, 2);
                        this.A05 = inputStream;
                        this.A03 = file;
                        this.A06 = booleanValue;
                        this.A02 = j;
                        File file2 = new File(AnonymousClass001.A0R(file.getPath(), ".pending"));
                        this.A04 = file2;
                        this.A01 = true;
                        try {
                            this.A00 = new BufferedOutputStream(new FileOutputStream(file2));
                        } catch (Exception e) {
                            this.A01 = false;
                            if (this.A06) {
                                this.A00 = null;
                                C0K8.A0F("AtomicStreamWrapper", "swallowing error on open", e);
                                return;
                            }
                            throw e;
                        }
                    }

                    @Override // java.io.InputStream
                    public final int read(byte[] bArr) {
                        C14360o3.A0B(bArr, 0);
                        int read = this.A05.read(bArr);
                        try {
                            BufferedOutputStream bufferedOutputStream = this.A00;
                            if (read != -1 && bufferedOutputStream != null && this.A01) {
                                bufferedOutputStream.write(bArr, 0, read);
                                return read;
                            }
                        } catch (Exception e) {
                            this.A01 = false;
                            if (this.A06) {
                                C0K8.A0F("AtomicStreamWrapper", "swallowing error on write", e);
                            } else {
                                throw e;
                            }
                        }
                        return read;
                    }

                    @Override // java.io.InputStream
                    public final int available() {
                        return this.A05.available();
                    }

                    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
                    public final void close() {
                        try {
                            BufferedOutputStream bufferedOutputStream = this.A00;
                            if (bufferedOutputStream != null) {
                                bufferedOutputStream.close();
                            }
                        } catch (Exception e) {
                            this.A01 = false;
                            if (this.A06) {
                                C0K8.A0F("AtomicStreamWrapper", "swallowing error on close", e);
                            } else {
                                throw e;
                            }
                        }
                        this.A05.close();
                        if (this.A01) {
                            File file2 = this.A04;
                            if (file2.exists() && file2.length() >= this.A02) {
                                file2.renameTo(this.A03);
                                return;
                            }
                        }
                        this.A04.delete();
                    }

                    @Override // java.io.InputStream
                    public final void mark(int i) {
                        throw new RuntimeException("Operation not supported");
                    }

                    @Override // java.io.InputStream
                    public final boolean markSupported() {
                        throw new RuntimeException("Operation not supported");
                    }

                    @Override // java.io.InputStream
                    public final void reset() {
                        throw new RuntimeException("Operation not supported");
                    }

                    @Override // java.io.InputStream
                    public final long skip(long j2) {
                        throw new RuntimeException("Operation not supported");
                    }

                    @Override // java.io.InputStream
                    public final int read(byte[] bArr, int i, int i2) {
                        C14360o3.A0B(bArr, 0);
                        int read = this.A05.read(bArr, i, i2);
                        try {
                            BufferedOutputStream bufferedOutputStream = this.A00;
                            if (read != -1 && bufferedOutputStream != null && this.A01) {
                                bufferedOutputStream.write(bArr, i, read);
                                return read;
                            }
                        } catch (Exception e) {
                            this.A01 = false;
                            if (this.A06) {
                                C0K8.A0F("AtomicStreamWrapper", "swallowing error on write", e);
                            } else {
                                throw e;
                            }
                        }
                        return read;
                    }

                    @Override // java.io.InputStream
                    public final int read() {
                        int read = this.A05.read();
                        try {
                            BufferedOutputStream bufferedOutputStream = this.A00;
                            if (read != -1 && bufferedOutputStream != null && this.A01) {
                                bufferedOutputStream.write(read);
                                return read;
                            }
                        } catch (Exception e) {
                            this.A01 = false;
                            if (this.A06) {
                                C0K8.A0F("AtomicStreamWrapper", "swallowing error on write", e);
                            } else {
                                throw e;
                            }
                        }
                        return read;
                    }
                };
            }

            @Override // X.C1EY
            public final void onFinish() {
            }

            /* JADX WARN: Code restructure failed: missing block: B:9:0x0048, code lost:
            
                if (X.Nv5.A00(r6).booleanValue() == false) goto L11;
             */
            {
                /*
                    r5 = this;
                    r5.<init>()
                    r5.A05 = r8
                    X.0Tz r2 = X.C06090Tz.A05
                    r0 = 36324638661292353(0x810d1100003141, double:3.035185984756365E-306)
                    boolean r0 = X.C18U.A06(r2, r6, r0)
                    r4 = 0
                    if (r0 != 0) goto L6a
                    X.1YD r0 = X.C1Y7.A06
                    java.io.File r0 = r0.A00(r7, r6)
                L19:
                    r5.A03 = r0
                    X.0dv r3 = X.EnumC09460dv.A03
                    r1 = 23
                    X.9F9 r0 = new X.9F9
                    r0.<init>(r1, r7, r6)
                    X.0do r0 = X.AbstractC09440dt.A00(r3, r0)
                    r5.A00 = r0
                    r0 = 36324638661357890(0x810d1100013142, double:3.0351859847978106E-306)
                    boolean r0 = X.C18U.A06(r2, r6, r0)
                    if (r0 != 0) goto L4f
                    X.0JK r0 = X.C0JK.A01()
                    boolean r0 = r0.A09()
                    if (r0 == 0) goto L4a
                    java.lang.Boolean r0 = X.Nv5.A00(r6)
                    boolean r1 = r0.booleanValue()
                    r0 = 1
                    if (r1 != 0) goto L4b
                L4a:
                    r0 = 0
                L4b:
                    java.lang.Boolean r4 = java.lang.Boolean.valueOf(r0)
                L4f:
                    r5.A04 = r4
                    r1 = 17
                    X.9EA r0 = new X.9EA
                    r0.<init>(r6, r1)
                    X.0do r0 = X.AbstractC09440dt.A00(r3, r0)
                    r5.A01 = r0
                    r0 = 36599069895822774(0x8206a900400db6, double:3.208737402519287E-306)
                    long r0 = X.C18U.A01(r2, r6, r0)
                    r5.A02 = r0
                    return
                L6a:
                    r0 = r4
                    goto L19
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C1EX.<init>(com.instagram.common.session.UserSession, android.content.Context, boolean):void");
            }
        };
    }

    public static final FeedCacheCoordinator A02(UserSession userSession) {
        int A00 = A00(userSession);
        Context context = AbstractC12290kX.A00;
        C14360o3.A07(context);
        int A002 = C1XT.A00(userSession) * 3;
        C06090Tz c06090Tz = C06090Tz.A05;
        return new FeedCacheCoordinator(context, userSession, A03(userSession), A00, A002, C18U.A01(c06090Tz, userSession, 36592571606893177L) * 1000, C18U.A01(c06090Tz, userSession, 36592571606827640L) * 1000);
    }

    public static final int A00(UserSession userSession) {
        long j;
        C06090Tz c06090Tz = C06090Tz.A05;
        if (C18U.A06(c06090Tz, userSession, 36317775303808570L)) {
            return 0;
        }
        if (!AbstractC25061Kk.A00().A0D() && !AbstractC25061Kk.A00().A0E()) {
            j = 36592571606303346L;
        } else {
            j = 36592571606368883L;
        }
        return (int) C18U.A01(c06090Tz, userSession, j);
    }

    public static final ArrayList A03(UserSession userSession) {
        final C17570ts c17570ts;
        C1XV c1xv = C1XV.A0H;
        C06090Tz c06090Tz = C06090Tz.A05;
        LinkedHashMap A07 = AbstractC06930Yk.A07(new C09530e4(c1xv, Long.valueOf(C18U.A01(c06090Tz, userSession, 36595281730537584L))), new C09530e4(C1XV.A0Y, Long.valueOf(C18U.A01(c06090Tz, userSession, 36592571606499957L))));
        if (C18U.A01(c06090Tz, userSession, 36609893209806828L) > 0) {
            A07.put(C1XV.A0a, Long.valueOf(C18U.A01(c06090Tz, userSession, 36609893209806828L)));
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (C18U.A01(c06090Tz, userSession, 36609893209741291L) > 0) {
            linkedHashMap.put(C1XV.A0a, Long.valueOf(C18U.A01(c06090Tz, userSession, 36609893209741291L)));
        }
        ArrayList A1N = AbstractC16960so.A1N(new C28001Xe(C18U.A01(c06090Tz, userSession, 36592571606499957L), A07), new C28061Xk(userSession), new C28141Xs(C28071Xl.A00(AbstractC12290kX.A00, userSession)), new C28171Xv(C18U.A06(c06090Tz, userSession, 2342154105844007347L), C1XT.A03(userSession)));
        if (C18U.A06(c06090Tz, userSession, 36317594918065547L) && (c17570ts = (C17570ts) userSession.A00(C17570ts.class)) != null) {
            A1N.add(new InterfaceC28011Xf(c17570ts) { // from class: X.3pM
                public final C17570ts A00;

                @Override // X.InterfaceC28011Xf
                public final boolean AC7(C108104tt c108104tt) {
                    C14360o3.A0B(c108104tt, 0);
                    return !C14360o3.A0K(this.A00.A02(c108104tt.A04), true);
                }

                @Override // X.InterfaceC28041Xi
                public final /* bridge */ /* synthetic */ boolean apply(Object obj) {
                    C38321qM c38321qM;
                    C3XG c3xg = (C3XG) obj;
                    String str = null;
                    if (c3xg != null) {
                        c38321qM = C3XH.A02(c3xg.A05);
                    } else {
                        c38321qM = null;
                    }
                    if (c38321qM == null) {
                        return true;
                    }
                    C17570ts c17570ts2 = this.A00;
                    C38321qM A02 = C3XH.A02(c3xg.A05);
                    if (A02 != null) {
                        str = A02.getId();
                    }
                    if (!C14360o3.A0K(c17570ts2.A02(str), true)) {
                        return true;
                    }
                    return false;
                }

                {
                    this.A00 = c17570ts;
                }
            });
        }
        if (C18U.A06(c06090Tz, userSession, 36329165556826158L)) {
            A1N.add(new C42717IvC(userSession));
        }
        if (C18U.A06(c06090Tz, userSession, 36328426822843918L)) {
            A1N.add(new C42718IvD(A07, linkedHashMap, C18U.A01(c06090Tz, userSession, 36592571606499957L)));
        }
        return A1N;
    }
}
