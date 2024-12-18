package X;

import android.content.Context;
import android.view.LayoutInflater;

/* renamed from: X.4da, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C99574da extends C99584db {
    public final InterfaceC16820sZ A00;
    public final int A01;
    public final LayoutInflater A02;
    public final boolean A03;
    public final boolean A04;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C99574da(Context context, LayoutInflater layoutInflater, InterfaceC16820sZ interfaceC16820sZ, int i, boolean z, boolean z2) {
        super(context, layoutInflater, z2, z);
        C14360o3.A0B(layoutInflater, 1);
        C14360o3.A0B(interfaceC16820sZ, 6);
        this.A02 = layoutInflater;
        this.A04 = z;
        this.A03 = z2;
        this.A01 = i;
        this.A00 = interfaceC16820sZ;
    }

    @Override // X.C99584db, android.view.LayoutInflater
    public final LayoutInflater cloneInContext(Context context) {
        C14360o3.A0B(context, 0);
        LayoutInflater cloneInContext = this.A02.cloneInContext(context);
        C14360o3.A07(cloneInContext);
        boolean z = this.A04;
        boolean z2 = this.A03;
        return new C99574da(context, cloneInContext, this.A00, this.A01, z, z2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0092, code lost:
    
        if (r2.A01 >= 0) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0096, code lost:
    
        if (r0 == null) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x009a, code lost:
    
        if (r0 == null) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00c5, code lost:
    
        r4 = r0;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x010f  */
    @Override // X.C99584db, android.view.LayoutInflater
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View inflate(int r23, android.view.ViewGroup r24, boolean r25) {
        /*
            Method dump skipped, instructions count: 292
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C99574da.inflate(int, android.view.ViewGroup, boolean):android.view.View");
    }
}
