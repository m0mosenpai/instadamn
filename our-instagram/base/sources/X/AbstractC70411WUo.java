package X;

import android.util.SparseArray;
import android.util.SparseIntArray;
import com.facebook.imagepipeline.memory.NativeMemoryChunk;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;

/* renamed from: X.WUo, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC70411WUo implements InterfaceC220315d, C1VS {
    public final SparseArray A00;
    public final C1KI A01;
    public final C68906Ve6 A02;
    public final C68906Ve6 A03;
    public final Vh3 A04;
    public final java.util.Set A05;
    public final XF3 A06;
    public final Class A07 = getClass();

    private synchronized void A00(SparseIntArray sparseIntArray) {
        SparseArray sparseArray = this.A00;
        sparseArray.clear();
        SparseIntArray sparseIntArray2 = this.A04.A02;
        for (int i = 0; i < sparseIntArray2.size(); i++) {
            int keyAt = sparseIntArray2.keyAt(i);
            sparseArray.put(keyAt, new Vh2(keyAt, sparseIntArray2.valueAt(i), sparseIntArray.get(keyAt, 0)));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x00ef A[Catch: all -> 0x0107, TryCatch #2 {, blocks: (B:8:0x001c, B:10:0x0024, B:12:0x0041, B:15:0x00f8, B:16:0x0100, B:20:0x0053, B:26:0x0075, B:27:0x007b, B:30:0x007e, B:31:0x007f, B:36:0x0105, B:37:0x0106, B:38:0x0084, B:40:0x0089, B:41:0x008f, B:42:0x00c0, B:44:0x00c5, B:46:0x00c9, B:47:0x00d0, B:49:0x00ef, B:50:0x009b, B:52:0x00a7, B:54:0x00ae, B:56:0x00b6, B:57:0x00be, B:29:0x007c), top: B:7:0x001c, inners: #1 }] */
    @Override // X.C1VS
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void EE3(java.lang.Object r10) {
        /*
            Method dump skipped, instructions count: 266
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC70411WUo.EE3(java.lang.Object):void");
    }

    @Override // X.InterfaceC220315d
    public final void F8d(C1KJ c1kj) {
        int i;
        ArrayList arrayList;
        synchronized (this) {
            SparseArray sparseArray = this.A00;
            arrayList = new ArrayList(sparseArray.size());
            SparseIntArray sparseIntArray = new SparseIntArray();
            for (int i2 = 0; i2 < sparseArray.size(); i2++) {
                Vh2 vh2 = (Vh2) sparseArray.valueAt(i2);
                vh2.getClass();
                if (vh2.A02.size() > 0) {
                    arrayList.add(vh2);
                }
                sparseIntArray.put(sparseArray.keyAt(i2), vh2.A00);
            }
            A00(sparseIntArray);
            C68906Ve6 c68906Ve6 = this.A02;
            c68906Ve6.A00 = 0;
            c68906Ve6.A01 = 0;
        }
        for (i = 0; i < arrayList.size(); i++) {
            Vh2 vh22 = (Vh2) arrayList.get(i);
            while (true) {
                Object poll = vh22.A02.poll();
                if (poll == null) {
                    break;
                }
                if (this instanceof UOX) {
                    NativeMemoryChunk nativeMemoryChunk = (NativeMemoryChunk) poll;
                    nativeMemoryChunk.getClass();
                    nativeMemoryChunk.close();
                }
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, X.Ve6] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, X.Ve6] */
    public AbstractC70411WUo(C1KI c1ki, Vh3 vh3, XF3 xf3) {
        c1ki.getClass();
        this.A01 = c1ki;
        vh3.getClass();
        this.A04 = vh3;
        xf3.getClass();
        this.A06 = xf3;
        this.A00 = new SparseArray();
        A00(new SparseIntArray(0));
        this.A05 = Collections.newSetFromMap(new IdentityHashMap());
        this.A02 = new Object();
        this.A03 = new Object();
    }
}
