package X;

/* renamed from: X.6tY, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C152456tY extends C1P1 {
    public final NA6 A00;
    public final AbstractC154286wd A01;
    public final C154806xV A02;
    public final C11R A03;

    public C152456tY(C11R c11r, NA6 na6, AbstractC154286wd abstractC154286wd, C154806xV c154806xV) {
        C14360o3.A0B(c154806xV, 2);
        this.A03 = c11r;
        this.A02 = c154806xV;
        this.A01 = abstractC154286wd;
        this.A00 = na6;
    }

    @Override // X.C1P1
    public final void onFail(AbstractC115105If abstractC115105If) {
        NA6 na6;
        int A03 = C0f9.A03(156255411);
        C14360o3.A0B(abstractC115105If, 0);
        C154806xV c154806xV = this.A02;
        c154806xV.A01 = null;
        if (!(abstractC115105If instanceof C115115Ig) && (na6 = this.A00) != null) {
            na6.A00();
        } else {
            c154806xV.A00(C05F.A01);
            this.A01.onFail(abstractC115105If);
        }
        C0f9.A0A(-1075615216, A03);
    }

    @Override // X.C1P1
    public final void onFailInBackground(AbstractC115105If abstractC115105If) {
        int A03 = C0f9.A03(1218018086);
        C14360o3.A0B(abstractC115105If, 0);
        this.A01.onFailInBackground(abstractC115105If);
        C0f9.A0A(-977278426, A03);
    }

    @Override // X.C1P1
    public final void onFinish() {
        int A03 = C0f9.A03(82605428);
        this.A01.onFinish();
        C0f9.A0A(1077665167, A03);
    }

    @Override // X.C1P1
    public final void onStart() {
        int A03 = C0f9.A03(1333899859);
        C154806xV c154806xV = this.A02;
        c154806xV.A00(C05F.A00);
        c154806xV.A01 = this.A03;
        this.A01.onStart();
        C0f9.A0A(-1790581588, A03);
    }

    @Override // X.C1P1
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A03 = C0f9.A03(2076331760);
        InterfaceC74303Vl interfaceC74303Vl = (InterfaceC74303Vl) obj;
        int A032 = C0f9.A03(-781205827);
        C14360o3.A0B(interfaceC74303Vl, 0);
        NA6 na6 = this.A00;
        if (na6 != null) {
            na6.A05.removeCallbacksAndMessages(null);
        }
        C154806xV c154806xV = this.A02;
        c154806xV.A01 = null;
        c154806xV.A00(C05F.A0C);
        c154806xV.A07 = interfaceC74303Vl.getNextMaxId();
        c154806xV.A0A = interfaceC74303Vl.CQG();
        if (interfaceC74303Vl instanceof C123645id) {
            C123645id c123645id = (C123645id) interfaceC74303Vl;
            c154806xV.A09 = c123645id.A02;
            c154806xV.A08 = c123645id.A01;
        }
        if (interfaceC74303Vl instanceof C124275jh) {
            c154806xV.A02 = ((C124275jh) interfaceC74303Vl).A01;
        }
        this.A01.onSuccess(interfaceC74303Vl);
        C0f9.A0A(2061711964, A032);
        C0f9.A0A(-1281226672, A03);
    }

    @Override // X.C1P1
    public final /* bridge */ /* synthetic */ void onSuccessInBackground(Object obj) {
        int A03 = C0f9.A03(243528279);
        int A032 = C0f9.A03(1422299308);
        C14360o3.A0B(obj, 0);
        this.A01.onSuccessInBackground(obj);
        C0f9.A0A(-1749577797, A032);
        C0f9.A0A(-144543128, A03);
    }
}
