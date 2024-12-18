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
public final class KB9 extends AbstractC59962oe {
    public static final String __redex_internal_original_name = "EncryptedBackupsFishfoodingBannersFragment";
    public final InterfaceC09390do A00 = AbstractC60492pY.A02(this);

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return __redex_internal_original_name;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [X.2zJ, java.lang.Object] */
    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        RecyclerView recyclerView = (RecyclerView) AbstractC166997dE.A0R(view, R.id.banner_recyclerview);
        Context context = view.getContext();
        C66392zG A00 = C66362zD.A00(context);
        A00.A01(new C43998Jcl(AbstractC166987dD.A0r(this.A00)));
        C66362zD A0R = AbstractC31173DnH.A0R(A00, new Object());
        recyclerView.setAdapter(A0R);
        AbstractC31174DnI.A16(context, recyclerView, 1, false);
        C45784KOl c45784KOl = new C45784KOl(this);
        ArrayList A1E = AbstractC166987dD.A1E();
        for (EnumC46164Kc2 enumC46164Kc2 : EnumC46164Kc2.values()) {
            A1E.add(new C45184JzQ(enumC46164Kc2.toString()));
            A1E.add(new C48301LZa(c45784KOl, enumC46164Kc2, null));
        }
        A0R.A08(A1E);
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A00);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-1616385171);
        C14360o3.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.encrypted_backups_fishfooding_banners_layout, viewGroup, false);
        C0f9.A09(191542765, A02);
        return inflate;
    }
}
