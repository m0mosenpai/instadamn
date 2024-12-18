package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.Fxi, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36168Fxi implements C5GZ {
    public final /* synthetic */ C32339EMl A00;

    @Override // X.C5GZ
    public final void E0N(C3OO c3oo) {
        C14360o3.A0B(c3oo, 0);
        int bindingAdapterPosition = c3oo.getBindingAdapterPosition();
        C32339EMl c32339EMl = this.A00;
        C31811DyV c31811DyV = (C31811DyV) c32339EMl.A03.getValue();
        String A0t = AbstractC25231BEo.A0t(c31811DyV.A00.A02(c31811DyV.A01));
        UserSession A0r = AbstractC166987dD.A0r(c32339EMl.A02);
        C14360o3.A0B(A0r, 2);
        FAI.A00(c32339EMl, A0r, "impression", "address", "viewer", "ig_addresses_consumption_bottom_sheet", A0t, AbstractC167007dF.A0n("index", String.valueOf(bindingAdapterPosition)));
    }

    public C36168Fxi(C32339EMl c32339EMl) {
        this.A00 = c32339EMl;
    }
}
