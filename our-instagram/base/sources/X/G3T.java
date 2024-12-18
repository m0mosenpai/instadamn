package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.direct.fragment.visual.DirectVisualMessageActionLogPriorityFragment;
import com.instagram.pendingmedia.model.recipients.PendingRecipient;
import com.instagram.ui.widget.spinner.SpinnerImageView;
import com.instagram.user.model.User;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes6.dex */
public final class G3T implements InterfaceC37170GZh {
    public DirectVisualMessageActionLogPriorityFragment A00;
    public C137766Ly A01;
    public final long A02;
    public final Context A03;
    public final UserSession A04;
    public final List A05;
    public final C41761wQ A06;
    public final String A07;

    public G3T(Context context, UserSession userSession, String str, List list, long j) {
        AbstractC167007dF.A1G(userSession, 2, list);
        this.A03 = context;
        this.A04 = userSession;
        this.A07 = str;
        this.A02 = j;
        this.A05 = list;
        this.A06 = AbstractC31173DnH.A0S();
    }

    public static final C09530e4 A00(G3T g3t, String str, HashMap hashMap) {
        ImageUrl imageUrl;
        String str2 = null;
        if (str == null) {
            return new C09530e4(null, null);
        }
        User A0k = AbstractC31174DnI.A0k(g3t.A04, str);
        if (A0k != null) {
            str2 = A0k.getUsername();
            imageUrl = A0k.Bhu();
        } else {
            PendingRecipient pendingRecipient = (PendingRecipient) hashMap.get(str);
            if (pendingRecipient != null) {
                str2 = pendingRecipient.A0C;
                imageUrl = pendingRecipient.A03;
            } else {
                imageUrl = null;
            }
        }
        return AbstractC166987dD.A1L(str2, imageUrl);
    }

    @Override // X.InterfaceC37170GZh
    public final C11R EnM() {
        DirectVisualMessageActionLogPriorityFragment directVisualMessageActionLogPriorityFragment = this.A00;
        if (directVisualMessageActionLogPriorityFragment != null) {
            SpinnerImageView spinnerImageView = directVisualMessageActionLogPriorityFragment.spinner;
            if (spinnerImageView != null) {
                AbstractC31171DnF.A1M(spinnerImageView);
                C137766Ly c137766Ly = this.A01;
                if (c137766Ly == null) {
                    c137766Ly = C137746Lw.A00(this.A04, "MsysVisualMessageActionLogFetcherImpl").A01;
                    this.A01 = c137766Ly;
                }
                GKK.A00(c137766Ly.A09.A0L(new C48348LaO(Long.parseLong(this.A07), 0)), this.A06, this, 20);
                return null;
            }
            C14360o3.A0F("spinner");
            throw C00O.createAndThrow();
        }
        throw AbstractC166997dE.A0g();
    }

    @Override // X.InterfaceC37170GZh
    public final void cleanup() {
        this.A06.A01();
    }

    @Override // X.InterfaceC37170GZh
    public final void ET9(DirectVisualMessageActionLogPriorityFragment directVisualMessageActionLogPriorityFragment) {
        this.A00 = directVisualMessageActionLogPriorityFragment;
    }
}
