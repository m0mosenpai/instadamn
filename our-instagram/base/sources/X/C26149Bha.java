package X;

import com.instagram.api.schemas.ThreadHeaderStyle;

/* renamed from: X.Bha, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26149Bha extends C0T6 implements InterfaceC132245y2 {
    public final int A00;
    public final ThreadHeaderStyle A01;
    public final C132175xv A02;
    public final String A03;
    public final C26036BfP A04;
    public final String A05;

    @Override // X.InterfaceC132245y2
    public final /* synthetic */ C51758Mth CGR() {
        return AbstractC132295y8.A00();
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C26149Bha) {
                C26149Bha c26149Bha = (C26149Bha) obj;
                if (!C14360o3.A0K(this.A02, c26149Bha.A02) || !C14360o3.A0K(this.A04, c26149Bha.A04) || !C14360o3.A0K(this.A03, c26149Bha.A03) || this.A01 != c26149Bha.A01 || this.A00 != c26149Bha.A00) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((AbstractC166997dE.A0K(this.A03, AbstractC166997dE.A0J(this.A04, AbstractC166987dD.A0G(this.A02))) + AbstractC167017dG.A0M(this.A01)) * 31) + this.A00;
    }

    public C26149Bha(ThreadHeaderStyle threadHeaderStyle, C132175xv c132175xv, C26036BfP c26036BfP, String str, int i) {
        this.A02 = c132175xv;
        this.A04 = c26036BfP;
        this.A03 = str;
        this.A01 = threadHeaderStyle;
        this.A00 = i;
        this.A05 = AnonymousClass001.A0c("threadHeader_", str, i);
    }

    @Override // X.InterfaceC132245y2
    public final String BKd() {
        return this.A05;
    }

    @Override // X.InterfaceC132245y2
    public final C132175xv Bet() {
        return this.A02;
    }
}
