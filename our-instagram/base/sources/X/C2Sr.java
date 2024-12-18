package X;

import com.google.firebase.iid.FirebaseInstanceId;

/* renamed from: X.2Sr, reason: invalid class name */
/* loaded from: classes.dex */
public final class C2Sr {
    public static C50232Sp A00;
    public static InterfaceC09390do A02;
    public static InterfaceC09390do A03;
    public static final InterfaceC09390do A04 = AbstractC09440dt.A01(new InterfaceC16820sZ() { // from class: X.2Ss
        @Override // X.InterfaceC16820sZ
        public final /* bridge */ /* synthetic */ Object invoke() {
            InterfaceC09390do interfaceC09390do;
            synchronized (C2Sr.class) {
                C2Sr.A00();
                interfaceC09390do = C2Sr.A02;
            }
            return FirebaseInstanceId.getInstance((C63342Shx) interfaceC09390do.getValue());
        }
    });
    public static final InterfaceC09390do A05 = AbstractC09440dt.A01(new InterfaceC16820sZ() { // from class: X.2St
        @Override // X.InterfaceC16820sZ
        public final /* bridge */ /* synthetic */ Object invoke() {
            InterfaceC09390do interfaceC09390do;
            synchronized (C2Sr.class) {
                C2Sr.A00();
                interfaceC09390do = C2Sr.A03;
            }
            return ((SPG) interfaceC09390do.getValue()).A01;
        }
    });
    public static Object A01 = new Object();

    /* JADX WARN: Code restructure failed: missing block: B:6:0x000b, code lost:
    
        if (X.C2Sr.A00 == null) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void A00() {
        /*
            X.0do r0 = X.C2Sr.A02
            if (r0 == 0) goto Ld
            X.0do r0 = X.C2Sr.A03
            if (r0 == 0) goto Ld
            X.2Sp r0 = X.C2Sr.A00
            r1 = 1
            if (r0 != 0) goto Le
        Ld:
            r1 = 0
        Le:
            java.lang.String r0 = "Missing required call to FCMModule.initialize(context, options, delegate)"
            X.C18C.A0G(r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2Sr.A00():void");
    }
}
