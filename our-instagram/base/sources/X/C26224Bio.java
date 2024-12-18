package X;

import com.instagram.opal.impl.data.OpalAudienceSelectorRepository;

/* renamed from: X.Bio, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26224Bio extends C0T6 implements InterfaceC30950Dj7 {
    public final OpalAudienceSelectorRepository.OpalAudience A00;

    public C26224Bio(OpalAudienceSelectorRepository.OpalAudience opalAudience) {
        C14360o3.A0B(opalAudience, 1);
        this.A00 = opalAudience;
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof C26224Bio) && C14360o3.A0K(this.A00, ((C26224Bio) obj).A00));
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    @Override // X.InterfaceC30950Dj7
    public final String getId() {
        return this.A00.A01;
    }
}
