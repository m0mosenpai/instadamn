package X;

import java.util.Map;

/* renamed from: X.Gqi, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38177Gqi implements InterfaceC28041Xi {
    public String A00 = AbstractC167017dG.A0j();
    public final Map A01 = AbstractC166987dD.A1I();

    @Override // X.InterfaceC28041Xi
    public final /* bridge */ /* synthetic */ boolean apply(Object obj) {
        java.util.Set set;
        return obj == null || ((set = (java.util.Set) this.A01.get(this.A00)) != null && set.contains(obj));
    }
}
