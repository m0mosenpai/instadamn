package X;

/* renamed from: X.Jav, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43888Jav implements InterfaceC14180ni {
    public final int A00;
    public final Object A01;

    public C43888Jav(int i, InterfaceC16660sJ interfaceC16660sJ) {
        this.A00 = i;
        if (i != 0) {
            C14360o3.A0B(interfaceC16660sJ, 1);
        }
        this.A01 = interfaceC16660sJ;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0039, code lost:
    
        if (((X.C43888Jav) r4).A00 != r2) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x001d, code lost:
    
        if (((X.C43888Jav) r4).A00 != r2) goto L15;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:13:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:19:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0017  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:32:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0033  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(java.lang.Object r4) {
        /*
            r3 = this;
            int r0 = r3.A00
            switch(r0) {
                case 0: goto L2e;
                case 1: goto L2c;
                case 2: goto L12;
                case 3: goto L10;
                case 4: goto Le;
                case 5: goto Lc;
                case 6: goto La;
                default: goto L5;
            }
        L5:
            boolean r1 = super.equals(r4)
        L9:
            return r1
        La:
            r2 = 6
            goto L2f
        Lc:
            r2 = 5
            goto L13
        Le:
            r2 = 4
            goto L13
        L10:
            r2 = 3
            goto L13
        L12:
            r2 = 2
        L13:
            boolean r0 = r4 instanceof X.C43888Jav
            if (r0 == 0) goto L1f
            r0 = r4
            X.Jav r0 = (X.C43888Jav) r0
            int r1 = r0.A00
            r0 = 1
            if (r1 == r2) goto L20
        L1f:
            r0 = 0
        L20:
            r1 = 0
            if (r0 == 0) goto L9
            boolean r0 = r4 instanceof X.InterfaceC14180ni
            if (r0 == 0) goto L9
            X.0da r0 = r3.getFunctionDelegate()
            goto L45
        L2c:
            r2 = 1
            goto L2f
        L2e:
            r2 = 0
        L2f:
            boolean r0 = r4 instanceof X.C43888Jav
            if (r0 == 0) goto L3b
            r0 = r4
            X.Jav r0 = (X.C43888Jav) r0
            int r1 = r0.A00
            r0 = 1
            if (r1 == r2) goto L3c
        L3b:
            r0 = 0
        L3c:
            r1 = 0
            if (r0 == 0) goto L9
            boolean r0 = r4 instanceof X.InterfaceC14180ni
            if (r0 == 0) goto L9
            java.lang.Object r0 = r3.A01
        L45:
            boolean r1 = X.AbstractC167007dF.A1Y(r4, r0)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C43888Jav.equals(java.lang.Object):boolean");
    }

    @Override // X.InterfaceC14180ni
    public final InterfaceC09250da getFunctionDelegate() {
        Object obj;
        Class cls;
        int i;
        String str;
        String str2;
        switch (this.A00) {
            case 0:
            case 1:
            case 6:
                return (InterfaceC09250da) this.A01;
            case 2:
                obj = this.A01;
                cls = C43858JaO.class;
                i = 1;
                str = "onManageDraftButtonClick";
                str2 = "onManageDraftButtonClick(Lcom/instagram/creation/capture/adapter/model/ManageButtonState;)V";
                break;
            case 3:
                obj = this.A01;
                cls = C43830JZt.class;
                i = 1;
                str = "onAdapterStateUpdated";
                str2 = "onAdapterStateUpdated(Ljava/util/List;)V";
                break;
            case 4:
                obj = this.A01;
                cls = InterfaceC58036PoM.class;
                i = 1;
                str = "onProgressChanged";
                str2 = "onProgressChanged(D)V";
                break;
            case 5:
                obj = this.A01;
                cls = LGG.class;
                i = 2;
                str = "sendAvatarPowerUp";
                str2 = "sendAvatarPowerUp(Ljava/lang/String;Lcom/instagram/direct/avatar/powerups/model/AvatarPowerUp;)V";
                break;
            default:
                return null;
        }
        return new C03E(i, obj, cls, str, str2, 0);
    }

    public final int hashCode() {
        Object functionDelegate;
        switch (this.A00) {
            case 0:
            case 1:
            case 6:
                functionDelegate = this.A01;
                break;
            case 2:
            case 3:
            case 4:
            case 5:
                functionDelegate = getFunctionDelegate();
                break;
            default:
                return super.hashCode();
        }
        return functionDelegate.hashCode();
    }

    public C43888Jav(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }
}
