package X;

import java.util.List;

/* loaded from: classes5.dex */
public final /* synthetic */ class D35 implements InterfaceC14180ni, MOF {
    public final /* synthetic */ C25814BbV A00;

    public D35(C25814BbV c25814BbV) {
        this.A00 = c25814BbV;
    }

    @Override // X.MOF
    public final void AUn(Integer num, String str, String str2, String str3, String str4, List list, boolean z) {
        AbstractC167017dG.A1P(str, str2);
        C25814BbV.A07(this.A00, num, str, str2, str3, str4, list, z);
    }

    @Override // X.InterfaceC14180ni
    public final InterfaceC09250da getFunctionDelegate() {
        return new C03E(7, this.A00, C25814BbV.class, "onCommentFailedPosting", "onCommentFailedPosting(ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/instagram/feed/media/CommentFailCause;)V", 0);
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof MOF) || !(obj instanceof InterfaceC14180ni)) {
            return false;
        }
        return AbstractC167007dF.A1Y(obj, getFunctionDelegate());
    }
}
