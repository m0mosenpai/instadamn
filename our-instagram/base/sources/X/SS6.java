package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;

/* loaded from: classes10.dex */
public abstract class SS6 {
    public static final C69776VvD A00(QT8 qt8) {
        boolean z;
        String str;
        String A07 = qt8.A07(PublicKeyCredentialControllerUtility.JSON_KEY_ID);
        String A09 = qt8.A09("user_input_email_address");
        String A0A = qt8.A0A("normalized_email_address");
        boolean coercedBooleanField = qt8.getCoercedBooleanField(1, "is_default");
        boolean A1W = AbstractC167007dF.A1W(qt8.reinterpretIfFulfillsType(4, "PAYOneTimeEmail", QTR.class, 860570050));
        C2JS reinterpretIfFulfillsType = qt8.reinterpretIfFulfillsType(4, "PAYOneTimeEmail", QTR.class, 860570050);
        if (reinterpretIfFulfillsType != null) {
            z = reinterpretIfFulfillsType.getCoercedBooleanField(0, "is_editable");
        } else {
            z = true;
        }
        C2JS reinterpretIfFulfillsType2 = qt8.reinterpretIfFulfillsType(4, "PAYOneTimeEmail", QTR.class, 860570050);
        if (reinterpretIfFulfillsType2 != null) {
            str = reinterpretIfFulfillsType2.A08("external_source_label");
        } else {
            str = null;
        }
        return new C69776VvD(A07, A09, A0A, str, coercedBooleanField, A1W, z);
    }

    public static final C69772Vv9 A01(QTY qty) {
        boolean z;
        String str;
        String A07 = qty.A07(PublicKeyCredentialControllerUtility.JSON_KEY_ID);
        String A09 = qty.A09("normalized_phone_number");
        String A0A = qty.A0A("formatted_intl_number_with_plus");
        boolean coercedBooleanField = qty.getCoercedBooleanField(1, "is_default");
        C2JS reinterpretIfFulfillsType = qty.reinterpretIfFulfillsType(4, "PAYOneTimePhone", QTS.class, -498669657);
        if (reinterpretIfFulfillsType != null) {
            z = reinterpretIfFulfillsType.getCoercedBooleanField(0, "is_editable");
        } else {
            z = true;
        }
        C2JS reinterpretIfFulfillsType2 = qty.reinterpretIfFulfillsType(4, "PAYOneTimePhone", QTS.class, -498669657);
        if (reinterpretIfFulfillsType2 != null) {
            str = reinterpretIfFulfillsType2.A08("external_source_label");
        } else {
            str = null;
        }
        return new C69772Vv9(A07, A09, A0A, str, coercedBooleanField, z);
    }
}
