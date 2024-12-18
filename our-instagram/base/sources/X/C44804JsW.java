package X;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.sandboxselector.DevServerEntity;
import java.util.List;
import org.webrtc.MediaStreamTrack;

/* renamed from: X.JsW, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44804JsW extends AbstractC65952Twx {
    public final List A00;
    public final Fragment A01;
    public final UserSession A02;
    public final KBL A03;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C44804JsW(Fragment fragment, UserSession userSession, KBL kbl, List list) {
        super(fragment);
        C14360o3.A0B(userSession, 2);
        this.A01 = fragment;
        this.A02 = userSession;
        this.A00 = list;
        this.A03 = kbl;
    }

    @Override // X.AbstractC65952Twx
    public final Fragment A03(int i) {
        C51753Mtc c51753Mtc = (C51753Mtc) AbstractC001800i.A0O(this.A00, i);
        if (c51753Mtc == null) {
            return new Fragment();
        }
        EnumC46174KcC enumC46174KcC = (EnumC46174KcC) c51753Mtc.A02;
        int i2 = c51753Mtc.A01;
        KBL kbl = this.A03;
        AbstractC167007dF.A1F(enumC46174KcC, 1, kbl);
        KBP kbp = new KBP();
        Bundle A0b = AbstractC166987dD.A0b();
        A0b.putInt(DevServerEntity.COLUMN_DESCRIPTION, i2);
        A0b.putSerializable(MediaStreamTrack.VIDEO_TRACK_KIND, enumC46174KcC);
        A0b.putInt("position", i);
        kbp.setArguments(A0b);
        kbp.A01 = kbl;
        return kbp;
    }

    @Override // X.C2UU
    public final int getItemCount() {
        int A03 = C0f9.A03(-1373983984);
        int size = this.A00.size();
        C0f9.A0A(806985501, A03);
        return size;
    }
}
