package X;

import com.instagram.business.promote.activity.PromoteActivity;
import com.instagram.business.promote.model.PromoteData;

/* loaded from: classes11.dex */
public final class V22 extends AbstractC67958V3x {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;

    public V22(VG4 vg4, C70399WUb c70399WUb, PromoteActivity promoteActivity, XAE xae, int i) {
        this.A00 = i;
        this.A03 = promoteActivity;
        this.A02 = vg4;
        this.A01 = xae;
        super.A02 = "";
        super.A01 = AbstractC31173DnH.A0g();
        super.A00 = c70399WUb;
    }

    @Override // X.AbstractC67958V3x, X.C1P1
    public final void onFail(AbstractC115105If abstractC115105If) {
        int A0N;
        int i;
        if (this.A00 != 0) {
            A0N = AbstractC167017dG.A0N(abstractC115105If, -721585025);
            PromoteActivity promoteActivity = (PromoteActivity) this.A03;
            String str = null;
            PromoteActivity.A08(promoteActivity, null);
            C70399WUb A0N2 = AbstractC65702TsY.A0N(promoteActivity.A07);
            VG4 vg4 = (VG4) this.A02;
            Throwable A01 = abstractC115105If.A01();
            if (A01 != null) {
                str = A01.getMessage();
            }
            PromoteData promoteData = promoteActivity.A00;
            if (promoteData != null) {
                A0N2.A0K(vg4, str, promoteData.A0l.toString());
                super.onFail(abstractC115105If);
                i = 1251570085;
                C0f9.A0A(i, A0N);
                return;
            }
            C14360o3.A0F("promoteData");
            throw C00O.createAndThrow();
        }
        A0N = AbstractC167017dG.A0N(abstractC115105If, -1722045409);
        PromoteActivity promoteActivity2 = (PromoteActivity) this.A03;
        String str2 = null;
        PromoteActivity.A08(promoteActivity2, null);
        C70399WUb A0N3 = AbstractC65702TsY.A0N(promoteActivity2.A07);
        VG4 vg42 = (VG4) this.A02;
        Throwable A012 = abstractC115105If.A01();
        if (A012 != null) {
            str2 = A012.getMessage();
        }
        PromoteData promoteData2 = promoteActivity2.A00;
        if (promoteData2 != null) {
            A0N3.A0K(vg42, str2, promoteData2.A0l.toString());
            super.onFail(abstractC115105If);
            i = -122056347;
            C0f9.A0A(i, A0N);
            return;
        }
        C14360o3.A0F("promoteData");
        throw C00O.createAndThrow();
    }

    @Override // X.C1P1
    public final void onFinish() {
        int A03;
        int i;
        if (this.A00 != 0) {
            A03 = C0f9.A03(-604088842);
            super.onFinish();
            ((XAE) this.A01).D8K(false);
            i = 316952567;
        } else {
            A03 = C0f9.A03(-110077161);
            super.onFinish();
            ((XAE) this.A01).D8K(false);
            i = -2082825484;
        }
        C0f9.A0A(i, A03);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x008c, code lost:
    
        X.C0f9.A0A(r0, r9);
        r0 = 1837390771;
     */
    /* JADX WARN: Removed duplicated region for block: B:146:0x033e  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0194  */
    @Override // X.C1P1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ void onSuccess(java.lang.Object r28) {
        /*
            Method dump skipped, instructions count: 934
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.V22.onSuccess(java.lang.Object):void");
    }
}
