package X;

import com.facebook.react.modules.dialog.DialogModule;
import com.google.common.collect.ImmutableList;
import com.instagram.debug.devoptions.sandboxselector.DevServerEntity;
import com.instagram.react.modules.product.IgReactPurchaseExperienceBridgeModule;
import java.io.IOException;
import java.io.StringWriter;
import java.util.List;
import kotlin.Deprecated;

/* loaded from: classes11.dex */
public final class VI9 extends Exception {
    public final ImmutableList A00;

    @Override // java.lang.Throwable
    @Deprecated(message = "Do not use! OSS GraphQL responses can contain multiple errors, this returns only the first error and hides the rest.")
    public final String getMessage() {
        InterfaceC65563Tmj interfaceC65563Tmj;
        ImmutableList immutableList = this.A00;
        if (immutableList != null) {
            interfaceC65563Tmj = (InterfaceC65563Tmj) AbstractC001800i.A0J(immutableList);
        } else {
            interfaceC65563Tmj = null;
        }
        if (interfaceC65563Tmj instanceof V43) {
            try {
                V43 v43 = (V43) interfaceC65563Tmj;
                StringWriter stringWriter = new StringWriter();
                C17z A0S = AbstractC167007dF.A0S(stringWriter);
                A0S.A0Q(IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_CODE, v43.A00);
                String str = v43.A06;
                if (str != null) {
                    A0S.A0S("summary", str);
                }
                String str2 = v43.A02;
                if (str2 != null) {
                    A0S.A0S(DevServerEntity.COLUMN_DESCRIPTION, str2);
                }
                String str3 = v43.A01;
                if (str3 != null) {
                    A0S.A0S("debug_info", str3);
                }
                String str4 = v43.A05;
                if (str4 != null) {
                    A0S.A0S("severity", str4);
                }
                String str5 = v43.A03;
                if (str5 != null) {
                    A0S.A0S(DialogModule.KEY_MESSAGE, str5);
                }
                A0S.A0T("is_silent", v43.A08);
                A0S.A0T("requires_reauth", v43.A07);
                A0S.A0T("is_transient", v43.A09);
                String str6 = v43.A04;
                if (str6 != null) {
                    A0S.A0S("query_path", str6);
                }
                return AbstractC167017dG.A0l(A0S, stringWriter);
            } catch (IOException unused) {
                throw new IllegalArgumentException("exception on serialize to json");
            }
        }
        return null;
    }

    public VI9(List list) {
        this.A00 = AbstractC31173DnH.A0L(list);
    }
}
