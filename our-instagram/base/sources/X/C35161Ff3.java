package X;

import android.os.Bundle;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* renamed from: X.Ff3, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C35161Ff3 {
    public final Bundle A00 = AbstractC166987dD.A0b();

    public final void A02() {
        this.A00.putBoolean(AbstractC31176DnK.A0r(EnumC33320EoF.A0C), true);
    }

    public static C35161Ff3 A00(Bundle bundle) {
        C35161Ff3 c35161Ff3 = new C35161Ff3();
        if (bundle != null) {
            Iterator<String> it = bundle.keySet().iterator();
            while (it.hasNext()) {
                String A1B = AbstractC166987dD.A1B(it);
                EnumC33320EoF[] values = EnumC33320EoF.values();
                int length = values.length;
                int i = 0;
                while (true) {
                    if (i < length) {
                        EnumC33320EoF enumC33320EoF = values[i];
                        if (enumC33320EoF.name().equals(A1B.toUpperCase(Locale.US))) {
                            Class cls = enumC33320EoF.A00;
                            if (cls == String.class) {
                                Bundle bundle2 = c35161Ff3.A00;
                                String A0r = AbstractC31176DnK.A0r(enumC33320EoF);
                                bundle2.putString(A0r, bundle.getString(A0r));
                            } else if (cls == Boolean.class) {
                                Bundle bundle3 = c35161Ff3.A00;
                                String A0r2 = AbstractC31176DnK.A0r(enumC33320EoF);
                                bundle3.putBoolean(A0r2, bundle.getBoolean(A0r2));
                            } else if (cls == Integer.class) {
                                Bundle bundle4 = c35161Ff3.A00;
                                String A0r3 = AbstractC31176DnK.A0r(enumC33320EoF);
                                bundle4.putInt(A0r3, bundle.getInt(A0r3));
                            } else if (cls == List.class) {
                                Bundle bundle5 = c35161Ff3.A00;
                                String A0r4 = AbstractC31176DnK.A0r(enumC33320EoF);
                                bundle5.putStringArrayList(A0r4, bundle.getStringArrayList(A0r4));
                            } else {
                                throw AbstractC166987dD.A14("Attempted to add an extra value of an unrecognizable type.");
                            }
                        } else {
                            i++;
                        }
                    }
                }
            }
        }
        return c35161Ff3;
    }

    public static void A01(InterfaceC02590Ai interfaceC02590Ai, ELA ela) {
        interfaceC02590Ai.AAk("cp_recovery_options", ela.A0A);
        interfaceC02590Ai.AAP("cp_type_given", ela.A06.A00.getString(EnumC33320EoF.A06.A00()));
        interfaceC02590Ai.A9K("cps_available_to_choose", Long.valueOf(ela.A0A.size()));
    }

    public final void A03(C19280xC c19280xC) {
        Bundle bundle = this.A00;
        Iterator<String> it = bundle.keySet().iterator();
        while (it.hasNext()) {
            String A1B = AbstractC166987dD.A1B(it);
            EnumC33320EoF[] values = EnumC33320EoF.values();
            int length = values.length;
            int i = 0;
            while (true) {
                if (i < length) {
                    EnumC33320EoF enumC33320EoF = values[i];
                    if (enumC33320EoF.name().equals(A1B.toUpperCase(Locale.US))) {
                        Class cls = enumC33320EoF.A00;
                        if (cls == String.class) {
                            String A0r = AbstractC31176DnK.A0r(enumC33320EoF);
                            c19280xC.A0C(A0r, bundle.getString(A0r));
                        } else if (cls == Boolean.class) {
                            String A0r2 = AbstractC31176DnK.A0r(enumC33320EoF);
                            c19280xC.A09(A0r2, AbstractC31174DnI.A0n(bundle, A0r2));
                        } else if (cls == Integer.class) {
                            String A0r3 = AbstractC31176DnK.A0r(enumC33320EoF);
                            c19280xC.A08(AbstractC31179DnN.A0X(bundle, A0r3), A0r3);
                        } else if (cls == List.class) {
                            String A0r4 = AbstractC31176DnK.A0r(enumC33320EoF);
                            c19280xC.A0D(A0r4, bundle.getStringArrayList(A0r4));
                        } else {
                            throw AbstractC166987dD.A14("Attempted to add an extra value of an unrecognizable type.");
                        }
                    } else {
                        i++;
                    }
                }
            }
        }
    }
}
