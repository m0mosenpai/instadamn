package X;

import com.facebook.react.modules.dialog.DialogModule;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.S1e, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC62183S1e {
    public static final C62738SOe A00(C58924QQm c58924QQm) {
        String str;
        ArrayList A1E = AbstractC166987dD.A1E();
        ImmutableList A06 = c58924QQm.A06(C58923QQl.class, "auth_factors_groups", -202156019);
        C14360o3.A07(A06);
        Iterator<E> it = A06.iterator();
        while (it.hasNext()) {
            C2JS A0l = AbstractC25225BEi.A0l(it);
            ArrayList A1E2 = AbstractC166987dD.A1E();
            Iterator<E> it2 = MSX.A0D(A0l, C58922QQk.class, "factors", 1, -1189570828).iterator();
            while (it2.hasNext()) {
                C2JS A0l2 = AbstractC25225BEi.A0l(it2);
                C2JS reinterpretIfFulfillsType = A0l2.reinterpretIfFulfillsType(1, "PAYFBPayBIOAuthFactor", C58930QQs.class, 561485201);
                if (reinterpretIfFulfillsType != null) {
                    EnumC61191Rgr enumC61191Rgr = (EnumC61191Rgr) reinterpretIfFulfillsType.getOptionalEnumField(0, "auth_factor_type", EnumC61191Rgr.UNSET_OR_UNRECOGNIZED_ENUM_VALUE);
                    if (enumC61191Rgr != null) {
                        A1E2.add(new SPN(null, null, null, null, null, null, enumC61191Rgr.name(), null, null, null));
                    } else {
                        throw AbstractC166987dD.A14("Required value was null.");
                    }
                }
                C2JS reinterpretIfFulfillsType2 = A0l2.reinterpretIfFulfillsType(2, "PAYFBPayPINAuthFactor", C59065QVx.class, -185049991);
                if (reinterpretIfFulfillsType2 != null) {
                    EnumC61191Rgr enumC61191Rgr2 = (EnumC61191Rgr) reinterpretIfFulfillsType2.getOptionalEnumField(0, "auth_factor_type", EnumC61191Rgr.UNSET_OR_UNRECOGNIZED_ENUM_VALUE);
                    if (enumC61191Rgr2 != null) {
                        A1E2.add(new SPN(null, null, null, null, null, null, enumC61191Rgr2.name(), null, null, null));
                    } else {
                        throw AbstractC166987dD.A14("Required value was null.");
                    }
                }
                C2JS reinterpretIfFulfillsType3 = A0l2.reinterpretIfFulfillsType(3, "PAYFBPayCSCAuthFactor", C58931QQt.class, 1343275932);
                if (reinterpretIfFulfillsType3 != null) {
                    EnumC61191Rgr enumC61191Rgr3 = (EnumC61191Rgr) reinterpretIfFulfillsType3.getOptionalEnumField(0, "auth_factor_type", EnumC61191Rgr.UNSET_OR_UNRECOGNIZED_ENUM_VALUE);
                    if (enumC61191Rgr3 != null) {
                        A1E2.add(new SPN(null, null, reinterpretIfFulfillsType3.A08("cred_id"), null, null, reinterpretIfFulfillsType3.A09(DialogModule.KEY_TITLE), enumC61191Rgr3.name(), null, null, null));
                    } else {
                        throw AbstractC166987dD.A14("Required value was null.");
                    }
                }
                C2JS reinterpretIfFulfillsType4 = A0l2.reinterpretIfFulfillsType(5, "PAYFBPayPayPalAuthFactor", QWD.class, -2095216796);
                if (reinterpretIfFulfillsType4 != null) {
                    EnumC61191Rgr enumC61191Rgr4 = (EnumC61191Rgr) reinterpretIfFulfillsType4.getOptionalEnumField(0, "auth_factor_type", EnumC61191Rgr.UNSET_OR_UNRECOGNIZED_ENUM_VALUE);
                    if (enumC61191Rgr4 != null) {
                        String name = enumC61191Rgr4.name();
                        String A08 = reinterpretIfFulfillsType4.A08("cred_id");
                        String A0A = reinterpretIfFulfillsType4.A0A("hidden_email");
                        EnumC46223Kcz enumC46223Kcz = (EnumC46223Kcz) reinterpretIfFulfillsType4.getOptionalEnumField(5, "billing_agreement_type", EnumC46223Kcz.UNSET_OR_UNRECOGNIZED_ENUM_VALUE);
                        if (enumC46223Kcz != null) {
                            A1E2.add(new SPN(null, reinterpretIfFulfillsType4.A0B("connect_url"), A08, reinterpretIfFulfillsType4.A09("email"), A0A, null, name, enumC46223Kcz.name(), null, null));
                        } else {
                            throw AbstractC166987dD.A14("Required value was null.");
                        }
                    } else {
                        throw AbstractC166987dD.A14("Required value was null.");
                    }
                }
                C2JS reinterpretIfFulfillsType5 = A0l2.reinterpretIfFulfillsType(0, "PAYFBPayTrustedDeviceAuthFactor", C59086QWs.class, 683090785);
                if (reinterpretIfFulfillsType5 != null) {
                    EnumC61191Rgr enumC61191Rgr5 = (EnumC61191Rgr) reinterpretIfFulfillsType5.getOptionalEnumField(0, "auth_factor_type", EnumC61191Rgr.UNSET_OR_UNRECOGNIZED_ENUM_VALUE);
                    if (enumC61191Rgr5 != null) {
                        A1E2.add(new SPN(null, null, null, null, null, null, enumC61191Rgr5.name(), null, null, null));
                    } else {
                        throw AbstractC166987dD.A14("Required value was null.");
                    }
                }
                C2JS reinterpretIfFulfillsType6 = A0l2.reinterpretIfFulfillsType(7, "PAYFBPay3DSAuthFactor", C59082QWo.class, 1468523178);
                if (reinterpretIfFulfillsType6 != null) {
                    EnumC61191Rgr enumC61191Rgr6 = (EnumC61191Rgr) reinterpretIfFulfillsType6.getOptionalEnumField(0, "auth_factor_type", EnumC61191Rgr.UNSET_OR_UNRECOGNIZED_ENUM_VALUE);
                    if (enumC61191Rgr6 != null) {
                        A1E2.add(new SPN(null, null, null, null, null, null, enumC61191Rgr6.name(), null, reinterpretIfFulfillsType6.A08("nonce"), reinterpretIfFulfillsType6.A09("url")));
                    } else {
                        throw AbstractC166987dD.A14("Required value was null.");
                    }
                }
                C2JS reinterpretIfFulfillsType7 = A0l2.reinterpretIfFulfillsType(4, "PAYFBPaySDCAuthFactor", QWT.class, 1477488599);
                if (reinterpretIfFulfillsType7 != null) {
                    EnumC61191Rgr enumC61191Rgr7 = (EnumC61191Rgr) reinterpretIfFulfillsType7.getOptionalEnumField(0, "auth_factor_type", EnumC61191Rgr.UNSET_OR_UNRECOGNIZED_ENUM_VALUE);
                    if (enumC61191Rgr7 != null) {
                        String name2 = enumC61191Rgr7.name();
                        String A082 = reinterpretIfFulfillsType7.A08("cred_id");
                        String A09 = reinterpretIfFulfillsType7.A09(DialogModule.KEY_TITLE);
                        C2JS optionalTreeField = reinterpretIfFulfillsType7.getOptionalTreeField(3, "auth_amount", QWS.class, 635435091);
                        String str2 = null;
                        if (optionalTreeField != null) {
                            str = optionalTreeField.A08("currency");
                        } else {
                            str = null;
                        }
                        C2JS optionalTreeField2 = reinterpretIfFulfillsType7.getOptionalTreeField(3, "auth_amount", QWS.class, 635435091);
                        if (optionalTreeField2 != null) {
                            str2 = optionalTreeField2.A07("amount");
                        }
                        A1E2.add(new SPN(new C62992SaG(str, str2), null, A082, null, null, A09, name2, null, null, null));
                    } else {
                        throw AbstractC166987dD.A14("Required value was null.");
                    }
                }
            }
            A1E.add(new SP0(A0l.A00("num_required_factors"), A0l.getCoercedBooleanField(0, "allow_user_select"), A1E2));
        }
        return new C62738SOe(A1E, c58924QQm.getCoercedIntField(1, "num_required_groups"));
    }
}
