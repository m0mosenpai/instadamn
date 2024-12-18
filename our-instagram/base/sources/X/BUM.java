package X;

import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.litho.annotations.Comparable;

/* loaded from: classes5.dex */
public final class BUM extends AbstractC50922Vo {

    @Comparable(type = JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET)
    public C6FG A00;

    @Comparable(type = JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET)
    public C136326Fl A01;

    @Comparable(type = JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET)
    public C27817COg A02;

    @Comparable(type = JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET)
    public BUI A03;

    @Comparable(type = JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET)
    public BUD A04;

    @Comparable(type = JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET)
    public C27818COh A05;

    @Override // X.AbstractC50922Vo
    public final void A01(C125975mo c125975mo) {
        Object[] objArr = c125975mo.A01;
        int i = c125975mo.A00;
        if (i != 0) {
            if (i == 1) {
                this.A01 = (C136326Fl) objArr[0];
            }
        } else {
            BUI bui = this.A03;
            Object obj = objArr[0];
            if (bui != null) {
                synchronized (bui) {
                    bui.A00.add(obj);
                }
            }
            this.A03 = bui;
        }
    }
}
