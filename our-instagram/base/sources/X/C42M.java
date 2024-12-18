package X;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.42M, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C42M implements C42N {
    public final ArrayList A00 = new ArrayList();
    public final /* synthetic */ C51482Xv A01;

    public C42M(C51482Xv c51482Xv) {
        this.A01 = c51482Xv;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00da  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void A00(X.C42M r15, X.AbstractC107474ss r16) {
        /*
            Method dump skipped, instructions count: 412
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C42M.A00(X.42M, X.4ss):void");
    }

    private void A01(AbstractC107474ss abstractC107474ss) {
        ArrayList arrayList = this.A00;
        abstractC107474ss.A0A(arrayList);
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            C107444sp c107444sp = (C107444sp) arrayList.get(i);
            C42R c42r = (C42R) this.A01.A02.A02.get(c107444sp.A01.A00);
            if (c42r != null) {
                C107424sn c107424sn = (C107424sn) c42r.A07.get(c107444sp.A01.A01);
                c107424sn.A04 = Float.valueOf(c107444sp.A00);
                c107424sn.A02 = abstractC107474ss;
            }
        }
        arrayList.clear();
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [X.CAJ, java.lang.Object] */
    @Override // X.C42N
    public final void DH4(AbstractC107474ss abstractC107474ss) {
        C51482Xv c51482Xv = this.A01;
        List<C107434so> list = (List) c51482Xv.A0A.get(abstractC107474ss);
        if (list != null && c51482Xv.A06 != null) {
            for (C107434so c107434so : list) {
                C2VA c2va = (C2VA) abstractC107474ss.A00;
                if (c2va != null) {
                    InterfaceC79483gv interfaceC79483gv = c107434so.A01;
                    ?? obj = new Object();
                    obj.A00 = interfaceC79483gv;
                    c2va.call(obj);
                }
            }
        }
        A00(this, abstractC107474ss);
    }

    @Override // X.C42N
    public final boolean Ejs(AbstractC107474ss abstractC107474ss) {
        C107424sn c107424sn;
        Float f;
        ArrayList arrayList = this.A00;
        abstractC107474ss.A0A(arrayList);
        int size = arrayList.size();
        boolean z = true;
        for (int i = 0; i < size; i++) {
            C107444sp c107444sp = (C107444sp) arrayList.get(i);
            C42R c42r = (C42R) this.A01.A02.A02.get(c107444sp.A01.A00);
            if (c42r == null || (c107424sn = (C107424sn) c42r.A07.get(c107444sp.A01.A01)) == null || (z && (f = c107424sn.A03) != null && f.floatValue() != c107444sp.A00)) {
                z = false;
            }
        }
        arrayList.clear();
        return z;
    }

    @Override // X.C42N
    public final void E24(AbstractC107474ss abstractC107474ss) {
        A01(abstractC107474ss);
        C51482Xv c51482Xv = this.A01;
        String str = (String) AbstractC005201r.A00(c51482Xv.A01, abstractC107474ss.hashCode());
        if (!TextUtils.isEmpty(str)) {
            c51482Xv.A07.ADN(str, abstractC107474ss.hashCode());
        }
    }

    @Override // X.C42N
    public final void D1y(AbstractC107474ss abstractC107474ss) {
        A00(this, abstractC107474ss);
    }

    @Override // X.C42N
    public final void DiR(AbstractC107474ss abstractC107474ss) {
        A01(abstractC107474ss);
    }
}
