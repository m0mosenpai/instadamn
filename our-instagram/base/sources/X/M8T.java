package X;

import android.os.Bundle;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.forker.Process;
import com.instagram.api.schemas.GiphyRequestSurface;
import com.instagram.common.session.UserSession;
import com.instagram.direct.avatar.stickers.intf.DirectAvatarTrayFragmentConfig;
import com.instagram.model.direct.DirectThreadKey;
import com.instagram.react.modules.base.IgReactQEModule;
import java.util.List;

/* loaded from: classes8.dex */
public final class M8T implements InterfaceC08830cm {
    public final int A00;
    public final Object A01;

    public M8T(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // X.InterfaceC08830cm
    public final /* bridge */ /* synthetic */ Object get() {
        switch (this.A00) {
            case 0:
                KD9 kd9 = (KD9) this.A01;
                String str = kd9.A03;
                if (str == null) {
                    str = "comment_sticker_picker_tab_fragment";
                }
                UserSession A0P = AbstractC43594JPz.A0P(kd9.A07);
                C45440KAb c45440KAb = new C45440KAb();
                Bundle A06 = AbstractC31178DnM.A06("args_previous_module_name", str);
                AbstractC60492pY.A04(A06, A0P);
                c45440KAb.setArguments(A06);
                return c45440KAb;
            case 1:
                KD9 kd92 = (KD9) this.A01;
                AbstractC12990ll A0o = AbstractC166987dD.A0o(kd92.A07);
                EnumC46186KcO enumC46186KcO = EnumC46186KcO.A05;
                AbstractC167007dF.A1D(A0o, 0, "");
                Bundle A0D = AbstractC31174DnI.A0D(A0o);
                A0D.putParcelable("param_extra_direct_thread_key", null);
                A0D.putString("param_extra_initial_search_term", "");
                A0D.putBoolean("param_extra_use_initial_search_term_if_no_query", false);
                A0D.putSerializable("param_extra_sticker_tray_entrypoint", enumC46186KcO);
                A0D.putBoolean("param_extra_is_msys_thread", false);
                C45497KCm c45497KCm = new C45497KCm();
                c45497KCm.setArguments(A0D);
                c45497KCm.A00 = new C48701LgV(kd92);
                return c45497KCm;
            case 2:
                return GiphyRequestSurface.A06;
            case 3:
                C45499KCo c45499KCo = (C45499KCo) this.A01;
                UserSession userSession = c45499KCo.A05;
                DirectThreadKey directThreadKey = c45499KCo.A0B;
                String str2 = c45499KCo.A0G;
                EnumC46186KcO enumC46186KcO2 = c45499KCo.A08;
                boolean z = c45499KCo.A0P;
                boolean booleanValue = c45499KCo.A0E.booleanValue();
                AbstractC167017dG.A1O(userSession, str2);
                Bundle A0D2 = AbstractC31174DnI.A0D(userSession);
                A0D2.putParcelable("param_extra_direct_thread_key", directThreadKey);
                A0D2.putString("param_extra_initial_search_term", str2);
                A0D2.putBoolean("param_extra_use_initial_search_term_if_no_query", booleanValue);
                A0D2.putSerializable("param_extra_sticker_tray_entrypoint", enumC46186KcO2);
                A0D2.putBoolean("param_extra_is_msys_thread", z);
                C45497KCm c45497KCm2 = new C45497KCm();
                c45497KCm2.setArguments(A0D2);
                return c45497KCm2;
            case 4:
                C28501Zl c28501Zl = C28531Zo.A04.A02;
                C45499KCo c45499KCo2 = (C45499KCo) this.A01;
                UserSession userSession2 = c45499KCo2.A05;
                DirectAvatarTrayFragmentConfig.Tab tab = DirectAvatarTrayFragmentConfig.Tab.A00;
                EnumC46186KcO enumC46186KcO3 = c45499KCo2.A08;
                if (enumC46186KcO3 == null) {
                    enumC46186KcO3 = EnumC46186KcO.A07;
                }
                List list = c45499KCo2.A0H;
                boolean z2 = c45499KCo2.A0P;
                return c28501Zl.A01(userSession2, tab, new C48659Lfm(this), enumC46186KcO3, c45499KCo2.A0B, c45499KCo2.A0F, list, z2);
            case 5:
                C45499KCo c45499KCo3 = (C45499KCo) this.A01;
                UserSession userSession3 = c45499KCo3.A05;
                DirectThreadKey directThreadKey2 = c45499KCo3.A0B;
                String str3 = c45499KCo3.A0G;
                boolean z3 = c45499KCo3.A0V;
                boolean z4 = c45499KCo3.A0K;
                boolean z5 = c45499KCo3.A0R;
                boolean z6 = c45499KCo3.A0J;
                boolean z7 = c45499KCo3.A0N;
                boolean z8 = c45499KCo3.A0S;
                boolean z9 = c45499KCo3.A0U;
                boolean z10 = c45499KCo3.A0O;
                boolean z11 = c45499KCo3.A0I;
                boolean z12 = c45499KCo3.A0L;
                boolean z13 = c45499KCo3.A0Q;
                boolean z14 = c45499KCo3.A0P;
                EnumC46186KcO enumC46186KcO4 = c45499KCo3.A08;
                String str4 = c45499KCo3.A0F;
                Bundle A0C = AbstractC31177DnL.A0C(userSession3);
                AbstractC03240Dh.A00(A0C, userSession3);
                A0C.putString("param_extra_initial_search_term", str3);
                A0C.putBoolean("param_extra_show_like_sticker", z3);
                A0C.putBoolean("param_extra_is_broadcast_thread", z4);
                A0C.putBoolean("param_extra_is_poll_enabled", z5);
                A0C.putBoolean("param_extra_ai_sticker_enabled", z6);
                A0C.putBoolean("param_extra_imagine_enabled", z7);
                A0C.putBoolean("param_extra_saved_sticker_enabled", z8);
                A0C.putBoolean("param_extra_sticker_packs_enabled", z9);
                A0C.putBoolean("param_extra_is_location_sticker_enabled", z10);
                A0C.putBoolean("param_extra_is_add_yours_sticker_enabled", z11);
                A0C.putBoolean("param_extra_is_cutout_sticker_enabled", z12);
                A0C.putBoolean("param_extra_is_music_sticker_enabled", z13);
                A0C.putBoolean("param_extra_is_msys_thread", z14);
                A0C.putParcelable("param_extra_direct_thread_key", directThreadKey2);
                A0C.putSerializable("param_extra_sticker_tray_entrypoint", enumC46186KcO4);
                A0C.putString("param_extra_bottom_sheet_session_id", str4);
                KCR kcr = new KCR();
                kcr.setArguments(A0C);
                return kcr;
            case 6:
                return ((C164247Wn) this.A01).A04;
            case 7:
            case 8:
                return ((C164197Wi) this.A01).A00();
            case 9:
                return C2JD.A00(((C33093Eix) this.A01).A02);
            case 10:
                return C7TL.A00((UserSession) this.A01);
            case 11:
                UserSession A0O = AbstractC43593JPy.A0O(this.A01);
                return AbstractC41851wZ.A00(A0O).A01(C49296Lqq.class, new C50160MDn(A0O, 31));
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
            case 14:
            default:
                return AbstractC25226BEj.A1C(this.A01);
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                return AbstractC44138Jf3.A00((UserSession) this.A01);
            case Process.SIGTERM /* 15 */:
                return C25A.A00((UserSession) this.A01);
        }
    }
}
