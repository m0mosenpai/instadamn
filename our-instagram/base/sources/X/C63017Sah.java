package X;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import com.google.android.exoplayer2.util.Util;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.Sah, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63017Sah {
    public InterfaceC65244Tga A00;
    public final HashMap A03 = AbstractC166987dD.A1G();
    public final SparseArray A01 = AbstractC58318PtA.A0G();
    public final SparseBooleanArray A04 = new SparseBooleanArray();
    public final SparseBooleanArray A02 = new SparseBooleanArray();

    public static SQ9 A00(C63017Sah c63017Sah, Object obj) {
        return (SQ9) c63017Sah.A03.get(obj);
    }

    public final SQ9 A01(String str) {
        int keyAt;
        HashMap hashMap = this.A03;
        SQ9 sq9 = (SQ9) hashMap.get(str);
        if (sq9 == null) {
            SparseArray sparseArray = this.A01;
            int size = sparseArray.size();
            int i = 0;
            if (size == 0) {
                keyAt = 0;
            } else {
                keyAt = sparseArray.keyAt(size - 1) + 1;
                if (keyAt < 0) {
                    while (i < size && i == sparseArray.keyAt(i)) {
                        i++;
                    }
                    keyAt = i;
                }
            }
            SQ9 sq92 = new SQ9(C64217T4g.A02, str, keyAt);
            hashMap.put(str, sq92);
            sparseArray.put(keyAt, str);
            this.A02.put(keyAt, true);
            ((C64216T4f) this.A00).A01 = true;
            return sq92;
        }
        return sq9;
    }

    public final void A02() {
        C64217T4g c64217T4g;
        int i;
        int hashCode;
        SEP sep = ((C64216T4f) this.A00).A02;
        File file = sep.A01;
        if (!file.exists()) {
            sep.A00.exists();
        }
        HashMap hashMap = this.A03;
        SparseArray sparseArray = this.A01;
        C4B8.A04(!r1.A01);
        if (file.exists() || sep.A00.exists()) {
            boolean z = true;
            try {
                try {
                    File file2 = sep.A00;
                    if (file2.exists()) {
                        file.delete();
                        file2.renameTo(file);
                    }
                    DataInputStream dataInputStream = new DataInputStream(new BufferedInputStream(new FileInputStream(file)));
                    try {
                        int readInt = dataInputStream.readInt();
                        if (readInt >= 0 && readInt <= 2 && (dataInputStream.readInt() & 1) == 0) {
                            int readInt2 = dataInputStream.readInt();
                            int i2 = 0;
                            for (int i3 = 0; i3 < readInt2; i3++) {
                                int readInt3 = dataInputStream.readInt();
                                String readUTF = dataInputStream.readUTF();
                                if (readInt < 2) {
                                    long readLong = dataInputStream.readLong();
                                    SEO seo = new SEO();
                                    seo.A01.put("exo_len", Long.valueOf(readLong));
                                    seo.A00.remove("exo_len");
                                    c64217T4g = C64217T4g.A02.A01(seo);
                                } else {
                                    int readInt4 = dataInputStream.readInt();
                                    HashMap A1G = AbstractC166987dD.A1G();
                                    for (int i4 = 0; i4 < readInt4; i4++) {
                                        String readUTF2 = dataInputStream.readUTF();
                                        int readInt5 = dataInputStream.readInt();
                                        if (readInt5 >= 0) {
                                            int min = Math.min(readInt5, 10485760);
                                            byte[] bArr = Util.A06;
                                            int i5 = 0;
                                            while (i5 != readInt5) {
                                                int i6 = i5 + min;
                                                bArr = Arrays.copyOf(bArr, i6);
                                                dataInputStream.readFully(bArr, i5, min);
                                                min = Math.min(readInt5 - i6, 10485760);
                                                i5 = i6;
                                            }
                                            A1G.put(readUTF2, bArr);
                                        } else {
                                            throw AbstractC58320PtC.A0i("Invalid value size: ", readInt5);
                                        }
                                    }
                                    c64217T4g = new C64217T4g(A1G);
                                }
                                SQ9 sq9 = new SQ9(c64217T4g, readUTF, readInt3);
                                String str = sq9.A02;
                                hashMap.put(str, sq9);
                                int i7 = sq9.A01;
                                sparseArray.put(i7, str);
                                int A03 = AbstractC25226BEj.A03(str, i7 * 31);
                                if (readInt < 2) {
                                    i = A03 * 31;
                                    hashCode = AbstractC25228BEl.A03(S2H.A00(sq9.A00));
                                } else {
                                    i = A03 * 31;
                                    hashCode = sq9.A00.hashCode();
                                }
                                i2 += i + hashCode;
                            }
                            int readInt6 = dataInputStream.readInt();
                            if (dataInputStream.read() != -1) {
                                z = false;
                            }
                            if (readInt6 == i2 && z) {
                                try {
                                    dataInputStream.close();
                                    return;
                                } catch (IOException unused) {
                                    return;
                                }
                            }
                        }
                    } catch (IOException unused2) {
                    } catch (Throwable th) {
                        try {
                            dataInputStream.close();
                            throw th;
                        } catch (IOException unused3) {
                            throw th;
                        }
                    }
                    dataInputStream.close();
                } catch (Throwable th2) {
                    throw th2;
                }
            } catch (IOException unused4) {
            }
            hashMap.clear();
            sparseArray.clear();
            file.delete();
            sep.A00.delete();
        }
    }

    /* JADX WARN: Type inference failed for: r0v26, types: [X.RdQ, java.io.BufferedOutputStream] */
    public final void A03() {
        C61050ReM c61050ReM;
        C60998RdQ c60998RdQ;
        InterfaceC65244Tga interfaceC65244Tga = this.A00;
        HashMap hashMap = this.A03;
        C64216T4f c64216T4f = (C64216T4f) interfaceC65244Tga;
        if (c64216T4f.A01) {
            try {
                SEP sep = c64216T4f.A02;
                File file = sep.A01;
                if (file.exists()) {
                    File file2 = sep.A00;
                    if (!file2.exists()) {
                        if (!file.renameTo(file2)) {
                            StringBuilder A1C = AbstractC166987dD.A1C();
                            A1C.append("Couldn't rename file ");
                            A1C.append(file);
                            AbstractC46512Bo.A04("AtomicFile", AbstractC167017dG.A0n(file2, " to backup file ", A1C));
                        }
                    } else {
                        file.delete();
                    }
                }
                try {
                    c61050ReM = new C61050ReM(file);
                } catch (FileNotFoundException e) {
                    File parentFile = file.getParentFile();
                    if (parentFile != null && parentFile.mkdirs()) {
                        try {
                            c61050ReM = new C61050ReM(file);
                        } catch (FileNotFoundException e2) {
                            throw new IOException(AbstractC167017dG.A0n(file, "Couldn't create ", AbstractC166987dD.A1C()), e2);
                        }
                    } else {
                        throw new IOException(AbstractC167017dG.A0n(file, "Couldn't create ", AbstractC166987dD.A1C()), e);
                    }
                }
                C60998RdQ c60998RdQ2 = c64216T4f.A00;
                if (c60998RdQ2 == null) {
                    ?? bufferedOutputStream = new BufferedOutputStream(c61050ReM);
                    c64216T4f.A00 = bufferedOutputStream;
                    c60998RdQ = bufferedOutputStream;
                } else {
                    c60998RdQ2.A00(c61050ReM);
                    c60998RdQ = c60998RdQ2;
                }
                DataOutputStream dataOutputStream = new DataOutputStream(c60998RdQ);
                try {
                    dataOutputStream.writeInt(2);
                    int i = 0;
                    dataOutputStream.writeInt(0);
                    dataOutputStream.writeInt(hashMap.size());
                    Iterator A0k = AbstractC167007dF.A0k(hashMap);
                    while (A0k.hasNext()) {
                        SQ9 sq9 = (SQ9) A0k.next();
                        int i2 = sq9.A01;
                        dataOutputStream.writeInt(i2);
                        String str = sq9.A02;
                        dataOutputStream.writeUTF(str);
                        java.util.Set entrySet = sq9.A00.A01.entrySet();
                        dataOutputStream.writeInt(entrySet.size());
                        Iterator it = entrySet.iterator();
                        while (it.hasNext()) {
                            Map.Entry A1K = AbstractC166987dD.A1K(it);
                            dataOutputStream.writeUTF(AbstractC31172DnG.A17(A1K));
                            byte[] bArr = (byte[]) A1K.getValue();
                            dataOutputStream.writeInt(bArr.length);
                            dataOutputStream.write(bArr);
                        }
                        i += AbstractC166987dD.A0I(sq9.A00, AbstractC166997dE.A0K(str, i2 * 31));
                    }
                    dataOutputStream.writeInt(i);
                    dataOutputStream.close();
                    sep.A00.delete();
                    c64216T4f.A01 = false;
                } finally {
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        SparseBooleanArray sparseBooleanArray = this.A04;
        int size = sparseBooleanArray.size();
        for (int i3 = 0; i3 < size; i3++) {
            this.A01.remove(sparseBooleanArray.keyAt(i3));
        }
        sparseBooleanArray.clear();
        this.A02.clear();
    }

    public final void A04(String str) {
        HashMap hashMap = this.A03;
        SQ9 sq9 = (SQ9) hashMap.get(str);
        if (sq9 != null && sq9.A04.isEmpty() && sq9.A03.isEmpty()) {
            hashMap.remove(str);
            int i = sq9.A01;
            SparseBooleanArray sparseBooleanArray = this.A02;
            boolean z = sparseBooleanArray.get(i);
            ((C64216T4f) this.A00).A01 = true;
            SparseArray sparseArray = this.A01;
            if (z) {
                sparseArray.remove(i);
                sparseBooleanArray.delete(i);
            } else {
                sparseArray.put(i, null);
                this.A04.put(i, true);
            }
        }
    }

    public C63017Sah(File file) {
        this.A00 = new C64216T4f(MSW.A0w(file, "cached_content_index.exi"));
    }
}
