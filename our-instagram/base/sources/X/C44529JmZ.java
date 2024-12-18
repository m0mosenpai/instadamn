package X;

import com.facebook.react.modules.dialog.DialogModule;
import com.instagram.common.session.UserSession;

/* renamed from: X.JmZ, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44529JmZ extends AbstractC52922bZ {
    public final UserSession A00;
    public final InterfaceC19390xP A01;
    public final InterfaceC06180Ui A02;
    public final C05A A03;
    public final C0UO A04;
    public final boolean A05;

    public C44529JmZ(UserSession userSession, boolean z) {
        C51733MtG c51733MtG;
        C14360o3.A0B(userSession, 1);
        this.A00 = userSession;
        this.A05 = z;
        AnonymousClass057 A00 = C10M.A00(C05F.A01, 0, 1);
        this.A02 = A00;
        this.A01 = A00;
        if (A02()) {
            boolean z2 = !z;
            c51733MtG = new C51733MtG(C05F.A0Y, z2, z2, z2, z, true);
        } else {
            c51733MtG = new C51733MtG(C05F.A00, !z, true, true, z, true);
        }
        C008002u A1H = AbstractC25225BEi.A1H(c51733MtG);
        this.A03 = A1H;
        this.A04 = A1H;
    }

    public final void A01(MXB mxb, AnonymousClass841 anonymousClass841, C47Z c47z) {
        C0f5 AEp;
        String A0N;
        String A00;
        if (LHK.A02(0, anonymousClass841.ACq(), false)) {
            if (anonymousClass841.CPp()) {
                A00 = "edit_carousel";
            } else {
                A00 = MSV.A00(569);
            }
            C6WI.A01().A07(this.A00, A00, true);
            mxb.A0A(null, C05F.A01);
            if (c47z != null) {
                this.A02.F8m(new C45760KNn(c47z.A35));
                return;
            } else {
                AEp = C18950wb.A01.AEp(KCP.__redex_internal_original_name, 817901174);
                A0N = "Getting pendingMedia failed";
            }
        } else {
            AEp = C18950wb.A01.AEp(KCP.__redex_internal_original_name, 817901174);
            A0N = AnonymousClass001.A0N("Invalid aspect ratio: ", anonymousClass841.ACq());
        }
        AEp.ABW(DialogModule.KEY_MESSAGE, A0N);
        AEp.report();
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0039, code lost:
    
        if (r2.A02().A0C == false) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean A03(X.AnonymousClass841 r6) {
        /*
            r5 = this;
            r4 = 0
            com.instagram.common.session.UserSession r3 = r5.A00
            X.0Tz r2 = X.C06090Tz.A06
            r0 = 36328465477156396(0x81108c00003e2c, double:3.037606078518136E-306)
            boolean r0 = X.C18U.A06(r2, r3, r0)
            if (r0 == 0) goto L2b
            X.MX5 r6 = (X.MX5) r6
            com.instagram.creation.base.CreationSession r2 = r6.A01
            com.instagram.creation.base.VideoSession r0 = r2.A04()
            if (r0 == 0) goto L2c
            com.instagram.filterkit.filtergroup.model.intf.FilterGroupModel r1 = r0.A0D
            if (r1 == 0) goto L2c
        L1e:
            com.instagram.creation.base.VideoSession r0 = r2.A04()
            r0.getClass()
            com.instagram.filterkit.filtergroup.model.intf.FilterGroupModel r0 = r0.A0E
            boolean r4 = X.AbstractC197358o6.A06(r1, r0)
        L2b:
            return r4
        L2c:
            com.instagram.creation.base.PhotoSession r0 = r2.A02()
            if (r0 == 0) goto L3b
            com.instagram.creation.base.PhotoSession r0 = r2.A02()
            boolean r1 = r0.A0C
            r0 = 1
            if (r1 != 0) goto L3c
        L3b:
            r0 = 0
        L3c:
            com.instagram.filterkit.filtergroup.model.impl.FilterGroupModelImpl r1 = X.AbstractC197358o6.A01(r3, r0)
            goto L1e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C44529JmZ.A03(X.841):boolean");
    }

    public final void A00() {
        Object value;
        Integer num;
        boolean z;
        boolean z2;
        C05A c05a = this.A03;
        do {
            value = c05a.getValue();
            num = C05F.A00;
            z = !this.A05;
            z2 = ((C51733MtG) value).A04;
            C14360o3.A0B(num, 0);
        } while (!c05a.AIi(value, new C51733MtG(num, z, true, true, z2, true)));
    }

    public final boolean A02() {
        UserSession userSession = this.A00;
        C06090Tz c06090Tz = C06090Tz.A05;
        if (!C18U.A06(c06090Tz, userSession, 36328491247091266L) && !C18U.A06(c06090Tz, userSession, 36328491247287877L)) {
            return false;
        }
        return true;
    }
}
