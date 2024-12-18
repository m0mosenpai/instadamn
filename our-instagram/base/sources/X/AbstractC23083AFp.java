package X;

import java.nio.ByteBuffer;

/* renamed from: X.AFp, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC23083AFp {
    public static final ByteBuffer A00;
    public static final ByteBuffer A01;

    static {
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(2);
        A00 = allocateDirect;
        ByteBuffer allocateDirect2 = ByteBuffer.allocateDirect(2);
        A01 = allocateDirect2;
        allocateDirect.clear();
        allocateDirect.put((byte) -1);
        allocateDirect.put((byte) -40);
        allocateDirect2.clear();
        allocateDirect2.put((byte) -1);
        allocateDirect2.put((byte) -39);
    }

    /* JADX WARN: Code restructure failed: missing block: B:175:0x034c, code lost:
    
        r5.inBitmap = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:177:0x034e, code lost:
    
        r2 = android.graphics.BitmapFactory.decodeFileDescriptor(r11, null, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:178:0x0354, code lost:
    
        if (r2 == null) goto L174;
     */
    /* JADX WARN: Code restructure failed: missing block: B:179:0x0356, code lost:
    
        if (r16 == null) goto L168;
     */
    /* JADX WARN: Code restructure failed: missing block: B:180:0x0383, code lost:
    
        X.AbstractC50673MYr.A00(android.graphics.Bitmap.CompressFormat.JPEG, r2, r12);
        r2.recycle();
        r21 = r2.getWidth();
        r22 = r2.getHeight();
     */
    /* JADX WARN: Code restructure failed: missing block: B:181:0x0393, code lost:
    
        r1 = new X.C183978Ee(r36, r21, r22, java.lang.System.currentTimeMillis(), r25, false);
        r1.A01().A03 = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:183:0x0358, code lost:
    
        r16.recycle();
        r8 = r2.getWidth();
        r9 = r2.getHeight();
        X.C0fK.A03(r2);
        r1 = android.graphics.Bitmap.createBitmap(r2, 0, 0, r8, r9, r3, true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:184:0x036f, code lost:
    
        r2.recycle();
        r2 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:185:0x0373, code lost:
    
        if (r1 != null) goto L168;
     */
    /* JADX WARN: Code restructure failed: missing block: B:186:0x0375, code lost:
    
        r21 = 0;
        r22 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:188:0x037a, code lost:
    
        r1 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:190:?, code lost:
    
        throw new java.io.IOException("Failed to transform bitmap", r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:192:?, code lost:
    
        throw new java.io.IOException("Failed to decode the file descriptor into bitmap");
     */
    /* JADX WARN: Code restructure failed: missing block: B:194:0x03ba, code lost:
    
        r1 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:196:?, code lost:
    
        throw new java.io.IOException("Failed to decode the file descriptor into bitmap.", r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:254:0x0194, code lost:
    
        if (r25 != (-1)) goto L72;
     */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01a2 A[Catch: all -> 0x03fc, TRY_LEAVE, TryCatch #19 {all -> 0x03fc, blocks: (B:7:0x0019, B:8:0x0059, B:9:0x005c, B:13:0x008d, B:15:0x0099, B:18:0x00a4, B:20:0x00af, B:22:0x00b7, B:25:0x00c0, B:30:0x00ce, B:32:0x00e4, B:34:0x00f0, B:36:0x00f5, B:38:0x00fd, B:41:0x0107, B:43:0x010d, B:46:0x0130, B:48:0x0136, B:52:0x0146, B:55:0x0156, B:243:0x015d, B:245:0x0170, B:57:0x017a, B:59:0x0180, B:62:0x0196, B:64:0x01a2, B:67:0x01ae, B:69:0x01b6, B:71:0x01bc, B:73:0x01cd, B:75:0x01d5, B:77:0x01dd, B:252:0x0189, B:253:0x018e, B:255:0x006c, B:256:0x0070, B:257:0x007f, B:258:0x0074, B:259:0x0078, B:260:0x007c, B:261:0x0083, B:262:0x0087), top: B:6:0x0019 }] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01f7  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x023a  */
    /* JADX WARN: Type inference failed for: r3v4, types: [X.1Ke, java.lang.Object, com.google.common.util.concurrent.SettableFuture] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.C183978Ee A00(android.content.Context r33, android.net.Uri r34, com.instagram.common.session.UserSession r35, java.io.File r36) {
        /*
            Method dump skipped, instructions count: 1050
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC23083AFp.A00(android.content.Context, android.net.Uri, com.instagram.common.session.UserSession, java.io.File):X.8Ee");
    }
}
