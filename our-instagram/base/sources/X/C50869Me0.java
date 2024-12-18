package X;

import android.app.Application;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.sundial.edit.model.ClipsTimelineEditorConfig;
import com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Me0, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50869Me0 extends C193578hc {
    public Integer A00;
    public boolean A01;
    public boolean A02;
    public final UserSession A03;
    public final ClipsTimelineEditorConfig A04;
    public final C8NF A05;
    public final ClipsCreationViewModel A06;
    public final C89P A07;
    public final C187358Sd A08;
    public final NIW A09;
    public final C50868Mdz A0A;
    public final C1828989k A0B;
    public final InterfaceC06180Ui A0C;
    public final C05A A0D;
    public final InterfaceC15070pN A0E;
    public final C0UO A0F;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C50869Me0(Application application, UserSession userSession, ClipsTimelineEditorConfig clipsTimelineEditorConfig, C8NF c8nf, ClipsCreationViewModel clipsCreationViewModel, C89P c89p, C187358Sd c187358Sd, NIW niw, C50868Mdz c50868Mdz, C1828989k c1828989k) {
        super(application);
        AbstractC25233BEq.A0w(2, userSession, clipsCreationViewModel, c1828989k);
        this.A03 = userSession;
        this.A06 = clipsCreationViewModel;
        this.A0B = c1828989k;
        this.A08 = c187358Sd;
        this.A0A = c50868Mdz;
        this.A09 = niw;
        this.A07 = c89p;
        this.A05 = c8nf;
        this.A04 = clipsTimelineEditorConfig;
        C008002u A0o = AbstractC31171DnF.A0o();
        this.A0D = A0o;
        this.A0F = A0o;
        AnonymousClass057 A00 = C10M.A00(C05F.A00, 1, 0);
        this.A0C = A00;
        this.A0E = A00;
    }

    public static final C115475Kh A00(AbstractC187378Sf abstractC187378Sf, C50869Me0 c50869Me0) {
        int i = ((C8TF) abstractC187378Sf).A00;
        C84B A0N = MSY.A0N(c50869Me0.A06);
        if (A0N != null) {
            return MSW.A0V(A0N, i);
        }
        return null;
    }

    public static final void A01(EnumC53325Ni3 enumC53325Ni3, C50869Me0 c50869Me0, boolean z) {
        ArrayList A0U = AbstractC001800i.A0U((Collection) c50869Me0.A0F.getValue());
        Iterator it = A0U.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            if (((C51960Mxi) it.next()).A00 == enumC53325Ni3) {
                if (i >= 0) {
                    C51960Mxi c51960Mxi = (C51960Mxi) A0U.get(i);
                    EnumC53325Ni3 enumC53325Ni32 = c51960Mxi.A00;
                    boolean z2 = c51960Mxi.A06;
                    boolean z3 = c51960Mxi.A07;
                    String str = c51960Mxi.A02;
                    boolean z4 = c51960Mxi.A03;
                    Integer num = c51960Mxi.A01;
                    C14360o3.A0B(enumC53325Ni32, 0);
                    A0U.set(i, new C51960Mxi(enumC53325Ni32, num, str, z2, true, z, z3, z4));
                }
            } else {
                i++;
            }
        }
        c50869Me0.A0D.Egh(A0U);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x002b, code lost:
    
        if (r1.A0q() != false) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A02(X.C50869Me0 r9, java.util.List r10, boolean r11) {
        /*
            com.instagram.common.session.UserSession r2 = r9.A03
            boolean r0 = X.C36A.A08(r2)
            if (r0 == 0) goto L3b
            com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel r1 = r9.A06
            boolean r0 = r1.A0n()
            if (r0 == 0) goto L16
            boolean r0 = X.AbstractC185298Jv.A07(r2)
            if (r0 == 0) goto L3b
        L16:
            X.Ni3 r2 = X.EnumC53325Ni3.A02
            r6 = r11 ^ 1
            boolean r0 = r1.A0p()
            if (r0 != 0) goto L2d
            boolean r0 = r1.A0m()
            if (r0 != 0) goto L2d
            boolean r0 = r1.A0q()
            r7 = 1
            if (r0 == 0) goto L2e
        L2d:
            r7 = 0
        L2e:
            r3 = 0
            r8 = 0
            r5 = 1
            X.Mxi r1 = new X.Mxi
            r4 = r3
            r9 = r8
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)
            r10.add(r1)
        L3b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C50869Me0.A02(X.Me0, java.util.List, boolean):void");
    }

    public static final void A03(C50869Me0 c50869Me0, List list, boolean z) {
        if (C18U.A06(C06090Tz.A05, c50869Me0.A03, 36323650818944469L)) {
            list.add(new C51960Mxi(EnumC53325Ni3.A0F, null, null, true, !z, true, false, false));
        }
    }

    public static final void A04(C50869Me0 c50869Me0, List list, boolean z) {
        C84B A0N = MSY.A0N(c50869Me0.A06);
        if (A0N != null && MSW.A06(A0N) > 1) {
            list.add(new C51960Mxi(EnumC53325Ni3.A0S, null, null, true, z, true, false, false));
        }
    }

    public static final void A05(C50869Me0 c50869Me0, List list, boolean z) {
        C8NG c8ng;
        c50869Me0.A0C.F8m(EnumC53132Nel.A02);
        boolean z2 = !z;
        list.add(new C51960Mxi(EnumC53325Ni3.A06, null, null, true, z2, true, false, false));
        list.add(new C51960Mxi(EnumC53325Ni3.A05, null, null, true, z2, true, false, false));
        A02(c50869Me0, list, z);
        list.add(new C51960Mxi(EnumC53325Ni3.A03, null, null, true, z2, true, false, false));
        list.add(new C51960Mxi(EnumC53325Ni3.A0N, null, null, true, z2, true, false, false));
        list.add(new C51960Mxi(EnumC53325Ni3.A0h, null, null, true, z2, true, false, false));
        A03(c50869Me0, list, z);
        A06(list, z);
        EnumC53325Ni3 enumC53325Ni3 = EnumC53325Ni3.A0G;
        C8NF c8nf = c50869Me0.A05;
        boolean z3 = false;
        if (c8nf != null && (c8ng = (C8NG) c8nf.A07.getValue()) != null && c8ng.A01 != 0) {
            z3 = true;
        }
        list.add(new C51960Mxi(enumC53325Ni3, null, null, z2, true, true, false, z3));
        A04(c50869Me0, list, z2);
        list.add(new C51960Mxi(EnumC53325Ni3.A0W, null, null, true, z2, true, false, false));
    }

    public static final void A06(List list, boolean z) {
        list.add(new C51960Mxi(EnumC53325Ni3.A0f, null, null, true, !z, true, false, false));
    }
}
