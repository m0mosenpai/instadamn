package X;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;
import com.instagram.feed.su.model.MiddleStateCardUser;
import java.util.List;

/* renamed from: X.JsX, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44805JsX extends AbstractC65952Twx {
    public final int A00;
    public final int A01;
    public final UserSession A02;
    public final String A03;
    public final String A04;
    public final List A05;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C44805JsX(Fragment fragment, UserSession userSession, String str, String str2, List list, int i, int i2) {
        super(fragment);
        C14360o3.A0B(userSession, 2);
        this.A02 = userSession;
        this.A05 = list;
        this.A00 = i;
        this.A01 = i2;
        this.A04 = str;
        this.A03 = str2;
    }

    @Override // X.AbstractC65952Twx
    public final Fragment A03(int i) {
        MiddleStateCardUser middleStateCardUser = (MiddleStateCardUser) this.A05.get(i);
        KBN kbn = new KBN();
        Bundle A0b = AbstractC166987dD.A0b();
        AbstractC31173DnH.A1C(A0b, this.A02);
        A0b.putParcelable("ARG_MIDDLE_STATE_CARD_USER", middleStateCardUser);
        A0b.putInt("ARG_INITIAL_NAVIGATION_BAR_COLOR", this.A00);
        A0b.putInt("ARG_ITEM_POSITION", i);
        A0b.putInt("ARG_VIEW_STATE_ITEM_TYPE", this.A01);
        A0b.putString("ARG_DISPLAY_FORMAT", this.A04);
        A0b.putString("ARG_CONTAINER_MODULE", this.A03);
        kbn.setArguments(A0b);
        return kbn;
    }

    @Override // X.C2UU
    public final int getItemCount() {
        int A03 = C0f9.A03(-1592348440);
        int size = this.A05.size();
        C0f9.A0A(-1344242682, A03);
        return size;
    }
}
