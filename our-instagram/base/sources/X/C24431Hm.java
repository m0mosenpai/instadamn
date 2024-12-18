package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import java.util.Map;

/* renamed from: X.1Hm, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C24431Hm implements InterfaceC11590jI {
    public String A00;
    public String A01;
    public String A02;
    public Boolean A03 = false;
    public final InterfaceC19630xq A04;
    public final String A05;
    public final boolean A06;
    public final AbstractC12990ll A07;

    public static C24431Hm A00(final AbstractC12990ll abstractC12990ll) {
        return (C24431Hm) abstractC12990ll.A01(C24431Hm.class, new InterfaceC16820sZ() { // from class: X.1Hn
            @Override // X.InterfaceC16820sZ
            public final Object invoke() {
                AbstractC12990ll abstractC12990ll2 = AbstractC12990ll.this;
                Context context = AbstractC12290kX.A00;
                Map map = C1FE.A09;
                return new C24431Hm(abstractC12990ll2, new C1FF(context, "WwwClaimHeaderPrefs").A00());
            }
        });
    }

    private void A01() {
        if (!this.A03.booleanValue() && this.A06) {
            String A02 = AbstractC03270Dk.A02(this.A07);
            String str = this.A05;
            if (str == null || A02 == null || !A02.equals(str)) {
                String str2 = "empty";
                String str3 = "not_empty";
                if (AbstractC116315Ok.A00(str)) {
                    str3 = "empty";
                }
                if (!AbstractC116315Ok.A00(A02)) {
                    str2 = "not_empty";
                }
                this.A03 = true;
                C0w9.A04("claim_userid_null", AnonymousClass001.A0u("mUserId=", str3, " userId=", str2), 1);
            }
        }
    }

    public final void A02(String str) {
        if (!str.equals(this.A02)) {
            this.A02 = str;
            A01();
            String str2 = this.A05;
            if (this.A06 && str2 != null) {
                InterfaceC19610xo ARD = this.A04.ARD();
                ARD.E7K(str2, str);
                ARD.apply();
            }
            if (!"0".equals(this.A02)) {
                this.A01 = null;
            }
        }
    }

    public C24431Hm(AbstractC12990ll abstractC12990ll, InterfaceC19630xq interfaceC19630xq) {
        this.A07 = abstractC12990ll;
        this.A06 = abstractC12990ll instanceof UserSession;
        this.A05 = AbstractC03270Dk.A02(abstractC12990ll);
        this.A04 = interfaceC19630xq;
        A01();
        String str = this.A05;
        if (this.A06 && str != null) {
            this.A02 = this.A04.getString(str, null);
            this.A00 = "loadHeader3_init";
        } else {
            this.A01 = "loadHeader3_missing";
        }
    }
}
