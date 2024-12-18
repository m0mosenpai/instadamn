package X;

import com.instagram.direct.inbox.notes.models.NoteAudienceItem;
import com.instagram.user.model.User;

/* renamed from: X.Jzw, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45216Jzw extends C0T6 implements InterfaceC66482zP {
    public final long A00;
    public final NoteAudienceItem A01;
    public final User A02;
    public final String A03;
    public final String A04;
    public final boolean A05;
    public final boolean A06;
    public final boolean A07;
    public final boolean A08;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C45216Jzw) {
                C45216Jzw c45216Jzw = (C45216Jzw) obj;
                if (!C14360o3.A0K(this.A03, c45216Jzw.A03) || this.A00 != c45216Jzw.A00 || !C14360o3.A0K(this.A02, c45216Jzw.A02) || !C14360o3.A0K(this.A01, c45216Jzw.A01) || this.A06 != c45216Jzw.A06 || this.A05 != c45216Jzw.A05 || !C14360o3.A0K(this.A04, c45216Jzw.A04) || this.A07 != c45216Jzw.A07 || this.A08 != c45216Jzw.A08) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC66482zP
    public final /* bridge */ /* synthetic */ Object getKey() {
        return String.valueOf(this.A00);
    }

    public final int hashCode() {
        return AbstractC166987dD.A0K(this.A08, AbstractC167007dF.A0D(this.A07, AbstractC166997dE.A0K(this.A04, AbstractC167007dF.A0D(this.A05, AbstractC167007dF.A0D(this.A06, AbstractC166997dE.A0J(this.A01, AbstractC25236BEt.A05(this.A02, AbstractC25236BEt.A01(this.A00, AbstractC166987dD.A0J(this.A03))) * 31))))));
    }

    @Override // X.InterfaceC66492zQ
    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        C45216Jzw c45216Jzw = (C45216Jzw) obj;
        if (c45216Jzw == null || this.A00 != c45216Jzw.A00) {
            return false;
        }
        return true;
    }

    public C45216Jzw(NoteAudienceItem noteAudienceItem, User user, String str, String str2, long j, boolean z, boolean z2, boolean z3, boolean z4) {
        AbstractC167017dG.A1Q(str, user);
        C14360o3.A0B(str2, 8);
        this.A03 = str;
        this.A00 = j;
        this.A02 = user;
        this.A01 = noteAudienceItem;
        this.A06 = z;
        this.A05 = z2;
        this.A04 = str2;
        this.A07 = z3;
        this.A08 = z4;
    }
}
