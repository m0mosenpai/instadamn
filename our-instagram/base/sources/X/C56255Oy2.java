package X;

import android.content.Context;
import android.content.res.Resources;
import androidx.fragment.app.FragmentActivity;
import com.instagram.api.schemas.ReelAutoArchiveSettingStr;
import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.Oy2 */
/* loaded from: classes9.dex */
public final class C56255Oy2 implements MRI, InterfaceC41501vz {
    public static final C35119FeM A0H = new C35119FeM(true);
    public int A00;
    public int A01;
    public MOU A02;
    public C195918ld A03;
    public C41220IMj A04;
    public C36731GHa A05;
    public Integer A06;
    public boolean A07;
    public EnumC53140Net A08;
    public final Context A09;
    public final Resources A0A;
    public final FragmentActivity A0B;
    public final UserSession A0C;
    public final C54620OAv A0D;
    public final AbstractC33235ElU A0E;
    public final GZY A0F;
    public final List A0G = AbstractC166987dD.A1E();

    @Override // X.MRI
    public final void onResume() {
    }

    private void A00() {
        EnumC53140Net enumC53140Net = this.A08;
        if (enumC53140Net == EnumC53140Net.A02 || enumC53140Net == EnumC53140Net.A04) {
            List list = this.A0G;
            A05(this, list, 59, 2131971805, AbstractC23021Ah.A00(this.A0C).A1j());
            list.add(new C35246Fgf(2131971804));
        }
        UserSession userSession = this.A0C;
        if (!C18U.A06(C06090Tz.A05, userSession, 36319068088703905L)) {
            ReelAutoArchiveSettingStr BlR = AbstractC31174DnI.A0m(userSession).BlR();
            if (BlR == null) {
                BlR = ReelAutoArchiveSettingStr.A07;
            }
            boolean A1a = AbstractC25229BEm.A1a(BlR, ReelAutoArchiveSettingStr.A04);
            List list2 = this.A0G;
            A05(this, list2, 58, 2131971803, A1a);
            A02(this.A09, 2131971802, list2);
        }
    }

    private void A01() {
        AbstractC33235ElU abstractC33235ElU = this.A0E;
        UserSession userSession = this.A0C;
        C1ON A01 = C25401Lu.A01(userSession);
        A01.A00 = new C207879Ht(this, 12);
        abstractC33235ElU.schedule(A01);
        C25621Ms A0D = AbstractC31179DnN.A0D(userSession);
        A0D.A0B("archive/live/live_archive_settings/");
        C1ON A0e = AbstractC25227BEk.A0e(A0D, C52075N2b.class, C54861ONm.class);
        C50689MZh.A00(A0e, this, 39);
        abstractC33235ElU.schedule(A0e);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x021c  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0228  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0254  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x028f  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x02ad  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x02de  */
    /* JADX WARN: Removed duplicated region for block: B:80:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x02e8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void A03(X.C56255Oy2 r15) {
        /*
            Method dump skipped, instructions count: 808
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C56255Oy2.A03(X.Oy2):void");
    }

    public static void A05(C56255Oy2 c56255Oy2, List list, int i, int i2, boolean z) {
        list.add(new C36731GHa(new C55519OlD(c56255Oy2, i), i2, z));
    }

    @Override // X.MRI
    public final List BST() {
        return this.A0G;
    }

    @Override // X.MRI
    public final int C8w() {
        if (this.A08 != EnumC53140Net.A03) {
            return 2131974716;
        }
        return 2131973348;
    }

    @Override // X.MRI
    public final boolean EjN() {
        return AbstractC25229BEm.A1a(this.A08, EnumC53140Net.A04);
    }

    @Override // X.MRI
    public final String getModuleName() {
        int ordinal = this.A08.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal == 2) {
                    return "stories_camera_settings";
                }
                throw AbstractC166987dD.A12("invalid_settings_module_name");
            }
            return "reel_auto_save_settings";
        }
        return AbstractC111324zv.A00(1217);
    }

    @Override // X.MRI
    public final void onDestroy() {
        AbstractC25651Mw.A00(this.A0C).A02(this, C36068Fw4.class);
    }

    public C56255Oy2(Context context, Resources resources, FragmentActivity fragmentActivity, UserSession userSession, EnumC53140Net enumC53140Net, AbstractC33235ElU abstractC33235ElU) {
        Integer num = C05F.A00;
        this.A06 = num;
        this.A0C = userSession;
        this.A0B = fragmentActivity;
        this.A0E = abstractC33235ElU;
        this.A09 = context;
        this.A0A = resources;
        this.A08 = enumC53140Net;
        this.A07 = AbstractC31172DnG.A1X(abstractC33235ElU.requireArguments(), "ReelSettingsFragment.ARGUMENTS_SEND_CHECK_PENDING_ARCHIVE_FLAG");
        this.A0D = new C54620OAv(abstractC33235ElU, abstractC33235ElU);
        this.A0F = new PK1(this, 3);
        this.A03 = OQ9.A01(userSession, new C56731PFz(this, 3));
        this.A06 = num;
        C41220IMj A0V = C1XJ.A00.A0V(userSession);
        this.A04 = A0V;
        MY1.A00(abstractC33235ElU, (C2GT) A0V.A01.getValue(), this, 23);
        AbstractC25651Mw.A00(userSession).A01(this, C36068Fw4.class);
        A03(this);
        A01();
    }

    public static void A02(Context context, int i, List list) {
        list.add(new C35246Fgf(context.getString(i)));
    }

    public static /* synthetic */ void A04(C56255Oy2 c56255Oy2) {
        A03(c56255Oy2);
        MOU mou = c56255Oy2.A02;
        if (mou != null) {
            mou.DSp();
        }
    }

    @Override // X.InterfaceC41501vz
    public final /* bridge */ /* synthetic */ void onEvent(Object obj) {
        int A03 = C0f9.A03(-703158351);
        int A032 = C0f9.A03(2006578268);
        if (!this.A0E.mDetached) {
            A01();
        }
        C0f9.A0A(583575315, A032);
        C0f9.A0A(-119828334, A03);
    }

    @Override // X.MRI
    public final void EcQ(MOU mou) {
        this.A02 = mou;
    }
}
