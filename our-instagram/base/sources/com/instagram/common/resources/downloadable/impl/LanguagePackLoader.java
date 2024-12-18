package com.instagram.common.resources.downloadable.impl;

import X.AbstractC09930fu;
import X.AbstractC12880la;
import X.AbstractC12990ll;
import X.AbstractC27081Th;
import X.AbstractC37701p7;
import X.AbstractC58432PvB;
import X.AbstractRunnableC14200nk;
import X.AnonymousClass001;
import X.C006802i;
import X.C05F;
import X.C0K8;
import X.C11T;
import X.C14360o3;
import X.C15W;
import X.C18920wW;
import X.C1R8;
import X.C1R9;
import X.C1RL;
import X.C1RQ;
import X.C1U2;
import X.C1UT;
import X.C1UU;
import X.C20I;
import X.C27061Tf;
import X.C39581sf;
import X.C39721sv;
import X.C58428Pv7;
import X.C58621Pyp;
import X.C62674SLm;
import X.EnumC27091Ti;
import X.InterfaceC02590Ai;
import X.T2C;
import android.content.Context;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.common.dextricks.StringTreeSet;
import com.google.common.collect.ImmutableMap;
import com.google.common.util.concurrent.SettableFuture;
import com.instagram.common.api.base.CacheBehaviorLogger;
import com.instagram.debug.devoptions.direct.burner.BurnerSendSettingsHelper;
import go.Seq;
import java.io.File;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicReference;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import kotlin.enums.EnumEntries;

/* loaded from: classes.dex */
public final class LanguagePackLoader extends AbstractRunnableC14200nk {
    public final C1R8 A00;
    public final C1RL A01;
    public final VoltronLanguagePackDownloader A02;
    public final Locale A03;

    public LanguagePackLoader(Context context, C1R8 c1r8, C1RL c1rl, AbstractC12990ll abstractC12990ll, Locale locale) {
        super(56, 3, true, true);
        this.A03 = locale;
        this.A01 = c1rl;
        this.A00 = c1r8;
        this.A02 = new VoltronLanguagePackDownloader(context, abstractC12990ll);
    }

    @Override // java.lang.Runnable
    public final void run() {
        Exception exc;
        final ByteBuffer byteBuffer;
        InputStream inputStream;
        try {
            VoltronLanguagePackDownloader voltronLanguagePackDownloader = this.A02;
            Locale locale = this.A03;
            C11T.A05("This operation can't be run on UI thread.");
            String A0R = AnonymousClass001.A0R("i18n_", AbstractC27081Th.A01(locale));
            Integer num = C05F.A00;
            C006802i c006802i = C006802i.A0p;
            c006802i.markerStart(30474250);
            c006802i.markerAnnotate(30474250, "locale", A0R);
            c006802i.markerAnnotate(30474250, "resource_format", "voltron");
            EnumEntries enumEntries = EnumC27091Ti.A02;
            boolean A05 = C1RQ.A00().A05(C1U2.A00(A0R));
            C006802i.A0p.markerAnnotate(30474250, "is_from_cache", A05);
            if (!A05) {
                try {
                    C006802i.A0p.markerPoint(30474250, "LanguagePackDownloader:downloadFbtLanguagePackUsingVoltron:DownloadStarted");
                    C27061Tf c27061Tf = voltronLanguagePackDownloader.A02.A00;
                    switch (AbstractC09930fu.A00(A0R)) {
                        case 37:
                        case 38:
                        case 39:
                        case 40:
                        case Seq.NULL_REFNUM /* 41 */:
                        case Seq.RefTracker.REF_OFFSET /* 42 */:
                        case 43:
                        case 44:
                        case 45:
                        case JITProfilePQR.MEGA_ZIP_NAME_PREFIX_LEN /* 46 */:
                        case 47:
                        case 48:
                        case 49:
                        case BurnerSendSettingsHelper.MESSAGE_SEND_BATCH_SIZE /* 50 */:
                        case 51:
                        case 52:
                        case 53:
                        case 54:
                        case 55:
                        case 56:
                        case 57:
                        case 58:
                        case 59:
                        case 60:
                        case 61:
                        case 62:
                        case StringTreeSet.PAYLOAD_MASK /* 63 */:
                        case 64:
                        case 65:
                        case 66:
                        case 67:
                        case 68:
                        case 69:
                        case 70:
                        case 71:
                        case 72:
                        case 73:
                        case 74:
                        case 75:
                        case 76:
                        case 77:
                        case 78:
                            C58428Pv7 A03 = c27061Tf.A00.A03(new C58621Pyp(num, Collections.singleton(A0R)));
                            A03.A05(new T2C(c27061Tf), c27061Tf.A01);
                            try {
                                AbstractC58432PvB.A00(A03, 20000L);
                                if (!A03.A06()) {
                                    throw new RuntimeException("Time out when downloading the voltron module");
                                }
                                if (A03.A03() != null) {
                                    throw new Exception(A03.A03());
                                }
                                C62674SLm c62674SLm = (C62674SLm) A03.A04();
                                if (c62674SLm != null && (exc = c62674SLm.A01) != null) {
                                    throw new Exception(exc);
                                }
                                C006802i.A0p.markerPoint(30474250, "LanguagePackDownloader:downloadFbtLanguagePackUsingVoltron:DownloadCompleted");
                                break;
                            } catch (InterruptedException e) {
                                C0K8.A0F("i18n_VoltronFbtLanguagePackSideLoader", "InterruptedException happened when executing download module task", e);
                                throw new Exception(e);
                            }
                        default:
                            throw new Exception(AnonymousClass001.A0R("Unknown i18n module name received: ", A0R));
                    }
                } catch (Exception e2) {
                    C006802i c006802i2 = C006802i.A0p;
                    String message = e2.getMessage();
                    if (message == null) {
                        message = "null";
                    }
                    c006802i2.markerAnnotate(30474250, "error_message", message);
                    c006802i2.markerEnd(30474250, (short) 3);
                }
            }
            File A02 = C1RQ.A00().A02(A0R);
            C006802i.A0p.markerPoint(30474250, "LanguagePackDownloader:downloadFbtLanguagePackUsingVoltron:GetDownloadedModuleFile");
            C006802i.A0p.markerAnnotate(30474250, "voltron_module_type", VoltronLanguagePackDownloader.A00(A02));
            C006802i.A0p.markerPoint(30474250, "LanguagePackDownloader:downloadFbtLanguagePackUsingVoltron:ReadByteBufferStarted");
            C14360o3.A0B(A0R, 1);
            StringBuilder sb = new StringBuilder();
            sb.append("assets/");
            sb.append(A0R);
            sb.append('/');
            sb.append(A0R);
            sb.append(".bin");
            String obj = sb.toString();
            RandomAccessFile randomAccessFile = new RandomAccessFile(A02.getPath(), "r");
            try {
                long j = 0;
                randomAccessFile.seek(0L);
                while (true) {
                    if (j < randomAccessFile.length() && randomAccessFile.readInt() == 1347093252) {
                        randomAccessFile.skipBytes(4);
                        short reverseBytes = Short.reverseBytes(randomAccessFile.readShort());
                        randomAccessFile.skipBytes(8);
                        int reverseBytes2 = Integer.reverseBytes(randomAccessFile.readInt());
                        randomAccessFile.skipBytes(4);
                        int reverseBytes3 = Short.reverseBytes(randomAccessFile.readShort());
                        short reverseBytes4 = Short.reverseBytes(randomAccessFile.readShort());
                        byte[] bArr = new byte[reverseBytes3];
                        randomAccessFile.read(bArr);
                        String str = new String(bArr, C15W.A05);
                        randomAccessFile.skipBytes(reverseBytes4);
                        if (!str.equals(obj)) {
                            randomAccessFile.skipBytes(reverseBytes2);
                            j = randomAccessFile.getFilePointer();
                        } else if (reverseBytes == 0) {
                            randomAccessFile.getFilePointer();
                            byteBuffer = randomAccessFile.getChannel().map(FileChannel.MapMode.READ_ONLY, randomAccessFile.getFilePointer(), reverseBytes2);
                        }
                    }
                }
                C0K8.A0P("i18n_VoltronFbtLanguagePackUtil", "No stored %s in module", obj);
                ZipFile zipFile = new ZipFile(A02);
                try {
                    ZipEntry entry = zipFile.getEntry(obj);
                    byteBuffer = null;
                    if (entry != null && (inputStream = zipFile.getInputStream(entry)) != null) {
                        byteBuffer = ByteBuffer.wrap(AbstractC37701p7.A01(inputStream, new ArrayDeque(20), 0));
                    }
                    zipFile.close();
                    randomAccessFile.close();
                    C006802i.A0p.markerPoint(30474250, "LanguagePackDownloader:downloadFbtLanguagePackUsingVoltron:ReadByteBufferCompleted");
                    int A00 = AbstractC12880la.A00();
                    C006802i c006802i3 = C006802i.A0p;
                    c006802i3.markerAnnotate(30474250, "fallback_build_number", A00);
                    c006802i3.markerEnd(30474250, (short) 2);
                    if (byteBuffer != null) {
                        String A01 = AbstractC27081Th.A01(locale);
                        C1R8 c1r8 = this.A00;
                        final C39581sf c39581sf = new C39581sf(A01, byteBuffer);
                        C1UU c1uu = new C1UU(new C1UT(c39581sf, byteBuffer) { // from class: X.1sp
                            public final int A00;
                            public final int A01;
                            public final int A02;
                            public final int A03;
                            public final int A04;
                            public final int A05;
                            public final C39581sf A06;
                            public final C39611sj A07;

                            private String A00(C79843hZ c79843hZ) {
                                int A022 = c79843hZ.A02(4);
                                if (A022 == 0 && (A022 = c79843hZ.A02(4)) == 0) {
                                    return null;
                                }
                                return c79843hZ.A05(A022 + c79843hZ.A00);
                            }

                            /* JADX WARN: Multi-variable type inference failed */
                            /* JADX WARN: Type inference failed for: r2v1, types: [X.3hZ, java.lang.Object, X.1AI] */
                            /* JADX WARN: Type inference failed for: r3v0, types: [X.3hZ, java.lang.Object, X.1AI] */
                            /* JADX WARN: Type inference failed for: r3v1, types: [X.3hZ, java.lang.Object, X.1AI] */
                            /* JADX WARN: Type inference failed for: r3v2, types: [X.3hZ, java.lang.Object, X.1AI] */
                            /* JADX WARN: Type inference failed for: r3v3, types: [X.3hZ, java.lang.Object, X.1AI] */
                            /* JADX WARN: Type inference failed for: r3v4, types: [X.3hZ, java.lang.Object, X.1AI] */
                            @Override // X.C1UT
                            public final C79833hY A01(int i, int i2) {
                                C39611sj c39611sj;
                                int A022;
                                short s;
                                short s2;
                                short s3;
                                short s4;
                                short s5;
                                short s6;
                                int i3 = i - this.A00;
                                if (i3 >= 0 && i3 < this.A01 && (A022 = (c39611sj = this.A07).A02(16)) != 0) {
                                    int A032 = c39611sj.A03(A022) + (i3 * 4);
                                    int i4 = A032 + ((C1AI) c39611sj).A01.getInt(A032);
                                    if (i4 != c39611sj.A00) {
                                        ByteBuffer byteBuffer2 = ((C1AI) c39611sj).A01;
                                        ImmutableMap.Builder builder = new ImmutableMap.Builder(4);
                                        ?? obj2 = new Object();
                                        int i5 = i4 - byteBuffer2.getInt(i4);
                                        if (4 < byteBuffer2.getShort(i5) && (s6 = byteBuffer2.getShort(i5 + 4)) != 0) {
                                            int i6 = s6 + i4;
                                            obj2.A00 = i6 + byteBuffer2.getInt(i6);
                                            obj2.A01 = byteBuffer2;
                                            String A002 = A00(obj2);
                                            if (A002 != null) {
                                                builder.put(0, A002);
                                            }
                                        }
                                        ?? obj3 = new Object();
                                        int i7 = i4 - byteBuffer2.getInt(i4);
                                        if (6 < byteBuffer2.getShort(i7) && (s5 = byteBuffer2.getShort(i7 + 6)) != 0) {
                                            int i8 = s5 + i4;
                                            obj3.A00 = i8 + byteBuffer2.getInt(i8);
                                            obj3.A01 = byteBuffer2;
                                            String A003 = A00(obj3);
                                            if (A003 != null) {
                                                builder.put(1, A003);
                                            }
                                        }
                                        ?? obj4 = new Object();
                                        int i9 = i4 - byteBuffer2.getInt(i4);
                                        if (8 < byteBuffer2.getShort(i9) && (s4 = byteBuffer2.getShort(i9 + 8)) != 0) {
                                            int i10 = s4 + i4;
                                            obj4.A00 = i10 + byteBuffer2.getInt(i10);
                                            obj4.A01 = byteBuffer2;
                                            String A004 = A00(obj4);
                                            if (A004 != null) {
                                                builder.put(2, A004);
                                            }
                                        }
                                        ?? obj5 = new Object();
                                        int i11 = i4 - byteBuffer2.getInt(i4);
                                        if (10 < byteBuffer2.getShort(i11) && (s3 = byteBuffer2.getShort(i11 + 10)) != 0) {
                                            int i12 = s3 + i4;
                                            obj5.A00 = i12 + byteBuffer2.getInt(i12);
                                            obj5.A01 = byteBuffer2;
                                            String A005 = A00(obj5);
                                            if (A005 != null) {
                                                builder.put(3, A005);
                                            }
                                        }
                                        ?? obj6 = new Object();
                                        int i13 = i4 - byteBuffer2.getInt(i4);
                                        if (12 < byteBuffer2.getShort(i13) && (s2 = byteBuffer2.getShort(i13 + 12)) != 0) {
                                            int i14 = s2 + i4;
                                            obj6.A00 = i14 + byteBuffer2.getInt(i14);
                                            obj6.A01 = byteBuffer2;
                                            String A006 = A00(obj6);
                                            if (A006 != null) {
                                                builder.put(4, A006);
                                            }
                                        }
                                        ?? obj7 = new Object();
                                        int i15 = i4 - byteBuffer2.getInt(i4);
                                        if (14 < byteBuffer2.getShort(i15) && (s = byteBuffer2.getShort(i15 + 14)) != 0) {
                                            int i16 = s + i4;
                                            obj7.A00 = i16 + byteBuffer2.getInt(i16);
                                            obj7.A01 = byteBuffer2;
                                            String A007 = A00(obj7);
                                            if (A007 != null) {
                                                builder.put(5, A007);
                                            }
                                        }
                                        return new C79833hY(builder.buildOrThrow());
                                    }
                                }
                                return null;
                            }

                            @Override // X.C1UT
                            public final String A02(int i, int i2) {
                                C39611sj c39611sj;
                                int A022;
                                short s;
                                int i3 = i - this.A04;
                                if (i3 < 0 || i3 >= this.A05 || (A022 = (c39611sj = this.A07).A02(10)) == 0) {
                                    return null;
                                }
                                int A032 = c39611sj.A03(A022) + (i3 * 4);
                                int i4 = A032 + ((C1AI) c39611sj).A01.getInt(A032);
                                if (i4 == c39611sj.A02) {
                                    return null;
                                }
                                ByteBuffer byteBuffer2 = ((C1AI) c39611sj).A01;
                                int i5 = i4 - byteBuffer2.getInt(i4);
                                if (4 >= byteBuffer2.getShort(i5) || (s = byteBuffer2.getShort(i5 + 4)) == 0) {
                                    int i6 = i4 - byteBuffer2.getInt(i4);
                                    if (4 >= byteBuffer2.getShort(i6) || (s = byteBuffer2.getShort(i6 + 4)) == 0) {
                                        return null;
                                    }
                                }
                                return C1AI.A00(byteBuffer2, s + i4);
                            }

                            @Override // X.C1UT
                            public final String A03(String str2, int[] iArr, int i) {
                                C39581sf c39581sf2 = this.A06;
                                if (c39581sf2 == null) {
                                    return null;
                                }
                                C14360o3.A0B(iArr, 1);
                                return c39581sf2.A00.A00(str2, iArr);
                            }

                            /* JADX WARN: Multi-variable type inference failed */
                            /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, X.1AI] */
                            /* JADX WARN: Type inference failed for: r7v1 */
                            @Override // X.C1UT
                            public final String[] A04(int i, int i2) {
                                C39611sj c39611sj;
                                int A022;
                                int i3;
                                int i4;
                                short s;
                                short s2;
                                short s3;
                                int i5 = i - this.A02;
                                String[] strArr = null;
                                if (i5 >= 0 && i5 < this.A03 && (A022 = (c39611sj = this.A07).A02(22)) != 0) {
                                    int A032 = c39611sj.A03(A022) + (i5 * 4);
                                    int i6 = A032 + ((C1AI) c39611sj).A01.getInt(A032);
                                    if (i6 != c39611sj.A01) {
                                        ByteBuffer byteBuffer2 = ((C1AI) c39611sj).A01;
                                        int i7 = i6 - byteBuffer2.getInt(i6);
                                        if (4 < byteBuffer2.getShort(i7) && (s3 = byteBuffer2.getShort(i7 + 4)) != 0) {
                                            int i8 = s3 + i6;
                                            i3 = byteBuffer2.getInt(i8 + byteBuffer2.getInt(i8));
                                        } else {
                                            i3 = 0;
                                        }
                                        strArr = new String[i3];
                                        int i9 = 0;
                                        while (true) {
                                            int i10 = i6 - byteBuffer2.getInt(i6);
                                            if (4 < byteBuffer2.getShort(i10) && (s2 = byteBuffer2.getShort(i10 + 4)) != 0) {
                                                int i11 = s2 + i6;
                                                i4 = byteBuffer2.getInt(i11 + byteBuffer2.getInt(i11));
                                            } else {
                                                i4 = 0;
                                            }
                                            if (i9 >= i4) {
                                                break;
                                            }
                                            C79843hZ obj2 = new Object();
                                            int i12 = i6 - byteBuffer2.getInt(i6);
                                            if (4 < byteBuffer2.getShort(i12) && (s = byteBuffer2.getShort(i12 + 4)) != 0) {
                                                int i13 = s + i6;
                                                int i14 = i13 + byteBuffer2.getInt(i13) + 4 + (i9 * 4);
                                                obj2.A00 = i14 + byteBuffer2.getInt(i14);
                                                obj2.A01 = byteBuffer2;
                                            } else {
                                                obj2 = 0;
                                            }
                                            strArr[i9] = A00(obj2);
                                            i9++;
                                        }
                                    }
                                }
                                return strArr;
                            }

                            {
                                int i;
                                int i2;
                                int i3;
                                int i4;
                                int i5;
                                int i6;
                                C39611sj A012 = C39611sj.A01(byteBuffer);
                                this.A07 = A012;
                                int A022 = A012.A02(6);
                                if (A022 != 0) {
                                    i = ((C1AI) A012).A01.getInt(A022 + ((C1AI) A012).A00);
                                } else {
                                    i = 0;
                                }
                                this.A04 = i;
                                int A023 = A012.A02(12);
                                if (A023 != 0) {
                                    i2 = ((C1AI) A012).A01.getInt(A023 + ((C1AI) A012).A00);
                                } else {
                                    i2 = 0;
                                }
                                this.A00 = i2;
                                int A024 = A012.A02(18);
                                if (A024 != 0) {
                                    i3 = ((C1AI) A012).A01.getInt(A024 + ((C1AI) A012).A00);
                                } else {
                                    i3 = 0;
                                }
                                this.A02 = i3;
                                int A025 = A012.A02(10);
                                if (A025 != 0) {
                                    i4 = A012.A04(A025);
                                } else {
                                    i4 = 0;
                                }
                                this.A05 = i4;
                                int A026 = A012.A02(16);
                                if (A026 != 0) {
                                    i5 = A012.A04(A026);
                                } else {
                                    i5 = 0;
                                }
                                this.A01 = i5;
                                int A027 = A012.A02(22);
                                if (A027 != 0) {
                                    i6 = A012.A04(A027);
                                } else {
                                    i6 = 0;
                                }
                                this.A03 = i6;
                                this.A06 = c39581sf;
                            }
                        }, c1r8, "fbt");
                        C1RL c1rl = this.A01;
                        C1R9 c1r9 = c1rl.A00;
                        String str2 = c1rl.A01;
                        AtomicReference atomicReference = c1r9.A08;
                        synchronized (c1r9) {
                            atomicReference.set(c1uu);
                            C18920wW c18920wW = (C18920wW) c1r9.A05.A01;
                            InterfaceC02590Ai A002 = c18920wW.A00(c18920wW.A00, "fbresources_loading_success");
                            if (A002.isSampled()) {
                                A002.AAP("locale", str2);
                                A002.AAP(CacheBehaviorLogger.SOURCE, "downloaded");
                                A002.AAP("file_format", "fbt");
                                A002.Cht();
                            }
                            if (c1r9.A05()) {
                                SettableFuture settableFuture = c1r9.A00;
                                settableFuture.getClass();
                                settableFuture.set(new C39721sv(true, null));
                            }
                        }
                        return;
                    }
                    Throwable th = new Throwable("Failed to load language pack.");
                    C1RL c1rl2 = this.A01;
                    C1R9 c1r92 = c1rl2.A00;
                    c1r92.A05.A01(c1rl2.A01, th, false);
                    SettableFuture settableFuture2 = c1r92.A00;
                    settableFuture2.getClass();
                    settableFuture2.set(new C39721sv(false, th));
                } finally {
                }
            } catch (Throwable th2) {
                try {
                    throw th2;
                } catch (Throwable th3) {
                    C20I.A00(randomAccessFile, th2);
                    throw th3;
                }
            }
        } catch (Throwable th4) {
            C1RL c1rl3 = this.A01;
            C1R9 c1r93 = c1rl3.A00;
            c1r93.A05.A01(c1rl3.A01, th4, false);
            SettableFuture settableFuture3 = c1r93.A00;
            settableFuture3.getClass();
            settableFuture3.set(new C39721sv(false, th4));
        }
    }
}
