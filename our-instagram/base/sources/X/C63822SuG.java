package X;

import java.util.Collections;

/* renamed from: X.SuG, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63822SuG implements InterfaceC65477Tku {
    public static final java.util.Set A01 = Collections.unmodifiableSet(AbstractC58319PtB.A13(new String[]{"http", "https"}));
    public final InterfaceC65477Tku A00;

    @Override // X.InterfaceC65477Tku
    public final /* bridge */ /* synthetic */ boolean CKb(Object obj) {
        return A01.contains(((android.net.Uri) obj).getScheme());
    }

    public C63822SuG(InterfaceC65477Tku interfaceC65477Tku) {
        this.A00 = interfaceC65477Tku;
    }

    @Override // X.InterfaceC65477Tku
    public final /* bridge */ /* synthetic */ SFV AEj(C63729Ssj c63729Ssj, Object obj, int i, int i2) {
        return this.A00.AEj(c63729Ssj, new C63732Ssm(obj.toString()), i, i2);
    }
}
