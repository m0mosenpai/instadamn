package X;

import java.util.List;

/* renamed from: X.0A8, reason: invalid class name */
/* loaded from: classes.dex */
public final class C0A8 extends C0YY implements InterfaceC16660sJ {
    public static final C0A8 A00 = new C0A8();

    public C0A8() {
        super(1);
    }

    @Override // X.InterfaceC16660sJ
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        String str = (String) obj;
        C14360o3.A0B(str, 0);
        List A0R = AbstractC001900j.A0R(str, new String[]{":"}, 0);
        if (A0R.size() == 2) {
            return new C09530e4(A0R.get(0), A0R.get(1));
        }
        return null;
    }
}
