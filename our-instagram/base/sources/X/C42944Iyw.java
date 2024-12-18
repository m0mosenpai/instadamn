package X;

import java.util.Map;

/* renamed from: X.Iyw, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C42944Iyw implements C31N {
    public final Map A00;

    @Override // X.C31N
    public final boolean isEnabled() {
        return true;
    }

    @Override // X.C31N
    public final void FAv(AbstractC39670Hiz abstractC39670Hiz, EnumC39531Hcy enumC39531Hcy) {
        C14360o3.A0K(this.A00.get(enumC39531Hcy), AbstractC166997dE.A0b());
    }

    public C42944Iyw(Map map) {
        this.A00 = map;
    }
}
