package X;

/* renamed from: X.6MQ, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C6MQ implements C2DD, C6MR {
    public InterfaceC138116Np A00;
    public InterfaceC117845Uu A01;
    public C5C7 A02;
    public Object A03;
    public String A04;
    public Object[] A05;
    public final InterfaceC16820sZ A06 = new C9EV(this, 16);

    public static final void A00(C6MQ c6mq) {
        StringBuilder sb;
        String str;
        String obj;
        InterfaceC117845Uu interfaceC117845Uu = c6mq.A01;
        InterfaceC138116Np interfaceC138116Np = c6mq.A00;
        if (interfaceC138116Np == null) {
            if (interfaceC117845Uu != null) {
                InterfaceC16820sZ interfaceC16820sZ = c6mq.A06;
                Object invoke = interfaceC16820sZ.invoke();
                if (invoke != null && !interfaceC117845Uu.AFS(invoke)) {
                    if (invoke instanceof InterfaceC74943Yk) {
                        InterfaceC74943Yk interfaceC74943Yk = (InterfaceC74943Yk) invoke;
                        InterfaceC74893Ye BeD = interfaceC74943Yk.BeD();
                        C6M9 c6m9 = C6M9.A00;
                        C14360o3.A0C(c6m9, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutationPolicy<T of androidx.compose.runtime.SnapshotStateKt__SnapshotMutationPolicyKt.neverEqualPolicy>");
                        if (BeD != c6m9 && interfaceC74943Yk.BeD() != AbstractC74873Yc.A00()) {
                            InterfaceC74893Ye BeD2 = interfaceC74943Yk.BeD();
                            C58H c58h = C58H.A00;
                            C14360o3.A0C(c58h, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutationPolicy<T of androidx.compose.runtime.SnapshotStateKt__SnapshotMutationPolicyKt.referentialEqualityPolicy>");
                            if (BeD2 != c58h) {
                                obj = "If you use a custom SnapshotMutationPolicy for your MutableState you have to write a custom Saver";
                                throw new IllegalArgumentException(obj);
                            }
                        }
                        sb = new StringBuilder();
                        sb.append("MutableState containing ");
                        sb.append(interfaceC74943Yk.getValue());
                        str = " cannot be saved using the current SaveableStateRegistry. The default implementation only supports types which can be stored inside the Bundle. Please consider implementing a custom Saver for this class and pass it as a stateSaver parameter to rememberSaveable().";
                    } else {
                        sb = new StringBuilder();
                        sb.append(invoke);
                        str = " cannot be saved using the current SaveableStateRegistry. The default implementation only supports types which can be stored inside the Bundle. Please consider implementing a custom Saver for this class and pass it to rememberSaveable().";
                    }
                    sb.append(str);
                    obj = sb.toString();
                    throw new IllegalArgumentException(obj);
                }
                c6mq.A00 = interfaceC117845Uu.EDf(c6mq.A04, interfaceC16820sZ);
                return;
            }
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("entry(");
        sb2.append(interfaceC138116Np);
        sb2.append(") is not null");
        throw new IllegalArgumentException(sb2.toString());
    }

    @Override // X.C2DD
    public final void CuG() {
        InterfaceC138116Np interfaceC138116Np = this.A00;
        if (interfaceC138116Np != null) {
            interfaceC138116Np.F9T();
        }
    }

    @Override // X.C2DD
    public final void DI8() {
        InterfaceC138116Np interfaceC138116Np = this.A00;
        if (interfaceC138116Np != null) {
            interfaceC138116Np.F9T();
        }
    }

    public C6MQ(InterfaceC117845Uu interfaceC117845Uu, C5C7 c5c7, Object obj, String str, Object[] objArr) {
        this.A02 = c5c7;
        this.A01 = interfaceC117845Uu;
        this.A04 = str;
        this.A03 = obj;
        this.A05 = objArr;
    }

    @Override // X.C2DD
    public final void Deh() {
        A00(this);
    }
}
