package X;

import android.content.Context;
import com.instagram.user.model.User;

/* renamed from: X.GBd, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36579GBd implements GZM {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ GBV A01;
    public final /* synthetic */ User A02;
    public final /* synthetic */ String A03;

    public C36579GBd(Context context, GBV gbv, User user, String str) {
        this.A01 = gbv;
        this.A02 = user;
        this.A00 = context;
        this.A03 = str;
    }

    @Override // X.GZM
    public final void DWo() {
        GBV.A01(this.A00, this.A01, this.A02, this.A03);
    }

    @Override // X.GZM
    public final void E0k() {
        String BIO = this.A02.A03.BIO();
        if (BIO != null) {
            GBV.A05(this.A01, BIO, this.A03);
        }
    }
}
