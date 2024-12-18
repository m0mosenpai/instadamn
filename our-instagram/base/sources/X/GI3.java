package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.R;
import com.google.android.material.tabs.TabLayout;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.direct.messagethread.reactions.datamodel.DirectCountBasedReaction;
import com.instagram.direct.reactions.tabbedreaction.model.DirectCustomReactionTabModel;

/* loaded from: classes6.dex */
public final class GI3 implements InterfaceC154356wk {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public GI3(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = obj2;
    }

    @Override // X.InterfaceC154356wk
    public final View ANI(int i) {
        String str;
        String A04;
        if (this.A00 != 0) {
            GI1 gi1 = (GI1) this.A02;
            InterfaceC37180GZr interfaceC37180GZr = (InterfaceC37180GZr) AbstractC001800i.A0O(gi1.A06.A01, i);
            if (interfaceC37180GZr != null) {
                View ANH = interfaceC37180GZr.ANH((ViewGroup) this.A01, PublicKeyCredentialControllerUtility.JSON_KEY_ICON, gi1.A00);
                ViewOnClickListenerC35668Fp3.A00(ANH, gi1, i, 6);
                return ANH;
            }
            throw AbstractC166987dD.A14("Saved Tab Providers should have position within");
        }
        LayoutInflater A0P = AbstractC25228BEl.A0P((View) this.A01);
        KWN kwn = (KWN) this.A02;
        TabLayout tabLayout = kwn.A01;
        if (tabLayout == null) {
            C14360o3.A0F("tabLayout");
            throw C00O.createAndThrow();
        }
        int i2 = 0;
        View inflate = A0P.inflate(R.layout.custom_reactions_tab_custom_layout, (ViewGroup) tabLayout, false);
        IgImageView A0a = AbstractC31172DnG.A0a(inflate, R.id.emoji_image_view);
        DirectCustomReactionTabModel.TabType tabType = ((DirectCustomReactionTabModel) kwn.A02.get(i)).A01;
        DirectCustomReactionTabModel.TabType tabType2 = DirectCustomReactionTabModel.TabType.A02;
        if (tabType == tabType2) {
            AbstractC167007dF.A0x(A0a);
        } else if (A0a != null) {
            C168157fA c168157fA = C148336m3.A04;
            DirectCountBasedReaction directCountBasedReaction = ((DirectCustomReactionTabModel) kwn.A02.get(i)).A00;
            if (directCountBasedReaction != null) {
                str = directCountBasedReaction.A01;
            } else {
                str = "";
            }
            A0a.setUrl(c168157fA.A04(str), kwn);
        }
        TextView A0e = AbstractC166987dD.A0e(inflate, R.id.reaction_count_text);
        if (A0e != null) {
            if (((DirectCustomReactionTabModel) kwn.A02.get(i)).A01 == tabType2) {
                A04 = AbstractC166997dE.A0N(kwn).getString(2131960562);
            } else {
                DirectCountBasedReaction directCountBasedReaction2 = ((DirectCustomReactionTabModel) kwn.A02.get(i)).A00;
                if (directCountBasedReaction2 != null) {
                    i2 = directCountBasedReaction2.A00;
                }
                A04 = C84963qk.A04(AbstractC31177DnL.A09(kwn), Integer.valueOf(i2), 1000, true, false);
            }
            A0e.setText(A04);
        }
        if (i != 0 || A0e == null) {
            return inflate;
        }
        AbstractC166987dD.A1O(kwn.requireContext(), A0e, AbstractC31173DnH.A04(kwn));
        return inflate;
    }
}
