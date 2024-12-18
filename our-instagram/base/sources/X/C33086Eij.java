package X;

import android.os.Bundle;
import android.os.Handler;
import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;
import com.instagram.registration.model.RegFlowExtras;
import com.instagram.user.model.User;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.regex.Pattern;

/* renamed from: X.Eij, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C33086Eij extends AbstractC32549EUz {
    public final /* synthetic */ Handler A00;
    public final /* synthetic */ AbstractC59962oe A01;
    public final /* synthetic */ InterfaceC11380iw A02;
    public final /* synthetic */ C006802i A03;
    public final /* synthetic */ C07270a1 A04;
    public final /* synthetic */ GY4 A05;
    public final /* synthetic */ RegFlowExtras A06;
    public final /* synthetic */ EnumC33445EqI A07;
    public final /* synthetic */ Integer A08;
    public final /* synthetic */ AtomicInteger A09;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C33086Eij(Handler handler, Fragment fragment, AbstractC59962oe abstractC59962oe, InterfaceC11380iw interfaceC11380iw, C006802i c006802i, C07270a1 c07270a1, C07270a1 c07270a12, GY4 gy4, GY6 gy6, RegFlowExtras regFlowExtras, RegFlowExtras regFlowExtras2, EnumC33445EqI enumC33445EqI, EnumC33445EqI enumC33445EqI2, Integer num, Integer num2, String str, AtomicInteger atomicInteger, boolean z, boolean z2) {
        super(fragment, c07270a1, gy6, regFlowExtras, enumC33445EqI, num, str, z, z2, false);
        this.A05 = gy4;
        this.A03 = c006802i;
        this.A01 = abstractC59962oe;
        this.A06 = regFlowExtras2;
        this.A02 = interfaceC11380iw;
        this.A00 = handler;
        this.A07 = enumC33445EqI2;
        this.A09 = atomicInteger;
        this.A04 = c07270a12;
        this.A08 = num2;
    }

    @Override // X.AbstractC32549EUz
    public final void A02(EDQ edq) {
        String errorMessage;
        int i;
        int A03 = C0f9.A03(1757102981);
        GY4 gy4 = this.A05;
        if (gy4 != null && !edq.A04 && edq.A05) {
            C006802i c006802i = this.A03;
            c006802i.markerAnnotate(4197923, "reg_existing_login", true);
            c006802i.markerEnd(4197923, (short) 3);
            C33629Etf c33629Etf = super.A04;
            if (c33629Etf != null && c33629Etf.A02) {
                c33629Etf.A00();
            }
            String A0h = AbstractC31171DnF.A0h(AbstractC31189DnY.A01(), edq.A03);
            Pattern pattern = AbstractC13670mt.A01;
            if (A0h == null) {
                A0h = "";
            }
            String A0h2 = AbstractC31171DnF.A0h("profile_pic_url", edq.A03);
            if (A0h2 == null) {
                A0h2 = "";
            }
            gy4.EjS(A0h, A0h2);
        } else if (edq.A04 && edq.A01 != null) {
            this.A03.markerPoint(4197923, "account_creation_success");
            super.A02(edq);
        } else {
            AbstractC59962oe abstractC59962oe = this.A01;
            if (abstractC59962oe.getContext() == null) {
                C0w9.A03("Show error message when user is not returned from server during account creation", "Context is null");
                i = -800542966;
                C0f9.A0A(i, A03);
            } else {
                this.A03.markerEnd(4197923, (short) 3);
                if (edq.getErrorMessage() == null) {
                    errorMessage = abstractC59962oe.getContext().getString(2131968430);
                } else {
                    errorMessage = edq.getErrorMessage();
                }
                A04(errorMessage, C05F.A00);
            }
        }
        i = 467338185;
        C0f9.A0A(i, A03);
    }

    @Override // X.AbstractC32549EUz
    public final void A03(User user) {
        super.A03(user);
        RegFlowExtras regFlowExtras = this.A06;
        regFlowExtras.A0Y = user.getId();
        Bundle A09 = AbstractC31176DnK.A09(user.getId());
        A09.putBoolean("IS_SIGN_UP_FLOW", true);
        UserSession A0G = AbstractC31171DnF.A0G(A09);
        if (regFlowExtras.A0w) {
            C83743oJ A01 = C83743oJ.A01(A0G);
            String id = user.getId();
            A01.A09(this.A01.getContext(), this.A02, A0G, C05F.A1I, id, true);
        }
        this.A00.post(new GOV(this, user));
    }

    @Override // X.AbstractC32549EUz, X.C1P1
    public final void onStart() {
        int A03 = C0f9.A03(1953212707);
        AtomicInteger atomicInteger = this.A09;
        if (atomicInteger.get() == 1) {
            super.onStart();
        }
        FD9.A00(this.A04, this.A07, this.A08, Integer.valueOf(atomicInteger.get()), AbstractC34292FAm.A00(AbstractC35794FrW.A00()));
        C0f9.A0A(766946075, A03);
    }

    @Override // X.AbstractC32549EUz, X.C1P1
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A03 = C0f9.A03(1963038150);
        A02((EDQ) obj);
        C0f9.A0A(404387296, A03);
    }
}
