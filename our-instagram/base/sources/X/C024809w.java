package X;

import java.util.Map;

/* renamed from: X.09w, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C024809w extends C0YY implements InterfaceC16660sJ {
    public final /* synthetic */ AbstractC17010st A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C024809w(AbstractC17010st abstractC17010st) {
        super(1);
        this.A00 = abstractC17010st;
    }

    @Override // X.InterfaceC16660sJ
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        String valueOf;
        String valueOf2;
        Map.Entry entry = (Map.Entry) obj;
        C14360o3.A0B(entry, 0);
        AbstractC17010st abstractC17010st = this.A00;
        Object key = entry.getKey();
        if (key == abstractC17010st) {
            valueOf = "(this Map)";
        } else {
            valueOf = String.valueOf(key);
        }
        Object value = entry.getValue();
        if (value == abstractC17010st) {
            valueOf2 = "(this Map)";
        } else {
            valueOf2 = String.valueOf(value);
        }
        return AnonymousClass001.A0T(valueOf, valueOf2, '=');
    }
}
