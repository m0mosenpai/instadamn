package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.common.callercontext.CallerContext;
import fxcache.model.FxCalAccount;
import fxcache.model.FxCalAccountLinkageInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Sxj, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C64012Sxj implements InterfaceC48192Ji {
    public final /* synthetic */ C62610SIs A00;

    public C64012Sxj(C62610SIs c62610SIs) {
        this.A00 = c62610SIs;
    }

    @Override // X.InterfaceC48192Ji
    public final void invoke(AnonymousClass436 anonymousClass436) {
        List list;
        String str;
        String str2;
        String str3;
        FxCalAccount fxCalAccount;
        String str4;
        C2JS reinterpretIfFulfillsType;
        String optionalStringField;
        C2JS reinterpretIfFulfillsType2;
        C2JS reinterpretIfFulfillsType3;
        if (anonymousClass436 != null) {
            C2JS A0k = AbstractC25225BEi.A0k(anonymousClass436);
            ArrayList A1E = AbstractC166987dD.A1E();
            if (A0k == null || (list = A0k.A06(Qq4.class, "xe_client_cache_accounts(caller_name:$caller_name)", 1675643893)) == null) {
                list = C16930sl.A00;
            }
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C2JS A0l = AbstractC25225BEi.A0l(it);
                C14360o3.A0A(A0l);
                if (A0l.getOptionalStringField(0, PublicKeyCredentialControllerUtility.JSON_KEY_ID) == null) {
                    str = "";
                    fxCalAccount = new FxCalAccount("", "", "", "", "", "", "", "", 0, 0, 0);
                } else {
                    String optionalStringField2 = A0l.getOptionalStringField(0, PublicKeyCredentialControllerUtility.JSON_KEY_ID);
                    str = "";
                    if (optionalStringField2 == null) {
                        optionalStringField2 = "";
                    }
                    EnumC33433Eq4 enumC33433Eq4 = (EnumC33433Eq4) A0l.getOptionalEnumField(2, "platform", EnumC33433Eq4.UNSET_OR_UNRECOGNIZED_ENUM_VALUE);
                    if (enumC33433Eq4 == null || (str2 = enumC33433Eq4.name()) == null) {
                        str2 = "";
                    }
                    String A0A = A0l.A0A(AbstractC31187DnW.A01());
                    if (A0A == null) {
                        A0A = "";
                    }
                    C2JS optionalTreeField = A0l.getOptionalTreeField(7, "profile_picture_info", Qq3.class, 1438484447);
                    if (optionalTreeField == null || (str3 = optionalTreeField.getOptionalStringField(0, "url")) == null) {
                        str3 = "";
                    }
                    String A08 = A0l.A08("obfuscated_id");
                    if (A08 == null) {
                        A08 = "";
                    }
                    String A0D = A0l.A0D(AbstractC111324zv.A00(1020));
                    if (A0D == null) {
                        A0D = "";
                    }
                    fxCalAccount = new FxCalAccount(optionalStringField2, A0D, str2, "", str3, A0A, A08, "", 0, 0, 0);
                }
                EnumC33433Eq4 enumC33433Eq42 = (EnumC33433Eq4) A0l.getOptionalEnumField(2, "platform", EnumC33433Eq4.UNSET_OR_UNRECOGNIZED_ENUM_VALUE);
                if (enumC33433Eq42 != null) {
                    str4 = enumC33433Eq42.name();
                } else {
                    str4 = null;
                }
                if (str4 == null) {
                    str4 = str;
                }
                int hashCode = str4.hashCode();
                if (hashCode == -1479469166 ? !(!str4.equals("INSTAGRAM") || (reinterpretIfFulfillsType = A0l.reinterpretIfFulfillsType(5, "XFBXEIGClientCacheInfo", Qq2.class, 2073139480)) == null || (optionalStringField = reinterpretIfFulfillsType.getOptionalStringField(0, "full_name")) == null) : !(hashCode == 69888 ? !str4.equals("FRL") || (reinterpretIfFulfillsType2 = A0l.reinterpretIfFulfillsType(6, "XFBXEFRLClientCacheInfo", Qq1.class, 830488316)) == null || (optionalStringField = reinterpretIfFulfillsType2.getOptionalStringField(0, "display_name")) == null : hashCode != 1279756998 || !str4.equals("FACEBOOK") || (reinterpretIfFulfillsType3 = A0l.reinterpretIfFulfillsType(4, "XFBXEFBClientCacheInfo", Qq0.class, -999713859)) == null || (optionalStringField = reinterpretIfFulfillsType3.getOptionalStringField(0, "display_name")) == null)) {
                    str = optionalStringField;
                }
                fxCalAccount.A06 = str;
                A1E.add(fxCalAccount);
            }
            FxCalAccountLinkageInfo fxCalAccountLinkageInfo = new FxCalAccountLinkageInfo(C05F.A01, A1E, System.currentTimeMillis());
            C62610SIs c62610SIs = this.A00;
            C40921uz c40921uz = c62610SIs.A02;
            C41061vE c41061vE = c40921uz.A07;
            String str5 = c62610SIs.A04;
            CallerContext callerContext = c62610SIs.A00;
            String str6 = callerContext.A02;
            C14360o3.A07(str6);
            c41061vE.A02(str5, str6);
            c40921uz.A0A(callerContext, fxCalAccountLinkageInfo);
            AbstractC2053096w.A00(c40921uz.A06, c62610SIs.A01, c40921uz.A03, c62610SIs.A05);
            InterfaceC196048lu interfaceC196048lu = c62610SIs.A03;
            if (interfaceC196048lu != null) {
                interfaceC196048lu.onSuccess();
                return;
            }
            return;
        }
        throw AbstractC166997dE.A0g();
    }
}
