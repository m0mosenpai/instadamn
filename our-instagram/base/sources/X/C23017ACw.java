package X;

import android.opengl.GLES20;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.ACw, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C23017ACw {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public boolean A04;
    public final BCO A0A;
    public volatile AAP A0B;
    public volatile float A0C;
    public final ABT A05 = new ABT();
    public volatile C199758sR A0D = new C199758sR(0, 0);
    public final Map A08 = Collections.synchronizedMap(new IdentityHashMap());
    public final AtomicReference A09 = new AtomicReference();
    public final A4X A06 = new A4X();
    public final C179327xi A07 = new C179327xi(new AXD(this));

    public final void A00() {
        AXC axc = (AXC) this.A09.getAndSet(null);
        if (axc != null) {
            axc.release();
        }
        this.A05.A00();
        if (this.A0B != null) {
            AAP aap = this.A0B;
            C200688uB c200688uB = aap.A02;
            if (c200688uB != null) {
                c200688uB.A01();
                aap.A02 = null;
            }
            aap.A03.A02();
            this.A0B = null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void A01() {
        ByteBuffer byteBuffer;
        ABT abt = this.A05;
        synchronized (abt) {
            List list = abt.A03;
            if (!list.isEmpty()) {
                byteBuffer = (ByteBuffer) list.remove(0);
            } else {
                byteBuffer = null;
            }
        }
        if (byteBuffer != null) {
            AtomicReference atomicReference = this.A09;
            AXC axc = (AXC) atomicReference.getAndSet(null);
            if (axc != null) {
                axc.release();
            }
            Number number = (Number) this.A08.get(byteBuffer);
            number.getClass();
            AXC A00 = this.A07.A00();
            AGQ agq = (AGQ) A00.get();
            int capacity = byteBuffer.capacity();
            int i = this.A00;
            int i2 = capacity / i;
            int i3 = this.A02;
            long longValue = number.longValue();
            int i4 = this.A03;
            C179297xf[] c179297xfArr = agq.A0C;
            if (c179297xfArr != 0) {
                if (0 < c179297xfArr.length) {
                    if (c179297xfArr[0] == 0) {
                        c179297xfArr[0] = new Object();
                    }
                    C179297xf c179297xf = c179297xfArr[0];
                    c179297xf.A02 = byteBuffer;
                    c179297xf.A00 = 0;
                    c179297xf.A01 = i2;
                    agq.A03 = i3;
                    agq.A07 = longValue;
                    agq.A09 = false;
                    agq.A04 = i4;
                    agq.A02 = i;
                    try {
                        ArrayList arrayList = this.A06.A00;
                        int size = arrayList.size();
                        for (int i5 = 0; i5 < size; i5++) {
                            C200608u3 c200608u3 = (C200608u3) arrayList.get(i5);
                            c200608u3.A00.A00(A00);
                            c200608u3.A02 = false;
                        }
                        return;
                    } finally {
                        atomicReference.set(A00);
                    }
                }
                throw AbstractC166987dD.A12("planeIndex is greater then the number of planes available");
            }
            throw AbstractC166987dD.A14("FrameData has been initialized with 0 planes");
        }
        AXC axc2 = (AXC) this.A09.get();
        if (axc2 != null) {
            ArrayList arrayList2 = this.A06.A00;
            int size2 = arrayList2.size();
            for (int i6 = 0; i6 < size2; i6++) {
                C200608u3 c200608u32 = (C200608u3) arrayList2.get(i6);
                c200608u32.A00.A00(axc2);
                c200608u32.A02 = false;
            }
        }
    }

    public final void A02(int i, int i2) {
        int i3 = this.A01;
        if (i3 != 0 && !this.A04) {
            C199758sR AWf = this.A0A.AWf(i, i2, i3);
            i = AWf.A01;
            i2 = AWf.A00;
        }
        if (this.A03 != i || this.A00 != i2) {
            this.A03 = i;
            this.A00 = i2;
            this.A0C = 1.0f / i;
            this.A0D = this.A0A.AWe(i, i2);
            ABT abt = this.A05;
            int i4 = this.A0D.A01 * this.A0D.A00 * 4;
            synchronized (abt) {
                if (abt.A00 != i4) {
                    abt.A00();
                }
                abt.A00 = i4;
            }
        }
    }

    public final void A03(InterfaceC73611YPy interfaceC73611YPy, List list) {
        ArrayList arrayList = this.A06.A00;
        arrayList.clear();
        arrayList.addAll(list);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((C200608u3) it.next()).A03.put(interfaceC73611YPy.B7w(), interfaceC73611YPy);
        }
    }

    public final boolean A04(C201278vB c201278vB, boolean z) {
        ByteBuffer byteBuffer;
        AAP aap = this.A0B;
        if (aap == null || (z && this.A09.get() != null)) {
            return false;
        }
        AXC axc = (AXC) this.A09.getAndSet(null);
        if (axc != null) {
            axc.release();
        }
        ABT abt = this.A05;
        synchronized (abt) {
            List list = abt.A02;
            if (list.isEmpty() && abt.A01 < 3) {
                byteBuffer = ByteBuffer.allocateDirect(abt.A00);
                byteBuffer.order(ByteOrder.nativeOrder());
                abt.A01++;
                byteBuffer.rewind();
            } else if (!list.isEmpty()) {
                byteBuffer = (ByteBuffer) list.remove(0);
            } else {
                List list2 = abt.A03;
                if (!list2.isEmpty()) {
                    byteBuffer = (ByteBuffer) list2.remove(0);
                } else {
                    throw AbstractC166987dD.A14(AnonymousClass001.A0c("Max buffers (", ") already out and in use", 3));
                }
            }
        }
        this.A08.put(byteBuffer, Long.valueOf(c201278vB.A00));
        byteBuffer.rewind();
        int i = this.A0D.A01;
        int i2 = this.A0D.A00;
        float f = this.A0C;
        C200688uB c200688uB = aap.A02;
        if (c200688uB != null && (aap.A01 != i || aap.A00 != i2)) {
            c200688uB.A01();
            aap.A02 = null;
        }
        aap.A01 = i;
        aap.A00 = i2;
        boolean A05 = c201278vB.A05();
        if (A05 != aap.A04) {
            aap.A04 = A05;
            aap.A03.A02();
            aap.A03 = aap.A08.A02(aap.A06, aap.A05, aap.A04);
        }
        C200688uB c200688uB2 = aap.A02;
        if (c200688uB2 == null) {
            c200688uB2 = new C200688uB(i, i2);
            aap.A02 = c200688uB2;
        }
        GLES20.glBindFramebuffer(36160, c200688uB2.A00);
        C200688uB c200688uB3 = aap.A02;
        GLES20.glViewport(0, 0, c200688uB3.A02, c200688uB3.A01);
        C9K4 A01 = aap.A03.A01();
        A01.A04("uSurfaceTransformMatrix", c201278vB.A04);
        A01.A04("uSceneTransformMatrix", c201278vB.A03);
        A01.A04("uVideoTransformMatrix", c201278vB.A05);
        A01.A03("sTexture", c201278vB.A00());
        if (aap.A09) {
            A01.A02("uInverseSize", f);
        }
        A01.A01(aap.A07);
        GLES20.glReadPixels(0, 0, i, i2, 6408, 5121, byteBuffer);
        GLES20.glBindFramebuffer(36160, 0);
        synchronized (abt) {
            if (byteBuffer.capacity() == abt.A00) {
                abt.A03.add(byteBuffer);
            }
        }
        return true;
    }

    public final boolean A05(EnumC200638u6 enumC200638u6) {
        ArrayList arrayList = this.A06.A00;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            C200608u3 c200608u3 = (C200608u3) arrayList.get(i);
            if (c200608u3.A00.A00.A0m && c200608u3.A01 == enumC200638u6) {
                return true;
            }
        }
        return false;
    }

    public C23017ACw(BCO bco, int i) {
        this.A0A = bco;
        this.A02 = i;
    }
}
