package X;

/* renamed from: X.KlU, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC46711KlU {
    /* JADX WARN: Type inference failed for: r0v3, types: [X.4hc, java.lang.Object] */
    public static final void A00(C83403nh c83403nh, EnumC101664hb enumC101664hb, long j) {
        C101584hT c101584hT = c83403nh.A0e;
        if (c101584hT != null) {
            int i = 1;
            if (enumC101664hb == EnumC101664hb.A07) {
                i = 2;
            }
            c101584hT.A00 = Math.max(i, c101584hT.A00);
            boolean A1a = AbstractC31175DnJ.A1a(enumC101664hb);
            ?? obj = new Object();
            obj.A01 = j;
            obj.A00 = A1a ? 1 : 0;
            obj.A02 = enumC101664hb;
            c101584hT.A03 = obj;
        }
    }
}
