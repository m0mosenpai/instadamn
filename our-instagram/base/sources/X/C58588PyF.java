package X;

import java.io.IOException;
import java.util.Iterator;
import java.util.Stack;

/* renamed from: X.PyF, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C58588PyF implements InterfaceC102764kD {
    public Integer A00;
    public Object A01;
    public String A02;
    public final Stack A03;
    public final Stack A04;
    public final C16L A05;
    public final C58589PyG A06;

    /* JADX WARN: Type inference failed for: r0v1, types: [X.PyG, java.lang.Object] */
    public C58588PyF(C16L c16l, Iterator it) {
        C14360o3.A0B(it, 1);
        this.A05 = c16l;
        Stack stack = new Stack();
        this.A04 = stack;
        Stack stack2 = new Stack();
        this.A03 = stack2;
        this.A06 = new Object();
        stack.add(it);
        stack2.add(EnumC58659PzW.A06);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0044 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00f4  */
    @Override // X.InterfaceC102764kD
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Integer Csy() {
        /*
            Method dump skipped, instructions count: 280
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C58588PyF.Csy():java.lang.Integer");
    }

    @Override // X.InterfaceC102764kD
    public final Object Awa() {
        return this.A05;
    }

    @Override // X.InterfaceC102764kD
    public final String E3u() {
        if (this.A02 == null) {
            AbstractC25241Le.A02("bloks_null_name", "Field name should not be null");
        }
        return this.A02;
    }

    @Override // X.InterfaceC102764kD
    public final Integer E3x() {
        Integer num = this.A00;
        if (num != null) {
            return num;
        }
        throw new IOException();
    }

    @Override // X.InterfaceC102764kD
    public final InterfaceC1120053p E3y() {
        C58589PyG c58589PyG = this.A06;
        Object obj = this.A01;
        if (obj != null) {
            c58589PyG.A00 = obj;
            return c58589PyG;
        }
        throw new IOException();
    }

    @Override // X.InterfaceC102764kD
    public final void EmB() {
        Integer E3x = E3x();
        Integer num = C05F.A00;
        if (E3x == num || E3x() == C05F.A0C) {
            int i = 1;
            while (true) {
                Integer Csy = Csy();
                if (Csy != num && Csy != C05F.A0C) {
                    if (Csy == C05F.A01 || Csy == C05F.A0N) {
                        i--;
                    }
                } else {
                    i++;
                }
                if (i == 0) {
                    return;
                }
            }
        }
    }
}
