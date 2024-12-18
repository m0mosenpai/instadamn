package X;

/* renamed from: X.62a, reason: invalid class name */
/* loaded from: classes3.dex */
public abstract class C62a implements InterfaceC66482zP {
    public final C120985dq A00;
    public final String A01;
    public final boolean A02;
    public final boolean A03;
    public final boolean A04;

    public EnumC129395t1 A01() {
        return this.A00.A01;
    }

    @Override // X.InterfaceC66482zP
    public final /* bridge */ /* synthetic */ Object getKey() {
        return this.A01;
    }

    @Override // X.InterfaceC66492zQ
    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        String str;
        int i;
        int i2;
        C62a c62a = (C62a) obj;
        if (c62a != null) {
            str = c62a.A01;
        } else {
            str = null;
        }
        if (C14360o3.A0K(str, this.A01)) {
            if (c62a instanceof C1337062b) {
                i = ((C1337062b) c62a).A00;
            } else {
                i = 0;
            }
            if (this instanceof C1337062b) {
                i2 = ((C1337062b) this).A00;
            } else {
                i2 = 0;
            }
            if (i == i2) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x004d, code lost:
    
        if (r5.A06().A07() == false) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0039, code lost:
    
        if (r5.A06().A08() == false) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C62a(X.C120985dq r5) {
        /*
            r4 = this;
            r4.<init>()
            r4.A00 = r5
            X.5t1 r1 = r5.A01
            X.5t1 r0 = r4.A01()
            r2 = 1
            if (r1 != r0) goto L71
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            r0 = 95
            r1.append(r0)
            java.lang.String r0 = r5.getId()
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r4.A01 = r0
            X.5dr r3 = r5.A0G
            boolean r0 = r3.CdW()
            if (r0 == 0) goto L3b
            X.1v4 r0 = r5.A06()
            boolean r1 = r0.A08()
            r0 = 1
            if (r1 != 0) goto L3c
        L3b:
            r0 = 0
        L3c:
            r4.A04 = r0
            boolean r0 = r3.CdW()
            if (r0 == 0) goto L4f
            X.1v4 r0 = r5.A06()
            boolean r1 = r0.A07()
            r0 = 1
            if (r1 != 0) goto L50
        L4f:
            r0 = 0
        L50:
            r4.A02 = r0
            boolean r0 = r3.CdW()
            if (r0 == 0) goto L6f
            X.1v4 r0 = r5.A06()
            boolean r0 = r0.A07()
            if (r0 != 0) goto L6f
            X.1v4 r0 = r5.A06()
            boolean r0 = r0.A08()
            if (r0 != 0) goto L6f
        L6c:
            r4.A03 = r2
            return
        L6f:
            r2 = 0
            goto L6c
        L71:
            java.lang.String r1 = "Failed requirement."
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C62a.<init>(X.5dq):void");
    }
}
