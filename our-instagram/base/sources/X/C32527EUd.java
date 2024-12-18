package X;

import android.content.Context;
import android.text.TextUtils;

/* renamed from: X.EUd, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C32527EUd extends C1P1 {
    public final Context A00;

    public C32527EUd(Context context) {
        this.A00 = context;
    }

    public void A00(EDD edd) {
        int A03 = C0f9.A03(1932809641);
        if (!TextUtils.isEmpty(edd.A04)) {
            C9GR.A0G(edd.A04);
        } else if (!TextUtils.isEmpty(edd.A03) && !TextUtils.isEmpty(edd.A00)) {
            String str = edd.A03;
            String str2 = edd.A00;
            C193328hC A0I = AbstractC31171DnF.A0I(this.A00);
            if (str != null) {
                A0I.A05 = str;
            }
            A0I.A0r(str2);
            A0I.A07();
            A0I.A0g(null);
            AbstractC166987dD.A1W(A0I);
        } else {
            AbstractC31171DnF.A0z(2131969376);
        }
        C0f9.A0A(-1370760612, A03);
    }

    @Override // X.C1P1
    public void onFail(AbstractC115105If abstractC115105If) {
        String string;
        int A03 = C0f9.A03(695581551);
        if ((abstractC115105If instanceof C115115Ig) && !TextUtils.isEmpty(((EDD) ((C115115Ig) abstractC115105If).A00).A02)) {
            string = ((EDD) abstractC115105If.A00()).A02;
        } else {
            string = this.A00.getString(2131972429);
        }
        C9GR.A0G(string);
        C0f9.A0A(200770783, A03);
    }

    @Override // X.C1P1
    public void onFinish() {
        int A03 = C0f9.A03(-426021182);
        super.onFinish();
        C0f9.A0A(377985985, A03);
    }

    @Override // X.C1P1
    public void onStart() {
        int A03 = C0f9.A03(-420231557);
        super.onStart();
        C0f9.A0A(674034795, A03);
    }

    @Override // X.C1P1
    public /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A03 = C0f9.A03(-433924964);
        A00((EDD) obj);
        C0f9.A0A(-300879432, A03);
    }
}
