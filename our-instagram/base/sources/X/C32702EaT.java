package X;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.facebook.R;

/* renamed from: X.EaT, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32702EaT extends EOJ {
    public static final String __redex_internal_original_name = "DirectQuestionsCardGalleryFragment";

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "direct_questions_card_gallery_fragment";
    }

    @Override // X.EOJ, X.AbstractC43842Ja5, X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        A0M(2131971222, 2131952444, R.drawable.instagram_comment_outline_96);
        AbstractC31174DnI.A1E(this, A0E().A03, new C50370MLx(41, AbstractC166997dE.A0S(view, R.id.spinner), this), 13);
        getRecyclerView().A14(new E0H(getAdapter(), C37051GUh.A00(this, 31)));
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        EOJ.A00(intent, this, i, i2);
    }

    @Override // X.EOJ, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(-211292842);
        super.onCreate(bundle);
        this.A03 = new FKN(AbstractC166997dE.A0q(AbstractC166997dE.A0N(this), 2131971251), C37051GUh.A00(this, 30), true);
        C0f9.A09(732867444, A02);
    }
}
