package X;

import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.facebook.forker.Process;
import com.instagram.common.session.UserSession;
import go.Seq;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: X.Dw7, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31702Dw7 extends C1P1 {
    public final int A00;
    public final Object A01;

    public C31702Dw7(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public static void A00(AbstractC59962oe abstractC59962oe, C1ON c1on, int i) {
        c1on.A00 = new C31702Dw7(abstractC59962oe, i);
        abstractC59962oe.schedule(c1on);
    }

    public static void A01(C1ON c1on, Object obj, int i) {
        c1on.A00 = new C31702Dw7(obj, i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:157:0x0506, code lost:
    
        if (r7 != null) goto L140;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    @Override // X.C1P1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onFail(X.AbstractC115105If r14) {
        /*
            Method dump skipped, instructions count: 1952
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C31702Dw7.onFail(X.5If):void");
    }

    @Override // X.C1P1
    public final void onFailInBackground(AbstractC115105If abstractC115105If) {
        if (36 - this.A00 != 0) {
            super.onFailInBackground(abstractC115105If);
            return;
        }
        int A03 = C0f9.A03(64838108);
        ((U0M) this.A01).A02.A03();
        C0f9.A0A(887865945, A03);
    }

    @Override // X.C1P1
    public final void onFinish() {
        int A03;
        int i;
        switch (this.A00) {
            case 0:
                A03 = C0f9.A03(365452138);
                ((C31721DwQ) this.A01).A15 = false;
                i = -993329780;
                break;
            case 1:
                A03 = C0f9.A03(734649442);
                ((C31721DwQ) ((ViewOnClickListenerC31723DwS) this.A01).A01).A14 = false;
                i = -122900402;
                break;
            case 3:
                A03 = C0f9.A03(1771498435);
                super.onFinish();
                ((EMQ) this.A01).A03.A00();
                i = 177686924;
                break;
            case 4:
                A03 = C0f9.A03(-2116461733);
                super.onFinish();
                ((EMQ) this.A01).A03.A00();
                i = 1730652170;
                break;
            case 5:
                A03 = C0f9.A03(-1298343691);
                AbstractC31176DnK.A0y(AbstractC31171DnF.A09(this.A01), C56352iT.A0t);
                i = -161568916;
                break;
            case 6:
                A03 = C0f9.A03(1098616918);
                AbstractC31176DnK.A0y(AbstractC31171DnF.A09(this.A01), C56352iT.A0t);
                i = -2065851301;
                break;
            case 7:
                A03 = C0f9.A03(-1368272737);
                ((C32366ENp) this.A01).A0C = false;
                i = 1072020132;
                break;
            case 8:
                A03 = C0f9.A03(1534123923);
                ViewOnClickListenerC35684FpJ viewOnClickListenerC35684FpJ = (ViewOnClickListenerC35684FpJ) this.A01;
                ((InterfaceC56362iU) viewOnClickListenerC35684FpJ.A02).ETp(true);
                AbstractC31179DnN.A0u((Fragment) viewOnClickListenerC35684FpJ.A01);
                i = -1154966476;
                break;
            case 9:
                A03 = C0f9.A03(719385877);
                ((C32281EJs) this.A01).A0A = false;
                i = 607845959;
                break;
            case 11:
                A03 = C0f9.A03(-1043790656);
                ((C32281EJs) this.A01).A0C = false;
                i = -2124520274;
                break;
            case 18:
                A03 = C0f9.A03(1146395853);
                super.onFinish();
                FA7.A00(((GIQ) this.A01).A02).A01(EnumC33422Ept.A0B, null);
                i = 187720241;
                break;
            case 21:
                A03 = C0f9.A03(-298871097);
                FragmentActivity A09 = AbstractC31171DnF.A09(this.A01);
                if (A09 != null) {
                    AbstractC31176DnK.A0y(A09, C56352iT.A0t);
                }
                i = -1972859157;
                break;
            case 22:
                A03 = C0f9.A03(1056829817);
                View view = ((C32286EJy) this.A01).A00;
                if (view == null) {
                    C14360o3.A0F("loadingSpinner");
                    throw C00O.createAndThrow();
                }
                view.setVisibility(8);
                i = 790562132;
                break;
            case 34:
                A03 = C0f9.A03(2101462980);
                i = 1810418124;
                break;
            case 37:
                A03 = C0f9.A03(-1408949756);
                ((ELk) this.A01).A07.A00();
                i = -1727690558;
                break;
            case Seq.NULL_REFNUM /* 41 */:
                A03 = C0f9.A03(-1901984967);
                super.onFinish();
                C35150Fes c35150Fes = (C35150Fes) this.A01;
                FragmentActivity fragmentActivity = c35150Fes.A01;
                C56342iS c56342iS = C56352iT.A0t;
                AbstractC31178DnM.A0k(fragmentActivity, c56342iS, c56342iS.A03(fragmentActivity), false);
                c35150Fes.A00 = false;
                i = -642156107;
                break;
            default:
                super.onFinish();
                return;
        }
        C0f9.A0A(i, A03);
    }

    @Override // X.C1P1
    public final void onStart() {
        int A03;
        int i;
        switch (this.A00) {
            case 0:
                A03 = C0f9.A03(1352184308);
                C31721DwQ c31721DwQ = (C31721DwQ) this.A01;
                c31721DwQ.A15 = true;
                AbstractC31175DnJ.A0j(c31721DwQ.requireActivity(), true);
                C31721DwQ.A0N(c31721DwQ, false);
                i = 831096672;
                break;
            case 1:
                A03 = C0f9.A03(-1704560852);
                ((C31721DwQ) ((ViewOnClickListenerC31723DwS) this.A01).A01).A14 = true;
                i = -1738831087;
                break;
            case 3:
                A03 = C0f9.A03(-1833892028);
                super.onStart();
                ((EMQ) this.A01).A03.A01();
                i = 893507991;
                break;
            case 4:
                A03 = C0f9.A03(-1750502949);
                super.onStart();
                ((EMQ) this.A01).A03.A01();
                i = 327512820;
                break;
            case 5:
                A03 = C0f9.A03(557962998);
                AbstractC31176DnK.A0z(AbstractC31171DnF.A09(this.A01), C56352iT.A0t);
                i = -1368031271;
                break;
            case 6:
                A03 = C0f9.A03(-1798660273);
                AbstractC31176DnK.A0z(AbstractC31171DnF.A09(this.A01), C56352iT.A0t);
                i = 1078314462;
                break;
            case 7:
                A03 = C0f9.A03(421547402);
                C32366ENp c32366ENp = (C32366ENp) this.A01;
                c32366ENp.A0C = true;
                AbstractC31178DnM.A10(c32366ENp, true);
                i = 2146453418;
                break;
            case 8:
                A03 = C0f9.A03(-142770580);
                ViewOnClickListenerC35684FpJ viewOnClickListenerC35684FpJ = (ViewOnClickListenerC35684FpJ) this.A01;
                ((InterfaceC56362iU) viewOnClickListenerC35684FpJ.A02).ETp(false);
                AbstractC31179DnN.A0v((Fragment) viewOnClickListenerC35684FpJ.A01);
                i = -1582686410;
                break;
            case 9:
                A03 = C0f9.A03(-309155857);
                C32281EJs c32281EJs = (C32281EJs) this.A01;
                c32281EJs.A0A = true;
                if (c32281EJs.isResumed()) {
                    AbstractC31177DnL.A18(c32281EJs, C56352iT.A0t, true);
                }
                i = -959235276;
                break;
            case 11:
                A03 = C0f9.A03(-1492154258);
                C32281EJs c32281EJs2 = (C32281EJs) this.A01;
                c32281EJs2.A0C = true;
                AbstractC31177DnL.A18(c32281EJs2, C56352iT.A0t, true);
                i = 334199124;
                break;
            case Process.SIGTERM /* 15 */:
                A03 = C0f9.A03(-1766339513);
                super.onStart();
                C05A c05a = ((C31814DyY) this.A01).A03;
                C33054EiD c33054EiD = (C33054EiD) c05a.getValue();
                List list = c33054EiD.A00;
                boolean z = c33054EiD.A01;
                C14360o3.A0B(list, 0);
                c05a.Egh(new C33054EiD(list, true, z));
                i = 694049559;
                break;
            case 21:
                A03 = C0f9.A03(-578050227);
                FragmentActivity A09 = AbstractC31171DnF.A09(this.A01);
                if (A09 != null) {
                    AbstractC31176DnK.A0z(A09, C56352iT.A0t);
                }
                i = -15859907;
                break;
            case 34:
                A03 = C0f9.A03(446810935);
                i = 1750232620;
                break;
            case 37:
                A03 = C0f9.A03(-1241748518);
                ((ELk) this.A01).A07.A01();
                i = -163497593;
                break;
            case Seq.NULL_REFNUM /* 41 */:
                A03 = C0f9.A03(-1548365098);
                super.onStart();
                C35150Fes c35150Fes = (C35150Fes) this.A01;
                c35150Fes.A00 = true;
                FragmentActivity fragmentActivity = c35150Fes.A01;
                C56342iS c56342iS = C56352iT.A0t;
                AbstractC31178DnM.A0k(fragmentActivity, c56342iS, c56342iS.A03(fragmentActivity), true);
                i = 706816047;
                break;
            default:
                super.onStart();
                return;
        }
        C0f9.A0A(i, A03);
    }

    /* JADX WARN: Code restructure failed: missing block: B:219:0x090b, code lost:
    
        if (r0.booleanValue() == false) goto L199;
     */
    /* JADX WARN: Code restructure failed: missing block: B:235:0x0945, code lost:
    
        if (r1 == 0) goto L216;
     */
    /* JADX WARN: Code restructure failed: missing block: B:550:0x12c5, code lost:
    
        if (r0.A04 != false) goto L543;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0006. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:228:0x0928  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x0985  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x09bf  */
    /* JADX WARN: Removed duplicated region for block: B:299:0x0a13  */
    /* JADX WARN: Type inference failed for: r0v110, types: [java.lang.Object, X.1vN] */
    /* JADX WARN: Type inference failed for: r6v31, types: [java.lang.Object, X.6ab] */
    @Override // X.C1P1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ void onSuccess(java.lang.Object r18) {
        /*
            Method dump skipped, instructions count: 5076
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C31702Dw7.onSuccess(java.lang.Object):void");
    }

    @Override // X.C1P1
    public final /* bridge */ /* synthetic */ void onSuccessInBackground(Object obj) {
        int A03;
        int i;
        switch (this.A00) {
            case 36:
                A03 = C0f9.A03(9756523);
                MZO mzo = (MZO) obj;
                synchronized (this) {
                    int A0N = AbstractC167017dG.A0N(mzo, 415163215);
                    C195298kV c195298kV = ((U0M) this.A01).A02;
                    c195298kV.A07(mzo.A01);
                    c195298kV.A05(System.currentTimeMillis() + TimeUnit.SECONDS.toMillis(mzo.A00));
                    C0f9.A0A(1146653298, A0N);
                }
                i = 977648846;
                break;
            case Seq.RefTracker.REF_OFFSET /* 42 */:
                A03 = C0f9.A03(172420358);
                EAM eam = (EAM) obj;
                int A032 = C0f9.A03(-1829881045);
                C14360o3.A0B(eam, 0);
                super.onSuccessInBackground(eam);
                C34456FGu A00 = F9N.A00((UserSession) this.A01);
                C32043E5v c32043E5v = eam.A00;
                if (c32043E5v == null) {
                    AbstractC31171DnF.A0w();
                    throw C00O.createAndThrow();
                }
                A00.A00 = Math.max(0, c32043E5v.A00);
                C0f9.A0A(515535764, A032);
                i = 2029538506;
                break;
            default:
                super.onSuccessInBackground(obj);
                return;
        }
        C0f9.A0A(i, A03);
    }
}
