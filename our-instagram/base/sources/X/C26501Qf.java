package X;

import java.io.ByteArrayInputStream;
import java.io.SequenceInputStream;
import java.nio.ByteBuffer;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.NoSuchElementException;
import java.util.Queue;
import java.util.Vector;

/* renamed from: X.1Qf, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C26501Qf implements Iterator, C0s1 {
    public final Queue A02;
    public final Queue A01 = new LinkedList();
    public Queue A00 = new LinkedList();

    public final boolean A00() {
        Queue queue = this.A01;
        if (!(queue instanceof Collection) || !queue.isEmpty()) {
            Iterator it = queue.iterator();
            while (it.hasNext()) {
                if (((Boolean) ((C09530e4) it.next()).A01).booleanValue()) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.A00.clear();
    }

    public C26501Qf(Queue queue) {
        this.A02 = queue;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (A00()) {
            return true;
        }
        while (true) {
            Queue queue = this.A02;
            if (!queue.isEmpty()) {
                ByteBuffer byteBuffer = (ByteBuffer) queue.poll();
                while (byteBuffer.position() < byteBuffer.limit()) {
                    if (byteBuffer.get() == 10) {
                        int limit = byteBuffer.limit();
                        byteBuffer.flip();
                        int limit2 = byteBuffer.limit();
                        byte[] bArr = new byte[limit2];
                        byteBuffer.get(bArr);
                        if (limit2 > 0) {
                            this.A01.add(new C09530e4(bArr, true));
                        }
                        byteBuffer.limit(limit);
                        byteBuffer = byteBuffer.slice();
                    }
                }
                byteBuffer.flip();
                int limit3 = byteBuffer.limit();
                byte[] bArr2 = new byte[limit3];
                byteBuffer.get(bArr2);
                if (limit3 > 0) {
                    this.A01.add(new C09530e4(bArr2, false));
                }
            } else {
                return A00();
            }
        }
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        C09530e4 c09530e4;
        if (hasNext()) {
            Vector vector = new Vector();
            Queue queue = this.A00;
            Iterator it = queue.iterator();
            while (it.hasNext()) {
                vector.add(new ByteArrayInputStream((byte[]) ((C09530e4) it.next()).A00));
            }
            do {
                Queue queue2 = this.A01;
                if (queue2.isEmpty()) {
                    break;
                }
                c09530e4 = (C09530e4) queue2.poll();
                queue.add(c09530e4);
                vector.add(new ByteArrayInputStream((byte[]) c09530e4.A00));
            } while (!((Boolean) c09530e4.A01).booleanValue());
            return new SequenceInputStream(vector.elements());
        }
        throw new NoSuchElementException();
    }
}
