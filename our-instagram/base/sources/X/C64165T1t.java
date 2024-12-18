package X;

import java.util.Map;

/* renamed from: X.T1t, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C64165T1t implements InterfaceC65373Tj5 {
    public final Map A00;

    @Override // X.InterfaceC65373Tj5
    public final CharSequence AXO(String str) {
        return (CharSequence) this.A00.get(str);
    }

    public C64165T1t(Map map) {
        this.A00 = map;
    }
}
