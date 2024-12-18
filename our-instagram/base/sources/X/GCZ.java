package X;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.Fragment;

/* loaded from: classes6.dex */
public final class GCZ implements GYB {
    public final Fragment A00;

    @Override // X.GYB
    public final void CJ8(android.net.Uri uri, Bundle bundle) {
        EnumC151596s5 enumC151596s5;
        C14360o3.A0B(uri, 0);
        F0G.A00();
        Fragment fragment = this.A00;
        Context context = fragment.getContext();
        if (context != null) {
            Intent A08 = AbstractC31173DnH.A08(context);
            Bundle requireArguments = fragment.requireArguments();
            String queryParameter = uri.getQueryParameter("from");
            if (queryParameter == null) {
                queryParameter = "megaphone";
            }
            AbstractC31171DnF.A13(requireArguments, queryParameter);
            String queryParameter2 = uri.getQueryParameter("account_type");
            if ("business".equals(queryParameter2)) {
                enumC151596s5 = EnumC151596s5.A04;
            } else if ("creator".equals(queryParameter2)) {
                enumC151596s5 = EnumC151596s5.A05;
            } else {
                enumC151596s5 = EnumC151596s5.A08;
            }
            requireArguments.putInt("business_account_flow", enumC151596s5.A00);
            requireArguments.putInt("intro_entry_position", 0);
            A08.putExtras(requireArguments);
            C12260kU.A06(fragment, A08, 11);
            return;
        }
        throw AbstractC166997dE.A0g();
    }

    public GCZ(Fragment fragment) {
        this.A00 = fragment;
    }
}
