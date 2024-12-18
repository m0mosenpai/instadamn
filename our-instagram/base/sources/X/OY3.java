package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.facebook.R;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.forker.Process;
import com.facebook.graphql.calls.GraphQlCallInput;
import com.instagram.api.schemas.UserMonetizationProductType;
import com.instagram.monetization.api.MonetizationApi;
import com.instagram.monetization.repository.MonetizationRepository;
import com.instagram.react.modules.base.IgReactQEModule;

/* loaded from: classes9.dex */
public abstract class OY3 {
    public static final EnumC53244Ngh A00(UserMonetizationProductType userMonetizationProductType, boolean z) {
        switch (AbstractC25227BEk.A05(userMonetizationProductType, 0)) {
            case 1:
                return EnumC53244Ngh.A05;
            case 2:
            case 10:
                return EnumC53244Ngh.A0A;
            case 3:
                throw AbstractC166987dD.A1D(AbstractC167017dG.A0n(userMonetizationProductType, "no payout subtype for product ", AbstractC166987dD.A1C()));
            case 4:
                return EnumC53244Ngh.A06;
            case 5:
                return EnumC53244Ngh.A07;
            case 6:
            case 8:
            case 14:
            default:
                throw AbstractC166987dD.A1D(AbstractC167017dG.A0n(userMonetizationProductType, "no payout subtype for product ", AbstractC166987dD.A1C()));
            case 7:
                return EnumC53244Ngh.A04;
            case 9:
                return EnumC53244Ngh.A0D;
            case 11:
                if (z) {
                    return EnumC53244Ngh.A0E;
                }
                return EnumC53244Ngh.A08;
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                return EnumC53244Ngh.A09;
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                return EnumC53244Ngh.A0C;
            case Process.SIGTERM /* 15 */:
                return EnumC53244Ngh.A0G;
        }
    }

    public static final void A02(EnumC53330NiA enumC53330NiA, MonetizationRepository monetizationRepository, InterfaceC16610sE interfaceC16610sE) {
        C41761wQ A0S = AbstractC31173DnH.A0S();
        MonetizationApi monetizationApi = monetizationRepository.A08;
        C2JM A0b = AbstractC25225BEi.A0b();
        AbstractC25231BEo.A18(AbstractC25227BEk.A0T(GraphQlCallInput.A02, true, "fe_is_linked_to_taskless"), A0b);
        C907442n c907442n = new C907442n(A0b, C51554Mpe.class, "IGPayoutGetFinancialEntityError", false);
        C907542o c907542o = new C907542o(monetizationApi.A00);
        c907542o.A08(c907442n);
        c907542o.A08 = AbstractC111324zv.A00(58);
        A0S.A02(AbstractC34046F0z.A00(c907542o.A06()), new PKE(1, enumC53330NiA, interfaceC16610sE));
    }

    public static final void A01(Context context) {
        Drawable drawable = context.getDrawable(R.drawable.instagram_bank_pano_outline_24);
        C146106i8 A0Y = AbstractC31174DnI.A0Y();
        AbstractC25226BEj.A1N(context, A0Y, 2131969425);
        if (drawable != null) {
            A0Y.A02();
            A0Y.A08(drawable, context.getColor(AbstractC53242c7.A05(context)));
        }
        AbstractC31178DnM.A1S(A0Y);
    }
}
