package X;

import android.content.Context;
import java.util.List;

/* loaded from: classes12.dex */
public final class XVP extends XVQ implements YRI {
    public final Context A00;

    @Override // X.YOo
    public final /* bridge */ /* synthetic */ C72720Xls ASq() {
        C72720Xls BHn = ((XVJ) this).A00.BHn();
        BHn.A00.add(this.A00);
        BHn.A01.add(this);
        return BHn;
    }

    @Override // X.YOo
    public final void ATk(Object obj) {
        C72720Xls c72720Xls = (C72720Xls) obj;
        List list = c72720Xls.A01;
        C18C.A0F(AbstractC166987dD.A1b(list));
        list.remove(AbstractC25226BEj.A05(list));
        List list2 = c72720Xls.A00;
        C18C.A0F(AbstractC166987dD.A1b(list2));
        list2.remove(AbstractC25226BEj.A05(list2));
    }

    public XVP(Context context, YB7 yb7) {
        super(yb7);
        this.A00 = context;
    }
}
