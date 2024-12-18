package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.react.modules.product.IgReactPurchaseExperienceBridgeModule;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.RhE, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class EnumC61214RhE {
    public static final /* synthetic */ EnumEntries A01;
    public static final /* synthetic */ EnumC61214RhE[] A02;
    public static final EnumC61214RhE A03;
    public static final EnumC61214RhE A04;
    public static final EnumC61214RhE A05;
    public final String A00;

    static {
        EnumC61214RhE enumC61214RhE = new EnumC61214RhE("PAYMENT_ID", 0, "payment_id");
        A04 = enumC61214RhE;
        EnumC61214RhE enumC61214RhE2 = new EnumC61214RhE("STATUS", 1, IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_STATUS);
        A05 = enumC61214RhE2;
        EnumC61214RhE enumC61214RhE3 = new EnumC61214RhE("ERROR_MESSAGE", 2, "error_message");
        A03 = enumC61214RhE3;
        EnumC61214RhE[] enumC61214RhEArr = {enumC61214RhE, enumC61214RhE2, enumC61214RhE3, new EnumC61214RhE("RESPONSE", 3, PublicKeyCredentialControllerUtility.JSON_KEY_RESPONSE)};
        A02 = enumC61214RhEArr;
        A01 = AbstractC12190kN.A00(enumC61214RhEArr);
    }

    public static EnumC61214RhE valueOf(String str) {
        return (EnumC61214RhE) Enum.valueOf(EnumC61214RhE.class, str);
    }

    public static EnumC61214RhE[] values() {
        return (EnumC61214RhE[]) A02.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.A00;
    }

    public EnumC61214RhE(String str, int i, String str2) {
        this.A00 = str2;
    }
}
