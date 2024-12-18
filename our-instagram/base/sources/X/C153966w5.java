package X;

import java.util.UUID;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: X.6w5, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C153966w5 implements InterfaceC66482zP {
    public final long A00;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C153966w5() {
        /*
            r4 = this;
            r2 = 0
            r1 = 1
            r0 = 0
            r4.<init>(r0, r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C153966w5.<init>():void");
    }

    @Override // X.InterfaceC66482zP
    public final /* bridge */ /* synthetic */ Object getKey() {
        return String.valueOf(this.A00);
    }

    public /* synthetic */ C153966w5(DefaultConstructorMarker defaultConstructorMarker, int i, long j) {
        this.A00 = UUID.randomUUID().getMostSignificantBits();
    }

    @Override // X.InterfaceC66492zQ
    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        return false;
    }
}
