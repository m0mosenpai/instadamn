package X;

import androidx.paging.PagingSource;
import com.instagram.common.session.UserSession;
import com.instagram.save.repository.SavedAudioRepository$setIsAudioSaved$4;
import java.util.Map;
import java.util.concurrent.ConcurrentLinkedQueue;

/* renamed from: X.NSa, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C52678NSa extends C4A7 {
    public C54431O3l A00;
    public final C92694De A01;
    public final UserSession A02;
    public final OQ0 A03;
    public final ConcurrentLinkedQueue A04;
    public final Map A05;

    public final Object A01(InterfaceC58066Por interfaceC58066Por, Integer num, String str, String str2, InterfaceC23621Ds interfaceC23621Ds, boolean z) {
        A00(this, str, z);
        Object A00 = this.A01.A00(str, interfaceC23621Ds, new SavedAudioRepository$setIsAudioSaved$4(new NUM(num, str, str2, z), interfaceC58066Por, this, str, null, 200L));
        C1JX c1jx = C1JX.A02;
        if (A00 != c1jx) {
            A00 = C0eB.A00;
        }
        if (A00 != c1jx) {
            return C0eB.A00;
        }
        return A00;
    }

    public final Object A02(InterfaceC58066Por interfaceC58066Por, Integer num, String str, InterfaceC23621Ds interfaceC23621Ds, boolean z) {
        A00(this, str, z);
        Object A00 = this.A01.A00(str, interfaceC23621Ds, new SavedAudioRepository$setIsAudioSaved$4(new NUL(num, str, z), interfaceC58066Por, this, str, null, 200L));
        C1JX c1jx = C1JX.A02;
        if (A00 != c1jx) {
            A00 = C0eB.A00;
        }
        if (A00 != c1jx) {
            return C0eB.A00;
        }
        return A00;
    }

    public final AnonymousClass059 A03(String str, boolean z) {
        C14360o3.A0B(str, 0);
        Map map = this.A05;
        Object obj = map.get(str);
        if (obj == null) {
            obj = MSX.A0s(z);
            map.put(str, obj);
        }
        return AbstractC208910l.A02((C05A) obj);
    }

    public static final void A00(C52678NSa c52678NSa, String str, boolean z) {
        Map map = c52678NSa.A05;
        Object obj = map.get(str);
        if (obj == null) {
            obj = MSX.A0s(z);
            map.put(str, obj);
        }
        AbstractC166997dE.A1Y((C05A) obj, z);
        while (true) {
            ConcurrentLinkedQueue concurrentLinkedQueue = c52678NSa.A04;
            if (!AbstractC25226BEj.A1b(concurrentLinkedQueue)) {
                break;
            } else {
                ((PagingSource) concurrentLinkedQueue.remove()).A06();
            }
        }
        C54431O3l c54431O3l = c52678NSa.A00;
        if (c54431O3l != null) {
            c54431O3l.A00.A00 = true;
        }
    }

    public C52678NSa(UserSession userSession, OQ0 oq0) {
        super("Reels", C4A8.A00(1497095772));
        this.A02 = userSession;
        this.A03 = oq0;
        this.A05 = AbstractC166987dD.A1I();
        this.A01 = AbstractC166177bl.A00(MZG.A00);
        this.A04 = new ConcurrentLinkedQueue();
    }

    @Override // X.C4A7, X.InterfaceC13050lr
    public final void onUserSessionWillEnd(boolean z) {
        close();
        this.A05.clear();
    }
}
