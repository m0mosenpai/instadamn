package X;

import com.instagram.api.schemas.DayOfTheWeek;

/* renamed from: X.JAk, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C43265JAk extends C0YY implements InterfaceC16660sJ {
    public static final C43265JAk A00 = new C43265JAk();

    public C43265JAk() {
        super(1);
    }

    @Override // X.InterfaceC16660sJ
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        C14360o3.A0B(obj, 0);
        Object obj2 = DayOfTheWeek.A01.get(obj);
        if (obj2 == null) {
            return DayOfTheWeek.A0A;
        }
        return obj2;
    }
}
