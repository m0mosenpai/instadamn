package X;

import android.content.Context;
import java.util.HashSet;

/* loaded from: classes11.dex */
public final class W39 {
    public static final HashSet A0A;
    public static final HashSet A0B;
    public static final HashSet A0C;
    public final Context A00;
    public final Throwable A09;
    public final InterfaceC09390do A01 = AbstractC09440dt.A01(new X2w(this, 20));
    public final InterfaceC09390do A08 = AbstractC09440dt.A01(new X2w(this, 27));
    public final InterfaceC09390do A07 = AbstractC09440dt.A01(new X2w(this, 26));
    public final InterfaceC09390do A03 = AbstractC09440dt.A01(new X2w(this, 22));
    public final InterfaceC09390do A02 = AbstractC09440dt.A01(new X2w(this, 21));
    public final InterfaceC09390do A05 = AbstractC09440dt.A01(new X2w(this, 24));
    public final InterfaceC09390do A06 = AbstractC09440dt.A01(new X2w(this, 25));
    public final InterfaceC09390do A04 = AbstractC09440dt.A01(new X2w(this, 23));

    static {
        HashSet hashSet = new HashSet();
        AbstractC166997dE.A1W(hashSet, 5202);
        AbstractC166997dE.A1W(hashSet, 3088003);
        AbstractC166997dE.A1W(hashSet, 3088004);
        A0B = hashSet;
        HashSet hashSet2 = new HashSet();
        AbstractC166997dE.A1W(hashSet2, 5204);
        AbstractC166997dE.A1W(hashSet2, 3088002);
        AbstractC166997dE.A1W(hashSet2, 3088006);
        A0A = hashSet2;
        HashSet hashSet3 = new HashSet();
        hashSet3.addAll(hashSet);
        hashSet3.addAll(hashSet2);
        A0C = hashSet3;
    }

    public W39(Context context, Throwable th) {
        this.A00 = context;
        this.A09 = th;
    }
}
