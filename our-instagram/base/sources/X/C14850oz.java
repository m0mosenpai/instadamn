package X;

/* renamed from: X.0oz, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C14850oz extends C1Dq implements InterfaceC19960yQ, InterfaceC23631Dt {
    public InterfaceC23621Ds A00;
    public C12W A01;
    public final int A02;
    public final C12W A03;
    public final InterfaceC19960yQ A04;

    @Override // X.C1Dr
    public final StackTraceElement getStackTraceElement() {
        return null;
    }

    public C14850oz(C12W c12w, InterfaceC19960yQ interfaceC19960yQ) {
        super(C20790zz.A00, AnonymousClass191.A00);
        this.A04 = interfaceC19960yQ;
        this.A03 = c12w;
        this.A02 = ((Number) c12w.fold(0, C012904s.A00)).intValue();
    }

    @Override // X.C1Dr, X.InterfaceC23631Dt
    public final InterfaceC23631Dt getCallerFrame() {
        InterfaceC23621Ds interfaceC23621Ds = this.A00;
        if (interfaceC23621Ds instanceof InterfaceC23631Dt) {
            return (InterfaceC23631Dt) interfaceC23621Ds;
        }
        return null;
    }

    @Override // X.C1Dq, X.InterfaceC23621Ds
    public final C12W getContext() {
        C12W c12w = this.A01;
        if (c12w == null) {
            return AnonymousClass191.A00;
        }
        return c12w;
    }

    @Override // X.InterfaceC19960yQ
    public final Object emit(Object obj, InterfaceC23621Ds interfaceC23621Ds) {
        try {
            C12W context = interfaceC23621Ds.getContext();
            C2QZ.A01(context);
            C12W c12w = this.A01;
            if (c12w != context) {
                if (c12w instanceof AnonymousClass103) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("\n            Flow exception transparency is violated:\n                Previous 'emit' call has thrown exception ");
                    sb.append(((AnonymousClass103) c12w).A00);
                    sb.append(", but then emission attempt of value '");
                    sb.append(obj);
                    sb.append("' has been detected.\n                Emissions from 'catch' blocks are prohibited in order to avoid unspecified behaviour, 'Flow.catch' operator can be used instead.\n                For a more detailed explanation, please refer to Flow documentation.\n            ");
                    throw new IllegalStateException(AbstractC16490ru.A0p(sb.toString()));
                }
                if (((Number) context.fold(0, new C012604p(this))).intValue() == this.A02) {
                    this.A01 = context;
                } else {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Flow invariant is violated:\n\t\tFlow was collected in ");
                    sb2.append(this.A03);
                    sb2.append(",\n\t\tbut emission happened in ");
                    sb2.append(context);
                    sb2.append(".\n\t\tPlease refer to 'flow' documentation or use 'flowOn' instead");
                    throw new IllegalStateException(sb2.toString());
                }
            }
            this.A00 = interfaceC23621Ds;
            InterfaceC16610sE interfaceC16610sE = AbstractC20770zx.A00;
            InterfaceC19960yQ interfaceC19960yQ = this.A04;
            C14360o3.A0C(interfaceC19960yQ, "null cannot be cast to non-null type kotlinx.coroutines.flow.FlowCollector<kotlin.Any?>");
            Object invoke = interfaceC16610sE.invoke(interfaceC19960yQ, obj, this);
            C1JX c1jx = C1JX.A02;
            if (!C14360o3.A0K(invoke, c1jx)) {
                this.A00 = null;
            }
            if (invoke != c1jx) {
                return C0eB.A00;
            }
            return invoke;
        } catch (Throwable th) {
            this.A01 = new AnonymousClass103(interfaceC23621Ds.getContext(), th);
            throw th;
        }
    }

    @Override // X.C1Dr
    public final Object invokeSuspend(Object obj) {
        Throwable A00 = C09550e6.A00(obj);
        if (A00 != null) {
            this.A01 = new AnonymousClass103(getContext(), A00);
        }
        InterfaceC23621Ds interfaceC23621Ds = this.A00;
        if (interfaceC23621Ds != null) {
            interfaceC23621Ds.resumeWith(obj);
        }
        return C1JX.A02;
    }
}
