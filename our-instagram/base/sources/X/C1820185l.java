package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.85l, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1820185l implements InterfaceC1820085k {
    public final EnumC27091Ti A00;
    public final List A01;
    public final AbstractC12990ll A02;
    public volatile MTD A03;

    public C1820185l(AbstractC12990ll abstractC12990ll, EnumC27091Ti enumC27091Ti) {
        C14360o3.A0B(abstractC12990ll, 2);
        this.A00 = enumC27091Ti;
        this.A02 = abstractC12990ll;
        this.A01 = new ArrayList();
    }

    @Override // X.InterfaceC1820085k
    public final synchronized void Chc(InterfaceC1819985j interfaceC1819985j) {
        this.A01.add(interfaceC1819985j);
        if (this.A03 == null) {
            MTC mtc = new MTC(this.A00);
            mtc.A03 = C05F.A01;
            mtc.A02 = new InterfaceC191378do() { // from class: X.85n
                @Override // X.InterfaceC191378do
                public final void onFailure(String str, boolean z) {
                    C1820185l c1820185l = C1820185l.this;
                    synchronized (c1820185l) {
                        c1820185l.A03 = null;
                        List list = c1820185l.A01;
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            ((InterfaceC1819985j) it.next()).DG7(z, new RuntimeException(AnonymousClass001.A0R("Module download failed for ", c1820185l.A00.A00)));
                        }
                        list.clear();
                    }
                }

                @Override // X.InterfaceC191378do
                public final void onSuccess() {
                    C1820185l c1820185l = C1820185l.this;
                    synchronized (c1820185l) {
                        c1820185l.A03 = null;
                        List list = c1820185l.A01;
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            ((InterfaceC1819985j) it.next()).onSuccess(new Object());
                        }
                        list.clear();
                    }
                }
            };
            MTD mtd = new MTD(mtc);
            this.A03 = mtd;
            C1RQ.A00().A03(this.A02, mtd);
        }
    }

    /* JADX WARN: Type inference failed for: r0v8, types: [X.80B, java.lang.Object] */
    @Override // X.InterfaceC1820085k
    public final C80B ASl() {
        C1RQ A00 = C1RQ.A00();
        EnumC27091Ti enumC27091Ti = this.A00;
        if (A00.A05(enumC27091Ti)) {
            MTC mtc = new MTC(enumC27091Ti);
            mtc.A03 = C05F.A01;
            MTD mtd = new MTD(mtc);
            C1RQ A002 = C1RQ.A00();
            AbstractC12990ll abstractC12990ll = this.A02;
            A002.A03(abstractC12990ll, mtd);
            C1RQ.A00().A04(abstractC12990ll, mtd);
            return new Object();
        }
        throw new RuntimeException(AnonymousClass001.A0R("Library loading failed for: ", enumC27091Ti.A00));
    }
}
