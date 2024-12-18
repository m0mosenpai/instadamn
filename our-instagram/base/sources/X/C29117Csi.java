package X;

import java.util.List;

/* renamed from: X.Csi, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C29117Csi implements InterfaceC30934Dio, InterfaceC14180ni {
    public final int A00;
    public final Object A01;

    public C29117Csi(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // X.InterfaceC30934Dio
    public final void EpL(C45127Jxw c45127Jxw, C167297di c167297di, String str, List list, boolean z) {
        int i = this.A00;
        AbstractC167017dG.A1N(str, c167297di);
        C14360o3.A0B(c45127Jxw, 4);
        switch (i) {
            case 5:
            case 6:
                Jn5.A01(c167297di, (Jn5) this.A01);
                return;
            default:
                C25814BbV.A04(c45127Jxw, c167297di, (C25814BbV) this.A01, str, list, z);
                return;
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof InterfaceC30934Dio) || !(obj instanceof InterfaceC14180ni)) {
            return false;
        }
        return AbstractC167007dF.A1Y(obj, getFunctionDelegate());
    }

    @Override // X.InterfaceC14180ni
    public final InterfaceC09250da getFunctionDelegate() {
        Class cls;
        int i = this.A00;
        Object obj = this.A01;
        switch (i) {
            case 5:
            case 6:
                cls = Jn5.class;
                break;
            default:
                cls = C25814BbV.class;
                break;
        }
        return new C03E(5, obj, cls, "onCommentPostedSuccessfully", "onCommentPostedSuccessfully(Ljava/lang/String;Lcom/instagram/comments/mvvm/data/model/CommentListRowModel$CommentRowModel;ZLjava/util/List;Lcom/instagram/comments/mvvm/data/model/CommentPostedSuccessUiModel;)V", 0);
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }
}
