package X;

import com.facebook.common.dextricks.DexOptimization;

/* renamed from: X.KeC, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public enum EnumC46280KeC implements InterfaceC02530Ab {
    SERVER("server"),
    CLIENT(DexOptimization.OPT_KEY_CLIENT),
    /* JADX INFO: Fake field, exist only in values array */
    METAGEN("metagen");

    public final String A00;

    @Override // X.InterfaceC02530Ab
    public final /* bridge */ /* synthetic */ Object getValue() {
        return this.A00;
    }

    EnumC46280KeC(String str) {
        this.A00 = str;
    }
}
