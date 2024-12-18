package X;

import com.facebookpay.expresscheckout.models.CheckoutConfiguration;
import com.facebookpay.expresscheckout.repositoryimpl.ECPRepositoryImpl;
import com.facebookpay.logging.LoggingContext;
import com.facebookpay.logging.LoggingPolicy;
import com.facebookpay.otc.models.OtcInput;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* loaded from: classes11.dex */
public abstract class VNG {
    public static final ArrayList A00(CheckoutConfiguration checkoutConfiguration, C69278Vkm c69278Vkm, LoggingPolicy loggingPolicy, OtcInput otcInput, String str, String str2, String str3, String str4, boolean z) {
        VDU vdu;
        LoggingPolicy loggingPolicy2;
        java.util.Set linkedHashSet;
        java.util.Set linkedHashSet2;
        ImmutableList requiredCompactedEnumListField;
        ImmutableList A0E;
        EnumC68164VEi enumC68164VEi;
        int ordinal;
        int A06 = AbstractC167007dF.A06(0, str, str3);
        String A0p = AbstractC25231BEo.A0p();
        UY3 uy3 = c69278Vkm.A03;
        if (uy3 != null && (enumC68164VEi = (EnumC68164VEi) uy3.getOptionalEnumField(3, "payment_mode", EnumC68164VEi.UNSET_OR_UNRECOGNIZED_ENUM_VALUE)) != null && (ordinal = enumC68164VEi.ordinal()) != 1 && ordinal == A06) {
            vdu = VDU.A05;
        } else {
            vdu = VDU.A04;
        }
        String str5 = vdu.A00;
        C63019Saj c63019Saj = new C63019Saj(null, null, null, otcInput, ImmutableList.of(), ImmutableList.of(), ImmutableList.of(), str, A0p, str2, str5, "PRE_FETCH", null, str3, str4, null);
        long parseLong = Long.parseLong(str2);
        C66679UXp c66679UXp = c69278Vkm.A02;
        if (c66679UXp == null || (loggingPolicy2 = WGr.A0E(c66679UXp)) == null) {
            loggingPolicy2 = loggingPolicy;
        }
        C16910sj c16910sj = C16910sj.A00;
        LoggingContext loggingContext = new LoggingContext(loggingPolicy2, str, c16910sj, c16910sj, parseLong, false);
        if (z) {
            ECPRepositoryImpl eCPRepositoryImpl = C2FP.A01().A08;
            ImmutableList of = ImmutableList.of((Object) "ONE_TIME_CHECKOUT_OPTION");
            C14360o3.A07(of);
            C14360o3.A07(REU.A00(new C63545SpD(3, C63019Saj.A00(c63019Saj, null, of, 65527), eCPRepositoryImpl), C2FP.A06()));
        }
        ArrayList arrayList = new ArrayList();
        if (uy3 != null) {
            ImmutableList of2 = ImmutableList.of();
            C14360o3.A07(of2);
            ImmutableList requiredCompactedEnumListField2 = uy3.getRequiredCompactedEnumListField(1, "supported_container_types", EnumC68165VEj.UNSET_OR_UNRECOGNIZED_ENUM_VALUE);
            C14360o3.A07(requiredCompactedEnumListField2);
            ArrayList A0F = WGr.A0F(requiredCompactedEnumListField2);
            ArrayList A0i = AbstractC167007dF.A0i(A0F);
            Iterator it = A0F.iterator();
            while (it.hasNext()) {
                A0i.add(((VEM) it.next()).A01);
            }
            ImmutableList A0L = AbstractC31173DnH.A0L(A0i);
            ImmutableList requiredCompactedEnumListField3 = uy3.getRequiredCompactedEnumListField(A06, "payment_action_types", EnumC68163VEh.UNSET_OR_UNRECOGNIZED_ENUM_VALUE);
            C14360o3.A07(requiredCompactedEnumListField3);
            ArrayList A0G = WGr.A0G(requiredCompactedEnumListField3);
            ArrayList A0i2 = AbstractC167007dF.A0i(A0G);
            Iterator it2 = A0G.iterator();
            while (it2.hasNext()) {
                A0i2.add(((EnumC68131VCp) it2.next()).name());
            }
            C63019Saj c63019Saj2 = new C63019Saj(null, null, null, otcInput, of2, A0L, AbstractC31173DnH.A0L(A0i2), str, A0p, str2, str5, "PRE_FETCH", null, str3, str4, null);
            C67523UnN c67523UnN = c69278Vkm.A00;
            if (c67523UnN != null && (A0E = c67523UnN.A0E()) != null) {
                linkedHashSet = AbstractC001800i.A0j(WGr.A0H(A0E));
            } else {
                linkedHashSet = new LinkedHashSet();
            }
            if (checkoutConfiguration != null) {
                linkedHashSet.addAll(checkoutConfiguration.A0H);
            }
            if (c67523UnN != null && (requiredCompactedEnumListField = c67523UnN.getRequiredCompactedEnumListField(3, "request_fields", EnumC68157VEb.UNSET_OR_UNRECOGNIZED_ENUM_VALUE)) != null) {
                linkedHashSet2 = AbstractC001800i.A0j(WGr.A0I(requiredCompactedEnumListField));
            } else {
                linkedHashSet2 = new LinkedHashSet();
            }
            if (checkoutConfiguration != null) {
                linkedHashSet2.addAll(checkoutConfiguration.A0I);
            }
            ArrayList arrayList2 = new ArrayList();
            T2N t2n = C2FP.A01().A0D;
            String A00 = AbstractC58317Pt9.A00(195);
            C58252li A01 = T2N.A01(c63019Saj2, loggingContext, t2n, A00);
            A01.A09(new C70302WQh(A01, 4));
            C14360o3.A0C(A01, "null cannot be cast to non-null type androidx.lifecycle.LiveData<com.fbpay.util.resource.FBPayResource<kotlin.Any>>");
            arrayList2.add(A01);
            if (linkedHashSet.contains(VDD.A0D)) {
                C58252li A02 = C2FP.A01().A0F.A02(c63019Saj, loggingContext, false);
                A02.A09(new C70302WQh(A02, 4));
                C14360o3.A0C(A02, "null cannot be cast to non-null type androidx.lifecycle.LiveData<com.fbpay.util.resource.FBPayResource<kotlin.Any>>");
                arrayList2.add(A02);
            }
            if (linkedHashSet2.contains(VD7.A04) || linkedHashSet2.contains(VD7.A03) || linkedHashSet2.contains(VD7.A05)) {
                C58252li A09 = C2FP.A01().A01.A09(c63019Saj, loggingContext, false);
                A09.A09(new C70302WQh(A09, 4));
                C14360o3.A0C(A09, "null cannot be cast to non-null type androidx.lifecycle.LiveData<com.fbpay.util.resource.FBPayResource<kotlin.Any>>");
                arrayList2.add(A09);
            }
            C58252li A002 = C2FP.A01().A0G.A00(c63019Saj);
            A002.A09(new C70302WQh(A002, 4));
            C14360o3.A0C(A002, "null cannot be cast to non-null type androidx.lifecycle.LiveData<com.fbpay.util.resource.FBPayResource<kotlin.Any>>");
            arrayList2.add(A002);
            arrayList.addAll(arrayList2);
            C58252li A003 = C62991SaF.A00(AbstractC62185S1g.A00(A00), c63019Saj2, C2FP.A01().A0E);
            A003.A09(new C70302WQh(A003, 4));
            C14360o3.A0C(A003, "null cannot be cast to non-null type androidx.lifecycle.LiveData<com.fbpay.util.resource.FBPayResource<kotlin.Any>>");
            arrayList.add(A003);
        }
        return arrayList;
    }
}
