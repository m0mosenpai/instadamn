package X;

import android.content.Context;
import android.content.res.Resources;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* loaded from: classes6.dex */
public final class FRc {
    public Integer A00;
    public final Context A01;
    public final UserSession A02;
    public final GXO A03;
    public final FFD A04;
    public final FKM A05;
    public final C81613kW A06;
    public final C1118752z A07;
    public final String A08;
    public final List A09;
    public final boolean A0A;
    public final boolean A0B;

    public /* synthetic */ FRc(Context context, UserSession userSession, GXO gxo, FKM fkm, C81613kW c81613kW, C1118752z c1118752z, String str, boolean z, boolean z2) {
        C14360o3.A0B(userSession, 0);
        FFD ffd = (FFD) userSession.A01(FFD.class, new MHL(userSession, 12));
        AbstractC167007dF.A1J(str, 3, ffd);
        this.A02 = userSession;
        this.A01 = context;
        this.A08 = str;
        this.A06 = c81613kW;
        this.A07 = c1118752z;
        this.A05 = fkm;
        this.A0A = z;
        this.A0B = z2;
        this.A04 = ffd;
        this.A03 = gxo;
        this.A09 = AbstractC166987dD.A1E();
    }

    public final void A02(boolean z, boolean z2) {
        Integer num;
        Integer num2;
        List<FKM> A02;
        int i;
        long j;
        String A0k;
        int i2;
        int i3;
        int i4;
        Integer num3;
        Integer num4;
        FKM fkm = null;
        C1118752z c1118752z = this.A07;
        if (z) {
            if (c1118752z != null && (num4 = c1118752z.A02) != null) {
                i3 = num4.intValue();
            } else {
                i3 = -1;
            }
            num = Integer.valueOf(i3);
            if (c1118752z != null && (num3 = c1118752z.A03) != null) {
                i4 = num3.intValue();
            } else {
                i4 = -1;
            }
            num2 = Integer.valueOf(i4);
        } else if (c1118752z != null) {
            num = c1118752z.A02;
            num2 = c1118752z.A03;
        } else {
            num = null;
            num2 = null;
        }
        boolean z3 = false;
        if (num != null) {
            int intValue = num.intValue();
            fkm = new FKM(num2, intValue, AbstractC25230BEn.A1S(intValue, -1));
        }
        Context context = this.A01;
        UserSession userSession = this.A02;
        C81613kW c81613kW = this.A06;
        if (this.A0A) {
            A02 = C35224FgH.A01(userSession);
        } else {
            A02 = C35224FgH.A02(userSession, c81613kW);
        }
        if (fkm != null && (((i2 = fkm.A01) <= -1 && fkm.A00 > -1) || i2 > -1)) {
            if (!(A02 instanceof Collection) || !A02.isEmpty()) {
                for (FKM fkm2 : A02) {
                    if (fkm2.A00 == fkm.A00 && fkm2.A01 == i2) {
                        break;
                    }
                }
            }
            A02 = AbstractC001800i.A0g(AbstractC001800i.A0X(AbstractC001800i.A0S(AbstractC166987dD.A1J(fkm), A02)), new C31460Ds4((InterfaceC16620sF) GWK.A00, 3));
        }
        C14360o3.A0B(A02, 2);
        Resources resources = context.getResources();
        ArrayList A1E = AbstractC166987dD.A1E();
        if (!(A02 instanceof Collection) || !A02.isEmpty()) {
            Iterator it = A02.iterator();
            while (it.hasNext() && ((FKM) it.next()).A01 == -1) {
            }
        }
        if (z) {
            C35124FeR.A00(AnonymousClass001.A01(':', new FKM(-1, -1, false).A01, -1), resources.getString(2131961079), A1E);
        }
        for (FKM fkm3 : A02) {
            int i5 = fkm3.A01;
            int i6 = fkm3.A00;
            int i7 = i6;
            Integer valueOf = Integer.valueOf(i5);
            if (i5 > -1 && valueOf != null) {
                i7 = i5;
            }
            int intValue2 = C35224FgH.A00(userSession, i7).intValue();
            if (intValue2 != 0) {
                if (intValue2 != 1) {
                    if (intValue2 != 2) {
                        i = R.plurals.x_days;
                        j = TimeUnit.SECONDS.toDays(i7);
                    } else {
                        i = R.plurals.x_hours;
                        j = TimeUnit.SECONDS.toHours(i7);
                    }
                } else {
                    i = R.plurals.x_minutes;
                    j = TimeUnit.SECONDS.toMinutes(i7);
                }
            } else {
                i = R.plurals.x_seconds;
                j = i7;
            }
            if (i5 == 0) {
                A0k = resources.getString(2131961078);
            } else {
                A0k = AbstractC167017dG.A0k(resources, (int) j, i);
            }
            C14360o3.A0A(A0k);
            C35124FeR.A00(AnonymousClass001.A01(':', i5, i6), A0k, A1E);
        }
        List A0a = AbstractC001800i.A0a(A1E);
        FKM fkm4 = this.A05;
        C34960Fak c34960Fak = new C34960Fak(new C35752Fqk(0, this, A0a), AnonymousClass001.A01(':', fkm4.A01, fkm4.A00), A0a, true);
        if (z2 || fkm4.A02) {
            z3 = true;
        }
        c34960Fak.A03 = z3;
        c34960Fak.A02 = z3;
        this.A09.add(c34960Fak);
    }

    public final void A00(int i) {
        boolean z;
        int i2;
        Integer valueOf;
        FKM fkm = this.A05;
        int i3 = fkm.A00;
        if (i3 != -1) {
            z = true;
        } else {
            z = false;
            i3 = C6X6.A00(this.A02, this.A06);
        }
        if (!this.A0A) {
            valueOf = null;
        } else {
            if (z) {
                i2 = fkm.A01;
            } else {
                i2 = 86400;
            }
            valueOf = Integer.valueOf(i2);
        }
        this.A09.add(C36731GHa.A02(new C35733FqG(this, valueOf, i3), i, fkm.A02));
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x001a, code lost:
    
        if (X.C161867Mw.A02(r3) != false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A01(android.content.Context r7, int r8) {
        /*
            r6 = this;
            r0 = 2131961098(0x7f13250a, float:1.9558883E38)
            java.lang.String r4 = X.AbstractC166997dE.A0p(r7, r0)
            X.FFD r5 = r6.A04
            X.3kW r3 = r6.A06
            com.instagram.common.session.UserSession r1 = r6.A02
            boolean r0 = r6.A0B
            boolean r0 = X.C6X6.A0L(r1, r3, r0)
            if (r0 != 0) goto L1c
            boolean r0 = X.C161867Mw.A02(r3)
            r2 = 0
            if (r0 == 0) goto L1d
        L1c:
            r2 = 1
        L1d:
            com.instagram.common.session.UserSession r1 = r5.A00
            boolean r0 = X.C6X6.A0E(r1, r3)
            if (r0 == 0) goto L52
            if (r2 == 0) goto L4f
            java.lang.String r2 = "https://help.instagram.com/1542029589953210"
        L29:
            java.lang.String r1 = " <a href=\"%s\">"
            java.lang.String r0 = "</a>"
            java.lang.String r0 = X.AnonymousClass001.A0g(r1, r4, r0)
            java.lang.String r0 = com.facebook.common.stringformat.StringFormatUtil.formatStrLocaleSafe(r0, r2)
            java.lang.String r0 = X.AbstractC167007dF.A0f(r7, r0, r8)
            if (r0 != 0) goto L3d
            java.lang.String r0 = ""
        L3d:
            android.text.Spanned r0 = android.text.Html.fromHtml(r0)
            X.C14360o3.A07(r0)
            X.Fgf r1 = new X.Fgf
            r1.<init>(r0)
            java.util.List r0 = r6.A09
            r0.add(r1)
            return
        L4f:
            java.lang.String r2 = "https://help.instagram.com/708011878194232"
            goto L29
        L52:
            boolean r0 = X.C6X6.A0F(r1, r3)
            if (r0 == 0) goto L60
            if (r2 == 0) goto L5d
            java.lang.String r2 = "https://help.instagram.com/357971383742482"
            goto L29
        L5d:
            java.lang.String r2 = "https://help.instagram.com/388729843706740"
            goto L29
        L60:
            if (r2 == 0) goto L65
            java.lang.String r2 = "https://help.instagram.com/222917327258991"
            goto L29
        L65:
            java.lang.String r2 = "https://help.instagram.com/207402298436653"
            goto L29
        */
        throw new UnsupportedOperationException("Method not decompiled: X.FRc.A01(android.content.Context, int):void");
    }
}
