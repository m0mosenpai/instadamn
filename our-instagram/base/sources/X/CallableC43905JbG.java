package X;

import java.util.concurrent.Callable;

/* renamed from: X.JbG, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class CallableC43905JbG implements Callable {
    public final int A00;
    public final Object A01;
    public final String A02;

    public CallableC43905JbG(String str, Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = str;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        AbstractC29601bb abstractC29601bb;
        InterfaceC37561ot acquire;
        C1YP c1yp;
        C0eB A14;
        int i = this.A00;
        Object obj = this.A01;
        try {
            try {
                if (i != 0) {
                    C47915LEj c47915LEj = (C47915LEj) obj;
                    abstractC29601bb = c47915LEj.A03;
                    acquire = abstractC29601bb.acquire();
                    acquire.ADp(1, this.A02);
                    c1yp = c47915LEj.A01;
                    c1yp.beginTransaction();
                    A14 = AbstractC43593JPy.A14(c1yp, acquire);
                } else {
                    C43612JQv c43612JQv = (C43612JQv) obj;
                    abstractC29601bb = c43612JQv.A02;
                    acquire = abstractC29601bb.acquire();
                    acquire.ADp(1, this.A02);
                    c1yp = c43612JQv.A01;
                    c1yp.beginTransaction();
                    A14 = AbstractC43593JPy.A14(c1yp, acquire);
                }
                return A14;
            } finally {
                c1yp.endTransaction();
            }
        } finally {
            abstractC29601bb.release(acquire);
        }
    }
}
