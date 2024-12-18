package X;

import com.instagram.direct.inbox.notes.models.NoteAudience;

/* renamed from: X.KQl, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45830KQl extends LZ1 {
    public final NoteAudience A00;
    public final boolean A01;

    public C45830KQl(NoteAudience noteAudience, boolean z) {
        C14360o3.A0B(noteAudience, 1);
        this.A00 = noteAudience;
        this.A01 = z;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C45830KQl) {
                C45830KQl c45830KQl = (C45830KQl) obj;
                if (this.A00 != c45830KQl.A00 || this.A01 != c45830KQl.A01) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC66482zP
    public final /* bridge */ /* synthetic */ Object getKey() {
        return this.A00.toString();
    }

    public final int hashCode() {
        return AbstractC166987dD.A0K(this.A01, AbstractC166987dD.A0G(this.A00));
    }

    @Override // X.InterfaceC66492zQ
    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        LZ1 lz1 = (LZ1) obj;
        if (lz1 instanceof C45830KQl) {
            C45830KQl c45830KQl = (C45830KQl) lz1;
            if (this.A00 == c45830KQl.A00 && this.A01 == c45830KQl.A01) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("AudienceViewModel(audience=");
        A1C.append(this.A00);
        A1C.append(MSV.A00(22));
        return AbstractC25236BEt.A0a(A1C, this.A01);
    }
}
