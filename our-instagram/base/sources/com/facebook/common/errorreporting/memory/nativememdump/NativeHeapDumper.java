package com.facebook.common.errorreporting.memory.nativememdump;

import X.AbstractC20070ye;
import X.C0JK;
import X.C0L6;
import X.C20150ym;
import X.C2RW;
import X.C2Rs;
import X.C2S4;
import X.C2SC;
import X.C2SE;
import android.os.Build;
import android.os.Debug;
import android.os.SystemClock;
import com.facebook.quicklog.EventBuilder;
import com.facebook.quicklog.LightweightQuickPerformanceLogger;
import java.io.File;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public class NativeHeapDumper implements C2Rs {
    public static final boolean sIsArt;
    public final String mAslSessionId;
    public C2SC mDumpSupporter;
    public boolean mInitialized;
    public final File mLogDir;
    public String mNextHprofFilename;
    public String mNextHprofId;
    public final LightweightQuickPerformanceLogger mQpl;
    public boolean mInitAttempted = false;
    public final ByteBuffer mDetailsBuffer = ByteBuffer.allocateDirect(512);
    public final ByteBuffer mSpaceStatsFilenameBuffer = ByteBuffer.allocateDirect(256);
    public final ByteBuffer mMapsFilenameBuffer = ByteBuffer.allocateDirect(256);

    private void copyCharSequenceToBuffer(ByteBuffer byteBuffer, CharSequence charSequence) {
        byteBuffer.position(0);
        for (int i = 0; i < charSequence.length() && i < byteBuffer.capacity() - 1; i++) {
            byteBuffer.put((byte) charSequence.charAt(i));
        }
        byteBuffer.put((byte) 0);
    }

    public static native int forkAndDumpJavaHeap(String str, ByteBuffer byteBuffer, int i, ByteBuffer byteBuffer2, int i2, ByteBuffer byteBuffer3, int i3);

    public static native int nativeInitialize(boolean z, int i, boolean z2, boolean z3, int i2, ByteBuffer byteBuffer);

    public static native int nativeWaitForDump(ByteBuffer byteBuffer);

    public static native void prepareForDump(Object obj, String str, ByteBuffer byteBuffer, int i, ByteBuffer byteBuffer2, int i2, String str2, String str3);

    public boolean canDump(String str) {
        String str2;
        synchronized (this) {
            if (!this.mInitialized) {
                return false;
            }
            C2SC c2sc = this.mDumpSupporter;
            if (c2sc != null && this.mNextHprofId != null && this.mNextHprofFilename != null) {
                C2RW c2rw = c2sc.A08;
                Runtime runtime = Runtime.getRuntime();
                String str3 = c2sc.A0D;
                long currentTimeMillis = System.currentTimeMillis();
                long freeMemory = runtime.freeMemory();
                long j = runtime.totalMemory();
                long maxMemory = runtime.maxMemory();
                EventBuilder A00 = C2RW.A00(c2rw, "OOM", "oom", currentTimeMillis);
                if (A00.isSampled()) {
                    A00.annotate("asl_session_id", str3);
                    A00.annotate("free_heap", freeMemory);
                    A00.annotate("total_heap", j);
                    A00.annotate("max_heap", maxMemory);
                    A00.report();
                }
                C2SC.A02(c2sc, "OOM", str);
                synchronized (C2SC.class) {
                    if (C2SC.A0N) {
                        C2SC.A03(c2sc, "OOM", str, "not_dumping_because_already_dumping");
                        return false;
                    }
                    if (!C2SC.A06(c2sc, "OOM", str)) {
                        if (C0JK.A01().A05() > 3 * Runtime.getRuntime().maxMemory()) {
                            StringBuilder sb = c2sc.A0H;
                            C2SC.A01(c2sc, sb, "OOM", str);
                            c2sc.A01 = sb;
                            c2sc.A02 = "OOM";
                            C2SC c2sc2 = this.mDumpSupporter;
                            String str4 = this.mNextHprofId;
                            String str5 = this.mNextHprofFilename;
                            C2SE c2se = c2sc2.A07;
                            c2se.A0A = c2sc2.A0D;
                            c2se.A0G = c2sc2.A0E;
                            c2se.A07 = str4;
                            c2se.A0C = "OOM";
                            c2se.A05 = Runtime.getRuntime().maxMemory();
                            c2se.A09 = str5;
                            c2se.A0B = str;
                            c2se.A00 = 0;
                            C2S4 c2s4 = c2sc2.A09;
                            StringBuilder sb2 = c2sc2.A0F;
                            c2se.A0H = !C0L6.A07();
                            c2se.A0I = c2s4.A00();
                            if (C0L6.A04 == null) {
                                str2 = "";
                            } else {
                                str2 = C0L6.A04.A03;
                            }
                            c2se.A0E = str2;
                            c2se.A0D = C0L6.A00();
                            c2se.A08 = sb2;
                            c2se.A02 = (int) C20150ym.A01(AbstractC20070ye.A00(18577816615518572L));
                            c2se.A01 = 0;
                            c2se.A04 = SystemClock.uptimeMillis();
                            c2se.A03 = System.currentTimeMillis();
                            c2sc2.A0B.A01(c2se);
                            return true;
                        }
                        C2SC.A03(c2sc, "OOM", str, "not_dumping_because_no_space");
                        return false;
                    }
                }
            }
            return false;
        }
    }

    @Override // X.C2Rs
    public int dumpJavaHeap(CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, StringBuilder sb) {
        int i;
        int i2;
        synchronized (this) {
            if (!this.mInitialized) {
                sb.append("error on initialization");
                return 7;
            }
            if (charSequence2 != null && charSequence2.length() < this.mSpaceStatsFilenameBuffer.capacity()) {
                copyCharSequenceToBuffer(this.mSpaceStatsFilenameBuffer, charSequence2);
            } else {
                charSequence2 = null;
            }
            if (charSequence3 != null && charSequence3.length() < this.mMapsFilenameBuffer.capacity()) {
                copyCharSequenceToBuffer(this.mMapsFilenameBuffer, charSequence3);
            } else {
                charSequence3 = null;
            }
            String charSequence4 = charSequence.toString();
            ByteBuffer byteBuffer = this.mSpaceStatsFilenameBuffer;
            if (charSequence2 != null) {
                i = charSequence2.length();
            } else {
                i = 0;
            }
            ByteBuffer byteBuffer2 = this.mMapsFilenameBuffer;
            if (charSequence3 != null) {
                i2 = charSequence3.length();
            } else {
                i2 = 0;
            }
            int forkAndDumpJavaHeap = forkAndDumpJavaHeap(charSequence4, byteBuffer, i, byteBuffer2, i2, this.mDetailsBuffer, 0);
            this.mDetailsBuffer.position(0);
            ByteBuffer byteBuffer3 = this.mDetailsBuffer;
            while (true) {
                byte b = byteBuffer3.get();
                if (b != 0) {
                    sb.append((char) b);
                } else {
                    return forkAndDumpJavaHeap;
                }
            }
        }
    }

    @Override // X.C2Rs
    public int dumpJavaHeapAsync(CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, StringBuilder sb, boolean z) {
        int i;
        int i2;
        synchronized (this) {
            if (!this.mInitialized) {
                sb.append("error on initialization");
                return 7;
            }
            if (charSequence2 != null && charSequence2.length() < this.mSpaceStatsFilenameBuffer.capacity()) {
                copyCharSequenceToBuffer(this.mSpaceStatsFilenameBuffer, charSequence2);
            } else {
                charSequence2 = null;
            }
            if (charSequence3 != null && charSequence3.length() < this.mMapsFilenameBuffer.capacity()) {
                copyCharSequenceToBuffer(this.mMapsFilenameBuffer, charSequence3);
            } else {
                charSequence3 = null;
            }
            String charSequence4 = charSequence.toString();
            ByteBuffer byteBuffer = this.mSpaceStatsFilenameBuffer;
            if (charSequence2 != null) {
                i = charSequence2.length();
            } else {
                i = 0;
            }
            ByteBuffer byteBuffer2 = this.mMapsFilenameBuffer;
            if (charSequence3 != null) {
                i2 = charSequence3.length();
            } else {
                i2 = 0;
            }
            ByteBuffer byteBuffer3 = this.mDetailsBuffer;
            int i3 = 2;
            if (z) {
                i3 = 1;
            }
            int forkAndDumpJavaHeap = forkAndDumpJavaHeap(charSequence4, byteBuffer, i, byteBuffer2, i2, byteBuffer3, i3);
            if ((forkAndDumpJavaHeap & 15) == 6) {
                this.mDetailsBuffer.position(0);
                ByteBuffer byteBuffer4 = this.mDetailsBuffer;
                while (true) {
                    byte b = byteBuffer4.get();
                    if (b == 0) {
                        break;
                    }
                    sb.append((char) b);
                }
            }
            return forkAndDumpJavaHeap;
        }
    }

    @Override // X.C2Rs
    public synchronized void initialize(boolean z, boolean z2, int i) {
        if (!this.mInitAttempted) {
            boolean z3 = true;
            this.mInitAttempted = true;
            int nativeInitialize = nativeInitialize(sIsArt, Build.VERSION.SDK_INT, z, z2, i, this.mDetailsBuffer);
            if (nativeInitialize != 0) {
                z3 = false;
            }
            this.mInitialized = z3;
            if (z && this.mLogDir != null) {
                EventBuilder markEventBuilder = this.mQpl.markEventBuilder(21372992, "init");
                if (markEventBuilder.isSampled()) {
                    markEventBuilder.annotate("asl_session_id", this.mAslSessionId);
                    markEventBuilder.annotate("result", this.mInitialized);
                    markEventBuilder.annotate("result_code", nativeInitialize);
                    if (!this.mInitialized) {
                        StringBuilder sb = new StringBuilder();
                        ByteBuffer byteBuffer = this.mDetailsBuffer;
                        while (true) {
                            byte b = byteBuffer.get();
                            if (b == 0) {
                                break;
                            } else {
                                sb.append((char) b);
                            }
                        }
                        markEventBuilder.annotate("error_msg", sb.toString());
                    }
                    markEventBuilder.report();
                }
            }
            if (this.mInitialized) {
                Debug.getRuntimeStats();
            }
        }
    }

    @Override // X.C2Rs
    public int waitForDump(StringBuilder sb) {
        synchronized (this) {
            if (!this.mInitialized) {
                return 7;
            }
            this.mDetailsBuffer.position(0);
            int nativeWaitForDump = nativeWaitForDump(this.mDetailsBuffer);
            this.mDetailsBuffer.position(0);
            ByteBuffer byteBuffer = this.mDetailsBuffer;
            while (true) {
                byte b = byteBuffer.get();
                if (b != 0) {
                    sb.append((char) b);
                } else {
                    return nativeWaitForDump;
                }
            }
        }
    }

    @Override // X.C2Rs
    public void prepareForDump(C2SC c2sc, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, CharSequence charSequence4) {
        int length;
        int length2;
        String path;
        CharSequence charSequence5 = charSequence3;
        CharSequence charSequence6 = charSequence4;
        synchronized (this) {
            if (!this.mInitialized) {
                return;
            }
            if (charSequence3 != null && charSequence5.length() < this.mSpaceStatsFilenameBuffer.capacity()) {
                copyCharSequenceToBuffer(this.mSpaceStatsFilenameBuffer, charSequence5);
            } else {
                charSequence5 = null;
            }
            if (charSequence4 != null && charSequence6.length() < this.mMapsFilenameBuffer.capacity()) {
                copyCharSequenceToBuffer(this.mMapsFilenameBuffer, charSequence6);
            } else {
                charSequence6 = null;
            }
            this.mNextHprofId = charSequence.toString();
            String charSequence7 = charSequence2.toString();
            this.mNextHprofFilename = charSequence7;
            this.mDumpSupporter = c2sc;
            ByteBuffer byteBuffer = this.mSpaceStatsFilenameBuffer;
            if (charSequence5 == null) {
                length = 0;
            } else {
                length = charSequence5.length();
            }
            ByteBuffer byteBuffer2 = this.mMapsFilenameBuffer;
            if (charSequence6 == null) {
                length2 = 0;
            } else {
                length2 = charSequence6.length();
            }
            File file = this.mLogDir;
            if (file == null) {
                path = "";
            } else {
                path = new File(file, "oomthrow.bin").getPath();
            }
            prepareForDump(this, charSequence7, byteBuffer, length, byteBuffer2, length2, path, this.mNextHprofId);
            if (this.mLogDir != null) {
                EventBuilder markEventBuilder = this.mQpl.markEventBuilder(21372992, "prepare");
                if (markEventBuilder.isSampled()) {
                    markEventBuilder.annotate("asl_session_id", this.mAslSessionId);
                    markEventBuilder.annotate("hprof_id", this.mNextHprofId);
                    markEventBuilder.report();
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x001e, code lost:
    
        if (r1.startsWith("0.") != false) goto L8;
     */
    static {
        /*
            java.lang.String r0 = "native_memdump"
            X.C09170dP.A0C(r0)
            java.lang.String r0 = "java.vm.version"
            java.lang.String r1 = java.lang.System.getProperty(r0)
            if (r1 == 0) goto L20
            java.lang.String r0 = "1."
            boolean r0 = r1.startsWith(r0)
            if (r0 != 0) goto L20
            java.lang.String r0 = "0."
            boolean r1 = r1.startsWith(r0)
            r0 = 1
            if (r1 == 0) goto L21
        L20:
            r0 = 0
        L21:
            com.facebook.common.errorreporting.memory.nativememdump.NativeHeapDumper.sIsArt = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.common.errorreporting.memory.nativememdump.NativeHeapDumper.<clinit>():void");
    }

    public NativeHeapDumper(LightweightQuickPerformanceLogger lightweightQuickPerformanceLogger, String str, File file) {
        this.mAslSessionId = str;
        this.mQpl = lightweightQuickPerformanceLogger;
        this.mLogDir = file;
    }
}
