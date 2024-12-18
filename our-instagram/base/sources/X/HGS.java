package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* loaded from: classes7.dex */
public abstract class HGS extends C1P1 {
    public final Context A00;
    public final UserSession A01;
    public final C38321qM A02;
    public final Integer A03;
    public final C6WQ A04;

    public HGS(Context context, UserSession userSession, C38321qM c38321qM) {
        Integer num;
        this.A02 = c38321qM;
        this.A01 = userSession;
        this.A00 = context;
        this.A04 = new C6WQ(context);
        if (this instanceof C39134HKn) {
            num = C05F.A0C;
        } else {
            if (!(this instanceof C39133HKm)) {
                C38321qM c38321qM2 = this.A02;
                if (c38321qM2.A5g() || c38321qM2.A0C.BAo() != null || c38321qM2.A0C.Bns() != null) {
                    num = C05F.A01;
                }
            }
            num = C05F.A00;
        }
        this.A03 = num;
    }

    @Override // X.C1P1
    public void onFail(AbstractC115105If abstractC115105If) {
        int i;
        int A03 = C0f9.A03(-1594559832);
        Context context = this.A00;
        if (this instanceof C39134HKn) {
            i = 2131971625;
        } else if (this instanceof C39133HKm) {
            i = 2131963448;
        } else {
            i = 2131957680;
            if (this.A02.A60()) {
                i = 2131957697;
            }
        }
        C9GR.A0F(context, "edit_media_callback_failure", i);
        C0f9.A0A(368184900, A03);
    }

    @Override // X.C1P1
    public void onFinish() {
        int A03 = C0f9.A03(-1999385497);
        this.A04.dismiss();
        C0f9.A0A(1316591152, A03);
    }

    @Override // X.C1P1
    public final void onStart() {
        Context context;
        int i;
        int A03 = C0f9.A03(1350833840);
        C6WQ c6wq = this.A04;
        int intValue = this.A03.intValue();
        if (intValue != 0) {
            if (intValue != 1) {
                context = this.A00;
                i = 2131976309;
                if (intValue != 2) {
                    i = 2131963560;
                }
            } else {
                context = this.A00;
                i = 2131972339;
            }
        } else {
            context = this.A00;
            i = 2131957732;
        }
        c6wq.A00(context.getString(i));
        C0fJ.A00(c6wq);
        C0f9.A0A(-1931160970, A03);
    }

    @Override // X.C1P1
    public void onSuccess(Object obj) {
        int A03 = C0f9.A03(791900889);
        this.A02.AEH(this.A01);
        C0f9.A0A(2097192265, A03);
    }
}
