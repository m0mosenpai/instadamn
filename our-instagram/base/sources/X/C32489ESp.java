package X;

import androidx.fragment.app.FragmentActivity;

/* renamed from: X.ESp, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32489ESp extends C1P1 {
    public final /* synthetic */ EUW A00;

    public C32489ESp(EUW euw) {
        this.A00 = euw;
    }

    @Override // X.C1P1
    public final void onFail(AbstractC115105If abstractC115105If) {
        int A03 = C0f9.A03(-847977922);
        super.onFail(abstractC115105If);
        C9GR.A0G(((ECT) abstractC115105If.A00()).A01);
        C0f9.A0A(1077685193, A03);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, X.PqH] */
    @Override // X.C1P1
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A03 = C0f9.A03(529948222);
        ECT ect = (ECT) obj;
        int A032 = C0f9.A03(-29784227);
        super.onSuccess(ect);
        C146106i8 A0K = AbstractC31171DnF.A0K();
        EUW euw = this.A00;
        FragmentActivity fragmentActivity = euw.A00;
        A0K.A0D = AbstractC167007dF.A0f(fragmentActivity, ect.A00, 2131965237);
        A0K.A0D(fragmentActivity.getString(2131968948));
        A0K.A0A(new Object());
        A0K.A0L = true;
        euw.A03.A0A(A0K.A00());
        C0f9.A0A(-1971647898, A032);
        C0f9.A0A(-1264430188, A03);
    }
}
