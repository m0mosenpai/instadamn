package X;

import com.shopify.checkout.models.errors.VaultedPaymentErrorCode$Companion;
import kotlin.enums.EnumEntries;
import kotlinx.serialization.Serializable;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Serializable(with = C71703WzK.class)
/* renamed from: X.VDb, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class EnumC68139VDb {
    public static final InterfaceC09390do A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ EnumC68139VDb[] A03;
    public static final EnumC68139VDb A04;
    public static final VaultedPaymentErrorCode$Companion Companion;
    public final String A00;

    /* JADX WARN: Type inference failed for: r0v4, types: [com.shopify.checkout.models.errors.VaultedPaymentErrorCode$Companion, java.lang.Object] */
    static {
        EnumC68139VDb enumC68139VDb = new EnumC68139VDb("InvalidSession", 0, "invalid_session");
        A04 = enumC68139VDb;
        EnumC68139VDb[] enumC68139VDbArr = {enumC68139VDb, new EnumC68139VDb("InvalidPaymentInfo", 1, "invalid_payment_info")};
        A03 = enumC68139VDbArr;
        A02 = AbstractC12190kN.A00(enumC68139VDbArr);
        Companion = new Object();
        A01 = AbstractC09440dt.A00(EnumC09460dv.A03, X51.A00);
    }

    public static EnumC68139VDb valueOf(String str) {
        return (EnumC68139VDb) Enum.valueOf(EnumC68139VDb.class, str);
    }

    public static EnumC68139VDb[] values() {
        return (EnumC68139VDb[]) A03.clone();
    }

    public EnumC68139VDb(String str, int i, String str2) {
        this.A00 = str2;
    }
}
