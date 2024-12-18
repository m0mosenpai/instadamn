package X;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: X.9VK, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C9VK extends AbstractC72053XLu implements InterfaceC193168gw {
    public String A00;
    public String A01;
    public String A02;
    public C193228h2 A03;
    public C193228h2 A04;
    public Map A05;
    public A6P A06;
    public final InterfaceC09390do A07 = AbstractC09440dt.A00(EnumC09460dv.A02, B6G.A00);
    public final C8EC A08;

    @Override // X.InterfaceC193168gw
    public final List C9Z(List list) {
        ArrayList A12 = AbstractC166997dE.A12(list, 0);
        for (Object obj : list) {
            if (obj instanceof C9VH) {
                A12.add(obj);
            }
        }
        ArrayList A1E = AbstractC166987dD.A1E();
        for (Object obj2 : A12) {
            Float f = ((C9VH) obj2).A00;
            if (f != null && f.floatValue() > 1.0E-6f) {
                A1E.add(obj2);
            }
        }
        return A1E;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:25:0x0121. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0157 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00f5 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r1v0, types: [X.9vN, java.lang.Object] */
    @Override // X.InterfaceC193168gw
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.AbstractC223599u2 E58(X.ACP r26, java.util.List r27, X.InterfaceC16660sJ r28) {
        /*
            Method dump skipped, instructions count: 530
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C9VK.E58(X.ACP, java.util.List, X.0sJ):X.9u2");
    }

    public static final void A00(C9VK c9vk) {
        FileInputStream fileInputStream;
        BufferedReader bufferedReader;
        BufferedReader bufferedReader2;
        if (c9vk.A06 == null && c9vk.A08()) {
            try {
                A6P A00 = A6P.A00(c9vk.A01, 1);
                A00.A00.loadMethod("forward");
                c9vk.A06 = A00;
                String str = c9vk.A02;
                if (str != null) {
                    fileInputStream = new FileInputStream(str);
                    try {
                        Reader inputStreamReader = new InputStreamReader(fileInputStream, C15W.A05);
                        if (inputStreamReader instanceof BufferedReader) {
                            bufferedReader2 = (BufferedReader) inputStreamReader;
                        } else {
                            bufferedReader2 = new BufferedReader(inputStreamReader, 8192);
                        }
                        c9vk.A04 = AbstractC193218h1.parseFromJson(C16V.A00(AbstractC38581qm.A00(bufferedReader2)));
                        fileInputStream.close();
                    } finally {
                    }
                }
                String str2 = c9vk.A00;
                if (str2 != null) {
                    fileInputStream = new FileInputStream(str2);
                    Reader inputStreamReader2 = new InputStreamReader(fileInputStream, C15W.A05);
                    if (inputStreamReader2 instanceof BufferedReader) {
                        bufferedReader = (BufferedReader) inputStreamReader2;
                    } else {
                        bufferedReader = new BufferedReader(inputStreamReader2, 8192);
                    }
                    c9vk.A03 = AbstractC193218h1.parseFromJson(C16V.A00(AbstractC38581qm.A00(bufferedReader)));
                    fileInputStream.close();
                }
                c9vk.A05 = AbstractC06930Yk.A06(AbstractC166987dD.A1L(EnumC223049sj.A0A, c9vk.A04), AbstractC166987dD.A1L(EnumC223049sj.A06, c9vk.A03));
            } catch (Exception unused) {
            }
        }
    }

    @Override // X.InterfaceC193168gw
    public final boolean CbZ() {
        return AbstractC167007dF.A1W(this.A01);
    }

    @Override // X.InterfaceC193168gw
    public final void Chb() {
        this.A08.AV9(new C23290AUb(this, 1), true);
    }

    public C9VK(C8EC c8ec) {
        this.A08 = c8ec;
    }
}
