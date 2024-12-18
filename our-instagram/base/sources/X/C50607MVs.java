package X;

import java.util.ArrayList;

/* renamed from: X.MVs, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50607MVs implements C1EH {
    public static final C50607MVs A00 = new C50607MVs();

    @Override // X.C1EH
    public final /* bridge */ /* synthetic */ Object invoke(C16L c16l) {
        ArrayList A12 = AbstractC166997dE.A12(c16l, 0);
        if (c16l.A11() == C16R.A0C) {
            while (c16l.A1J() != C16R.A08) {
                XBS parseFromJson = AbstractC70181WFj.parseFromJson(c16l);
                if (parseFromJson != null) {
                    A12.add(parseFromJson);
                }
            }
        }
        return A12;
    }
}
