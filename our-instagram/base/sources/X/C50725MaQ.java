package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import com.instagram.common.session.UserSession;
import com.instagram.creation.base.CreationSession;
import com.instagram.creation.base.CropInfo;
import com.instagram.filterkit.filtergroup.model.intf.FilterGroupModel;
import java.io.File;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: X.MaQ, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50725MaQ extends AbstractC52922bZ implements InterfaceC1829489p, InterfaceC65626Tpm, InterfaceC25192BCp {
    public C38688GzT A00;
    public InterfaceC50490MQs A01;
    public InterfaceC50490MQs A02;
    public boolean A03;
    public boolean A04;
    public FilterGroupModel A05;
    public Integer A06;
    public boolean A07;
    public final InterfaceC193488hT A08;
    public final UserSession A09;
    public final AnonymousClass841 A0A;
    public final MYZ A0B;
    public final InterfaceC24731Iq A0C;
    public final InterfaceC24731Iq A0D;
    public final InterfaceC24731Iq A0E;
    public final InterfaceC19390xP A0F;
    public final InterfaceC19390xP A0G;
    public final InterfaceC19390xP A0H;
    public final InterfaceC19390xP A0I;
    public final InterfaceC19390xP A0J;
    public final C05A A0K;
    public final C05A A0L;
    public final C05A A0M;
    public final C05A A0N;
    public final C05A A0O;
    public final C0UO A0P;
    public final C0UO A0Q;
    public final C0UO A0R;
    public final boolean A0S;
    public final C05A A0T;

    public C50725MaQ(UserSession userSession, AnonymousClass841 anonymousClass841, MYZ myz, boolean z) {
        C14360o3.A0B(userSession, 1);
        AbstractC167007dF.A1F(anonymousClass841, 2, myz);
        this.A09 = userSession;
        this.A0A = anonymousClass841;
        this.A0S = z;
        this.A0B = myz;
        C008002u A1H = AbstractC25225BEi.A1H(new C50726MaR());
        this.A0M = A1H;
        this.A0R = A1H;
        C24721Ip c24721Ip = new C24721Ip(0);
        this.A0E = c24721Ip;
        C16930sl c16930sl = C16930sl.A00;
        C008002u A00 = C10E.A00(c16930sl);
        this.A0N = A00;
        C008002u A002 = C10E.A00(c16930sl);
        this.A0O = A002;
        C008002u A1H2 = AbstractC25225BEi.A1H(new C51756Mtf(41));
        this.A0L = A1H2;
        this.A0Q = A1H2;
        this.A0J = AbstractC07080Za.A03(c24721Ip);
        C15150pV A03 = C10Q.A03(C57200Pak.A00, A00, A002);
        this.A0F = AbstractC208910l.A01(new C51590Mqi(c16930sl, c16930sl), AbstractC141776au.A00(this), A03, C10I.A01);
        C24721Ip c24721Ip2 = new C24721Ip(0);
        this.A0D = c24721Ip2;
        this.A0I = AbstractC07080Za.A03(c24721Ip2);
        C24721Ip c24721Ip3 = new C24721Ip(0);
        this.A0C = c24721Ip3;
        this.A0H = AbstractC07080Za.A03(c24721Ip3);
        C008002u A1H3 = AbstractC25225BEi.A1H(new C51756Mtf((InterfaceC58189Pqv) null, (DefaultConstructorMarker) null, 1, 40));
        this.A0T = A1H3;
        this.A0P = A1H3;
        C008002u A003 = C10E.A00(null);
        this.A0K = A003;
        this.A0G = A003;
        this.A00 = new C38688GzT((CropInfo) null, (FilterGroupModel) null, (C09530e4) null, (C09530e4) null, (DefaultConstructorMarker) null, 15, 9);
        this.A08 = new C48282LYf(this, 2);
    }

    public final void A07(Context context, C8LK c8lk, C47Z c47z, String str) {
        File file;
        String absolutePath;
        Bitmap A00;
        AbstractC167007dF.A1E(context, 0, str);
        UserSession userSession = this.A09;
        FilterGroupModel A03 = A03();
        C14360o3.A0B(A03, 4);
        AbstractC24481Hr abstractC24481Hr = null;
        if (c8lk != null && (A00 = AbstractC226289yl.A00(c8lk)) != null) {
            abstractC24481Hr = AHW.A01(context, A00, userSession, false).A03(new C56149OwF(c47z, 2));
        }
        if (abstractC24481Hr != null) {
            try {
                if (LH2.A02(abstractC24481Hr, new LEZ(15L, TimeUnit.SECONDS)) && (file = (File) abstractC24481Hr.A07()) != null && (absolutePath = file.getAbsolutePath()) != null) {
                    AbstractC197358o6.A03(userSession, A03, absolutePath);
                    return;
                }
                return;
            } catch (InterruptedException e) {
                AbstractC12120kG.A07(str, "renderDecorImageToFile() failed.", e);
                return;
            }
        }
        if (c47z != null) {
            c47z.A2k = null;
        }
        A03.EUT(null, 26);
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0015, code lost:
    
        if (X.C18U.A06(X.C06090Tz.A05, r11.A09, 36326464022394766L) == false) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A09(boolean r12) {
        /*
            r11 = this;
            r6 = 0
            if (r12 != 0) goto L17
            boolean r0 = r11.A04
            if (r0 == 0) goto L17
            com.instagram.common.session.UserSession r3 = r11.A09
            X.0Tz r2 = X.C06090Tz.A05
            r0 = 36326464022394766(0x810eba0000378e, double:3.03634035046767E-306)
            boolean r0 = X.C18U.A06(r2, r3, r0)
            r10 = 1
            if (r0 != 0) goto L18
        L17:
            r10 = 0
        L18:
            X.05A r3 = r11.A0T
            java.lang.Object r0 = r3.getValue()
            X.Mtf r0 = (X.C51756Mtf) r0
            java.lang.Object r0 = r0.A00
            X.Pqv r0 = (X.InterfaceC58189Pqv) r0
            if (r0 == 0) goto L29
            r0.Cvt(r12)
        L29:
            java.lang.Object r2 = r3.getValue()
            r9 = 0
            r1 = 40
            X.Mtf r0 = new X.Mtf
            r0.<init>(r9, r1)
            boolean r0 = r3.AIi(r2, r0)
            if (r0 == 0) goto L29
            X.05A r8 = r11.A0M
        L3d:
            java.lang.Object r7 = r8.getValue()
            r5 = r7
            X.MaR r5 = (X.C50726MaR) r5
            java.lang.Integer r4 = r11.A06
            if (r4 != 0) goto L54
            X.0UO r0 = r11.A0R
            java.lang.Object r0 = r0.getValue()
            X.MaR r0 = (X.C50726MaR) r0
            java.lang.Object r4 = r0.A02
            java.lang.Integer r4 = (java.lang.Integer) r4
        L54:
            java.lang.Object r3 = r5.A02
            java.lang.Integer r3 = (java.lang.Integer) r3
            boolean r2 = r5.A03
            boolean r1 = r5.A04
            boolean r0 = r5.A05
            X.MaR r0 = X.C50726MaR.A00(r3, r4, r2, r1, r0)
            boolean r0 = r8.AIi(r7, r0)
            if (r0 == 0) goto L3d
            r11.A06 = r9
            if (r12 == 0) goto L72
            X.MQs r0 = r11.A02
            r11.A01 = r0
            r11.A04 = r6
        L72:
            if (r10 == 0) goto L7f
            X.6aw r1 = X.AbstractC141776au.A00(r11)
            r0 = 47
            X.AbstractC25231BEo.A1H(r11, r1, r0)
            r11.A04 = r6
        L7f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C50725MaQ.A09(boolean):void");
    }

    @Override // X.InterfaceC1829489p
    public final /* synthetic */ void Cud(Drawable drawable) {
    }

    @Override // X.InterfaceC1829489p
    public final /* synthetic */ void Cuq() {
    }

    @Override // X.InterfaceC1829489p
    public final /* synthetic */ void Cur() {
    }

    @Override // X.InterfaceC1829489p
    public final void Cvp(Drawable drawable, int i) {
        Integer num;
        C194808jg c194808jg;
        VHl vHl;
        C14360o3.A0B(drawable, 1);
        MYZ myz = this.A0B;
        if (drawable instanceof C9PX) {
            num = C05F.A01;
        } else if (drawable instanceof C202718xp) {
            num = C05F.A0C;
        } else {
            Drawable drawable2 = null;
            if ((drawable instanceof C194808jg) && (c194808jg = (C194808jg) drawable) != null) {
                drawable2 = c194808jg.A04();
            }
            if (drawable2 instanceof C202728xq) {
                num = C05F.A00;
            } else {
                num = C05F.A0N;
            }
        }
        String valueOf = String.valueOf(i);
        C14360o3.A0B(num, 0);
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(myz.A0D, "ig_camera_apply_sticker");
        MSX.A1E(A0f);
        AbstractC166987dD.A1S(A0f, AbstractC193278h7.A00(myz.A0E).A00());
        AbstractC31175DnJ.A14(A0f, myz.A0C);
        A0f.AAP("sticker_id", valueOf);
        int intValue = num.intValue();
        if (intValue != 0) {
            if (intValue != 1) {
                if (intValue != 2) {
                    vHl = VHl.A08;
                } else {
                    vHl = VHl.A05;
                }
            } else {
                vHl = VHl.A0C;
            }
        } else {
            vHl = VHl.A07;
        }
        A0f.A8R(vHl, "sticker_type");
        AbstractC166997dE.A1N(A0f, AbstractC43591JPw.A00(208), 1);
        A0f.Cht();
        A01(this, false, false);
    }

    @Override // X.InterfaceC1829489p
    public final /* synthetic */ void DCJ(Drawable drawable, int i) {
    }

    @Override // X.InterfaceC1829489p
    public final /* synthetic */ void DCK(float f, float f2) {
    }

    @Override // X.InterfaceC1829489p
    public final /* synthetic */ void DCL(Drawable drawable) {
    }

    @Override // X.InterfaceC25192BCp
    public final void DFJ() {
        A01(this, true, false);
    }

    @Override // X.InterfaceC1829489p
    public final /* synthetic */ void DQa(Drawable drawable, int i, float f, float f2) {
    }

    @Override // X.InterfaceC1829489p
    public final /* synthetic */ void DQk() {
    }

    @Override // X.InterfaceC1829489p
    public final /* synthetic */ void Dep(Drawable drawable, int i, boolean z) {
    }

    @Override // X.InterfaceC1829489p
    public final void Din(Drawable drawable, float f, float f2, float f3, float f4) {
        Object value;
        C50726MaR c50726MaR;
        this.A07 = true;
        C05A c05a = this.A0M;
        do {
            value = c05a.getValue();
            c50726MaR = (C50726MaR) value;
        } while (!c05a.AIi(value, C50726MaR.A00((Integer) c50726MaR.A02, (Integer) c50726MaR.A01, true, c50726MaR.A04, c50726MaR.A05)));
    }

    @Override // X.InterfaceC1829489p
    public final void Dmk(Drawable drawable, int i, float f, float f2) {
        C14360o3.A0B(drawable, 1);
        if (drawable instanceof C6RB) {
            A01(this, true, false);
        }
    }

    @Override // X.InterfaceC1829489p
    public final void Dmm(Drawable drawable, float f, float f2, float f3, float f4, int i) {
        A01(this, false, false);
    }

    @Override // X.InterfaceC25192BCp
    public final void Dsg() {
        A01(this, false, false);
    }

    @Override // X.InterfaceC65626Tpm
    public final /* synthetic */ void onCreate(C07X c07x) {
    }

    @Override // X.InterfaceC65626Tpm
    public final /* synthetic */ void onDestroy(C07X c07x) {
    }

    @Override // X.InterfaceC65626Tpm
    public final /* synthetic */ void onPause(C07X c07x) {
    }

    @Override // X.InterfaceC65626Tpm
    public final /* synthetic */ void onStart(C07X c07x) {
    }

    @Override // X.InterfaceC65626Tpm
    public final /* synthetic */ void onStop(C07X c07x) {
    }

    public static final C09530e4 A00(C5L6 c5l6, C50725MaQ c50725MaQ, int i) {
        if (c5l6 == C5L6.A0E) {
            Integer valueOf = Integer.valueOf(i);
            return new C09530e4(valueOf, valueOf);
        }
        AnonymousClass841 anonymousClass841 = c50725MaQ.A0A;
        CreationSession creationSession = ((MX5) anonymousClass841).A01;
        C3AY A08 = MX2.A08(c5l6.A00, creationSession.A01(), creationSession.A00(), anonymousClass841.ATe(), i, c5l6.A03, C2J9.A03(c50725MaQ.A09));
        return AbstractC166987dD.A1L(A08.A00, A08.A01);
    }

    public static final void A01(C50725MaQ c50725MaQ, boolean z, boolean z2) {
        Object value;
        C50726MaR c50726MaR;
        C05A c05a = c50725MaQ.A0M;
        do {
            value = c05a.getValue();
            c50726MaR = (C50726MaR) value;
        } while (!c05a.AIi(value, C50726MaR.A00((Integer) c50726MaR.A02, (Integer) c50726MaR.A01, z, c50726MaR.A04, z2)));
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0026, code lost:
    
        if (r1.A02().A0C == false) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.instagram.filterkit.filtergroup.model.intf.FilterGroupModel A03() {
        /*
            r3 = this;
            com.instagram.filterkit.filtergroup.model.intf.FilterGroupModel r0 = r3.A05
            if (r0 != 0) goto L16
            X.841 r0 = r3.A0A
            X.MX5 r0 = (X.MX5) r0
            com.instagram.creation.base.CreationSession r1 = r0.A01
            com.instagram.creation.base.PhotoSession r0 = r1.A02()
            if (r0 == 0) goto L17
            com.instagram.filterkit.filtergroup.model.intf.FilterGroupModel r0 = r0.A07
            if (r0 == 0) goto L17
            r3.A05 = r0
        L16:
            return r0
        L17:
            com.instagram.common.session.UserSession r2 = r3.A09
            com.instagram.creation.base.PhotoSession r0 = r1.A02()
            if (r0 == 0) goto L28
            com.instagram.creation.base.PhotoSession r0 = r1.A02()
            boolean r1 = r0.A0C
            r0 = 1
            if (r1 != 0) goto L29
        L28:
            r0 = 0
        L29:
            com.instagram.filterkit.filtergroup.model.impl.FilterGroupModelImpl r0 = X.AbstractC197358o6.A01(r2, r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C50725MaQ.A03():com.instagram.filterkit.filtergroup.model.intf.FilterGroupModel");
    }

    public final void A04() {
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(this.A0B.A0D, "ig_camera_ui_tool_click");
        MSW.A1N(C81X.A2s, A0f);
        MSX.A1E(A0f);
        A0f.A8R(VHl.A0C, "sticker_type");
        A0f.Cht();
        A01(this, true, false);
    }

    public final void A05() {
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(this.A0B.A0D, "ig_camera_ui_tool_click");
        MSW.A1N(C81X.A2X, A0f);
        MSX.A1E(A0f);
        A0f.A8R(VHl.A08, "sticker_type");
        A0f.Cht();
        A01(this, true, true);
    }

    public final void A06() {
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(this.A0B.A0D, "ig_camera_ui_tool_click");
        MSW.A1N(C81X.A2V, A0f);
        MSX.A1E(A0f);
        A0f.A8R(VHl.A07, "sticker_type");
        A0f.Cht();
        A01(this, true, false);
    }

    public final void A08(InterfaceC58189Pqv interfaceC58189Pqv, boolean z) {
        Object value;
        this.A04 = z;
        C05A c05a = this.A0T;
        do {
        } while (!c05a.AIi(c05a.getValue(), new C51756Mtf(interfaceC58189Pqv, 40)));
        UserSession userSession = this.A09;
        C06090Tz c06090Tz = C06090Tz.A05;
        if (!C18U.A06(c06090Tz, userSession, 36328491247091266L) && !C18U.A06(c06090Tz, userSession, 36328491247222340L)) {
            this.A06 = (Integer) ((C50726MaR) this.A0M.getValue()).A01;
        }
        C05A c05a2 = this.A0M;
        do {
            value = c05a2.getValue();
        } while (!C50726MaR.A01((C50726MaR) value, C05F.A0C, value, c05a2));
    }

    @Override // X.InterfaceC1829489p
    public final void DuD() {
        Object value;
        C50726MaR c50726MaR;
        if (this.A07) {
            this.A07 = false;
            C05A c05a = this.A0M;
            do {
                value = c05a.getValue();
                c50726MaR = (C50726MaR) value;
            } while (!c05a.AIi(value, C50726MaR.A00((Integer) c50726MaR.A02, (Integer) c50726MaR.A01, false, c50726MaR.A04, c50726MaR.A05)));
        }
    }

    @Override // X.InterfaceC65626Tpm
    public final void onResume(C07X c07x) {
        InterfaceC58189Pqv interfaceC58189Pqv = (InterfaceC58189Pqv) ((C51756Mtf) this.A0T.getValue()).A00;
        if (interfaceC58189Pqv != null) {
            interfaceC58189Pqv.onResume();
        }
        A01(this, false, false);
    }

    public static boolean A02(C50724MaP c50724MaP) {
        UserSession userSession = C50724MaP.A01(c50724MaP).A09;
        C06090Tz c06090Tz = C06090Tz.A05;
        if (!C18U.A06(c06090Tz, userSession, 36328491247091266L) && !C18U.A06(c06090Tz, userSession, 36328491247222340L)) {
            return false;
        }
        return true;
    }
}
