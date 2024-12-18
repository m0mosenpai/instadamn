package X;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.List;

/* renamed from: X.68V, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C68V {
    /* JADX WARN: Type inference failed for: r0v27, types: [X.6aZ, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v6, types: [java.lang.Object, X.68X] */
    /* JADX WARN: Type inference failed for: r3v1, types: [X.UOl, X.2ir, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v2, types: [X.68W, X.2ir, java.lang.Object] */
    public final AbstractC56582ir A00(ByteBuffer byteBuffer) {
        C14360o3.A0B(byteBuffer, 0);
        if ("KEYF".length() == 4) {
            int i = 0;
            while ("KEYF".charAt(i) == ((char) byteBuffer.get(byteBuffer.position() + 4 + i))) {
                i++;
                if (i >= 4) {
                    ?? obj = new Object();
                    try {
                        ?? obj2 = new Object();
                        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
                        int position = byteBuffer.position();
                        obj2.ANn(byteBuffer, byteBuffer.getInt(position) + position);
                        obj2.A00(obj);
                        List list = obj.A01;
                        if (list != null) {
                            AbstractC56652iy[] abstractC56652iyArr = new AbstractC56652iy[list.size()];
                            obj.A04 = abstractC56652iyArr;
                            obj.A04 = (AbstractC56652iy[]) obj.A01.toArray(abstractC56652iyArr);
                            obj.A01 = null;
                            obj.A00 = 0;
                        }
                        List list2 = obj.A00;
                        if (list2 != null) {
                            C141566aZ c141566aZ = obj.A01;
                            C141566aZ c141566aZ2 = c141566aZ;
                            if (c141566aZ == null) {
                                ?? obj3 = new Object();
                                obj.A01 = obj3;
                                c141566aZ2 = obj3;
                            }
                            c141566aZ2.A00 = list2;
                            obj.A00 = null;
                        }
                        if (obj.A03 == null) {
                            obj.A03 = new byte[]{0};
                        }
                        obj.A00();
                        return obj;
                    } catch (Exception e) {
                        throw new Exception(e);
                    }
                }
            }
        }
        if ("KYF3".length() == 4) {
            int i2 = 0;
            while ("KYF3".charAt(i2) == ((char) byteBuffer.get(byteBuffer.position() + 4 + i2))) {
                i2++;
                if (i2 >= 4) {
                    ?? obj4 = new Object();
                    try {
                        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
                        int position2 = byteBuffer.position();
                        obj4.ANn(byteBuffer, byteBuffer.getInt(position2) + position2);
                        return obj4;
                    } catch (Exception e2) {
                        throw new Exception(e2);
                    }
                }
            }
        }
        throw new Exception("unrecognized asset format");
    }
}
