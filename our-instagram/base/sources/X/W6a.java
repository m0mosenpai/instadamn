package X;

import com.facebookpay.offsite.models.message.W3CShippingAddress;
import com.facebookpay.shippingaddress.model.ShippingAddress;
import java.util.ArrayList;

/* loaded from: classes11.dex */
public abstract class W6a {
    public static final boolean A02(W3CShippingAddress w3CShippingAddress, W3CShippingAddress w3CShippingAddress2) {
        return w3CShippingAddress != null && C14360o3.A0K(w3CShippingAddress.addressLine, w3CShippingAddress2.addressLine) && C14360o3.A0K(w3CShippingAddress.city, w3CShippingAddress2.city) && C14360o3.A0K(w3CShippingAddress.country, w3CShippingAddress2.country) && C14360o3.A0K(w3CShippingAddress.region, w3CShippingAddress2.region) && C14360o3.A0K(w3CShippingAddress.postalCode, w3CShippingAddress2.postalCode) && C14360o3.A0K(w3CShippingAddress.organization, w3CShippingAddress2.organization) && C14360o3.A0K(w3CShippingAddress.recipient, w3CShippingAddress2.recipient);
    }

    public static final W3CShippingAddress A00(ShippingAddress shippingAddress) {
        ArrayList arrayList = new ArrayList();
        String str = shippingAddress.A08;
        if (str != null) {
            arrayList.add(str);
        }
        String str2 = shippingAddress.A09;
        if (str2 != null) {
            arrayList.add(str2);
        }
        if (!arrayList.isEmpty()) {
            String str3 = shippingAddress.A01;
            if (str3 != null) {
                String str4 = shippingAddress.A02;
                if (str4 != null) {
                    String str5 = shippingAddress.A07;
                    if (str5 != null) {
                        String str6 = shippingAddress.A06;
                        if (str6 != null) {
                            return new W3CShippingAddress(arrayList, str3, str4, null, shippingAddress.A05, "", str6, shippingAddress.A00, str5, null);
                        }
                        throw new IllegalStateException("Required value was null.");
                    }
                    throw new IllegalStateException("Required value was null.");
                }
                throw new IllegalStateException("Required value was null.");
            }
            throw new IllegalStateException("Required value was null.");
        }
        throw AbstractC31172DnG.A0u();
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x005b, code lost:
    
        if (r2.contains(com.facebookpay.offsite.models.message.ServerW3CShippingAddressConstants.CITY) == false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0063, code lost:
    
        if (r2.contains(com.facebookpay.offsite.models.message.ServerW3CShippingAddressConstants.COUNTRY) != false) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x006b, code lost:
    
        if (r2.contains(com.facebookpay.offsite.models.message.ServerW3CShippingAddressConstants.REGION) != false) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0073, code lost:
    
        if (r2.contains(com.facebookpay.offsite.models.message.ServerW3CShippingAddressConstants.POSTAL_CODE) != false) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x007b, code lost:
    
        if (r2.contains(com.facebookpay.offsite.models.message.ServerW3CShippingAddressConstants.ORGANIZATION) != false) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0083, code lost:
    
        if (r2.contains(com.facebookpay.offsite.models.message.ServerW3CShippingAddressConstants.RECIPIENT) != false) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0085, code lost:
    
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00c1, code lost:
    
        r3.recipient = r14.A00;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00c5, code lost:
    
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00ba, code lost:
    
        r3.organization = r14.A05;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00be, code lost:
    
        if (r2 == null) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00b3, code lost:
    
        r3.postalCode = r14.A06;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00b7, code lost:
    
        if (r2 == null) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00ac, code lost:
    
        r3.region = r14.A07;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00b0, code lost:
    
        if (r2 == null) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00a5, code lost:
    
        r3.country = r14.A02;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00a9, code lost:
    
        if (r2 == null) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x009e, code lost:
    
        r3.city = r14.A01;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00a2, code lost:
    
        if (r2 == null) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x009b, code lost:
    
        if (r2 != null) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final com.facebookpay.offsite.models.message.W3CShippingAddress A01(com.facebookpay.shippingaddress.model.ShippingAddress r14, java.lang.String r15) {
        /*
            if (r15 == 0) goto L3a
            java.lang.String r3 = r14.A02
            if (r3 == 0) goto L35
            com.facebookpay.offsite.models.message.GsonUtils r0 = com.facebookpay.offsite.models.message.GsonUtils.INSTANCE
            java.util.Map r2 = r0.getToRedactedMap(r15)
            boolean r0 = r2.containsKey(r3)
            java.lang.String r1 = "Required value was null."
            if (r0 == 0) goto L20
            java.lang.Object r0 = r2.get(r3)
            if (r0 != 0) goto L2e
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L20:
            java.lang.String r0 = "Default"
            java.lang.Object r0 = r2.get(r0)
            if (r0 != 0) goto L2e
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L2e:
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.Set r2 = X.AbstractC001800i.A0k(r0)
            goto L3b
        L35:
            java.lang.IllegalStateException r0 = X.AbstractC166997dE.A0g()
            throw r0
        L3a:
            r2 = 0
        L3b:
            r4 = 0
            java.lang.String r9 = ""
            com.facebookpay.offsite.models.message.W3CShippingAddress r3 = new com.facebookpay.offsite.models.message.W3CShippingAddress
            r5 = r4
            r6 = r4
            r7 = r4
            r8 = r4
            r10 = r4
            r11 = r4
            r12 = r4
            r13 = r4
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            if (r2 == 0) goto L86
            java.lang.String r0 = "addr"
            boolean r0 = r2.contains(r0)
            if (r0 != 0) goto L86
        L55:
            java.lang.String r0 = "city"
            boolean r0 = r2.contains(r0)
            if (r0 != 0) goto L9e
        L5d:
            java.lang.String r0 = "ctry"
            boolean r0 = r2.contains(r0)
            if (r0 != 0) goto La5
        L65:
            java.lang.String r0 = "region"
            boolean r0 = r2.contains(r0)
            if (r0 != 0) goto Lac
        L6d:
            java.lang.String r0 = "zip"
            boolean r0 = r2.contains(r0)
            if (r0 != 0) goto Lb3
        L75:
            java.lang.String r0 = "org"
            boolean r0 = r2.contains(r0)
            if (r0 != 0) goto Lba
        L7d:
            java.lang.String r0 = "recp"
            boolean r0 = r2.contains(r0)
            if (r0 != 0) goto Lc1
            return r3
        L86:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.lang.String r0 = r14.A08
            if (r0 == 0) goto L92
            r1.add(r0)
        L92:
            java.lang.String r0 = r14.A09
            if (r0 == 0) goto L99
            r1.add(r0)
        L99:
            r3.addressLine = r1
            if (r2 == 0) goto L9e
            goto L55
        L9e:
            java.lang.String r0 = r14.A01
            r3.city = r0
            if (r2 == 0) goto La5
            goto L5d
        La5:
            java.lang.String r0 = r14.A02
            r3.country = r0
            if (r2 == 0) goto Lac
            goto L65
        Lac:
            java.lang.String r0 = r14.A07
            r3.region = r0
            if (r2 == 0) goto Lb3
            goto L6d
        Lb3:
            java.lang.String r0 = r14.A06
            r3.postalCode = r0
            if (r2 == 0) goto Lba
            goto L75
        Lba:
            java.lang.String r0 = r14.A05
            r3.organization = r0
            if (r2 == 0) goto Lc1
            goto L7d
        Lc1:
            java.lang.String r0 = r14.A00
            r3.recipient = r0
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.W6a.A01(com.facebookpay.shippingaddress.model.ShippingAddress, java.lang.String):com.facebookpay.offsite.models.message.W3CShippingAddress");
    }
}
