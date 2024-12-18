package X;

import com.google.gson.Gson;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/* renamed from: X.Pxx, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C58579Pxx {
    public C47602Gl A04 = C47602Gl.A02;
    public EnumC47622Gn A01 = EnumC47622Gn.A00;
    public InterfaceC47542Gf A00 = EnumC47532Ge.A00;
    public final Map A0B = AbstractC166987dD.A1G();
    public final List A09 = AbstractC166987dD.A1E();
    public final List A0A = AbstractC166987dD.A1E();
    public boolean A07 = false;
    public boolean A05 = true;
    public boolean A06 = false;
    public InterfaceC47572Gi A03 = Gson.A0I;
    public InterfaceC47572Gi A02 = Gson.A0H;
    public final LinkedList A08 = AbstractC58318PtA.A11();

    public final Gson A00() {
        List list = this.A09;
        int size = list.size();
        List list2 = this.A0A;
        ArrayList A17 = AbstractC25225BEi.A17(size + list2.size() + 3);
        A17.addAll(list);
        Collections.reverse(A17);
        ArrayList A1F = AbstractC166987dD.A1F(list2);
        Collections.reverse(A1F);
        A17.addAll(A1F);
        InterfaceC47572Gi interfaceC47572Gi = Gson.A0I;
        C47602Gl c47602Gl = this.A04;
        InterfaceC47542Gf interfaceC47542Gf = this.A00;
        HashMap A10 = AbstractC58318PtA.A10(this.A0B);
        boolean z = this.A07;
        boolean z2 = this.A05;
        boolean z3 = this.A06;
        return new Gson(interfaceC47542Gf, this.A01, this.A03, this.A02, c47602Gl, new ArrayList(list), new ArrayList(list2), A17, AbstractC166987dD.A1F(this.A08), A10, z, z2, z3);
    }

    public final void A01(InterfaceC47612Gm interfaceC47612Gm) {
        this.A09.add(interfaceC47612Gm);
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x000b, code lost:
    
        if ((r6 instanceof com.google.gson.TypeAdapter) != false) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A02(java.lang.Object r6, java.lang.reflect.Type r7) {
        /*
            r5 = this;
            boolean r2 = r6 instanceof X.InterfaceC65441TkD
            if (r2 != 0) goto Ld
            boolean r0 = r6 instanceof X.InterfaceC65440TkC
            if (r0 != 0) goto Ld
            boolean r1 = r6 instanceof com.google.gson.TypeAdapter
            r0 = 0
            if (r1 == 0) goto Le
        Ld:
            r0 = 1
        Le:
            X.C2I6.A00(r0)
            if (r2 != 0) goto L17
            boolean r0 = r6 instanceof X.InterfaceC65440TkC
            if (r0 == 0) goto L2f
        L17:
            com.google.gson.reflect.TypeToken r4 = new com.google.gson.reflect.TypeToken
            r4.<init>(r7)
            java.util.List r3 = r5.A09
            java.lang.reflect.Type r1 = r4.type
            java.lang.Class r0 = r4.rawType
            boolean r2 = X.AbstractC167007dF.A1X(r1, r0)
            r1 = 0
            X.Pxw r0 = new X.Pxw
            r0.<init>(r4, r1, r6, r2)
            r3.add(r0)
        L2f:
            boolean r0 = r6 instanceof com.google.gson.TypeAdapter
            if (r0 == 0) goto L44
            com.google.gson.reflect.TypeToken r0 = new com.google.gson.reflect.TypeToken
            r0.<init>(r7)
            com.google.gson.TypeAdapter r6 = (com.google.gson.TypeAdapter) r6
            X.TEG r1 = new X.TEG
            r1.<init>(r6, r0)
            java.util.List r0 = r5.A09
            r0.add(r1)
        L44:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C58579Pxx.A02(java.lang.Object, java.lang.reflect.Type):void");
    }
}
