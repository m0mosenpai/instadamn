package X;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CountDownLatch;

/* renamed from: X.8gv, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C193158gv implements InterfaceC193168gw {
    public String A00;
    public String A01;
    public String A02;
    public C193228h2 A03;
    public C193228h2 A04;
    public Map A05;
    public C193208h0 A06;
    public final CountDownLatch A07 = new CountDownLatch(1);
    public final C8EC A08;

    public C193158gv(C8EC c8ec) {
        this.A08 = c8ec;
    }

    @Override // X.InterfaceC193168gw
    public final List C9Z(List list) {
        C14360o3.A0B(list, 0);
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (obj instanceof C9VH) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : arrayList) {
            Float f = ((C9VH) obj2).A00;
            if (f != null && f.floatValue() > 1.0E-6f) {
                arrayList2.add(obj2);
            }
        }
        return arrayList2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x001f, code lost:
    
        if (CbZ() == false) goto L6;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:33:0x0183. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:41:0x01cb A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0169 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r1v1, types: [X.9vN, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v26, types: [X.9vN, java.lang.Object] */
    @Override // X.InterfaceC193168gw
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.AbstractC223599u2 E58(X.ACP r24, java.util.List r25, X.InterfaceC16660sJ r26) {
        /*
            Method dump skipped, instructions count: 734
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C193158gv.E58(X.ACP, java.util.List, X.0sJ):X.9u2");
    }

    public static final void A00(C193158gv c193158gv) {
        FileInputStream fileInputStream;
        BufferedReader bufferedReader;
        BufferedReader bufferedReader2;
        try {
            c193158gv.A06 = AbstractC193188gy.A00(c193158gv.A01);
            String str = c193158gv.A02;
            if (str != null) {
                fileInputStream = new FileInputStream(str);
                try {
                    Reader inputStreamReader = new InputStreamReader(fileInputStream, C15W.A05);
                    if (inputStreamReader instanceof BufferedReader) {
                        bufferedReader2 = (BufferedReader) inputStreamReader;
                    } else {
                        bufferedReader2 = new BufferedReader(inputStreamReader, 8192);
                    }
                    c193158gv.A04 = AbstractC193218h1.parseFromJson(C16V.A00(AbstractC38581qm.A00(bufferedReader2)));
                    fileInputStream.close();
                } finally {
                }
            }
            String str2 = c193158gv.A00;
            if (str2 != null) {
                fileInputStream = new FileInputStream(str2);
                Reader inputStreamReader2 = new InputStreamReader(fileInputStream, C15W.A05);
                if (inputStreamReader2 instanceof BufferedReader) {
                    bufferedReader = (BufferedReader) inputStreamReader2;
                } else {
                    bufferedReader = new BufferedReader(inputStreamReader2, 8192);
                }
                c193158gv.A03 = AbstractC193218h1.parseFromJson(C16V.A00(AbstractC38581qm.A00(bufferedReader)));
                fileInputStream.close();
            }
            c193158gv.A05 = AbstractC06930Yk.A06(new C09530e4(EnumC193258h5.A0A, c193158gv.A04), new C09530e4(EnumC193258h5.A06, c193158gv.A03));
        } catch (Exception unused) {
        }
    }

    @Override // X.InterfaceC193168gw
    public final boolean CbZ() {
        if (this.A07.getCount() != 0) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC193168gw
    public final void Chb() {
        this.A08.AV9(new C8EF() { // from class: X.8gx
            @Override // X.C8EF
            public final void D6b(Exception exc, List list) {
                C14360o3.A0B(list, 0);
                C184028Eq c184028Eq = (C184028Eq) AbstractC001800i.A0J(list);
                if (c184028Eq != null) {
                    C193158gv c193158gv = C193158gv.this;
                    c193158gv.A01 = c184028Eq.A01;
                    List list2 = C8E4.A0H.A00;
                    Object A0J = AbstractC001800i.A0J(list2);
                    Object obj = null;
                    if (A0J != null) {
                        Object obj2 = c184028Eq.A03.get(A0J);
                        if (obj2 == null) {
                            obj2 = null;
                        }
                        c193158gv.A02 = (String) obj2;
                    }
                    Object A0L = AbstractC001800i.A0L(list2);
                    if (A0L != null) {
                        Object obj3 = c184028Eq.A03.get(A0L);
                        if (obj3 != null) {
                            obj = obj3;
                        }
                        c193158gv.A00 = (String) obj;
                    }
                    C193158gv.A00(c193158gv);
                    c193158gv.A07.countDown();
                }
            }
        }, false);
    }
}
