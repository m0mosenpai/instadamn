package X;

import com.facebookpay.offsite.models.message.PaymentDetailChangeTypes$Companion;

/* loaded from: classes11.dex */
public enum VFS {
    UNSET_OR_UNRECOGNIZED_ENUM_VALUE("UNSET_OR_UNRECOGNIZED_ENUM_VALUE"),
    /* JADX INFO: Fake field, exist only in values array */
    CITY("CITY"),
    /* JADX INFO: Fake field, exist only in values array */
    COUNTRY("COUNTRY"),
    EMAIL(PaymentDetailChangeTypes$Companion.EMAIL),
    /* JADX INFO: Fake field, exist only in values array */
    ID_AR_DNI("ID_AR_DNI"),
    /* JADX INFO: Fake field, exist only in values array */
    ID_CL_RUT("ID_CL_RUT"),
    /* JADX INFO: Fake field, exist only in values array */
    ID_CO_CC("ID_CO_CC"),
    /* JADX INFO: Fake field, exist only in values array */
    ID_CPF("ID_CPF"),
    /* JADX INFO: Fake field, exist only in values array */
    ID_EC_CI("ID_EC_CI"),
    /* JADX INFO: Fake field, exist only in values array */
    ID_MX_RFC("ID_MX_RFC"),
    /* JADX INFO: Fake field, exist only in values array */
    ID_PE_DNI("ID_PE_DNI"),
    /* JADX INFO: Fake field, exist only in values array */
    PHONE("PHONE"),
    /* JADX INFO: Fake field, exist only in values array */
    PROVINCE("PROVINCE"),
    /* JADX INFO: Fake field, exist only in values array */
    STATE("STATE"),
    /* JADX INFO: Fake field, exist only in values array */
    ZIPCODE("ZIPCODE");

    public final String A00;

    @Override // java.lang.Enum
    public final String toString() {
        return this.A00;
    }

    VFS(String str) {
        this.A00 = str;
    }
}
