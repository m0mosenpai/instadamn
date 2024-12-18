package X;

import android.content.res.Resources;
import android.util.LruCache;
import com.facebook.common.dextricks.DalvikInternals;
import java.io.File;
import java.io.FileInputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.util.concurrent.ConcurrentLinkedDeque;

/* renamed from: X.1Tw, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C27221Tw {
    public Constructor A00;
    public Method A01;
    public Method A02;
    public final int A03;
    public final Resources A04;
    public final C27231Tx A05;
    public final Object A06;
    public final MappedByteBuffer A07;
    public final FileChannel A08;
    public final InterfaceC09390do A09;
    public final InterfaceC09390do A0A;
    public final boolean A0B;
    public final boolean A0C;
    public final C27111Tk A0D;
    public final FileInputStream A0E;

    /* JADX WARN: Type inference failed for: r0v0, types: [X.1Tx] */
    public C27221Tw(Resources resources, C27111Tk c27111Tk, File file, final int i, boolean z, boolean z2) {
        MappedByteBuffer map;
        this.A04 = resources;
        this.A03 = i;
        this.A0B = z;
        this.A0C = z2;
        this.A0D = c27111Tk;
        this.A05 = new LruCache(i) { // from class: X.1Tx
            @Override // android.util.LruCache
            public final /* bridge */ /* synthetic */ void entryRemoved(boolean z3, Object obj, Object obj2, Object obj3) {
                long longValue = ((Number) obj).longValue();
                try {
                    C27221Tw c27221Tw = C27221Tw.this;
                    if (c27221Tw.A0B) {
                        synchronized (((Object[]) c27221Tw.A09.getValue())[Math.abs((((int) (longValue >> 32)) * 7919) % 50)]) {
                            c27221Tw.A01.invoke(obj2, new Object[0]);
                        }
                        return;
                    }
                    c27221Tw.A01.invoke(obj2, new Object[0]);
                } catch (Exception e) {
                    if (!(e instanceof IllegalAccessException) && !(e instanceof InvocationTargetException)) {
                        throw e;
                    }
                    C0K8.A0J("BundledLayoutLoader", "Unable to close XMLBlock", e);
                }
            }

            @Override // android.util.LruCache
            public final /* bridge */ /* synthetic */ int sizeOf(Object obj, Object obj2) {
                return (int) ((Number) obj).longValue();
            }
        };
        EnumC09460dv enumC09460dv = EnumC09460dv.A04;
        this.A09 = AbstractC09440dt.A00(enumC09460dv, C27241Ty.A00);
        this.A06 = new Object();
        this.A0A = AbstractC09440dt.A00(enumC09460dv, C27251Tz.A00);
        C62534SFl c62534SFl = C27111Tk.A01;
        if (c62534SFl != null) {
            this.A0E = c62534SFl.A00;
            this.A08 = c62534SFl.A02;
            map = c62534SFl.A01;
        } else {
            FileInputStream fileInputStream = new FileInputStream(file);
            this.A0E = fileInputStream;
            FileChannel channel = fileInputStream.getChannel();
            this.A08 = channel;
            map = channel.map(FileChannel.MapMode.READ_ONLY, 0L, channel.size());
        }
        this.A07 = map;
        if (z2) {
            ((ConcurrentLinkedDeque) this.A0A.getValue()).offer(this.A07);
        }
        DalvikInternals.madviseFile(file.getCanonicalPath());
        if (z) {
            c27111Tk.A00 = new C206859Dq(this, 3);
        }
        try {
            Class<?> cls = Class.forName("android.content.res.XmlBlock");
            this.A00 = cls.getDeclaredConstructor(byte[].class);
            this.A02 = cls.getDeclaredMethod("newParser", new Class[0]);
            this.A01 = cls.getDeclaredMethod("close", new Class[0]);
            this.A00.setAccessible(true);
            this.A02.setAccessible(true);
            this.A01.setAccessible(true);
        } catch (Exception e) {
            if (!(e instanceof ClassNotFoundException) && !(e instanceof NoSuchMethodException)) {
                throw e;
            }
            throw new RuntimeException("Unable to load XmlBlock methods by reflection", e);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:5:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object A00(X.C55912ha r6, X.C27221Tw r7, java.lang.String r8, boolean r9) {
        /*
            if (r9 == 0) goto L12
            boolean r0 = r7.A0C     // Catch: java.lang.IndexOutOfBoundsException -> L5f
            if (r0 != 0) goto L12
            java.lang.Object r1 = r7.A06     // Catch: java.lang.IndexOutOfBoundsException -> L5f
            monitor-enter(r1)     // Catch: java.lang.IndexOutOfBoundsException -> L5f
            byte[] r5 = A02(r6, r7)     // Catch: java.lang.Throwable -> Lf
            monitor-exit(r1)     // Catch: java.lang.IndexOutOfBoundsException -> L5f
            goto L16
        Lf:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.IndexOutOfBoundsException -> L5f
            throw r0     // Catch: java.lang.IndexOutOfBoundsException -> L5f
        L12:
            byte[] r5 = A02(r6, r7)     // Catch: java.lang.IndexOutOfBoundsException -> L5f
        L16:
            java.util.zip.CRC32 r0 = new java.util.zip.CRC32
            r0.<init>()
            r0.update(r5)
            long r3 = r0.getValue()
            r0 = 65535(0xffff, double:3.23786E-319)
            long r3 = r3 & r0
            long r1 = r6.A02
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 != 0) goto L53
            java.lang.reflect.Constructor r1 = r7.A00     // Catch: java.lang.Exception -> L3a
            java.lang.Object[] r0 = new java.lang.Object[]{r5}     // Catch: java.lang.Exception -> L3a
            java.lang.Object r0 = r1.newInstance(r0)     // Catch: java.lang.Exception -> L3a
            X.C14360o3.A07(r0)     // Catch: java.lang.Exception -> L3a
            return r0
        L3a:
            r2 = move-exception
            boolean r0 = r2 instanceof java.lang.InstantiationException
            if (r0 != 0) goto L47
            boolean r0 = r2 instanceof java.lang.IllegalAccessException
            if (r0 != 0) goto L47
            boolean r0 = r2 instanceof java.lang.reflect.InvocationTargetException
            if (r0 == 0) goto L5e
        L47:
            java.lang.String r0 = "Could not create XmlBlock for bundled layout "
            java.lang.String r1 = X.AnonymousClass001.A0R(r0, r8)
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>(r1, r2)
            throw r0
        L53:
            java.lang.String r0 = "CRC mismatch loading layout "
            java.lang.String r0 = X.AnonymousClass001.A0R(r0, r8)
            java.io.IOException r2 = new java.io.IOException
            r2.<init>(r0)
        L5e:
            throw r2
        L5f:
            r2 = move-exception
            java.lang.String r0 = "Detected truncated layouts.bin loading "
            java.lang.String r1 = X.AnonymousClass001.A0R(r0, r8)
            java.io.IOException r0 = new java.io.IOException
            r0.<init>(r1, r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C27221Tw.A00(X.2ha, X.1Tw, java.lang.String, boolean):java.lang.Object");
    }

    public static final void A01(C55912ha c55912ha, C27221Tw c27221Tw, Object obj) {
        if (!c27221Tw.A0B || c55912ha.A00 < c27221Tw.A03) {
            c27221Tw.A05.put(Long.valueOf((c55912ha.A01 << 32) | c55912ha.A00), obj);
        }
    }

    public static final byte[] A02(C55912ha c55912ha, C27221Tw c27221Tw) {
        MappedByteBuffer mappedByteBuffer;
        byte[] bArr = new byte[c55912ha.A00];
        boolean z = c27221Tw.A0C;
        if (z) {
            synchronized (c27221Tw) {
                mappedByteBuffer = (MappedByteBuffer) ((ConcurrentLinkedDeque) c27221Tw.A0A.getValue()).poll();
                if (mappedByteBuffer == null) {
                    FileChannel fileChannel = c27221Tw.A08;
                    mappedByteBuffer = fileChannel.map(FileChannel.MapMode.READ_ONLY, 0L, fileChannel.size());
                    C14360o3.A07(mappedByteBuffer);
                }
            }
        } else {
            mappedByteBuffer = c27221Tw.A07;
        }
        mappedByteBuffer.position(c55912ha.A01);
        mappedByteBuffer.get(bArr);
        if (z) {
            ((ConcurrentLinkedDeque) c27221Tw.A0A.getValue()).offer(mappedByteBuffer);
        }
        return bArr;
    }
}
