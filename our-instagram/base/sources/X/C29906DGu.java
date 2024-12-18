package X;

import android.os.BaseBundle;

/* renamed from: X.DGu, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C29906DGu extends C0YY implements InterfaceC16820sZ {
    public final int A00;
    public final Object A01;

    public static Integer A00(BaseBundle baseBundle, String str) {
        if (baseBundle.containsKey(str)) {
            return Integer.valueOf(baseBundle.getInt(str));
        }
        return null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29906DGu(Object obj, int i) {
        super(0);
        this.A00 = i;
        this.A01 = obj;
    }

    public static C29906DGu A01(C5Tl c5Tl, Object obj, int i) {
        C29906DGu c29906DGu = new C29906DGu(obj, i);
        c5Tl.FBy(c29906DGu);
        return c29906DGu;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0028, code lost:
    
        if (r0 != null) goto L14;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0004. Please report as an issue. */
    @Override // X.InterfaceC16820sZ
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ java.lang.Object invoke() {
        /*
            Method dump skipped, instructions count: 898
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C29906DGu.invoke():java.lang.Object");
    }
}
