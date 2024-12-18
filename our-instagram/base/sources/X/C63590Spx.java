package X;

import java.util.ArrayList;

/* renamed from: X.Spx, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63590Spx implements C02N {
    public final /* synthetic */ String A00;

    public C63590Spx(String str) {
        this.A00 = str;
    }

    @Override // X.C02N
    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        synchronized (SV1.A02) {
            C005001p c005001p = SV1.A01;
            String str = this.A00;
            ArrayList arrayList = (ArrayList) c005001p.get(str);
            if (arrayList == null) {
                return;
            }
            c005001p.remove(str);
            for (int i = 0; i < arrayList.size(); i++) {
                ((C02N) arrayList.get(i)).accept(obj);
            }
        }
    }
}
