package X;

import java.util.List;

/* renamed from: X.BLs, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C25401BLs implements InterfaceC51122Wi {
    public final /* synthetic */ C26282Bjp A00;
    public final /* synthetic */ C2XI A01;
    public final /* synthetic */ C25400BLr A02;

    public C25401BLs(C26282Bjp c26282Bjp, C2XI c2xi, C25400BLr c25400BLr) {
        this.A00 = c26282Bjp;
        this.A02 = c25400BLr;
        this.A01 = c2xi;
    }

    @Override // X.InterfaceC51122Wi
    public final void DyX(C2XI c2xi) {
        Object obj;
        C26282Bjp c26282Bjp = this.A00;
        C25400BLr c25400BLr = this.A02;
        int A0B = AbstractC25230BEn.A0B(this.A01);
        List list = c25400BLr.A00.A0J;
        if (list != null) {
            obj = AbstractC001800i.A0O(list, A0B);
        } else {
            obj = null;
        }
        c26282Bjp.A00(obj);
    }
}
