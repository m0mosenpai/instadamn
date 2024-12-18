package X;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: X.Pvb, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C58453Pvb {
    public RandomAccessFile A00;
    public int A01;
    public long A02;
    public List A03;
    public boolean A04;
    public final int A05;
    public final File A06;
    public final Integer A07;
    public final byte[] A08;

    public final synchronized ArrayList A01(String str) {
        ArrayList A1E;
        long j;
        A03();
        A1E = AbstractC166987dD.A1E();
        int i = this.A01;
        List list = this.A03;
        list.getClass();
        if (i >= list.size()) {
            this.A03.add(str);
        } else {
            A1E.add(AbstractC25226BEj.A1I(this.A03, this.A01));
            this.A03.set(this.A01, str);
        }
        this.A01++;
        StringBuilder A11 = AbstractC166997dE.A11(str);
        A11.append(',');
        A11.append("##");
        byte[] bytes = MSX.A0l(A11, ',').getBytes(StandardCharsets.UTF_8);
        long length = this.A02 + bytes.length;
        this.A02 = length;
        long intValue = this.A07.intValue();
        if (length <= intValue) {
            this.A02 = length - this.A08.length;
        } else {
            List list2 = this.A03;
            List subList = list2.subList(this.A01, list2.size());
            A1E.addAll(subList);
            subList.clear();
            this.A02 = this.A05;
            this.A01 = 0;
        }
        RandomAccessFile randomAccessFile = this.A00;
        if (randomAccessFile != null) {
            try {
                randomAccessFile.write(bytes);
                long filePointer = randomAccessFile.getFilePointer();
                if (filePointer <= intValue) {
                    j = filePointer - this.A08.length;
                } else {
                    byte[] bArr = this.A08;
                    randomAccessFile.setLength(filePointer - bArr.length);
                    j = this.A05;
                    randomAccessFile.seek(j);
                    randomAccessFile.write(bArr);
                }
                randomAccessFile.seek(j);
            } catch (IOException e) {
                C0w9.A07("enqueue_to_disk_failure", e);
                RandomAccessFile randomAccessFile2 = this.A00;
                if (randomAccessFile2 != null) {
                    try {
                        randomAccessFile2.close();
                    } catch (IOException unused) {
                    }
                }
                this.A00 = null;
            }
        }
        return A1E;
    }

    public final synchronized List A02() {
        List list;
        A03();
        list = this.A03;
        list.getClass();
        return Collections.unmodifiableList(list);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x017c A[Catch: all -> 0x01a2, TryCatch #1 {, blocks: (B:4:0x0003, B:8:0x0009, B:12:0x0015, B:13:0x013b, B:15:0x0174, B:17:0x017c, B:19:0x0181, B:21:0x0189, B:22:0x018d, B:24:0x0193, B:26:0x001f, B:27:0x002c, B:29:0x0035, B:32:0x0039, B:37:0x0043, B:39:0x006d, B:41:0x0084, B:43:0x0093, B:45:0x0099, B:47:0x00ad, B:49:0x00ce, B:51:0x00d4, B:58:0x00de, B:67:0x00e8, B:61:0x00ec, B:64:0x00f8, B:54:0x0111, B:71:0x0117, B:75:0x0126, B:92:0x0160, B:96:0x0167, B:94:0x016a, B:76:0x00b3, B:79:0x00ba, B:87:0x00c8, B:81:0x00c3), top: B:3:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0189 A[Catch: all -> 0x01a2, TryCatch #1 {, blocks: (B:4:0x0003, B:8:0x0009, B:12:0x0015, B:13:0x013b, B:15:0x0174, B:17:0x017c, B:19:0x0181, B:21:0x0189, B:22:0x018d, B:24:0x0193, B:26:0x001f, B:27:0x002c, B:29:0x0035, B:32:0x0039, B:37:0x0043, B:39:0x006d, B:41:0x0084, B:43:0x0093, B:45:0x0099, B:47:0x00ad, B:49:0x00ce, B:51:0x00d4, B:58:0x00de, B:67:0x00e8, B:61:0x00ec, B:64:0x00f8, B:54:0x0111, B:71:0x0117, B:75:0x0126, B:92:0x0160, B:96:0x0167, B:94:0x016a, B:76:0x00b3, B:79:0x00ba, B:87:0x00c8, B:81:0x00c3), top: B:3:0x0003 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void A03() {
        /*
            Method dump skipped, instructions count: 421
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C58453Pvb.A03():void");
    }

    public C58453Pvb(File file, Integer num) {
        this.A06 = file;
        this.A07 = num;
        byte[] bytes = AnonymousClass001.A0C("##", ',').getBytes(StandardCharsets.UTF_8);
        this.A08 = bytes;
        this.A05 = A00().length - bytes.length;
    }

    private byte[] A00() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append(Integer.toString(3));
        A1C.append(',');
        A1C.append(Integer.toString(this.A07.intValue()));
        A1C.append(',');
        A1C.append("##");
        return MSX.A0l(A1C, ',').getBytes(StandardCharsets.UTF_8);
    }
}
