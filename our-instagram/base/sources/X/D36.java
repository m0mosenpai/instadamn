package X;

import java.util.List;

/* loaded from: classes5.dex */
public final /* synthetic */ class D36 implements InterfaceC14180ni, InterfaceC30934Dio {
    public final /* synthetic */ C25814BbV A00;

    public D36(C25814BbV c25814BbV) {
        this.A00 = c25814BbV;
    }

    @Override // X.InterfaceC30934Dio
    public final void EpL(C45127Jxw c45127Jxw, C167297di c167297di, String str, List list, boolean z) {
        AbstractC167017dG.A1N(str, c167297di);
        C14360o3.A0B(c45127Jxw, 4);
        C25814BbV.A04(c45127Jxw, c167297di, this.A00, str, list, z);
    }

    @Override // X.InterfaceC14180ni
    public final InterfaceC09250da getFunctionDelegate() {
        return new C03E(5, this.A00, C25814BbV.class, "onCommentPostedSuccessfully", "onCommentPostedSuccessfully(Ljava/lang/String;Lcom/instagram/comments/mvvm/data/model/CommentListRowModel$CommentRowModel;ZLjava/util/List;Lcom/instagram/comments/mvvm/data/model/CommentPostedSuccessUiModel;)V", 0);
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof InterfaceC30934Dio) || !(obj instanceof InterfaceC14180ni)) {
            return false;
        }
        return AbstractC167007dF.A1Y(obj, getFunctionDelegate());
    }
}
