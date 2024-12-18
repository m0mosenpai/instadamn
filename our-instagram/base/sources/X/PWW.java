package X;

import androidx.paging.AsyncPagingDataDiffer$differBase$1;
import com.instagram.pendingmedia.service.impl.ShareStoryTemplateHelper;

/* loaded from: classes9.dex */
public final class PWW extends C1Dq {
    public int A00;
    public int A01;
    public Object A02;
    public Object A03;
    public Object A04;
    public Object A05;
    public Object A06;
    public final int A07;
    public final Object A08;

    @Override // X.C1Dr
    public final Object invokeSuspend(Object obj) {
        int i = this.A07;
        this.A06 = obj;
        this.A01 |= Integer.MIN_VALUE;
        if (i != 0) {
            return ((ShareStoryTemplateHelper) this.A08).A00(null, this);
        }
        return ((AsyncPagingDataDiffer$differBase$1) this.A08).A01(null, null, this, null, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PWW(Object obj, InterfaceC23621Ds interfaceC23621Ds, int i) {
        super(interfaceC23621Ds);
        this.A07 = i;
        this.A08 = obj;
    }
}
