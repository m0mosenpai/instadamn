package X;

import com.facebook.forker.Process;

/* renamed from: X.SqX, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63625SqX implements InterfaceC58362lv {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public C63625SqX(C2GT c2gt, InterfaceC58362lv interfaceC58362lv, int i) {
        this.A00 = i;
        switch (i) {
            case 18:
            case Process.SIGSTOP /* 19 */:
            case 20:
            case 21:
            case 23:
                this.A01 = c2gt;
                this.A02 = interfaceC58362lv;
                break;
            case 22:
                this.A02 = interfaceC58362lv;
                this.A01 = c2gt;
                break;
            default:
                this.A02 = c2gt;
                this.A01 = interfaceC58362lv;
                break;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:158:0x0206, code lost:
    
        if (X.C63406Sjd.A0J(r8) == false) goto L99;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0006. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:153:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r9v3, types: [X.0sl] */
    /* JADX WARN: Type inference failed for: r9v5, types: [java.util.AbstractCollection, java.util.ArrayList] */
    @Override // X.InterfaceC58362lv
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ void onChanged(java.lang.Object r20) {
        /*
            Method dump skipped, instructions count: 2170
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C63625SqX.onChanged(java.lang.Object):void");
    }

    public C63625SqX(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A01 = obj2;
        this.A02 = obj;
    }
}
