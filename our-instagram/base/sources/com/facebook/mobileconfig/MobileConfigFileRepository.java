package com.facebook.mobileconfig;

import X.AbstractC166987dD;
import X.AbstractC58318PtA;
import X.C0K8;
import X.C1AE;
import X.C61565Rpn;
import X.MSW;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.channels.FileChannel;
import java.util.Map;

/* loaded from: classes10.dex */
public class MobileConfigFileRepository {
    public static final String TAG = "MobileConfigFileRepository";
    public static final Map mFileCache = AbstractC166987dD.A1G();
    public final Object mFileCacheLock = AbstractC58318PtA.A0b();

    /* JADX WARN: Type inference failed for: r2v0, types: [X.Rpn, java.lang.Object] */
    public static ByteBuffer getJavaByteBuffer(String str) {
        if (str == null || str.isEmpty()) {
            C0K8.A0D(TAG, "Filename should not be null or empty.");
        }
        Map map = mFileCache;
        C61565Rpn c61565Rpn = (C61565Rpn) map.get(str);
        if (c61565Rpn != null) {
            if (c61565Rpn.A00 != null) {
                c61565Rpn.A01.incrementAndGet();
                return c61565Rpn.A00;
            }
            C0K8.A0C(TAG, "Cannot create new reference for null buffer.");
            throw AbstractC166987dD.A14("ByteBuffer has already been released.");
        }
        ByteBuffer readBuffer = readBuffer(str);
        if (readBuffer == null) {
            return null;
        }
        ?? obj = new Object();
        obj.A00 = readBuffer;
        obj.A01 = MSW.A1C(0);
        obj.A02 = false;
        map.put(str, obj);
        if (obj.A00 != null) {
            obj.A01.incrementAndGet();
            return obj.A00;
        }
        C0K8.A0C(TAG, "Cannot create new reference for null buffer.");
        throw AbstractC166987dD.A14("ByteBuffer has already been released.");
    }

    public static ByteBuffer readBuffer(String str) {
        File A11 = AbstractC166987dD.A11(str);
        try {
            FileInputStream fileInputStream = new FileInputStream(A11);
            try {
                FileChannel channel = fileInputStream.getChannel();
                try {
                    ByteBuffer allocateDirect = ByteBuffer.allocateDirect((int) channel.size());
                    allocateDirect.order(ByteOrder.LITTLE_ENDIAN);
                    channel.read(allocateDirect);
                    allocateDirect.flip();
                    String A00 = C1AE.A00(allocateDirect, (int) A11.length());
                    if (!A00.isEmpty()) {
                        C0K8.A0P(TAG, "Cannot validate (from direct read) \"%s\", err:%s", str, A00);
                        channel.close();
                        fileInputStream.close();
                        return null;
                    }
                    channel.close();
                    fileInputStream.close();
                    return allocateDirect;
                } finally {
                }
            } finally {
            }
        } catch (IOException e) {
            C0K8.A0M(TAG, "Cannot open \"%s\"", e, str);
            return null;
        }
    }

    public static void releaseBuffer(String str) {
        if (str == null || str.isEmpty()) {
            C0K8.A0D(TAG, "Filename should not be null or empty.");
        }
        Map map = mFileCache;
        C61565Rpn c61565Rpn = (C61565Rpn) map.get(str);
        if (c61565Rpn != null) {
            if (c61565Rpn.A01.decrementAndGet() <= 0) {
                c61565Rpn.A00 = null;
                c61565Rpn.A02 = true;
            }
            if (c61565Rpn.A02) {
                map.remove(str);
            }
        }
    }

    public MobileConfigFileRepository() {
        throw AbstractC58318PtA.A0W("Cannot instantiate MobileConfigFileRepository.");
    }
}
