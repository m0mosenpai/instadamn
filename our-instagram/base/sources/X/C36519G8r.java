package X;

import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.save.model.CollaborativeCollectionMetadata;
import com.instagram.save.model.SavedCollection;

/* renamed from: X.G8r, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36519G8r implements InterfaceC58152PqH {
    public final /* synthetic */ FragmentActivity A00;
    public final /* synthetic */ InterfaceC11380iw A01;
    public final /* synthetic */ UserSession A02;
    public final /* synthetic */ SavedCollection A03;

    @Override // X.InterfaceC58152PqH
    public final void onDismiss() {
    }

    @Override // X.InterfaceC58152PqH
    public final void onShow() {
    }

    @Override // X.InterfaceC58152PqH
    public final /* synthetic */ void onTextClick(View view) {
    }

    public C36519G8r(FragmentActivity fragmentActivity, InterfaceC11380iw interfaceC11380iw, UserSession userSession, SavedCollection savedCollection) {
        this.A03 = savedCollection;
        this.A00 = fragmentActivity;
        this.A02 = userSession;
        this.A01 = interfaceC11380iw;
    }

    @Override // X.InterfaceC58152PqH
    public final void onButtonClick(View view) {
        SavedCollection savedCollection = this.A03;
        CollaborativeCollectionMetadata collaborativeCollectionMetadata = savedCollection.A05;
        if (collaborativeCollectionMetadata != null) {
            if (!AbstractC13670mt.A0B(collaborativeCollectionMetadata.A00)) {
                C36881nl A01 = C36881nl.A01(this.A00, this.A01, this.A02, "direct_save_to_collection_confirmation_toast");
                AbstractC31179DnN.A1R(A01, collaborativeCollectionMetadata.A00);
                A01.A06();
                return;
            }
            return;
        }
        FragmentActivity fragmentActivity = this.A00;
        if (fragmentActivity.getSupportFragmentManager().A0G) {
            return;
        }
        UserSession userSession = this.A02;
        C140966Yy A0r = AbstractC25225BEi.A0r(fragmentActivity, userSession);
        FB6.A00();
        A0r.A0B(null, FXL.A00(EnumC39551HdN.A06, savedCollection, null, userSession.token, this.A01.getModuleName()));
        A0r.A0C = "DELETE_COLLECTION_BACK_STACK_NAME";
        A0r.A0A = "DELETE_COLLECTION_BACK_STACK_NAME";
        A0r.A0G = true;
        A0r.A04();
    }
}
