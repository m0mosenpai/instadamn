package com.facebookpay.paymentmethod.model;

import X.C59083QWp;
import X.C63470SlB;
import X.QRL;
import android.os.Parcelable;

/* loaded from: classes10.dex */
public final class TokenizedCard extends CreditCard {
    public static final Parcelable.Creator CREATOR = C63470SlB.A00(21);
    public final QRL A00;
    public final C59083QWp A01;
    public final String A02;
    public final String A03;
    public final boolean A04;
    public final boolean A05;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x001d, code lost:
    
        if (X.AbstractC001900j.A0T(r3) != false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public TokenizedCard(X.QRL r6, X.C59083QWp r7, boolean r8, boolean r9) {
        /*
            r5 = this;
            r0 = 1
            int r4 = X.AbstractC167007dF.A06(r0, r6, r7)
            r5.<init>(r6, r8, r9)
            r5.A00 = r6
            r5.A01 = r7
            r5.A05 = r8
            r5.A04 = r9
            java.lang.String r0 = "issuer_card_art_url"
            java.lang.String r3 = r7.A08(r0)
            if (r3 == 0) goto L1f
            boolean r1 = X.AbstractC001900j.A0T(r3)
            r0 = 0
            if (r1 == 0) goto L20
        L1f:
            r0 = 1
        L20:
            r2 = 0
            if (r0 == 0) goto L24
            r3 = r2
        L24:
            r5.A02 = r3
            java.lang.String r0 = "issuer_name"
            java.lang.String r1 = r7.getOptionalStringField(r4, r0)
            if (r1 == 0) goto L35
            boolean r0 = X.AbstractC001900j.A0T(r1)
            if (r0 != 0) goto L35
            r2 = r1
        L35:
            r5.A03 = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebookpay.paymentmethod.model.TokenizedCard.<init>(X.QRL, X.QWp, boolean, boolean):void");
    }
}
