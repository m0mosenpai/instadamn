package X;

import com.instagram.common.session.UserSession;
import java.util.concurrent.TimeUnit;

/* renamed from: X.EiR, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C33068EiR extends AbstractC151906sa {
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0032, code lost:
    
        if ((java.util.concurrent.TimeUnit.SECONDS.convert(java.lang.System.currentTimeMillis(), java.util.concurrent.TimeUnit.MILLISECONDS) - r7) > java.util.concurrent.TimeUnit.HOURS.toSeconds(r0)) goto L10;
     */
    @Override // X.AbstractC151906sa
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.InterfaceC37108GWt A01() {
        /*
            r9 = this;
            X.70D r0 = r9.A01
            X.6tJ r6 = r0.A0B
            if (r6 == 0) goto L41
            com.instagram.common.session.UserSession r0 = r6.A05
            X.0xq r3 = X.AbstractC166987dD.A0x(r0)
            java.lang.String r0 = "facebook_entrypoint_badge_last_clear_timestamp"
            r1 = 0
            long r7 = r3.getLong(r0, r1)
            int r0 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r0 == 0) goto L34
            int r0 = r6.A01
            if (r0 <= 0) goto L34
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.HOURS
            long r0 = (long) r0
            long r4 = r2.toSeconds(r0)
            java.util.concurrent.TimeUnit r3 = java.util.concurrent.TimeUnit.SECONDS
            long r1 = java.lang.System.currentTimeMillis()
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.MILLISECONDS
            long r1 = r3.convert(r1, r0)
            long r1 = r1 - r7
            int r0 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r0 <= 0) goto L41
        L34:
            int r0 = r6.A00
            if (r0 <= 0) goto L41
            r1 = 0
            X.GBj r0 = new X.GBj
            r0.<init>(r1)
        L3e:
            X.GWt r0 = (X.InterfaceC37108GWt) r0
            return r0
        L41:
            X.GBi r0 = X.C36584GBi.A00
            goto L3e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C33068EiR.A01():X.GWt");
    }

    @Override // X.AbstractC151906sa
    public final void A02() {
        C152336tJ c152336tJ = this.A01.A0B;
        if (c152336tJ != null) {
            UserSession userSession = c152336tJ.A05;
            C54392et A0b = AbstractC31173DnH.A0b(userSession);
            C54432ex c54432ex = new C54432ex(EnumC54222eY.A0M, c152336tJ.A00);
            EnumC58162lY enumC58162lY = EnumC58162lY.A0D;
            EnumC58122lU enumC58122lU = EnumC58122lU.A03;
            A0b.A01(enumC58122lU, enumC58162lY, c54432ex);
            C54412ev A0c = AbstractC31174DnI.A0c(userSession);
            C54432ex c54432ex2 = new C54432ex(EnumC54222eY.A0b, c152336tJ.A00);
            EnumC58162lY enumC58162lY2 = EnumC58162lY.A0F;
            C14360o3.A0B(enumC58162lY2, 0);
            A0c.A03(new C72053Ld(enumC58122lU, enumC58162lY2, null, null), c54432ex2, false);
            if (c152336tJ.A00 > 0) {
                C23031Ai A00 = AbstractC23021Ah.A00(userSession);
                long convert = TimeUnit.SECONDS.convert(System.currentTimeMillis(), TimeUnit.MILLISECONDS);
                InterfaceC19610xo A0w = AbstractC166987dD.A0w(A00);
                A0w.E7G("facebook_entrypoint_badge_last_clear_timestamp", convert);
                A0w.apply();
            }
            c152336tJ.A00 = 0;
            C152336tJ.A02(c152336tJ);
            if (c152336tJ.A08) {
                AbstractC59962oe abstractC59962oe = c152336tJ.A02;
                if (!AbstractC14490oL.A0B(abstractC59962oe.getContext())) {
                    C14360o3.A0B(userSession, 0);
                    C25621Ms A0c2 = AbstractC167017dG.A0c(userSession);
                    A0c2.A0B("family_navigation/msite_forward_url/");
                    A0c2.A0P(null, C32167EBo.class, C34824FWe.class, false);
                    C1ON A0P = AbstractC31176DnK.A0P(A0c2);
                    C31702Dw7.A01(A0P, c152336tJ, 14);
                    abstractC59962oe.schedule(A0P);
                    return;
                }
            }
            C152336tJ.A01(c152336tJ);
        }
    }
}
