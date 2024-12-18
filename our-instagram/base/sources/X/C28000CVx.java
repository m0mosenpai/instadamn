package X;

import java.util.List;

/* renamed from: X.CVx, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C28000CVx {
    public List A00;
    public final CVI A01;
    public final InterfaceC16660sJ A02;
    public final Object[] A03;

    public final AbstractC51432Xq A00(C27862CPz c27862CPz) {
        Object[] objArr;
        List list;
        AbstractC51432Xq abstractC51432Xq = null;
        abstractC51432Xq = null;
        if (c27862CPz != null) {
            objArr = c27862CPz.A01;
        } else {
            objArr = null;
        }
        if (!AbstractC78713fd.A02(objArr, this.A03)) {
            CQ0 cq0 = new CQ0(c27862CPz != null ? c27862CPz.A00 : null);
            abstractC51432Xq = (AbstractC51432Xq) this.A02.invoke(cq0);
            if (abstractC51432Xq != null) {
                AbstractC89913zX.A02(abstractC51432Xq, this.A01.A00);
            }
            if (this.A00 == null) {
                list = cq0.A00;
                if (list == null) {
                    list = C16930sl.A00;
                }
            }
            return abstractC51432Xq;
        }
        if (c27862CPz != null) {
            list = c27862CPz.A00;
        } else {
            list = null;
        }
        this.A00 = list;
        return abstractC51432Xq;
    }

    public final C27862CPz A02() {
        return new C27862CPz(this.A00, this.A03);
    }

    public C28000CVx(CVI cvi, InterfaceC16660sJ interfaceC16660sJ, Object[] objArr) {
        this.A01 = cvi;
        this.A03 = objArr;
        this.A02 = interfaceC16660sJ;
    }

    public final CVI A01() {
        return this.A01;
    }
}
