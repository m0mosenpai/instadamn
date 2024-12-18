package X;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.instagram.business.boost.mediapicker.model.BoostMediaPickerTabType;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;

/* renamed from: X.JsZ, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44807JsZ extends AbstractC65952Twx {
    public ArrayList A00;
    public final UserSession A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C44807JsZ(Fragment fragment, UserSession userSession) {
        super(fragment);
        C14360o3.A0B(userSession, 2);
        this.A01 = userSession;
        this.A00 = AbstractC166987dD.A1E();
    }

    @Override // X.AbstractC65952Twx
    public final Fragment A03(int i) {
        Bundle A05;
        Fragment c45503KCs;
        AbstractC155756z4.A00().A00();
        BoostMediaPickerTabType boostMediaPickerTabType = (BoostMediaPickerTabType) AbstractC31173DnH.A0i(this.A00, i);
        int ordinal = boostMediaPickerTabType.ordinal();
        if (ordinal != 0 && ordinal != 1 && ordinal != 2) {
            if (ordinal == 3) {
                UserSession userSession = this.A01;
                C14360o3.A0B(userSession, 0);
                A05 = AbstractC31178DnM.A05(userSession);
                A05.putString("media_picker_tab_type", boostMediaPickerTabType.toString());
                c45503KCs = new C45502KCr();
            } else {
                throw AbstractC166987dD.A12("The tab type in tab list must be FEED(IG feed) or STORY(IG story) or CLIPS(IG reel)");
            }
        } else {
            UserSession userSession2 = this.A01;
            C14360o3.A0B(userSession2, 0);
            A05 = AbstractC31178DnM.A05(userSession2);
            A05.putString("media_picker_tab_type", boostMediaPickerTabType.toString());
            c45503KCs = new C45503KCs();
        }
        c45503KCs.setArguments(A05);
        return c45503KCs;
    }

    @Override // X.C2UU
    public final int getItemCount() {
        int A03 = C0f9.A03(763089522);
        int size = this.A00.size();
        C0f9.A0A(-1655710175, A03);
        return size;
    }

    @Override // X.AbstractC65952Twx, X.C2UU, android.widget.Adapter
    public final long getItemId(int i) {
        int A03 = C0f9.A03(-1094292415);
        long hashCode = this.A00.get(i).hashCode();
        C0f9.A0A(637321070, A03);
        return hashCode;
    }
}
