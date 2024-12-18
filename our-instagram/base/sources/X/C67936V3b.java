package X;

/* renamed from: X.V3b, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C67936V3b extends C1P1 {
    public final int A00;

    public C67936V3b(int i) {
        this.A00 = i;
    }

    @Override // X.C1P1
    public final void onFail(AbstractC115105If abstractC115105If) {
        int A03;
        int i;
        switch (this.A00) {
            case 3:
                A03 = C0f9.A03(-143036279);
                i = 1075205959;
                break;
            case 4:
            case 5:
            case 9:
            default:
                super.onFail(abstractC115105If);
                return;
            case 6:
                A03 = C0f9.A03(-1827259268);
                i = 1849596052;
                break;
            case 7:
                A03 = C0f9.A03(-1809774955);
                i = -676579589;
                break;
            case 8:
                A03 = C0f9.A03(-202235095);
                i = -2038529648;
                break;
            case 10:
                A03 = C0f9.A03(834705226);
                i = 12710187;
                break;
        }
        C0f9.A0A(i, A03);
    }

    @Override // X.C1P1
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A03;
        int i;
        switch (this.A00) {
            case 3:
                A03 = C0f9.A03(120186233);
                C0f9.A0A(-414406057, C0f9.A03(1595426722));
                i = -567116087;
                break;
            case 4:
            case 5:
            case 9:
            default:
                super.onSuccess(obj);
                return;
            case 6:
                A03 = C0f9.A03(35843079);
                C0f9.A0A(1418882515, C0f9.A03(-2022542513));
                i = 1814776645;
                break;
            case 7:
                A03 = C0f9.A03(120520211);
                AnonymousClass435 anonymousClass435 = (AnonymousClass435) obj;
                int A032 = C0f9.A03(-1286131620);
                AbstractC70201WGq.A00 = anonymousClass435;
                Object obj2 = anonymousClass435.A01;
                if (obj2 != null) {
                    InterfaceC72042XIv interfaceC72042XIv = (InterfaceC72042XIv) obj2;
                    if (interfaceC72042XIv.B9I() != null && interfaceC72042XIv.B9I().Bhr() != null) {
                        AbstractC70201WGq.A01 = interfaceC72042XIv.B9I().Bhr().BvN();
                    }
                }
                C0f9.A0A(-1370703516, A032);
                i = -1822593885;
                break;
            case 8:
                A03 = C0f9.A03(-958925819);
                C0f9.A0A(-1188651609, C0f9.A03(-681300185));
                i = -543343099;
                break;
            case 10:
                A03 = C0f9.A03(-1441658908);
                C0f9.A0A(-539557065, C0f9.A03(-798391189));
                i = -1229063265;
                break;
        }
        C0f9.A0A(i, A03);
    }
}
