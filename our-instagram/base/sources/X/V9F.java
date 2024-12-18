package X;

import com.instagram.common.session.UserSession;

/* loaded from: classes11.dex */
public final class V9F extends WlZ {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final String A03;

    public V9F(C70966WlD c70966WlD, C4I7 c4i7, String str, int i) {
        this.A00 = i;
        this.A01 = c70966WlD;
        this.A02 = c4i7;
        this.A03 = str;
    }

    @Override // X.InterfaceC71983XDs
    public final void Dat() {
        UserSession userSession;
        String str;
        int i = this.A00;
        C4I7 c4i7 = (C4I7) this.A02;
        Object obj = ((C70966WlD) this.A01).A01;
        if (i != 0) {
            userSession = ((WlL) obj).A03;
            str = "STORY_ARCHIVE_MAP";
        } else {
            userSession = ((C70684Wf5) obj).A0H;
            str = "DISCOVERY_MAP";
        }
        AbstractC68641VYw.A00.A04(userSession, c4i7, str, this.A03);
    }

    @Override // X.InterfaceC71983XDs
    public final void onCancel() {
        UserSession userSession;
        String str;
        int i = this.A00;
        C4I7 c4i7 = (C4I7) this.A02;
        Object obj = ((C70966WlD) this.A01).A01;
        if (i != 0) {
            userSession = ((WlL) obj).A03;
            str = "STORY_ARCHIVE_MAP";
        } else {
            userSession = ((C70684Wf5) obj).A0H;
            str = "DISCOVERY_MAP";
        }
        AbstractC68641VYw.A00.A02(userSession, c4i7, str, this.A03);
    }
}
