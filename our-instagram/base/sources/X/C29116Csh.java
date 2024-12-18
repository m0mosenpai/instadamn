package X;

import java.util.List;

/* renamed from: X.Csh, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C29116Csh implements MOF, InterfaceC14180ni {
    public final int A00;
    public final Object A01;

    @Override // X.MOF
    public final void AUn(Integer num, String str, String str2, String str3, String str4, List list, boolean z) {
        AbstractC167017dG.A1P(str, str2);
        C25814BbV.A07((C25814BbV) this.A01, num, str, str2, str3, str4, list, z);
    }

    public C29116Csh(C25814BbV c25814BbV, int i) {
        this.A00 = i;
        this.A01 = c25814BbV;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof MOF) || !(obj instanceof InterfaceC14180ni)) {
            return false;
        }
        return AbstractC167007dF.A1Y(obj, getFunctionDelegate());
    }

    @Override // X.InterfaceC14180ni
    public final InterfaceC09250da getFunctionDelegate() {
        return new C03E(7, this.A01, C25814BbV.class, "onCommentFailedPosting", "onCommentFailedPosting(ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/instagram/feed/media/CommentFailCause;)V", 0);
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }
}
