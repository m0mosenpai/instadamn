package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.proxygen.TraceFieldType;
import com.facebookpay.common.models.ErrorDialogContent;
import com.google.common.collect.ImmutableList;

/* renamed from: X.Sfs, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC63238Sfs {
    public static final C63167SeR A00(REZ rez) {
        Integer num;
        int i;
        C14360o3.A0B(rez, 0);
        String str = rez.A05;
        String str2 = rez.A04;
        C69075VhQ c69075VhQ = rez.A01;
        C69075VhQ c69075VhQ2 = rez.A02;
        EnumC68166VEk enumC68166VEk = rez.A03;
        if (enumC68166VEk != null) {
            num = 2;
            switch (enumC68166VEk.ordinal()) {
                case 3:
                    i = 13;
                    num = Integer.valueOf(i);
                    break;
                case 4:
                case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                    break;
                case 5:
                    i = 7;
                    num = Integer.valueOf(i);
                    break;
                case 8:
                    i = 15;
                    num = Integer.valueOf(i);
                    break;
                case 10:
                    i = 1;
                    num = Integer.valueOf(i);
                    break;
                case 11:
                    i = 14;
                    num = Integer.valueOf(i);
                    break;
                case 20:
                    i = 0;
                    num = Integer.valueOf(i);
                    break;
                case 24:
                    i = 8;
                    num = Integer.valueOf(i);
                    break;
                case 25:
                    i = 5;
                    num = Integer.valueOf(i);
                    break;
                case 26:
                    i = 6;
                    num = Integer.valueOf(i);
                    break;
                case 30:
                    i = 9;
                    num = Integer.valueOf(i);
                    break;
            }
            return new C63167SeR(new ErrorDialogContent(null, null, c69075VhQ, c69075VhQ2, null, null, num, null, str, str2));
        }
        num = null;
        return new C63167SeR(new ErrorDialogContent(null, null, c69075VhQ, c69075VhQ2, null, null, num, null, str, str2));
    }

    public static final REZ A03(QWW qww) {
        EnumC68186VFe enumC68186VFe;
        C69075VhQ c69075VhQ;
        C69075VhQ c69075VhQ2;
        C2JS A01;
        C2JS A012;
        int coercedIntField = qww.getCoercedIntField(0, TraceFieldType.ErrorCode);
        String A0B = qww.A0B("error_title");
        String str = "";
        if (A0B == null) {
            A0B = "";
        }
        String A0C = qww.A0C(TraceFieldType.Error);
        if (A0C == null) {
            A0C = "";
        }
        C2JS optionalTreeField = qww.getOptionalTreeField(6, "primary_cta", QWU.class, -66327375);
        if (optionalTreeField != null && (A012 = optionalTreeField.A01(C58938QRa.class, 396921940)) != null) {
            String A07 = A012.A07("label");
            if (A07 == null) {
                A07 = "";
            }
            enumC68186VFe = EnumC68186VFe.UNSET_OR_UNRECOGNIZED_ENUM_VALUE;
            EnumC68186VFe enumC68186VFe2 = (EnumC68186VFe) A012.getOptionalEnumField(2, PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, enumC68186VFe);
            if (enumC68186VFe2 == null) {
                enumC68186VFe2 = enumC68186VFe;
            }
            c69075VhQ = new C69075VhQ(enumC68186VFe2, A07, A012.A08("link"));
        } else {
            enumC68186VFe = EnumC68186VFe.UNSET_OR_UNRECOGNIZED_ENUM_VALUE;
            c69075VhQ = new C69075VhQ(enumC68186VFe, "", null);
        }
        C2JS optionalTreeField2 = qww.getOptionalTreeField(7, "secondary_cta", QWV.class, 1038307219);
        if (optionalTreeField2 != null && (A01 = optionalTreeField2.A01(C58938QRa.class, 396921940)) != null) {
            String A072 = A01.A07("label");
            if (A072 != null) {
                str = A072;
            }
            EnumC68186VFe enumC68186VFe3 = (EnumC68186VFe) A01.getOptionalEnumField(2, PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, enumC68186VFe);
            if (enumC68186VFe3 == null) {
                enumC68186VFe3 = enumC68186VFe;
            }
            c69075VhQ2 = new C69075VhQ(enumC68186VFe3, str, A01.A08("link"));
        } else {
            c69075VhQ2 = null;
        }
        EnumC68166VEk enumC68166VEk = (EnumC68166VEk) qww.getOptionalEnumField(2, "error_form_field_id", EnumC68166VEk.A02);
        qww.getOptionalStringField(8, "extra_data");
        return new REZ(c69075VhQ, c69075VhQ2, enumC68166VEk, A0B, A0C, coercedIntField);
    }

    public static final REZ A01(R0V r0v) {
        R0U A0E;
        C2JS A02;
        QWW A0L;
        if (r0v != null && (A0E = r0v.A0E()) != null && (A02 = A0E.A02(QSR.class, "error", -2135041227)) != null && (A0L = AbstractC58322PtE.A0L(A02)) != null) {
            return A03(A0L);
        }
        return null;
    }

    public static final REZ A02(QT4 qt4) {
        C2JS A03;
        ImmutableList A06;
        C2JS A0N;
        C2JS optionalTreeField;
        C2JS optionalTreeField2;
        QWW qww;
        if (qt4 != null && (A03 = qt4.A03(QT3.class, "handle_checkout_event(input:$input)", 891167727)) != null && (A06 = A03.A06(C66670UXg.class, "payment_details_updates", 1472614057)) != null && (A0N = MSW.A0N(A06, 0)) != null && (optionalTreeField = A0N.getOptionalTreeField(3, "error", QT2.class, -1166680740)) != null && (optionalTreeField2 = optionalTreeField.getOptionalTreeField(0, "user_facing_error", QT1.class, 1873846051)) != null && (qww = (QWW) optionalTreeField2.reinterpretRequired(0, QWW.class, 736683160)) != null) {
            return A03(qww);
        }
        return null;
    }
}
