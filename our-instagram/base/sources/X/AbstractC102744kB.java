package X;

import java.io.IOException;

/* renamed from: X.4kB, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC102744kB {
    /* JADX WARN: Type inference failed for: r2v0, types: [X.4lJ, java.lang.Object] */
    public static final C103434lJ A00(C16L c16l) {
        long currentMonotonicTimestamp = C006802i.A0p.currentMonotonicTimestamp();
        C102794kG A00 = AbstractC102784kF.A00(null, new C102754kC(c16l));
        C14360o3.A07(A00);
        C102824kJ c102824kJ = A00.A00;
        if (c102824kJ != null) {
            ?? obj = new Object();
            long currentMonotonicTimestamp2 = C006802i.A0p.currentMonotonicTimestamp();
            obj.A02 = c102824kJ;
            obj.A01 = currentMonotonicTimestamp;
            obj.A00 = currentMonotonicTimestamp2;
            return obj;
        }
        throw new IOException(AbstractC58317Pt9.A00(783));
    }

    public static final void A02(AnonymousClass182 anonymousClass182, C103434lJ c103434lJ) {
        if (c103434lJ instanceof C58590PyH) {
            C58590PyH.A01.A01(anonymousClass182, ((C58590PyH) c103434lJ).A00);
        } else {
            C0w9.A03("bloks_serialize", "BloksDataAdapter does not support serialization. Use SerializableBloksAdapter instead");
        }
    }

    public static final C103434lJ A01(String str) {
        try {
            if (C11T.A08()) {
                C0w9.A01(EnumC12410kj.A0A, "BloksDataAdapter", "BloksDataAdapter is being parsed on the UI thread, move this to a background thread");
            }
            return A00(C16V.A00(str));
        } catch (IOException e) {
            C0w9.A01(EnumC12410kj.A0A, "BloksDataAdapter.fromPayloadString", AnonymousClass001.A0R("failed to parse bloks payload ", e.getMessage()));
            return null;
        }
    }
}
