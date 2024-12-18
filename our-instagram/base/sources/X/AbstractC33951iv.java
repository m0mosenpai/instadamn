package X;

import com.instagram.model.direct.DirectThreadKey;

/* renamed from: X.1iv, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC33951iv extends AbstractC29011ae implements InterfaceC29171au {
    public int A00;
    public C7Q4 A01;
    public DirectThreadKey A02;
    public String A03;
    public String A04;

    public final DirectThreadKey A07() {
        DirectThreadKey directThreadKey = this.A02;
        if (directThreadKey != null) {
            return directThreadKey;
        }
        C14360o3.A0F("key");
        throw C00O.createAndThrow();
    }

    @Override // X.InterfaceC29021af
    public final C2EY Ar9() {
        return C2EY.A0z;
    }

    @Override // X.InterfaceC29171au
    public final DirectThreadKey C7Q() {
        return A07();
    }
}
