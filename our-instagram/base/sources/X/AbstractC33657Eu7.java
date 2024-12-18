package X;

import com.instagram.api.schemas.XFBFXIGPCEntryPoint;

/* renamed from: X.Eu7, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC33657Eu7 {
    public static C1ON A00(C51756Mtf c51756Mtf, AbstractC18680vv abstractC18680vv) {
        C25621Ms A0c = AbstractC167017dG.A0c(abstractC18680vv);
        A0c.A03();
        A0c.A0B("api/v1/fxcal/igpc_trigger_upsell/");
        A0c.A0R(EA8.class, FS8.class);
        C1ON A0T = AbstractC31172DnG.A0T(A0c, "upsell_entrypoint", ((XFBFXIGPCEntryPoint) c51756Mtf.A00).A00);
        C14360o3.A0C(A0T, "null cannot be cast to non-null type com.instagram.common.api.base.HttpRequestTask<com.instagram.api.response.IgApiResponse<com.instagram.api.schemas.FXCALIGPCUpsellResponse>, com.instagram.api.response.IgApiResponse<com.instagram.api.schemas.FXCALIGPCUpsellResponse>>");
        return A0T;
    }
}
