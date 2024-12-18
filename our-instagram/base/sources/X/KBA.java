package X;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;
import java.util.ArrayList;

/* loaded from: classes8.dex */
public final class KBA extends AbstractC59962oe {
    public static final String __redex_internal_original_name = "EncryptedBackupsFishfoodingScreensFragment";
    public final InterfaceC09390do A00 = AbstractC60492pY.A02(this);

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return __redex_internal_original_name;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [X.2zJ, java.lang.Object] */
    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        RecyclerView recyclerView = (RecyclerView) AbstractC166997dE.A0R(view, R.id.screens_recyclerview);
        Context context = view.getContext();
        C66362zD A0R = AbstractC31173DnH.A0R(C66362zD.A00(context), new Object());
        recyclerView.setAdapter(A0R);
        AbstractC31174DnI.A16(context, recyclerView, 1, false);
        ArrayList A1E = AbstractC166987dD.A1E();
        Bundle bundle2 = this.mArguments;
        if (bundle2 != null) {
            str = bundle2.getString("BUNDLE_SURFACE");
        } else {
            str = null;
        }
        EnumC46149Kbn enumC46149Kbn = EnumC46149Kbn.A04;
        if (!AbstractC31174DnI.A1a(enumC46149Kbn, str)) {
            enumC46149Kbn = EnumC46149Kbn.A02;
        }
        for (EnumC46208Kck enumC46208Kck : EnumC46208Kck.values()) {
            A1E.add(new C26170Bhv(enumC46208Kck, new C50370MLx(31, enumC46149Kbn, this)));
        }
        A0R.A08(A1E);
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A00);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-278727129);
        C14360o3.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.encrypted_backups_fishfooding_screens_layout, viewGroup, false);
        C0f9.A09(1778373145, A02);
        return inflate;
    }
}
