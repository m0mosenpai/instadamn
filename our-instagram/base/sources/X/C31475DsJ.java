package X;

import com.google.common.collect.ImmutableList;
import com.instagram.api.schemas.AvatarCoinFlipBackgroundOptionResponse;
import com.instagram.avatars.coinflip.AvatarCoinFlipSticker;
import com.instagram.avatars.graphql.AvatarCustomizationOptionsRepository;
import com.instagram.common.recyclerview.ViewModelListUpdate;
import com.instagram.common.session.UserSession;
import com.instagram.react.modules.product.IgReactMediaPickerNativeModule;
import com.instagram.stickersearch.AvatarStickerPreRenderInteractor;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: X.DsJ, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31475DsJ extends AbstractC52922bZ {
    public final AvatarCustomizationOptionsRepository A00;
    public final C18920wW A01;
    public final UserSession A02;
    public final C21C A03;
    public final AvatarStickerPreRenderInteractor A04;
    public final InterfaceC06180Ui A05;
    public final C05A A06;

    public /* synthetic */ C31475DsJ(AvatarCustomizationOptionsRepository avatarCustomizationOptionsRepository, UserSession userSession) {
        AvatarStickerPreRenderInteractor avatarStickerPreRenderInteractor = new AvatarStickerPreRenderInteractor(null, userSession, 126);
        C21C A00 = C21B.A00(userSession);
        C12210kP c12210kP = new C12210kP(userSession);
        c12210kP.A00 = AbstractC31171DnF.A0D("avatar_coin_flip_customization");
        C18920wW A002 = c12210kP.A00();
        AbstractC25233BEq.A0x(1, userSession, A00, A002);
        this.A02 = userSession;
        this.A04 = avatarStickerPreRenderInteractor;
        this.A00 = avatarCustomizationOptionsRepository;
        this.A03 = A00;
        this.A01 = A002;
        this.A05 = C10M.A00(C05F.A00, 2, 0);
        this.A06 = AbstractC25225BEi.A1H(new MWT((AvatarCoinFlipBackgroundOptionResponse) null, (C60492R0s) null, (String) null, (List) null, (List) null, (DefaultConstructorMarker) null, 31, 0));
    }

    public final void A00() {
        EnumC143276dS enumC143276dS;
        if (AbstractC31248DoW.A00(this.A02)) {
            enumC143276dS = EnumC143276dS.A0C;
        } else {
            enumC143276dS = EnumC143276dS.A0B;
        }
        AbstractC166987dD.A1Z(new MCJ(enumC143276dS, this, null, 2), AbstractC141776au.A00(this));
    }

    public final void A03(AvatarCoinFlipBackgroundOptionResponse avatarCoinFlipBackgroundOptionResponse) {
        Object value;
        MWT mwt;
        C05A c05a = this.A06;
        do {
            value = c05a.getValue();
            mwt = (MWT) value;
        } while (!c05a.AIi(value, new MWT(mwt.A00, mwt.A01, avatarCoinFlipBackgroundOptionResponse, mwt.A02, mwt.A03, 0)));
    }

    public final void A04(C60492R0s c60492R0s) {
        Object value;
        MWT mwt;
        C05A c05a = this.A06;
        do {
            value = c05a.getValue();
            mwt = (MWT) value;
        } while (!c05a.AIi(value, new MWT(mwt.A00, mwt.A01, mwt.A05, c60492R0s, mwt.A03, 0)));
    }

    public final void A05(boolean z, boolean z2) {
        List list;
        if (!z || (list = (List) AbstractC31172DnG.A0J(this.A06).A01) == null || list.isEmpty()) {
            AbstractC166987dD.A1Z(new PZW(this, (InterfaceC23621Ds) null, 8, z2), AbstractC141776au.A00(this));
        }
    }

    public final void A01() {
        String str;
        List list;
        List list2;
        AvatarCoinFlipBackgroundOptionResponse avatarCoinFlipBackgroundOptionResponse;
        ViewModelListUpdate A0E = AbstractC31171DnF.A0E();
        C05A c05a = this.A06;
        if (AbstractC31172DnG.A0J(c05a).A05 == null && (list = (List) AbstractC31172DnG.A0J(c05a).A00) != null && !list.isEmpty() && (list2 = (List) AbstractC31172DnG.A0J(c05a).A00) != null && (avatarCoinFlipBackgroundOptionResponse = (AvatarCoinFlipBackgroundOptionResponse) AbstractC001800i.A0O(list2, 0)) != null) {
            A03(avatarCoinFlipBackgroundOptionResponse);
        }
        List<AvatarCoinFlipBackgroundOptionResponse> list3 = (List) AbstractC31172DnG.A0J(c05a).A00;
        if (list3 != null) {
            ArrayList A0q = AbstractC167017dG.A0q(list3);
            for (AvatarCoinFlipBackgroundOptionResponse avatarCoinFlipBackgroundOptionResponse2 : list3) {
                String str2 = avatarCoinFlipBackgroundOptionResponse2.A02;
                AvatarCoinFlipBackgroundOptionResponse avatarCoinFlipBackgroundOptionResponse3 = (AvatarCoinFlipBackgroundOptionResponse) AbstractC31172DnG.A0J(c05a).A05;
                if (avatarCoinFlipBackgroundOptionResponse3 != null) {
                    str = avatarCoinFlipBackgroundOptionResponse3.A02;
                } else {
                    str = null;
                }
                A0q.add(new C32092E8q(avatarCoinFlipBackgroundOptionResponse2, new GSg(this, 0), C14360o3.A0K(str2, str)));
            }
            A0E.A01(A0q);
        }
        this.A05.F8m(new EEI((AvatarCoinFlipBackgroundOptionResponse) AbstractC31172DnG.A0J(c05a).A05, A0E));
    }

    public final void A02() {
        ImmutableList A0E;
        C2JS c2js;
        String str;
        ViewModelListUpdate A0E2 = AbstractC31171DnF.A0E();
        C05A c05a = this.A06;
        List<C60492R0s> list = (List) AbstractC31172DnG.A0J(c05a).A01;
        C2JS c2js2 = null;
        if (list != null) {
            ArrayList A0q = AbstractC167017dG.A0q(list);
            for (C60492R0s c60492R0s : list) {
                String A07 = c60492R0s.A07("sticker_pack_id");
                C2JS c2js3 = (C2JS) AbstractC31172DnG.A0J(c05a).A02;
                if (c2js3 != null) {
                    str = c2js3.A07("sticker_pack_id");
                } else {
                    str = null;
                }
                A0q.add(new C32093E8r(c60492R0s, new GSg(this, 1), C14360o3.A0K(A07, str)));
            }
            A0E2.A01(A0q);
        }
        C60492R0s c60492R0s2 = (C60492R0s) AbstractC31172DnG.A0J(c05a).A02;
        if (c60492R0s2 != null && (A0E = c60492R0s2.A0E()) != null && A0E.size() >= 3) {
            ImmutableList A0E3 = c60492R0s2.A0E();
            if (A0E3 != null) {
                c2js = (C2JS) AbstractC001800i.A0O(A0E3, 1);
            } else {
                c2js = null;
            }
            ImmutableList A0E4 = c60492R0s2.A0E();
            if (A0E4 != null) {
                c2js2 = (C2JS) AbstractC001800i.A0O(A0E4, 2);
            }
            if (c2js != null && c2js2 != null) {
                InterfaceC06180Ui interfaceC06180Ui = this.A05;
                String valueOf = String.valueOf(c2js.A09("cdn_url"));
                int coercedIntField = c2js.getCoercedIntField(4, "margin_top");
                String A00 = AbstractC111324zv.A00(1089);
                int coercedIntField2 = c2js.getCoercedIntField(7, A00);
                String A002 = AbstractC111324zv.A00(1090);
                int coercedIntField3 = c2js.getCoercedIntField(5, A002);
                String A003 = AbstractC111324zv.A00(1091);
                interfaceC06180Ui.F8m(new EEJ(new AvatarCoinFlipSticker(valueOf, coercedIntField, coercedIntField2, coercedIntField3, c2js.getCoercedIntField(6, A003), c2js.getCoercedIntField(8, IgReactMediaPickerNativeModule.HEIGHT)), new AvatarCoinFlipSticker(String.valueOf(c2js2.A09("cdn_url")), c2js2.getCoercedIntField(4, "margin_top"), c2js2.getCoercedIntField(7, A00), c2js2.getCoercedIntField(5, A002), c2js2.getCoercedIntField(6, A003), c2js2.getCoercedIntField(8, IgReactMediaPickerNativeModule.HEIGHT)), A0E2));
            }
        }
    }
}
