package X;

import android.content.Context;
import android.view.View;
import android.view.ViewStub;
import com.facebook.R;
import com.instagram.user.model.User;

/* renamed from: X.KiP, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC46524KiP {
    public InterfaceC50429MOj A00;

    public void A02() {
        if (this instanceof JU8) {
            JU8 ju8 = (JU8) this;
            AbstractC25651Mw.A00(ju8.A05).A02(ju8.A04, C2Io.class);
        }
    }

    public void A03() {
        JU8 ju8;
        C2EC c2ec;
        C2EC c2ec2;
        InterfaceC50428MOi interfaceC50428MOi;
        if ((this instanceof JU8) && (c2ec = (ju8 = (JU8) this).A02) != null) {
            if (ju8.A08(c2ec, false) && (c2ec2 = ju8.A02) != null && c2ec2.CWO() && (interfaceC50428MOi = ju8.A00) != null) {
                interfaceC50428MOi.EJ0(ju8);
            }
            AbstractC25651Mw.A00(ju8.A05).A01(ju8.A04, C2Io.class);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:55:0x0162, code lost:
    
        if (r0 == null) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0164, code lost:
    
        r8 = "directThreadAnalyticsParams";
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x023e, code lost:
    
        if (r0 == null) goto L46;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void A04(boolean r11) {
        /*
            Method dump skipped, instructions count: 959
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC46524KiP.A04(boolean):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:6:0x000c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean A05() {
        /*
            r3 = this;
            boolean r0 = r3 instanceof X.JU6
            if (r0 == 0) goto L14
            r0 = r3
            X.JU6 r0 = (X.JU6) r0
            android.view.ViewStub r0 = r0.A00
        L9:
            r2 = 0
        La:
            if (r0 == 0) goto L13
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L13
        L12:
            r2 = 1
        L13:
            return r2
        L14:
            boolean r0 = r3 instanceof X.JU5
            if (r0 == 0) goto L1e
            r0 = r3
            X.JU5 r0 = (X.JU5) r0
            boolean r2 = r0.A04
            return r2
        L1e:
            boolean r0 = r3 instanceof X.JU4
            if (r0 == 0) goto L28
            r0 = r3
            X.JU4 r0 = (X.JU4) r0
            android.view.ViewStub r0 = r0.A00
            goto L9
        L28:
            boolean r0 = r3 instanceof X.JU1
            if (r0 == 0) goto L32
            r0 = r3
            X.JU1 r0 = (X.JU1) r0
            boolean r2 = r0.A07
            return r2
        L32:
            boolean r0 = r3 instanceof X.JU8
            if (r0 == 0) goto L51
            r0 = r3
            X.JU8 r0 = (X.JU8) r0
            X.L1U r0 = r0.A01
            r2 = 0
            if (r0 == 0) goto L13
            X.2jc r1 = r0.A00
            boolean r0 = r1.A04()
            if (r0 != 0) goto L7a
            android.view.ViewStub r0 = r1.A01
            if (r0 != 0) goto La
            java.lang.String r0 = "view stub is unexpectedly null!"
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A14(r0)
            throw r0
        L51:
            boolean r0 = r3 instanceof X.KRC
            if (r0 == 0) goto L5b
            r0 = r3
            X.KRC r0 = (X.KRC) r0
            boolean r2 = r0.A01
            return r2
        L5b:
            boolean r0 = r3 instanceof X.KRB
            if (r0 == 0) goto L12
            r0 = r3
            X.KRB r0 = (X.KRB) r0
            X.KwQ r0 = r0.A00
            r2 = 0
            if (r0 == 0) goto L13
            X.2jc r1 = r0.A00
            boolean r0 = r1.A04()
            if (r0 != 0) goto L7a
            android.view.ViewStub r0 = r1.A01
            if (r0 != 0) goto La
            java.lang.String r0 = "ViewStubHolder#getViewStub should not return null.\nUnderlying private field 'mViewStub' is internally managed by ViewStubHolder and can be\nset to null regardless of the fact that we initially passed a non-null constructor param value."
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A14(r0)
            throw r0
        L7a:
            android.view.View r0 = r1.A01()
            X.C14360o3.A0A(r0)
            goto La
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC46524KiP.A05():boolean");
    }

    public View A06(Context context) {
        C7X c7x;
        C57012jc c57012jc;
        String string;
        if (this instanceof JUB) {
            JUB jub = (JUB) this;
            C14360o3.A0B(context, 0);
            View inflate = View.inflate(context, R.layout.condensed_generic_v3_megaphone, null);
            int[] iArr = C47922LEr.A05;
            int i = 0;
            do {
                AbstractC13880nE.A0P(inflate.findViewById(iArr[i]));
                i++;
            } while (i < 4);
            C14360o3.A0A(inflate);
            C47922LEr c47922LEr = new C47922LEr(inflate, jub);
            jub.A01 = c47922LEr;
            return c47922LEr.A00;
        }
        if (this instanceof C43699JUj) {
            C43699JUj c43699JUj = (C43699JUj) this;
            C14360o3.A0B(context, 0);
            C45078Jx7 c45078Jx7 = c43699JUj.A01;
            if (c45078Jx7 != null) {
                View inflate2 = View.inflate(context, R.layout.generic_v3_megaphone, null);
                int[] iArr2 = LI8.A05;
                int i2 = 0;
                do {
                    AbstractC13880nE.A0P(inflate2.findViewById(iArr2[i2]));
                    i2++;
                } while (i2 < 4);
                C14360o3.A0A(inflate2);
                LI8 li8 = new LI8(inflate2, c43699JUj, c45078Jx7);
                c43699JUj.A00 = li8;
                return li8.A00;
            }
            throw AbstractC166987dD.A14("Required value was null.");
        }
        if (this instanceof JU6) {
            JU6 ju6 = (JU6) this;
            C14360o3.A0B(context, 0);
            ju6.A00 = new ViewStub(context);
            KXR kxr = new KXR();
            kxr.A07 = context.getString(2131973305);
            kxr.A03 = Float.valueOf(context.getResources().getDimension(R.dimen.account_group_management_row_text_size));
            kxr.A04 = context.getString(2131973304);
            kxr.A05 = context.getString(2131968948);
            kxr.A01 = 0;
            kxr.A06 = context.getString(2131953639);
            kxr.A02 = 2;
            kxr.A00 = 0;
            kxr.A08 = true;
            ViewStub viewStub = ju6.A00;
            if (viewStub != null) {
                AbstractC47890LDk.A00(viewStub, ju6.A07, kxr);
                ViewStub viewStub2 = ju6.A00;
                if (viewStub2 != null) {
                    return viewStub2;
                }
                throw AbstractC166987dD.A14("Required value was null.");
            }
            throw AbstractC166987dD.A14("Required value was null.");
        }
        if (!(this instanceof JU5)) {
            if (this instanceof JU4) {
                JU4 ju4 = (JU4) this;
                C14360o3.A0B(context, 0);
                ju4.A00 = new ViewStub(context);
                KXR kxr2 = new KXR();
                kxr2.A07 = context.getString(2131971527);
                kxr2.A03 = Float.valueOf(context.getResources().getDimension(R.dimen.account_group_management_row_text_size));
                kxr2.A04 = context.getString(2131971536);
                kxr2.A05 = context.getString(2131953639);
                kxr2.A01 = 0;
                User user = ju4.A04;
                if (user != null) {
                    if (!user.CQf()) {
                        User user2 = ju4.A04;
                        if (user2 != null) {
                            string = AbstractC31178DnM.A0c(context, user2, 2131971528);
                        }
                    } else {
                        string = context.getString(2131968948);
                    }
                    kxr2.A06 = string;
                    kxr2.A02 = 2;
                    kxr2.A00 = 0;
                    kxr2.A08 = true;
                    ViewStub viewStub3 = ju4.A00;
                    if (viewStub3 != null) {
                        AbstractC47890LDk.A00(viewStub3, ju4.A0B, kxr2);
                        ViewStub viewStub4 = ju4.A00;
                        if (viewStub4 != null) {
                            return viewStub4;
                        }
                        throw AbstractC166987dD.A14("Required value was null.");
                    }
                    throw AbstractC166987dD.A14("Required value was null.");
                }
                C14360o3.A0F("sender");
                throw C00O.createAndThrow();
            }
            if (!(this instanceof JU1)) {
                if (this instanceof JU8) {
                    JU8 ju8 = (JU8) this;
                    C14360o3.A0B(context, 0);
                    InterfaceC50487MQp interfaceC50487MQp = ju8.A06;
                    C14360o3.A0B(interfaceC50487MQp, 1);
                    L1U l1u = new L1U(new ViewStub(context), interfaceC50487MQp);
                    ju8.A01 = l1u;
                    c57012jc = l1u.A00;
                    if (!c57012jc.A04()) {
                        ViewStub viewStub5 = c57012jc.A01;
                        if (viewStub5 != null) {
                            return viewStub5;
                        }
                        throw AbstractC166987dD.A14("view stub is unexpectedly null!");
                    }
                } else if (!(this instanceof KRC)) {
                    KRB krb = (KRB) this;
                    C14360o3.A0B(context, 0);
                    ViewStub viewStub6 = new ViewStub(context);
                    String str = krb.A0I;
                    String str2 = krb.A0H;
                    String str3 = krb.A0D;
                    if (krb.A0A == EnumC46205Kch.A0G) {
                        c7x = C7X.A06;
                    } else {
                        c7x = krb.A07;
                    }
                    String str4 = krb.A0F;
                    C47375KwQ c47375KwQ = new C47375KwQ(viewStub6, krb.A06, c7x, krb.A08, new C49510LuP(krb), str, str2, str3, str4);
                    krb.A00 = c47375KwQ;
                    c57012jc = c47375KwQ.A00;
                    if (!c57012jc.A04()) {
                        ViewStub viewStub7 = c57012jc.A01;
                        if (viewStub7 != null) {
                            return viewStub7;
                        }
                        throw AbstractC166987dD.A14("ViewStubHolder#getViewStub should not return null.\nUnderlying private field 'mViewStub' is internally managed by ViewStubHolder and can be\nset to null regardless of the fact that we initially passed a non-null constructor param value.");
                    }
                }
                View A01 = c57012jc.A01();
                C14360o3.A0A(A01);
                return A01;
            }
        }
        C14360o3.A0B(context, 0);
        View view = new View(context);
        view.setVisibility(8);
        return view;
    }

    /* JADX WARN: Code restructure failed: missing block: B:140:0x02b6, code lost:
    
        if (r1 != 1003) goto L155;
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x02c2, code lost:
    
        if (X.JUW.A01(r13) == false) goto L155;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void A07(X.InterfaceC50428MOi r20, X.InterfaceC37159GYw r21, X.C2EC r22, java.lang.String r23, boolean r24) {
        /*
            Method dump skipped, instructions count: 811
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC46524KiP.A07(X.MOi, X.GYw, X.2EC, java.lang.String, boolean):void");
    }
}
