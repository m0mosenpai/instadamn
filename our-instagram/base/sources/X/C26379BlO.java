package X;

import android.content.Context;
import android.graphics.Typeface;
import com.facebook.R;

/* renamed from: X.BlO, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26379BlO extends AbstractC51572Yf {
    public final C120985dq A00;
    public final InterfaceC31137Dmc A01;
    public final C37644Ghd A02;

    public C26379BlO(C120985dq c120985dq, C37644Ghd c37644Ghd, InterfaceC31137Dmc interfaceC31137Dmc) {
        C14360o3.A0B(interfaceC31137Dmc, 3);
        this.A00 = c120985dq;
        this.A02 = c37644Ghd;
        this.A01 = interfaceC31137Dmc;
    }

    @Override // X.AbstractC51572Yf
    public final AbstractC50812Vc A0Y(C76223bS c76223bS) {
        String A0u;
        boolean A1Z = AbstractC25225BEi.A1Z(c76223bS);
        long A0D = AbstractC77623dm.A0D(c76223bS, R.dimen.album_preview_add_item_margin);
        long A0D2 = AbstractC77623dm.A0D(c76223bS, R.dimen.album_preview_add_item_margin);
        C51722Yv A00 = C9CU.A00(null, C05F.A0u, A1Z ? 1 : 0, A0D);
        Integer num = C05F.A1F;
        C51722Yv A002 = C9CU.A00(A00, num, A1Z ? 1 : 0, A0D2);
        Integer num2 = C05F.A00;
        C51722Yv A0d = AbstractC25230BEn.A0d(A002, num2, 100.0f, A1Z ? 1 : 0);
        C2Z0 A12 = AbstractC25232BEp.A12(c76223bS);
        if (this.A02.A0C == EnumC39535Hd6.A02) {
            long A0A = AbstractC77623dm.A0A(A12);
            Integer num3 = C05F.A08;
            C51722Yv A003 = C9CU.A00(null, num3, A1Z ? 1 : 0, A0A);
            Context A004 = AbstractC77363dM.A00(A12);
            C120985dq c120985dq = this.A00;
            C14360o3.A0B(c120985dq, 1);
            if (c120985dq.CdW()) {
                A0u = AnonymousClass001.A0T(A004.getString(2131975675), A004.getString(2131975658), ' ');
            } else {
                A0u = AbstractC25227BEk.A0u(A004, 2131956198);
            }
            C2XE c2xe = A12.A00;
            Context context = c2xe.A0C;
            int A04 = AbstractC25228BEl.A04(context, A12);
            long A0D3 = AbstractC77623dm.A0D(A12, R.dimen.account_group_management_row_text_size);
            Typeface typeface = Typeface.DEFAULT;
            long A0D4 = AbstractC25229BEm.A0D();
            C77723dw A0a = AbstractC25231BEo.A0a(c2xe, null, A0u, A1Z ? 1 : 0);
            AbstractC25233BEq.A1B(A12, A0a, A04, A0D3);
            A0a.A0S(A1Z ? 1 : 0);
            AbstractC25234BEr.A0o(typeface, A12, A0a, A0D4);
            A0a.A0B();
            AbstractC25234BEr.A1J(A0a, num2, A1Z, true);
            AbstractC77743dy.A00(A0a, A003);
            AbstractC25227BEk.A1J(A12, A0a);
            C51722Yv A16 = AbstractC25232BEp.A16(C9CU.A00(C9CU.A00(null, num3, A1Z ? 1 : 0, AbstractC77623dm.A0A(A12)), C05F.A06, A1Z ? 1 : 0, AbstractC77623dm.A0A(A12)), num, DRX.A00(this, 14));
            String A0F = AbstractC77623dm.A0F(A12, 2131976066);
            int A02 = A12.BoZ().A02(AbstractC53242c7.A0C(context));
            long A0D5 = AbstractC77623dm.A0D(A12, R.dimen.account_group_management_row_text_size);
            C77723dw A0a2 = AbstractC25231BEo.A0a(c2xe, null, A0F, A1Z ? 1 : 0);
            AbstractC25233BEq.A1B(A12, A0a2, A02, A0D5);
            A0a2.A0S(A1Z ? 1 : 0);
            AbstractC25234BEr.A0o(typeface, A12, A0a2, A0D4);
            A0a2.A0X(num2);
            AbstractC25234BEr.A1J(A0a2, num2, A1Z, true);
            AbstractC77743dy.A00(A0a2, A16);
            AbstractC25227BEk.A1J(A12, A0a2);
        }
        return AbstractC76963ci.A01(A12, c76223bS, A0d);
    }
}
