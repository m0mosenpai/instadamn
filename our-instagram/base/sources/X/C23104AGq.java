package X;

import android.util.LruCache;
import com.instagram.common.session.UserSession;
import com.instagram.music.common.model.MusicAssetModel;

/* renamed from: X.AGq, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C23104AGq {
    public static final LruCache A04 = new LruCache(5);
    public InterfaceC190008bJ A00;
    public String A01;
    public final AbstractC59962oe A02;
    public final UserSession A03;

    public final void A00(InterfaceC190008bJ interfaceC190008bJ, MusicAssetModel musicAssetModel) {
        Integer num;
        this.A01 = null;
        this.A00 = interfaceC190008bJ;
        UserSession userSession = this.A03;
        if (!C36A.A06(userSession)) {
            num = C05F.A00;
        } else if (!musicAssetModel.A0O) {
            num = C05F.A01;
        } else {
            C38059Gom c38059Gom = (C38059Gom) A04.get(musicAssetModel.A0E);
            if (c38059Gom != null) {
                InterfaceC190008bJ interfaceC190008bJ2 = this.A00;
                if (interfaceC190008bJ2 == null) {
                    return;
                }
                interfaceC190008bJ2.DQx(c38059Gom);
                this.A00 = null;
                return;
            }
            String str = musicAssetModel.A0E;
            this.A01 = str;
            C14360o3.A07(str);
            String str2 = musicAssetModel.A0B;
            C14360o3.A07(str2);
            C1ON A00 = C9NO.A00(userSession, str, str2);
            A00.A00 = new C45551KEq(str, this, 4);
            this.A02.schedule(A00);
            return;
        }
        InterfaceC190008bJ interfaceC190008bJ3 = this.A00;
        if (interfaceC190008bJ3 != null) {
            interfaceC190008bJ3.DQw(num);
            this.A00 = null;
        }
    }

    public C23104AGq(AbstractC59962oe abstractC59962oe, UserSession userSession) {
        this.A03 = userSession;
        this.A02 = abstractC59962oe;
    }
}
