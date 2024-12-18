package X;

/* renamed from: X.RqY, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC61609RqY {
    public final long A01() {
        C62600SIe c62600SIe;
        if (this instanceof R27) {
            SI7 A00 = R27.A00((R27) this);
            if (A00 != null && (c62600SIe = (C62600SIe) AbstractC001800i.A0J(A00.A00.A00)) != null) {
                return c62600SIe.A02;
            }
            return 0L;
        }
        if (this instanceof R26) {
            return ((R26) this).A00.A00.optLong("price_amount_micros");
        }
        C62599SId A002 = ((R25) this).A00.A00();
        if (A002 != null) {
            return A002.A00;
        }
        return 0L;
    }

    public final String A02() {
        C62755SPm c62755SPm;
        String str;
        if (this instanceof R27) {
            R27 r27 = (R27) this;
            MUD mud = r27.A02;
            if (mud == null || (str = mud.A02) == null) {
                c62755SPm = r27.A01;
                str = c62755SPm.A00;
            }
            return str;
        }
        if (this instanceof R26) {
            R26 r26 = (R26) this;
            MUD mud2 = r26.A01;
            if (mud2 == null || (str = mud2.A02) == null) {
                str = r26.A00.A00.optString("productId");
            }
        } else {
            R25 r25 = (R25) this;
            MUD mud3 = r25.A01;
            if (mud3 == null || (str = mud3.A02) == null) {
                c62755SPm = r25.A00;
                str = c62755SPm.A00;
            }
        }
        return str;
        C14360o3.A07(str);
        return str;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String A03() {
        /*
            r2 = this;
            boolean r0 = r2 instanceof X.R27
            if (r0 == 0) goto L20
            r0 = r2
            X.R27 r0 = (X.R27) r0
            X.SI7 r0 = X.R27.A00(r0)
            if (r0 == 0) goto L1d
            X.SAN r0 = r0.A00
            java.util.List r0 = r0.A00
            java.lang.Object r0 = X.AbstractC001800i.A0J(r0)
            X.SIe r0 = (X.C62600SIe) r0
            if (r0 == 0) goto L1d
            java.lang.String r0 = r0.A03
        L1b:
            if (r0 != 0) goto L1f
        L1d:
            java.lang.String r0 = ""
        L1f:
            return r0
        L20:
            boolean r0 = r2 instanceof X.R26
            if (r0 == 0) goto L35
            r0 = r2
            X.R26 r0 = (X.R26) r0
            com.android.billingclient.api.SkuDetails r0 = r0.A00
            org.json.JSONObject r1 = r0.A00
            java.lang.String r0 = "price"
            java.lang.String r0 = r1.optString(r0)
            X.C14360o3.A07(r0)
            return r0
        L35:
            r0 = r2
            X.R25 r0 = (X.R25) r0
            X.SPm r0 = r0.A00
            X.SId r0 = r0.A00()
            if (r0 == 0) goto L1d
            java.lang.String r0 = r0.A01
            goto L1b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC61609RqY.A03():java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:9:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String A04() {
        /*
            r2 = this;
            boolean r0 = r2 instanceof X.R27
            if (r0 == 0) goto L20
            r0 = r2
            X.R27 r0 = (X.R27) r0
            X.SI7 r0 = X.R27.A00(r0)
            if (r0 == 0) goto L1d
            X.SAN r0 = r0.A00
            java.util.List r0 = r0.A00
            java.lang.Object r0 = X.AbstractC001800i.A0J(r0)
            X.SIe r0 = (X.C62600SIe) r0
            if (r0 == 0) goto L1d
            java.lang.String r0 = r0.A04
        L1b:
            if (r0 != 0) goto L1f
        L1d:
            java.lang.String r0 = ""
        L1f:
            return r0
        L20:
            boolean r0 = r2 instanceof X.R26
            if (r0 == 0) goto L35
            r0 = r2
            X.R26 r0 = (X.R26) r0
            com.android.billingclient.api.SkuDetails r0 = r0.A00
            org.json.JSONObject r1 = r0.A00
            java.lang.String r0 = "price_currency_code"
            java.lang.String r0 = r1.optString(r0)
            X.C14360o3.A07(r0)
            return r0
        L35:
            r0 = r2
            X.R25 r0 = (X.R25) r0
            X.SPm r0 = r0.A00
            X.SId r0 = r0.A00()
            if (r0 == 0) goto L1d
            java.lang.String r0 = r0.A02
            goto L1b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC61609RqY.A04():java.lang.String");
    }

    public final String A05() {
        C62755SPm c62755SPm;
        String optString;
        if (this instanceof R27) {
            c62755SPm = ((R27) this).A01;
        } else {
            if (this instanceof R26) {
                optString = ((R26) this).A00.A00.optString("productId");
                C14360o3.A07(optString);
                return optString;
            }
            c62755SPm = ((R25) this).A00;
        }
        optString = c62755SPm.A00;
        C14360o3.A07(optString);
        return optString;
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x000e, code lost:
    
        if (r6.length() == 0) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String A06(java.lang.String r6) {
        /*
            r5 = this;
            boolean r0 = r5 instanceof X.R27
            if (r0 == 0) goto L56
            r4 = r5
            X.R27 r4 = (X.R27) r4
            if (r6 == 0) goto L10
            int r1 = r6.length()
            r0 = 0
            if (r1 != 0) goto L11
        L10:
            r0 = 1
        L11:
            r3 = 0
            if (r0 == 0) goto L1d
            X.SI7 r0 = X.R27.A00(r4)
            if (r0 == 0) goto L1c
        L1a:
            java.lang.String r3 = r0.A02
        L1c:
            return r3
        L1d:
            X.SPm r0 = r4.A01
            java.util.List r0 = r0.A04
            if (r0 == 0) goto L4f
            java.util.Iterator r2 = r0.iterator()
        L27:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L4d
            java.lang.Object r1 = r2.next()
            r0 = r1
            X.SI7 r0 = (X.SI7) r0
            java.lang.String r0 = r0.A01
            boolean r0 = X.C14360o3.A0K(r0, r6)
            if (r0 == 0) goto L27
        L3c:
            X.SI7 r1 = (X.SI7) r1
            if (r1 == 0) goto L4f
            java.lang.String r1 = r1.A02
            if (r1 == 0) goto L4f
            int r0 = r1.length()
            if (r0 == 0) goto L4f
            r4.A00 = r6
            return r1
        L4d:
            r1 = r3
            goto L3c
        L4f:
            X.SI7 r0 = X.R27.A00(r4)
            if (r0 == 0) goto L1c
            goto L1a
        L56:
            r3 = 0
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC61609RqY.A06(java.lang.String):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:62:0x00e2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List A07() {
        /*
            Method dump skipped, instructions count: 324
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC61609RqY.A07():java.util.List");
    }

    public final String toString() {
        String str;
        String str2;
        StringBuilder A1C = AbstractC166987dD.A1C();
        if (this instanceof R26) {
            str = "DcpSkuDetails";
        } else if (this instanceof R25) {
            str = "DcpInAppProductDetails";
        } else if (this instanceof R27) {
            str = "DcpSubsProductDetails";
        } else {
            str = "Unknown";
        }
        A1C.append(str);
        A1C.append("(originalCatalogId='");
        A1C.append(A02());
        A1C.append("', skuId='");
        A1C.append(A05());
        A1C.append("', price='");
        A1C.append(A03());
        A1C.append("', priceAmountMicros=");
        A1C.append(A01());
        A1C.append(", priceCurrencyCode='");
        A1C.append(A04());
        A1C.append("', subscriptionOffers=");
        A1C.append(A07());
        A1C.append(", claimedOfferId=");
        if (this instanceof R27) {
            str2 = ((R27) this).A00;
        } else {
            str2 = null;
        }
        return AbstractC25236BEt.A0Y(str2, A1C);
    }
}
