package X;

import com.google.gson.Gson;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;

/* renamed from: X.ESy, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32498ESy extends C1P1 {
    public final /* synthetic */ C2AC A00;

    public C32498ESy(C2AC c2ac) {
        this.A00 = c2ac;
    }

    @Override // X.C1P1
    public final /* bridge */ /* synthetic */ void onSuccessInBackground(Object obj) {
        int A03 = C0f9.A03(1862163441);
        C32203ECy c32203ECy = (C32203ECy) obj;
        int A032 = C0f9.A03(1983716255);
        super.onSuccessInBackground(c32203ECy);
        if (c32203ECy != null) {
            ArrayList A1F = AbstractC166987dD.A1F(c32203ECy.A02);
            UserSession userSession = this.A00.A00.A02;
            AnonymousClass282 anonymousClass282 = AnonymousClass280.A01;
            C14360o3.A0B(userSession, 0);
            String A0B = new Gson().A0B(A1F);
            InterfaceC19610xo A0e = AbstractC31174DnI.A0e(userSession, anonymousClass282);
            A0e.E7K("AGGREGATED_TIME_SPENT_PER_DAY", A0B);
            A0e.apply();
            ArrayList A1F2 = AbstractC166987dD.A1F(c32203ECy.A00);
            ArrayList A1F3 = AbstractC166987dD.A1F(c32203ECy.A01);
            int size = A1F2.size();
            for (int i = 0; i < size; i++) {
                String obj2 = A1F2.get(i).toString();
                long A0N = AbstractC166987dD.A0N(A1F3.get(i));
                C14360o3.A0B(obj2, 1);
                InterfaceC19610xo A0e2 = AbstractC31174DnI.A0e(userSession, anonymousClass282);
                A0e2.E7G(AnonymousClass001.A0R("AGGREGATED_SCREEN_TIME_BY_SCREEN_", obj2), A0N);
                A0e2.apply();
            }
        }
        C455127l c455127l = this.A00.A00;
        UserSession userSession2 = c455127l.A02;
        C461329x.A02(userSession2, null, C05F.A0T, null, Long.valueOf(C461529z.A00()), Long.valueOf(AbstractC31176DnK.A03(c455127l, userSession2)), null, null);
        C455127l.A0K(c455127l, C455127l.A00(c455127l));
        C0f9.A0A(265305713, A032);
        C0f9.A0A(-1330608461, A03);
    }

    @Override // X.C1P1
    public final void onFailInBackground(AbstractC115105If abstractC115105If) {
        String str;
        int A03 = C0f9.A03(66187698);
        super.onFailInBackground(abstractC115105If);
        C455127l c455127l = this.A00.A00;
        UserSession userSession = c455127l.A02;
        long A0P = c455127l.A0P();
        Object A00 = abstractC115105If.A00();
        if (A00 != null) {
            str = ((C40781ul) A00).getErrorMessage();
        } else {
            str = null;
        }
        C14360o3.A0B(userSession, 0);
        C461329x.A02(userSession, null, C05F.A0U, null, Long.valueOf(C461529z.A00()), Long.valueOf(A0P), null, AbstractC167007dF.A0n(AbstractC43591JPw.A00(77), str));
        C455127l.A0K(c455127l, C455127l.A00(c455127l));
        C0f9.A0A(-1777585203, A03);
    }
}
