package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.user.follow.BlockButton;
import com.instagram.user.model.User;

/* loaded from: classes11.dex */
public final class V35 extends AbstractC65632xz {
    public final Context A00;
    public final C67893V1b A01;
    public final InterfaceC11380iw A02;
    public final UserSession A03;

    @Override // X.InterfaceC65642y0
    public final void bindView(int i, View view, Object obj, Object obj2) {
        String fullName;
        int A03 = C0f9.A03(161155292);
        UserSession userSession = this.A03;
        InterfaceC11380iw interfaceC11380iw = this.A02;
        C69291Vkz c69291Vkz = (C69291Vkz) AbstractC31172DnG.A0x(view);
        User user = (User) obj;
        boolean z = ((Tx0) obj2).A0D;
        C67893V1b c67893V1b = this.A01;
        C14360o3.A0B(userSession, 0);
        AbstractC167027dH.A13(interfaceC11380iw, c69291Vkz, user);
        C14360o3.A0B(c67893V1b, 5);
        AbstractC31173DnH.A1T(interfaceC11380iw, c69291Vkz.A03, user);
        TextView textView = c69291Vkz.A01;
        String B3r = user.A03.B3r();
        if (B3r != null && B3r.length() != 0) {
            fullName = user.A03.B3r();
        } else {
            fullName = user.getFullName();
        }
        textView.setText(fullName);
        TextView textView2 = c69291Vkz.A02;
        AbstractC31173DnH.A1F(textView2, user);
        C85963sQ.A0B(textView2, user.isVerified());
        BlockButton blockButton = c69291Vkz.A04;
        if (!C2TN.A04(userSession, user)) {
            blockButton.A00 = z;
            blockButton.setIsBlueButton(!z);
            blockButton.refreshDrawableState();
            blockButton.setVisibility(0);
            BlockButton.A02(blockButton, user);
            blockButton.setOnClickListener(new WNR(25, interfaceC11380iw, blockButton, c67893V1b, user));
        } else {
            blockButton.setVisibility(8);
        }
        c69291Vkz.A00.setTag(c69291Vkz);
        C0f9.A0A(1931309176, A03);
    }

    @Override // X.InterfaceC65642y0
    public final /* bridge */ /* synthetic */ void buildRowViewTypes(AnonymousClass306 anonymousClass306, Object obj, Object obj2) {
        anonymousClass306.A7a(0);
    }

    @Override // X.InterfaceC65642y0
    public final int getViewTypeCount() {
        return 1;
    }

    public V35(Context context, C67893V1b c67893V1b, InterfaceC11380iw interfaceC11380iw, UserSession userSession) {
        this.A00 = context;
        this.A03 = userSession;
        this.A02 = interfaceC11380iw;
        this.A01 = c67893V1b;
    }

    @Override // X.InterfaceC65642y0
    public final View createView(int i, ViewGroup viewGroup) {
        int A03 = C0f9.A03(-392205932);
        ViewGroup viewGroup2 = (ViewGroup) AbstractC31175DnJ.A07(LayoutInflater.from(this.A00), viewGroup, R.layout.row_search_user_with_block_button, false);
        viewGroup2.setTag(new C69291Vkz(viewGroup2));
        C0f9.A0A(-1574008362, A03);
        return viewGroup2;
    }
}
