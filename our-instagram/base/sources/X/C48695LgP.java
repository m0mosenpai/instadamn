package X;

import android.content.Context;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;

/* renamed from: X.LgP, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C48695LgP implements InterfaceC50514MRr {
    public final Context A00;
    public final UserSession A01;
    public final boolean A02;
    public final boolean A03;
    public final boolean A04;
    public final boolean A05;
    public final boolean A06;
    public final boolean A07;

    @Override // X.InterfaceC50514MRr
    public final C09530e4 Brh(C45104JxY c45104JxY) {
        ArrayList A12 = AbstractC166997dE.A12(c45104JxY, 0);
        if (this.A06) {
            if (this.A02 && this.A07) {
                A12.add(KJ1.A01);
            }
            if (AbstractC167007dF.A1X(c45104JxY.A00, C05F.A00)) {
                if (this.A04) {
                    if (C18U.A06(C06090Tz.A05, this.A01, 36321992961566660L)) {
                        A12.add(KJ2.A01);
                    }
                }
                if (c45104JxY.A07) {
                    A12.add(KJ0.A01);
                }
                if (c45104JxY.A0A) {
                    A12.add(KJ4.A01);
                }
                if (c45104JxY.A09) {
                    A12.add(KJ3.A01);
                }
            }
        }
        if (this.A03 && AbstractC167007dF.A1X(c45104JxY.A00, C05F.A00)) {
            A12.add(C45660KIx.A00);
        }
        if (this.A05 && AbstractC167007dF.A1X(c45104JxY.A00, C05F.A00)) {
            A12.add(C45661KIy.A00);
        }
        return AbstractC166987dD.A1L(null, A12);
    }

    @Override // X.InterfaceC50514MRr
    public final boolean Ei7(C45104JxY c45104JxY) {
        return true;
    }

    @Override // X.InterfaceC50514MRr
    public final C51753Mtc BEM(int i) {
        return KQB.A00(C05F.A01, C05F.A0N, this.A00.getString(2131960405), R.drawable.instagram_add_pano_outline_24, i);
    }

    public C48695LgP(Context context, UserSession userSession, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        this.A00 = context;
        this.A01 = userSession;
        this.A06 = z;
        this.A02 = z2;
        this.A07 = z3;
        this.A04 = z4;
        this.A03 = z5;
        this.A05 = z6;
    }
}
