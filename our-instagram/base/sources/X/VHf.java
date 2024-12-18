package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.debug.devoptions.sandboxselector.DevServerEntity;

/* loaded from: classes11.dex */
public enum VHf implements InterfaceC02530Ab {
    NAME(PublicKeyCredentialControllerUtility.JSON_KEY_NAME),
    PROFILE_PHOTO("profile_photo"),
    AVATAR("avatar"),
    /* JADX INFO: Fake field, exist only in values array */
    USERNAME(AbstractC63082Sc5.A01(19, 8, 1)),
    /* JADX INFO: Fake field, exist only in values array */
    GENDER("gender"),
    /* JADX INFO: Fake field, exist only in values array */
    WEBSITE("website"),
    /* JADX INFO: Fake field, exist only in values array */
    EMAIL("email"),
    /* JADX INFO: Fake field, exist only in values array */
    PHONE("phone"),
    /* JADX INFO: Fake field, exist only in values array */
    CATEGORY("category"),
    /* JADX INFO: Fake field, exist only in values array */
    LOCATION_ADDRESS("location_address"),
    /* JADX INFO: Fake field, exist only in values array */
    LOCATION_ZIP("location_zip"),
    /* JADX INFO: Fake field, exist only in values array */
    LOCATION_CITY_ID("location_city_id"),
    /* JADX INFO: Fake field, exist only in values array */
    DESCRIPTION(DevServerEntity.COLUMN_DESCRIPTION),
    /* JADX INFO: Fake field, exist only in values array */
    PRONOUNS("pronouns");

    public final String A00;

    @Override // X.InterfaceC02530Ab
    public final /* bridge */ /* synthetic */ Object getValue() {
        return this.A00;
    }

    VHf(String str) {
        this.A00 = str;
    }
}
