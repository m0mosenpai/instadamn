package X;

import android.content.Context;

/* renamed from: X.MdH, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50824MdH extends XN9 {
    public final Context A00;
    public final int A01;

    public C50824MdH(Context context, int i) {
        super(context, "sg_streaming_notification_channel_id");
        this.A00 = context;
        this.A01 = i;
    }

    public static final void A00(C50824MdH c50824MdH) {
        c50824MdH.A04(c50824MdH.A01);
        c50824MdH.A0E(true);
        c50824MdH.A08 = 1;
        c50824MdH.A0A.when = System.currentTimeMillis();
    }
}
