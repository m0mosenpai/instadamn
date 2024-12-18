package X;

import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.facebook.avatar.stickerguide.lib.impl.StickerTypeaheadImpl;
import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.forker.Process;
import com.instagram.avatars.suggestions.ContextualSuggestionsPerIntentRepository;
import com.instagram.avatars.suggestions.ContextualSuggestionsStickersRepository;
import com.instagram.avatars.suggestions.LexiconRecommendationProvider;
import com.instagram.common.session.UserSession;
import com.instagram.direct.avatar.stickers.intf.DirectAvatarTrayFragmentConfig;
import com.instagram.direct.avatar.stickers.suggestions.DirectStickerSuggestionsController;
import com.instagram.model.direct.DirectThreadKey;
import com.instagram.react.modules.base.IgReactQEModule;
import com.instagram.stickersearch.AvatarStickerInteractor;
import go.Seq;
import java.util.ArrayList;

/* renamed from: X.MHg, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C50251MHg extends C0YY implements InterfaceC16820sZ {
    public final int A00;
    public final Object A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C50251MHg(Object obj, int i) {
        super(0);
        this.A00 = i;
        this.A01 = obj;
    }

    public static InterfaceC09390do A00(Object obj, int i) {
        return C1XM.A00(new C50251MHg(obj, i));
    }

    public static InterfaceC09390do A01(Object obj, EnumC09460dv enumC09460dv, int i) {
        return AbstractC09440dt.A00(enumC09460dv, new C50251MHg(obj, i));
    }

    /* JADX WARN: Type inference failed for: r2v20, types: [X.2IY, java.lang.Object] */
    @Override // X.InterfaceC16820sZ
    public final /* bridge */ /* synthetic */ Object invoke() {
        int A07;
        boolean z;
        ArrayList<String> stringArrayList;
        C2IW c47922Ib;
        String string;
        Parcelable parcelable;
        switch (this.A00) {
            case 0:
                return new DirectStickerSuggestionsController((UserSession) this.A01);
            case 1:
                return AbstractC166997dE.A0c(C06090Tz.A05, ((DirectStickerSuggestionsController) this.A01).A0B, 36322040206403542L);
            case 2:
                return AbstractC166997dE.A0c(C06090Tz.A05, ((DirectStickerSuggestionsController) this.A01).A0B, 36322040206796764L);
            case 3:
                return AbstractC166997dE.A0c(C06090Tz.A05, ((DirectStickerSuggestionsController) this.A01).A0B, 36322040206731227L);
            case 4:
                return AbstractC166997dE.A0c(C06090Tz.A05, ((DirectStickerSuggestionsController) this.A01).A0B, 36322040206600153L);
            case 5:
                return AbstractC166997dE.A0c(C06090Tz.A05, ((DirectStickerSuggestionsController) this.A01).A0B, 36322040206469079L);
            case 6:
                return AbstractC166997dE.A0c(C06090Tz.A05, ((DirectStickerSuggestionsController) this.A01).A0B, 36322040206665690L);
            case 7:
                DirectStickerSuggestionsController directStickerSuggestionsController = (DirectStickerSuggestionsController) this.A01;
                if (AbstractC31178DnM.A1a(directStickerSuggestionsController.A0R)) {
                    A07 = 1;
                } else {
                    A07 = AbstractC25225BEi.A07(C06090Tz.A05, directStickerSuggestionsController.A0B, 36603515182912448L);
                }
                return Integer.valueOf(A07);
            case 8:
                return C006802i.A0p;
            case 9:
                return AbstractC166997dE.A0c(C06090Tz.A05, ((DirectStickerSuggestionsController) this.A01).A0B, 36322040206862301L);
            case 10:
                if (AbstractC31178DnM.A1a(((DirectStickerSuggestionsController) this.A01).A0F)) {
                    return EnumC143276dS.A0P;
                }
                return EnumC143276dS.A0Y;
            case 11:
                DirectStickerSuggestionsController directStickerSuggestionsController2 = (DirectStickerSuggestionsController) this.A01;
                UserSession userSession = directStickerSuggestionsController2.A0B;
                C32071E6x c32071E6x = directStickerSuggestionsController2.A01;
                LexiconRecommendationProvider lexiconRecommendationProvider = new LexiconRecommendationProvider(userSession, Integer.valueOf(c32071E6x.A00), c32071E6x.A01);
                C06090Tz c06090Tz = C06090Tz.A05;
                return new StickerTypeaheadImpl(new C47801L9j(C18U.A01(c06090Tz, userSession, 36603403513828269L), C18U.A04(c06090Tz, userSession, 36884878490403414L), C18U.A06(c06090Tz, userSession, 36321928536926102L), C18U.A01(c06090Tz, userSession, 36603403513762732L)), lexiconRecommendationProvider, (C006802i) AbstractC166987dD.A17(directStickerSuggestionsController2.A0M), C16930sl.A00);
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                DirectStickerSuggestionsController directStickerSuggestionsController3 = (DirectStickerSuggestionsController) this.A01;
                if (AbstractC31178DnM.A1a(directStickerSuggestionsController3.A0R)) {
                    return new ContextualSuggestionsPerIntentRepository((EnumC143276dS) directStickerSuggestionsController3.A0O.getValue(), EnumC143286dT.A07, (C006802i) AbstractC166987dD.A17(directStickerSuggestionsController3.A0M), directStickerSuggestionsController3.A0B);
                }
                return new ContextualSuggestionsStickersRepository((EnumC143276dS) directStickerSuggestionsController3.A0O.getValue(), EnumC143286dT.A07, (C006802i) AbstractC166987dD.A17(directStickerSuggestionsController3.A0M), directStickerSuggestionsController3.A0B, AbstractC31178DnM.A1a(directStickerSuggestionsController3.A0F), AbstractC31178DnM.A1a(directStickerSuggestionsController3.A0I));
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                return AbstractC166997dE.A0c(C06090Tz.A05, ((DirectStickerSuggestionsController) this.A01).A0B, 36322040206927838L);
            case 14:
                return AbstractC31173DnH.A0g();
            case Process.SIGTERM /* 15 */:
                return new AvatarStickerInteractor(null, ((L3I) this.A01).A02, 30);
            case 16:
                C45446KAh c45446KAh = (C45446KAh) this.A01;
                return c45446KAh.A09.invoke(c45446KAh.A0K.getValue());
            case 17:
                C45446KAh c45446KAh2 = (C45446KAh) this.A01;
                return new C7FR(c45446KAh2, AbstractC166987dD.A0r(c45446KAh2.A0K));
            case 18:
                return ((C45446KAh) this.A01).A06.invoke();
            case Process.SIGSTOP /* 19 */:
                C45446KAh c45446KAh3 = (C45446KAh) this.A01;
                return Boolean.valueOf(AbstractC46720Kld.A00(AbstractC166987dD.A0r(c45446KAh3.A0K), (DirectThreadKey) c45446KAh3.A0P.getValue()));
            case 20:
                Bundle bundle = ((Fragment) this.A01).mArguments;
                if (bundle != null) {
                    z = bundle.getBoolean("args_is_msys_thread");
                } else {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 21:
                return this.A01;
            case 22:
                return AbstractC25226BEj.A1C(this.A01);
            case 23:
                return AbstractC167027dH.A0B(this.A01);
            case 24:
                return new C215649gg(AbstractC166987dD.A0r(((C45446KAh) this.A01).A0K));
            case 25:
                C45446KAh c45446KAh4 = (C45446KAh) this.A01;
                return c45446KAh4.A0A.invoke(c45446KAh4.A0K.getValue());
            case 26:
                C45446KAh c45446KAh5 = (C45446KAh) this.A01;
                Bundle bundle2 = c45446KAh5.mArguments;
                if (bundle2 != null && (string = bundle2.getString("args_logging_session_id")) != null) {
                    return string;
                }
                return c45446KAh5.A07.invoke();
            case 27:
                return new C110814yt(AbstractC31172DnG.A07(this.A01));
            case 28:
                UserSession A0r = AbstractC166987dD.A0r(((C45446KAh) this.A01).A0K);
                C77G c77g = new C77G(A0r, AbstractC40691uc.A01(A0r));
                C14360o3.A0B(A0r, 0);
                return A0r.A01(C77H.class, MHS.A00(c77g, 42));
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL /* 29 */:
                Bundle bundle3 = ((Fragment) this.A01).mArguments;
                if (bundle3 != null && (stringArrayList = bundle3.getStringArrayList("args_social_stickers_user_ids")) != null) {
                    return AbstractC001800i.A0a(stringArrayList);
                }
                return C16930sl.A00;
            case 30:
                return ((C45446KAh) this.A01).A08.invoke();
            case 31:
                C45446KAh c45446KAh6 = (C45446KAh) this.A01;
                View requireView = c45446KAh6.requireView();
                C66362zD c66362zD = ((AbstractC45465KBa) c45446KAh6).A05;
                if (c66362zD != null) {
                    return new C47641L2a(requireView, c45446KAh6.A07(), c66362zD, (DirectAvatarTrayFragmentConfig) c45446KAh6.A0Q.getValue());
                }
                AbstractC31171DnF.A0t();
                throw C00O.createAndThrow();
            case 32:
                Bundle bundle4 = ((Fragment) this.A01).mArguments;
                if (bundle4 != null) {
                    return bundle4.getParcelable("args_thread_key");
                }
                return null;
            case 33:
                Bundle bundle5 = ((Fragment) this.A01).mArguments;
                if (bundle5 != null && (parcelable = bundle5.getParcelable("args_tray_config")) != null) {
                    return parcelable;
                }
                return DirectAvatarTrayFragmentConfig.NestedTray.A00;
            case 34:
                return C137746Lw.A00((UserSession) this.A01, "DirectBadgingModule").A01;
            case 35:
                UserSession userSession2 = (UserSession) this.A01;
                return new C6DQ(userSession2, new C50251MHg(userSession2, 34), new MM0(userSession2, 11));
            case 36:
            case 37:
            default:
                return AbstractC28761aE.A00((UserSession) this.A01);
            case 38:
                UserSession userSession3 = (UserSession) this.A01;
                C50251MHg c50251MHg = new C50251MHg(userSession3, 36);
                C2IT c2it = new C2IT(new C50251MHg(userSession3, 37), userSession3, C2IS.A00);
                if (AbstractC47132Ef.A00(userSession3).A01() && AbstractC31177DnL.A1Z(AbstractC47132Ef.A00(userSession3).A04)) {
                    c47922Ib = (C2IV) userSession3.A01(C2IV.class, new C50251MHg(userSession3, 39));
                } else {
                    c47922Ib = new C47922Ib(userSession3, C2IZ.A04.A00(userSession3.userId));
                }
                return new C2IR(userSession3, c47922Ib, c2it, c50251MHg);
            case 39:
                UserSession A0O = AbstractC43593JPy.A0O(this.A01);
                return new C2IV((C2IX) A0O.A01(C2IX.class, new C50251MHg(A0O, 42)), new C47922Ib(A0O, C2IZ.A04.A00(A0O.userId)), new Object());
            case 40:
                UserSession A0O2 = AbstractC43593JPy.A0O(this.A01);
                C6DQ c6dq = (C6DQ) A0O2.A01(C6DQ.class, new C50251MHg(A0O2, 35));
                return new C6Ls(new C137716Lt(A0O2, c6dq), c6dq, (C2IV) A0O2.A01(C2IV.class, new C50251MHg(A0O2, 39)));
            case Seq.NULL_REFNUM /* 41 */:
                UserSession userSession4 = (UserSession) this.A01;
                return new C2IQ(AbstractC25651Mw.A00(userSession4), userSession4, (C2IR) userSession4.A01(C2IR.class, new C50251MHg(userSession4, 38)));
            case Seq.RefTracker.REF_OFFSET /* 42 */:
                return new C2IX(C1AT.A01((UserSession) this.A01).A03(C1AV.A1E));
            case 43:
                return new FFC((UserSession) this.A01);
            case 44:
                return new C36286Fzd((UserSession) this.A01);
            case 45:
                C34602FMl c34602FMl = ((C31306DpS) this.A01).A00;
                if (c34602FMl != null) {
                    AbstractC167007dF.A0x(c34602FMl.A00);
                }
                return C0eB.A00;
            case JITProfilePQR.MEGA_ZIP_NAME_PREFIX_LEN /* 46 */:
                return new C36299Fzu((UserSession) this.A01);
            case 47:
                return new C36267FzK((UserSession) this.A01);
            case 48:
                return new C7DU((UserSession) this.A01);
            case 49:
                return new C36297Fzr((UserSession) this.A01);
        }
    }
}
