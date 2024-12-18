package X;

import java.util.List;

/* renamed from: X.12M, reason: invalid class name */
/* loaded from: classes.dex */
public class C12M implements C12N {
    public final InterfaceC14020nS A00;
    public final InterfaceC09390do A01;
    public final InterfaceC09390do A02;
    public final C12T A03;
    public final C12T A04;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C12M(InterfaceC14020nS interfaceC14020nS) {
        this(interfaceC14020nS, AnonymousClass131.A00, new C12T());
        C12T c12t = C12P.A00;
    }

    @Override // X.C12N
    public final C14090nZ AOT(int i, int i2) {
        Object value;
        InterfaceC14020nS interfaceC14020nS = this.A00;
        if (interfaceC14020nS instanceof C18400vR) {
            List list = ((C18400vR) interfaceC14020nS).A00;
            int i3 = i2 - 1;
            if (i3 >= 0 && i3 < list.size()) {
                value = list.get(i3);
            } else {
                value = (C12T) AbstractC001800i.A0K(list);
            }
        } else {
            value = this.A01.getValue();
        }
        return new C14090nZ((C12T) value, i, i2);
    }

    @Override // X.C12N
    public final C14090nZ CPG(int i, int i2) {
        C12T c12t;
        InterfaceC14020nS interfaceC14020nS = this.A00;
        if (interfaceC14020nS instanceof C18400vR) {
            c12t = ((C18400vR) interfaceC14020nS).A01;
        } else {
            c12t = (C12T) this.A02.getValue();
        }
        return new C14090nZ(c12t, i, i2);
    }

    public C12M(InterfaceC14020nS interfaceC14020nS, C12T c12t, C12T c12t2) {
        this.A00 = interfaceC14020nS;
        this.A04 = c12t;
        this.A03 = c12t2;
        this.A01 = AbstractC09440dt.A01(new C206879Ds(this, 46));
        this.A02 = AbstractC09440dt.A01(new C206879Ds(this, 47));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    @kotlin.Deprecated(message = "Use IgDispatchers instead", replaceWith = @kotlin.ReplaceWith(expression = "IgDispatchers", imports = {}))
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C12M() {
        /*
            r3 = this;
            X.0nS r2 = X.C14120nc.A00()
            X.C14360o3.A07(r2)
            X.12T r0 = X.C12P.A00
            X.137 r1 = X.AnonymousClass131.A00
            X.138 r0 = new X.138
            r0.<init>()
            r3.<init>(r2, r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C12M.<init>():void");
    }
}
