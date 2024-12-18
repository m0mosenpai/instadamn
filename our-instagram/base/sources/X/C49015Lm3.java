package X;

import android.view.MotionEvent;
import com.instagram.model.direct.messageid.DirectMessageIdentifier;
import java.util.Collections;
import java.util.List;

/* renamed from: X.Lm3, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C49015Lm3 implements C7Q6 {
    public final /* synthetic */ C49104Lnh A00;
    public final /* synthetic */ InterfaceC165077Zw A01;

    public C49015Lm3(C49104Lnh c49104Lnh, InterfaceC165077Zw interfaceC165077Zw) {
        this.A00 = c49104Lnh;
        this.A01 = interfaceC165077Zw;
    }

    @Override // X.C7Q6
    public final /* bridge */ /* synthetic */ boolean DT4(MotionEvent motionEvent, Object obj, Object obj2) {
        List singletonList;
        C7QY c7qy = (C7QY) obj;
        InterfaceC165077Zw interfaceC165077Zw = this.A01;
        C9C9 c9c9 = c7qy.A08;
        String str = c9c9.A01;
        AbstractC1583778x abstractC1583778x = c7qy.A0F;
        String str2 = c9c9.A00;
        DirectMessageIdentifier directMessageIdentifier = c7qy.A0L;
        boolean BCt = c7qy.BCt();
        if (str != null && !AbstractC46806Kn1.A00((InterfaceC164967Zl) interfaceC165077Zw, directMessageIdentifier, BCt)) {
            InterfaceC164887Zb interfaceC164887Zb = (InterfaceC164887Zb) interfaceC165077Zw;
            String str3 = str.toString();
            if (abstractC1583778x == null) {
                singletonList = null;
            } else {
                singletonList = Collections.singletonList(((C158737Aj) abstractC1583778x).A00);
            }
            interfaceC164887Zb.Cs7(null, null, null, directMessageIdentifier, null, null, null, str3, str2, null, null, null, null, null, null, singletonList, null, null, null, null, 0, false);
            return true;
        }
        return true;
    }
}
