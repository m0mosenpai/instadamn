package X;

import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.forker.Process;
import com.instagram.archive.fragment.ArchiveReelHighlightsFragment;
import com.instagram.archive.fragment.ArchiveReelRecycleBinFragment;
import com.instagram.common.session.UserSession;
import com.instagram.react.modules.base.IgReactQEModule;
import go.Seq;

/* renamed from: X.Pfi, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C57508Pfi extends C0YY implements InterfaceC16820sZ {
    public final int A00;
    public final Object A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C57508Pfi(Object obj, int i) {
        super(0);
        this.A00 = i;
        this.A01 = obj;
    }

    public static InterfaceC09390do A00(Object obj, EnumC09460dv enumC09460dv, int i) {
        return AbstractC09440dt.A00(enumC09460dv, new C57508Pfi(obj, i));
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    @Override // X.InterfaceC16820sZ
    public final /* bridge */ /* synthetic */ Object invoke() {
        String str;
        Context context;
        Context context2;
        Bundle A04;
        String str2;
        Object value;
        switch (this.A00) {
            case 0:
                return Integer.valueOf(MSW.A02(AbstractC167027dH.A01(((AbstractC45514KDf) this.A01).A02), 0.5625f));
            case 1:
                AbstractC45514KDf abstractC45514KDf = (AbstractC45514KDf) this.A01;
                Context requireContext = abstractC45514KDf.requireContext();
                abstractC45514KDf.A03.getValue();
                return Integer.valueOf(AbstractC188868Yc.A01(requireContext));
            case 2:
                return AbstractC25235BEs.A0U(this.A01);
            case 3:
                return AbstractC50523MSb.A0A(this.A01);
            case 4:
                ((C189058Yv) this.A01).A08();
                return C0eB.A00;
            case 5:
                return new C37730Gj5((UserSession) this.A01);
            case 6:
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
            case Process.SIGSTOP /* 19 */:
            case 23:
            case 27:
            case 33:
            case 45:
                return this.A01;
            case 7:
            case 14:
            case 20:
            case 24:
            case 28:
            case 34:
            case JITProfilePQR.MEGA_ZIP_NAME_PREFIX_LEN /* 46 */:
                return AbstractC25226BEj.A1C(this.A01);
            case 8:
            case Process.SIGTERM /* 15 */:
            case 21:
            case 25:
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL /* 29 */:
            case 35:
            case 47:
            default:
                return AbstractC167027dH.A0B(this.A01);
            case 9:
                C45509KCy c45509KCy = (C45509KCy) this.A01;
                UserSession A0r = AbstractC166987dD.A0r(c45509KCy.A0B);
                String str3 = c45509KCy.A07;
                if (str3 == null) {
                    str = "profileTabSessionId";
                } else {
                    String str4 = c45509KCy.A08;
                    if (str4 == null) {
                        str = "targetUserId";
                    } else {
                        return new KGC(A0r, str3, str4);
                    }
                }
                C14360o3.A0F(str);
                throw C00O.createAndThrow();
            case 10:
                C1Z8 A00 = AbstractC131165w4.A00();
                C214899fR c214899fR = (C214899fR) this.A01;
                return A00.A02(c214899fR.requireContext(), VEL.A04, new C68709Val(), AbstractC166987dD.A0r(c214899fR.A0M), c214899fR.getModuleName());
            case 11:
                C1Z8 A002 = AbstractC131165w4.A00();
                C214899fR c214899fR2 = (C214899fR) this.A01;
                return A002.A02(c214899fR2.requireContext(), VEL.A05, new C68709Val(), AbstractC166987dD.A0r(c214899fR2.A0M), "instagram_ar_dynamic_ads_camera");
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                return new C51093Mhs(this.A01, 0);
            case 16:
                ArchiveReelHighlightsFragment archiveReelHighlightsFragment = (ArchiveReelHighlightsFragment) this.A01;
                InterfaceC09390do interfaceC09390do = archiveReelHighlightsFragment.A05;
                UserSession A0r2 = AbstractC166987dD.A0r(interfaceC09390do);
                Context context3 = archiveReelHighlightsFragment.getContext();
                if (context3 != null) {
                    context = context3.getApplicationContext();
                } else {
                    context = null;
                }
                C14360o3.A0C(context, AbstractC111324zv.A00(19));
                return new C52312NDb((Application) context, archiveReelHighlightsFragment, A0r2, AbstractC31173DnH.A0t(interfaceC09390do), 12, true);
            case 17:
                return new C52269NBk(AbstractC166987dD.A0r(((ArchiveReelRecycleBinFragment) this.A01).A0B));
            case 18:
                ArchiveReelRecycleBinFragment archiveReelRecycleBinFragment = (ArchiveReelRecycleBinFragment) this.A01;
                return new C38E(archiveReelRecycleBinFragment, AbstractC166987dD.A0r(archiveReelRecycleBinFragment.A0B), new C38C(archiveReelRecycleBinFragment));
            case 22:
                return new NB0(AbstractC31179DnN.A04(this.A01).getBoolean("HIDE_FROM_PROFILE_GRID"));
            case 26:
                ((C52162N6o) this.A01).A00.D8A(null);
                return C0eB.A00;
            case 30:
                C52162N6o c52162N6o = (C52162N6o) this.A01;
                UserSession A0r3 = AbstractC166987dD.A0r(c52162N6o.A02);
                Context context4 = c52162N6o.getContext();
                if (context4 != null) {
                    context2 = context4.getApplicationContext();
                } else {
                    context2 = null;
                }
                C14360o3.A0C(context2, AbstractC111324zv.A00(19));
                return new C52270NBl((Application) context2, A0r3);
            case 31:
                AbstractC166987dD.A1Y(this.A01);
                return C0eB.A00;
            case 32:
                return ((C152676tu) ((InterfaceC152636tq) this.A01)).A00;
            case 36:
                N6N n6n = (N6N) this.A01;
                return new C52271NBm(n6n.A00, AbstractC166987dD.A0r(n6n.A0C));
            case 37:
                return Ow3.A00(AbstractC166987dD.A0r(((N6I) this.A01).A07));
            case 38:
                return AbstractC31179DnN.A04(this.A01).getString("edit_highlights_reel_id", "placeholder");
            case 39:
                A04 = AbstractC31179DnN.A04(this.A01);
                str2 = "hide_privacy_footer";
                return Boolean.valueOf(AbstractC31172DnG.A1X(A04, str2));
            case 40:
                A04 = AbstractC31179DnN.A04(this.A01);
                str2 = "is_archive_home_badged";
                return Boolean.valueOf(AbstractC31172DnG.A1X(A04, str2));
            case Seq.NULL_REFNUM /* 41 */:
                A04 = AbstractC31179DnN.A04(this.A01);
                str2 = "is_in_archive_home";
                return Boolean.valueOf(AbstractC31172DnG.A1X(A04, str2));
            case Seq.RefTracker.REF_OFFSET /* 42 */:
                A04 = AbstractC31179DnN.A04(this.A01);
                str2 = "archive_multi_select_mode";
                return Boolean.valueOf(AbstractC31172DnG.A1X(A04, str2));
            case 43:
                return new MTJ(AbstractC166987dD.A0r(((N6I) this.A01).A07), "archive", 31799936);
            case 44:
                C51039Mgp c51039Mgp = (C51039Mgp) ((N6I) this.A01).A0A.getValue();
                C05A c05a = c51039Mgp.A08;
                do {
                    value = c05a.getValue();
                } while (!c05a.AIi(value, C26078Bg7.A01((C26078Bg7) value, C05F.A01)));
                MBq.A01(c51039Mgp, AbstractC141776au.A00(c51039Mgp), 7);
                return C0eB.A00;
            case 48:
                N6I n6i = (N6I) this.A01;
                return new OI5(n6i, AbstractC166987dD.A0r(n6i.A07));
            case 49:
                N6I n6i2 = (N6I) this.A01;
                return new NDR(AbstractC25235BEs.A0S(n6i2), AbstractC166987dD.A0r(n6i2.A07), n6i2.getModuleName(), AbstractC167007dF.A1Z(n6i2.A04), AbstractC31172DnG.A1X(n6i2.requireArguments(), "is_in_clips_creation_flow"));
        }
    }
}
