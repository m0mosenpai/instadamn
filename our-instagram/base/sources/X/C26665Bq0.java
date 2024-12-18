package X;

import android.text.InputFilter;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.litho.annotations.Comparable;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.Bq0, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26665Bq0 extends AbstractC50922Vo {

    @Comparable(type = JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET)
    public Integer A00;

    @Comparable(type = JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET)
    public AtomicReference A01;

    @Comparable(type = JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET)
    public AtomicReference A02;

    @Override // X.AbstractC50922Vo
    public final void A01(C125975mo c125975mo) {
        if (c125975mo.A00 == 0) {
            Integer num = this.A00;
            InputFilter[] inputFilterArr = COG.A09;
            this.A00 = Integer.valueOf(num.intValue() + 1);
        }
    }
}
