package X;

import android.view.MotionEvent;
import android.view.View;
import com.facebook.proxygen.TraceFieldType;
import com.instagram.model.direct.messageid.DirectMessageIdentifier;
import com.instagram.model.direct.messageid.MessageIdentifier;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;

/* renamed from: X.77Z, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C77Z implements C7Q6 {
    public final int A00;
    public final int A01;
    public final InterfaceC164887Zb A02;
    public final boolean A03;

    public C77Z(InterfaceC164887Zb interfaceC164887Zb, int i, int i2, boolean z) {
        C14360o3.A0B(interfaceC164887Zb, 1);
        this.A02 = interfaceC164887Zb;
        this.A00 = i;
        this.A01 = i2;
        this.A03 = z;
    }

    public final boolean A00(C7QY c7qy, C7QD c7qd) {
        List list;
        LinkedHashMap A07;
        C14360o3.A0B(c7qy, 0);
        C14360o3.A0B(c7qd, 1);
        InterfaceC129525tH interfaceC129525tH = ((AbstractC129515tG) c7qy).A00;
        boolean BCt = interfaceC129525tH.BCt();
        DirectMessageIdentifier directMessageIdentifier = c7qy.A0L;
        InterfaceC164887Zb interfaceC164887Zb = this.A02;
        if (AbstractC46806Kn1.A00((InterfaceC164967Zl) interfaceC164887Zb, directMessageIdentifier, BCt)) {
            return true;
        }
        C9C9 c9c9 = c7qy.A08;
        String str = c9c9.A01;
        if (str.length() <= 0 || (this.A03 && "avatar_sticker_upsell_bloks_action".equalsIgnoreCase(android.net.Uri.parse(str).getHost()))) {
            MessageIdentifier ArP = interfaceC129525tH.ArP();
            if (this.A03 && ArP != null) {
                ((InterfaceC164927Zh) interfaceC164887Zb).AUz(null, ArP.A01, true);
                return true;
            }
            return false;
        }
        AbstractC1583778x abstractC1583778x = c7qy.A0F;
        if (abstractC1583778x instanceof C158737Aj) {
            list = Collections.singletonList(((C158737Aj) abstractC1583778x).A00);
            C14360o3.A07(list);
        } else {
            list = null;
        }
        String str2 = c9c9.A00;
        Long valueOf = Long.valueOf(interfaceC129525tH.BT8());
        int i = this.A00;
        View BKF = c7qd.BKF();
        C14360o3.A07(BKF);
        E6B e6b = new E6B(AbstractC13880nE.A0G(BKF), c7qd.BKF().getRotation());
        String str3 = c7qy.A0T;
        String str4 = c7qy.A0U;
        String str5 = c7qy.A0Y;
        if (!c7qy.A0e && c7qy.A0V == null) {
            A07 = null;
        } else {
            C09530e4 c09530e4 = new C09530e4(TraceFieldType.ContentType, "ai_bot_search_plugin");
            C09530e4 c09530e42 = new C09530e4("agent_id", str2);
            String str6 = c7qy.A0V;
            if (str6 == null) {
                str6 = "";
            }
            A07 = AbstractC06930Yk.A07(c09530e4, c09530e42, new C09530e4("bot_response_id", str6), new C09530e4("xma_tap_index", String.valueOf(this.A01)));
            String str7 = c7qy.A0W;
            if (str7 != null) {
                A07.put("subscription_id", str7);
            }
        }
        interfaceC164887Zb.Cs7(null, null, e6b, directMessageIdentifier, null, valueOf, null, str, str2, str3, str4, null, str5, ((InterfaceC164917Zg) interfaceC164887Zb).C7d(), null, list, null, null, null, A07, i, false);
        return true;
    }

    @Override // X.C7Q6
    public final /* bridge */ /* synthetic */ boolean DT4(MotionEvent motionEvent, Object obj, Object obj2) {
        return A00((C7QY) obj, (C7QD) obj2);
    }
}
